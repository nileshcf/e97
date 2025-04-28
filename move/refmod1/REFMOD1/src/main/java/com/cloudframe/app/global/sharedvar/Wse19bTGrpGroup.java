package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse19bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse19bTGrpGroup")

public class Wse19bTGrpGroup extends Wse19bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse19bTGrp wse19bTGrp = new Wse19bTGrp();

						private char[] wse19bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse19bTGrpGroup
	**/
    public Wse19bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse19bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse19bTGrp
	 *	@return wse19bTGrp
	 */   
	 public Wse19bTGrp getWse19bTGrp() {
   	return wse19bTGrp;
   }
   /**
	* 	Update Wse19bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-19B-T-GRP
	*	@param value
	*/
   public void setWse19bTGrp(char[] value) {
      wse19bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse19bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse19bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19bTGrp.begin,wse19bTGrp.length());
   }
   
     /**
	 * 	Update Wse19bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse19bTGrp with another Field
	 *	@param value
	 */
   public void setWse19bTGrp(Field source) {
   	replace(source,0,source.length(),wse19bTGrp.begin,wse19bTGrp.length());
   }  
   
     /**
	 * 	Update Wse19bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse19bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse19bTGrp.begin,wse19bTGrp.length());
   }
   
     /**
	 * 	Update Wse19bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse19bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse19bTGrpR
	 *	@return wse19bTGrpR
	 */
   public char[] getWse19bTGrpR() throws CFException{
     if (isWse19bTGrpRModified()) { 
        wse19bTGrpR = refreshWse19bTGrpR();
     }
   		return wse19bTGrpR;
   }

  
	/**
	*  set variable wse19bTGrpR
	*  Corresponding COBOL Variable is WSE-19B-T-GRP-R
	*  @param value
	**/
   public void setWse19bTGrpR(char[] value) {
      wse19bTGrpR = checkWse19bTGrpRConstraints(value);
      serializeWse19bTGrpR(wse19bTGrpR);
   } 

     /**
	 * 	Update Wse19bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse19bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse19bTGrpR,wse19bTGrpR.length);
   	
   }
   
   public void setWse19bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTGrpR,wse19bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse19bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse19bTGrpR with another Field
	 *	@param value
	 */
   public void setWse19bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse19bTGrpR,WSE_19B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse19bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse19bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse19bTGrpR,WSE_19B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse19bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse19bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse19bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse19bTGrpGroupFieldLength() {
			return WSE_19B_TGRP_GROUP_LENGTH;
		}

}
  
