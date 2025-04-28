package com.cloudframe.app.vsammon1.file.records.serialize;

/**
*  The class ReprecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReprecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReprecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REPREC_LENGTH = 300;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReprecString;
	
	/**
	* Constructor for ReprecSerialized
	**/
    public ReprecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReprecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REPREC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReprecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReprecStringCounter = -1;
     public boolean isReprecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReprecStringCounter != sharedCounter;
         localReprecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int REPREC_STRING_LEN = 300;
	/**
	 * 	serialize this ReprecString
	 */
   protected void serializeReprecString(char[] reprecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reprecString,0,getStringValue(),beginReprecString,REPREC_STRING_LEN);
       localReprecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReprecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
    /**
	 *	refreshReprecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReprecString() {	 
   		return (substring(getStringValue(),beginReprecString,beginReprecString + REPREC_STRING_LEN));
   	}




}
  
