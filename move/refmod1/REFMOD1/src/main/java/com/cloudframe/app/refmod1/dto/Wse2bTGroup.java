package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse2bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse2bTGroup extends Wse2bTGroupSerialized {
   
					private Wse2bT wse2bT = new Wse2bT();

						private char[] wse2bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse2bTGroup
	**/
    public Wse2bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse2bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse2bT
	 *	@return wse2bT
	 */   
	 public Wse2bT getWse2bT() {
   	return wse2bT;
   }
   /**
	* 	Update Wse2bT with the passed value
	*   Corresponding COBOL Variable is WSE-2B-T
	*	@param value
	*/
   public void setWse2bT(char[] value) {
      wse2bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse2bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse2bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse2bT.begin,wse2bT.length());
   }
   
     /**
	 * 	Update Wse2bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse2bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse2bT with another Field
	 *	@param value
	 */
   public void setWse2bT(Field source) {
   	replace(source,0,source.length(),wse2bT.begin,wse2bT.length());
   }  
   
     /**
	 * 	Update Wse2bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse2bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse2bT.begin,wse2bT.length());
   }
   
     /**
	 * 	Update Wse2bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse2bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse2bTR
	 *	@return wse2bTR
	 */
   public char[] getWse2bTR() throws CFException{
     if (isWse2bTRModified()) { 
        wse2bTR = refreshWse2bTR();
     }
   		return wse2bTR;
   }

  
	/**
	*  set variable wse2bTR
	*  Corresponding COBOL Variable is WSE-2B-T-R
	*  @param value
	**/
   public void setWse2bTR(char[] value) {
      wse2bTR = checkWse2bTRConstraints(value);
      serializeWse2bTR(wse2bTR);
   } 

     /**
	 * 	Update Wse2bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse2bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse2bTR,wse2bTR.length);
   	
   }
   
   public void setWse2bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTR,wse2bTR.length);
   	
   }
   
     /**
	 * 	Update Wse2bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse2bTR with another Field
	 *	@param value
	 */
   public void setWse2bTR(Field source) {
       replace(source,0,source.length(),beginWse2bTR,WSE_2B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse2bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse2bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse2bTR,WSE_2B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse2bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse2bTGroupFieldLength() {
			return WSE_2B_TGROUP_LENGTH;
		}

}
  
