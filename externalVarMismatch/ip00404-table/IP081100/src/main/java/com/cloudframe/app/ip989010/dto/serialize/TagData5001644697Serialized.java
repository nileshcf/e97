package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class TagData5001644697Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TagData5001644697Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TagData5001644697Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TAG_DATA_5001644697_LENGTH = 1002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTagLen5001644697;
            protected  int beginTagValue5001644697;
	
	/**
	* Constructor for TagData5001644697Serialized
	**/
    public TagData5001644697Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TagData5001644697Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TagData5001644697Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TagData5001644697Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this TagData5001644697Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in TagData5001644697Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TAG_DATA_5001644697_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTagLen5001644697 = getStartOffset() + 0;	// set offset for serialization
  
             beginTagValue5001644697 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTagLen5001644697Counter = -1;
     public boolean isTagLen5001644697Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagLen5001644697Counter != sharedCounter;
         localTagLen5001644697Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of tagLen5001644697
	 *	@return tagLen5001644697
	 */
	public char[]  getTagLen5001644697String() {
	     return getCharArray(beginTagLen5001644697,TAG_LEN_5001644697_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean tagLen5001644697IsNumeric() {
	    return isNumeric(beginTagLen5001644697
	                    ,beginTagLen5001644697 + TAG_LEN_5001644697_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int TAG_LEN_5001644697_LEN = 3;
  	/**
	 * serializeTagLen5001644697
	 */
	protected void serializeTagLen5001644697(int tagLen5001644697) {
		 putNumber(beginTagLen5001644697,tagLen5001644697,TAG_LEN_5001644697_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localTagLen5001644697Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeTagLen5001644697
	 */
   	protected  int serializeTagLen5001644697(char[] value) {
	    int  tagLen5001644697;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    tagLen5001644697 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginTagLen5001644697
		       ,3
		      );
		 localTagLen5001644697Counter = shareString.getSerializedField().getModifiedCounter();
		return  tagLen5001644697;
    }

   protected int checkTagLen5001644697MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshTagLen5001644697 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshTagLen5001644697() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginTagLen5001644697
			                 ,TAG_LEN_5001644697_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("tagLen5001644697", beginTagLen5001644697,TAG_LEN_5001644697_LEN);
    }
   	}
     int localTagValue5001644697Counter = -1;
     public boolean isTagValue5001644697Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTagValue5001644697Counter != sharedCounter;
         localTagValue5001644697Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_VALUE_5001644697_LEN = 999;
	/**
	 * 	serialize this TagValue5001644697
	 */
   protected void serializeTagValue5001644697(char[] tagValue5001644697) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tagValue5001644697,0,getStringValue(),beginTagValue5001644697,TAG_VALUE_5001644697_LEN);
       localTagValue5001644697Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTagValue5001644697Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshTagValue5001644697 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTagValue5001644697() {	 
   		return (substring(getStringValue(),beginTagValue5001644697,beginTagValue5001644697 + TAG_VALUE_5001644697_LEN));
   	}




}
  
