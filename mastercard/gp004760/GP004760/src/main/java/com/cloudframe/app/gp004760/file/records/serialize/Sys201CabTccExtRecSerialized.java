package com.cloudframe.app.gp004760.file.records.serialize;

/**
*  The class Sys201CabTccExtRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201CabTccExtRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201CabTccExtRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_CAB_TCC_EXT_REC_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201CabTccExtRecString;
	
	/**
	* Constructor for Sys201CabTccExtRecSerialized
	**/
    public Sys201CabTccExtRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys201CabTccExtRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_CAB_TCC_EXT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201CabTccExtRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201CabTccExtRecStringCounter = -1;
     public boolean isSys201CabTccExtRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201CabTccExtRecStringCounter != sharedCounter;
         localSys201CabTccExtRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_CAB_TCC_EXT_REC_STRING_LEN = 256;
	/**
	 * 	serialize this Sys201CabTccExtRecString
	 */
   protected void serializeSys201CabTccExtRecString(char[] sys201CabTccExtRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201CabTccExtRecString,0,getStringValue(),beginSys201CabTccExtRecString,SYS_201_CAB_TCC_EXT_REC_STRING_LEN);
       localSys201CabTccExtRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201CabTccExtRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 256 ,false, false);
   }
    /**
	 *	refreshSys201CabTccExtRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201CabTccExtRecString() {	 
   		return (substring(getStringValue(),beginSys201CabTccExtRecString,beginSys201CabTccExtRecString + SYS_201_CAB_TCC_EXT_REC_STRING_LEN));
   	}




}
  
