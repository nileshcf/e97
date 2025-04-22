package com.cloudframe.app.blkdblk.dto.serialize;

/**
*  The class EbcdicBytesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:16. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EbcdicBytesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EbcdicBytesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EBCDIC_BYTES_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNullByte01;
            protected  int beginEbcdicChar;
	
	/**
	* Constructor for EbcdicBytesSerialized
	**/
    public EbcdicBytesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for EbcdicBytesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicBytesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this EbcdicBytesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this EbcdicBytesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in EbcdicBytesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EBCDIC_BYTES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNullByte01 = getStartOffset() + 0;	// set offset for serialization
  
             beginEbcdicChar = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNullByte01Counter = -1;
     public boolean isNullByte01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNullByte01Counter != sharedCounter;
         localNullByte01Counter = sharedCounter; return hasModified;
     }
	protected static final int NULL_BYTE_01_LEN = 1;
	/**
	 * 	serialize this NullByte01
	 */
   protected void serializeNullByte01(char[] nullByte01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nullByte01,0,getStringValue(),beginNullByte01,NULL_BYTE_01_LEN);
       localNullByte01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNullByte01Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshNullByte01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNullByte01() {	 
   		return (substring(getStringValue(),beginNullByte01,beginNullByte01 + NULL_BYTE_01_LEN));
   	}
     int localEbcdicCharCounter = -1;
     public boolean isEbcdicCharModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEbcdicCharCounter != sharedCounter;
         localEbcdicCharCounter = sharedCounter; return hasModified;
     }
	protected static final int EBCDIC_CHAR_LEN = 1;
	/**
	 * 	serialize this EbcdicChar
	 */
   protected void serializeEbcdicChar(char[] ebcdicChar) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ebcdicChar,0,getStringValue(),beginEbcdicChar,EBCDIC_CHAR_LEN);
       localEbcdicCharCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEbcdicCharConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshEbcdicChar is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEbcdicChar() {	 
   		return (substring(getStringValue(),beginEbcdicChar,beginEbcdicChar + EBCDIC_CHAR_LEN));
   	}




}
  
