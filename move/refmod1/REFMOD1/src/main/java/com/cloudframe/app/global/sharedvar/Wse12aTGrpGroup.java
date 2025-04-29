package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse12aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse12aTGrpGroup")

public class Wse12aTGrpGroup extends Wse12aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse12aTGrp wse12aTGrp = new Wse12aTGrp();

						private char[] wse12aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse12aTGrpGroup
	**/
    public Wse12aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse12aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse12aTGrp
	 *	@return wse12aTGrp
	 */   
	 public Wse12aTGrp getWse12aTGrp() {
   	return wse12aTGrp;
   }
   /**
	* 	Update Wse12aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-12A-T-GRP
	*	@param value
	*/
   public void setWse12aTGrp(char[] value) {
      wse12aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse12aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse12aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12aTGrp.begin,wse12aTGrp.length());
   }
   
     /**
	 * 	Update Wse12aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse12aTGrp with another Field
	 *	@param value
	 */
   public void setWse12aTGrp(Field source) {
   	replace(source,0,source.length(),wse12aTGrp.begin,wse12aTGrp.length());
   }  
   
     /**
	 * 	Update Wse12aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse12aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12aTGrp.begin,wse12aTGrp.length());
   }
   
     /**
	 * 	Update Wse12aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse12aTGrpR
	 *	@return wse12aTGrpR
	 */
   public char[] getWse12aTGrpR() throws CFException{
     if (isWse12aTGrpRModified()) { 
        wse12aTGrpR = refreshWse12aTGrpR();
     }
   		return wse12aTGrpR;
   }

  
	/**
	*  set variable wse12aTGrpR
	*  Corresponding COBOL Variable is WSE-12A-T-GRP-R
	*  @param value
	**/
   public void setWse12aTGrpR(char[] value) {
      wse12aTGrpR = checkWse12aTGrpRConstraints(value);
      serializeWse12aTGrpR(wse12aTGrpR);
   } 

     /**
	 * 	Update Wse12aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse12aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse12aTGrpR,wse12aTGrpR.length);
   	
   }
   
   public void setWse12aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTGrpR,wse12aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse12aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse12aTGrpR with another Field
	 *	@param value
	 */
   public void setWse12aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse12aTGrpR,WSE_12A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse12aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse12aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse12aTGrpR,WSE_12A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse12aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse12aTGrpGroupFieldLength() {
			return WSE_12A_TGRP_GROUP_LENGTH;
		}

}
  
