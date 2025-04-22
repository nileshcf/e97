package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse28aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse28aT extends Wse28aTSerialized { 
   

						private char[] wse28aTFld1 = Field.fillLowValue(30);

						private char[] wse28aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse28aT
	**/
    public Wse28aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse28aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse28aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse28aTFld1
	 *	@return wse28aTFld1
	 */
   public char[] getWse28aTFld1() throws CFException{
     if (isWse28aTFld1Modified()) { 
        wse28aTFld1 = refreshWse28aTFld1();
     }
   		return wse28aTFld1;
   }

  
	/**
	*  set variable wse28aTFld1
	*  Corresponding COBOL Variable is WSE-2-8A-T-FLD1
	*  @param value
	**/
   public void setWse28aTFld1(char[] value) {
      wse28aTFld1 = checkWse28aTFld1Constraints(value);
      serializeWse28aTFld1(wse28aTFld1);
   } 

     /**
	 * 	Update Wse28aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse28aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse28aTFld1,wse28aTFld1.length);
   	
   }
   
   public void setWse28aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse28aTFld1,wse28aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse28aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse28aTFld1 with another Field
	 *	@param value
	 */
   public void setWse28aTFld1(Field source) {
       replace(source,0,source.length(),beginWse28aTFld1,WSE_28A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse28aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse28aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse28aTFld1,WSE_28A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse28aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse28aTFld2
	 *	@return wse28aTFld2
	 */
   public char[] getWse28aTFld2() throws CFException{
     if (isWse28aTFld2Modified()) { 
        wse28aTFld2 = refreshWse28aTFld2();
     }
   		return wse28aTFld2;
   }

  
	/**
	*  set variable wse28aTFld2
	*  Corresponding COBOL Variable is WSE-2-8A-T-FLD2
	*  @param value
	**/
   public void setWse28aTFld2(char[] value) {
      wse28aTFld2 = checkWse28aTFld2Constraints(value);
      serializeWse28aTFld2(wse28aTFld2);
   } 

     /**
	 * 	Update Wse28aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse28aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse28aTFld2,wse28aTFld2.length);
   	
   }
   
   public void setWse28aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse28aTFld2,wse28aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse28aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse28aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse28aTFld2 with another Field
	 *	@param value
	 */
   public void setWse28aTFld2(Field source) {
       replace(source,0,source.length(),beginWse28aTFld2,WSE_28A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse28aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse28aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse28aTFld2,WSE_28A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse28aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse28aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse28aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse28aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse28aTFld1(CONSTANTS.SPACE_30);
         setWse28aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse28aTFieldLength() {
			return WSE_28A_T_LENGTH;
		}

}
  
