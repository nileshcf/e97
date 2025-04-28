package com.cloudframe.app.move0.dto.serialize;

/**
*  The class Parent51Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parent51Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parent51Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARENT_51_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChild3;
            protected  int beginChild4;
	
	/**
	* Constructor for Parent51Serialized
	**/
    public Parent51Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parent51Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parent51Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parent51Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23); // serialize this field at offset 23 by default 
    }
    
	/**
	* sets parent for this Parent51Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23 by default
    }    
	/**
	* initializes the field in Parent51Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARENT_51_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginChild3 = getStartOffset() + 2;	// set offset for serialization
  
             beginChild4 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChild3Counter = -1;
     public boolean isChild3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChild3Counter != sharedCounter;
         localChild3Counter = sharedCounter; return hasModified;
     }
	protected static final int CHILD_3_LEN = 2;
	/**
	 * 	serialize this Child3
	 */
   protected void serializeChild3(char[] child3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(child3,0,getStringValue(),beginChild3,CHILD_3_LEN);
       localChild3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChild3Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshChild3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChild3() {	 
   		return (substring(getStringValue(),beginChild3,beginChild3 + CHILD_3_LEN));
   	}
     int localChild4Counter = -1;
     public boolean isChild4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChild4Counter != sharedCounter;
         localChild4Counter = sharedCounter; return hasModified;
     }
	protected static final int CHILD_4_LEN = 4;
	/**
	 * 	serialize this Child4
	 */
   protected void serializeChild4(char[] child4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(child4,0,getStringValue(),beginChild4,CHILD_4_LEN);
       localChild4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChild4Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshChild4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChild4() {	 
   		return (substring(getStringValue(),beginChild4,beginChild4 + CHILD_4_LEN));
   	}




}
  
