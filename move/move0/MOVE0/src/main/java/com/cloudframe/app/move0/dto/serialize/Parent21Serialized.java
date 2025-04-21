package com.cloudframe.app.move0.dto.serialize;

/**
*  The class Parent21Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parent21Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parent21Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARENT_21_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChild11;
	
	/**
	* Constructor for Parent21Serialized
	**/
    public Parent21Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parent21Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent21Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parent21Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this Parent21Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in Parent21Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARENT_21_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChild11 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChild11Counter = -1;
     public boolean isChild11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChild11Counter != sharedCounter;
         localChild11Counter = sharedCounter; return hasModified;
     }
	protected static final int CHILD_11_LEN = 1;
	/**
	 * 	serialize this Child11
	 */
   protected void serializeChild11(char[] child11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(child11,0,getStringValue(),beginChild11,CHILD_11_LEN);
       localChild11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChild11Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshChild11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChild11() {	 
   		return (substring(getStringValue(),beginChild11,beginChild11 + CHILD_11_LEN));
   	}




}
  
