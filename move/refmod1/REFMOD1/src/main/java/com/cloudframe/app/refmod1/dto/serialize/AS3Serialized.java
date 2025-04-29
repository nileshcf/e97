package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class AS3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_3_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld13;
            protected  int beginASFld23;
	
	/**
	* Constructor for AS3Serialized
	**/
    public AS3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld13 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld23 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld13Counter = -1;
     public boolean isASFld13Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld13Counter != sharedCounter;
         localASFld13Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_13_LEN = 30;
	/**
	 * 	serialize this ASFld13
	 */
   protected void serializeASFld13(char[] aSFld13) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld13,0,getStringValue(),beginASFld13,A_SFLD_13_LEN);
       localASFld13Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld13Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld13 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld13() {	 
   		return (substring(getStringValue(),beginASFld13,beginASFld13 + A_SFLD_13_LEN));
   	}
     int localASFld23Counter = -1;
     public boolean isASFld23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld23Counter != sharedCounter;
         localASFld23Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_23_LEN = 40;
	/**
	 * 	serialize this ASFld23
	 */
   protected void serializeASFld23(char[] aSFld23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld23,0,getStringValue(),beginASFld23,A_SFLD_23_LEN);
       localASFld23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld23Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld23() {	 
   		return (substring(getStringValue(),beginASFld23,beginASFld23 + A_SFLD_23_LEN));
   	}




}
  
