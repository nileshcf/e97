package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorConsMsgCycl692 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorConsMsgCycl692 extends ErrorConsMsgCycl692Serialized { 
   


						private char[] errCycl692 = new char[3];
	
	/**
	* Constructor for ErrorConsMsgCycl692
	**/
    public ErrorConsMsgCycl692() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" CYCLE: ").toCharArray()
             , getStartOffset() + 0
             ,8
             );
								setErrCycl692(fillSpace(3));
    }


 

	/**
	 *	Returns the value of errCycl692
	 *	@return errCycl692
	 */
   public char[] getErrCycl692() throws CFException{
     if (isErrCycl692Modified()) { 
        errCycl692 = refreshErrCycl692();
     }
   		return errCycl692;
   }

  
	/**
	*  set variable errCycl692
	*  Corresponding COBOL Variable is 692-ERR-CYCL
	*  @param value
	**/
   public void setErrCycl692(char[] value) {
      errCycl692 = checkErrCycl692Constraints(value);
      serializeErrCycl692(errCycl692);
   } 

     /**
	 * 	Update ErrCycl692 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrCycl692(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrCycl692,errCycl692.length);
   	
   }
   
   public void setErrCycl692(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrCycl692,errCycl692.length);
   	
   }
   
     /**
	 * 	Update ErrCycl692 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrCycl692(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrCycl692+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrCycl692 with another Field
	 *	@param value
	 */
   public void setErrCycl692(Field source) {
       replace(source,0,source.length(),beginErrCycl692,ERR_CYCL_692_LEN);
   	
   }  
   
     /**
	 * 	Update ErrCycl692 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrCycl692(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrCycl692,ERR_CYCL_692_LEN);
   	
   }
   
     /**
	 * 	Update ErrCycl692 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrCycl692(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrCycl692+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorConsMsgCycl692FieldLength() {
			return ERROR_CONS_MSG_CYCL_692_LENGTH;
		}

}
  
