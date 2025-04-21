package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse20cTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse20cTGroup extends Wse20cTGroupSerialized {
   

						private char[] wse20cT = Field.fillLowValue(60);

						private char[] wse20cTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse20cTGroup
	**/
    public Wse20cTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse20cT
	 *	@return wse20cT
	 */
   public char[] getWse20cT() throws CFException{
     if (isWse20cTModified()) { 
        wse20cT = refreshWse20cT();
     }
   		return wse20cT;
   }

  
	/**
	*  set variable wse20cT
	*  Corresponding COBOL Variable is WSE-20C-T
	*  @param value
	**/
   public void setWse20cT(char[] value) {
      wse20cT = checkWse20cTConstraints(value);
      serializeWse20cT(wse20cT);
   } 

     /**
	 * 	Update Wse20cT 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20cT(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20cT,wse20cT.length);
   	
   }
   
   public void setWse20cT(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cT,wse20cT.length);
   	
   }
   
     /**
	 * 	Update Wse20cT 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20cT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cT+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20cT with another Field
	 *	@param value
	 */
   public void setWse20cT(Field source) {
       replace(source,0,source.length(),beginWse20cT,WSE_20C_T_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20cT 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20cT(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20cT,WSE_20C_T_LEN);
   	
   }
   
     /**
	 * 	Update Wse20cT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20cT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cT+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20cTR
	 *	@return wse20cTR
	 */
   public char[] getWse20cTR() throws CFException{
     if (isWse20cTRModified()) { 
        wse20cTR = refreshWse20cTR();
     }
   		return wse20cTR;
   }

  
	/**
	*  set variable wse20cTR
	*  Corresponding COBOL Variable is WSE-20C-T-R
	*  @param value
	**/
   public void setWse20cTR(char[] value) {
      wse20cTR = checkWse20cTRConstraints(value);
      serializeWse20cTR(wse20cTR);
   } 

     /**
	 * 	Update Wse20cTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20cTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20cTR,wse20cTR.length);
   	
   }
   
   public void setWse20cTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cTR,wse20cTR.length);
   	
   }
   
     /**
	 * 	Update Wse20cTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20cTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20cTR with another Field
	 *	@param value
	 */
   public void setWse20cTR(Field source) {
       replace(source,0,source.length(),beginWse20cTR,WSE_20C_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20cTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20cTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20cTR,WSE_20C_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse20cTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20cTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20cTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse20cTGroupFieldLength() {
			return WSE_20C_TGROUP_LENGTH;
		}

}
  
