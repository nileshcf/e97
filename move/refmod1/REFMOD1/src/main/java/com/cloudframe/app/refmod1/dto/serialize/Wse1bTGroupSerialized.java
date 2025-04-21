package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse1bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse1bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse1bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_1B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse1bTR;
	
	/**
	* Constructor for Wse1bTGroupSerialized
	**/
    public Wse1bTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse1bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_1B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse1bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse1bTRCounter = -1;
     public boolean isWse1bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1bTRCounter != sharedCounter;
         localWse1bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1B_TR_LEN = 60;
	/**
	 * 	serialize this Wse1bTR
	 */
   protected void serializeWse1bTR(char[] wse1bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1bTR,0,getStringValue(),beginWse1bTR,WSE_1B_TR_LEN);
       localWse1bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse1bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1bTR() {	 
   		return (substring(getStringValue(),beginWse1bTR,beginWse1bTR + WSE_1B_TR_LEN));
   	}




}
  
