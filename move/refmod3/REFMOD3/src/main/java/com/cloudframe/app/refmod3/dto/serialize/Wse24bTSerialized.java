package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse24bTSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse24bTSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse24bTSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_24B_T_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse24bTFld1;
            protected  int beginWse24bTFld2;
            protected  int beginWse24bTFld3;
	
	/**
	* Constructor for Wse24bTSerialized
	**/
    public Wse24bTSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse24bTSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_24B_T_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse24bTFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse24bTFld2 = getStartOffset() + 10;	// set offset for serialization
  
             beginWse24bTFld3 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse24bTFld1Counter = -1;
     public boolean isWse24bTFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24bTFld1Counter != sharedCounter;
         localWse24bTFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_24B_TFLD_1_LEN = 10;
	/**
	 * 	serialize this Wse24bTFld1
	 */
   protected void serializeWse24bTFld1(char[] wse24bTFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse24bTFld1,0,getStringValue(),beginWse24bTFld1,WSE_24B_TFLD_1_LEN);
       localWse24bTFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse24bTFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWse24bTFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse24bTFld1() {	 
   		return (substring(getStringValue(),beginWse24bTFld1,beginWse24bTFld1 + WSE_24B_TFLD_1_LEN));
   	}
     int localWse24bTFld2Counter = -1;
     public boolean isWse24bTFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24bTFld2Counter != sharedCounter;
         localWse24bTFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_24B_TFLD_2_LEN = 20;
	/**
	 * 	serialize this Wse24bTFld2
	 */
   protected void serializeWse24bTFld2(char[] wse24bTFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse24bTFld2,0,getStringValue(),beginWse24bTFld2,WSE_24B_TFLD_2_LEN);
       localWse24bTFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse24bTFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWse24bTFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse24bTFld2() {	 
   		return (substring(getStringValue(),beginWse24bTFld2,beginWse24bTFld2 + WSE_24B_TFLD_2_LEN));
   	}
     int localWse24bTFld3Counter = -1;
     public boolean isWse24bTFld3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse24bTFld3Counter != sharedCounter;
         localWse24bTFld3Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_24B_TFLD_3_LEN = 30;
	/**
	 * 	serialize this Wse24bTFld3
	 */
   protected void serializeWse24bTFld3(char[] wse24bTFld3) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse24bTFld3,0,getStringValue(),beginWse24bTFld3,WSE_24B_TFLD_3_LEN);
       localWse24bTFld3Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse24bTFld3Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse24bTFld3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse24bTFld3() {	 
   		return (substring(getStringValue(),beginWse24bTFld3,beginWse24bTFld3 + WSE_24B_TFLD_3_LEN));
   	}




}
  
