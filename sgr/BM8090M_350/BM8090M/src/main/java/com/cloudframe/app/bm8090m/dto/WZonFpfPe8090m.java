package com.cloudframe.app.bm8090m.dto;

/**
*  The class WZonFpfPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WZonFpfPe8090m extends WZonFpfPe8090mSerialized { 
   

								private int wNupFpfPe8090m;

								private int wTipFpfPe8090m;

						private char[] wMasFpfPe8090m = Field.fillLowValue(18);

								private int wTmaFpfPe8090m;

								private int wNcmFpfPe8090m;
	
	/**
	* Constructor for WZonFpfPe8090m
	**/
    public WZonFpfPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WZonFpfPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WZonFpfPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wNupFpfPe8090m
	 *	@return wNupFpfPe8090m
	 */
	public int getWNupFpfPe8090m() throws CFException {
        if (isWNupFpfPe8090mModified()) { 
           wNupFpfPe8090m = refreshWNupFpfPe8090m();
        }
   		return wNupFpfPe8090m;
	}
	
	/**
	 * 	Update WNupFpfPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NUP-FPF-PE8090M
	 *	@param number
	 */
	public void setWNupFpfPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNupFpfPe8090m = checkWNupFpfPe8090mMaxLimit(number); 
		serializeWNupFpfPe8090m(wNupFpfPe8090m);
	}


	public void setWNupFpfPe8090m(long number) {
	    number = checkWNupFpfPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNupFpfPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wTipFpfPe8090m
	 *	@return wTipFpfPe8090m
	 */
	public int getWTipFpfPe8090m() throws CFException {
        if (isWTipFpfPe8090mModified()) { 
           wTipFpfPe8090m = refreshWTipFpfPe8090m();
        }
   		return wTipFpfPe8090m;
	}
	
	/**
	 * 	Update WTipFpfPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TIP-FPF-PE8090M
	 *	@param number
	 */
	public void setWTipFpfPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTipFpfPe8090m = checkWTipFpfPe8090mMaxLimit(number); 
		serializeWTipFpfPe8090m(wTipFpfPe8090m);
	}


	public void setWTipFpfPe8090m(long number) {
	    number = checkWTipFpfPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTipFpfPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wMasFpfPe8090m
	 *	@return wMasFpfPe8090m
	 */
   public char[] getWMasFpfPe8090m() throws CFException{
     if (isWMasFpfPe8090mModified()) { 
        wMasFpfPe8090m = refreshWMasFpfPe8090m();
     }
   		return wMasFpfPe8090m;
   }

  
	/**
	*  set variable wMasFpfPe8090m
	*  Corresponding COBOL Variable is W-MAS-FPF-PE8090M
	*  @param value
	**/
   public void setWMasFpfPe8090m(char[] value) {
      wMasFpfPe8090m = checkWMasFpfPe8090mConstraints(value);
      serializeWMasFpfPe8090m(wMasFpfPe8090m);
   } 

     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWMasFpfPe8090m,wMasFpfPe8090m.length);
   	
   }
   
   public void setWMasFpfPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWMasFpfPe8090m,wMasFpfPe8090m.length);
   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMasFpfPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WMasFpfPe8090m with another Field
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source) {
       replace(source,0,source.length(),beginWMasFpfPe8090m,W_MAS_FPF_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWMasFpfPe8090m,W_MAS_FPF_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WMasFpfPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasFpfPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMasFpfPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wTmaFpfPe8090m
	 *	@return wTmaFpfPe8090m
	 */
	public int getWTmaFpfPe8090m() throws CFException {
        if (isWTmaFpfPe8090mModified()) { 
           wTmaFpfPe8090m = refreshWTmaFpfPe8090m();
        }
   		return wTmaFpfPe8090m;
	}
	
	/**
	 * 	Update WTmaFpfPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TMA-FPF-PE8090M
	 *	@param number
	 */
	public void setWTmaFpfPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTmaFpfPe8090m = checkWTmaFpfPe8090mMaxLimit(number); 
		serializeWTmaFpfPe8090m(wTmaFpfPe8090m);
	}


	public void setWTmaFpfPe8090m(long number) {
	    number = checkWTmaFpfPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTmaFpfPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNcmFpfPe8090m
	 *	@return wNcmFpfPe8090m
	 */
	public int getWNcmFpfPe8090m() throws CFException {
        if (isWNcmFpfPe8090mModified()) { 
           wNcmFpfPe8090m = refreshWNcmFpfPe8090m();
        }
   		return wNcmFpfPe8090m;
	}
	
	/**
	 * 	Update WNcmFpfPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NCM-FPF-PE8090M
	 *	@param number
	 */
	public void setWNcmFpfPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNcmFpfPe8090m = checkWNcmFpfPe8090mMaxLimit(number); 
		serializeWNcmFpfPe8090m(wNcmFpfPe8090m);
	}


	public void setWNcmFpfPe8090m(long number) {
	    number = checkWNcmFpfPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNcmFpfPe8090m((int)number);
	}
	

	
	
	
	/**
	 * 	initializes WZonFpfPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWNupFpfPe8090m(0);
                     setWTipFpfPe8090m(0);
         setWMasFpfPe8090m(CONSTANTS.SPACE_18);
                     setWTmaFpfPe8090m(0);
                     setWNcmFpfPe8090m(0);
   }

		public static int getWZonFpfPe8090mFieldLength() {
			return W_ZON_FPF_PE_8090M_LENGTH;
		}

}
  
