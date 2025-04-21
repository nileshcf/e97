package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse10aTGrpGroup")

public class Wse10aTGrpGroup extends Wse10aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse10aTGrp wse10aTGrp = new Wse10aTGrp();

						private char[] wse10aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse10aTGrpGroup
	**/
    public Wse10aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse10aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse10aTGrp
	 *	@return wse10aTGrp
	 */   
	 public Wse10aTGrp getWse10aTGrp() {
   	return wse10aTGrp;
   }
   /**
	* 	Update Wse10aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-10A-T-GRP
	*	@param value
	*/
   public void setWse10aTGrp(char[] value) {
      wse10aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse10aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse10aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10aTGrp.begin,wse10aTGrp.length());
   }
   
     /**
	 * 	Update Wse10aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse10aTGrp with another Field
	 *	@param value
	 */
   public void setWse10aTGrp(Field source) {
   	replace(source,0,source.length(),wse10aTGrp.begin,wse10aTGrp.length());
   }  
   
     /**
	 * 	Update Wse10aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse10aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10aTGrp.begin,wse10aTGrp.length());
   }
   
     /**
	 * 	Update Wse10aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse10aTGrpR
	 *	@return wse10aTGrpR
	 */
   public char[] getWse10aTGrpR() throws CFException{
     if (isWse10aTGrpRModified()) { 
        wse10aTGrpR = refreshWse10aTGrpR();
     }
   		return wse10aTGrpR;
   }

  
	/**
	*  set variable wse10aTGrpR
	*  Corresponding COBOL Variable is WSE-10A-T-GRP-R
	*  @param value
	**/
   public void setWse10aTGrpR(char[] value) {
      wse10aTGrpR = checkWse10aTGrpRConstraints(value);
      serializeWse10aTGrpR(wse10aTGrpR);
   } 

     /**
	 * 	Update Wse10aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10aTGrpR,wse10aTGrpR.length);
   	
   }
   
   public void setWse10aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTGrpR,wse10aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse10aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10aTGrpR with another Field
	 *	@param value
	 */
   public void setWse10aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse10aTGrpR,WSE_10A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10aTGrpR,WSE_10A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse10aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse10aTGrpGroupFieldLength() {
			return WSE_10A_TGRP_GROUP_LENGTH;
		}

}
  
