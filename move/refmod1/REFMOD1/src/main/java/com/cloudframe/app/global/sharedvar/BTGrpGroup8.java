package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup8")

public class BTGrpGroup8 extends BTGrpGroup8Serialized  implements InitializingBean {
   
					private BTGrp8 bTGrp8 = new BTGrp8();

						private char[] bTGrpR8 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup8
	**/
    public BTGrpGroup8() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp8.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp8
	 *	@return bTGrp8
	 */   
	 public BTGrp8 getBTGrp8() {
   	return bTGrp8;
   }
   /**
	* 	Update BTGrp8 with the passed value
	*   Corresponding COBOL Variable is WS-8B-T-GRP
	*	@param value
	*/
   public void setBTGrp8(char[] value) {
      bTGrp8.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp8 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp8(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp8.begin,bTGrp8.length());
   }
   
     /**
	 * 	Update BTGrp8 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp8.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp8 with another Field
	 *	@param value
	 */
   public void setBTGrp8(Field source) {
   	replace(source,0,source.length(),bTGrp8.begin,bTGrp8.length());
   }  
   
     /**
	 * 	Update BTGrp8 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp8(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp8.begin,bTGrp8.length());
   }
   
     /**
	 * 	Update BTGrp8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp8.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR8
	 *	@return bTGrpR8
	 */
   public char[] getBTGrpR8() throws CFException{
     if (isBTGrpR8Modified()) { 
        bTGrpR8 = refreshBTGrpR8();
     }
   		return bTGrpR8;
   }

  
	/**
	*  set variable bTGrpR8
	*  Corresponding COBOL Variable is WS-8B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR8(char[] value) {
      bTGrpR8 = checkBTGrpR8Constraints(value);
      serializeBTGrpR8(bTGrpR8);
   } 

     /**
	 * 	Update BTGrpR8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR8,bTGrpR8.length);
   	
   }
   
   public void setBTGrpR8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR8,bTGrpR8.length);
   	
   }
   
     /**
	 * 	Update BTGrpR8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR8 with another Field
	 *	@param value
	 */
   public void setBTGrpR8(Field source) {
       replace(source,0,source.length(),beginBTGrpR8,B_TGRP_R_8_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR8,B_TGRP_R_8_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR8+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup8FieldLength() {
			return B_TGRP_GROUP_8_LENGTH;
		}

}
  
