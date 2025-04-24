package com.cloudframe.app.vsammon1.dto.serialize;

/**
*  The class ProgramDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProgramDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProgramDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROGRAM_DATA_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIProgram;
	
	/**
	* Constructor for ProgramDataSerialized
	**/
    public ProgramDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProgramDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProgramDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this ProgramDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in ProgramDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROGRAM_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIProgram = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIProgramCounter = -1;
     public boolean isIProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIProgramCounter != sharedCounter;
         localIProgramCounter = sharedCounter; return hasModified;
     }
	protected static final int I_PROGRAM_LEN = 8;
	/**
	 * 	serialize this IProgram
	 */
   protected void serializeIProgram(char[] iProgram) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iProgram,0,getStringValue(),beginIProgram,I_PROGRAM_LEN);
       localIProgramCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshIProgram is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIProgram() {	 
   		return (substring(getStringValue(),beginIProgram,beginIProgram + I_PROGRAM_LEN));
   	}




}
  
