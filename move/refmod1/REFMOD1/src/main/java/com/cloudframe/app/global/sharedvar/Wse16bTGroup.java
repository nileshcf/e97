package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse16bTGroup extends Wse16bTGroupSerialized { 
   
					private Wse16bT wse16bT = new Wse16bT();

						private char[] wse16bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse16bTGroup
	**/
    public Wse16bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse16bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse16bT
	 *	@return wse16bT
	 */   
	 public Wse16bT getWse16bT() {
   	return wse16bT;
   }
   /**
	* 	Update Wse16bT with the passed value
	*   Corresponding COBOL Variable is WSE-16B-T
	*	@param value
	*/
   public void setWse16bT(char[] value) {
      wse16bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse16bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse16bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse16bT.begin,wse16bT.length());
   }
   
     /**
	 * 	Update Wse16bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse16bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse16bT with another Field
	 *	@param value
	 */
   public void setWse16bT(Field source) {
   	replace(source,0,source.length(),wse16bT.begin,wse16bT.length());
   }  
   
     /**
	 * 	Update Wse16bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse16bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse16bT.begin,wse16bT.length());
   }
   
     /**
	 * 	Update Wse16bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse16bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse16bTR
	 *	@return wse16bTR
	 */
   public char[] getWse16bTR() throws CFException{
     if (isWse16bTRModified()) { 
        wse16bTR = refreshWse16bTR();
     }
   		return wse16bTR;
   }

  
	/**
	*  set variable wse16bTR
	*  Corresponding COBOL Variable is WSE-16B-T-R
	*  @param value
	**/
   public void setWse16bTR(char[] value) {
      wse16bTR = checkWse16bTRConstraints(value);
      serializeWse16bTR(wse16bTR);
   } 

     /**
	 * 	Update Wse16bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16bTR,wse16bTR.length);
   	
   }
   
   public void setWse16bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTR,wse16bTR.length);
   	
   }
   
     /**
	 * 	Update Wse16bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16bTR with another Field
	 *	@param value
	 */
   public void setWse16bTR(Field source) {
       replace(source,0,source.length(),beginWse16bTR,WSE_16B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16bTR,WSE_16B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse16bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse16bTGroupFieldLength() {
			return WSE_16B_TGROUP_LENGTH;
		}

}
  
