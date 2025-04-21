package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup9")

public class ATGrpGroup9 extends ATGrpGroup9Serialized  implements InitializingBean {
   
					private ATGrp9 aTGrp9 = new ATGrp9();

						private char[] aTGrpR9 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup9
	**/
    public ATGrpGroup9() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp9.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp9
	 *	@return aTGrp9
	 */   
	 public ATGrp9 getATGrp9() {
   	return aTGrp9;
   }
   /**
	* 	Update ATGrp9 with the passed value
	*   Corresponding COBOL Variable is WS-9A-T-GRP
	*	@param value
	*/
   public void setATGrp9(char[] value) {
      aTGrp9.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp9.begin,aTGrp9.length());
   }
   
     /**
	 * 	Update ATGrp9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp9 with another Field
	 *	@param value
	 */
   public void setATGrp9(Field source) {
   	replace(source,0,source.length(),aTGrp9.begin,aTGrp9.length());
   }  
   
     /**
	 * 	Update ATGrp9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp9.begin,aTGrp9.length());
   }
   
     /**
	 * 	Update ATGrp9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp9.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR9
	 *	@return aTGrpR9
	 */
   public char[] getATGrpR9() throws CFException{
     if (isATGrpR9Modified()) { 
        aTGrpR9 = refreshATGrpR9();
     }
   		return aTGrpR9;
   }

  
	/**
	*  set variable aTGrpR9
	*  Corresponding COBOL Variable is WS-9A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR9(char[] value) {
      aTGrpR9 = checkATGrpR9Constraints(value);
      serializeATGrpR9(aTGrpR9);
   } 

     /**
	 * 	Update ATGrpR9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR9,aTGrpR9.length);
   	
   }
   
   public void setATGrpR9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR9,aTGrpR9.length);
   	
   }
   
     /**
	 * 	Update ATGrpR9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR9 with another Field
	 *	@param value
	 */
   public void setATGrpR9(Field source) {
       replace(source,0,source.length(),beginATGrpR9,A_TGRP_R_9_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR9,A_TGRP_R_9_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR9+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup9FieldLength() {
			return A_TGRP_GROUP_9_LENGTH;
		}

}
  
