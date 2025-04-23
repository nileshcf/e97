package com.cloudframe.app.ip088030.dto.serialize;

/**
*  The class MsgsWrite600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsgsWrite600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsgsWrite600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSGS_WRITE_600_LENGTH = 43;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWriteCnt600;
	
	/**
	* Constructor for MsgsWrite600Serialized
	**/
    public MsgsWrite600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MsgsWrite600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSGS_WRITE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWriteCnt600 = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWriteCnt600Counter = -1;
     public boolean isWriteCnt600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWriteCnt600Counter != sharedCounter;
         localWriteCnt600Counter = sharedCounter; return hasModified;
     }
	protected static final int WRITE_CNT_600_LEN = 11;
	/**
	 * 	serialize this WriteCnt600
	 */
   protected void serializeWriteCnt600(char[] writeCnt600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(writeCnt600,0,getStringValue(),beginWriteCnt600,WRITE_CNT_600_LEN);
       localWriteCnt600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWriteCnt600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshWriteCnt600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWriteCnt600() {	 
   		return (substring(getStringValue(),beginWriteCnt600,beginWriteCnt600 + WRITE_CNT_600_LEN));
   	}




}
  
