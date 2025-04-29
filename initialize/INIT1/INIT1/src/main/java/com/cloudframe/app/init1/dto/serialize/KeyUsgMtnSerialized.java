package com.cloudframe.app.init1.dto.serialize;

/**
*  The class KeyUsgMtnSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyUsgMtnSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyUsgMtnSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEY_USG_MTN_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUsgNpa;
            protected  int beginUsgNxx;
            protected  int beginUsgTln;
	
	/**
	* Constructor for KeyUsgMtnSerialized
	**/
    public KeyUsgMtnSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyUsgMtnSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyUsgMtnSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyUsgMtnSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,228); // serialize this field at offset 228 by default 
    }
    
	/**
	* sets parent for this KeyUsgMtnSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 228 by default
    }    
	/**
	* initializes the field in KeyUsgMtnSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEY_USG_MTN_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUsgNpa = getStartOffset() + 0;	// set offset for serialization
  
             beginUsgNxx = getStartOffset() + 3;	// set offset for serialization
  
             beginUsgTln = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUsgNpaCounter = -1;
     public boolean isUsgNpaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgNpaCounter != sharedCounter;
         localUsgNpaCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_NPA_LEN = 3;
	/**
	 * 	serialize this UsgNpa
	 */
   protected void serializeUsgNpa(char[] usgNpa) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgNpa,0,getStringValue(),beginUsgNpa,USG_NPA_LEN);
       localUsgNpaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgNpaConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUsgNpa is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgNpa() {	 
   		return (substring(getStringValue(),beginUsgNpa,beginUsgNpa + USG_NPA_LEN));
   	}
     int localUsgNxxCounter = -1;
     public boolean isUsgNxxModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgNxxCounter != sharedCounter;
         localUsgNxxCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_NXX_LEN = 3;
	/**
	 * 	serialize this UsgNxx
	 */
   protected void serializeUsgNxx(char[] usgNxx) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgNxx,0,getStringValue(),beginUsgNxx,USG_NXX_LEN);
       localUsgNxxCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgNxxConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshUsgNxx is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgNxx() {	 
   		return (substring(getStringValue(),beginUsgNxx,beginUsgNxx + USG_NXX_LEN));
   	}
     int localUsgTlnCounter = -1;
     public boolean isUsgTlnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUsgTlnCounter != sharedCounter;
         localUsgTlnCounter = sharedCounter; return hasModified;
     }
	protected static final int USG_TLN_LEN = 4;
	/**
	 * 	serialize this UsgTln
	 */
   protected void serializeUsgTln(char[] usgTln) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(usgTln,0,getStringValue(),beginUsgTln,USG_TLN_LEN);
       localUsgTlnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUsgTlnConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshUsgTln is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUsgTln() {	 
   		return (substring(getStringValue(),beginUsgTln,beginUsgTln + USG_TLN_LEN));
   	}




}
  
