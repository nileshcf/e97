package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateConvInputFormats is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateConvInputFormats extends CmnDateConvInputFormatsSerialized { 
   
				private CmnDateIbmUsaStdIn cmnDateIbmUsaStdIn = new CmnDateIbmUsaStdIn();

								private long cmnDateJulianIn;
	
	/**
	* Constructor for CmnDateConvInputFormats
	**/
    public CmnDateConvInputFormats() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateConvInputFormats. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateConvInputFormats(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateIbmUsaStdIn.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cmnDateIbmUsaStdIn
	 *	@return cmnDateIbmUsaStdIn
	 */   
	 public CmnDateIbmUsaStdIn getCmnDateIbmUsaStdIn() {
   	return cmnDateIbmUsaStdIn;
   }
   /**
	* 	Update CmnDateIbmUsaStdIn with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-IBM-USA-STD-IN
	*	@param value
	*/
   public void setCmnDateIbmUsaStdIn(char[] value) {
      cmnDateIbmUsaStdIn.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateIbmUsaStdIn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdIn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateIbmUsaStdIn.begin,cmnDateIbmUsaStdIn.length());
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdIn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdIn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateIbmUsaStdIn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateIbmUsaStdIn with another Field
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdIn(Field source) {
   	replace(source,0,source.length(),cmnDateIbmUsaStdIn.begin,cmnDateIbmUsaStdIn.length());
   }  
   
     /**
	 * 	Update CmnDateIbmUsaStdIn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdIn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateIbmUsaStdIn.begin,cmnDateIbmUsaStdIn.length());
   }
   
     /**
	 * 	Update CmnDateIbmUsaStdIn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateIbmUsaStdIn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateIbmUsaStdIn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnDateJulianIn
	 *	@return cmnDateJulianIn
	 */
	public long getCmnDateJulianIn() throws CFException {
       if (isCmnDateJulianInModified()) { 
           cmnDateJulianIn = refreshCmnDateJulianIn();
        }
   		return cmnDateJulianIn;
	}
	

	
	   
	/**
	 * 	Update CmnDateJulianIn with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-JULIAN-IN
	 *	@param number
	 */
	public void setCmnDateJulianIn(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateJulianIn = checkCmnDateJulianInMaxLimit(number); 
		serializeCmnDateJulianIn(cmnDateJulianIn);
	}
	

	/**
	 * 	Update CmnDateJulianIn with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateJulianIn(char[] value) throws CFException {
		 cmnDateJulianIn = serializeCmnDateJulianIn(value);
	}
	/**
	 * 	Update CmnDateJulianIn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateJulianInString(char[] value) throws CFException {
		 setCmnDateJulianIn(value);
	}

	
	
	

		public static int getCmnDateConvInputFormatsFieldLength() {
			return CMN_DATE_CONV_INPUT_FORMATS_LENGTH;
		}

}
  
