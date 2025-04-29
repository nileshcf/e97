package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse3aT extends Wse3aTSerialized { 
   

						private char[] wse3aTFld1 = Field.fillLowValue(20);

						private char[] wse3aTFld2 = Field.fillLowValue(40);
	
	/**
	* Constructor for Wse3aT
	**/
    public Wse3aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse3aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse3aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse3aTFld1
	 *	@return wse3aTFld1
	 */
   public char[] getWse3aTFld1() throws CFException{
     if (isWse3aTFld1Modified()) { 
        wse3aTFld1 = refreshWse3aTFld1();
     }
   		return wse3aTFld1;
   }

  
	/**
	*  set variable wse3aTFld1
	*  Corresponding COBOL Variable is WSE-3A-T-FLD1
	*  @param value
	**/
   public void setWse3aTFld1(char[] value) {
      wse3aTFld1 = checkWse3aTFld1Constraints(value);
      serializeWse3aTFld1(wse3aTFld1);
   } 

     /**
	 * 	Update Wse3aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3aTFld1,wse3aTFld1.length);
   	
   }
   
   public void setWse3aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTFld1,wse3aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse3aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3aTFld1 with another Field
	 *	@param value
	 */
   public void setWse3aTFld1(Field source) {
       replace(source,0,source.length(),beginWse3aTFld1,WSE_3A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3aTFld1,WSE_3A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse3aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse3aTFld2
	 *	@return wse3aTFld2
	 */
   public char[] getWse3aTFld2() throws CFException{
     if (isWse3aTFld2Modified()) { 
        wse3aTFld2 = refreshWse3aTFld2();
     }
   		return wse3aTFld2;
   }

  
	/**
	*  set variable wse3aTFld2
	*  Corresponding COBOL Variable is WSE-3A-T-FLD2
	*  @param value
	**/
   public void setWse3aTFld2(char[] value) {
      wse3aTFld2 = checkWse3aTFld2Constraints(value);
      serializeWse3aTFld2(wse3aTFld2);
   } 

     /**
	 * 	Update Wse3aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3aTFld2,wse3aTFld2.length);
   	
   }
   
   public void setWse3aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTFld2,wse3aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse3aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3aTFld2 with another Field
	 *	@param value
	 */
   public void setWse3aTFld2(Field source) {
       replace(source,0,source.length(),beginWse3aTFld2,WSE_3A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3aTFld2,WSE_3A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse3aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse3aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse3aTFld1(CONSTANTS.SPACE_20);
         setWse3aTFld2(CONSTANTS.SPACE_40);
   }

		public static int getWse3aTFieldLength() {
			return WSE_3A_T_LENGTH;
		}

}
  
