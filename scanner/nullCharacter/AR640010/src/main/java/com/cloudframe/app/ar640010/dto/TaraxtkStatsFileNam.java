package com.cloudframe.app.ar640010.dto;

/**
*  The class TaraxtkStatsFileNam is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class TaraxtkStatsFileNam extends TaraxtkStatsFileNamSerialized { 
   

								private short taraxtkStatsFileNamLen;

						private char[] taraxtkStatsFileNamTxt = Field.fillLowValue(256);
	
	/**
	* Constructor for TaraxtkStatsFileNam
	**/
    public TaraxtkStatsFileNam() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TaraxtkStatsFileNam. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TaraxtkStatsFileNam(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of taraxtkStatsFileNamLen
	 *	@return taraxtkStatsFileNamLen
	 */
	public short getTaraxtkStatsFileNamLen() throws CFException {
        if (isTaraxtkStatsFileNamLenModified()) { 
           taraxtkStatsFileNamLen = refreshTaraxtkStatsFileNamLen();
        }
   		return taraxtkStatsFileNamLen;
	}
	
	/**
	 * 	Update TaraxtkStatsFileNamLen with the passed value
	 *  Corresponding COBOL Variable is TARAXTK-STATS-FILE-NAM-LEN
	 *	@param number
	 */
	public void setTaraxtkStatsFileNamLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    taraxtkStatsFileNamLen = checkTaraxtkStatsFileNamLenMaxLimit(number); 
		serializeTaraxtkStatsFileNamLen(taraxtkStatsFileNamLen);
	}

	public void setTaraxtkStatsFileNamLen(int number) {
	    number = checkTaraxtkStatsFileNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkStatsFileNamLen((short)number);
	}
	public void setTaraxtkStatsFileNamLen(long number) {
	    number = checkTaraxtkStatsFileNamLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTaraxtkStatsFileNamLen((short)number);
	}
	

	/**
	 *	Returns the value of taraxtkStatsFileNamTxt
	 *	@return taraxtkStatsFileNamTxt
	 */
   public char[] getTaraxtkStatsFileNamTxt() throws CFException{
     if (isTaraxtkStatsFileNamTxtModified()) { 
        taraxtkStatsFileNamTxt = refreshTaraxtkStatsFileNamTxt();
     }
   		return taraxtkStatsFileNamTxt;
   }

  
	/**
	*  set variable taraxtkStatsFileNamTxt
	*  Corresponding COBOL Variable is TARAXTK-STATS-FILE-NAM-TXT
	*  @param value
	**/
   public void setTaraxtkStatsFileNamTxt(char[] value) {
      taraxtkStatsFileNamTxt = checkTaraxtkStatsFileNamTxtConstraints(value);
      serializeTaraxtkStatsFileNamTxt(taraxtkStatsFileNamTxt);
   } 

     /**
	 * 	Update TaraxtkStatsFileNamTxt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTaraxtkStatsFileNamTxt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTaraxtkStatsFileNamTxt,taraxtkStatsFileNamTxt.length);
   	
   }
   
   public void setTaraxtkStatsFileNamTxt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkStatsFileNamTxt,taraxtkStatsFileNamTxt.length);
   	
   }
   
     /**
	 * 	Update TaraxtkStatsFileNamTxt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkStatsFileNamTxt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkStatsFileNamTxt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TaraxtkStatsFileNamTxt with another Field
	 *	@param value
	 */
   public void setTaraxtkStatsFileNamTxt(Field source) {
       replace(source,0,source.length(),beginTaraxtkStatsFileNamTxt,TARAXTK_STATS_FILE_NAM_TXT_LEN);
   	
   }  
   
     /**
	 * 	Update TaraxtkStatsFileNamTxt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTaraxtkStatsFileNamTxt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTaraxtkStatsFileNamTxt,TARAXTK_STATS_FILE_NAM_TXT_LEN);
   	
   }
   
     /**
	 * 	Update TaraxtkStatsFileNamTxt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTaraxtkStatsFileNamTxt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTaraxtkStatsFileNamTxt+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes TaraxtkStatsFileNam
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setTaraxtkStatsFileNamLen((short)0);
         setTaraxtkStatsFileNamTxt(CONSTANTS.SPACE_256);
   }

		public static int getTaraxtkStatsFileNamFieldLength() {
			return TARAXTK_STATS_FILE_NAM_LENGTH;
		}

}
  
