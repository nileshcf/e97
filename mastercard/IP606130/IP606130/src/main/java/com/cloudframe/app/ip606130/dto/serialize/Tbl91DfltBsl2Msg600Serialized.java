package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Tbl91DfltBsl2Msg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Tbl91DfltBsl2Msg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Tbl91DfltBsl2Msg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBL_91_DFLT_BSL_2_MSG_600_LENGTH = 54;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBsl2BuildCount60091;
	
	/**
	* Constructor for Tbl91DfltBsl2Msg600Serialized
	**/
    public Tbl91DfltBsl2Msg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Tbl91DfltBsl2Msg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBL_91_DFLT_BSL_2_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginBsl2BuildCount60091 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBsl2BuildCount60091Counter = -1;
     public boolean isBsl2BuildCount60091Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBsl2BuildCount60091Counter != sharedCounter;
         localBsl2BuildCount60091Counter = sharedCounter; return hasModified;
     }
	protected static final int BSL_2_BUILD_COUNT_60091_LEN = 10;
	/**
	 * 	serialize this Bsl2BuildCount60091
	 */
   protected void serializeBsl2BuildCount60091(char[] bsl2BuildCount60091) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bsl2BuildCount60091,0,getStringValue(),beginBsl2BuildCount60091,BSL_2_BUILD_COUNT_60091_LEN);
       localBsl2BuildCount60091Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBsl2BuildCount60091Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBsl2BuildCount60091 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBsl2BuildCount60091() {	 
   		return (substring(getStringValue(),beginBsl2BuildCount60091,beginBsl2BuildCount60091 + BSL_2_BUILD_COUNT_60091_LEN));
   	}




}
  
