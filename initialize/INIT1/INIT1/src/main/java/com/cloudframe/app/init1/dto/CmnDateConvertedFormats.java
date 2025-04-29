package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateConvertedFormats is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateConvertedFormats extends CmnDateConvertedFormatsSerialized { 
   

								private long cmnDateConvJulian;

						private char[] cmnDateConvIbmUsaStd = Field.fillLowValue(10);

						private char[] cmnDateConvLitShort = Field.fillLowValue(12);

						private char[] cmnDateConvLitLong = Field.fillLowValue(18);
	
	/**
	* Constructor for CmnDateConvertedFormats
	**/
    public CmnDateConvertedFormats() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateConvertedFormats. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvertedFormats(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnDateConvJulian
	 *	@return cmnDateConvJulian
	 */
	public long getCmnDateConvJulian() throws CFException {
       if (isCmnDateConvJulianModified()) { 
           cmnDateConvJulian = refreshCmnDateConvJulian();
        }
   		return cmnDateConvJulian;
	}
	

	
	   
	/**
	 * 	Update CmnDateConvJulian with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CONV-JULIAN
	 *	@param number
	 */
	public void setCmnDateConvJulian(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateConvJulian = checkCmnDateConvJulianMaxLimit(number); 
		serializeCmnDateConvJulian(cmnDateConvJulian);
	}
	

	/**
	 * 	Update CmnDateConvJulian with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateConvJulian(char[] value) throws CFException {
		 cmnDateConvJulian = serializeCmnDateConvJulian(value);
	}
	/**
	 * 	Update CmnDateConvJulian with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateConvJulianString(char[] value) throws CFException {
		 setCmnDateConvJulian(value);
	}
	/**
	 *	Returns the value of cmnDateConvIbmUsaStd
	 *	@return cmnDateConvIbmUsaStd
	 */
   public char[] getCmnDateConvIbmUsaStd() throws CFException{
     if (isCmnDateConvIbmUsaStdModified()) { 
        cmnDateConvIbmUsaStd = refreshCmnDateConvIbmUsaStd();
     }
   		return cmnDateConvIbmUsaStd;
   }

  
	/**
	*  set variable cmnDateConvIbmUsaStd
	*  Corresponding COBOL Variable is CMN-DATE-CONV-IBM-USA-STD
	*  @param value
	**/
   public void setCmnDateConvIbmUsaStd(char[] value) {
      cmnDateConvIbmUsaStd = checkCmnDateConvIbmUsaStdConstraints(value);
      serializeCmnDateConvIbmUsaStd(cmnDateConvIbmUsaStd);
   } 

     /**
	 * 	Update CmnDateConvIbmUsaStd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvIbmUsaStd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateConvIbmUsaStd,cmnDateConvIbmUsaStd.length);
   	
   }
   
   public void setCmnDateConvIbmUsaStd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvIbmUsaStd,cmnDateConvIbmUsaStd.length);
   	
   }
   
     /**
	 * 	Update CmnDateConvIbmUsaStd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvIbmUsaStd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvIbmUsaStd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateConvIbmUsaStd with another Field
	 *	@param value
	 */
   public void setCmnDateConvIbmUsaStd(Field source) {
       replace(source,0,source.length(),beginCmnDateConvIbmUsaStd,CMN_DATE_CONV_IBM_USA_STD_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateConvIbmUsaStd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateConvIbmUsaStd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateConvIbmUsaStd,CMN_DATE_CONV_IBM_USA_STD_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateConvIbmUsaStd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvIbmUsaStd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvIbmUsaStd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateConvLitShort
	 *	@return cmnDateConvLitShort
	 */
   public char[] getCmnDateConvLitShort() throws CFException{
     if (isCmnDateConvLitShortModified()) { 
        cmnDateConvLitShort = refreshCmnDateConvLitShort();
     }
   		return cmnDateConvLitShort;
   }

  
	/**
	*  set variable cmnDateConvLitShort
	*  Corresponding COBOL Variable is CMN-DATE-CONV-LIT-SHORT
	*  @param value
	**/
   public void setCmnDateConvLitShort(char[] value) {
      cmnDateConvLitShort = checkCmnDateConvLitShortConstraints(value);
      serializeCmnDateConvLitShort(cmnDateConvLitShort);
   } 

     /**
	 * 	Update CmnDateConvLitShort 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvLitShort(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateConvLitShort,cmnDateConvLitShort.length);
   	
   }
   
   public void setCmnDateConvLitShort(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvLitShort,cmnDateConvLitShort.length);
   	
   }
   
     /**
	 * 	Update CmnDateConvLitShort 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvLitShort(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvLitShort+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateConvLitShort with another Field
	 *	@param value
	 */
   public void setCmnDateConvLitShort(Field source) {
       replace(source,0,source.length(),beginCmnDateConvLitShort,CMN_DATE_CONV_LIT_SHORT_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateConvLitShort 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateConvLitShort(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateConvLitShort,CMN_DATE_CONV_LIT_SHORT_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateConvLitShort 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvLitShort(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvLitShort+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateConvLitLong
	 *	@return cmnDateConvLitLong
	 */
   public char[] getCmnDateConvLitLong() throws CFException{
     if (isCmnDateConvLitLongModified()) { 
        cmnDateConvLitLong = refreshCmnDateConvLitLong();
     }
   		return cmnDateConvLitLong;
   }

  
	/**
	*  set variable cmnDateConvLitLong
	*  Corresponding COBOL Variable is CMN-DATE-CONV-LIT-LONG
	*  @param value
	**/
   public void setCmnDateConvLitLong(char[] value) {
      cmnDateConvLitLong = checkCmnDateConvLitLongConstraints(value);
      serializeCmnDateConvLitLong(cmnDateConvLitLong);
   } 

     /**
	 * 	Update CmnDateConvLitLong 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateConvLitLong(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateConvLitLong,cmnDateConvLitLong.length);
   	
   }
   
   public void setCmnDateConvLitLong(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvLitLong,cmnDateConvLitLong.length);
   	
   }
   
     /**
	 * 	Update CmnDateConvLitLong 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvLitLong(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvLitLong+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateConvLitLong with another Field
	 *	@param value
	 */
   public void setCmnDateConvLitLong(Field source) {
       replace(source,0,source.length(),beginCmnDateConvLitLong,CMN_DATE_CONV_LIT_LONG_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateConvLitLong 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateConvLitLong(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateConvLitLong,CMN_DATE_CONV_LIT_LONG_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateConvLitLong 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateConvLitLong(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateConvLitLong+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnDateConvertedFormatsFieldLength() {
			return CMN_DATE_CONVERTED_FORMATS_LENGTH;
		}

}
  
