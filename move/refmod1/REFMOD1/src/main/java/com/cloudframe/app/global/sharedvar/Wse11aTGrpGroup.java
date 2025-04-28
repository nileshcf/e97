package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse11aTGrpGroup")

public class Wse11aTGrpGroup extends Wse11aTGrpGroupSerialized  implements InitializingBean {
   
					private Wse11aTGrp wse11aTGrp = new Wse11aTGrp();

						private char[] wse11aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse11aTGrpGroup
	**/
    public Wse11aTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse11aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse11aTGrp
	 *	@return wse11aTGrp
	 */   
	 public Wse11aTGrp getWse11aTGrp() {
   	return wse11aTGrp;
   }
   /**
	* 	Update Wse11aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-11A-T-GRP
	*	@param value
	*/
   public void setWse11aTGrp(char[] value) {
      wse11aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse11aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse11aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11aTGrp.begin,wse11aTGrp.length());
   }
   
     /**
	 * 	Update Wse11aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse11aTGrp with another Field
	 *	@param value
	 */
   public void setWse11aTGrp(Field source) {
   	replace(source,0,source.length(),wse11aTGrp.begin,wse11aTGrp.length());
   }  
   
     /**
	 * 	Update Wse11aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse11aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11aTGrp.begin,wse11aTGrp.length());
   }
   
     /**
	 * 	Update Wse11aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse11aTGrpR
	 *	@return wse11aTGrpR
	 */
   public char[] getWse11aTGrpR() throws CFException{
     if (isWse11aTGrpRModified()) { 
        wse11aTGrpR = refreshWse11aTGrpR();
     }
   		return wse11aTGrpR;
   }

  
	/**
	*  set variable wse11aTGrpR
	*  Corresponding COBOL Variable is WSE-11A-T-GRP-R
	*  @param value
	**/
   public void setWse11aTGrpR(char[] value) {
      wse11aTGrpR = checkWse11aTGrpRConstraints(value);
      serializeWse11aTGrpR(wse11aTGrpR);
   } 

     /**
	 * 	Update Wse11aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11aTGrpR,wse11aTGrpR.length);
   	
   }
   
   public void setWse11aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aTGrpR,wse11aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse11aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11aTGrpR with another Field
	 *	@param value
	 */
   public void setWse11aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse11aTGrpR,WSE_11A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11aTGrpR,WSE_11A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse11aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse11aTGrpGroupFieldLength() {
			return WSE_11A_TGRP_GROUP_LENGTH;
		}

}
  
