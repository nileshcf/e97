package com.cloudframe.app.vsammon7.dto;

/**
*  The class DeleteData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:31. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DeleteData extends DeleteDataSerialized { 
   

						private char[] iDeleteKey = Field.fillLowValue(65);
	
	/**
	* Constructor for DeleteData
	**/
    public DeleteData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DeleteData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DeleteData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iDeleteKey
	 *	@return iDeleteKey
	 */
   public char[] getIDeleteKey() throws CFException{
     if (isIDeleteKeyModified()) { 
        iDeleteKey = refreshIDeleteKey();
     }
   		return iDeleteKey;
   }

  
	/**
	*  set variable iDeleteKey
	*  Corresponding COBOL Variable is WS-I-DELETE-KEY
	*  @param value
	**/
   public void setIDeleteKey(char[] value) {
      iDeleteKey = checkIDeleteKeyConstraints(value);
      serializeIDeleteKey(iDeleteKey);
   } 

     /**
	 * 	Update IDeleteKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIDeleteKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIDeleteKey,iDeleteKey.length);
   	
   }
   
   public void setIDeleteKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIDeleteKey,iDeleteKey.length);
   	
   }
   
     /**
	 * 	Update IDeleteKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIDeleteKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIDeleteKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IDeleteKey with another Field
	 *	@param value
	 */
   public void setIDeleteKey(Field source) {
       replace(source,0,source.length(),beginIDeleteKey,I_DELETE_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update IDeleteKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIDeleteKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIDeleteKey,I_DELETE_KEY_LEN);
   	
   }
   
     /**
	 * 	Update IDeleteKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIDeleteKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIDeleteKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDeleteDataFieldLength() {
			return DELETE_DATA_LENGTH;
		}

}
  
