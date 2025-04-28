package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse25aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse25aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse25aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_25A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse25aTFld1;
            protected  int beginWse25aTFld2;
	
	/**
	* Constructor for Wse25aTSerialized
	**/
    public Wse25aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse25aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_25A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse25aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse25aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse25aTFld1Counter = -1;
     public boolean isWse25aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25aTFld1Counter != sharedCounter;
         localWse25aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse25aTFld1
	 */
   protected void serializeWse25aTFld1(char[] wse25aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25aTFld1,0,getStringValue(),beginWse25aTFld1,WSE_25A_TFLD_1_LEN);
       localWse25aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse25aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25aTFld1() {	 
   		return (substring(getStringValue(),beginWse25aTFld1,beginWse25aTFld1 + WSE_25A_TFLD_1_LEN));
   	}
     int localWse25aTFld2Counter = -1;
     public boolean isWse25aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25aTFld2Counter != sharedCounter;
         localWse25aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse25aTFld2
	 */
   protected void serializeWse25aTFld2(char[] wse25aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25aTFld2,0,getStringValue(),beginWse25aTFld2,WSE_25A_TFLD_2_LEN);
       localWse25aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse25aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25aTFld2() {	 
   		return (substring(getStringValue(),beginWse25aTFld2,beginWse25aTFld2 + WSE_25A_TFLD_2_LEN));
   	}




}
  
