package com.cloudframe.app.init1.dto.serialize;

/**
*  The class RlduuInEocUsgBlDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RlduuInEocUsgBlDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RlduuInEocUsgBlDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLDUU_IN_EOC_USG_BL_DATA_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlduuInEocUsgBlHdr;
	
	/**
	* Constructor for RlduuInEocUsgBlDataSerialized
	**/
    public RlduuInEocUsgBlDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RlduuInEocUsgBlDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLDUU_IN_EOC_USG_BL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRlduuInEocUsgBlHdr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localRlduuInEocUsgBlHdrCounter = -1;
     public boolean isRlduuInEocUsgBlHdrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlduuInEocUsgBlHdrCounter != sharedCounter;
         localRlduuInEocUsgBlHdrCounter = sharedCounter; return hasModified;
     }
	protected static final int RLDUU_IN_EOC_USG_BL_HDR_LEN = 1010;
	/**
	 * 	serialize this RlduuInEocUsgBlHdr
	 */
   protected void serializeRlduuInEocUsgBlHdr(char[] rlduuInEocUsgBlHdr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlduuInEocUsgBlHdr,0,getStringValue(),beginRlduuInEocUsgBlHdr,RLDUU_IN_EOC_USG_BL_HDR_LEN);
       localRlduuInEocUsgBlHdrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlduuInEocUsgBlHdrConstraints(char[] value) {
   			return super.checkConstraints(value , 1010 ,false, false);
   }
    /**
	 *	refreshRlduuInEocUsgBlHdr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlduuInEocUsgBlHdr() {	 
   		return (substring(getStringValue(),beginRlduuInEocUsgBlHdr,beginRlduuInEocUsgBlHdr + RLDUU_IN_EOC_USG_BL_HDR_LEN));
   	}




}
  
