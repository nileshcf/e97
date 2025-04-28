package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class FnsPayloadSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FnsPayloadSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FnsPayloadSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FNS_PAYLOAD_LENGTH = 222;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFnsPayloadQueryNo;
            protected  int beginFnsPayloadGftDsn;
            protected  int beginFnsPayloadLogicalSeq;
            protected  int beginFnsPayloadTxnNum;
            protected  int beginFnsPayloadFacCount;
            protected  int beginFnsPayloadFaaPanStatCd;
            protected  int beginFnsPayloadFaaCloseDt;
	
	/**
	* Constructor for FnsPayloadSerialized
	**/
    public FnsPayloadSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FnsPayloadSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FNS_PAYLOAD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFnsPayloadQueryNo = getStartOffset() + 0;	// set offset for serialization
  
             beginFnsPayloadGftDsn = getStartOffset() + 2;	// set offset for serialization
  
             beginFnsPayloadLogicalSeq = getStartOffset() + 46;	// set offset for serialization
  
             beginFnsPayloadTxnNum = getStartOffset() + 50;	// set offset for serialization
  
             beginFnsPayloadFacCount = getStartOffset() + 55;	// set offset for serialization
  
             beginFnsPayloadFaaPanStatCd = getStartOffset() + 57;	// set offset for serialization
  
             beginFnsPayloadFaaCloseDt = getStartOffset() + 58;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localFnsPayloadQueryNoCounter = -1;
         public boolean isFnsPayloadQueryNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFnsPayloadQueryNoCounter != sharedCounter;
            localFnsPayloadQueryNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int FNS_PAYLOAD_QUERY_NO_LEN = 2;
  	/**
	 * serializeFnsPayloadQueryNo
	 */
	protected void serializeFnsPayloadQueryNo(short fnsPayloadQueryNo) {
           replaceValue( //  save the value as string
                   getBinaryString( fnsPayloadQueryNo,FNS_PAYLOAD_QUERY_NO_LEN)
                  ,beginFnsPayloadQueryNo
                  ,FNS_PAYLOAD_QUERY_NO_LEN
                 );
            localFnsPayloadQueryNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFnsPayloadQueryNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFnsPayloadQueryNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFnsPayloadQueryNo() {	 
			return (getShort(beginFnsPayloadQueryNo));
   	}
     int localFnsPayloadGftDsnCounter = -1;
     public boolean isFnsPayloadGftDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadGftDsnCounter != sharedCounter;
         localFnsPayloadGftDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_GFT_DSN_LEN = 44;
	/**
	 * 	serialize this FnsPayloadGftDsn
	 */
   protected void serializeFnsPayloadGftDsn(char[] fnsPayloadGftDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadGftDsn,0,getStringValue(),beginFnsPayloadGftDsn,FNS_PAYLOAD_GFT_DSN_LEN);
       localFnsPayloadGftDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadGftDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshFnsPayloadGftDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadGftDsn() {	 
   		return (substring(getStringValue(),beginFnsPayloadGftDsn,beginFnsPayloadGftDsn + FNS_PAYLOAD_GFT_DSN_LEN));
   	}
         int localFnsPayloadLogicalSeqCounter = -1;
         public boolean isFnsPayloadLogicalSeqModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFnsPayloadLogicalSeqCounter != sharedCounter;
            localFnsPayloadLogicalSeqCounter = sharedCounter; return hasModified; 
         }
   protected static final int FNS_PAYLOAD_LOGICAL_SEQ_LEN = 4;
  	/**
	 * serializeFnsPayloadLogicalSeq
	 */
	protected void serializeFnsPayloadLogicalSeq(int fnsPayloadLogicalSeq) {
           replaceValue( //  save the value as string
                   getBinaryString( fnsPayloadLogicalSeq,FNS_PAYLOAD_LOGICAL_SEQ_LEN)
                  ,beginFnsPayloadLogicalSeq
                  ,FNS_PAYLOAD_LOGICAL_SEQ_LEN
                 );
            localFnsPayloadLogicalSeqCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFnsPayloadLogicalSeqMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFnsPayloadLogicalSeq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPayloadLogicalSeq() {	 
			return (getInt(beginFnsPayloadLogicalSeq));
   	}
        int localFnsPayloadTxnNumCounter = -1;
        public boolean isFnsPayloadTxnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFnsPayloadTxnNumCounter != sharedCounter;
           localFnsPayloadTxnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean fnsPayloadTxnNumIsNumeric() {
	      return decimalIsNumeric(beginFnsPayloadTxnNum,FNS_PAYLOAD_TXN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FNS_PAYLOAD_TXN_NUM_LEN = 5;
  	/**
	 * 	serializeFnsPayloadTxnNum
	 */
	protected void serializeFnsPayloadTxnNum(int fnsPayloadTxnNum) {
		   putDecimal(beginFnsPayloadTxnNum,fnsPayloadTxnNum,FNS_PAYLOAD_TXN_NUM_LEN,true);
   }
   

   protected int checkFnsPayloadTxnNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFnsPayloadTxnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFnsPayloadTxnNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFnsPayloadTxnNum,FNS_PAYLOAD_TXN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fnsPayloadTxnNum", beginFnsPayloadTxnNum,FNS_PAYLOAD_TXN_NUM_LEN);
     }
   	}
         int localFnsPayloadFacCountCounter = -1;
         public boolean isFnsPayloadFacCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFnsPayloadFacCountCounter != sharedCounter;
            localFnsPayloadFacCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int FNS_PAYLOAD_FAC_COUNT_LEN = 2;
  	/**
	 * serializeFnsPayloadFacCount
	 */
	protected void serializeFnsPayloadFacCount(short fnsPayloadFacCount) {
           replaceValue( //  save the value as string
                   getBinaryString( fnsPayloadFacCount,FNS_PAYLOAD_FAC_COUNT_LEN)
                  ,beginFnsPayloadFacCount
                  ,FNS_PAYLOAD_FAC_COUNT_LEN
                 );
            localFnsPayloadFacCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkFnsPayloadFacCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshFnsPayloadFacCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshFnsPayloadFacCount() {	 
			return (getShort(beginFnsPayloadFacCount));
   	}
     int localFnsPayloadFaaPanStatCdCounter = -1;
     public boolean isFnsPayloadFaaPanStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadFaaPanStatCdCounter != sharedCounter;
         localFnsPayloadFaaPanStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_FAA_PAN_STAT_CD_LEN = 1;
	/**
	 * 	serialize this FnsPayloadFaaPanStatCd
	 */
   protected void serializeFnsPayloadFaaPanStatCd(char[] fnsPayloadFaaPanStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadFaaPanStatCd,0,getStringValue(),beginFnsPayloadFaaPanStatCd,FNS_PAYLOAD_FAA_PAN_STAT_CD_LEN);
       localFnsPayloadFaaPanStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadFaaPanStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFnsPayloadFaaPanStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadFaaPanStatCd() {	 
   		return (substring(getStringValue(),beginFnsPayloadFaaPanStatCd,beginFnsPayloadFaaPanStatCd + FNS_PAYLOAD_FAA_PAN_STAT_CD_LEN));
   	}
     int localFnsPayloadFaaCloseDtCounter = -1;
     public boolean isFnsPayloadFaaCloseDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFnsPayloadFaaCloseDtCounter != sharedCounter;
         localFnsPayloadFaaCloseDtCounter = sharedCounter; return hasModified;
     }
	protected static final int FNS_PAYLOAD_FAA_CLOSE_DT_LEN = 10;
	/**
	 * 	serialize this FnsPayloadFaaCloseDt
	 */
   protected void serializeFnsPayloadFaaCloseDt(char[] fnsPayloadFaaCloseDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fnsPayloadFaaCloseDt,0,getStringValue(),beginFnsPayloadFaaCloseDt,FNS_PAYLOAD_FAA_CLOSE_DT_LEN);
       localFnsPayloadFaaCloseDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFnsPayloadFaaCloseDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshFnsPayloadFaaCloseDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFnsPayloadFaaCloseDt() {	 
   		return (substring(getStringValue(),beginFnsPayloadFaaCloseDt,beginFnsPayloadFaaCloseDt + FNS_PAYLOAD_FAA_CLOSE_DT_LEN));
   	}




}
  
