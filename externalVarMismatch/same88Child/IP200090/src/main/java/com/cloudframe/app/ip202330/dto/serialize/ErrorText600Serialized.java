package com.cloudframe.app.ip202330.dto.serialize;

/**
*  The class ErrorText600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorText600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorText600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_TEXT_600_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorFieldNumber600;
	
	/**
	* Constructor for ErrorText600Serialized
	**/
    public ErrorText600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrorText600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorText600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrorText600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ErrorText600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ErrorText600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_TEXT_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorFieldNumber600 = getStartOffset() + 23;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localErrorFieldNumber600Counter = -1;
     public boolean isErrorFieldNumber600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorFieldNumber600Counter != sharedCounter;
         localErrorFieldNumber600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errorFieldNumber600
	 *	@return errorFieldNumber600
	 */
	public char[]  getErrorFieldNumber600String() {
	     return getCharArray(beginErrorFieldNumber600,ERROR_FIELD_NUMBER_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorFieldNumber600IsNumeric() {
	    return isNumeric(beginErrorFieldNumber600
	                    ,beginErrorFieldNumber600 + ERROR_FIELD_NUMBER_600_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERROR_FIELD_NUMBER_600_LEN = 4;
  	/**
	 * serializeErrorFieldNumber600
	 */
	protected void serializeErrorFieldNumber600(short errorFieldNumber600) {
		 putNumber(beginErrorFieldNumber600,errorFieldNumber600,ERROR_FIELD_NUMBER_600_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrorFieldNumber600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrorFieldNumber600
	 */
   	protected  short serializeErrorFieldNumber600(char[] value) {
	    short  errorFieldNumber600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errorFieldNumber600 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginErrorFieldNumber600
		       ,4
		      );
		 localErrorFieldNumber600Counter = shareString.getSerializedField().getModifiedCounter();
		return  errorFieldNumber600;
    }

   protected short checkErrorFieldNumber600MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshErrorFieldNumber600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshErrorFieldNumber600() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginErrorFieldNumber600
			                 ,ERROR_FIELD_NUMBER_600_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errorFieldNumber600", beginErrorFieldNumber600,ERROR_FIELD_NUMBER_600_LEN);
    }
   	}




}
  
