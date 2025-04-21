package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class AS219Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AS219Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AS219Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_S_219_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginASFld1219;
            protected  int beginASFld2219;
	
	/**
	* Constructor for AS219Serialized
	**/
    public AS219Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AS219Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_S_219_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginASFld1219 = getStartOffset() + 0;	// set offset for serialization
  
             beginASFld2219 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localASFld1219Counter = -1;
     public boolean isASFld1219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld1219Counter != sharedCounter;
         localASFld1219Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_1219_LEN = 30;
	/**
	 * 	serialize this ASFld1219
	 */
   protected void serializeASFld1219(char[] aSFld1219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld1219,0,getStringValue(),beginASFld1219,A_SFLD_1219_LEN);
       localASFld1219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld1219Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshASFld1219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld1219() {	 
   		return (substring(getStringValue(),beginASFld1219,beginASFld1219 + A_SFLD_1219_LEN));
   	}
     int localASFld2219Counter = -1;
     public boolean isASFld2219Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localASFld2219Counter != sharedCounter;
         localASFld2219Counter = sharedCounter; return hasModified;
     }
	protected static final int A_SFLD_2219_LEN = 40;
	/**
	 * 	serialize this ASFld2219
	 */
   protected void serializeASFld2219(char[] aSFld2219) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aSFld2219,0,getStringValue(),beginASFld2219,A_SFLD_2219_LEN);
       localASFld2219Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkASFld2219Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshASFld2219 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshASFld2219() {	 
   		return (substring(getStringValue(),beginASFld2219,beginASFld2219 + A_SFLD_2219_LEN));
   	}




}
  
