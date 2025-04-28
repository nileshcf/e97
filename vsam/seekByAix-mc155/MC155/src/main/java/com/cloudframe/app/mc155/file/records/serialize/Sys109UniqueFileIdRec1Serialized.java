package com.cloudframe.app.mc155.file.records.serialize;

/**
*  The class Sys109UniqueFileIdRec1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys109UniqueFileIdRec1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys109UniqueFileIdRec1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_109_UNIQUE_FILE_ID_REC_1_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys109ProcessSeqnoKey;
	
	/**
	* Constructor for Sys109UniqueFileIdRec1Serialized
	**/
    public Sys109UniqueFileIdRec1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys109UniqueFileIdRec1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys109UniqueFileIdRec1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys109UniqueFileIdRec1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sys109UniqueFileIdRec1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sys109UniqueFileIdRec1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_109_UNIQUE_FILE_ID_REC_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys109ProcessSeqnoKey = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys109ProcessSeqnoKeyCounter = -1;
     public boolean isSys109ProcessSeqnoKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys109ProcessSeqnoKeyCounter != sharedCounter;
         localSys109ProcessSeqnoKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_109_PROCESS_SEQNO_KEY_LEN = 13;
	/**
	 * 	serialize this Sys109ProcessSeqnoKey
	 */
   protected void serializeSys109ProcessSeqnoKey(char[] sys109ProcessSeqnoKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys109ProcessSeqnoKey,0,getStringValue(),beginSys109ProcessSeqnoKey,SYS_109_PROCESS_SEQNO_KEY_LEN);
       localSys109ProcessSeqnoKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys109ProcessSeqnoKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshSys109ProcessSeqnoKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys109ProcessSeqnoKey() {	 
   		return (substring(getStringValue(),beginSys109ProcessSeqnoKey,beginSys109ProcessSeqnoKey + SYS_109_PROCESS_SEQNO_KEY_LEN));
   	}




}
  
