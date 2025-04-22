package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse12bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse12bTGrpGroup")

public class Wse12bTGrpGroup extends Wse12bTGrpGroupSerialized  implements InitializingBean {
   
					private Wse12bTGrp wse12bTGrp = new Wse12bTGrp();

						private char[] wse12bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse12bTGrpGroup
	**/
    public Wse12bTGrpGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse12bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse12bTGrp
	 *	@return wse12bTGrp
	 */   
	 public Wse12bTGrp getWse12bTGrp() {
   	return wse12bTGrp;
   }
   /**
	* 	Update Wse12bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-12B-T-GRP
	*	@param value
	*/
   public void setWse12bTGrp(char[] value) {
      wse12bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse12bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse12bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12bTGrp.begin,wse12bTGrp.length());
   }
   
     /**
	 * 	Update Wse12bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse12bTGrp with another Field
	 *	@param value
	 */
   public void setWse12bTGrp(Field source) {
   	replace(source,0,source.length(),wse12bTGrp.begin,wse12bTGrp.length());
   }  
   
     /**
	 * 	Update Wse12bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse12bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse12bTGrp.begin,wse12bTGrp.length());
   }
   
     /**
	 * 	Update Wse12bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse12bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse12bTGrpR
	 *	@return wse12bTGrpR
	 */
   public char[] getWse12bTGrpR() throws CFException{
     if (isWse12bTGrpRModified()) { 
        wse12bTGrpR = refreshWse12bTGrpR();
     }
   		return wse12bTGrpR;
   }

  
	/**
	*  set variable wse12bTGrpR
	*  Corresponding COBOL Variable is WSE-12B-T-GRP-R
	*  @param value
	**/
   public void setWse12bTGrpR(char[] value) {
      wse12bTGrpR = checkWse12bTGrpRConstraints(value);
      serializeWse12bTGrpR(wse12bTGrpR);
   } 

     /**
	 * 	Update Wse12bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse12bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse12bTGrpR,wse12bTGrpR.length);
   	
   }
   
   public void setWse12bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse12bTGrpR,wse12bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse12bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse12bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse12bTGrpR with another Field
	 *	@param value
	 */
   public void setWse12bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse12bTGrpR,WSE_12B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse12bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse12bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse12bTGrpR,WSE_12B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse12bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse12bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse12bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse12bTGrpGroupFieldLength() {
			return WSE_12B_TGRP_GROUP_LENGTH;
		}

}
  
