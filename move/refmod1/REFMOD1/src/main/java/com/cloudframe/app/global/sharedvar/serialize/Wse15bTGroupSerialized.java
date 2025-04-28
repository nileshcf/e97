package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse15bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse15bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse15bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_15B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse15bTR;
	
	/**
	* Constructor for Wse15bTGroupSerialized
	**/
    public Wse15bTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse15bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_15B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse15bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse15bTRCounter = -1;
     public boolean isWse15bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse15bTRCounter != sharedCounter;
         localWse15bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_15B_TR_LEN = 60;
	/**
	 * 	serialize this Wse15bTR
	 */
   protected void serializeWse15bTR(char[] wse15bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse15bTR,0,getStringValue(),beginWse15bTR,WSE_15B_TR_LEN);
       localWse15bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse15bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse15bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse15bTR() {	 
   		return (substring(getStringValue(),beginWse15bTR,beginWse15bTR + WSE_15B_TR_LEN));
   	}




}
  
