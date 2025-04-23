package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class DaysInMoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DaysInMoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DaysInMoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DAYS_IN_MO_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDaysActive;
	
	/**
	* Constructor for DaysInMoSerialized
	**/
    public DaysInMoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DaysInMoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DaysInMoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DaysInMoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this DaysInMoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in DaysInMoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DAYS_IN_MO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDaysActive = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDaysActiveCounter = -1;
     public boolean isDaysActiveModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaysActiveCounter != sharedCounter;
         localDaysActiveCounter = sharedCounter; return hasModified;
     }
	protected static final int DAYS_ACTIVE_LEN = 1;
	/**
	 * 	serialize this DaysActive
	 */
   protected void serializeDaysActive(char[] daysActive) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(daysActive,0,getStringValue(),beginDaysActive,DAYS_ACTIVE_LEN);
       localDaysActiveCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDaysActiveConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDaysActive is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDaysActive() {	 
   		return (substring(getStringValue(),beginDaysActive,beginDaysActive + DAYS_ACTIVE_LEN));
   	}




}
  
