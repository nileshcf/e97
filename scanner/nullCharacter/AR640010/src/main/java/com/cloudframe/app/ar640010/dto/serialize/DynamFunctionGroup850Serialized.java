package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamFunctionGroup850Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamFunctionGroup850Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamFunctionGroup850Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_FUNCTION_GROUP_850_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamFunction850;
	
	/**
	* Constructor for DynamFunctionGroup850Serialized
	**/
    public DynamFunctionGroup850Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DynamFunctionGroup850Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamFunctionGroup850Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DynamFunctionGroup850Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this DynamFunctionGroup850Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in DynamFunctionGroup850Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_FUNCTION_GROUP_850_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDynamFunction850 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDynamFunction850Counter = -1;
     public boolean isDynamFunction850Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamFunction850Counter != sharedCounter;
         localDynamFunction850Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_FUNCTION_850_LEN = 8;
	/**
	 * 	serialize this DynamFunction850
	 */
   protected void serializeDynamFunction850(char[] dynamFunction850) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamFunction850,0,getStringValue(),beginDynamFunction850,DYNAM_FUNCTION_850_LEN);
       localDynamFunction850Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamFunction850Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshDynamFunction850 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamFunction850() {	 
   		return (substring(getStringValue(),beginDynamFunction850,beginDynamFunction850 + DYNAM_FUNCTION_850_LEN));
   	}




}
  
