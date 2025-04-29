package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse6bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse6bTGroup")

public class Wse6bTGroup extends Wse6bTGroupSerialized  implements InitializingBean {
   
					private Wse6bT wse6bT = new Wse6bT();

						private char[] wse6bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse6bTGroup
	**/
    public Wse6bTGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse6bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse6bT
	 *	@return wse6bT
	 */   
	 public Wse6bT getWse6bT() {
   	return wse6bT;
   }
   /**
	* 	Update Wse6bT with the passed value
	*   Corresponding COBOL Variable is WSE-6B-T
	*	@param value
	*/
   public void setWse6bT(char[] value) {
      wse6bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse6bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse6bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse6bT.begin,wse6bT.length());
   }
   
     /**
	 * 	Update Wse6bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse6bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse6bT with another Field
	 *	@param value
	 */
   public void setWse6bT(Field source) {
   	replace(source,0,source.length(),wse6bT.begin,wse6bT.length());
   }  
   
     /**
	 * 	Update Wse6bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse6bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse6bT.begin,wse6bT.length());
   }
   
     /**
	 * 	Update Wse6bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse6bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse6bTR
	 *	@return wse6bTR
	 */
   public char[] getWse6bTR() throws CFException{
     if (isWse6bTRModified()) { 
        wse6bTR = refreshWse6bTR();
     }
   		return wse6bTR;
   }

  
	/**
	*  set variable wse6bTR
	*  Corresponding COBOL Variable is WSE-6B-T-R
	*  @param value
	**/
   public void setWse6bTR(char[] value) {
      wse6bTR = checkWse6bTRConstraints(value);
      serializeWse6bTR(wse6bTR);
   } 

     /**
	 * 	Update Wse6bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse6bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse6bTR,wse6bTR.length);
   	
   }
   
   public void setWse6bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTR,wse6bTR.length);
   	
   }
   
     /**
	 * 	Update Wse6bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse6bTR with another Field
	 *	@param value
	 */
   public void setWse6bTR(Field source) {
       replace(source,0,source.length(),beginWse6bTR,WSE_6B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse6bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse6bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse6bTR,WSE_6B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse6bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse6bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse6bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse6bTGroupFieldLength() {
			return WSE_6B_TGROUP_LENGTH;
		}

}
  
