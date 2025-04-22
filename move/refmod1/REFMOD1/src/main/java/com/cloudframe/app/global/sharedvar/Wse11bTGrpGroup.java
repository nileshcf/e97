package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse11bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse11bTGrpGroup")

public class Wse11bTGrpGroup extends Wse11bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse11bTGrp wse11bTGrp = new Wse11bTGrp();

						private char[] wse11bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse11bTGrpGroup
	**/
    public Wse11bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse11bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse11bTGrp
	 *	@return wse11bTGrp
	 */   
	 public Wse11bTGrp getWse11bTGrp() {
   	return wse11bTGrp;
   }
   /**
	* 	Update Wse11bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-11B-T-GRP
	*	@param value
	*/
   public void setWse11bTGrp(char[] value) {
      wse11bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse11bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse11bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11bTGrp.begin,wse11bTGrp.length());
   }
   
     /**
	 * 	Update Wse11bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse11bTGrp with another Field
	 *	@param value
	 */
   public void setWse11bTGrp(Field source) {
   	replace(source,0,source.length(),wse11bTGrp.begin,wse11bTGrp.length());
   }  
   
     /**
	 * 	Update Wse11bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse11bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse11bTGrp.begin,wse11bTGrp.length());
   }
   
     /**
	 * 	Update Wse11bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse11bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse11bTGrpR
	 *	@return wse11bTGrpR
	 */
   public char[] getWse11bTGrpR() throws CFException{
     if (isWse11bTGrpRModified()) { 
        wse11bTGrpR = refreshWse11bTGrpR();
     }
   		return wse11bTGrpR;
   }

  
	/**
	*  set variable wse11bTGrpR
	*  Corresponding COBOL Variable is WSE-11B-T-GRP-R
	*  @param value
	**/
   public void setWse11bTGrpR(char[] value) {
      wse11bTGrpR = checkWse11bTGrpRConstraints(value);
      serializeWse11bTGrpR(wse11bTGrpR);
   } 

     /**
	 * 	Update Wse11bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse11bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse11bTGrpR,wse11bTGrpR.length);
   	
   }
   
   public void setWse11bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTGrpR,wse11bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse11bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse11bTGrpR with another Field
	 *	@param value
	 */
   public void setWse11bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse11bTGrpR,WSE_11B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse11bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse11bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse11bTGrpR,WSE_11B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse11bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse11bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse11bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse11bTGrpGroupFieldLength() {
			return WSE_11B_TGRP_GROUP_LENGTH;
		}

}
  
