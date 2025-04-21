package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse17bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse17bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse17bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_17B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse17bSFld1;
            protected  int beginWse17bSFld2;
	
	/**
	* Constructor for Wse17bSSerialized
	**/
    public Wse17bSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse17bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_17B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse17bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse17bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse17bSFld1Counter = -1;
     public boolean isWse17bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17bSFld1Counter != sharedCounter;
         localWse17bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse17bSFld1
	 */
   protected void serializeWse17bSFld1(char[] wse17bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17bSFld1,0,getStringValue(),beginWse17bSFld1,WSE_17B_SFLD_1_LEN);
       localWse17bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse17bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17bSFld1() {	 
   		return (substring(getStringValue(),beginWse17bSFld1,beginWse17bSFld1 + WSE_17B_SFLD_1_LEN));
   	}
     int localWse17bSFld2Counter = -1;
     public boolean isWse17bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17bSFld2Counter != sharedCounter;
         localWse17bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse17bSFld2
	 */
   protected void serializeWse17bSFld2(char[] wse17bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17bSFld2,0,getStringValue(),beginWse17bSFld2,WSE_17B_SFLD_2_LEN);
       localWse17bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse17bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17bSFld2() {	 
   		return (substring(getStringValue(),beginWse17bSFld2,beginWse17bSFld2 + WSE_17B_SFLD_2_LEN));
   	}




}
  
