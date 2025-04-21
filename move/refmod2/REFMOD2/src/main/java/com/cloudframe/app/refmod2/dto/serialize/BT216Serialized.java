package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT216Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT216Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT216Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_216_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1216;
            protected  int beginBTFld2216;
            protected  int beginBTFld3216;
	
	/**
	* Constructor for BT216Serialized
	**/
    public BT216Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT216Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_216_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1216 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2216 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3216 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1216Counter = -1;
     public boolean isBTFld1216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1216Counter != sharedCounter;
         localBTFld1216Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1216_LEN = 20;
	/**
	 * 	serialize this BTFld1216
	 */
   protected void serializeBTFld1216(char[] bTFld1216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1216,0,getStringValue(),beginBTFld1216,B_TFLD_1216_LEN);
       localBTFld1216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1216Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1216() {	 
   		return (substring(getStringValue(),beginBTFld1216,beginBTFld1216 + B_TFLD_1216_LEN));
   	}
     int localBTFld2216Counter = -1;
     public boolean isBTFld2216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2216Counter != sharedCounter;
         localBTFld2216Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2216_LEN = 40;
	/**
	 * 	serialize this BTFld2216
	 */
   protected void serializeBTFld2216(char[] bTFld2216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2216,0,getStringValue(),beginBTFld2216,B_TFLD_2216_LEN);
       localBTFld2216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2216Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2216() {	 
   		return (substring(getStringValue(),beginBTFld2216,beginBTFld2216 + B_TFLD_2216_LEN));
   	}
     int localBTFld3216Counter = -1;
     public boolean isBTFld3216Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3216Counter != sharedCounter;
         localBTFld3216Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3216_LEN = 30;
	/**
	 * 	serialize this BTFld3216
	 */
   protected void serializeBTFld3216(char[] bTFld3216) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3216,0,getStringValue(),beginBTFld3216,B_TFLD_3216_LEN);
       localBTFld3216Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3216Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3216 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3216() {	 
   		return (substring(getStringValue(),beginBTFld3216,beginBTFld3216 + B_TFLD_3216_LEN));
   	}




}
  
