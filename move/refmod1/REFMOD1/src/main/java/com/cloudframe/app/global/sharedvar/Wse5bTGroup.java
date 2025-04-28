package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse5bTGroup extends Wse5bTGroupSerialized { 
   
					private Wse5bT wse5bT = new Wse5bT();

						private char[] wse5bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse5bTGroup
	**/
    public Wse5bTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse5bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse5bT
	 *	@return wse5bT
	 */   
	 public Wse5bT getWse5bT() {
   	return wse5bT;
   }
   /**
	* 	Update Wse5bT with the passed value
	*   Corresponding COBOL Variable is WSE-5B-T
	*	@param value
	*/
   public void setWse5bT(char[] value) {
      wse5bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse5bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse5bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5bT.begin,wse5bT.length());
   }
   
     /**
	 * 	Update Wse5bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse5bT with another Field
	 *	@param value
	 */
   public void setWse5bT(Field source) {
   	replace(source,0,source.length(),wse5bT.begin,wse5bT.length());
   }  
   
     /**
	 * 	Update Wse5bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse5bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5bT.begin,wse5bT.length());
   }
   
     /**
	 * 	Update Wse5bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse5bTR
	 *	@return wse5bTR
	 */
   public char[] getWse5bTR() throws CFException{
     if (isWse5bTRModified()) { 
        wse5bTR = refreshWse5bTR();
     }
   		return wse5bTR;
   }

  
	/**
	*  set variable wse5bTR
	*  Corresponding COBOL Variable is WSE-5B-T-R
	*  @param value
	**/
   public void setWse5bTR(char[] value) {
      wse5bTR = checkWse5bTRConstraints(value);
      serializeWse5bTR(wse5bTR);
   } 

     /**
	 * 	Update Wse5bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5bTR,wse5bTR.length);
   	
   }
   
   public void setWse5bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTR,wse5bTR.length);
   	
   }
   
     /**
	 * 	Update Wse5bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5bTR with another Field
	 *	@param value
	 */
   public void setWse5bTR(Field source) {
       replace(source,0,source.length(),beginWse5bTR,WSE_5B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5bTR,WSE_5B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse5bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse5bTGroupFieldLength() {
			return WSE_5B_TGROUP_LENGTH;
		}

}
  
