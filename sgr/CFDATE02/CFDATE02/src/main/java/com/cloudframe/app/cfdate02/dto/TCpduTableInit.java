package com.cloudframe.app.cfdate02.dto;

/**
*  The class TCpduTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TCpduTableInit extends TCpduTableInitSerialized {
   
				private TCpduUbInit tCpduUbInit = new TCpduUbInit();

						private char[] tCpduErrorInit = new char[6];
				private TCpduVisionInit tCpduVisionInit = new TCpduVisionInit();
	
	/**
	* Constructor for TCpduTableInit
	**/
    public TCpduTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			tCpduUbInit.setParent(this,getStartOffset() + 0);
	       			tCpduVisionInit.setParent(this,getStartOffset() + 168);
	   	/*  end of offset */
								setTCpduErrorInit(fillSpace(6));
    }


 

	/**
	 *	Returns the value of tCpduUbInit
	 *	@return tCpduUbInit
	 */   
	 public TCpduUbInit getTCpduUbInit() {
   	return tCpduUbInit;
   }
   /**
	* 	Update TCpduUbInit with the passed value
	*   Corresponding COBOL Variable is T-CPDU-UB-INIT
	*	@param value
	*/
   public void setTCpduUbInit(char[] value) {
      tCpduUbInit.setString(value); 
   }   
    
     /**
	 * 	Update TCpduUbInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTCpduUbInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tCpduUbInit.begin,tCpduUbInit.length());
   }
   
     /**
	 * 	Update TCpduUbInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTCpduUbInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tCpduUbInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TCpduUbInit with another Field
	 *	@param value
	 */
   public void setTCpduUbInit(Field source) {
   	replace(source,0,source.length(),tCpduUbInit.begin,tCpduUbInit.length());
   }  
   
     /**
	 * 	Update TCpduUbInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTCpduUbInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tCpduUbInit.begin,tCpduUbInit.length());
   }
   
     /**
	 * 	Update TCpduUbInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTCpduUbInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tCpduUbInit.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of tCpduErrorInit
	 *	@return tCpduErrorInit
	 */
   public char[] getTCpduErrorInit() throws CFException{
     if (isTCpduErrorInitModified()) { 
        tCpduErrorInit = refreshTCpduErrorInit();
     }
   		return tCpduErrorInit;
   }

  
	/**
	*  set variable tCpduErrorInit
	*  Corresponding COBOL Variable is T-CPDU-ERROR-INIT
	*  @param value
	**/
   public void setTCpduErrorInit(char[] value) {
      tCpduErrorInit = checkTCpduErrorInitConstraints(value);
      serializeTCpduErrorInit(tCpduErrorInit);
   } 

     /**
	 * 	Update TCpduErrorInit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTCpduErrorInit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTCpduErrorInit,tCpduErrorInit.length);
   	
   }
   
   public void setTCpduErrorInit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTCpduErrorInit,tCpduErrorInit.length);
   	
   }
   
     /**
	 * 	Update TCpduErrorInit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTCpduErrorInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTCpduErrorInit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TCpduErrorInit with another Field
	 *	@param value
	 */
   public void setTCpduErrorInit(Field source) {
       replace(source,0,source.length(),beginTCpduErrorInit,T_CPDU_ERROR_INIT_LEN);
   	
   }  
   
     /**
	 * 	Update TCpduErrorInit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTCpduErrorInit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTCpduErrorInit,T_CPDU_ERROR_INIT_LEN);
   	
   }
   
     /**
	 * 	Update TCpduErrorInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTCpduErrorInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTCpduErrorInit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tCpduVisionInit
	 *	@return tCpduVisionInit
	 */   
	 public TCpduVisionInit getTCpduVisionInit() {
   	return tCpduVisionInit;
   }
   /**
	* 	Update TCpduVisionInit with the passed value
	*   Corresponding COBOL Variable is T-CPDU-VISION-INIT
	*	@param value
	*/
   public void setTCpduVisionInit(char[] value) {
      tCpduVisionInit.setString(value); 
   }   
    
     /**
	 * 	Update TCpduVisionInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTCpduVisionInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tCpduVisionInit.begin,tCpduVisionInit.length());
   }
   
     /**
	 * 	Update TCpduVisionInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTCpduVisionInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tCpduVisionInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TCpduVisionInit with another Field
	 *	@param value
	 */
   public void setTCpduVisionInit(Field source) {
   	replace(source,0,source.length(),tCpduVisionInit.begin,tCpduVisionInit.length());
   }  
   
     /**
	 * 	Update TCpduVisionInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTCpduVisionInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tCpduVisionInit.begin,tCpduVisionInit.length());
   }
   
     /**
	 * 	Update TCpduVisionInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTCpduVisionInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tCpduVisionInit.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTCpduTableInitFieldLength() {
			return T_CPDU_TABLE_INIT_LENGTH;
		}

}
  
