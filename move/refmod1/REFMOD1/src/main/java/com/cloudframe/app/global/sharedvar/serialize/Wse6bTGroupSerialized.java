package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse6bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse6bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse6bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_6B_TGROUP_LENGTH = 60;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse6bTR;
	
	/**
	* Constructor for Wse6bTGroupSerialized
	**/
    public Wse6bTGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Wse6bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_6B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse6bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse6bTRCounter = -1;
     public boolean isWse6bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse6bTRCounter != sharedCounter;
         localWse6bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_6B_TR_LEN = 60;
	/**
	 * 	serialize this Wse6bTR
	 */
   protected void serializeWse6bTR(char[] wse6bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse6bTR,0,getStringValue(),beginWse6bTR,WSE_6B_TR_LEN);
       localWse6bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse6bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse6bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse6bTR() {	 
   		return (substring(getStringValue(),beginWse6bTR,beginWse6bTR + WSE_6B_TR_LEN));
   	}




}
  
