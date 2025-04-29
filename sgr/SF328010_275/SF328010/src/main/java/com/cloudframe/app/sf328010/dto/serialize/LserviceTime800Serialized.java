package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class LserviceTime800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LserviceTime800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LserviceTime800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LSERVICE_TIME_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLserviceHh800;
            protected  int beginLserviceMins800;
            protected  int beginLserviceSec800;
	
	/**
	* Constructor for LserviceTime800Serialized
	**/
    public LserviceTime800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LserviceTime800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LserviceTime800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LserviceTime800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this LserviceTime800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in LserviceTime800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LSERVICE_TIME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLserviceHh800 = getStartOffset() + 0;	// set offset for serialization
  
             beginLserviceMins800 = getStartOffset() + 2;	// set offset for serialization
  
             beginLserviceSec800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLserviceHh800Counter = -1;
     public boolean isLserviceHh800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceHh800Counter != sharedCounter;
         localLserviceHh800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_HH_800_LEN = 2;
	/**
	 * 	serialize this LserviceHh800
	 */
   protected void serializeLserviceHh800(char[] lserviceHh800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceHh800,0,getStringValue(),beginLserviceHh800,LSERVICE_HH_800_LEN);
       localLserviceHh800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceHh800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceHh800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceHh800() {	 
   		return (substring(getStringValue(),beginLserviceHh800,beginLserviceHh800 + LSERVICE_HH_800_LEN));
   	}
     int localLserviceMins800Counter = -1;
     public boolean isLserviceMins800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceMins800Counter != sharedCounter;
         localLserviceMins800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_MINS_800_LEN = 2;
	/**
	 * 	serialize this LserviceMins800
	 */
   protected void serializeLserviceMins800(char[] lserviceMins800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceMins800,0,getStringValue(),beginLserviceMins800,LSERVICE_MINS_800_LEN);
       localLserviceMins800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceMins800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceMins800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceMins800() {	 
   		return (substring(getStringValue(),beginLserviceMins800,beginLserviceMins800 + LSERVICE_MINS_800_LEN));
   	}
     int localLserviceSec800Counter = -1;
     public boolean isLserviceSec800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLserviceSec800Counter != sharedCounter;
         localLserviceSec800Counter = sharedCounter; return hasModified;
     }
	protected static final int LSERVICE_SEC_800_LEN = 2;
	/**
	 * 	serialize this LserviceSec800
	 */
   protected void serializeLserviceSec800(char[] lserviceSec800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lserviceSec800,0,getStringValue(),beginLserviceSec800,LSERVICE_SEC_800_LEN);
       localLserviceSec800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLserviceSec800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLserviceSec800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLserviceSec800() {	 
   		return (substring(getStringValue(),beginLserviceSec800,beginLserviceSec800 + LSERVICE_SEC_800_LEN));
   	}




}
  
