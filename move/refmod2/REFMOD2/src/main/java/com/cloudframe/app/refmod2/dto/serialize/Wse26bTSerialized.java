package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse26bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse26bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse26bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_26B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse26bTFld1;
            protected  int beginWse26bTFld2;
            protected  int beginWse26bTFld3;
	
	/**
	* Constructor for Wse26bTSerialized
	**/
    public Wse26bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse26bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_26B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse26bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse26bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse26bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse26bTFld1Counter = -1;
     public boolean isWse26bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26bTFld1Counter != sharedCounter;
         localWse26bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse26bTFld1
	 */
   protected void serializeWse26bTFld1(char[] wse26bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26bTFld1,0,getStringValue(),beginWse26bTFld1,WSE_26B_TFLD_1_LEN);
       localWse26bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse26bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26bTFld1() {	 
   		return (substring(getStringValue(),beginWse26bTFld1,beginWse26bTFld1 + WSE_26B_TFLD_1_LEN));
   	}
     int localWse26bTFld2Counter = -1;
     public boolean isWse26bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26bTFld2Counter != sharedCounter;
         localWse26bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse26bTFld2
	 */
   protected void serializeWse26bTFld2(char[] wse26bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26bTFld2,0,getStringValue(),beginWse26bTFld2,WSE_26B_TFLD_2_LEN);
       localWse26bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse26bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26bTFld2() {	 
   		return (substring(getStringValue(),beginWse26bTFld2,beginWse26bTFld2 + WSE_26B_TFLD_2_LEN));
   	}
     int localWse26bTFld3Counter = -1;
     public boolean isWse26bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse26bTFld3Counter != sharedCounter;
         localWse26bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_26B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse26bTFld3
	 */
   protected void serializeWse26bTFld3(char[] wse26bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse26bTFld3,0,getStringValue(),beginWse26bTFld3,WSE_26B_TFLD_3_LEN);
       localWse26bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse26bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse26bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse26bTFld3() {	 
   		return (substring(getStringValue(),beginWse26bTFld3,beginWse26bTFld3 + WSE_26B_TFLD_3_LEN));
   	}




}
  
