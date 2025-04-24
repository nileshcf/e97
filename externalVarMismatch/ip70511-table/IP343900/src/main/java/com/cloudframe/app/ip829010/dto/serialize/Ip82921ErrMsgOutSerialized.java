package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class Ip82921ErrMsgOutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip82921ErrMsgOutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip82921ErrMsgOutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_82921_ERR_MSG_OUT_LENGTH = 280;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp82921ErrRequestCd;
            protected  int beginIp82921ErrTargetQmgrName;
            protected  int beginIp82921ErrTargetQName;
            protected  int beginIp82921ErrCompCd;
            protected  int beginIp82921ErrResnCd;
            protected  int beginIp82921ErrMsg;
	
	/**
	* Constructor for Ip82921ErrMsgOutSerialized
	**/
    public Ip82921ErrMsgOutSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip82921ErrMsgOutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_82921_ERR_MSG_OUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp82921ErrRequestCd = getStartOffset() + 222;	// set offset for serialization
  
             beginIp82921ErrTargetQmgrName = getStartOffset() + 225;	// set offset for serialization
  
             beginIp82921ErrTargetQName = getStartOffset() + 229;	// set offset for serialization
  
             beginIp82921ErrCompCd = getStartOffset() + 240;	// set offset for serialization
  
             beginIp82921ErrResnCd = getStartOffset() + 245;	// set offset for serialization
  
             beginIp82921ErrMsg = getStartOffset() + 250;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp82921ErrRequestCdCounter = -1;
     public boolean isIp82921ErrRequestCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ErrRequestCdCounter != sharedCounter;
         localIp82921ErrRequestCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_ERR_REQUEST_CD_LEN = 3;
	/**
	 * 	serialize this Ip82921ErrRequestCd
	 */
   protected void serializeIp82921ErrRequestCd(char[] ip82921ErrRequestCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ErrRequestCd,0,getStringValue(),beginIp82921ErrRequestCd,IP_82921_ERR_REQUEST_CD_LEN);
       localIp82921ErrRequestCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ErrRequestCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp82921ErrRequestCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ErrRequestCd() {	 
   		return (substring(getStringValue(),beginIp82921ErrRequestCd,beginIp82921ErrRequestCd + IP_82921_ERR_REQUEST_CD_LEN));
   	}
     int localIp82921ErrTargetQmgrNameCounter = -1;
     public boolean isIp82921ErrTargetQmgrNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ErrTargetQmgrNameCounter != sharedCounter;
         localIp82921ErrTargetQmgrNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_ERR_TARGET_QMGR_NAME_LEN = 4;
	/**
	 * 	serialize this Ip82921ErrTargetQmgrName
	 */
   protected void serializeIp82921ErrTargetQmgrName(char[] ip82921ErrTargetQmgrName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ErrTargetQmgrName,0,getStringValue(),beginIp82921ErrTargetQmgrName,IP_82921_ERR_TARGET_QMGR_NAME_LEN);
       localIp82921ErrTargetQmgrNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ErrTargetQmgrNameConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp82921ErrTargetQmgrName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ErrTargetQmgrName() {	 
   		return (substring(getStringValue(),beginIp82921ErrTargetQmgrName,beginIp82921ErrTargetQmgrName + IP_82921_ERR_TARGET_QMGR_NAME_LEN));
   	}
     int localIp82921ErrTargetQNameCounter = -1;
     public boolean isIp82921ErrTargetQNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ErrTargetQNameCounter != sharedCounter;
         localIp82921ErrTargetQNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_ERR_TARGET_QNAME_LEN = 11;
	/**
	 * 	serialize this Ip82921ErrTargetQName
	 */
   protected void serializeIp82921ErrTargetQName(char[] ip82921ErrTargetQName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ErrTargetQName,0,getStringValue(),beginIp82921ErrTargetQName,IP_82921_ERR_TARGET_QNAME_LEN);
       localIp82921ErrTargetQNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ErrTargetQNameConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshIp82921ErrTargetQName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ErrTargetQName() {	 
   		return (substring(getStringValue(),beginIp82921ErrTargetQName,beginIp82921ErrTargetQName + IP_82921_ERR_TARGET_QNAME_LEN));
   	}
     int localIp82921ErrCompCdCounter = -1;
     public boolean isIp82921ErrCompCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ErrCompCdCounter != sharedCounter;
         localIp82921ErrCompCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921ErrCompCd
	 *	@return ip82921ErrCompCd
	 */
	public char[]  getIp82921ErrCompCdString() {
	     return getCharArray(beginIp82921ErrCompCd,IP_82921_ERR_COMP_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ErrCompCdIsNumeric() {
	    return isNumeric(beginIp82921ErrCompCd
	                    ,beginIp82921ErrCompCd + IP_82921_ERR_COMP_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_ERR_COMP_CD_LEN = 5;
  	/**
	 * serializeIp82921ErrCompCd
	 */
	protected void serializeIp82921ErrCompCd(long ip82921ErrCompCd) {
		 putNumber(beginIp82921ErrCompCd,ip82921ErrCompCd,IP_82921_ERR_COMP_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921ErrCompCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921ErrCompCd
	 */
   	protected  long serializeIp82921ErrCompCd(char[] value) {
	    long  ip82921ErrCompCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921ErrCompCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp82921ErrCompCd
		       ,5
		      );
		 localIp82921ErrCompCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921ErrCompCd;
    }

   protected long checkIp82921ErrCompCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921ErrCompCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp82921ErrCompCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp82921ErrCompCd
			                 ,IP_82921_ERR_COMP_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921ErrCompCd", beginIp82921ErrCompCd,IP_82921_ERR_COMP_CD_LEN);
    }
   	}
     int localIp82921ErrResnCdCounter = -1;
     public boolean isIp82921ErrResnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ErrResnCdCounter != sharedCounter;
         localIp82921ErrResnCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip82921ErrResnCd
	 *	@return ip82921ErrResnCd
	 */
	public char[]  getIp82921ErrResnCdString() {
	     return getCharArray(beginIp82921ErrResnCd,IP_82921_ERR_RESN_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip82921ErrResnCdIsNumeric() {
	    return isNumeric(beginIp82921ErrResnCd
	                    ,beginIp82921ErrResnCd + IP_82921_ERR_RESN_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_82921_ERR_RESN_CD_LEN = 5;
  	/**
	 * serializeIp82921ErrResnCd
	 */
	protected void serializeIp82921ErrResnCd(long ip82921ErrResnCd) {
		 putNumber(beginIp82921ErrResnCd,ip82921ErrResnCd,IP_82921_ERR_RESN_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp82921ErrResnCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp82921ErrResnCd
	 */
   	protected  long serializeIp82921ErrResnCd(char[] value) {
	    long  ip82921ErrResnCd;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip82921ErrResnCd = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp82921ErrResnCd
		       ,5
		      );
		 localIp82921ErrResnCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip82921ErrResnCd;
    }

   protected long checkIp82921ErrResnCdMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp82921ErrResnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp82921ErrResnCd() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp82921ErrResnCd
			                 ,IP_82921_ERR_RESN_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip82921ErrResnCd", beginIp82921ErrResnCd,IP_82921_ERR_RESN_CD_LEN);
    }
   	}
     int localIp82921ErrMsgCounter = -1;
     public boolean isIp82921ErrMsgModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp82921ErrMsgCounter != sharedCounter;
         localIp82921ErrMsgCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_82921_ERR_MSG_LEN = 30;
	/**
	 * 	serialize this Ip82921ErrMsg
	 */
   protected void serializeIp82921ErrMsg(char[] ip82921ErrMsg) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip82921ErrMsg,0,getStringValue(),beginIp82921ErrMsg,IP_82921_ERR_MSG_LEN);
       localIp82921ErrMsgCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp82921ErrMsgConstraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshIp82921ErrMsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp82921ErrMsg() {	 
   		return (substring(getStringValue(),beginIp82921ErrMsg,beginIp82921ErrMsg + IP_82921_ERR_MSG_LEN));
   	}




}
  
