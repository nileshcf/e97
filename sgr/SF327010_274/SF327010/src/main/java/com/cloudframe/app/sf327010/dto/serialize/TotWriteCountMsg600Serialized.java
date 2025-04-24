package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class TotWriteCountMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotWriteCountMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotWriteCountMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOT_WRITE_COUNT_MSG_600_LENGTH = 67;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWriteCount600;
	
	/**
	* Constructor for TotWriteCountMsg600Serialized
	**/
    public TotWriteCountMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotWriteCountMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOT_WRITE_COUNT_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWriteCount600 = getStartOffset() + 53;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWriteCount600Counter = -1;
     public boolean isWriteCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteCount600Counter != sharedCounter;
         localWriteCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int WRITE_COUNT_600_LEN = 14;
	/**
	 * 	serialize this WriteCount600
	 */
   protected void serializeWriteCount600(char[] writeCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(writeCount600,0,getStringValue(),beginWriteCount600,WRITE_COUNT_600_LEN);
       localWriteCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWriteCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshWriteCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWriteCount600() {	 
   		return (substring(getStringValue(),beginWriteCount600,beginWriteCount600 + WRITE_COUNT_600_LEN));
   	}




}
  
