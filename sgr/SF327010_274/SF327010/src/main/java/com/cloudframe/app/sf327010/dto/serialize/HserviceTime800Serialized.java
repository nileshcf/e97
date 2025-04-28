package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class HserviceTime800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HserviceTime800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HserviceTime800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HSERVICE_TIME_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHserviceHh800;
            protected  int beginHserviceMins800;
            protected  int beginHserviceSec800;
	
	/**
	* Constructor for HserviceTime800Serialized
	**/
    public HserviceTime800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HserviceTime800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HserviceTime800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HserviceTime800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this HserviceTime800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in HserviceTime800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HSERVICE_TIME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHserviceHh800 = getStartOffset() + 0;	// set offset for serialization
  
             beginHserviceMins800 = getStartOffset() + 2;	// set offset for serialization
  
             beginHserviceSec800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHserviceHh800Counter = -1;
     public boolean isHserviceHh800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceHh800Counter != sharedCounter;
         localHserviceHh800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_HH_800_LEN = 2;
	/**
	 * 	serialize this HserviceHh800
	 */
   protected void serializeHserviceHh800(char[] hserviceHh800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceHh800,0,getStringValue(),beginHserviceHh800,HSERVICE_HH_800_LEN);
       localHserviceHh800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceHh800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceHh800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceHh800() {	 
   		return (substring(getStringValue(),beginHserviceHh800,beginHserviceHh800 + HSERVICE_HH_800_LEN));
   	}
     int localHserviceMins800Counter = -1;
     public boolean isHserviceMins800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceMins800Counter != sharedCounter;
         localHserviceMins800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_MINS_800_LEN = 2;
	/**
	 * 	serialize this HserviceMins800
	 */
   protected void serializeHserviceMins800(char[] hserviceMins800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceMins800,0,getStringValue(),beginHserviceMins800,HSERVICE_MINS_800_LEN);
       localHserviceMins800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceMins800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceMins800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceMins800() {	 
   		return (substring(getStringValue(),beginHserviceMins800,beginHserviceMins800 + HSERVICE_MINS_800_LEN));
   	}
     int localHserviceSec800Counter = -1;
     public boolean isHserviceSec800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHserviceSec800Counter != sharedCounter;
         localHserviceSec800Counter = sharedCounter; return hasModified;
     }
	protected static final int HSERVICE_SEC_800_LEN = 2;
	/**
	 * 	serialize this HserviceSec800
	 */
   protected void serializeHserviceSec800(char[] hserviceSec800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hserviceSec800,0,getStringValue(),beginHserviceSec800,HSERVICE_SEC_800_LEN);
       localHserviceSec800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHserviceSec800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHserviceSec800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHserviceSec800() {	 
   		return (substring(getStringValue(),beginHserviceSec800,beginHserviceSec800 + HSERVICE_SEC_800_LEN));
   	}




}
  
