package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultReason603Redefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultReason603Redefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultReason603Redefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_REASON_603_REDEFINED_01_LENGTH = 29;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResultApplExit603;
	
	/**
	* Constructor for ResultReason603Redefined01Serialized
	**/
    public ResultReason603Redefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ResultReason603Redefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultReason603Redefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ResultReason603Redefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,9); // serialize this field at offset 9 by default 
    }
    
	/**
	* sets parent for this ResultReason603Redefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 9 by default
    }    
	/**
	* initializes the field in ResultReason603Redefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_REASON_603_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginResultApplExit603 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localResultApplExit603Counter = -1;
     public boolean isResultApplExit603Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultApplExit603Counter != sharedCounter;
         localResultApplExit603Counter = sharedCounter; return hasModified;
     }
	protected static final int RESULT_APPL_EXIT_603_LEN = 8;
	/**
	 * 	serialize this ResultApplExit603
	 */
   protected void serializeResultApplExit603(char[] resultApplExit603) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(resultApplExit603,0,getStringValue(),beginResultApplExit603,RESULT_APPL_EXIT_603_LEN);
       localResultApplExit603Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResultApplExit603Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshResultApplExit603 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResultApplExit603() {	 
   		return (substring(getStringValue(),beginResultApplExit603,beginResultApplExit603 + RESULT_APPL_EXIT_603_LEN));
   	}




}
  
