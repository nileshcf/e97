package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class EbcdicTextWGroup300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EbcdicTextWGroup300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EbcdicTextWGroup300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EBCDIC_TEXT_WGROUP_300_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEbcdicText300;
	
	/**
	* Constructor for EbcdicTextWGroup300Serialized
	**/
    public EbcdicTextWGroup300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EbcdicTextWGroup300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EBCDIC_TEXT_WGROUP_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginEbcdicText300 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEbcdicText300Counter = -1;
     public boolean isEbcdicText300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEbcdicText300Counter != sharedCounter;
         localEbcdicText300Counter = sharedCounter; return hasModified;
     }
	protected static final int EBCDIC_TEXT_300_LEN = 86;
	/**
	 * 	serialize this EbcdicText300
	 */
   protected void serializeEbcdicText300(char[] ebcdicText300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ebcdicText300,0,getStringValue(),beginEbcdicText300,EBCDIC_TEXT_300_LEN);
       localEbcdicText300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEbcdicText300Constraints(char[] value) {
   			return super.checkConstraints(value , 86 ,false, false);
   }
    /**
	 *	refreshEbcdicText300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEbcdicText300() {	 
   		return (substring(getStringValue(),beginEbcdicText300,beginEbcdicText300 + EBCDIC_TEXT_300_LEN));
   	}




}
  
