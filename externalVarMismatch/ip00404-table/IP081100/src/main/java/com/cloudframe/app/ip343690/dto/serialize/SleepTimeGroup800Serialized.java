package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class SleepTimeGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SleepTimeGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SleepTimeGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SLEEP_TIME_GROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSleepTime800;
	
	/**
	* Constructor for SleepTimeGroup800Serialized
	**/
    public SleepTimeGroup800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SleepTimeGroup800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SleepTimeGroup800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SleepTimeGroup800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this SleepTimeGroup800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in SleepTimeGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SLEEP_TIME_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSleepTime800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSleepTime800Counter = -1;
     public boolean isSleepTime800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSleepTime800Counter != sharedCounter;
         localSleepTime800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sleepTime800
	 *	@return sleepTime800
	 */
	public char[]  getSleepTime800String() {
	     return getCharArray(beginSleepTime800,SLEEP_TIME_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sleepTime800IsNumeric() {
	    return isNumeric(beginSleepTime800
	                    ,beginSleepTime800 + SLEEP_TIME_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SLEEP_TIME_800_LEN = 8;
  	/**
	 * serializeSleepTime800
	 */
	protected void serializeSleepTime800(long sleepTime800) {
		 putNumber(beginSleepTime800,sleepTime800,SLEEP_TIME_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSleepTime800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSleepTime800
	 */
   	protected  long serializeSleepTime800(char[] value) {
	    long  sleepTime800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sleepTime800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginSleepTime800
		       ,8
		      );
		 localSleepTime800Counter = shareString.getSerializedField().getModifiedCounter();
		return  sleepTime800;
    }

   protected long checkSleepTime800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSleepTime800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSleepTime800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSleepTime800
			                 ,SLEEP_TIME_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sleepTime800", beginSleepTime800,SLEEP_TIME_800_LEN);
    }
   	}




}
  
