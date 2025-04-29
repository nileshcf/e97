package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class PreEditVersionGroup300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PreEditVersionGroup300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PreEditVersionGroup300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRE_EDIT_VERSION_GROUP_300_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPreEditVersion300;
	
	/**
	* Constructor for PreEditVersionGroup300Serialized
	**/
    public PreEditVersionGroup300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PreEditVersionGroup300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRE_EDIT_VERSION_GROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPreEditVersion300 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localPreEditVersion300Counter = -1;
     public boolean isPreEditVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPreEditVersion300Counter != sharedCounter;
         localPreEditVersion300Counter = sharedCounter; return hasModified;
     }
	protected static final int PRE_EDIT_VERSION_300_LEN = 7;
	/**
	 * 	serialize this PreEditVersion300
	 */
   protected void serializePreEditVersion300(char[] preEditVersion300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(preEditVersion300,0,getStringValue(),beginPreEditVersion300,PRE_EDIT_VERSION_300_LEN);
       localPreEditVersion300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPreEditVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshPreEditVersion300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPreEditVersion300() {	 
   		return (substring(getStringValue(),beginPreEditVersion300,beginPreEditVersion300 + PRE_EDIT_VERSION_300_LEN));
   	}




}
  
