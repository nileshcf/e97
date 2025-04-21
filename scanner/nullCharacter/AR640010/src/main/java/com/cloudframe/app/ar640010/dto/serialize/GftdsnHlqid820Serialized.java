package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class GftdsnHlqid820Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GftdsnHlqid820Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GftdsnHlqid820Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GFTDSN_HLQID_820_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginGftdsnWorkAreas820ConditionGroup2;
	
	/**
	* Constructor for GftdsnHlqid820Serialized
	**/
    public GftdsnHlqid820Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for GftdsnHlqid820Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GftdsnHlqid820Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this GftdsnHlqid820Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this GftdsnHlqid820Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in GftdsnHlqid820Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GFTDSN_HLQID_820_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
                beginGftdsnWorkAreas820ConditionGroup2 = getStartOffset() + 3;	// filler with 88
  
	   /*  end of offset */
	}
     int localGftdsnWorkAreas820ConditionGroup2Counter = -1;
     public boolean isGftdsnWorkAreas820ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftdsnWorkAreas820ConditionGroup2Counter != sharedCounter;
         localGftdsnWorkAreas820ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int GFTDSN_WORK_AREAS_820_CONDITION_GROUP_2_LEN = 1;
	/**
	 * 	serialize this GftdsnWorkAreas820ConditionGroup2
	 */
   protected void serializeGftdsnWorkAreas820ConditionGroup2(char[] gftdsnWorkAreas820ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftdsnWorkAreas820ConditionGroup2,0,getStringValue(),beginGftdsnWorkAreas820ConditionGroup2,GFTDSN_WORK_AREAS_820_CONDITION_GROUP_2_LEN);
       localGftdsnWorkAreas820ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftdsnWorkAreas820ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshGftdsnWorkAreas820ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftdsnWorkAreas820ConditionGroup2() {	 
   		return (substring(getStringValue(),beginGftdsnWorkAreas820ConditionGroup2,beginGftdsnWorkAreas820ConditionGroup2 + GFTDSN_WORK_AREAS_820_CONDITION_GROUP_2_LEN));
   	}




}
  
