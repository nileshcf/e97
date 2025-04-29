package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583Filler1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Si583Filler1 extends Si583Filler1Serialized { 
   

						private char[] si583DePresentInd1 = Field.fillLowValue(1);

								private short si583DeStartingPos1;

								private short si583DeLength1;
	
	/**
	* Constructor for Si583Filler1
	**/
    public Si583Filler1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si583Filler1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583Filler1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of si583DePresentInd1
	 *	@return si583DePresentInd1
	 */
   public char[] getSi583DePresentInd1() throws CFException{
     if (isSi583DePresentInd1Modified()) { 
        si583DePresentInd1 = refreshSi583DePresentInd1();
     }
   		return si583DePresentInd1;
   }

  
	/**
	*  set variable si583DePresentInd1
	*  Corresponding COBOL Variable is SI583-DE-PRESENT-IND-1
	*  @param value
	**/
   public void setSi583DePresentInd1(char[] value) {
      si583DePresentInd1 = checkSi583DePresentInd1Constraints(value);
      serializeSi583DePresentInd1(si583DePresentInd1);
   } 

     /**
	 * 	Update Si583DePresentInd1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583DePresentInd1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi583DePresentInd1,si583DePresentInd1.length);
   	
   }
   
   public void setSi583DePresentInd1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi583DePresentInd1,si583DePresentInd1.length);
   	
   }
   
     /**
	 * 	Update Si583DePresentInd1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DePresentInd1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583DePresentInd1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si583DePresentInd1 with another Field
	 *	@param value
	 */
   public void setSi583DePresentInd1(Field source) {
       replace(source,0,source.length(),beginSi583DePresentInd1,SI_583_DE_PRESENT_IND_1_LEN);
   	
   }  
   
     /**
	 * 	Update Si583DePresentInd1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583DePresentInd1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi583DePresentInd1,SI_583_DE_PRESENT_IND_1_LEN);
   	
   }
   
     /**
	 * 	Update Si583DePresentInd1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DePresentInd1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583DePresentInd1+targetIndex,targetLen);
    
   }
	char[] si583DePresent18888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isSi583DePresent188()
	 *	@return  Returns true if isSi583DePresent188() is "1"
	 */
   public boolean isSi583DePresent188() throws CFException {
      return (  compareChars( getSi583DePresentInd1() , si583DePresent18888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setSi583DePresent188True() {  			
    	setSi583DePresentInd1( si583DePresent18888Value);
   	}
	char[] si583DeNotPresent18888Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isSi583DeNotPresent188()
	 *	@return  Returns true if isSi583DeNotPresent188() is "0"
	 */
   public boolean isSi583DeNotPresent188() throws CFException {
      return (  compareChars( getSi583DePresentInd1() , si583DeNotPresent18888Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setSi583DeNotPresent188True() {  			
    	setSi583DePresentInd1( si583DeNotPresent18888Value);
   	}
	/**
	 *	Returns the value of si583DeStartingPos1
	 *	@return si583DeStartingPos1
	 */
	public short getSi583DeStartingPos1() throws CFException {
        if (isSi583DeStartingPos1Modified()) { 
           si583DeStartingPos1 = refreshSi583DeStartingPos1();
        }
   		return si583DeStartingPos1;
	}
	
	/**
	 * 	Update Si583DeStartingPos1 with the passed value
	 *  Corresponding COBOL Variable is SI583-DE-STARTING-POS-1
	 *	@param number
	 */
	public void setSi583DeStartingPos1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DeStartingPos1 = checkSi583DeStartingPos1MaxLimit(number); 
		serializeSi583DeStartingPos1(si583DeStartingPos1);
	}

	public void setSi583DeStartingPos1(int number) {
	    number = checkSi583DeStartingPos1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeStartingPos1((short)number);
	}
	public void setSi583DeStartingPos1(long number) {
	    number = checkSi583DeStartingPos1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeStartingPos1((short)number);
	}
	

	/**
	 *	Returns the value of si583DeLength1
	 *	@return si583DeLength1
	 */
	public short getSi583DeLength1() throws CFException {
        if (isSi583DeLength1Modified()) { 
           si583DeLength1 = refreshSi583DeLength1();
        }
   		return si583DeLength1;
	}
	
	/**
	 * 	Update Si583DeLength1 with the passed value
	 *  Corresponding COBOL Variable is SI583-DE-LENGTH-1
	 *	@param number
	 */
	public void setSi583DeLength1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DeLength1 = checkSi583DeLength1MaxLimit(number); 
		serializeSi583DeLength1(si583DeLength1);
	}

	public void setSi583DeLength1(int number) {
	    number = checkSi583DeLength1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeLength1((short)number);
	}
	public void setSi583DeLength1(long number) {
	    number = checkSi583DeLength1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeLength1((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Si583Filler1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSi583DePresentInd1(CONSTANTS.SPACE);
         	setSi583DeStartingPos1((short)0);
         	setSi583DeLength1((short)0);
   }

		public static int getSi583Filler1FieldLength() {
			return SI_583_FILLER_1_LENGTH;
		}

}
  
