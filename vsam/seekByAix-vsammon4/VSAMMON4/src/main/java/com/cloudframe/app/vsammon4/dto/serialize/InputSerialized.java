package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class InputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInputCommand;
            protected  int beginInputData;
	
	/**
	* Constructor for InputSerialized
	**/
    public InputSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InputSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InputSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this InputSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in InputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInputCommand = getStartOffset() + 0;	// set offset for serialization
  
             beginInputData = getStartOffset() + 7;	// set offset for serialization
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localInputCommandCounter = -1;
     public boolean isInputCommandModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputCommandCounter != sharedCounter;
         localInputCommandCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_COMMAND_LEN = 7;
	/**
	 * 	serialize this InputCommand
	 */
   protected void serializeInputCommand(char[] inputCommand) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputCommand,0,getStringValue(),beginInputCommand,INPUT_COMMAND_LEN);
       localInputCommandCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputCommandConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshInputCommand is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputCommand() {	 
   		return (substring(getStringValue(),beginInputCommand,beginInputCommand + INPUT_COMMAND_LEN));
   	}
     int localInputDataCounter = -1;
     public boolean isInputDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInputDataCounter != sharedCounter;
         localInputDataCounter = sharedCounter; return hasModified;
     }
	protected static final int INPUT_DATA_LEN = 73;
	/**
	 * 	serialize this InputData
	 */
   protected void serializeInputData(char[] inputData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inputData,0,getStringValue(),beginInputData,INPUT_DATA_LEN);
       localInputDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInputDataConstraints(char[] value) {
   			return super.checkConstraints(value , 73 ,false, false);
   }
    /**
	 *	refreshInputData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInputData() {	 
   		return (substring(getStringValue(),beginInputData,beginInputData + INPUT_DATA_LEN));
   	}




}
  
