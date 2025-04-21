package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse9aTGrpGroup")

public class Wse9aTGrpGroup extends Wse9aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse9aTGrp wse9aTGrp = new Wse9aTGrp();

						private char[] wse9aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse9aTGrpGroup
	**/
    public Wse9aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse9aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse9aTGrp
	 *	@return wse9aTGrp
	 */   
	 public Wse9aTGrp getWse9aTGrp() {
   	return wse9aTGrp;
   }
   /**
	* 	Update Wse9aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-9A-T-GRP
	*	@param value
	*/
   public void setWse9aTGrp(char[] value) {
      wse9aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse9aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse9aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9aTGrp.begin,wse9aTGrp.length());
   }
   
     /**
	 * 	Update Wse9aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse9aTGrp with another Field
	 *	@param value
	 */
   public void setWse9aTGrp(Field source) {
   	replace(source,0,source.length(),wse9aTGrp.begin,wse9aTGrp.length());
   }  
   
     /**
	 * 	Update Wse9aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse9aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9aTGrp.begin,wse9aTGrp.length());
   }
   
     /**
	 * 	Update Wse9aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse9aTGrpR
	 *	@return wse9aTGrpR
	 */
   public char[] getWse9aTGrpR() throws CFException{
     if (isWse9aTGrpRModified()) { 
        wse9aTGrpR = refreshWse9aTGrpR();
     }
   		return wse9aTGrpR;
   }

  
	/**
	*  set variable wse9aTGrpR
	*  Corresponding COBOL Variable is WSE-9A-T-GRP-R
	*  @param value
	**/
   public void setWse9aTGrpR(char[] value) {
      wse9aTGrpR = checkWse9aTGrpRConstraints(value);
      serializeWse9aTGrpR(wse9aTGrpR);
   } 

     /**
	 * 	Update Wse9aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9aTGrpR,wse9aTGrpR.length);
   	
   }
   
   public void setWse9aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTGrpR,wse9aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse9aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9aTGrpR with another Field
	 *	@param value
	 */
   public void setWse9aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse9aTGrpR,WSE_9A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9aTGrpR,WSE_9A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse9aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse9aTGrpGroupFieldLength() {
			return WSE_9A_TGRP_GROUP_LENGTH;
		}

}
  
