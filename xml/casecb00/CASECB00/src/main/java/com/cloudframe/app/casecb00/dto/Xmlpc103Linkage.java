package com.cloudframe.app.casecb00.dto;

/**
*  The class Xmlpc103Linkage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.casecb00.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Xmlpc103Linkage extends Xmlpc103LinkageSerialized {
   
				private InputRequest inputRequest = new InputRequest();
	
	/**
	* Constructor for Xmlpc103Linkage
	**/
    public Xmlpc103Linkage() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			inputRequest.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inputRequest
	 *	@return inputRequest
	 */   
	 public InputRequest getInputRequest() {
   	return inputRequest;
   }
   /**
	* 	Update InputRequest with the passed value
	*   Corresponding COBOL Variable is INPUT-REQUEST
	*	@param value
	*/
   public void setInputRequest(char[] value) {
      inputRequest.setString(value); 
   }   
    
     /**
	 * 	Update InputRequest 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInputRequest(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inputRequest.begin,inputRequest.length());
   }
   
     /**
	 * 	Update InputRequest 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputRequest(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inputRequest.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update InputRequest with another Field
	 *	@param value
	 */
   public void setInputRequest(Field source) {
   	replace(source,0,source.length(),inputRequest.begin,inputRequest.length());
   }  
   
     /**
	 * 	Update InputRequest 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInputRequest(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inputRequest.begin,inputRequest.length());
   }
   
     /**
	 * 	Update InputRequest 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputRequest(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inputRequest.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getXmlpc103LinkageFieldLength() {
			return XMLPC_103_LINKAGE_LENGTH;
		}

}
  
