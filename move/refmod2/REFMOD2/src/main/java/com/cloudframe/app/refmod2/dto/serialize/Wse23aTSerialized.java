package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse23aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse23aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse23aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_23A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse23aTFld1;
            protected  int beginWse23aTFld2;
	
	/**
	* Constructor for Wse23aTSerialized
	**/
    public Wse23aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse23aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_23A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse23aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse23aTFld2 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse23aTFld1Counter = -1;
     public boolean isWse23aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23aTFld1Counter != sharedCounter;
         localWse23aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23A_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse23aTFld1
	 */
   protected void serializeWse23aTFld1(char[] wse23aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23aTFld1,0,getStringValue(),beginWse23aTFld1,WSE_23A_TFLD_1_LEN);
       localWse23aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse23aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23aTFld1() {	 
   		return (substring(getStringValue(),beginWse23aTFld1,beginWse23aTFld1 + WSE_23A_TFLD_1_LEN));
   	}
     int localWse23aTFld2Counter = -1;
     public boolean isWse23aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23aTFld2Counter != sharedCounter;
         localWse23aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23A_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse23aTFld2
	 */
   protected void serializeWse23aTFld2(char[] wse23aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23aTFld2,0,getStringValue(),beginWse23aTFld2,WSE_23A_TFLD_2_LEN);
       localWse23aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse23aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23aTFld2() {	 
   		return (substring(getStringValue(),beginWse23aTFld2,beginWse23aTFld2 + WSE_23A_TFLD_2_LEN));
   	}




}
  
