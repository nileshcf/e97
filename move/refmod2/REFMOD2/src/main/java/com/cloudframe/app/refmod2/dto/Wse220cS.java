package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse220cS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse220cS extends Wse220cSSerialized { 
   

						private char[] wse220cSFld1 = Field.fillLowValue(10);

						private char[] wse220cSFld2 = Field.fillLowValue(20);

						private char[] wse220cSFld3 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse220cS
	**/
    public Wse220cS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse220cS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse220cS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse220cSFld1
	 *	@return wse220cSFld1
	 */
   public char[] getWse220cSFld1() throws CFException{
     if (isWse220cSFld1Modified()) { 
        wse220cSFld1 = refreshWse220cSFld1();
     }
   		return wse220cSFld1;
   }

  
	/**
	*  set variable wse220cSFld1
	*  Corresponding COBOL Variable is WSE-2-20C-S-FLD1
	*  @param value
	**/
   public void setWse220cSFld1(char[] value) {
      wse220cSFld1 = checkWse220cSFld1Constraints(value);
      serializeWse220cSFld1(wse220cSFld1);
   } 

     /**
	 * 	Update Wse220cSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220cSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220cSFld1,wse220cSFld1.length);
   	
   }
   
   public void setWse220cSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld1,wse220cSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse220cSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220cSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220cSFld1 with another Field
	 *	@param value
	 */
   public void setWse220cSFld1(Field source) {
       replace(source,0,source.length(),beginWse220cSFld1,WSE_220C_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220cSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220cSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220cSFld1,WSE_220C_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse220cSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220cSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse220cSFld2
	 *	@return wse220cSFld2
	 */
   public char[] getWse220cSFld2() throws CFException{
     if (isWse220cSFld2Modified()) { 
        wse220cSFld2 = refreshWse220cSFld2();
     }
   		return wse220cSFld2;
   }

  
	/**
	*  set variable wse220cSFld2
	*  Corresponding COBOL Variable is WSE-2-20C-S-FLD2
	*  @param value
	**/
   public void setWse220cSFld2(char[] value) {
      wse220cSFld2 = checkWse220cSFld2Constraints(value);
      serializeWse220cSFld2(wse220cSFld2);
   } 

     /**
	 * 	Update Wse220cSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220cSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220cSFld2,wse220cSFld2.length);
   	
   }
   
   public void setWse220cSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld2,wse220cSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse220cSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220cSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220cSFld2 with another Field
	 *	@param value
	 */
   public void setWse220cSFld2(Field source) {
       replace(source,0,source.length(),beginWse220cSFld2,WSE_220C_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220cSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220cSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220cSFld2,WSE_220C_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse220cSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220cSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse220cSFld3
	 *	@return wse220cSFld3
	 */
   public char[] getWse220cSFld3() throws CFException{
     if (isWse220cSFld3Modified()) { 
        wse220cSFld3 = refreshWse220cSFld3();
     }
   		return wse220cSFld3;
   }

  
	/**
	*  set variable wse220cSFld3
	*  Corresponding COBOL Variable is WSE-2-20C-S-FLD3
	*  @param value
	**/
   public void setWse220cSFld3(char[] value) {
      wse220cSFld3 = checkWse220cSFld3Constraints(value);
      serializeWse220cSFld3(wse220cSFld3);
   } 

     /**
	 * 	Update Wse220cSFld3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse220cSFld3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse220cSFld3,wse220cSFld3.length);
   	
   }
   
   public void setWse220cSFld3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld3,wse220cSFld3.length);
   	
   }
   
     /**
	 * 	Update Wse220cSFld3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse220cSFld3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse220cSFld3 with another Field
	 *	@param value
	 */
   public void setWse220cSFld3(Field source) {
       replace(source,0,source.length(),beginWse220cSFld3,WSE_220C_SFLD_3_LEN);
   	
   }  
   
     /**
	 * 	Update Wse220cSFld3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse220cSFld3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse220cSFld3,WSE_220C_SFLD_3_LEN);
   	
   }
   
     /**
	 * 	Update Wse220cSFld3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse220cSFld3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse220cSFld3+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse220cS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse220cSFld1(CONSTANTS.SPACE_10);
         setWse220cSFld2(CONSTANTS.SPACE_20);
         setWse220cSFld3(CONSTANTS.SPACE_30);
   }

		public static int getWse220cSFieldLength() {
			return WSE_220C_S_LENGTH;
		}

}
  
