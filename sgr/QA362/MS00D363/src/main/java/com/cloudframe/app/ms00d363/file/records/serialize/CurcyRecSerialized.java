package com.cloudframe.app.ms00d363.file.records.serialize;

/**
*  The class CurcyRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurcyRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurcyRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURCY_REC_LENGTH = 300;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurcyRecString;
	
	/**
	* Constructor for CurcyRecSerialized
	**/
    public CurcyRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurcyRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURCY_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurcyRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurcyRecStringCounter = -1;
     public boolean isCurcyRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurcyRecStringCounter != sharedCounter;
         localCurcyRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int CURCY_REC_STRING_LEN = 300;
	/**
	 * 	serialize this CurcyRecString
	 */
   protected void serializeCurcyRecString(char[] curcyRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(curcyRecString,0,getStringValue(),beginCurcyRecString,CURCY_REC_STRING_LEN);
       localCurcyRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurcyRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 300 ,false, false);
   }
    /**
	 *	refreshCurcyRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurcyRecString() {	 
   		return (substring(getStringValue(),beginCurcyRecString,beginCurcyRecString + CURCY_REC_STRING_LEN));
   	}




}
  
