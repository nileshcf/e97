package com.cloudframe.app.init1.dto;

/**
*  The class LCpduTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LCpduTableInit extends LCpduTableInitSerialized {
   
				private LCpduUbInit lCpduUbInit = new LCpduUbInit();

						private char[] lCpduErrorInit = new char[6];
				private LCpduVisionInit lCpduVisionInit = new LCpduVisionInit();
	
	/**
	* Constructor for LCpduTableInit
	**/
    public LCpduTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			lCpduUbInit.setParent(this,getStartOffset() + 0);
	       			lCpduVisionInit.setParent(this,getStartOffset() + 168);
	   	/*  end of offset */
								setLCpduErrorInit(fillSpace(6));
    }


 

	/**
	 *	Returns the value of lCpduUbInit
	 *	@return lCpduUbInit
	 */   
	 public LCpduUbInit getLCpduUbInit() {
   	return lCpduUbInit;
   }
   /**
	* 	Update LCpduUbInit with the passed value
	*   Corresponding COBOL Variable is L-CPDU-UB-INIT
	*	@param value
	*/
   public void setLCpduUbInit(char[] value) {
      lCpduUbInit.setString(value); 
   }   
    
     /**
	 * 	Update LCpduUbInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLCpduUbInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lCpduUbInit.begin,lCpduUbInit.length());
   }
   
     /**
	 * 	Update LCpduUbInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLCpduUbInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lCpduUbInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LCpduUbInit with another Field
	 *	@param value
	 */
   public void setLCpduUbInit(Field source) {
   	replace(source,0,source.length(),lCpduUbInit.begin,lCpduUbInit.length());
   }  
   
     /**
	 * 	Update LCpduUbInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLCpduUbInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lCpduUbInit.begin,lCpduUbInit.length());
   }
   
     /**
	 * 	Update LCpduUbInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLCpduUbInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lCpduUbInit.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of lCpduErrorInit
	 *	@return lCpduErrorInit
	 */
   public char[] getLCpduErrorInit() throws CFException{
     if (isLCpduErrorInitModified()) { 
        lCpduErrorInit = refreshLCpduErrorInit();
     }
   		return lCpduErrorInit;
   }

  
	/**
	*  set variable lCpduErrorInit
	*  Corresponding COBOL Variable is L-CPDU-ERROR-INIT
	*  @param value
	**/
   public void setLCpduErrorInit(char[] value) {
      lCpduErrorInit = checkLCpduErrorInitConstraints(value);
      serializeLCpduErrorInit(lCpduErrorInit);
   } 

     /**
	 * 	Update LCpduErrorInit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLCpduErrorInit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLCpduErrorInit,lCpduErrorInit.length);
   	
   }
   
   public void setLCpduErrorInit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLCpduErrorInit,lCpduErrorInit.length);
   	
   }
   
     /**
	 * 	Update LCpduErrorInit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLCpduErrorInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLCpduErrorInit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LCpduErrorInit with another Field
	 *	@param value
	 */
   public void setLCpduErrorInit(Field source) {
       replace(source,0,source.length(),beginLCpduErrorInit,L_CPDU_ERROR_INIT_LEN);
   	
   }  
   
     /**
	 * 	Update LCpduErrorInit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLCpduErrorInit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLCpduErrorInit,L_CPDU_ERROR_INIT_LEN);
   	
   }
   
     /**
	 * 	Update LCpduErrorInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLCpduErrorInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLCpduErrorInit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lCpduVisionInit
	 *	@return lCpduVisionInit
	 */   
	 public LCpduVisionInit getLCpduVisionInit() {
   	return lCpduVisionInit;
   }
   /**
	* 	Update LCpduVisionInit with the passed value
	*   Corresponding COBOL Variable is L-CPDU-VISION-INIT
	*	@param value
	*/
   public void setLCpduVisionInit(char[] value) {
      lCpduVisionInit.setString(value); 
   }   
    
     /**
	 * 	Update LCpduVisionInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setLCpduVisionInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lCpduVisionInit.begin,lCpduVisionInit.length());
   }
   
     /**
	 * 	Update LCpduVisionInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLCpduVisionInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lCpduVisionInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update LCpduVisionInit with another Field
	 *	@param value
	 */
   public void setLCpduVisionInit(Field source) {
   	replace(source,0,source.length(),lCpduVisionInit.begin,lCpduVisionInit.length());
   }  
   
     /**
	 * 	Update LCpduVisionInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setLCpduVisionInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,lCpduVisionInit.begin,lCpduVisionInit.length());
   }
   
     /**
	 * 	Update LCpduVisionInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLCpduVisionInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,lCpduVisionInit.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getLCpduTableInitFieldLength() {
			return L_CPDU_TABLE_INIT_LENGTH;
		}

}
  
