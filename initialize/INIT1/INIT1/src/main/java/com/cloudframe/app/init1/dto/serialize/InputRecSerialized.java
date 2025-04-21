package com.cloudframe.app.init1.dto.serialize;

/**
*  The class InputRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class InputRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_REC_LENGTH = 131;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputEmplId;
            protected  int beginInputLastName;
            protected  int beginInputFirstName;
            protected  int beginInputEmplType;
            protected  int beginInputEmplClass;
            protected  int beginInputEmplSsn;
            protected  int beginInputEmplStartDate;
            protected  int beginInputEmplRate;
            protected  int beginInputEmplStatus;
           protected int beginInputDeductions;
           protected static final int INPUT_DEDUCTIONS_SIZE = 5;
	
	/**
	* Constructor for InputRecSerialized
	**/
    public InputRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputEmplId = getStartOffset() + 0;	// set offset for serialization
  
             beginInputLastName = getStartOffset() + 7;	// set offset for serialization
  
             beginInputFirstName = getStartOffset() + 22;	// set offset for serialization
  
             beginInputEmplType = getStartOffset() + 37;	// set offset for serialization
  
             beginInputEmplClass = getStartOffset() + 39;	// set offset for serialization
  
             beginInputEmplSsn = getStartOffset() + 56;	// set offset for serialization
  
  
             beginInputEmplStartDate = getStartOffset() + 89;	// set offset for serialization
  
  
             beginInputEmplRate = getStartOffset() + 99;	// set offset for serialization
  
             beginInputEmplStatus = getStartOffset() + 105;	// set offset for serialization
  
	        beginInputDeductions = getStartOffset() + 106; // set offset for serialization
  
	   /*  end of offset */
	}
     int localInputEmplIdCounter = -1;
     public boolean isInputEmplIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplIdCounter != sharedCounter;
         localInputEmplIdCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_EMPL_ID_LEN = 7;
	/**
	 * 	serialize this InputEmplId
	 */
   protected void serializeInputEmplId(char[] inputEmplId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputEmplId,0,getStringValue(),beginInputEmplId,INPUT_EMPL_ID_LEN);
       localInputEmplIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputEmplIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshInputEmplId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputEmplId() {	 
   		return (substring(getStringValue(),beginInputEmplId,beginInputEmplId + INPUT_EMPL_ID_LEN));
   	}
     int localInputLastNameCounter = -1;
     public boolean isInputLastNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputLastNameCounter != sharedCounter;
         localInputLastNameCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_LAST_NAME_LEN = 15;
	/**
	 * 	serialize this InputLastName
	 */
   protected void serializeInputLastName(char[] inputLastName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputLastName,0,getStringValue(),beginInputLastName,INPUT_LAST_NAME_LEN);
       localInputLastNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputLastNameConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshInputLastName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputLastName() {	 
   		return (substring(getStringValue(),beginInputLastName,beginInputLastName + INPUT_LAST_NAME_LEN));
   	}
     int localInputFirstNameCounter = -1;
     public boolean isInputFirstNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputFirstNameCounter != sharedCounter;
         localInputFirstNameCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_FIRST_NAME_LEN = 15;
	/**
	 * 	serialize this InputFirstName
	 */
   protected void serializeInputFirstName(char[] inputFirstName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputFirstName,0,getStringValue(),beginInputFirstName,INPUT_FIRST_NAME_LEN);
       localInputFirstNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputFirstNameConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshInputFirstName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputFirstName() {	 
   		return (substring(getStringValue(),beginInputFirstName,beginInputFirstName + INPUT_FIRST_NAME_LEN));
   	}
     int localInputEmplTypeCounter = -1;
     public boolean isInputEmplTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplTypeCounter != sharedCounter;
         localInputEmplTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_EMPL_TYPE_LEN = 2;
	/**
	 * 	serialize this InputEmplType
	 */
   protected void serializeInputEmplType(char[] inputEmplType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputEmplType,0,getStringValue(),beginInputEmplType,INPUT_EMPL_TYPE_LEN);
       localInputEmplTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputEmplTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshInputEmplType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputEmplType() {	 
   		return (substring(getStringValue(),beginInputEmplType,beginInputEmplType + INPUT_EMPL_TYPE_LEN));
   	}
     int localInputEmplClassCounter = -1;
     public boolean isInputEmplClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplClassCounter != sharedCounter;
         localInputEmplClassCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_EMPL_CLASS_LEN = 17;
	/**
	 * 	serialize this InputEmplClass
	 */
   protected void serializeInputEmplClass(char[] inputEmplClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputEmplClass,0,getStringValue(),beginInputEmplClass,INPUT_EMPL_CLASS_LEN);
       localInputEmplClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputEmplClassConstraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshInputEmplClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputEmplClass() {	 
   		return (substring(getStringValue(),beginInputEmplClass,beginInputEmplClass + INPUT_EMPL_CLASS_LEN));
   	}
     int localInputEmplSsnCounter = -1;
     public boolean isInputEmplSsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplSsnCounter != sharedCounter;
         localInputEmplSsnCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_EMPL_SSN_LEN = 9;
	/**
	 * 	serialize this InputEmplSsn
	 */
   protected void serializeInputEmplSsn(char[] inputEmplSsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputEmplSsn,0,getStringValue(),beginInputEmplSsn,INPUT_EMPL_SSN_LEN);
       localInputEmplSsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputEmplSsnConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshInputEmplSsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputEmplSsn() {	 
   		return (substring(getStringValue(),beginInputEmplSsn,beginInputEmplSsn + INPUT_EMPL_SSN_LEN));
   	}
     int localInputEmplStartDateCounter = -1;
     public boolean isInputEmplStartDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplStartDateCounter != sharedCounter;
         localInputEmplStartDateCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_EMPL_START_DATE_LEN = 8;
	/**
	 * 	serialize this InputEmplStartDate
	 */
   protected void serializeInputEmplStartDate(char[] inputEmplStartDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputEmplStartDate,0,getStringValue(),beginInputEmplStartDate,INPUT_EMPL_START_DATE_LEN);
       localInputEmplStartDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputEmplStartDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshInputEmplStartDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputEmplStartDate() {	 
   		return (substring(getStringValue(),beginInputEmplStartDate,beginInputEmplStartDate + INPUT_EMPL_START_DATE_LEN));
   	}
     int localInputEmplRateCounter = -1;
     
     public boolean isInputEmplRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplRateCounter != sharedCounter;
         localInputEmplRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of inputEmplRate
	 *	@return inputEmplRate
	 */
	public char[]  getInputEmplRateString() {
	    return getCharArray(beginInputEmplRate,INPUT_EMPL_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputEmplRateIsNumeric() {
		    return isNumeric(beginInputEmplRate
	                    ,beginInputEmplRate + INPUT_EMPL_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int INPUT_EMPL_RATE_LEN = 6;
  protected  static final int INPUT_EMPL_RATE_SCALE = 2;

   protected BigDecimal checkInputEmplRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeInputEmplRate
	 */
	protected void serializeInputEmplRate(BigDecimal inputEmplRate) {
	       putNumber(beginInputEmplRate,inputEmplRate,INPUT_EMPL_RATE_LEN,INPUT_EMPL_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInputEmplRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeInputEmplRate
	 */
   	protected  BigDecimal serializeInputEmplRate(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginInputEmplRate
		       ,6
		      );		 localInputEmplRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,INPUT_EMPL_RATE_LEN,INPUT_EMPL_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("inputEmplRate", beginInputEmplRate,INPUT_EMPL_RATE_LEN);
    	}
    }
    /**
	 *	refreshInputEmplRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshInputEmplRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginInputEmplRate
			            ,INPUT_EMPL_RATE_LEN
			            ,INPUT_EMPL_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("inputEmplRate", beginInputEmplRate,INPUT_EMPL_RATE_LEN);
    }
   	}
     int localInputEmplStatusCounter = -1;
     public boolean isInputEmplStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputEmplStatusCounter != sharedCounter;
         localInputEmplStatusCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_EMPL_STATUS_LEN = 1;
	/**
	 * 	serialize this InputEmplStatus
	 */
   protected void serializeInputEmplStatus(char[] inputEmplStatus) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputEmplStatus,0,getStringValue(),beginInputEmplStatus,INPUT_EMPL_STATUS_LEN);
       localInputEmplStatusCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputEmplStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshInputEmplStatus is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputEmplStatus() {	 
   		return (substring(getStringValue(),beginInputEmplStatus,beginInputEmplStatus + INPUT_EMPL_STATUS_LEN));
   	}
   protected static final int INPUT_DEDUCTIONS_LEN = 5;
   protected static final int INPUT_DEDUCTIONS_SCALE = 2;
     /**
	 * serializes this InputDeductions at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeInputDeductions(int index, BigDecimal value) {
           putNumber((beginInputDeductions + index*INPUT_DEDUCTIONS_LEN),value,INPUT_DEDUCTIONS_LEN ,INPUT_DEDUCTIONS_SCALE ,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }

		public int inputDeductionsSize() {
			return INPUT_DEDUCTIONS_SIZE;
		}



}
  
