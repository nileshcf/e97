package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse22aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse22aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse22aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_22A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse22aTFld1;
            protected  int beginWse22aTFld2;
	
	/**
	* Constructor for Wse22aTSerialized
	**/
    public Wse22aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse22aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_22A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse22aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse22aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse22aTFld1Counter = -1;
     public boolean isWse22aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22aTFld1Counter != sharedCounter;
         localWse22aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_22A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse22aTFld1
	 */
   protected void serializeWse22aTFld1(char[] wse22aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse22aTFld1,0,getStringValue(),beginWse22aTFld1,WSE_22A_TFLD_1_LEN);
       localWse22aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse22aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse22aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse22aTFld1() {	 
   		return (substring(getStringValue(),beginWse22aTFld1,beginWse22aTFld1 + WSE_22A_TFLD_1_LEN));
   	}
     int localWse22aTFld2Counter = -1;
     public boolean isWse22aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22aTFld2Counter != sharedCounter;
         localWse22aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_22A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse22aTFld2
	 */
   protected void serializeWse22aTFld2(char[] wse22aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse22aTFld2,0,getStringValue(),beginWse22aTFld2,WSE_22A_TFLD_2_LEN);
       localWse22aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse22aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse22aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse22aTFld2() {	 
   		return (substring(getStringValue(),beginWse22aTFld2,beginWse22aTFld2 + WSE_22A_TFLD_2_LEN));
   	}




}
  
