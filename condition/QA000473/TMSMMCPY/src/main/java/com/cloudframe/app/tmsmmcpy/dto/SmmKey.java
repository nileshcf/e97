package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class SmmKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.tmsmmcpy.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SmmKey extends SmmKeySerialized { 
   

						private char[] smmDdrKey = Field.fillLowValue(10);

						private char[] smmBatchKey = Field.fillLowValue(10);

						private char[] smmExtCapXptId = Field.fillLowValue(16);

						private char[] smmDataserverId = Field.fillLowValue(4);

						private char[] smmField3 = Field.fillLowValue(30);

						private char[] smmField1 = Field.fillLowValue(30);
	
	/**
	* Constructor for SmmKey
	**/
    public SmmKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SmmKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SmmKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of smmDdrKey
	 *	@return smmDdrKey
	 */
   public char[] getSmmDdrKey() throws CFException{
     if (isSmmDdrKeyModified()) { 
        smmDdrKey = refreshSmmDdrKey();
     }
   		return smmDdrKey;
   }

  
	/**
	*  set variable smmDdrKey
	*  Corresponding COBOL Variable is SMM-DDR-KEY
	*  @param value
	**/
   public void setSmmDdrKey(char[] value) {
      smmDdrKey = checkSmmDdrKeyConstraints(value);
      serializeSmmDdrKey(smmDdrKey);
   } 

     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmDdrKey,smmDdrKey.length);
   	
   }
   
   public void setSmmDdrKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmDdrKey,smmDdrKey.length);
   	
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmDdrKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmDdrKey with another Field
	 *	@param value
	 */
   public void setSmmDdrKey(Field source) {
       replace(source,0,source.length(),beginSmmDdrKey,SMM_DDR_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmDdrKey,SMM_DDR_KEY_LEN);
   	
   }
   
     /**
	 * 	Update SmmDdrKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDdrKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmDdrKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmBatchKey
	 *	@return smmBatchKey
	 */
   public char[] getSmmBatchKey() throws CFException{
     if (isSmmBatchKeyModified()) { 
        smmBatchKey = refreshSmmBatchKey();
     }
   		return smmBatchKey;
   }

  
	/**
	*  set variable smmBatchKey
	*  Corresponding COBOL Variable is SMM-BATCH-KEY
	*  @param value
	**/
   public void setSmmBatchKey(char[] value) {
      smmBatchKey = checkSmmBatchKeyConstraints(value);
      serializeSmmBatchKey(smmBatchKey);
   } 

     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmBatchKey,smmBatchKey.length);
   	
   }
   
   public void setSmmBatchKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmBatchKey,smmBatchKey.length);
   	
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmBatchKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmBatchKey with another Field
	 *	@param value
	 */
   public void setSmmBatchKey(Field source) {
       replace(source,0,source.length(),beginSmmBatchKey,SMM_BATCH_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmBatchKey,SMM_BATCH_KEY_LEN);
   	
   }
   
     /**
	 * 	Update SmmBatchKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmBatchKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmBatchKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmExtCapXptId
	 *	@return smmExtCapXptId
	 */
   public char[] getSmmExtCapXptId() throws CFException{
     if (isSmmExtCapXptIdModified()) { 
        smmExtCapXptId = refreshSmmExtCapXptId();
     }
   		return smmExtCapXptId;
   }

  
	/**
	*  set variable smmExtCapXptId
	*  Corresponding COBOL Variable is SMM-EXT-CAP-XPT-ID
	*  @param value
	**/
   public void setSmmExtCapXptId(char[] value) {
      smmExtCapXptId = checkSmmExtCapXptIdConstraints(value);
      serializeSmmExtCapXptId(smmExtCapXptId);
   } 

     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmExtCapXptId,smmExtCapXptId.length);
   	
   }
   
   public void setSmmExtCapXptId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmExtCapXptId,smmExtCapXptId.length);
   	
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmExtCapXptId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmExtCapXptId with another Field
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source) {
       replace(source,0,source.length(),beginSmmExtCapXptId,SMM_EXT_CAP_XPT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmExtCapXptId,SMM_EXT_CAP_XPT_ID_LEN);
   	
   }
   
     /**
	 * 	Update SmmExtCapXptId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmExtCapXptId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmExtCapXptId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmDataserverId
	 *	@return smmDataserverId
	 */
   public char[] getSmmDataserverId() throws CFException{
     if (isSmmDataserverIdModified()) { 
        smmDataserverId = refreshSmmDataserverId();
     }
   		return smmDataserverId;
   }

  
	/**
	*  set variable smmDataserverId
	*  Corresponding COBOL Variable is SMM-DATASERVER-ID
	*  @param value
	**/
   public void setSmmDataserverId(char[] value) {
      smmDataserverId = checkSmmDataserverIdConstraints(value);
      serializeSmmDataserverId(smmDataserverId);
   } 

     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmDataserverId,smmDataserverId.length);
   	
   }
   
   public void setSmmDataserverId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmDataserverId,smmDataserverId.length);
   	
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmDataserverId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmDataserverId with another Field
	 *	@param value
	 */
   public void setSmmDataserverId(Field source) {
       replace(source,0,source.length(),beginSmmDataserverId,SMM_DATASERVER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmDataserverId,SMM_DATASERVER_ID_LEN);
   	
   }
   
     /**
	 * 	Update SmmDataserverId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmDataserverId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmDataserverId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField3
	 *	@return smmField3
	 */
   public char[] getSmmField3() throws CFException{
     if (isSmmField3Modified()) { 
        smmField3 = refreshSmmField3();
     }
   		return smmField3;
   }

  
	/**
	*  set variable smmField3
	*  Corresponding COBOL Variable is SMM-FIELD3
	*  @param value
	**/
   public void setSmmField3(char[] value) {
      smmField3 = checkSmmField3Constraints(value);
      serializeSmmField3(smmField3);
   } 

     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField3,smmField3.length);
   	
   }
   
   public void setSmmField3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField3,smmField3.length);
   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField3 with another Field
	 *	@param value
	 */
   public void setSmmField3(Field source) {
       replace(source,0,source.length(),beginSmmField3,SMM_FIELD_3_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField3,SMM_FIELD_3_LEN);
   	
   }
   
     /**
	 * 	Update SmmField3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField3+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of smmField1
	 *	@return smmField1
	 */
   public char[] getSmmField1() throws CFException{
     if (isSmmField1Modified()) { 
        smmField1 = refreshSmmField1();
     }
   		return smmField1;
   }

  
	/**
	*  set variable smmField1
	*  Corresponding COBOL Variable is SMM-FIELD1
	*  @param value
	**/
   public void setSmmField1(char[] value) {
      smmField1 = checkSmmField1Constraints(value);
      serializeSmmField1(smmField1);
   } 

     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSmmField1,smmField1.length);
   	
   }
   
   public void setSmmField1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField1,smmField1.length);
   	
   }
   
     /**
	 * 	Update SmmField1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SmmField1 with another Field
	 *	@param value
	 */
   public void setSmmField1(Field source) {
       replace(source,0,source.length(),beginSmmField1,SMM_FIELD_1_LEN);
   	
   }  
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSmmField1,SMM_FIELD_1_LEN);
   	
   }
   
     /**
	 * 	Update SmmField1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSmmField1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSmmField1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSmmKeyFieldLength() {
			return SMM_KEY_LENGTH;
		}

}
  
