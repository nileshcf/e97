package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorMsg690Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg690Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg690Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_690_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorRequest690;
	
	/**
	* Constructor for ErrorMsg690Serialized
	**/
    public ErrorMsg690Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg690Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_690_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginErrorRequest690 = getStartOffset() + 18;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localErrorRequest690Counter = -1;
     public boolean isErrorRequest690Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorRequest690Counter != sharedCounter;
         localErrorRequest690Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errorRequest690
	 *	@return errorRequest690
	 */
	public char[]  getErrorRequest690String() {
	     return getCharArray(beginErrorRequest690,ERROR_REQUEST_690_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorRequest690IsNumeric() {
	    return isNumeric(beginErrorRequest690
	                    ,beginErrorRequest690 + ERROR_REQUEST_690_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERROR_REQUEST_690_LEN = 9;
  	/**
	 * serializeErrorRequest690
	 */
	protected void serializeErrorRequest690(long errorRequest690) {
		 putNumber(beginErrorRequest690,errorRequest690,ERROR_REQUEST_690_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrorRequest690Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrorRequest690
	 */
   	protected  long serializeErrorRequest690(char[] value) {
	    long  errorRequest690;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errorRequest690 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginErrorRequest690
		       ,9
		      );
		 localErrorRequest690Counter = shareString.getSerializedField().getModifiedCounter();
		return  errorRequest690;
    }

   protected long checkErrorRequest690MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshErrorRequest690 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshErrorRequest690() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginErrorRequest690
			                 ,ERROR_REQUEST_690_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errorRequest690", beginErrorRequest690,ERROR_REQUEST_690_LEN);
    }
   	}




}
  
