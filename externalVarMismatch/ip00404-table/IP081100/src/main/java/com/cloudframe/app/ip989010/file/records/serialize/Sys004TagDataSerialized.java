package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys004TagDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys004TagDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys004TagDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_004_TAG_DATA_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys004TagLen;
            protected  int beginSys004TagValue;
	
	/**
	* Constructor for Sys004TagDataSerialized
	**/
    public Sys004TagDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys004TagDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys004TagDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys004TagDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20); // serialize this field at offset 20 by default 
    }
    
	/**
	* sets parent for this Sys004TagDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20 by default
    }    
	/**
	* initializes the field in Sys004TagDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_004_TAG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys004TagLen = getStartOffset() + 0;	// set offset for serialization
  
             beginSys004TagValue = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys004TagLenCounter = -1;
     public boolean isSys004TagLenModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004TagLenCounter != sharedCounter;
         localSys004TagLenCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of sys004TagLen
	 *	@return sys004TagLen
	 */
	public char[]  getSys004TagLenString() {
	     return getCharArray(beginSys004TagLen,SYS_004_TAG_LEN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sys004TagLenIsNumeric() {
	    return isNumeric(beginSys004TagLen
	                    ,beginSys004TagLen + SYS_004_TAG_LEN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SYS_004_TAG_LEN_LEN = 3;
  	/**
	 * serializeSys004TagLen
	 */
	protected void serializeSys004TagLen(int sys004TagLen) {
		 putNumber(beginSys004TagLen,sys004TagLen,SYS_004_TAG_LEN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSys004TagLenCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSys004TagLen
	 */
   	protected  int serializeSys004TagLen(char[] value) {
	    int  sys004TagLen;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    sys004TagLen = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSys004TagLen
		       ,3
		      );
		 localSys004TagLenCounter = shareString.getSerializedField().getModifiedCounter();
		return  sys004TagLen;
    }

   protected int checkSys004TagLenMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSys004TagLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSys004TagLen() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSys004TagLen
			                 ,SYS_004_TAG_LEN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("sys004TagLen", beginSys004TagLen,SYS_004_TAG_LEN_LEN);
    }
   	}
     int localSys004TagValueCounter = -1;
     public boolean isSys004TagValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004TagValueCounter != sharedCounter;
         localSys004TagValueCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_004_TAG_VALUE_LEN = 57;
	/**
	 * 	serialize this Sys004TagValue
	 */
   protected void serializeSys004TagValue(char[] sys004TagValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys004TagValue,0,getStringValue(),beginSys004TagValue,SYS_004_TAG_VALUE_LEN);
       localSys004TagValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys004TagValueConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshSys004TagValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys004TagValue() {	 
   		return (substring(getStringValue(),beginSys004TagValue,beginSys004TagValue + SYS_004_TAG_VALUE_LEN));
   	}




}
  
