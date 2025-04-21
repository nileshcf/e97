package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup13")

public class ATGrpGroup13 extends ATGrpGroup13Serialized  implements InitializingBean {
   
					private ATGrp13 aTGrp13 = new ATGrp13();

						private char[] aTGrpR13 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup13
	**/
    public ATGrpGroup13() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp13.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp13
	 *	@return aTGrp13
	 */   
	 public ATGrp13 getATGrp13() {
   	return aTGrp13;
   }
   /**
	* 	Update ATGrp13 with the passed value
	*   Corresponding COBOL Variable is WS-13A-T-GRP
	*	@param value
	*/
   public void setATGrp13(char[] value) {
      aTGrp13.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp13.begin,aTGrp13.length());
   }
   
     /**
	 * 	Update ATGrp13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp13 with another Field
	 *	@param value
	 */
   public void setATGrp13(Field source) {
   	replace(source,0,source.length(),aTGrp13.begin,aTGrp13.length());
   }  
   
     /**
	 * 	Update ATGrp13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp13.begin,aTGrp13.length());
   }
   
     /**
	 * 	Update ATGrp13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp13.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR13
	 *	@return aTGrpR13
	 */
   public char[] getATGrpR13() throws CFException{
     if (isATGrpR13Modified()) { 
        aTGrpR13 = refreshATGrpR13();
     }
   		return aTGrpR13;
   }

  
	/**
	*  set variable aTGrpR13
	*  Corresponding COBOL Variable is WS-13A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR13(char[] value) {
      aTGrpR13 = checkATGrpR13Constraints(value);
      serializeATGrpR13(aTGrpR13);
   } 

     /**
	 * 	Update ATGrpR13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR13,aTGrpR13.length);
   	
   }
   
   public void setATGrpR13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR13,aTGrpR13.length);
   	
   }
   
     /**
	 * 	Update ATGrpR13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR13 with another Field
	 *	@param value
	 */
   public void setATGrpR13(Field source) {
       replace(source,0,source.length(),beginATGrpR13,A_TGRP_R_13_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR13,A_TGRP_R_13_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR13+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup13FieldLength() {
			return A_TGRP_GROUP_13_LENGTH;
		}

}
  
