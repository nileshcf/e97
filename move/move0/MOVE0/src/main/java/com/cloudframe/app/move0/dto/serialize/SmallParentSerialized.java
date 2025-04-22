package com.cloudframe.app.move0.dto.serialize;

/**
*  The class SmallParentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SmallParentSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SmallParentSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SMALL_PARENT_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParent11;
            protected  int beginParent31;
	
	/**
	* Constructor for SmallParentSerialized
	**/
    public SmallParentSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SmallParentSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SMALL_PARENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParent11 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginParent31 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParent11Counter = -1;
     public boolean isParent11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParent11Counter != sharedCounter;
         localParent11Counter = sharedCounter; return hasModified;
     }
	protected static final int PARENT_11_LEN = 10;
	/**
	 * 	serialize this Parent11
	 */
   protected void serializeParent11(char[] parent11) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parent11,0,getStringValue(),beginParent11,PARENT_11_LEN);
       localParent11Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParent11Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshParent11 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParent11() {	 
   		return (substring(getStringValue(),beginParent11,beginParent11 + PARENT_11_LEN));
   	}
     int localParent31Counter = -1;
     public boolean isParent31Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParent31Counter != sharedCounter;
         localParent31Counter = sharedCounter; return hasModified;
     }
	protected static final int PARENT_31_LEN = 10;
	/**
	 * 	serialize this Parent31
	 */
   protected void serializeParent31(char[] parent31) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parent31,0,getStringValue(),beginParent31,PARENT_31_LEN);
       localParent31Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParent31Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshParent31 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParent31() {	 
   		return (substring(getStringValue(),beginParent31,beginParent31 + PARENT_31_LEN));
   	}




}
  
