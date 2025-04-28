package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class TotReadCountMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotReadCountMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotReadCountMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOT_READ_COUNT_MSG_600_LENGTH = 67;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTotReadCount600;
	
	/**
	* Constructor for TotReadCountMsg600Serialized
	**/
    public TotReadCountMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotReadCountMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOT_READ_COUNT_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTotReadCount600 = getStartOffset() + 53;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTotReadCount600Counter = -1;
     public boolean isTotReadCount600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTotReadCount600Counter != sharedCounter;
         localTotReadCount600Counter = sharedCounter; return hasModified;
     }
	protected static final int TOT_READ_COUNT_600_LEN = 14;
	/**
	 * 	serialize this TotReadCount600
	 */
   protected void serializeTotReadCount600(char[] totReadCount600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(totReadCount600,0,getStringValue(),beginTotReadCount600,TOT_READ_COUNT_600_LEN);
       localTotReadCount600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTotReadCount600Constraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, false);
   }
    /**
	 *	refreshTotReadCount600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTotReadCount600() {	 
   		return (substring(getStringValue(),beginTotReadCount600,beginTotReadCount600 + TOT_READ_COUNT_600_LEN));
   	}




}
  
