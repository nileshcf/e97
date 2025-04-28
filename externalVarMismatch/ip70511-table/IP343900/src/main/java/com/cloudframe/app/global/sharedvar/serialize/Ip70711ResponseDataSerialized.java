package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip70711ResponseDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip70711ResponseDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip70711ResponseDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_70711_RESPONSE_DATA_LENGTH = 2047;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp70711MqRespCd;
            protected  int beginIp70711StrtJobNum;
            protected  int beginIp70711StrtTs;
            protected  int beginIp70711StatCd;
            protected  int beginIp70711JobGrpId;
            protected  int beginIp70711JobGrpNum;
            protected  int beginIp70711RespDataTxtLen;
            protected  int beginIp70711RespDataTxt;
            protected  int beginIp70711RejStatCd;
	
	/**
	* Constructor for Ip70711ResponseDataSerialized
	**/
    public Ip70711ResponseDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip70711ResponseDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip70711ResponseDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip70711ResponseDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,57); // serialize this field at offset 57 by default 
    }
    
	/**
	* sets parent for this Ip70711ResponseDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 57 by default
    }    
	/**
	* initializes the field in Ip70711ResponseDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_70711_RESPONSE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp70711MqRespCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp70711StrtJobNum = getStartOffset() + 1;	// set offset for serialization
  
             beginIp70711StrtTs = getStartOffset() + 9;	// set offset for serialization
  
             beginIp70711StatCd = getStartOffset() + 35;	// set offset for serialization
  
             beginIp70711JobGrpId = getStartOffset() + 36;	// set offset for serialization
  
             beginIp70711JobGrpNum = getStartOffset() + 42;	// set offset for serialization
  
             beginIp70711RespDataTxtLen = getStartOffset() + 44;	// set offset for serialization
  
             beginIp70711RespDataTxt = getStartOffset() + 46;	// set offset for serialization
  
             beginIp70711RejStatCd = getStartOffset() + 2046;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp70711MqRespCdCounter = -1;
     public boolean isIp70711MqRespCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711MqRespCdCounter != sharedCounter;
         localIp70711MqRespCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_MQ_RESP_CD_LEN = 1;
	/**
	 * 	serialize this Ip70711MqRespCd
	 */
   protected void serializeIp70711MqRespCd(char[] ip70711MqRespCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711MqRespCd,0,getStringValue(),beginIp70711MqRespCd,IP_70711_MQ_RESP_CD_LEN);
       localIp70711MqRespCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711MqRespCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70711MqRespCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711MqRespCd() {	 
   		return (substring(getStringValue(),beginIp70711MqRespCd,beginIp70711MqRespCd + IP_70711_MQ_RESP_CD_LEN));
   	}
     int localIp70711StrtJobNumCounter = -1;
     public boolean isIp70711StrtJobNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711StrtJobNumCounter != sharedCounter;
         localIp70711StrtJobNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_STRT_JOB_NUM_LEN = 8;
	/**
	 * 	serialize this Ip70711StrtJobNum
	 */
   protected void serializeIp70711StrtJobNum(char[] ip70711StrtJobNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711StrtJobNum,0,getStringValue(),beginIp70711StrtJobNum,IP_70711_STRT_JOB_NUM_LEN);
       localIp70711StrtJobNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711StrtJobNumConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIp70711StrtJobNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711StrtJobNum() {	 
   		return (substring(getStringValue(),beginIp70711StrtJobNum,beginIp70711StrtJobNum + IP_70711_STRT_JOB_NUM_LEN));
   	}
     int localIp70711StrtTsCounter = -1;
     public boolean isIp70711StrtTsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711StrtTsCounter != sharedCounter;
         localIp70711StrtTsCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_STRT_TS_LEN = 26;
	/**
	 * 	serialize this Ip70711StrtTs
	 */
   protected void serializeIp70711StrtTs(char[] ip70711StrtTs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711StrtTs,0,getStringValue(),beginIp70711StrtTs,IP_70711_STRT_TS_LEN);
       localIp70711StrtTsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711StrtTsConstraints(char[] value) {
   			return super.checkConstraints(value , 26 ,false, false);
   }
    /**
	 *	refreshIp70711StrtTs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711StrtTs() {	 
   		return (substring(getStringValue(),beginIp70711StrtTs,beginIp70711StrtTs + IP_70711_STRT_TS_LEN));
   	}
     int localIp70711StatCdCounter = -1;
     public boolean isIp70711StatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711StatCdCounter != sharedCounter;
         localIp70711StatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_STAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip70711StatCd
	 */
   protected void serializeIp70711StatCd(char[] ip70711StatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711StatCd,0,getStringValue(),beginIp70711StatCd,IP_70711_STAT_CD_LEN);
       localIp70711StatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711StatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70711StatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711StatCd() {	 
   		return (substring(getStringValue(),beginIp70711StatCd,beginIp70711StatCd + IP_70711_STAT_CD_LEN));
   	}
     int localIp70711JobGrpIdCounter = -1;
     public boolean isIp70711JobGrpIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711JobGrpIdCounter != sharedCounter;
         localIp70711JobGrpIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_JOB_GRP_ID_LEN = 6;
	/**
	 * 	serialize this Ip70711JobGrpId
	 */
   protected void serializeIp70711JobGrpId(char[] ip70711JobGrpId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711JobGrpId,0,getStringValue(),beginIp70711JobGrpId,IP_70711_JOB_GRP_ID_LEN);
       localIp70711JobGrpIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711JobGrpIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp70711JobGrpId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711JobGrpId() {	 
   		return (substring(getStringValue(),beginIp70711JobGrpId,beginIp70711JobGrpId + IP_70711_JOB_GRP_ID_LEN));
   	}
     int localIp70711JobGrpNumCounter = -1;
     public boolean isIp70711JobGrpNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711JobGrpNumCounter != sharedCounter;
         localIp70711JobGrpNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip70711JobGrpNum
	 *	@return ip70711JobGrpNum
	 */
	public char[]  getIp70711JobGrpNumString() {
	     return getCharArray(beginIp70711JobGrpNum,IP_70711_JOB_GRP_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip70711JobGrpNumIsNumeric() {
	    return isNumeric(beginIp70711JobGrpNum
	                    ,beginIp70711JobGrpNum + IP_70711_JOB_GRP_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_70711_JOB_GRP_NUM_LEN = 2;
  	/**
	 * serializeIp70711JobGrpNum
	 */
	protected void serializeIp70711JobGrpNum(int ip70711JobGrpNum) {
		 putNumber(beginIp70711JobGrpNum,ip70711JobGrpNum,IP_70711_JOB_GRP_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp70711JobGrpNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp70711JobGrpNum
	 */
   	protected  int serializeIp70711JobGrpNum(char[] value) {
	    int  ip70711JobGrpNum;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip70711JobGrpNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp70711JobGrpNum
		       ,2
		      );
		 localIp70711JobGrpNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip70711JobGrpNum;
    }

   protected int checkIp70711JobGrpNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp70711JobGrpNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp70711JobGrpNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp70711JobGrpNum
			                 ,IP_70711_JOB_GRP_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip70711JobGrpNum", beginIp70711JobGrpNum,IP_70711_JOB_GRP_NUM_LEN);
    }
   	}
         int localIp70711RespDataTxtLenCounter = -1;
         public boolean isIp70711RespDataTxtLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp70711RespDataTxtLenCounter != sharedCounter;
            localIp70711RespDataTxtLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_70711_RESP_DATA_TXT_LEN_LEN = 2;
  	/**
	 * serializeIp70711RespDataTxtLen
	 */
	protected void serializeIp70711RespDataTxtLen(short ip70711RespDataTxtLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip70711RespDataTxtLen,IP_70711_RESP_DATA_TXT_LEN_LEN)
                  ,beginIp70711RespDataTxtLen
                  ,IP_70711_RESP_DATA_TXT_LEN_LEN
                 );
            localIp70711RespDataTxtLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp70711RespDataTxtLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp70711RespDataTxtLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp70711RespDataTxtLen() {	 
			return (getShort(beginIp70711RespDataTxtLen));
   	}
     int localIp70711RespDataTxtCounter = -1;
     public boolean isIp70711RespDataTxtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711RespDataTxtCounter != sharedCounter;
         localIp70711RespDataTxtCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_RESP_DATA_TXT_LEN = 2000;
	/**
	 * 	serialize this Ip70711RespDataTxt
	 */
   protected void serializeIp70711RespDataTxt(char[] ip70711RespDataTxt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711RespDataTxt,0,getStringValue(),beginIp70711RespDataTxt,IP_70711_RESP_DATA_TXT_LEN);
       localIp70711RespDataTxtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711RespDataTxtConstraints(char[] value) {
   			return super.checkConstraints(value , 2000 ,false, false);
   }
    /**
	 *	refreshIp70711RespDataTxt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711RespDataTxt() {	 
   		return (substring(getStringValue(),beginIp70711RespDataTxt,beginIp70711RespDataTxt + IP_70711_RESP_DATA_TXT_LEN));
   	}
     int localIp70711RejStatCdCounter = -1;
     public boolean isIp70711RejStatCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp70711RejStatCdCounter != sharedCounter;
         localIp70711RejStatCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_70711_REJ_STAT_CD_LEN = 1;
	/**
	 * 	serialize this Ip70711RejStatCd
	 */
   protected void serializeIp70711RejStatCd(char[] ip70711RejStatCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip70711RejStatCd,0,getStringValue(),beginIp70711RejStatCd,IP_70711_REJ_STAT_CD_LEN);
       localIp70711RejStatCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp70711RejStatCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp70711RejStatCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp70711RejStatCd() {	 
   		return (substring(getStringValue(),beginIp70711RejStatCd,beginIp70711RejStatCd + IP_70711_REJ_STAT_CD_LEN));
   	}




}
  
