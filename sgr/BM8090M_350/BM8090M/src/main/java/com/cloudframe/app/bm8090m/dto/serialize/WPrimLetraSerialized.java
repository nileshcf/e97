package com.cloudframe.app.bm8090m.dto.serialize;

/**
*  The class WPrimLetraSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WPrimLetraSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WPrimLetraSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int W_PRIM_LETRA_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWLetra;
	
	/**
	* Constructor for WPrimLetraSerialized
	**/
    public WPrimLetraSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WPrimLetraSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(W_PRIM_LETRA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWLetra = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localWLetraCounter = -1;
     public boolean isWLetraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWLetraCounter != sharedCounter;
         localWLetraCounter = sharedCounter; return hasModified;
     }
	protected static final int W_LETRA_LEN = 1;
	/**
	 * 	serialize this WLetra
	 */
   protected void serializeWLetra(char[] wLetra) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wLetra,0,getStringValue(),beginWLetra,W_LETRA_LEN);
       localWLetraCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWLetraConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWLetra is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWLetra() {	 
   		return (substring(getStringValue(),beginWLetra,beginWLetra + W_LETRA_LEN));
   	}




}
  
