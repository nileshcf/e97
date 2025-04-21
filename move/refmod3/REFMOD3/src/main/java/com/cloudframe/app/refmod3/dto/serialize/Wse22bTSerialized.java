package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse22bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse22bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse22bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_22B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse22bTFld1;
            protected  int beginWse22bTFld2;
            protected  int beginWse22bTFld3;
	
	/**
	* Constructor for Wse22bTSerialized
	**/
    public Wse22bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse22bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_22B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse22bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse22bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse22bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse22bTFld1Counter = -1;
     public boolean isWse22bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22bTFld1Counter != sharedCounter;
         localWse22bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_22B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse22bTFld1
	 */
   protected void serializeWse22bTFld1(char[] wse22bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse22bTFld1,0,getStringValue(),beginWse22bTFld1,WSE_22B_TFLD_1_LEN);
       localWse22bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse22bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse22bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse22bTFld1() {	 
   		return (substring(getStringValue(),beginWse22bTFld1,beginWse22bTFld1 + WSE_22B_TFLD_1_LEN));
   	}
     int localWse22bTFld2Counter = -1;
     public boolean isWse22bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22bTFld2Counter != sharedCounter;
         localWse22bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_22B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse22bTFld2
	 */
   protected void serializeWse22bTFld2(char[] wse22bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse22bTFld2,0,getStringValue(),beginWse22bTFld2,WSE_22B_TFLD_2_LEN);
       localWse22bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse22bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse22bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse22bTFld2() {	 
   		return (substring(getStringValue(),beginWse22bTFld2,beginWse22bTFld2 + WSE_22B_TFLD_2_LEN));
   	}
     int localWse22bTFld3Counter = -1;
     public boolean isWse22bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse22bTFld3Counter != sharedCounter;
         localWse22bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_22B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse22bTFld3
	 */
   protected void serializeWse22bTFld3(char[] wse22bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse22bTFld3,0,getStringValue(),beginWse22bTFld3,WSE_22B_TFLD_3_LEN);
       localWse22bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse22bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse22bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse22bTFld3() {	 
   		return (substring(getStringValue(),beginWse22bTFld3,beginWse22bTFld3 + WSE_22B_TFLD_3_LEN));
   	}




}
  
