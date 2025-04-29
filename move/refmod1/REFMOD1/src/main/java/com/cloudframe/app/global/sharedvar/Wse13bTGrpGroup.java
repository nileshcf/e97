package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse13bTGrpGroup")

public class Wse13bTGrpGroup extends Wse13bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse13bTGrp wse13bTGrp = new Wse13bTGrp();

						private char[] wse13bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse13bTGrpGroup
	**/
    public Wse13bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse13bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse13bTGrp
	 *	@return wse13bTGrp
	 */   
	 public Wse13bTGrp getWse13bTGrp() {
   	return wse13bTGrp;
   }
   /**
	* 	Update Wse13bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-13B-T-GRP
	*	@param value
	*/
   public void setWse13bTGrp(char[] value) {
      wse13bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse13bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse13bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13bTGrp.begin,wse13bTGrp.length());
   }
   
     /**
	 * 	Update Wse13bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse13bTGrp with another Field
	 *	@param value
	 */
   public void setWse13bTGrp(Field source) {
   	replace(source,0,source.length(),wse13bTGrp.begin,wse13bTGrp.length());
   }  
   
     /**
	 * 	Update Wse13bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse13bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13bTGrp.begin,wse13bTGrp.length());
   }
   
     /**
	 * 	Update Wse13bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse13bTGrpR
	 *	@return wse13bTGrpR
	 */
   public char[] getWse13bTGrpR() throws CFException{
     if (isWse13bTGrpRModified()) { 
        wse13bTGrpR = refreshWse13bTGrpR();
     }
   		return wse13bTGrpR;
   }

  
	/**
	*  set variable wse13bTGrpR
	*  Corresponding COBOL Variable is WSE-13B-T-GRP-R
	*  @param value
	**/
   public void setWse13bTGrpR(char[] value) {
      wse13bTGrpR = checkWse13bTGrpRConstraints(value);
      serializeWse13bTGrpR(wse13bTGrpR);
   } 

     /**
	 * 	Update Wse13bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse13bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse13bTGrpR,wse13bTGrpR.length);
   	
   }
   
   public void setWse13bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTGrpR,wse13bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse13bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse13bTGrpR with another Field
	 *	@param value
	 */
   public void setWse13bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse13bTGrpR,WSE_13B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse13bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse13bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse13bTGrpR,WSE_13B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse13bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse13bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse13bTGrpGroupFieldLength() {
			return WSE_13B_TGRP_GROUP_LENGTH;
		}

}
  
