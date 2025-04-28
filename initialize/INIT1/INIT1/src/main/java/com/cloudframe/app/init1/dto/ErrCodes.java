package com.cloudframe.app.init1.dto;

/**
*  The class ErrCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class ErrCodes extends ErrCodesSerialized { 
   

						private char[] errSumCd = new char[3];

						private char[] errUsgCd = new char[3];

						private char[] errLscCd = new char[3];

						private char[] errRemCd = new char[3];

						private char[] errAtdCd = new char[3];
	
	/**
	* Constructor for ErrCodes
	**/
    public ErrCodes() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrSumCd(fillSpace(3));
								setErrUsgCd(fillSpace(3));
								setErrLscCd(fillSpace(3));
								setErrRemCd(fillSpace(3));
								setErrAtdCd(fillSpace(3));
    } 

	/**
	 *	Returns the value of errSumCd
	 *	@return errSumCd
	 */
   public char[] getErrSumCd() throws CFException{
     if (isErrSumCdModified()) { 
        errSumCd = refreshErrSumCd();
     }
   		return errSumCd;
   }

  
	/**
	*  set variable errSumCd
	*  Corresponding COBOL Variable is WS-ERR-SUM-CD
	*  @param value
	**/
   public void setErrSumCd(char[] value) {
      errSumCd = checkErrSumCdConstraints(value);
      serializeErrSumCd(errSumCd);
   } 

     /**
	 * 	Update ErrSumCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrSumCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrSumCd,errSumCd.length);
   	
   }
   
   public void setErrSumCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrSumCd,errSumCd.length);
   	
   }
   
     /**
	 * 	Update ErrSumCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrSumCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrSumCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrSumCd with another Field
	 *	@param value
	 */
   public void setErrSumCd(Field source) {
       replace(source,0,source.length(),beginErrSumCd,ERR_SUM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ErrSumCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrSumCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrSumCd,ERR_SUM_CD_LEN);
   	
   }
   
     /**
	 * 	Update ErrSumCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrSumCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrSumCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errUsgCd
	 *	@return errUsgCd
	 */
   public char[] getErrUsgCd() throws CFException{
     if (isErrUsgCdModified()) { 
        errUsgCd = refreshErrUsgCd();
     }
   		return errUsgCd;
   }

  
	/**
	*  set variable errUsgCd
	*  Corresponding COBOL Variable is WS-ERR-USG-CD
	*  @param value
	**/
   public void setErrUsgCd(char[] value) {
      errUsgCd = checkErrUsgCdConstraints(value);
      serializeErrUsgCd(errUsgCd);
   } 

     /**
	 * 	Update ErrUsgCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrUsgCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrUsgCd,errUsgCd.length);
   	
   }
   
   public void setErrUsgCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrUsgCd,errUsgCd.length);
   	
   }
   
     /**
	 * 	Update ErrUsgCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrUsgCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrUsgCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrUsgCd with another Field
	 *	@param value
	 */
   public void setErrUsgCd(Field source) {
       replace(source,0,source.length(),beginErrUsgCd,ERR_USG_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ErrUsgCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrUsgCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrUsgCd,ERR_USG_CD_LEN);
   	
   }
   
     /**
	 * 	Update ErrUsgCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrUsgCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrUsgCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errLscCd
	 *	@return errLscCd
	 */
   public char[] getErrLscCd() throws CFException{
     if (isErrLscCdModified()) { 
        errLscCd = refreshErrLscCd();
     }
   		return errLscCd;
   }

  
	/**
	*  set variable errLscCd
	*  Corresponding COBOL Variable is WS-ERR-LSC-CD
	*  @param value
	**/
   public void setErrLscCd(char[] value) {
      errLscCd = checkErrLscCdConstraints(value);
      serializeErrLscCd(errLscCd);
   } 

     /**
	 * 	Update ErrLscCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrLscCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrLscCd,errLscCd.length);
   	
   }
   
   public void setErrLscCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrLscCd,errLscCd.length);
   	
   }
   
     /**
	 * 	Update ErrLscCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrLscCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrLscCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrLscCd with another Field
	 *	@param value
	 */
   public void setErrLscCd(Field source) {
       replace(source,0,source.length(),beginErrLscCd,ERR_LSC_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ErrLscCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrLscCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrLscCd,ERR_LSC_CD_LEN);
   	
   }
   
     /**
	 * 	Update ErrLscCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrLscCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrLscCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errRemCd
	 *	@return errRemCd
	 */
   public char[] getErrRemCd() throws CFException{
     if (isErrRemCdModified()) { 
        errRemCd = refreshErrRemCd();
     }
   		return errRemCd;
   }

  
	/**
	*  set variable errRemCd
	*  Corresponding COBOL Variable is WS-ERR-REM-CD
	*  @param value
	**/
   public void setErrRemCd(char[] value) {
      errRemCd = checkErrRemCdConstraints(value);
      serializeErrRemCd(errRemCd);
   } 

     /**
	 * 	Update ErrRemCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrRemCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrRemCd,errRemCd.length);
   	
   }
   
   public void setErrRemCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrRemCd,errRemCd.length);
   	
   }
   
     /**
	 * 	Update ErrRemCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrRemCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrRemCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrRemCd with another Field
	 *	@param value
	 */
   public void setErrRemCd(Field source) {
       replace(source,0,source.length(),beginErrRemCd,ERR_REM_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ErrRemCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrRemCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrRemCd,ERR_REM_CD_LEN);
   	
   }
   
     /**
	 * 	Update ErrRemCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrRemCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrRemCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errAtdCd
	 *	@return errAtdCd
	 */
   public char[] getErrAtdCd() throws CFException{
     if (isErrAtdCdModified()) { 
        errAtdCd = refreshErrAtdCd();
     }
   		return errAtdCd;
   }

  
	/**
	*  set variable errAtdCd
	*  Corresponding COBOL Variable is WS-ERR-ATD-CD
	*  @param value
	**/
   public void setErrAtdCd(char[] value) {
      errAtdCd = checkErrAtdCdConstraints(value);
      serializeErrAtdCd(errAtdCd);
   } 

     /**
	 * 	Update ErrAtdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrAtdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrAtdCd,errAtdCd.length);
   	
   }
   
   public void setErrAtdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrAtdCd,errAtdCd.length);
   	
   }
   
     /**
	 * 	Update ErrAtdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrAtdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrAtdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrAtdCd with another Field
	 *	@param value
	 */
   public void setErrAtdCd(Field source) {
       replace(source,0,source.length(),beginErrAtdCd,ERR_ATD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ErrAtdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrAtdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrAtdCd,ERR_ATD_CD_LEN);
   	
   }
   
     /**
	 * 	Update ErrAtdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrAtdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrAtdCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes ErrCodes
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setErrSumCd(CONSTANTS.SPACE_3);
         setErrUsgCd(CONSTANTS.SPACE_3);
         setErrLscCd(CONSTANTS.SPACE_3);
         setErrRemCd(CONSTANTS.SPACE_3);
         setErrAtdCd(CONSTANTS.SPACE_3);
   }

		public static int getErrCodesFieldLength() {
			return ERR_CODES_LENGTH;
		}

}
  
