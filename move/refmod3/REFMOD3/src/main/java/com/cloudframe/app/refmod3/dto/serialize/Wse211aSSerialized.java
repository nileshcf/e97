package com.cloudframe.app.refmod3.dto.serialize;

/**
*  The class Wse211aSSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:02. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse211aSSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse211aSSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_211A_S_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse211aSFld1;
            protected  int beginWse211aSFld2;
	
	/**
	* Constructor for Wse211aSSerialized
	**/
    public Wse211aSSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse211aSSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_211A_S_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWse211aSFld1 = getStartOffset() + 0;	// set offset for serialization
  
             beginWse211aSFld2 = getStartOffset() + 30;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse211aSFld1Counter = -1;
     public boolean isWse211aSFld1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211aSFld1Counter != sharedCounter;
         localWse211aSFld1Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211A_SFLD_1_LEN = 30;
	/**
	 * 	serialize this Wse211aSFld1
	 */
   protected void serializeWse211aSFld1(char[] wse211aSFld1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211aSFld1,0,getStringValue(),beginWse211aSFld1,WSE_211A_SFLD_1_LEN);
       localWse211aSFld1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211aSFld1Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211aSFld1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211aSFld1() {	 
   		return (substring(getStringValue(),beginWse211aSFld1,beginWse211aSFld1 + WSE_211A_SFLD_1_LEN));
   	}
     int localWse211aSFld2Counter = -1;
     public boolean isWse211aSFld2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse211aSFld2Counter != sharedCounter;
         localWse211aSFld2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSE_211A_SFLD_2_LEN = 30;
	/**
	 * 	serialize this Wse211aSFld2
	 */
   protected void serializeWse211aSFld2(char[] wse211aSFld2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse211aSFld2,0,getStringValue(),beginWse211aSFld2,WSE_211A_SFLD_2_LEN);
       localWse211aSFld2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse211aSFld2Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshWse211aSFld2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse211aSFld2() {	 
   		return (substring(getStringValue(),beginWse211aSFld2,beginWse211aSFld2 + WSE_211A_SFLD_2_LEN));
   	}




}
  
