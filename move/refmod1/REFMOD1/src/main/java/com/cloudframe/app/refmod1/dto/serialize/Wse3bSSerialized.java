package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse3bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse3bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse3bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_3B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse3bSFld1;
            protected  int beginWse3bSFld2;
	
	/**
	* Constructor for Wse3bSSerialized
	**/
    public Wse3bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse3bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_3B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse3bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse3bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse3bSFld1Counter = -1;
     public boolean isWse3bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3bSFld1Counter != sharedCounter;
         localWse3bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse3bSFld1
	 */
   protected void serializeWse3bSFld1(char[] wse3bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3bSFld1,0,getStringValue(),beginWse3bSFld1,WSE_3B_SFLD_1_LEN);
       localWse3bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse3bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3bSFld1() {	 
   		return (substring(getStringValue(),beginWse3bSFld1,beginWse3bSFld1 + WSE_3B_SFLD_1_LEN));
   	}
     int localWse3bSFld2Counter = -1;
     public boolean isWse3bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3bSFld2Counter != sharedCounter;
         localWse3bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse3bSFld2
	 */
   protected void serializeWse3bSFld2(char[] wse3bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3bSFld2,0,getStringValue(),beginWse3bSFld2,WSE_3B_SFLD_2_LEN);
       localWse3bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse3bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3bSFld2() {	 
   		return (substring(getStringValue(),beginWse3bSFld2,beginWse3bSFld2 + WSE_3B_SFLD_2_LEN));
   	}




}
  
