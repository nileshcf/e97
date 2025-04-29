package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse23bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse23bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse23bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_23B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse23bTFld1;
            protected  int beginWse23bTFld2;
            protected  int beginWse23bTFld3;
	
	/**
	* Constructor for Wse23bTSerialized
	**/
    public Wse23bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse23bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_23B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse23bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse23bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse23bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse23bTFld1Counter = -1;
     public boolean isWse23bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23bTFld1Counter != sharedCounter;
         localWse23bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse23bTFld1
	 */
   protected void serializeWse23bTFld1(char[] wse23bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23bTFld1,0,getStringValue(),beginWse23bTFld1,WSE_23B_TFLD_1_LEN);
       localWse23bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse23bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23bTFld1() {	 
   		return (substring(getStringValue(),beginWse23bTFld1,beginWse23bTFld1 + WSE_23B_TFLD_1_LEN));
   	}
     int localWse23bTFld2Counter = -1;
     public boolean isWse23bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23bTFld2Counter != sharedCounter;
         localWse23bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse23bTFld2
	 */
   protected void serializeWse23bTFld2(char[] wse23bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23bTFld2,0,getStringValue(),beginWse23bTFld2,WSE_23B_TFLD_2_LEN);
       localWse23bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse23bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23bTFld2() {	 
   		return (substring(getStringValue(),beginWse23bTFld2,beginWse23bTFld2 + WSE_23B_TFLD_2_LEN));
   	}
     int localWse23bTFld3Counter = -1;
     public boolean isWse23bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23bTFld3Counter != sharedCounter;
         localWse23bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse23bTFld3
	 */
   protected void serializeWse23bTFld3(char[] wse23bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23bTFld3,0,getStringValue(),beginWse23bTFld3,WSE_23B_TFLD_3_LEN);
       localWse23bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse23bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23bTFld3() {	 
   		return (substring(getStringValue(),beginWse23bTFld3,beginWse23bTFld3 + WSE_23B_TFLD_3_LEN));
   	}




}
  
