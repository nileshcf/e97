package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse11aS")

public class Wse11aS extends Wse11aSSerialized  implements InitializingBean {
   

						private char[] wse11aSFld1 = Field.fillLowValue(30);

						private char[] wse11aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse11aS
	**/
    public Wse11aS() {
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
	 *	Returns the value of wse11aSFld1
	 *	@return wse11aSFld1
	 */
   public char[] getWse11aSFld1() throws CFException{
     if (isWse11aSFld1Modified()) { 
        wse11aSFld1 = refreshWse11aSFld1();
     }
   		return wse11aSFld1;
   }

  
	/**
	*  set variable wse11aSFld1
	*  Corresponding COBOL Variable is WSE-11A-S-FLD1
	*  @param value
	**/
   public void setWse11aSFld1(char[] value) {
      wse11aSFld1 = checkWse11aSFld1Constraints(value);
      serializeWse11aSFld1(wse11aSFld1);
   } 

     /**
	 * 	Update Wse11aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11aSFld1,wse11aSFld1.length);
   	
   }
   
   public void setWse11aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aSFld1,wse11aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse11aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11aSFld1 with another Field
	 *	@param value
	 */
   public void setWse11aSFld1(Field source) {
       replace(source,0,source.length(),beginWse11aSFld1,WSE_11A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11aSFld1,WSE_11A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse11aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse11aSFld2
	 *	@return wse11aSFld2
	 */
   public char[] getWse11aSFld2() throws CFException{
     if (isWse11aSFld2Modified()) { 
        wse11aSFld2 = refreshWse11aSFld2();
     }
   		return wse11aSFld2;
   }

  
	/**
	*  set variable wse11aSFld2
	*  Corresponding COBOL Variable is WSE-11A-S-FLD2
	*  @param value
	**/
   public void setWse11aSFld2(char[] value) {
      wse11aSFld2 = checkWse11aSFld2Constraints(value);
      serializeWse11aSFld2(wse11aSFld2);
   } 

     /**
	 * 	Update Wse11aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11aSFld2,wse11aSFld2.length);
   	
   }
   
   public void setWse11aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aSFld2,wse11aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse11aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11aSFld2 with another Field
	 *	@param value
	 */
   public void setWse11aSFld2(Field source) {
       replace(source,0,source.length(),beginWse11aSFld2,WSE_11A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11aSFld2,WSE_11A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse11aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse11aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse11aSFld1(CONSTANTS.SPACE_30);
         setWse11aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse11aSFieldLength() {
			return WSE_11A_S_LENGTH;
		}

}
  
