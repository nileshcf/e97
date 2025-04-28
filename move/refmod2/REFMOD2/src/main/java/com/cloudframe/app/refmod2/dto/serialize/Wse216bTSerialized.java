package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse216bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse216bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse216bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_216B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse216bTFld1;
            protected  int beginWse216bTFld2;
            protected  int beginWse216bTFld3;
	
	/**
	* Constructor for Wse216bTSerialized
	**/
    public Wse216bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse216bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_216B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse216bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse216bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse216bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse216bTFld1Counter = -1;
     public boolean isWse216bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216bTFld1Counter != sharedCounter;
         localWse216bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse216bTFld1
	 */
   protected void serializeWse216bTFld1(char[] wse216bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216bTFld1,0,getStringValue(),beginWse216bTFld1,WSE_216B_TFLD_1_LEN);
       localWse216bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse216bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216bTFld1() {	 
   		return (substring(getStringValue(),beginWse216bTFld1,beginWse216bTFld1 + WSE_216B_TFLD_1_LEN));
   	}
     int localWse216bTFld2Counter = -1;
     public boolean isWse216bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216bTFld2Counter != sharedCounter;
         localWse216bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse216bTFld2
	 */
   protected void serializeWse216bTFld2(char[] wse216bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216bTFld2,0,getStringValue(),beginWse216bTFld2,WSE_216B_TFLD_2_LEN);
       localWse216bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse216bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216bTFld2() {	 
   		return (substring(getStringValue(),beginWse216bTFld2,beginWse216bTFld2 + WSE_216B_TFLD_2_LEN));
   	}
     int localWse216bTFld3Counter = -1;
     public boolean isWse216bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse216bTFld3Counter != sharedCounter;
         localWse216bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_216B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse216bTFld3
	 */
   protected void serializeWse216bTFld3(char[] wse216bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse216bTFld3,0,getStringValue(),beginWse216bTFld3,WSE_216B_TFLD_3_LEN);
       localWse216bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse216bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse216bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse216bTFld3() {	 
   		return (substring(getStringValue(),beginWse216bTFld3,beginWse216bTFld3 + WSE_216B_TFLD_3_LEN));
   	}




}
  
