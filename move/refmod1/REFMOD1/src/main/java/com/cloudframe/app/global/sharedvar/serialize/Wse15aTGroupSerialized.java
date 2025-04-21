package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse15aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse15aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse15aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_15A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse15aTR;
	
	/**
	* Constructor for Wse15aTGroupSerialized
	**/
    public Wse15aTGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse15aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_15A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse15aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse15aTRCounter = -1;
     public boolean isWse15aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse15aTRCounter != sharedCounter;
         localWse15aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_15A_TR_LEN = 60;
	/**
	 * 	serialize this Wse15aTR
	 */
   protected void serializeWse15aTR(char[] wse15aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse15aTR,0,getStringValue(),beginWse15aTR,WSE_15A_TR_LEN);
       localWse15aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse15aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse15aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse15aTR() {	 
   		return (substring(getStringValue(),beginWse15aTR,beginWse15aTR + WSE_15A_TR_LEN));
   	}




}
  
