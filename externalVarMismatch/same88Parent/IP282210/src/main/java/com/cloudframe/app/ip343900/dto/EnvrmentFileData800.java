package com.cloudframe.app.ip343900.dto;

/**
*  The class EnvrmentFileData800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.ip343900.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EnvrmentFileData800 extends EnvrmentFileData800Serialized {
   

						private char[] parmEnvIdentifier800 = Field.fillLowValue(3);
	
	/**
	* Constructor for EnvrmentFileData800
	**/
    public EnvrmentFileData800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of parmEnvIdentifier800
	 *	@return parmEnvIdentifier800
	 */
   public char[] getParmEnvIdentifier800() throws CFException{
     if (isParmEnvIdentifier800Modified()) { 
        parmEnvIdentifier800 = refreshParmEnvIdentifier800();
     }
   		return parmEnvIdentifier800;
   }

  
	/**
	*  set variable parmEnvIdentifier800
	*  Corresponding COBOL Variable is 800-PARM-ENV-IDENTIFIER
	*  @param value
	**/
   public void setParmEnvIdentifier800(char[] value) {
      parmEnvIdentifier800 = checkParmEnvIdentifier800Constraints(value);
      serializeParmEnvIdentifier800(parmEnvIdentifier800);
   } 

     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmEnvIdentifier800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmEnvIdentifier800,parmEnvIdentifier800.length);
   	
   }
   
   public void setParmEnvIdentifier800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmEnvIdentifier800,parmEnvIdentifier800.length);
   	
   }
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmEnvIdentifier800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmEnvIdentifier800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmEnvIdentifier800 with another Field
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source) {
       replace(source,0,source.length(),beginParmEnvIdentifier800,PARM_ENV_IDENTIFIER_800_LEN);
   	
   }  
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmEnvIdentifier800,PARM_ENV_IDENTIFIER_800_LEN);
   	
   }
   
     /**
	 * 	Update ParmEnvIdentifier800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmEnvIdentifier800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmEnvIdentifier800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEnvrmentFileData800FieldLength() {
			return ENVRMENT_FILE_DATA_800_LENGTH;
		}

}
  
