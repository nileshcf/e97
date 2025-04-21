package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup7")

public class ATGrpGroup7 extends ATGrpGroup7Serialized  implements InitializingBean {
   
					private ATGrp7 aTGrp7 = new ATGrp7();

						private char[] aTGrpR7 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup7
	**/
    public ATGrpGroup7() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp7.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp7
	 *	@return aTGrp7
	 */   
	 public ATGrp7 getATGrp7() {
   	return aTGrp7;
   }
   /**
	* 	Update ATGrp7 with the passed value
	*   Corresponding COBOL Variable is WS-7A-T-GRP
	*	@param value
	*/
   public void setATGrp7(char[] value) {
      aTGrp7.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp7.begin,aTGrp7.length());
   }
   
     /**
	 * 	Update ATGrp7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp7 with another Field
	 *	@param value
	 */
   public void setATGrp7(Field source) {
   	replace(source,0,source.length(),aTGrp7.begin,aTGrp7.length());
   }  
   
     /**
	 * 	Update ATGrp7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp7.begin,aTGrp7.length());
   }
   
     /**
	 * 	Update ATGrp7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp7.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR7
	 *	@return aTGrpR7
	 */
   public char[] getATGrpR7() throws CFException{
     if (isATGrpR7Modified()) { 
        aTGrpR7 = refreshATGrpR7();
     }
   		return aTGrpR7;
   }

  
	/**
	*  set variable aTGrpR7
	*  Corresponding COBOL Variable is WS-7A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR7(char[] value) {
      aTGrpR7 = checkATGrpR7Constraints(value);
      serializeATGrpR7(aTGrpR7);
   } 

     /**
	 * 	Update ATGrpR7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR7,aTGrpR7.length);
   	
   }
   
   public void setATGrpR7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR7,aTGrpR7.length);
   	
   }
   
     /**
	 * 	Update ATGrpR7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR7 with another Field
	 *	@param value
	 */
   public void setATGrpR7(Field source) {
       replace(source,0,source.length(),beginATGrpR7,A_TGRP_R_7_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR7,A_TGRP_R_7_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup7FieldLength() {
			return A_TGRP_GROUP_7_LENGTH;
		}

}
  
