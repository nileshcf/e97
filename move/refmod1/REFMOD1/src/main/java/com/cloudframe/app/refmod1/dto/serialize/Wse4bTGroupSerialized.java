package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse4bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse4bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse4bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_4B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse4bTR;
	
	/**
	* Constructor for Wse4bTGroupSerialized
	**/
    public Wse4bTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse4bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_4B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse4bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse4bTRCounter = -1;
     public boolean isWse4bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4bTRCounter != sharedCounter;
         localWse4bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4B_TR_LEN = 60;
	/**
	 * 	serialize this Wse4bTR
	 */
   protected void serializeWse4bTR(char[] wse4bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4bTR,0,getStringValue(),beginWse4bTR,WSE_4B_TR_LEN);
       localWse4bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse4bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4bTR() {	 
   		return (substring(getStringValue(),beginWse4bTR,beginWse4bTR + WSE_4B_TR_LEN));
   	}




}
  
