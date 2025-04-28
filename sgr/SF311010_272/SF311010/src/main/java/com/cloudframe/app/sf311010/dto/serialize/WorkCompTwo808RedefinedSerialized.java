package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WorkCompTwo808RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkCompTwo808RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkCompTwo808RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_COMP_TWO_808_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWorkCompOneByte808;
	
	/**
	* Constructor for WorkCompTwo808RedefinedSerialized
	**/
    public WorkCompTwo808RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WorkCompTwo808RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WorkCompTwo808RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WorkCompTwo808RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WorkCompTwo808RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WorkCompTwo808RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_COMP_TWO_808_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWorkCompOneByte808 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWorkCompOneByte808Counter = -1;
     public boolean isWorkCompOneByte808Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkCompOneByte808Counter != sharedCounter;
         localWorkCompOneByte808Counter = sharedCounter; return hasModified;
     }
	protected static final int WORK_COMP_ONE_BYTE_808_LEN = 1;
	/**
	 * 	serialize this WorkCompOneByte808
	 */
   protected void serializeWorkCompOneByte808(char[] workCompOneByte808) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(workCompOneByte808,0,getStringValue(),beginWorkCompOneByte808,WORK_COMP_ONE_BYTE_808_LEN);
       localWorkCompOneByte808Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWorkCompOneByte808Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWorkCompOneByte808 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWorkCompOneByte808() {	 
   		return (substring(getStringValue(),beginWorkCompOneByte808,beginWorkCompOneByte808 + WORK_COMP_ONE_BYTE_808_LEN));
   	}




}
  
