package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ReturnJobNameGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReturnJobNameGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReturnJobNameGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RETURN_JOB_NAME_GROUP_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReturnJobName;
	
	/**
	* Constructor for ReturnJobNameGroupSerialized
	**/
    public ReturnJobNameGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in ReturnJobNameGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RETURN_JOB_NAME_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReturnJobName = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReturnJobNameCounter = -1;
     public boolean isReturnJobNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReturnJobNameCounter != sharedCounter;
         localReturnJobNameCounter = sharedCounter; return hasModified;
     }
	protected static final int RETURN_JOB_NAME_LEN = 8;
	/**
	 * 	serialize this ReturnJobName
	 */
   protected void serializeReturnJobName(char[] returnJobName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(returnJobName,0,getStringValue(),beginReturnJobName,RETURN_JOB_NAME_LEN);
       localReturnJobNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReturnJobNameConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshReturnJobName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReturnJobName() {	 
   		return (substring(getStringValue(),beginReturnJobName,beginReturnJobName + RETURN_JOB_NAME_LEN));
   	}




}
  
