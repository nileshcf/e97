package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse26aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse26aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse26aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_26A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse26aTFld1;
            protected  int beginWse26aTFld2;
	
	/**
	* Constructor for Wse26aTSerialized
	**/
    public Wse26aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse26aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_26A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse26aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse26aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse26aTFld1Counter = -1;
     public boolean isWse26aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26aTFld1Counter != sharedCounter;
         localWse26aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse26aTFld1
	 */
   protected void serializeWse26aTFld1(char[] wse26aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26aTFld1,0,getStringValue(),beginWse26aTFld1,WSE_26A_TFLD_1_LEN);
       localWse26aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse26aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26aTFld1() {	 
   		return (substring(getStringValue(),beginWse26aTFld1,beginWse26aTFld1 + WSE_26A_TFLD_1_LEN));
   	}
     int localWse26aTFld2Counter = -1;
     public boolean isWse26aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26aTFld2Counter != sharedCounter;
         localWse26aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse26aTFld2
	 */
   protected void serializeWse26aTFld2(char[] wse26aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26aTFld2,0,getStringValue(),beginWse26aTFld2,WSE_26A_TFLD_2_LEN);
       localWse26aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse26aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26aTFld2() {	 
   		return (substring(getStringValue(),beginWse26aTFld2,beginWse26aTFld2 + WSE_26A_TFLD_2_LEN));
   	}




}
  
