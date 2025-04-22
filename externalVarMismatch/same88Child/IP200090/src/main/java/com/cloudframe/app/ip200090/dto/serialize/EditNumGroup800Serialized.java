package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class EditNumGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EditNumGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EditNumGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EDIT_NUM_GROUP_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEditNum800;
	
	/**
	* Constructor for EditNumGroup800Serialized
	**/
    public EditNumGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EditNumGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EDIT_NUM_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEditNum800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localEditNum800Counter = -1;
     public boolean isEditNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditNum800Counter != sharedCounter;
         localEditNum800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of editNum800
	 *	@return editNum800
	 */
	public char[]  getEditNum800String() {
	     return getCharArray(beginEditNum800,EDIT_NUM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editNum800IsNumeric() {
	    return isNumeric(beginEditNum800
	                    ,beginEditNum800 + EDIT_NUM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EDIT_NUM_800_LEN = 8;
  	/**
	 * serializeEditNum800
	 */
	protected void serializeEditNum800(long editNum800) {
		 putNumber(beginEditNum800,editNum800,EDIT_NUM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEditNum800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEditNum800
	 */
   	protected  long serializeEditNum800(char[] value) {
	    long  editNum800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    editNum800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginEditNum800
		       ,8
		      );
		 localEditNum800Counter = shareString.getSerializedField().getModifiedCounter();
		return  editNum800;
    }

   protected long checkEditNum800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEditNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEditNum800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEditNum800
			                 ,EDIT_NUM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("editNum800", beginEditNum800,EDIT_NUM_800_LEN);
    }
   	}




}
  
