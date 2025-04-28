package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class WhenCompTime800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WhenCompTime800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WhenCompTime800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WHEN_COMP_TIME_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWhenTimeHh800;
            protected  int beginWhenTimeMm800;
            protected  int beginWhenTimeSs800;
	
	/**
	* Constructor for WhenCompTime800Serialized
	**/
    public WhenCompTime800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WhenCompTime800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WhenCompTime800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WhenCompTime800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this WhenCompTime800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in WhenCompTime800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WHEN_COMP_TIME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWhenTimeHh800 = getStartOffset() + 0;	// set offset for serialization
  
             beginWhenTimeMm800 = getStartOffset() + 2;	// set offset for serialization
  
             beginWhenTimeSs800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWhenTimeHh800Counter = -1;
     public boolean isWhenTimeHh800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWhenTimeHh800Counter != sharedCounter;
         localWhenTimeHh800Counter = sharedCounter; return hasModified;
     }
	protected static final int WHEN_TIME_HH_800_LEN = 2;
	/**
	 * 	serialize this WhenTimeHh800
	 */
   protected void serializeWhenTimeHh800(char[] whenTimeHh800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(whenTimeHh800,0,getStringValue(),beginWhenTimeHh800,WHEN_TIME_HH_800_LEN);
       localWhenTimeHh800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWhenTimeHh800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWhenTimeHh800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWhenTimeHh800() {	 
   		return (substring(getStringValue(),beginWhenTimeHh800,beginWhenTimeHh800 + WHEN_TIME_HH_800_LEN));
   	}
     int localWhenTimeMm800Counter = -1;
     public boolean isWhenTimeMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWhenTimeMm800Counter != sharedCounter;
         localWhenTimeMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int WHEN_TIME_MM_800_LEN = 2;
	/**
	 * 	serialize this WhenTimeMm800
	 */
   protected void serializeWhenTimeMm800(char[] whenTimeMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(whenTimeMm800,0,getStringValue(),beginWhenTimeMm800,WHEN_TIME_MM_800_LEN);
       localWhenTimeMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWhenTimeMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWhenTimeMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWhenTimeMm800() {	 
   		return (substring(getStringValue(),beginWhenTimeMm800,beginWhenTimeMm800 + WHEN_TIME_MM_800_LEN));
   	}
     int localWhenTimeSs800Counter = -1;
     public boolean isWhenTimeSs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWhenTimeSs800Counter != sharedCounter;
         localWhenTimeSs800Counter = sharedCounter; return hasModified;
     }
	protected static final int WHEN_TIME_SS_800_LEN = 2;
	/**
	 * 	serialize this WhenTimeSs800
	 */
   protected void serializeWhenTimeSs800(char[] whenTimeSs800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(whenTimeSs800,0,getStringValue(),beginWhenTimeSs800,WHEN_TIME_SS_800_LEN);
       localWhenTimeSs800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWhenTimeSs800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWhenTimeSs800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWhenTimeSs800() {	 
   		return (substring(getStringValue(),beginWhenTimeSs800,beginWhenTimeSs800 + WHEN_TIME_SS_800_LEN));
   	}




}
  
