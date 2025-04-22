package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup18")

public class ATGrpGroup18 extends ATGrpGroup18Serialized  implements InitializingBean {
   
					private ATGrp18 aTGrp18 = new ATGrp18();

						private char[] aTGrpR18 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup18
	**/
    public ATGrpGroup18() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp18.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp18
	 *	@return aTGrp18
	 */   
	 public ATGrp18 getATGrp18() {
   	return aTGrp18;
   }
   /**
	* 	Update ATGrp18 with the passed value
	*   Corresponding COBOL Variable is WS-18A-T-GRP
	*	@param value
	*/
   public void setATGrp18(char[] value) {
      aTGrp18.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp18 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp18(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp18.begin,aTGrp18.length());
   }
   
     /**
	 * 	Update ATGrp18 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp18.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp18 with another Field
	 *	@param value
	 */
   public void setATGrp18(Field source) {
   	replace(source,0,source.length(),aTGrp18.begin,aTGrp18.length());
   }  
   
     /**
	 * 	Update ATGrp18 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp18(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp18.begin,aTGrp18.length());
   }
   
     /**
	 * 	Update ATGrp18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp18.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR18
	 *	@return aTGrpR18
	 */
   public char[] getATGrpR18() throws CFException{
     if (isATGrpR18Modified()) { 
        aTGrpR18 = refreshATGrpR18();
     }
   		return aTGrpR18;
   }

  
	/**
	*  set variable aTGrpR18
	*  Corresponding COBOL Variable is WS-18A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR18(char[] value) {
      aTGrpR18 = checkATGrpR18Constraints(value);
      serializeATGrpR18(aTGrpR18);
   } 

     /**
	 * 	Update ATGrpR18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR18,aTGrpR18.length);
   	
   }
   
   public void setATGrpR18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR18,aTGrpR18.length);
   	
   }
   
     /**
	 * 	Update ATGrpR18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR18 with another Field
	 *	@param value
	 */
   public void setATGrpR18(Field source) {
       replace(source,0,source.length(),beginATGrpR18,A_TGRP_R_18_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR18,A_TGRP_R_18_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR18+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup18FieldLength() {
			return A_TGRP_GROUP_18_LENGTH;
		}

}
  
