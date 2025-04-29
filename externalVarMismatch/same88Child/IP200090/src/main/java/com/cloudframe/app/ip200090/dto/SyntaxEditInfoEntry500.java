package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxEditInfoEntry500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SyntaxEditInfoEntry500 extends SyntaxEditInfoEntry500Serialized { 
   

						private char[] isFieldShouldPresent500 = Field.fillLowValue(1);

						private char[] additionalSyntaxChkInd500 = Field.fillLowValue(1);

								private int editModuleIndex500;
	
	/**
	* Constructor for SyntaxEditInfoEntry500
	**/
    public SyntaxEditInfoEntry500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SyntaxEditInfoEntry500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxEditInfoEntry500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of isFieldShouldPresent500
	 *	@return isFieldShouldPresent500
	 */
   public char[] getIsFieldShouldPresent500() throws CFException{
     if (isIsFieldShouldPresent500Modified()) { 
        isFieldShouldPresent500 = refreshIsFieldShouldPresent500();
     }
   		return isFieldShouldPresent500;
   }

  
	/**
	*  set variable isFieldShouldPresent500
	*  Corresponding COBOL Variable is 500-IS-FIELD-SHOULD-PRESENT
	*  @param value
	**/
   public void setIsFieldShouldPresent500(char[] value) {
      isFieldShouldPresent500 = checkIsFieldShouldPresent500Constraints(value);
      serializeIsFieldShouldPresent500(isFieldShouldPresent500);
   } 

     /**
	 * 	Update IsFieldShouldPresent500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsFieldShouldPresent500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsFieldShouldPresent500,isFieldShouldPresent500.length);
   	
   }
   
   public void setIsFieldShouldPresent500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsFieldShouldPresent500,isFieldShouldPresent500.length);
   	
   }
   
     /**
	 * 	Update IsFieldShouldPresent500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsFieldShouldPresent500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsFieldShouldPresent500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsFieldShouldPresent500 with another Field
	 *	@param value
	 */
   public void setIsFieldShouldPresent500(Field source) {
       replace(source,0,source.length(),beginIsFieldShouldPresent500,IS_FIELD_SHOULD_PRESENT_500_LEN);
   	
   }  
   
     /**
	 * 	Update IsFieldShouldPresent500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsFieldShouldPresent500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsFieldShouldPresent500,IS_FIELD_SHOULD_PRESENT_500_LEN);
   	
   }
   
     /**
	 * 	Update IsFieldShouldPresent500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsFieldShouldPresent500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsFieldShouldPresent500+targetIndex,targetLen);
    
   }
	char[] fieldMustBePresent8850088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFieldMustBePresent88500()
	 *	@return  Returns true if isFieldMustBePresent88500() is "Y"
	 */
   public boolean isFieldMustBePresent88500() throws CFException {
      return (  compareChars( getIsFieldShouldPresent500() , fieldMustBePresent8850088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFieldMustBePresent88500True() {  			
    	setIsFieldShouldPresent500( fieldMustBePresent8850088Value);
   	}
	char[] fieldWillBePresent8850088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isFieldWillBePresent88500()
	 *	@return  Returns true if isFieldWillBePresent88500() is "N"
	 */
   public boolean isFieldWillBePresent88500() throws CFException {
      return (  compareChars( getIsFieldShouldPresent500() , fieldWillBePresent8850088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setFieldWillBePresent88500True() {  			
    	setIsFieldShouldPresent500( fieldWillBePresent8850088Value);
   	}
	char[] invldFldPresentInd8850088Value = "*".toCharArray();
	/**
	 *	Test condition "*" for isInvldFldPresentInd88500()
	 *	@return  Returns true if isInvldFldPresentInd88500() is "*"
	 */
   public boolean isInvldFldPresentInd88500() throws CFException {
      return (  compareChars( getIsFieldShouldPresent500() , invldFldPresentInd8850088Value)  == 0  );
   }


	/**
	*  set values "*"
	*/
   	public void setInvldFldPresentInd88500True() {  			
    	setIsFieldShouldPresent500( invldFldPresentInd8850088Value);
   	}
	/**
	 *	Returns the value of additionalSyntaxChkInd500
	 *	@return additionalSyntaxChkInd500
	 */
   public char[] getAdditionalSyntaxChkInd500() throws CFException{
     if (isAdditionalSyntaxChkInd500Modified()) { 
        additionalSyntaxChkInd500 = refreshAdditionalSyntaxChkInd500();
     }
   		return additionalSyntaxChkInd500;
   }

  
	/**
	*  set variable additionalSyntaxChkInd500
	*  Corresponding COBOL Variable is 500-ADDITIONAL-SYNTAX-CHK-IND
	*  @param value
	**/
   public void setAdditionalSyntaxChkInd500(char[] value) {
      additionalSyntaxChkInd500 = checkAdditionalSyntaxChkInd500Constraints(value);
      serializeAdditionalSyntaxChkInd500(additionalSyntaxChkInd500);
   } 

     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdditionalSyntaxChkInd500,additionalSyntaxChkInd500.length);
   	
   }
   
   public void setAdditionalSyntaxChkInd500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChkInd500,additionalSyntaxChkInd500.length);
   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChkInd500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdditionalSyntaxChkInd500 with another Field
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(Field source) {
       replace(source,0,source.length(),beginAdditionalSyntaxChkInd500,ADDITIONAL_SYNTAX_CHK_IND_500_LEN);
   	
   }  
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChkInd500,ADDITIONAL_SYNTAX_CHK_IND_500_LEN);
   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChkInd500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChkInd500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChkInd500+targetIndex,targetLen);
    
   }
	char[] invldAddtionalFlag8850088Value = "*".toCharArray();
	/**
	 *	Test condition "*" for isInvldAddtionalFlag88500()
	 *	@return  Returns true if isInvldAddtionalFlag88500() is "*"
	 */
   public boolean isInvldAddtionalFlag88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , invldAddtionalFlag8850088Value)  == 0  );
   }


	/**
	*  set values "*"
	*/
   	public void setInvldAddtionalFlag88500True() {  			
    	setAdditionalSyntaxChkInd500( invldAddtionalFlag8850088Value);
   	}
	char[] noAdditionalChecks8850088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isNoAdditionalChecks88500()
	 *	@return  Returns true if isNoAdditionalChecks88500() is "1"
	 */
   public boolean isNoAdditionalChecks88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , noAdditionalChecks8850088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setNoAdditionalChecks88500True() {  			
    	setAdditionalSyntaxChkInd500( noAdditionalChecks8850088Value);
   	}
	char[] leftJustifyNotSpace8850088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isLeftJustifyNotSpace88500()
	 *	@return  Returns true if isLeftJustifyNotSpace88500() is "2"
	 */
   public boolean isLeftJustifyNotSpace88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , leftJustifyNotSpace8850088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setLeftJustifyNotSpace88500True() {  			
    	setAdditionalSyntaxChkInd500( leftJustifyNotSpace8850088Value);
   	}
	char[] notLowHighValue8850088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isNotLowHighValue88500()
	 *	@return  Returns true if isNotLowHighValue88500() is "3"
	 */
   public boolean isNotLowHighValue88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , notLowHighValue8850088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setNotLowHighValue88500True() {  			
    	setAdditionalSyntaxChkInd500( notLowHighValue8850088Value);
   	}
	char[] numericNotZero8850088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isNumericNotZero88500()
	 *	@return  Returns true if isNumericNotZero88500() is "4"
	 */
   public boolean isNumericNotZero88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , numericNotZero8850088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setNumericNotZero88500True() {  			
    	setAdditionalSyntaxChkInd500( numericNotZero8850088Value);
   	}
	char[] allZeroes8850088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isAllZeroes88500()
	 *	@return  Returns true if isAllZeroes88500() is "5"
	 */
   public boolean isAllZeroes88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , allZeroes8850088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setAllZeroes88500True() {  			
    	setAdditionalSyntaxChkInd500( allZeroes8850088Value);
   	}
	char[] notSpacesZerosAlpha8850088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isNotSpacesZerosAlpha88500()
	 *	@return  Returns true if isNotSpacesZerosAlpha88500() is "6"
	 */
   public boolean isNotSpacesZerosAlpha88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , notSpacesZerosAlpha8850088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setNotSpacesZerosAlpha88500True() {  			
    	setAdditionalSyntaxChkInd500( notSpacesZerosAlpha8850088Value);
   	}
	char[] notAllSpaces8850088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isNotAllSpaces88500()
	 *	@return  Returns true if isNotAllSpaces88500() is "7"
	 */
   public boolean isNotAllSpaces88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , notAllSpaces8850088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setNotAllSpaces88500True() {  			
    	setAdditionalSyntaxChkInd500( notAllSpaces8850088Value);
   	}
	char[] dateOrDayZeros8850088Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isDateOrDayZeros88500()
	 *	@return  Returns true if isDateOrDayZeros88500() is "8"
	 */
   public boolean isDateOrDayZeros88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , dateOrDayZeros8850088Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setDateOrDayZeros88500True() {  			
    	setAdditionalSyntaxChkInd500( dateOrDayZeros8850088Value);
   	}
	char[] julianDateYddd8850088Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isJulianDateYddd88500()
	 *	@return  Returns true if isJulianDateYddd88500() is "9"
	 */
   public boolean isJulianDateYddd88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , julianDateYddd8850088Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setJulianDateYddd88500True() {  			
    	setAdditionalSyntaxChkInd500( julianDateYddd8850088Value);
   	}
	char[] validHhMm8850088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isValidHhMm88500()
	 *	@return  Returns true if isValidHhMm88500() is "A"
	 */
   public boolean isValidHhMm88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , validHhMm8850088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setValidHhMm88500True() {  			
    	setAdditionalSyntaxChkInd500( validHhMm8850088Value);
   	}
	char[] validHh8850088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isValidHh88500()
	 *	@return  Returns true if isValidHh88500() is "B"
	 */
   public boolean isValidHh88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , validHh8850088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setValidHh88500True() {  			
    	setAdditionalSyntaxChkInd500( validHh8850088Value);
   	}
	char[] validMmss8850088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isValidMmss88500()
	 *	@return  Returns true if isValidMmss88500() is "C"
	 */
   public boolean isValidMmss88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , validMmss8850088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setValidMmss88500True() {  			
    	setAdditionalSyntaxChkInd500( validMmss8850088Value);
   	}
	char[] notSpacesZerosNine8850088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isNotSpacesZerosNine88500()
	 *	@return  Returns true if isNotSpacesZerosNine88500() is "D"
	 */
   public boolean isNotSpacesZerosNine88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , notSpacesZerosNine8850088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setNotSpacesZerosNine88500True() {  			
    	setAdditionalSyntaxChkInd500( notSpacesZerosNine8850088Value);
   	}
	char[] notSpacesOrZeros8850088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isNotSpacesOrZeros88500()
	 *	@return  Returns true if isNotSpacesOrZeros88500() is "E"
	 */
   public boolean isNotSpacesOrZeros88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , notSpacesOrZeros8850088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setNotSpacesOrZeros88500True() {  			
    	setAdditionalSyntaxChkInd500( notSpacesOrZeros8850088Value);
   	}
	char[] validYymm8850088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isValidYymm88500()
	 *	@return  Returns true if isValidYymm88500() is "F"
	 */
   public boolean isValidYymm88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , validYymm8850088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setValidYymm88500True() {  			
    	setAdditionalSyntaxChkInd500( validYymm8850088Value);
   	}
	char[] alphnumSpaceDash8850088Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isAlphnumSpaceDash88500()
	 *	@return  Returns true if isAlphnumSpaceDash88500() is "G"
	 */
   public boolean isAlphnumSpaceDash88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , alphnumSpaceDash8850088Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setAlphnumSpaceDash88500True() {  			
    	setAdditionalSyntaxChkInd500( alphnumSpaceDash8850088Value);
   	}
	char[] maxLengthDivisible8850088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isMaxLengthDivisible88500()
	 *	@return  Returns true if isMaxLengthDivisible88500() is "H"
	 */
   public boolean isMaxLengthDivisible88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , maxLengthDivisible8850088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setMaxLengthDivisible88500True() {  			
    	setAdditionalSyntaxChkInd500( maxLengthDivisible8850088Value);
   	}
	char[] leftJustifyCanSpace8850088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isLeftJustifyCanSpace88500()
	 *	@return  Returns true if isLeftJustifyCanSpace88500() is "I"
	 */
   public boolean isLeftJustifyCanSpace88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , leftJustifyCanSpace8850088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setLeftJustifyCanSpace88500True() {  			
    	setAdditionalSyntaxChkInd500( leftJustifyCanSpace8850088Value);
   	}
	char[] noLhBasicPresence8850088Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isNoLhBasicPresence88500()
	 *	@return  Returns true if isNoLhBasicPresence88500() is "J"
	 */
   public boolean isNoLhBasicPresence88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , noLhBasicPresence8850088Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setNoLhBasicPresence88500True() {  			
    	setAdditionalSyntaxChkInd500( noLhBasicPresence8850088Value);
   	}
	char[] noZeroBasicPresence8850088Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isNoZeroBasicPresence88500()
	 *	@return  Returns true if isNoZeroBasicPresence88500() is "K"
	 */
   public boolean isNoZeroBasicPresence88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , noZeroBasicPresence8850088Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setNoZeroBasicPresence88500True() {  			
    	setAdditionalSyntaxChkInd500( noZeroBasicPresence8850088Value);
   	}
	char[] leftJustifyNoBasic8850088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isLeftJustifyNoBasic88500()
	 *	@return  Returns true if isLeftJustifyNoBasic88500() is "L"
	 */
   public boolean isLeftJustifyNoBasic88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , leftJustifyNoBasic8850088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setLeftJustifyNoBasic88500True() {  			
    	setAdditionalSyntaxChkInd500( leftJustifyNoBasic8850088Value);
   	}
	char[] alpnumDasNtAlSpc8850088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isAlpnumDasNtAlSpc88500()
	 *	@return  Returns true if isAlpnumDasNtAlSpc88500() is "M"
	 */
   public boolean isAlpnumDasNtAlSpc88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , alpnumDasNtAlSpc8850088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setAlpnumDasNtAlSpc88500True() {  			
    	setAdditionalSyntaxChkInd500( alpnumDasNtAlSpc8850088Value);
   	}
	char[] alpnumNotSpaceZero8850088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAlpnumNotSpaceZero88500()
	 *	@return  Returns true if isAlpnumNotSpaceZero88500() is "N"
	 */
   public boolean isAlpnumNotSpaceZero88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , alpnumNotSpaceZero8850088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAlpnumNotSpaceZero88500True() {  			
    	setAdditionalSyntaxChkInd500( alpnumNotSpaceZero8850088Value);
   	}
	char[] leftJustifyNoSpcZer8850088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isLeftJustifyNoSpcZer88500()
	 *	@return  Returns true if isLeftJustifyNoSpcZer88500() is "O"
	 */
   public boolean isLeftJustifyNoSpcZer88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , leftJustifyNoSpcZer8850088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setLeftJustifyNoSpcZer88500True() {  			
    	setAdditionalSyntaxChkInd500( leftJustifyNoSpcZer8850088Value);
   	}
	char[] alphanumericSpace8850088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isAlphanumericSpace88500()
	 *	@return  Returns true if isAlphanumericSpace88500() is "P"
	 */
   public boolean isAlphanumericSpace88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , alphanumericSpace8850088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setAlphanumericSpace88500True() {  			
    	setAdditionalSyntaxChkInd500( alphanumericSpace8850088Value);
   	}
	char[] mustBeAllSpaces8850088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isMustBeAllSpaces88500()
	 *	@return  Returns true if isMustBeAllSpaces88500() is "Q"
	 */
   public boolean isMustBeAllSpaces88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , mustBeAllSpaces8850088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setMustBeAllSpaces88500True() {  			
    	setAdditionalSyntaxChkInd500( mustBeAllSpaces8850088Value);
   	}
	char[] mustBeAllZeroes8850088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isMustBeAllZeroes88500()
	 *	@return  Returns true if isMustBeAllZeroes88500() is "R"
	 */
   public boolean isMustBeAllZeroes88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , mustBeAllZeroes8850088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setMustBeAllZeroes88500True() {  			
    	setAdditionalSyntaxChkInd500( mustBeAllZeroes8850088Value);
   	}
	char[] leftJustNoSpcNum8850088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isLeftJustNoSpcNum88500()
	 *	@return  Returns true if isLeftJustNoSpcNum88500() is "S"
	 */
   public boolean isLeftJustNoSpcNum88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , leftJustNoSpcNum8850088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setLeftJustNoSpcNum88500True() {  			
    	setAdditionalSyntaxChkInd500( leftJustNoSpcNum8850088Value);
   	}
	char[] numericAllSpace8850088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isNumericAllSpace88500()
	 *	@return  Returns true if isNumericAllSpace88500() is "T"
	 */
   public boolean isNumericAllSpace88500() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , numericAllSpace8850088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setNumericAllSpace88500True() {  			
    	setAdditionalSyntaxChkInd500( numericAllSpace8850088Value);
   	}
	char[] leadSpaceLjAllZeros88100188Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isLeadSpaceLjAllZeros881001()
	 *	@return  Returns true if isLeadSpaceLjAllZeros881001() is "U"
	 */
   public boolean isLeadSpaceLjAllZeros881001() throws CFException {
      return (  compareChars( getAdditionalSyntaxChkInd500() , leadSpaceLjAllZeros88100188Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setLeadSpaceLjAllZeros881001True() {  			
    	setAdditionalSyntaxChkInd500( leadSpaceLjAllZeros88100188Value);
   	}
	/**
	 *	Returns the value of editModuleIndex500
	 *	@return editModuleIndex500
	 */
	public int getEditModuleIndex500() throws CFException {
       if (isEditModuleIndex500Modified()) { 
           editModuleIndex500 = refreshEditModuleIndex500();
        }
   		return editModuleIndex500;
	}
	

	
	   
	/**
	 * 	Update EditModuleIndex500 with the passed value
	 *  Corresponding COBOL Variable is 500-EDIT-MODULE-INDEX
	 *	@param number
	 */
	public void setEditModuleIndex500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    editModuleIndex500 = checkEditModuleIndex500MaxLimit(number); 
		serializeEditModuleIndex500(editModuleIndex500);
	}
	

	public void setEditModuleIndex500(long number) {
	    number = checkEditModuleIndex500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEditModuleIndex500((int)number);
	}
	
	/**
	 * 	Update EditModuleIndex500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEditModuleIndex500(char[] value) throws CFException {
		 editModuleIndex500 = serializeEditModuleIndex500(value);
	}
	/**
	 * 	Update EditModuleIndex500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEditModuleIndex500String(char[] value) throws CFException {
		 setEditModuleIndex500(value);
	}
	
	/**
	 *	Test condition 1 for isProgramIp20069088500()
	 *	@return  Returns true if isProgramIp20069088500() is 1
	 */
   public boolean isProgramIp20069088500() throws CFException {
      return (  getEditModuleIndex500()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setProgramIp20069088500True() {  			
    	setEditModuleIndex500( 1);
   	}
	
	/**
	 *	Test condition 2 for isProgramIp20233088500()
	 *	@return  Returns true if isProgramIp20233088500() is 2
	 */
   public boolean isProgramIp20233088500() throws CFException {
      return (  getEditModuleIndex500()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setProgramIp20233088500True() {  			
    	setEditModuleIndex500( 2);
   	}
	
	/**
	 *	Test condition 3 for isProgramIp20970088500()
	 *	@return  Returns true if isProgramIp20970088500() is 3
	 */
   public boolean isProgramIp20970088500() throws CFException {
      return (  getEditModuleIndex500()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setProgramIp20970088500True() {  			
    	setEditModuleIndex500( 3);
   	}
	
	/**
	 *	Test condition 4 for isProgramIp20972088500()
	 *	@return  Returns true if isProgramIp20972088500() is 4
	 */
   public boolean isProgramIp20972088500() throws CFException {
      return (  getEditModuleIndex500()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setProgramIp20972088500True() {  			
    	setEditModuleIndex500( 4);
   	}
	
	/**
	 *	Test condition 5 for isProgramIp21862088500()
	 *	@return  Returns true if isProgramIp21862088500() is 5
	 */
   public boolean isProgramIp21862088500() throws CFException {
      return (  getEditModuleIndex500()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setProgramIp21862088500True() {  			
    	setEditModuleIndex500( 5);
   	}
	
	/**
	 *	Test condition 6 for isProgramIp22108088500()
	 *	@return  Returns true if isProgramIp22108088500() is 6
	 */
   public boolean isProgramIp22108088500() throws CFException {
      return (  getEditModuleIndex500()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setProgramIp22108088500True() {  			
    	setEditModuleIndex500( 6);
   	}
	
	/**
	 *	Test condition 7 for isProgramIp22319088500()
	 *	@return  Returns true if isProgramIp22319088500() is 7
	 */
   public boolean isProgramIp22319088500() throws CFException {
      return (  getEditModuleIndex500()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setProgramIp22319088500True() {  			
    	setEditModuleIndex500( 7);
   	}
	
	/**
	 *	Test condition 8 for isProgramIp22387088500()
	 *	@return  Returns true if isProgramIp22387088500() is 8
	 */
   public boolean isProgramIp22387088500() throws CFException {
      return (  getEditModuleIndex500()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setProgramIp22387088500True() {  			
    	setEditModuleIndex500( 8);
   	}
	
	/**
	 *	Test condition 9 for isProgramIp20299088500()
	 *	@return  Returns true if isProgramIp20299088500() is 9
	 */
   public boolean isProgramIp20299088500() throws CFException {
      return (  getEditModuleIndex500()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setProgramIp20299088500True() {  			
    	setEditModuleIndex500( 9);
   	}
	
	/**
	 *	Test condition 1 THROUGH 9 for isValidPrograms88500()
	 *	@return  Returns true if isValidPrograms88500() is 1 THROUGH 9
	 */
   public boolean isValidPrograms88500() throws CFException {
      return (   (getEditModuleIndex500()  >=  1 ) &&   (getEditModuleIndex500()  <=  9 )   );
   }


	/**
	*  set values 1 THROUGH 9
	*/
   	public void setValidPrograms88500True() {  			
    	setEditModuleIndex500( 1);
   	}

	
	
	

		public static int getSyntaxEditInfoEntry500FieldLength() {
			return SYNTAX_EDIT_INFO_ENTRY_500_LENGTH;
		}

}
  
