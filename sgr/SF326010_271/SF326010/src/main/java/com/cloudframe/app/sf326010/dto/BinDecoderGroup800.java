package com.cloudframe.app.sf326010.dto;

/**
*  The class BinDecoderGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BinDecoderGroup800 extends BinDecoderGroup800Serialized {
   

								private short binDecoder800;
					private BinDecoder800Redefined binDecoder800Redefined = new BinDecoder800Redefined();
	
	/**
	* Constructor for BinDecoderGroup800
	**/
    public BinDecoderGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			binDecoder800Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setBinDecoder800((short)0);
    }


 

	/**
	 *	Returns the value of binDecoder800
	 *	@return binDecoder800
	 */
	public short getBinDecoder800() throws CFException {
        if (isBinDecoder800Modified()) { 
           binDecoder800 = refreshBinDecoder800();
        }
   		return binDecoder800;
	}
	
	/**
	 * 	Update BinDecoder800 with the passed value
	 *  Corresponding COBOL Variable is 800-BIN-DECODER
	 *	@param number
	 */
	public void setBinDecoder800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binDecoder800 = checkBinDecoder800MaxLimit(number); 
		serializeBinDecoder800(binDecoder800);
	}

	public void setBinDecoder800(int number) {
	    number = checkBinDecoder800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinDecoder800((short)number);
	}
	public void setBinDecoder800(long number) {
	    number = checkBinDecoder800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinDecoder800((short)number);
	}
	

	/**
	 *	Returns the value of binDecoder800Redefined
	 *	@return binDecoder800Redefined
	 */   
	 public BinDecoder800Redefined getBinDecoder800Redefined() {
   	return binDecoder800Redefined;
   }
   /**
	* 	Update BinDecoder800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-BIN-DECODER-REDEFINED
	*	@param value
	*/
   public void setBinDecoder800Redefined(char[] value) {
      binDecoder800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update BinDecoder800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBinDecoder800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,binDecoder800Redefined.begin,binDecoder800Redefined.length());
   }
   
     /**
	 * 	Update BinDecoder800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBinDecoder800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,binDecoder800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BinDecoder800Redefined with another Field
	 *	@param value
	 */
   public void setBinDecoder800Redefined(Field source) {
   	replace(source,0,source.length(),binDecoder800Redefined.begin,binDecoder800Redefined.length());
   }  
   
     /**
	 * 	Update BinDecoder800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBinDecoder800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,binDecoder800Redefined.begin,binDecoder800Redefined.length());
   }
   
     /**
	 * 	Update BinDecoder800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBinDecoder800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,binDecoder800Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBinDecoderGroup800FieldLength() {
			return BIN_DECODER_GROUP_800_LENGTH;
		}

}
  
