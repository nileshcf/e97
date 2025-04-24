package com.cloudframe.app.usbaeext.dto.serialize;

/**
*  The class TaMonthTableRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TaMonthTableRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TaMonthTableRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TA_MONTH_TABLE_REDEFINED_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTaMonth;
	
	/**
	* Constructor for TaMonthTableRedefinedSerialized
	**/
    public TaMonthTableRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TaMonthTableRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaMonthTableRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TaMonthTableRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4103); // serialize this field at offset 4103 by default 
    }
    
	/**
	* sets parent for this TaMonthTableRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4103 by default
    }    
	/**
	* initializes the field in TaMonthTableRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TA_MONTH_TABLE_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTaMonth = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTaMonthCounter = -1;
     public boolean isTaMonthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTaMonthCounter != sharedCounter;
         localTaMonthCounter = sharedCounter; return hasModified;
     }
	protected static final int TA_MONTH_LEN = 3;
	/**
	 * 	serialize this TaMonth
	 */
   protected void serializeTaMonth(char[] taMonth) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(taMonth,0,getStringValue(),beginTaMonth,TA_MONTH_LEN);
       localTaMonthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTaMonthConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTaMonth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTaMonth() {	 
   		return (substring(getStringValue(),beginTaMonth,beginTaMonth + TA_MONTH_LEN));
   	}




}
  
