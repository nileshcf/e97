package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class FuncCurrTime800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FuncCurrTime800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FuncCurrTime800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNC_CURR_TIME_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrTimeHh800;
            protected  int beginCurrTimeMm800;
            protected  int beginCurrTimeSs800;
	
	/**
	* Constructor for FuncCurrTime800Serialized
	**/
    public FuncCurrTime800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FuncCurrTime800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FuncCurrTime800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FuncCurrTime800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this FuncCurrTime800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in FuncCurrTime800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNC_CURR_TIME_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrTimeHh800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrTimeMm800 = getStartOffset() + 2;	// set offset for serialization
  
             beginCurrTimeSs800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrTimeHh800Counter = -1;
     public boolean isCurrTimeHh800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeHh800Counter != sharedCounter;
         localCurrTimeHh800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_HH_800_LEN = 2;
	/**
	 * 	serialize this CurrTimeHh800
	 */
   protected void serializeCurrTimeHh800(char[] currTimeHh800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTimeHh800,0,getStringValue(),beginCurrTimeHh800,CURR_TIME_HH_800_LEN);
       localCurrTimeHh800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTimeHh800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrTimeHh800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTimeHh800() {	 
   		return (substring(getStringValue(),beginCurrTimeHh800,beginCurrTimeHh800 + CURR_TIME_HH_800_LEN));
   	}
     int localCurrTimeMm800Counter = -1;
     public boolean isCurrTimeMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeMm800Counter != sharedCounter;
         localCurrTimeMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_MM_800_LEN = 2;
	/**
	 * 	serialize this CurrTimeMm800
	 */
   protected void serializeCurrTimeMm800(char[] currTimeMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTimeMm800,0,getStringValue(),beginCurrTimeMm800,CURR_TIME_MM_800_LEN);
       localCurrTimeMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTimeMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrTimeMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTimeMm800() {	 
   		return (substring(getStringValue(),beginCurrTimeMm800,beginCurrTimeMm800 + CURR_TIME_MM_800_LEN));
   	}
     int localCurrTimeSs800Counter = -1;
     public boolean isCurrTimeSs800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeSs800Counter != sharedCounter;
         localCurrTimeSs800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_SS_800_LEN = 2;
	/**
	 * 	serialize this CurrTimeSs800
	 */
   protected void serializeCurrTimeSs800(char[] currTimeSs800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTimeSs800,0,getStringValue(),beginCurrTimeSs800,CURR_TIME_SS_800_LEN);
       localCurrTimeSs800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTimeSs800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrTimeSs800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTimeSs800() {	 
   		return (substring(getStringValue(),beginCurrTimeSs800,beginCurrTimeSs800 + CURR_TIME_SS_800_LEN));
   	}




}
  
