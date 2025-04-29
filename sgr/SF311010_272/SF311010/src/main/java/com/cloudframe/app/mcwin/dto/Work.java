package com.cloudframe.app.mcwin.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] mciwinReturnedYear = new char[4];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmMcwin300 = new char[7];

						private char[] pgmVersion300 = new char[7];

								private int num00300;

								private int num04300;

								private int num08300;

								private int num16300;

								private int num99300;

								private int num19300;

								private int num20300;

						private char[] errMsg004600 = new char[32];

						private char[] errMsg008600 = new char[32];

						private char[] errMsg016600 = new char[32];

						private char[] ptrIp996010800 = new char[8];

						private char[] abendText900 = new char[100];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setMciwinReturnedYear(("0000").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmMcwin300(("MCWIN  ").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xFE,(byte)0x9E,(byte)0x00,(byte)0x3E,(byte)0x47,(byte)0x00}).toCharArray());
								setNum00300(0);
								setNum04300(4);
								setNum08300(8);
								setNum16300(16);
								setNum99300(99);
								setNum19300(19);
								setNum20300(20);
								setErrMsg004600(("INPUT YEAR NOT DISPLAY OR PACKED").toCharArray());
								setErrMsg008600(("NEW WINDOW YEAR IS NOT VALID    ").toCharArray());
								setErrMsg016600(("PARM IS NOT SUPPLIED            ").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setAbendText900(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException{
   		return isItTheFirstTime100;
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-THE-FIRST-TIME
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) {
       value = checkIsItTheFirstTime100Constraints(value);
       arraycopy(value,0,isItTheFirstTime100,0,value.length);
   } 
	public void setIsItTheFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItTheFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsFirstTime8810088Value);
   	}
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsNotFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of mciwinReturnedYear
	 *	@return mciwinReturnedYear
	 */
   public char[] getMciwinReturnedYear() throws CFException{
   		return mciwinReturnedYear;
   }

  
	/**
	*  set variable mciwinReturnedYear
	*  Corresponding COBOL Variable is MCIWIN-RETURNED-YEAR
	*  @param value
	**/
   public void setMciwinReturnedYear(char[] value) {
       value = checkMciwinReturnedYearConstraints(value);
       arraycopy(value,0,mciwinReturnedYear,0,value.length);
   } 
	public void setMciwinReturnedYear(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mciwinReturnedYear,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException{
   		return pgmIp996010300;
   }

  
	/**
	*  set variable pgmIp996010300
	*  Corresponding COBOL Variable is 300-PGM-IP996010
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) {
       value = checkPgmIp996010300Constraints(value);
       arraycopy(value,0,pgmIp996010300,0,value.length);
   } 
	public void setPgmIp996010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp996010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmMcwin300
	 *	@return pgmMcwin300
	 */
   public char[] getPgmMcwin300() throws CFException{
   		return pgmMcwin300;
   }

  
	/**
	*  set variable pgmMcwin300
	*  Corresponding COBOL Variable is 300-PGM-MCWIN
	*  @param value
	**/
   public void setPgmMcwin300(char[] value) {
       value = checkPgmMcwin300Constraints(value);
       arraycopy(value,0,pgmMcwin300,0,value.length);
   } 
	public void setPgmMcwin300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmMcwin300,0,beginIndex + endIndex);
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
	 *	Returns the value of num00300
	 *	@return num00300
	 */
	public int getNum00300() throws CFException {
       if (isNum00300Modified()) { 
           num00300 = refreshNum00300();
        }
   		return num00300;
	}
	

	
	   
	/**
	 * 	Update Num00300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-00
	 *	@param number
	 */
	public void setNum00300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num00300 = checkNum00300MaxLimit(number); 
		serializeNum00300(num00300);
	}
	

	public void setNum00300(long number) {
	    number = checkNum00300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum00300((int)number);
	}
	
	/**
	 * 	Update Num00300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum00300(char[] value) throws CFException {
		 num00300 = serializeNum00300(value);
	}
	/**
	 * 	Update Num00300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum00300String(char[] value) throws CFException {
		 setNum00300(value);
	}
	/**
	 *	Returns the value of num04300
	 *	@return num04300
	 */
	public int getNum04300() throws CFException {
       if (isNum04300Modified()) { 
           num04300 = refreshNum04300();
        }
   		return num04300;
	}
	

	
	   
	/**
	 * 	Update Num04300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-04
	 *	@param number
	 */
	public void setNum04300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num04300 = checkNum04300MaxLimit(number); 
		serializeNum04300(num04300);
	}
	

	public void setNum04300(long number) {
	    number = checkNum04300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum04300((int)number);
	}
	
	/**
	 * 	Update Num04300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum04300(char[] value) throws CFException {
		 num04300 = serializeNum04300(value);
	}
	/**
	 * 	Update Num04300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum04300String(char[] value) throws CFException {
		 setNum04300(value);
	}
	/**
	 *	Returns the value of num08300
	 *	@return num08300
	 */
	public int getNum08300() throws CFException {
       if (isNum08300Modified()) { 
           num08300 = refreshNum08300();
        }
   		return num08300;
	}
	

	
	   
	/**
	 * 	Update Num08300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-08
	 *	@param number
	 */
	public void setNum08300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num08300 = checkNum08300MaxLimit(number); 
		serializeNum08300(num08300);
	}
	

	public void setNum08300(long number) {
	    number = checkNum08300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum08300((int)number);
	}
	
	/**
	 * 	Update Num08300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum08300(char[] value) throws CFException {
		 num08300 = serializeNum08300(value);
	}
	/**
	 * 	Update Num08300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum08300String(char[] value) throws CFException {
		 setNum08300(value);
	}
	/**
	 *	Returns the value of num16300
	 *	@return num16300
	 */
	public int getNum16300() throws CFException {
       if (isNum16300Modified()) { 
           num16300 = refreshNum16300();
        }
   		return num16300;
	}
	

	
	   
	/**
	 * 	Update Num16300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-16
	 *	@param number
	 */
	public void setNum16300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num16300 = checkNum16300MaxLimit(number); 
		serializeNum16300(num16300);
	}
	

	public void setNum16300(long number) {
	    number = checkNum16300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum16300((int)number);
	}
	
	/**
	 * 	Update Num16300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum16300(char[] value) throws CFException {
		 num16300 = serializeNum16300(value);
	}
	/**
	 * 	Update Num16300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum16300String(char[] value) throws CFException {
		 setNum16300(value);
	}
	/**
	 *	Returns the value of num99300
	 *	@return num99300
	 */
	public int getNum99300() throws CFException {
       if (isNum99300Modified()) { 
           num99300 = refreshNum99300();
        }
   		return num99300;
	}
	

	
	   
	/**
	 * 	Update Num99300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-99
	 *	@param number
	 */
	public void setNum99300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num99300 = checkNum99300MaxLimit(number); 
		serializeNum99300(num99300);
	}
	

	public void setNum99300(long number) {
	    number = checkNum99300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum99300((int)number);
	}
	
	/**
	 * 	Update Num99300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum99300(char[] value) throws CFException {
		 num99300 = serializeNum99300(value);
	}
	/**
	 * 	Update Num99300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum99300String(char[] value) throws CFException {
		 setNum99300(value);
	}
	/**
	 *	Returns the value of num19300
	 *	@return num19300
	 */
	public int getNum19300() throws CFException {
       if (isNum19300Modified()) { 
           num19300 = refreshNum19300();
        }
   		return num19300;
	}
	

	
	   
	/**
	 * 	Update Num19300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-19
	 *	@param number
	 */
	public void setNum19300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num19300 = checkNum19300MaxLimit(number); 
		serializeNum19300(num19300);
	}
	

	public void setNum19300(long number) {
	    number = checkNum19300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum19300((int)number);
	}
	
	/**
	 * 	Update Num19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum19300(char[] value) throws CFException {
		 num19300 = serializeNum19300(value);
	}
	/**
	 * 	Update Num19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum19300String(char[] value) throws CFException {
		 setNum19300(value);
	}
	/**
	 *	Returns the value of num20300
	 *	@return num20300
	 */
	public int getNum20300() throws CFException {
       if (isNum20300Modified()) { 
           num20300 = refreshNum20300();
        }
   		return num20300;
	}
	

	
	   
	/**
	 * 	Update Num20300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUM-20
	 *	@param number
	 */
	public void setNum20300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    num20300 = checkNum20300MaxLimit(number); 
		serializeNum20300(num20300);
	}
	

	public void setNum20300(long number) {
	    number = checkNum20300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNum20300((int)number);
	}
	
	/**
	 * 	Update Num20300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNum20300(char[] value) throws CFException {
		 num20300 = serializeNum20300(value);
	}
	/**
	 * 	Update Num20300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNum20300String(char[] value) throws CFException {
		 setNum20300(value);
	}
	/**
	 *	Returns the value of errMsg004600
	 *	@return errMsg004600
	 */
   public char[] getErrMsg004600() throws CFException{
   		return errMsg004600;
   }

  
	/**
	*  set variable errMsg004600
	*  Corresponding COBOL Variable is 600-ERR-MSG-004
	*  @param value
	**/
   public void setErrMsg004600(char[] value) {
       value = checkErrMsg004600Constraints(value);
       arraycopy(value,0,errMsg004600,0,value.length);
   } 
	public void setErrMsg004600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg004600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg008600
	 *	@return errMsg008600
	 */
   public char[] getErrMsg008600() throws CFException{
   		return errMsg008600;
   }

  
	/**
	*  set variable errMsg008600
	*  Corresponding COBOL Variable is 600-ERR-MSG-008
	*  @param value
	**/
   public void setErrMsg008600(char[] value) {
       value = checkErrMsg008600Constraints(value);
       arraycopy(value,0,errMsg008600,0,value.length);
   } 
	public void setErrMsg008600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg008600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errMsg016600
	 *	@return errMsg016600
	 */
   public char[] getErrMsg016600() throws CFException{
   		return errMsg016600;
   }

  
	/**
	*  set variable errMsg016600
	*  Corresponding COBOL Variable is 600-ERR-MSG-016
	*  @param value
	**/
   public void setErrMsg016600(char[] value) {
       value = checkErrMsg016600Constraints(value);
       arraycopy(value,0,errMsg016600,0,value.length);
   } 
	public void setErrMsg016600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errMsg016600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException{
   		return ptrIp996010800;
   }

  
	/**
	*  set variable ptrIp996010800
	*  Corresponding COBOL Variable is 800-PTR-IP996010
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) {
       value = checkPtrIp996010800Constraints(value);
       arraycopy(value,0,ptrIp996010800,0,value.length);
   } 
	public void setPtrIp996010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp996010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendText900
	 *	@return abendText900
	 */
   public char[] getAbendText900() throws CFException{
   		return abendText900;
   }

  
	/**
	*  set variable abendText900
	*  Corresponding COBOL Variable is 900-ABEND-TEXT
	*  @param value
	**/
   public void setAbendText900(char[] value) {
       value = checkAbendText900Constraints(value);
       arraycopy(value,0,abendText900,0,value.length);
   } 
	public void setAbendText900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendText900,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
