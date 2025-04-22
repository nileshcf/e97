package com.cloudframe.app.vsamdb2.file.records.serialize;

/**
*  The class Sys001IrdExtrFileRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
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
            protected  int beginSys001KeyAll;
	
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
             beginSys001KeyAll = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001KeyAllCounter = -1;
     public boolean isSys001KeyAllModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001KeyAllCounter != sharedCounter;
         localSys001KeyAllCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_KEY_ALL_LEN = 39;
	/**
	 * 	serialize this Sys001KeyAll
	 */
   protected void serializeSys001KeyAll(char[] sys001KeyAll) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001KeyAll,0,getStringValue(),beginSys001KeyAll,SYS_001_KEY_ALL_LEN);
       localSys001KeyAllCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001KeyAllConstraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
    /**
	 *	refreshSys001KeyAll is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001KeyAll() {	 
   		return (substring(getStringValue(),beginSys001KeyAll,beginSys001KeyAll + SYS_001_KEY_ALL_LEN));
   	}




}
  
