package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse4aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse4aTGroup extends Wse4aTGroupSerialized {
   
					private Wse4aT wse4aT = new Wse4aT();

						private char[] wse4aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse4aTGroup
	**/
    public Wse4aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse4aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse4aT
	 *	@return wse4aT
	 */   
	 public Wse4aT getWse4aT() {
   	return wse4aT;
   }
   /**
	* 	Update Wse4aT with the passed value
	*   Corresponding COBOL Variable is WSE-4A-T
	*	@param value
	*/
   public void setWse4aT(char[] value) {
      wse4aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse4aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse4aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse4aT.begin,wse4aT.length());
   }
   
     /**
	 * 	Update Wse4aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse4aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse4aT with another Field
	 *	@param value
	 */
   public void setWse4aT(Field source) {
   	replace(source,0,source.length(),wse4aT.begin,wse4aT.length());
   }  
   
     /**
	 * 	Update Wse4aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse4aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse4aT.begin,wse4aT.length());
   }
   
     /**
	 * 	Update Wse4aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse4aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse4aTR
	 *	@return wse4aTR
	 */
   public char[] getWse4aTR() throws CFException{
     if (isWse4aTRModified()) { 
        wse4aTR = refreshWse4aTR();
     }
   		return wse4aTR;
   }

  
	/**
	*  set variable wse4aTR
	*  Corresponding COBOL Variable is WSE-4A-T-R
	*  @param value
	**/
   public void setWse4aTR(char[] value) {
      wse4aTR = checkWse4aTRConstraints(value);
      serializeWse4aTR(wse4aTR);
   } 

     /**
	 * 	Update Wse4aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse4aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse4aTR,wse4aTR.length);
   	
   }
   
   public void setWse4aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse4aTR,wse4aTR.length);
   	
   }
   
     /**
	 * 	Update Wse4aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse4aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse4aTR with another Field
	 *	@param value
	 */
   public void setWse4aTR(Field source) {
       replace(source,0,source.length(),beginWse4aTR,WSE_4A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse4aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse4aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse4aTR,WSE_4A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse4aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse4aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse4aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse4aTGroupFieldLength() {
			return WSE_4A_TGROUP_LENGTH;
		}

}
  
