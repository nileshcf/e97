package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse1bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse1bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse1bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_1B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse1bSFld1;
            protected  int beginWse1bSFld2;
	
	/**
	* Constructor for Wse1bSSerialized
	**/
    public Wse1bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse1bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_1B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse1bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse1bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse1bSFld1Counter = -1;
     public boolean isWse1bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1bSFld1Counter != sharedCounter;
         localWse1bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse1bSFld1
	 */
   protected void serializeWse1bSFld1(char[] wse1bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1bSFld1,0,getStringValue(),beginWse1bSFld1,WSE_1B_SFLD_1_LEN);
       localWse1bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse1bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1bSFld1() {	 
   		return (substring(getStringValue(),beginWse1bSFld1,beginWse1bSFld1 + WSE_1B_SFLD_1_LEN));
   	}
     int localWse1bSFld2Counter = -1;
     public boolean isWse1bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1bSFld2Counter != sharedCounter;
         localWse1bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse1bSFld2
	 */
   protected void serializeWse1bSFld2(char[] wse1bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1bSFld2,0,getStringValue(),beginWse1bSFld2,WSE_1B_SFLD_2_LEN);
       localWse1bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse1bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1bSFld2() {	 
   		return (substring(getStringValue(),beginWse1bSFld2,beginWse1bSFld2 + WSE_1B_SFLD_2_LEN));
   	}




}
  
