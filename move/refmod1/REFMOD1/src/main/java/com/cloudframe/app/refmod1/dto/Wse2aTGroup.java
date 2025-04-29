package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse2aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse2aTGroup extends Wse2aTGroupSerialized {
   
					private Wse2aT wse2aT = new Wse2aT();

						private char[] wse2aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse2aTGroup
	**/
    public Wse2aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse2aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse2aT
	 *	@return wse2aT
	 */   
	 public Wse2aT getWse2aT() {
   	return wse2aT;
   }
   /**
	* 	Update Wse2aT with the passed value
	*   Corresponding COBOL Variable is WSE-2A-T
	*	@param value
	*/
   public void setWse2aT(char[] value) {
      wse2aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse2aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse2aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse2aT.begin,wse2aT.length());
   }
   
     /**
	 * 	Update Wse2aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse2aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse2aT with another Field
	 *	@param value
	 */
   public void setWse2aT(Field source) {
   	replace(source,0,source.length(),wse2aT.begin,wse2aT.length());
   }  
   
     /**
	 * 	Update Wse2aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse2aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse2aT.begin,wse2aT.length());
   }
   
     /**
	 * 	Update Wse2aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse2aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse2aTR
	 *	@return wse2aTR
	 */
   public char[] getWse2aTR() throws CFException{
     if (isWse2aTRModified()) { 
        wse2aTR = refreshWse2aTR();
     }
   		return wse2aTR;
   }

  
	/**
	*  set variable wse2aTR
	*  Corresponding COBOL Variable is WSE-2A-T-R
	*  @param value
	**/
   public void setWse2aTR(char[] value) {
      wse2aTR = checkWse2aTRConstraints(value);
      serializeWse2aTR(wse2aTR);
   } 

     /**
	 * 	Update Wse2aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse2aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse2aTR,wse2aTR.length);
   	
   }
   
   public void setWse2aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse2aTR,wse2aTR.length);
   	
   }
   
     /**
	 * 	Update Wse2aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse2aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse2aTR with another Field
	 *	@param value
	 */
   public void setWse2aTR(Field source) {
       replace(source,0,source.length(),beginWse2aTR,WSE_2A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse2aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse2aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse2aTR,WSE_2A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse2aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse2aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse2aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse2aTGroupFieldLength() {
			return WSE_2A_TGROUP_LENGTH;
		}

}
  
