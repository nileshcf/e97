package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class BT25Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BT25Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BT25Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int B_T_25_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBTFld125;
            protected  int beginBTFld225;
            protected  int beginBTFld325;
	
	/**
	* Constructor for BT25Serialized
	**/
    public BT25Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BT25Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(B_T_25_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBTFld125 = getStartOffset() + 0;	// set offset for serialization
  
             beginBTFld225 = getStartOffset() + 20;	// set offset for serialization
  
             beginBTFld325 = getStartOffset() + 60;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBTFld125Counter = -1;
     public boolean isBTFld125Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld125Counter != sharedCounter;
         localBTFld125Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_125_LEN = 20;
	/**
	 * 	serialize this BTFld125
	 */
   protected void serializeBTFld125(char[] bTFld125) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld125,0,getStringValue(),beginBTFld125,B_TFLD_125_LEN);
       localBTFld125Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld125Constraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBTFld125 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld125() {	 
   		return (substring(getStringValue(),beginBTFld125,beginBTFld125 + B_TFLD_125_LEN));
   	}
     int localBTFld225Counter = -1;
     public boolean isBTFld225Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld225Counter != sharedCounter;
         localBTFld225Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_225_LEN = 40;
	/**
	 * 	serialize this BTFld225
	 */
   protected void serializeBTFld225(char[] bTFld225) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld225,0,getStringValue(),beginBTFld225,B_TFLD_225_LEN);
       localBTFld225Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld225Constraints(char[] value) {
   			return super.checkConstraints(value , 40 ,false, false);
   }
    /**
	 *	refreshBTFld225 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld225() {	 
   		return (substring(getStringValue(),beginBTFld225,beginBTFld225 + B_TFLD_225_LEN));
   	}
     int localBTFld325Counter = -1;
     public boolean isBTFld325Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBTFld325Counter != sharedCounter;
         localBTFld325Counter = sharedCounter; return hasModified;
     }
	protected static final int B_TFLD_325_LEN = 30;
	/**
	 * 	serialize this BTFld325
	 */
   protected void serializeBTFld325(char[] bTFld325) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bTFld325,0,getStringValue(),beginBTFld325,B_TFLD_325_LEN);
       localBTFld325Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBTFld325Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBTFld325 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBTFld325() {	 
   		return (substring(getStringValue(),beginBTFld325,beginBTFld325 + B_TFLD_325_LEN));
   	}




}
  
