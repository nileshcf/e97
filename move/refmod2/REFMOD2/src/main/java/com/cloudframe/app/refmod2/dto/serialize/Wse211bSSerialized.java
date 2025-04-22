package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse211bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse211bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse211bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_211B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse211bSFld1;
            protected  int beginWse211bSFld2;
	
	/**
	* Constructor for Wse211bSSerialized
	**/
    public Wse211bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse211bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_211B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse211bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse211bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse211bSFld1Counter = -1;
     public boolean isWse211bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211bSFld1Counter != sharedCounter;
         localWse211bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse211bSFld1
	 */
   protected void serializeWse211bSFld1(char[] wse211bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211bSFld1,0,getStringValue(),beginWse211bSFld1,WSE_211B_SFLD_1_LEN);
       localWse211bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211bSFld1() {	 
   		return (substring(getStringValue(),beginWse211bSFld1,beginWse211bSFld1 + WSE_211B_SFLD_1_LEN));
   	}
     int localWse211bSFld2Counter = -1;
     public boolean isWse211bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211bSFld2Counter != sharedCounter;
         localWse211bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse211bSFld2
	 */
   protected void serializeWse211bSFld2(char[] wse211bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211bSFld2,0,getStringValue(),beginWse211bSFld2,WSE_211B_SFLD_2_LEN);
       localWse211bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211bSFld2() {	 
   		return (substring(getStringValue(),beginWse211bSFld2,beginWse211bSFld2 + WSE_211B_SFLD_2_LEN));
   	}




}
  
