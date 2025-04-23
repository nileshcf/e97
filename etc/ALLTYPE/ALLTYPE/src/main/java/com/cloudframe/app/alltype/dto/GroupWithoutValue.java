package com.cloudframe.app.alltype.dto;

/**
*  The class GroupWithoutValue is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:28. using version 5.0.0.254
**/


import com.cloudframe.app.alltype.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import java.math.RoundingMode;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


public class GroupWithoutValue extends GroupWithoutValueSerialized { 
   

								private short binarySign1;

								private int binarySign2;

								private long binarySign3;

								private int binaryUnsign1;

								private long binaryUnsign2;

								private long binaryUnsign3;

								private short displaySign1;

								private int displaySign2;

								private long displaySign3;

								private int displayUnsign1;

								private long displayUnsign2;

								private long displayUnsign3;

								private short packedSign1;

								private int packedSign2;

								private long packedSign3;

								private int packedUnsign1;

								private long packedUnsign2;

								private long packedUnsign3;

								private BigDecimal decBinarySign1 = BigDecimal.ZERO;

								private BigDecimal decBinarySign2 = BigDecimal.ZERO;

								private BigDecimal decBinarySign3 = BigDecimal.ZERO;

								private BigDecimal decBinaryUnsign1 = BigDecimal.ZERO;

								private BigDecimal decBinaryUnsign2 = BigDecimal.ZERO;

								private BigDecimal decBinaryUnsign3 = BigDecimal.ZERO;

								private BigDecimal decDisplaySign1 = BigDecimal.ZERO;

								private BigDecimal decDisplaySign2 = BigDecimal.ZERO;

								private BigDecimal decDisplaySign3 = BigDecimal.ZERO;

								private BigDecimal decDisplayUnsign1 = BigDecimal.ZERO;

								private BigDecimal decDisplayUnsign2 = BigDecimal.ZERO;

								private BigDecimal decDisplayUnsign3 = BigDecimal.ZERO;

								private BigDecimal decPackedSign1 = BigDecimal.ZERO;

								private BigDecimal decPackedSign2 = BigDecimal.ZERO;

								private BigDecimal decPackedSign3 = BigDecimal.ZERO;

								private BigDecimal decPackedUnsign1 = BigDecimal.ZERO;

								private BigDecimal decPackedUnsign2 = BigDecimal.ZERO;

								private BigDecimal decPackedUnsign3 = BigDecimal.ZERO;

						private char[] charWs = Field.fillLowValue(5);

						private char[] charJustRight = Field.fillLowValue(5);

								private char[] charZero = Field.fillLowValue(5);
	
	/**
	* Constructor for GroupWithoutValue
	**/
    public GroupWithoutValue() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GroupWithoutValue. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWithoutValue(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of binarySign1
	 *	@return binarySign1
	 */
	public short getBinarySign1() throws CFException {
        if (isBinarySign1Modified()) { 
           binarySign1 = refreshBinarySign1();
        }
   		return binarySign1;
	}
	
	/**
	 * 	Update BinarySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-BINARY-SIGN1
	 *	@param number
	 */
	public void setBinarySign1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binarySign1 = checkBinarySign1MaxLimit(number); 
		serializeBinarySign1(binarySign1);
	}

	public void setBinarySign1(int number) {
	    number = checkBinarySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinarySign1((short)number);
	}
	public void setBinarySign1(long number) {
	    number = checkBinarySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinarySign1((short)number);
	}
	

	/**
	 *	Returns the value of binarySign2
	 *	@return binarySign2
	 */
	public int getBinarySign2() throws CFException {
        if (isBinarySign2Modified()) { 
           binarySign2 = refreshBinarySign2();
        }
   		return binarySign2;
	}
	
	/**
	 * 	Update BinarySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-BINARY-SIGN2
	 *	@param number
	 */
	public void setBinarySign2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binarySign2 = checkBinarySign2MaxLimit(number); 
		serializeBinarySign2(binarySign2);
	}


	public void setBinarySign2(long number) {
	    number = checkBinarySign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinarySign2((int)number);
	}
	
	/**
	 *	Returns the value of binarySign3
	 *	@return binarySign3
	 */
	public long getBinarySign3() throws CFException {
        if (isBinarySign3Modified()) { 
           binarySign3 = refreshBinarySign3();
        }
   		return binarySign3;
	}
	
	/**
	 * 	Update BinarySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-BINARY-SIGN3
	 *	@param number
	 */
	public void setBinarySign3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    binarySign3 = checkBinarySign3MaxLimit(number); 
		serializeBinarySign3(binarySign3);
	}


	/**
	 *	Returns the value of binaryUnsign1
	 *	@return binaryUnsign1
	 */
	public int getBinaryUnsign1() throws CFException {
        if (isBinaryUnsign1Modified()) { 
           binaryUnsign1 = refreshBinaryUnsign1();
        }
   		return binaryUnsign1;
	}
	
	/**
	 * 	Update BinaryUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-BINARY-UNSIGN1
	 *	@param number
	 */
	public void setBinaryUnsign1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryUnsign1 = checkBinaryUnsign1MaxLimit(number); 
		serializeBinaryUnsign1(binaryUnsign1);
	}


	public void setBinaryUnsign1(long number) {
	    number = checkBinaryUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBinaryUnsign1((int)number);
	}
	
	/**
	 *	Returns the value of binaryUnsign2
	 *	@return binaryUnsign2
	 */
	public long getBinaryUnsign2() throws CFException {
        if (isBinaryUnsign2Modified()) { 
           binaryUnsign2 = refreshBinaryUnsign2();
        }
   		return binaryUnsign2;
	}
	
	/**
	 * 	Update BinaryUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-BINARY-UNSIGN2
	 *	@param number
	 */
	public void setBinaryUnsign2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryUnsign2 = checkBinaryUnsign2MaxLimit(number); 
		serializeBinaryUnsign2(binaryUnsign2);
	}


	/**
	 *	Returns the value of binaryUnsign3
	 *	@return binaryUnsign3
	 */
	public long getBinaryUnsign3() throws CFException {
        if (isBinaryUnsign3Modified()) { 
           binaryUnsign3 = refreshBinaryUnsign3();
        }
   		return binaryUnsign3;
	}
	
	/**
	 * 	Update BinaryUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-BINARY-UNSIGN3
	 *	@param number
	 */
	public void setBinaryUnsign3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryUnsign3 = checkBinaryUnsign3MaxLimit(number); 
		serializeBinaryUnsign3(binaryUnsign3);
	}


	/**
	 *	Returns the value of displaySign1
	 *	@return displaySign1
	 */
	public short getDisplaySign1() throws CFException {
       if (isDisplaySign1Modified()) { 
           displaySign1 = refreshDisplaySign1();
        }
   		return displaySign1;
	}
	

    /**
	 *	Returns the String value of displaySign1
	 *	@return displaySign1
	 */
	public char[]  getDisplaySign1ActualString() {
	    String value = String.valueOf(displaySign1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DisplaySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-SIGN1
	 *	@param number
	 */
	public void setDisplaySign1(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    displaySign1 = checkDisplaySign1MaxLimit(number); 
		serializeDisplaySign1(displaySign1);
	}
	
	public void setDisplaySign1(int number) {
	    number = checkDisplaySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDisplaySign1((short)number);
	}
	public void setDisplaySign1(long number) {
	    number = checkDisplaySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDisplaySign1((short)number);
	}
	

	/**
	 * 	Update DisplaySign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDisplaySign1(char[] value) throws CFException {
		 displaySign1 = serializeDisplaySign1(value);
	}
	/**
	 * 	Update DisplaySign1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDisplaySign1String(char[] value) throws CFException {
		 setDisplaySign1(value);
	}
	/**
	 *	Returns the value of displaySign2
	 *	@return displaySign2
	 */
	public int getDisplaySign2() throws CFException {
       if (isDisplaySign2Modified()) { 
           displaySign2 = refreshDisplaySign2();
        }
   		return displaySign2;
	}
	

    /**
	 *	Returns the String value of displaySign2
	 *	@return displaySign2
	 */
	public char[]  getDisplaySign2ActualString() {
	    String value = String.valueOf(displaySign2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DisplaySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-SIGN2
	 *	@param number
	 */
	public void setDisplaySign2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    displaySign2 = checkDisplaySign2MaxLimit(number); 
		serializeDisplaySign2(displaySign2);
	}
	

	public void setDisplaySign2(long number) {
	    number = checkDisplaySign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDisplaySign2((int)number);
	}
	
	/**
	 * 	Update DisplaySign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDisplaySign2(char[] value) throws CFException {
		 displaySign2 = serializeDisplaySign2(value);
	}
	/**
	 * 	Update DisplaySign2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDisplaySign2String(char[] value) throws CFException {
		 setDisplaySign2(value);
	}
	/**
	 *	Returns the value of displaySign3
	 *	@return displaySign3
	 */
	public long getDisplaySign3() throws CFException {
       if (isDisplaySign3Modified()) { 
           displaySign3 = refreshDisplaySign3();
        }
   		return displaySign3;
	}
	

    /**
	 *	Returns the String value of displaySign3
	 *	@return displaySign3
	 */
	public char[]  getDisplaySign3ActualString() {
	    String value = String.valueOf(displaySign3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DisplaySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-SIGN3
	 *	@param number
	 */
	public void setDisplaySign3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    displaySign3 = checkDisplaySign3MaxLimit(number); 
		serializeDisplaySign3(displaySign3);
	}
	

	/**
	 * 	Update DisplaySign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDisplaySign3(char[] value) throws CFException {
		 displaySign3 = serializeDisplaySign3(value);
	}
	/**
	 * 	Update DisplaySign3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDisplaySign3String(char[] value) throws CFException {
		 setDisplaySign3(value);
	}
	/**
	 *	Returns the value of displayUnsign1
	 *	@return displayUnsign1
	 */
	public int getDisplayUnsign1() throws CFException {
       if (isDisplayUnsign1Modified()) { 
           displayUnsign1 = refreshDisplayUnsign1();
        }
   		return displayUnsign1;
	}
	

	
	   
	/**
	 * 	Update DisplayUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-UNSIGN1
	 *	@param number
	 */
	public void setDisplayUnsign1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    displayUnsign1 = checkDisplayUnsign1MaxLimit(number); 
		serializeDisplayUnsign1(displayUnsign1);
	}
	

	public void setDisplayUnsign1(long number) {
	    number = checkDisplayUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDisplayUnsign1((int)number);
	}
	
	/**
	 * 	Update DisplayUnsign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDisplayUnsign1(char[] value) throws CFException {
		 displayUnsign1 = serializeDisplayUnsign1(value);
	}
	/**
	 * 	Update DisplayUnsign1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDisplayUnsign1String(char[] value) throws CFException {
		 setDisplayUnsign1(value);
	}
	/**
	 *	Returns the value of displayUnsign2
	 *	@return displayUnsign2
	 */
	public long getDisplayUnsign2() throws CFException {
       if (isDisplayUnsign2Modified()) { 
           displayUnsign2 = refreshDisplayUnsign2();
        }
   		return displayUnsign2;
	}
	

	
	   
	/**
	 * 	Update DisplayUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-UNSIGN2
	 *	@param number
	 */
	public void setDisplayUnsign2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    displayUnsign2 = checkDisplayUnsign2MaxLimit(number); 
		serializeDisplayUnsign2(displayUnsign2);
	}
	

	/**
	 * 	Update DisplayUnsign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDisplayUnsign2(char[] value) throws CFException {
		 displayUnsign2 = serializeDisplayUnsign2(value);
	}
	/**
	 * 	Update DisplayUnsign2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDisplayUnsign2String(char[] value) throws CFException {
		 setDisplayUnsign2(value);
	}
	/**
	 *	Returns the value of displayUnsign3
	 *	@return displayUnsign3
	 */
	public long getDisplayUnsign3() throws CFException {
       if (isDisplayUnsign3Modified()) { 
           displayUnsign3 = refreshDisplayUnsign3();
        }
   		return displayUnsign3;
	}
	

	
	   
	/**
	 * 	Update DisplayUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-DISPLAY-UNSIGN3
	 *	@param number
	 */
	public void setDisplayUnsign3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    displayUnsign3 = checkDisplayUnsign3MaxLimit(number); 
		serializeDisplayUnsign3(displayUnsign3);
	}
	

	/**
	 * 	Update DisplayUnsign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDisplayUnsign3(char[] value) throws CFException {
		 displayUnsign3 = serializeDisplayUnsign3(value);
	}
	/**
	 * 	Update DisplayUnsign3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDisplayUnsign3String(char[] value) throws CFException {
		 setDisplayUnsign3(value);
	}
	public short getPackedSign1() throws CFException {
        if (isPackedSign1Modified()) { 
           packedSign1 = refreshPackedSign1();
        }
   		return packedSign1;
	}
	
	/**
	 * 	Update PackedSign1 with the passed value
	 *  Corresponding COBOL Variable is WS-PACKED-SIGN1
	 *	@param number
	 */
	public void setPackedSign1(short number) {
			packedSign1 = checkPackedSign1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedSign1(packedSign1);
	}

	public void setPackedSign1(int number) {
	    number = checkPackedSign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPackedSign1((short)number);
	}
	public void setPackedSign1(long number) {
	    number = checkPackedSign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPackedSign1((short)number);
	}
	

	public int getPackedSign2() throws CFException {
        if (isPackedSign2Modified()) { 
           packedSign2 = refreshPackedSign2();
        }
   		return packedSign2;
	}
	
	/**
	 * 	Update PackedSign2 with the passed value
	 *  Corresponding COBOL Variable is WS-PACKED-SIGN2
	 *	@param number
	 */
	public void setPackedSign2(int number) {
			packedSign2 = checkPackedSign2MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedSign2(packedSign2);
	}


	public void setPackedSign2(long number) {
	    number = checkPackedSign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPackedSign2((int)number);
	}
	
	public long getPackedSign3() throws CFException {
        if (isPackedSign3Modified()) { 
           packedSign3 = refreshPackedSign3();
        }
   		return packedSign3;
	}
	
	/**
	 * 	Update PackedSign3 with the passed value
	 *  Corresponding COBOL Variable is WS-PACKED-SIGN3
	 *	@param number
	 */
	public void setPackedSign3(long number) {
			packedSign3 = checkPackedSign3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedSign3(packedSign3);
	}


	public int getPackedUnsign1() throws CFException {
        if (isPackedUnsign1Modified()) { 
           packedUnsign1 = refreshPackedUnsign1();
        }
   		return packedUnsign1;
	}
	
	/**
	 * 	Update PackedUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-PACKED-UNSIGN1
	 *	@param number
	 */
	public void setPackedUnsign1(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			packedUnsign1 = checkPackedUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedUnsign1(packedUnsign1);
	}


	public void setPackedUnsign1(long number) {
	    number = checkPackedUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPackedUnsign1((int)number);
	}
	
	public long getPackedUnsign2() throws CFException {
        if (isPackedUnsign2Modified()) { 
           packedUnsign2 = refreshPackedUnsign2();
        }
   		return packedUnsign2;
	}
	
	/**
	 * 	Update PackedUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-PACKED-UNSIGN2
	 *	@param number
	 */
	public void setPackedUnsign2(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			packedUnsign2 = checkPackedUnsign2MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedUnsign2(packedUnsign2);
	}


	public long getPackedUnsign3() throws CFException {
        if (isPackedUnsign3Modified()) { 
           packedUnsign3 = refreshPackedUnsign3();
        }
   		return packedUnsign3;
	}
	
	/**
	 * 	Update PackedUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-PACKED-UNSIGN3
	 *	@param number
	 */
	public void setPackedUnsign3(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			packedUnsign3 = checkPackedUnsign3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedUnsign3(packedUnsign3);
	}


	/**
	 *	Returns the value of decBinarySign1
	 *	@return decBinarySign1
	 */
	public BigDecimal getDecBinarySign1() throws CFException {
        if (isDecBinarySign1Modified()) { 
           decBinarySign1 = refreshDecBinarySign1();
        }
   		return decBinarySign1;
	}
	
	
	/**
	 * 	Update DecBinarySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-DEC-BINARY-SIGN1
	 *	@param number
	 */
	public void setDecBinarySign1(BigDecimal number) {
		decBinarySign1 = number.setScale(2,RoundingMode.DOWN);
	    serializeDecBinarySign1(number);
   }
              
	/**
	 *	Returns the value of decBinarySign2
	 *	@return decBinarySign2
	 */
	public BigDecimal getDecBinarySign2() throws CFException {
        if (isDecBinarySign2Modified()) { 
           decBinarySign2 = refreshDecBinarySign2();
        }
   		return decBinarySign2;
	}
	
	
	/**
	 * 	Update DecBinarySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-DEC-BINARY-SIGN2
	 *	@param number
	 */
	public void setDecBinarySign2(BigDecimal number) {
		decBinarySign2 = number.setScale(7,RoundingMode.DOWN);
	    serializeDecBinarySign2(number);
   }
              
	/**
	 *	Returns the value of decBinarySign3
	 *	@return decBinarySign3
	 */
	public BigDecimal getDecBinarySign3() throws CFException {
        if (isDecBinarySign3Modified()) { 
           decBinarySign3 = refreshDecBinarySign3();
        }
   		return decBinarySign3;
	}
	
	
	/**
	 * 	Update DecBinarySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-DEC-BINARY-SIGN3
	 *	@param number
	 */
	public void setDecBinarySign3(BigDecimal number) {
		decBinarySign3 = number.setScale(9,RoundingMode.DOWN);
	    serializeDecBinarySign3(number);
   }
              
	/**
	 *	Returns the value of decBinaryUnsign1
	 *	@return decBinaryUnsign1
	 */
	public BigDecimal getDecBinaryUnsign1() throws CFException {
        if (isDecBinaryUnsign1Modified()) { 
           decBinaryUnsign1 = refreshDecBinaryUnsign1();
        }
   		return decBinaryUnsign1;
	}
	
	
	/**
	 * 	Update DecBinaryUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-DEC-BINARY-UNSIGN1
	 *	@param number
	 */
	public void setDecBinaryUnsign1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		decBinaryUnsign1 = number.setScale(2,RoundingMode.DOWN);
	    serializeDecBinaryUnsign1(number);
   }
              
	/**
	 *	Returns the value of decBinaryUnsign2
	 *	@return decBinaryUnsign2
	 */
	public BigDecimal getDecBinaryUnsign2() throws CFException {
        if (isDecBinaryUnsign2Modified()) { 
           decBinaryUnsign2 = refreshDecBinaryUnsign2();
        }
   		return decBinaryUnsign2;
	}
	
	
	/**
	 * 	Update DecBinaryUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-DEC-BINARY-UNSIGN2
	 *	@param number
	 */
	public void setDecBinaryUnsign2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		decBinaryUnsign2 = number.setScale(6,RoundingMode.DOWN);
	    serializeDecBinaryUnsign2(number);
   }
              
	/**
	 *	Returns the value of decBinaryUnsign3
	 *	@return decBinaryUnsign3
	 */
	public BigDecimal getDecBinaryUnsign3() throws CFException {
        if (isDecBinaryUnsign3Modified()) { 
           decBinaryUnsign3 = refreshDecBinaryUnsign3();
        }
   		return decBinaryUnsign3;
	}
	
	
	/**
	 * 	Update DecBinaryUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-DEC-BINARY-UNSIGN3
	 *	@param number
	 */
	public void setDecBinaryUnsign3(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		decBinaryUnsign3 = number.setScale(9,RoundingMode.DOWN);
	    serializeDecBinaryUnsign3(number);
   }
              
	/**
	 *	Returns the value of decDisplaySign1
	 *	@return decDisplaySign1
	 */
	public BigDecimal getDecDisplaySign1() throws CFException {
       if (isDecDisplaySign1Modified()) { 
           decDisplaySign1 = refreshDecDisplaySign1();
        }
   		return decDisplaySign1;
	}
	

    /**
	 *	Returns the String value of decDisplaySign1
	 *	@return decDisplaySign1
	 */
	public char[]  getDecDisplaySign1ActualString() {
	    String value = String.valueOf(decDisplaySign1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DecDisplaySign1 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-DISPLAY-SIGN1
	 *	@param number
	 */
	public void setDecDisplaySign1(BigDecimal number) {
       decDisplaySign1 = checkDecDisplaySign1MaxLimit(number);
	    serializeDecDisplaySign1(decDisplaySign1);
   }
	/**
	 * 	Update DecDisplaySign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecDisplaySign1(char[] value) throws CFException {
		 decDisplaySign1 = serializeDecDisplaySign1(value);
	}   
	/**
	 *	Returns the value of decDisplaySign2
	 *	@return decDisplaySign2
	 */
	public BigDecimal getDecDisplaySign2() throws CFException {
       if (isDecDisplaySign2Modified()) { 
           decDisplaySign2 = refreshDecDisplaySign2();
        }
   		return decDisplaySign2;
	}
	

    /**
	 *	Returns the String value of decDisplaySign2
	 *	@return decDisplaySign2
	 */
	public char[]  getDecDisplaySign2ActualString() {
	    String value = String.valueOf(decDisplaySign2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DecDisplaySign2 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-DISPLAY-SIGN2
	 *	@param number
	 */
	public void setDecDisplaySign2(BigDecimal number) {
       decDisplaySign2 = checkDecDisplaySign2MaxLimit(number);
	    serializeDecDisplaySign2(decDisplaySign2);
   }
	/**
	 * 	Update DecDisplaySign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecDisplaySign2(char[] value) throws CFException {
		 decDisplaySign2 = serializeDecDisplaySign2(value);
	}   
	/**
	 *	Returns the value of decDisplaySign3
	 *	@return decDisplaySign3
	 */
	public BigDecimal getDecDisplaySign3() throws CFException {
       if (isDecDisplaySign3Modified()) { 
           decDisplaySign3 = refreshDecDisplaySign3();
        }
   		return decDisplaySign3;
	}
	

    /**
	 *	Returns the String value of decDisplaySign3
	 *	@return decDisplaySign3
	 */
	public char[]  getDecDisplaySign3ActualString() {
	    String value = String.valueOf(decDisplaySign3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update DecDisplaySign3 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-DISPLAY-SIGN3
	 *	@param number
	 */
	public void setDecDisplaySign3(BigDecimal number) {
       decDisplaySign3 = checkDecDisplaySign3MaxLimit(number);
	    serializeDecDisplaySign3(decDisplaySign3);
   }
	/**
	 * 	Update DecDisplaySign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecDisplaySign3(char[] value) throws CFException {
		 decDisplaySign3 = serializeDecDisplaySign3(value);
	}   
	/**
	 *	Returns the value of decDisplayUnsign1
	 *	@return decDisplayUnsign1
	 */
	public BigDecimal getDecDisplayUnsign1() throws CFException {
       if (isDecDisplayUnsign1Modified()) { 
           decDisplayUnsign1 = refreshDecDisplayUnsign1();
        }
   		return decDisplayUnsign1;
	}
	

	
	   
	/**
	 * 	Update DecDisplayUnsign1 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-DISPLAY-UNSIGN1
	 *	@param number
	 */
	public void setDecDisplayUnsign1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       decDisplayUnsign1 = checkDecDisplayUnsign1MaxLimit(number);
	    serializeDecDisplayUnsign1(decDisplayUnsign1);
   }
	/**
	 * 	Update DecDisplayUnsign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecDisplayUnsign1(char[] value) throws CFException {
		 decDisplayUnsign1 = serializeDecDisplayUnsign1(value);
	}   
	/**
	 *	Returns the value of decDisplayUnsign2
	 *	@return decDisplayUnsign2
	 */
	public BigDecimal getDecDisplayUnsign2() throws CFException {
       if (isDecDisplayUnsign2Modified()) { 
           decDisplayUnsign2 = refreshDecDisplayUnsign2();
        }
   		return decDisplayUnsign2;
	}
	

	
	   
	/**
	 * 	Update DecDisplayUnsign2 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-DISPLAY-UNSIGN2
	 *	@param number
	 */
	public void setDecDisplayUnsign2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       decDisplayUnsign2 = checkDecDisplayUnsign2MaxLimit(number);
	    serializeDecDisplayUnsign2(decDisplayUnsign2);
   }
	/**
	 * 	Update DecDisplayUnsign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecDisplayUnsign2(char[] value) throws CFException {
		 decDisplayUnsign2 = serializeDecDisplayUnsign2(value);
	}   
	/**
	 *	Returns the value of decDisplayUnsign3
	 *	@return decDisplayUnsign3
	 */
	public BigDecimal getDecDisplayUnsign3() throws CFException {
       if (isDecDisplayUnsign3Modified()) { 
           decDisplayUnsign3 = refreshDecDisplayUnsign3();
        }
   		return decDisplayUnsign3;
	}
	

	
	   
	/**
	 * 	Update DecDisplayUnsign3 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-DISPLAY-UNSIGN3
	 *	@param number
	 */
	public void setDecDisplayUnsign3(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       decDisplayUnsign3 = checkDecDisplayUnsign3MaxLimit(number);
	    serializeDecDisplayUnsign3(decDisplayUnsign3);
   }
	/**
	 * 	Update DecDisplayUnsign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDecDisplayUnsign3(char[] value) throws CFException {
		 decDisplayUnsign3 = serializeDecDisplayUnsign3(value);
	}   
	public BigDecimal getDecPackedSign1() throws CFException {
        if (isDecPackedSign1Modified()) { 
           decPackedSign1 = refreshDecPackedSign1();
        }
   		return decPackedSign1;
	}

    public char[] getDecPackedSign1String() {
          return  decPackedSign1String();
    }
	
	/**
	 * 	Update DecPackedSign1 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-PACKED-SIGN1
	 *	@param number
	 */
	public void setDecPackedSign1(BigDecimal number) {	
     decPackedSign1 = checkDecPackedSign1MaxLimit(number);
	    serializeDecPackedSign1(decPackedSign1);
   }
	public BigDecimal getDecPackedSign2() throws CFException {
        if (isDecPackedSign2Modified()) { 
           decPackedSign2 = refreshDecPackedSign2();
        }
   		return decPackedSign2;
	}

    public char[] getDecPackedSign2String() {
          return  decPackedSign2String();
    }
	
	/**
	 * 	Update DecPackedSign2 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-PACKED-SIGN2
	 *	@param number
	 */
	public void setDecPackedSign2(BigDecimal number) {	
     decPackedSign2 = checkDecPackedSign2MaxLimit(number);
	    serializeDecPackedSign2(decPackedSign2);
   }
	public BigDecimal getDecPackedSign3() throws CFException {
        if (isDecPackedSign3Modified()) { 
           decPackedSign3 = refreshDecPackedSign3();
        }
   		return decPackedSign3;
	}

    public char[] getDecPackedSign3String() {
          return  decPackedSign3String();
    }
	
	/**
	 * 	Update DecPackedSign3 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-PACKED-SIGN3
	 *	@param number
	 */
	public void setDecPackedSign3(BigDecimal number) {	
     decPackedSign3 = checkDecPackedSign3MaxLimit(number);
	    serializeDecPackedSign3(decPackedSign3);
   }
	public BigDecimal getDecPackedUnsign1() throws CFException {
        if (isDecPackedUnsign1Modified()) { 
           decPackedUnsign1 = refreshDecPackedUnsign1();
        }
   		return decPackedUnsign1;
	}

    public char[] getDecPackedUnsign1String() {
          return  decPackedUnsign1String();
    }
	
	/**
	 * 	Update DecPackedUnsign1 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-PACKED-UNSIGN1
	 *	@param number
	 */
	public void setDecPackedUnsign1(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     decPackedUnsign1 = checkDecPackedUnsign1MaxLimit(number);
	    serializeDecPackedUnsign1(decPackedUnsign1);
   }
	public BigDecimal getDecPackedUnsign2() throws CFException {
        if (isDecPackedUnsign2Modified()) { 
           decPackedUnsign2 = refreshDecPackedUnsign2();
        }
   		return decPackedUnsign2;
	}

    public char[] getDecPackedUnsign2String() {
          return  decPackedUnsign2String();
    }
	
	/**
	 * 	Update DecPackedUnsign2 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-PACKED-UNSIGN2
	 *	@param number
	 */
	public void setDecPackedUnsign2(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     decPackedUnsign2 = checkDecPackedUnsign2MaxLimit(number);
	    serializeDecPackedUnsign2(decPackedUnsign2);
   }
	public BigDecimal getDecPackedUnsign3() throws CFException {
        if (isDecPackedUnsign3Modified()) { 
           decPackedUnsign3 = refreshDecPackedUnsign3();
        }
   		return decPackedUnsign3;
	}

    public char[] getDecPackedUnsign3String() {
          return  decPackedUnsign3String();
    }
	
	/**
	 * 	Update DecPackedUnsign3 with the passed number
	 *  Corresponding COBOL Variable is WS-DEC-PACKED-UNSIGN3
	 *	@param number
	 */
	public void setDecPackedUnsign3(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     decPackedUnsign3 = checkDecPackedUnsign3MaxLimit(number);
	    serializeDecPackedUnsign3(decPackedUnsign3);
   }
	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs() throws CFException{
     if (isCharWsModified()) { 
        charWs = refreshCharWs();
     }
   		return charWs;
   }

  
	/**
	*  set variable charWs
	*  Corresponding COBOL Variable is WS-CHAR
	*  @param value
	**/
   public void setCharWs(char[] value) {
      charWs = checkCharWsConstraints(value);
      serializeCharWs(charWs);
   } 

     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharWs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharWs,charWs.length);
   	
   }
   
   public void setCharWs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs,charWs.length);
   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharWs with another Field
	 *	@param value
	 */
   public void setCharWs(Field source) {
       replace(source,0,source.length(),beginCharWs,CHAR_WS_LEN);
   	
   }  
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharWs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharWs,CHAR_WS_LEN);
   	
   }
   
     /**
	 * 	Update CharWs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharWs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharWs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charJustRight
	 *	@return charJustRight
	 */
   public char[] getCharJustRight() throws CFException{
     if (isCharJustRightModified()) { 
        charJustRight = refreshCharJustRight();
     }
   		return charJustRight;
   }

  
	/**
	*  set variable charJustRight
	*  Corresponding COBOL Variable is WS-CHAR-JUST-RIGHT
	*  @param value
	**/
   public void setCharJustRight(char[] value) {
      charJustRight = checkCharJustRightConstraints(value);
      serializeCharJustRight(charJustRight);
   } 

     /**
	 * 	Update CharJustRight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharJustRight(char[] source, int sourceIndex) {
        int targetIndex = (charJustRight.length - source.length) + beginCharJustRight;
        replace(source,sourceIndex,source.length,targetIndex,charJustRight.length);
   	
   }
   
   public void setCharJustRight(char[] source, int sourceIndex , int sourceLen) {
        int targetIndex = (charJustRight.length - sourceLen) + beginCharJustRight;
        replace(source,sourceIndex,sourceLen,targetIndex,charJustRight.length);
   	
   }
   
     /**
	 * 	Update CharJustRight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharJustRight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (targetLen - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginCharJustRight+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharJustRight with another Field
	 *	@param value
	 */
   public void setCharJustRight(Field source) {
        int targetIndex = (CHAR_JUST_RIGHT_LEN - source.length()) + beginCharJustRight;
        replace(source,0,source.length(),targetIndex,CHAR_JUST_RIGHT_LEN);
   	
   }  
   
     /**
	 * 	Update CharJustRight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharJustRight(Field source, int sourceIndex,int sourceLen) {
        int targetIndex = (CHAR_JUST_RIGHT_LEN - sourceLen) + beginCharJustRight;
        replace(source,sourceIndex,sourceLen,targetIndex,CHAR_JUST_RIGHT_LEN);
   	
   }
   
     /**
	 * 	Update CharJustRight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharJustRight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (CHAR_JUST_RIGHT_LEN - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginCharJustRight+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charZero
	 *	@return charZero
	 */
   public char[] getCharZero() throws CFException{
     if (isCharZeroModified()) { 
        charZero = refreshCharZero();
     }
   		return charZero;
   }

  
	/**
	*  set variable charZero
	*  Corresponding COBOL Variable is WS-CHAR-ZERO
	*  @param value
	**/
   public void setCharZero(char[] value) {
      charZero = checkCharZeroConstraints(value);
      serializeCharZero(charZero);
   } 

     /**
	 * 	Update CharZero 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharZero(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharZero,charZero.length);
   	
   }
   
   public void setCharZero(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharZero,charZero.length);
   	
   }
   
     /**
	 * 	Update CharZero 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharZero(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharZero+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharZero with another Field
	 *	@param value
	 */
   public void setCharZero(Field source) {
       replace(source,0,source.length(),beginCharZero,CHAR_ZERO_LEN);
   	
   }  
   
     /**
	 * 	Update CharZero 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharZero(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharZero,CHAR_ZERO_LEN);
   	
   }
   
     /**
	 * 	Update CharZero 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharZero(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharZero+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes GroupWithoutValue
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setBinarySign1((short)0);
                     setBinarySign2(0);
                     setBinarySign3(0);
                     setBinaryUnsign1(0);
                     setBinaryUnsign2(0);
                     setBinaryUnsign3(0);
         	setDisplaySign1((short)0);
                     setDisplaySign2(0);
                     setDisplaySign3(0);
                     setDisplayUnsign1(0);
                     setDisplayUnsign2(0);
                     setDisplayUnsign3(0);
         	setPackedSign1((short)0);
                     setPackedSign2(0);
                     setPackedSign3(0);
                     setPackedUnsign1(0);
                     setPackedUnsign2(0);
                     setPackedUnsign3(0);
			setDecBinarySign1(BigDecimal.ZERO);
			setDecBinarySign2(BigDecimal.ZERO);
			setDecBinarySign3(BigDecimal.ZERO);
			setDecBinaryUnsign1(BigDecimal.ZERO);
			setDecBinaryUnsign2(BigDecimal.ZERO);
			setDecBinaryUnsign3(BigDecimal.ZERO);
			setDecDisplaySign1(BigDecimal.ZERO);
			setDecDisplaySign2(BigDecimal.ZERO);
			setDecDisplaySign3(BigDecimal.ZERO);
			setDecDisplayUnsign1(BigDecimal.ZERO);
			setDecDisplayUnsign2(BigDecimal.ZERO);
			setDecDisplayUnsign3(BigDecimal.ZERO);
			setDecPackedSign1(BigDecimal.ZERO);
			setDecPackedSign2(BigDecimal.ZERO);
			setDecPackedSign3(BigDecimal.ZERO);
			setDecPackedUnsign1(BigDecimal.ZERO);
			setDecPackedUnsign2(BigDecimal.ZERO);
			setDecPackedUnsign3(BigDecimal.ZERO);
         setCharWs(CONSTANTS.SPACE_5);
         setCharJustRight(CONSTANTS.SPACE_5);
                    setCharZero(CONSTANTS.SPACE_5);
   }

		public static int getGroupWithoutValueFieldLength() {
			return GROUP_WITHOUT_VALUE_LENGTH;
		}

}
  
