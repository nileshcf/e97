package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse1aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse1aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse1aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_1A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse1aSFld1;
            protected  int beginWse1aSFld2;
	
	/**
	* Constructor for Wse1aSSerialized
	**/
    public Wse1aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse1aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_1A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse1aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse1aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse1aSFld1Counter = -1;
     public boolean isWse1aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1aSFld1Counter != sharedCounter;
         localWse1aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse1aSFld1
	 */
   protected void serializeWse1aSFld1(char[] wse1aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1aSFld1,0,getStringValue(),beginWse1aSFld1,WSE_1A_SFLD_1_LEN);
       localWse1aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse1aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1aSFld1() {	 
   		return (substring(getStringValue(),beginWse1aSFld1,beginWse1aSFld1 + WSE_1A_SFLD_1_LEN));
   	}
     int localWse1aSFld2Counter = -1;
     public boolean isWse1aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1aSFld2Counter != sharedCounter;
         localWse1aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse1aSFld2
	 */
   protected void serializeWse1aSFld2(char[] wse1aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1aSFld2,0,getStringValue(),beginWse1aSFld2,WSE_1A_SFLD_2_LEN);
       localWse1aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse1aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1aSFld2() {	 
   		return (substring(getStringValue(),beginWse1aSFld2,beginWse1aSFld2 + WSE_1A_SFLD_2_LEN));
   	}




}
  
