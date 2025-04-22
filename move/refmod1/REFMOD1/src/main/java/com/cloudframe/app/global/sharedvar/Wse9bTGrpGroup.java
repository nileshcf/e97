package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse9bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse9bTGrpGroup")

public class Wse9bTGrpGroup extends Wse9bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse9bTGrp wse9bTGrp = new Wse9bTGrp();

						private char[] wse9bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse9bTGrpGroup
	**/
    public Wse9bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse9bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse9bTGrp
	 *	@return wse9bTGrp
	 */   
	 public Wse9bTGrp getWse9bTGrp() {
   	return wse9bTGrp;
   }
   /**
	* 	Update Wse9bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-9B-T-GRP
	*	@param value
	*/
   public void setWse9bTGrp(char[] value) {
      wse9bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse9bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse9bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9bTGrp.begin,wse9bTGrp.length());
   }
   
     /**
	 * 	Update Wse9bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse9bTGrp with another Field
	 *	@param value
	 */
   public void setWse9bTGrp(Field source) {
   	replace(source,0,source.length(),wse9bTGrp.begin,wse9bTGrp.length());
   }  
   
     /**
	 * 	Update Wse9bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse9bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse9bTGrp.begin,wse9bTGrp.length());
   }
   
     /**
	 * 	Update Wse9bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse9bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse9bTGrpR
	 *	@return wse9bTGrpR
	 */
   public char[] getWse9bTGrpR() throws CFException{
     if (isWse9bTGrpRModified()) { 
        wse9bTGrpR = refreshWse9bTGrpR();
     }
   		return wse9bTGrpR;
   }

  
	/**
	*  set variable wse9bTGrpR
	*  Corresponding COBOL Variable is WSE-9B-T-GRP-R
	*  @param value
	**/
   public void setWse9bTGrpR(char[] value) {
      wse9bTGrpR = checkWse9bTGrpRConstraints(value);
      serializeWse9bTGrpR(wse9bTGrpR);
   } 

     /**
	 * 	Update Wse9bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse9bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse9bTGrpR,wse9bTGrpR.length);
   	
   }
   
   public void setWse9bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTGrpR,wse9bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse9bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse9bTGrpR with another Field
	 *	@param value
	 */
   public void setWse9bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse9bTGrpR,WSE_9B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse9bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse9bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse9bTGrpR,WSE_9B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse9bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse9bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse9bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse9bTGrpGroupFieldLength() {
			return WSE_9B_TGRP_GROUP_LENGTH;
		}

}
  
