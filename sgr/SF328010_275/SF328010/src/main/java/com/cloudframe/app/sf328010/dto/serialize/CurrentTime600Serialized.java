package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class CurrentTime600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentTime600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentTime600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_TIME_600_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrTimeHh600;
            protected  int beginCurrTimeMm600;
            protected  int beginCurrTimeSs600;
	
	/**
	* Constructor for CurrentTime600Serialized
	**/
    public CurrentTime600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentTime600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentTime600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentTime600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,48); // serialize this field at offset 48 by default 
    }
    
	/**
	* sets parent for this CurrentTime600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 48 by default
    }    
	/**
	* initializes the field in CurrentTime600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_TIME_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrTimeHh600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCurrTimeMm600 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginCurrTimeSs600 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrTimeHh600Counter = -1;
     public boolean isCurrTimeHh600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeHh600Counter != sharedCounter;
         localCurrTimeHh600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_HH_600_LEN = 2;
	/**
	 * 	serialize this CurrTimeHh600
	 */
   protected void serializeCurrTimeHh600(char[] currTimeHh600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTimeHh600,0,getStringValue(),beginCurrTimeHh600,CURR_TIME_HH_600_LEN);
       localCurrTimeHh600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTimeHh600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrTimeHh600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTimeHh600() {	 
   		return (substring(getStringValue(),beginCurrTimeHh600,beginCurrTimeHh600 + CURR_TIME_HH_600_LEN));
   	}
     int localCurrTimeMm600Counter = -1;
     public boolean isCurrTimeMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeMm600Counter != sharedCounter;
         localCurrTimeMm600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_MM_600_LEN = 2;
	/**
	 * 	serialize this CurrTimeMm600
	 */
   protected void serializeCurrTimeMm600(char[] currTimeMm600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTimeMm600,0,getStringValue(),beginCurrTimeMm600,CURR_TIME_MM_600_LEN);
       localCurrTimeMm600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTimeMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrTimeMm600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTimeMm600() {	 
   		return (substring(getStringValue(),beginCurrTimeMm600,beginCurrTimeMm600 + CURR_TIME_MM_600_LEN));
   	}
     int localCurrTimeSs600Counter = -1;
     public boolean isCurrTimeSs600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrTimeSs600Counter != sharedCounter;
         localCurrTimeSs600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_TIME_SS_600_LEN = 2;
	/**
	 * 	serialize this CurrTimeSs600
	 */
   protected void serializeCurrTimeSs600(char[] currTimeSs600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currTimeSs600,0,getStringValue(),beginCurrTimeSs600,CURR_TIME_SS_600_LEN);
       localCurrTimeSs600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrTimeSs600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrTimeSs600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrTimeSs600() {	 
   		return (substring(getStringValue(),beginCurrTimeSs600,beginCurrTimeSs600 + CURR_TIME_SS_600_LEN));
   	}




}
  
