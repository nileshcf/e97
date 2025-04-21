package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002CcyydddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002CcyydddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002CcyydddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_CCYYDDD_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002CcJul;
	
	/**
	* Constructor for Ip67002CcyydddSerialized
	**/
    public Ip67002CcyydddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002CcyydddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002CcyydddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002CcyydddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1); // serialize this field at offset 1 by default 
    }
    
	/**
	* sets parent for this Ip67002CcyydddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1 by default
    }    
	/**
	* initializes the field in Ip67002CcyydddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_CCYYDDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002CcJul = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp67002CcJulCounter = -1;
     public boolean isIp67002CcJulModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002CcJulCounter != sharedCounter;
         localIp67002CcJulCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002CcJul
	 *	@return ip67002CcJul
	 */
	public char[]  getIp67002CcJulString() {
	     return getCharArray(beginIp67002CcJul,IP_67002_CC_JUL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002CcJulIsNumeric() {
	    return isNumeric(beginIp67002CcJul
	                    ,beginIp67002CcJul + IP_67002_CC_JUL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_CC_JUL_LEN = 2;
  	/**
	 * serializeIp67002CcJul
	 */
	protected void serializeIp67002CcJul(int ip67002CcJul) {
		 putNumber(beginIp67002CcJul,ip67002CcJul,IP_67002_CC_JUL_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002CcJulCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002CcJul
	 */
   	protected  int serializeIp67002CcJul(char[] value) {
	    int  ip67002CcJul;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002CcJul = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp67002CcJul
		       ,2
		      );
		 localIp67002CcJulCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002CcJul;
    }

   protected int checkIp67002CcJulMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002CcJul is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002CcJul() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002CcJul
			                 ,IP_67002_CC_JUL_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002CcJul", beginIp67002CcJul,IP_67002_CC_JUL_LEN);
    }
   	}




}
  
