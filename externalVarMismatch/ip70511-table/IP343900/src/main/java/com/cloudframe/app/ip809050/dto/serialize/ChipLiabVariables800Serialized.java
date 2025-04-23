package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class ChipLiabVariables800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ChipLiabVariables800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ChipLiabVariables800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHIP_LIAB_VARIABLES_800_LENGTH = 390;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTxnPrimAcctNbr800;
            protected  int beginSndrMbrId800;
            protected  int beginCustName800;
            protected  int beginCountryCode800;
            protected  int beginRegion800;
            protected  int beginErrorNum800;
            protected  int beginEditNum800;
            protected  int beginCbhDate800;
            protected  int beginTxnCurr800;
	
	/**
	* Constructor for ChipLiabVariables800Serialized
	**/
    public ChipLiabVariables800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ChipLiabVariables800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHIP_LIAB_VARIABLES_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTxnPrimAcctNbr800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSndrMbrId800 = getStartOffset() + 20;	// set offset for serialization
  
  
             beginCustName800 = getStartOffset() + 32;	// set offset for serialization
  
  
             beginCountryCode800 = getStartOffset() + 63;	// set offset for serialization
  
  
             beginRegion800 = getStartOffset() + 67;	// set offset for serialization
  
  
             beginErrorNum800 = getStartOffset() + 78;	// set offset for serialization
  
  
             beginEditNum800 = getStartOffset() + 83;	// set offset for serialization
  
  
  
  
  
  
  
  
             beginCbhDate800 = getStartOffset() + 334;	// set offset for serialization
  
  
  
  
  
  
             beginTxnCurr800 = getStartOffset() + 372;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localTxnPrimAcctNbr800Counter = -1;
     public boolean isTxnPrimAcctNbr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnPrimAcctNbr800Counter != sharedCounter;
         localTxnPrimAcctNbr800Counter = sharedCounter; return hasModified;
     }
	protected static final int TXN_PRIM_ACCT_NBR_800_LEN = 19;
	/**
	 * 	serialize this TxnPrimAcctNbr800
	 */
   protected void serializeTxnPrimAcctNbr800(char[] txnPrimAcctNbr800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(txnPrimAcctNbr800,0,getStringValue(),beginTxnPrimAcctNbr800,TXN_PRIM_ACCT_NBR_800_LEN);
       localTxnPrimAcctNbr800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTxnPrimAcctNbr800Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshTxnPrimAcctNbr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTxnPrimAcctNbr800() {	 
   		return (substring(getStringValue(),beginTxnPrimAcctNbr800,beginTxnPrimAcctNbr800 + TXN_PRIM_ACCT_NBR_800_LEN));
   	}
     int localSndrMbrId800Counter = -1;
     public boolean isSndrMbrId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSndrMbrId800Counter != sharedCounter;
         localSndrMbrId800Counter = sharedCounter; return hasModified;
     }
	protected static final int SNDR_MBR_ID_800_LEN = 11;
	/**
	 * 	serialize this SndrMbrId800
	 */
   protected void serializeSndrMbrId800(char[] sndrMbrId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sndrMbrId800,0,getStringValue(),beginSndrMbrId800,SNDR_MBR_ID_800_LEN);
       localSndrMbrId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSndrMbrId800Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshSndrMbrId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSndrMbrId800() {	 
   		return (substring(getStringValue(),beginSndrMbrId800,beginSndrMbrId800 + SNDR_MBR_ID_800_LEN));
   	}
     int localCustName800Counter = -1;
     public boolean isCustName800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCustName800Counter != sharedCounter;
         localCustName800Counter = sharedCounter; return hasModified;
     }
	protected static final int CUST_NAME_800_LEN = 30;
	/**
	 * 	serialize this CustName800
	 */
   protected void serializeCustName800(char[] custName800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(custName800,0,getStringValue(),beginCustName800,CUST_NAME_800_LEN);
       localCustName800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCustName800Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshCustName800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCustName800() {	 
   		return (substring(getStringValue(),beginCustName800,beginCustName800 + CUST_NAME_800_LEN));
   	}
     int localCountryCode800Counter = -1;
     public boolean isCountryCode800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCountryCode800Counter != sharedCounter;
         localCountryCode800Counter = sharedCounter; return hasModified;
     }
	protected static final int COUNTRY_CODE_800_LEN = 3;
	/**
	 * 	serialize this CountryCode800
	 */
   protected void serializeCountryCode800(char[] countryCode800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(countryCode800,0,getStringValue(),beginCountryCode800,COUNTRY_CODE_800_LEN);
       localCountryCode800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCountryCode800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCountryCode800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCountryCode800() {	 
   		return (substring(getStringValue(),beginCountryCode800,beginCountryCode800 + COUNTRY_CODE_800_LEN));
   	}
     int localRegion800Counter = -1;
     public boolean isRegion800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRegion800Counter != sharedCounter;
         localRegion800Counter = sharedCounter; return hasModified;
     }
	protected static final int REGION_800_LEN = 10;
	/**
	 * 	serialize this Region800
	 */
   protected void serializeRegion800(char[] region800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(region800,0,getStringValue(),beginRegion800,REGION_800_LEN);
       localRegion800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRegion800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshRegion800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRegion800() {	 
   		return (substring(getStringValue(),beginRegion800,beginRegion800 + REGION_800_LEN));
   	}
     int localErrorNum800Counter = -1;
     public boolean isErrorNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorNum800Counter != sharedCounter;
         localErrorNum800Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_NUM_800_LEN = 4;
	/**
	 * 	serialize this ErrorNum800
	 */
   protected void serializeErrorNum800(char[] errorNum800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorNum800,0,getStringValue(),beginErrorNum800,ERROR_NUM_800_LEN);
       localErrorNum800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorNum800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshErrorNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorNum800() {	 
   		return (substring(getStringValue(),beginErrorNum800,beginErrorNum800 + ERROR_NUM_800_LEN));
   	}
     int localEditNum800Counter = -1;
     public boolean isEditNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditNum800Counter != sharedCounter;
         localEditNum800Counter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_NUM_800_LEN = 4;
	/**
	 * 	serialize this EditNum800
	 */
   protected void serializeEditNum800(char[] editNum800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(editNum800,0,getStringValue(),beginEditNum800,EDIT_NUM_800_LEN);
       localEditNum800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditNum800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshEditNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEditNum800() {	 
   		return (substring(getStringValue(),beginEditNum800,beginEditNum800 + EDIT_NUM_800_LEN));
   	}
     int localCbhDate800Counter = -1;
     public boolean isCbhDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCbhDate800Counter != sharedCounter;
         localCbhDate800Counter = sharedCounter; return hasModified;
     }
	protected static final int CBH_DATE_800_LEN = 8;
	/**
	 * 	serialize this CbhDate800
	 */
   protected void serializeCbhDate800(char[] cbhDate800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cbhDate800,0,getStringValue(),beginCbhDate800,CBH_DATE_800_LEN);
       localCbhDate800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCbhDate800Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCbhDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCbhDate800() {	 
   		return (substring(getStringValue(),beginCbhDate800,beginCbhDate800 + CBH_DATE_800_LEN));
   	}
     int localTxnCurr800Counter = -1;
     public boolean isTxnCurr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTxnCurr800Counter != sharedCounter;
         localTxnCurr800Counter = sharedCounter; return hasModified;
     }
	protected static final int TXN_CURR_800_LEN = 3;
	/**
	 * 	serialize this TxnCurr800
	 */
   protected void serializeTxnCurr800(char[] txnCurr800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(txnCurr800,0,getStringValue(),beginTxnCurr800,TXN_CURR_800_LEN);
       localTxnCurr800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTxnCurr800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTxnCurr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTxnCurr800() {	 
   		return (substring(getStringValue(),beginTxnCurr800,beginTxnCurr800 + TXN_CURR_800_LEN));
   	}




}
  
