package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse16bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse16bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse16bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_16B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse16bTR;
	
	/**
	* Constructor for Wse16bTGroupSerialized
	**/
    public Wse16bTGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse16bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_16B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse16bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse16bTRCounter = -1;
     public boolean isWse16bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse16bTRCounter != sharedCounter;
         localWse16bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_16B_TR_LEN = 60;
	/**
	 * 	serialize this Wse16bTR
	 */
   protected void serializeWse16bTR(char[] wse16bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse16bTR,0,getStringValue(),beginWse16bTR,WSE_16B_TR_LEN);
       localWse16bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse16bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse16bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse16bTR() {	 
   		return (substring(getStringValue(),beginWse16bTR,beginWse16bTR + WSE_16B_TR_LEN));
   	}




}
  
