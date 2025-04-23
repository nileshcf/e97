package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class AcceptInputGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcceptInputGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcceptInputGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACCEPT_INPUT_GROUP_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcceptInput;
	
	/**
	* Constructor for AcceptInputGroupSerialized
	**/
    public AcceptInputGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AcceptInputGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACCEPT_INPUT_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAcceptInput = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAcceptInputCounter = -1;
     public boolean isAcceptInputModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcceptInputCounter != sharedCounter;
         localAcceptInputCounter = sharedCounter; return hasModified;
     }
	protected static final int ACCEPT_INPUT_LEN = 80;
	/**
	 * 	serialize this AcceptInput
	 */
   protected void serializeAcceptInput(char[] acceptInput) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acceptInput,0,getStringValue(),beginAcceptInput,ACCEPT_INPUT_LEN);
       localAcceptInputCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcceptInputConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshAcceptInput is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcceptInput() {	 
   		return (substring(getStringValue(),beginAcceptInput,beginAcceptInput + ACCEPT_INPUT_LEN));
   	}




}
  
