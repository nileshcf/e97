package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse23aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse23aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse23aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_23A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse23aSFld1;
            protected  int beginWse23aSFld2;
	
	/**
	* Constructor for Wse23aSSerialized
	**/
    public Wse23aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse23aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_23A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse23aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse23aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse23aSFld1Counter = -1;
     public boolean isWse23aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23aSFld1Counter != sharedCounter;
         localWse23aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse23aSFld1
	 */
   protected void serializeWse23aSFld1(char[] wse23aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23aSFld1,0,getStringValue(),beginWse23aSFld1,WSE_23A_SFLD_1_LEN);
       localWse23aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse23aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23aSFld1() {	 
   		return (substring(getStringValue(),beginWse23aSFld1,beginWse23aSFld1 + WSE_23A_SFLD_1_LEN));
   	}
     int localWse23aSFld2Counter = -1;
     public boolean isWse23aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse23aSFld2Counter != sharedCounter;
         localWse23aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_23A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse23aSFld2
	 */
   protected void serializeWse23aSFld2(char[] wse23aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse23aSFld2,0,getStringValue(),beginWse23aSFld2,WSE_23A_SFLD_2_LEN);
       localWse23aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse23aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse23aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse23aSFld2() {	 
   		return (substring(getStringValue(),beginWse23aSFld2,beginWse23aSFld2 + WSE_23A_SFLD_2_LEN));
   	}




}
  
