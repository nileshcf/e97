package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class PreEditVersion300RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PreEditVersion300RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PreEditVersion300RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRE_EDIT_VERSION_300_REDEFINED_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPeVerYy300;
            protected  int beginPeRelease300;
            protected  int beginPeVerSequence300;
	
	/**
	* Constructor for PreEditVersion300RedefinedSerialized
	**/
    public PreEditVersion300RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for PreEditVersion300RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PreEditVersion300RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this PreEditVersion300RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this PreEditVersion300RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in PreEditVersion300RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRE_EDIT_VERSION_300_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPeVerYy300 = getStartOffset() + 0;	// set offset for serialization
  
             beginPeRelease300 = getStartOffset() + 3;	// set offset for serialization
  
             beginPeVerSequence300 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPeVerYy300Counter = -1;
     public boolean isPeVerYy300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPeVerYy300Counter != sharedCounter;
         localPeVerYy300Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_VER_YY_300_LEN = 2;
	/**
	 * 	serialize this PeVerYy300
	 */
   protected void serializePeVerYy300(char[] peVerYy300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(peVerYy300,0,getStringValue(),beginPeVerYy300,PE_VER_YY_300_LEN);
       localPeVerYy300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPeVerYy300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPeVerYy300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPeVerYy300() {	 
   		return (substring(getStringValue(),beginPeVerYy300,beginPeVerYy300 + PE_VER_YY_300_LEN));
   	}
     int localPeRelease300Counter = -1;
     public boolean isPeRelease300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPeRelease300Counter != sharedCounter;
         localPeRelease300Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_RELEASE_300_LEN = 1;
	/**
	 * 	serialize this PeRelease300
	 */
   protected void serializePeRelease300(char[] peRelease300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(peRelease300,0,getStringValue(),beginPeRelease300,PE_RELEASE_300_LEN);
       localPeRelease300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPeRelease300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPeRelease300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPeRelease300() {	 
   		return (substring(getStringValue(),beginPeRelease300,beginPeRelease300 + PE_RELEASE_300_LEN));
   	}
     int localPeVerSequence300Counter = -1;
     public boolean isPeVerSequence300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPeVerSequence300Counter != sharedCounter;
         localPeVerSequence300Counter = sharedCounter; return hasModified;
     }
	protected static final int PE_VER_SEQUENCE_300_LEN = 2;
	/**
	 * 	serialize this PeVerSequence300
	 */
   protected void serializePeVerSequence300(char[] peVerSequence300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(peVerSequence300,0,getStringValue(),beginPeVerSequence300,PE_VER_SEQUENCE_300_LEN);
       localPeVerSequence300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPeVerSequence300Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPeVerSequence300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPeVerSequence300() {	 
   		return (substring(getStringValue(),beginPeVerSequence300,beginPeVerSequence300 + PE_VER_SEQUENCE_300_LEN));
   	}




}
  
