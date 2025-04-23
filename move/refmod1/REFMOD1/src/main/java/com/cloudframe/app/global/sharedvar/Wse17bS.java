package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse17bS")

public class Wse17bS extends Wse17bSSerialized  implements InitializingBean {
   

						private char[] wse17bSFld1 = Field.fillLowValue(30);

						private char[] wse17bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse17bS
	**/
    public Wse17bS() {
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
	 *	Returns the value of wse17bSFld1
	 *	@return wse17bSFld1
	 */
   public char[] getWse17bSFld1() throws CFException{
     if (isWse17bSFld1Modified()) { 
        wse17bSFld1 = refreshWse17bSFld1();
     }
   		return wse17bSFld1;
   }

  
	/**
	*  set variable wse17bSFld1
	*  Corresponding COBOL Variable is WSE-17B-S-FLD1
	*  @param value
	**/
   public void setWse17bSFld1(char[] value) {
      wse17bSFld1 = checkWse17bSFld1Constraints(value);
      serializeWse17bSFld1(wse17bSFld1);
   } 

     /**
	 * 	Update Wse17bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17bSFld1,wse17bSFld1.length);
   	
   }
   
   public void setWse17bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bSFld1,wse17bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse17bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17bSFld1 with another Field
	 *	@param value
	 */
   public void setWse17bSFld1(Field source) {
       replace(source,0,source.length(),beginWse17bSFld1,WSE_17B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17bSFld1,WSE_17B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse17bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse17bSFld2
	 *	@return wse17bSFld2
	 */
   public char[] getWse17bSFld2() throws CFException{
     if (isWse17bSFld2Modified()) { 
        wse17bSFld2 = refreshWse17bSFld2();
     }
   		return wse17bSFld2;
   }

  
	/**
	*  set variable wse17bSFld2
	*  Corresponding COBOL Variable is WSE-17B-S-FLD2
	*  @param value
	**/
   public void setWse17bSFld2(char[] value) {
      wse17bSFld2 = checkWse17bSFld2Constraints(value);
      serializeWse17bSFld2(wse17bSFld2);
   } 

     /**
	 * 	Update Wse17bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17bSFld2,wse17bSFld2.length);
   	
   }
   
   public void setWse17bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bSFld2,wse17bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse17bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17bSFld2 with another Field
	 *	@param value
	 */
   public void setWse17bSFld2(Field source) {
       replace(source,0,source.length(),beginWse17bSFld2,WSE_17B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17bSFld2,WSE_17B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse17bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse17bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse17bSFld1(CONSTANTS.SPACE_30);
         setWse17bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse17bSFieldLength() {
			return WSE_17B_S_LENGTH;
		}

}
  
