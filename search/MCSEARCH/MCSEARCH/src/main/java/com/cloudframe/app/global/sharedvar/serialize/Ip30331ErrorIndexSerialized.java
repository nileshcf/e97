package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip30331ErrorIndexSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip30331ErrorIndexSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip30331ErrorIndexSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_30331_ERROR_INDEX_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp30331ErrorMsgSevCd;
            protected  int beginIp30331ErrorNumber;
	
	/**
	* Constructor for Ip30331ErrorIndexSerialized
	**/
    public Ip30331ErrorIndexSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip30331ErrorIndexSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip30331ErrorIndexSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip30331ErrorIndexSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,12); // serialize this field at offset 12 by default 
    }
    
	/**
	* sets parent for this Ip30331ErrorIndexSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 12 by default
    }    
	/**
	* initializes the field in Ip30331ErrorIndexSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_30331_ERROR_INDEX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp30331ErrorMsgSevCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp30331ErrorNumber = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp30331ErrorMsgSevCdCounter = -1;
     public boolean isIp30331ErrorMsgSevCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331ErrorMsgSevCdCounter != sharedCounter;
         localIp30331ErrorMsgSevCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip30331ErrorMsgSevCd
	 *	@return ip30331ErrorMsgSevCd
	 */
	public char[]  getIp30331ErrorMsgSevCdString() {
	     return getCharArray(beginIp30331ErrorMsgSevCd,IP_30331_ERROR_MSG_SEV_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30331ErrorMsgSevCdIsNumeric() {
	    return isNumeric(beginIp30331ErrorMsgSevCd
	                    ,beginIp30331ErrorMsgSevCd + IP_30331_ERROR_MSG_SEV_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_30331_ERROR_MSG_SEV_CD_LEN = 2;
  	/**
	 * serializeIp30331ErrorMsgSevCd
	 */
	protected void serializeIp30331ErrorMsgSevCd(int ip30331ErrorMsgSevCd) {
		 putNumber(beginIp30331ErrorMsgSevCd,ip30331ErrorMsgSevCd,IP_30331_ERROR_MSG_SEV_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp30331ErrorMsgSevCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp30331ErrorMsgSevCd
	 */
   	protected  int serializeIp30331ErrorMsgSevCd(char[] value) {
	    int  ip30331ErrorMsgSevCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip30331ErrorMsgSevCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp30331ErrorMsgSevCd
		       ,2
		      );
		 localIp30331ErrorMsgSevCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip30331ErrorMsgSevCd;
    }

   protected int checkIp30331ErrorMsgSevCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp30331ErrorMsgSevCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp30331ErrorMsgSevCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp30331ErrorMsgSevCd
			                 ,IP_30331_ERROR_MSG_SEV_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip30331ErrorMsgSevCd", beginIp30331ErrorMsgSevCd,IP_30331_ERROR_MSG_SEV_CD_LEN);
    }
   	}
     int localIp30331ErrorNumberCounter = -1;
     public boolean isIp30331ErrorNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp30331ErrorNumberCounter != sharedCounter;
         localIp30331ErrorNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip30331ErrorNumber
	 *	@return ip30331ErrorNumber
	 */
	public char[]  getIp30331ErrorNumberString() {
	     return getCharArray(beginIp30331ErrorNumber,IP_30331_ERROR_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip30331ErrorNumberIsNumeric() {
	    return isNumeric(beginIp30331ErrorNumber
	                    ,beginIp30331ErrorNumber + IP_30331_ERROR_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_30331_ERROR_NUMBER_LEN = 4;
  	/**
	 * serializeIp30331ErrorNumber
	 */
	protected void serializeIp30331ErrorNumber(int ip30331ErrorNumber) {
		 putNumber(beginIp30331ErrorNumber,ip30331ErrorNumber,IP_30331_ERROR_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp30331ErrorNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp30331ErrorNumber
	 */
   	protected  int serializeIp30331ErrorNumber(char[] value) {
	    int  ip30331ErrorNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip30331ErrorNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp30331ErrorNumber
		       ,4
		      );
		 localIp30331ErrorNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip30331ErrorNumber;
    }

   protected int checkIp30331ErrorNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp30331ErrorNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp30331ErrorNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp30331ErrorNumber
			                 ,IP_30331_ERROR_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip30331ErrorNumber", beginIp30331ErrorNumber,IP_30331_ERROR_NUMBER_LEN);
    }
   	}




}
  
