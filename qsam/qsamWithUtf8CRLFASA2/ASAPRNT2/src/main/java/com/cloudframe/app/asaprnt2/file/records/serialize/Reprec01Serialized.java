package com.cloudframe.app.asaprnt2.file.records.serialize;

/**
*  The class Reprec01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:51. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Reprec01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Reprec01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REPREC_01_LENGTH = 287;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReprecString;
	
	/**
	* Constructor for Reprec01Serialized
	**/
    public Reprec01Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Reprec01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REPREC_01_LENGTH);
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
	protected static final int REPREC_STRING_LEN = 287;
	/**
	 * 	serialize this ReprecString
	 */
   protected void serializeReprecString(char[] reprecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reprecString,0,getStringValue(),beginReprecString,REPREC_STRING_LEN);
       localReprecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReprecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 287 ,false, false);
   }
    /**
	 *	refreshReprecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReprecString() {	 
   		return (substring(getStringValue(),beginReprecString,beginReprecString + REPREC_STRING_LEN));
   	}




}
  
