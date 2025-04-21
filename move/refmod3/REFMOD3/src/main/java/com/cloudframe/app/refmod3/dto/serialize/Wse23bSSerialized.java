package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse23bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse23bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse23bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_23B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse23bSFld1;
            protected  int beginWse23bSFld2;
	
	/**
	* Constructor for Wse23bSSerialized
	**/
    public Wse23bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse23bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_23B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse23bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse23bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse23bSFld1Counter = -1;
     public boolean isWse23bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23bSFld1Counter != sharedCounter;
         localWse23bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse23bSFld1
	 */
   protected void serializeWse23bSFld1(char[] wse23bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23bSFld1,0,getStringValue(),beginWse23bSFld1,WSE_23B_SFLD_1_LEN);
       localWse23bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse23bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23bSFld1() {	 
   		return (substring(getStringValue(),beginWse23bSFld1,beginWse23bSFld1 + WSE_23B_SFLD_1_LEN));
   	}
     int localWse23bSFld2Counter = -1;
     public boolean isWse23bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23bSFld2Counter != sharedCounter;
         localWse23bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse23bSFld2
	 */
   protected void serializeWse23bSFld2(char[] wse23bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23bSFld2,0,getStringValue(),beginWse23bSFld2,WSE_23B_SFLD_2_LEN);
       localWse23bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse23bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23bSFld2() {	 
   		return (substring(getStringValue(),beginWse23bSFld2,beginWse23bSFld2 + WSE_23B_SFLD_2_LEN));
   	}




}
  
