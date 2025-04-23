package com.cloudframe.app.init1.dto;

/**
*  The class CmnConvertedTimeFormats is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnConvertedTimeFormats extends CmnConvertedTimeFormatsSerialized { 
   

								private long cmnConvNumTime;

						private char[] cmnConvAmPmTime = Field.fillLowValue(7);

						private char[] cmnConvJisTime = Field.fillLowValue(8);

						private char[] cmnConvIsoTime = Field.fillLowValue(8);
	
	/**
	* Constructor for CmnConvertedTimeFormats
	**/
    public CmnConvertedTimeFormats() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnConvertedTimeFormats. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnConvertedTimeFormats(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnConvNumTime
	 *	@return cmnConvNumTime
	 */
	public long getCmnConvNumTime() throws CFException {
       if (isCmnConvNumTimeModified()) { 
           cmnConvNumTime = refreshCmnConvNumTime();
        }
   		return cmnConvNumTime;
	}
	

	
	   
	/**
	 * 	Update CmnConvNumTime with the passed value
	 *  Corresponding COBOL Variable is CMN-CONV-NUM-TIME
	 *	@param number
	 */
	public void setCmnConvNumTime(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnConvNumTime = checkCmnConvNumTimeMaxLimit(number); 
		serializeCmnConvNumTime(cmnConvNumTime);
	}
	

	/**
	 * 	Update CmnConvNumTime with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnConvNumTime(char[] value) throws CFException {
		 cmnConvNumTime = serializeCmnConvNumTime(value);
	}
	/**
	 * 	Update CmnConvNumTime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnConvNumTimeString(char[] value) throws CFException {
		 setCmnConvNumTime(value);
	}
	/**
	 *	Returns the value of cmnConvAmPmTime
	 *	@return cmnConvAmPmTime
	 */
   public char[] getCmnConvAmPmTime() throws CFException{
     if (isCmnConvAmPmTimeModified()) { 
        cmnConvAmPmTime = refreshCmnConvAmPmTime();
     }
   		return cmnConvAmPmTime;
   }

  
	/**
	*  set variable cmnConvAmPmTime
	*  Corresponding COBOL Variable is CMN-CONV-AM-PM-TIME
	*  @param value
	**/
   public void setCmnConvAmPmTime(char[] value) {
      cmnConvAmPmTime = checkCmnConvAmPmTimeConstraints(value);
      serializeCmnConvAmPmTime(cmnConvAmPmTime);
   } 

     /**
	 * 	Update CmnConvAmPmTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnConvAmPmTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnConvAmPmTime,cmnConvAmPmTime.length);
   	
   }
   
   public void setCmnConvAmPmTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvAmPmTime,cmnConvAmPmTime.length);
   	
   }
   
     /**
	 * 	Update CmnConvAmPmTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvAmPmTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvAmPmTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnConvAmPmTime with another Field
	 *	@param value
	 */
   public void setCmnConvAmPmTime(Field source) {
       replace(source,0,source.length(),beginCmnConvAmPmTime,CMN_CONV_AM_PM_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update CmnConvAmPmTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnConvAmPmTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnConvAmPmTime,CMN_CONV_AM_PM_TIME_LEN);
   	
   }
   
     /**
	 * 	Update CmnConvAmPmTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvAmPmTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvAmPmTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnConvJisTime
	 *	@return cmnConvJisTime
	 */
   public char[] getCmnConvJisTime() throws CFException{
     if (isCmnConvJisTimeModified()) { 
        cmnConvJisTime = refreshCmnConvJisTime();
     }
   		return cmnConvJisTime;
   }

  
	/**
	*  set variable cmnConvJisTime
	*  Corresponding COBOL Variable is CMN-CONV-JIS-TIME
	*  @param value
	**/
   public void setCmnConvJisTime(char[] value) {
      cmnConvJisTime = checkCmnConvJisTimeConstraints(value);
      serializeCmnConvJisTime(cmnConvJisTime);
   } 

     /**
	 * 	Update CmnConvJisTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnConvJisTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnConvJisTime,cmnConvJisTime.length);
   	
   }
   
   public void setCmnConvJisTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvJisTime,cmnConvJisTime.length);
   	
   }
   
     /**
	 * 	Update CmnConvJisTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvJisTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvJisTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnConvJisTime with another Field
	 *	@param value
	 */
   public void setCmnConvJisTime(Field source) {
       replace(source,0,source.length(),beginCmnConvJisTime,CMN_CONV_JIS_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update CmnConvJisTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnConvJisTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnConvJisTime,CMN_CONV_JIS_TIME_LEN);
   	
   }
   
     /**
	 * 	Update CmnConvJisTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvJisTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvJisTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnConvIsoTime
	 *	@return cmnConvIsoTime
	 */
   public char[] getCmnConvIsoTime() throws CFException{
     if (isCmnConvIsoTimeModified()) { 
        cmnConvIsoTime = refreshCmnConvIsoTime();
     }
   		return cmnConvIsoTime;
   }

  
	/**
	*  set variable cmnConvIsoTime
	*  Corresponding COBOL Variable is CMN-CONV-ISO-TIME
	*  @param value
	**/
   public void setCmnConvIsoTime(char[] value) {
      cmnConvIsoTime = checkCmnConvIsoTimeConstraints(value);
      serializeCmnConvIsoTime(cmnConvIsoTime);
   } 

     /**
	 * 	Update CmnConvIsoTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnConvIsoTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnConvIsoTime,cmnConvIsoTime.length);
   	
   }
   
   public void setCmnConvIsoTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvIsoTime,cmnConvIsoTime.length);
   	
   }
   
     /**
	 * 	Update CmnConvIsoTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvIsoTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvIsoTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnConvIsoTime with another Field
	 *	@param value
	 */
   public void setCmnConvIsoTime(Field source) {
       replace(source,0,source.length(),beginCmnConvIsoTime,CMN_CONV_ISO_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update CmnConvIsoTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnConvIsoTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnConvIsoTime,CMN_CONV_ISO_TIME_LEN);
   	
   }
   
     /**
	 * 	Update CmnConvIsoTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnConvIsoTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnConvIsoTime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCmnConvertedTimeFormatsFieldLength() {
			return CMN_CONVERTED_TIME_FORMATS_LENGTH;
		}

}
  
