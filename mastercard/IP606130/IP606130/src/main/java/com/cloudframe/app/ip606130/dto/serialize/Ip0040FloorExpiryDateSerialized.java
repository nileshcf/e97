package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip0040FloorExpiryDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040FloorExpiryDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040FloorExpiryDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040_FLOOR_EXPIRY_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040FloorExpiryCcyy;
            protected  int beginIp0040FloorExpiryMm;
	
	/**
	* Constructor for Ip0040FloorExpiryDateSerialized
	**/
    public Ip0040FloorExpiryDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040FloorExpiryDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040FloorExpiryDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040FloorExpiryDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,142); // serialize this field at offset 142 by default 
    }
    
	/**
	* sets parent for this Ip0040FloorExpiryDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 142 by default
    }    
	/**
	* initializes the field in Ip0040FloorExpiryDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040_FLOOR_EXPIRY_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040FloorExpiryCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040FloorExpiryMm = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040FloorExpiryCcyyCounter = -1;
     public boolean isIp0040FloorExpiryCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040FloorExpiryCcyyCounter != sharedCounter;
         localIp0040FloorExpiryCcyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040FloorExpiryCcyy
	 *	@return ip0040FloorExpiryCcyy
	 */
	public char[]  getIp0040FloorExpiryCcyyString() {
	     return getCharArray(beginIp0040FloorExpiryCcyy,IP_0040_FLOOR_EXPIRY_CCYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040FloorExpiryCcyyIsNumeric() {
	    return isNumeric(beginIp0040FloorExpiryCcyy
	                    ,beginIp0040FloorExpiryCcyy + IP_0040_FLOOR_EXPIRY_CCYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_FLOOR_EXPIRY_CCYY_LEN = 4;
  	/**
	 * serializeIp0040FloorExpiryCcyy
	 */
	protected void serializeIp0040FloorExpiryCcyy(int ip0040FloorExpiryCcyy) {
		 putNumber(beginIp0040FloorExpiryCcyy,ip0040FloorExpiryCcyy,IP_0040_FLOOR_EXPIRY_CCYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040FloorExpiryCcyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040FloorExpiryCcyy
	 */
   	protected  int serializeIp0040FloorExpiryCcyy(char[] value) {
	    int  ip0040FloorExpiryCcyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040FloorExpiryCcyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp0040FloorExpiryCcyy
		       ,4
		      );
		 localIp0040FloorExpiryCcyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040FloorExpiryCcyy;
    }

   protected int checkIp0040FloorExpiryCcyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040FloorExpiryCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040FloorExpiryCcyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040FloorExpiryCcyy
			                 ,IP_0040_FLOOR_EXPIRY_CCYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040FloorExpiryCcyy", beginIp0040FloorExpiryCcyy,IP_0040_FLOOR_EXPIRY_CCYY_LEN);
    }
   	}
     int localIp0040FloorExpiryMmCounter = -1;
     public boolean isIp0040FloorExpiryMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040FloorExpiryMmCounter != sharedCounter;
         localIp0040FloorExpiryMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040FloorExpiryMm
	 *	@return ip0040FloorExpiryMm
	 */
	public char[]  getIp0040FloorExpiryMmString() {
	     return getCharArray(beginIp0040FloorExpiryMm,IP_0040_FLOOR_EXPIRY_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040FloorExpiryMmIsNumeric() {
	    return isNumeric(beginIp0040FloorExpiryMm
	                    ,beginIp0040FloorExpiryMm + IP_0040_FLOOR_EXPIRY_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040_FLOOR_EXPIRY_MM_LEN = 2;
  	/**
	 * serializeIp0040FloorExpiryMm
	 */
	protected void serializeIp0040FloorExpiryMm(int ip0040FloorExpiryMm) {
		 putNumber(beginIp0040FloorExpiryMm,ip0040FloorExpiryMm,IP_0040_FLOOR_EXPIRY_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040FloorExpiryMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040FloorExpiryMm
	 */
   	protected  int serializeIp0040FloorExpiryMm(char[] value) {
	    int  ip0040FloorExpiryMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040FloorExpiryMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp0040FloorExpiryMm
		       ,2
		      );
		 localIp0040FloorExpiryMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040FloorExpiryMm;
    }

   protected int checkIp0040FloorExpiryMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040FloorExpiryMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040FloorExpiryMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040FloorExpiryMm
			                 ,IP_0040_FLOOR_EXPIRY_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040FloorExpiryMm", beginIp0040FloorExpiryMm,IP_0040_FLOOR_EXPIRY_MM_LEN);
    }
   	}




}
  
