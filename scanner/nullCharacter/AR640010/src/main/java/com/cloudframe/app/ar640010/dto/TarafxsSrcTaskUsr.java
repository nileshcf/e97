package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxsSrcTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:41. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TarafxsSrcTaskUsr extends TarafxsSrcTaskUsrSerialized { 
   

								private short tarafxsSrcTaskUsrLen;

						private char[] tarafxsSrcTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxsSrcTaskUsr
	**/
    public TarafxsSrcTaskUsr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TarafxsSrcTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsSrcTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tarafxsSrcTaskUsrLen
	 *	@return tarafxsSrcTaskUsrLen
	 */
	public short getTarafxsSrcTaskUsrLen() throws CFException {
        if (isTarafxsSrcTaskUsrLenModified()) { 
           tarafxsSrcTaskUsrLen = refreshTarafxsSrcTaskUsrLen();
        }
   		return tarafxsSrcTaskUsrLen;
	}
	
	/**
	 * 	Update TarafxsSrcTaskUsrLen with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-SRC-TASK-USR-LEN
	 *	@param number
	 */
	public void setTarafxsSrcTaskUsrLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsSrcTaskUsrLen = checkTarafxsSrcTaskUsrLenMaxLimit(number); 
		serializeTarafxsSrcTaskUsrLen(tarafxsSrcTaskUsrLen);
	}

	public void setTarafxsSrcTaskUsrLen(int number) {
	    number = checkTarafxsSrcTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskUsrLen((short)number);
	}
	public void setTarafxsSrcTaskUsrLen(long number) {
	    number = checkTarafxsSrcTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsSrcTaskUsrLen((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsSrcTaskUsrTxt
	 *	@return tarafxsSrcTaskUsrTxt
	 */
   public char[] getTarafxsSrcTaskUsrTxt() throws CFException{
     if (isTarafxsSrcTaskUsrTxtModified()) { 
        tarafxsSrcTaskUsrTxt = refreshTarafxsSrcTaskUsrTxt();
     }
   		return tarafxsSrcTaskUsrTxt;
   }

  
	/**
	*  set variable tarafxsSrcTaskUsrTxt
	*  Corresponding COBOL Variable is TARAFXS-SRC-TASK-USR-TXT
	*  @param value
	**/
   public void setTarafxsSrcTaskUsrTxt(char[] value) {
      tarafxsSrcTaskUsrTxt = checkTarafxsSrcTaskUsrTxtConstraints(value);
      serializeTarafxsSrcTaskUsrTxt(tarafxsSrcTaskUsrTxt);
   } 

     /**
	 * 	Update TarafxsSrcTaskUsrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsSrcTaskUsrTxt,tarafxsSrcTaskUsrTxt.length);
   	
   }
   
   public void setTarafxsSrcTaskUsrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskUsrTxt,tarafxsSrcTaskUsrTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskUsrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskUsrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsSrcTaskUsrTxt with another Field
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsrTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsSrcTaskUsrTxt,TARAFXS_SRC_TASK_USR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsSrcTaskUsrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskUsrTxt,TARAFXS_SRC_TASK_USR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsSrcTaskUsrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsSrcTaskUsrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsSrcTaskUsrTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafxsSrcTaskUsrFieldLength() {
			return TARAFXS_SRC_TASK_USR_LENGTH;
		}

}
  
