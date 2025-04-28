package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse217aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:57. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse217aT extends Wse217aTSerialized { 
   

						private char[] wse217aTFld1 = Field.fillLowValue(30);

						private char[] wse217aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse217aT
	**/
    public Wse217aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse217aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse217aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse217aTFld1
	 *	@return wse217aTFld1
	 */
   public char[] getWse217aTFld1() throws CFException{
     if (isWse217aTFld1Modified()) { 
        wse217aTFld1 = refreshWse217aTFld1();
     }
   		return wse217aTFld1;
   }

  
	/**
	*  set variable wse217aTFld1
	*  Corresponding COBOL Variable is WSE-2-17A-T-FLD1
	*  @param value
	**/
   public void setWse217aTFld1(char[] value) {
      wse217aTFld1 = checkWse217aTFld1Constraints(value);
      serializeWse217aTFld1(wse217aTFld1);
   } 

     /**
	 * 	Update Wse217aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217aTFld1,wse217aTFld1.length);
   	
   }
   
   public void setWse217aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aTFld1,wse217aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse217aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217aTFld1 with another Field
	 *	@param value
	 */
   public void setWse217aTFld1(Field source) {
       replace(source,0,source.length(),beginWse217aTFld1,WSE_217A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217aTFld1,WSE_217A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse217aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse217aTFld2
	 *	@return wse217aTFld2
	 */
   public char[] getWse217aTFld2() throws CFException{
     if (isWse217aTFld2Modified()) { 
        wse217aTFld2 = refreshWse217aTFld2();
     }
   		return wse217aTFld2;
   }

  
	/**
	*  set variable wse217aTFld2
	*  Corresponding COBOL Variable is WSE-2-17A-T-FLD2
	*  @param value
	**/
   public void setWse217aTFld2(char[] value) {
      wse217aTFld2 = checkWse217aTFld2Constraints(value);
      serializeWse217aTFld2(wse217aTFld2);
   } 

     /**
	 * 	Update Wse217aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217aTFld2,wse217aTFld2.length);
   	
   }
   
   public void setWse217aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aTFld2,wse217aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse217aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217aTFld2 with another Field
	 *	@param value
	 */
   public void setWse217aTFld2(Field source) {
       replace(source,0,source.length(),beginWse217aTFld2,WSE_217A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217aTFld2,WSE_217A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse217aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse217aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse217aTFld1(CONSTANTS.SPACE_30);
         setWse217aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse217aTFieldLength() {
			return WSE_217A_T_LENGTH;
		}

}
  
