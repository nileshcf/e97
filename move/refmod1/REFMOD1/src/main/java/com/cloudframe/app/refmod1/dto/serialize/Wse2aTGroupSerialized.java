package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse2aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse2aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse2aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_2A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse2aTR;
	
	/**
	* Constructor for Wse2aTGroupSerialized
	**/
    public Wse2aTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse2aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_2A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse2aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse2aTRCounter = -1;
     public boolean isWse2aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2aTRCounter != sharedCounter;
         localWse2aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2A_TR_LEN = 60;
	/**
	 * 	serialize this Wse2aTR
	 */
   protected void serializeWse2aTR(char[] wse2aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2aTR,0,getStringValue(),beginWse2aTR,WSE_2A_TR_LEN);
       localWse2aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse2aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2aTR() {	 
   		return (substring(getStringValue(),beginWse2aTR,beginWse2aTR + WSE_2A_TR_LEN));
   	}




}
  
