package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse10bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse10bTGrpGroup")

public class Wse10bTGrpGroup extends Wse10bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse10bTGrp wse10bTGrp = new Wse10bTGrp();

						private char[] wse10bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse10bTGrpGroup
	**/
    public Wse10bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse10bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse10bTGrp
	 *	@return wse10bTGrp
	 */   
	 public Wse10bTGrp getWse10bTGrp() {
   	return wse10bTGrp;
   }
   /**
	* 	Update Wse10bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-10B-T-GRP
	*	@param value
	*/
   public void setWse10bTGrp(char[] value) {
      wse10bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse10bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse10bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10bTGrp.begin,wse10bTGrp.length());
   }
   
     /**
	 * 	Update Wse10bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse10bTGrp with another Field
	 *	@param value
	 */
   public void setWse10bTGrp(Field source) {
   	replace(source,0,source.length(),wse10bTGrp.begin,wse10bTGrp.length());
   }  
   
     /**
	 * 	Update Wse10bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse10bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse10bTGrp.begin,wse10bTGrp.length());
   }
   
     /**
	 * 	Update Wse10bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse10bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse10bTGrpR
	 *	@return wse10bTGrpR
	 */
   public char[] getWse10bTGrpR() throws CFException{
     if (isWse10bTGrpRModified()) { 
        wse10bTGrpR = refreshWse10bTGrpR();
     }
   		return wse10bTGrpR;
   }

  
	/**
	*  set variable wse10bTGrpR
	*  Corresponding COBOL Variable is WSE-10B-T-GRP-R
	*  @param value
	**/
   public void setWse10bTGrpR(char[] value) {
      wse10bTGrpR = checkWse10bTGrpRConstraints(value);
      serializeWse10bTGrpR(wse10bTGrpR);
   } 

     /**
	 * 	Update Wse10bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse10bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse10bTGrpR,wse10bTGrpR.length);
   	
   }
   
   public void setWse10bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTGrpR,wse10bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse10bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse10bTGrpR with another Field
	 *	@param value
	 */
   public void setWse10bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse10bTGrpR,WSE_10B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse10bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse10bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse10bTGrpR,WSE_10B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse10bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse10bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse10bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse10bTGrpGroupFieldLength() {
			return WSE_10B_TGRP_GROUP_LENGTH;
		}

}
  
