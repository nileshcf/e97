package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse6aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse6aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse6aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_6A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse6aTR;
	
	/**
	* Constructor for Wse6aTGroupSerialized
	**/
    public Wse6aTGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse6aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_6A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse6aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse6aTRCounter = -1;
     public boolean isWse6aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6aTRCounter != sharedCounter;
         localWse6aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6A_TR_LEN = 60;
	/**
	 * 	serialize this Wse6aTR
	 */
   protected void serializeWse6aTR(char[] wse6aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6aTR,0,getStringValue(),beginWse6aTR,WSE_6A_TR_LEN);
       localWse6aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse6aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6aTR() {	 
   		return (substring(getStringValue(),beginWse6aTR,beginWse6aTR + WSE_6A_TR_LEN));
   	}




}
  
