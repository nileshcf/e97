package com.cloudframe.app.global.sharedvar;

/**
*  The class AdditionalSyntaxChecksGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_additionalSyntaxChecksGroup100")

public class AdditionalSyntaxChecksGroup100 extends AdditionalSyntaxChecksGroup100Serialized  implements InitializingBean {
   

						private char[] additionalSyntaxChecks100 = Field.fillLowValue(1);
	
	/**
	* Constructor for AdditionalSyntaxChecksGroup100
	**/
    public AdditionalSyntaxChecksGroup100() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of additionalSyntaxChecks100
	 *	@return additionalSyntaxChecks100
	 */
   public char[] getAdditionalSyntaxChecks100() throws CFException{
     if (isAdditionalSyntaxChecks100Modified()) { 
        additionalSyntaxChecks100 = refreshAdditionalSyntaxChecks100();
     }
   		return additionalSyntaxChecks100;
   }

  
	/**
	*  set variable additionalSyntaxChecks100
	*  Corresponding COBOL Variable is 100-ADDITIONAL-SYNTAX-CHECKS
	*  @param value
	**/
   public void setAdditionalSyntaxChecks100(char[] value) {
      additionalSyntaxChecks100 = checkAdditionalSyntaxChecks100Constraints(value);
      serializeAdditionalSyntaxChecks100(additionalSyntaxChecks100);
   } 

     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAdditionalSyntaxChecks100,additionalSyntaxChecks100.length);
   	
   }
   
   public void setAdditionalSyntaxChecks100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChecks100,additionalSyntaxChecks100.length);
   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChecks100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AdditionalSyntaxChecks100 with another Field
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(Field source) {
       replace(source,0,source.length(),beginAdditionalSyntaxChecks100,ADDITIONAL_SYNTAX_CHECKS_100_LEN);
   	
   }  
   
     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChecks100,ADDITIONAL_SYNTAX_CHECKS_100_LEN);
   	
   }
   
     /**
	 * 	Update AdditionalSyntaxChecks100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAdditionalSyntaxChecks100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAdditionalSyntaxChecks100+targetIndex,targetLen);
    
   }
	char[] noAdditionalChecks8810088Value1 = "0".toCharArray();
char[] noAdditionalChecks8810088Value2 = "1".toCharArray();
char[] noAdditionalChecks8810088Value3 = "M".toCharArray();

	/**
	 *	Test condition "0" "1" "M" for isNoAdditionalChecks88100()
	 *	@return  Returns true if isNoAdditionalChecks88100() is "0" "1" "M"
	 */
   public boolean isNoAdditionalChecks88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , noAdditionalChecks8810088Value1)  == 0  ||  compareChars( getAdditionalSyntaxChecks100() , noAdditionalChecks8810088Value2)  == 0  ||  compareChars( getAdditionalSyntaxChecks100() , noAdditionalChecks8810088Value3)  == 0  );
   }


	/**
	*  set values "0" "1" "M"
	*/
   	public void setNoAdditionalChecks88100True() {  			
    	setAdditionalSyntaxChecks100( noAdditionalChecks8810088Value1);
   	}
	char[] leftJustifyNotSpace8810088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isLeftJustifyNotSpace88100()
	 *	@return  Returns true if isLeftJustifyNotSpace88100() is "2"
	 */
   public boolean isLeftJustifyNotSpace88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , leftJustifyNotSpace8810088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setLeftJustifyNotSpace88100True() {  			
    	setAdditionalSyntaxChecks100( leftJustifyNotSpace8810088Value);
   	}
	char[] notLowHighValue8810088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isNotLowHighValue88100()
	 *	@return  Returns true if isNotLowHighValue88100() is "3"
	 */
   public boolean isNotLowHighValue88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , notLowHighValue8810088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setNotLowHighValue88100True() {  			
    	setAdditionalSyntaxChecks100( notLowHighValue8810088Value);
   	}
	char[] numericNotZero8810088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isNumericNotZero88100()
	 *	@return  Returns true if isNumericNotZero88100() is "4"
	 */
   public boolean isNumericNotZero88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , numericNotZero8810088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setNumericNotZero88100True() {  			
    	setAdditionalSyntaxChecks100( numericNotZero8810088Value);
   	}
	char[] allZeroes8810088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isAllZeroes88100()
	 *	@return  Returns true if isAllZeroes88100() is "5"
	 */
   public boolean isAllZeroes88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , allZeroes8810088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setAllZeroes88100True() {  			
    	setAdditionalSyntaxChecks100( allZeroes8810088Value);
   	}
	char[] notSpacesZerosAlpha8810088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isNotSpacesZerosAlpha88100()
	 *	@return  Returns true if isNotSpacesZerosAlpha88100() is "6"
	 */
   public boolean isNotSpacesZerosAlpha88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , notSpacesZerosAlpha8810088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setNotSpacesZerosAlpha88100True() {  			
    	setAdditionalSyntaxChecks100( notSpacesZerosAlpha8810088Value);
   	}
	char[] notAllSpaces8810088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isNotAllSpaces88100()
	 *	@return  Returns true if isNotAllSpaces88100() is "7"
	 */
   public boolean isNotAllSpaces88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , notAllSpaces8810088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setNotAllSpaces88100True() {  			
    	setAdditionalSyntaxChecks100( notAllSpaces8810088Value);
   	}
	char[] dateOrDayZeros8810088Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isDateOrDayZeros88100()
	 *	@return  Returns true if isDateOrDayZeros88100() is "8"
	 */
   public boolean isDateOrDayZeros88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , dateOrDayZeros8810088Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setDateOrDayZeros88100True() {  			
    	setAdditionalSyntaxChecks100( dateOrDayZeros8810088Value);
   	}
	char[] julianDateYddd8810088Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isJulianDateYddd88100()
	 *	@return  Returns true if isJulianDateYddd88100() is "9"
	 */
   public boolean isJulianDateYddd88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , julianDateYddd8810088Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setJulianDateYddd88100True() {  			
    	setAdditionalSyntaxChecks100( julianDateYddd8810088Value);
   	}
	char[] validHhMm8810088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isValidHhMm88100()
	 *	@return  Returns true if isValidHhMm88100() is "A"
	 */
   public boolean isValidHhMm88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , validHhMm8810088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setValidHhMm88100True() {  			
    	setAdditionalSyntaxChecks100( validHhMm8810088Value);
   	}
	char[] validHh8810088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isValidHh88100()
	 *	@return  Returns true if isValidHh88100() is "B"
	 */
   public boolean isValidHh88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , validHh8810088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setValidHh88100True() {  			
    	setAdditionalSyntaxChecks100( validHh8810088Value);
   	}
	char[] validMmss8810088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isValidMmss88100()
	 *	@return  Returns true if isValidMmss88100() is "C"
	 */
   public boolean isValidMmss88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , validMmss8810088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setValidMmss88100True() {  			
    	setAdditionalSyntaxChecks100( validMmss8810088Value);
   	}
	char[] notSpacesZerosNine8810088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isNotSpacesZerosNine88100()
	 *	@return  Returns true if isNotSpacesZerosNine88100() is "D"
	 */
   public boolean isNotSpacesZerosNine88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , notSpacesZerosNine8810088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setNotSpacesZerosNine88100True() {  			
    	setAdditionalSyntaxChecks100( notSpacesZerosNine8810088Value);
   	}
	char[] notSpacesOrZeros8810088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isNotSpacesOrZeros88100()
	 *	@return  Returns true if isNotSpacesOrZeros88100() is "E"
	 */
   public boolean isNotSpacesOrZeros88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , notSpacesOrZeros8810088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setNotSpacesOrZeros88100True() {  			
    	setAdditionalSyntaxChecks100( notSpacesOrZeros8810088Value);
   	}
	char[] validYymm8810088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isValidYymm88100()
	 *	@return  Returns true if isValidYymm88100() is "F"
	 */
   public boolean isValidYymm88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , validYymm8810088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setValidYymm88100True() {  			
    	setAdditionalSyntaxChecks100( validYymm8810088Value);
   	}
	char[] alphnumSpaceDash8810088Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isAlphnumSpaceDash88100()
	 *	@return  Returns true if isAlphnumSpaceDash88100() is "G"
	 */
   public boolean isAlphnumSpaceDash88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , alphnumSpaceDash8810088Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setAlphnumSpaceDash88100True() {  			
    	setAdditionalSyntaxChecks100( alphnumSpaceDash8810088Value);
   	}
	char[] maxLengthDivisible8810088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isMaxLengthDivisible88100()
	 *	@return  Returns true if isMaxLengthDivisible88100() is "H"
	 */
   public boolean isMaxLengthDivisible88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , maxLengthDivisible8810088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setMaxLengthDivisible88100True() {  			
    	setAdditionalSyntaxChecks100( maxLengthDivisible8810088Value);
   	}
	char[] leftJustifyCanSpace8810088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isLeftJustifyCanSpace88100()
	 *	@return  Returns true if isLeftJustifyCanSpace88100() is "I"
	 */
   public boolean isLeftJustifyCanSpace88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , leftJustifyCanSpace8810088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setLeftJustifyCanSpace88100True() {  			
    	setAdditionalSyntaxChecks100( leftJustifyCanSpace8810088Value);
   	}
	char[] noLhBasicPresence8810088Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isNoLhBasicPresence88100()
	 *	@return  Returns true if isNoLhBasicPresence88100() is "J"
	 */
   public boolean isNoLhBasicPresence88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , noLhBasicPresence8810088Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setNoLhBasicPresence88100True() {  			
    	setAdditionalSyntaxChecks100( noLhBasicPresence8810088Value);
   	}
	char[] noZeroBasicPresence8810088Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isNoZeroBasicPresence88100()
	 *	@return  Returns true if isNoZeroBasicPresence88100() is "K"
	 */
   public boolean isNoZeroBasicPresence88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , noZeroBasicPresence8810088Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setNoZeroBasicPresence88100True() {  			
    	setAdditionalSyntaxChecks100( noZeroBasicPresence8810088Value);
   	}
	char[] leftJustifyNoBasic8810088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isLeftJustifyNoBasic88100()
	 *	@return  Returns true if isLeftJustifyNoBasic88100() is "L"
	 */
   public boolean isLeftJustifyNoBasic88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , leftJustifyNoBasic8810088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setLeftJustifyNoBasic88100True() {  			
    	setAdditionalSyntaxChecks100( leftJustifyNoBasic8810088Value);
   	}
	char[] alpnumDasNtAlSpc8810088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isAlpnumDasNtAlSpc88100()
	 *	@return  Returns true if isAlpnumDasNtAlSpc88100() is "M"
	 */
   public boolean isAlpnumDasNtAlSpc88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , alpnumDasNtAlSpc8810088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setAlpnumDasNtAlSpc88100True() {  			
    	setAdditionalSyntaxChecks100( alpnumDasNtAlSpc8810088Value);
   	}
	char[] alpnumNotSpaceZero8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAlpnumNotSpaceZero88100()
	 *	@return  Returns true if isAlpnumNotSpaceZero88100() is "N"
	 */
   public boolean isAlpnumNotSpaceZero88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , alpnumNotSpaceZero8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAlpnumNotSpaceZero88100True() {  			
    	setAdditionalSyntaxChecks100( alpnumNotSpaceZero8810088Value);
   	}
	char[] leftJustifyNoSpcZer8810088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isLeftJustifyNoSpcZer88100()
	 *	@return  Returns true if isLeftJustifyNoSpcZer88100() is "O"
	 */
   public boolean isLeftJustifyNoSpcZer88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , leftJustifyNoSpcZer8810088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setLeftJustifyNoSpcZer88100True() {  			
    	setAdditionalSyntaxChecks100( leftJustifyNoSpcZer8810088Value);
   	}
	char[] alphanumericSpace8810088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isAlphanumericSpace88100()
	 *	@return  Returns true if isAlphanumericSpace88100() is "P"
	 */
   public boolean isAlphanumericSpace88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , alphanumericSpace8810088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setAlphanumericSpace88100True() {  			
    	setAdditionalSyntaxChecks100( alphanumericSpace8810088Value);
   	}
	char[] mustBeAllSpaces8810088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isMustBeAllSpaces88100()
	 *	@return  Returns true if isMustBeAllSpaces88100() is "Q"
	 */
   public boolean isMustBeAllSpaces88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , mustBeAllSpaces8810088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setMustBeAllSpaces88100True() {  			
    	setAdditionalSyntaxChecks100( mustBeAllSpaces8810088Value);
   	}
	char[] mustBeAllZeroes8810088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isMustBeAllZeroes88100()
	 *	@return  Returns true if isMustBeAllZeroes88100() is "R"
	 */
   public boolean isMustBeAllZeroes88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , mustBeAllZeroes8810088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setMustBeAllZeroes88100True() {  			
    	setAdditionalSyntaxChecks100( mustBeAllZeroes8810088Value);
   	}
	char[] leftJustNoSpcNum8810088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isLeftJustNoSpcNum88100()
	 *	@return  Returns true if isLeftJustNoSpcNum88100() is "S"
	 */
   public boolean isLeftJustNoSpcNum88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , leftJustNoSpcNum8810088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setLeftJustNoSpcNum88100True() {  			
    	setAdditionalSyntaxChecks100( leftJustNoSpcNum8810088Value);
   	}
	char[] numericAllSpace8810088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isNumericAllSpace88100()
	 *	@return  Returns true if isNumericAllSpace88100() is "T"
	 */
   public boolean isNumericAllSpace88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , numericAllSpace8810088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setNumericAllSpace88100True() {  			
    	setAdditionalSyntaxChecks100( numericAllSpace8810088Value);
   	}
	char[] leadSpaceLjAllZeros8810088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isLeadSpaceLjAllZeros88100()
	 *	@return  Returns true if isLeadSpaceLjAllZeros88100() is "U"
	 */
   public boolean isLeadSpaceLjAllZeros88100() throws CFException {
      return (  compareChars( getAdditionalSyntaxChecks100() , leadSpaceLjAllZeros8810088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setLeadSpaceLjAllZeros88100True() {  			
    	setAdditionalSyntaxChecks100( leadSpaceLjAllZeros8810088Value);
   	}

	
	
	

		public static int getAdditionalSyntaxChecksGroup100FieldLength() {
			return ADDITIONAL_SYNTAX_CHECKS_GROUP_100_LENGTH;
		}

}
  
