package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WRespuestaMrGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WRespuestaMrGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WRespuestaMrGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_RESPUESTA_MR_GROUP_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWRespuestaMr;
	
	/**
	* Constructor for WRespuestaMrGroupSerialized
	**/
    public WRespuestaMrGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WRespuestaMrGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_RESPUESTA_MR_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWRespuestaMr = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWRespuestaMrCounter = -1;
     public boolean isWRespuestaMrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWRespuestaMrCounter != sharedCounter;
         localWRespuestaMrCounter = sharedCounter; return hasModified;
     }
	protected static final int W_RESPUESTA_MR_LEN = 25;
	/**
	 * 	serialize this WRespuestaMr
	 */
   protected void serializeWRespuestaMr(char[] wRespuestaMr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wRespuestaMr,0,getStringValue(),beginWRespuestaMr,W_RESPUESTA_MR_LEN);
       localWRespuestaMrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWRespuestaMrConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshWRespuestaMr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWRespuestaMr() {	 
   		return (substring(getStringValue(),beginWRespuestaMr,beginWRespuestaMr + W_RESPUESTA_MR_LEN));
   	}




}
  
