package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup12")

public class ATGrpGroup12 extends ATGrpGroup12Serialized  implements InitializingBean {
   
					private ATGrp12 aTGrp12 = new ATGrp12();

						private char[] aTGrpR12 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup12
	**/
    public ATGrpGroup12() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp12.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp12
	 *	@return aTGrp12
	 */   
	 public ATGrp12 getATGrp12() {
   	return aTGrp12;
   }
   /**
	* 	Update ATGrp12 with the passed value
	*   Corresponding COBOL Variable is WS-12A-T-GRP
	*	@param value
	*/
   public void setATGrp12(char[] value) {
      aTGrp12.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp12 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp12(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp12.begin,aTGrp12.length());
   }
   
     /**
	 * 	Update ATGrp12 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp12.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp12 with another Field
	 *	@param value
	 */
   public void setATGrp12(Field source) {
   	replace(source,0,source.length(),aTGrp12.begin,aTGrp12.length());
   }  
   
     /**
	 * 	Update ATGrp12 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp12(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp12.begin,aTGrp12.length());
   }
   
     /**
	 * 	Update ATGrp12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp12.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR12
	 *	@return aTGrpR12
	 */
   public char[] getATGrpR12() throws CFException{
     if (isATGrpR12Modified()) { 
        aTGrpR12 = refreshATGrpR12();
     }
   		return aTGrpR12;
   }

  
	/**
	*  set variable aTGrpR12
	*  Corresponding COBOL Variable is WS-12A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR12(char[] value) {
      aTGrpR12 = checkATGrpR12Constraints(value);
      serializeATGrpR12(aTGrpR12);
   } 

     /**
	 * 	Update ATGrpR12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR12,aTGrpR12.length);
   	
   }
   
   public void setATGrpR12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR12,aTGrpR12.length);
   	
   }
   
     /**
	 * 	Update ATGrpR12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR12 with another Field
	 *	@param value
	 */
   public void setATGrpR12(Field source) {
       replace(source,0,source.length(),beginATGrpR12,A_TGRP_R_12_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR12,A_TGRP_R_12_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR12+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup12FieldLength() {
			return A_TGRP_GROUP_12_LENGTH;
		}

}
  
