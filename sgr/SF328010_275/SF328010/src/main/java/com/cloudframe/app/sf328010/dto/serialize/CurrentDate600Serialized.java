package com.cloudframe.app.sf328010.dto.serialize;

/**
*  The class CurrentDate600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentDate600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentDate600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_DATE_600_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrDateYyyy600;
            protected  int beginCurrDateMm600;
            protected  int beginCurrDateDd600;
	
	/**
	* Constructor for CurrentDate600Serialized
	**/
    public CurrentDate600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentDate600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentDate600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentDate600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,30); // serialize this field at offset 30 by default 
    }
    
	/**
	* sets parent for this CurrentDate600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 30 by default
    }    
	/**
	* initializes the field in CurrentDate600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_DATE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrDateYyyy600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCurrDateMm600 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginCurrDateDd600 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrDateYyyy600Counter = -1;
     public boolean isCurrDateYyyy600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateYyyy600Counter != sharedCounter;
         localCurrDateYyyy600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_DATE_YYYY_600_LEN = 4;
	/**
	 * 	serialize this CurrDateYyyy600
	 */
   protected void serializeCurrDateYyyy600(char[] currDateYyyy600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currDateYyyy600,0,getStringValue(),beginCurrDateYyyy600,CURR_DATE_YYYY_600_LEN);
       localCurrDateYyyy600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrDateYyyy600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCurrDateYyyy600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrDateYyyy600() {	 
   		return (substring(getStringValue(),beginCurrDateYyyy600,beginCurrDateYyyy600 + CURR_DATE_YYYY_600_LEN));
   	}
     int localCurrDateMm600Counter = -1;
     public boolean isCurrDateMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateMm600Counter != sharedCounter;
         localCurrDateMm600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_DATE_MM_600_LEN = 2;
	/**
	 * 	serialize this CurrDateMm600
	 */
   protected void serializeCurrDateMm600(char[] currDateMm600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currDateMm600,0,getStringValue(),beginCurrDateMm600,CURR_DATE_MM_600_LEN);
       localCurrDateMm600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrDateMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrDateMm600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrDateMm600() {	 
   		return (substring(getStringValue(),beginCurrDateMm600,beginCurrDateMm600 + CURR_DATE_MM_600_LEN));
   	}
     int localCurrDateDd600Counter = -1;
     public boolean isCurrDateDd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateDd600Counter != sharedCounter;
         localCurrDateDd600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_DATE_DD_600_LEN = 2;
	/**
	 * 	serialize this CurrDateDd600
	 */
   protected void serializeCurrDateDd600(char[] currDateDd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currDateDd600,0,getStringValue(),beginCurrDateDd600,CURR_DATE_DD_600_LEN);
       localCurrDateDd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrDateDd600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrDateDd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrDateDd600() {	 
   		return (substring(getStringValue(),beginCurrDateDd600,beginCurrDateDd600 + CURR_DATE_DD_600_LEN));
   	}




}
  
