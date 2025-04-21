package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxaSrcTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TarafxaSrcTaskUsr extends TarafxaSrcTaskUsrSerialized { 
   

								private short tarafxaSrcTaskUsrLen;

						private char[] tarafxaSrcTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxaSrcTaskUsr
	**/
    public TarafxaSrcTaskUsr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TarafxaSrcTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaSrcTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tarafxaSrcTaskUsrLen
	 *	@return tarafxaSrcTaskUsrLen
	 */
	public short getTarafxaSrcTaskUsrLen() throws CFException {
        if (isTarafxaSrcTaskUsrLenModified()) { 
           tarafxaSrcTaskUsrLen = refreshTarafxaSrcTaskUsrLen();
        }
   		return tarafxaSrcTaskUsrLen;
	}
	
	/**
	 * 	Update TarafxaSrcTaskUsrLen with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-SRC-TASK-USR-LEN
	 *	@param number
	 */
	public void setTarafxaSrcTaskUsrLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaSrcTaskUsrLen = checkTarafxaSrcTaskUsrLenMaxLimit(number); 
		serializeTarafxaSrcTaskUsrLen(tarafxaSrcTaskUsrLen);
	}

	public void setTarafxaSrcTaskUsrLen(int number) {
	    number = checkTarafxaSrcTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskUsrLen((short)number);
	}
	public void setTarafxaSrcTaskUsrLen(long number) {
	    number = checkTarafxaSrcTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaSrcTaskUsrLen((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaSrcTaskUsrTxt
	 *	@return tarafxaSrcTaskUsrTxt
	 */
   public char[] getTarafxaSrcTaskUsrTxt() throws CFException{
     if (isTarafxaSrcTaskUsrTxtModified()) { 
        tarafxaSrcTaskUsrTxt = refreshTarafxaSrcTaskUsrTxt();
     }
   		return tarafxaSrcTaskUsrTxt;
   }

  
	/**
	*  set variable tarafxaSrcTaskUsrTxt
	*  Corresponding COBOL Variable is TARAFXA-SRC-TASK-USR-TXT
	*  @param value
	**/
   public void setTarafxaSrcTaskUsrTxt(char[] value) {
      tarafxaSrcTaskUsrTxt = checkTarafxaSrcTaskUsrTxtConstraints(value);
      serializeTarafxaSrcTaskUsrTxt(tarafxaSrcTaskUsrTxt);
   } 

     /**
	 * 	Update TarafxaSrcTaskUsrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaSrcTaskUsrTxt,tarafxaSrcTaskUsrTxt.length);
   	
   }
   
   public void setTarafxaSrcTaskUsrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskUsrTxt,tarafxaSrcTaskUsrTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskUsrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskUsrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaSrcTaskUsrTxt with another Field
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsrTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaSrcTaskUsrTxt,TARAFXA_SRC_TASK_USR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaSrcTaskUsrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskUsrTxt,TARAFXA_SRC_TASK_USR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaSrcTaskUsrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaSrcTaskUsrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaSrcTaskUsrTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafxaSrcTaskUsrFieldLength() {
			return TARAFXA_SRC_TASK_USR_LENGTH;
		}

}
  
