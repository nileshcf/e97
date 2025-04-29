package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002UtcOffsetHhmmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002UtcOffsetHhmmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002UtcOffsetHhmmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_UTC_OFFSET_HHMM_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002UtcOffsetHh;
            protected  int beginIp67002UtcOffsetMm;
	
	/**
	* Constructor for Ip67002UtcOffsetHhmmSerialized
	**/
    public Ip67002UtcOffsetHhmmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002UtcOffsetHhmmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002UtcOffsetHhmmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002UtcOffsetHhmmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip67002UtcOffsetHhmmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip67002UtcOffsetHhmmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_UTC_OFFSET_HHMM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002UtcOffsetHh = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002UtcOffsetMm = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002UtcOffsetHhCounter = -1;
     public boolean isIp67002UtcOffsetHhModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002UtcOffsetHhCounter != sharedCounter;
         localIp67002UtcOffsetHhCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002UtcOffsetHh
	 *	@return ip67002UtcOffsetHh
	 */
	public char[]  getIp67002UtcOffsetHhString() {
	     return getCharArray(beginIp67002UtcOffsetHh,IP_67002_UTC_OFFSET_HH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetHhIsNumeric() {
	    return isNumeric(beginIp67002UtcOffsetHh
	                    ,beginIp67002UtcOffsetHh + IP_67002_UTC_OFFSET_HH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_UTC_OFFSET_HH_LEN = 2;
  	/**
	 * serializeIp67002UtcOffsetHh
	 */
	protected void serializeIp67002UtcOffsetHh(int ip67002UtcOffsetHh) {
		 putNumber(beginIp67002UtcOffsetHh,ip67002UtcOffsetHh,IP_67002_UTC_OFFSET_HH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002UtcOffsetHhCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002UtcOffsetHh
	 */
   	protected  int serializeIp67002UtcOffsetHh(char[] value) {
	    int  ip67002UtcOffsetHh;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002UtcOffsetHh = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002UtcOffsetHh
		       ,2
		      );
		 localIp67002UtcOffsetHhCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002UtcOffsetHh;
    }

   protected int checkIp67002UtcOffsetHhMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002UtcOffsetHh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002UtcOffsetHh() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002UtcOffsetHh
			                 ,IP_67002_UTC_OFFSET_HH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002UtcOffsetHh", beginIp67002UtcOffsetHh,IP_67002_UTC_OFFSET_HH_LEN);
    }
   	}
     int localIp67002UtcOffsetMmCounter = -1;
     public boolean isIp67002UtcOffsetMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002UtcOffsetMmCounter != sharedCounter;
         localIp67002UtcOffsetMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002UtcOffsetMm
	 *	@return ip67002UtcOffsetMm
	 */
	public char[]  getIp67002UtcOffsetMmString() {
	     return getCharArray(beginIp67002UtcOffsetMm,IP_67002_UTC_OFFSET_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002UtcOffsetMmIsNumeric() {
	    return isNumeric(beginIp67002UtcOffsetMm
	                    ,beginIp67002UtcOffsetMm + IP_67002_UTC_OFFSET_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_UTC_OFFSET_MM_LEN = 2;
  	/**
	 * serializeIp67002UtcOffsetMm
	 */
	protected void serializeIp67002UtcOffsetMm(int ip67002UtcOffsetMm) {
		 putNumber(beginIp67002UtcOffsetMm,ip67002UtcOffsetMm,IP_67002_UTC_OFFSET_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002UtcOffsetMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002UtcOffsetMm
	 */
   	protected  int serializeIp67002UtcOffsetMm(char[] value) {
	    int  ip67002UtcOffsetMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002UtcOffsetMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002UtcOffsetMm
		       ,2
		      );
		 localIp67002UtcOffsetMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002UtcOffsetMm;
    }

   protected int checkIp67002UtcOffsetMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002UtcOffsetMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002UtcOffsetMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002UtcOffsetMm
			                 ,IP_67002_UTC_OFFSET_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002UtcOffsetMm", beginIp67002UtcOffsetMm,IP_67002_UTC_OFFSET_MM_LEN);
    }
   	}




}
  
