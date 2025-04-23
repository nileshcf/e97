package com.cloudframe.app.usbaeext.dto.serialize;

/**
*  The class TaAdjTableRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TaAdjTableRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaAdjTableRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TA_ADJ_TABLE_REDEFINED_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaSiteCode;
            protected  int beginTaAdjCode;
            protected  int beginTaSortType;
            protected  int beginTaBankNo;
            protected  int beginTaDeptNo;
            protected  int beginTaAcctCd;
            protected  int beginTaTypeCd;
            protected  int beginTaClerkId;
            protected  int beginTaSrcReceiptCd;
            protected  int beginTaSrcErrorCd;
            protected  int beginTaAdjCodeCnt;
	
	/**
	* Constructor for TaAdjTableRedefinedSerialized
	**/
    public TaAdjTableRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaAdjTableRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaAdjTableRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaAdjTableRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this TaAdjTableRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in TaAdjTableRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TA_ADJ_TABLE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaSiteCode = getStartOffset() + 0;	// set offset for serialization
  
             beginTaAdjCode = getStartOffset() + 3;	// set offset for serialization
  
             beginTaSortType = getStartOffset() + 6;	// set offset for serialization
  
             beginTaBankNo = getStartOffset() + 9;	// set offset for serialization
  
             beginTaDeptNo = getStartOffset() + 12;	// set offset for serialization
  
             beginTaAcctCd = getStartOffset() + 14;	// set offset for serialization
  
             beginTaTypeCd = getStartOffset() + 16;	// set offset for serialization
  
             beginTaClerkId = getStartOffset() + 18;	// set offset for serialization
  
             beginTaSrcReceiptCd = getStartOffset() + 26;	// set offset for serialization
  
             beginTaSrcErrorCd = getStartOffset() + 32;	// set offset for serialization
  
             beginTaAdjCodeCnt = getStartOffset() + 38;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTaSiteCodeCounter = -1;
     public boolean isTaSiteCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaSiteCodeCounter != sharedCounter;
         localTaSiteCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_SITE_CODE_LEN = 3;
	/**
	 * 	serialize this TaSiteCode
	 */
   protected void serializeTaSiteCode(char[] taSiteCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taSiteCode,0,getStringValue(),beginTaSiteCode,TA_SITE_CODE_LEN);
       localTaSiteCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaSiteCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaSiteCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaSiteCode() {	 
   		return (substring(getStringValue(),beginTaSiteCode,beginTaSiteCode + TA_SITE_CODE_LEN));
   	}
     int localTaAdjCodeCounter = -1;
     public boolean isTaAdjCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaAdjCodeCounter != sharedCounter;
         localTaAdjCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_ADJ_CODE_LEN = 3;
	/**
	 * 	serialize this TaAdjCode
	 */
   protected void serializeTaAdjCode(char[] taAdjCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taAdjCode,0,getStringValue(),beginTaAdjCode,TA_ADJ_CODE_LEN);
       localTaAdjCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaAdjCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaAdjCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaAdjCode() {	 
   		return (substring(getStringValue(),beginTaAdjCode,beginTaAdjCode + TA_ADJ_CODE_LEN));
   	}
     int localTaSortTypeCounter = -1;
     public boolean isTaSortTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaSortTypeCounter != sharedCounter;
         localTaSortTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_SORT_TYPE_LEN = 3;
	/**
	 * 	serialize this TaSortType
	 */
   protected void serializeTaSortType(char[] taSortType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taSortType,0,getStringValue(),beginTaSortType,TA_SORT_TYPE_LEN);
       localTaSortTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaSortTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaSortType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaSortType() {	 
   		return (substring(getStringValue(),beginTaSortType,beginTaSortType + TA_SORT_TYPE_LEN));
   	}
     int localTaBankNoCounter = -1;
     public boolean isTaBankNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaBankNoCounter != sharedCounter;
         localTaBankNoCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_BANK_NO_LEN = 3;
	/**
	 * 	serialize this TaBankNo
	 */
   protected void serializeTaBankNo(char[] taBankNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taBankNo,0,getStringValue(),beginTaBankNo,TA_BANK_NO_LEN);
       localTaBankNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaBankNoConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaBankNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaBankNo() {	 
   		return (substring(getStringValue(),beginTaBankNo,beginTaBankNo + TA_BANK_NO_LEN));
   	}
     int localTaDeptNoCounter = -1;
     public boolean isTaDeptNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaDeptNoCounter != sharedCounter;
         localTaDeptNoCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_DEPT_NO_LEN = 2;
	/**
	 * 	serialize this TaDeptNo
	 */
   protected void serializeTaDeptNo(char[] taDeptNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taDeptNo,0,getStringValue(),beginTaDeptNo,TA_DEPT_NO_LEN);
       localTaDeptNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaDeptNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTaDeptNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaDeptNo() {	 
   		return (substring(getStringValue(),beginTaDeptNo,beginTaDeptNo + TA_DEPT_NO_LEN));
   	}
     int localTaAcctCdCounter = -1;
     public boolean isTaAcctCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaAcctCdCounter != sharedCounter;
         localTaAcctCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_ACCT_CD_LEN = 2;
	/**
	 * 	serialize this TaAcctCd
	 */
   protected void serializeTaAcctCd(char[] taAcctCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taAcctCd,0,getStringValue(),beginTaAcctCd,TA_ACCT_CD_LEN);
       localTaAcctCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaAcctCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTaAcctCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaAcctCd() {	 
   		return (substring(getStringValue(),beginTaAcctCd,beginTaAcctCd + TA_ACCT_CD_LEN));
   	}
     int localTaTypeCdCounter = -1;
     public boolean isTaTypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaTypeCdCounter != sharedCounter;
         localTaTypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this TaTypeCd
	 */
   protected void serializeTaTypeCd(char[] taTypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taTypeCd,0,getStringValue(),beginTaTypeCd,TA_TYPE_CD_LEN);
       localTaTypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaTypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTaTypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaTypeCd() {	 
   		return (substring(getStringValue(),beginTaTypeCd,beginTaTypeCd + TA_TYPE_CD_LEN));
   	}
     int localTaClerkIdCounter = -1;
     public boolean isTaClerkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaClerkIdCounter != sharedCounter;
         localTaClerkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_CLERK_ID_LEN = 8;
	/**
	 * 	serialize this TaClerkId
	 */
   protected void serializeTaClerkId(char[] taClerkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taClerkId,0,getStringValue(),beginTaClerkId,TA_CLERK_ID_LEN);
       localTaClerkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaClerkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshTaClerkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaClerkId() {	 
   		return (substring(getStringValue(),beginTaClerkId,beginTaClerkId + TA_CLERK_ID_LEN));
   	}
     int localTaSrcReceiptCdCounter = -1;
     public boolean isTaSrcReceiptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaSrcReceiptCdCounter != sharedCounter;
         localTaSrcReceiptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_SRC_RECEIPT_CD_LEN = 6;
	/**
	 * 	serialize this TaSrcReceiptCd
	 */
   protected void serializeTaSrcReceiptCd(char[] taSrcReceiptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taSrcReceiptCd,0,getStringValue(),beginTaSrcReceiptCd,TA_SRC_RECEIPT_CD_LEN);
       localTaSrcReceiptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaSrcReceiptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTaSrcReceiptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaSrcReceiptCd() {	 
   		return (substring(getStringValue(),beginTaSrcReceiptCd,beginTaSrcReceiptCd + TA_SRC_RECEIPT_CD_LEN));
   	}
     int localTaSrcErrorCdCounter = -1;
     public boolean isTaSrcErrorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaSrcErrorCdCounter != sharedCounter;
         localTaSrcErrorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_SRC_ERROR_CD_LEN = 6;
	/**
	 * 	serialize this TaSrcErrorCd
	 */
   protected void serializeTaSrcErrorCd(char[] taSrcErrorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taSrcErrorCd,0,getStringValue(),beginTaSrcErrorCd,TA_SRC_ERROR_CD_LEN);
       localTaSrcErrorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaSrcErrorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTaSrcErrorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaSrcErrorCd() {	 
   		return (substring(getStringValue(),beginTaSrcErrorCd,beginTaSrcErrorCd + TA_SRC_ERROR_CD_LEN));
   	}
        int localTaAdjCodeCntCounter = -1;
        public boolean isTaAdjCodeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localTaAdjCodeCntCounter != sharedCounter;
           localTaAdjCodeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean taAdjCodeCntIsNumeric() {
	      return decimalIsNumeric(beginTaAdjCodeCnt,TA_ADJ_CODE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int TA_ADJ_CODE_CNT_LEN = 3;
  	/**
	 * 	serializeTaAdjCodeCnt
	 */
	protected void serializeTaAdjCodeCnt(int taAdjCodeCnt) {
		   putDecimal(beginTaAdjCodeCnt,taAdjCodeCnt,TA_ADJ_CODE_CNT_LEN,true);
   }
   

   protected int checkTaAdjCodeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100K /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshTaAdjCodeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTaAdjCodeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginTaAdjCodeCnt,TA_ADJ_CODE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("taAdjCodeCnt", beginTaAdjCodeCnt,TA_ADJ_CODE_CNT_LEN);
     }
   	}




}
  
