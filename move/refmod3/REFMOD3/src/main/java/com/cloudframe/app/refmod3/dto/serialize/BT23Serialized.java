package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT23Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT23Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT23Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_23_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld123;
            protected  int beginBTFld223;
            protected  int beginBTFld323;
	
	/**
	* Constructor for BT23Serialized
	**/
    public BT23Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT23Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_23_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld123 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld223 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld323 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld123Counter = -1;
     public boolean isBTFld123Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld123Counter != sharedCounter;
         localBTFld123Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_123_LEN = 20;
	/**
	 * 	serialize this BTFld123
	 */
   protected void serializeBTFld123(char[] bTFld123) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld123,0,getStringValue(),beginBTFld123,B_TFLD_123_LEN);
       localBTFld123Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld123Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld123() {	 
   		return (substring(getStringValue(),beginBTFld123,beginBTFld123 + B_TFLD_123_LEN));
   	}
     int localBTFld223Counter = -1;
     public boolean isBTFld223Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld223Counter != sharedCounter;
         localBTFld223Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_223_LEN = 40;
	/**
	 * 	serialize this BTFld223
	 */
   protected void serializeBTFld223(char[] bTFld223) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld223,0,getStringValue(),beginBTFld223,B_TFLD_223_LEN);
       localBTFld223Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld223Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld223 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld223() {	 
   		return (substring(getStringValue(),beginBTFld223,beginBTFld223 + B_TFLD_223_LEN));
   	}
     int localBTFld323Counter = -1;
     public boolean isBTFld323Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld323Counter != sharedCounter;
         localBTFld323Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_323_LEN = 30;
	/**
	 * 	serialize this BTFld323
	 */
   protected void serializeBTFld323(char[] bTFld323) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld323,0,getStringValue(),beginBTFld323,B_TFLD_323_LEN);
       localBTFld323Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld323Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld323 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld323() {	 
   		return (substring(getStringValue(),beginBTFld323,beginBTFld323 + B_TFLD_323_LEN));
   	}




}
  
