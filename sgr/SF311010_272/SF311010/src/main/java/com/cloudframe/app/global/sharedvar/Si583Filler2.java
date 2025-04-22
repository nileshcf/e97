package com.cloudframe.app.global.sharedvar;

/**
*  The class Si583Filler2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Si583Filler2 extends Si583Filler2Serialized { 
   

						private char[] si583DePresentInd2 = Field.fillLowValue(1);

								private short si583DeStartingPos2;

								private short si583DeLength2;
	
	/**
	* Constructor for Si583Filler2
	**/
    public Si583Filler2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Si583Filler2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Si583Filler2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of si583DePresentInd2
	 *	@return si583DePresentInd2
	 */
   public char[] getSi583DePresentInd2() throws CFException{
     if (isSi583DePresentInd2Modified()) { 
        si583DePresentInd2 = refreshSi583DePresentInd2();
     }
   		return si583DePresentInd2;
   }

  
	/**
	*  set variable si583DePresentInd2
	*  Corresponding COBOL Variable is SI583-DE-PRESENT-IND-2
	*  @param value
	**/
   public void setSi583DePresentInd2(char[] value) {
      si583DePresentInd2 = checkSi583DePresentInd2Constraints(value);
      serializeSi583DePresentInd2(si583DePresentInd2);
   } 

     /**
	 * 	Update Si583DePresentInd2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSi583DePresentInd2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSi583DePresentInd2,si583DePresentInd2.length);
   	
   }
   
   public void setSi583DePresentInd2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSi583DePresentInd2,si583DePresentInd2.length);
   	
   }
   
     /**
	 * 	Update Si583DePresentInd2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSi583DePresentInd2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583DePresentInd2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Si583DePresentInd2 with another Field
	 *	@param value
	 */
   public void setSi583DePresentInd2(Field source) {
       replace(source,0,source.length(),beginSi583DePresentInd2,SI_583_DE_PRESENT_IND_2_LEN);
   	
   }  
   
     /**
	 * 	Update Si583DePresentInd2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSi583DePresentInd2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSi583DePresentInd2,SI_583_DE_PRESENT_IND_2_LEN);
   	
   }
   
     /**
	 * 	Update Si583DePresentInd2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSi583DePresentInd2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSi583DePresentInd2+targetIndex,targetLen);
    
   }
	char[] si583DePresent28888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isSi583DePresent288()
	 *	@return  Returns true if isSi583DePresent288() is "1"
	 */
   public boolean isSi583DePresent288() throws CFException {
      return (  compareChars( getSi583DePresentInd2() , si583DePresent28888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setSi583DePresent288True() {  			
    	setSi583DePresentInd2( si583DePresent28888Value);
   	}
	char[] si583DeNotPresent28888Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isSi583DeNotPresent288()
	 *	@return  Returns true if isSi583DeNotPresent288() is "0"
	 */
   public boolean isSi583DeNotPresent288() throws CFException {
      return (  compareChars( getSi583DePresentInd2() , si583DeNotPresent28888Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setSi583DeNotPresent288True() {  			
    	setSi583DePresentInd2( si583DeNotPresent28888Value);
   	}
	/**
	 *	Returns the value of si583DeStartingPos2
	 *	@return si583DeStartingPos2
	 */
	public short getSi583DeStartingPos2() throws CFException {
        if (isSi583DeStartingPos2Modified()) { 
           si583DeStartingPos2 = refreshSi583DeStartingPos2();
        }
   		return si583DeStartingPos2;
	}
	
	/**
	 * 	Update Si583DeStartingPos2 with the passed value
	 *  Corresponding COBOL Variable is SI583-DE-STARTING-POS-2
	 *	@param number
	 */
	public void setSi583DeStartingPos2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DeStartingPos2 = checkSi583DeStartingPos2MaxLimit(number); 
		serializeSi583DeStartingPos2(si583DeStartingPos2);
	}

	public void setSi583DeStartingPos2(int number) {
	    number = checkSi583DeStartingPos2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeStartingPos2((short)number);
	}
	public void setSi583DeStartingPos2(long number) {
	    number = checkSi583DeStartingPos2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeStartingPos2((short)number);
	}
	

	/**
	 *	Returns the value of si583DeLength2
	 *	@return si583DeLength2
	 */
	public short getSi583DeLength2() throws CFException {
        if (isSi583DeLength2Modified()) { 
           si583DeLength2 = refreshSi583DeLength2();
        }
   		return si583DeLength2;
	}
	
	/**
	 * 	Update Si583DeLength2 with the passed value
	 *  Corresponding COBOL Variable is SI583-DE-LENGTH-2
	 *	@param number
	 */
	public void setSi583DeLength2(short number) {
	     // Truncate if the number is beyond +/- Max range
	    si583DeLength2 = checkSi583DeLength2MaxLimit(number); 
		serializeSi583DeLength2(si583DeLength2);
	}

	public void setSi583DeLength2(int number) {
	    number = checkSi583DeLength2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeLength2((short)number);
	}
	public void setSi583DeLength2(long number) {
	    number = checkSi583DeLength2MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSi583DeLength2((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Si583Filler2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setSi583DePresentInd2(CONSTANTS.SPACE);
         	setSi583DeStartingPos2((short)0);
         	setSi583DeLength2((short)0);
   }

		public static int getSi583Filler2FieldLength() {
			return SI_583_FILLER_2_LENGTH;
		}

}
  
