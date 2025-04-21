package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup10")

public class ATGrpGroup10 extends ATGrpGroup10Serialized  implements InitializingBean {
   
					private ATGrp10 aTGrp10 = new ATGrp10();

						private char[] aTGrpR10 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup10
	**/
    public ATGrpGroup10() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp10.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp10
	 *	@return aTGrp10
	 */   
	 public ATGrp10 getATGrp10() {
   	return aTGrp10;
   }
   /**
	* 	Update ATGrp10 with the passed value
	*   Corresponding COBOL Variable is WS-10A-T-GRP
	*	@param value
	*/
   public void setATGrp10(char[] value) {
      aTGrp10.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp10 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp10(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp10.begin,aTGrp10.length());
   }
   
     /**
	 * 	Update ATGrp10 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp10.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp10 with another Field
	 *	@param value
	 */
   public void setATGrp10(Field source) {
   	replace(source,0,source.length(),aTGrp10.begin,aTGrp10.length());
   }  
   
     /**
	 * 	Update ATGrp10 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp10(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp10.begin,aTGrp10.length());
   }
   
     /**
	 * 	Update ATGrp10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp10.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR10
	 *	@return aTGrpR10
	 */
   public char[] getATGrpR10() throws CFException{
     if (isATGrpR10Modified()) { 
        aTGrpR10 = refreshATGrpR10();
     }
   		return aTGrpR10;
   }

  
	/**
	*  set variable aTGrpR10
	*  Corresponding COBOL Variable is WS-10A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR10(char[] value) {
      aTGrpR10 = checkATGrpR10Constraints(value);
      serializeATGrpR10(aTGrpR10);
   } 

     /**
	 * 	Update ATGrpR10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR10,aTGrpR10.length);
   	
   }
   
   public void setATGrpR10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR10,aTGrpR10.length);
   	
   }
   
     /**
	 * 	Update ATGrpR10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR10 with another Field
	 *	@param value
	 */
   public void setATGrpR10(Field source) {
       replace(source,0,source.length(),beginATGrpR10,A_TGRP_R_10_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR10,A_TGRP_R_10_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR10+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup10FieldLength() {
			return A_TGRP_GROUP_10_LENGTH;
		}

}
  
