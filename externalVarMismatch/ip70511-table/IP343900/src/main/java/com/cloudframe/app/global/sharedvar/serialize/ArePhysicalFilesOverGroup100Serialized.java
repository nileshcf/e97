package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class ArePhysicalFilesOverGroup100Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ArePhysicalFilesOverGroup100Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ArePhysicalFilesOverGroup100Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ARE_PHYSICAL_FILES_OVER_GROUP_100_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginArePhysicalFilesOver100;
	
	/**
	* Constructor for ArePhysicalFilesOverGroup100Serialized
	**/
    public ArePhysicalFilesOverGroup100Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ArePhysicalFilesOverGroup100Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ARE_PHYSICAL_FILES_OVER_GROUP_100_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginArePhysicalFilesOver100 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localArePhysicalFilesOver100Counter = -1;
     public boolean isArePhysicalFilesOver100Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localArePhysicalFilesOver100Counter != sharedCounter;
         localArePhysicalFilesOver100Counter = sharedCounter; return hasModified;
     }
	protected static final int ARE_PHYSICAL_FILES_OVER_100_LEN = 1;
	/**
	 * 	serialize this ArePhysicalFilesOver100
	 */
   protected void serializeArePhysicalFilesOver100(char[] arePhysicalFilesOver100) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(arePhysicalFilesOver100,0,getStringValue(),beginArePhysicalFilesOver100,ARE_PHYSICAL_FILES_OVER_100_LEN);
       localArePhysicalFilesOver100Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkArePhysicalFilesOver100Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshArePhysicalFilesOver100 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshArePhysicalFilesOver100() {	 
   		return (substring(getStringValue(),beginArePhysicalFilesOver100,beginArePhysicalFilesOver100 + ARE_PHYSICAL_FILES_OVER_100_LEN));
   	}




}
  
