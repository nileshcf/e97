package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse11bSFld1;
            protected  int beginWse11bSFld2;
	
	/**
	* Constructor for Wse11bSSerialized
	**/
    public Wse11bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse11bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse11bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse11bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse11bSFld1Counter = -1;
     public boolean isWse11bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11bSFld1Counter != sharedCounter;
         localWse11bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse11bSFld1
	 */
   protected void serializeWse11bSFld1(char[] wse11bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11bSFld1,0,getStringValue(),beginWse11bSFld1,WSE_11B_SFLD_1_LEN);
       localWse11bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11bSFld1() {	 
   		return (substring(getStringValue(),beginWse11bSFld1,beginWse11bSFld1 + WSE_11B_SFLD_1_LEN));
   	}
     int localWse11bSFld2Counter = -1;
     public boolean isWse11bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11bSFld2Counter != sharedCounter;
         localWse11bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse11bSFld2
	 */
   protected void serializeWse11bSFld2(char[] wse11bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11bSFld2,0,getStringValue(),beginWse11bSFld2,WSE_11B_SFLD_2_LEN);
       localWse11bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11bSFld2() {	 
   		return (substring(getStringValue(),beginWse11bSFld2,beginWse11bSFld2 + WSE_11B_SFLD_2_LEN));
   	}




}
  
