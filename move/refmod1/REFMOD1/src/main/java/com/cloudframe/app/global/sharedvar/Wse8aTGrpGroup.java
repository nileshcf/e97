package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse8aTGrpGroup")

public class Wse8aTGrpGroup extends Wse8aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse8aTGrp wse8aTGrp = new Wse8aTGrp();

						private char[] wse8aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse8aTGrpGroup
	**/
    public Wse8aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse8aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse8aTGrp
	 *	@return wse8aTGrp
	 */   
	 public Wse8aTGrp getWse8aTGrp() {
   	return wse8aTGrp;
   }
   /**
	* 	Update Wse8aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-8A-T-GRP
	*	@param value
	*/
   public void setWse8aTGrp(char[] value) {
      wse8aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse8aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse8aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8aTGrp.begin,wse8aTGrp.length());
   }
   
     /**
	 * 	Update Wse8aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse8aTGrp with another Field
	 *	@param value
	 */
   public void setWse8aTGrp(Field source) {
   	replace(source,0,source.length(),wse8aTGrp.begin,wse8aTGrp.length());
   }  
   
     /**
	 * 	Update Wse8aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse8aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8aTGrp.begin,wse8aTGrp.length());
   }
   
     /**
	 * 	Update Wse8aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse8aTGrpR
	 *	@return wse8aTGrpR
	 */
   public char[] getWse8aTGrpR() throws CFException{
     if (isWse8aTGrpRModified()) { 
        wse8aTGrpR = refreshWse8aTGrpR();
     }
   		return wse8aTGrpR;
   }

  
	/**
	*  set variable wse8aTGrpR
	*  Corresponding COBOL Variable is WSE-8A-T-GRP-R
	*  @param value
	**/
   public void setWse8aTGrpR(char[] value) {
      wse8aTGrpR = checkWse8aTGrpRConstraints(value);
      serializeWse8aTGrpR(wse8aTGrpR);
   } 

     /**
	 * 	Update Wse8aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8aTGrpR,wse8aTGrpR.length);
   	
   }
   
   public void setWse8aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTGrpR,wse8aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse8aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8aTGrpR with another Field
	 *	@param value
	 */
   public void setWse8aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse8aTGrpR,WSE_8A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8aTGrpR,WSE_8A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse8aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse8aTGrpGroupFieldLength() {
			return WSE_8A_TGRP_GROUP_LENGTH;
		}

}
  
