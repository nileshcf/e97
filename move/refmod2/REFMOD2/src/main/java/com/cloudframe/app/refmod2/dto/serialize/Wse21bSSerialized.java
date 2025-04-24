package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse21bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse21bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse21bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_21B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse21bSFld1;
            protected  int beginWse21bSFld2;
	
	/**
	* Constructor for Wse21bSSerialized
	**/
    public Wse21bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse21bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_21B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse21bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse21bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse21bSFld1Counter = -1;
     public boolean isWse21bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21bSFld1Counter != sharedCounter;
         localWse21bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse21bSFld1
	 */
   protected void serializeWse21bSFld1(char[] wse21bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21bSFld1,0,getStringValue(),beginWse21bSFld1,WSE_21B_SFLD_1_LEN);
       localWse21bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse21bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21bSFld1() {	 
   		return (substring(getStringValue(),beginWse21bSFld1,beginWse21bSFld1 + WSE_21B_SFLD_1_LEN));
   	}
     int localWse21bSFld2Counter = -1;
     public boolean isWse21bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21bSFld2Counter != sharedCounter;
         localWse21bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse21bSFld2
	 */
   protected void serializeWse21bSFld2(char[] wse21bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21bSFld2,0,getStringValue(),beginWse21bSFld2,WSE_21B_SFLD_2_LEN);
       localWse21bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse21bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21bSFld2() {	 
   		return (substring(getStringValue(),beginWse21bSFld2,beginWse21bSFld2 + WSE_21B_SFLD_2_LEN));
   	}




}
  
