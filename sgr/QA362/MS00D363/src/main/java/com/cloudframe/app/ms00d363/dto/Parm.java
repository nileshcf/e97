package com.cloudframe.app.ms00d363.dto;

/**
*  The class Parm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Parm extends ParmSerialized { 
   


						private char[] parmInType = Field.fillLowValue(7);


						private char[] parmErlyFlag = Field.fillLowValue(1);


						private char[] parmHeir = Field.fillLowValue(4);


						private char[] parmEsrvFlag = Field.fillLowValue(1);
	
	/**
	* Constructor for Parm
	**/
    public Parm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmInType
	 *	@return parmInType
	 */
   public char[] getParmInType() throws CFException{
     if (isParmInTypeModified()) { 
        parmInType = refreshParmInType();
     }
   		return parmInType;
   }

  
	/**
	*  set variable parmInType
	*  Corresponding COBOL Variable is PARM-IN-TYPE
	*  @param value
	**/
   public void setParmInType(char[] value) {
      parmInType = checkParmInTypeConstraints(value);
      serializeParmInType(parmInType);
   } 

     /**
	 * 	Update ParmInType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmInType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmInType,parmInType.length);
   	
   }
   
   public void setParmInType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmInType,parmInType.length);
   	
   }
   
     /**
	 * 	Update ParmInType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmInType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmInType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmInType with another Field
	 *	@param value
	 */
   public void setParmInType(Field source) {
       replace(source,0,source.length(),beginParmInType,PARM_IN_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update ParmInType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmInType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmInType,PARM_IN_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update ParmInType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmInType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmInType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmErlyFlag
	 *	@return parmErlyFlag
	 */
   public char[] getParmErlyFlag() throws CFException{
     if (isParmErlyFlagModified()) { 
        parmErlyFlag = refreshParmErlyFlag();
     }
   		return parmErlyFlag;
   }

  
	/**
	*  set variable parmErlyFlag
	*  Corresponding COBOL Variable is WS-PARM-ERLY-FLAG
	*  @param value
	**/
   public void setParmErlyFlag(char[] value) {
      parmErlyFlag = checkParmErlyFlagConstraints(value);
      serializeParmErlyFlag(parmErlyFlag);
   } 

     /**
	 * 	Update ParmErlyFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmErlyFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmErlyFlag,parmErlyFlag.length);
   	
   }
   
   public void setParmErlyFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmErlyFlag,parmErlyFlag.length);
   	
   }
   
     /**
	 * 	Update ParmErlyFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmErlyFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmErlyFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmErlyFlag with another Field
	 *	@param value
	 */
   public void setParmErlyFlag(Field source) {
       replace(source,0,source.length(),beginParmErlyFlag,PARM_ERLY_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update ParmErlyFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmErlyFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmErlyFlag,PARM_ERLY_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update ParmErlyFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmErlyFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmErlyFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmHeir
	 *	@return parmHeir
	 */
   public char[] getParmHeir() throws CFException{
     if (isParmHeirModified()) { 
        parmHeir = refreshParmHeir();
     }
   		return parmHeir;
   }

  
	/**
	*  set variable parmHeir
	*  Corresponding COBOL Variable is WS-PARM-HEIR
	*  @param value
	**/
   public void setParmHeir(char[] value) {
      parmHeir = checkParmHeirConstraints(value);
      serializeParmHeir(parmHeir);
   } 

     /**
	 * 	Update ParmHeir 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmHeir(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmHeir,parmHeir.length);
   	
   }
   
   public void setParmHeir(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmHeir,parmHeir.length);
   	
   }
   
     /**
	 * 	Update ParmHeir 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmHeir(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmHeir+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmHeir with another Field
	 *	@param value
	 */
   public void setParmHeir(Field source) {
       replace(source,0,source.length(),beginParmHeir,PARM_HEIR_LEN);
   	
   }  
   
     /**
	 * 	Update ParmHeir 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmHeir(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmHeir,PARM_HEIR_LEN);
   	
   }
   
     /**
	 * 	Update ParmHeir 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmHeir(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmHeir+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmEsrvFlag
	 *	@return parmEsrvFlag
	 */
   public char[] getParmEsrvFlag() throws CFException{
     if (isParmEsrvFlagModified()) { 
        parmEsrvFlag = refreshParmEsrvFlag();
     }
   		return parmEsrvFlag;
   }

  
	/**
	*  set variable parmEsrvFlag
	*  Corresponding COBOL Variable is WS-PARM-ESRV-FLAG
	*  @param value
	**/
   public void setParmEsrvFlag(char[] value) {
      parmEsrvFlag = checkParmEsrvFlagConstraints(value);
      serializeParmEsrvFlag(parmEsrvFlag);
   } 

     /**
	 * 	Update ParmEsrvFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmEsrvFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmEsrvFlag,parmEsrvFlag.length);
   	
   }
   
   public void setParmEsrvFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmEsrvFlag,parmEsrvFlag.length);
   	
   }
   
     /**
	 * 	Update ParmEsrvFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmEsrvFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmEsrvFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmEsrvFlag with another Field
	 *	@param value
	 */
   public void setParmEsrvFlag(Field source) {
       replace(source,0,source.length(),beginParmEsrvFlag,PARM_ESRV_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update ParmEsrvFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmEsrvFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmEsrvFlag,PARM_ESRV_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update ParmEsrvFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmEsrvFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmEsrvFlag+targetIndex,targetLen);
    
   }

	
	
	

		public static int getParmFieldLength() {
			return PARM_LENGTH;
		}

}
  
