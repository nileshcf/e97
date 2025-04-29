package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ListRecord220Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ListRecord220Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ListRecord220Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LIST_RECORD_220_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginListEndptId220;
	
	/**
	* Constructor for ListRecord220Serialized
	**/
    public ListRecord220Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ListRecord220Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LIST_RECORD_220_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginListEndptId220 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localListEndptId220Counter = -1;
     public boolean isListEndptId220Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localListEndptId220Counter != sharedCounter;
         localListEndptId220Counter = sharedCounter; return hasModified;
     }
	protected static final int LIST_ENDPT_ID_220_LEN = 7;
	/**
	 * 	serialize this ListEndptId220
	 */
   protected void serializeListEndptId220(char[] listEndptId220) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(listEndptId220,0,getStringValue(),beginListEndptId220,LIST_ENDPT_ID_220_LEN);
       localListEndptId220Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkListEndptId220Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshListEndptId220 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshListEndptId220() {	 
   		return (substring(getStringValue(),beginListEndptId220,beginListEndptId220 + LIST_ENDPT_ID_220_LEN));
   	}




}
  
