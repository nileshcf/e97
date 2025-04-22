package com.cloudframe.app.codemove.dto.serialize;

/**
*  The class EmployeeRecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class EmployeeRecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EmployeeRecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EMPLOYEE_RECORD_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEmployeeId;
            protected  int beginEmployeeName;
            protected  int beginEmployeeSalary;
	
	/**
	* Constructor for EmployeeRecordSerialized
	**/
    public EmployeeRecordSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EmployeeRecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EMPLOYEE_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEmployeeId = getStartOffset() + 0;	// set offset for serialization
  
             beginEmployeeName = getStartOffset() + 5;	// set offset for serialization
  
             beginEmployeeSalary = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEmployeeIdCounter = -1;
     public boolean isEmployeeIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmployeeIdCounter != sharedCounter;
         localEmployeeIdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of employeeId
	 *	@return employeeId
	 */
	public char[]  getEmployeeIdString() {
	     return getCharArray(beginEmployeeId,EMPLOYEE_ID_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean employeeIdIsNumeric() {
	    return isNumeric(beginEmployeeId
	                    ,beginEmployeeId + EMPLOYEE_ID_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EMPLOYEE_ID_LEN = 5;
  	/**
	 * serializeEmployeeId
	 */
	protected void serializeEmployeeId(long employeeId) {
		 putNumber(beginEmployeeId,employeeId,EMPLOYEE_ID_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmployeeIdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEmployeeId
	 */
   	protected  long serializeEmployeeId(char[] value) {
	    long  employeeId;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    employeeId = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginEmployeeId
		       ,5
		      );
		 localEmployeeIdCounter = shareString.getSerializedField().getModifiedCounter();
		return  employeeId;
    }

   protected long checkEmployeeIdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEmployeeId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEmployeeId() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEmployeeId
			                 ,EMPLOYEE_ID_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("employeeId", beginEmployeeId,EMPLOYEE_ID_LEN);
    }
   	}
     int localEmployeeNameCounter = -1;
     public boolean isEmployeeNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmployeeNameCounter != sharedCounter;
         localEmployeeNameCounter = sharedCounter; return hasModified;
     }
	protected static final int EMPLOYEE_NAME_LEN = 30;
	/**
	 * 	serialize this EmployeeName
	 */
   protected void serializeEmployeeName(char[] employeeName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(employeeName,0,getStringValue(),beginEmployeeName,EMPLOYEE_NAME_LEN);
       localEmployeeNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEmployeeNameConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshEmployeeName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEmployeeName() {	 
   		return (substring(getStringValue(),beginEmployeeName,beginEmployeeName + EMPLOYEE_NAME_LEN));
   	}
     int localEmployeeSalaryCounter = -1;
     
     public boolean isEmployeeSalaryModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEmployeeSalaryCounter != sharedCounter;
         localEmployeeSalaryCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of employeeSalary
	 *	@return employeeSalary
	 */
	public char[]  getEmployeeSalaryString() {
	    return getCharArray(beginEmployeeSalary,EMPLOYEE_SALARY_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean employeeSalaryIsNumeric() {
		    return isNumeric(beginEmployeeSalary
	                    ,beginEmployeeSalary + EMPLOYEE_SALARY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int EMPLOYEE_SALARY_LEN = 8;
  protected  static final int EMPLOYEE_SALARY_SCALE = 2;

   protected BigDecimal checkEmployeeSalaryMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,8/*precision*/);
   }

  	/**
	 * serializeEmployeeSalary
	 */
	protected void serializeEmployeeSalary(BigDecimal employeeSalary) {
	       putNumber(beginEmployeeSalary,employeeSalary,EMPLOYEE_SALARY_LEN,EMPLOYEE_SALARY_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEmployeeSalaryCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeEmployeeSalary
	 */
   	protected  BigDecimal serializeEmployeeSalary(char[] value) throws CFException {
        if (value.length < 8) value = pad(8, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginEmployeeSalary
		       ,8
		      );		 localEmployeeSalaryCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,EMPLOYEE_SALARY_LEN,EMPLOYEE_SALARY_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("employeeSalary", beginEmployeeSalary,EMPLOYEE_SALARY_LEN);
    	}
    }
    /**
	 *	refreshEmployeeSalary is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshEmployeeSalary() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginEmployeeSalary
			            ,EMPLOYEE_SALARY_LEN
			            ,EMPLOYEE_SALARY_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("employeeSalary", beginEmployeeSalary,EMPLOYEE_SALARY_LEN);
    }
   	}




}
  
