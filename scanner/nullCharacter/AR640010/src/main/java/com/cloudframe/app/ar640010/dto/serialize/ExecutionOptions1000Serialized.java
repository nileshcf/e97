package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ExecutionOptions1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ExecutionOptions1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ExecutionOptions1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EXECUTION_OPTIONS_1000_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDisplayOption1000;
            protected  int beginDoNothingOption1000;
            protected  int beginDsnLengthOption1000;
	
	/**
	* Constructor for ExecutionOptions1000Serialized
	**/
    public ExecutionOptions1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ExecutionOptions1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExecutionOptions1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ExecutionOptions1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20); // serialize this field at offset 20 by default 
    }
    
	/**
	* sets parent for this ExecutionOptions1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20 by default
    }    
	/**
	* initializes the field in ExecutionOptions1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EXECUTION_OPTIONS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDisplayOption1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginDoNothingOption1000 = getStartOffset() + 1;	// set offset for serialization
  
             beginDsnLengthOption1000 = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDisplayOption1000Counter = -1;
     public boolean isDisplayOption1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDisplayOption1000Counter != sharedCounter;
         localDisplayOption1000Counter = sharedCounter; return hasModified;
     }
	protected static final int DISPLAY_OPTION_1000_LEN = 1;
	/**
	 * 	serialize this DisplayOption1000
	 */
   protected void serializeDisplayOption1000(char[] displayOption1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(displayOption1000,0,getStringValue(),beginDisplayOption1000,DISPLAY_OPTION_1000_LEN);
       localDisplayOption1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDisplayOption1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDisplayOption1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDisplayOption1000() {	 
   		return (substring(getStringValue(),beginDisplayOption1000,beginDisplayOption1000 + DISPLAY_OPTION_1000_LEN));
   	}
     int localDoNothingOption1000Counter = -1;
     public boolean isDoNothingOption1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDoNothingOption1000Counter != sharedCounter;
         localDoNothingOption1000Counter = sharedCounter; return hasModified;
     }
	protected static final int DO_NOTHING_OPTION_1000_LEN = 1;
	/**
	 * 	serialize this DoNothingOption1000
	 */
   protected void serializeDoNothingOption1000(char[] doNothingOption1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(doNothingOption1000,0,getStringValue(),beginDoNothingOption1000,DO_NOTHING_OPTION_1000_LEN);
       localDoNothingOption1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDoNothingOption1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDoNothingOption1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDoNothingOption1000() {	 
   		return (substring(getStringValue(),beginDoNothingOption1000,beginDoNothingOption1000 + DO_NOTHING_OPTION_1000_LEN));
   	}
     int localDsnLengthOption1000Counter = -1;
     public boolean isDsnLengthOption1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDsnLengthOption1000Counter != sharedCounter;
         localDsnLengthOption1000Counter = sharedCounter; return hasModified;
     }
	protected static final int DSN_LENGTH_OPTION_1000_LEN = 1;
	/**
	 * 	serialize this DsnLengthOption1000
	 */
   protected void serializeDsnLengthOption1000(char[] dsnLengthOption1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dsnLengthOption1000,0,getStringValue(),beginDsnLengthOption1000,DSN_LENGTH_OPTION_1000_LEN);
       localDsnLengthOption1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDsnLengthOption1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDsnLengthOption1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDsnLengthOption1000() {	 
   		return (substring(getStringValue(),beginDsnLengthOption1000,beginDsnLengthOption1000 + DSN_LENGTH_OPTION_1000_LEN));
   	}




}
  
