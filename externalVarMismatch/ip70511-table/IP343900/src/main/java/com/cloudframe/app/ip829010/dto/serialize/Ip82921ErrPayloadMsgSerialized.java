package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921ErrPayloadMsgSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip82921ErrPayloadMsgSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921ErrPayloadMsgSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_ERR_PAYLOAD_MSG_LENGTH = 222;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921PayloadQueryNo;
            protected  int beginIp82921PayloadGftDsn;
            protected  int beginIp82921PayloadLogicalSeq;
            protected  int beginIp82921PayloadTxnNum;
            protected  int beginIp82921PayloadFacCount;
            protected  int beginIp82921PayloadFaaPanStat;
            protected  int beginIp82921PayloadFaaCloseDt;
	
	/**
	* Constructor for Ip82921ErrPayloadMsgSerialized
	**/
    public Ip82921ErrPayloadMsgSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip82921ErrPayloadMsgSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ErrPayloadMsgSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip82921ErrPayloadMsgSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip82921ErrPayloadMsgSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip82921ErrPayloadMsgSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_ERR_PAYLOAD_MSG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp82921PayloadQueryNo = getStartOffset() + 0;	// set offset for serialization
  
             beginIp82921PayloadGftDsn = getStartOffset() + 2;	// set offset for serialization
  
             beginIp82921PayloadLogicalSeq = getStartOffset() + 46;	// set offset for serialization
  
             beginIp82921PayloadTxnNum = getStartOffset() + 50;	// set offset for serialization
  
             beginIp82921PayloadFacCount = getStartOffset() + 55;	// set offset for serialization
  
             beginIp82921PayloadFaaPanStat = getStartOffset() + 57;	// set offset for serialization
  
             beginIp82921PayloadFaaCloseDt = getStartOffset() + 58;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp82921PayloadQueryNoCounter = -1;
         public boolean isIp82921PayloadQueryNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp82921PayloadQueryNoCounter != sharedCounter;
            localIp82921PayloadQueryNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_82921_PAYLOAD_QUERY_NO_LEN = 2;
  	/**
	 * serializeIp82921PayloadQueryNo
	 */
	protected void serializeIp82921PayloadQueryNo(short ip82921PayloadQueryNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip82921PayloadQueryNo,IP_82921_PAYLOAD_QUERY_NO_LEN)
                  ,beginIp82921PayloadQueryNo
                  ,IP_82921_PAYLOAD_QUERY_NO_LEN
                 );
            localIp82921PayloadQueryNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp82921PayloadQueryNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp82921PayloadQueryNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp82921PayloadQueryNo() {	 
			return (getShort(beginIp82921PayloadQueryNo));
   	}
     int localIp82921PayloadGftDsnCounter = -1;
     public boolean isIp82921PayloadGftDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921PayloadGftDsnCounter != sharedCounter;
         localIp82921PayloadGftDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_PAYLOAD_GFT_DSN_LEN = 44;
	/**
	 * 	serialize this Ip82921PayloadGftDsn
	 */
   protected void serializeIp82921PayloadGftDsn(char[] ip82921PayloadGftDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921PayloadGftDsn,0,getStringValue(),beginIp82921PayloadGftDsn,IP_82921_PAYLOAD_GFT_DSN_LEN);
       localIp82921PayloadGftDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921PayloadGftDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp82921PayloadGftDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921PayloadGftDsn() {	 
   		return (substring(getStringValue(),beginIp82921PayloadGftDsn,beginIp82921PayloadGftDsn + IP_82921_PAYLOAD_GFT_DSN_LEN));
   	}
         int localIp82921PayloadLogicalSeqCounter = -1;
         public boolean isIp82921PayloadLogicalSeqModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp82921PayloadLogicalSeqCounter != sharedCounter;
            localIp82921PayloadLogicalSeqCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_82921_PAYLOAD_LOGICAL_SEQ_LEN = 4;
  	/**
	 * serializeIp82921PayloadLogicalSeq
	 */
	protected void serializeIp82921PayloadLogicalSeq(int ip82921PayloadLogicalSeq) {
           replaceValue( //  save the value as string
                   getBinaryString( ip82921PayloadLogicalSeq,IP_82921_PAYLOAD_LOGICAL_SEQ_LEN)
                  ,beginIp82921PayloadLogicalSeq
                  ,IP_82921_PAYLOAD_LOGICAL_SEQ_LEN
                 );
            localIp82921PayloadLogicalSeqCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp82921PayloadLogicalSeqMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp82921PayloadLogicalSeq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp82921PayloadLogicalSeq() {	 
			return (getInt(beginIp82921PayloadLogicalSeq));
   	}
        int localIp82921PayloadTxnNumCounter = -1;
        public boolean isIp82921PayloadTxnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp82921PayloadTxnNumCounter != sharedCounter;
           localIp82921PayloadTxnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip82921PayloadTxnNumIsNumeric() {
	      return decimalIsNumeric(beginIp82921PayloadTxnNum,IP_82921_PAYLOAD_TXN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_82921_PAYLOAD_TXN_NUM_LEN = 5;
  	/**
	 * 	serializeIp82921PayloadTxnNum
	 */
	protected void serializeIp82921PayloadTxnNum(int ip82921PayloadTxnNum) {
		   putDecimal(beginIp82921PayloadTxnNum,ip82921PayloadTxnNum,IP_82921_PAYLOAD_TXN_NUM_LEN,true);
   }
   

   protected int checkIp82921PayloadTxnNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIp82921PayloadTxnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp82921PayloadTxnNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginIp82921PayloadTxnNum,IP_82921_PAYLOAD_TXN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip82921PayloadTxnNum", beginIp82921PayloadTxnNum,IP_82921_PAYLOAD_TXN_NUM_LEN);
     }
   	}
         int localIp82921PayloadFacCountCounter = -1;
         public boolean isIp82921PayloadFacCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp82921PayloadFacCountCounter != sharedCounter;
            localIp82921PayloadFacCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_82921_PAYLOAD_FAC_COUNT_LEN = 2;
  	/**
	 * serializeIp82921PayloadFacCount
	 */
	protected void serializeIp82921PayloadFacCount(short ip82921PayloadFacCount) {
           replaceValue( //  save the value as string
                   getBinaryString( ip82921PayloadFacCount,IP_82921_PAYLOAD_FAC_COUNT_LEN)
                  ,beginIp82921PayloadFacCount
                  ,IP_82921_PAYLOAD_FAC_COUNT_LEN
                 );
            localIp82921PayloadFacCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp82921PayloadFacCountMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp82921PayloadFacCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp82921PayloadFacCount() {	 
			return (getShort(beginIp82921PayloadFacCount));
   	}
     int localIp82921PayloadFaaPanStatCounter = -1;
     public boolean isIp82921PayloadFaaPanStatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921PayloadFaaPanStatCounter != sharedCounter;
         localIp82921PayloadFaaPanStatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_PAYLOAD_FAA_PAN_STAT_LEN = 1;
	/**
	 * 	serialize this Ip82921PayloadFaaPanStat
	 */
   protected void serializeIp82921PayloadFaaPanStat(char[] ip82921PayloadFaaPanStat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921PayloadFaaPanStat,0,getStringValue(),beginIp82921PayloadFaaPanStat,IP_82921_PAYLOAD_FAA_PAN_STAT_LEN);
       localIp82921PayloadFaaPanStatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921PayloadFaaPanStatConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp82921PayloadFaaPanStat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921PayloadFaaPanStat() {	 
   		return (substring(getStringValue(),beginIp82921PayloadFaaPanStat,beginIp82921PayloadFaaPanStat + IP_82921_PAYLOAD_FAA_PAN_STAT_LEN));
   	}
     int localIp82921PayloadFaaCloseDtCounter = -1;
     public boolean isIp82921PayloadFaaCloseDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921PayloadFaaCloseDtCounter != sharedCounter;
         localIp82921PayloadFaaCloseDtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_PAYLOAD_FAA_CLOSE_DT_LEN = 10;
	/**
	 * 	serialize this Ip82921PayloadFaaCloseDt
	 */
   protected void serializeIp82921PayloadFaaCloseDt(char[] ip82921PayloadFaaCloseDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921PayloadFaaCloseDt,0,getStringValue(),beginIp82921PayloadFaaCloseDt,IP_82921_PAYLOAD_FAA_CLOSE_DT_LEN);
       localIp82921PayloadFaaCloseDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921PayloadFaaCloseDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshIp82921PayloadFaaCloseDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921PayloadFaaCloseDt() {	 
   		return (substring(getStringValue(),beginIp82921PayloadFaaCloseDt,beginIp82921PayloadFaaCloseDt + IP_82921_PAYLOAD_FAA_CLOSE_DT_LEN));
   	}




}
  
