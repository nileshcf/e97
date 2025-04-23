package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse18aTGrpGroup")

public class Wse18aTGrpGroup extends Wse18aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse18aTGrp wse18aTGrp = new Wse18aTGrp();

						private char[] wse18aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse18aTGrpGroup
	**/
    public Wse18aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse18aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse18aTGrp
	 *	@return wse18aTGrp
	 */   
	 public Wse18aTGrp getWse18aTGrp() {
   	return wse18aTGrp;
   }
   /**
	* 	Update Wse18aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-18A-T-GRP
	*	@param value
	*/
   public void setWse18aTGrp(char[] value) {
      wse18aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse18aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse18aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18aTGrp.begin,wse18aTGrp.length());
   }
   
     /**
	 * 	Update Wse18aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse18aTGrp with another Field
	 *	@param value
	 */
   public void setWse18aTGrp(Field source) {
   	replace(source,0,source.length(),wse18aTGrp.begin,wse18aTGrp.length());
   }  
   
     /**
	 * 	Update Wse18aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse18aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18aTGrp.begin,wse18aTGrp.length());
   }
   
     /**
	 * 	Update Wse18aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse18aTGrpR
	 *	@return wse18aTGrpR
	 */
   public char[] getWse18aTGrpR() throws CFException{
     if (isWse18aTGrpRModified()) { 
        wse18aTGrpR = refreshWse18aTGrpR();
     }
   		return wse18aTGrpR;
   }

  
	/**
	*  set variable wse18aTGrpR
	*  Corresponding COBOL Variable is WSE-18A-T-GRP-R
	*  @param value
	**/
   public void setWse18aTGrpR(char[] value) {
      wse18aTGrpR = checkWse18aTGrpRConstraints(value);
      serializeWse18aTGrpR(wse18aTGrpR);
   } 

     /**
	 * 	Update Wse18aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18aTGrpR,wse18aTGrpR.length);
   	
   }
   
   public void setWse18aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTGrpR,wse18aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse18aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18aTGrpR with another Field
	 *	@param value
	 */
   public void setWse18aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse18aTGrpR,WSE_18A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18aTGrpR,WSE_18A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse18aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse18aTGrpGroupFieldLength() {
			return WSE_18A_TGRP_GROUP_LENGTH;
		}

}
  
