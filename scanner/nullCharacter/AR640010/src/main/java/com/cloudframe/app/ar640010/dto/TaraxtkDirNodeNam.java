package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraxtkDirNodeNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraxtkDirNodeNam extends TaraxtkDirNodeNamSerialized { 
   

								private short taraxtkDirNodeNamLen;

						private char[] taraxtkDirNodeNamTxt = Field.fillLowValue(256);
	
	/**
	* Constructor for TaraxtkDirNodeNam
	**/
    public TaraxtkDirNodeNam() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraxtkDirNodeNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkDirNodeNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraxtkDirNodeNamLen
	 *	@return taraxtkDirNodeNamLen
	 */
	public short getTaraxtkDirNodeNamLen() throws CFException {
        if (isTaraxtkDirNodeNamLenModified()) { 
           taraxtkDirNodeNamLen = refreshTaraxtkDirNodeNamLen();
        }
   		return taraxtkDirNodeNamLen;
	}
	
	/**
	 * 	Update TaraxtkDirNodeNamLen with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-DIR-NODE-NAM-LEN
	 *	@param number
	 */
	public void setTaraxtkDirNodeNamLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkDirNodeNamLen = checkTaraxtkDirNodeNamLenMaxLimit(number); 
		serializeTaraxtkDirNodeNamLen(taraxtkDirNodeNamLen);
	}

	public void setTaraxtkDirNodeNamLen(int number) {
	    number = checkTaraxtkDirNodeNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkDirNodeNamLen((short)number);
	}
	public void setTaraxtkDirNodeNamLen(long number) {
	    number = checkTaraxtkDirNodeNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkDirNodeNamLen((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkDirNodeNamTxt
	 *	@return taraxtkDirNodeNamTxt
	 */
   public char[] getTaraxtkDirNodeNamTxt() throws CFException{
     if (isTaraxtkDirNodeNamTxtModified()) { 
        taraxtkDirNodeNamTxt = refreshTaraxtkDirNodeNamTxt();
     }
   		return taraxtkDirNodeNamTxt;
   }

  
	/**
	*  set variable taraxtkDirNodeNamTxt
	*  Corresponding COBOL Variable is TARAXTK-DIR-NODE-NAM-TXT
	*  @param value
	**/
   public void setTaraxtkDirNodeNamTxt(char[] value) {
      taraxtkDirNodeNamTxt = checkTaraxtkDirNodeNamTxtConstraints(value);
      serializeTaraxtkDirNodeNamTxt(taraxtkDirNodeNamTxt);
   } 

     /**
	 * 	Update TaraxtkDirNodeNamTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkDirNodeNamTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkDirNodeNamTxt,taraxtkDirNodeNamTxt.length);
   	
   }
   
   public void setTaraxtkDirNodeNamTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkDirNodeNamTxt,taraxtkDirNodeNamTxt.length);
   	
   }
   
     /**
	 * 	Update TaraxtkDirNodeNamTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkDirNodeNamTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkDirNodeNamTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkDirNodeNamTxt with another Field
	 *	@param value
	 */
   public void setTaraxtkDirNodeNamTxt(Field source) {
       replace(source,0,source.length(),beginTaraxtkDirNodeNamTxt,TARAXTK_DIR_NODE_NAM_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkDirNodeNamTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkDirNodeNamTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkDirNodeNamTxt,TARAXTK_DIR_NODE_NAM_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkDirNodeNamTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkDirNodeNamTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkDirNodeNamTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraxtkDirNodeNam
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraxtkDirNodeNamLen((short)0);
         setTaraxtkDirNodeNamTxt(CONSTANTS.SPACE_256);
   }

		public static int getTaraxtkDirNodeNamFieldLength() {
			return TARAXTK_DIR_NODE_NAM_LENGTH;
		}

}
  
