package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT26Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT26Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT26Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_26_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld126;
            protected  int beginBTFld226;
            protected  int beginBTFld326;
	
	/**
	* Constructor for BT26Serialized
	**/
    public BT26Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT26Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_26_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld126 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld226 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld326 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld126Counter = -1;
     public boolean isBTFld126Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld126Counter != sharedCounter;
         localBTFld126Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_126_LEN = 20;
	/**
	 * 	serialize this BTFld126
	 */
   protected void serializeBTFld126(char[] bTFld126) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld126,0,getStringValue(),beginBTFld126,B_TFLD_126_LEN);
       localBTFld126Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld126Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld126 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld126() {	 
   		return (substring(getStringValue(),beginBTFld126,beginBTFld126 + B_TFLD_126_LEN));
   	}
     int localBTFld226Counter = -1;
     public boolean isBTFld226Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld226Counter != sharedCounter;
         localBTFld226Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_226_LEN = 40;
	/**
	 * 	serialize this BTFld226
	 */
   protected void serializeBTFld226(char[] bTFld226) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld226,0,getStringValue(),beginBTFld226,B_TFLD_226_LEN);
       localBTFld226Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld226Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld226 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld226() {	 
   		return (substring(getStringValue(),beginBTFld226,beginBTFld226 + B_TFLD_226_LEN));
   	}
     int localBTFld326Counter = -1;
     public boolean isBTFld326Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld326Counter != sharedCounter;
         localBTFld326Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_326_LEN = 30;
	/**
	 * 	serialize this BTFld326
	 */
   protected void serializeBTFld326(char[] bTFld326) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld326,0,getStringValue(),beginBTFld326,B_TFLD_326_LEN);
       localBTFld326Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld326Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld326 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld326() {	 
   		return (substring(getStringValue(),beginBTFld326,beginBTFld326 + B_TFLD_326_LEN));
   	}




}
  
