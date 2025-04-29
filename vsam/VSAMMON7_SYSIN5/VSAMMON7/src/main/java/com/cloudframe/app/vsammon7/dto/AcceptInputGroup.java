package com.cloudframe.app.vsammon7.dto;

/**
*  The class AcceptInputGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:23. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcceptInputGroup extends AcceptInputGroupSerialized {
   

						private char[] acceptInput = Field.fillLowValue(80);
					private Input input = new Input();
	
	/**
	* Constructor for AcceptInputGroup
	**/
    public AcceptInputGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			input.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of acceptInput
	 *	@return acceptInput
	 */
   public char[] getAcceptInput() throws CFException{
     if (isAcceptInputModified()) { 
        acceptInput = refreshAcceptInput();
     }
   		return acceptInput;
   }

  
	/**
	*  set variable acceptInput
	*  Corresponding COBOL Variable is WS-ACCEPT-INPUT
	*  @param value
	**/
   public void setAcceptInput(char[] value) {
      acceptInput = checkAcceptInputConstraints(value);
      serializeAcceptInput(acceptInput);
   } 

     /**
	 * 	Update AcceptInput 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAcceptInput(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAcceptInput,acceptInput.length);
   	
   }
   
   public void setAcceptInput(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAcceptInput,acceptInput.length);
   	
   }
   
     /**
	 * 	Update AcceptInput 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAcceptInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcceptInput+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AcceptInput with another Field
	 *	@param value
	 */
   public void setAcceptInput(Field source) {
       replace(source,0,source.length(),beginAcceptInput,ACCEPT_INPUT_LEN);
   	
   }  
   
     /**
	 * 	Update AcceptInput 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAcceptInput(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAcceptInput,ACCEPT_INPUT_LEN);
   	
   }
   
     /**
	 * 	Update AcceptInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAcceptInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAcceptInput+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of input
	 *	@return input
	 */   
	 public Input getInput() {
   	return input;
   }
   /**
	* 	Update Input with the passed value
	*   Corresponding COBOL Variable is WS-INPUT
	*	@param value
	*/
   public void setInput(char[] value) {
      input.setString(value); 
   }   
    
     /**
	 * 	Update Input 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInput(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,input.begin,input.length());
   }
   
     /**
	 * 	Update Input 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,input.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Input with another Field
	 *	@param value
	 */
   public void setInput(Field source) {
   	replace(source,0,source.length(),input.begin,input.length());
   }  
   
     /**
	 * 	Update Input 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInput(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,input.begin,input.length());
   }
   
     /**
	 * 	Update Input 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,input.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getAcceptInputGroupFieldLength() {
			return ACCEPT_INPUT_GROUP_LENGTH;
		}

}
  
