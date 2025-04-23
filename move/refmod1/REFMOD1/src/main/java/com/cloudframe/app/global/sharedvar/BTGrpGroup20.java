package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup20 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup20")

public class BTGrpGroup20 extends BTGrpGroup20Serialized  implements InitializingBean {
   
					private BTGrp20 bTGrp20 = new BTGrp20();

						private char[] bTGrpR20 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup20
	**/
    public BTGrpGroup20() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp20.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp20
	 *	@return bTGrp20
	 */   
	 public BTGrp20 getBTGrp20() {
   	return bTGrp20;
   }
   /**
	* 	Update BTGrp20 with the passed value
	*   Corresponding COBOL Variable is WS-20B-T-GRP
	*	@param value
	*/
   public void setBTGrp20(char[] value) {
      bTGrp20.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp20 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp20(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp20.begin,bTGrp20.length());
   }
   
     /**
	 * 	Update BTGrp20 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp20.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp20 with another Field
	 *	@param value
	 */
   public void setBTGrp20(Field source) {
   	replace(source,0,source.length(),bTGrp20.begin,bTGrp20.length());
   }  
   
     /**
	 * 	Update BTGrp20 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp20(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp20.begin,bTGrp20.length());
   }
   
     /**
	 * 	Update BTGrp20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp20.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR20
	 *	@return bTGrpR20
	 */
   public char[] getBTGrpR20() throws CFException{
     if (isBTGrpR20Modified()) { 
        bTGrpR20 = refreshBTGrpR20();
     }
   		return bTGrpR20;
   }

  
	/**
	*  set variable bTGrpR20
	*  Corresponding COBOL Variable is WS-20B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR20(char[] value) {
      bTGrpR20 = checkBTGrpR20Constraints(value);
      serializeBTGrpR20(bTGrpR20);
   } 

     /**
	 * 	Update BTGrpR20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR20,bTGrpR20.length);
   	
   }
   
   public void setBTGrpR20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR20,bTGrpR20.length);
   	
   }
   
     /**
	 * 	Update BTGrpR20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR20 with another Field
	 *	@param value
	 */
   public void setBTGrpR20(Field source) {
       replace(source,0,source.length(),beginBTGrpR20,B_TGRP_R_20_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR20,B_TGRP_R_20_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR20+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup20FieldLength() {
			return B_TGRP_GROUP_20_LENGTH;
		}

}
  
