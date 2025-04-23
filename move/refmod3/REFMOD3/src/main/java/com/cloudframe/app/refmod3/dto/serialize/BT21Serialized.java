package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT21Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT21Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT21Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_21_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld121;
            protected  int beginBTFld221;
            protected  int beginBTFld321;
	
	/**
	* Constructor for BT21Serialized
	**/
    public BT21Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT21Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_21_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld121 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld221 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld321 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld121Counter = -1;
     public boolean isBTFld121Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld121Counter != sharedCounter;
         localBTFld121Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_121_LEN = 20;
	/**
	 * 	serialize this BTFld121
	 */
   protected void serializeBTFld121(char[] bTFld121) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld121,0,getStringValue(),beginBTFld121,B_TFLD_121_LEN);
       localBTFld121Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld121Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld121 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld121() {	 
   		return (substring(getStringValue(),beginBTFld121,beginBTFld121 + B_TFLD_121_LEN));
   	}
     int localBTFld221Counter = -1;
     public boolean isBTFld221Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld221Counter != sharedCounter;
         localBTFld221Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_221_LEN = 40;
	/**
	 * 	serialize this BTFld221
	 */
   protected void serializeBTFld221(char[] bTFld221) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld221,0,getStringValue(),beginBTFld221,B_TFLD_221_LEN);
       localBTFld221Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld221Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld221 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld221() {	 
   		return (substring(getStringValue(),beginBTFld221,beginBTFld221 + B_TFLD_221_LEN));
   	}
     int localBTFld321Counter = -1;
     public boolean isBTFld321Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld321Counter != sharedCounter;
         localBTFld321Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_321_LEN = 30;
	/**
	 * 	serialize this BTFld321
	 */
   protected void serializeBTFld321(char[] bTFld321) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld321,0,getStringValue(),beginBTFld321,B_TFLD_321_LEN);
       localBTFld321Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld321Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld321 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld321() {	 
   		return (substring(getStringValue(),beginBTFld321,beginBTFld321 + B_TFLD_321_LEN));
   	}




}
  
