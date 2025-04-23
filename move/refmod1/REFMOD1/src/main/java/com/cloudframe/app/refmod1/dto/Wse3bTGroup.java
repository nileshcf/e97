package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse3bTGroup extends Wse3bTGroupSerialized {
   
					private Wse3bT wse3bT = new Wse3bT();

						private char[] wse3bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse3bTGroup
	**/
    public Wse3bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse3bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse3bT
	 *	@return wse3bT
	 */   
	 public Wse3bT getWse3bT() {
   	return wse3bT;
   }
   /**
	* 	Update Wse3bT with the passed value
	*   Corresponding COBOL Variable is WSE-3B-T
	*	@param value
	*/
   public void setWse3bT(char[] value) {
      wse3bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse3bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse3bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse3bT.begin,wse3bT.length());
   }
   
     /**
	 * 	Update Wse3bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse3bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse3bT with another Field
	 *	@param value
	 */
   public void setWse3bT(Field source) {
   	replace(source,0,source.length(),wse3bT.begin,wse3bT.length());
   }  
   
     /**
	 * 	Update Wse3bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse3bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse3bT.begin,wse3bT.length());
   }
   
     /**
	 * 	Update Wse3bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse3bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse3bTR
	 *	@return wse3bTR
	 */
   public char[] getWse3bTR() throws CFException{
     if (isWse3bTRModified()) { 
        wse3bTR = refreshWse3bTR();
     }
   		return wse3bTR;
   }

  
	/**
	*  set variable wse3bTR
	*  Corresponding COBOL Variable is WSE-3B-T-R
	*  @param value
	**/
   public void setWse3bTR(char[] value) {
      wse3bTR = checkWse3bTRConstraints(value);
      serializeWse3bTR(wse3bTR);
   } 

     /**
	 * 	Update Wse3bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3bTR,wse3bTR.length);
   	
   }
   
   public void setWse3bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTR,wse3bTR.length);
   	
   }
   
     /**
	 * 	Update Wse3bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3bTR with another Field
	 *	@param value
	 */
   public void setWse3bTR(Field source) {
       replace(source,0,source.length(),beginWse3bTR,WSE_3B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3bTR,WSE_3B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse3bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse3bTGroupFieldLength() {
			return WSE_3B_TGROUP_LENGTH;
		}

}
  
