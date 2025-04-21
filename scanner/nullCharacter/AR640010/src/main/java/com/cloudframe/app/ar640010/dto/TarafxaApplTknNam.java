package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxaApplTknNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TarafxaApplTknNam extends TarafxaApplTknNamSerialized { 
   

								private short tarafxaApplTknNamLen;

						private char[] tarafxaApplTknNamTxt = Field.fillLowValue(128);
	
	/**
	* Constructor for TarafxaApplTknNam
	**/
    public TarafxaApplTknNam() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TarafxaApplTknNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxaApplTknNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tarafxaApplTknNamLen
	 *	@return tarafxaApplTknNamLen
	 */
	public short getTarafxaApplTknNamLen() throws CFException {
        if (isTarafxaApplTknNamLenModified()) { 
           tarafxaApplTknNamLen = refreshTarafxaApplTknNamLen();
        }
   		return tarafxaApplTknNamLen;
	}
	
	/**
	 * 	Update TarafxaApplTknNamLen with the passed value
	 *  Corresponding COBOL Variable is TARAFXA-APPL-TKN-NAM-LEN
	 *	@param number
	 */
	public void setTarafxaApplTknNamLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxaApplTknNamLen = checkTarafxaApplTknNamLenMaxLimit(number); 
		serializeTarafxaApplTknNamLen(tarafxaApplTknNamLen);
	}

	public void setTarafxaApplTknNamLen(int number) {
	    number = checkTarafxaApplTknNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplTknNamLen((short)number);
	}
	public void setTarafxaApplTknNamLen(long number) {
	    number = checkTarafxaApplTknNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxaApplTknNamLen((short)number);
	}
	

	/**
	 *	Returns the value of tarafxaApplTknNamTxt
	 *	@return tarafxaApplTknNamTxt
	 */
   public char[] getTarafxaApplTknNamTxt() throws CFException{
     if (isTarafxaApplTknNamTxtModified()) { 
        tarafxaApplTknNamTxt = refreshTarafxaApplTknNamTxt();
     }
   		return tarafxaApplTknNamTxt;
   }

  
	/**
	*  set variable tarafxaApplTknNamTxt
	*  Corresponding COBOL Variable is TARAFXA-APPL-TKN-NAM-TXT
	*  @param value
	**/
   public void setTarafxaApplTknNamTxt(char[] value) {
      tarafxaApplTknNamTxt = checkTarafxaApplTknNamTxtConstraints(value);
      serializeTarafxaApplTknNamTxt(tarafxaApplTknNamTxt);
   } 

     /**
	 * 	Update TarafxaApplTknNamTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxaApplTknNamTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxaApplTknNamTxt,tarafxaApplTknNamTxt.length);
   	
   }
   
   public void setTarafxaApplTknNamTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplTknNamTxt,tarafxaApplTknNamTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxaApplTknNamTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplTknNamTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplTknNamTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxaApplTknNamTxt with another Field
	 *	@param value
	 */
   public void setTarafxaApplTknNamTxt(Field source) {
       replace(source,0,source.length(),beginTarafxaApplTknNamTxt,TARAFXA_APPL_TKN_NAM_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxaApplTknNamTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxaApplTknNamTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxaApplTknNamTxt,TARAFXA_APPL_TKN_NAM_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxaApplTknNamTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxaApplTknNamTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxaApplTknNamTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafxaApplTknNamFieldLength() {
			return TARAFXA_APPL_TKN_NAM_LENGTH;
		}

}
  
