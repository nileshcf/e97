package com.cloudframe.app.si994010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.si994010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short binaryZeros300;

								private short binary1300;

								private short binary2300;

								private short binary4300;

								private short binary8300;

								private short binary13300;

								private short binary64300;

								private short binary128300;

								private short deMax300;

								private int maxMessage300;

						private char[] charX300 = new char[1];

						private char[] asterisks300 = new char[4];

						private char[] errMsg1600 = new char[80];

						private char[] errMsg2600 = new char[80];

						private char[] errMsg3600 = new char[80];

						private char[] errMsg4600 = new char[80];

						private char[] errMsg5600 = new char[80];

						private char[] errMsg6600 = new char[80];

						private char[] errMsg7600 = new char[80];

						private char[] errMsg8600 = new char[80];

								private short sub800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBinaryZeros300((short)0);
								setBinary1300((short)1);
								setBinary2300((short)2);
								setBinary4300((short)4);
								setBinary8300((short)8);
								setBinary13300((short)13);
								setBinary64300((short)64);
								setBinary128300((short)128);
								setDeMax300((short)128);
								setMaxMessage300(32768);
								setCharX300(("X").toCharArray());
								setAsterisks300(("****").toCharArray());
								setErrMsg1600(pad(80,"DATA ELEMENT FROM FIRST MESSAGE IS NOT DEFINED       ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg2600(pad(80,"DATA ELEMENT FROM SECOND MESSAGE IS NOT DEFINED      ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg3600(pad(80,"INVALID MTI IN FIRST MESSAGE                         ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg4600(pad(80,"INVALID MTI IN SECOND MESSAGE                        ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg5600(pad(80,"VARIABLE LENGTH VALUE IS NOT NUMERIC IN FIRST MESSAGE".toCharArray(),' ',RIGHT_PAD));
								setErrMsg6600(pad(80,"VARIABLE LENGTH VALUE IS NOT NUMERIC IN SECND MESSAGE".toCharArray(),' ',RIGHT_PAD));
								setErrMsg7600(pad(80,"CALCULATED MESSAGE LENGTH EXCEEDS DATA LENGTH        ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg8600(pad(80,"DATA POINTER IS NULL                                 ".toCharArray(),' ',RIGHT_PAD));
								setSub800((short)0);
    }


 

	/**
	 *	Returns the value of binaryZeros300
	 *	@return binaryZeros300
	 */
	public short getBinaryZeros300() throws CFException {
   		return binaryZeros300;
	}
	
	/**
	 * 	Update BinaryZeros300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-ZEROS
	 *	@param number
	 */
	public void setBinaryZeros300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binaryZeros300 = checkBinaryZeros300MaxLimit(number); 
	}

	public void setBinaryZeros300(int number) {
	    number = checkBinaryZeros300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryZeros300((short)number);
	}
	public void setBinaryZeros300(long number) {
	    number = checkBinaryZeros300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinaryZeros300((short)number);
	}
	

	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {
   		return binary1300;
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-1
	 *	@param number
	 */
	public void setBinary1300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary1300 = checkBinary1300MaxLimit(number); 
	}

	public void setBinary1300(int number) {
	    number = checkBinary1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary1300((short)number);
	}
	public void setBinary1300(long number) {
	    number = checkBinary1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary1300((short)number);
	}
	

	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {
   		return binary2300;
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-2
	 *	@param number
	 */
	public void setBinary2300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary2300 = checkBinary2300MaxLimit(number); 
	}

	public void setBinary2300(int number) {
	    number = checkBinary2300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary2300((short)number);
	}
	public void setBinary2300(long number) {
	    number = checkBinary2300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary2300((short)number);
	}
	

	/**
	 *	Returns the value of binary4300
	 *	@return binary4300
	 */
	public short getBinary4300() throws CFException {
   		return binary4300;
	}
	
	/**
	 * 	Update Binary4300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-4
	 *	@param number
	 */
	public void setBinary4300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary4300 = checkBinary4300MaxLimit(number); 
	}

	public void setBinary4300(int number) {
	    number = checkBinary4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary4300((short)number);
	}
	public void setBinary4300(long number) {
	    number = checkBinary4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary4300((short)number);
	}
	

	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {
   		return binary8300;
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-8
	 *	@param number
	 */
	public void setBinary8300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary8300 = checkBinary8300MaxLimit(number); 
	}

	public void setBinary8300(int number) {
	    number = checkBinary8300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary8300((short)number);
	}
	public void setBinary8300(long number) {
	    number = checkBinary8300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary8300((short)number);
	}
	

	/**
	 *	Returns the value of binary13300
	 *	@return binary13300
	 */
	public short getBinary13300() throws CFException {
   		return binary13300;
	}
	
	/**
	 * 	Update Binary13300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-13
	 *	@param number
	 */
	public void setBinary13300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary13300 = checkBinary13300MaxLimit(number); 
	}

	public void setBinary13300(int number) {
	    number = checkBinary13300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary13300((short)number);
	}
	public void setBinary13300(long number) {
	    number = checkBinary13300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary13300((short)number);
	}
	

	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {
   		return binary64300;
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-64
	 *	@param number
	 */
	public void setBinary64300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary64300 = checkBinary64300MaxLimit(number); 
	}

	public void setBinary64300(int number) {
	    number = checkBinary64300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary64300((short)number);
	}
	public void setBinary64300(long number) {
	    number = checkBinary64300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary64300((short)number);
	}
	

	/**
	 *	Returns the value of binary128300
	 *	@return binary128300
	 */
	public short getBinary128300() throws CFException {
   		return binary128300;
	}
	
	/**
	 * 	Update Binary128300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-128
	 *	@param number
	 */
	public void setBinary128300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary128300 = checkBinary128300MaxLimit(number); 
	}

	public void setBinary128300(int number) {
	    number = checkBinary128300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary128300((short)number);
	}
	public void setBinary128300(long number) {
	    number = checkBinary128300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary128300((short)number);
	}
	

	/**
	 *	Returns the value of deMax300
	 *	@return deMax300
	 */
	public short getDeMax300() throws CFException {
   		return deMax300;
	}
	
	/**
	 * 	Update DeMax300 with the passed value
	 *  Corresponding COBOL Variable is 300-DE-MAX
	 *	@param number
	 */
	public void setDeMax300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    deMax300 = checkDeMax300MaxLimit(number); 
	}

	public void setDeMax300(int number) {
	    number = checkDeMax300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeMax300((short)number);
	}
	public void setDeMax300(long number) {
	    number = checkDeMax300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDeMax300((short)number);
	}
	

	/**
	 *	Returns the value of maxMessage300
	 *	@return maxMessage300
	 */
	public int getMaxMessage300() throws CFException {
   		return maxMessage300;
	}
	
	/**
	 * 	Update MaxMessage300 with the passed value
	 *  Corresponding COBOL Variable is 300-MAX-MESSAGE
	 *	@param number
	 */
	public void setMaxMessage300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxMessage300 = checkMaxMessage300MaxLimit(number); 
	}


	public void setMaxMessage300(long number) {
	    number = checkMaxMessage300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxMessage300((int)number);
	}
	
	/**
	 *	Returns the value of charX300
	 *	@return charX300
	 */
   public char[] getCharX300() throws CFException{
   		return charX300;
   }

  
	/**
	*  set variable charX300
	*  Corresponding COBOL Variable is 300-CHAR-X
	*  @param value
	**/
   public void setCharX300(char[] value) {
       value = checkCharX300Constraints(value);
       arraycopy(value,0,charX300,0,value.length);
   } 
	public void setCharX300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charX300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of asterisks300
	 *	@return asterisks300
	 */
   public char[] getAsterisks300() throws CFException{
   		return asterisks300;
   }

  
	/**
	*  set variable asterisks300
	*  Corresponding COBOL Variable is 300-ASTERISKS
	*  @param value
	**/
   public void setAsterisks300(char[] value) {
       value = checkAsterisks300Constraints(value);
       arraycopy(value,0,asterisks300,0,value.length);
   } 
	public void setAsterisks300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,asterisks300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg1600
	 *	@return errMsg1600
	 */
   public char[] getErrMsg1600() throws CFException{
   		return errMsg1600;
   }

  
	/**
	*  set variable errMsg1600
	*  Corresponding COBOL Variable is 600-ERR-MSG-1
	*  @param value
	**/
   public void setErrMsg1600(char[] value) {
       value = checkErrMsg1600Constraints(value);
       arraycopy(value,0,errMsg1600,0,value.length);
   } 
	public void setErrMsg1600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg1600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg2600
	 *	@return errMsg2600
	 */
   public char[] getErrMsg2600() throws CFException{
   		return errMsg2600;
   }

  
	/**
	*  set variable errMsg2600
	*  Corresponding COBOL Variable is 600-ERR-MSG-2
	*  @param value
	**/
   public void setErrMsg2600(char[] value) {
       value = checkErrMsg2600Constraints(value);
       arraycopy(value,0,errMsg2600,0,value.length);
   } 
	public void setErrMsg2600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg2600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg3600
	 *	@return errMsg3600
	 */
   public char[] getErrMsg3600() throws CFException{
   		return errMsg3600;
   }

  
	/**
	*  set variable errMsg3600
	*  Corresponding COBOL Variable is 600-ERR-MSG-3
	*  @param value
	**/
   public void setErrMsg3600(char[] value) {
       value = checkErrMsg3600Constraints(value);
       arraycopy(value,0,errMsg3600,0,value.length);
   } 
	public void setErrMsg3600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg3600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg4600
	 *	@return errMsg4600
	 */
   public char[] getErrMsg4600() throws CFException{
   		return errMsg4600;
   }

  
	/**
	*  set variable errMsg4600
	*  Corresponding COBOL Variable is 600-ERR-MSG-4
	*  @param value
	**/
   public void setErrMsg4600(char[] value) {
       value = checkErrMsg4600Constraints(value);
       arraycopy(value,0,errMsg4600,0,value.length);
   } 
	public void setErrMsg4600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg4600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg5600
	 *	@return errMsg5600
	 */
   public char[] getErrMsg5600() throws CFException{
   		return errMsg5600;
   }

  
	/**
	*  set variable errMsg5600
	*  Corresponding COBOL Variable is 600-ERR-MSG-5
	*  @param value
	**/
   public void setErrMsg5600(char[] value) {
       value = checkErrMsg5600Constraints(value);
       arraycopy(value,0,errMsg5600,0,value.length);
   } 
	public void setErrMsg5600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg5600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg6600
	 *	@return errMsg6600
	 */
   public char[] getErrMsg6600() throws CFException{
   		return errMsg6600;
   }

  
	/**
	*  set variable errMsg6600
	*  Corresponding COBOL Variable is 600-ERR-MSG-6
	*  @param value
	**/
   public void setErrMsg6600(char[] value) {
       value = checkErrMsg6600Constraints(value);
       arraycopy(value,0,errMsg6600,0,value.length);
   } 
	public void setErrMsg6600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg6600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg7600
	 *	@return errMsg7600
	 */
   public char[] getErrMsg7600() throws CFException{
   		return errMsg7600;
   }

  
	/**
	*  set variable errMsg7600
	*  Corresponding COBOL Variable is 600-ERR-MSG-7
	*  @param value
	**/
   public void setErrMsg7600(char[] value) {
       value = checkErrMsg7600Constraints(value);
       arraycopy(value,0,errMsg7600,0,value.length);
   } 
	public void setErrMsg7600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg7600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg8600
	 *	@return errMsg8600
	 */
   public char[] getErrMsg8600() throws CFException{
   		return errMsg8600;
   }

  
	/**
	*  set variable errMsg8600
	*  Corresponding COBOL Variable is 600-ERR-MSG-8
	*  @param value
	**/
   public void setErrMsg8600(char[] value) {
       value = checkErrMsg8600Constraints(value);
       arraycopy(value,0,errMsg8600,0,value.length);
   } 
	public void setErrMsg8600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg8600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sub800
	 *	@return sub800
	 */
	public short getSub800() throws CFException {
   		return sub800;
	}
	
	/**
	 * 	Update Sub800 with the passed value
	 *  Corresponding COBOL Variable is 800-SUB
	 *	@param number
	 */
	public void setSub800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    sub800 = checkSub800MaxLimit(number); 
	}

	public void setSub800(int number) {
	    number = checkSub800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub800((short)number);
	}
	public void setSub800(long number) {
	    number = checkSub800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSub800((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
