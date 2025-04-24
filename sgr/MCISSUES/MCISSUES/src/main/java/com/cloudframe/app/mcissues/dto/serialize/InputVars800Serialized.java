package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class InputVars800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputVars800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputVars800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_VARS_800_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputTableId800;
            protected  int beginInputSegId800;
	
	/**
	* Constructor for InputVars800Serialized
	**/
    public InputVars800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputVars800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_VARS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputTableId800 = getStartOffset() + 0;	// set offset for serialization
  
             beginInputSegId800 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInputTableId800Counter = -1;
     public boolean isInputTableId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputTableId800Counter != sharedCounter;
         localInputTableId800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inputTableId800
	 *	@return inputTableId800
	 */
	public char[]  getInputTableId800String() {
	     return getCharArray(beginInputTableId800,INPUT_TABLE_ID_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inputTableId800IsNumeric() {
	    return isNumeric(beginInputTableId800
	                    ,beginInputTableId800 + INPUT_TABLE_ID_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int INPUT_TABLE_ID_800_LEN = 11;
  	/**
	 * serializeInputTableId800
	 */
	protected void serializeInputTableId800(long inputTableId800) {
		 putNumber(beginInputTableId800,inputTableId800,INPUT_TABLE_ID_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInputTableId800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInputTableId800
	 */
   	protected  long serializeInputTableId800(char[] value) {
	    long  inputTableId800;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inputTableId800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginInputTableId800
		       ,11
		      );
		 localInputTableId800Counter = shareString.getSerializedField().getModifiedCounter();
		return  inputTableId800;
    }

   protected long checkInputTableId800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInputTableId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInputTableId800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInputTableId800
			                 ,INPUT_TABLE_ID_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inputTableId800", beginInputTableId800,INPUT_TABLE_ID_800_LEN);
    }
   	}
     int localInputSegId800Counter = -1;
     public boolean isInputSegId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputSegId800Counter != sharedCounter;
         localInputSegId800Counter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_SEG_ID_800_LEN = 4;
	/**
	 * 	serialize this InputSegId800
	 */
   protected void serializeInputSegId800(char[] inputSegId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputSegId800,0,getStringValue(),beginInputSegId800,INPUT_SEG_ID_800_LEN);
       localInputSegId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputSegId800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshInputSegId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputSegId800() {	 
   		return (substring(getStringValue(),beginInputSegId800,beginInputSegId800 + INPUT_SEG_ID_800_LEN));
   	}




}
  
