package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse11aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse11aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse11aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_11A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse11aSFld1;
            protected  int beginWse11aSFld2;
	
	/**
	* Constructor for Wse11aSSerialized
	**/
    public Wse11aSSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse11aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_11A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse11aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse11aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse11aSFld1Counter = -1;
     public boolean isWse11aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11aSFld1Counter != sharedCounter;
         localWse11aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse11aSFld1
	 */
   protected void serializeWse11aSFld1(char[] wse11aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11aSFld1,0,getStringValue(),beginWse11aSFld1,WSE_11A_SFLD_1_LEN);
       localWse11aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11aSFld1() {	 
   		return (substring(getStringValue(),beginWse11aSFld1,beginWse11aSFld1 + WSE_11A_SFLD_1_LEN));
   	}
     int localWse11aSFld2Counter = -1;
     public boolean isWse11aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse11aSFld2Counter != sharedCounter;
         localWse11aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_11A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse11aSFld2
	 */
   protected void serializeWse11aSFld2(char[] wse11aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse11aSFld2,0,getStringValue(),beginWse11aSFld2,WSE_11A_SFLD_2_LEN);
       localWse11aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse11aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse11aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse11aSFld2() {	 
   		return (substring(getStringValue(),beginWse11aSFld2,beginWse11aSFld2 + WSE_11A_SFLD_2_LEN));
   	}




}
  
