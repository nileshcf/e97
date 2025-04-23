package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002Jddd2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002Jddd2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002Jddd2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_JDDD_2_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002JDdd201;
	
	/**
	* Constructor for Ip67002Jddd2Serialized
	**/
    public Ip67002Jddd2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002Jddd2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002Jddd2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002Jddd2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this Ip67002Jddd2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in Ip67002Jddd2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_JDDD_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002JDdd201 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp67002JDdd201Counter = -1;
     public boolean isIp67002JDdd201Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002JDdd201Counter != sharedCounter;
         localIp67002JDdd201Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002JDdd201
	 *	@return ip67002JDdd201
	 */
	public char[]  getIp67002JDdd201String() {
	     return getCharArray(beginIp67002JDdd201,IP_67002_JDDD_201_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd201IsNumeric() {
	    return isNumeric(beginIp67002JDdd201
	                    ,beginIp67002JDdd201 + IP_67002_JDDD_201_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_JDDD_201_LEN = 3;
  	/**
	 * serializeIp67002JDdd201
	 */
	protected void serializeIp67002JDdd201(int ip67002JDdd201) {
		 putNumber(beginIp67002JDdd201,ip67002JDdd201,IP_67002_JDDD_201_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002JDdd201Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002JDdd201
	 */
   	protected  int serializeIp67002JDdd201(char[] value) {
	    int  ip67002JDdd201;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002JDdd201 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp67002JDdd201
		       ,3
		      );
		 localIp67002JDdd201Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002JDdd201;
    }

   protected int checkIp67002JDdd201MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002JDdd201 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002JDdd201() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002JDdd201
			                 ,IP_67002_JDDD_201_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002JDdd201", beginIp67002JDdd201,IP_67002_JDDD_201_LEN);
    }
   	}




}
  
