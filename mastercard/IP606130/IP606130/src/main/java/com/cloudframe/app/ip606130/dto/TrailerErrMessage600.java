package com.cloudframe.app.ip606130.dto;

/**
*  The class TrailerErrMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class TrailerErrMessage600 extends TrailerErrMessage600Serialized { 
   


								private char[] errorInpCount600 = new char[10];
							


								private char[] errorTrlCount600 = new char[10];
							


						private char[] errorTableNbr600 = new char[8];
	
	/**
	* Constructor for TrailerErrMessage600
	**/
    public TrailerErrMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INPUT RECORD COUNT ").toCharArray()
             , getStartOffset() + 0
             ,19
             );
								setErrorInpCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             (" DOES NOT MATCH THE TRAILER COUNT ").toCharArray()
             , getStartOffset() + 29
             ,34
             );
								setErrorTrlCount600(CFUtil.cobolNumberFormatter("ZZ,ZZZ,ZZ9".toCharArray(),"0".toCharArray()));
       replaceValue( // serialize and save the value
             (" FOR TABLE ").toCharArray()
             , getStartOffset() + 73
             ,11
             );
								setErrorTableNbr600(fillSpace(8));
    }


 

	/**
	 *	Returns the value of errorInpCount600
	 *	@return errorInpCount600
	 */
   public char[] getErrorInpCount600() throws CFException{
     if (isErrorInpCount600Modified()) { 
        errorInpCount600 = refreshErrorInpCount600();
     }
   		return errorInpCount600;
   }

  
	/**
	*  set variable errorInpCount600
	*  Corresponding COBOL Variable is 600-ERROR-INP-COUNT
	*  @param value
	**/
   public void setErrorInpCount600(char[] value) {
      errorInpCount600 = checkErrorInpCount600Constraints(value);
      serializeErrorInpCount600(errorInpCount600);
   } 

     /**
	 * 	Update ErrorInpCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorInpCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorInpCount600,errorInpCount600.length);
   	
   }
   
   public void setErrorInpCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorInpCount600,errorInpCount600.length);
   	
   }
   
     /**
	 * 	Update ErrorInpCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorInpCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorInpCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorInpCount600 with another Field
	 *	@param value
	 */
   public void setErrorInpCount600(Field source) {
       replace(source,0,source.length(),beginErrorInpCount600,ERROR_INP_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorInpCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorInpCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorInpCount600,ERROR_INP_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update ErrorInpCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorInpCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorInpCount600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorTrlCount600
	 *	@return errorTrlCount600
	 */
   public char[] getErrorTrlCount600() throws CFException{
     if (isErrorTrlCount600Modified()) { 
        errorTrlCount600 = refreshErrorTrlCount600();
     }
   		return errorTrlCount600;
   }

  
	/**
	*  set variable errorTrlCount600
	*  Corresponding COBOL Variable is 600-ERROR-TRL-COUNT
	*  @param value
	**/
   public void setErrorTrlCount600(char[] value) {
      errorTrlCount600 = checkErrorTrlCount600Constraints(value);
      serializeErrorTrlCount600(errorTrlCount600);
   } 

     /**
	 * 	Update ErrorTrlCount600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorTrlCount600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorTrlCount600,errorTrlCount600.length);
   	
   }
   
   public void setErrorTrlCount600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorTrlCount600,errorTrlCount600.length);
   	
   }
   
     /**
	 * 	Update ErrorTrlCount600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorTrlCount600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorTrlCount600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorTrlCount600 with another Field
	 *	@param value
	 */
   public void setErrorTrlCount600(Field source) {
       replace(source,0,source.length(),beginErrorTrlCount600,ERROR_TRL_COUNT_600_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorTrlCount600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorTrlCount600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorTrlCount600,ERROR_TRL_COUNT_600_LEN);
   	
   }
   
     /**
	 * 	Update ErrorTrlCount600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorTrlCount600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorTrlCount600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorTableNbr600
	 *	@return errorTableNbr600
	 */
   public char[] getErrorTableNbr600() throws CFException{
     if (isErrorTableNbr600Modified()) { 
        errorTableNbr600 = refreshErrorTableNbr600();
     }
   		return errorTableNbr600;
   }

  
	/**
	*  set variable errorTableNbr600
	*  Corresponding COBOL Variable is 600-ERROR-TABLE-NBR
	*  @param value
	**/
   public void setErrorTableNbr600(char[] value) {
      errorTableNbr600 = checkErrorTableNbr600Constraints(value);
      serializeErrorTableNbr600(errorTableNbr600);
   } 

     /**
	 * 	Update ErrorTableNbr600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorTableNbr600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorTableNbr600,errorTableNbr600.length);
   	
   }
   
   public void setErrorTableNbr600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorTableNbr600,errorTableNbr600.length);
   	
   }
   
     /**
	 * 	Update ErrorTableNbr600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorTableNbr600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorTableNbr600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorTableNbr600 with another Field
	 *	@param value
	 */
   public void setErrorTableNbr600(Field source) {
       replace(source,0,source.length(),beginErrorTableNbr600,ERROR_TABLE_NBR_600_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorTableNbr600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorTableNbr600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorTableNbr600,ERROR_TABLE_NBR_600_LEN);
   	
   }
   
     /**
	 * 	Update ErrorTableNbr600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorTableNbr600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorTableNbr600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTrailerErrMessage600FieldLength() {
			return TRAILER_ERR_MESSAGE_600_LENGTH;
		}

}
  
