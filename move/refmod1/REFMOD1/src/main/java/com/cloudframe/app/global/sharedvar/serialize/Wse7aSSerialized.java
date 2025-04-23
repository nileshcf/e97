package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse7aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse7aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse7aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_7A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse7aSFld1;
            protected  int beginWse7aSFld2;
	
	/**
	* Constructor for Wse7aSSerialized
	**/
    public Wse7aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse7aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_7A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse7aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse7aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse7aSFld1Counter = -1;
     public boolean isWse7aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7aSFld1Counter != sharedCounter;
         localWse7aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse7aSFld1
	 */
   protected void serializeWse7aSFld1(char[] wse7aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7aSFld1,0,getStringValue(),beginWse7aSFld1,WSE_7A_SFLD_1_LEN);
       localWse7aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse7aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7aSFld1() {	 
   		return (substring(getStringValue(),beginWse7aSFld1,beginWse7aSFld1 + WSE_7A_SFLD_1_LEN));
   	}
     int localWse7aSFld2Counter = -1;
     public boolean isWse7aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse7aSFld2Counter != sharedCounter;
         localWse7aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_7A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse7aSFld2
	 */
   protected void serializeWse7aSFld2(char[] wse7aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse7aSFld2,0,getStringValue(),beginWse7aSFld2,WSE_7A_SFLD_2_LEN);
       localWse7aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse7aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse7aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse7aSFld2() {	 
   		return (substring(getStringValue(),beginWse7aSFld2,beginWse7aSFld2 + WSE_7A_SFLD_2_LEN));
   	}




}
  
