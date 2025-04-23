package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse21aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse21aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse21aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_21A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse21aTFld1;
            protected  int beginWse21aTFld2;
	
	/**
	* Constructor for Wse21aTSerialized
	**/
    public Wse21aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse21aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_21A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse21aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse21aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse21aTFld1Counter = -1;
     public boolean isWse21aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21aTFld1Counter != sharedCounter;
         localWse21aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse21aTFld1
	 */
   protected void serializeWse21aTFld1(char[] wse21aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21aTFld1,0,getStringValue(),beginWse21aTFld1,WSE_21A_TFLD_1_LEN);
       localWse21aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse21aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21aTFld1() {	 
   		return (substring(getStringValue(),beginWse21aTFld1,beginWse21aTFld1 + WSE_21A_TFLD_1_LEN));
   	}
     int localWse21aTFld2Counter = -1;
     public boolean isWse21aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21aTFld2Counter != sharedCounter;
         localWse21aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse21aTFld2
	 */
   protected void serializeWse21aTFld2(char[] wse21aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21aTFld2,0,getStringValue(),beginWse21aTFld2,WSE_21A_TFLD_2_LEN);
       localWse21aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse21aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21aTFld2() {	 
   		return (substring(getStringValue(),beginWse21aTFld2,beginWse21aTFld2 + WSE_21A_TFLD_2_LEN));
   	}




}
  
