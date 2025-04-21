package com.cloudframe.app.cfabcall.dto.serialize;

/**
*  The class ErrorMessageSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMessageSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMessageSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MESSAGE_LENGTH = 722;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorLen;
	
	/**
	* Constructor for ErrorMessageSerialized
	**/
    public ErrorMessageSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMessageSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MESSAGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginErrorLen = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localErrorLenCounter = -1;
         public boolean isErrorLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localErrorLenCounter != sharedCounter;
            localErrorLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int ERROR_LEN_LEN = 2;
  	/**
	 * serializeErrorLen
	 */
	protected void serializeErrorLen(short errorLen) {
           replaceValue( //  save the value as string
                   getBinaryString( errorLen,ERROR_LEN_LEN)
                  ,beginErrorLen
                  ,ERROR_LEN_LEN
                 );
            localErrorLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkErrorLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshErrorLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshErrorLen() {	 
			return (getShort(beginErrorLen));
   	}




}
  
