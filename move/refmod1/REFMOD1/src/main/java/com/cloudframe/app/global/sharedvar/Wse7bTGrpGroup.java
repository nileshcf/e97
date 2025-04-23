package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse7bTGrpGroup")

public class Wse7bTGrpGroup extends Wse7bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse7bTGrp wse7bTGrp = new Wse7bTGrp();

						private char[] wse7bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse7bTGrpGroup
	**/
    public Wse7bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse7bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse7bTGrp
	 *	@return wse7bTGrp
	 */   
	 public Wse7bTGrp getWse7bTGrp() {
   	return wse7bTGrp;
   }
   /**
	* 	Update Wse7bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-7B-T-GRP
	*	@param value
	*/
   public void setWse7bTGrp(char[] value) {
      wse7bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse7bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse7bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7bTGrp.begin,wse7bTGrp.length());
   }
   
     /**
	 * 	Update Wse7bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse7bTGrp with another Field
	 *	@param value
	 */
   public void setWse7bTGrp(Field source) {
   	replace(source,0,source.length(),wse7bTGrp.begin,wse7bTGrp.length());
   }  
   
     /**
	 * 	Update Wse7bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse7bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7bTGrp.begin,wse7bTGrp.length());
   }
   
     /**
	 * 	Update Wse7bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse7bTGrpR
	 *	@return wse7bTGrpR
	 */
   public char[] getWse7bTGrpR() throws CFException{
     if (isWse7bTGrpRModified()) { 
        wse7bTGrpR = refreshWse7bTGrpR();
     }
   		return wse7bTGrpR;
   }

  
	/**
	*  set variable wse7bTGrpR
	*  Corresponding COBOL Variable is WSE-7B-T-GRP-R
	*  @param value
	**/
   public void setWse7bTGrpR(char[] value) {
      wse7bTGrpR = checkWse7bTGrpRConstraints(value);
      serializeWse7bTGrpR(wse7bTGrpR);
   } 

     /**
	 * 	Update Wse7bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7bTGrpR,wse7bTGrpR.length);
   	
   }
   
   public void setWse7bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTGrpR,wse7bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse7bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7bTGrpR with another Field
	 *	@param value
	 */
   public void setWse7bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse7bTGrpR,WSE_7B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7bTGrpR,WSE_7B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse7bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse7bTGrpGroupFieldLength() {
			return WSE_7B_TGRP_GROUP_LENGTH;
		}

}
  
