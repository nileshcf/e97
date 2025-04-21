package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002YydddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002YydddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002YydddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_YYDDD_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002YyJul;
            protected  int beginIp67002Ddd;
	
	/**
	* Constructor for Ip67002YydddSerialized
	**/
    public Ip67002YydddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002YydddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002YydddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002YydddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3); // serialize this field at offset 3 by default 
    }
    
	/**
	* sets parent for this Ip67002YydddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3 by default
    }    
	/**
	* initializes the field in Ip67002YydddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_YYDDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002YyJul = getStartOffset() + 0;	// set offset for serialization
  
             beginIp67002Ddd = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp67002YyJulCounter = -1;
     public boolean isIp67002YyJulModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002YyJulCounter != sharedCounter;
         localIp67002YyJulCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002YyJul
	 *	@return ip67002YyJul
	 */
	public char[]  getIp67002YyJulString() {
	     return getCharArray(beginIp67002YyJul,IP_67002_YY_JUL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002YyJulIsNumeric() {
	    return isNumeric(beginIp67002YyJul
	                    ,beginIp67002YyJul + IP_67002_YY_JUL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_YY_JUL_LEN = 2;
  	/**
	 * serializeIp67002YyJul
	 */
	protected void serializeIp67002YyJul(int ip67002YyJul) {
		 putNumber(beginIp67002YyJul,ip67002YyJul,IP_67002_YY_JUL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002YyJulCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002YyJul
	 */
   	protected  int serializeIp67002YyJul(char[] value) {
	    int  ip67002YyJul;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002YyJul = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002YyJul
		       ,2
		      );
		 localIp67002YyJulCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002YyJul;
    }

   protected int checkIp67002YyJulMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002YyJul is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002YyJul() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002YyJul
			                 ,IP_67002_YY_JUL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002YyJul", beginIp67002YyJul,IP_67002_YY_JUL_LEN);
    }
   	}
     int localIp67002DddCounter = -1;
     public boolean isIp67002DddModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002DddCounter != sharedCounter;
         localIp67002DddCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002Ddd
	 *	@return ip67002Ddd
	 */
	public char[]  getIp67002DddString() {
	     return getCharArray(beginIp67002Ddd,IP_67002_DDD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002DddIsNumeric() {
	    return isNumeric(beginIp67002Ddd
	                    ,beginIp67002Ddd + IP_67002_DDD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_DDD_LEN = 3;
  	/**
	 * serializeIp67002Ddd
	 */
	protected void serializeIp67002Ddd(int ip67002Ddd) {
		 putNumber(beginIp67002Ddd,ip67002Ddd,IP_67002_DDD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002DddCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002Ddd
	 */
   	protected  int serializeIp67002Ddd(char[] value) {
	    int  ip67002Ddd;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002Ddd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp67002Ddd
		       ,3
		      );
		 localIp67002DddCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002Ddd;
    }

   protected int checkIp67002DddMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002Ddd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002Ddd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002Ddd
			                 ,IP_67002_DDD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002Ddd", beginIp67002Ddd,IP_67002_DDD_LEN);
    }
   	}




}
  
