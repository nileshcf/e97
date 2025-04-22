package com.cloudframe.app.ip989010.file.records.serialize;

/**
*  The class Sys004InRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys004InRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys004InRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_004_IN_REC_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys004MtiFc;
            protected  int beginSys004TagKey;
	
	/**
	* Constructor for Sys004InRecSerialized
	**/
    public Sys004InRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys004InRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_004_IN_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys004MtiFc = getStartOffset() + 0;	// set offset for serialization
  
             beginSys004TagKey = getStartOffset() + 7;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localSys004MtiFcCounter = -1;
     public boolean isSys004MtiFcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004MtiFcCounter != sharedCounter;
         localSys004MtiFcCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_004_MTI_FC_LEN = 7;
	/**
	 * 	serialize this Sys004MtiFc
	 */
   protected void serializeSys004MtiFc(char[] sys004MtiFc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys004MtiFc,0,getStringValue(),beginSys004MtiFc,SYS_004_MTI_FC_LEN);
       localSys004MtiFcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys004MtiFcConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshSys004MtiFc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys004MtiFc() {	 
   		return (substring(getStringValue(),beginSys004MtiFc,beginSys004MtiFc + SYS_004_MTI_FC_LEN));
   	}
     int localSys004TagKeyCounter = -1;
     public boolean isSys004TagKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys004TagKeyCounter != sharedCounter;
         localSys004TagKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_004_TAG_KEY_LEN = 13;
	/**
	 * 	serialize this Sys004TagKey
	 */
   protected void serializeSys004TagKey(char[] sys004TagKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys004TagKey,0,getStringValue(),beginSys004TagKey,SYS_004_TAG_KEY_LEN);
       localSys004TagKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys004TagKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshSys004TagKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys004TagKey() {	 
   		return (substring(getStringValue(),beginSys004TagKey,beginSys004TagKey + SYS_004_TAG_KEY_LEN));
   	}




}
  
