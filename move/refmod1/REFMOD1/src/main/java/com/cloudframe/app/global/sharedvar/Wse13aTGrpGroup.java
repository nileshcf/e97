package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse13aTGrpGroup")

public class Wse13aTGrpGroup extends Wse13aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse13aTGrp wse13aTGrp = new Wse13aTGrp();

						private char[] wse13aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse13aTGrpGroup
	**/
    public Wse13aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse13aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse13aTGrp
	 *	@return wse13aTGrp
	 */   
	 public Wse13aTGrp getWse13aTGrp() {
   	return wse13aTGrp;
   }
   /**
	* 	Update Wse13aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-13A-T-GRP
	*	@param value
	*/
   public void setWse13aTGrp(char[] value) {
      wse13aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse13aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse13aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13aTGrp.begin,wse13aTGrp.length());
   }
   
     /**
	 * 	Update Wse13aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse13aTGrp with another Field
	 *	@param value
	 */
   public void setWse13aTGrp(Field source) {
   	replace(source,0,source.length(),wse13aTGrp.begin,wse13aTGrp.length());
   }  
   
     /**
	 * 	Update Wse13aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse13aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13aTGrp.begin,wse13aTGrp.length());
   }
   
     /**
	 * 	Update Wse13aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse13aTGrpR
	 *	@return wse13aTGrpR
	 */
   public char[] getWse13aTGrpR() throws CFException{
     if (isWse13aTGrpRModified()) { 
        wse13aTGrpR = refreshWse13aTGrpR();
     }
   		return wse13aTGrpR;
   }

  
	/**
	*  set variable wse13aTGrpR
	*  Corresponding COBOL Variable is WSE-13A-T-GRP-R
	*  @param value
	**/
   public void setWse13aTGrpR(char[] value) {
      wse13aTGrpR = checkWse13aTGrpRConstraints(value);
      serializeWse13aTGrpR(wse13aTGrpR);
   } 

     /**
	 * 	Update Wse13aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13aTGrpR,wse13aTGrpR.length);
   	
   }
   
   public void setWse13aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTGrpR,wse13aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse13aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13aTGrpR with another Field
	 *	@param value
	 */
   public void setWse13aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse13aTGrpR,WSE_13A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13aTGrpR,WSE_13A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse13aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse13aTGrpGroupFieldLength() {
			return WSE_13A_TGRP_GROUP_LENGTH;
		}

}
  
