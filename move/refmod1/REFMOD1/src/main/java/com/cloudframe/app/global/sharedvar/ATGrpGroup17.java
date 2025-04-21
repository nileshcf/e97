package com.cloudframe.app.global.sharedvar;

/**
*  The class ATGrpGroup17 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_aTGrpGroup17")

public class ATGrpGroup17 extends ATGrpGroup17Serialized  implements InitializingBean {
   
					private ATGrp17 aTGrp17 = new ATGrp17();

						private char[] aTGrpR17 = Field.fillLowValue(60);
	
	/**
	* Constructor for ATGrpGroup17
	**/
    public ATGrpGroup17() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			aTGrp17.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of aTGrp17
	 *	@return aTGrp17
	 */   
	 public ATGrp17 getATGrp17() {
   	return aTGrp17;
   }
   /**
	* 	Update ATGrp17 with the passed value
	*   Corresponding COBOL Variable is WS-17A-T-GRP
	*	@param value
	*/
   public void setATGrp17(char[] value) {
      aTGrp17.setString(value); 
   }   
    
     /**
	 * 	Update ATGrp17 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setATGrp17(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp17.begin,aTGrp17.length());
   }
   
     /**
	 * 	Update ATGrp17 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrp17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp17.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ATGrp17 with another Field
	 *	@param value
	 */
   public void setATGrp17(Field source) {
   	replace(source,0,source.length(),aTGrp17.begin,aTGrp17.length());
   }  
   
     /**
	 * 	Update ATGrp17 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setATGrp17(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp17.begin,aTGrp17.length());
   }
   
     /**
	 * 	Update ATGrp17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrp17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,aTGrp17.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of aTGrpR17
	 *	@return aTGrpR17
	 */
   public char[] getATGrpR17() throws CFException{
     if (isATGrpR17Modified()) { 
        aTGrpR17 = refreshATGrpR17();
     }
   		return aTGrpR17;
   }

  
	/**
	*  set variable aTGrpR17
	*  Corresponding COBOL Variable is WS-17A-T-GRP-R
	*  @param value
	**/
   public void setATGrpR17(char[] value) {
      aTGrpR17 = checkATGrpR17Constraints(value);
      serializeATGrpR17(aTGrpR17);
   } 

     /**
	 * 	Update ATGrpR17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATGrpR17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATGrpR17,aTGrpR17.length);
   	
   }
   
   public void setATGrpR17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR17,aTGrpR17.length);
   	
   }
   
     /**
	 * 	Update ATGrpR17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATGrpR17 with another Field
	 *	@param value
	 */
   public void setATGrpR17(Field source) {
       replace(source,0,source.length(),beginATGrpR17,A_TGRP_R_17_LEN);
   	
   }  
   
     /**
	 * 	Update ATGrpR17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATGrpR17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATGrpR17,A_TGRP_R_17_LEN);
   	
   }
   
     /**
	 * 	Update ATGrpR17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATGrpR17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATGrpR17+targetIndex,targetLen);
    
   }

	
	
	

		public static int getATGrpGroup17FieldLength() {
			return A_TGRP_GROUP_17_LENGTH;
		}

}
  
