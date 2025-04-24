package com.cloudframe.app.mcvsam2.file.records.serialize;

/**
*  The class Sys001KeyAllSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys001KeyAllSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys001KeyAllSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_001_KEY_ALL_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys001Key;
	
	/**
	* Constructor for Sys001KeyAllSerialized
	**/
    public Sys001KeyAllSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sys001KeyAllSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001KeyAllSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sys001KeyAllSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sys001KeyAllSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sys001KeyAllSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_001_KEY_ALL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys001Key = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys001KeyCounter = -1;
     public boolean isSys001KeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001KeyCounter != sharedCounter;
         localSys001KeyCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_KEY_LEN = 31;
	/**
	 * 	serialize this Sys001Key
	 */
   protected void serializeSys001Key(char[] sys001Key) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001Key,0,getStringValue(),beginSys001Key,SYS_001_KEY_LEN);
       localSys001KeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001KeyConstraints(char[] value) {
   			return super.checkConstraints(value , 31 ,false, false);
   }
    /**
	 *	refreshSys001Key is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001Key() {	 
   		return (substring(getStringValue(),beginSys001Key,beginSys001Key + SYS_001_KEY_LEN));
   	}




}
  
