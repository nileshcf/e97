package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse216aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse216aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse216aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_216A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse216aTFld1;
            protected  int beginWse216aTFld2;
	
	/**
	* Constructor for Wse216aTSerialized
	**/
    public Wse216aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse216aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_216A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse216aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse216aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse216aTFld1Counter = -1;
     public boolean isWse216aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216aTFld1Counter != sharedCounter;
         localWse216aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse216aTFld1
	 */
   protected void serializeWse216aTFld1(char[] wse216aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216aTFld1,0,getStringValue(),beginWse216aTFld1,WSE_216A_TFLD_1_LEN);
       localWse216aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse216aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216aTFld1() {	 
   		return (substring(getStringValue(),beginWse216aTFld1,beginWse216aTFld1 + WSE_216A_TFLD_1_LEN));
   	}
     int localWse216aTFld2Counter = -1;
     public boolean isWse216aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216aTFld2Counter != sharedCounter;
         localWse216aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse216aTFld2
	 */
   protected void serializeWse216aTFld2(char[] wse216aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216aTFld2,0,getStringValue(),beginWse216aTFld2,WSE_216A_TFLD_2_LEN);
       localWse216aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse216aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216aTFld2() {	 
   		return (substring(getStringValue(),beginWse216aTFld2,beginWse216aTFld2 + WSE_216A_TFLD_2_LEN));
   	}




}
  
