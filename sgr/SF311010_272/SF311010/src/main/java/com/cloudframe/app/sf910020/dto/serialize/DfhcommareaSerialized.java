package com.cloudframe.app.sf910020.dto.serialize;

/**
*  The class DfhcommareaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DfhcommareaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DfhcommareaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DFHCOMMAREA_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBytePassed2000;
            protected  int beginBitValue02000;
            protected  int beginBitValue12000;
            protected  int beginBitValue22000;
            protected  int beginBitValue32000;
            protected  int beginBitValue42000;
            protected  int beginBitValue52000;
            protected  int beginBitValue62000;
            protected  int beginBitValue72000;
	
	/**
	* Constructor for DfhcommareaSerialized
	**/
    public DfhcommareaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DfhcommareaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DFHCOMMAREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBytePassed2000 = getStartOffset() + 0;	// set offset for serialization
  
             beginBitValue02000 = getStartOffset() + 1;	// set offset for serialization
  
             beginBitValue12000 = getStartOffset() + 2;	// set offset for serialization
  
             beginBitValue22000 = getStartOffset() + 3;	// set offset for serialization
  
             beginBitValue32000 = getStartOffset() + 4;	// set offset for serialization
  
             beginBitValue42000 = getStartOffset() + 5;	// set offset for serialization
  
             beginBitValue52000 = getStartOffset() + 6;	// set offset for serialization
  
             beginBitValue62000 = getStartOffset() + 7;	// set offset for serialization
  
             beginBitValue72000 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBytePassed2000Counter = -1;
     public boolean isBytePassed2000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBytePassed2000Counter != sharedCounter;
         localBytePassed2000Counter = sharedCounter; return hasModified;
     }
	protected static final int BYTE_PASSED_2000_LEN = 1;
	/**
	 * 	serialize this BytePassed2000
	 */
   protected void serializeBytePassed2000(char[] bytePassed2000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bytePassed2000,0,getStringValue(),beginBytePassed2000,BYTE_PASSED_2000_LEN);
       localBytePassed2000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBytePassed2000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBytePassed2000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBytePassed2000() {	 
   		return (substring(getStringValue(),beginBytePassed2000,beginBytePassed2000 + BYTE_PASSED_2000_LEN));
   	}
     int localBitValue02000Counter = -1;
     public boolean isBitValue02000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue02000Counter != sharedCounter;
         localBitValue02000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_02000_LEN = 1;
	/**
	 * 	serialize this BitValue02000
	 */
   protected void serializeBitValue02000(char[] bitValue02000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue02000,0,getStringValue(),beginBitValue02000,BIT_VALUE_02000_LEN);
       localBitValue02000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue02000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue02000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue02000() {	 
   		return (substring(getStringValue(),beginBitValue02000,beginBitValue02000 + BIT_VALUE_02000_LEN));
   	}
     int localBitValue12000Counter = -1;
     public boolean isBitValue12000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue12000Counter != sharedCounter;
         localBitValue12000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_12000_LEN = 1;
	/**
	 * 	serialize this BitValue12000
	 */
   protected void serializeBitValue12000(char[] bitValue12000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue12000,0,getStringValue(),beginBitValue12000,BIT_VALUE_12000_LEN);
       localBitValue12000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue12000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue12000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue12000() {	 
   		return (substring(getStringValue(),beginBitValue12000,beginBitValue12000 + BIT_VALUE_12000_LEN));
   	}
     int localBitValue22000Counter = -1;
     public boolean isBitValue22000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue22000Counter != sharedCounter;
         localBitValue22000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_22000_LEN = 1;
	/**
	 * 	serialize this BitValue22000
	 */
   protected void serializeBitValue22000(char[] bitValue22000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue22000,0,getStringValue(),beginBitValue22000,BIT_VALUE_22000_LEN);
       localBitValue22000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue22000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue22000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue22000() {	 
   		return (substring(getStringValue(),beginBitValue22000,beginBitValue22000 + BIT_VALUE_22000_LEN));
   	}
     int localBitValue32000Counter = -1;
     public boolean isBitValue32000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue32000Counter != sharedCounter;
         localBitValue32000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_32000_LEN = 1;
	/**
	 * 	serialize this BitValue32000
	 */
   protected void serializeBitValue32000(char[] bitValue32000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue32000,0,getStringValue(),beginBitValue32000,BIT_VALUE_32000_LEN);
       localBitValue32000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue32000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue32000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue32000() {	 
   		return (substring(getStringValue(),beginBitValue32000,beginBitValue32000 + BIT_VALUE_32000_LEN));
   	}
     int localBitValue42000Counter = -1;
     public boolean isBitValue42000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue42000Counter != sharedCounter;
         localBitValue42000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_42000_LEN = 1;
	/**
	 * 	serialize this BitValue42000
	 */
   protected void serializeBitValue42000(char[] bitValue42000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue42000,0,getStringValue(),beginBitValue42000,BIT_VALUE_42000_LEN);
       localBitValue42000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue42000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue42000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue42000() {	 
   		return (substring(getStringValue(),beginBitValue42000,beginBitValue42000 + BIT_VALUE_42000_LEN));
   	}
     int localBitValue52000Counter = -1;
     public boolean isBitValue52000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue52000Counter != sharedCounter;
         localBitValue52000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_52000_LEN = 1;
	/**
	 * 	serialize this BitValue52000
	 */
   protected void serializeBitValue52000(char[] bitValue52000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue52000,0,getStringValue(),beginBitValue52000,BIT_VALUE_52000_LEN);
       localBitValue52000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue52000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue52000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue52000() {	 
   		return (substring(getStringValue(),beginBitValue52000,beginBitValue52000 + BIT_VALUE_52000_LEN));
   	}
     int localBitValue62000Counter = -1;
     public boolean isBitValue62000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue62000Counter != sharedCounter;
         localBitValue62000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_62000_LEN = 1;
	/**
	 * 	serialize this BitValue62000
	 */
   protected void serializeBitValue62000(char[] bitValue62000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue62000,0,getStringValue(),beginBitValue62000,BIT_VALUE_62000_LEN);
       localBitValue62000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue62000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue62000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue62000() {	 
   		return (substring(getStringValue(),beginBitValue62000,beginBitValue62000 + BIT_VALUE_62000_LEN));
   	}
     int localBitValue72000Counter = -1;
     public boolean isBitValue72000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBitValue72000Counter != sharedCounter;
         localBitValue72000Counter = sharedCounter; return hasModified;
     }
	protected static final int BIT_VALUE_72000_LEN = 1;
	/**
	 * 	serialize this BitValue72000
	 */
   protected void serializeBitValue72000(char[] bitValue72000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bitValue72000,0,getStringValue(),beginBitValue72000,BIT_VALUE_72000_LEN);
       localBitValue72000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBitValue72000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBitValue72000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBitValue72000() {	 
   		return (substring(getStringValue(),beginBitValue72000,beginBitValue72000 + BIT_VALUE_72000_LEN));
   	}




}
  
