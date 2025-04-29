package com.cloudframe.app.search0.dto;

/**
*  The class WtCodeCtrl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.search0.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WtCodeCtrl extends WtCodeCtrlSerialized { 
   

						private char[] codeValue = Field.fillLowValue(3);

						private char[] codeDesc = Field.fillLowValue(3);
	
	/**
	* Constructor for WtCodeCtrl
	**/
    public WtCodeCtrl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WtCodeCtrl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtCodeCtrl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of codeValue
	 *	@return codeValue
	 */
   public char[] getCodeValue() throws CFException{
     if (isCodeValueModified()) { 
        codeValue = refreshCodeValue();
     }
   		return codeValue;
   }

  
	/**
	*  set variable codeValue
	*  Corresponding COBOL Variable is WS-CODE-VALUE
	*  @param value
	**/
   public void setCodeValue(char[] value) {
      codeValue = checkCodeValueConstraints(value);
      serializeCodeValue(codeValue);
   } 

     /**
	 * 	Update CodeValue 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCodeValue(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCodeValue,codeValue.length);
   	
   }
   
   public void setCodeValue(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCodeValue,codeValue.length);
   	
   }
   
     /**
	 * 	Update CodeValue 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCodeValue(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCodeValue+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CodeValue with another Field
	 *	@param value
	 */
   public void setCodeValue(Field source) {
       replace(source,0,source.length(),beginCodeValue,CODE_VALUE_LEN);
   	
   }  
   
     /**
	 * 	Update CodeValue 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCodeValue(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCodeValue,CODE_VALUE_LEN);
   	
   }
   
     /**
	 * 	Update CodeValue 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCodeValue(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCodeValue+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of codeDesc
	 *	@return codeDesc
	 */
   public char[] getCodeDesc() throws CFException{
     if (isCodeDescModified()) { 
        codeDesc = refreshCodeDesc();
     }
   		return codeDesc;
   }

  
	/**
	*  set variable codeDesc
	*  Corresponding COBOL Variable is WS-CODE-DESC
	*  @param value
	**/
   public void setCodeDesc(char[] value) {
      codeDesc = checkCodeDescConstraints(value);
      serializeCodeDesc(codeDesc);
   } 

     /**
	 * 	Update CodeDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCodeDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCodeDesc,codeDesc.length);
   	
   }
   
   public void setCodeDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCodeDesc,codeDesc.length);
   	
   }
   
     /**
	 * 	Update CodeDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCodeDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCodeDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CodeDesc with another Field
	 *	@param value
	 */
   public void setCodeDesc(Field source) {
       replace(source,0,source.length(),beginCodeDesc,CODE_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update CodeDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCodeDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCodeDesc,CODE_DESC_LEN);
   	
   }
   
     /**
	 * 	Update CodeDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCodeDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCodeDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWtCodeCtrlFieldLength() {
			return WT_CODE_CTRL_LENGTH;
		}

}
  
