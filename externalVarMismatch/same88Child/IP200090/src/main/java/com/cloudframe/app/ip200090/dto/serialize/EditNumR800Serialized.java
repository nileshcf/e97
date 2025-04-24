package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class EditNumR800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EditNumR800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EditNumR800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EDIT_NUM_R_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEditValue800;
	
	/**
	* Constructor for EditNumR800Serialized
	**/
    public EditNumR800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EditNumR800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EditNumR800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EditNumR800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this EditNumR800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in EditNumR800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EDIT_NUM_R_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEditValue800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEditValue800Counter = -1;
     public boolean isEditValue800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditValue800Counter != sharedCounter;
         localEditValue800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of editValue800
	 *	@return editValue800
	 */
	public char[]  getEditValue800String() {
	     return getCharArray(beginEditValue800,EDIT_VALUE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editValue800IsNumeric() {
	    return isNumeric(beginEditValue800
	                    ,beginEditValue800 + EDIT_VALUE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EDIT_VALUE_800_LEN = 4;
  	/**
	 * serializeEditValue800
	 */
	protected void serializeEditValue800(int editValue800) {
		 putNumber(beginEditValue800,editValue800,EDIT_VALUE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEditValue800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEditValue800
	 */
   	protected  int serializeEditValue800(char[] value) {
	    int  editValue800;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    editValue800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginEditValue800
		       ,4
		      );
		 localEditValue800Counter = shareString.getSerializedField().getModifiedCounter();
		return  editValue800;
    }

   protected int checkEditValue800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEditValue800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEditValue800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEditValue800
			                 ,EDIT_VALUE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("editValue800", beginEditValue800,EDIT_VALUE_800_LEN);
    }
   	}




}
  
