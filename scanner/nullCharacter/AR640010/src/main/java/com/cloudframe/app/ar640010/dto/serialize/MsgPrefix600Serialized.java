package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class MsgPrefix600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgPrefix600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgPrefix600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSG_PREFIX_600_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProgramId600;
	
	/**
	* Constructor for MsgPrefix600Serialized
	**/
    public MsgPrefix600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsgPrefix600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsgPrefix600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsgPrefix600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MsgPrefix600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MsgPrefix600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSG_PREFIX_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginProgramId600 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localProgramId600Counter = -1;
     public boolean isProgramId600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProgramId600Counter != sharedCounter;
         localProgramId600Counter = sharedCounter; return hasModified;
     }
	protected static final int PROGRAM_ID_600_LEN = 8;
	/**
	 * 	serialize this ProgramId600
	 */
   protected void serializeProgramId600(char[] programId600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(programId600,0,getStringValue(),beginProgramId600,PROGRAM_ID_600_LEN);
       localProgramId600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProgramId600Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshProgramId600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProgramId600() {	 
   		return (substring(getStringValue(),beginProgramId600,beginProgramId600 + PROGRAM_ID_600_LEN));
   	}




}
  
