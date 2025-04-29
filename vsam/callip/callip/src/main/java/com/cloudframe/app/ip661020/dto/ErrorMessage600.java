package com.cloudframe.app.ip661020.dto;

/**
*  The class ErrorMessage600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip661020.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMessage600 extends ErrorMessage600Serialized {
   


						private char[] errorParagraph600 = new char[4];


						private char[] failingAction600 = new char[5];


						private char[] badStatusCode600 = new char[2];

	
	/**
	* Constructor for ErrorMessage600
	**/
    public ErrorMessage600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP661020").toCharArray()
             , getStartOffset() + 0
             ,8
             );
								setErrorParagraph600(fillSpace(4));
       replaceValue( // serialize and save the value
             (": I/O ERROR DURING ").toCharArray()
             , getStartOffset() + 12
             ,19
             );
								setFailingAction600(fillSpace(5));
       replaceValue( // serialize and save the value
             (" ON IPM FILE.  STATUS CODE = \"").toCharArray()
             , getStartOffset() + 36
             ,30
             );
								setBadStatusCode600(fillSpace(2));
       replaceValue( // serialize and save the value
             ("\".").toCharArray()
             , getStartOffset() + 68
             ,2
             );
    }


 

	/**
	 *	Returns the value of errorParagraph600
	 *	@return errorParagraph600
	 */
   public char[] getErrorParagraph600() throws CFException{
     if (isErrorParagraph600Modified()) { 
        errorParagraph600 = refreshErrorParagraph600();
     }
   		return errorParagraph600;
   }

  
	/**
	*  set variable errorParagraph600
	*  Corresponding COBOL Variable is 600-ERROR-PARAGRAPH
	*  @param value
	**/
   public void setErrorParagraph600(char[] value) {
      errorParagraph600 = checkErrorParagraph600Constraints(value);
      serializeErrorParagraph600(errorParagraph600);
   } 

     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorParagraph600,errorParagraph600.length);
   	
   }
   
   public void setErrorParagraph600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorParagraph600,errorParagraph600.length);
   	
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorParagraph600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorParagraph600 with another Field
	 *	@param value
	 */
   public void setErrorParagraph600(Field source) {
       replace(source,0,source.length(),beginErrorParagraph600,ERROR_PARAGRAPH_600_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorParagraph600,ERROR_PARAGRAPH_600_LEN);
   	
   }
   
     /**
	 * 	Update ErrorParagraph600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorParagraph600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorParagraph600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of failingAction600
	 *	@return failingAction600
	 */
   public char[] getFailingAction600() throws CFException{
     if (isFailingAction600Modified()) { 
        failingAction600 = refreshFailingAction600();
     }
   		return failingAction600;
   }

  
	/**
	*  set variable failingAction600
	*  Corresponding COBOL Variable is 600-FAILING-ACTION
	*  @param value
	**/
   public void setFailingAction600(char[] value) {
      failingAction600 = checkFailingAction600Constraints(value);
      serializeFailingAction600(failingAction600);
   } 

     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFailingAction600,failingAction600.length);
   	
   }
   
   public void setFailingAction600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFailingAction600,failingAction600.length);
   	
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFailingAction600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FailingAction600 with another Field
	 *	@param value
	 */
   public void setFailingAction600(Field source) {
       replace(source,0,source.length(),beginFailingAction600,FAILING_ACTION_600_LEN);
   	
   }  
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFailingAction600,FAILING_ACTION_600_LEN);
   	
   }
   
     /**
	 * 	Update FailingAction600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFailingAction600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFailingAction600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of badStatusCode600
	 *	@return badStatusCode600
	 */
   public char[] getBadStatusCode600() throws CFException{
     if (isBadStatusCode600Modified()) { 
        badStatusCode600 = refreshBadStatusCode600();
     }
   		return badStatusCode600;
   }

  
	/**
	*  set variable badStatusCode600
	*  Corresponding COBOL Variable is 600-BAD-STATUS-CODE
	*  @param value
	**/
   public void setBadStatusCode600(char[] value) {
      badStatusCode600 = checkBadStatusCode600Constraints(value);
      serializeBadStatusCode600(badStatusCode600);
   } 

     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBadStatusCode600,badStatusCode600.length);
   	
   }
   
   public void setBadStatusCode600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode600,badStatusCode600.length);
   	
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BadStatusCode600 with another Field
	 *	@param value
	 */
   public void setBadStatusCode600(Field source) {
       replace(source,0,source.length(),beginBadStatusCode600,BAD_STATUS_CODE_600_LEN);
   	
   }  
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBadStatusCode600,BAD_STATUS_CODE_600_LEN);
   	
   }
   
     /**
	 * 	Update BadStatusCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBadStatusCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBadStatusCode600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMessage600FieldLength() {
			return ERROR_MESSAGE_600_LENGTH;
		}

}
  
