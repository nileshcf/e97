package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup20")

public class ATGrpGroup20 extends ATGrpGroup20Serialized  implements InitializingBean {
   
					private ATGrp20 aTGrp20 = new ATGrp20();

						private char[] aTGrpR20 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup20
	**/
    public ATGrpGroup20() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp20.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp20
	 *	@return aTGrp20
	 */   
	 public ATGrp20 getATGrp20() {
   	return aTGrp20;
   }
   /**
	* 	Update ATGrp20 with the passed value
	*   Corresponding COBOL Variable is WS-20A-T-GRP
	*	@param value
	*/
   public void setATGrp20(char[] value) {
      aTGrp20.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp20 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp20(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp20.begin,aTGrp20.length());
   }
   
     /**
	 * 	Update ATGrp20 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp20.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp20 with another Field
	 *	@param value
	 */
   public void setATGrp20(Field source) {
   	replace(source,0,source.length(),aTGrp20.begin,aTGrp20.length());
   }  
   
     /**
	 * 	Update ATGrp20 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp20(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp20.begin,aTGrp20.length());
   }
   
     /**
	 * 	Update ATGrp20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp20.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR20
	 *	@return aTGrpR20
	 */
   public char[] getATGrpR20() throws CFException{
     if (isATGrpR20Modified()) { 
        aTGrpR20 = refreshATGrpR20();
     }
   		return aTGrpR20;
   }

  
	/**
	*  set variable aTGrpR20
	*  Corresponding COBOL Variable is WS-20A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR20(char[] value) {
      aTGrpR20 = checkATGrpR20Constraints(value);
      serializeATGrpR20(aTGrpR20);
   } 

     /**
	 * 	Update ATGrpR20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR20,aTGrpR20.length);
   	
   }
   
   public void setATGrpR20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR20,aTGrpR20.length);
   	
   }
   
     /**
	 * 	Update ATGrpR20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR20 with another Field
	 *	@param value
	 */
   public void setATGrpR20(Field source) {
       replace(source,0,source.length(),beginATGrpR20,A_TGRP_R_20_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR20,A_TGRP_R_20_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR20+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup20FieldLength() {
			return A_TGRP_GROUP_20_LENGTH;
		}

}
  
