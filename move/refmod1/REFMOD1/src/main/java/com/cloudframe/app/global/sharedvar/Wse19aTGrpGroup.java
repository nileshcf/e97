package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse19aTGrpGroup")

public class Wse19aTGrpGroup extends Wse19aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse19aTGrp wse19aTGrp = new Wse19aTGrp();

						private char[] wse19aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse19aTGrpGroup
	**/
    public Wse19aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse19aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse19aTGrp
	 *	@return wse19aTGrp
	 */   
	 public Wse19aTGrp getWse19aTGrp() {
   	return wse19aTGrp;
   }
   /**
	* 	Update Wse19aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-19A-T-GRP
	*	@param value
	*/
   public void setWse19aTGrp(char[] value) {
      wse19aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse19aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse19aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19aTGrp.begin,wse19aTGrp.length());
   }
   
     /**
	 * 	Update Wse19aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse19aTGrp with another Field
	 *	@param value
	 */
   public void setWse19aTGrp(Field source) {
   	replace(source,0,source.length(),wse19aTGrp.begin,wse19aTGrp.length());
   }  
   
     /**
	 * 	Update Wse19aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse19aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19aTGrp.begin,wse19aTGrp.length());
   }
   
     /**
	 * 	Update Wse19aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse19aTGrpR
	 *	@return wse19aTGrpR
	 */
   public char[] getWse19aTGrpR() throws CFException{
     if (isWse19aTGrpRModified()) { 
        wse19aTGrpR = refreshWse19aTGrpR();
     }
   		return wse19aTGrpR;
   }

  
	/**
	*  set variable wse19aTGrpR
	*  Corresponding COBOL Variable is WSE-19A-T-GRP-R
	*  @param value
	**/
   public void setWse19aTGrpR(char[] value) {
      wse19aTGrpR = checkWse19aTGrpRConstraints(value);
      serializeWse19aTGrpR(wse19aTGrpR);
   } 

     /**
	 * 	Update Wse19aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19aTGrpR,wse19aTGrpR.length);
   	
   }
   
   public void setWse19aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTGrpR,wse19aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse19aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19aTGrpR with another Field
	 *	@param value
	 */
   public void setWse19aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse19aTGrpR,WSE_19A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19aTGrpR,WSE_19A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse19aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse19aTGrpGroupFieldLength() {
			return WSE_19A_TGRP_GROUP_LENGTH;
		}

}
  
