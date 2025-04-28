package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse19aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse19aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse19aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_19A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse19aSFld1;
            protected  int beginWse19aSFld2;
	
	/**
	* Constructor for Wse19aSSerialized
	**/
    public Wse19aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse19aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_19A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse19aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse19aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse19aSFld1Counter = -1;
     public boolean isWse19aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19aSFld1Counter != sharedCounter;
         localWse19aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse19aSFld1
	 */
   protected void serializeWse19aSFld1(char[] wse19aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19aSFld1,0,getStringValue(),beginWse19aSFld1,WSE_19A_SFLD_1_LEN);
       localWse19aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19aSFld1() {	 
   		return (substring(getStringValue(),beginWse19aSFld1,beginWse19aSFld1 + WSE_19A_SFLD_1_LEN));
   	}
     int localWse19aSFld2Counter = -1;
     public boolean isWse19aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse19aSFld2Counter != sharedCounter;
         localWse19aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_19A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse19aSFld2
	 */
   protected void serializeWse19aSFld2(char[] wse19aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse19aSFld2,0,getStringValue(),beginWse19aSFld2,WSE_19A_SFLD_2_LEN);
       localWse19aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse19aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse19aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse19aSFld2() {	 
   		return (substring(getStringValue(),beginWse19aSFld2,beginWse19aSFld2 + WSE_19A_SFLD_2_LEN));
   	}




}
  
