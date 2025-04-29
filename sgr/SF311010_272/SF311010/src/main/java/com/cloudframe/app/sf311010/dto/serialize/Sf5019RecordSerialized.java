package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf5019RecordSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf5019RecordSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf5019RecordSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_5019_RECORD_LENGTH = 8000;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf5019Data;
            protected  int beginSf5019DataRedefined01;
            protected  int beginSf5019DataRedefined02;
            protected  int beginSf5019DataRedefined;
	
	/**
	* Constructor for Sf5019RecordSerialized
	**/
    public Sf5019RecordSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf5019RecordSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf5019RecordSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf5019RecordSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf5019RecordSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf5019RecordSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_5019_RECORD_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf5019Data = getStartOffset() + 3;	// set offset for serialization
  
             beginSf5019DataRedefined01 = getStartOffset() + 3;	// set offset for serialization
  
             beginSf5019DataRedefined02 = getStartOffset() + 3;	// set offset for serialization
  
             beginSf5019DataRedefined = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf5019DataCounter = -1;
     public boolean isSf5019DataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf5019DataCounter != sharedCounter;
         localSf5019DataCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_5019_DATA_LEN = 7997;
	/**
	 * 	serialize this Sf5019Data
	 */
   protected void serializeSf5019Data(char[] sf5019Data) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf5019Data,0,getStringValue(),beginSf5019Data,SF_5019_DATA_LEN);
       localSf5019DataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf5019DataConstraints(char[] value) {
   			return super.checkConstraints(value , 7997 ,false, false);
   }
    /**
	 *	refreshSf5019Data is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf5019Data() {	 
   		return (substring(getStringValue(),beginSf5019Data,beginSf5019Data + SF_5019_DATA_LEN));
   	}
     int localSf5019DataRedefined01Counter = -1;
     public boolean isSf5019DataRedefined01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf5019DataRedefined01Counter != sharedCounter;
         localSf5019DataRedefined01Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_5019_DATA_REDEFINED_01_LEN = 7997;
	/**
	 * 	serialize this Sf5019DataRedefined01
	 */
   protected void serializeSf5019DataRedefined01(char[] sf5019DataRedefined01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf5019DataRedefined01,0,getStringValue(),beginSf5019DataRedefined01,SF_5019_DATA_REDEFINED_01_LEN);
       localSf5019DataRedefined01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf5019DataRedefined01Constraints(char[] value) {
   			return super.checkConstraints(value , 7997 ,false, false);
   }
    /**
	 *	refreshSf5019DataRedefined01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf5019DataRedefined01() {	 
   		return (substring(getStringValue(),beginSf5019DataRedefined01,beginSf5019DataRedefined01 + SF_5019_DATA_REDEFINED_01_LEN));
   	}
     int localSf5019DataRedefined02Counter = -1;
     public boolean isSf5019DataRedefined02Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf5019DataRedefined02Counter != sharedCounter;
         localSf5019DataRedefined02Counter = sharedCounter; return hasModified;
     }
	protected static final int SF_5019_DATA_REDEFINED_02_LEN = 7997;
	/**
	 * 	serialize this Sf5019DataRedefined02
	 */
   protected void serializeSf5019DataRedefined02(char[] sf5019DataRedefined02) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf5019DataRedefined02,0,getStringValue(),beginSf5019DataRedefined02,SF_5019_DATA_REDEFINED_02_LEN);
       localSf5019DataRedefined02Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf5019DataRedefined02Constraints(char[] value) {
   			return super.checkConstraints(value , 7997 ,false, false);
   }
    /**
	 *	refreshSf5019DataRedefined02 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf5019DataRedefined02() {	 
   		return (substring(getStringValue(),beginSf5019DataRedefined02,beginSf5019DataRedefined02 + SF_5019_DATA_REDEFINED_02_LEN));
   	}
     int localSf5019DataRedefinedCounter = -1;
     public boolean isSf5019DataRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf5019DataRedefinedCounter != sharedCounter;
         localSf5019DataRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_5019_DATA_REDEFINED_LEN = 7997;
	/**
	 * 	serialize this Sf5019DataRedefined
	 */
   protected void serializeSf5019DataRedefined(char[] sf5019DataRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf5019DataRedefined,0,getStringValue(),beginSf5019DataRedefined,SF_5019_DATA_REDEFINED_LEN);
       localSf5019DataRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf5019DataRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 7997 ,false, false);
   }
    /**
	 *	refreshSf5019DataRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf5019DataRedefined() {	 
   		return (substring(getStringValue(),beginSf5019DataRedefined,beginSf5019DataRedefined + SF_5019_DATA_REDEFINED_LEN));
   	}




}
  
