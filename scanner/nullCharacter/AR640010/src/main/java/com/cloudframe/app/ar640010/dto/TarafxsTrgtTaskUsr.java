package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxsTrgtTaskUsr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TarafxsTrgtTaskUsr extends TarafxsTrgtTaskUsrSerialized { 
   

								private short tarafxsTrgtTaskUsrLen;

						private char[] tarafxsTrgtTaskUsrTxt = Field.fillLowValue(64);
	
	/**
	* Constructor for TarafxsTrgtTaskUsr
	**/
    public TarafxsTrgtTaskUsr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TarafxsTrgtTaskUsr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsTrgtTaskUsr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tarafxsTrgtTaskUsrLen
	 *	@return tarafxsTrgtTaskUsrLen
	 */
	public short getTarafxsTrgtTaskUsrLen() throws CFException {
        if (isTarafxsTrgtTaskUsrLenModified()) { 
           tarafxsTrgtTaskUsrLen = refreshTarafxsTrgtTaskUsrLen();
        }
   		return tarafxsTrgtTaskUsrLen;
	}
	
	/**
	 * 	Update TarafxsTrgtTaskUsrLen with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-USR-LEN
	 *	@param number
	 */
	public void setTarafxsTrgtTaskUsrLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsTrgtTaskUsrLen = checkTarafxsTrgtTaskUsrLenMaxLimit(number); 
		serializeTarafxsTrgtTaskUsrLen(tarafxsTrgtTaskUsrLen);
	}

	public void setTarafxsTrgtTaskUsrLen(int number) {
	    number = checkTarafxsTrgtTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskUsrLen((short)number);
	}
	public void setTarafxsTrgtTaskUsrLen(long number) {
	    number = checkTarafxsTrgtTaskUsrLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsTrgtTaskUsrLen((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsTrgtTaskUsrTxt
	 *	@return tarafxsTrgtTaskUsrTxt
	 */
   public char[] getTarafxsTrgtTaskUsrTxt() throws CFException{
     if (isTarafxsTrgtTaskUsrTxtModified()) { 
        tarafxsTrgtTaskUsrTxt = refreshTarafxsTrgtTaskUsrTxt();
     }
   		return tarafxsTrgtTaskUsrTxt;
   }

  
	/**
	*  set variable tarafxsTrgtTaskUsrTxt
	*  Corresponding COBOL Variable is TARAFXS-TRGT-TASK-USR-TXT
	*  @param value
	**/
   public void setTarafxsTrgtTaskUsrTxt(char[] value) {
      tarafxsTrgtTaskUsrTxt = checkTarafxsTrgtTaskUsrTxtConstraints(value);
      serializeTarafxsTrgtTaskUsrTxt(tarafxsTrgtTaskUsrTxt);
   } 

     /**
	 * 	Update TarafxsTrgtTaskUsrTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsrTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsTrgtTaskUsrTxt,tarafxsTrgtTaskUsrTxt.length);
   	
   }
   
   public void setTarafxsTrgtTaskUsrTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskUsrTxt,tarafxsTrgtTaskUsrTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskUsrTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsrTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskUsrTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsTrgtTaskUsrTxt with another Field
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsrTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsTrgtTaskUsrTxt,TARAFXS_TRGT_TASK_USR_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsTrgtTaskUsrTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsrTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskUsrTxt,TARAFXS_TRGT_TASK_USR_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsTrgtTaskUsrTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsTrgtTaskUsrTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsTrgtTaskUsrTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafxsTrgtTaskUsrFieldLength() {
			return TARAFXS_TRGT_TASK_USR_LENGTH;
		}

}
  
