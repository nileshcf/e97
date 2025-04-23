package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class FuncCurrDate800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FuncCurrDate800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FuncCurrDate800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FUNC_CURR_DATE_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrDateYyyy800;
            protected  int beginCurrDateMm800;
            protected  int beginCurrDateDd800;
	
	/**
	* Constructor for FuncCurrDate800Serialized
	**/
    public FuncCurrDate800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FuncCurrDate800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FuncCurrDate800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FuncCurrDate800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this FuncCurrDate800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in FuncCurrDate800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FUNC_CURR_DATE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrDateYyyy800 = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrDateMm800 = getStartOffset() + 4;	// set offset for serialization
  
             beginCurrDateDd800 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrDateYyyy800Counter = -1;
     public boolean isCurrDateYyyy800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateYyyy800Counter != sharedCounter;
         localCurrDateYyyy800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_DATE_YYYY_800_LEN = 4;
	/**
	 * 	serialize this CurrDateYyyy800
	 */
   protected void serializeCurrDateYyyy800(char[] currDateYyyy800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currDateYyyy800,0,getStringValue(),beginCurrDateYyyy800,CURR_DATE_YYYY_800_LEN);
       localCurrDateYyyy800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrDateYyyy800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCurrDateYyyy800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrDateYyyy800() {	 
   		return (substring(getStringValue(),beginCurrDateYyyy800,beginCurrDateYyyy800 + CURR_DATE_YYYY_800_LEN));
   	}
     int localCurrDateMm800Counter = -1;
     public boolean isCurrDateMm800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateMm800Counter != sharedCounter;
         localCurrDateMm800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_DATE_MM_800_LEN = 2;
	/**
	 * 	serialize this CurrDateMm800
	 */
   protected void serializeCurrDateMm800(char[] currDateMm800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currDateMm800,0,getStringValue(),beginCurrDateMm800,CURR_DATE_MM_800_LEN);
       localCurrDateMm800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrDateMm800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrDateMm800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrDateMm800() {	 
   		return (substring(getStringValue(),beginCurrDateMm800,beginCurrDateMm800 + CURR_DATE_MM_800_LEN));
   	}
     int localCurrDateDd800Counter = -1;
     public boolean isCurrDateDd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrDateDd800Counter != sharedCounter;
         localCurrDateDd800Counter = sharedCounter; return hasModified;
     }
	protected static final int CURR_DATE_DD_800_LEN = 2;
	/**
	 * 	serialize this CurrDateDd800
	 */
   protected void serializeCurrDateDd800(char[] currDateDd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currDateDd800,0,getStringValue(),beginCurrDateDd800,CURR_DATE_DD_800_LEN);
       localCurrDateDd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrDateDd800Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrDateDd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrDateDd800() {	 
   		return (substring(getStringValue(),beginCurrDateDd800,beginCurrDateDd800 + CURR_DATE_DD_800_LEN));
   	}




}
  
