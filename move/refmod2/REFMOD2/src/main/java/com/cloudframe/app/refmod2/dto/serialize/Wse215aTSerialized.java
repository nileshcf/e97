package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse215aTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse215aTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse215aTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_215A_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse215aTFld1;
            protected  int beginWse215aTFld2;
	
	/**
	* Constructor for Wse215aTSerialized
	**/
    public Wse215aTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse215aTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_215A_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse215aTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse215aTFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse215aTFld1Counter = -1;
     public boolean isWse215aTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215aTFld1Counter != sharedCounter;
         localWse215aTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215A_TFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse215aTFld1
	 */
   protected void serializeWse215aTFld1(char[] wse215aTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215aTFld1,0,getStringValue(),beginWse215aTFld1,WSE_215A_TFLD_1_LEN);
       localWse215aTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215aTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse215aTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215aTFld1() {	 
   		return (substring(getStringValue(),beginWse215aTFld1,beginWse215aTFld1 + WSE_215A_TFLD_1_LEN));
   	}
     int localWse215aTFld2Counter = -1;
     public boolean isWse215aTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215aTFld2Counter != sharedCounter;
         localWse215aTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215A_TFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse215aTFld2
	 */
   protected void serializeWse215aTFld2(char[] wse215aTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215aTFld2,0,getStringValue(),beginWse215aTFld2,WSE_215A_TFLD_2_LEN);
       localWse215aTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215aTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse215aTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215aTFld2() {	 
   		return (substring(getStringValue(),beginWse215aTFld2,beginWse215aTFld2 + WSE_215A_TFLD_2_LEN));
   	}




}
  
