package com.cloudframe.app.move0.dto.serialize;

/**
*  The class Parent2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parent2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parent2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARENT_2_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChild1;
	
	/**
	* Constructor for Parent2Serialized
	**/
    public Parent2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parent2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parent2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,10); // serialize this field at offset 10 by default 
    }
    
	/**
	* sets parent for this Parent2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 10 by default
    }    
	/**
	* initializes the field in Parent2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARENT_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChild1 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChild1Counter = -1;
     public boolean isChild1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChild1Counter != sharedCounter;
         localChild1Counter = sharedCounter; return hasModified;
     }
	protected static final int CHILD_1_LEN = 1;
	/**
	 * 	serialize this Child1
	 */
   protected void serializeChild1(char[] child1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(child1,0,getStringValue(),beginChild1,CHILD_1_LEN);
       localChild1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChild1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshChild1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChild1() {	 
   		return (substring(getStringValue(),beginChild1,beginChild1 + CHILD_1_LEN));
   	}




}
  
