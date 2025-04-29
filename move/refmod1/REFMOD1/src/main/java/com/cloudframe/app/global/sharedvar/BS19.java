package com.cloudframe.app.global.sharedvar;

/**
*  The class BS19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bS19")

public class BS19 extends BS19Serialized  implements InitializingBean {
   

						private char[] bSFld119 = Field.fillLowValue(30);

						private char[] bSFld219 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS19
	**/
    public BS19() {
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
	 *	Returns the value of bSFld119
	 *	@return bSFld119
	 */
   public char[] getBSFld119() throws CFException{
     if (isBSFld119Modified()) { 
        bSFld119 = refreshBSFld119();
     }
   		return bSFld119;
   }

  
	/**
	*  set variable bSFld119
	*  Corresponding COBOL Variable is WS-19B-S-FLD1
	*  @param value
	**/
   public void setBSFld119(char[] value) {
      bSFld119 = checkBSFld119Constraints(value);
      serializeBSFld119(bSFld119);
   } 

     /**
	 * 	Update BSFld119 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld119(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld119,bSFld119.length);
   	
   }
   
   public void setBSFld119(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld119,bSFld119.length);
   	
   }
   
     /**
	 * 	Update BSFld119 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld119(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld119+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld119 with another Field
	 *	@param value
	 */
   public void setBSFld119(Field source) {
       replace(source,0,source.length(),beginBSFld119,B_SFLD_119_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld119 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld119(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld119,B_SFLD_119_LEN);
   	
   }
   
     /**
	 * 	Update BSFld119 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld119(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld119+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld219
	 *	@return bSFld219
	 */
   public char[] getBSFld219() throws CFException{
     if (isBSFld219Modified()) { 
        bSFld219 = refreshBSFld219();
     }
   		return bSFld219;
   }

  
	/**
	*  set variable bSFld219
	*  Corresponding COBOL Variable is WS-19B-S-FLD2
	*  @param value
	**/
   public void setBSFld219(char[] value) {
      bSFld219 = checkBSFld219Constraints(value);
      serializeBSFld219(bSFld219);
   } 

     /**
	 * 	Update BSFld219 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld219(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld219,bSFld219.length);
   	
   }
   
   public void setBSFld219(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld219,bSFld219.length);
   	
   }
   
     /**
	 * 	Update BSFld219 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld219(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld219+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld219 with another Field
	 *	@param value
	 */
   public void setBSFld219(Field source) {
       replace(source,0,source.length(),beginBSFld219,B_SFLD_219_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld219 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld219(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld219,B_SFLD_219_LEN);
   	
   }
   
     /**
	 * 	Update BSFld219 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld219(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld219+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS19
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld119(CONSTANTS.SPACE_30);
         setBSFld219(CONSTANTS.SPACE_40);
   }

		public static int getBS19FieldLength() {
			return B_S_19_LENGTH;
		}

}
  
