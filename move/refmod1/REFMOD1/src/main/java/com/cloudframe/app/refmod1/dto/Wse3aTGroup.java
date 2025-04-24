package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Wse3aTGroup extends Wse3aTGroupSerialized { 
   
					private Wse3aT wse3aT = new Wse3aT();

						private char[] wse3aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse3aTGroup
	**/
    public Wse3aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse3aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse3aT
	 *	@return wse3aT
	 */   
	 public Wse3aT getWse3aT() {
   	return wse3aT;
   }
   /**
	* 	Update Wse3aT with the passed value
	*   Corresponding COBOL Variable is WSE-3A-T
	*	@param value
	*/
   public void setWse3aT(char[] value) {
      wse3aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse3aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse3aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse3aT.begin,wse3aT.length());
   }
   
     /**
	 * 	Update Wse3aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse3aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse3aT with another Field
	 *	@param value
	 */
   public void setWse3aT(Field source) {
   	replace(source,0,source.length(),wse3aT.begin,wse3aT.length());
   }  
   
     /**
	 * 	Update Wse3aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse3aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse3aT.begin,wse3aT.length());
   }
   
     /**
	 * 	Update Wse3aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse3aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse3aTR
	 *	@return wse3aTR
	 */
   public char[] getWse3aTR() throws CFException{
     if (isWse3aTRModified()) { 
        wse3aTR = refreshWse3aTR();
     }
   		return wse3aTR;
   }

  
	/**
	*  set variable wse3aTR
	*  Corresponding COBOL Variable is WSE-3A-T-R
	*  @param value
	**/
   public void setWse3aTR(char[] value) {
      wse3aTR = checkWse3aTRConstraints(value);
      serializeWse3aTR(wse3aTR);
   } 

     /**
	 * 	Update Wse3aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3aTR,wse3aTR.length);
   	
   }
   
   public void setWse3aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTR,wse3aTR.length);
   	
   }
   
     /**
	 * 	Update Wse3aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3aTR with another Field
	 *	@param value
	 */
   public void setWse3aTR(Field source) {
       replace(source,0,source.length(),beginWse3aTR,WSE_3A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3aTR,WSE_3A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse3aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse3aTGroupFieldLength() {
			return WSE_3A_TGROUP_LENGTH;
		}

}
  
