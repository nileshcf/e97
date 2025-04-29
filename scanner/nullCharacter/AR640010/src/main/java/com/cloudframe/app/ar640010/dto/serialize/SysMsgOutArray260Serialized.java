package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SysMsgOutArray260Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SysMsgOutArray260Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SysMsgOutArray260Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_MSG_OUT_ARRAY_260_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSysMsgOut260;
	
	/**
	* Constructor for SysMsgOutArray260Serialized
	**/
    public SysMsgOutArray260Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SysMsgOutArray260Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SysMsgOutArray260Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SysMsgOutArray260Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SysMsgOutArray260Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SysMsgOutArray260Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_MSG_OUT_ARRAY_260_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSysMsgOut260 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSysMsgOut260Counter = -1;
     public boolean isSysMsgOut260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSysMsgOut260Counter != sharedCounter;
         localSysMsgOut260Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_MSG_OUT_260_LEN = 80;
	/**
	 * 	serialize this SysMsgOut260
	 */
   protected void serializeSysMsgOut260(char[] sysMsgOut260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sysMsgOut260,0,getStringValue(),beginSysMsgOut260,SYS_MSG_OUT_260_LEN);
       localSysMsgOut260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSysMsgOut260Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshSysMsgOut260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSysMsgOut260() {	 
   		return (substring(getStringValue(),beginSysMsgOut260,beginSysMsgOut260 + SYS_MSG_OUT_260_LEN));
   	}




}
  
