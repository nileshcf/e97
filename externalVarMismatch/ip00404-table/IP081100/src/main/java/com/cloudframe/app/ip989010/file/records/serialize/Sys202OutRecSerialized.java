package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys202OutRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys202OutRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys202OutRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_202_OUT_REC_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys202OutRecString;
	
	/**
	* Constructor for Sys202OutRecSerialized
	**/
    public Sys202OutRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys202OutRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_202_OUT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys202OutRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys202OutRecStringCounter = -1;
     public boolean isSys202OutRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202OutRecStringCounter != sharedCounter;
         localSys202OutRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_202_OUT_REC_STRING_LEN = 41;
	/**
	 * 	serialize this Sys202OutRecString
	 */
   protected void serializeSys202OutRecString(char[] sys202OutRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys202OutRecString,0,getStringValue(),beginSys202OutRecString,SYS_202_OUT_REC_STRING_LEN);
       localSys202OutRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys202OutRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 41 ,false, false);
   }
    /**
	 *	refreshSys202OutRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys202OutRecString() {	 
   		return (substring(getStringValue(),beginSys202OutRecString,beginSys202OutRecString + SYS_202_OUT_REC_STRING_LEN));
   	}




}
  
