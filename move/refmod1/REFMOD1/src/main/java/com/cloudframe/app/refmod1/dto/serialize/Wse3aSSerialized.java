package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse3aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse3aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse3aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_3A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse3aSFld1;
            protected  int beginWse3aSFld2;
	
	/**
	* Constructor for Wse3aSSerialized
	**/
    public Wse3aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse3aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_3A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse3aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse3aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse3aSFld1Counter = -1;
     public boolean isWse3aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3aSFld1Counter != sharedCounter;
         localWse3aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse3aSFld1
	 */
   protected void serializeWse3aSFld1(char[] wse3aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3aSFld1,0,getStringValue(),beginWse3aSFld1,WSE_3A_SFLD_1_LEN);
       localWse3aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse3aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3aSFld1() {	 
   		return (substring(getStringValue(),beginWse3aSFld1,beginWse3aSFld1 + WSE_3A_SFLD_1_LEN));
   	}
     int localWse3aSFld2Counter = -1;
     public boolean isWse3aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3aSFld2Counter != sharedCounter;
         localWse3aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse3aSFld2
	 */
   protected void serializeWse3aSFld2(char[] wse3aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3aSFld2,0,getStringValue(),beginWse3aSFld2,WSE_3A_SFLD_2_LEN);
       localWse3aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse3aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3aSFld2() {	 
   		return (substring(getStringValue(),beginWse3aSFld2,beginWse3aSFld2 + WSE_3A_SFLD_2_LEN));
   	}




}
  
