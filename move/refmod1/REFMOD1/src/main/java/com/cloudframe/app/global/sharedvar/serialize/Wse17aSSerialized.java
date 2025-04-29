package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse17aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse17aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse17aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_17A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse17aSFld1;
            protected  int beginWse17aSFld2;
	
	/**
	* Constructor for Wse17aSSerialized
	**/
    public Wse17aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse17aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_17A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse17aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse17aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse17aSFld1Counter = -1;
     public boolean isWse17aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17aSFld1Counter != sharedCounter;
         localWse17aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse17aSFld1
	 */
   protected void serializeWse17aSFld1(char[] wse17aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17aSFld1,0,getStringValue(),beginWse17aSFld1,WSE_17A_SFLD_1_LEN);
       localWse17aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse17aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17aSFld1() {	 
   		return (substring(getStringValue(),beginWse17aSFld1,beginWse17aSFld1 + WSE_17A_SFLD_1_LEN));
   	}
     int localWse17aSFld2Counter = -1;
     public boolean isWse17aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse17aSFld2Counter != sharedCounter;
         localWse17aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_17A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse17aSFld2
	 */
   protected void serializeWse17aSFld2(char[] wse17aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse17aSFld2,0,getStringValue(),beginWse17aSFld2,WSE_17A_SFLD_2_LEN);
       localWse17aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse17aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse17aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse17aSFld2() {	 
   		return (substring(getStringValue(),beginWse17aSFld2,beginWse17aSFld2 + WSE_17A_SFLD_2_LEN));
   	}




}
  
