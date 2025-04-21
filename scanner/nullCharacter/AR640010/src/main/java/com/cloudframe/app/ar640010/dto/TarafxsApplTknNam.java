package com.cloudframe.app.ar640010.dto;

/**
*  The class TarafxsApplTknNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TarafxsApplTknNam extends TarafxsApplTknNamSerialized { 
   

								private short tarafxsApplTknNamLen;

						private char[] tarafxsApplTknNamTxt = Field.fillLowValue(128);
	
	/**
	* Constructor for TarafxsApplTknNam
	**/
    public TarafxsApplTknNam() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TarafxsApplTknNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TarafxsApplTknNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tarafxsApplTknNamLen
	 *	@return tarafxsApplTknNamLen
	 */
	public short getTarafxsApplTknNamLen() throws CFException {
        if (isTarafxsApplTknNamLenModified()) { 
           tarafxsApplTknNamLen = refreshTarafxsApplTknNamLen();
        }
   		return tarafxsApplTknNamLen;
	}
	
	/**
	 * 	Update TarafxsApplTknNamLen with the passed value
	 *  Corresponding COBOL Variable is TARAFXS-APPL-TKN-NAM-LEN
	 *	@param number
	 */
	public void setTarafxsApplTknNamLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tarafxsApplTknNamLen = checkTarafxsApplTknNamLenMaxLimit(number); 
		serializeTarafxsApplTknNamLen(tarafxsApplTknNamLen);
	}

	public void setTarafxsApplTknNamLen(int number) {
	    number = checkTarafxsApplTknNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplTknNamLen((short)number);
	}
	public void setTarafxsApplTknNamLen(long number) {
	    number = checkTarafxsApplTknNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTarafxsApplTknNamLen((short)number);
	}
	

	/**
	 *	Returns the value of tarafxsApplTknNamTxt
	 *	@return tarafxsApplTknNamTxt
	 */
   public char[] getTarafxsApplTknNamTxt() throws CFException{
     if (isTarafxsApplTknNamTxtModified()) { 
        tarafxsApplTknNamTxt = refreshTarafxsApplTknNamTxt();
     }
   		return tarafxsApplTknNamTxt;
   }

  
	/**
	*  set variable tarafxsApplTknNamTxt
	*  Corresponding COBOL Variable is TARAFXS-APPL-TKN-NAM-TXT
	*  @param value
	**/
   public void setTarafxsApplTknNamTxt(char[] value) {
      tarafxsApplTknNamTxt = checkTarafxsApplTknNamTxtConstraints(value);
      serializeTarafxsApplTknNamTxt(tarafxsApplTknNamTxt);
   } 

     /**
	 * 	Update TarafxsApplTknNamTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTarafxsApplTknNamTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTarafxsApplTknNamTxt,tarafxsApplTknNamTxt.length);
   	
   }
   
   public void setTarafxsApplTknNamTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplTknNamTxt,tarafxsApplTknNamTxt.length);
   	
   }
   
     /**
	 * 	Update TarafxsApplTknNamTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplTknNamTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplTknNamTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TarafxsApplTknNamTxt with another Field
	 *	@param value
	 */
   public void setTarafxsApplTknNamTxt(Field source) {
       replace(source,0,source.length(),beginTarafxsApplTknNamTxt,TARAFXS_APPL_TKN_NAM_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TarafxsApplTknNamTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTarafxsApplTknNamTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTarafxsApplTknNamTxt,TARAFXS_APPL_TKN_NAM_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TarafxsApplTknNamTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTarafxsApplTknNamTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTarafxsApplTknNamTxt+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTarafxsApplTknNamFieldLength() {
			return TARAFXS_APPL_TKN_NAM_LENGTH;
		}

}
  
