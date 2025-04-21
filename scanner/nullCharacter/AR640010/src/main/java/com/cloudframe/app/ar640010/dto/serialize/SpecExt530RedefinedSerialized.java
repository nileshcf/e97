package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SpecExt530RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SpecExt530RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SpecExt530RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SPEC_EXT_530_REDEFINED_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginSpecTable530ConditionGroup2;
	
	/**
	* Constructor for SpecExt530RedefinedSerialized
	**/
    public SpecExt530RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SpecExt530RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecExt530RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SpecExt530RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,52); // serialize this field at offset 52 by default 
    }
    
	/**
	* sets parent for this SpecExt530RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 52 by default
    }    
	/**
	* initializes the field in SpecExt530RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SPEC_EXT_530_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
                beginSpecTable530ConditionGroup2 = getStartOffset() + 0;	// filler with 88
  
  
	   /*  end of offset */
	}
     int localSpecTable530ConditionGroup2Counter = -1;
     public boolean isSpecTable530ConditionGroup2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecTable530ConditionGroup2Counter != sharedCounter;
         localSpecTable530ConditionGroup2Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_TABLE_530_CONDITION_GROUP_2_LEN = 1;
	/**
	 * 	serialize this SpecTable530ConditionGroup2
	 */
   protected void serializeSpecTable530ConditionGroup2(char[] specTable530ConditionGroup2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specTable530ConditionGroup2,0,getStringValue(),beginSpecTable530ConditionGroup2,SPEC_TABLE_530_CONDITION_GROUP_2_LEN);
       localSpecTable530ConditionGroup2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecTable530ConditionGroup2Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSpecTable530ConditionGroup2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecTable530ConditionGroup2() {	 
   		return (substring(getStringValue(),beginSpecTable530ConditionGroup2,beginSpecTable530ConditionGroup2 + SPEC_TABLE_530_CONDITION_GROUP_2_LEN));
   	}




}
  
