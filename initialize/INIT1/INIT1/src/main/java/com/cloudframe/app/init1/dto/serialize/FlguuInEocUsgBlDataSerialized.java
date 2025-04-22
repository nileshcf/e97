package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FlguuInEocUsgBlDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FlguuInEocUsgBlDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FlguuInEocUsgBlDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FLGUU_IN_EOC_USG_BL_DATA_LENGTH = 1017;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFlguuInEocUsgBlHdr;
	
	/**
	* Constructor for FlguuInEocUsgBlDataSerialized
	**/
    public FlguuInEocUsgBlDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FlguuInEocUsgBlDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FLGUU_IN_EOC_USG_BL_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFlguuInEocUsgBlHdr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFlguuInEocUsgBlHdrCounter = -1;
     public boolean isFlguuInEocUsgBlHdrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFlguuInEocUsgBlHdrCounter != sharedCounter;
         localFlguuInEocUsgBlHdrCounter = sharedCounter; return hasModified;
     }
	protected static final int FLGUU_IN_EOC_USG_BL_HDR_LEN = 1010;
	/**
	 * 	serialize this FlguuInEocUsgBlHdr
	 */
   protected void serializeFlguuInEocUsgBlHdr(char[] flguuInEocUsgBlHdr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(flguuInEocUsgBlHdr,0,getStringValue(),beginFlguuInEocUsgBlHdr,FLGUU_IN_EOC_USG_BL_HDR_LEN);
       localFlguuInEocUsgBlHdrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFlguuInEocUsgBlHdrConstraints(char[] value) {
   			return super.checkConstraints(value , 1010 ,false, false);
   }
    /**
	 *	refreshFlguuInEocUsgBlHdr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFlguuInEocUsgBlHdr() {	 
   		return (substring(getStringValue(),beginFlguuInEocUsgBlHdr,beginFlguuInEocUsgBlHdr + FLGUU_IN_EOC_USG_BL_HDR_LEN));
   	}




}
  
