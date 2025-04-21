package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse1bTGroup extends Wse1bTGroupSerialized {
   
					private Wse1bT wse1bT = new Wse1bT();

						private char[] wse1bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse1bTGroup
	**/
    public Wse1bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse1bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse1bT
	 *	@return wse1bT
	 */   
	 public Wse1bT getWse1bT() {
   	return wse1bT;
   }
   /**
	* 	Update Wse1bT with the passed value
	*   Corresponding COBOL Variable is WSE-1B-T
	*	@param value
	*/
   public void setWse1bT(char[] value) {
      wse1bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse1bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse1bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse1bT.begin,wse1bT.length());
   }
   
     /**
	 * 	Update Wse1bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse1bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse1bT with another Field
	 *	@param value
	 */
   public void setWse1bT(Field source) {
   	replace(source,0,source.length(),wse1bT.begin,wse1bT.length());
   }  
   
     /**
	 * 	Update Wse1bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse1bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse1bT.begin,wse1bT.length());
   }
   
     /**
	 * 	Update Wse1bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse1bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse1bTR
	 *	@return wse1bTR
	 */
   public char[] getWse1bTR() throws CFException{
     if (isWse1bTRModified()) { 
        wse1bTR = refreshWse1bTR();
     }
   		return wse1bTR;
   }

  
	/**
	*  set variable wse1bTR
	*  Corresponding COBOL Variable is WSE-1B-T-R
	*  @param value
	**/
   public void setWse1bTR(char[] value) {
      wse1bTR = checkWse1bTRConstraints(value);
      serializeWse1bTR(wse1bTR);
   } 

     /**
	 * 	Update Wse1bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1bTR,wse1bTR.length);
   	
   }
   
   public void setWse1bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTR,wse1bTR.length);
   	
   }
   
     /**
	 * 	Update Wse1bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1bTR with another Field
	 *	@param value
	 */
   public void setWse1bTR(Field source) {
       replace(source,0,source.length(),beginWse1bTR,WSE_1B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1bTR,WSE_1B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse1bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse1bTGroupFieldLength() {
			return WSE_1B_TGROUP_LENGTH;
		}

}
  
