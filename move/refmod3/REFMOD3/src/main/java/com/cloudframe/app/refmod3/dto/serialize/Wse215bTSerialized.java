package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse215bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse215bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse215bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_215B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse215bTFld1;
            protected  int beginWse215bTFld2;
            protected  int beginWse215bTFld3;
	
	/**
	* Constructor for Wse215bTSerialized
	**/
    public Wse215bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse215bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_215B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse215bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse215bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse215bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse215bTFld1Counter = -1;
     public boolean isWse215bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215bTFld1Counter != sharedCounter;
         localWse215bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse215bTFld1
	 */
   protected void serializeWse215bTFld1(char[] wse215bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215bTFld1,0,getStringValue(),beginWse215bTFld1,WSE_215B_TFLD_1_LEN);
       localWse215bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse215bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215bTFld1() {	 
   		return (substring(getStringValue(),beginWse215bTFld1,beginWse215bTFld1 + WSE_215B_TFLD_1_LEN));
   	}
     int localWse215bTFld2Counter = -1;
     public boolean isWse215bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215bTFld2Counter != sharedCounter;
         localWse215bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse215bTFld2
	 */
   protected void serializeWse215bTFld2(char[] wse215bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215bTFld2,0,getStringValue(),beginWse215bTFld2,WSE_215B_TFLD_2_LEN);
       localWse215bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse215bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215bTFld2() {	 
   		return (substring(getStringValue(),beginWse215bTFld2,beginWse215bTFld2 + WSE_215B_TFLD_2_LEN));
   	}
     int localWse215bTFld3Counter = -1;
     public boolean isWse215bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse215bTFld3Counter != sharedCounter;
         localWse215bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_215B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse215bTFld3
	 */
   protected void serializeWse215bTFld3(char[] wse215bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse215bTFld3,0,getStringValue(),beginWse215bTFld3,WSE_215B_TFLD_3_LEN);
       localWse215bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse215bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse215bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse215bTFld3() {	 
   		return (substring(getStringValue(),beginWse215bTFld3,beginWse215bTFld3 + WSE_215B_TFLD_3_LEN));
   	}




}
  
