package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxaTrgtTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TarafxaTrgtTaskUsr extends TarafxaTrgtTaskUsrSerialized { 
   

								private short tarafxaTrgtTaskUsrLen;

						private char[] tarafxaTrgtTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxaTrgtTaskUsr
	**/
    public TarafxaTrgtTaskUsr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TarafxaTrgtTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaTrgtTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tarafxaTrgtTaskUsrLen
	 *	@return tarafxaTrgtTaskUsrLen
	 */
	public short getTarafxaTrgtTaskUsrLen() throws CFException {
        if (isTarafxaTrgtTaskUsrLenModified()) { 
           tarafxaTrgtTaskUsrLen = refreshTarafxaTrgtTaskUsrLen();
        }
   		return tarafxaTrgtTaskUsrLen;
	}
	
	/**
	 * 	Update TarafxaTrgtTaskUsrLen with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-USR-LEN
	 *	@param number
	 */
	public void setTarafxaTrgtTaskUsrLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaTrgtTaskUsrLen = checkTarafxaTrgtTaskUsrLenMaxLimit(number); 
		serializeTarafxaTrgtTaskUsrLen(tarafxaTrgtTaskUsrLen);
	}

	public void setTarafxaTrgtTaskUsrLen(int number) {
	    number = checkTarafxaTrgtTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskUsrLen((short)number);
	}
	public void setTarafxaTrgtTaskUsrLen(long number) {
	    number = checkTarafxaTrgtTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaTrgtTaskUsrLen((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaTrgtTaskUsrTxt
	 *	@return tarafxaTrgtTaskUsrTxt
	 */
   public char[] getTarafxaTrgtTaskUsrTxt() throws CFException{
     if (isTarafxaTrgtTaskUsrTxtModified()) { 
        tarafxaTrgtTaskUsrTxt = refreshTarafxaTrgtTaskUsrTxt();
     }
   		return tarafxaTrgtTaskUsrTxt;
   }

  
	/**
	*  set variable tarafxaTrgtTaskUsrTxt
	*  Corresponding COBOL Variable is TARAFXA-TRGT-TASK-USR-TXT
	*  @param value
	**/
   public void setTarafxaTrgtTaskUsrTxt(char[] value) {
      tarafxaTrgtTaskUsrTxt = checkTarafxaTrgtTaskUsrTxtConstraints(value);
      serializeTarafxaTrgtTaskUsrTxt(tarafxaTrgtTaskUsrTxt);
   } 

     /**
	 * 	Update TarafxaTrgtTaskUsrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaTrgtTaskUsrTxt,tarafxaTrgtTaskUsrTxt.length);
   	
   }
   
   public void setTarafxaTrgtTaskUsrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskUsrTxt,tarafxaTrgtTaskUsrTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskUsrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskUsrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaTrgtTaskUsrTxt with another Field
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsrTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaTrgtTaskUsrTxt,TARAFXA_TRGT_TASK_USR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaTrgtTaskUsrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskUsrTxt,TARAFXA_TRGT_TASK_USR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaTrgtTaskUsrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaTrgtTaskUsrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaTrgtTaskUsrTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafxaTrgtTaskUsrFieldLength() {
			return TARAFXA_TRGT_TASK_USR_LENGTH;
		}

}
  
