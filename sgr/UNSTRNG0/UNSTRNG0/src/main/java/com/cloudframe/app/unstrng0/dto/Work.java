package com.cloudframe.app.unstrng0.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.unstrng0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short data0Len;

						private char[] data0 = new char[98];

						private char[] data = new char[150];

						private char[] delim1 = Field.fillLowValue(4);

						private char[] delim3 = Field.fillLowValue(4);

						private char[] delim4 = Field.fillLowValue(4);

								private int count;

								private int count1;

								private long count2;

								private int count3;

								private long count4;

								private int count5;

								private long tally;

								private long pointer;

						private char[] field1 = Field.fillLowValue(35);

						private char[] field2 = Field.fillLowValue(30);

						private char[] field3 = Field.fillLowValue(35);

						private char[] field4 = Field.fillLowValue(35);

						private char[] field5 = Field.fillLowValue(60);

						private char[] inputRec = new char[100];

						private char[] inputRecOverflw1 = new char[100];

						private char[] inputRecOverflw2 = new char[100];

						private char[] inputRecOverflw3 = new char[100];

						private char[] val1 = Field.fillLowValue(30);

						private char[] val2 = Field.fillLowValue(30);

						private char[] val3 = Field.fillLowValue(30);

						private char[] val4 = Field.fillLowValue(30);

						private char[] val5 = Field.fillLowValue(30);

						private char[] val6 = Field.fillLowValue(30);

						private char[] val7 = Field.fillLowValue(30);

						private char[] val8 = Field.fillLowValue(30);

						private char[] val9 = Field.fillLowValue(30);

						private char[] vala = Field.fillLowValue(30);

						private char[] valb = Field.fillLowValue(30);

						private char[] valc = Field.fillLowValue(30);

						private char[] retain = Field.fillLowValue(100);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setData0Len((short)48);
								setData0("Q1234567891234567890,Q8888888888888888889,123456                                                  ".toCharArray());
								setData("***THIS SHOULD GO TO FIELD 1%THIS GOES TO FIELD 2%THIS SHOULD GO TO FIELD 3$$$THIS GOES TO FIELD 4 %THIS GOES TO FIELD 5 AND THIS WILL BE THE END ALL ".toCharArray());
								setInputRec("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC|                                 ".toCharArray());
								setInputRecOverflw1("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC                               || ".toCharArray());
								setInputRecOverflw2("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC                               |  ".toCharArray());
								setInputRecOverflw3("0000000002|15|2|1||||          |029045003180|4321|2121- SPLAN DESC                                  ".toCharArray());
    }


 

	/**
	 *	Returns the value of data0Len
	 *	@return data0Len
	 */
	public short getData0Len() throws CFException {
   		return data0Len;
	}
	
	/**
	 * 	Update Data0Len with the passed value
	 *  Corresponding COBOL Variable is WS-DATA0-LEN
	 *	@param number
	 */
	public void setData0Len(short number) {
	     // Truncate if the number is beyond +/- Max range
	    data0Len = checkData0LenMaxLimit(number); 
	}

	public void setData0Len(int number) {
	    number = checkData0LenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setData0Len((short)number);
	}
	public void setData0Len(long number) {
	    number = checkData0LenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setData0Len((short)number);
	}
	

	/**
	 *	Returns the value of data0
	 *	@return data0
	 */
   public char[] getData0() throws CFException{
   		return data0;
   }

  
	/**
	*  set variable data0
	*  Corresponding COBOL Variable is WS-DATA0
	*  @param value
	**/
   public void setData0(char[] value) {
       value = checkData0Constraints(value);
       arraycopy(value,0,data0,0,value.length);
   } 
	public void setData0(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,data0,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of data
	 *	@return data
	 */
   public char[] getData() throws CFException{
   		return data;
   }

  
	/**
	*  set variable data
	*  Corresponding COBOL Variable is WS-DATA
	*  @param value
	**/
   public void setData(char[] value) {
       value = checkDataConstraints(value);
       arraycopy(value,0,data,0,value.length);
   } 
	public void setData(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,data,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of delim1
	 *	@return delim1
	 */
   public char[] getDelim1() throws CFException{
   		return delim1;
   }

  
	/**
	*  set variable delim1
	*  Corresponding COBOL Variable is WS-DELIM1
	*  @param value
	**/
   public void setDelim1(char[] value) {
       value = checkDelim1Constraints(value);
       arraycopy(value,0,delim1,0,value.length);
   } 
	public void setDelim1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delim1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of delim3
	 *	@return delim3
	 */
   public char[] getDelim3() throws CFException{
   		return delim3;
   }

  
	/**
	*  set variable delim3
	*  Corresponding COBOL Variable is WS-DELIM3
	*  @param value
	**/
   public void setDelim3(char[] value) {
       value = checkDelim3Constraints(value);
       arraycopy(value,0,delim3,0,value.length);
   } 
	public void setDelim3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delim3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of delim4
	 *	@return delim4
	 */
   public char[] getDelim4() throws CFException{
   		return delim4;
   }

  
	/**
	*  set variable delim4
	*  Corresponding COBOL Variable is WS-DELIM4
	*  @param value
	**/
   public void setDelim4(char[] value) {
       value = checkDelim4Constraints(value);
       arraycopy(value,0,delim4,0,value.length);
   } 
	public void setDelim4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,delim4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of count
	 *	@return count
	 */
	public int getCount() throws CFException {
   		return count;
	}
	
	/**
	 * 	Update Count with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT
	 *	@param number
	 */
	public void setCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    count = checkCountMaxLimit(number); 
	}


	public void setCount(long number) {
	    number = checkCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCount((int)number);
	}
	
	/**
	 *	Returns the value of count1
	 *	@return count1
	 */
	public int getCount1() throws CFException {
   		return count1;
	}
	
	/**
	 * 	Update Count1 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT1
	 *	@param number
	 */
	public void setCount1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    count1 = checkCount1MaxLimit(number); 
	}


	public void setCount1(long number) {
	    number = checkCount1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCount1((int)number);
	}
	
	/**
	 *	Returns the value of count2
	 *	@return count2
	 */
	public long getCount2() throws CFException {
       if (isCount2Modified()) { 
           count2 = refreshCount2();
        }
   		return count2;
	}
	

	
	   
	/**
	 * 	Update Count2 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT2
	 *	@param number
	 */
	public void setCount2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    count2 = checkCount2MaxLimit(number); 
		serializeCount2(count2);
	}
	

	/**
	 * 	Update Count2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCount2(char[] value) throws CFException {
		 count2 = serializeCount2(value);
	}
	/**
	 * 	Update Count2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCount2String(char[] value) throws CFException {
		 setCount2(value);
	}
	public int getCount3() throws CFException {
        if (isCount3Modified()) { 
           count3 = refreshCount3();
        }
   		return count3;
	}
	
	/**
	 * 	Update Count3 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT3
	 *	@param number
	 */
	public void setCount3(int number) {
			count3 = checkCount3MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCount3(count3);
	}


	public void setCount3(long number) {
	    number = checkCount3MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCount3((int)number);
	}
	
	/**
	 *	Returns the value of count4
	 *	@return count4
	 */
	public long getCount4() throws CFException {
       if (isCount4Modified()) { 
           count4 = refreshCount4();
        }
   		return count4;
	}
	

	
	   
	/**
	 * 	Update Count4 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT4
	 *	@param number
	 */
	public void setCount4(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    count4 = checkCount4MaxLimit(number); 
		serializeCount4(count4);
	}
	

	/**
	 * 	Update Count4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCount4(char[] value) throws CFException {
		 count4 = serializeCount4(value);
	}
	/**
	 * 	Update Count4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCount4String(char[] value) throws CFException {
		 setCount4(value);
	}
	public int getCount5() throws CFException {
        if (isCount5Modified()) { 
           count5 = refreshCount5();
        }
   		return count5;
	}
	
	/**
	 * 	Update Count5 with the passed value
	 *  Corresponding COBOL Variable is WS-COUNT5
	 *	@param number
	 */
	public void setCount5(int number) {
			count5 = checkCount5MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCount5(count5);
	}


	public void setCount5(long number) {
	    number = checkCount5MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCount5((int)number);
	}
	
	/**
	 *	Returns the value of tally
	 *	@return tally
	 */
	public long getTally() throws CFException {
       if (isTallyModified()) { 
           tally = refreshTally();
        }
   		return tally;
	}
	

	
	   
	/**
	 * 	Update Tally with the passed value
	 *  Corresponding COBOL Variable is WS-TALLY
	 *	@param number
	 */
	public void setTally(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tally = checkTallyMaxLimit(number); 
		serializeTally(tally);
	}
	

	/**
	 * 	Update Tally with the passed value
	 *	@param value (String or char[])
	 */
	public void setTally(char[] value) throws CFException {
		 tally = serializeTally(value);
	}
	/**
	 * 	Update Tally with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTallyString(char[] value) throws CFException {
		 setTally(value);
	}
	/**
	 *	Returns the value of pointer
	 *	@return pointer
	 */
	public long getPointer() throws CFException {
       if (isPointerModified()) { 
           pointer = refreshPointer();
        }
   		return pointer;
	}
	

	
	   
	/**
	 * 	Update Pointer with the passed value
	 *  Corresponding COBOL Variable is WS-POINTER
	 *	@param number
	 */
	public void setPointer(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    pointer = checkPointerMaxLimit(number); 
		serializePointer(pointer);
	}
	

	/**
	 * 	Update Pointer with the passed value
	 *	@param value (String or char[])
	 */
	public void setPointer(char[] value) throws CFException {
		 pointer = serializePointer(value);
	}
	/**
	 * 	Update Pointer with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPointerString(char[] value) throws CFException {
		 setPointer(value);
	}
	/**
	 *	Returns the value of field1
	 *	@return field1
	 */
   public char[] getField1() throws CFException{
   		return field1;
   }

  
	/**
	*  set variable field1
	*  Corresponding COBOL Variable is WS-FIELD1
	*  @param value
	**/
   public void setField1(char[] value) {
       value = checkField1Constraints(value);
       arraycopy(value,0,field1,0,value.length);
   } 
	public void setField1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,field1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of field2
	 *	@return field2
	 */
   public char[] getField2() throws CFException{
   		return field2;
   }

  
	/**
	*  set variable field2
	*  Corresponding COBOL Variable is WS-FIELD2
	*  @param value
	**/
   public void setField2(char[] value) {
       value = checkField2Constraints(value);
       arraycopy(value,0,field2,0,value.length);
   } 
	public void setField2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,field2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of field3
	 *	@return field3
	 */
   public char[] getField3() throws CFException{
   		return field3;
   }

  
	/**
	*  set variable field3
	*  Corresponding COBOL Variable is WS-FIELD3
	*  @param value
	**/
   public void setField3(char[] value) {
       value = checkField3Constraints(value);
       arraycopy(value,0,field3,0,value.length);
   } 
	public void setField3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,field3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of field4
	 *	@return field4
	 */
   public char[] getField4() throws CFException{
   		return field4;
   }

  
	/**
	*  set variable field4
	*  Corresponding COBOL Variable is WS-FIELD4
	*  @param value
	**/
   public void setField4(char[] value) {
       value = checkField4Constraints(value);
       arraycopy(value,0,field4,0,value.length);
   } 
	public void setField4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,field4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of field5
	 *	@return field5
	 */
   public char[] getField5() throws CFException{
   		return field5;
   }

  
	/**
	*  set variable field5
	*  Corresponding COBOL Variable is WS-FIELD5
	*  @param value
	**/
   public void setField5(char[] value) {
       value = checkField5Constraints(value);
       arraycopy(value,0,field5,0,value.length);
   } 
	public void setField5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,field5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of inputRec
	 *	@return inputRec
	 */
   public char[] getInputRec() throws CFException{
   		return inputRec;
   }

  
	/**
	*  set variable inputRec
	*  Corresponding COBOL Variable is INPUT-REC
	*  @param value
	**/
   public void setInputRec(char[] value) {
       value = checkInputRecConstraints(value);
       arraycopy(value,0,inputRec,0,value.length);
   } 
	public void setInputRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inputRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of inputRecOverflw1
	 *	@return inputRecOverflw1
	 */
   public char[] getInputRecOverflw1() throws CFException{
   		return inputRecOverflw1;
   }

  
	/**
	*  set variable inputRecOverflw1
	*  Corresponding COBOL Variable is INPUT-REC-OVERFLW1
	*  @param value
	**/
   public void setInputRecOverflw1(char[] value) {
       value = checkInputRecOverflw1Constraints(value);
       arraycopy(value,0,inputRecOverflw1,0,value.length);
   } 
	public void setInputRecOverflw1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inputRecOverflw1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of inputRecOverflw2
	 *	@return inputRecOverflw2
	 */
   public char[] getInputRecOverflw2() throws CFException{
   		return inputRecOverflw2;
   }

  
	/**
	*  set variable inputRecOverflw2
	*  Corresponding COBOL Variable is INPUT-REC-OVERFLW2
	*  @param value
	**/
   public void setInputRecOverflw2(char[] value) {
       value = checkInputRecOverflw2Constraints(value);
       arraycopy(value,0,inputRecOverflw2,0,value.length);
   } 
	public void setInputRecOverflw2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inputRecOverflw2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of inputRecOverflw3
	 *	@return inputRecOverflw3
	 */
   public char[] getInputRecOverflw3() throws CFException{
   		return inputRecOverflw3;
   }

  
	/**
	*  set variable inputRecOverflw3
	*  Corresponding COBOL Variable is INPUT-REC-OVERFLW3
	*  @param value
	**/
   public void setInputRecOverflw3(char[] value) {
       value = checkInputRecOverflw3Constraints(value);
       arraycopy(value,0,inputRecOverflw3,0,value.length);
   } 
	public void setInputRecOverflw3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inputRecOverflw3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val1
	 *	@return val1
	 */
   public char[] getVal1() throws CFException{
   		return val1;
   }

  
	/**
	*  set variable val1
	*  Corresponding COBOL Variable is WS-VAL1
	*  @param value
	**/
   public void setVal1(char[] value) {
       value = checkVal1Constraints(value);
       arraycopy(value,0,val1,0,value.length);
   } 
	public void setVal1(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val1,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val2
	 *	@return val2
	 */
   public char[] getVal2() throws CFException{
   		return val2;
   }

  
	/**
	*  set variable val2
	*  Corresponding COBOL Variable is WS-VAL2
	*  @param value
	**/
   public void setVal2(char[] value) {
       value = checkVal2Constraints(value);
       arraycopy(value,0,val2,0,value.length);
   } 
	public void setVal2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val3
	 *	@return val3
	 */
   public char[] getVal3() throws CFException{
   		return val3;
   }

  
	/**
	*  set variable val3
	*  Corresponding COBOL Variable is WS-VAL3
	*  @param value
	**/
   public void setVal3(char[] value) {
       value = checkVal3Constraints(value);
       arraycopy(value,0,val3,0,value.length);
   } 
	public void setVal3(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val3,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val4
	 *	@return val4
	 */
   public char[] getVal4() throws CFException{
   		return val4;
   }

  
	/**
	*  set variable val4
	*  Corresponding COBOL Variable is WS-VAL4
	*  @param value
	**/
   public void setVal4(char[] value) {
       value = checkVal4Constraints(value);
       arraycopy(value,0,val4,0,value.length);
   } 
	public void setVal4(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val4,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val5
	 *	@return val5
	 */
   public char[] getVal5() throws CFException{
   		return val5;
   }

  
	/**
	*  set variable val5
	*  Corresponding COBOL Variable is WS-VAL5
	*  @param value
	**/
   public void setVal5(char[] value) {
       value = checkVal5Constraints(value);
       arraycopy(value,0,val5,0,value.length);
   } 
	public void setVal5(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val5,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val6
	 *	@return val6
	 */
   public char[] getVal6() throws CFException{
   		return val6;
   }

  
	/**
	*  set variable val6
	*  Corresponding COBOL Variable is WS-VAL6
	*  @param value
	**/
   public void setVal6(char[] value) {
       value = checkVal6Constraints(value);
       arraycopy(value,0,val6,0,value.length);
   } 
	public void setVal6(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val6,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val7
	 *	@return val7
	 */
   public char[] getVal7() throws CFException{
   		return val7;
   }

  
	/**
	*  set variable val7
	*  Corresponding COBOL Variable is WS-VAL7
	*  @param value
	**/
   public void setVal7(char[] value) {
       value = checkVal7Constraints(value);
       arraycopy(value,0,val7,0,value.length);
   } 
	public void setVal7(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val7,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val8
	 *	@return val8
	 */
   public char[] getVal8() throws CFException{
   		return val8;
   }

  
	/**
	*  set variable val8
	*  Corresponding COBOL Variable is WS-VAL8
	*  @param value
	**/
   public void setVal8(char[] value) {
       value = checkVal8Constraints(value);
       arraycopy(value,0,val8,0,value.length);
   } 
	public void setVal8(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val8,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of val9
	 *	@return val9
	 */
   public char[] getVal9() throws CFException{
   		return val9;
   }

  
	/**
	*  set variable val9
	*  Corresponding COBOL Variable is WS-VAL9
	*  @param value
	**/
   public void setVal9(char[] value) {
       value = checkVal9Constraints(value);
       arraycopy(value,0,val9,0,value.length);
   } 
	public void setVal9(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,val9,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of vala
	 *	@return vala
	 */
   public char[] getVala() throws CFException{
   		return vala;
   }

  
	/**
	*  set variable vala
	*  Corresponding COBOL Variable is WS-VALA
	*  @param value
	**/
   public void setVala(char[] value) {
       value = checkValaConstraints(value);
       arraycopy(value,0,vala,0,value.length);
   } 
	public void setVala(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,vala,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valb
	 *	@return valb
	 */
   public char[] getValb() throws CFException{
   		return valb;
   }

  
	/**
	*  set variable valb
	*  Corresponding COBOL Variable is WS-VALB
	*  @param value
	**/
   public void setValb(char[] value) {
       value = checkValbConstraints(value);
       arraycopy(value,0,valb,0,value.length);
   } 
	public void setValb(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valb,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valc
	 *	@return valc
	 */
   public char[] getValc() throws CFException{
   		return valc;
   }

  
	/**
	*  set variable valc
	*  Corresponding COBOL Variable is WS-VALC
	*  @param value
	**/
   public void setValc(char[] value) {
       value = checkValcConstraints(value);
       arraycopy(value,0,valc,0,value.length);
   } 
	public void setValc(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valc,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of retain
	 *	@return retain
	 */
   public char[] getRetain() throws CFException{
   		return retain;
   }

  
	/**
	*  set variable retain
	*  Corresponding COBOL Variable is WS-RETAIN
	*  @param value
	**/
   public void setRetain(char[] value) {
       value = checkRetainConstraints(value);
       arraycopy(value,0,retain,0,value.length);
   } 
	public void setRetain(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,retain,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
