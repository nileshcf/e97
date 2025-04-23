package com.cloudframe.app.move0.dto.serialize;

/**
*  The class AidUserByteRedefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AidUserByteRedefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AidUserByteRedefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AID_USER_BYTE_REDEFINED_01_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAidApplicationNum;
	
	/**
	* Constructor for AidUserByteRedefined01Serialized
	**/
    public AidUserByteRedefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AidUserByteRedefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AidUserByteRedefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AidUserByteRedefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AidUserByteRedefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AidUserByteRedefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AID_USER_BYTE_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAidApplicationNum = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAidApplicationNumCounter = -1;
     public boolean isAidApplicationNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAidApplicationNumCounter != sharedCounter;
         localAidApplicationNumCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aidApplicationNum
	 *	@return aidApplicationNum
	 */
	public char[]  getAidApplicationNumString() {
	     return getCharArray(beginAidApplicationNum,AID_APPLICATION_NUM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aidApplicationNumIsNumeric() {
	    return isNumeric(beginAidApplicationNum
	                    ,beginAidApplicationNum + AID_APPLICATION_NUM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AID_APPLICATION_NUM_LEN = 1;
  	/**
	 * serializeAidApplicationNum
	 */
	protected void serializeAidApplicationNum(int aidApplicationNum) {
		 putNumber(beginAidApplicationNum,aidApplicationNum,AID_APPLICATION_NUM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAidApplicationNumCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAidApplicationNum
	 */
   	protected  int serializeAidApplicationNum(char[] value) {
	    int  aidApplicationNum;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aidApplicationNum = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginAidApplicationNum
		       ,1
		      );
		 localAidApplicationNumCounter = shareString.getSerializedField().getModifiedCounter();
		return  aidApplicationNum;
    }

   protected int checkAidApplicationNumMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAidApplicationNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAidApplicationNum() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAidApplicationNum
			                 ,AID_APPLICATION_NUM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aidApplicationNum", beginAidApplicationNum,AID_APPLICATION_NUM_LEN);
    }
   	}




}
  
