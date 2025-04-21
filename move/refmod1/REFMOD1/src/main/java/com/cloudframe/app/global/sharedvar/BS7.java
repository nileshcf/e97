package com.cloudframe.app.global.sharedvar;

/**
*  The class BS7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bS7")

public class BS7 extends BS7Serialized  implements InitializingBean {
   

						private char[] bSFld17 = Field.fillLowValue(30);

						private char[] bSFld27 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS7
	**/
    public BS7() {
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
	 *	Returns the value of bSFld17
	 *	@return bSFld17
	 */
   public char[] getBSFld17() throws CFException{
     if (isBSFld17Modified()) { 
        bSFld17 = refreshBSFld17();
     }
   		return bSFld17;
   }

  
	/**
	*  set variable bSFld17
	*  Corresponding COBOL Variable is WS-7B-S-FLD1
	*  @param value
	**/
   public void setBSFld17(char[] value) {
      bSFld17 = checkBSFld17Constraints(value);
      serializeBSFld17(bSFld17);
   } 

     /**
	 * 	Update BSFld17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld17,bSFld17.length);
   	
   }
   
   public void setBSFld17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld17,bSFld17.length);
   	
   }
   
     /**
	 * 	Update BSFld17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld17 with another Field
	 *	@param value
	 */
   public void setBSFld17(Field source) {
       replace(source,0,source.length(),beginBSFld17,B_SFLD_17_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld17,B_SFLD_17_LEN);
   	
   }
   
     /**
	 * 	Update BSFld17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld27
	 *	@return bSFld27
	 */
   public char[] getBSFld27() throws CFException{
     if (isBSFld27Modified()) { 
        bSFld27 = refreshBSFld27();
     }
   		return bSFld27;
   }

  
	/**
	*  set variable bSFld27
	*  Corresponding COBOL Variable is WS-7B-S-FLD2
	*  @param value
	**/
   public void setBSFld27(char[] value) {
      bSFld27 = checkBSFld27Constraints(value);
      serializeBSFld27(bSFld27);
   } 

     /**
	 * 	Update BSFld27 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld27(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld27,bSFld27.length);
   	
   }
   
   public void setBSFld27(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld27,bSFld27.length);
   	
   }
   
     /**
	 * 	Update BSFld27 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld27(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld27+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld27 with another Field
	 *	@param value
	 */
   public void setBSFld27(Field source) {
       replace(source,0,source.length(),beginBSFld27,B_SFLD_27_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld27 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld27(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld27,B_SFLD_27_LEN);
   	
   }
   
     /**
	 * 	Update BSFld27 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld27(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld27+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS7
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld17(CONSTANTS.SPACE_30);
         setBSFld27(CONSTANTS.SPACE_40);
   }

		public static int getBS7FieldLength() {
			return B_S_7_LENGTH;
		}

}
  
