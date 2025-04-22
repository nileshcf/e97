package com.cloudframe.app.ip650010.file.records.serialize;

/**
*  The class Sys007TableKeyAllSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys007TableKeyAllSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys007TableKeyAllSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_007_TABLE_KEY_ALL_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys007TableKey;
	
	/**
	* Constructor for Sys007TableKeyAllSerialized
	**/
    public Sys007TableKeyAllSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys007TableKeyAllSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys007TableKeyAllSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys007TableKeyAllSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sys007TableKeyAllSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sys007TableKeyAllSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_007_TABLE_KEY_ALL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys007TableKey = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys007TableKeyCounter = -1;
     public boolean isSys007TableKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys007TableKeyCounter != sharedCounter;
         localSys007TableKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_007_TABLE_KEY_LEN = 18;
	/**
	 * 	serialize this Sys007TableKey
	 */
   protected void serializeSys007TableKey(char[] sys007TableKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys007TableKey,0,getStringValue(),beginSys007TableKey,SYS_007_TABLE_KEY_LEN);
       localSys007TableKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys007TableKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshSys007TableKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys007TableKey() {	 
   		return (substring(getStringValue(),beginSys007TableKey,beginSys007TableKey + SYS_007_TABLE_KEY_LEN));
   	}




}
  
