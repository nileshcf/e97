package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70701TipamrqKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip70701TipamrqKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70701TipamrqKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70701_TIPAMRQ_KEY_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70701GftDasetNam;
            protected  int beginIp70701FileSeqNum;
            protected  int beginIp70701ServCd;
            protected  int beginIp70701TxnNum;
	
	/**
	* Constructor for Ip70701TipamrqKeySerialized
	**/
    public Ip70701TipamrqKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70701TipamrqKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70701TipamrqKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70701TipamrqKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip70701TipamrqKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip70701TipamrqKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70701_TIPAMRQ_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70701GftDasetNam = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70701FileSeqNum = getStartOffset() + 44;	// set offset for serialization
  
             beginIp70701ServCd = getStartOffset() + 48;	// set offset for serialization
  
             beginIp70701TxnNum = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70701GftDasetNamCounter = -1;
     public boolean isIp70701GftDasetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701GftDasetNamCounter != sharedCounter;
         localIp70701GftDasetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_GFT_DASET_NAM_LEN = 44;
	/**
	 * 	serialize this Ip70701GftDasetNam
	 */
   protected void serializeIp70701GftDasetNam(char[] ip70701GftDasetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701GftDasetNam,0,getStringValue(),beginIp70701GftDasetNam,IP_70701_GFT_DASET_NAM_LEN);
       localIp70701GftDasetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701GftDasetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp70701GftDasetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701GftDasetNam() {	 
   		return (substring(getStringValue(),beginIp70701GftDasetNam,beginIp70701GftDasetNam + IP_70701_GFT_DASET_NAM_LEN));
   	}
         int localIp70701FileSeqNumCounter = -1;
         public boolean isIp70701FileSeqNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70701FileSeqNumCounter != sharedCounter;
            localIp70701FileSeqNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70701_FILE_SEQ_NUM_LEN = 4;
  	/**
	 * serializeIp70701FileSeqNum
	 */
	protected void serializeIp70701FileSeqNum(int ip70701FileSeqNum) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70701FileSeqNum,IP_70701_FILE_SEQ_NUM_LEN)
                  ,beginIp70701FileSeqNum
                  ,IP_70701_FILE_SEQ_NUM_LEN
                 );
            localIp70701FileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70701FileSeqNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70701FileSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70701FileSeqNum() {	 
			return (getInt(beginIp70701FileSeqNum));
   	}
     int localIp70701ServCdCounter = -1;
     public boolean isIp70701ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701ServCdCounter != sharedCounter;
         localIp70701ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip70701ServCd
	 */
   protected void serializeIp70701ServCd(char[] ip70701ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701ServCd,0,getStringValue(),beginIp70701ServCd,IP_70701_SERV_CD_LEN);
       localIp70701ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp70701ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701ServCd() {	 
   		return (substring(getStringValue(),beginIp70701ServCd,beginIp70701ServCd + IP_70701_SERV_CD_LEN));
   	}
        int localIp70701TxnNumCounter = -1;
        public boolean isIp70701TxnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp70701TxnNumCounter != sharedCounter;
           localIp70701TxnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip70701TxnNumIsNumeric() {
	      return decimalIsNumeric(beginIp70701TxnNum,IP_70701_TXN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_70701_TXN_NUM_LEN = 5;
  	/**
	 * 	serializeIp70701TxnNum
	 */
	protected void serializeIp70701TxnNum(int ip70701TxnNum) {
		   putDecimal(beginIp70701TxnNum,ip70701TxnNum,IP_70701_TXN_NUM_LEN,true);
   }
   

   protected int checkIp70701TxnNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIp70701TxnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70701TxnNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginIp70701TxnNum,IP_70701_TXN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip70701TxnNum", beginIp70701TxnNum,IP_70701_TXN_NUM_LEN);
     }
   	}




}
  
