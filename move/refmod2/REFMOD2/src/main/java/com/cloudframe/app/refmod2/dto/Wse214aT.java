package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse214aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse214aT extends Wse214aTSerialized { 
   

						private char[] wse214aTFld1 = Field.fillLowValue(30);

						private char[] wse214aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse214aT
	**/
    public Wse214aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse214aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse214aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse214aTFld1
	 *	@return wse214aTFld1
	 */
   public char[] getWse214aTFld1() throws CFException{
     if (isWse214aTFld1Modified()) { 
        wse214aTFld1 = refreshWse214aTFld1();
     }
   		return wse214aTFld1;
   }

  
	/**
	*  set variable wse214aTFld1
	*  Corresponding COBOL Variable is WSE-2-14A-T-FLD1
	*  @param value
	**/
   public void setWse214aTFld1(char[] value) {
      wse214aTFld1 = checkWse214aTFld1Constraints(value);
      serializeWse214aTFld1(wse214aTFld1);
   } 

     /**
	 * 	Update Wse214aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214aTFld1,wse214aTFld1.length);
   	
   }
   
   public void setWse214aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aTFld1,wse214aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse214aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214aTFld1 with another Field
	 *	@param value
	 */
   public void setWse214aTFld1(Field source) {
       replace(source,0,source.length(),beginWse214aTFld1,WSE_214A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214aTFld1,WSE_214A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse214aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse214aTFld2
	 *	@return wse214aTFld2
	 */
   public char[] getWse214aTFld2() throws CFException{
     if (isWse214aTFld2Modified()) { 
        wse214aTFld2 = refreshWse214aTFld2();
     }
   		return wse214aTFld2;
   }

  
	/**
	*  set variable wse214aTFld2
	*  Corresponding COBOL Variable is WSE-2-14A-T-FLD2
	*  @param value
	**/
   public void setWse214aTFld2(char[] value) {
      wse214aTFld2 = checkWse214aTFld2Constraints(value);
      serializeWse214aTFld2(wse214aTFld2);
   } 

     /**
	 * 	Update Wse214aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse214aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse214aTFld2,wse214aTFld2.length);
   	
   }
   
   public void setWse214aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aTFld2,wse214aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse214aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse214aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse214aTFld2 with another Field
	 *	@param value
	 */
   public void setWse214aTFld2(Field source) {
       replace(source,0,source.length(),beginWse214aTFld2,WSE_214A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse214aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse214aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse214aTFld2,WSE_214A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse214aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse214aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse214aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse214aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse214aTFld1(CONSTANTS.SPACE_30);
         setWse214aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse214aTFieldLength() {
			return WSE_214A_T_LENGTH;
		}

}
  
