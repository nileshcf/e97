package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup19 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup19")

public class ATGrpGroup19 extends ATGrpGroup19Serialized  implements InitializingBean {
   
					private ATGrp19 aTGrp19 = new ATGrp19();

						private char[] aTGrpR19 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup19
	**/
    public ATGrpGroup19() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp19.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp19
	 *	@return aTGrp19
	 */   
	 public ATGrp19 getATGrp19() {
   	return aTGrp19;
   }
   /**
	* 	Update ATGrp19 with the passed value
	*   Corresponding COBOL Variable is WS-19A-T-GRP
	*	@param value
	*/
   public void setATGrp19(char[] value) {
      aTGrp19.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp19 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp19(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp19.begin,aTGrp19.length());
   }
   
     /**
	 * 	Update ATGrp19 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp19.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp19 with another Field
	 *	@param value
	 */
   public void setATGrp19(Field source) {
   	replace(source,0,source.length(),aTGrp19.begin,aTGrp19.length());
   }  
   
     /**
	 * 	Update ATGrp19 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp19(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp19.begin,aTGrp19.length());
   }
   
     /**
	 * 	Update ATGrp19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp19.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR19
	 *	@return aTGrpR19
	 */
   public char[] getATGrpR19() throws CFException{
     if (isATGrpR19Modified()) { 
        aTGrpR19 = refreshATGrpR19();
     }
   		return aTGrpR19;
   }

  
	/**
	*  set variable aTGrpR19
	*  Corresponding COBOL Variable is WS-19A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR19(char[] value) {
      aTGrpR19 = checkATGrpR19Constraints(value);
      serializeATGrpR19(aTGrpR19);
   } 

     /**
	 * 	Update ATGrpR19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR19,aTGrpR19.length);
   	
   }
   
   public void setATGrpR19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR19,aTGrpR19.length);
   	
   }
   
     /**
	 * 	Update ATGrpR19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR19 with another Field
	 *	@param value
	 */
   public void setATGrpR19(Field source) {
       replace(source,0,source.length(),beginATGrpR19,A_TGRP_R_19_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR19,A_TGRP_R_19_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR19+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup19FieldLength() {
			return A_TGRP_GROUP_19_LENGTH;
		}

}
  
