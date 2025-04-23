package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup9")

public class BTGrpGroup9 extends BTGrpGroup9Serialized  implements InitializingBean {
   
					private BTGrp9 bTGrp9 = new BTGrp9();

						private char[] bTGrpR9 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup9
	**/
    public BTGrpGroup9() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp9.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp9
	 *	@return bTGrp9
	 */   
	 public BTGrp9 getBTGrp9() {
   	return bTGrp9;
   }
   /**
	* 	Update BTGrp9 with the passed value
	*   Corresponding COBOL Variable is WS-9B-T-GRP
	*	@param value
	*/
   public void setBTGrp9(char[] value) {
      bTGrp9.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp9 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp9(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp9.begin,bTGrp9.length());
   }
   
     /**
	 * 	Update BTGrp9 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp9.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp9 with another Field
	 *	@param value
	 */
   public void setBTGrp9(Field source) {
   	replace(source,0,source.length(),bTGrp9.begin,bTGrp9.length());
   }  
   
     /**
	 * 	Update BTGrp9 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp9(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp9.begin,bTGrp9.length());
   }
   
     /**
	 * 	Update BTGrp9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp9.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR9
	 *	@return bTGrpR9
	 */
   public char[] getBTGrpR9() throws CFException{
     if (isBTGrpR9Modified()) { 
        bTGrpR9 = refreshBTGrpR9();
     }
   		return bTGrpR9;
   }

  
	/**
	*  set variable bTGrpR9
	*  Corresponding COBOL Variable is WS-9B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR9(char[] value) {
      bTGrpR9 = checkBTGrpR9Constraints(value);
      serializeBTGrpR9(bTGrpR9);
   } 

     /**
	 * 	Update BTGrpR9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR9,bTGrpR9.length);
   	
   }
   
   public void setBTGrpR9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR9,bTGrpR9.length);
   	
   }
   
     /**
	 * 	Update BTGrpR9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR9 with another Field
	 *	@param value
	 */
   public void setBTGrpR9(Field source) {
       replace(source,0,source.length(),beginBTGrpR9,B_TGRP_R_9_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR9,B_TGRP_R_9_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR9+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup9FieldLength() {
			return B_TGRP_GROUP_9_LENGTH;
		}

}
  
