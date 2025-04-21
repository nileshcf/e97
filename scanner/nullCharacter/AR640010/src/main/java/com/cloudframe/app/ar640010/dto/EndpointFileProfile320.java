package com.cloudframe.app.ar640010.dto;

/**
*  The class EndpointFileProfile320 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class EndpointFileProfile320 extends EndpointFileProfile320Serialized { 
   


						private char[] fileProfile320 = new char[13];
	
	/**
	* Constructor for EndpointFileProfile320
	**/
    public EndpointFileProfile320() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for EndpointFileProfile320. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EndpointFileProfile320(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("ENDPOINT ").toCharArray()
             , getStartOffset() + 0
             ,9
             );
								setFileProfile320(("FILE PROFILE ").toCharArray());
    } 

	/**
	 *	Returns the value of fileProfile320
	 *	@return fileProfile320
	 */
   public char[] getFileProfile320() throws CFException{
     if (isFileProfile320Modified()) { 
        fileProfile320 = refreshFileProfile320();
     }
   		return fileProfile320;
   }

  
	/**
	*  set variable fileProfile320
	*  Corresponding COBOL Variable is 320-FILE-PROFILE
	*  @param value
	**/
   public void setFileProfile320(char[] value) {
      fileProfile320 = checkFileProfile320Constraints(value);
      serializeFileProfile320(fileProfile320);
   } 

     /**
	 * 	Update FileProfile320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileProfile320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileProfile320,fileProfile320.length);
   	
   }
   
   public void setFileProfile320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileProfile320,fileProfile320.length);
   	
   }
   
     /**
	 * 	Update FileProfile320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileProfile320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileProfile320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileProfile320 with another Field
	 *	@param value
	 */
   public void setFileProfile320(Field source) {
       replace(source,0,source.length(),beginFileProfile320,FILE_PROFILE_320_LEN);
   	
   }  
   
     /**
	 * 	Update FileProfile320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileProfile320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileProfile320,FILE_PROFILE_320_LEN);
   	
   }
   
     /**
	 * 	Update FileProfile320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileProfile320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileProfile320+targetIndex,targetLen);
    
   }

	
	
	

		public static int getEndpointFileProfile320FieldLength() {
			return ENDPOINT_FILE_PROFILE_320_LENGTH;
		}

}
  
