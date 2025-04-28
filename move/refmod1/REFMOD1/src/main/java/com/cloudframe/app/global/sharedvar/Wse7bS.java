package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse7bS")

public class Wse7bS extends Wse7bSSerialized  implements InitializingBean {
   

						private char[] wse7bSFld1 = Field.fillLowValue(30);

						private char[] wse7bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse7bS
	**/
    public Wse7bS() {
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
	 *	Returns the value of wse7bSFld1
	 *	@return wse7bSFld1
	 */
   public char[] getWse7bSFld1() throws CFException{
     if (isWse7bSFld1Modified()) { 
        wse7bSFld1 = refreshWse7bSFld1();
     }
   		return wse7bSFld1;
   }

  
	/**
	*  set variable wse7bSFld1
	*  Corresponding COBOL Variable is WSE-7B-S-FLD1
	*  @param value
	**/
   public void setWse7bSFld1(char[] value) {
      wse7bSFld1 = checkWse7bSFld1Constraints(value);
      serializeWse7bSFld1(wse7bSFld1);
   } 

     /**
	 * 	Update Wse7bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7bSFld1,wse7bSFld1.length);
   	
   }
   
   public void setWse7bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bSFld1,wse7bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse7bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7bSFld1 with another Field
	 *	@param value
	 */
   public void setWse7bSFld1(Field source) {
       replace(source,0,source.length(),beginWse7bSFld1,WSE_7B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7bSFld1,WSE_7B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse7bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse7bSFld2
	 *	@return wse7bSFld2
	 */
   public char[] getWse7bSFld2() throws CFException{
     if (isWse7bSFld2Modified()) { 
        wse7bSFld2 = refreshWse7bSFld2();
     }
   		return wse7bSFld2;
   }

  
	/**
	*  set variable wse7bSFld2
	*  Corresponding COBOL Variable is WSE-7B-S-FLD2
	*  @param value
	**/
   public void setWse7bSFld2(char[] value) {
      wse7bSFld2 = checkWse7bSFld2Constraints(value);
      serializeWse7bSFld2(wse7bSFld2);
   } 

     /**
	 * 	Update Wse7bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7bSFld2,wse7bSFld2.length);
   	
   }
   
   public void setWse7bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bSFld2,wse7bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse7bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7bSFld2 with another Field
	 *	@param value
	 */
   public void setWse7bSFld2(Field source) {
       replace(source,0,source.length(),beginWse7bSFld2,WSE_7B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7bSFld2,WSE_7B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse7bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse7bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse7bSFld1(CONSTANTS.SPACE_30);
         setWse7bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse7bSFieldLength() {
			return WSE_7B_S_LENGTH;
		}

}
  
