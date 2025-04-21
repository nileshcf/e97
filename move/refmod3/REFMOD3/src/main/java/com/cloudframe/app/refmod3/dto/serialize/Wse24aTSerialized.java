package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse24aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse24aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse24aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_24A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse24aTFld1;
            protected  int beginWse24aTFld2;
	
	/**
	* Constructor for Wse24aTSerialized
	**/
    public Wse24aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse24aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_24A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse24aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse24aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse24aTFld1Counter = -1;
     public boolean isWse24aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24aTFld1Counter != sharedCounter;
         localWse24aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_24A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse24aTFld1
	 */
   protected void serializeWse24aTFld1(char[] wse24aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse24aTFld1,0,getStringValue(),beginWse24aTFld1,WSE_24A_TFLD_1_LEN);
       localWse24aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse24aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse24aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse24aTFld1() {	 
   		return (substring(getStringValue(),beginWse24aTFld1,beginWse24aTFld1 + WSE_24A_TFLD_1_LEN));
   	}
     int localWse24aTFld2Counter = -1;
     public boolean isWse24aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24aTFld2Counter != sharedCounter;
         localWse24aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_24A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse24aTFld2
	 */
   protected void serializeWse24aTFld2(char[] wse24aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse24aTFld2,0,getStringValue(),beginWse24aTFld2,WSE_24A_TFLD_2_LEN);
       localWse24aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse24aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse24aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse24aTFld2() {	 
   		return (substring(getStringValue(),beginWse24aTFld2,beginWse24aTFld2 + WSE_24A_TFLD_2_LEN));
   	}




}
  
