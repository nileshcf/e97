package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19bS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse19bS")

public class Wse19bS extends Wse19bSSerialized  implements InitializingBean {
   

						private char[] wse19bSFld1 = Field.fillLowValue(30);

						private char[] wse19bSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse19bS
	**/
    public Wse19bS() {
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
	 *	Returns the value of wse19bSFld1
	 *	@return wse19bSFld1
	 */
   public char[] getWse19bSFld1() throws CFException{
     if (isWse19bSFld1Modified()) { 
        wse19bSFld1 = refreshWse19bSFld1();
     }
   		return wse19bSFld1;
   }

  
	/**
	*  set variable wse19bSFld1
	*  Corresponding COBOL Variable is WSE-19B-S-FLD1
	*  @param value
	**/
   public void setWse19bSFld1(char[] value) {
      wse19bSFld1 = checkWse19bSFld1Constraints(value);
      serializeWse19bSFld1(wse19bSFld1);
   } 

     /**
	 * 	Update Wse19bSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19bSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19bSFld1,wse19bSFld1.length);
   	
   }
   
   public void setWse19bSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bSFld1,wse19bSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse19bSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19bSFld1 with another Field
	 *	@param value
	 */
   public void setWse19bSFld1(Field source) {
       replace(source,0,source.length(),beginWse19bSFld1,WSE_19B_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19bSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19bSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19bSFld1,WSE_19B_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse19bSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19bSFld2
	 *	@return wse19bSFld2
	 */
   public char[] getWse19bSFld2() throws CFException{
     if (isWse19bSFld2Modified()) { 
        wse19bSFld2 = refreshWse19bSFld2();
     }
   		return wse19bSFld2;
   }

  
	/**
	*  set variable wse19bSFld2
	*  Corresponding COBOL Variable is WSE-19B-S-FLD2
	*  @param value
	**/
   public void setWse19bSFld2(char[] value) {
      wse19bSFld2 = checkWse19bSFld2Constraints(value);
      serializeWse19bSFld2(wse19bSFld2);
   } 

     /**
	 * 	Update Wse19bSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19bSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19bSFld2,wse19bSFld2.length);
   	
   }
   
   public void setWse19bSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bSFld2,wse19bSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse19bSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19bSFld2 with another Field
	 *	@param value
	 */
   public void setWse19bSFld2(Field source) {
       replace(source,0,source.length(),beginWse19bSFld2,WSE_19B_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19bSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19bSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19bSFld2,WSE_19B_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse19bSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse19bS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse19bSFld1(CONSTANTS.SPACE_30);
         setWse19bSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse19bSFieldLength() {
			return WSE_19B_S_LENGTH;
		}

}
  
