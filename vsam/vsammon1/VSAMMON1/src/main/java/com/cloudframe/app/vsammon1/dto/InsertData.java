package com.cloudframe.app.vsammon1.dto;

/**
*  The class InsertData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InsertData extends InsertDataSerialized { 
   

						private char[] iInsertKey = Field.fillLowValue(65);
	
	/**
	* Constructor for InsertData
	**/
    public InsertData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InsertData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsertData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iInsertKey
	 *	@return iInsertKey
	 */
   public char[] getIInsertKey() throws CFException{
     if (isIInsertKeyModified()) { 
        iInsertKey = refreshIInsertKey();
     }
   		return iInsertKey;
   }

  
	/**
	*  set variable iInsertKey
	*  Corresponding COBOL Variable is WS-I-INSERT-KEY
	*  @param value
	**/
   public void setIInsertKey(char[] value) {
      iInsertKey = checkIInsertKeyConstraints(value);
      serializeIInsertKey(iInsertKey);
   } 

     /**
	 * 	Update IInsertKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIInsertKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIInsertKey,iInsertKey.length);
   	
   }
   
   public void setIInsertKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIInsertKey,iInsertKey.length);
   	
   }
   
     /**
	 * 	Update IInsertKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIInsertKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIInsertKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IInsertKey with another Field
	 *	@param value
	 */
   public void setIInsertKey(Field source) {
       replace(source,0,source.length(),beginIInsertKey,I_INSERT_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update IInsertKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIInsertKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIInsertKey,I_INSERT_KEY_LEN);
   	
   }
   
     /**
	 * 	Update IInsertKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIInsertKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIInsertKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInsertDataFieldLength() {
			return INSERT_DATA_LENGTH;
		}

}
  
