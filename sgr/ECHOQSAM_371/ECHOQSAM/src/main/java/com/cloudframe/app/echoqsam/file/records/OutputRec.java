package com.cloudframe.app.echoqsam.file.records;

/**
*  The class OutputRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.echoqsam.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutputRec extends OutputRecSerialized {
   

						private char[] outputData = Field.fillLowValue(1001);
	
	/**
	* Constructor for OutputRec
	**/
    public OutputRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of outputData
	 *	@return outputData
	 */
   public char[] getOutputData() throws CFException{
     if (isOutputDataModified()) { 
        outputData = refreshOutputData();
     }
   		return outputData;
   }

  
	/**
	*  set variable outputData
	*  Corresponding COBOL Variable is OUTPUT-DATA
	*  @param value
	**/
   public void setOutputData(char[] value) {
      outputData = checkOutputDataConstraints(value);
      serializeOutputData(outputData);
   } 

     /**
	 * 	Update OutputData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutputData,outputData.length);
   	
   }
   
   public void setOutputData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutputData,outputData.length);
   	
   }
   
     /**
	 * 	Update OutputData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutputData with another Field
	 *	@param value
	 */
   public void setOutputData(Field source) {
       replace(source,0,source.length(),beginOutputData,OUTPUT_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update OutputData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutputData,OUTPUT_DATA_LEN);
   	
   }
   
     /**
	 * 	Update OutputData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputData+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutputRecFieldLength() {
			return OUTPUT_REC_LENGTH;
		}

}
  
