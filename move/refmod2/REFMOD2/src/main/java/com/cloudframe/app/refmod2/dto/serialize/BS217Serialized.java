package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BS217Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BS217Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BS217Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_S_217_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBSFld1217;
            protected  int beginBSFld2217;
	
	/**
	* Constructor for BS217Serialized
	**/
    public BS217Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BS217Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_S_217_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBSFld1217 = getStartOffset() + 0;	// set offset for serialization
  
             beginBSFld2217 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBSFld1217Counter = -1;
     public boolean isBSFld1217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld1217Counter != sharedCounter;
         localBSFld1217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_1217_LEN = 30;
	/**
	 * 	serialize this BSFld1217
	 */
   protected void serializeBSFld1217(char[] bSFld1217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld1217,0,getStringValue(),beginBSFld1217,B_SFLD_1217_LEN);
       localBSFld1217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld1217Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBSFld1217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld1217() {	 
   		return (substring(getStringValue(),beginBSFld1217,beginBSFld1217 + B_SFLD_1217_LEN));
   	}
     int localBSFld2217Counter = -1;
     public boolean isBSFld2217Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBSFld2217Counter != sharedCounter;
         localBSFld2217Counter = sharedCounter; return hasModified;
     }
	protected static final int B_SFLD_2217_LEN = 40;
	/**
	 * 	serialize this BSFld2217
	 */
   protected void serializeBSFld2217(char[] bSFld2217) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bSFld2217,0,getStringValue(),beginBSFld2217,B_SFLD_2217_LEN);
       localBSFld2217Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBSFld2217Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBSFld2217 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBSFld2217() {	 
   		return (substring(getStringValue(),beginBSFld2217,beginBSFld2217 + B_SFLD_2217_LEN));
   	}




}
  
