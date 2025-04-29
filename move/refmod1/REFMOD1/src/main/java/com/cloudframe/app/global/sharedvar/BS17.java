package com.cloudframe.app.global.sharedvar;

/**
*  The class BS17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bS17")

public class BS17 extends BS17Serialized  implements InitializingBean {
   

						private char[] bSFld117 = Field.fillLowValue(30);

						private char[] bSFld217 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS17
	**/
    public BS17() {
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
	 *	Returns the value of bSFld117
	 *	@return bSFld117
	 */
   public char[] getBSFld117() throws CFException{
     if (isBSFld117Modified()) { 
        bSFld117 = refreshBSFld117();
     }
   		return bSFld117;
   }

  
	/**
	*  set variable bSFld117
	*  Corresponding COBOL Variable is WS-17B-S-FLD1
	*  @param value
	**/
   public void setBSFld117(char[] value) {
      bSFld117 = checkBSFld117Constraints(value);
      serializeBSFld117(bSFld117);
   } 

     /**
	 * 	Update BSFld117 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld117(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld117,bSFld117.length);
   	
   }
   
   public void setBSFld117(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld117,bSFld117.length);
   	
   }
   
     /**
	 * 	Update BSFld117 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld117(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld117+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld117 with another Field
	 *	@param value
	 */
   public void setBSFld117(Field source) {
       replace(source,0,source.length(),beginBSFld117,B_SFLD_117_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld117 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld117(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld117,B_SFLD_117_LEN);
   	
   }
   
     /**
	 * 	Update BSFld117 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld117(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld117+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld217
	 *	@return bSFld217
	 */
   public char[] getBSFld217() throws CFException{
     if (isBSFld217Modified()) { 
        bSFld217 = refreshBSFld217();
     }
   		return bSFld217;
   }

  
	/**
	*  set variable bSFld217
	*  Corresponding COBOL Variable is WS-17B-S-FLD2
	*  @param value
	**/
   public void setBSFld217(char[] value) {
      bSFld217 = checkBSFld217Constraints(value);
      serializeBSFld217(bSFld217);
   } 

     /**
	 * 	Update BSFld217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld217,bSFld217.length);
   	
   }
   
   public void setBSFld217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld217,bSFld217.length);
   	
   }
   
     /**
	 * 	Update BSFld217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld217 with another Field
	 *	@param value
	 */
   public void setBSFld217(Field source) {
       replace(source,0,source.length(),beginBSFld217,B_SFLD_217_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld217,B_SFLD_217_LEN);
   	
   }
   
     /**
	 * 	Update BSFld217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS17
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld117(CONSTANTS.SPACE_30);
         setBSFld217(CONSTANTS.SPACE_40);
   }

		public static int getBS17FieldLength() {
			return B_S_17_LENGTH;
		}

}
  
