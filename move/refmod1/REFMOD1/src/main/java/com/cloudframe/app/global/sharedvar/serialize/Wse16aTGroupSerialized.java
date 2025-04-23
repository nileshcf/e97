package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse16aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse16aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse16aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_16A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse16aTR;
	
	/**
	* Constructor for Wse16aTGroupSerialized
	**/
    public Wse16aTGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse16aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_16A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse16aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse16aTRCounter = -1;
     public boolean isWse16aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse16aTRCounter != sharedCounter;
         localWse16aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_16A_TR_LEN = 60;
	/**
	 * 	serialize this Wse16aTR
	 */
   protected void serializeWse16aTR(char[] wse16aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse16aTR,0,getStringValue(),beginWse16aTR,WSE_16A_TR_LEN);
       localWse16aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse16aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse16aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse16aTR() {	 
   		return (substring(getStringValue(),beginWse16aTR,beginWse16aTR + WSE_16A_TR_LEN));
   	}




}
  
