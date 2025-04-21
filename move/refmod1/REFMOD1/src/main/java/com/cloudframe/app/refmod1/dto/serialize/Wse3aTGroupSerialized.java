package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse3aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse3aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse3aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_3A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse3aTR;
	
	/**
	* Constructor for Wse3aTGroupSerialized
	**/
    public Wse3aTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse3aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_3A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse3aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse3aTRCounter = -1;
     public boolean isWse3aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse3aTRCounter != sharedCounter;
         localWse3aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_3A_TR_LEN = 60;
	/**
	 * 	serialize this Wse3aTR
	 */
   protected void serializeWse3aTR(char[] wse3aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse3aTR,0,getStringValue(),beginWse3aTR,WSE_3A_TR_LEN);
       localWse3aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse3aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse3aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse3aTR() {	 
   		return (substring(getStringValue(),beginWse3aTR,beginWse3aTR + WSE_3A_TR_LEN));
   	}




}
  
