package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse27bSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse27bSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse27bSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_27B_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse27bSFld1;
            protected  int beginWse27bSFld2;
	
	/**
	* Constructor for Wse27bSSerialized
	**/
    public Wse27bSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse27bSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_27B_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse27bSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse27bSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse27bSFld1Counter = -1;
     public boolean isWse27bSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27bSFld1Counter != sharedCounter;
         localWse27bSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27B_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse27bSFld1
	 */
   protected void serializeWse27bSFld1(char[] wse27bSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27bSFld1,0,getStringValue(),beginWse27bSFld1,WSE_27B_SFLD_1_LEN);
       localWse27bSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27bSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27bSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27bSFld1() {	 
   		return (substring(getStringValue(),beginWse27bSFld1,beginWse27bSFld1 + WSE_27B_SFLD_1_LEN));
   	}
     int localWse27bSFld2Counter = -1;
     public boolean isWse27bSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27bSFld2Counter != sharedCounter;
         localWse27bSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27B_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse27bSFld2
	 */
   protected void serializeWse27bSFld2(char[] wse27bSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27bSFld2,0,getStringValue(),beginWse27bSFld2,WSE_27B_SFLD_2_LEN);
       localWse27bSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27bSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27bSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27bSFld2() {	 
   		return (substring(getStringValue(),beginWse27bSFld2,beginWse27bSFld2 + WSE_27B_SFLD_2_LEN));
   	}




}
  
