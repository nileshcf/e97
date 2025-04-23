package com.cloudframe.app.abprog9.dto.serialize;

/**
*  The class EndFlagGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EndFlagGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EndFlagGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int END_FLAG_GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEndFlag;
	
	/**
	* Constructor for EndFlagGroupSerialized
	**/
    public EndFlagGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EndFlagGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(END_FLAG_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEndFlag = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEndFlagCounter = -1;
     public boolean isEndFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEndFlagCounter != sharedCounter;
         localEndFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int END_FLAG_LEN = 1;
	/**
	 * 	serialize this EndFlag
	 */
   protected void serializeEndFlag(char[] endFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(endFlag,0,getStringValue(),beginEndFlag,END_FLAG_LEN);
       localEndFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEndFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEndFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEndFlag() {	 
   		return (substring(getStringValue(),beginEndFlag,beginEndFlag + END_FLAG_LEN));
   	}




}
  
