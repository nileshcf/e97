package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00404FloorExpiryDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00404FloorExpiryDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00404FloorExpiryDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00404_FLOOR_EXPIRY_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00404FloorExpiryCcyy;
            protected  int beginIp00404FloorExpiryMm;
	
	/**
	* Constructor for Ip00404FloorExpiryDateSerialized
	**/
    public Ip00404FloorExpiryDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00404FloorExpiryDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404FloorExpiryDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00404FloorExpiryDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,133); // serialize this field at offset 133 by default 
    }
    
	/**
	* sets parent for this Ip00404FloorExpiryDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 133 by default
    }    
	/**
	* initializes the field in Ip00404FloorExpiryDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00404_FLOOR_EXPIRY_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00404FloorExpiryCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00404FloorExpiryMm = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00404FloorExpiryCcyyCounter = -1;
     public boolean isIp00404FloorExpiryCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404FloorExpiryCcyyCounter != sharedCounter;
         localIp00404FloorExpiryCcyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404FloorExpiryCcyy
	 *	@return ip00404FloorExpiryCcyy
	 */
	public char[]  getIp00404FloorExpiryCcyyString() {
	     return getCharArray(beginIp00404FloorExpiryCcyy,IP_00404_FLOOR_EXPIRY_CCYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404FloorExpiryCcyyIsNumeric() {
	    return isNumeric(beginIp00404FloorExpiryCcyy
	                    ,beginIp00404FloorExpiryCcyy + IP_00404_FLOOR_EXPIRY_CCYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_FLOOR_EXPIRY_CCYY_LEN = 4;
  	/**
	 * serializeIp00404FloorExpiryCcyy
	 */
	protected void serializeIp00404FloorExpiryCcyy(int ip00404FloorExpiryCcyy) {
		 putNumber(beginIp00404FloorExpiryCcyy,ip00404FloorExpiryCcyy,IP_00404_FLOOR_EXPIRY_CCYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404FloorExpiryCcyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404FloorExpiryCcyy
	 */
   	protected  int serializeIp00404FloorExpiryCcyy(char[] value) {
	    int  ip00404FloorExpiryCcyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404FloorExpiryCcyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp00404FloorExpiryCcyy
		       ,4
		      );
		 localIp00404FloorExpiryCcyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404FloorExpiryCcyy;
    }

   protected int checkIp00404FloorExpiryCcyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404FloorExpiryCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404FloorExpiryCcyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404FloorExpiryCcyy
			                 ,IP_00404_FLOOR_EXPIRY_CCYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404FloorExpiryCcyy", beginIp00404FloorExpiryCcyy,IP_00404_FLOOR_EXPIRY_CCYY_LEN);
    }
   	}
     int localIp00404FloorExpiryMmCounter = -1;
     public boolean isIp00404FloorExpiryMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00404FloorExpiryMmCounter != sharedCounter;
         localIp00404FloorExpiryMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00404FloorExpiryMm
	 *	@return ip00404FloorExpiryMm
	 */
	public char[]  getIp00404FloorExpiryMmString() {
	     return getCharArray(beginIp00404FloorExpiryMm,IP_00404_FLOOR_EXPIRY_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00404FloorExpiryMmIsNumeric() {
	    return isNumeric(beginIp00404FloorExpiryMm
	                    ,beginIp00404FloorExpiryMm + IP_00404_FLOOR_EXPIRY_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00404_FLOOR_EXPIRY_MM_LEN = 2;
  	/**
	 * serializeIp00404FloorExpiryMm
	 */
	protected void serializeIp00404FloorExpiryMm(int ip00404FloorExpiryMm) {
		 putNumber(beginIp00404FloorExpiryMm,ip00404FloorExpiryMm,IP_00404_FLOOR_EXPIRY_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00404FloorExpiryMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00404FloorExpiryMm
	 */
   	protected  int serializeIp00404FloorExpiryMm(char[] value) {
	    int  ip00404FloorExpiryMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00404FloorExpiryMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp00404FloorExpiryMm
		       ,2
		      );
		 localIp00404FloorExpiryMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00404FloorExpiryMm;
    }

   protected int checkIp00404FloorExpiryMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00404FloorExpiryMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00404FloorExpiryMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00404FloorExpiryMm
			                 ,IP_00404_FLOOR_EXPIRY_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00404FloorExpiryMm", beginIp00404FloorExpiryMm,IP_00404_FLOOR_EXPIRY_MM_LEN);
    }
   	}




}
  
