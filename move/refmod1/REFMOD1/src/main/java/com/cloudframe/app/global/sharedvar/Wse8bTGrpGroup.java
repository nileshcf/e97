package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse8bTGrpGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse8bTGrpGroup extends Wse8bTGrpGroupSerialized { 
   
					private Wse8bTGrp wse8bTGrp = new Wse8bTGrp();

						private char[] wse8bTGrpR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse8bTGrpGroup
	**/
    public Wse8bTGrpGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse8bTGrp.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse8bTGrp
	 *	@return wse8bTGrp
	 */   
	 public Wse8bTGrp getWse8bTGrp() {
   	return wse8bTGrp;
   }
   /**
	* 	Update Wse8bTGrp with the passed value
	*   Corresponding COBOL Variable is WSE-8B-T-GRP
	*	@param value
	*/
   public void setWse8bTGrp(char[] value) {
      wse8bTGrp.setString(value); 
   }   
    
     /**
	 * 	Update Wse8bTGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse8bTGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8bTGrp.begin,wse8bTGrp.length());
   }
   
     /**
	 * 	Update Wse8bTGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8bTGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse8bTGrp with another Field
	 *	@param value
	 */
   public void setWse8bTGrp(Field source) {
   	replace(source,0,source.length(),wse8bTGrp.begin,wse8bTGrp.length());
   }  
   
     /**
	 * 	Update Wse8bTGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse8bTGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse8bTGrp.begin,wse8bTGrp.length());
   }
   
     /**
	 * 	Update Wse8bTGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse8bTGrp.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse8bTGrpR
	 *	@return wse8bTGrpR
	 */
   public char[] getWse8bTGrpR() throws CFException{
     if (isWse8bTGrpRModified()) { 
        wse8bTGrpR = refreshWse8bTGrpR();
     }
   		return wse8bTGrpR;
   }

  
	/**
	*  set variable wse8bTGrpR
	*  Corresponding COBOL Variable is WSE-8B-T-GRP-R
	*  @param value
	**/
   public void setWse8bTGrpR(char[] value) {
      wse8bTGrpR = checkWse8bTGrpRConstraints(value);
      serializeWse8bTGrpR(wse8bTGrpR);
   } 

     /**
	 * 	Update Wse8bTGrpR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse8bTGrpR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse8bTGrpR,wse8bTGrpR.length);
   	
   }
   
   public void setWse8bTGrpR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTGrpR,wse8bTGrpR.length);
   	
   }
   
     /**
	 * 	Update Wse8bTGrpR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTGrpR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTGrpR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse8bTGrpR with another Field
	 *	@param value
	 */
   public void setWse8bTGrpR(Field source) {
       replace(source,0,source.length(),beginWse8bTGrpR,WSE_8B_TGRP_R_LEN);
   	
   }  
   
     /**
	 * 	Update Wse8bTGrpR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse8bTGrpR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse8bTGrpR,WSE_8B_TGRP_R_LEN);
   	
   }
   
     /**
	 * 	Update Wse8bTGrpR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse8bTGrpR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse8bTGrpR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse8bTGrpGroupFieldLength() {
			return WSE_8B_TGRP_GROUP_LENGTH;
		}

}
  
