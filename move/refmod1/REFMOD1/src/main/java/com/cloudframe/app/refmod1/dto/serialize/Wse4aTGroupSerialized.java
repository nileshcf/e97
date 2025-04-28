package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse4aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse4aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse4aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_4A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse4aTR;
	
	/**
	* Constructor for Wse4aTGroupSerialized
	**/
    public Wse4aTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse4aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_4A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse4aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse4aTRCounter = -1;
     public boolean isWse4aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse4aTRCounter != sharedCounter;
         localWse4aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_4A_TR_LEN = 60;
	/**
	 * 	serialize this Wse4aTR
	 */
   protected void serializeWse4aTR(char[] wse4aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse4aTR,0,getStringValue(),beginWse4aTR,WSE_4A_TR_LEN);
       localWse4aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse4aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse4aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse4aTR() {	 
   		return (substring(getStringValue(),beginWse4aTR,beginWse4aTR + WSE_4A_TR_LEN));
   	}




}
  
