package com.cloudframe.app.callvp77.file.records;

/**
*  The class InputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.callvp77.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputRec extends InputRecSerialized {
   

						private char[] inputData = Field.fillLowValue(74);
	
	/**
	* Constructor for InputRec
	**/
    public InputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
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
  
