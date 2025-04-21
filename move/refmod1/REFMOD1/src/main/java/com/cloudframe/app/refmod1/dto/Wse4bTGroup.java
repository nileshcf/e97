package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse4bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse4bTGroup extends Wse4bTGroupSerialized {
   
					private Wse4bT wse4bT = new Wse4bT();

						private char[] wse4bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse4bTGroup
	**/
    public Wse4bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse4bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse4bT
	 *	@return wse4bT
	 */   
	 public Wse4bT getWse4bT() {
   	return wse4bT;
   }
   /**
	* 	Update Wse4bT with the passed value
	*   Corresponding COBOL Variable is WSE-4B-T
	*	@param value
	*/
   public void setWse4bT(char[] value) {
      wse4bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse4bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse4bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse4bT.begin,wse4bT.length());
   }
   
     /**
	 * 	Update Wse4bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse4bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse4bT with another Field
	 *	@param value
	 */
   public void setWse4bT(Field source) {
   	replace(source,0,source.length(),wse4bT.begin,wse4bT.length());
   }  
   
     /**
	 * 	Update Wse4bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse4bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse4bT.begin,wse4bT.length());
   }
   
     /**
	 * 	Update Wse4bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse4bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse4bTR
	 *	@return wse4bTR
	 */
   public char[] getWse4bTR() throws CFException{
     if (isWse4bTRModified()) { 
        wse4bTR = refreshWse4bTR();
     }
   		return wse4bTR;
   }

  
	/**
	*  set variable wse4bTR
	*  Corresponding COBOL Variable is WSE-4B-T-R
	*  @param value
	**/
   public void setWse4bTR(char[] value) {
      wse4bTR = checkWse4bTRConstraints(value);
      serializeWse4bTR(wse4bTR);
   } 

     /**
	 * 	Update Wse4bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse4bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse4bTR,wse4bTR.length);
   	
   }
   
   public void setWse4bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTR,wse4bTR.length);
   	
   }
   
     /**
	 * 	Update Wse4bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse4bTR with another Field
	 *	@param value
	 */
   public void setWse4bTR(Field source) {
       replace(source,0,source.length(),beginWse4bTR,WSE_4B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse4bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse4bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse4bTR,WSE_4B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse4bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse4bTGroupFieldLength() {
			return WSE_4B_TGROUP_LENGTH;
		}

}
  
