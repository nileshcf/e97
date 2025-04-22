package com.cloudframe.app.vsammon4.dto;

/**
*  The class StartData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.vsammon4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class StartData extends StartDataSerialized { 
   

						private char[] sOperation = Field.fillLowValue(2);

								private long sKey;
	
	/**
	* Constructor for StartData
	**/
    public StartData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for StartData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StartData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sOperation
	 *	@return sOperation
	 */
   public char[] getSOperation() throws CFException{
     if (isSOperationModified()) { 
        sOperation = refreshSOperation();
     }
   		return sOperation;
   }

  
	/**
	*  set variable sOperation
	*  Corresponding COBOL Variable is WS-S-OPERATION
	*  @param value
	**/
   public void setSOperation(char[] value) {
      sOperation = checkSOperationConstraints(value);
      serializeSOperation(sOperation);
   } 

     /**
	 * 	Update SOperation 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSOperation(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSOperation,sOperation.length);
   	
   }
   
   public void setSOperation(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSOperation,sOperation.length);
   	
   }
   
     /**
	 * 	Update SOperation 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSOperation(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSOperation+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SOperation with another Field
	 *	@param value
	 */
   public void setSOperation(Field source) {
       replace(source,0,source.length(),beginSOperation,S_OPERATION_LEN);
   	
   }  
   
     /**
	 * 	Update SOperation 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSOperation(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSOperation,S_OPERATION_LEN);
   	
   }
   
     /**
	 * 	Update SOperation 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSOperation(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSOperation+targetIndex,targetLen);
    
   }
	char[] eq88Value = "= ".toCharArray();
	/**
	 *	Test condition "= " for isEq()
	 *	@return  Returns true if isEq() is "= "
	 */
   public boolean isEq() throws CFException {
      return (  compareChars( getSOperation() , eq88Value)  == 0  );
   }


	/**
	*  set values "= "
	*/
   	public void setEqTrue() {  			
    	setSOperation( eq88Value);
   	}
	char[] gt88Value = "> ".toCharArray();
	/**
	 *	Test condition "> " for isGt()
	 *	@return  Returns true if isGt() is "> "
	 */
   public boolean isGt() throws CFException {
      return (  compareChars( getSOperation() , gt88Value)  == 0  );
   }


	/**
	*  set values "> "
	*/
   	public void setGtTrue() {  			
    	setSOperation( gt88Value);
   	}
	char[] ge88Value = ">=".toCharArray();
	/**
	 *	Test condition ">=" for isGe()
	 *	@return  Returns true if isGe() is ">="
	 */
   public boolean isGe() throws CFException {
      return (  compareChars( getSOperation() , ge88Value)  == 0  );
   }


	/**
	*  set values ">="
	*/
   	public void setGeTrue() {  			
    	setSOperation( ge88Value);
   	}
	/**
	 *	Returns the value of sKey
	 *	@return sKey
	 */
	public long getSKey() throws CFException {
       if (isSKeyModified()) { 
           sKey = refreshSKey();
        }
   		return sKey;
	}
	

	
	   
	/**
	 * 	Update SKey with the passed value
	 *  Corresponding COBOL Variable is WS-S-KEY
	 *	@param number
	 */
	public void setSKey(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    sKey = checkSKeyMaxLimit(number); 
		serializeSKey(sKey);
	}
	

	/**
	 * 	Update SKey with the passed value
	 *	@param value (String or char[])
	 */
	public void setSKey(char[] value) throws CFException {
		 sKey = serializeSKey(value);
	}
	/**
	 * 	Update SKey with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSKeyString(char[] value) throws CFException {
		 setSKey(value);
	}

	
	
	

		public static int getStartDataFieldLength() {
			return START_DATA_LENGTH;
		}

}
  
