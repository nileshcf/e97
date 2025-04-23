package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class AsciiBytesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsciiBytesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsciiBytesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASCII_BYTES_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNullByte;
            protected  int beginAsciiChar;
	
	/**
	* Constructor for AsciiBytesSerialized
	**/
    public AsciiBytesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AsciiBytesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsciiBytesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AsciiBytesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this AsciiBytesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in AsciiBytesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASCII_BYTES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNullByte = getStartOffset() + 0;	// set offset for serialization
  
             beginAsciiChar = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNullByteCounter = -1;
     public boolean isNullByteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNullByteCounter != sharedCounter;
         localNullByteCounter = sharedCounter; return hasModified;
     }
	protected static final int NULL_BYTE_LEN = 1;
	/**
	 * 	serialize this NullByte
	 */
   protected void serializeNullByte(char[] nullByte) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nullByte,0,getStringValue(),beginNullByte,NULL_BYTE_LEN);
       localNullByteCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNullByteConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshNullByte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNullByte() {	 
   		return (substring(getStringValue(),beginNullByte,beginNullByte + NULL_BYTE_LEN));
   	}
     int localAsciiCharCounter = -1;
     public boolean isAsciiCharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsciiCharCounter != sharedCounter;
         localAsciiCharCounter = sharedCounter; return hasModified;
     }
	protected static final int ASCII_CHAR_LEN = 1;
	/**
	 * 	serialize this AsciiChar
	 */
   protected void serializeAsciiChar(char[] asciiChar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asciiChar,0,getStringValue(),beginAsciiChar,ASCII_CHAR_LEN);
       localAsciiCharCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsciiCharConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAsciiChar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsciiChar() {	 
   		return (substring(getStringValue(),beginAsciiChar,beginAsciiChar + ASCII_CHAR_LEN));
   	}




}
  
