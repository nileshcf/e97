package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class BitMap1800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BitMap1800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BitMap1800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIT_MAP_1800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBitMapByte1800;
            protected  int beginBitMapByte2800;
            protected  int beginBitMapByte3800;
            protected  int beginBitMapByte4800;
            protected  int beginBitMapByte5800;
            protected  int beginBitMapByte6800;
            protected  int beginBitMapByte7800;
            protected  int beginBitMapByte8800;
	
	/**
	* Constructor for BitMap1800Serialized
	**/
    public BitMap1800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BitMap1800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIT_MAP_1800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBitMapByte1800 = getStartOffset() + 0;	// set offset for serialization
  
             beginBitMapByte2800 = getStartOffset() + 1;	// set offset for serialization
  
             beginBitMapByte3800 = getStartOffset() + 2;	// set offset for serialization
  
             beginBitMapByte4800 = getStartOffset() + 3;	// set offset for serialization
  
             beginBitMapByte5800 = getStartOffset() + 4;	// set offset for serialization
  
             beginBitMapByte6800 = getStartOffset() + 5;	// set offset for serialization
  
             beginBitMapByte7800 = getStartOffset() + 6;	// set offset for serialization
  
             beginBitMapByte8800 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBitMapByte1800Counter = -1;
     public boolean isBitMapByte1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte1800Counter != sharedCounter;
         localBitMapByte1800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_1800_LEN = 1;
	/**
	 * 	serialize this BitMapByte1800
	 */
   protected void serializeBitMapByte1800(char[] bitMapByte1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte1800,0,getStringValue(),beginBitMapByte1800,BIT_MAP_BYTE_1800_LEN);
       localBitMapByte1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte1800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte1800() {	 
   		return (substring(getStringValue(),beginBitMapByte1800,beginBitMapByte1800 + BIT_MAP_BYTE_1800_LEN));
   	}
     int localBitMapByte2800Counter = -1;
     public boolean isBitMapByte2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte2800Counter != sharedCounter;
         localBitMapByte2800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_2800_LEN = 1;
	/**
	 * 	serialize this BitMapByte2800
	 */
   protected void serializeBitMapByte2800(char[] bitMapByte2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte2800,0,getStringValue(),beginBitMapByte2800,BIT_MAP_BYTE_2800_LEN);
       localBitMapByte2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte2800() {	 
   		return (substring(getStringValue(),beginBitMapByte2800,beginBitMapByte2800 + BIT_MAP_BYTE_2800_LEN));
   	}
     int localBitMapByte3800Counter = -1;
     public boolean isBitMapByte3800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte3800Counter != sharedCounter;
         localBitMapByte3800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_3800_LEN = 1;
	/**
	 * 	serialize this BitMapByte3800
	 */
   protected void serializeBitMapByte3800(char[] bitMapByte3800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte3800,0,getStringValue(),beginBitMapByte3800,BIT_MAP_BYTE_3800_LEN);
       localBitMapByte3800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte3800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte3800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte3800() {	 
   		return (substring(getStringValue(),beginBitMapByte3800,beginBitMapByte3800 + BIT_MAP_BYTE_3800_LEN));
   	}
     int localBitMapByte4800Counter = -1;
     public boolean isBitMapByte4800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte4800Counter != sharedCounter;
         localBitMapByte4800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_4800_LEN = 1;
	/**
	 * 	serialize this BitMapByte4800
	 */
   protected void serializeBitMapByte4800(char[] bitMapByte4800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte4800,0,getStringValue(),beginBitMapByte4800,BIT_MAP_BYTE_4800_LEN);
       localBitMapByte4800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte4800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte4800() {	 
   		return (substring(getStringValue(),beginBitMapByte4800,beginBitMapByte4800 + BIT_MAP_BYTE_4800_LEN));
   	}
     int localBitMapByte5800Counter = -1;
     public boolean isBitMapByte5800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte5800Counter != sharedCounter;
         localBitMapByte5800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_5800_LEN = 1;
	/**
	 * 	serialize this BitMapByte5800
	 */
   protected void serializeBitMapByte5800(char[] bitMapByte5800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte5800,0,getStringValue(),beginBitMapByte5800,BIT_MAP_BYTE_5800_LEN);
       localBitMapByte5800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte5800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte5800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte5800() {	 
   		return (substring(getStringValue(),beginBitMapByte5800,beginBitMapByte5800 + BIT_MAP_BYTE_5800_LEN));
   	}
     int localBitMapByte6800Counter = -1;
     public boolean isBitMapByte6800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte6800Counter != sharedCounter;
         localBitMapByte6800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_6800_LEN = 1;
	/**
	 * 	serialize this BitMapByte6800
	 */
   protected void serializeBitMapByte6800(char[] bitMapByte6800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte6800,0,getStringValue(),beginBitMapByte6800,BIT_MAP_BYTE_6800_LEN);
       localBitMapByte6800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte6800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte6800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte6800() {	 
   		return (substring(getStringValue(),beginBitMapByte6800,beginBitMapByte6800 + BIT_MAP_BYTE_6800_LEN));
   	}
     int localBitMapByte7800Counter = -1;
     public boolean isBitMapByte7800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte7800Counter != sharedCounter;
         localBitMapByte7800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_7800_LEN = 1;
	/**
	 * 	serialize this BitMapByte7800
	 */
   protected void serializeBitMapByte7800(char[] bitMapByte7800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte7800,0,getStringValue(),beginBitMapByte7800,BIT_MAP_BYTE_7800_LEN);
       localBitMapByte7800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte7800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte7800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte7800() {	 
   		return (substring(getStringValue(),beginBitMapByte7800,beginBitMapByte7800 + BIT_MAP_BYTE_7800_LEN));
   	}
     int localBitMapByte8800Counter = -1;
     public boolean isBitMapByte8800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte8800Counter != sharedCounter;
         localBitMapByte8800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_8800_LEN = 1;
	/**
	 * 	serialize this BitMapByte8800
	 */
   protected void serializeBitMapByte8800(char[] bitMapByte8800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte8800,0,getStringValue(),beginBitMapByte8800,BIT_MAP_BYTE_8800_LEN);
       localBitMapByte8800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte8800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte8800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte8800() {	 
   		return (substring(getStringValue(),beginBitMapByte8800,beginBitMapByte8800 + BIT_MAP_BYTE_8800_LEN));
   	}




}
  
