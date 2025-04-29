package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ErrorPrefix690Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorPrefix690Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorPrefix690Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_PREFIX_690_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorSeqNbr690;
	
	/**
	* Constructor for ErrorPrefix690Serialized
	**/
    public ErrorPrefix690Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ErrorPrefix690Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorPrefix690Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ErrorPrefix690Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ErrorPrefix690Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ErrorPrefix690Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_PREFIX_690_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorSeqNbr690 = getStartOffset() + 1;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localErrorSeqNbr690Counter = -1;
     public boolean isErrorSeqNbr690Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorSeqNbr690Counter != sharedCounter;
         localErrorSeqNbr690Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of errorSeqNbr690
	 *	@return errorSeqNbr690
	 */
	public char[]  getErrorSeqNbr690String() {
	     return getCharArray(beginErrorSeqNbr690,ERROR_SEQ_NBR_690_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean errorSeqNbr690IsNumeric() {
	    return isNumeric(beginErrorSeqNbr690
	                    ,beginErrorSeqNbr690 + ERROR_SEQ_NBR_690_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ERROR_SEQ_NBR_690_LEN = 3;
  	/**
	 * serializeErrorSeqNbr690
	 */
	protected void serializeErrorSeqNbr690(int errorSeqNbr690) {
		 putNumber(beginErrorSeqNbr690,errorSeqNbr690,ERROR_SEQ_NBR_690_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localErrorSeqNbr690Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeErrorSeqNbr690
	 */
   	protected  int serializeErrorSeqNbr690(char[] value) {
	    int  errorSeqNbr690;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    errorSeqNbr690 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginErrorSeqNbr690
		       ,3
		      );
		 localErrorSeqNbr690Counter = shareString.getSerializedField().getModifiedCounter();
		return  errorSeqNbr690;
    }

   protected int checkErrorSeqNbr690MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshErrorSeqNbr690 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshErrorSeqNbr690() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginErrorSeqNbr690
			                 ,ERROR_SEQ_NBR_690_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("errorSeqNbr690", beginErrorSeqNbr690,ERROR_SEQ_NBR_690_LEN);
    }
   	}




}
  
