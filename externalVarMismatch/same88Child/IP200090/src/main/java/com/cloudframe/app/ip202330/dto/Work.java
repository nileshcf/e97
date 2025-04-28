package com.cloudframe.app.ip202330.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.ip202330.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] edit0233300 = new char[8];

						private char[] pgmIp200110300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] abendPgm300 = new char[8];

						private char[] numericSyntax300 = new char[3];

						private char[] formatAbendCode300 = new char[4];

								private short valueOne300;

						private char[] value9300 = new char[1];

						private char[] para2200300 = new char[25];

								private short startIndex800;

								private short elementStart800;

								private short candidateStart800;

								private short candidateLngth800;

						private char[] candidateSyntax800 = new char[3];

						private char[] ptrIp996010800 = new char[8];

						private char[] ptrIp200110800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setEdit0233300(("IP202330").toCharArray());
								setPgmIp200110300(("IP200110").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xF5,(byte)0x65,(byte)0x01,(byte)0xBB,(byte)0x62,(byte)0x00}).toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setNumericSyntax300(("N  ").toCharArray());
								setFormatAbendCode300(("3005").toCharArray());
								setValueOne300((short)1);
								setValue9300(("9").toCharArray());
								setPara2200300(("2200-PERFORM-PRIMARY-EDIT").toCharArray());
								setStartIndex800((short)0);
								setElementStart800((short)0);
								setCandidateStart800((short)0);
								setCandidateLngth800((short)0);
								setCandidateSyntax800(fillSpace(3));
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp200110800(("IP200110").toCharArray());
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
	char[] itIsTheFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsTheFirstTime88100()
	 *	@return  Returns true if isItIsTheFirstTime88100() is "Y"
	 */
   public boolean isItIsTheFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsTheFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsTheFirstTime8810088Value);
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
	 *	Returns the value of edit0233300
	 *	@return edit0233300
	 */
   public char[] getEdit0233300() throws CFException{
   		return edit0233300;
   }

  
	/**
	*  set variable edit0233300
	*  Corresponding COBOL Variable is 300-EDIT-0233
	*  @param value
	**/
   public void setEdit0233300(char[] value) {
       value = checkEdit0233300Constraints(value);
       arraycopy(value,0,edit0233300,0,value.length);
   } 
	public void setEdit0233300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,edit0233300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp200110300
	 *	@return pgmIp200110300
	 */
   public char[] getPgmIp200110300() throws CFException{
   		return pgmIp200110300;
   }

  
	/**
	*  set variable pgmIp200110300
	*  Corresponding COBOL Variable is 300-PGM-IP200110
	*  @param value
	**/
   public void setPgmIp200110300(char[] value) {
       value = checkPgmIp200110300Constraints(value);
       arraycopy(value,0,pgmIp200110300,0,value.length);
   } 
	public void setPgmIp200110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp200110300,0,beginIndex + endIndex);
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
	 *	Returns the value of abendPgm300
	 *	@return abendPgm300
	 */
   public char[] getAbendPgm300() throws CFException{
   		return abendPgm300;
   }

  
	/**
	*  set variable abendPgm300
	*  Corresponding COBOL Variable is 300-ABEND-PGM
	*  @param value
	**/
   public void setAbendPgm300(char[] value) {
       value = checkAbendPgm300Constraints(value);
       arraycopy(value,0,abendPgm300,0,value.length);
   } 
	public void setAbendPgm300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPgm300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of numericSyntax300
	 *	@return numericSyntax300
	 */
   public char[] getNumericSyntax300() throws CFException{
   		return numericSyntax300;
   }

  
	/**
	*  set variable numericSyntax300
	*  Corresponding COBOL Variable is 300-NUMERIC-SYNTAX
	*  @param value
	**/
   public void setNumericSyntax300(char[] value) {
       value = checkNumericSyntax300Constraints(value);
       arraycopy(value,0,numericSyntax300,0,value.length);
   } 
	public void setNumericSyntax300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,numericSyntax300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of formatAbendCode300
	 *	@return formatAbendCode300
	 */
   public char[] getFormatAbendCode300() throws CFException{
   		return formatAbendCode300;
   }

  
	/**
	*  set variable formatAbendCode300
	*  Corresponding COBOL Variable is 300-FORMAT-ABEND-CODE
	*  @param value
	**/
   public void setFormatAbendCode300(char[] value) {
       value = checkFormatAbendCode300Constraints(value);
       arraycopy(value,0,formatAbendCode300,0,value.length);
   } 
	public void setFormatAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,formatAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public short getValueOne300() throws CFException {
   		return valueOne300;
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-ONE
	 *	@param number
	 */
	public void setValueOne300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    valueOne300 = checkValueOne300MaxLimit(number); 
	}

	public void setValueOne300(int number) {
	    number = checkValueOne300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValueOne300((short)number);
	}
	public void setValueOne300(long number) {
	    number = checkValueOne300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValueOne300((short)number);
	}
	

	/**
	 *	Returns the value of value9300
	 *	@return value9300
	 */
   public char[] getValue9300() throws CFException{
   		return value9300;
   }

  
	/**
	*  set variable value9300
	*  Corresponding COBOL Variable is 300-VALUE-9
	*  @param value
	**/
   public void setValue9300(char[] value) {
       value = checkValue9300Constraints(value);
       arraycopy(value,0,value9300,0,value.length);
   } 
	public void setValue9300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,value9300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para2200300
	 *	@return para2200300
	 */
   public char[] getPara2200300() throws CFException{
   		return para2200300;
   }

  
	/**
	*  set variable para2200300
	*  Corresponding COBOL Variable is 300-PARA-2200
	*  @param value
	**/
   public void setPara2200300(char[] value) {
       value = checkPara2200300Constraints(value);
       arraycopy(value,0,para2200300,0,value.length);
   } 
	public void setPara2200300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2200300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of startIndex800
	 *	@return startIndex800
	 */
	public short getStartIndex800() throws CFException {
   		return startIndex800;
	}
	
	/**
	 * 	Update StartIndex800 with the passed value
	 *  Corresponding COBOL Variable is 800-START-INDEX
	 *	@param number
	 */
	public void setStartIndex800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    startIndex800 = checkStartIndex800MaxLimit(number); 
	}

	public void setStartIndex800(int number) {
	    number = checkStartIndex800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStartIndex800((short)number);
	}
	public void setStartIndex800(long number) {
	    number = checkStartIndex800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStartIndex800((short)number);
	}
	

	/**
	 *	Returns the value of elementStart800
	 *	@return elementStart800
	 */
	public short getElementStart800() throws CFException {
   		return elementStart800;
	}
	
	/**
	 * 	Update ElementStart800 with the passed value
	 *  Corresponding COBOL Variable is 800-ELEMENT-START
	 *	@param number
	 */
	public void setElementStart800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    elementStart800 = checkElementStart800MaxLimit(number); 
	}

	public void setElementStart800(int number) {
	    number = checkElementStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setElementStart800((short)number);
	}
	public void setElementStart800(long number) {
	    number = checkElementStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setElementStart800((short)number);
	}
	

	/**
	 *	Returns the value of candidateStart800
	 *	@return candidateStart800
	 */
	public short getCandidateStart800() throws CFException {
   		return candidateStart800;
	}
	
	/**
	 * 	Update CandidateStart800 with the passed value
	 *  Corresponding COBOL Variable is 800-CANDIDATE-START
	 *	@param number
	 */
	public void setCandidateStart800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    candidateStart800 = checkCandidateStart800MaxLimit(number); 
	}

	public void setCandidateStart800(int number) {
	    number = checkCandidateStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateStart800((short)number);
	}
	public void setCandidateStart800(long number) {
	    number = checkCandidateStart800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateStart800((short)number);
	}
	

	/**
	 *	Returns the value of candidateLngth800
	 *	@return candidateLngth800
	 */
	public short getCandidateLngth800() throws CFException {
   		return candidateLngth800;
	}
	
	/**
	 * 	Update CandidateLngth800 with the passed value
	 *  Corresponding COBOL Variable is 800-CANDIDATE-LNGTH
	 *	@param number
	 */
	public void setCandidateLngth800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    candidateLngth800 = checkCandidateLngth800MaxLimit(number); 
	}

	public void setCandidateLngth800(int number) {
	    number = checkCandidateLngth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateLngth800((short)number);
	}
	public void setCandidateLngth800(long number) {
	    number = checkCandidateLngth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateLngth800((short)number);
	}
	

	/**
	 *	Returns the value of candidateSyntax800
	 *	@return candidateSyntax800
	 */
   public char[] getCandidateSyntax800() throws CFException{
   		return candidateSyntax800;
   }

  
	/**
	*  set variable candidateSyntax800
	*  Corresponding COBOL Variable is 800-CANDIDATE-SYNTAX
	*  @param value
	**/
   public void setCandidateSyntax800(char[] value) {
       value = checkCandidateSyntax800Constraints(value);
       arraycopy(value,0,candidateSyntax800,0,value.length);
   } 
	public void setCandidateSyntax800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,candidateSyntax800,0,beginIndex + endIndex);
   }
	char[] numeric8880088Value = "N  ".toCharArray();
	/**
	 *	Test condition "N" for isNumeric88800()
	 *	@return  Returns true if isNumeric88800() is "N"
	 */
   public boolean isNumeric88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , numeric8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNumeric88800True() {  			
    	setCandidateSyntax800( numeric8880088Value);
   	}
	char[] alphabet8880088Value = "A  ".toCharArray();
	/**
	 *	Test condition "A" for isAlphabet88800()
	 *	@return  Returns true if isAlphabet88800() is "A"
	 */
   public boolean isAlphabet88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , alphabet8880088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setAlphabet88800True() {  			
    	setCandidateSyntax800( alphabet8880088Value);
   	}
	char[] alphabetSpace8880088Value = "AS ".toCharArray();
	/**
	 *	Test condition "AS" for isAlphabetSpace88800()
	 *	@return  Returns true if isAlphabetSpace88800() is "AS"
	 */
   public boolean isAlphabetSpace88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , alphabetSpace8880088Value)  == 0  );
   }


	/**
	*  set values "AS"
	*/
   	public void setAlphabetSpace88800True() {  			
    	setCandidateSyntax800( alphabetSpace8880088Value);
   	}
	char[] numericSpace8880088Value = "NS ".toCharArray();
	/**
	 *	Test condition "NS" for isNumericSpace88800()
	 *	@return  Returns true if isNumericSpace88800() is "NS"
	 */
   public boolean isNumericSpace88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , numericSpace8880088Value)  == 0  );
   }


	/**
	*  set values "NS"
	*/
   	public void setNumericSpace88800True() {  			
    	setCandidateSyntax800( numericSpace8880088Value);
   	}
	char[] alphabetNumeric8880088Value = "AN ".toCharArray();
	/**
	 *	Test condition "AN" for isAlphabetNumeric88800()
	 *	@return  Returns true if isAlphabetNumeric88800() is "AN"
	 */
   public boolean isAlphabetNumeric88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , alphabetNumeric8880088Value)  == 0  );
   }


	/**
	*  set values "AN"
	*/
   	public void setAlphabetNumeric88800True() {  			
    	setCandidateSyntax800( alphabetNumeric8880088Value);
   	}
	char[] alphanumSpecial8880088Value = "ANS".toCharArray();
	/**
	 *	Test condition "ANS" for isAlphanumSpecial88800()
	 *	@return  Returns true if isAlphanumSpecial88800() is "ANS"
	 */
   public boolean isAlphanumSpecial88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , alphanumSpecial8880088Value)  == 0  );
   }


	/**
	*  set values "ANS"
	*/
   	public void setAlphanumSpecial88800True() {  			
    	setCandidateSyntax800( alphanumSpecial8880088Value);
   	}
	char[] pad8880088Value = "P  ".toCharArray();
	/**
	 *	Test condition "P" for isPad88800()
	 *	@return  Returns true if isPad88800() is "P"
	 */
   public boolean isPad88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , pad8880088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setPad88800True() {  			
    	setCandidateSyntax800( pad8880088Value);
   	}
	char[] special8880088Value = "S  ".toCharArray();
	/**
	 *	Test condition "S" for isSpecial88800()
	 *	@return  Returns true if isSpecial88800() is "S"
	 */
   public boolean isSpecial88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , special8880088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setSpecial88800True() {  			
    	setCandidateSyntax800( special8880088Value);
   	}
	char[] binary8880088Value = "B  ".toCharArray();
	/**
	 *	Test condition "B" for isBinary88800()
	 *	@return  Returns true if isBinary88800() is "B"
	 */
   public boolean isBinary88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , binary8880088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setBinary88800True() {  			
    	setCandidateSyntax800( binary8880088Value);
   	}
	char[] trackData8880088Value = "Z  ".toCharArray();
	/**
	 *	Test condition "Z" for isTrackData88800()
	 *	@return  Returns true if isTrackData88800() is "Z"
	 */
   public boolean isTrackData88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , trackData8880088Value)  == 0  );
   }


	/**
	*  set values "Z"
	*/
   	public void setTrackData88800True() {  			
    	setCandidateSyntax800( trackData8880088Value);
   	}
	char[] creditOrDebit8880088Value = "X  ".toCharArray();
	/**
	 *	Test condition "X" for isCreditOrDebit88800()
	 *	@return  Returns true if isCreditOrDebit88800() is "X"
	 */
   public boolean isCreditOrDebit88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , creditOrDebit8880088Value)  == 0  );
   }


	/**
	*  set values "X"
	*/
   	public void setCreditOrDebit88800True() {  			
    	setCandidateSyntax800( creditOrDebit8880088Value);
   	}
	char[] alphanumPad8880088Value = "ANP".toCharArray();
	/**
	 *	Test condition "ANP" for isAlphanumPad88800()
	 *	@return  Returns true if isAlphanumPad88800() is "ANP"
	 */
   public boolean isAlphanumPad88800() throws CFException {
      return (  compareChars( getCandidateSyntax800() , alphanumPad8880088Value)  == 0  );
   }


	/**
	*  set values "ANP"
	*/
   	public void setAlphanumPad88800True() {  			
    	setCandidateSyntax800( alphanumPad8880088Value);
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
	 *	Returns the value of ptrIp200110800
	 *	@return ptrIp200110800
	 */
   public char[] getPtrIp200110800() throws CFException{
   		return ptrIp200110800;
   }

  
	/**
	*  set variable ptrIp200110800
	*  Corresponding COBOL Variable is 800-PTR-IP200110
	*  @param value
	**/
   public void setPtrIp200110800(char[] value) {
       value = checkPtrIp200110800Constraints(value);
       arraycopy(value,0,ptrIp200110800,0,value.length);
   } 
	public void setPtrIp200110800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp200110800,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
