package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse17bTGrpGroup")

public class Wse17bTGrpGroup extends Wse17bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse17bTGrp wse17bTGrp = new Wse17bTGrp();

						private char[] wse17bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse17bTGrpGroup
	**/
    public Wse17bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse17bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse17bTGrp
	 *	@return wse17bTGrp
	 */   
	 public Wse17bTGrp getWse17bTGrp() {
   	return wse17bTGrp;
   }
   /**
	* 	Update Wse17bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-17B-T-GRP
	*	@param value
	*/
   public void setWse17bTGrp(char[] value) {
      wse17bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse17bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse17bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17bTGrp.begin,wse17bTGrp.length());
   }
   
     /**
	 * 	Update Wse17bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse17bTGrp with another Field
	 *	@param value
	 */
   public void setWse17bTGrp(Field source) {
   	replace(source,0,source.length(),wse17bTGrp.begin,wse17bTGrp.length());
   }  
   
     /**
	 * 	Update Wse17bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse17bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17bTGrp.begin,wse17bTGrp.length());
   }
   
     /**
	 * 	Update Wse17bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse17bTGrpR
	 *	@return wse17bTGrpR
	 */
   public char[] getWse17bTGrpR() throws CFException{
     if (isWse17bTGrpRModified()) { 
        wse17bTGrpR = refreshWse17bTGrpR();
     }
   		return wse17bTGrpR;
   }

  
	/**
	*  set variable wse17bTGrpR
	*  Corresponding COBOL Variable is WSE-17B-T-GRP-R
	*  @param value
	**/
   public void setWse17bTGrpR(char[] value) {
      wse17bTGrpR = checkWse17bTGrpRConstraints(value);
      serializeWse17bTGrpR(wse17bTGrpR);
   } 

     /**
	 * 	Update Wse17bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17bTGrpR,wse17bTGrpR.length);
   	
   }
   
   public void setWse17bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTGrpR,wse17bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse17bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17bTGrpR with another Field
	 *	@param value
	 */
   public void setWse17bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse17bTGrpR,WSE_17B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17bTGrpR,WSE_17B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse17bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse17bTGrpGroupFieldLength() {
			return WSE_17B_TGRP_GROUP_LENGTH;
		}

}
  
