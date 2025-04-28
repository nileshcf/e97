package com.cloudframe.app.move0.dto.serialize;

/**
*  The class GrandParentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GrandParentSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GrandParentSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GRAND_PARENT_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParent1;
            protected  int beginParent3;
            protected  int beginParent4;
	
	/**
	* Constructor for GrandParentSerialized
	**/
    public GrandParentSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GrandParentSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GRAND_PARENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParent1 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginParent3 = getStartOffset() + 11;	// set offset for serialization
  
             beginParent4 = getStartOffset() + 21;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localParent1Counter = -1;
     public boolean isParent1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParent1Counter != sharedCounter;
         localParent1Counter = sharedCounter; return hasModified;
     }
	protected static final int PARENT_1_LEN = 10;
	/**
	 * 	serialize this Parent1
	 */
   protected void serializeParent1(char[] parent1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parent1,0,getStringValue(),beginParent1,PARENT_1_LEN);
       localParent1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParent1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshParent1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParent1() {	 
   		return (substring(getStringValue(),beginParent1,beginParent1 + PARENT_1_LEN));
   	}
     int localParent3Counter = -1;
     public boolean isParent3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParent3Counter != sharedCounter;
         localParent3Counter = sharedCounter; return hasModified;
     }
	protected static final int PARENT_3_LEN = 10;
	/**
	 * 	serialize this Parent3
	 */
   protected void serializeParent3(char[] parent3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parent3,0,getStringValue(),beginParent3,PARENT_3_LEN);
       localParent3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParent3Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshParent3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParent3() {	 
   		return (substring(getStringValue(),beginParent3,beginParent3 + PARENT_3_LEN));
   	}
     int localParent4Counter = -1;
     public boolean isParent4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParent4Counter != sharedCounter;
         localParent4Counter = sharedCounter; return hasModified;
     }
	protected static final int PARENT_4_LEN = 2;
	/**
	 * 	serialize this Parent4
	 */
   protected void serializeParent4(char[] parent4) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parent4,0,getStringValue(),beginParent4,PARENT_4_LEN);
       localParent4Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParent4Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshParent4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParent4() {	 
   		return (substring(getStringValue(),beginParent4,beginParent4 + PARENT_4_LEN));
   	}




}
  
