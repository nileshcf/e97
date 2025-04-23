package com.cloudframe.app.refmod1.dto.serialize;

/**
*  The class Wse1aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse1aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse1aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_1A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse1aTR;
	
	/**
	* Constructor for Wse1aTGroupSerialized
	**/
    public Wse1aTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse1aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_1A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse1aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse1aTRCounter = -1;
     public boolean isWse1aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse1aTRCounter != sharedCounter;
         localWse1aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_1A_TR_LEN = 60;
	/**
	 * 	serialize this Wse1aTR
	 */
   protected void serializeWse1aTR(char[] wse1aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse1aTR,0,getStringValue(),beginWse1aTR,WSE_1A_TR_LEN);
       localWse1aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse1aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse1aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse1aTR() {	 
   		return (substring(getStringValue(),beginWse1aTR,beginWse1aTR + WSE_1A_TR_LEN));
   	}




}
  
