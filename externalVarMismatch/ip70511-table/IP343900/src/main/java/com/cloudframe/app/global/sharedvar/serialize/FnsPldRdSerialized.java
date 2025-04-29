package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class FnsPldRdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FnsPldRdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPldRdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PLD_RD_LENGTH = 222;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPldRdQueryNo;
            protected  int beginFnsPldRdGftDsn;
            protected  int beginFnsPldRdLogicalSeq;
            protected  int beginFnsPldRdTxnNum;
            protected  int beginFnsPldRdCount;
            protected  int beginFnsPldRdFaaPanStatCd;
            protected  int beginFnsPldRdFaaCloseDt;
	
	/**
	* Constructor for FnsPldRdSerialized
	**/
    public FnsPldRdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in FnsPldRdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PLD_RD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPldRdQueryNo = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPldRdGftDsn = getStartOffset() + 2;	// set offset for serialization
  
             beginFnsPldRdLogicalSeq = getStartOffset() + 46;	// set offset for serialization
  
             beginFnsPldRdTxnNum = getStartOffset() + 50;	// set offset for serialization
  
             beginFnsPldRdCount = getStartOffset() + 55;	// set offset for serialization
  
             beginFnsPldRdFaaPanStatCd = getStartOffset() + 57;	// set offset for serialization
  
             beginFnsPldRdFaaCloseDt = getStartOffset() + 58;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localFnsPldRdQueryNoCounter = -1;
         public boolean isFnsPldRdQueryNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFnsPldRdQueryNoCounter != sharedCounter;
            localFnsPldRdQueryNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int FNS_PLD_RD_QUERY_NO_LEN = 2;
  	/**
	 * serializeFnsPldRdQueryNo
	 */
	protected void serializeFnsPldRdQueryNo(short fnsPldRdQueryNo) {
           replaceValue( //  save the value as string
                   getBinaryString( fnsPldRdQueryNo,FNS_PLD_RD_QUERY_NO_LEN)
                  ,beginFnsPldRdQueryNo
                  ,FNS_PLD_RD_QUERY_NO_LEN
                 );
            localFnsPldRdQueryNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFnsPldRdQueryNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFnsPldRdQueryNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFnsPldRdQueryNo() {	 
			return (getShort(beginFnsPldRdQueryNo));
   	}
     int localFnsPldRdGftDsnCounter = -1;
     public boolean isFnsPldRdGftDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdGftDsnCounter != sharedCounter;
         localFnsPldRdGftDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_GFT_DSN_LEN = 44;
	/**
	 * 	serialize this FnsPldRdGftDsn
	 */
   protected void serializeFnsPldRdGftDsn(char[] fnsPldRdGftDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdGftDsn,0,getStringValue(),beginFnsPldRdGftDsn,FNS_PLD_RD_GFT_DSN_LEN);
       localFnsPldRdGftDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdGftDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshFnsPldRdGftDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdGftDsn() {	 
   		return (substring(getStringValue(),beginFnsPldRdGftDsn,beginFnsPldRdGftDsn + FNS_PLD_RD_GFT_DSN_LEN));
   	}
         int localFnsPldRdLogicalSeqCounter = -1;
         public boolean isFnsPldRdLogicalSeqModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFnsPldRdLogicalSeqCounter != sharedCounter;
            localFnsPldRdLogicalSeqCounter = sharedCounter; return hasModified; 
         }
   protected static final int FNS_PLD_RD_LOGICAL_SEQ_LEN = 4;
  	/**
	 * serializeFnsPldRdLogicalSeq
	 */
	protected void serializeFnsPldRdLogicalSeq(int fnsPldRdLogicalSeq) {
           replaceValue( //  save the value as string
                   getBinaryString( fnsPldRdLogicalSeq,FNS_PLD_RD_LOGICAL_SEQ_LEN)
                  ,beginFnsPldRdLogicalSeq
                  ,FNS_PLD_RD_LOGICAL_SEQ_LEN
                 );
            localFnsPldRdLogicalSeqCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFnsPldRdLogicalSeqMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFnsPldRdLogicalSeq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPldRdLogicalSeq() {	 
			return (getInt(beginFnsPldRdLogicalSeq));
   	}
        int localFnsPldRdTxnNumCounter = -1;
        public boolean isFnsPldRdTxnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFnsPldRdTxnNumCounter != sharedCounter;
           localFnsPldRdTxnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean fnsPldRdTxnNumIsNumeric() {
	      return decimalIsNumeric(beginFnsPldRdTxnNum,FNS_PLD_RD_TXN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FNS_PLD_RD_TXN_NUM_LEN = 5;
  	/**
	 * 	serializeFnsPldRdTxnNum
	 */
	protected void serializeFnsPldRdTxnNum(int fnsPldRdTxnNum) {
		   putDecimal(beginFnsPldRdTxnNum,fnsPldRdTxnNum,FNS_PLD_RD_TXN_NUM_LEN,true);
   }
   

   protected int checkFnsPldRdTxnNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFnsPldRdTxnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPldRdTxnNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFnsPldRdTxnNum,FNS_PLD_RD_TXN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fnsPldRdTxnNum", beginFnsPldRdTxnNum,FNS_PLD_RD_TXN_NUM_LEN);
     }
   	}
         int localFnsPldRdCountCounter = -1;
         public boolean isFnsPldRdCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFnsPldRdCountCounter != sharedCounter;
            localFnsPldRdCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int FNS_PLD_RD_COUNT_LEN = 2;
  	/**
	 * serializeFnsPldRdCount
	 */
	protected void serializeFnsPldRdCount(short fnsPldRdCount) {
           replaceValue( //  save the value as string
                   getBinaryString( fnsPldRdCount,FNS_PLD_RD_COUNT_LEN)
                  ,beginFnsPldRdCount
                  ,FNS_PLD_RD_COUNT_LEN
                 );
            localFnsPldRdCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFnsPldRdCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFnsPldRdCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFnsPldRdCount() {	 
			return (getShort(beginFnsPldRdCount));
   	}
     int localFnsPldRdFaaPanStatCdCounter = -1;
     public boolean isFnsPldRdFaaPanStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdFaaPanStatCdCounter != sharedCounter;
         localFnsPldRdFaaPanStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_FAA_PAN_STAT_CD_LEN = 1;
	/**
	 * 	serialize this FnsPldRdFaaPanStatCd
	 */
   protected void serializeFnsPldRdFaaPanStatCd(char[] fnsPldRdFaaPanStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdFaaPanStatCd,0,getStringValue(),beginFnsPldRdFaaPanStatCd,FNS_PLD_RD_FAA_PAN_STAT_CD_LEN);
       localFnsPldRdFaaPanStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdFaaPanStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPldRdFaaPanStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdFaaPanStatCd() {	 
   		return (substring(getStringValue(),beginFnsPldRdFaaPanStatCd,beginFnsPldRdFaaPanStatCd + FNS_PLD_RD_FAA_PAN_STAT_CD_LEN));
   	}
     int localFnsPldRdFaaCloseDtCounter = -1;
     public boolean isFnsPldRdFaaCloseDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPldRdFaaCloseDtCounter != sharedCounter;
         localFnsPldRdFaaCloseDtCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PLD_RD_FAA_CLOSE_DT_LEN = 10;
	/**
	 * 	serialize this FnsPldRdFaaCloseDt
	 */
   protected void serializeFnsPldRdFaaCloseDt(char[] fnsPldRdFaaCloseDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPldRdFaaCloseDt,0,getStringValue(),beginFnsPldRdFaaCloseDt,FNS_PLD_RD_FAA_CLOSE_DT_LEN);
       localFnsPldRdFaaCloseDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPldRdFaaCloseDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFnsPldRdFaaCloseDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPldRdFaaCloseDt() {	 
   		return (substring(getStringValue(),beginFnsPldRdFaaCloseDt,beginFnsPldRdFaaCloseDt + FNS_PLD_RD_FAA_CLOSE_DT_LEN));
   	}




}
  
