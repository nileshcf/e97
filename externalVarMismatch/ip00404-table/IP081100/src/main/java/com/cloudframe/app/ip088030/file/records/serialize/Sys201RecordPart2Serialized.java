package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Sys201RecordPart2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys201RecordPart2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys201RecordPart2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_201_RECORD_PART_2_LENGTH = 495;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys201Maid;
	
	/**
	* Constructor for Sys201RecordPart2Serialized
	**/
    public Sys201RecordPart2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys201RecordPart2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys201RecordPart2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys201RecordPart2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,255); // serialize this field at offset 255 by default 
    }
    
	/**
	* sets parent for this Sys201RecordPart2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 255 by default
    }    
	/**
	* initializes the field in Sys201RecordPart2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_201_RECORD_PART_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys201Maid = getStartOffset() + 489;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys201MaidCounter = -1;
     public boolean isSys201MaidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys201MaidCounter != sharedCounter;
         localSys201MaidCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_201_MAID_LEN = 6;
	/**
	 * 	serialize this Sys201Maid
	 */
   protected void serializeSys201Maid(char[] sys201Maid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys201Maid,0,getStringValue(),beginSys201Maid,SYS_201_MAID_LEN);
       localSys201MaidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys201MaidConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSys201Maid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys201Maid() {	 
   		return (substring(getStringValue(),beginSys201Maid,beginSys201Maid + SYS_201_MAID_LEN));
   	}




}
  
