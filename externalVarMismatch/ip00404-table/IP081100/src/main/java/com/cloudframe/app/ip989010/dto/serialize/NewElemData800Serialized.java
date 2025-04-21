package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class NewElemData800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NewElemData800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NewElemData800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NEW_ELEM_DATA_800_LENGTH = 1002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNewElemLen800;
            protected  int beginNewElemValue800;
	
	/**
	* Constructor for NewElemData800Serialized
	**/
    public NewElemData800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for NewElemData800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public NewElemData800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this NewElemData800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1346); // serialize this field at offset 1346 by default 
    }
    
	/**
	* sets parent for this NewElemData800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1346 by default
    }    
	/**
	* initializes the field in NewElemData800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NEW_ELEM_DATA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNewElemLen800 = getStartOffset() + 0;	// set offset for serialization
  
             beginNewElemValue800 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNewElemLen800Counter = -1;
     public boolean isNewElemLen800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewElemLen800Counter != sharedCounter;
         localNewElemLen800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of newElemLen800
	 *	@return newElemLen800
	 */
	public char[]  getNewElemLen800String() {
	     return getCharArray(beginNewElemLen800,NEW_ELEM_LEN_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean newElemLen800IsNumeric() {
	    return isNumeric(beginNewElemLen800
	                    ,beginNewElemLen800 + NEW_ELEM_LEN_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NEW_ELEM_LEN_800_LEN = 3;
  	/**
	 * serializeNewElemLen800
	 */
	protected void serializeNewElemLen800(int newElemLen800) {
		 putNumber(beginNewElemLen800,newElemLen800,NEW_ELEM_LEN_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNewElemLen800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNewElemLen800
	 */
   	protected  int serializeNewElemLen800(char[] value) {
	    int  newElemLen800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    newElemLen800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginNewElemLen800
		       ,3
		      );
		 localNewElemLen800Counter = shareString.getSerializedField().getModifiedCounter();
		return  newElemLen800;
    }

   protected int checkNewElemLen800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNewElemLen800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNewElemLen800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNewElemLen800
			                 ,NEW_ELEM_LEN_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("newElemLen800", beginNewElemLen800,NEW_ELEM_LEN_800_LEN);
    }
   	}
     int localNewElemValue800Counter = -1;
     public boolean isNewElemValue800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewElemValue800Counter != sharedCounter;
         localNewElemValue800Counter = sharedCounter; return hasModified;
     }
	protected static final int NEW_ELEM_VALUE_800_LEN = 999;
	/**
	 * 	serialize this NewElemValue800
	 */
   protected void serializeNewElemValue800(char[] newElemValue800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(newElemValue800,0,getStringValue(),beginNewElemValue800,NEW_ELEM_VALUE_800_LEN);
       localNewElemValue800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNewElemValue800Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshNewElemValue800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNewElemValue800() {	 
   		return (substring(getStringValue(),beginNewElemValue800,beginNewElemValue800 + NEW_ELEM_VALUE_800_LEN));
   	}




}
  
