package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup14 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup14")

public class BTGrpGroup14 extends BTGrpGroup14Serialized  implements InitializingBean {
   
					private BTGrp14 bTGrp14 = new BTGrp14();

						private char[] bTGrpR14 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup14
	**/
    public BTGrpGroup14() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp14.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp14
	 *	@return bTGrp14
	 */   
	 public BTGrp14 getBTGrp14() {
   	return bTGrp14;
   }
   /**
	* 	Update BTGrp14 with the passed value
	*   Corresponding COBOL Variable is WS-14B-T-GRP
	*	@param value
	*/
   public void setBTGrp14(char[] value) {
      bTGrp14.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp14 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp14(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp14.begin,bTGrp14.length());
   }
   
     /**
	 * 	Update BTGrp14 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp14.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp14 with another Field
	 *	@param value
	 */
   public void setBTGrp14(Field source) {
   	replace(source,0,source.length(),bTGrp14.begin,bTGrp14.length());
   }  
   
     /**
	 * 	Update BTGrp14 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp14(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp14.begin,bTGrp14.length());
   }
   
     /**
	 * 	Update BTGrp14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp14.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR14
	 *	@return bTGrpR14
	 */
   public char[] getBTGrpR14() throws CFException{
     if (isBTGrpR14Modified()) { 
        bTGrpR14 = refreshBTGrpR14();
     }
   		return bTGrpR14;
   }

  
	/**
	*  set variable bTGrpR14
	*  Corresponding COBOL Variable is WS-14B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR14(char[] value) {
      bTGrpR14 = checkBTGrpR14Constraints(value);
      serializeBTGrpR14(bTGrpR14);
   } 

     /**
	 * 	Update BTGrpR14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR14,bTGrpR14.length);
   	
   }
   
   public void setBTGrpR14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR14,bTGrpR14.length);
   	
   }
   
     /**
	 * 	Update BTGrpR14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR14 with another Field
	 *	@param value
	 */
   public void setBTGrpR14(Field source) {
       replace(source,0,source.length(),beginBTGrpR14,B_TGRP_R_14_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR14,B_TGRP_R_14_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR14+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup14FieldLength() {
			return B_TGRP_GROUP_14_LENGTH;
		}

}
  
