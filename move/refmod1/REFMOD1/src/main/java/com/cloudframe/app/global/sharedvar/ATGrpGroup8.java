package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup8")

public class ATGrpGroup8 extends ATGrpGroup8Serialized  implements InitializingBean {
   
					private ATGrp8 aTGrp8 = new ATGrp8();

						private char[] aTGrpR8 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup8
	**/
    public ATGrpGroup8() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp8.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp8
	 *	@return aTGrp8
	 */   
	 public ATGrp8 getATGrp8() {
   	return aTGrp8;
   }
   /**
	* 	Update ATGrp8 with the passed value
	*   Corresponding COBOL Variable is WS-8A-T-GRP
	*	@param value
	*/
   public void setATGrp8(char[] value) {
      aTGrp8.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp8.begin,aTGrp8.length());
   }
   
     /**
	 * 	Update ATGrp8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp8 with another Field
	 *	@param value
	 */
   public void setATGrp8(Field source) {
   	replace(source,0,source.length(),aTGrp8.begin,aTGrp8.length());
   }  
   
     /**
	 * 	Update ATGrp8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp8.begin,aTGrp8.length());
   }
   
     /**
	 * 	Update ATGrp8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp8.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR8
	 *	@return aTGrpR8
	 */
   public char[] getATGrpR8() throws CFException{
     if (isATGrpR8Modified()) { 
        aTGrpR8 = refreshATGrpR8();
     }
   		return aTGrpR8;
   }

  
	/**
	*  set variable aTGrpR8
	*  Corresponding COBOL Variable is WS-8A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR8(char[] value) {
      aTGrpR8 = checkATGrpR8Constraints(value);
      serializeATGrpR8(aTGrpR8);
   } 

     /**
	 * 	Update ATGrpR8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR8,aTGrpR8.length);
   	
   }
   
   public void setATGrpR8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR8,aTGrpR8.length);
   	
   }
   
     /**
	 * 	Update ATGrpR8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR8 with another Field
	 *	@param value
	 */
   public void setATGrpR8(Field source) {
       replace(source,0,source.length(),beginATGrpR8,A_TGRP_R_8_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR8,A_TGRP_R_8_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR8+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup8FieldLength() {
			return A_TGRP_GROUP_8_LENGTH;
		}

}
  
