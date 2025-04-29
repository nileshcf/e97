package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WsaWhenCompiled2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WsaWhenCompiled2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WsaWhenCompiled2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSA_WHEN_COMPILED_2_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaCompiledDate2;
            protected  int beginWsaCompiledTime2;
	
	/**
	* Constructor for WsaWhenCompiled2Serialized
	**/
    public WsaWhenCompiled2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WsaWhenCompiled2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSA_WHEN_COMPILED_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaCompiledDate2 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWsaCompiledTime2 = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaCompiledDate2Counter = -1;
     public boolean isWsaCompiledDate2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCompiledDate2Counter != sharedCounter;
         localWsaCompiledDate2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSA_COMPILED_DATE_2_LEN = 8;
	/**
	 * 	serialize this WsaCompiledDate2
	 */
   protected void serializeWsaCompiledDate2(char[] wsaCompiledDate2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaCompiledDate2,0,getStringValue(),beginWsaCompiledDate2,WSA_COMPILED_DATE_2_LEN);
       localWsaCompiledDate2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaCompiledDate2Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWsaCompiledDate2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaCompiledDate2() {	 
   		return (substring(getStringValue(),beginWsaCompiledDate2,beginWsaCompiledDate2 + WSA_COMPILED_DATE_2_LEN));
   	}
     int localWsaCompiledTime2Counter = -1;
     public boolean isWsaCompiledTime2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCompiledTime2Counter != sharedCounter;
         localWsaCompiledTime2Counter = sharedCounter; return hasModified;
     }
	protected static final int WSA_COMPILED_TIME_2_LEN = 12;
	/**
	 * 	serialize this WsaCompiledTime2
	 */
   protected void serializeWsaCompiledTime2(char[] wsaCompiledTime2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaCompiledTime2,0,getStringValue(),beginWsaCompiledTime2,WSA_COMPILED_TIME_2_LEN);
       localWsaCompiledTime2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaCompiledTime2Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshWsaCompiledTime2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaCompiledTime2() {	 
   		return (substring(getStringValue(),beginWsaCompiledTime2,beginWsaCompiledTime2 + WSA_COMPILED_TIME_2_LEN));
   	}




}
  
