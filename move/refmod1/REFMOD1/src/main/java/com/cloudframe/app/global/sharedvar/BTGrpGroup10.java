package com.cloudframe.app.global.sharedvar;

/**
*  The class BTGrpGroup10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_bTGrpGroup10")

public class BTGrpGroup10 extends BTGrpGroup10Serialized  implements InitializingBean {
   
					private BTGrp10 bTGrp10 = new BTGrp10();

						private char[] bTGrpR10 = Field.fillLowValue(60);
	
	/**
	* Constructor for BTGrpGroup10
	**/
    public BTGrpGroup10() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			bTGrp10.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of bTGrp10
	 *	@return bTGrp10
	 */   
	 public BTGrp10 getBTGrp10() {
   	return bTGrp10;
   }
   /**
	* 	Update BTGrp10 with the passed value
	*   Corresponding COBOL Variable is WS-10B-T-GRP
	*	@param value
	*/
   public void setBTGrp10(char[] value) {
      bTGrp10.setString(value); 
   }   
    
     /**
	 * 	Update BTGrp10 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBTGrp10(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp10.begin,bTGrp10.length());
   }
   
     /**
	 * 	Update BTGrp10 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp10.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BTGrp10 with another Field
	 *	@param value
	 */
   public void setBTGrp10(Field source) {
   	replace(source,0,source.length(),bTGrp10.begin,bTGrp10.length());
   }  
   
     /**
	 * 	Update BTGrp10 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBTGrp10(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp10.begin,bTGrp10.length());
   }
   
     /**
	 * 	Update BTGrp10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrp10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,bTGrp10.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of bTGrpR10
	 *	@return bTGrpR10
	 */
   public char[] getBTGrpR10() throws CFException{
     if (isBTGrpR10Modified()) { 
        bTGrpR10 = refreshBTGrpR10();
     }
   		return bTGrpR10;
   }

  
	/**
	*  set variable bTGrpR10
	*  Corresponding COBOL Variable is WS-10B-T-GRP-R
	*  @param value
	**/
   public void setBTGrpR10(char[] value) {
      bTGrpR10 = checkBTGrpR10Constraints(value);
      serializeBTGrpR10(bTGrpR10);
   } 

     /**
	 * 	Update BTGrpR10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTGrpR10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTGrpR10,bTGrpR10.length);
   	
   }
   
   public void setBTGrpR10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR10,bTGrpR10.length);
   	
   }
   
     /**
	 * 	Update BTGrpR10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTGrpR10 with another Field
	 *	@param value
	 */
   public void setBTGrpR10(Field source) {
       replace(source,0,source.length(),beginBTGrpR10,B_TGRP_R_10_LEN);
   	
   }  
   
     /**
	 * 	Update BTGrpR10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTGrpR10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTGrpR10,B_TGRP_R_10_LEN);
   	
   }
   
     /**
	 * 	Update BTGrpR10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTGrpR10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTGrpR10+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBTGrpGroup10FieldLength() {
			return B_TGRP_GROUP_10_LENGTH;
		}

}
  
