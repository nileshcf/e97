package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70711TipamrsKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip70711TipamrsKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70711TipamrsKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70711_TIPAMRS_KEY_LENGTH = 57;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70711GftDasetNam;
            protected  int beginIp70711FileSeqNum;
            protected  int beginIp70711ServCd;
            protected  int beginIp70711TxnNum;
	
	/**
	* Constructor for Ip70711TipamrsKeySerialized
	**/
    public Ip70711TipamrsKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70711TipamrsKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70711TipamrsKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70711TipamrsKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip70711TipamrsKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip70711TipamrsKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70711_TIPAMRS_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70711GftDasetNam = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70711FileSeqNum = getStartOffset() + 44;	// set offset for serialization
  
             beginIp70711ServCd = getStartOffset() + 48;	// set offset for serialization
  
             beginIp70711TxnNum = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70711GftDasetNamCounter = -1;
     public boolean isIp70711GftDasetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711GftDasetNamCounter != sharedCounter;
         localIp70711GftDasetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_GFT_DASET_NAM_LEN = 44;
	/**
	 * 	serialize this Ip70711GftDasetNam
	 */
   protected void serializeIp70711GftDasetNam(char[] ip70711GftDasetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711GftDasetNam,0,getStringValue(),beginIp70711GftDasetNam,IP_70711_GFT_DASET_NAM_LEN);
       localIp70711GftDasetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711GftDasetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp70711GftDasetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711GftDasetNam() {	 
   		return (substring(getStringValue(),beginIp70711GftDasetNam,beginIp70711GftDasetNam + IP_70711_GFT_DASET_NAM_LEN));
   	}
         int localIp70711FileSeqNumCounter = -1;
         public boolean isIp70711FileSeqNumModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70711FileSeqNumCounter != sharedCounter;
            localIp70711FileSeqNumCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70711_FILE_SEQ_NUM_LEN = 4;
  	/**
	 * serializeIp70711FileSeqNum
	 */
	protected void serializeIp70711FileSeqNum(int ip70711FileSeqNum) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70711FileSeqNum,IP_70711_FILE_SEQ_NUM_LEN)
                  ,beginIp70711FileSeqNum
                  ,IP_70711_FILE_SEQ_NUM_LEN
                 );
            localIp70711FileSeqNumCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp70711FileSeqNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp70711FileSeqNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70711FileSeqNum() {	 
			return (getInt(beginIp70711FileSeqNum));
   	}
     int localIp70711ServCdCounter = -1;
     public boolean isIp70711ServCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711ServCdCounter != sharedCounter;
         localIp70711ServCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_SERV_CD_LEN = 4;
	/**
	 * 	serialize this Ip70711ServCd
	 */
   protected void serializeIp70711ServCd(char[] ip70711ServCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711ServCd,0,getStringValue(),beginIp70711ServCd,IP_70711_SERV_CD_LEN);
       localIp70711ServCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711ServCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp70711ServCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711ServCd() {	 
   		return (substring(getStringValue(),beginIp70711ServCd,beginIp70711ServCd + IP_70711_SERV_CD_LEN));
   	}
        int localIp70711TxnNumCounter = -1;
        public boolean isIp70711TxnNumModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp70711TxnNumCounter != sharedCounter;
           localIp70711TxnNumCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip70711TxnNumIsNumeric() {
	      return decimalIsNumeric(beginIp70711TxnNum,IP_70711_TXN_NUM_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_70711_TXN_NUM_LEN = 5;
  	/**
	 * 	serializeIp70711TxnNum
	 */
	protected void serializeIp70711TxnNum(int ip70711TxnNum) {
		   putDecimal(beginIp70711TxnNum,ip70711TxnNum,IP_70711_TXN_NUM_LEN,true);
   }
   

   protected int checkIp70711TxnNumMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIp70711TxnNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70711TxnNum() throws CFException {	
   	try { 
		 return (getIntDecimal(beginIp70711TxnNum,IP_70711_TXN_NUM_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip70711TxnNum", beginIp70711TxnNum,IP_70711_TXN_NUM_LEN);
     }
   	}




}
  
