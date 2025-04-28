package com.cloudframe.app.tstcdpag.dto.serialize;

/**
*  The class OutSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUT_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginByteWs;
            protected  int beginHexChar;
            protected  int beginNonDisplayableStr;
	
	/**
	* Constructor for OutSerialized
	**/
    public OutSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginByteWs = getStartOffset() + 0;	// set offset for serialization
  
  
             beginHexChar = getStartOffset() + 17;	// set offset for serialization
  
  
             beginNonDisplayableStr = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localByteWsCounter = -1;
     public boolean isByteWsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localByteWsCounter != sharedCounter;
         localByteWsCounter = sharedCounter; return hasModified;
     }
	protected static final int BYTE_WS_LEN = 1;
	/**
	 * 	serialize this ByteWs
	 */
   protected void serializeByteWs(char[] byteWs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(byteWs,0,getStringValue(),beginByteWs,BYTE_WS_LEN);
       localByteWsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkByteWsConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshByteWs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshByteWs() {	 
   		return (substring(getStringValue(),beginByteWs,beginByteWs + BYTE_WS_LEN));
   	}
     int localHexCharCounter = -1;
     public boolean isHexCharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHexCharCounter != sharedCounter;
         localHexCharCounter = sharedCounter; return hasModified;
     }
	protected static final int HEX_CHAR_LEN = 2;
	/**
	 * 	serialize this HexChar
	 */
   protected void serializeHexChar(char[] hexChar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hexChar,0,getStringValue(),beginHexChar,HEX_CHAR_LEN);
       localHexCharCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHexCharConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshHexChar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHexChar() {	 
   		return (substring(getStringValue(),beginHexChar,beginHexChar + HEX_CHAR_LEN));
   	}
     int localNonDisplayableStrCounter = -1;
     public boolean isNonDisplayableStrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNonDisplayableStrCounter != sharedCounter;
         localNonDisplayableStrCounter = sharedCounter; return hasModified;
     }
	protected static final int NON_DISPLAYABLE_STR_LEN = 25;
	/**
	 * 	serialize this NonDisplayableStr
	 */
   protected void serializeNonDisplayableStr(char[] nonDisplayableStr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nonDisplayableStr,0,getStringValue(),beginNonDisplayableStr,NON_DISPLAYABLE_STR_LEN);
       localNonDisplayableStrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNonDisplayableStrConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshNonDisplayableStr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNonDisplayableStr() {	 
   		return (substring(getStringValue(),beginNonDisplayableStr,beginNonDisplayableStr + NON_DISPLAYABLE_STR_LEN));
   	}




}
  
