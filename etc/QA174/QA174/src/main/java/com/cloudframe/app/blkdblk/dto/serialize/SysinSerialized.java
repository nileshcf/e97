package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class SysinSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SysinSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SysinSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYSIN_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDirectionFlag;
	
	/**
	* Constructor for SysinSerialized
	**/
    public SysinSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SysinSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYSIN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDirectionFlag = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDirectionFlagCounter = -1;
     public boolean isDirectionFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDirectionFlagCounter != sharedCounter;
         localDirectionFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int DIRECTION_FLAG_LEN = 5;
	/**
	 * 	serialize this DirectionFlag
	 */
   protected void serializeDirectionFlag(char[] directionFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(directionFlag,0,getStringValue(),beginDirectionFlag,DIRECTION_FLAG_LEN);
       localDirectionFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDirectionFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshDirectionFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDirectionFlag() {	 
   		return (substring(getStringValue(),beginDirectionFlag,beginDirectionFlag + DIRECTION_FLAG_LEN));
   	}




}
  
