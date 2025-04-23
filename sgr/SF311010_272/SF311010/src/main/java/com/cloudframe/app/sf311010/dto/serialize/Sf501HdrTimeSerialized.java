package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501HdrTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501HdrTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501HdrTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_HDR_TIME_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501HdrHour;
            protected  int beginSf501HdrMin;
            protected  int beginSf501HdrSec;
	
	/**
	* Constructor for Sf501HdrTimeSerialized
	**/
    public Sf501HdrTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501HdrTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HdrTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501HdrTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this Sf501HdrTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in Sf501HdrTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_HDR_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501HdrHour = getStartOffset() + 0;	// set offset for serialization
  
             beginSf501HdrMin = getStartOffset() + 1;	// set offset for serialization
  
             beginSf501HdrSec = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501HdrHourCounter = -1;
     public boolean isSf501HdrHourModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501HdrHourCounter != sharedCounter;
         localSf501HdrHourCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_HDR_HOUR_LEN = 1;
	/**
	 * 	serialize this Sf501HdrHour
	 */
   protected void serializeSf501HdrHour(char[] sf501HdrHour) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501HdrHour,0,getStringValue(),beginSf501HdrHour,SF_501_HDR_HOUR_LEN);
       localSf501HdrHourCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501HdrHourConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501HdrHour is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501HdrHour() {	 
   		return (substring(getStringValue(),beginSf501HdrHour,beginSf501HdrHour + SF_501_HDR_HOUR_LEN));
   	}
     int localSf501HdrMinCounter = -1;
     public boolean isSf501HdrMinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501HdrMinCounter != sharedCounter;
         localSf501HdrMinCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_HDR_MIN_LEN = 1;
	/**
	 * 	serialize this Sf501HdrMin
	 */
   protected void serializeSf501HdrMin(char[] sf501HdrMin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501HdrMin,0,getStringValue(),beginSf501HdrMin,SF_501_HDR_MIN_LEN);
       localSf501HdrMinCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501HdrMinConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501HdrMin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501HdrMin() {	 
   		return (substring(getStringValue(),beginSf501HdrMin,beginSf501HdrMin + SF_501_HDR_MIN_LEN));
   	}
     int localSf501HdrSecCounter = -1;
     public boolean isSf501HdrSecModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501HdrSecCounter != sharedCounter;
         localSf501HdrSecCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_HDR_SEC_LEN = 1;
	/**
	 * 	serialize this Sf501HdrSec
	 */
   protected void serializeSf501HdrSec(char[] sf501HdrSec) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501HdrSec,0,getStringValue(),beginSf501HdrSec,SF_501_HDR_SEC_LEN);
       localSf501HdrSecCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501HdrSecConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501HdrSec is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501HdrSec() {	 
   		return (substring(getStringValue(),beginSf501HdrSec,beginSf501HdrSec + SF_501_HDR_SEC_LEN));
   	}




}
  
