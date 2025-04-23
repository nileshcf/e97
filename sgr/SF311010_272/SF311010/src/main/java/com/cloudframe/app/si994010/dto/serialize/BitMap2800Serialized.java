package com.cloudframe.app.si994010.dto.serialize;

/**
*  The class BitMap2800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BitMap2800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BitMap2800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIT_MAP_2800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBitMapByte9800;
            protected  int beginBitMapByte10800;
            protected  int beginBitMapByte11800;
            protected  int beginBitMapByte12800;
            protected  int beginBitMapByte13800;
            protected  int beginBitMapByte14800;
            protected  int beginBitMapByte15800;
            protected  int beginBitMapByte16800;
	
	/**
	* Constructor for BitMap2800Serialized
	**/
    public BitMap2800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in BitMap2800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIT_MAP_2800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBitMapByte9800 = getStartOffset() + 0;	// set offset for serialization
  
             beginBitMapByte10800 = getStartOffset() + 1;	// set offset for serialization
  
             beginBitMapByte11800 = getStartOffset() + 2;	// set offset for serialization
  
             beginBitMapByte12800 = getStartOffset() + 3;	// set offset for serialization
  
             beginBitMapByte13800 = getStartOffset() + 4;	// set offset for serialization
  
             beginBitMapByte14800 = getStartOffset() + 5;	// set offset for serialization
  
             beginBitMapByte15800 = getStartOffset() + 6;	// set offset for serialization
  
             beginBitMapByte16800 = getStartOffset() + 7;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBitMapByte9800Counter = -1;
     public boolean isBitMapByte9800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte9800Counter != sharedCounter;
         localBitMapByte9800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_9800_LEN = 1;
	/**
	 * 	serialize this BitMapByte9800
	 */
   protected void serializeBitMapByte9800(char[] bitMapByte9800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte9800,0,getStringValue(),beginBitMapByte9800,BIT_MAP_BYTE_9800_LEN);
       localBitMapByte9800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte9800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte9800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte9800() {	 
   		return (substring(getStringValue(),beginBitMapByte9800,beginBitMapByte9800 + BIT_MAP_BYTE_9800_LEN));
   	}
     int localBitMapByte10800Counter = -1;
     public boolean isBitMapByte10800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte10800Counter != sharedCounter;
         localBitMapByte10800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_10800_LEN = 1;
	/**
	 * 	serialize this BitMapByte10800
	 */
   protected void serializeBitMapByte10800(char[] bitMapByte10800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte10800,0,getStringValue(),beginBitMapByte10800,BIT_MAP_BYTE_10800_LEN);
       localBitMapByte10800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte10800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte10800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte10800() {	 
   		return (substring(getStringValue(),beginBitMapByte10800,beginBitMapByte10800 + BIT_MAP_BYTE_10800_LEN));
   	}
     int localBitMapByte11800Counter = -1;
     public boolean isBitMapByte11800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte11800Counter != sharedCounter;
         localBitMapByte11800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_11800_LEN = 1;
	/**
	 * 	serialize this BitMapByte11800
	 */
   protected void serializeBitMapByte11800(char[] bitMapByte11800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte11800,0,getStringValue(),beginBitMapByte11800,BIT_MAP_BYTE_11800_LEN);
       localBitMapByte11800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte11800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte11800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte11800() {	 
   		return (substring(getStringValue(),beginBitMapByte11800,beginBitMapByte11800 + BIT_MAP_BYTE_11800_LEN));
   	}
     int localBitMapByte12800Counter = -1;
     public boolean isBitMapByte12800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte12800Counter != sharedCounter;
         localBitMapByte12800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_12800_LEN = 1;
	/**
	 * 	serialize this BitMapByte12800
	 */
   protected void serializeBitMapByte12800(char[] bitMapByte12800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte12800,0,getStringValue(),beginBitMapByte12800,BIT_MAP_BYTE_12800_LEN);
       localBitMapByte12800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte12800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte12800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte12800() {	 
   		return (substring(getStringValue(),beginBitMapByte12800,beginBitMapByte12800 + BIT_MAP_BYTE_12800_LEN));
   	}
     int localBitMapByte13800Counter = -1;
     public boolean isBitMapByte13800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte13800Counter != sharedCounter;
         localBitMapByte13800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_13800_LEN = 1;
	/**
	 * 	serialize this BitMapByte13800
	 */
   protected void serializeBitMapByte13800(char[] bitMapByte13800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte13800,0,getStringValue(),beginBitMapByte13800,BIT_MAP_BYTE_13800_LEN);
       localBitMapByte13800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte13800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte13800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte13800() {	 
   		return (substring(getStringValue(),beginBitMapByte13800,beginBitMapByte13800 + BIT_MAP_BYTE_13800_LEN));
   	}
     int localBitMapByte14800Counter = -1;
     public boolean isBitMapByte14800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte14800Counter != sharedCounter;
         localBitMapByte14800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_14800_LEN = 1;
	/**
	 * 	serialize this BitMapByte14800
	 */
   protected void serializeBitMapByte14800(char[] bitMapByte14800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte14800,0,getStringValue(),beginBitMapByte14800,BIT_MAP_BYTE_14800_LEN);
       localBitMapByte14800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte14800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte14800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte14800() {	 
   		return (substring(getStringValue(),beginBitMapByte14800,beginBitMapByte14800 + BIT_MAP_BYTE_14800_LEN));
   	}
     int localBitMapByte15800Counter = -1;
     public boolean isBitMapByte15800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte15800Counter != sharedCounter;
         localBitMapByte15800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_15800_LEN = 1;
	/**
	 * 	serialize this BitMapByte15800
	 */
   protected void serializeBitMapByte15800(char[] bitMapByte15800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte15800,0,getStringValue(),beginBitMapByte15800,BIT_MAP_BYTE_15800_LEN);
       localBitMapByte15800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte15800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte15800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte15800() {	 
   		return (substring(getStringValue(),beginBitMapByte15800,beginBitMapByte15800 + BIT_MAP_BYTE_15800_LEN));
   	}
     int localBitMapByte16800Counter = -1;
     public boolean isBitMapByte16800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitMapByte16800Counter != sharedCounter;
         localBitMapByte16800Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_MAP_BYTE_16800_LEN = 1;
	/**
	 * 	serialize this BitMapByte16800
	 */
   protected void serializeBitMapByte16800(char[] bitMapByte16800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitMapByte16800,0,getStringValue(),beginBitMapByte16800,BIT_MAP_BYTE_16800_LEN);
       localBitMapByte16800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitMapByte16800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitMapByte16800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitMapByte16800() {	 
   		return (substring(getStringValue(),beginBitMapByte16800,beginBitMapByte16800 + BIT_MAP_BYTE_16800_LEN));
   	}




}
  
