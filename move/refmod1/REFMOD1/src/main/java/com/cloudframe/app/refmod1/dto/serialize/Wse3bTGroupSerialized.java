package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse3bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse3bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse3bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_3B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse3bTR;
	
	/**
	* Constructor for Wse3bTGroupSerialized
	**/
    public Wse3bTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse3bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_3B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse3bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse3bTRCounter = -1;
     public boolean isWse3bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3bTRCounter != sharedCounter;
         localWse3bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3B_TR_LEN = 60;
	/**
	 * 	serialize this Wse3bTR
	 */
   protected void serializeWse3bTR(char[] wse3bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3bTR,0,getStringValue(),beginWse3bTR,WSE_3B_TR_LEN);
       localWse3bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse3bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3bTR() {	 
   		return (substring(getStringValue(),beginWse3bTR,beginWse3bTR + WSE_3B_TR_LEN));
   	}




}
  
