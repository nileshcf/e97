package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse27aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse27aT extends Wse27aTSerialized { 
   

						private char[] wse27aTFld1 = Field.fillLowValue(30);

						private char[] wse27aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse27aT
	**/
    public Wse27aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse27aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse27aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse27aTFld1
	 *	@return wse27aTFld1
	 */
   public char[] getWse27aTFld1() throws CFException{
     if (isWse27aTFld1Modified()) { 
        wse27aTFld1 = refreshWse27aTFld1();
     }
   		return wse27aTFld1;
   }

  
	/**
	*  set variable wse27aTFld1
	*  Corresponding COBOL Variable is WSE-2-7A-T-FLD1
	*  @param value
	**/
   public void setWse27aTFld1(char[] value) {
      wse27aTFld1 = checkWse27aTFld1Constraints(value);
      serializeWse27aTFld1(wse27aTFld1);
   } 

     /**
	 * 	Update Wse27aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27aTFld1,wse27aTFld1.length);
   	
   }
   
   public void setWse27aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aTFld1,wse27aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse27aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27aTFld1 with another Field
	 *	@param value
	 */
   public void setWse27aTFld1(Field source) {
       replace(source,0,source.length(),beginWse27aTFld1,WSE_27A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27aTFld1,WSE_27A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse27aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse27aTFld2
	 *	@return wse27aTFld2
	 */
   public char[] getWse27aTFld2() throws CFException{
     if (isWse27aTFld2Modified()) { 
        wse27aTFld2 = refreshWse27aTFld2();
     }
   		return wse27aTFld2;
   }

  
	/**
	*  set variable wse27aTFld2
	*  Corresponding COBOL Variable is WSE-2-7A-T-FLD2
	*  @param value
	**/
   public void setWse27aTFld2(char[] value) {
      wse27aTFld2 = checkWse27aTFld2Constraints(value);
      serializeWse27aTFld2(wse27aTFld2);
   } 

     /**
	 * 	Update Wse27aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse27aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse27aTFld2,wse27aTFld2.length);
   	
   }
   
   public void setWse27aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aTFld2,wse27aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse27aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse27aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse27aTFld2 with another Field
	 *	@param value
	 */
   public void setWse27aTFld2(Field source) {
       replace(source,0,source.length(),beginWse27aTFld2,WSE_27A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse27aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse27aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse27aTFld2,WSE_27A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse27aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse27aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse27aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse27aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse27aTFld1(CONSTANTS.SPACE_30);
         setWse27aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse27aTFieldLength() {
			return WSE_27A_T_LENGTH;
		}

}
  
