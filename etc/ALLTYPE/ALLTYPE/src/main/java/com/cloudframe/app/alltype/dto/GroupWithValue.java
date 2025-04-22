package com.cloudframe.app.alltype.dto;

/**
*  The class GroupWithValue is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.alltype.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import java.math.RoundingMode;
import com.cloudframe.app.common.CONSTANTS;


public class GroupWithValue extends GroupWithValueSerialized { 
   

								private short bBinarySign1;

								private int bBinarySign2;

								private long bBinarySign3;

								private int bBinaryUnsign1;

								private long bBinaryUnsign2;

								private long bBinaryUnsign3;

								private short bDisplaySign1;

								private int bDisplaySign2;

								private long bDisplaySign3;

								private int bDisplayUnsign1;

								private long bDisplayUnsign2;

								private long bDisplayUnsign3;

								private short bPackedSign1;

								private int bPackedSign2;

								private long bPackedSign3;

								private int bPackedUnsign1;

								private long bPackedUnsign2;

								private long bPackedUnsign3;

								private BigDecimal bDecBinarySign1 = BigDecimal.ZERO;

								private BigDecimal bDecBinarySign2 = BigDecimal.ZERO;

								private BigDecimal bDecBinarySign3 = BigDecimal.ZERO;

								private BigDecimal bDecBinaryUnsign1 = BigDecimal.ZERO;

								private BigDecimal bDecBinaryUnsign2 = BigDecimal.ZERO;

								private BigDecimal bDecBinaryUnsign3 = BigDecimal.ZERO;

								private BigDecimal bDecDisplaySign1 = BigDecimal.ZERO;

								private BigDecimal bDecDisplaySign2 = BigDecimal.ZERO;

								private BigDecimal bDecDisplaySign3 = BigDecimal.ZERO;

								private BigDecimal bDecDisplayUnsign1 = BigDecimal.ZERO;

								private BigDecimal bDecDisplayUnsign2 = BigDecimal.ZERO;

								private BigDecimal bDecDisplayUnsign3 = BigDecimal.ZERO;

								private BigDecimal bDecPackedSign1 = BigDecimal.ZERO;

								private BigDecimal bDecPackedSign2 = BigDecimal.ZERO;

								private BigDecimal bDecPackedSign3 = BigDecimal.ZERO;

								private BigDecimal bDecPackedUnsign1 = BigDecimal.ZERO;

								private BigDecimal bDecPackedUnsign2 = BigDecimal.ZERO;

								private BigDecimal bDecPackedUnsign3 = BigDecimal.ZERO;

						private char[] bChar = new char[5];

						private char[] bCharJustRight = new char[5];

								private char[] bCharZero = new char[5];
							
	
	/**
	* Constructor for GroupWithValue
	**/
    public GroupWithValue() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GroupWithValue. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWithValue(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setBBinarySign1((short)1);
								setBBinarySign2(1);
								setBBinarySign3(1L);
								setBBinaryUnsign1(1);
								setBBinaryUnsign2(1L);
								setBBinaryUnsign3(1L);
								setBDisplaySign1((short)1);
								setBDisplaySign2(1);
								setBDisplaySign3(1L);
								setBDisplayUnsign1(1);
								setBDisplayUnsign2(1L);
								setBDisplayUnsign3(1L);
								setBPackedSign1((short)1);
								setBPackedSign2(1);
								setBPackedSign3(1L);
								setBPackedUnsign1(1);
								setBPackedUnsign2(1L);
								setBPackedUnsign3(1L);
								setBDecBinarySign1(BigDecimal.valueOf(1).setScale(2));
								setBDecBinarySign2(BigDecimal.valueOf(1).setScale(7));
								setBDecBinarySign3(BigDecimal.valueOf(1).setScale(9));
								setBDecBinaryUnsign1(BigDecimal.valueOf(1).setScale(2));
								setBDecBinaryUnsign2(BigDecimal.valueOf(1).setScale(6));
								setBDecBinaryUnsign3(BigDecimal.valueOf(1).setScale(9));
								setBDecDisplaySign1(BigDecimal.valueOf(1).setScale(2));
								setBDecDisplaySign2(BigDecimal.valueOf(1).setScale(7));
								setBDecDisplaySign3(BigDecimal.valueOf(1).setScale(9));
								setBDecDisplayUnsign1(BigDecimal.valueOf(1).setScale(2));
								setBDecDisplayUnsign2(BigDecimal.valueOf(1).setScale(6));
								setBDecDisplayUnsign3(BigDecimal.valueOf(1).setScale(9));
								setBDecPackedSign1(BigDecimal.valueOf(1).setScale(2));
								setBDecPackedSign2(BigDecimal.valueOf(1).setScale(7));
								setBDecPackedSign3(BigDecimal.valueOf(1).setScale(9));
								setBDecPackedUnsign1(BigDecimal.valueOf(1).setScale(2));
								setBDecPackedUnsign2(BigDecimal.valueOf(1).setScale(6));
								setBDecPackedUnsign3(BigDecimal.valueOf(1).setScale(9));
								setBChar(("1    ").toCharArray());
								setBCharJustRight(("1    ").toCharArray());
								setBCharZero(("1    ").toCharArray());
    } 

	/**
	 *	Returns the value of bBinarySign1
	 *	@return bBinarySign1
	 */
	public short getBBinarySign1() throws CFException {
        if (isBBinarySign1Modified()) { 
           bBinarySign1 = refreshBBinarySign1();
        }
   		return bBinarySign1;
	}
	
	/**
	 * 	Update BBinarySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-BINARY-SIGN1
	 *	@param number
	 */
	public void setBBinarySign1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    bBinarySign1 = checkBBinarySign1MaxLimit(number); 
		serializeBBinarySign1(bBinarySign1);
	}

	public void setBBinarySign1(int number) {
	    number = checkBBinarySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBBinarySign1((short)number);
	}
	public void setBBinarySign1(long number) {
	    number = checkBBinarySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBBinarySign1((short)number);
	}
	

	/**
	 *	Returns the value of bBinarySign2
	 *	@return bBinarySign2
	 */
	public int getBBinarySign2() throws CFException {
        if (isBBinarySign2Modified()) { 
           bBinarySign2 = refreshBBinarySign2();
        }
   		return bBinarySign2;
	}
	
	/**
	 * 	Update BBinarySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-BINARY-SIGN2
	 *	@param number
	 */
	public void setBBinarySign2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    bBinarySign2 = checkBBinarySign2MaxLimit(number); 
		serializeBBinarySign2(bBinarySign2);
	}


	public void setBBinarySign2(long number) {
	    number = checkBBinarySign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBBinarySign2((int)number);
	}
	
	/**
	 *	Returns the value of bBinarySign3
	 *	@return bBinarySign3
	 */
	public long getBBinarySign3() throws CFException {
        if (isBBinarySign3Modified()) { 
           bBinarySign3 = refreshBBinarySign3();
        }
   		return bBinarySign3;
	}
	
	/**
	 * 	Update BBinarySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-BINARY-SIGN3
	 *	@param number
	 */
	public void setBBinarySign3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    bBinarySign3 = checkBBinarySign3MaxLimit(number); 
		serializeBBinarySign3(bBinarySign3);
	}


	/**
	 *	Returns the value of bBinaryUnsign1
	 *	@return bBinaryUnsign1
	 */
	public int getBBinaryUnsign1() throws CFException {
        if (isBBinaryUnsign1Modified()) { 
           bBinaryUnsign1 = refreshBBinaryUnsign1();
        }
   		return bBinaryUnsign1;
	}
	
	/**
	 * 	Update BBinaryUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-BINARY-UNSIGN1
	 *	@param number
	 */
	public void setBBinaryUnsign1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    bBinaryUnsign1 = checkBBinaryUnsign1MaxLimit(number); 
		serializeBBinaryUnsign1(bBinaryUnsign1);
	}


	public void setBBinaryUnsign1(long number) {
	    number = checkBBinaryUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBBinaryUnsign1((int)number);
	}
	
	/**
	 *	Returns the value of bBinaryUnsign2
	 *	@return bBinaryUnsign2
	 */
	public long getBBinaryUnsign2() throws CFException {
        if (isBBinaryUnsign2Modified()) { 
           bBinaryUnsign2 = refreshBBinaryUnsign2();
        }
   		return bBinaryUnsign2;
	}
	
	/**
	 * 	Update BBinaryUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-BINARY-UNSIGN2
	 *	@param number
	 */
	public void setBBinaryUnsign2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    bBinaryUnsign2 = checkBBinaryUnsign2MaxLimit(number); 
		serializeBBinaryUnsign2(bBinaryUnsign2);
	}


	/**
	 *	Returns the value of bBinaryUnsign3
	 *	@return bBinaryUnsign3
	 */
	public long getBBinaryUnsign3() throws CFException {
        if (isBBinaryUnsign3Modified()) { 
           bBinaryUnsign3 = refreshBBinaryUnsign3();
        }
   		return bBinaryUnsign3;
	}
	
	/**
	 * 	Update BBinaryUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-BINARY-UNSIGN3
	 *	@param number
	 */
	public void setBBinaryUnsign3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    bBinaryUnsign3 = checkBBinaryUnsign3MaxLimit(number); 
		serializeBBinaryUnsign3(bBinaryUnsign3);
	}


	/**
	 *	Returns the value of bDisplaySign1
	 *	@return bDisplaySign1
	 */
	public short getBDisplaySign1() throws CFException {
       if (isBDisplaySign1Modified()) { 
           bDisplaySign1 = refreshBDisplaySign1();
        }
   		return bDisplaySign1;
	}
	

    /**
	 *	Returns the String value of bDisplaySign1
	 *	@return bDisplaySign1
	 */
	public char[]  getBDisplaySign1ActualString() {
	    String value = String.valueOf(bDisplaySign1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BDisplaySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DISPLAY-SIGN1
	 *	@param number
	 */
	public void setBDisplaySign1(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    bDisplaySign1 = checkBDisplaySign1MaxLimit(number); 
		serializeBDisplaySign1(bDisplaySign1);
	}
	
	public void setBDisplaySign1(int number) {
	    number = checkBDisplaySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBDisplaySign1((short)number);
	}
	public void setBDisplaySign1(long number) {
	    number = checkBDisplaySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBDisplaySign1((short)number);
	}
	

	/**
	 * 	Update BDisplaySign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDisplaySign1(char[] value) throws CFException {
		 bDisplaySign1 = serializeBDisplaySign1(value);
	}
	/**
	 * 	Update BDisplaySign1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBDisplaySign1String(char[] value) throws CFException {
		 setBDisplaySign1(value);
	}
	/**
	 *	Returns the value of bDisplaySign2
	 *	@return bDisplaySign2
	 */
	public int getBDisplaySign2() throws CFException {
       if (isBDisplaySign2Modified()) { 
           bDisplaySign2 = refreshBDisplaySign2();
        }
   		return bDisplaySign2;
	}
	

    /**
	 *	Returns the String value of bDisplaySign2
	 *	@return bDisplaySign2
	 */
	public char[]  getBDisplaySign2ActualString() {
	    String value = String.valueOf(bDisplaySign2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BDisplaySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DISPLAY-SIGN2
	 *	@param number
	 */
	public void setBDisplaySign2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bDisplaySign2 = checkBDisplaySign2MaxLimit(number); 
		serializeBDisplaySign2(bDisplaySign2);
	}
	

	public void setBDisplaySign2(long number) {
	    number = checkBDisplaySign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBDisplaySign2((int)number);
	}
	
	/**
	 * 	Update BDisplaySign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDisplaySign2(char[] value) throws CFException {
		 bDisplaySign2 = serializeBDisplaySign2(value);
	}
	/**
	 * 	Update BDisplaySign2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBDisplaySign2String(char[] value) throws CFException {
		 setBDisplaySign2(value);
	}
	/**
	 *	Returns the value of bDisplaySign3
	 *	@return bDisplaySign3
	 */
	public long getBDisplaySign3() throws CFException {
       if (isBDisplaySign3Modified()) { 
           bDisplaySign3 = refreshBDisplaySign3();
        }
   		return bDisplaySign3;
	}
	

    /**
	 *	Returns the String value of bDisplaySign3
	 *	@return bDisplaySign3
	 */
	public char[]  getBDisplaySign3ActualString() {
	    String value = String.valueOf(bDisplaySign3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BDisplaySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DISPLAY-SIGN3
	 *	@param number
	 */
	public void setBDisplaySign3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bDisplaySign3 = checkBDisplaySign3MaxLimit(number); 
		serializeBDisplaySign3(bDisplaySign3);
	}
	

	/**
	 * 	Update BDisplaySign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDisplaySign3(char[] value) throws CFException {
		 bDisplaySign3 = serializeBDisplaySign3(value);
	}
	/**
	 * 	Update BDisplaySign3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBDisplaySign3String(char[] value) throws CFException {
		 setBDisplaySign3(value);
	}
	/**
	 *	Returns the value of bDisplayUnsign1
	 *	@return bDisplayUnsign1
	 */
	public int getBDisplayUnsign1() throws CFException {
       if (isBDisplayUnsign1Modified()) { 
           bDisplayUnsign1 = refreshBDisplayUnsign1();
        }
   		return bDisplayUnsign1;
	}
	

	
	   
	/**
	 * 	Update BDisplayUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DISPLAY-UNSIGN1
	 *	@param number
	 */
	public void setBDisplayUnsign1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bDisplayUnsign1 = checkBDisplayUnsign1MaxLimit(number); 
		serializeBDisplayUnsign1(bDisplayUnsign1);
	}
	

	public void setBDisplayUnsign1(long number) {
	    number = checkBDisplayUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBDisplayUnsign1((int)number);
	}
	
	/**
	 * 	Update BDisplayUnsign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDisplayUnsign1(char[] value) throws CFException {
		 bDisplayUnsign1 = serializeBDisplayUnsign1(value);
	}
	/**
	 * 	Update BDisplayUnsign1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBDisplayUnsign1String(char[] value) throws CFException {
		 setBDisplayUnsign1(value);
	}
	/**
	 *	Returns the value of bDisplayUnsign2
	 *	@return bDisplayUnsign2
	 */
	public long getBDisplayUnsign2() throws CFException {
       if (isBDisplayUnsign2Modified()) { 
           bDisplayUnsign2 = refreshBDisplayUnsign2();
        }
   		return bDisplayUnsign2;
	}
	

	
	   
	/**
	 * 	Update BDisplayUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DISPLAY-UNSIGN2
	 *	@param number
	 */
	public void setBDisplayUnsign2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bDisplayUnsign2 = checkBDisplayUnsign2MaxLimit(number); 
		serializeBDisplayUnsign2(bDisplayUnsign2);
	}
	

	/**
	 * 	Update BDisplayUnsign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDisplayUnsign2(char[] value) throws CFException {
		 bDisplayUnsign2 = serializeBDisplayUnsign2(value);
	}
	/**
	 * 	Update BDisplayUnsign2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBDisplayUnsign2String(char[] value) throws CFException {
		 setBDisplayUnsign2(value);
	}
	/**
	 *	Returns the value of bDisplayUnsign3
	 *	@return bDisplayUnsign3
	 */
	public long getBDisplayUnsign3() throws CFException {
       if (isBDisplayUnsign3Modified()) { 
           bDisplayUnsign3 = refreshBDisplayUnsign3();
        }
   		return bDisplayUnsign3;
	}
	

	
	   
	/**
	 * 	Update BDisplayUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DISPLAY-UNSIGN3
	 *	@param number
	 */
	public void setBDisplayUnsign3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bDisplayUnsign3 = checkBDisplayUnsign3MaxLimit(number); 
		serializeBDisplayUnsign3(bDisplayUnsign3);
	}
	

	/**
	 * 	Update BDisplayUnsign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDisplayUnsign3(char[] value) throws CFException {
		 bDisplayUnsign3 = serializeBDisplayUnsign3(value);
	}
	/**
	 * 	Update BDisplayUnsign3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBDisplayUnsign3String(char[] value) throws CFException {
		 setBDisplayUnsign3(value);
	}
	public short getBPackedSign1() throws CFException {
        if (isBPackedSign1Modified()) { 
           bPackedSign1 = refreshBPackedSign1();
        }
   		return bPackedSign1;
	}
	
	/**
	 * 	Update BPackedSign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-PACKED-SIGN1
	 *	@param number
	 */
	public void setBPackedSign1(short number) {
			bPackedSign1 = checkBPackedSign1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeBPackedSign1(bPackedSign1);
	}

	public void setBPackedSign1(int number) {
	    number = checkBPackedSign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBPackedSign1((short)number);
	}
	public void setBPackedSign1(long number) {
	    number = checkBPackedSign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBPackedSign1((short)number);
	}
	

	public int getBPackedSign2() throws CFException {
        if (isBPackedSign2Modified()) { 
           bPackedSign2 = refreshBPackedSign2();
        }
   		return bPackedSign2;
	}
	
	/**
	 * 	Update BPackedSign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-PACKED-SIGN2
	 *	@param number
	 */
	public void setBPackedSign2(int number) {
			bPackedSign2 = checkBPackedSign2MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeBPackedSign2(bPackedSign2);
	}


	public void setBPackedSign2(long number) {
	    number = checkBPackedSign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBPackedSign2((int)number);
	}
	
	public long getBPackedSign3() throws CFException {
        if (isBPackedSign3Modified()) { 
           bPackedSign3 = refreshBPackedSign3();
        }
   		return bPackedSign3;
	}
	
	/**
	 * 	Update BPackedSign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-PACKED-SIGN3
	 *	@param number
	 */
	public void setBPackedSign3(long number) {
			bPackedSign3 = checkBPackedSign3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeBPackedSign3(bPackedSign3);
	}


	public int getBPackedUnsign1() throws CFException {
        if (isBPackedUnsign1Modified()) { 
           bPackedUnsign1 = refreshBPackedUnsign1();
        }
   		return bPackedUnsign1;
	}
	
	/**
	 * 	Update BPackedUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-PACKED-UNSIGN1
	 *	@param number
	 */
	public void setBPackedUnsign1(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			bPackedUnsign1 = checkBPackedUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeBPackedUnsign1(bPackedUnsign1);
	}


	public void setBPackedUnsign1(long number) {
	    number = checkBPackedUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBPackedUnsign1((int)number);
	}
	
	public long getBPackedUnsign2() throws CFException {
        if (isBPackedUnsign2Modified()) { 
           bPackedUnsign2 = refreshBPackedUnsign2();
        }
   		return bPackedUnsign2;
	}
	
	/**
	 * 	Update BPackedUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-PACKED-UNSIGN2
	 *	@param number
	 */
	public void setBPackedUnsign2(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			bPackedUnsign2 = checkBPackedUnsign2MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeBPackedUnsign2(bPackedUnsign2);
	}


	public long getBPackedUnsign3() throws CFException {
        if (isBPackedUnsign3Modified()) { 
           bPackedUnsign3 = refreshBPackedUnsign3();
        }
   		return bPackedUnsign3;
	}
	
	/**
	 * 	Update BPackedUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-PACKED-UNSIGN3
	 *	@param number
	 */
	public void setBPackedUnsign3(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			bPackedUnsign3 = checkBPackedUnsign3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeBPackedUnsign3(bPackedUnsign3);
	}


	/**
	 *	Returns the value of bDecBinarySign1
	 *	@return bDecBinarySign1
	 */
	public BigDecimal getBDecBinarySign1() throws CFException {
        if (isBDecBinarySign1Modified()) { 
           bDecBinarySign1 = refreshBDecBinarySign1();
        }
   		return bDecBinarySign1;
	}
	
	
	/**
	 * 	Update BDecBinarySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DEC-BINARY-SIGN1
	 *	@param number
	 */
	public void setBDecBinarySign1(BigDecimal number) {
		bDecBinarySign1 = number.setScale(2,RoundingMode.DOWN);
	    serializeBDecBinarySign1(number);
   }
              
	/**
	 *	Returns the value of bDecBinarySign2
	 *	@return bDecBinarySign2
	 */
	public BigDecimal getBDecBinarySign2() throws CFException {
        if (isBDecBinarySign2Modified()) { 
           bDecBinarySign2 = refreshBDecBinarySign2();
        }
   		return bDecBinarySign2;
	}
	
	
	/**
	 * 	Update BDecBinarySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DEC-BINARY-SIGN2
	 *	@param number
	 */
	public void setBDecBinarySign2(BigDecimal number) {
		bDecBinarySign2 = number.setScale(7,RoundingMode.DOWN);
	    serializeBDecBinarySign2(number);
   }
              
	/**
	 *	Returns the value of bDecBinarySign3
	 *	@return bDecBinarySign3
	 */
	public BigDecimal getBDecBinarySign3() throws CFException {
        if (isBDecBinarySign3Modified()) { 
           bDecBinarySign3 = refreshBDecBinarySign3();
        }
   		return bDecBinarySign3;
	}
	
	
	/**
	 * 	Update BDecBinarySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DEC-BINARY-SIGN3
	 *	@param number
	 */
	public void setBDecBinarySign3(BigDecimal number) {
		bDecBinarySign3 = number.setScale(9,RoundingMode.DOWN);
	    serializeBDecBinarySign3(number);
   }
              
	/**
	 *	Returns the value of bDecBinaryUnsign1
	 *	@return bDecBinaryUnsign1
	 */
	public BigDecimal getBDecBinaryUnsign1() throws CFException {
        if (isBDecBinaryUnsign1Modified()) { 
           bDecBinaryUnsign1 = refreshBDecBinaryUnsign1();
        }
   		return bDecBinaryUnsign1;
	}
	
	
	/**
	 * 	Update BDecBinaryUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DEC-BINARY-UNSIGN1
	 *	@param number
	 */
	public void setBDecBinaryUnsign1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		bDecBinaryUnsign1 = number.setScale(2,RoundingMode.DOWN);
	    serializeBDecBinaryUnsign1(number);
   }
              
	/**
	 *	Returns the value of bDecBinaryUnsign2
	 *	@return bDecBinaryUnsign2
	 */
	public BigDecimal getBDecBinaryUnsign2() throws CFException {
        if (isBDecBinaryUnsign2Modified()) { 
           bDecBinaryUnsign2 = refreshBDecBinaryUnsign2();
        }
   		return bDecBinaryUnsign2;
	}
	
	
	/**
	 * 	Update BDecBinaryUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DEC-BINARY-UNSIGN2
	 *	@param number
	 */
	public void setBDecBinaryUnsign2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		bDecBinaryUnsign2 = number.setScale(6,RoundingMode.DOWN);
	    serializeBDecBinaryUnsign2(number);
   }
              
	/**
	 *	Returns the value of bDecBinaryUnsign3
	 *	@return bDecBinaryUnsign3
	 */
	public BigDecimal getBDecBinaryUnsign3() throws CFException {
        if (isBDecBinaryUnsign3Modified()) { 
           bDecBinaryUnsign3 = refreshBDecBinaryUnsign3();
        }
   		return bDecBinaryUnsign3;
	}
	
	
	/**
	 * 	Update BDecBinaryUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-B-DEC-BINARY-UNSIGN3
	 *	@param number
	 */
	public void setBDecBinaryUnsign3(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		bDecBinaryUnsign3 = number.setScale(9,RoundingMode.DOWN);
	    serializeBDecBinaryUnsign3(number);
   }
              
	/**
	 *	Returns the value of bDecDisplaySign1
	 *	@return bDecDisplaySign1
	 */
	public BigDecimal getBDecDisplaySign1() throws CFException {
       if (isBDecDisplaySign1Modified()) { 
           bDecDisplaySign1 = refreshBDecDisplaySign1();
        }
   		return bDecDisplaySign1;
	}
	

    /**
	 *	Returns the String value of bDecDisplaySign1
	 *	@return bDecDisplaySign1
	 */
	public char[]  getBDecDisplaySign1ActualString() {
	    String value = String.valueOf(bDecDisplaySign1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BDecDisplaySign1 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-DISPLAY-SIGN1
	 *	@param number
	 */
	public void setBDecDisplaySign1(BigDecimal number) {
       bDecDisplaySign1 = checkBDecDisplaySign1MaxLimit(number);
	    serializeBDecDisplaySign1(bDecDisplaySign1);
   }
	/**
	 * 	Update BDecDisplaySign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDecDisplaySign1(char[] value) throws CFException {
		 bDecDisplaySign1 = serializeBDecDisplaySign1(value);
	}   
	/**
	 *	Returns the value of bDecDisplaySign2
	 *	@return bDecDisplaySign2
	 */
	public BigDecimal getBDecDisplaySign2() throws CFException {
       if (isBDecDisplaySign2Modified()) { 
           bDecDisplaySign2 = refreshBDecDisplaySign2();
        }
   		return bDecDisplaySign2;
	}
	

    /**
	 *	Returns the String value of bDecDisplaySign2
	 *	@return bDecDisplaySign2
	 */
	public char[]  getBDecDisplaySign2ActualString() {
	    String value = String.valueOf(bDecDisplaySign2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BDecDisplaySign2 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-DISPLAY-SIGN2
	 *	@param number
	 */
	public void setBDecDisplaySign2(BigDecimal number) {
       bDecDisplaySign2 = checkBDecDisplaySign2MaxLimit(number);
	    serializeBDecDisplaySign2(bDecDisplaySign2);
   }
	/**
	 * 	Update BDecDisplaySign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDecDisplaySign2(char[] value) throws CFException {
		 bDecDisplaySign2 = serializeBDecDisplaySign2(value);
	}   
	/**
	 *	Returns the value of bDecDisplaySign3
	 *	@return bDecDisplaySign3
	 */
	public BigDecimal getBDecDisplaySign3() throws CFException {
       if (isBDecDisplaySign3Modified()) { 
           bDecDisplaySign3 = refreshBDecDisplaySign3();
        }
   		return bDecDisplaySign3;
	}
	

    /**
	 *	Returns the String value of bDecDisplaySign3
	 *	@return bDecDisplaySign3
	 */
	public char[]  getBDecDisplaySign3ActualString() {
	    String value = String.valueOf(bDecDisplaySign3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update BDecDisplaySign3 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-DISPLAY-SIGN3
	 *	@param number
	 */
	public void setBDecDisplaySign3(BigDecimal number) {
       bDecDisplaySign3 = checkBDecDisplaySign3MaxLimit(number);
	    serializeBDecDisplaySign3(bDecDisplaySign3);
   }
	/**
	 * 	Update BDecDisplaySign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDecDisplaySign3(char[] value) throws CFException {
		 bDecDisplaySign3 = serializeBDecDisplaySign3(value);
	}   
	/**
	 *	Returns the value of bDecDisplayUnsign1
	 *	@return bDecDisplayUnsign1
	 */
	public BigDecimal getBDecDisplayUnsign1() throws CFException {
       if (isBDecDisplayUnsign1Modified()) { 
           bDecDisplayUnsign1 = refreshBDecDisplayUnsign1();
        }
   		return bDecDisplayUnsign1;
	}
	

	
	   
	/**
	 * 	Update BDecDisplayUnsign1 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-DISPLAY-UNSIGN1
	 *	@param number
	 */
	public void setBDecDisplayUnsign1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bDecDisplayUnsign1 = checkBDecDisplayUnsign1MaxLimit(number);
	    serializeBDecDisplayUnsign1(bDecDisplayUnsign1);
   }
	/**
	 * 	Update BDecDisplayUnsign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDecDisplayUnsign1(char[] value) throws CFException {
		 bDecDisplayUnsign1 = serializeBDecDisplayUnsign1(value);
	}   
	/**
	 *	Returns the value of bDecDisplayUnsign2
	 *	@return bDecDisplayUnsign2
	 */
	public BigDecimal getBDecDisplayUnsign2() throws CFException {
       if (isBDecDisplayUnsign2Modified()) { 
           bDecDisplayUnsign2 = refreshBDecDisplayUnsign2();
        }
   		return bDecDisplayUnsign2;
	}
	

	
	   
	/**
	 * 	Update BDecDisplayUnsign2 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-DISPLAY-UNSIGN2
	 *	@param number
	 */
	public void setBDecDisplayUnsign2(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bDecDisplayUnsign2 = checkBDecDisplayUnsign2MaxLimit(number);
	    serializeBDecDisplayUnsign2(bDecDisplayUnsign2);
   }
	/**
	 * 	Update BDecDisplayUnsign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDecDisplayUnsign2(char[] value) throws CFException {
		 bDecDisplayUnsign2 = serializeBDecDisplayUnsign2(value);
	}   
	/**
	 *	Returns the value of bDecDisplayUnsign3
	 *	@return bDecDisplayUnsign3
	 */
	public BigDecimal getBDecDisplayUnsign3() throws CFException {
       if (isBDecDisplayUnsign3Modified()) { 
           bDecDisplayUnsign3 = refreshBDecDisplayUnsign3();
        }
   		return bDecDisplayUnsign3;
	}
	

	
	   
	/**
	 * 	Update BDecDisplayUnsign3 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-DISPLAY-UNSIGN3
	 *	@param number
	 */
	public void setBDecDisplayUnsign3(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       bDecDisplayUnsign3 = checkBDecDisplayUnsign3MaxLimit(number);
	    serializeBDecDisplayUnsign3(bDecDisplayUnsign3);
   }
	/**
	 * 	Update BDecDisplayUnsign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBDecDisplayUnsign3(char[] value) throws CFException {
		 bDecDisplayUnsign3 = serializeBDecDisplayUnsign3(value);
	}   
	public BigDecimal getBDecPackedSign1() throws CFException {
        if (isBDecPackedSign1Modified()) { 
           bDecPackedSign1 = refreshBDecPackedSign1();
        }
   		return bDecPackedSign1;
	}

    public char[] getBDecPackedSign1String() {
          return  bDecPackedSign1String();
    }
	
	/**
	 * 	Update BDecPackedSign1 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-PACKED-SIGN1
	 *	@param number
	 */
	public void setBDecPackedSign1(BigDecimal number) {	
     bDecPackedSign1 = checkBDecPackedSign1MaxLimit(number);
	    serializeBDecPackedSign1(bDecPackedSign1);
   }
	public BigDecimal getBDecPackedSign2() throws CFException {
        if (isBDecPackedSign2Modified()) { 
           bDecPackedSign2 = refreshBDecPackedSign2();
        }
   		return bDecPackedSign2;
	}

    public char[] getBDecPackedSign2String() {
          return  bDecPackedSign2String();
    }
	
	/**
	 * 	Update BDecPackedSign2 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-PACKED-SIGN2
	 *	@param number
	 */
	public void setBDecPackedSign2(BigDecimal number) {	
     bDecPackedSign2 = checkBDecPackedSign2MaxLimit(number);
	    serializeBDecPackedSign2(bDecPackedSign2);
   }
	public BigDecimal getBDecPackedSign3() throws CFException {
        if (isBDecPackedSign3Modified()) { 
           bDecPackedSign3 = refreshBDecPackedSign3();
        }
   		return bDecPackedSign3;
	}

    public char[] getBDecPackedSign3String() {
          return  bDecPackedSign3String();
    }
	
	/**
	 * 	Update BDecPackedSign3 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-PACKED-SIGN3
	 *	@param number
	 */
	public void setBDecPackedSign3(BigDecimal number) {	
     bDecPackedSign3 = checkBDecPackedSign3MaxLimit(number);
	    serializeBDecPackedSign3(bDecPackedSign3);
   }
	public BigDecimal getBDecPackedUnsign1() throws CFException {
        if (isBDecPackedUnsign1Modified()) { 
           bDecPackedUnsign1 = refreshBDecPackedUnsign1();
        }
   		return bDecPackedUnsign1;
	}

    public char[] getBDecPackedUnsign1String() {
          return  bDecPackedUnsign1String();
    }
	
	/**
	 * 	Update BDecPackedUnsign1 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-PACKED-UNSIGN1
	 *	@param number
	 */
	public void setBDecPackedUnsign1(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     bDecPackedUnsign1 = checkBDecPackedUnsign1MaxLimit(number);
	    serializeBDecPackedUnsign1(bDecPackedUnsign1);
   }
	public BigDecimal getBDecPackedUnsign2() throws CFException {
        if (isBDecPackedUnsign2Modified()) { 
           bDecPackedUnsign2 = refreshBDecPackedUnsign2();
        }
   		return bDecPackedUnsign2;
	}

    public char[] getBDecPackedUnsign2String() {
          return  bDecPackedUnsign2String();
    }
	
	/**
	 * 	Update BDecPackedUnsign2 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-PACKED-UNSIGN2
	 *	@param number
	 */
	public void setBDecPackedUnsign2(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     bDecPackedUnsign2 = checkBDecPackedUnsign2MaxLimit(number);
	    serializeBDecPackedUnsign2(bDecPackedUnsign2);
   }
	public BigDecimal getBDecPackedUnsign3() throws CFException {
        if (isBDecPackedUnsign3Modified()) { 
           bDecPackedUnsign3 = refreshBDecPackedUnsign3();
        }
   		return bDecPackedUnsign3;
	}

    public char[] getBDecPackedUnsign3String() {
          return  bDecPackedUnsign3String();
    }
	
	/**
	 * 	Update BDecPackedUnsign3 with the passed number
	 *  Corresponding COBOL Variable is WS-B-DEC-PACKED-UNSIGN3
	 *	@param number
	 */
	public void setBDecPackedUnsign3(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     bDecPackedUnsign3 = checkBDecPackedUnsign3MaxLimit(number);
	    serializeBDecPackedUnsign3(bDecPackedUnsign3);
   }
	/**
	 *	Returns the value of bChar
	 *	@return bChar
	 */
   public char[] getBChar() throws CFException{
     if (isBCharModified()) { 
        bChar = refreshBChar();
     }
   		return bChar;
   }

  
	/**
	*  set variable bChar
	*  Corresponding COBOL Variable is WS-B-CHAR
	*  @param value
	**/
   public void setBChar(char[] value) {
      bChar = checkBCharConstraints(value);
      serializeBChar(bChar);
   } 

     /**
	 * 	Update BChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBChar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBChar,bChar.length);
   	
   }
   
   public void setBChar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBChar,bChar.length);
   	
   }
   
     /**
	 * 	Update BChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBChar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BChar with another Field
	 *	@param value
	 */
   public void setBChar(Field source) {
       replace(source,0,source.length(),beginBChar,B_CHAR_LEN);
   	
   }  
   
     /**
	 * 	Update BChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBChar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBChar,B_CHAR_LEN);
   	
   }
   
     /**
	 * 	Update BChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBChar+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bCharJustRight
	 *	@return bCharJustRight
	 */
   public char[] getBCharJustRight() throws CFException{
     if (isBCharJustRightModified()) { 
        bCharJustRight = refreshBCharJustRight();
     }
   		return bCharJustRight;
   }

  
	/**
	*  set variable bCharJustRight
	*  Corresponding COBOL Variable is WS-B-CHAR-JUST-RIGHT
	*  @param value
	**/
   public void setBCharJustRight(char[] value) {
      bCharJustRight = checkBCharJustRightConstraints(value);
      serializeBCharJustRight(bCharJustRight);
   } 

     /**
	 * 	Update BCharJustRight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBCharJustRight(char[] source, int sourceIndex) {
        int targetIndex = (bCharJustRight.length - source.length) + beginBCharJustRight;
        replace(source,sourceIndex,source.length,targetIndex,bCharJustRight.length);
   	
   }
   
   public void setBCharJustRight(char[] source, int sourceIndex , int sourceLen) {
        int targetIndex = (bCharJustRight.length - sourceLen) + beginBCharJustRight;
        replace(source,sourceIndex,sourceLen,targetIndex,bCharJustRight.length);
   	
   }
   
     /**
	 * 	Update BCharJustRight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBCharJustRight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (targetLen - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginBCharJustRight+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BCharJustRight with another Field
	 *	@param value
	 */
   public void setBCharJustRight(Field source) {
        int targetIndex = (B_CHAR_JUST_RIGHT_LEN - source.length()) + beginBCharJustRight;
        replace(source,0,source.length(),targetIndex,B_CHAR_JUST_RIGHT_LEN);
   	
   }  
   
     /**
	 * 	Update BCharJustRight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBCharJustRight(Field source, int sourceIndex,int sourceLen) {
        int targetIndex = (B_CHAR_JUST_RIGHT_LEN - sourceLen) + beginBCharJustRight;
        replace(source,sourceIndex,sourceLen,targetIndex,B_CHAR_JUST_RIGHT_LEN);
   	
   }
   
     /**
	 * 	Update BCharJustRight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBCharJustRight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (B_CHAR_JUST_RIGHT_LEN - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginBCharJustRight+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bCharZero
	 *	@return bCharZero
	 */
   public char[] getBCharZero() throws CFException{
     if (isBCharZeroModified()) { 
        bCharZero = refreshBCharZero();
     }
   		return bCharZero;
   }

  
	/**
	*  set variable bCharZero
	*  Corresponding COBOL Variable is WS-B-CHAR-ZERO
	*  @param value
	**/
   public void setBCharZero(char[] value) {
      bCharZero = checkBCharZeroConstraints(value);
      serializeBCharZero(bCharZero);
   } 

     /**
	 * 	Update BCharZero 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBCharZero(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBCharZero,bCharZero.length);
   	
   }
   
   public void setBCharZero(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBCharZero,bCharZero.length);
   	
   }
   
     /**
	 * 	Update BCharZero 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBCharZero(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBCharZero+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BCharZero with another Field
	 *	@param value
	 */
   public void setBCharZero(Field source) {
       replace(source,0,source.length(),beginBCharZero,B_CHAR_ZERO_LEN);
   	
   }  
   
     /**
	 * 	Update BCharZero 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBCharZero(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBCharZero,B_CHAR_ZERO_LEN);
   	
   }
   
     /**
	 * 	Update BCharZero 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBCharZero(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBCharZero+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes GroupWithValue
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setBBinarySign1((short)0);
                     setBBinarySign2(0);
                     setBBinarySign3(0);
                     setBBinaryUnsign1(0);
                     setBBinaryUnsign2(0);
                     setBBinaryUnsign3(0);
         	setBDisplaySign1((short)0);
                     setBDisplaySign2(0);
                     setBDisplaySign3(0);
                     setBDisplayUnsign1(0);
                     setBDisplayUnsign2(0);
                     setBDisplayUnsign3(0);
         	setBPackedSign1((short)0);
                     setBPackedSign2(0);
                     setBPackedSign3(0);
                     setBPackedUnsign1(0);
                     setBPackedUnsign2(0);
                     setBPackedUnsign3(0);
			setBDecBinarySign1(BigDecimal.ZERO);
			setBDecBinarySign2(BigDecimal.ZERO);
			setBDecBinarySign3(BigDecimal.ZERO);
			setBDecBinaryUnsign1(BigDecimal.ZERO);
			setBDecBinaryUnsign2(BigDecimal.ZERO);
			setBDecBinaryUnsign3(BigDecimal.ZERO);
			setBDecDisplaySign1(BigDecimal.ZERO);
			setBDecDisplaySign2(BigDecimal.ZERO);
			setBDecDisplaySign3(BigDecimal.ZERO);
			setBDecDisplayUnsign1(BigDecimal.ZERO);
			setBDecDisplayUnsign2(BigDecimal.ZERO);
			setBDecDisplayUnsign3(BigDecimal.ZERO);
			setBDecPackedSign1(BigDecimal.ZERO);
			setBDecPackedSign2(BigDecimal.ZERO);
			setBDecPackedSign3(BigDecimal.ZERO);
			setBDecPackedUnsign1(BigDecimal.ZERO);
			setBDecPackedUnsign2(BigDecimal.ZERO);
			setBDecPackedUnsign3(BigDecimal.ZERO);
         setBChar(CONSTANTS.SPACE_5);
         setBCharJustRight(CONSTANTS.SPACE_5);
                    setBCharZero(CONSTANTS.SPACE_5);
   }

		public static int getGroupWithValueFieldLength() {
			return GROUP_WITH_VALUE_LENGTH;
		}

}
  
