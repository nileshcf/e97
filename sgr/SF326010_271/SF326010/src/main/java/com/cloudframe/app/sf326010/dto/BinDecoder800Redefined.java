package com.cloudframe.app.sf326010.dto;

/**
*  The class BinDecoder800Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BinDecoder800Redefined extends BinDecoder800RedefinedSerialized { 
   

						private char[] binDecoderByt2800 = Field.fillLowValue(1);
	
	/**
	* Constructor for BinDecoder800Redefined
	**/
    public BinDecoder800Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BinDecoder800Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BinDecoder800Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of binDecoderByt2800
	 *	@return binDecoderByt2800
	 */
   public char[] getBinDecoderByt2800() throws CFException{
     if (isBinDecoderByt2800Modified()) { 
        binDecoderByt2800 = refreshBinDecoderByt2800();
     }
   		return binDecoderByt2800;
   }

  
	/**
	*  set variable binDecoderByt2800
	*  Corresponding COBOL Variable is 800-BIN-DECODER-BYT-2
	*  @param value
	**/
   public void setBinDecoderByt2800(char[] value) {
      binDecoderByt2800 = checkBinDecoderByt2800Constraints(value);
      serializeBinDecoderByt2800(binDecoderByt2800);
   } 

     /**
	 * 	Update BinDecoderByt2800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBinDecoderByt2800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBinDecoderByt2800,binDecoderByt2800.length);
   	
   }
   
   public void setBinDecoderByt2800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBinDecoderByt2800,binDecoderByt2800.length);
   	
   }
   
     /**
	 * 	Update BinDecoderByt2800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBinDecoderByt2800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBinDecoderByt2800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BinDecoderByt2800 with another Field
	 *	@param value
	 */
   public void setBinDecoderByt2800(Field source) {
       replace(source,0,source.length(),beginBinDecoderByt2800,BIN_DECODER_BYT_2800_LEN);
   	
   }  
   
     /**
	 * 	Update BinDecoderByt2800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBinDecoderByt2800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBinDecoderByt2800,BIN_DECODER_BYT_2800_LEN);
   	
   }
   
     /**
	 * 	Update BinDecoderByt2800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBinDecoderByt2800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBinDecoderByt2800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBinDecoder800RedefinedFieldLength() {
			return BIN_DECODER_800_REDEFINED_LENGTH;
		}

}
  
