package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse18bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse18bTGrpGroup")

public class Wse18bTGrpGroup extends Wse18bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse18bTGrp wse18bTGrp = new Wse18bTGrp();

						private char[] wse18bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse18bTGrpGroup
	**/
    public Wse18bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse18bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse18bTGrp
	 *	@return wse18bTGrp
	 */   
	 public Wse18bTGrp getWse18bTGrp() {
   	return wse18bTGrp;
   }
   /**
	* 	Update Wse18bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-18B-T-GRP
	*	@param value
	*/
   public void setWse18bTGrp(char[] value) {
      wse18bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse18bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse18bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18bTGrp.begin,wse18bTGrp.length());
   }
   
     /**
	 * 	Update Wse18bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse18bTGrp with another Field
	 *	@param value
	 */
   public void setWse18bTGrp(Field source) {
   	replace(source,0,source.length(),wse18bTGrp.begin,wse18bTGrp.length());
   }  
   
     /**
	 * 	Update Wse18bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse18bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse18bTGrp.begin,wse18bTGrp.length());
   }
   
     /**
	 * 	Update Wse18bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse18bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse18bTGrpR
	 *	@return wse18bTGrpR
	 */
   public char[] getWse18bTGrpR() throws CFException{
     if (isWse18bTGrpRModified()) { 
        wse18bTGrpR = refreshWse18bTGrpR();
     }
   		return wse18bTGrpR;
   }

  
	/**
	*  set variable wse18bTGrpR
	*  Corresponding COBOL Variable is WSE-18B-T-GRP-R
	*  @param value
	**/
   public void setWse18bTGrpR(char[] value) {
      wse18bTGrpR = checkWse18bTGrpRConstraints(value);
      serializeWse18bTGrpR(wse18bTGrpR);
   } 

     /**
	 * 	Update Wse18bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse18bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse18bTGrpR,wse18bTGrpR.length);
   	
   }
   
   public void setWse18bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTGrpR,wse18bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse18bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse18bTGrpR with another Field
	 *	@param value
	 */
   public void setWse18bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse18bTGrpR,WSE_18B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse18bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse18bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse18bTGrpR,WSE_18B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse18bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse18bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse18bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse18bTGrpGroupFieldLength() {
			return WSE_18B_TGRP_GROUP_LENGTH;
		}

}
  
