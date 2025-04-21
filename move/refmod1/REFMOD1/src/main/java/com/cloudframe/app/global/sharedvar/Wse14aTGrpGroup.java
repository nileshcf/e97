package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse14aTGrpGroup")

public class Wse14aTGrpGroup extends Wse14aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse14aTGrp wse14aTGrp = new Wse14aTGrp();

						private char[] wse14aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14aTGrpGroup
	**/
    public Wse14aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse14aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse14aTGrp
	 *	@return wse14aTGrp
	 */   
	 public Wse14aTGrp getWse14aTGrp() {
   	return wse14aTGrp;
   }
   /**
	* 	Update Wse14aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-14A-T-GRP
	*	@param value
	*/
   public void setWse14aTGrp(char[] value) {
      wse14aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse14aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse14aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14aTGrp.begin,wse14aTGrp.length());
   }
   
     /**
	 * 	Update Wse14aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse14aTGrp with another Field
	 *	@param value
	 */
   public void setWse14aTGrp(Field source) {
   	replace(source,0,source.length(),wse14aTGrp.begin,wse14aTGrp.length());
   }  
   
     /**
	 * 	Update Wse14aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse14aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14aTGrp.begin,wse14aTGrp.length());
   }
   
     /**
	 * 	Update Wse14aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse14aTGrpR
	 *	@return wse14aTGrpR
	 */
   public char[] getWse14aTGrpR() throws CFException{
     if (isWse14aTGrpRModified()) { 
        wse14aTGrpR = refreshWse14aTGrpR();
     }
   		return wse14aTGrpR;
   }

  
	/**
	*  set variable wse14aTGrpR
	*  Corresponding COBOL Variable is WSE-14A-T-GRP-R
	*  @param value
	**/
   public void setWse14aTGrpR(char[] value) {
      wse14aTGrpR = checkWse14aTGrpRConstraints(value);
      serializeWse14aTGrpR(wse14aTGrpR);
   } 

     /**
	 * 	Update Wse14aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14aTGrpR,wse14aTGrpR.length);
   	
   }
   
   public void setWse14aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTGrpR,wse14aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse14aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14aTGrpR with another Field
	 *	@param value
	 */
   public void setWse14aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse14aTGrpR,WSE_14A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14aTGrpR,WSE_14A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse14aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse14aTGrpGroupFieldLength() {
			return WSE_14A_TGRP_GROUP_LENGTH;
		}

}
  
