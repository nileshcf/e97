package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse14bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse14bTGrpGroup")

public class Wse14bTGrpGroup extends Wse14bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse14bTGrp wse14bTGrp = new Wse14bTGrp();

						private char[] wse14bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse14bTGrpGroup
	**/
    public Wse14bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse14bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse14bTGrp
	 *	@return wse14bTGrp
	 */   
	 public Wse14bTGrp getWse14bTGrp() {
   	return wse14bTGrp;
   }
   /**
	* 	Update Wse14bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-14B-T-GRP
	*	@param value
	*/
   public void setWse14bTGrp(char[] value) {
      wse14bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse14bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse14bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14bTGrp.begin,wse14bTGrp.length());
   }
   
     /**
	 * 	Update Wse14bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse14bTGrp with another Field
	 *	@param value
	 */
   public void setWse14bTGrp(Field source) {
   	replace(source,0,source.length(),wse14bTGrp.begin,wse14bTGrp.length());
   }  
   
     /**
	 * 	Update Wse14bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse14bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse14bTGrp.begin,wse14bTGrp.length());
   }
   
     /**
	 * 	Update Wse14bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse14bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse14bTGrpR
	 *	@return wse14bTGrpR
	 */
   public char[] getWse14bTGrpR() throws CFException{
     if (isWse14bTGrpRModified()) { 
        wse14bTGrpR = refreshWse14bTGrpR();
     }
   		return wse14bTGrpR;
   }

  
	/**
	*  set variable wse14bTGrpR
	*  Corresponding COBOL Variable is WSE-14B-T-GRP-R
	*  @param value
	**/
   public void setWse14bTGrpR(char[] value) {
      wse14bTGrpR = checkWse14bTGrpRConstraints(value);
      serializeWse14bTGrpR(wse14bTGrpR);
   } 

     /**
	 * 	Update Wse14bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse14bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse14bTGrpR,wse14bTGrpR.length);
   	
   }
   
   public void setWse14bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTGrpR,wse14bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse14bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse14bTGrpR with another Field
	 *	@param value
	 */
   public void setWse14bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse14bTGrpR,WSE_14B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse14bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse14bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse14bTGrpR,WSE_14B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse14bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse14bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse14bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse14bTGrpGroupFieldLength() {
			return WSE_14B_TGRP_GROUP_LENGTH;
		}

}
  
