package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse1aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse1aTGroup extends Wse1aTGroupSerialized {
   
					private Wse1aT wse1aT = new Wse1aT();

						private char[] wse1aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse1aTGroup
	**/
    public Wse1aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse1aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse1aT
	 *	@return wse1aT
	 */   
	 public Wse1aT getWse1aT() {
   	return wse1aT;
   }
   /**
	* 	Update Wse1aT with the passed value
	*   Corresponding COBOL Variable is WSE-1A-T
	*	@param value
	*/
   public void setWse1aT(char[] value) {
      wse1aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse1aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse1aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse1aT.begin,wse1aT.length());
   }
   
     /**
	 * 	Update Wse1aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse1aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse1aT with another Field
	 *	@param value
	 */
   public void setWse1aT(Field source) {
   	replace(source,0,source.length(),wse1aT.begin,wse1aT.length());
   }  
   
     /**
	 * 	Update Wse1aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse1aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse1aT.begin,wse1aT.length());
   }
   
     /**
	 * 	Update Wse1aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse1aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse1aTR
	 *	@return wse1aTR
	 */
   public char[] getWse1aTR() throws CFException{
     if (isWse1aTRModified()) { 
        wse1aTR = refreshWse1aTR();
     }
   		return wse1aTR;
   }

  
	/**
	*  set variable wse1aTR
	*  Corresponding COBOL Variable is WSE-1A-T-R
	*  @param value
	**/
   public void setWse1aTR(char[] value) {
      wse1aTR = checkWse1aTRConstraints(value);
      serializeWse1aTR(wse1aTR);
   } 

     /**
	 * 	Update Wse1aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse1aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse1aTR,wse1aTR.length);
   	
   }
   
   public void setWse1aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTR,wse1aTR.length);
   	
   }
   
     /**
	 * 	Update Wse1aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse1aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse1aTR with another Field
	 *	@param value
	 */
   public void setWse1aTR(Field source) {
       replace(source,0,source.length(),beginWse1aTR,WSE_1A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse1aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse1aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse1aTR,WSE_1A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse1aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse1aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse1aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse1aTGroupFieldLength() {
			return WSE_1A_TGROUP_LENGTH;
		}

}
  
