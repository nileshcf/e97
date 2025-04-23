package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse21bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse21bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse21bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_21B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse21bTFld1;
            protected  int beginWse21bTFld2;
            protected  int beginWse21bTFld3;
	
	/**
	* Constructor for Wse21bTSerialized
	**/
    public Wse21bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse21bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_21B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse21bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse21bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse21bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse21bTFld1Counter = -1;
     public boolean isWse21bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21bTFld1Counter != sharedCounter;
         localWse21bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse21bTFld1
	 */
   protected void serializeWse21bTFld1(char[] wse21bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21bTFld1,0,getStringValue(),beginWse21bTFld1,WSE_21B_TFLD_1_LEN);
       localWse21bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse21bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21bTFld1() {	 
   		return (substring(getStringValue(),beginWse21bTFld1,beginWse21bTFld1 + WSE_21B_TFLD_1_LEN));
   	}
     int localWse21bTFld2Counter = -1;
     public boolean isWse21bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21bTFld2Counter != sharedCounter;
         localWse21bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse21bTFld2
	 */
   protected void serializeWse21bTFld2(char[] wse21bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21bTFld2,0,getStringValue(),beginWse21bTFld2,WSE_21B_TFLD_2_LEN);
       localWse21bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse21bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21bTFld2() {	 
   		return (substring(getStringValue(),beginWse21bTFld2,beginWse21bTFld2 + WSE_21B_TFLD_2_LEN));
   	}
     int localWse21bTFld3Counter = -1;
     public boolean isWse21bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21bTFld3Counter != sharedCounter;
         localWse21bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse21bTFld3
	 */
   protected void serializeWse21bTFld3(char[] wse21bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21bTFld3,0,getStringValue(),beginWse21bTFld3,WSE_21B_TFLD_3_LEN);
       localWse21bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse21bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21bTFld3() {	 
   		return (substring(getStringValue(),beginWse21bTFld3,beginWse21bTFld3 + WSE_21B_TFLD_3_LEN));
   	}




}
  
