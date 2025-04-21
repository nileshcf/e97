package com.cloudframe.app.codemove.dto.serialize;

/**
*  The class EmpRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class EmpRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EmpRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EMP_RECORD_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEmpId;
            protected  int beginEmpName;
            protected  int beginEmpSalary;
	
	/**
	* Constructor for EmpRecordSerialized
	**/
    public EmpRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EmpRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EMP_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEmpId = getStartOffset() + 0;	// set offset for serialization
  
             beginEmpName = getStartOffset() + 5;	// set offset for serialization
  
             beginEmpSalary = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEmpIdCounter = -1;
     public boolean isEmpIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmpIdCounter != sharedCounter;
         localEmpIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of empId
	 *	@return empId
	 */
	public char[]  getEmpIdString() {
	     return getCharArray(beginEmpId,EMP_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean empIdIsNumeric() {
	    return isNumeric(beginEmpId
	                    ,beginEmpId + EMP_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EMP_ID_LEN = 5;
  	/**
	 * serializeEmpId
	 */
	protected void serializeEmpId(long empId) {
		 putNumber(beginEmpId,empId,EMP_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmpIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEmpId
	 */
   	protected  long serializeEmpId(char[] value) {
	    long  empId;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    empId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginEmpId
		       ,5
		      );
		 localEmpIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  empId;
    }

   protected long checkEmpIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEmpId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEmpId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEmpId
			                 ,EMP_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("empId", beginEmpId,EMP_ID_LEN);
    }
   	}
     int localEmpNameCounter = -1;
     public boolean isEmpNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmpNameCounter != sharedCounter;
         localEmpNameCounter = sharedCounter; return hasModified;
     }
	protected static final int EMP_NAME_LEN = 30;
	/**
	 * 	serialize this EmpName
	 */
   protected void serializeEmpName(char[] empName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(empName,0,getStringValue(),beginEmpName,EMP_NAME_LEN);
       localEmpNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEmpNameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshEmpName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEmpName() {	 
   		return (substring(getStringValue(),beginEmpName,beginEmpName + EMP_NAME_LEN));
   	}
     int localEmpSalaryCounter = -1;
     
     public boolean isEmpSalaryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmpSalaryCounter != sharedCounter;
         localEmpSalaryCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of empSalary
	 *	@return empSalary
	 */
	public char[]  getEmpSalaryString() {
	    return getCharArray(beginEmpSalary,EMP_SALARY_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean empSalaryIsNumeric() {
		    return isNumeric(beginEmpSalary
	                    ,beginEmpSalary + EMP_SALARY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EMP_SALARY_LEN = 8;
  protected  static final int EMP_SALARY_SCALE = 2;

   protected BigDecimal checkEmpSalaryMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeEmpSalary
	 */
	protected void serializeEmpSalary(BigDecimal empSalary) {
	       putNumber(beginEmpSalary,empSalary,EMP_SALARY_LEN,EMP_SALARY_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmpSalaryCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeEmpSalary
	 */
   	protected  BigDecimal serializeEmpSalary(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginEmpSalary
		       ,8
		      );		 localEmpSalaryCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EMP_SALARY_LEN,EMP_SALARY_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("empSalary", beginEmpSalary,EMP_SALARY_LEN);
    	}
    }
    /**
	 *	refreshEmpSalary is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshEmpSalary() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginEmpSalary
			            ,EMP_SALARY_LEN
			            ,EMP_SALARY_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("empSalary", beginEmpSalary,EMP_SALARY_LEN);
    }
   	}




}
  
