package com.cloudframe.app.global.sharedvar;

/**
*  The class IsIndiaAcctRngGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_isIndiaAcctRngGroup100")

public class IsIndiaAcctRngGroup100 extends IsIndiaAcctRngGroup100Serialized  implements InitializingBean {
   

						private char[] isIndiaAcctRng100 = Field.fillLowValue(1);
	
	/**
	* Constructor for IsIndiaAcctRngGroup100
	**/
    public IsIndiaAcctRngGroup100() {
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
	 *	Returns the value of isIndiaAcctRng100
	 *	@return isIndiaAcctRng100
	 */
   public char[] getIsIndiaAcctRng100() throws CFException{
     if (isIsIndiaAcctRng100Modified()) { 
        isIndiaAcctRng100 = refreshIsIndiaAcctRng100();
     }
   		return isIndiaAcctRng100;
   }

  
	/**
	*  set variable isIndiaAcctRng100
	*  Corresponding COBOL Variable is 100-IS-INDIA-ACCT-RNG
	*  @param value
	**/
   public void setIsIndiaAcctRng100(char[] value) {
      isIndiaAcctRng100 = checkIsIndiaAcctRng100Constraints(value);
      serializeIsIndiaAcctRng100(isIndiaAcctRng100);
   } 

     /**
	 * 	Update IsIndiaAcctRng100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIsIndiaAcctRng100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIsIndiaAcctRng100,isIndiaAcctRng100.length);
   	
   }
   
   public void setIsIndiaAcctRng100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIsIndiaAcctRng100,isIndiaAcctRng100.length);
   	
   }
   
     /**
	 * 	Update IsIndiaAcctRng100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIsIndiaAcctRng100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsIndiaAcctRng100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IsIndiaAcctRng100 with another Field
	 *	@param value
	 */
   public void setIsIndiaAcctRng100(Field source) {
       replace(source,0,source.length(),beginIsIndiaAcctRng100,IS_INDIA_ACCT_RNG_100_LEN);
   	
   }  
   
     /**
	 * 	Update IsIndiaAcctRng100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIsIndiaAcctRng100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIsIndiaAcctRng100,IS_INDIA_ACCT_RNG_100_LEN);
   	
   }
   
     /**
	 * 	Update IsIndiaAcctRng100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIsIndiaAcctRng100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIsIndiaAcctRng100+targetIndex,targetLen);
    
   }
	char[] accRngIndiaY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isAccRngIndiaY88100()
	 *	@return  Returns true if isAccRngIndiaY88100() is "Y"
	 */
   public boolean isAccRngIndiaY88100() throws CFException {
      return (  compareChars( getIsIndiaAcctRng100() , accRngIndiaY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setAccRngIndiaY88100True() {  			
    	setIsIndiaAcctRng100( accRngIndiaY8810088Value);
   	}
	char[] accRngIndiaN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAccRngIndiaN88100()
	 *	@return  Returns true if isAccRngIndiaN88100() is "N"
	 */
   public boolean isAccRngIndiaN88100() throws CFException {
      return (  compareChars( getIsIndiaAcctRng100() , accRngIndiaN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAccRngIndiaN88100True() {  			
    	setIsIndiaAcctRng100( accRngIndiaN8810088Value);
   	}

	
	
	

		public static int getIsIndiaAcctRngGroup100FieldLength() {
			return IS_INDIA_ACCT_RNG_GROUP_100_LENGTH;
		}

}
  
