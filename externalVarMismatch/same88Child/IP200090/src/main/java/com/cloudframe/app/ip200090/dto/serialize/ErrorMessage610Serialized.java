package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class ErrorMessage610Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMessage610Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMessage610Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MESSAGE_610_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEditNumber610;
	
	/**
	* Constructor for ErrorMessage610Serialized
	**/
    public ErrorMessage610Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMessage610Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MESSAGE_610_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginEditNumber610 = getStartOffset() + 62;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEditNumber610Counter = -1;
     public boolean isEditNumber610Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditNumber610Counter != sharedCounter;
         localEditNumber610Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of editNumber610
	 *	@return editNumber610
	 */
	public char[]  getEditNumber610String() {
	     return getCharArray(beginEditNumber610,EDIT_NUMBER_610_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean editNumber610IsNumeric() {
	    return isNumeric(beginEditNumber610
	                    ,beginEditNumber610 + EDIT_NUMBER_610_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int EDIT_NUMBER_610_LEN = 8;
  	/**
	 * serializeEditNumber610
	 */
	protected void serializeEditNumber610(long editNumber610) {
		 putNumber(beginEditNumber610,editNumber610,EDIT_NUMBER_610_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEditNumber610Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEditNumber610
	 */
   	protected  long serializeEditNumber610(char[] value) {
	    long  editNumber610;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    editNumber610 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginEditNumber610
		       ,8
		      );
		 localEditNumber610Counter = shareString.getSerializedField().getModifiedCounter();
		return  editNumber610;
    }

   protected long checkEditNumber610MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEditNumber610 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshEditNumber610() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginEditNumber610
			                 ,EDIT_NUMBER_610_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("editNumber610", beginEditNumber610,EDIT_NUMBER_610_LEN);
    }
   	}




}
  
