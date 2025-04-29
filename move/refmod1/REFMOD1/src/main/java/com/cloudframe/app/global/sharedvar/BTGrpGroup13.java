package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup13 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup13")

public class BTGrpGroup13 extends BTGrpGroup13Serialized  implements InitializingBean {
   
					private BTGrp13 bTGrp13 = new BTGrp13();

						private char[] bTGrpR13 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup13
	**/
    public BTGrpGroup13() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp13.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp13
	 *	@return bTGrp13
	 */   
	 public BTGrp13 getBTGrp13() {
   	return bTGrp13;
   }
   /**
	* 	Update BTGrp13 with the passed value
	*   Corresponding COBOL Variable is WS-13B-T-GRP
	*	@param value
	*/
   public void setBTGrp13(char[] value) {
      bTGrp13.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp13 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp13(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp13.begin,bTGrp13.length());
   }
   
     /**
	 * 	Update BTGrp13 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp13.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp13 with another Field
	 *	@param value
	 */
   public void setBTGrp13(Field source) {
   	replace(source,0,source.length(),bTGrp13.begin,bTGrp13.length());
   }  
   
     /**
	 * 	Update BTGrp13 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp13(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp13.begin,bTGrp13.length());
   }
   
     /**
	 * 	Update BTGrp13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp13.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR13
	 *	@return bTGrpR13
	 */
   public char[] getBTGrpR13() throws CFException{
     if (isBTGrpR13Modified()) { 
        bTGrpR13 = refreshBTGrpR13();
     }
   		return bTGrpR13;
   }

  
	/**
	*  set variable bTGrpR13
	*  Corresponding COBOL Variable is WS-13B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR13(char[] value) {
      bTGrpR13 = checkBTGrpR13Constraints(value);
      serializeBTGrpR13(bTGrpR13);
   } 

     /**
	 * 	Update BTGrpR13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR13,bTGrpR13.length);
   	
   }
   
   public void setBTGrpR13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR13,bTGrpR13.length);
   	
   }
   
     /**
	 * 	Update BTGrpR13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR13 with another Field
	 *	@param value
	 */
   public void setBTGrpR13(Field source) {
       replace(source,0,source.length(),beginBTGrpR13,B_TGRP_R_13_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR13,B_TGRP_R_13_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR13+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup13FieldLength() {
			return B_TGRP_GROUP_13_LENGTH;
		}

}
  
