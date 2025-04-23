package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse20aTGrpGroup")

public class Wse20aTGrpGroup extends Wse20aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse20aTGrp wse20aTGrp = new Wse20aTGrp();

						private char[] wse20aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse20aTGrpGroup
	**/
    public Wse20aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse20aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse20aTGrp
	 *	@return wse20aTGrp
	 */   
	 public Wse20aTGrp getWse20aTGrp() {
   	return wse20aTGrp;
   }
   /**
	* 	Update Wse20aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-20A-T-GRP
	*	@param value
	*/
   public void setWse20aTGrp(char[] value) {
      wse20aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse20aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse20aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20aTGrp.begin,wse20aTGrp.length());
   }
   
     /**
	 * 	Update Wse20aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse20aTGrp with another Field
	 *	@param value
	 */
   public void setWse20aTGrp(Field source) {
   	replace(source,0,source.length(),wse20aTGrp.begin,wse20aTGrp.length());
   }  
   
     /**
	 * 	Update Wse20aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse20aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20aTGrp.begin,wse20aTGrp.length());
   }
   
     /**
	 * 	Update Wse20aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse20aTGrpR
	 *	@return wse20aTGrpR
	 */
   public char[] getWse20aTGrpR() throws CFException{
     if (isWse20aTGrpRModified()) { 
        wse20aTGrpR = refreshWse20aTGrpR();
     }
   		return wse20aTGrpR;
   }

  
	/**
	*  set variable wse20aTGrpR
	*  Corresponding COBOL Variable is WSE-20A-T-GRP-R
	*  @param value
	**/
   public void setWse20aTGrpR(char[] value) {
      wse20aTGrpR = checkWse20aTGrpRConstraints(value);
      serializeWse20aTGrpR(wse20aTGrpR);
   } 

     /**
	 * 	Update Wse20aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20aTGrpR,wse20aTGrpR.length);
   	
   }
   
   public void setWse20aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTGrpR,wse20aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse20aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20aTGrpR with another Field
	 *	@param value
	 */
   public void setWse20aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse20aTGrpR,WSE_20A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20aTGrpR,WSE_20A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse20aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse20aTGrpGroupFieldLength() {
			return WSE_20A_TGRP_GROUP_LENGTH;
		}

}
  
