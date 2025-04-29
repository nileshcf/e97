package com.cloudframe.app.mcvsam2.file.records.serialize;

/**
*  The class Sys001IrdExtrFileRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001IrdExtrFileRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001IrdExtrFileRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_IRD_EXTR_FILE_REC_LENGTH = 41;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001Ird;
	
	/**
	* Constructor for Sys001IrdExtrFileRecSerialized
	**/
    public Sys001IrdExtrFileRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys001IrdExtrFileRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_IRD_EXTR_FILE_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSys001Ird = getStartOffset() + 39;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001IrdCounter = -1;
     public boolean isSys001IrdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001IrdCounter != sharedCounter;
         localSys001IrdCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_IRD_LEN = 2;
	/**
	 * 	serialize this Sys001Ird
	 */
   protected void serializeSys001Ird(char[] sys001Ird) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001Ird,0,getStringValue(),beginSys001Ird,SYS_001_IRD_LEN);
       localSys001IrdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001IrdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSys001Ird is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001Ird() {	 
   		return (substring(getStringValue(),beginSys001Ird,beginSys001Ird + SYS_001_IRD_LEN));
   	}




}
  
