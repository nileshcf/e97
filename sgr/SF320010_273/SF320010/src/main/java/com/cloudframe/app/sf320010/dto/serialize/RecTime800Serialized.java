package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RecTime800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RecTime800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RecTime800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int REC_TIME_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRecTimeHh800;
            protected  int beginRecTimeMm800;
            protected  int beginRecTimeSs800;
	
	/**
	* Constructor for RecTime800Serialized
	**/
    public RecTime800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RecTime800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RecTime800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RecTime800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,11); // serialize this field at offset 11 by default 
    }
    
	/**
	* sets parent for this RecTime800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 11 by default
    }    
	/**
	* initializes the field in RecTime800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(REC_TIME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRecTimeHh800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginRecTimeMm800 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginRecTimeSs800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRecTimeHh800Counter = -1;
     public boolean isRecTimeHh800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecTimeHh800Counter != sharedCounter;
         localRecTimeHh800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_TIME_HH_800_LEN = 2;
	/**
	 * 	serialize this RecTimeHh800
	 */
   protected void serializeRecTimeHh800(char[] recTimeHh800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recTimeHh800,0,getStringValue(),beginRecTimeHh800,REC_TIME_HH_800_LEN);
       localRecTimeHh800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecTimeHh800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecTimeHh800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecTimeHh800() {	 
   		return (substring(getStringValue(),beginRecTimeHh800,beginRecTimeHh800 + REC_TIME_HH_800_LEN));
   	}
     int localRecTimeMm800Counter = -1;
     public boolean isRecTimeMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecTimeMm800Counter != sharedCounter;
         localRecTimeMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_TIME_MM_800_LEN = 2;
	/**
	 * 	serialize this RecTimeMm800
	 */
   protected void serializeRecTimeMm800(char[] recTimeMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recTimeMm800,0,getStringValue(),beginRecTimeMm800,REC_TIME_MM_800_LEN);
       localRecTimeMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecTimeMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecTimeMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecTimeMm800() {	 
   		return (substring(getStringValue(),beginRecTimeMm800,beginRecTimeMm800 + REC_TIME_MM_800_LEN));
   	}
     int localRecTimeSs800Counter = -1;
     public boolean isRecTimeSs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecTimeSs800Counter != sharedCounter;
         localRecTimeSs800Counter = sharedCounter; return hasModified;
     }
	protected static final int REC_TIME_SS_800_LEN = 2;
	/**
	 * 	serialize this RecTimeSs800
	 */
   protected void serializeRecTimeSs800(char[] recTimeSs800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recTimeSs800,0,getStringValue(),beginRecTimeSs800,REC_TIME_SS_800_LEN);
       localRecTimeSs800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecTimeSs800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRecTimeSs800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecTimeSs800() {	 
   		return (substring(getStringValue(),beginRecTimeSs800,beginRecTimeSs800 + REC_TIME_SS_800_LEN));
   	}




}
  
