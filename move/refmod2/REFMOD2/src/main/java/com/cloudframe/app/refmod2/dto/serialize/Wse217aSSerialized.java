package com.cloudframe.app.refmod2.dto.serialize;

/**
*  The class Wse217aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse217aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse217aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_217A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse217aSFld1;
            protected  int beginWse217aSFld2;
	
	/**
	* Constructor for Wse217aSSerialized
	**/
    public Wse217aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse217aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_217A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse217aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse217aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse217aSFld1Counter = -1;
     public boolean isWse217aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217aSFld1Counter != sharedCounter;
         localWse217aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse217aSFld1
	 */
   protected void serializeWse217aSFld1(char[] wse217aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217aSFld1,0,getStringValue(),beginWse217aSFld1,WSE_217A_SFLD_1_LEN);
       localWse217aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217aSFld1() {	 
   		return (substring(getStringValue(),beginWse217aSFld1,beginWse217aSFld1 + WSE_217A_SFLD_1_LEN));
   	}
     int localWse217aSFld2Counter = -1;
     public boolean isWse217aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse217aSFld2Counter != sharedCounter;
         localWse217aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_217A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse217aSFld2
	 */
   protected void serializeWse217aSFld2(char[] wse217aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse217aSFld2,0,getStringValue(),beginWse217aSFld2,WSE_217A_SFLD_2_LEN);
       localWse217aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse217aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse217aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse217aSFld2() {	 
   		return (substring(getStringValue(),beginWse217aSFld2,beginWse217aSFld2 + WSE_217A_SFLD_2_LEN));
   	}




}
  
