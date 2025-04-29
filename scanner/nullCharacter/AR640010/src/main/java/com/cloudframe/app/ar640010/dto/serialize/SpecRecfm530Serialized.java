package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SpecRecfm530Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SpecRecfm530Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SpecRecfm530Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SPEC_RECFM_530_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected int beginSpecTable530ConditionGroup4;
	
	/**
	* Constructor for SpecRecfm530Serialized
	**/
    public SpecRecfm530Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SpecRecfm530Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SpecRecfm530Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SpecRecfm530Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,64); // serialize this field at offset 64 by default 
    }
    
	/**
	* sets parent for this SpecRecfm530Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 64 by default
    }    
	/**
	* initializes the field in SpecRecfm530Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SPEC_RECFM_530_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
                beginSpecTable530ConditionGroup4 = getStartOffset() + 0;	// filler with 88
  
  
	   /*  end of offset */
	}
     int localSpecTable530ConditionGroup4Counter = -1;
     public boolean isSpecTable530ConditionGroup4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSpecTable530ConditionGroup4Counter != sharedCounter;
         localSpecTable530ConditionGroup4Counter = sharedCounter; return hasModified;
     }
	protected static final int SPEC_TABLE_530_CONDITION_GROUP_4_LEN = 1;
	/**
	 * 	serialize this SpecTable530ConditionGroup4
	 */
   protected void serializeSpecTable530ConditionGroup4(char[] specTable530ConditionGroup4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(specTable530ConditionGroup4,0,getStringValue(),beginSpecTable530ConditionGroup4,SPEC_TABLE_530_CONDITION_GROUP_4_LEN);
       localSpecTable530ConditionGroup4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSpecTable530ConditionGroup4Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSpecTable530ConditionGroup4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSpecTable530ConditionGroup4() {	 
   		return (substring(getStringValue(),beginSpecTable530ConditionGroup4,beginSpecTable530ConditionGroup4 + SPEC_TABLE_530_CONDITION_GROUP_4_LEN));
   	}




}
  
