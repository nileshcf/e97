package com.cloudframe.app.ar640010.dto;

/**
*  The class XtkMsg2600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class XtkMsg2600 extends XtkMsg2600Serialized { 
   


						private char[] failedValidation600 = new char[40];
	
	/**
	* Constructor for XtkMsg2600
	**/
    public XtkMsg2600() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for XtkMsg2600. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public XtkMsg2600(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("1700-XTK PROCESS:").toCharArray()
             , getStartOffset() + 0
             ,17
             );
								setFailedValidation600(fillSpace(40));
    } 

	/**
	 *	Returns the value of failedValidation600
	 *	@return failedValidation600
	 */
   public char[] getFailedValidation600() throws CFException{
     if (isFailedValidation600Modified()) { 
        failedValidation600 = refreshFailedValidation600();
     }
   		return failedValidation600;
   }

  
	/**
	*  set variable failedValidation600
	*  Corresponding COBOL Variable is 600-FAILED-VALIDATION
	*  @param value
	**/
   public void setFailedValidation600(char[] value) {
      failedValidation600 = checkFailedValidation600Constraints(value);
      serializeFailedValidation600(failedValidation600);
   } 

     /**
	 * 	Update FailedValidation600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFailedValidation600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFailedValidation600,failedValidation600.length);
   	
   }
   
   public void setFailedValidation600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFailedValidation600,failedValidation600.length);
   	
   }
   
     /**
	 * 	Update FailedValidation600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFailedValidation600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFailedValidation600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FailedValidation600 with another Field
	 *	@param value
	 */
   public void setFailedValidation600(Field source) {
       replace(source,0,source.length(),beginFailedValidation600,FAILED_VALIDATION_600_LEN);
   	
   }  
   
     /**
	 * 	Update FailedValidation600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFailedValidation600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFailedValidation600,FAILED_VALIDATION_600_LEN);
   	
   }
   
     /**
	 * 	Update FailedValidation600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFailedValidation600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFailedValidation600+targetIndex,targetLen);
    
   }
	char[] xtkSqlfail8860088Value = "TARAXTK SELECT FAILED                   ".toCharArray();
	/**
	 *	Test condition "TARAXTK SELECT FAILED                   " for isXtkSqlfail88600()
	 *	@return  Returns true if isXtkSqlfail88600() is "TARAXTK SELECT FAILED                   "
	 */
   public boolean isXtkSqlfail88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkSqlfail8860088Value)  == 0  );
   }


	/**
	*  set values "TARAXTK SELECT FAILED                   "
	*/
   	public void setXtkSqlfail88600True() {  			
    	setFailedValidation600( xtkSqlfail8860088Value);
   	}
	char[] xtkParmNull8860088Value = "TARAXTK PARM IS NULL OR LENGTH < 4      ".toCharArray();
	/**
	 *	Test condition "TARAXTK PARM IS NULL OR LENGTH < 4      " for isXtkParmNull88600()
	 *	@return  Returns true if isXtkParmNull88600() is "TARAXTK PARM IS NULL OR LENGTH < 4      "
	 */
   public boolean isXtkParmNull88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkParmNull8860088Value)  == 0  );
   }


	/**
	*  set values "TARAXTK PARM IS NULL OR LENGTH < 4      "
	*/
   	public void setXtkParmNull88600True() {  			
    	setFailedValidation600( xtkParmNull8860088Value);
   	}
	char[] xtkSpace8860088Value = "TARAXTK PARM HAS SPACE                  ".toCharArray();
	/**
	 *	Test condition "TARAXTK PARM HAS SPACE                  " for isXtkSpace88600()
	 *	@return  Returns true if isXtkSpace88600() is "TARAXTK PARM HAS SPACE                  "
	 */
   public boolean isXtkSpace88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkSpace8860088Value)  == 0  );
   }


	/**
	*  set values "TARAXTK PARM HAS SPACE                  "
	*/
   	public void setXtkSpace88600True() {  			
    	setFailedValidation600( xtkSpace8860088Value);
   	}
	char[] xtkTildePipe8860088Value = "TARAXTK PRM DOES NOT HAVE 13 PIPE/TILDE ".toCharArray();
	/**
	 *	Test condition "TARAXTK PRM DOES NOT HAVE 13 PIPE/TILDE " for isXtkTildePipe88600()
	 *	@return  Returns true if isXtkTildePipe88600() is "TARAXTK PRM DOES NOT HAVE 13 PIPE/TILDE "
	 */
   public boolean isXtkTildePipe88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkTildePipe8860088Value)  == 0  );
   }


	/**
	*  set values "TARAXTK PRM DOES NOT HAVE 13 PIPE/TILDE "
	*/
   	public void setXtkTildePipe88600True() {  			
    	setFailedValidation600( xtkTildePipe8860088Value);
   	}
	char[] xtkKeyValPair8860088Value = "TARAXTK KEY-VALUE PAIR IS NOT THIRTEEN  ".toCharArray();
	/**
	 *	Test condition "TARAXTK KEY-VALUE PAIR IS NOT THIRTEEN  " for isXtkKeyValPair88600()
	 *	@return  Returns true if isXtkKeyValPair88600() is "TARAXTK KEY-VALUE PAIR IS NOT THIRTEEN  "
	 */
   public boolean isXtkKeyValPair88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkKeyValPair8860088Value)  == 0  );
   }


	/**
	*  set values "TARAXTK KEY-VALUE PAIR IS NOT THIRTEEN  "
	*/
   	public void setXtkKeyValPair88600True() {  			
    	setFailedValidation600( xtkKeyValPair8860088Value);
   	}
	char[] xtkScol8860088Value = "TARAXTK PRM DOES NOT HAVE 1 SEMICOLON   ".toCharArray();
	/**
	 *	Test condition "TARAXTK PRM DOES NOT HAVE 1 SEMICOLON   " for isXtkScol88600()
	 *	@return  Returns true if isXtkScol88600() is "TARAXTK PRM DOES NOT HAVE 1 SEMICOLON   "
	 */
   public boolean isXtkScol88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkScol8860088Value)  == 0  );
   }


	/**
	*  set values "TARAXTK PRM DOES NOT HAVE 1 SEMICOLON   "
	*/
   	public void setXtkScol88600True() {  			
    	setFailedValidation600( xtkScol8860088Value);
   	}
	char[] xtkTilde8860088Value = "KEY VALUE PAIR HAS TILDE > 1            ".toCharArray();
	/**
	 *	Test condition "KEY VALUE PAIR HAS TILDE > 1            " for isXtkTilde88600()
	 *	@return  Returns true if isXtkTilde88600() is "KEY VALUE PAIR HAS TILDE > 1            "
	 */
   public boolean isXtkTilde88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkTilde8860088Value)  == 0  );
   }


	/**
	*  set values "KEY VALUE PAIR HAS TILDE > 1            "
	*/
   	public void setXtkTilde88600True() {  			
    	setFailedValidation600( xtkTilde8860088Value);
   	}
	char[] xtkOverflow8860088Value = "XTK KEY/VALUE OVERFLOW IN UNSTRING      ".toCharArray();
	/**
	 *	Test condition "XTK KEY/VALUE OVERFLOW IN UNSTRING      " for isXtkOverflow88600()
	 *	@return  Returns true if isXtkOverflow88600() is "XTK KEY/VALUE OVERFLOW IN UNSTRING      "
	 */
   public boolean isXtkOverflow88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkOverflow8860088Value)  == 0  );
   }


	/**
	*  set values "XTK KEY/VALUE OVERFLOW IN UNSTRING      "
	*/
   	public void setXtkOverflow88600True() {  			
    	setFailedValidation600( xtkOverflow8860088Value);
   	}
	char[] xtkNotNumeric8860088Value = "XTK VALUE IS NOT NUMERIC OR ZEROES      ".toCharArray();
	/**
	 *	Test condition "XTK VALUE IS NOT NUMERIC OR ZEROES      " for isXtkNotNumeric88600()
	 *	@return  Returns true if isXtkNotNumeric88600() is "XTK VALUE IS NOT NUMERIC OR ZEROES      "
	 */
   public boolean isXtkNotNumeric88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkNotNumeric8860088Value)  == 0  );
   }


	/**
	*  set values "XTK VALUE IS NOT NUMERIC OR ZEROES      "
	*/
   	public void setXtkNotNumeric88600True() {  			
    	setFailedValidation600( xtkNotNumeric8860088Value);
   	}
	char[] xtkKeyInvalid8860088Value = "INCORRECT KEY INFO PROVIDED IN XTK      ".toCharArray();
	/**
	 *	Test condition "INCORRECT KEY INFO PROVIDED IN XTK      " for isXtkKeyInvalid88600()
	 *	@return  Returns true if isXtkKeyInvalid88600() is "INCORRECT KEY INFO PROVIDED IN XTK      "
	 */
   public boolean isXtkKeyInvalid88600() throws CFException {
      return (  compareChars( getFailedValidation600() , xtkKeyInvalid8860088Value)  == 0  );
   }


	/**
	*  set values "INCORRECT KEY INFO PROVIDED IN XTK      "
	*/
   	public void setXtkKeyInvalid88600True() {  			
    	setFailedValidation600( xtkKeyInvalid8860088Value);
   	}

	
	
	

		public static int getXtkMsg2600FieldLength() {
			return XTK_MSG_2600_LENGTH;
		}

}
  
