package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip67002JdddSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip67002JdddSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip67002JdddSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_67002_JDDD_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp67002JDdd01;
	
	/**
	* Constructor for Ip67002JdddSerialized
	**/
    public Ip67002JdddSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip67002JdddSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip67002JdddSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip67002JdddSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this Ip67002JdddSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in Ip67002JdddSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_67002_JDDD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp67002JDdd01 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp67002JDdd01Counter = -1;
     public boolean isIp67002JDdd01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp67002JDdd01Counter != sharedCounter;
         localIp67002JDdd01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip67002JDdd01
	 *	@return ip67002JDdd01
	 */
	public char[]  getIp67002JDdd01String() {
	     return getCharArray(beginIp67002JDdd01,IP_67002_JDDD_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip67002JDdd01IsNumeric() {
	    return isNumeric(beginIp67002JDdd01
	                    ,beginIp67002JDdd01 + IP_67002_JDDD_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_67002_JDDD_01_LEN = 3;
  	/**
	 * serializeIp67002JDdd01
	 */
	protected void serializeIp67002JDdd01(int ip67002JDdd01) {
		 putNumber(beginIp67002JDdd01,ip67002JDdd01,IP_67002_JDDD_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp67002JDdd01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp67002JDdd01
	 */
   	protected  int serializeIp67002JDdd01(char[] value) {
	    int  ip67002JDdd01;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip67002JDdd01 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp67002JDdd01
		       ,3
		      );
		 localIp67002JDdd01Counter = shareString.getSerializedField().getModifiedCounter();
		return  ip67002JDdd01;
    }

   protected int checkIp67002JDdd01MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp67002JDdd01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp67002JDdd01() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp67002JDdd01
			                 ,IP_67002_JDDD_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip67002JDdd01", beginIp67002JDdd01,IP_67002_JDDD_01_LEN);
    }
   	}




}
  
