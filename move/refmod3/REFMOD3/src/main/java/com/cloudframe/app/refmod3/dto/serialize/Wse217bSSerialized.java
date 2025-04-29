package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse217bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse217bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse217bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_217B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse217bSFld1;
            protected  int beginWse217bSFld2;
	
	/**
	* Constructor for Wse217bSSerialized
	**/
    public Wse217bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse217bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_217B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse217bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse217bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse217bSFld1Counter = -1;
     public boolean isWse217bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217bSFld1Counter != sharedCounter;
         localWse217bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse217bSFld1
	 */
   protected void serializeWse217bSFld1(char[] wse217bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217bSFld1,0,getStringValue(),beginWse217bSFld1,WSE_217B_SFLD_1_LEN);
       localWse217bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217bSFld1() {	 
   		return (substring(getStringValue(),beginWse217bSFld1,beginWse217bSFld1 + WSE_217B_SFLD_1_LEN));
   	}
     int localWse217bSFld2Counter = -1;
     public boolean isWse217bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217bSFld2Counter != sharedCounter;
         localWse217bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse217bSFld2
	 */
   protected void serializeWse217bSFld2(char[] wse217bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217bSFld2,0,getStringValue(),beginWse217bSFld2,WSE_217B_SFLD_2_LEN);
       localWse217bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217bSFld2() {	 
   		return (substring(getStringValue(),beginWse217bSFld2,beginWse217bSFld2 + WSE_217B_SFLD_2_LEN));
   	}




}
  
