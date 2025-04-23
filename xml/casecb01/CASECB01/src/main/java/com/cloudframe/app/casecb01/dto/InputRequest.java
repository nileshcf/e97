package com.cloudframe.app.casecb01.dto;

/**
*  The class InputRequest is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.casecb01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;


public class InputRequest extends InputRequestSerialized { 
   
				private Getinventory getinventory = new Getinventory();
	
	/**
	* Constructor for InputRequest
	**/
    public InputRequest() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InputRequest. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputRequest(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			getinventory.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of getinventory
	 *	@return getinventory
	 */   
	 public Getinventory getGetinventory() {
   	return getinventory;
   }
   /**
	* 	Update Getinventory with the passed value
	*   Corresponding COBOL Variable is GETINVENTORY
	*	@param value
	*/
   public void setGetinventory(char[] value) {
      getinventory.setString(value); 
   }   
    
     /**
	 * 	Update Getinventory 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setGetinventory(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,getinventory.begin,getinventory.length());
   }
   
     /**
	 * 	Update Getinventory 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGetinventory(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,getinventory.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Getinventory with another Field
	 *	@param value
	 */
   public void setGetinventory(Field source) {
   	replace(source,0,source.length(),getinventory.begin,getinventory.length());
   }  
   
     /**
	 * 	Update Getinventory 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setGetinventory(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,getinventory.begin,getinventory.length());
   }
   
     /**
	 * 	Update Getinventory 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGetinventory(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,getinventory.begin+targetIndex,targetLen);
   }

	
	
	

	/**
	 *	Returns the xml format of InputRequest
	 *	@return xml format of InputRequest
	 */
	public String getXml() throws CFException {
		StringBuilder xmlContent = new StringBuilder();
		xmlContent.append("<Input-Request>");
					xmlContent.append(getinventory.getXml());
		xmlContent.append("</Input-Request>");
		return xmlContent.toString();
	}

		public static int getInputRequestFieldLength() {
			return INPUT_REQUEST_LENGTH;
		}

}
  
