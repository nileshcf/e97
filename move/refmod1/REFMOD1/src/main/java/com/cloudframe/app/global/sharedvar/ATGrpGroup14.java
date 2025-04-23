package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup14")

public class ATGrpGroup14 extends ATGrpGroup14Serialized  implements InitializingBean {
   
					private ATGrp14 aTGrp14 = new ATGrp14();

						private char[] aTGrpR14 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup14
	**/
    public ATGrpGroup14() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp14.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp14
	 *	@return aTGrp14
	 */   
	 public ATGrp14 getATGrp14() {
   	return aTGrp14;
   }
   /**
	* 	Update ATGrp14 with the passed value
	*   Corresponding COBOL Variable is WS-14A-T-GRP
	*	@param value
	*/
   public void setATGrp14(char[] value) {
      aTGrp14.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp14 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp14(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp14.begin,aTGrp14.length());
   }
   
     /**
	 * 	Update ATGrp14 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp14.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp14 with another Field
	 *	@param value
	 */
   public void setATGrp14(Field source) {
   	replace(source,0,source.length(),aTGrp14.begin,aTGrp14.length());
   }  
   
     /**
	 * 	Update ATGrp14 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp14(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp14.begin,aTGrp14.length());
   }
   
     /**
	 * 	Update ATGrp14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp14.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR14
	 *	@return aTGrpR14
	 */
   public char[] getATGrpR14() throws CFException{
     if (isATGrpR14Modified()) { 
        aTGrpR14 = refreshATGrpR14();
     }
   		return aTGrpR14;
   }

  
	/**
	*  set variable aTGrpR14
	*  Corresponding COBOL Variable is WS-14A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR14(char[] value) {
      aTGrpR14 = checkATGrpR14Constraints(value);
      serializeATGrpR14(aTGrpR14);
   } 

     /**
	 * 	Update ATGrpR14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR14,aTGrpR14.length);
   	
   }
   
   public void setATGrpR14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR14,aTGrpR14.length);
   	
   }
   
     /**
	 * 	Update ATGrpR14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR14 with another Field
	 *	@param value
	 */
   public void setATGrpR14(Field source) {
       replace(source,0,source.length(),beginATGrpR14,A_TGRP_R_14_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR14,A_TGRP_R_14_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR14+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup14FieldLength() {
			return A_TGRP_GROUP_14_LENGTH;
		}

}
  
