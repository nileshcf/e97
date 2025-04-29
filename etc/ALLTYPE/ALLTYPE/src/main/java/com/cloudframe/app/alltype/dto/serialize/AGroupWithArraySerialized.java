package com.cloudframe.app.alltype.dto.serialize;

/**
*  The class AGroupWithArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:24. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class AGroupWithArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AGroupWithArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int A_GROUP_WITH_ARRAY_LENGTH = 418;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginABinarySign1;
           protected static final int A_BINARY_SIGN_1_SIZE = 2;
           protected int beginABinarySign2;
           protected static final int A_BINARY_SIGN_2_SIZE = 2;
           protected int beginABinarySign3;
           protected static final int A_BINARY_SIGN_3_SIZE = 2;
           protected int beginABinaryUnsign1;
           protected static final int A_BINARY_UNSIGN_1_SIZE = 2;
           protected int beginABinaryUnsign2;
           protected static final int A_BINARY_UNSIGN_2_SIZE = 2;
           protected int beginABinaryUnsign3;
           protected static final int A_BINARY_UNSIGN_3_SIZE = 2;
           protected int beginADisplaySign1;
           protected static final int A_DISPLAY_SIGN_1_SIZE = 2;
           protected int beginADisplaySign2;
           protected static final int A_DISPLAY_SIGN_2_SIZE = 2;
           protected int beginADisplaySign3;
           protected static final int A_DISPLAY_SIGN_3_SIZE = 2;
           protected int beginADisplayUnsign1;
           protected static final int A_DISPLAY_UNSIGN_1_SIZE = 2;
           protected int beginADisplayUnsign2;
           protected static final int A_DISPLAY_UNSIGN_2_SIZE = 2;
           protected int beginADisplayUnsign3;
           protected static final int A_DISPLAY_UNSIGN_3_SIZE = 2;
           protected int beginAPackedSign1;
           protected static final int A_PACKED_SIGN_1_SIZE = 2;
           protected int beginAPackedSign2;
           protected static final int A_PACKED_SIGN_2_SIZE = 2;
           protected int beginAPackedSign3;
           protected static final int A_PACKED_SIGN_3_SIZE = 2;
           protected int beginAPackedUnsign1;
           protected static final int A_PACKED_UNSIGN_1_SIZE = 2;
           protected int beginAPackedUnsign2;
           protected static final int A_PACKED_UNSIGN_2_SIZE = 2;
           protected int beginAPackedUnsign3;
           protected static final int A_PACKED_UNSIGN_3_SIZE = 2;
           protected int beginADecBinarySign1;
           protected static final int A_DEC_BINARY_SIGN_1_SIZE = 2;
           protected int beginADecBinarySign2;
           protected static final int A_DEC_BINARY_SIGN_2_SIZE = 2;
           protected int beginADecBinarySign3;
           protected static final int A_DEC_BINARY_SIGN_3_SIZE = 2;
           protected int beginADecBinaryUnsign1;
           protected static final int A_DEC_BINARY_UNSIGN_1_SIZE = 2;
           protected int beginADecBinaryUnsign2;
           protected static final int A_DEC_BINARY_UNSIGN_2_SIZE = 2;
           protected int beginADecBinaryUnsign3;
           protected static final int A_DEC_BINARY_UNSIGN_3_SIZE = 2;
           protected int beginADecDisplaySign1;
           protected static final int A_DEC_DISPLAY_SIGN_1_SIZE = 2;
           protected int beginADecDisplaySign2;
           protected static final int A_DEC_DISPLAY_SIGN_2_SIZE = 2;
           protected int beginADecDisplaySign3;
           protected static final int A_DEC_DISPLAY_SIGN_3_SIZE = 2;
           protected int beginADecDisplayUnsign1;
           protected static final int A_DEC_DISPLAY_UNSIGN_1_SIZE = 2;
           protected int beginADecDisplayUnsign2;
           protected static final int A_DEC_DISPLAY_UNSIGN_2_SIZE = 2;
           protected int beginADecDisplayUnsign3;
           protected static final int A_DEC_DISPLAY_UNSIGN_3_SIZE = 2;
           protected int beginADecPackedSign1;
           protected static final int A_DEC_PACKED_SIGN_1_SIZE = 2;
           protected int beginADecPackedSign2;
           protected static final int A_DEC_PACKED_SIGN_2_SIZE = 2;
           protected int beginADecPackedSign3;
           protected static final int A_DEC_PACKED_SIGN_3_SIZE = 2;
           protected int beginADecPackedUnsign1;
           protected static final int A_DEC_PACKED_UNSIGN_1_SIZE = 2;
           protected int beginADecPackedUnsign2;
           protected static final int A_DEC_PACKED_UNSIGN_2_SIZE = 2;
           protected int beginADecPackedUnsign3;
           protected static final int A_DEC_PACKED_UNSIGN_3_SIZE = 2;
           protected int beginAChar;
           protected static final int A_CHAR_SIZE = 2;
           protected int beginACharJustRight;
           protected static final int A_CHAR_JUST_RIGHT_SIZE = 2;
           protected int beginACharZero;
           protected static final int A_CHAR_ZERO_SIZE = 2;
	
	/**
	* Constructor for AGroupWithArraySerialized
	**/
    public AGroupWithArraySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AGroupWithArraySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AGroupWithArraySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AGroupWithArraySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,209); // serialize this field at offset 209 by default 
    }
    
	/**
	* sets parent for this AGroupWithArraySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 209 by default
    }    
	/**
	* initializes the field in AGroupWithArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(A_GROUP_WITH_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginABinarySign1 = getStartOffset() + 0; // set offset for serialization
  
	        beginABinarySign2 = getStartOffset() + 4; // set offset for serialization
  
	        beginABinarySign3 = getStartOffset() + 12; // set offset for serialization
  
	        beginABinaryUnsign1 = getStartOffset() + 28; // set offset for serialization
  
	        beginABinaryUnsign2 = getStartOffset() + 32; // set offset for serialization
  
	        beginABinaryUnsign3 = getStartOffset() + 40; // set offset for serialization
  
	        beginADisplaySign1 = getStartOffset() + 56; // set offset for serialization
  
	        beginADisplaySign2 = getStartOffset() + 64; // set offset for serialization
  
	        beginADisplaySign3 = getStartOffset() + 80; // set offset for serialization
  
	        beginADisplayUnsign1 = getStartOffset() + 100; // set offset for serialization
  
	        beginADisplayUnsign2 = getStartOffset() + 108; // set offset for serialization
  
	        beginADisplayUnsign3 = getStartOffset() + 124; // set offset for serialization
  
	        beginAPackedSign1 = getStartOffset() + 144; // set offset for serialization
  
	        beginAPackedSign2 = getStartOffset() + 150; // set offset for serialization
  
	        beginAPackedSign3 = getStartOffset() + 160; // set offset for serialization
  
	        beginAPackedUnsign1 = getStartOffset() + 172; // set offset for serialization
  
	        beginAPackedUnsign2 = getStartOffset() + 178; // set offset for serialization
  
	        beginAPackedUnsign3 = getStartOffset() + 188; // set offset for serialization
  
	        beginADecBinarySign1 = getStartOffset() + 200; // set offset for serialization
  
	        beginADecBinarySign2 = getStartOffset() + 204; // set offset for serialization
  
	        beginADecBinarySign3 = getStartOffset() + 212; // set offset for serialization
  
	        beginADecBinaryUnsign1 = getStartOffset() + 228; // set offset for serialization
  
	        beginADecBinaryUnsign2 = getStartOffset() + 232; // set offset for serialization
  
	        beginADecBinaryUnsign3 = getStartOffset() + 240; // set offset for serialization
  
	        beginADecDisplaySign1 = getStartOffset() + 256; // set offset for serialization
  
	        beginADecDisplaySign2 = getStartOffset() + 262; // set offset for serialization
  
	        beginADecDisplaySign3 = getStartOffset() + 278; // set offset for serialization
  
	        beginADecDisplayUnsign1 = getStartOffset() + 298; // set offset for serialization
  
	        beginADecDisplayUnsign2 = getStartOffset() + 304; // set offset for serialization
  
	        beginADecDisplayUnsign3 = getStartOffset() + 318; // set offset for serialization
  
	        beginADecPackedSign1 = getStartOffset() + 338; // set offset for serialization
  
	        beginADecPackedSign2 = getStartOffset() + 342; // set offset for serialization
  
	        beginADecPackedSign3 = getStartOffset() + 352; // set offset for serialization
  
	        beginADecPackedUnsign1 = getStartOffset() + 364; // set offset for serialization
  
	        beginADecPackedUnsign2 = getStartOffset() + 368; // set offset for serialization
  
	        beginADecPackedUnsign3 = getStartOffset() + 376; // set offset for serialization
  
	        beginAChar = getStartOffset() + 388; // set offset for serialization
  
	        beginACharJustRight = getStartOffset() + 398; // set offset for serialization
  
	        beginACharZero = getStartOffset() + 408; // set offset for serialization
  
	   /*  end of offset */
	}

	protected static final int A_BINARY_SIGN_1_LEN = 2;
    /**
	 * 	serialize this ABinarySign1 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeABinarySign1(int index, short value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginABinarySign1 + index*A_BINARY_SIGN_1_LEN), A_BINARY_SIGN_1_LEN);
   }

	protected static final int A_BINARY_SIGN_2_LEN = 4;
    /**
	 * 	serialize this ABinarySign2 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeABinarySign2(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginABinarySign2 + index*A_BINARY_SIGN_2_LEN), A_BINARY_SIGN_2_LEN);
   }

	protected static final int A_BINARY_SIGN_3_LEN = 8;
    /**
	 * 	serialize this ABinarySign3 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeABinarySign3(int index, long value) {
           long number = (long) value;
           replaceValue( getBinaryString(number) , (beginABinarySign3 + index*A_BINARY_SIGN_3_LEN), A_BINARY_SIGN_3_LEN);
   }

	protected static final int A_BINARY_UNSIGN_1_LEN = 2;
    /**
	 * 	serialize this ABinaryUnsign1 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeABinaryUnsign1(int index, int value) {
           short number = (short) value;
           replaceValue( getBinaryString(number) , (beginABinaryUnsign1 + index*A_BINARY_UNSIGN_1_LEN), A_BINARY_UNSIGN_1_LEN);
   }

	protected static final int A_BINARY_UNSIGN_2_LEN = 4;
    /**
	 * 	serialize this ABinaryUnsign2 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeABinaryUnsign2(int index, long value) {
           int number = (int) value;
           replaceValue( getBinaryString(number) , (beginABinaryUnsign2 + index*A_BINARY_UNSIGN_2_LEN), A_BINARY_UNSIGN_2_LEN);
   }

	protected static final int A_BINARY_UNSIGN_3_LEN = 8;
    /**
	 * 	serialize this ABinaryUnsign3 as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeABinaryUnsign3(int index, long value) {
           long number = (long) value;
           replaceValue( getBinaryString(number) , (beginABinaryUnsign3 + index*A_BINARY_UNSIGN_3_LEN), A_BINARY_UNSIGN_3_LEN);
   }
  protected  static final int A_DISPLAY_SIGN_1_LEN = 4;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeADisplaySign1(int index, short value) {
	       replaceValue( pad(A_DISPLAY_SIGN_1_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginADisplaySign1 + index*A_DISPLAY_SIGN_1_LEN)
	              , A_DISPLAY_SIGN_1_LEN
	              );
   }
  protected  static final int A_DISPLAY_SIGN_2_LEN = 8;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeADisplaySign2(int index, int value) {
	       replaceValue( pad(A_DISPLAY_SIGN_2_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginADisplaySign2 + index*A_DISPLAY_SIGN_2_LEN)
	              , A_DISPLAY_SIGN_2_LEN
	              );
   }
  protected  static final int A_DISPLAY_SIGN_3_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeADisplaySign3(int index, long value) {
	       replaceValue( pad(A_DISPLAY_SIGN_3_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginADisplaySign3 + index*A_DISPLAY_SIGN_3_LEN)
	              , A_DISPLAY_SIGN_3_LEN
	              );
   }
  protected  static final int A_DISPLAY_UNSIGN_1_LEN = 4;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeADisplayUnsign1(int index, int value) {
	       replaceValue( pad(A_DISPLAY_UNSIGN_1_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginADisplayUnsign1 + index*A_DISPLAY_UNSIGN_1_LEN)
	              , A_DISPLAY_UNSIGN_1_LEN
	              );
   }
  protected  static final int A_DISPLAY_UNSIGN_2_LEN = 8;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeADisplayUnsign2(int index, long value) {
	       replaceValue( pad(A_DISPLAY_UNSIGN_2_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginADisplayUnsign2 + index*A_DISPLAY_UNSIGN_2_LEN)
	              , A_DISPLAY_UNSIGN_2_LEN
	              );
   }
  protected  static final int A_DISPLAY_UNSIGN_3_LEN = 10;
     /**
     *  Collect all the arraylist value and join as a single string to serialize it. 
	 *  @param index
	 *	@param value
	 */
	protected void serializeADisplayUnsign3(int index, long value) {
	       replaceValue( pad(A_DISPLAY_UNSIGN_3_LEN,String.valueOf(value).toCharArray(),'0',LEFT_PAD)
	              , (beginADisplayUnsign3 + index*A_DISPLAY_UNSIGN_3_LEN)
	              , A_DISPLAY_UNSIGN_3_LEN
	              );
   }
   protected static final int A_PACKED_SIGN_1_LEN = 3;
   protected static final int A_PACKED_SIGN_1_SCALE = 0;
    /**
	 * 	serializes this APackedSign1 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeAPackedSign1(int index, short value) {
	       replaceValue(  
	            getPackedString(value,A_PACKED_SIGN_1_LEN,A_PACKED_SIGN_1_SCALE,true)
	            ,(beginAPackedSign1 + index*A_PACKED_SIGN_1_LEN) 
	            , A_PACKED_SIGN_1_LEN  
	            );
   }
   protected static final int A_PACKED_SIGN_2_LEN = 5;
   protected static final int A_PACKED_SIGN_2_SCALE = 0;
    /**
	 * 	serializes this APackedSign2 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeAPackedSign2(int index, int value) {
	       replaceValue(  
	            getPackedString(value,A_PACKED_SIGN_2_LEN,A_PACKED_SIGN_2_SCALE,true)
	            ,(beginAPackedSign2 + index*A_PACKED_SIGN_2_LEN) 
	            , A_PACKED_SIGN_2_LEN  
	            );
   }
   protected static final int A_PACKED_SIGN_3_LEN = 6;
   protected static final int A_PACKED_SIGN_3_SCALE = 0;
    /**
	 * 	serializes this APackedSign3 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeAPackedSign3(int index, long value) {
	       replaceValue(  
	            getPackedString(value,A_PACKED_SIGN_3_LEN,A_PACKED_SIGN_3_SCALE,true)
	            ,(beginAPackedSign3 + index*A_PACKED_SIGN_3_LEN) 
	            , A_PACKED_SIGN_3_LEN  
	            );
   }
   protected static final int A_PACKED_UNSIGN_1_LEN = 3;
   protected static final int A_PACKED_UNSIGN_1_SCALE = 0;
    /**
	 * 	serializes this APackedUnsign1 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeAPackedUnsign1(int index, int value) {
	       replaceValue(  
	            getPackedString(value,A_PACKED_UNSIGN_1_LEN,A_PACKED_UNSIGN_1_SCALE,false)
	            ,(beginAPackedUnsign1 + index*A_PACKED_UNSIGN_1_LEN) 
	            , A_PACKED_UNSIGN_1_LEN  
	            );
   }
   protected static final int A_PACKED_UNSIGN_2_LEN = 5;
   protected static final int A_PACKED_UNSIGN_2_SCALE = 0;
    /**
	 * 	serializes this APackedUnsign2 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeAPackedUnsign2(int index, long value) {
	       replaceValue(  
	            getPackedString(value,A_PACKED_UNSIGN_2_LEN,A_PACKED_UNSIGN_2_SCALE,false)
	            ,(beginAPackedUnsign2 + index*A_PACKED_UNSIGN_2_LEN) 
	            , A_PACKED_UNSIGN_2_LEN  
	            );
   }
   protected static final int A_PACKED_UNSIGN_3_LEN = 6;
   protected static final int A_PACKED_UNSIGN_3_SCALE = 0;
    /**
	 * 	serializes this APackedUnsign3 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeAPackedUnsign3(int index, long value) {
	       replaceValue(  
	            getPackedString(value,A_PACKED_UNSIGN_3_LEN,A_PACKED_UNSIGN_3_SCALE,false)
	            ,(beginAPackedUnsign3 + index*A_PACKED_UNSIGN_3_LEN) 
	            , A_PACKED_UNSIGN_3_LEN  
	            );
   }
    protected static final int A_DEC_BINARY_SIGN_1_LEN = 2;
    protected static final int A_DEC_BINARY_SIGN_1_SCALE = 2;
     /**
	 * 	serialize this ADecBinarySign1
	 *  @param index
	 *	@param value
	 */
	protected void serializeADecBinarySign1(int index, BigDecimal value) {
          replaceValue(  getBinaryString(value.movePointRight(A_DEC_BINARY_SIGN_1_SCALE).shortValue() )       
                  , (beginADecBinarySign1 + index*A_DEC_BINARY_SIGN_1_LEN) 
                  , A_DEC_BINARY_SIGN_1_LEN );
   }
    protected static final int A_DEC_BINARY_SIGN_2_LEN = 4;
    protected static final int A_DEC_BINARY_SIGN_2_SCALE = 7;
     /**
	 * 	serialize this ADecBinarySign2
	 *  @param index
	 *	@param value
	 */
	protected void serializeADecBinarySign2(int index, BigDecimal value) {
           replaceValue(  getBinaryString(value.movePointRight(A_DEC_BINARY_SIGN_2_SCALE).intValue() ) 
                    , (beginADecBinarySign2 + index*A_DEC_BINARY_SIGN_2_LEN) 
                    , A_DEC_BINARY_SIGN_2_LEN 
                  );
   }
    protected static final int A_DEC_BINARY_SIGN_3_LEN = 8;
    protected static final int A_DEC_BINARY_SIGN_3_SCALE = 9;
     /**
	 * 	serialize this ADecBinarySign3
	 *  @param index
	 *	@param value
	 */
	protected void serializeADecBinarySign3(int index, BigDecimal value) {
           replaceValue(  getBinaryString(value.movePointRight(A_DEC_BINARY_SIGN_3_SCALE).longValue() ) 
                   , (beginADecBinarySign3 + index*A_DEC_BINARY_SIGN_3_LEN) 
                   , A_DEC_BINARY_SIGN_3_LEN );
   }
    protected static final int A_DEC_BINARY_UNSIGN_1_LEN = 2;
    protected static final int A_DEC_BINARY_UNSIGN_1_SCALE = 2;
     /**
	 * 	serialize this ADecBinaryUnsign1
	 *  @param index
	 *	@param value
	 */
	protected void serializeADecBinaryUnsign1(int index, BigDecimal value) {
          replaceValue(  getBinaryString(value.movePointRight(A_DEC_BINARY_UNSIGN_1_SCALE).shortValue() )       
                  , (beginADecBinaryUnsign1 + index*A_DEC_BINARY_UNSIGN_1_LEN) 
                  , A_DEC_BINARY_UNSIGN_1_LEN );
   }
    protected static final int A_DEC_BINARY_UNSIGN_2_LEN = 4;
    protected static final int A_DEC_BINARY_UNSIGN_2_SCALE = 6;
     /**
	 * 	serialize this ADecBinaryUnsign2
	 *  @param index
	 *	@param value
	 */
	protected void serializeADecBinaryUnsign2(int index, BigDecimal value) {
           replaceValue(  getBinaryString(value.movePointRight(A_DEC_BINARY_UNSIGN_2_SCALE).intValue() ) 
                    , (beginADecBinaryUnsign2 + index*A_DEC_BINARY_UNSIGN_2_LEN) 
                    , A_DEC_BINARY_UNSIGN_2_LEN 
                  );
   }
    protected static final int A_DEC_BINARY_UNSIGN_3_LEN = 8;
    protected static final int A_DEC_BINARY_UNSIGN_3_SCALE = 9;
     /**
	 * 	serialize this ADecBinaryUnsign3
	 *  @param index
	 *	@param value
	 */
	protected void serializeADecBinaryUnsign3(int index, BigDecimal value) {
           replaceValue(  getBinaryString(value.movePointRight(A_DEC_BINARY_UNSIGN_3_SCALE).longValue() ) 
                   , (beginADecBinaryUnsign3 + index*A_DEC_BINARY_UNSIGN_3_LEN) 
                   , A_DEC_BINARY_UNSIGN_3_LEN );
   }
   protected static final int A_DEC_DISPLAY_SIGN_1_LEN = 3;
   protected static final int A_DEC_DISPLAY_SIGN_1_SCALE = 2;
     /**
	 * serializes this ADecDisplaySign1 at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeADecDisplaySign1(int index, BigDecimal value) {
           putNumber((beginADecDisplaySign1 + index*A_DEC_DISPLAY_SIGN_1_LEN),value,A_DEC_DISPLAY_SIGN_1_LEN ,A_DEC_DISPLAY_SIGN_1_SCALE ,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }
   protected static final int A_DEC_DISPLAY_SIGN_2_LEN = 8;
   protected static final int A_DEC_DISPLAY_SIGN_2_SCALE = 7;
     /**
	 * serializes this ADecDisplaySign2 at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeADecDisplaySign2(int index, BigDecimal value) {
           putNumber((beginADecDisplaySign2 + index*A_DEC_DISPLAY_SIGN_2_LEN),value,A_DEC_DISPLAY_SIGN_2_LEN ,A_DEC_DISPLAY_SIGN_2_SCALE ,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }
   protected static final int A_DEC_DISPLAY_SIGN_3_LEN = 10;
   protected static final int A_DEC_DISPLAY_SIGN_3_SCALE = 9;
     /**
	 * serializes this ADecDisplaySign3 at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeADecDisplaySign3(int index, BigDecimal value) {
           putNumber((beginADecDisplaySign3 + index*A_DEC_DISPLAY_SIGN_3_LEN),value,A_DEC_DISPLAY_SIGN_3_LEN ,A_DEC_DISPLAY_SIGN_3_SCALE ,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }
   protected static final int A_DEC_DISPLAY_UNSIGN_1_LEN = 3;
   protected static final int A_DEC_DISPLAY_UNSIGN_1_SCALE = 2;
     /**
	 * serializes this ADecDisplayUnsign1 at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeADecDisplayUnsign1(int index, BigDecimal value) {
           putNumber((beginADecDisplayUnsign1 + index*A_DEC_DISPLAY_UNSIGN_1_LEN),value,A_DEC_DISPLAY_UNSIGN_1_LEN ,A_DEC_DISPLAY_UNSIGN_1_SCALE ,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }
   protected static final int A_DEC_DISPLAY_UNSIGN_2_LEN = 7;
   protected static final int A_DEC_DISPLAY_UNSIGN_2_SCALE = 6;
     /**
	 * serializes this ADecDisplayUnsign2 at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeADecDisplayUnsign2(int index, BigDecimal value) {
           putNumber((beginADecDisplayUnsign2 + index*A_DEC_DISPLAY_UNSIGN_2_LEN),value,A_DEC_DISPLAY_UNSIGN_2_LEN ,A_DEC_DISPLAY_UNSIGN_2_SCALE ,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }
   protected static final int A_DEC_DISPLAY_UNSIGN_3_LEN = 10;
   protected static final int A_DEC_DISPLAY_UNSIGN_3_SCALE = 9;
     /**
	 * serializes this ADecDisplayUnsign3 at the index passed with the value
	 *	@param value
	 *  @param index
	 */
	protected void serializeADecDisplayUnsign3(int index, BigDecimal value) {
           putNumber((beginADecDisplayUnsign3 + index*A_DEC_DISPLAY_UNSIGN_3_LEN),value,A_DEC_DISPLAY_UNSIGN_3_LEN ,A_DEC_DISPLAY_UNSIGN_3_SCALE ,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
   }
   protected static final int A_DEC_PACKED_SIGN_1_LEN = 2;
   protected static final int A_DEC_PACKED_SIGN_1_SCALE = 2;
     /**
	 * 	serializes this ADecPackedSign1 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeADecPackedSign1(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,A_DEC_PACKED_SIGN_1_LEN,A_DEC_PACKED_SIGN_1_SCALE,true)
		        ,(beginADecPackedSign1 + index*A_DEC_PACKED_SIGN_1_LEN) 
		        ,A_DEC_PACKED_SIGN_1_LEN
		      );
   }
   protected static final int A_DEC_PACKED_SIGN_2_LEN = 5;
   protected static final int A_DEC_PACKED_SIGN_2_SCALE = 7;
     /**
	 * 	serializes this ADecPackedSign2 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeADecPackedSign2(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,A_DEC_PACKED_SIGN_2_LEN,A_DEC_PACKED_SIGN_2_SCALE,true)
		        ,(beginADecPackedSign2 + index*A_DEC_PACKED_SIGN_2_LEN) 
		        ,A_DEC_PACKED_SIGN_2_LEN
		      );
   }
   protected static final int A_DEC_PACKED_SIGN_3_LEN = 6;
   protected static final int A_DEC_PACKED_SIGN_3_SCALE = 9;
     /**
	 * 	serializes this ADecPackedSign3 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeADecPackedSign3(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,A_DEC_PACKED_SIGN_3_LEN,A_DEC_PACKED_SIGN_3_SCALE,true)
		        ,(beginADecPackedSign3 + index*A_DEC_PACKED_SIGN_3_LEN) 
		        ,A_DEC_PACKED_SIGN_3_LEN
		      );
   }
   protected static final int A_DEC_PACKED_UNSIGN_1_LEN = 2;
   protected static final int A_DEC_PACKED_UNSIGN_1_SCALE = 2;
     /**
	 * 	serializes this ADecPackedUnsign1 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeADecPackedUnsign1(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,A_DEC_PACKED_UNSIGN_1_LEN,A_DEC_PACKED_UNSIGN_1_SCALE,false)
		        ,(beginADecPackedUnsign1 + index*A_DEC_PACKED_UNSIGN_1_LEN) 
		        ,A_DEC_PACKED_UNSIGN_1_LEN
		      );
   }
   protected static final int A_DEC_PACKED_UNSIGN_2_LEN = 4;
   protected static final int A_DEC_PACKED_UNSIGN_2_SCALE = 6;
     /**
	 * 	serializes this ADecPackedUnsign2 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeADecPackedUnsign2(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,A_DEC_PACKED_UNSIGN_2_LEN,A_DEC_PACKED_UNSIGN_2_SCALE,false)
		        ,(beginADecPackedUnsign2 + index*A_DEC_PACKED_UNSIGN_2_LEN) 
		        ,A_DEC_PACKED_UNSIGN_2_LEN
		      );
   }
   protected static final int A_DEC_PACKED_UNSIGN_3_LEN = 6;
   protected static final int A_DEC_PACKED_UNSIGN_3_SCALE = 9;
     /**
	 * 	serializes this ADecPackedUnsign3 as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeADecPackedUnsign3(int index, BigDecimal value) {
		   replaceValue( 
		        getPackedString(value,A_DEC_PACKED_UNSIGN_3_LEN,A_DEC_PACKED_UNSIGN_3_SCALE,false)
		        ,(beginADecPackedUnsign3 + index*A_DEC_PACKED_UNSIGN_3_LEN) 
		        ,A_DEC_PACKED_UNSIGN_3_LEN
		      );
   }
 
   
  protected  static final int A_CHAR_LEN = 5;
   /**
	 *	serializeAChar as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeAChar(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginAChar + index*A_CHAR_LEN)
   	          , A_CHAR_LEN 
   	          );
   }
 
   
  protected  static final int A_CHAR_JUST_RIGHT_LEN = 5;
   /**
	 *	serializeACharJustRight as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeACharJustRight(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginACharJustRight + index*A_CHAR_JUST_RIGHT_LEN)
   	          , A_CHAR_JUST_RIGHT_LEN 
   	          );
   }
 
   
  protected  static final int A_CHAR_ZERO_LEN = 5;
   /**
	 *	serializeACharZero as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeACharZero(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginACharZero + index*A_CHAR_ZERO_LEN)
   	          , A_CHAR_ZERO_LEN 
   	          );
   }

		public int aBinarySign1Size() {
			return A_BINARY_SIGN_1_SIZE;
		}
		public int aBinarySign2Size() {
			return A_BINARY_SIGN_2_SIZE;
		}
		public int aBinarySign3Size() {
			return A_BINARY_SIGN_3_SIZE;
		}
		public int aBinaryUnsign1Size() {
			return A_BINARY_UNSIGN_1_SIZE;
		}
		public int aBinaryUnsign2Size() {
			return A_BINARY_UNSIGN_2_SIZE;
		}
		public int aBinaryUnsign3Size() {
			return A_BINARY_UNSIGN_3_SIZE;
		}
		public int aDisplaySign1Size() {
			return A_DISPLAY_SIGN_1_SIZE;
		}
		public int aDisplaySign2Size() {
			return A_DISPLAY_SIGN_2_SIZE;
		}
		public int aDisplaySign3Size() {
			return A_DISPLAY_SIGN_3_SIZE;
		}
		public int aDisplayUnsign1Size() {
			return A_DISPLAY_UNSIGN_1_SIZE;
		}
		public int aDisplayUnsign2Size() {
			return A_DISPLAY_UNSIGN_2_SIZE;
		}
		public int aDisplayUnsign3Size() {
			return A_DISPLAY_UNSIGN_3_SIZE;
		}
		public int aPackedSign1Size() {
			return A_PACKED_SIGN_1_SIZE;
		}
		public int aPackedSign2Size() {
			return A_PACKED_SIGN_2_SIZE;
		}
		public int aPackedSign3Size() {
			return A_PACKED_SIGN_3_SIZE;
		}
		public int aPackedUnsign1Size() {
			return A_PACKED_UNSIGN_1_SIZE;
		}
		public int aPackedUnsign2Size() {
			return A_PACKED_UNSIGN_2_SIZE;
		}
		public int aPackedUnsign3Size() {
			return A_PACKED_UNSIGN_3_SIZE;
		}
		public int aDecBinarySign1Size() {
			return A_DEC_BINARY_SIGN_1_SIZE;
		}
		public int aDecBinarySign2Size() {
			return A_DEC_BINARY_SIGN_2_SIZE;
		}
		public int aDecBinarySign3Size() {
			return A_DEC_BINARY_SIGN_3_SIZE;
		}
		public int aDecBinaryUnsign1Size() {
			return A_DEC_BINARY_UNSIGN_1_SIZE;
		}
		public int aDecBinaryUnsign2Size() {
			return A_DEC_BINARY_UNSIGN_2_SIZE;
		}
		public int aDecBinaryUnsign3Size() {
			return A_DEC_BINARY_UNSIGN_3_SIZE;
		}
		public int aDecDisplaySign1Size() {
			return A_DEC_DISPLAY_SIGN_1_SIZE;
		}
		public int aDecDisplaySign2Size() {
			return A_DEC_DISPLAY_SIGN_2_SIZE;
		}
		public int aDecDisplaySign3Size() {
			return A_DEC_DISPLAY_SIGN_3_SIZE;
		}
		public int aDecDisplayUnsign1Size() {
			return A_DEC_DISPLAY_UNSIGN_1_SIZE;
		}
		public int aDecDisplayUnsign2Size() {
			return A_DEC_DISPLAY_UNSIGN_2_SIZE;
		}
		public int aDecDisplayUnsign3Size() {
			return A_DEC_DISPLAY_UNSIGN_3_SIZE;
		}
		public int aDecPackedSign1Size() {
			return A_DEC_PACKED_SIGN_1_SIZE;
		}
		public int aDecPackedSign2Size() {
			return A_DEC_PACKED_SIGN_2_SIZE;
		}
		public int aDecPackedSign3Size() {
			return A_DEC_PACKED_SIGN_3_SIZE;
		}
		public int aDecPackedUnsign1Size() {
			return A_DEC_PACKED_UNSIGN_1_SIZE;
		}
		public int aDecPackedUnsign2Size() {
			return A_DEC_PACKED_UNSIGN_2_SIZE;
		}
		public int aDecPackedUnsign3Size() {
			return A_DEC_PACKED_UNSIGN_3_SIZE;
		}
		public int aCharSize() {
			return A_CHAR_SIZE;
		}
		public int aCharJustRightSize() {
			return A_CHAR_JUST_RIGHT_SIZE;
		}
		public int aCharZeroSize() {
			return A_CHAR_ZERO_SIZE;
		}



}
  
