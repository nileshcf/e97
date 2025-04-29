package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5aTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5aTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5aTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5A_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse5aTR;
	
	/**
	* Constructor for Wse5aTGroupSerialized
	**/
    public Wse5aTGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse5aTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5A_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse5aTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse5aTRCounter = -1;
     public boolean isWse5aTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5aTRCounter != sharedCounter;
         localWse5aTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5A_TR_LEN = 60;
	/**
	 * 	serialize this Wse5aTR
	 */
   protected void serializeWse5aTR(char[] wse5aTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5aTR,0,getStringValue(),beginWse5aTR,WSE_5A_TR_LEN);
       localWse5aTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5aTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse5aTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5aTR() {	 
   		return (substring(getStringValue(),beginWse5aTR,beginWse5aTR + WSE_5A_TR_LEN));
   	}




}
  
