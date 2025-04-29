package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse25bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse25bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse25bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_25B_T_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse25bTFld1;
            protected  int beginWse25bTFld2;
            protected  int beginWse25bTFld3;
	
	/**
	* Constructor for Wse25bTSerialized
	**/
    public Wse25bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse25bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_25B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse25bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse25bTFld2 = getStartOffset() + 20;	// set offset for serialization
  
             beginWse25bTFld3 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse25bTFld1Counter = -1;
     public boolean isWse25bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25bTFld1Counter != sharedCounter;
         localWse25bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25B_TFLD_1_LEN = 20;
	/**
	 * 	serialize this Wse25bTFld1
	 */
   protected void serializeWse25bTFld1(char[] wse25bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25bTFld1,0,getStringValue(),beginWse25bTFld1,WSE_25B_TFLD_1_LEN);
       localWse25bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse25bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25bTFld1() {	 
   		return (substring(getStringValue(),beginWse25bTFld1,beginWse25bTFld1 + WSE_25B_TFLD_1_LEN));
   	}
     int localWse25bTFld2Counter = -1;
     public boolean isWse25bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25bTFld2Counter != sharedCounter;
         localWse25bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25B_TFLD_2_LEN = 40;
	/**
	 * 	serialize this Wse25bTFld2
	 */
   protected void serializeWse25bTFld2(char[] wse25bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25bTFld2,0,getStringValue(),beginWse25bTFld2,WSE_25B_TFLD_2_LEN);
       localWse25bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshWse25bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25bTFld2() {	 
   		return (substring(getStringValue(),beginWse25bTFld2,beginWse25bTFld2 + WSE_25B_TFLD_2_LEN));
   	}
     int localWse25bTFld3Counter = -1;
     public boolean isWse25bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse25bTFld3Counter != sharedCounter;
         localWse25bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_25B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse25bTFld3
	 */
   protected void serializeWse25bTFld3(char[] wse25bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse25bTFld3,0,getStringValue(),beginWse25bTFld3,WSE_25B_TFLD_3_LEN);
       localWse25bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse25bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse25bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse25bTFld3() {	 
   		return (substring(getStringValue(),beginWse25bTFld3,beginWse25bTFld3 + WSE_25B_TFLD_3_LEN));
   	}




}
  
