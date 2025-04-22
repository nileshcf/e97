package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse2bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse2bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse2bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_2B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse2bTR;
	
	/**
	* Constructor for Wse2bTGroupSerialized
	**/
    public Wse2bTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse2bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_2B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse2bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse2bTRCounter = -1;
     public boolean isWse2bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse2bTRCounter != sharedCounter;
         localWse2bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_2B_TR_LEN = 60;
	/**
	 * 	serialize this Wse2bTR
	 */
   protected void serializeWse2bTR(char[] wse2bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse2bTR,0,getStringValue(),beginWse2bTR,WSE_2B_TR_LEN);
       localWse2bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse2bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse2bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse2bTR() {	 
   		return (substring(getStringValue(),beginWse2bTR,beginWse2bTR + WSE_2B_TR_LEN));
   	}




}
  
