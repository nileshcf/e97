package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WRespuestaGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WRespuestaGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WRespuestaGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_RESPUESTA_GROUP_LENGTH = 63;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWRespuesta;
	
	/**
	* Constructor for WRespuestaGroupSerialized
	**/
    public WRespuestaGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WRespuestaGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_RESPUESTA_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWRespuesta = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWRespuestaCounter = -1;
     public boolean isWRespuestaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWRespuestaCounter != sharedCounter;
         localWRespuestaCounter = sharedCounter; return hasModified;
     }
	protected static final int W_RESPUESTA_LEN = 63;
	/**
	 * 	serialize this WRespuesta
	 */
   protected void serializeWRespuesta(char[] wRespuesta) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wRespuesta,0,getStringValue(),beginWRespuesta,W_RESPUESTA_LEN);
       localWRespuestaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWRespuestaConstraints(char[] value) {
   			return super.checkConstraints(value , 63 ,false, false);
   }
    /**
	 *	refreshWRespuesta is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWRespuesta() {	 
   		return (substring(getStringValue(),beginWRespuesta,beginWRespuesta + W_RESPUESTA_LEN));
   	}




}
  
