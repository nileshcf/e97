package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorConsMsgBulkid692 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorConsMsgBulkid692 extends ErrorConsMsgBulkid692Serialized {
   


						private char[] errBulkid692 = new char[4];
	
	/**
	* Constructor for ErrorConsMsgBulkid692
	**/
    public ErrorConsMsgBulkid692() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" BULKID: ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setErrBulkid692(fillSpace(4));
    }


 

	/**
	 *	Returns the value of errBulkid692
	 *	@return errBulkid692
	 */
   public char[] getErrBulkid692() throws CFException{
     if (isErrBulkid692Modified()) { 
        errBulkid692 = refreshErrBulkid692();
     }
   		return errBulkid692;
   }

  
	/**
	*  set variable errBulkid692
	*  Corresponding COBOL Variable is 692-ERR-BULKID
	*  @param value
	**/
   public void setErrBulkid692(char[] value) {
      errBulkid692 = checkErrBulkid692Constraints(value);
      serializeErrBulkid692(errBulkid692);
   } 

     /**
	 * 	Update ErrBulkid692 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrBulkid692(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrBulkid692,errBulkid692.length);
   	
   }
   
   public void setErrBulkid692(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrBulkid692,errBulkid692.length);
   	
   }
   
     /**
	 * 	Update ErrBulkid692 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrBulkid692(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrBulkid692+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrBulkid692 with another Field
	 *	@param value
	 */
   public void setErrBulkid692(Field source) {
       replace(source,0,source.length(),beginErrBulkid692,ERR_BULKID_692_LEN);
   	
   }  
   
     /**
	 * 	Update ErrBulkid692 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrBulkid692(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrBulkid692,ERR_BULKID_692_LEN);
   	
   }
   
     /**
	 * 	Update ErrBulkid692 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrBulkid692(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrBulkid692+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorConsMsgBulkid692FieldLength() {
			return ERROR_CONS_MSG_BULKID_692_LENGTH;
		}

}
  
