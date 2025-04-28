package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class TipapmaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TipapmaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TipapmaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TIPAPMA_LENGTH = 123;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTipapmaVrtlAcctNum;
            protected  int beginTipapmaCrteUpdtTs;
            protected  int beginTipapmaPrimAcctNum;
            protected  int beginTipapmaPrimAcctSeqNum;
	
	/**
	* Constructor for TipapmaSerialized
	**/
    public TipapmaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TipapmaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TIPAPMA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTipapmaVrtlAcctNum = getStartOffset() + 0;	// set offset for serialization
  
             beginTipapmaCrteUpdtTs = getStartOffset() + 19;	// set offset for serialization
  
             beginTipapmaPrimAcctNum = getStartOffset() + 45;	// set offset for serialization
  
             beginTipapmaPrimAcctSeqNum = getStartOffset() + 108;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTipapmaVrtlAcctNumCounter = -1;
     public boolean isTipapmaVrtlAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipapmaVrtlAcctNumCounter != sharedCounter;
         localTipapmaVrtlAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int TIPAPMA_VRTL_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this TipapmaVrtlAcctNum
	 */
   protected void serializeTipapmaVrtlAcctNum(char[] tipapmaVrtlAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tipapmaVrtlAcctNum,0,getStringValue(),beginTipapmaVrtlAcctNum,TIPAPMA_VRTL_ACCT_NUM_LEN);
       localTipapmaVrtlAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTipapmaVrtlAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshTipapmaVrtlAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTipapmaVrtlAcctNum() {	 
   		return (substring(getStringValue(),beginTipapmaVrtlAcctNum,beginTipapmaVrtlAcctNum + TIPAPMA_VRTL_ACCT_NUM_LEN));
   	}
     int localTipapmaCrteUpdtTsCounter = -1;
     public boolean isTipapmaCrteUpdtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipapmaCrteUpdtTsCounter != sharedCounter;
         localTipapmaCrteUpdtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int TIPAPMA_CRTE_UPDT_TS_LEN = 26;
	/**
	 * 	serialize this TipapmaCrteUpdtTs
	 */
   protected void serializeTipapmaCrteUpdtTs(char[] tipapmaCrteUpdtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tipapmaCrteUpdtTs,0,getStringValue(),beginTipapmaCrteUpdtTs,TIPAPMA_CRTE_UPDT_TS_LEN);
       localTipapmaCrteUpdtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTipapmaCrteUpdtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshTipapmaCrteUpdtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTipapmaCrteUpdtTs() {	 
   		return (substring(getStringValue(),beginTipapmaCrteUpdtTs,beginTipapmaCrteUpdtTs + TIPAPMA_CRTE_UPDT_TS_LEN));
   	}
     int localTipapmaPrimAcctNumCounter = -1;
     public boolean isTipapmaPrimAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipapmaPrimAcctNumCounter != sharedCounter;
         localTipapmaPrimAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int TIPAPMA_PRIM_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this TipapmaPrimAcctNum
	 */
   protected void serializeTipapmaPrimAcctNum(char[] tipapmaPrimAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tipapmaPrimAcctNum,0,getStringValue(),beginTipapmaPrimAcctNum,TIPAPMA_PRIM_ACCT_NUM_LEN);
       localTipapmaPrimAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTipapmaPrimAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshTipapmaPrimAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTipapmaPrimAcctNum() {	 
   		return (substring(getStringValue(),beginTipapmaPrimAcctNum,beginTipapmaPrimAcctNum + TIPAPMA_PRIM_ACCT_NUM_LEN));
   	}
     int localTipapmaPrimAcctSeqNumCounter = -1;
     public boolean isTipapmaPrimAcctSeqNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTipapmaPrimAcctSeqNumCounter != sharedCounter;
         localTipapmaPrimAcctSeqNumCounter = sharedCounter; return hasModified;
     }
	protected static final int TIPAPMA_PRIM_ACCT_SEQ_NUM_LEN = 3;
	/**
	 * 	serialize this TipapmaPrimAcctSeqNum
	 */
   protected void serializeTipapmaPrimAcctSeqNum(char[] tipapmaPrimAcctSeqNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tipapmaPrimAcctSeqNum,0,getStringValue(),beginTipapmaPrimAcctSeqNum,TIPAPMA_PRIM_ACCT_SEQ_NUM_LEN);
       localTipapmaPrimAcctSeqNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTipapmaPrimAcctSeqNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTipapmaPrimAcctSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTipapmaPrimAcctSeqNum() {	 
   		return (substring(getStringValue(),beginTipapmaPrimAcctSeqNum,beginTipapmaPrimAcctSeqNum + TIPAPMA_PRIM_ACCT_SEQ_NUM_LEN));
   	}




}
  
