package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15bTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_wse15bTGroup")

public class Wse15bTGroup extends Wse15bTGroupSerialized  implements InitializingBean {
   
					private Wse15bT wse15bT = new Wse15bT();

						private char[] wse15bTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse15bTGroup
	**/
    public Wse15bTGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse15bT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wse15bT
	 *	@return wse15bT
	 */   
	 public Wse15bT getWse15bT() {
   	return wse15bT;
   }
   /**
	* 	Update Wse15bT with the passed value
	*   Corresponding COBOL Variable is WSE-15B-T
	*	@param value
	*/
   public void setWse15bT(char[] value) {
      wse15bT.setString(value); 
   }   
    
     /**
	 * 	Update Wse15bT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse15bT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15bT.begin,wse15bT.length());
   }
   
     /**
	 * 	Update Wse15bT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15bT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse15bT with another Field
	 *	@param value
	 */
   public void setWse15bT(Field source) {
   	replace(source,0,source.length(),wse15bT.begin,wse15bT.length());
   }  
   
     /**
	 * 	Update Wse15bT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse15bT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15bT.begin,wse15bT.length());
   }
   
     /**
	 * 	Update Wse15bT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15bT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse15bTR
	 *	@return wse15bTR
	 */
   public char[] getWse15bTR() throws CFException{
     if (isWse15bTRModified()) { 
        wse15bTR = refreshWse15bTR();
     }
   		return wse15bTR;
   }

  
	/**
	*  set variable wse15bTR
	*  Corresponding COBOL Variable is WSE-15B-T-R
	*  @param value
	**/
   public void setWse15bTR(char[] value) {
      wse15bTR = checkWse15bTRConstraints(value);
      serializeWse15bTR(wse15bTR);
   } 

     /**
	 * 	Update Wse15bTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse15bTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse15bTR,wse15bTR.length);
   	
   }
   
   public void setWse15bTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTR,wse15bTR.length);
   	
   }
   
     /**
	 * 	Update Wse15bTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse15bTR with another Field
	 *	@param value
	 */
   public void setWse15bTR(Field source) {
       replace(source,0,source.length(),beginWse15bTR,WSE_15B_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse15bTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse15bTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse15bTR,WSE_15B_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse15bTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse15bTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse15bTGroupFieldLength() {
			return WSE_15B_TGROUP_LENGTH;
		}

}
  
