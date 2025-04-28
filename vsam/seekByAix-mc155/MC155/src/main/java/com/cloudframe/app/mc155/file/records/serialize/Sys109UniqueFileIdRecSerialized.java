package com.cloudframe.app.mc155.file.records.serialize;

/**
*  The class Sys109UniqueFileIdRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys109UniqueFileIdRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys109UniqueFileIdRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_109_UNIQUE_FILE_ID_REC_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys109FileIdKey;
	
	/**
	* Constructor for Sys109UniqueFileIdRecSerialized
	**/
    public Sys109UniqueFileIdRecSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys109UniqueFileIdRecSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys109UniqueFileIdRecSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys109UniqueFileIdRecSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sys109UniqueFileIdRecSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sys109UniqueFileIdRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_109_UNIQUE_FILE_ID_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys109FileIdKey = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys109FileIdKeyCounter = -1;
     public boolean isSys109FileIdKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys109FileIdKeyCounter != sharedCounter;
         localSys109FileIdKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_109_FILE_ID_KEY_LEN = 21;
	/**
	 * 	serialize this Sys109FileIdKey
	 */
   protected void serializeSys109FileIdKey(char[] sys109FileIdKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys109FileIdKey,0,getStringValue(),beginSys109FileIdKey,SYS_109_FILE_ID_KEY_LEN);
       localSys109FileIdKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys109FileIdKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshSys109FileIdKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys109FileIdKey() {	 
   		return (substring(getStringValue(),beginSys109FileIdKey,beginSys109FileIdKey + SYS_109_FILE_ID_KEY_LEN));
   	}




}
  
