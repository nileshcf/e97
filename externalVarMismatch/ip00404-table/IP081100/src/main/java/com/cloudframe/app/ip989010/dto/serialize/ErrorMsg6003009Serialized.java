package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class ErrorMsg6003009Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMsg6003009Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMsg6003009Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MSG_6003009_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTag6003009;
	
	/**
	* Constructor for ErrorMsg6003009Serialized
	**/
    public ErrorMsg6003009Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMsg6003009Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MSG_6003009_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTag6003009 = getStartOffset() + 13;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTag6003009Counter = -1;
     public boolean isTag6003009Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTag6003009Counter != sharedCounter;
         localTag6003009Counter = sharedCounter; return hasModified;
     }
	protected static final int TAG_6003009_LEN = 1;
	/**
	 * 	serialize this Tag6003009
	 */
   protected void serializeTag6003009(char[] tag6003009) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tag6003009,0,getStringValue(),beginTag6003009,TAG_6003009_LEN);
       localTag6003009Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTag6003009Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTag6003009 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTag6003009() {	 
   		return (substring(getStringValue(),beginTag6003009,beginTag6003009 + TAG_6003009_LEN));
   	}




}
  
