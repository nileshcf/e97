package com.cloudframe.app.ip662010.dto;

/**
*  The class IpmErrorMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IpmErrorMsg600 extends IpmErrorMsg600Serialized {
   


								private long errorCode600;


								private char[] ipmErrorRecordNo600 = Field.fillLowValue(11);

				private IpmErrorElementId600 ipmErrorElementId600 = new IpmErrorElementId600();


						private char[] ipmErrorText600 = Field.fillLowValue(64);
	
	/**
	* Constructor for IpmErrorMsg600
	**/
    public IpmErrorMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ipmErrorElementId600.setParent(this,getStartOffset() + 32);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP662010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("-REC ").toCharArray()
             , getStartOffset() + 14
             ,5
             );
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 30
             ,2
             );
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 37
             ,2
             );
    }


 

	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public long getErrorCode600() throws CFException {
       if (isErrorCode600Modified()) { 
           errorCode600 = refreshErrorCode600();
        }
   		return errorCode600;
	}
	

	
	   
	/**
	 * 	Update ErrorCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-ERROR-CODE
	 *	@param number
	 */
	public void setErrorCode600(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    errorCode600 = checkErrorCode600MaxLimit(number); 
		serializeErrorCode600(errorCode600);
	}
	

	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value) throws CFException {
		 errorCode600 = serializeErrorCode600(value);
	}
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value) throws CFException {
		 setErrorCode600(value);
	}
	/**
	 *	Returns the value of ipmErrorRecordNo600
	 *	@return ipmErrorRecordNo600
	 */
   public char[] getIpmErrorRecordNo600() throws CFException{
     if (isIpmErrorRecordNo600Modified()) { 
        ipmErrorRecordNo600 = refreshIpmErrorRecordNo600();
     }
   		return ipmErrorRecordNo600;
   }

  
	/**
	*  set variable ipmErrorRecordNo600
	*  Corresponding COBOL Variable is 600-IPM-ERROR-RECORD-NO
	*  @param value
	**/
   public void setIpmErrorRecordNo600(char[] value) {
      ipmErrorRecordNo600 = checkIpmErrorRecordNo600Constraints(value);
      serializeIpmErrorRecordNo600(ipmErrorRecordNo600);
   } 

     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIpmErrorRecordNo600,ipmErrorRecordNo600.length);
   	
   }
   
   public void setIpmErrorRecordNo600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorRecordNo600,ipmErrorRecordNo600.length);
   	
   }
   
     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorRecordNo600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IpmErrorRecordNo600 with another Field
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(Field source) {
       replace(source,0,source.length(),beginIpmErrorRecordNo600,IPM_ERROR_RECORD_NO_600_LEN);
   	
   }  
   
     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIpmErrorRecordNo600,IPM_ERROR_RECORD_NO_600_LEN);
   	
   }
   
     /**
	 * 	Update IpmErrorRecordNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorRecordNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorRecordNo600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ipmErrorElementId600
	 *	@return ipmErrorElementId600
	 */   
	 public IpmErrorElementId600 getIpmErrorElementId600() {
   	return ipmErrorElementId600;
   }
   /**
	* 	Update IpmErrorElementId600 with the passed value
	*   Corresponding COBOL Variable is 600-IPM-ERROR-ELEMENT-ID
	*	@param value
	*/
   public void setIpmErrorElementId600(char[] value) {
      ipmErrorElementId600.setString(value); 
   }   
    
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ipmErrorElementId600.begin,ipmErrorElementId600.length());
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ipmErrorElementId600.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update IpmErrorElementId600 with another Field
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source) {
   	replace(source,0,source.length(),ipmErrorElementId600.begin,ipmErrorElementId600.length());
   }  
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ipmErrorElementId600.begin,ipmErrorElementId600.length());
   }
   
     /**
	 * 	Update IpmErrorElementId600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorElementId600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ipmErrorElementId600.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ipmErrorText600
	 *	@return ipmErrorText600
	 */
   public char[] getIpmErrorText600() throws CFException{
     if (isIpmErrorText600Modified()) { 
        ipmErrorText600 = refreshIpmErrorText600();
     }
   		return ipmErrorText600;
   }

  
	/**
	*  set variable ipmErrorText600
	*  Corresponding COBOL Variable is 600-IPM-ERROR-TEXT
	*  @param value
	**/
   public void setIpmErrorText600(char[] value) {
      ipmErrorText600 = checkIpmErrorText600Constraints(value);
      serializeIpmErrorText600(ipmErrorText600);
   } 

     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIpmErrorText600,ipmErrorText600.length);
   	
   }
   
   public void setIpmErrorText600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorText600,ipmErrorText600.length);
   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorText600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IpmErrorText600 with another Field
	 *	@param value
	 */
   public void setIpmErrorText600(Field source) {
       replace(source,0,source.length(),beginIpmErrorText600,IPM_ERROR_TEXT_600_LEN);
   	
   }  
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIpmErrorText600,IPM_ERROR_TEXT_600_LEN);
   	
   }
   
     /**
	 * 	Update IpmErrorText600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIpmErrorText600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIpmErrorText600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIpmErrorMsg600FieldLength() {
			return IPM_ERROR_MSG_600_LENGTH;
		}

}
  
