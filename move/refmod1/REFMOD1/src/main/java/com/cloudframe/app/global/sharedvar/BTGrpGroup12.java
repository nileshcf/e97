package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup12 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup12")

public class BTGrpGroup12 extends BTGrpGroup12Serialized  implements InitializingBean {
   
					private BTGrp12 bTGrp12 = new BTGrp12();

						private char[] bTGrpR12 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup12
	**/
    public BTGrpGroup12() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp12.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp12
	 *	@return bTGrp12
	 */   
	 public BTGrp12 getBTGrp12() {
   	return bTGrp12;
   }
   /**
	* 	Update BTGrp12 with the passed value
	*   Corresponding COBOL Variable is WS-12B-T-GRP
	*	@param value
	*/
   public void setBTGrp12(char[] value) {
      bTGrp12.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp12 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp12(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp12.begin,bTGrp12.length());
   }
   
     /**
	 * 	Update BTGrp12 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp12.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp12 with another Field
	 *	@param value
	 */
   public void setBTGrp12(Field source) {
   	replace(source,0,source.length(),bTGrp12.begin,bTGrp12.length());
   }  
   
     /**
	 * 	Update BTGrp12 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp12(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp12.begin,bTGrp12.length());
   }
   
     /**
	 * 	Update BTGrp12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp12.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR12
	 *	@return bTGrpR12
	 */
   public char[] getBTGrpR12() throws CFException{
     if (isBTGrpR12Modified()) { 
        bTGrpR12 = refreshBTGrpR12();
     }
   		return bTGrpR12;
   }

  
	/**
	*  set variable bTGrpR12
	*  Corresponding COBOL Variable is WS-12B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR12(char[] value) {
      bTGrpR12 = checkBTGrpR12Constraints(value);
      serializeBTGrpR12(bTGrpR12);
   } 

     /**
	 * 	Update BTGrpR12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR12,bTGrpR12.length);
   	
   }
   
   public void setBTGrpR12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR12,bTGrpR12.length);
   	
   }
   
     /**
	 * 	Update BTGrpR12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR12 with another Field
	 *	@param value
	 */
   public void setBTGrpR12(Field source) {
       replace(source,0,source.length(),beginBTGrpR12,B_TGRP_R_12_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR12,B_TGRP_R_12_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR12+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup12FieldLength() {
			return B_TGRP_GROUP_12_LENGTH;
		}

}
  
