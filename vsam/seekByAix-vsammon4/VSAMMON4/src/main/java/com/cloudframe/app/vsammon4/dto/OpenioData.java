package com.cloudframe.app.vsammon4.dto;

/**
*  The class OpenioData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OpenioData extends OpenioDataSerialized { 
   

						private char[] iOpenMode = Field.fillLowValue(15);
	
	/**
	* Constructor for OpenioData
	**/
    public OpenioData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OpenioData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OpenioData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iOpenMode
	 *	@return iOpenMode
	 */
   public char[] getIOpenMode() throws CFException{
     if (isIOpenModeModified()) { 
        iOpenMode = refreshIOpenMode();
     }
   		return iOpenMode;
   }

  
	/**
	*  set variable iOpenMode
	*  Corresponding COBOL Variable is WS-I-OPEN-MODE
	*  @param value
	**/
   public void setIOpenMode(char[] value) {
      iOpenMode = checkIOpenModeConstraints(value);
      serializeIOpenMode(iOpenMode);
   } 

     /**
	 * 	Update IOpenMode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIOpenMode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIOpenMode,iOpenMode.length);
   	
   }
   
   public void setIOpenMode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIOpenMode,iOpenMode.length);
   	
   }
   
     /**
	 * 	Update IOpenMode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIOpenMode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIOpenMode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IOpenMode with another Field
	 *	@param value
	 */
   public void setIOpenMode(Field source) {
       replace(source,0,source.length(),beginIOpenMode,I_OPEN_MODE_LEN);
   	
   }  
   
     /**
	 * 	Update IOpenMode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIOpenMode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIOpenMode,I_OPEN_MODE_LEN);
   	
   }
   
     /**
	 * 	Update IOpenMode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIOpenMode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIOpenMode+targetIndex,targetLen);
    
   }
	char[] openSequential88Value = "SEQUENTIAL     ".toCharArray();
	/**
	 *	Test condition "SEQUENTIAL" for isOpenSequential()
	 *	@return  Returns true if isOpenSequential() is "SEQUENTIAL"
	 */
   public boolean isOpenSequential() throws CFException {
      return (  compareChars( getIOpenMode() , openSequential88Value)  == 0  );
   }


	/**
	*  set values "SEQUENTIAL"
	*/
   	public void setOpenSequentialTrue() {  			
    	setIOpenMode( openSequential88Value);
   	}
	char[] openDynamic88Value = "DYNAMIC        ".toCharArray();
	/**
	 *	Test condition "DYNAMIC" for isOpenDynamic()
	 *	@return  Returns true if isOpenDynamic() is "DYNAMIC"
	 */
   public boolean isOpenDynamic() throws CFException {
      return (  compareChars( getIOpenMode() , openDynamic88Value)  == 0  );
   }


	/**
	*  set values "DYNAMIC"
	*/
   	public void setOpenDynamicTrue() {  			
    	setIOpenMode( openDynamic88Value);
   	}

	
	
	

		public static int getOpenioDataFieldLength() {
			return OPENIO_DATA_LENGTH;
		}

}
  
