package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70701RequestDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70701RequestDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70701RequestDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70701_REQUEST_DATA_LENGTH = 2037;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70701MqRespCd;
            protected  int beginIp70701StrtJobNam;
            protected  int beginIp70701StrtTs;
            protected  int beginIp70701RqstDataTxtLen;
            protected  int beginIp70701RqstDataTxt;
	
	/**
	* Constructor for Ip70701RequestDataSerialized
	**/
    public Ip70701RequestDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70701RequestDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70701RequestDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70701RequestDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,57); // serialize this field at offset 57 by default 
    }
    
	/**
	* sets parent for this Ip70701RequestDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 57 by default
    }    
	/**
	* initializes the field in Ip70701RequestDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70701_REQUEST_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70701MqRespCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70701StrtJobNam = getStartOffset() + 1;	// set offset for serialization
  
             beginIp70701StrtTs = getStartOffset() + 9;	// set offset for serialization
  
             beginIp70701RqstDataTxtLen = getStartOffset() + 35;	// set offset for serialization
  
             beginIp70701RqstDataTxt = getStartOffset() + 37;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70701MqRespCdCounter = -1;
     public boolean isIp70701MqRespCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701MqRespCdCounter != sharedCounter;
         localIp70701MqRespCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_MQ_RESP_CD_LEN = 1;
	/**
	 * 	serialize this Ip70701MqRespCd
	 */
   protected void serializeIp70701MqRespCd(char[] ip70701MqRespCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701MqRespCd,0,getStringValue(),beginIp70701MqRespCd,IP_70701_MQ_RESP_CD_LEN);
       localIp70701MqRespCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701MqRespCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70701MqRespCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701MqRespCd() {	 
   		return (substring(getStringValue(),beginIp70701MqRespCd,beginIp70701MqRespCd + IP_70701_MQ_RESP_CD_LEN));
   	}
     int localIp70701StrtJobNamCounter = -1;
     public boolean isIp70701StrtJobNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701StrtJobNamCounter != sharedCounter;
         localIp70701StrtJobNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_STRT_JOB_NAM_LEN = 8;
	/**
	 * 	serialize this Ip70701StrtJobNam
	 */
   protected void serializeIp70701StrtJobNam(char[] ip70701StrtJobNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701StrtJobNam,0,getStringValue(),beginIp70701StrtJobNam,IP_70701_STRT_JOB_NAM_LEN);
       localIp70701StrtJobNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701StrtJobNamConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp70701StrtJobNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701StrtJobNam() {	 
   		return (substring(getStringValue(),beginIp70701StrtJobNam,beginIp70701StrtJobNam + IP_70701_STRT_JOB_NAM_LEN));
   	}
     int localIp70701StrtTsCounter = -1;
     public boolean isIp70701StrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701StrtTsCounter != sharedCounter;
         localIp70701StrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_STRT_TS_LEN = 26;
	/**
	 * 	serialize this Ip70701StrtTs
	 */
   protected void serializeIp70701StrtTs(char[] ip70701StrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701StrtTs,0,getStringValue(),beginIp70701StrtTs,IP_70701_STRT_TS_LEN);
       localIp70701StrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701StrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp70701StrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701StrtTs() {	 
   		return (substring(getStringValue(),beginIp70701StrtTs,beginIp70701StrtTs + IP_70701_STRT_TS_LEN));
   	}
         int localIp70701RqstDataTxtLenCounter = -1;
         public boolean isIp70701RqstDataTxtLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70701RqstDataTxtLenCounter != sharedCounter;
            localIp70701RqstDataTxtLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70701_RQST_DATA_TXT_LEN_LEN = 2;
  	/**
	 * serializeIp70701RqstDataTxtLen
	 */
	protected void serializeIp70701RqstDataTxtLen(short ip70701RqstDataTxtLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70701RqstDataTxtLen,IP_70701_RQST_DATA_TXT_LEN_LEN)
                  ,beginIp70701RqstDataTxtLen
                  ,IP_70701_RQST_DATA_TXT_LEN_LEN
                 );
            localIp70701RqstDataTxtLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp70701RqstDataTxtLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp70701RqstDataTxtLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp70701RqstDataTxtLen() {	 
			return (getShort(beginIp70701RqstDataTxtLen));
   	}
     int localIp70701RqstDataTxtCounter = -1;
     public boolean isIp70701RqstDataTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70701RqstDataTxtCounter != sharedCounter;
         localIp70701RqstDataTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70701_RQST_DATA_TXT_LEN = 2000;
	/**
	 * 	serialize this Ip70701RqstDataTxt
	 */
   protected void serializeIp70701RqstDataTxt(char[] ip70701RqstDataTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70701RqstDataTxt,0,getStringValue(),beginIp70701RqstDataTxt,IP_70701_RQST_DATA_TXT_LEN);
       localIp70701RqstDataTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70701RqstDataTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 2000 ,false, false);
   }
    /**
	 *	refreshIp70701RqstDataTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70701RqstDataTxt() {	 
   		return (substring(getStringValue(),beginIp70701RqstDataTxt,beginIp70701RqstDataTxt + IP_70701_RQST_DATA_TXT_LEN));
   	}




}
  
