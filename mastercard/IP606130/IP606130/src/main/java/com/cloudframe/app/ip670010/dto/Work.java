package com.cloudframe.app.ip670010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip670010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isItFirstTime100 = new char[1];

						private char[] isItLeapYear100 = new char[1];

						private char[] ip670010300 = new char[8];

						private char[] pgmVersion300 = new char[7];

								private int value1300;

								private int value2300;

								private int value4300;

								private int value5300;

								private int value7300;

								private int value11300;

								private int value12300;

								private int value19300;

								private int value20300;

								private int value29300;

								private int value28300;

								private int value49300;

								private int value97300;

								private int value98300;

								private int value99300;

								private int value100300;

								private int value365300;

								private int value366300;

								private int value400300;

						private char[] invalidCallMessage600 = new char[50];

								private int validateMonth800;

								private long integerDate800;

								private long gregorianDateCal800;

								private long julianDateCal800;

								private int workYear801;

								private int workRemainder801;

								private int workYear2801;

								private int workRemainder2801;

								private int workYear3801;

								private int workHr800;

								private int workMin800;

								private int workOffsetHr800;

								private int workOffsetMin800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItFirstTime100(("Y").toCharArray());
								setIsItLeapYear100(fillSpace(1));
								setIp670010300(("IP670010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xB2,(byte)0x73,(byte)0x01,(byte)0x8E,(byte)0xF0,(byte)0x00}).toCharArray());
								setValue1300(1);
								setValue2300(2);
								setValue4300(4);
								setValue5300(5);
								setValue7300(7);
								setValue11300(11);
								setValue12300(12);
								setValue19300(19);
								setValue20300(20);
								setValue29300(29);
								setValue28300(28);
								setValue49300(49);
								setValue97300(97);
								setValue98300(98);
								setValue99300(99);
								setValue100300(100);
								setValue365300(365);
								setValue366300(366);
								setValue400300(400);
								setInvalidCallMessage600(("IP670010: INVALID CALL. NO FUNCTIONALITY REQUESTED").toCharArray());
								setIntegerDate800(0L);
								setGregorianDateCal800(0L);
								setJulianDateCal800(0L);
								setWorkOffsetMin800(0);
    }


 

	/**
	 *	Returns the value of isItFirstTime100
	 *	@return isItFirstTime100
	 */
   public char[] getIsItFirstTime100() throws CFException{
   		return isItFirstTime100;
   }

  
	/**
	*  set variable isItFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-FIRST-TIME
	*  @param value
	**/
   public void setIsItFirstTime100(char[] value) {
       value = checkIsItFirstTime100Constraints(value);
       arraycopy(value,0,isItFirstTime100,0,value.length);
   } 
	public void setIsItFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItFirstTime100( itIsFirstTime8810088Value);
   	}
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItFirstTime100( itIsNotFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of isItLeapYear100
	 *	@return isItLeapYear100
	 */
   public char[] getIsItLeapYear100() throws CFException{
   		return isItLeapYear100;
   }

  
	/**
	*  set variable isItLeapYear100
	*  Corresponding COBOL Variable is 100-IS-IT-LEAP-YEAR
	*  @param value
	**/
   public void setIsItLeapYear100(char[] value) {
       value = checkIsItLeapYear100Constraints(value);
       arraycopy(value,0,isItLeapYear100,0,value.length);
   } 
	public void setIsItLeapYear100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItLeapYear100,0,beginIndex + endIndex);
   }
	char[] leapYearIsUnknown8810088Value = " ".toCharArray();
	/**
	 *	Test condition " " for isLeapYearIsUnknown88100()
	 *	@return  Returns true if isLeapYearIsUnknown88100() is " "
	 */
   public boolean isLeapYearIsUnknown88100() throws CFException {
      return (  compareChars( getIsItLeapYear100() , leapYearIsUnknown8810088Value)  == 0  );
   }


	/**
	*  set values " "
	*/
   	public void setLeapYearIsUnknown88100True() {  			
    	setIsItLeapYear100( leapYearIsUnknown8810088Value);
   	}
	char[] itIsLeapYear8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsLeapYear88100()
	 *	@return  Returns true if isItIsLeapYear88100() is "Y"
	 */
   public boolean isItIsLeapYear88100() throws CFException {
      return (  compareChars( getIsItLeapYear100() , itIsLeapYear8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsLeapYear88100True() {  			
    	setIsItLeapYear100( itIsLeapYear8810088Value);
   	}
	char[] itIsNotLeapYear8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotLeapYear88100()
	 *	@return  Returns true if isItIsNotLeapYear88100() is "N"
	 */
   public boolean isItIsNotLeapYear88100() throws CFException {
      return (  compareChars( getIsItLeapYear100() , itIsNotLeapYear8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotLeapYear88100True() {  			
    	setIsItLeapYear100( itIsNotLeapYear8810088Value);
   	}
	/**
	 *	Returns the value of ip670010300
	 *	@return ip670010300
	 */
   public char[] getIp670010300() throws CFException{
   		return ip670010300;
   }

  
	/**
	*  set variable ip670010300
	*  Corresponding COBOL Variable is 300-IP670010
	*  @param value
	**/
   public void setIp670010300(char[] value) {
       value = checkIp670010300Constraints(value);
       arraycopy(value,0,ip670010300,0,value.length);
   } 
	public void setIp670010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip670010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException{
   		return pgmVersion300;
   }

  
	/**
	*  set variable pgmVersion300
	*  Corresponding COBOL Variable is 300-PGM-VERSION
	*  @param value
	**/
   public void setPgmVersion300(char[] value) {
       value = checkPgmVersion300Constraints(value);
       arraycopy(value,0,pgmVersion300,0,value.length);
   } 
	public void setPgmVersion300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmVersion300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
       if (isValue1300Modified()) { 
           value1300 = refreshValue1300();
        }
   		return value1300;
	}
	

	
	   
	/**
	 * 	Update Value1300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1
	 *	@param number
	 */
	public void setValue1300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1300 = checkValue1300MaxLimit(number); 
		serializeValue1300(value1300);
	}
	

	public void setValue1300(long number) {
	    number = checkValue1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue1300((int)number);
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value) throws CFException {
		 value1300 = serializeValue1300(value);
	}
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value) throws CFException {
		 setValue1300(value);
	}
	/**
	 *	Returns the value of value2300
	 *	@return value2300
	 */
	public int getValue2300() throws CFException {
       if (isValue2300Modified()) { 
           value2300 = refreshValue2300();
        }
   		return value2300;
	}
	

	
	   
	/**
	 * 	Update Value2300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-2
	 *	@param number
	 */
	public void setValue2300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value2300 = checkValue2300MaxLimit(number); 
		serializeValue2300(value2300);
	}
	

	public void setValue2300(long number) {
	    number = checkValue2300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue2300((int)number);
	}
	
	/**
	 * 	Update Value2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue2300(char[] value) throws CFException {
		 value2300 = serializeValue2300(value);
	}
	/**
	 * 	Update Value2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue2300String(char[] value) throws CFException {
		 setValue2300(value);
	}
	/**
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
       if (isValue4300Modified()) { 
           value4300 = refreshValue4300();
        }
   		return value4300;
	}
	

	
	   
	/**
	 * 	Update Value4300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-4
	 *	@param number
	 */
	public void setValue4300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value4300 = checkValue4300MaxLimit(number); 
		serializeValue4300(value4300);
	}
	

	public void setValue4300(long number) {
	    number = checkValue4300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue4300((int)number);
	}
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value) throws CFException {
		 value4300 = serializeValue4300(value);
	}
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value) throws CFException {
		 setValue4300(value);
	}
	/**
	 *	Returns the value of value5300
	 *	@return value5300
	 */
	public int getValue5300() throws CFException {
       if (isValue5300Modified()) { 
           value5300 = refreshValue5300();
        }
   		return value5300;
	}
	

	
	   
	/**
	 * 	Update Value5300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-5
	 *	@param number
	 */
	public void setValue5300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value5300 = checkValue5300MaxLimit(number); 
		serializeValue5300(value5300);
	}
	

	public void setValue5300(long number) {
	    number = checkValue5300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue5300((int)number);
	}
	
	/**
	 * 	Update Value5300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue5300(char[] value) throws CFException {
		 value5300 = serializeValue5300(value);
	}
	/**
	 * 	Update Value5300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue5300String(char[] value) throws CFException {
		 setValue5300(value);
	}
	/**
	 *	Returns the value of value7300
	 *	@return value7300
	 */
	public int getValue7300() throws CFException {
       if (isValue7300Modified()) { 
           value7300 = refreshValue7300();
        }
   		return value7300;
	}
	

	
	   
	/**
	 * 	Update Value7300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-7
	 *	@param number
	 */
	public void setValue7300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value7300 = checkValue7300MaxLimit(number); 
		serializeValue7300(value7300);
	}
	

	public void setValue7300(long number) {
	    number = checkValue7300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue7300((int)number);
	}
	
	/**
	 * 	Update Value7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue7300(char[] value) throws CFException {
		 value7300 = serializeValue7300(value);
	}
	/**
	 * 	Update Value7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue7300String(char[] value) throws CFException {
		 setValue7300(value);
	}
	/**
	 *	Returns the value of value11300
	 *	@return value11300
	 */
	public int getValue11300() throws CFException {
       if (isValue11300Modified()) { 
           value11300 = refreshValue11300();
        }
   		return value11300;
	}
	

	
	   
	/**
	 * 	Update Value11300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-11
	 *	@param number
	 */
	public void setValue11300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value11300 = checkValue11300MaxLimit(number); 
		serializeValue11300(value11300);
	}
	

	public void setValue11300(long number) {
	    number = checkValue11300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue11300((int)number);
	}
	
	/**
	 * 	Update Value11300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue11300(char[] value) throws CFException {
		 value11300 = serializeValue11300(value);
	}
	/**
	 * 	Update Value11300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue11300String(char[] value) throws CFException {
		 setValue11300(value);
	}
	/**
	 *	Returns the value of value12300
	 *	@return value12300
	 */
	public int getValue12300() throws CFException {
       if (isValue12300Modified()) { 
           value12300 = refreshValue12300();
        }
   		return value12300;
	}
	

	
	   
	/**
	 * 	Update Value12300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-12
	 *	@param number
	 */
	public void setValue12300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value12300 = checkValue12300MaxLimit(number); 
		serializeValue12300(value12300);
	}
	

	public void setValue12300(long number) {
	    number = checkValue12300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue12300((int)number);
	}
	
	/**
	 * 	Update Value12300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue12300(char[] value) throws CFException {
		 value12300 = serializeValue12300(value);
	}
	/**
	 * 	Update Value12300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue12300String(char[] value) throws CFException {
		 setValue12300(value);
	}
	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
       if (isValue19300Modified()) { 
           value19300 = refreshValue19300();
        }
   		return value19300;
	}
	

	
	   
	/**
	 * 	Update Value19300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-19
	 *	@param number
	 */
	public void setValue19300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value19300 = checkValue19300MaxLimit(number); 
		serializeValue19300(value19300);
	}
	

	public void setValue19300(long number) {
	    number = checkValue19300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue19300((int)number);
	}
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value) throws CFException {
		 value19300 = serializeValue19300(value);
	}
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value) throws CFException {
		 setValue19300(value);
	}
	/**
	 *	Returns the value of value20300
	 *	@return value20300
	 */
	public int getValue20300() throws CFException {
       if (isValue20300Modified()) { 
           value20300 = refreshValue20300();
        }
   		return value20300;
	}
	

	
	   
	/**
	 * 	Update Value20300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-20
	 *	@param number
	 */
	public void setValue20300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value20300 = checkValue20300MaxLimit(number); 
		serializeValue20300(value20300);
	}
	

	public void setValue20300(long number) {
	    number = checkValue20300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue20300((int)number);
	}
	
	/**
	 * 	Update Value20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue20300(char[] value) throws CFException {
		 value20300 = serializeValue20300(value);
	}
	/**
	 * 	Update Value20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue20300String(char[] value) throws CFException {
		 setValue20300(value);
	}
	/**
	 *	Returns the value of value29300
	 *	@return value29300
	 */
	public int getValue29300() throws CFException {
       if (isValue29300Modified()) { 
           value29300 = refreshValue29300();
        }
   		return value29300;
	}
	

	
	   
	/**
	 * 	Update Value29300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-29
	 *	@param number
	 */
	public void setValue29300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value29300 = checkValue29300MaxLimit(number); 
		serializeValue29300(value29300);
	}
	

	public void setValue29300(long number) {
	    number = checkValue29300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue29300((int)number);
	}
	
	/**
	 * 	Update Value29300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue29300(char[] value) throws CFException {
		 value29300 = serializeValue29300(value);
	}
	/**
	 * 	Update Value29300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue29300String(char[] value) throws CFException {
		 setValue29300(value);
	}
	/**
	 *	Returns the value of value28300
	 *	@return value28300
	 */
	public int getValue28300() throws CFException {
       if (isValue28300Modified()) { 
           value28300 = refreshValue28300();
        }
   		return value28300;
	}
	

	
	   
	/**
	 * 	Update Value28300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-28
	 *	@param number
	 */
	public void setValue28300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value28300 = checkValue28300MaxLimit(number); 
		serializeValue28300(value28300);
	}
	

	public void setValue28300(long number) {
	    number = checkValue28300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue28300((int)number);
	}
	
	/**
	 * 	Update Value28300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue28300(char[] value) throws CFException {
		 value28300 = serializeValue28300(value);
	}
	/**
	 * 	Update Value28300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue28300String(char[] value) throws CFException {
		 setValue28300(value);
	}
	/**
	 *	Returns the value of value49300
	 *	@return value49300
	 */
	public int getValue49300() throws CFException {
       if (isValue49300Modified()) { 
           value49300 = refreshValue49300();
        }
   		return value49300;
	}
	

	
	   
	/**
	 * 	Update Value49300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-49
	 *	@param number
	 */
	public void setValue49300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value49300 = checkValue49300MaxLimit(number); 
		serializeValue49300(value49300);
	}
	

	public void setValue49300(long number) {
	    number = checkValue49300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue49300((int)number);
	}
	
	/**
	 * 	Update Value49300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue49300(char[] value) throws CFException {
		 value49300 = serializeValue49300(value);
	}
	/**
	 * 	Update Value49300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue49300String(char[] value) throws CFException {
		 setValue49300(value);
	}
	/**
	 *	Returns the value of value97300
	 *	@return value97300
	 */
	public int getValue97300() throws CFException {
       if (isValue97300Modified()) { 
           value97300 = refreshValue97300();
        }
   		return value97300;
	}
	

	
	   
	/**
	 * 	Update Value97300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-97
	 *	@param number
	 */
	public void setValue97300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value97300 = checkValue97300MaxLimit(number); 
		serializeValue97300(value97300);
	}
	

	public void setValue97300(long number) {
	    number = checkValue97300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue97300((int)number);
	}
	
	/**
	 * 	Update Value97300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue97300(char[] value) throws CFException {
		 value97300 = serializeValue97300(value);
	}
	/**
	 * 	Update Value97300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue97300String(char[] value) throws CFException {
		 setValue97300(value);
	}
	/**
	 *	Returns the value of value98300
	 *	@return value98300
	 */
	public int getValue98300() throws CFException {
       if (isValue98300Modified()) { 
           value98300 = refreshValue98300();
        }
   		return value98300;
	}
	

	
	   
	/**
	 * 	Update Value98300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-98
	 *	@param number
	 */
	public void setValue98300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value98300 = checkValue98300MaxLimit(number); 
		serializeValue98300(value98300);
	}
	

	public void setValue98300(long number) {
	    number = checkValue98300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue98300((int)number);
	}
	
	/**
	 * 	Update Value98300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue98300(char[] value) throws CFException {
		 value98300 = serializeValue98300(value);
	}
	/**
	 * 	Update Value98300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue98300String(char[] value) throws CFException {
		 setValue98300(value);
	}
	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
       if (isValue99300Modified()) { 
           value99300 = refreshValue99300();
        }
   		return value99300;
	}
	

	
	   
	/**
	 * 	Update Value99300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-99
	 *	@param number
	 */
	public void setValue99300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value99300 = checkValue99300MaxLimit(number); 
		serializeValue99300(value99300);
	}
	

	public void setValue99300(long number) {
	    number = checkValue99300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue99300((int)number);
	}
	
	/**
	 * 	Update Value99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue99300(char[] value) throws CFException {
		 value99300 = serializeValue99300(value);
	}
	/**
	 * 	Update Value99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue99300String(char[] value) throws CFException {
		 setValue99300(value);
	}
	/**
	 *	Returns the value of value100300
	 *	@return value100300
	 */
	public int getValue100300() throws CFException {
       if (isValue100300Modified()) { 
           value100300 = refreshValue100300();
        }
   		return value100300;
	}
	

	
	   
	/**
	 * 	Update Value100300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-100
	 *	@param number
	 */
	public void setValue100300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value100300 = checkValue100300MaxLimit(number); 
		serializeValue100300(value100300);
	}
	

	public void setValue100300(long number) {
	    number = checkValue100300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue100300((int)number);
	}
	
	/**
	 * 	Update Value100300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue100300(char[] value) throws CFException {
		 value100300 = serializeValue100300(value);
	}
	/**
	 * 	Update Value100300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue100300String(char[] value) throws CFException {
		 setValue100300(value);
	}
	/**
	 *	Returns the value of value365300
	 *	@return value365300
	 */
	public int getValue365300() throws CFException {
       if (isValue365300Modified()) { 
           value365300 = refreshValue365300();
        }
   		return value365300;
	}
	

	
	   
	/**
	 * 	Update Value365300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-365
	 *	@param number
	 */
	public void setValue365300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value365300 = checkValue365300MaxLimit(number); 
		serializeValue365300(value365300);
	}
	

	public void setValue365300(long number) {
	    number = checkValue365300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue365300((int)number);
	}
	
	/**
	 * 	Update Value365300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue365300(char[] value) throws CFException {
		 value365300 = serializeValue365300(value);
	}
	/**
	 * 	Update Value365300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue365300String(char[] value) throws CFException {
		 setValue365300(value);
	}
	/**
	 *	Returns the value of value366300
	 *	@return value366300
	 */
	public int getValue366300() throws CFException {
       if (isValue366300Modified()) { 
           value366300 = refreshValue366300();
        }
   		return value366300;
	}
	

	
	   
	/**
	 * 	Update Value366300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-366
	 *	@param number
	 */
	public void setValue366300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value366300 = checkValue366300MaxLimit(number); 
		serializeValue366300(value366300);
	}
	

	public void setValue366300(long number) {
	    number = checkValue366300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue366300((int)number);
	}
	
	/**
	 * 	Update Value366300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue366300(char[] value) throws CFException {
		 value366300 = serializeValue366300(value);
	}
	/**
	 * 	Update Value366300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue366300String(char[] value) throws CFException {
		 setValue366300(value);
	}
	/**
	 *	Returns the value of value400300
	 *	@return value400300
	 */
	public int getValue400300() throws CFException {
       if (isValue400300Modified()) { 
           value400300 = refreshValue400300();
        }
   		return value400300;
	}
	

	
	   
	/**
	 * 	Update Value400300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-400
	 *	@param number
	 */
	public void setValue400300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value400300 = checkValue400300MaxLimit(number); 
		serializeValue400300(value400300);
	}
	

	public void setValue400300(long number) {
	    number = checkValue400300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue400300((int)number);
	}
	
	/**
	 * 	Update Value400300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue400300(char[] value) throws CFException {
		 value400300 = serializeValue400300(value);
	}
	/**
	 * 	Update Value400300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue400300String(char[] value) throws CFException {
		 setValue400300(value);
	}
	/**
	 *	Returns the value of invalidCallMessage600
	 *	@return invalidCallMessage600
	 */
   public char[] getInvalidCallMessage600() throws CFException{
   		return invalidCallMessage600;
   }

  
	/**
	*  set variable invalidCallMessage600
	*  Corresponding COBOL Variable is 600-INVALID-CALL-MESSAGE
	*  @param value
	**/
   public void setInvalidCallMessage600(char[] value) {
       value = checkInvalidCallMessage600Constraints(value);
       arraycopy(value,0,invalidCallMessage600,0,value.length);
   } 
	public void setInvalidCallMessage600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,invalidCallMessage600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of validateMonth800
	 *	@return validateMonth800
	 */
	public int getValidateMonth800() throws CFException {
       if (isValidateMonth800Modified()) { 
           validateMonth800 = refreshValidateMonth800();
        }
   		return validateMonth800;
	}
	

	
	   
	/**
	 * 	Update ValidateMonth800 with the passed value
	 *  Corresponding COBOL Variable is 800-VALIDATE-MONTH
	 *	@param number
	 */
	public void setValidateMonth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    validateMonth800 = checkValidateMonth800MaxLimit(number); 
		serializeValidateMonth800(validateMonth800);
	}
	

	public void setValidateMonth800(long number) {
	    number = checkValidateMonth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValidateMonth800((int)number);
	}
	
	/**
	 * 	Update ValidateMonth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValidateMonth800(char[] value) throws CFException {
		 validateMonth800 = serializeValidateMonth800(value);
	}
	/**
	 * 	Update ValidateMonth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValidateMonth800String(char[] value) throws CFException {
		 setValidateMonth800(value);
	}
	
	/**
	 *	Test condition 1 THRU 12 for isValidMonth88800()
	 *	@return  Returns true if isValidMonth88800() is 1 THRU 12
	 */
   public boolean isValidMonth88800() throws CFException {
      return (   (getValidateMonth800()  >=  1 ) &&   (getValidateMonth800()  <=  12 )   );
   }


	/**
	*  set values 1 THRU 12
	*/
   	public void setValidMonth88800True() {  			
    	setValidateMonth800( 1);
   	}
	/**
	 *	Returns the value of integerDate800
	 *	@return integerDate800
	 */
	public long getIntegerDate800() throws CFException {
       if (isIntegerDate800Modified()) { 
           integerDate800 = refreshIntegerDate800();
        }
   		return integerDate800;
	}
	

	
	   
	/**
	 * 	Update IntegerDate800 with the passed value
	 *  Corresponding COBOL Variable is 800-INTEGER-DATE
	 *	@param number
	 */
	public void setIntegerDate800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    integerDate800 = checkIntegerDate800MaxLimit(number); 
		serializeIntegerDate800(integerDate800);
	}
	

	/**
	 * 	Update IntegerDate800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800(char[] value) throws CFException {
		 integerDate800 = serializeIntegerDate800(value);
	}
	/**
	 * 	Update IntegerDate800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIntegerDate800String(char[] value) throws CFException {
		 setIntegerDate800(value);
	}
	/**
	 *	Returns the value of gregorianDateCal800
	 *	@return gregorianDateCal800
	 */
	public long getGregorianDateCal800() throws CFException {
       if (isGregorianDateCal800Modified()) { 
           gregorianDateCal800 = refreshGregorianDateCal800();
        }
   		return gregorianDateCal800;
	}
	

	
	   
	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *  Corresponding COBOL Variable is 800-GREGORIAN-DATE-CAL
	 *	@param number
	 */
	public void setGregorianDateCal800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    gregorianDateCal800 = checkGregorianDateCal800MaxLimit(number); 
		serializeGregorianDateCal800(gregorianDateCal800);
	}
	

	/**
	 * 	Update GregorianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800(char[] value) throws CFException {
		 gregorianDateCal800 = serializeGregorianDateCal800(value);
	}
	/**
	 * 	Update GregorianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setGregorianDateCal800String(char[] value) throws CFException {
		 setGregorianDateCal800(value);
	}
	/**
	 *	Returns the value of julianDateCal800
	 *	@return julianDateCal800
	 */
	public long getJulianDateCal800() throws CFException {
       if (isJulianDateCal800Modified()) { 
           julianDateCal800 = refreshJulianDateCal800();
        }
   		return julianDateCal800;
	}
	

	
	   
	/**
	 * 	Update JulianDateCal800 with the passed value
	 *  Corresponding COBOL Variable is 800-JULIAN-DATE-CAL
	 *	@param number
	 */
	public void setJulianDateCal800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    julianDateCal800 = checkJulianDateCal800MaxLimit(number); 
		serializeJulianDateCal800(julianDateCal800);
	}
	

	/**
	 * 	Update JulianDateCal800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setJulianDateCal800(char[] value) throws CFException {
		 julianDateCal800 = serializeJulianDateCal800(value);
	}
	/**
	 * 	Update JulianDateCal800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setJulianDateCal800String(char[] value) throws CFException {
		 setJulianDateCal800(value);
	}
	/**
	 *	Returns the value of workYear801
	 *	@return workYear801
	 */
	public int getWorkYear801() throws CFException {
       if (isWorkYear801Modified()) { 
           workYear801 = refreshWorkYear801();
        }
   		return workYear801;
	}
	

	
	   
	/**
	 * 	Update WorkYear801 with the passed value
	 *  Corresponding COBOL Variable is 801-WORK-YEAR
	 *	@param number
	 */
	public void setWorkYear801(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    workYear801 = checkWorkYear801MaxLimit(number); 
		serializeWorkYear801(workYear801);
	}
	

	public void setWorkYear801(long number) {
	    number = checkWorkYear801MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkYear801((int)number);
	}
	
	/**
	 * 	Update WorkYear801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear801(char[] value) throws CFException {
		 workYear801 = serializeWorkYear801(value);
	}
	/**
	 * 	Update WorkYear801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear801String(char[] value) throws CFException {
		 setWorkYear801(value);
	}
	/**
	 *	Returns the value of workRemainder801
	 *	@return workRemainder801
	 */
	public int getWorkRemainder801() throws CFException {
       if (isWorkRemainder801Modified()) { 
           workRemainder801 = refreshWorkRemainder801();
        }
   		return workRemainder801;
	}
	

	
	   
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *  Corresponding COBOL Variable is 801-WORK-REMAINDER
	 *	@param number
	 */
	public void setWorkRemainder801(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    workRemainder801 = checkWorkRemainder801MaxLimit(number); 
		serializeWorkRemainder801(workRemainder801);
	}
	

	public void setWorkRemainder801(long number) {
	    number = checkWorkRemainder801MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkRemainder801((int)number);
	}
	
	/**
	 * 	Update WorkRemainder801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801(char[] value) throws CFException {
		 workRemainder801 = serializeWorkRemainder801(value);
	}
	/**
	 * 	Update WorkRemainder801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder801String(char[] value) throws CFException {
		 setWorkRemainder801(value);
	}
	/**
	 *	Returns the value of workYear2801
	 *	@return workYear2801
	 */
	public int getWorkYear2801() throws CFException {
       if (isWorkYear2801Modified()) { 
           workYear2801 = refreshWorkYear2801();
        }
   		return workYear2801;
	}
	

	
	   
	/**
	 * 	Update WorkYear2801 with the passed value
	 *  Corresponding COBOL Variable is 801-WORK-YEAR-2
	 *	@param number
	 */
	public void setWorkYear2801(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    workYear2801 = checkWorkYear2801MaxLimit(number); 
		serializeWorkYear2801(workYear2801);
	}
	

	public void setWorkYear2801(long number) {
	    number = checkWorkYear2801MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkYear2801((int)number);
	}
	
	/**
	 * 	Update WorkYear2801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear2801(char[] value) throws CFException {
		 workYear2801 = serializeWorkYear2801(value);
	}
	/**
	 * 	Update WorkYear2801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear2801String(char[] value) throws CFException {
		 setWorkYear2801(value);
	}
	/**
	 *	Returns the value of workRemainder2801
	 *	@return workRemainder2801
	 */
	public int getWorkRemainder2801() throws CFException {
       if (isWorkRemainder2801Modified()) { 
           workRemainder2801 = refreshWorkRemainder2801();
        }
   		return workRemainder2801;
	}
	

	
	   
	/**
	 * 	Update WorkRemainder2801 with the passed value
	 *  Corresponding COBOL Variable is 801-WORK-REMAINDER-2
	 *	@param number
	 */
	public void setWorkRemainder2801(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    workRemainder2801 = checkWorkRemainder2801MaxLimit(number); 
		serializeWorkRemainder2801(workRemainder2801);
	}
	

	public void setWorkRemainder2801(long number) {
	    number = checkWorkRemainder2801MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkRemainder2801((int)number);
	}
	
	/**
	 * 	Update WorkRemainder2801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder2801(char[] value) throws CFException {
		 workRemainder2801 = serializeWorkRemainder2801(value);
	}
	/**
	 * 	Update WorkRemainder2801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkRemainder2801String(char[] value) throws CFException {
		 setWorkRemainder2801(value);
	}
	/**
	 *	Returns the value of workYear3801
	 *	@return workYear3801
	 */
	public int getWorkYear3801() throws CFException {
       if (isWorkYear3801Modified()) { 
           workYear3801 = refreshWorkYear3801();
        }
   		return workYear3801;
	}
	

	
	   
	/**
	 * 	Update WorkYear3801 with the passed value
	 *  Corresponding COBOL Variable is 801-WORK-YEAR-3
	 *	@param number
	 */
	public void setWorkYear3801(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    workYear3801 = checkWorkYear3801MaxLimit(number); 
		serializeWorkYear3801(workYear3801);
	}
	

	public void setWorkYear3801(long number) {
	    number = checkWorkYear3801MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkYear3801((int)number);
	}
	
	/**
	 * 	Update WorkYear3801 with the passed value
	 *	@param value (String or char[])
	 */
	public void setWorkYear3801(char[] value) throws CFException {
		 workYear3801 = serializeWorkYear3801(value);
	}
	/**
	 * 	Update WorkYear3801 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWorkYear3801String(char[] value) throws CFException {
		 setWorkYear3801(value);
	}
	/**
	 *	Returns the value of workHr800
	 *	@return workHr800
	 */
	public int getWorkHr800() throws CFException {
   		return workHr800;
	}
	
	/**
	 * 	Update WorkHr800 with the passed value
	 *  Corresponding COBOL Variable is 800-WORK-HR
	 *	@param number
	 */
	public void setWorkHr800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    workHr800 = checkWorkHr800MaxLimit(number); 
	}


	public void setWorkHr800(long number) {
	    number = checkWorkHr800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkHr800((int)number);
	}
	
	/**
	 *	Returns the value of workMin800
	 *	@return workMin800
	 */
	public int getWorkMin800() throws CFException {
   		return workMin800;
	}
	
	/**
	 * 	Update WorkMin800 with the passed value
	 *  Corresponding COBOL Variable is 800-WORK-MIN
	 *	@param number
	 */
	public void setWorkMin800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    workMin800 = checkWorkMin800MaxLimit(number); 
	}


	public void setWorkMin800(long number) {
	    number = checkWorkMin800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkMin800((int)number);
	}
	
	/**
	 *	Returns the value of workOffsetHr800
	 *	@return workOffsetHr800
	 */
	public int getWorkOffsetHr800() throws CFException {
   		return workOffsetHr800;
	}
	
	/**
	 * 	Update WorkOffsetHr800 with the passed value
	 *  Corresponding COBOL Variable is 800-WORK-OFFSET-HR
	 *	@param number
	 */
	public void setWorkOffsetHr800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    workOffsetHr800 = checkWorkOffsetHr800MaxLimit(number); 
	}


	public void setWorkOffsetHr800(long number) {
	    number = checkWorkOffsetHr800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkOffsetHr800((int)number);
	}
	
	/**
	 *	Returns the value of workOffsetMin800
	 *	@return workOffsetMin800
	 */
	public int getWorkOffsetMin800() throws CFException {
   		return workOffsetMin800;
	}
	
	/**
	 * 	Update WorkOffsetMin800 with the passed value
	 *  Corresponding COBOL Variable is 800-WORK-OFFSET-MIN
	 *	@param number
	 */
	public void setWorkOffsetMin800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    workOffsetMin800 = checkWorkOffsetMin800MaxLimit(number); 
	}


	public void setWorkOffsetMin800(long number) {
	    number = checkWorkOffsetMin800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setWorkOffsetMin800((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
