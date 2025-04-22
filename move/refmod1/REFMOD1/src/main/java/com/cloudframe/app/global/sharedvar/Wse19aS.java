package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse19aS")

public class Wse19aS extends Wse19aSSerialized  implements InitializingBean {
   

						private char[] wse19aSFld1 = Field.fillLowValue(30);

						private char[] wse19aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse19aS
	**/
    public Wse19aS() {
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
	 *	Returns the value of wse19aSFld1
	 *	@return wse19aSFld1
	 */
   public char[] getWse19aSFld1() throws CFException{
     if (isWse19aSFld1Modified()) { 
        wse19aSFld1 = refreshWse19aSFld1();
     }
   		return wse19aSFld1;
   }

  
	/**
	*  set variable wse19aSFld1
	*  Corresponding COBOL Variable is WSE-19A-S-FLD1
	*  @param value
	**/
   public void setWse19aSFld1(char[] value) {
      wse19aSFld1 = checkWse19aSFld1Constraints(value);
      serializeWse19aSFld1(wse19aSFld1);
   } 

     /**
	 * 	Update Wse19aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19aSFld1,wse19aSFld1.length);
   	
   }
   
   public void setWse19aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aSFld1,wse19aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse19aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19aSFld1 with another Field
	 *	@param value
	 */
   public void setWse19aSFld1(Field source) {
       replace(source,0,source.length(),beginWse19aSFld1,WSE_19A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19aSFld1,WSE_19A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse19aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse19aSFld2
	 *	@return wse19aSFld2
	 */
   public char[] getWse19aSFld2() throws CFException{
     if (isWse19aSFld2Modified()) { 
        wse19aSFld2 = refreshWse19aSFld2();
     }
   		return wse19aSFld2;
   }

  
	/**
	*  set variable wse19aSFld2
	*  Corresponding COBOL Variable is WSE-19A-S-FLD2
	*  @param value
	**/
   public void setWse19aSFld2(char[] value) {
      wse19aSFld2 = checkWse19aSFld2Constraints(value);
      serializeWse19aSFld2(wse19aSFld2);
   } 

     /**
	 * 	Update Wse19aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19aSFld2,wse19aSFld2.length);
   	
   }
   
   public void setWse19aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aSFld2,wse19aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse19aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19aSFld2 with another Field
	 *	@param value
	 */
   public void setWse19aSFld2(Field source) {
       replace(source,0,source.length(),beginWse19aSFld2,WSE_19A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19aSFld2,WSE_19A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse19aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse19aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse19aSFld1(CONSTANTS.SPACE_30);
         setWse19aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse19aSFieldLength() {
			return WSE_19A_S_LENGTH;
		}

}
  
