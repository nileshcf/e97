package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse21aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse21aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse21aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_21A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse21aSFld1;
            protected  int beginWse21aSFld2;
	
	/**
	* Constructor for Wse21aSSerialized
	**/
    public Wse21aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse21aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_21A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse21aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse21aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse21aSFld1Counter = -1;
     public boolean isWse21aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21aSFld1Counter != sharedCounter;
         localWse21aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse21aSFld1
	 */
   protected void serializeWse21aSFld1(char[] wse21aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21aSFld1,0,getStringValue(),beginWse21aSFld1,WSE_21A_SFLD_1_LEN);
       localWse21aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse21aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21aSFld1() {	 
   		return (substring(getStringValue(),beginWse21aSFld1,beginWse21aSFld1 + WSE_21A_SFLD_1_LEN));
   	}
     int localWse21aSFld2Counter = -1;
     public boolean isWse21aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse21aSFld2Counter != sharedCounter;
         localWse21aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_21A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse21aSFld2
	 */
   protected void serializeWse21aSFld2(char[] wse21aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse21aSFld2,0,getStringValue(),beginWse21aSFld2,WSE_21A_SFLD_2_LEN);
       localWse21aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse21aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse21aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse21aSFld2() {	 
   		return (substring(getStringValue(),beginWse21aSFld2,beginWse21aSFld2 + WSE_21A_SFLD_2_LEN));
   	}




}
  
