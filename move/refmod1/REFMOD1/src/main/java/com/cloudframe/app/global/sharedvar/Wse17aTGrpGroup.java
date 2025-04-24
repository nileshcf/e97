package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse17aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse17aTGrpGroup extends Wse17aTGrpGroupSerialized { 
   
					private Wse17aTGrp wse17aTGrp = new Wse17aTGrp();

						private char[] wse17aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse17aTGrpGroup
	**/
    public Wse17aTGrpGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse17aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse17aTGrp
	 *	@return wse17aTGrp
	 */   
	 public Wse17aTGrp getWse17aTGrp() {
   	return wse17aTGrp;
   }
   /**
	* 	Update Wse17aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-17A-T-GRP
	*	@param value
	*/
   public void setWse17aTGrp(char[] value) {
      wse17aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse17aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse17aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17aTGrp.begin,wse17aTGrp.length());
   }
   
     /**
	 * 	Update Wse17aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse17aTGrp with another Field
	 *	@param value
	 */
   public void setWse17aTGrp(Field source) {
   	replace(source,0,source.length(),wse17aTGrp.begin,wse17aTGrp.length());
   }  
   
     /**
	 * 	Update Wse17aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse17aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse17aTGrp.begin,wse17aTGrp.length());
   }
   
     /**
	 * 	Update Wse17aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse17aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse17aTGrpR
	 *	@return wse17aTGrpR
	 */
   public char[] getWse17aTGrpR() throws CFException{
     if (isWse17aTGrpRModified()) { 
        wse17aTGrpR = refreshWse17aTGrpR();
     }
   		return wse17aTGrpR;
   }

  
	/**
	*  set variable wse17aTGrpR
	*  Corresponding COBOL Variable is WSE-17A-T-GRP-R
	*  @param value
	**/
   public void setWse17aTGrpR(char[] value) {
      wse17aTGrpR = checkWse17aTGrpRConstraints(value);
      serializeWse17aTGrpR(wse17aTGrpR);
   } 

     /**
	 * 	Update Wse17aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse17aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse17aTGrpR,wse17aTGrpR.length);
   	
   }
   
   public void setWse17aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTGrpR,wse17aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse17aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse17aTGrpR with another Field
	 *	@param value
	 */
   public void setWse17aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse17aTGrpR,WSE_17A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse17aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse17aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse17aTGrpR,WSE_17A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse17aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse17aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse17aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse17aTGrpGroupFieldLength() {
			return WSE_17A_TGRP_GROUP_LENGTH;
		}

}
  
