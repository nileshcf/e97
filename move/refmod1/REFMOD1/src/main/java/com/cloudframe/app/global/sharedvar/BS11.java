package com.cloudframe.app.global.sharedvar;

/**
*  The class BS11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_bS11")

public class BS11 extends BS11Serialized  implements InitializingBean {
   

						private char[] bSFld111 = Field.fillLowValue(30);

						private char[] bSFld211 = Field.fillLowValue(40);
	
	/**
	* Constructor for BS11
	**/
    public BS11() {
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
	 *	Returns the value of bSFld111
	 *	@return bSFld111
	 */
   public char[] getBSFld111() throws CFException{
     if (isBSFld111Modified()) { 
        bSFld111 = refreshBSFld111();
     }
   		return bSFld111;
   }

  
	/**
	*  set variable bSFld111
	*  Corresponding COBOL Variable is WS-11B-S-FLD1
	*  @param value
	**/
   public void setBSFld111(char[] value) {
      bSFld111 = checkBSFld111Constraints(value);
      serializeBSFld111(bSFld111);
   } 

     /**
	 * 	Update BSFld111 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld111(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld111,bSFld111.length);
   	
   }
   
   public void setBSFld111(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld111,bSFld111.length);
   	
   }
   
     /**
	 * 	Update BSFld111 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld111(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld111+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld111 with another Field
	 *	@param value
	 */
   public void setBSFld111(Field source) {
       replace(source,0,source.length(),beginBSFld111,B_SFLD_111_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld111 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld111(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld111,B_SFLD_111_LEN);
   	
   }
   
     /**
	 * 	Update BSFld111 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld111(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld111+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bSFld211
	 *	@return bSFld211
	 */
   public char[] getBSFld211() throws CFException{
     if (isBSFld211Modified()) { 
        bSFld211 = refreshBSFld211();
     }
   		return bSFld211;
   }

  
	/**
	*  set variable bSFld211
	*  Corresponding COBOL Variable is WS-11B-S-FLD2
	*  @param value
	**/
   public void setBSFld211(char[] value) {
      bSFld211 = checkBSFld211Constraints(value);
      serializeBSFld211(bSFld211);
   } 

     /**
	 * 	Update BSFld211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBSFld211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBSFld211,bSFld211.length);
   	
   }
   
   public void setBSFld211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld211,bSFld211.length);
   	
   }
   
     /**
	 * 	Update BSFld211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBSFld211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BSFld211 with another Field
	 *	@param value
	 */
   public void setBSFld211(Field source) {
       replace(source,0,source.length(),beginBSFld211,B_SFLD_211_LEN);
   	
   }  
   
     /**
	 * 	Update BSFld211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBSFld211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBSFld211,B_SFLD_211_LEN);
   	
   }
   
     /**
	 * 	Update BSFld211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBSFld211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBSFld211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BS11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBSFld111(CONSTANTS.SPACE_30);
         setBSFld211(CONSTANTS.SPACE_40);
   }

		public static int getBS11FieldLength() {
			return B_S_11_LENGTH;
		}

}
  
