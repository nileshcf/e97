package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraxtkTaskWorkParmTxt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraxtkTaskWorkParmTxt extends TaraxtkTaskWorkParmTxtSerialized { 
   

								private short taraxtkTaskWorkParmTxtLen;

						private char[] taraxtkTaskWorkParmTxtTxt = Field.fillLowValue(1024);
	
	/**
	* Constructor for TaraxtkTaskWorkParmTxt
	**/
    public TaraxtkTaskWorkParmTxt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraxtkTaskWorkParmTxt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkTaskWorkParmTxt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraxtkTaskWorkParmTxtLen
	 *	@return taraxtkTaskWorkParmTxtLen
	 */
	public short getTaraxtkTaskWorkParmTxtLen() throws CFException {
        if (isTaraxtkTaskWorkParmTxtLenModified()) { 
           taraxtkTaskWorkParmTxtLen = refreshTaraxtkTaskWorkParmTxtLen();
        }
   		return taraxtkTaskWorkParmTxtLen;
	}
	
	/**
	 * 	Update TaraxtkTaskWorkParmTxtLen with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-TASK-WORK-PARM-TXT-LEN
	 *	@param number
	 */
	public void setTaraxtkTaskWorkParmTxtLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkTaskWorkParmTxtLen = checkTaraxtkTaskWorkParmTxtLenMaxLimit(number); 
		serializeTaraxtkTaskWorkParmTxtLen(taraxtkTaskWorkParmTxtLen);
	}

	public void setTaraxtkTaskWorkParmTxtLen(int number) {
	    number = checkTaraxtkTaskWorkParmTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkTaskWorkParmTxtLen((short)number);
	}
	public void setTaraxtkTaskWorkParmTxtLen(long number) {
	    number = checkTaraxtkTaskWorkParmTxtLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkTaskWorkParmTxtLen((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkTaskWorkParmTxtTxt
	 *	@return taraxtkTaskWorkParmTxtTxt
	 */
   public char[] getTaraxtkTaskWorkParmTxtTxt() throws CFException{
     if (isTaraxtkTaskWorkParmTxtTxtModified()) { 
        taraxtkTaskWorkParmTxtTxt = refreshTaraxtkTaskWorkParmTxtTxt();
     }
   		return taraxtkTaskWorkParmTxtTxt;
   }

  
	/**
	*  set variable taraxtkTaskWorkParmTxtTxt
	*  Corresponding COBOL Variable is TARAXTK-TASK-WORK-PARM-TXT-TXT
	*  @param value
	**/
   public void setTaraxtkTaskWorkParmTxtTxt(char[] value) {
      taraxtkTaskWorkParmTxtTxt = checkTaraxtkTaskWorkParmTxtTxtConstraints(value);
      serializeTaraxtkTaskWorkParmTxtTxt(taraxtkTaskWorkParmTxtTxt);
   } 

     /**
	 * 	Update TaraxtkTaskWorkParmTxtTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxtTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkTaskWorkParmTxtTxt,taraxtkTaskWorkParmTxtTxt.length);
   	
   }
   
   public void setTaraxtkTaskWorkParmTxtTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkTaskWorkParmTxtTxt,taraxtkTaskWorkParmTxtTxt.length);
   	
   }
   
     /**
	 * 	Update TaraxtkTaskWorkParmTxtTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxtTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkTaskWorkParmTxtTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkTaskWorkParmTxtTxt with another Field
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxtTxt(Field source) {
       replace(source,0,source.length(),beginTaraxtkTaskWorkParmTxtTxt,TARAXTK_TASK_WORK_PARM_TXT_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkTaskWorkParmTxtTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxtTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkTaskWorkParmTxtTxt,TARAXTK_TASK_WORK_PARM_TXT_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkTaskWorkParmTxtTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkTaskWorkParmTxtTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkTaskWorkParmTxtTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraxtkTaskWorkParmTxt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraxtkTaskWorkParmTxtLen((short)0);
         setTaraxtkTaskWorkParmTxtTxt(CONSTANTS.SPACE_1024);
   }

		public static int getTaraxtkTaskWorkParmTxtFieldLength() {
			return TARAXTK_TASK_WORK_PARM_TXT_LENGTH;
		}

}
  
