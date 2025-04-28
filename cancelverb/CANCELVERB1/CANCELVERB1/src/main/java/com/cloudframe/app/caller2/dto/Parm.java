package com.cloudframe.app.caller2.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:09. using version 5.0.0.256
**/


import com.cloudframe.app.caller2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm extends ParmSerialized {
   

						private char[] lku00MthlyChgInd = Field.fillLowValue(1);

						private char[] lku00BlPerToDt = Field.fillLowValue(10);

						private char[] lku00BlPerFromDt = Field.fillLowValue(10);
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of lku00MthlyChgInd
	 *	@return lku00MthlyChgInd
	 */
   public char[] getLku00MthlyChgInd() throws CFException{
     if (isLku00MthlyChgIndModified()) { 
        lku00MthlyChgInd = refreshLku00MthlyChgInd();
     }
   		return lku00MthlyChgInd;
   }

  
	/**
	*  set variable lku00MthlyChgInd
	*  Corresponding COBOL Variable is WS-LKU00-MTHLY-CHG-IND
	*  @param value
	**/
   public void setLku00MthlyChgInd(char[] value) {
      lku00MthlyChgInd = checkLku00MthlyChgIndConstraints(value);
      serializeLku00MthlyChgInd(lku00MthlyChgInd);
   } 

     /**
	 * 	Update Lku00MthlyChgInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLku00MthlyChgInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLku00MthlyChgInd,lku00MthlyChgInd.length);
   	
   }
   
   public void setLku00MthlyChgInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLku00MthlyChgInd,lku00MthlyChgInd.length);
   	
   }
   
     /**
	 * 	Update Lku00MthlyChgInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLku00MthlyChgInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLku00MthlyChgInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Lku00MthlyChgInd with another Field
	 *	@param value
	 */
   public void setLku00MthlyChgInd(Field source) {
       replace(source,0,source.length(),beginLku00MthlyChgInd,LKU_00_MTHLY_CHG_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Lku00MthlyChgInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLku00MthlyChgInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLku00MthlyChgInd,LKU_00_MTHLY_CHG_IND_LEN);
   	
   }
   
     /**
	 * 	Update Lku00MthlyChgInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLku00MthlyChgInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLku00MthlyChgInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lku00BlPerToDt
	 *	@return lku00BlPerToDt
	 */
   public char[] getLku00BlPerToDt() throws CFException{
     if (isLku00BlPerToDtModified()) { 
        lku00BlPerToDt = refreshLku00BlPerToDt();
     }
   		return lku00BlPerToDt;
   }

  
	/**
	*  set variable lku00BlPerToDt
	*  Corresponding COBOL Variable is WS-LKU00-BL-PER-TO-DT
	*  @param value
	**/
   public void setLku00BlPerToDt(char[] value) {
      lku00BlPerToDt = checkLku00BlPerToDtConstraints(value);
      serializeLku00BlPerToDt(lku00BlPerToDt);
   } 

     /**
	 * 	Update Lku00BlPerToDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLku00BlPerToDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLku00BlPerToDt,lku00BlPerToDt.length);
   	
   }
   
   public void setLku00BlPerToDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLku00BlPerToDt,lku00BlPerToDt.length);
   	
   }
   
     /**
	 * 	Update Lku00BlPerToDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLku00BlPerToDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLku00BlPerToDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Lku00BlPerToDt with another Field
	 *	@param value
	 */
   public void setLku00BlPerToDt(Field source) {
       replace(source,0,source.length(),beginLku00BlPerToDt,LKU_00_BL_PER_TO_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Lku00BlPerToDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLku00BlPerToDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLku00BlPerToDt,LKU_00_BL_PER_TO_DT_LEN);
   	
   }
   
     /**
	 * 	Update Lku00BlPerToDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLku00BlPerToDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLku00BlPerToDt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lku00BlPerFromDt
	 *	@return lku00BlPerFromDt
	 */
   public char[] getLku00BlPerFromDt() throws CFException{
     if (isLku00BlPerFromDtModified()) { 
        lku00BlPerFromDt = refreshLku00BlPerFromDt();
     }
   		return lku00BlPerFromDt;
   }

  
	/**
	*  set variable lku00BlPerFromDt
	*  Corresponding COBOL Variable is WS-LKU00-BL-PER-FROM-DT
	*  @param value
	**/
   public void setLku00BlPerFromDt(char[] value) {
      lku00BlPerFromDt = checkLku00BlPerFromDtConstraints(value);
      serializeLku00BlPerFromDt(lku00BlPerFromDt);
   } 

     /**
	 * 	Update Lku00BlPerFromDt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLku00BlPerFromDt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLku00BlPerFromDt,lku00BlPerFromDt.length);
   	
   }
   
   public void setLku00BlPerFromDt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLku00BlPerFromDt,lku00BlPerFromDt.length);
   	
   }
   
     /**
	 * 	Update Lku00BlPerFromDt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLku00BlPerFromDt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLku00BlPerFromDt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Lku00BlPerFromDt with another Field
	 *	@param value
	 */
   public void setLku00BlPerFromDt(Field source) {
       replace(source,0,source.length(),beginLku00BlPerFromDt,LKU_00_BL_PER_FROM_DT_LEN);
   	
   }  
   
     /**
	 * 	Update Lku00BlPerFromDt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLku00BlPerFromDt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLku00BlPerFromDt,LKU_00_BL_PER_FROM_DT_LEN);
   	
   }
   
     /**
	 * 	Update Lku00BlPerFromDt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLku00BlPerFromDt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLku00BlPerFromDt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParmFieldLength() {
			return PARM_LENGTH;
		}

}
  
