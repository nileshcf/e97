package com.cloudframe.app.ar640010.dto;

/**
*  The class ErrorConsMsgEndpt692 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorConsMsgEndpt692 extends ErrorConsMsgEndpt692Serialized {
   


						private char[] errEndpoint692 = new char[7];
	
	/**
	* Constructor for ErrorConsMsgEndpt692
	**/
    public ErrorConsMsgEndpt692() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ENDPOINT: ").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setErrEndpoint692(fillSpace(7));
    }


 

	/**
	 *	Returns the value of errEndpoint692
	 *	@return errEndpoint692
	 */
   public char[] getErrEndpoint692() throws CFException{
     if (isErrEndpoint692Modified()) { 
        errEndpoint692 = refreshErrEndpoint692();
     }
   		return errEndpoint692;
   }

  
	/**
	*  set variable errEndpoint692
	*  Corresponding COBOL Variable is 692-ERR-ENDPOINT
	*  @param value
	**/
   public void setErrEndpoint692(char[] value) {
      errEndpoint692 = checkErrEndpoint692Constraints(value);
      serializeErrEndpoint692(errEndpoint692);
   } 

     /**
	 * 	Update ErrEndpoint692 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrEndpoint692(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrEndpoint692,errEndpoint692.length);
   	
   }
   
   public void setErrEndpoint692(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrEndpoint692,errEndpoint692.length);
   	
   }
   
     /**
	 * 	Update ErrEndpoint692 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrEndpoint692(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrEndpoint692+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrEndpoint692 with another Field
	 *	@param value
	 */
   public void setErrEndpoint692(Field source) {
       replace(source,0,source.length(),beginErrEndpoint692,ERR_ENDPOINT_692_LEN);
   	
   }  
   
     /**
	 * 	Update ErrEndpoint692 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrEndpoint692(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrEndpoint692,ERR_ENDPOINT_692_LEN);
   	
   }
   
     /**
	 * 	Update ErrEndpoint692 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrEndpoint692(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrEndpoint692+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorConsMsgEndpt692FieldLength() {
			return ERROR_CONS_MSG_ENDPT_692_LENGTH;
		}

}
  
