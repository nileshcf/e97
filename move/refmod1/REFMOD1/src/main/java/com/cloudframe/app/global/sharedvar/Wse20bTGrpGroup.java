package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse20bTGrpGroup")

public class Wse20bTGrpGroup extends Wse20bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse20bTGrp wse20bTGrp = new Wse20bTGrp();

						private char[] wse20bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse20bTGrpGroup
	**/
    public Wse20bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse20bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse20bTGrp
	 *	@return wse20bTGrp
	 */   
	 public Wse20bTGrp getWse20bTGrp() {
   	return wse20bTGrp;
   }
   /**
	* 	Update Wse20bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-20B-T-GRP
	*	@param value
	*/
   public void setWse20bTGrp(char[] value) {
      wse20bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse20bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse20bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20bTGrp.begin,wse20bTGrp.length());
   }
   
     /**
	 * 	Update Wse20bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse20bTGrp with another Field
	 *	@param value
	 */
   public void setWse20bTGrp(Field source) {
   	replace(source,0,source.length(),wse20bTGrp.begin,wse20bTGrp.length());
   }  
   
     /**
	 * 	Update Wse20bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse20bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20bTGrp.begin,wse20bTGrp.length());
   }
   
     /**
	 * 	Update Wse20bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse20bTGrpR
	 *	@return wse20bTGrpR
	 */
   public char[] getWse20bTGrpR() throws CFException{
     if (isWse20bTGrpRModified()) { 
        wse20bTGrpR = refreshWse20bTGrpR();
     }
   		return wse20bTGrpR;
   }

  
	/**
	*  set variable wse20bTGrpR
	*  Corresponding COBOL Variable is WSE-20B-T-GRP-R
	*  @param value
	**/
   public void setWse20bTGrpR(char[] value) {
      wse20bTGrpR = checkWse20bTGrpRConstraints(value);
      serializeWse20bTGrpR(wse20bTGrpR);
   } 

     /**
	 * 	Update Wse20bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20bTGrpR,wse20bTGrpR.length);
   	
   }
   
   public void setWse20bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20bTGrpR,wse20bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse20bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20bTGrpR with another Field
	 *	@param value
	 */
   public void setWse20bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse20bTGrpR,WSE_20B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20bTGrpR,WSE_20B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse20bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse20bTGrpGroupFieldLength() {
			return WSE_20B_TGRP_GROUP_LENGTH;
		}

}
  
