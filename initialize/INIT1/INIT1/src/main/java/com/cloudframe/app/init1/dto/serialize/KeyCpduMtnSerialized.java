package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyCpduMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyCpduMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyCpduMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_CPDU_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCpduNpa;
            protected  int beginCpduNxx;
            protected  int beginCpduTln;
	
	/**
	* Constructor for KeyCpduMtnSerialized
	**/
    public KeyCpduMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyCpduMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyCpduMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyCpduMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,40); // serialize this field at offset 40 by default 
    }
    
	/**
	* sets parent for this KeyCpduMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 40 by default
    }    
	/**
	* initializes the field in KeyCpduMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_CPDU_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCpduNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginCpduNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginCpduTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCpduNpaCounter = -1;
     public boolean isCpduNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduNpaCounter != sharedCounter;
         localCpduNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_NPA_LEN = 3;
	/**
	 * 	serialize this CpduNpa
	 */
   protected void serializeCpduNpa(char[] cpduNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduNpa,0,getStringValue(),beginCpduNpa,CPDU_NPA_LEN);
       localCpduNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpduNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduNpa() {	 
   		return (substring(getStringValue(),beginCpduNpa,beginCpduNpa + CPDU_NPA_LEN));
   	}
     int localCpduNxxCounter = -1;
     public boolean isCpduNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduNxxCounter != sharedCounter;
         localCpduNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_NXX_LEN = 3;
	/**
	 * 	serialize this CpduNxx
	 */
   protected void serializeCpduNxx(char[] cpduNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduNxx,0,getStringValue(),beginCpduNxx,CPDU_NXX_LEN);
       localCpduNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCpduNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduNxx() {	 
   		return (substring(getStringValue(),beginCpduNxx,beginCpduNxx + CPDU_NXX_LEN));
   	}
     int localCpduTlnCounter = -1;
     public boolean isCpduTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCpduTlnCounter != sharedCounter;
         localCpduTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int CPDU_TLN_LEN = 4;
	/**
	 * 	serialize this CpduTln
	 */
   protected void serializeCpduTln(char[] cpduTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cpduTln,0,getStringValue(),beginCpduTln,CPDU_TLN_LEN);
       localCpduTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCpduTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCpduTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCpduTln() {	 
   		return (substring(getStringValue(),beginCpduTln,beginCpduTln + CPDU_TLN_LEN));
   	}




}
  
