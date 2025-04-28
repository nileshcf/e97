package com.cloudframe.app.o529351u.dto;

/**
*  The class SavMcdsInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.o529351u.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SavMcdsInfo extends SavMcdsInfoSerialized { 
   

						private char[] savMedcFailedDedpdAlloc = Field.fillLowValue(1);
	
	/**
	* Constructor for SavMcdsInfo
	**/
    public SavMcdsInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SavMcdsInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SavMcdsInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of savMedcFailedDedpdAlloc
	 *	@return savMedcFailedDedpdAlloc
	 */
   public char[] getSavMedcFailedDedpdAlloc() throws CFException{
     if (isSavMedcFailedDedpdAllocModified()) { 
        savMedcFailedDedpdAlloc = refreshSavMedcFailedDedpdAlloc();
     }
   		return savMedcFailedDedpdAlloc;
   }

  
	/**
	*  set variable savMedcFailedDedpdAlloc
	*  Corresponding COBOL Variable is SAV-MEDC-FAILED-DEDPD-ALLOC
	*  @param value
	**/
   public void setSavMedcFailedDedpdAlloc(char[] value) {
      savMedcFailedDedpdAlloc = checkSavMedcFailedDedpdAllocConstraints(value);
      serializeSavMedcFailedDedpdAlloc(savMedcFailedDedpdAlloc);
   } 

     /**
	 * 	Update SavMedcFailedDedpdAlloc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSavMedcFailedDedpdAlloc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSavMedcFailedDedpdAlloc,savMedcFailedDedpdAlloc.length);
   	
   }
   
   public void setSavMedcFailedDedpdAlloc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSavMedcFailedDedpdAlloc,savMedcFailedDedpdAlloc.length);
   	
   }
   
     /**
	 * 	Update SavMedcFailedDedpdAlloc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSavMedcFailedDedpdAlloc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavMedcFailedDedpdAlloc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SavMedcFailedDedpdAlloc with another Field
	 *	@param value
	 */
   public void setSavMedcFailedDedpdAlloc(Field source) {
       replace(source,0,source.length(),beginSavMedcFailedDedpdAlloc,SAV_MEDC_FAILED_DEDPD_ALLOC_LEN);
   	
   }  
   
     /**
	 * 	Update SavMedcFailedDedpdAlloc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSavMedcFailedDedpdAlloc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSavMedcFailedDedpdAlloc,SAV_MEDC_FAILED_DEDPD_ALLOC_LEN);
   	
   }
   
     /**
	 * 	Update SavMedcFailedDedpdAlloc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSavMedcFailedDedpdAlloc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSavMedcFailedDedpdAlloc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSavMcdsInfoFieldLength() {
			return SAV_MCDS_INFO_LENGTH;
		}

}
  
