package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse211aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse211aT extends Wse211aTSerialized { 
   

						private char[] wse211aTFld1 = Field.fillLowValue(30);

						private char[] wse211aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse211aT
	**/
    public Wse211aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse211aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse211aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse211aTFld1
	 *	@return wse211aTFld1
	 */
   public char[] getWse211aTFld1() throws CFException{
     if (isWse211aTFld1Modified()) { 
        wse211aTFld1 = refreshWse211aTFld1();
     }
   		return wse211aTFld1;
   }

  
	/**
	*  set variable wse211aTFld1
	*  Corresponding COBOL Variable is WSE-2-11A-T-FLD1
	*  @param value
	**/
   public void setWse211aTFld1(char[] value) {
      wse211aTFld1 = checkWse211aTFld1Constraints(value);
      serializeWse211aTFld1(wse211aTFld1);
   } 

     /**
	 * 	Update Wse211aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse211aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse211aTFld1,wse211aTFld1.length);
   	
   }
   
   public void setWse211aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aTFld1,wse211aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse211aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse211aTFld1 with another Field
	 *	@param value
	 */
   public void setWse211aTFld1(Field source) {
       replace(source,0,source.length(),beginWse211aTFld1,WSE_211A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse211aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse211aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse211aTFld1,WSE_211A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse211aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse211aTFld2
	 *	@return wse211aTFld2
	 */
   public char[] getWse211aTFld2() throws CFException{
     if (isWse211aTFld2Modified()) { 
        wse211aTFld2 = refreshWse211aTFld2();
     }
   		return wse211aTFld2;
   }

  
	/**
	*  set variable wse211aTFld2
	*  Corresponding COBOL Variable is WSE-2-11A-T-FLD2
	*  @param value
	**/
   public void setWse211aTFld2(char[] value) {
      wse211aTFld2 = checkWse211aTFld2Constraints(value);
      serializeWse211aTFld2(wse211aTFld2);
   } 

     /**
	 * 	Update Wse211aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse211aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse211aTFld2,wse211aTFld2.length);
   	
   }
   
   public void setWse211aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aTFld2,wse211aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse211aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse211aTFld2 with another Field
	 *	@param value
	 */
   public void setWse211aTFld2(Field source) {
       replace(source,0,source.length(),beginWse211aTFld2,WSE_211A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse211aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse211aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse211aTFld2,WSE_211A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse211aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse211aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse211aTFld1(CONSTANTS.SPACE_30);
         setWse211aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse211aTFieldLength() {
			return WSE_211A_T_LENGTH;
		}

}
  
