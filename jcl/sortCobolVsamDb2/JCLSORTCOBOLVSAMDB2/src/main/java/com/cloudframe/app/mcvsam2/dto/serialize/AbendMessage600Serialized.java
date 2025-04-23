package com.cloudframe.app.mcvsam2.dto.serialize;

/**
*  The class AbendMessage600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendMessage600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendMessage600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_MESSAGE_600_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbendDescription600;
            protected  int beginFileStatus600;
	
	/**
	* Constructor for AbendMessage600Serialized
	**/
    public AbendMessage600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AbendMessage600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_MESSAGE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAbendDescription600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginFileStatus600 = getStartOffset() + 54;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAbendDescription600Counter = -1;
     public boolean isAbendDescription600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendDescription600Counter != sharedCounter;
         localAbendDescription600Counter = sharedCounter; return hasModified;
     }
	protected static final int ABEND_DESCRIPTION_600_LEN = 42;
	/**
	 * 	serialize this AbendDescription600
	 */
   protected void serializeAbendDescription600(char[] abendDescription600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(abendDescription600,0,getStringValue(),beginAbendDescription600,ABEND_DESCRIPTION_600_LEN);
       localAbendDescription600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAbendDescription600Constraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
    /**
	 *	refreshAbendDescription600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAbendDescription600() {	 
   		return (substring(getStringValue(),beginAbendDescription600,beginAbendDescription600 + ABEND_DESCRIPTION_600_LEN));
   	}
     int localFileStatus600Counter = -1;
     public boolean isFileStatus600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStatus600Counter != sharedCounter;
         localFileStatus600Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_STATUS_600_LEN = 2;
	/**
	 * 	serialize this FileStatus600
	 */
   protected void serializeFileStatus600(char[] fileStatus600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileStatus600,0,getStringValue(),beginFileStatus600,FILE_STATUS_600_LEN);
       localFileStatus600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileStatus600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshFileStatus600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileStatus600() {	 
   		return (substring(getStringValue(),beginFileStatus600,beginFileStatus600 + FILE_STATUS_600_LEN));
   	}




}
  
