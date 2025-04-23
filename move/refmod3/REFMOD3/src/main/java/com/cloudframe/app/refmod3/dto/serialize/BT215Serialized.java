package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT215Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:24. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT215Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT215Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_215_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld1215;
            protected  int beginBTFld2215;
            protected  int beginBTFld3215;
	
	/**
	* Constructor for BT215Serialized
	**/
    public BT215Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT215Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_215_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld1215 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld2215 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld3215 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld1215Counter = -1;
     public boolean isBTFld1215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld1215Counter != sharedCounter;
         localBTFld1215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_1215_LEN = 20;
	/**
	 * 	serialize this BTFld1215
	 */
   protected void serializeBTFld1215(char[] bTFld1215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld1215,0,getStringValue(),beginBTFld1215,B_TFLD_1215_LEN);
       localBTFld1215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld1215Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld1215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld1215() {	 
   		return (substring(getStringValue(),beginBTFld1215,beginBTFld1215 + B_TFLD_1215_LEN));
   	}
     int localBTFld2215Counter = -1;
     public boolean isBTFld2215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld2215Counter != sharedCounter;
         localBTFld2215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_2215_LEN = 40;
	/**
	 * 	serialize this BTFld2215
	 */
   protected void serializeBTFld2215(char[] bTFld2215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld2215,0,getStringValue(),beginBTFld2215,B_TFLD_2215_LEN);
       localBTFld2215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld2215Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld2215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld2215() {	 
   		return (substring(getStringValue(),beginBTFld2215,beginBTFld2215 + B_TFLD_2215_LEN));
   	}
     int localBTFld3215Counter = -1;
     public boolean isBTFld3215Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld3215Counter != sharedCounter;
         localBTFld3215Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_3215_LEN = 30;
	/**
	 * 	serialize this BTFld3215
	 */
   protected void serializeBTFld3215(char[] bTFld3215) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld3215,0,getStringValue(),beginBTFld3215,B_TFLD_3215_LEN);
       localBTFld3215Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld3215Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld3215 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld3215() {	 
   		return (substring(getStringValue(),beginBTFld3215,beginBTFld3215 + B_TFLD_3215_LEN));
   	}




}
  
