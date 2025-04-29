package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse27aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse27aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse27aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_27A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse27aSFld1;
            protected  int beginWse27aSFld2;
	
	/**
	* Constructor for Wse27aSSerialized
	**/
    public Wse27aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse27aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_27A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse27aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse27aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse27aSFld1Counter = -1;
     public boolean isWse27aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27aSFld1Counter != sharedCounter;
         localWse27aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse27aSFld1
	 */
   protected void serializeWse27aSFld1(char[] wse27aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27aSFld1,0,getStringValue(),beginWse27aSFld1,WSE_27A_SFLD_1_LEN);
       localWse27aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27aSFld1() {	 
   		return (substring(getStringValue(),beginWse27aSFld1,beginWse27aSFld1 + WSE_27A_SFLD_1_LEN));
   	}
     int localWse27aSFld2Counter = -1;
     public boolean isWse27aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse27aSFld2Counter != sharedCounter;
         localWse27aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_27A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse27aSFld2
	 */
   protected void serializeWse27aSFld2(char[] wse27aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse27aSFld2,0,getStringValue(),beginWse27aSFld2,WSE_27A_SFLD_2_LEN);
       localWse27aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse27aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse27aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse27aSFld2() {	 
   		return (substring(getStringValue(),beginWse27aSFld2,beginWse27aSFld2 + WSE_27A_SFLD_2_LEN));
   	}




}
  
