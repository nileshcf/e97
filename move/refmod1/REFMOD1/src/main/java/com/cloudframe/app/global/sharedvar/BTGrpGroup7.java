package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup7")

public class BTGrpGroup7 extends BTGrpGroup7Serialized  implements InitializingBean {
   
					private BTGrp7 bTGrp7 = new BTGrp7();

						private char[] bTGrpR7 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup7
	**/
    public BTGrpGroup7() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp7.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp7
	 *	@return bTGrp7
	 */   
	 public BTGrp7 getBTGrp7() {
   	return bTGrp7;
   }
   /**
	* 	Update BTGrp7 with the passed value
	*   Corresponding COBOL Variable is WS-7B-T-GRP
	*	@param value
	*/
   public void setBTGrp7(char[] value) {
      bTGrp7.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp7 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp7(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp7.begin,bTGrp7.length());
   }
   
     /**
	 * 	Update BTGrp7 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp7.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp7 with another Field
	 *	@param value
	 */
   public void setBTGrp7(Field source) {
   	replace(source,0,source.length(),bTGrp7.begin,bTGrp7.length());
   }  
   
     /**
	 * 	Update BTGrp7 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp7(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp7.begin,bTGrp7.length());
   }
   
     /**
	 * 	Update BTGrp7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp7.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR7
	 *	@return bTGrpR7
	 */
   public char[] getBTGrpR7() throws CFException{
     if (isBTGrpR7Modified()) { 
        bTGrpR7 = refreshBTGrpR7();
     }
   		return bTGrpR7;
   }

  
	/**
	*  set variable bTGrpR7
	*  Corresponding COBOL Variable is WS-7B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR7(char[] value) {
      bTGrpR7 = checkBTGrpR7Constraints(value);
      serializeBTGrpR7(bTGrpR7);
   } 

     /**
	 * 	Update BTGrpR7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR7,bTGrpR7.length);
   	
   }
   
   public void setBTGrpR7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR7,bTGrpR7.length);
   	
   }
   
     /**
	 * 	Update BTGrpR7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR7 with another Field
	 *	@param value
	 */
   public void setBTGrpR7(Field source) {
       replace(source,0,source.length(),beginBTGrpR7,B_TGRP_R_7_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR7,B_TGRP_R_7_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR7+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup7FieldLength() {
			return B_TGRP_GROUP_7_LENGTH;
		}

}
  
