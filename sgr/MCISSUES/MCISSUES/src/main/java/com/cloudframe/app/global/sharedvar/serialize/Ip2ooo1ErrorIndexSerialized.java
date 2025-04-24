package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip2ooo1ErrorIndexSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip2ooo1ErrorIndexSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip2ooo1ErrorIndexSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_2OOO_1_ERROR_INDEX_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp2ooo1ErrorMsgSevCd;
            protected  int beginIp2ooo1ErrorNumber;
	
	/**
	* Constructor for Ip2ooo1ErrorIndexSerialized
	**/
    public Ip2ooo1ErrorIndexSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip2ooo1ErrorIndexSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorIndexSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip2ooo1ErrorIndexSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip2ooo1ErrorIndexSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip2ooo1ErrorIndexSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_2OOO_1_ERROR_INDEX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp2ooo1ErrorMsgSevCd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp2ooo1ErrorNumber = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp2ooo1ErrorMsgSevCdCounter = -1;
     public boolean isIp2ooo1ErrorMsgSevCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp2ooo1ErrorMsgSevCdCounter != sharedCounter;
         localIp2ooo1ErrorMsgSevCdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip2ooo1ErrorMsgSevCd
	 *	@return ip2ooo1ErrorMsgSevCd
	 */
	public char[]  getIp2ooo1ErrorMsgSevCdString() {
	     return getCharArray(beginIp2ooo1ErrorMsgSevCd,IP_2OOO_1_ERROR_MSG_SEV_CD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorMsgSevCdIsNumeric() {
	    return isNumeric(beginIp2ooo1ErrorMsgSevCd
	                    ,beginIp2ooo1ErrorMsgSevCd + IP_2OOO_1_ERROR_MSG_SEV_CD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_2OOO_1_ERROR_MSG_SEV_CD_LEN = 2;
  	/**
	 * serializeIp2ooo1ErrorMsgSevCd
	 */
	protected void serializeIp2ooo1ErrorMsgSevCd(int ip2ooo1ErrorMsgSevCd) {
		 putNumber(beginIp2ooo1ErrorMsgSevCd,ip2ooo1ErrorMsgSevCd,IP_2OOO_1_ERROR_MSG_SEV_CD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp2ooo1ErrorMsgSevCdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp2ooo1ErrorMsgSevCd
	 */
   	protected  int serializeIp2ooo1ErrorMsgSevCd(char[] value) {
	    int  ip2ooo1ErrorMsgSevCd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip2ooo1ErrorMsgSevCd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp2ooo1ErrorMsgSevCd
		       ,2
		      );
		 localIp2ooo1ErrorMsgSevCdCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip2ooo1ErrorMsgSevCd;
    }

   protected int checkIp2ooo1ErrorMsgSevCdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp2ooo1ErrorMsgSevCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp2ooo1ErrorMsgSevCd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp2ooo1ErrorMsgSevCd
			                 ,IP_2OOO_1_ERROR_MSG_SEV_CD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip2ooo1ErrorMsgSevCd", beginIp2ooo1ErrorMsgSevCd,IP_2OOO_1_ERROR_MSG_SEV_CD_LEN);
    }
   	}
     int localIp2ooo1ErrorNumberCounter = -1;
     public boolean isIp2ooo1ErrorNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp2ooo1ErrorNumberCounter != sharedCounter;
         localIp2ooo1ErrorNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip2ooo1ErrorNumber
	 *	@return ip2ooo1ErrorNumber
	 */
	public char[]  getIp2ooo1ErrorNumberString() {
	     return getCharArray(beginIp2ooo1ErrorNumber,IP_2OOO_1_ERROR_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip2ooo1ErrorNumberIsNumeric() {
	    return isNumeric(beginIp2ooo1ErrorNumber
	                    ,beginIp2ooo1ErrorNumber + IP_2OOO_1_ERROR_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_2OOO_1_ERROR_NUMBER_LEN = 4;
  	/**
	 * serializeIp2ooo1ErrorNumber
	 */
	protected void serializeIp2ooo1ErrorNumber(int ip2ooo1ErrorNumber) {
		 putNumber(beginIp2ooo1ErrorNumber,ip2ooo1ErrorNumber,IP_2OOO_1_ERROR_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp2ooo1ErrorNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp2ooo1ErrorNumber
	 */
   	protected  int serializeIp2ooo1ErrorNumber(char[] value) {
	    int  ip2ooo1ErrorNumber;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip2ooo1ErrorNumber = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp2ooo1ErrorNumber
		       ,4
		      );
		 localIp2ooo1ErrorNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip2ooo1ErrorNumber;
    }

   protected int checkIp2ooo1ErrorNumberMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp2ooo1ErrorNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp2ooo1ErrorNumber() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp2ooo1ErrorNumber
			                 ,IP_2OOO_1_ERROR_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip2ooo1ErrorNumber", beginIp2ooo1ErrorNumber,IP_2OOO_1_ERROR_NUMBER_LEN);
    }
   	}




}
  
