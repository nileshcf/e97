package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT22Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT22Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT22Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_22_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld122;
            protected  int beginBTFld222;
            protected  int beginBTFld322;
	
	/**
	* Constructor for BT22Serialized
	**/
    public BT22Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT22Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_22_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld122 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld222 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld322 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld122Counter = -1;
     public boolean isBTFld122Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld122Counter != sharedCounter;
         localBTFld122Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_122_LEN = 20;
	/**
	 * 	serialize this BTFld122
	 */
   protected void serializeBTFld122(char[] bTFld122) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld122,0,getStringValue(),beginBTFld122,B_TFLD_122_LEN);
       localBTFld122Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld122Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld122 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld122() {	 
   		return (substring(getStringValue(),beginBTFld122,beginBTFld122 + B_TFLD_122_LEN));
   	}
     int localBTFld222Counter = -1;
     public boolean isBTFld222Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld222Counter != sharedCounter;
         localBTFld222Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_222_LEN = 40;
	/**
	 * 	serialize this BTFld222
	 */
   protected void serializeBTFld222(char[] bTFld222) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld222,0,getStringValue(),beginBTFld222,B_TFLD_222_LEN);
       localBTFld222Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld222Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld222 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld222() {	 
   		return (substring(getStringValue(),beginBTFld222,beginBTFld222 + B_TFLD_222_LEN));
   	}
     int localBTFld322Counter = -1;
     public boolean isBTFld322Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld322Counter != sharedCounter;
         localBTFld322Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_322_LEN = 30;
	/**
	 * 	serialize this BTFld322
	 */
   protected void serializeBTFld322(char[] bTFld322) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld322,0,getStringValue(),beginBTFld322,B_TFLD_322_LEN);
       localBTFld322Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld322Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld322 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld322() {	 
   		return (substring(getStringValue(),beginBTFld322,beginBTFld322 + B_TFLD_322_LEN));
   	}




}
  
