package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class AdjtableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AdjtableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AdjtableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ADJTABLE_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAdjtblColumn1;
            protected  int beginAdjtblCpcsSite;
            protected  int beginAdjtblAdjustmentCode;
            protected  int beginAdjtblSortType;
            protected  int beginAdjtblBankNumber;
            protected  int beginAdjtblDeptNumber;
            protected  int beginAdjtblAccountCode;
            protected  int beginAdjtblTypeCode;
            protected  int beginAdjtblClerkId;
            protected  int beginAdjtblSrcReceiptCd;
            protected  int beginAdjtblSrcErrorCd;
	
	/**
	* Constructor for AdjtableSerialized
	**/
    public AdjtableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AdjtableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ADJTABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAdjtblColumn1 = getStartOffset() + 0;	// set offset for serialization
  
             beginAdjtblCpcsSite = getStartOffset() + 1;	// set offset for serialization
  
             beginAdjtblAdjustmentCode = getStartOffset() + 5;	// set offset for serialization
  
             beginAdjtblSortType = getStartOffset() + 13;	// set offset for serialization
  
             beginAdjtblBankNumber = getStartOffset() + 21;	// set offset for serialization
  
             beginAdjtblDeptNumber = getStartOffset() + 29;	// set offset for serialization
  
             beginAdjtblAccountCode = getStartOffset() + 36;	// set offset for serialization
  
             beginAdjtblTypeCode = getStartOffset() + 43;	// set offset for serialization
  
             beginAdjtblClerkId = getStartOffset() + 47;	// set offset for serialization
  
             beginAdjtblSrcReceiptCd = getStartOffset() + 57;	// set offset for serialization
  
             beginAdjtblSrcErrorCd = getStartOffset() + 65;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAdjtblColumn1Counter = -1;
     public boolean isAdjtblColumn1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblColumn1Counter != sharedCounter;
         localAdjtblColumn1Counter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_COLUMN_1_LEN = 1;
	/**
	 * 	serialize this AdjtblColumn1
	 */
   protected void serializeAdjtblColumn1(char[] adjtblColumn1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblColumn1,0,getStringValue(),beginAdjtblColumn1,ADJTBL_COLUMN_1_LEN);
       localAdjtblColumn1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblColumn1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAdjtblColumn1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblColumn1() {	 
   		return (substring(getStringValue(),beginAdjtblColumn1,beginAdjtblColumn1 + ADJTBL_COLUMN_1_LEN));
   	}
     int localAdjtblCpcsSiteCounter = -1;
     public boolean isAdjtblCpcsSiteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblCpcsSiteCounter != sharedCounter;
         localAdjtblCpcsSiteCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_CPCS_SITE_LEN = 3;
	/**
	 * 	serialize this AdjtblCpcsSite
	 */
   protected void serializeAdjtblCpcsSite(char[] adjtblCpcsSite) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblCpcsSite,0,getStringValue(),beginAdjtblCpcsSite,ADJTBL_CPCS_SITE_LEN);
       localAdjtblCpcsSiteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblCpcsSiteConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAdjtblCpcsSite is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblCpcsSite() {	 
   		return (substring(getStringValue(),beginAdjtblCpcsSite,beginAdjtblCpcsSite + ADJTBL_CPCS_SITE_LEN));
   	}
     int localAdjtblAdjustmentCodeCounter = -1;
     public boolean isAdjtblAdjustmentCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblAdjustmentCodeCounter != sharedCounter;
         localAdjtblAdjustmentCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_ADJUSTMENT_CODE_LEN = 3;
	/**
	 * 	serialize this AdjtblAdjustmentCode
	 */
   protected void serializeAdjtblAdjustmentCode(char[] adjtblAdjustmentCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblAdjustmentCode,0,getStringValue(),beginAdjtblAdjustmentCode,ADJTBL_ADJUSTMENT_CODE_LEN);
       localAdjtblAdjustmentCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblAdjustmentCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAdjtblAdjustmentCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblAdjustmentCode() {	 
   		return (substring(getStringValue(),beginAdjtblAdjustmentCode,beginAdjtblAdjustmentCode + ADJTBL_ADJUSTMENT_CODE_LEN));
   	}
     int localAdjtblSortTypeCounter = -1;
     public boolean isAdjtblSortTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblSortTypeCounter != sharedCounter;
         localAdjtblSortTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_SORT_TYPE_LEN = 3;
	/**
	 * 	serialize this AdjtblSortType
	 */
   protected void serializeAdjtblSortType(char[] adjtblSortType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblSortType,0,getStringValue(),beginAdjtblSortType,ADJTBL_SORT_TYPE_LEN);
       localAdjtblSortTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblSortTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAdjtblSortType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblSortType() {	 
   		return (substring(getStringValue(),beginAdjtblSortType,beginAdjtblSortType + ADJTBL_SORT_TYPE_LEN));
   	}
     int localAdjtblBankNumberCounter = -1;
     public boolean isAdjtblBankNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblBankNumberCounter != sharedCounter;
         localAdjtblBankNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_BANK_NUMBER_LEN = 3;
	/**
	 * 	serialize this AdjtblBankNumber
	 */
   protected void serializeAdjtblBankNumber(char[] adjtblBankNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblBankNumber,0,getStringValue(),beginAdjtblBankNumber,ADJTBL_BANK_NUMBER_LEN);
       localAdjtblBankNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblBankNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAdjtblBankNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblBankNumber() {	 
   		return (substring(getStringValue(),beginAdjtblBankNumber,beginAdjtblBankNumber + ADJTBL_BANK_NUMBER_LEN));
   	}
     int localAdjtblDeptNumberCounter = -1;
     public boolean isAdjtblDeptNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblDeptNumberCounter != sharedCounter;
         localAdjtblDeptNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_DEPT_NUMBER_LEN = 2;
	/**
	 * 	serialize this AdjtblDeptNumber
	 */
   protected void serializeAdjtblDeptNumber(char[] adjtblDeptNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblDeptNumber,0,getStringValue(),beginAdjtblDeptNumber,ADJTBL_DEPT_NUMBER_LEN);
       localAdjtblDeptNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblDeptNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAdjtblDeptNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblDeptNumber() {	 
   		return (substring(getStringValue(),beginAdjtblDeptNumber,beginAdjtblDeptNumber + ADJTBL_DEPT_NUMBER_LEN));
   	}
     int localAdjtblAccountCodeCounter = -1;
     public boolean isAdjtblAccountCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblAccountCodeCounter != sharedCounter;
         localAdjtblAccountCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_ACCOUNT_CODE_LEN = 2;
	/**
	 * 	serialize this AdjtblAccountCode
	 */
   protected void serializeAdjtblAccountCode(char[] adjtblAccountCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblAccountCode,0,getStringValue(),beginAdjtblAccountCode,ADJTBL_ACCOUNT_CODE_LEN);
       localAdjtblAccountCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblAccountCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAdjtblAccountCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblAccountCode() {	 
   		return (substring(getStringValue(),beginAdjtblAccountCode,beginAdjtblAccountCode + ADJTBL_ACCOUNT_CODE_LEN));
   	}
     int localAdjtblTypeCodeCounter = -1;
     public boolean isAdjtblTypeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblTypeCodeCounter != sharedCounter;
         localAdjtblTypeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_TYPE_CODE_LEN = 2;
	/**
	 * 	serialize this AdjtblTypeCode
	 */
   protected void serializeAdjtblTypeCode(char[] adjtblTypeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblTypeCode,0,getStringValue(),beginAdjtblTypeCode,ADJTBL_TYPE_CODE_LEN);
       localAdjtblTypeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblTypeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshAdjtblTypeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblTypeCode() {	 
   		return (substring(getStringValue(),beginAdjtblTypeCode,beginAdjtblTypeCode + ADJTBL_TYPE_CODE_LEN));
   	}
     int localAdjtblClerkIdCounter = -1;
     public boolean isAdjtblClerkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblClerkIdCounter != sharedCounter;
         localAdjtblClerkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_CLERK_ID_LEN = 8;
	/**
	 * 	serialize this AdjtblClerkId
	 */
   protected void serializeAdjtblClerkId(char[] adjtblClerkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblClerkId,0,getStringValue(),beginAdjtblClerkId,ADJTBL_CLERK_ID_LEN);
       localAdjtblClerkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblClerkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAdjtblClerkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblClerkId() {	 
   		return (substring(getStringValue(),beginAdjtblClerkId,beginAdjtblClerkId + ADJTBL_CLERK_ID_LEN));
   	}
     int localAdjtblSrcReceiptCdCounter = -1;
     public boolean isAdjtblSrcReceiptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblSrcReceiptCdCounter != sharedCounter;
         localAdjtblSrcReceiptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_SRC_RECEIPT_CD_LEN = 6;
	/**
	 * 	serialize this AdjtblSrcReceiptCd
	 */
   protected void serializeAdjtblSrcReceiptCd(char[] adjtblSrcReceiptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblSrcReceiptCd,0,getStringValue(),beginAdjtblSrcReceiptCd,ADJTBL_SRC_RECEIPT_CD_LEN);
       localAdjtblSrcReceiptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblSrcReceiptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshAdjtblSrcReceiptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblSrcReceiptCd() {	 
   		return (substring(getStringValue(),beginAdjtblSrcReceiptCd,beginAdjtblSrcReceiptCd + ADJTBL_SRC_RECEIPT_CD_LEN));
   	}
     int localAdjtblSrcErrorCdCounter = -1;
     public boolean isAdjtblSrcErrorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAdjtblSrcErrorCdCounter != sharedCounter;
         localAdjtblSrcErrorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int ADJTBL_SRC_ERROR_CD_LEN = 6;
	/**
	 * 	serialize this AdjtblSrcErrorCd
	 */
   protected void serializeAdjtblSrcErrorCd(char[] adjtblSrcErrorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(adjtblSrcErrorCd,0,getStringValue(),beginAdjtblSrcErrorCd,ADJTBL_SRC_ERROR_CD_LEN);
       localAdjtblSrcErrorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAdjtblSrcErrorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshAdjtblSrcErrorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAdjtblSrcErrorCd() {	 
   		return (substring(getStringValue(),beginAdjtblSrcErrorCd,beginAdjtblSrcErrorCd + ADJTBL_SRC_ERROR_CD_LEN));
   	}




}
  
