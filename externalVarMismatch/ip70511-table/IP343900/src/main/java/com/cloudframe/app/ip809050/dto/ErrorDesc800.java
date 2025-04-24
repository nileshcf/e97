package com.cloudframe.app.ip809050.dto;

/**
*  The class ErrorDesc800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorDesc800 extends ErrorDesc800Serialized { 
   

						private char[] errDesc1800 = new char[106];

						private char[] errDesc2800 = new char[100];
	
	/**
	* Constructor for ErrorDesc800
	**/
    public ErrorDesc800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ErrorDesc800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrorDesc800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setErrDesc1800(pad(106," ".toCharArray(),' ',RIGHT_PAD));
								setErrDesc2800(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of errDesc1800
	 *	@return errDesc1800
	 */
   public char[] getErrDesc1800() throws CFException{
     if (isErrDesc1800Modified()) { 
        errDesc1800 = refreshErrDesc1800();
     }
   		return errDesc1800;
   }

  
	/**
	*  set variable errDesc1800
	*  Corresponding COBOL Variable is 800-ERR-DESC1
	*  @param value
	**/
   public void setErrDesc1800(char[] value) {
      errDesc1800 = checkErrDesc1800Constraints(value);
      serializeErrDesc1800(errDesc1800);
   } 

     /**
	 * 	Update ErrDesc1800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrDesc1800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrDesc1800,errDesc1800.length);
   	
   }
   
   public void setErrDesc1800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrDesc1800,errDesc1800.length);
   	
   }
   
     /**
	 * 	Update ErrDesc1800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrDesc1800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrDesc1800 with another Field
	 *	@param value
	 */
   public void setErrDesc1800(Field source) {
       replace(source,0,source.length(),beginErrDesc1800,ERR_DESC_1800_LEN);
   	
   }  
   
     /**
	 * 	Update ErrDesc1800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrDesc1800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrDesc1800,ERR_DESC_1800_LEN);
   	
   }
   
     /**
	 * 	Update ErrDesc1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrDesc1800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errDesc2800
	 *	@return errDesc2800
	 */
   public char[] getErrDesc2800() throws CFException{
     if (isErrDesc2800Modified()) { 
        errDesc2800 = refreshErrDesc2800();
     }
   		return errDesc2800;
   }

  
	/**
	*  set variable errDesc2800
	*  Corresponding COBOL Variable is 800-ERR-DESC2
	*  @param value
	**/
   public void setErrDesc2800(char[] value) {
      errDesc2800 = checkErrDesc2800Constraints(value);
      serializeErrDesc2800(errDesc2800);
   } 

     /**
	 * 	Update ErrDesc2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrDesc2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrDesc2800,errDesc2800.length);
   	
   }
   
   public void setErrDesc2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrDesc2800,errDesc2800.length);
   	
   }
   
     /**
	 * 	Update ErrDesc2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrDesc2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrDesc2800 with another Field
	 *	@param value
	 */
   public void setErrDesc2800(Field source) {
       replace(source,0,source.length(),beginErrDesc2800,ERR_DESC_2800_LEN);
   	
   }  
   
     /**
	 * 	Update ErrDesc2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrDesc2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrDesc2800,ERR_DESC_2800_LEN);
   	
   }
   
     /**
	 * 	Update ErrDesc2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrDesc2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrDesc2800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorDesc800FieldLength() {
			return ERROR_DESC_800_LENGTH;
		}

}
  
