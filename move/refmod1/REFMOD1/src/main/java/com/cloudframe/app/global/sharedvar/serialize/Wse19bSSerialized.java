package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse19bSFld1;
            protected  int beginWse19bSFld2;
	
	/**
	* Constructor for Wse19bSSerialized
	**/
    public Wse19bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse19bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse19bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse19bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse19bSFld1Counter = -1;
     public boolean isWse19bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19bSFld1Counter != sharedCounter;
         localWse19bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse19bSFld1
	 */
   protected void serializeWse19bSFld1(char[] wse19bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19bSFld1,0,getStringValue(),beginWse19bSFld1,WSE_19B_SFLD_1_LEN);
       localWse19bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19bSFld1() {	 
   		return (substring(getStringValue(),beginWse19bSFld1,beginWse19bSFld1 + WSE_19B_SFLD_1_LEN));
   	}
     int localWse19bSFld2Counter = -1;
     public boolean isWse19bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19bSFld2Counter != sharedCounter;
         localWse19bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse19bSFld2
	 */
   protected void serializeWse19bSFld2(char[] wse19bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19bSFld2,0,getStringValue(),beginWse19bSFld2,WSE_19B_SFLD_2_LEN);
       localWse19bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19bSFld2() {	 
   		return (substring(getStringValue(),beginWse19bSFld2,beginWse19bSFld2 + WSE_19B_SFLD_2_LEN));
   	}




}
  
