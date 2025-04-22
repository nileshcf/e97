package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyMtnMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyMtnMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyMtnMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_MTN_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginKeyMtnNpa;
            protected  int beginKeyMtnNxx;
            protected  int beginKeyMtnTln;
	
	/**
	* Constructor for KeyMtnMtnSerialized
	**/
    public KeyMtnMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyMtnMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyMtnMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyMtnMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,395); // serialize this field at offset 395 by default 
    }
    
	/**
	* sets parent for this KeyMtnMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 395 by default
    }    
	/**
	* initializes the field in KeyMtnMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_MTN_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginKeyMtnNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginKeyMtnNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginKeyMtnTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localKeyMtnNpaCounter = -1;
     public boolean isKeyMtnNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localKeyMtnNpaCounter != sharedCounter;
         localKeyMtnNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int KEY_MTN_NPA_LEN = 3;
	/**
	 * 	serialize this KeyMtnNpa
	 */
   protected void serializeKeyMtnNpa(char[] keyMtnNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(keyMtnNpa,0,getStringValue(),beginKeyMtnNpa,KEY_MTN_NPA_LEN);
       localKeyMtnNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkKeyMtnNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshKeyMtnNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshKeyMtnNpa() {	 
   		return (substring(getStringValue(),beginKeyMtnNpa,beginKeyMtnNpa + KEY_MTN_NPA_LEN));
   	}
     int localKeyMtnNxxCounter = -1;
     public boolean isKeyMtnNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localKeyMtnNxxCounter != sharedCounter;
         localKeyMtnNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int KEY_MTN_NXX_LEN = 3;
	/**
	 * 	serialize this KeyMtnNxx
	 */
   protected void serializeKeyMtnNxx(char[] keyMtnNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(keyMtnNxx,0,getStringValue(),beginKeyMtnNxx,KEY_MTN_NXX_LEN);
       localKeyMtnNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkKeyMtnNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshKeyMtnNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshKeyMtnNxx() {	 
   		return (substring(getStringValue(),beginKeyMtnNxx,beginKeyMtnNxx + KEY_MTN_NXX_LEN));
   	}
     int localKeyMtnTlnCounter = -1;
     public boolean isKeyMtnTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localKeyMtnTlnCounter != sharedCounter;
         localKeyMtnTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int KEY_MTN_TLN_LEN = 4;
	/**
	 * 	serialize this KeyMtnTln
	 */
   protected void serializeKeyMtnTln(char[] keyMtnTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(keyMtnTln,0,getStringValue(),beginKeyMtnTln,KEY_MTN_TLN_LEN);
       localKeyMtnTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkKeyMtnTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshKeyMtnTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshKeyMtnTln() {	 
   		return (substring(getStringValue(),beginKeyMtnTln,beginKeyMtnTln + KEY_MTN_TLN_LEN));
   	}




}
  
