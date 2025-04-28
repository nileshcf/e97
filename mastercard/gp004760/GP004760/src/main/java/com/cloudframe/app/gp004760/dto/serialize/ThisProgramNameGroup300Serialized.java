package com.cloudframe.app.gp004760.dto.serialize;

/**
*  The class ThisProgramNameGroup300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ThisProgramNameGroup300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ThisProgramNameGroup300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int THIS_PROGRAM_NAME_GROUP_300_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginThisProgramName300;
	
	/**
	* Constructor for ThisProgramNameGroup300Serialized
	**/
    public ThisProgramNameGroup300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ThisProgramNameGroup300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(THIS_PROGRAM_NAME_GROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginThisProgramName300 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localThisProgramName300Counter = -1;
     public boolean isThisProgramName300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThisProgramName300Counter != sharedCounter;
         localThisProgramName300Counter = sharedCounter; return hasModified;
     }
	protected static final int THIS_PROGRAM_NAME_300_LEN = 8;
	/**
	 * 	serialize this ThisProgramName300
	 */
   protected void serializeThisProgramName300(char[] thisProgramName300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(thisProgramName300,0,getStringValue(),beginThisProgramName300,THIS_PROGRAM_NAME_300_LEN);
       localThisProgramName300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkThisProgramName300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshThisProgramName300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshThisProgramName300() {	 
   		return (substring(getStringValue(),beginThisProgramName300,beginThisProgramName300 + THIS_PROGRAM_NAME_300_LEN));
   	}




}
  
