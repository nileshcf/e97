package com.cloudframe.app.callfd01.file.records;

/**
*  The class InputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.callfd01.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputRec extends InputRecSerialized { 
   
				private InputKey inputKey = new InputKey();


						private char[] inputMarker = Field.fillLowValue(8);

						private char[] inputData = Field.fillLowValue(983);
	
	/**
	* Constructor for InputRec
	**/
    public InputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			inputKey.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of inputKey
	 *	@return inputKey
	 */   
	 public InputKey getInputKey() {
   	return inputKey;
   }
   /**
	* 	Update InputKey with the passed value
	*   Corresponding COBOL Variable is INPUT-KEY
	*	@param value
	*/
   public void setInputKey(char[] value) {
      inputKey.setString(value); 
   }   
    
     /**
	 * 	Update InputKey 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setInputKey(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inputKey.begin,inputKey.length());
   }
   
     /**
	 * 	Update InputKey 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inputKey.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update InputKey with another Field
	 *	@param value
	 */
   public void setInputKey(Field source) {
   	replace(source,0,source.length(),inputKey.begin,inputKey.length());
   }  
   
     /**
	 * 	Update InputKey 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setInputKey(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,inputKey.begin,inputKey.length());
   }
   
     /**
	 * 	Update InputKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,inputKey.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of inputMarker
	 *	@return inputMarker
	 */
   public char[] getInputMarker() throws CFException{
     if (isInputMarkerModified()) { 
        inputMarker = refreshInputMarker();
     }
   		return inputMarker;
   }

  
	/**
	*  set variable inputMarker
	*  Corresponding COBOL Variable is INPUT-MARKER
	*  @param value
	**/
   public void setInputMarker(char[] value) {
      inputMarker = checkInputMarkerConstraints(value);
      serializeInputMarker(inputMarker);
   } 

     /**
	 * 	Update InputMarker 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputMarker(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputMarker,inputMarker.length);
   	
   }
   
   public void setInputMarker(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputMarker,inputMarker.length);
   	
   }
   
     /**
	 * 	Update InputMarker 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputMarker(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputMarker+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputMarker with another Field
	 *	@param value
	 */
   public void setInputMarker(Field source) {
       replace(source,0,source.length(),beginInputMarker,INPUT_MARKER_LEN);
   	
   }  
   
     /**
	 * 	Update InputMarker 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputMarker(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputMarker,INPUT_MARKER_LEN);
   	
   }
   
     /**
	 * 	Update InputMarker 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputMarker(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputMarker+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputData
	 *	@return inputData
	 */
   public char[] getInputData() throws CFException{
     if (isInputDataModified()) { 
        inputData = refreshInputData();
     }
   		return inputData;
   }

  
	/**
	*  set variable inputData
	*  Corresponding COBOL Variable is INPUT-DATA
	*  @param value
	**/
   public void setInputData(char[] value) {
      inputData = checkInputDataConstraints(value);
      serializeInputData(inputData);
   } 

     /**
	 * 	Update InputData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputData,inputData.length);
   	
   }
   
   public void setInputData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputData,inputData.length);
   	
   }
   
     /**
	 * 	Update InputData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputData with another Field
	 *	@param value
	 */
   public void setInputData(Field source) {
       replace(source,0,source.length(),beginInputData,INPUT_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update InputData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputData,INPUT_DATA_LEN);
   	
   }
   
     /**
	 * 	Update InputData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInputRecFieldLength() {
			return INPUT_REC_LENGTH;
		}

}
  
