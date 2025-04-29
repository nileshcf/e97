package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse219aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse219aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse219aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_219A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse219aSFld1;
            protected  int beginWse219aSFld2;
	
	/**
	* Constructor for Wse219aSSerialized
	**/
    public Wse219aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse219aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_219A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse219aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse219aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse219aSFld1Counter = -1;
     public boolean isWse219aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219aSFld1Counter != sharedCounter;
         localWse219aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse219aSFld1
	 */
   protected void serializeWse219aSFld1(char[] wse219aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219aSFld1,0,getStringValue(),beginWse219aSFld1,WSE_219A_SFLD_1_LEN);
       localWse219aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219aSFld1() {	 
   		return (substring(getStringValue(),beginWse219aSFld1,beginWse219aSFld1 + WSE_219A_SFLD_1_LEN));
   	}
     int localWse219aSFld2Counter = -1;
     public boolean isWse219aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219aSFld2Counter != sharedCounter;
         localWse219aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse219aSFld2
	 */
   protected void serializeWse219aSFld2(char[] wse219aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219aSFld2,0,getStringValue(),beginWse219aSFld2,WSE_219A_SFLD_2_LEN);
       localWse219aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219aSFld2() {	 
   		return (substring(getStringValue(),beginWse219aSFld2,beginWse219aSFld2 + WSE_219A_SFLD_2_LEN));
   	}




}
  
