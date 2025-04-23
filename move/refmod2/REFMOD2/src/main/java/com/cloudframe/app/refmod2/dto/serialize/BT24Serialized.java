package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class BT24Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT24Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT24Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_24_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld124;
            protected  int beginBTFld224;
            protected  int beginBTFld324;
	
	/**
	* Constructor for BT24Serialized
	**/
    public BT24Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT24Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_24_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld124 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld224 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld324 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld124Counter = -1;
     public boolean isBTFld124Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld124Counter != sharedCounter;
         localBTFld124Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_124_LEN = 20;
	/**
	 * 	serialize this BTFld124
	 */
   protected void serializeBTFld124(char[] bTFld124) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld124,0,getStringValue(),beginBTFld124,B_TFLD_124_LEN);
       localBTFld124Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld124Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld124() {	 
   		return (substring(getStringValue(),beginBTFld124,beginBTFld124 + B_TFLD_124_LEN));
   	}
     int localBTFld224Counter = -1;
     public boolean isBTFld224Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld224Counter != sharedCounter;
         localBTFld224Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_224_LEN = 40;
	/**
	 * 	serialize this BTFld224
	 */
   protected void serializeBTFld224(char[] bTFld224) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld224,0,getStringValue(),beginBTFld224,B_TFLD_224_LEN);
       localBTFld224Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld224Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld224 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld224() {	 
   		return (substring(getStringValue(),beginBTFld224,beginBTFld224 + B_TFLD_224_LEN));
   	}
     int localBTFld324Counter = -1;
     public boolean isBTFld324Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld324Counter != sharedCounter;
         localBTFld324Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_324_LEN = 30;
	/**
	 * 	serialize this BTFld324
	 */
   protected void serializeBTFld324(char[] bTFld324) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld324,0,getStringValue(),beginBTFld324,B_TFLD_324_LEN);
       localBTFld324Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld324Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld324 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld324() {	 
   		return (substring(getStringValue(),beginBTFld324,beginBTFld324 + B_TFLD_324_LEN));
   	}




}
  
