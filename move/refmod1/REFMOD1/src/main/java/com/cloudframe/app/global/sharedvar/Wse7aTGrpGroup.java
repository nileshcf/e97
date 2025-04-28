package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse7aTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse7aTGrpGroup extends Wse7aTGrpGroupSerialized { 
   
					private Wse7aTGrp wse7aTGrp = new Wse7aTGrp();

						private char[] wse7aTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse7aTGrpGroup
	**/
    public Wse7aTGrpGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse7aTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse7aTGrp
	 *	@return wse7aTGrp
	 */   
	 public Wse7aTGrp getWse7aTGrp() {
   	return wse7aTGrp;
   }
   /**
	* 	Update Wse7aTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-7A-T-GRP
	*	@param value
	*/
   public void setWse7aTGrp(char[] value) {
      wse7aTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse7aTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse7aTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7aTGrp.begin,wse7aTGrp.length());
   }
   
     /**
	 * 	Update Wse7aTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7aTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7aTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse7aTGrp with another Field
	 *	@param value
	 */
   public void setWse7aTGrp(Field source) {
   	replace(source,0,source.length(),wse7aTGrp.begin,wse7aTGrp.length());
   }  
   
     /**
	 * 	Update Wse7aTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse7aTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse7aTGrp.begin,wse7aTGrp.length());
   }
   
     /**
	 * 	Update Wse7aTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7aTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse7aTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse7aTGrpR
	 *	@return wse7aTGrpR
	 */
   public char[] getWse7aTGrpR() throws CFException{
     if (isWse7aTGrpRModified()) { 
        wse7aTGrpR = refreshWse7aTGrpR();
     }
   		return wse7aTGrpR;
   }

  
	/**
	*  set variable wse7aTGrpR
	*  Corresponding COBOL Variable is WSE-7A-T-GRP-R
	*  @param value
	**/
   public void setWse7aTGrpR(char[] value) {
      wse7aTGrpR = checkWse7aTGrpRConstraints(value);
      serializeWse7aTGrpR(wse7aTGrpR);
   } 

     /**
	 * 	Update Wse7aTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse7aTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse7aTGrpR,wse7aTGrpR.length);
   	
   }
   
   public void setWse7aTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aTGrpR,wse7aTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse7aTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse7aTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse7aTGrpR with another Field
	 *	@param value
	 */
   public void setWse7aTGrpR(Field source) {
       replace(source,0,source.length(),beginWse7aTGrpR,WSE_7A_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse7aTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse7aTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse7aTGrpR,WSE_7A_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse7aTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse7aTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse7aTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse7aTGrpGroupFieldLength() {
			return WSE_7A_TGRP_GROUP_LENGTH;
		}

}
  
