package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse219bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse219bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse219bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_219B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse219bSFld1;
            protected  int beginWse219bSFld2;
	
	/**
	* Constructor for Wse219bSSerialized
	**/
    public Wse219bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse219bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_219B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse219bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse219bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse219bSFld1Counter = -1;
     public boolean isWse219bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219bSFld1Counter != sharedCounter;
         localWse219bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse219bSFld1
	 */
   protected void serializeWse219bSFld1(char[] wse219bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219bSFld1,0,getStringValue(),beginWse219bSFld1,WSE_219B_SFLD_1_LEN);
       localWse219bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219bSFld1() {	 
   		return (substring(getStringValue(),beginWse219bSFld1,beginWse219bSFld1 + WSE_219B_SFLD_1_LEN));
   	}
     int localWse219bSFld2Counter = -1;
     public boolean isWse219bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse219bSFld2Counter != sharedCounter;
         localWse219bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_219B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse219bSFld2
	 */
   protected void serializeWse219bSFld2(char[] wse219bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse219bSFld2,0,getStringValue(),beginWse219bSFld2,WSE_219B_SFLD_2_LEN);
       localWse219bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse219bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse219bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse219bSFld2() {	 
   		return (substring(getStringValue(),beginWse219bSFld2,beginWse219bSFld2 + WSE_219B_SFLD_2_LEN));
   	}




}
  
