package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0040iFloorExpiryDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0040iFloorExpiryDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0040iFloorExpiryDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0040I_FLOOR_EXPIRY_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0040iFloorExpiryCcyy;
            protected  int beginIp0040iFloorExpiryMm;
	
	/**
	* Constructor for Ip0040iFloorExpiryDateSerialized
	**/
    public Ip0040iFloorExpiryDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0040iFloorExpiryDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iFloorExpiryDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0040iFloorExpiryDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,91); // serialize this field at offset 91 by default 
    }
    
	/**
	* sets parent for this Ip0040iFloorExpiryDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 91 by default
    }    
	/**
	* initializes the field in Ip0040iFloorExpiryDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0040I_FLOOR_EXPIRY_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0040iFloorExpiryCcyy = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0040iFloorExpiryMm = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0040iFloorExpiryCcyyCounter = -1;
     public boolean isIp0040iFloorExpiryCcyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iFloorExpiryCcyyCounter != sharedCounter;
         localIp0040iFloorExpiryCcyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iFloorExpiryCcyy
	 *	@return ip0040iFloorExpiryCcyy
	 */
	public char[]  getIp0040iFloorExpiryCcyyString() {
	     return getCharArray(beginIp0040iFloorExpiryCcyy,IP_0040I_FLOOR_EXPIRY_CCYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iFloorExpiryCcyyIsNumeric() {
	    return isNumeric(beginIp0040iFloorExpiryCcyy
	                    ,beginIp0040iFloorExpiryCcyy + IP_0040I_FLOOR_EXPIRY_CCYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_FLOOR_EXPIRY_CCYY_LEN = 4;
  	/**
	 * serializeIp0040iFloorExpiryCcyy
	 */
	protected void serializeIp0040iFloorExpiryCcyy(int ip0040iFloorExpiryCcyy) {
		 putNumber(beginIp0040iFloorExpiryCcyy,ip0040iFloorExpiryCcyy,IP_0040I_FLOOR_EXPIRY_CCYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iFloorExpiryCcyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iFloorExpiryCcyy
	 */
   	protected  int serializeIp0040iFloorExpiryCcyy(char[] value) {
	    int  ip0040iFloorExpiryCcyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iFloorExpiryCcyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginIp0040iFloorExpiryCcyy
		       ,4
		      );
		 localIp0040iFloorExpiryCcyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iFloorExpiryCcyy;
    }

   protected int checkIp0040iFloorExpiryCcyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iFloorExpiryCcyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iFloorExpiryCcyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iFloorExpiryCcyy
			                 ,IP_0040I_FLOOR_EXPIRY_CCYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iFloorExpiryCcyy", beginIp0040iFloorExpiryCcyy,IP_0040I_FLOOR_EXPIRY_CCYY_LEN);
    }
   	}
     int localIp0040iFloorExpiryMmCounter = -1;
     public boolean isIp0040iFloorExpiryMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0040iFloorExpiryMmCounter != sharedCounter;
         localIp0040iFloorExpiryMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0040iFloorExpiryMm
	 *	@return ip0040iFloorExpiryMm
	 */
	public char[]  getIp0040iFloorExpiryMmString() {
	     return getCharArray(beginIp0040iFloorExpiryMm,IP_0040I_FLOOR_EXPIRY_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0040iFloorExpiryMmIsNumeric() {
	    return isNumeric(beginIp0040iFloorExpiryMm
	                    ,beginIp0040iFloorExpiryMm + IP_0040I_FLOOR_EXPIRY_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0040I_FLOOR_EXPIRY_MM_LEN = 2;
  	/**
	 * serializeIp0040iFloorExpiryMm
	 */
	protected void serializeIp0040iFloorExpiryMm(int ip0040iFloorExpiryMm) {
		 putNumber(beginIp0040iFloorExpiryMm,ip0040iFloorExpiryMm,IP_0040I_FLOOR_EXPIRY_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0040iFloorExpiryMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0040iFloorExpiryMm
	 */
   	protected  int serializeIp0040iFloorExpiryMm(char[] value) {
	    int  ip0040iFloorExpiryMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0040iFloorExpiryMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp0040iFloorExpiryMm
		       ,2
		      );
		 localIp0040iFloorExpiryMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0040iFloorExpiryMm;
    }

   protected int checkIp0040iFloorExpiryMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0040iFloorExpiryMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0040iFloorExpiryMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0040iFloorExpiryMm
			                 ,IP_0040I_FLOOR_EXPIRY_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0040iFloorExpiryMm", beginIp0040iFloorExpiryMm,IP_0040I_FLOOR_EXPIRY_MM_LEN);
    }
   	}




}
  
