package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WRespuestaRGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WRespuestaRGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WRespuestaRGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_RESPUESTA_RGROUP_LENGTH = 42;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWRespuestaR;
	
	/**
	* Constructor for WRespuestaRGroupSerialized
	**/
    public WRespuestaRGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WRespuestaRGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_RESPUESTA_RGROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWRespuestaR = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWRespuestaRCounter = -1;
     public boolean isWRespuestaRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWRespuestaRCounter != sharedCounter;
         localWRespuestaRCounter = sharedCounter; return hasModified;
     }
	protected static final int W_RESPUESTA_R_LEN = 42;
	/**
	 * 	serialize this WRespuestaR
	 */
   protected void serializeWRespuestaR(char[] wRespuestaR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wRespuestaR,0,getStringValue(),beginWRespuestaR,W_RESPUESTA_R_LEN);
       localWRespuestaRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWRespuestaRConstraints(char[] value) {
   			return super.checkConstraints(value , 42 ,false, false);
   }
    /**
	 *	refreshWRespuestaR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWRespuestaR() {	 
   		return (substring(getStringValue(),beginWRespuestaR,beginWRespuestaR + W_RESPUESTA_R_LEN));
   	}




}
  
