package com.cloudframe.app.global.sharedvar;

/**
*  The class AS11 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_aS11")

public class AS11 extends AS11Serialized  implements InitializingBean {
   

						private char[] aSFld111 = Field.fillLowValue(30);

						private char[] aSFld211 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS11
	**/
    public AS11() {
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
	 *	Returns the value of aSFld111
	 *	@return aSFld111
	 */
   public char[] getASFld111() throws CFException{
     if (isASFld111Modified()) { 
        aSFld111 = refreshASFld111();
     }
   		return aSFld111;
   }

  
	/**
	*  set variable aSFld111
	*  Corresponding COBOL Variable is WS-11A-S-FLD1
	*  @param value
	**/
   public void setASFld111(char[] value) {
      aSFld111 = checkASFld111Constraints(value);
      serializeASFld111(aSFld111);
   } 

     /**
	 * 	Update ASFld111 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld111(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld111,aSFld111.length);
   	
   }
   
   public void setASFld111(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld111,aSFld111.length);
   	
   }
   
     /**
	 * 	Update ASFld111 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld111(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld111+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld111 with another Field
	 *	@param value
	 */
   public void setASFld111(Field source) {
       replace(source,0,source.length(),beginASFld111,A_SFLD_111_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld111 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld111(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld111,A_SFLD_111_LEN);
   	
   }
   
     /**
	 * 	Update ASFld111 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld111(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld111+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld211
	 *	@return aSFld211
	 */
   public char[] getASFld211() throws CFException{
     if (isASFld211Modified()) { 
        aSFld211 = refreshASFld211();
     }
   		return aSFld211;
   }

  
	/**
	*  set variable aSFld211
	*  Corresponding COBOL Variable is WS-11A-S-FLD2
	*  @param value
	**/
   public void setASFld211(char[] value) {
      aSFld211 = checkASFld211Constraints(value);
      serializeASFld211(aSFld211);
   } 

     /**
	 * 	Update ASFld211 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld211(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld211,aSFld211.length);
   	
   }
   
   public void setASFld211(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld211,aSFld211.length);
   	
   }
   
     /**
	 * 	Update ASFld211 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld211(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld211+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld211 with another Field
	 *	@param value
	 */
   public void setASFld211(Field source) {
       replace(source,0,source.length(),beginASFld211,A_SFLD_211_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld211 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld211(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld211,A_SFLD_211_LEN);
   	
   }
   
     /**
	 * 	Update ASFld211 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld211(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld211+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS11
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld111(CONSTANTS.SPACE_30);
         setASFld211(CONSTANTS.SPACE_40);
   }

		public static int getAS11FieldLength() {
			return A_S_11_LENGTH;
		}

}
  
