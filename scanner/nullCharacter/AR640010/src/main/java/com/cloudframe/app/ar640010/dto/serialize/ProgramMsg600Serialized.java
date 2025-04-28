package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ProgramMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProgramMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProgramMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROGRAM_MSG_600_LENGTH = 36;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProgramVersion600;
	
	/**
	* Constructor for ProgramMsg600Serialized
	**/
    public ProgramMsg600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProgramMsg600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProgramMsg600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProgramMsg600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,241); // serialize this field at offset 241 by default 
    }
    
	/**
	* sets parent for this ProgramMsg600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 241 by default
    }    
	/**
	* initializes the field in ProgramMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROGRAM_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginProgramVersion600 = getStartOffset() + 33;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localProgramVersion600Counter = -1;
     public boolean isProgramVersion600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProgramVersion600Counter != sharedCounter;
         localProgramVersion600Counter = sharedCounter; return hasModified;
     }
	protected static final int PROGRAM_VERSION_600_LEN = 3;
	/**
	 * 	serialize this ProgramVersion600
	 */
   protected void serializeProgramVersion600(char[] programVersion600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(programVersion600,0,getStringValue(),beginProgramVersion600,PROGRAM_VERSION_600_LEN);
       localProgramVersion600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProgramVersion600Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshProgramVersion600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProgramVersion600() {	 
   		return (substring(getStringValue(),beginProgramVersion600,beginProgramVersion600 + PROGRAM_VERSION_600_LEN));
   	}




}
  
