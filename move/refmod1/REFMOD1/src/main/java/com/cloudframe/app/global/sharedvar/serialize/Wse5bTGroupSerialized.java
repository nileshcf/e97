package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Wse5bTGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Wse5bTGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Wse5bTGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSE_5B_TGROUP_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWse5bTR;
	
	/**
	* Constructor for Wse5bTGroupSerialized
	**/
    public Wse5bTGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Wse5bTGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSE_5B_TGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWse5bTR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWse5bTRCounter = -1;
     public boolean isWse5bTRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWse5bTRCounter != sharedCounter;
         localWse5bTRCounter = sharedCounter; return hasModified;
     }
	protected static final int WSE_5B_TR_LEN = 60;
	/**
	 * 	serialize this Wse5bTR
	 */
   protected void serializeWse5bTR(char[] wse5bTR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wse5bTR,0,getStringValue(),beginWse5bTR,WSE_5B_TR_LEN);
       localWse5bTRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWse5bTRConstraints(char[] value) {
   			return super.checkConstraints(value , 60 ,false, false);
   }
    /**
	 *	refreshWse5bTR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWse5bTR() {	 
   		return (substring(getStringValue(),beginWse5bTR,beginWse5bTR + WSE_5B_TR_LEN));
   	}




}
  
