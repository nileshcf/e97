package com.cloudframe.app.vsamdb2.dto;

/**
*  The class AbendMessage900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/


import com.cloudframe.app.vsamdb2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendMessage900 extends AbendMessage900Serialized {
   



						private char[] abendCode900 = new char[4];


						private char[] errorText900 = new char[66];
	
	/**
	* Constructor for AbendMessage900
	**/
    public AbendMessage900() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IPJPNDRV").toCharArray()
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 8
             ,1
             );
								setAbendCode900(fillSpace(4));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 13
             ,1
             );
								setErrorText900(pad(66," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
   public char[] getAbendCode900() throws CFException{
     if (isAbendCode900Modified()) { 
        abendCode900 = refreshAbendCode900();
     }
   		return abendCode900;
   }

  
	/**
	*  set variable abendCode900
	*  Corresponding COBOL Variable is 900-ABEND-CODE
	*  @param value
	**/
   public void setAbendCode900(char[] value) {
      abendCode900 = checkAbendCode900Constraints(value);
      serializeAbendCode900(abendCode900);
   } 

     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendCode900,abendCode900.length);
   	
   }
   
   public void setAbendCode900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCode900,abendCode900.length);
   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCode900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendCode900 with another Field
	 *	@param value
	 */
   public void setAbendCode900(Field source) {
       replace(source,0,source.length(),beginAbendCode900,ABEND_CODE_900_LEN);
   	
   }  
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendCode900,ABEND_CODE_900_LEN);
   	
   }
   
     /**
	 * 	Update AbendCode900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCode900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCode900+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorText900
	 *	@return errorText900
	 */
   public char[] getErrorText900() throws CFException{
     if (isErrorText900Modified()) { 
        errorText900 = refreshErrorText900();
     }
   		return errorText900;
   }

  
	/**
	*  set variable errorText900
	*  Corresponding COBOL Variable is 900-ERROR-TEXT
	*  @param value
	**/
   public void setErrorText900(char[] value) {
      errorText900 = checkErrorText900Constraints(value);
      serializeErrorText900(errorText900);
   } 

     /**
	 * 	Update ErrorText900 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorText900(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorText900,errorText900.length);
   	
   }
   
   public void setErrorText900(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorText900,errorText900.length);
   	
   }
   
     /**
	 * 	Update ErrorText900 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorText900(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorText900+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorText900 with another Field
	 *	@param value
	 */
   public void setErrorText900(Field source) {
       replace(source,0,source.length(),beginErrorText900,ERROR_TEXT_900_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorText900 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorText900(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorText900,ERROR_TEXT_900_LEN);
   	
   }
   
     /**
	 * 	Update ErrorText900 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorText900(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorText900+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendMessage900FieldLength() {
			return ABEND_MESSAGE_900_LENGTH;
		}

}
  
