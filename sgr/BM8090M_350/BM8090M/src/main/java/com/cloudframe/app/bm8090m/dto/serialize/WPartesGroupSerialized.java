package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WPartesGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WPartesGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WPartesGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_PARTES_GROUP_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWPartes;
	
	/**
	* Constructor for WPartesGroupSerialized
	**/
    public WPartesGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WPartesGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_PARTES_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWPartes = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWPartesCounter = -1;
     public boolean isWPartesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWPartesCounter != sharedCounter;
         localWPartesCounter = sharedCounter; return hasModified;
     }
	protected static final int W_PARTES_LEN = 22;
	/**
	 * 	serialize this WPartes
	 */
   protected void serializeWPartes(char[] wPartes) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wPartes,0,getStringValue(),beginWPartes,W_PARTES_LEN);
       localWPartesCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWPartesConstraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshWPartes is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWPartes() {	 
   		return (substring(getStringValue(),beginWPartes,beginWPartes + W_PARTES_LEN));
   	}




}
  
