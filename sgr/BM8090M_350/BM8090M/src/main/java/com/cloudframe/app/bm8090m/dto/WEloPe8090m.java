package com.cloudframe.app.bm8090m.dto;

/**
*  The class WEloPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WEloPe8090m extends WEloPe8090mSerialized { 
   

								private int wTioPe8090m;

								private int wIeoPe8090m;

						private char[] wNobPe8090m = Field.fillLowValue(6);

								private int wNcoPe8090m;

								private int wInrPe8090m;

								private int wIsoPe8090m;
	
	/**
	* Constructor for WEloPe8090m
	**/
    public WEloPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WEloPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WEloPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wTioPe8090m
	 *	@return wTioPe8090m
	 */
	public int getWTioPe8090m() throws CFException {
        if (isWTioPe8090mModified()) { 
           wTioPe8090m = refreshWTioPe8090m();
        }
   		return wTioPe8090m;
	}
	
	/**
	 * 	Update WTioPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TIO-PE8090M
	 *	@param number
	 */
	public void setWTioPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTioPe8090m = checkWTioPe8090mMaxLimit(number); 
		serializeWTioPe8090m(wTioPe8090m);
	}


	public void setWTioPe8090m(long number) {
	    number = checkWTioPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTioPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIeoPe8090m
	 *	@return wIeoPe8090m
	 */
	public int getWIeoPe8090m() throws CFException {
        if (isWIeoPe8090mModified()) { 
           wIeoPe8090m = refreshWIeoPe8090m();
        }
   		return wIeoPe8090m;
	}
	
	/**
	 * 	Update WIeoPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-IEO-PE8090M
	 *	@param number
	 */
	public void setWIeoPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIeoPe8090m = checkWIeoPe8090mMaxLimit(number); 
		serializeWIeoPe8090m(wIeoPe8090m);
	}


	public void setWIeoPe8090m(long number) {
	    number = checkWIeoPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIeoPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNobPe8090m
	 *	@return wNobPe8090m
	 */
   public char[] getWNobPe8090m() throws CFException{
     if (isWNobPe8090mModified()) { 
        wNobPe8090m = refreshWNobPe8090m();
     }
   		return wNobPe8090m;
   }

  
	/**
	*  set variable wNobPe8090m
	*  Corresponding COBOL Variable is W-NOB-PE8090M
	*  @param value
	**/
   public void setWNobPe8090m(char[] value) {
      wNobPe8090m = checkWNobPe8090mConstraints(value);
      serializeWNobPe8090m(wNobPe8090m);
   } 

     /**
	 * 	Update WNobPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNobPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNobPe8090m,wNobPe8090m.length);
   	
   }
   
   public void setWNobPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNobPe8090m,wNobPe8090m.length);
   	
   }
   
     /**
	 * 	Update WNobPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNobPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNobPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNobPe8090m with another Field
	 *	@param value
	 */
   public void setWNobPe8090m(Field source) {
       replace(source,0,source.length(),beginWNobPe8090m,W_NOB_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNobPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNobPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNobPe8090m,W_NOB_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNobPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNobPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNobPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNcoPe8090m
	 *	@return wNcoPe8090m
	 */
	public int getWNcoPe8090m() throws CFException {
        if (isWNcoPe8090mModified()) { 
           wNcoPe8090m = refreshWNcoPe8090m();
        }
   		return wNcoPe8090m;
	}
	
	/**
	 * 	Update WNcoPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NCO-PE8090M
	 *	@param number
	 */
	public void setWNcoPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNcoPe8090m = checkWNcoPe8090mMaxLimit(number); 
		serializeWNcoPe8090m(wNcoPe8090m);
	}


	public void setWNcoPe8090m(long number) {
	    number = checkWNcoPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNcoPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wInrPe8090m
	 *	@return wInrPe8090m
	 */
	public int getWInrPe8090m() throws CFException {
        if (isWInrPe8090mModified()) { 
           wInrPe8090m = refreshWInrPe8090m();
        }
   		return wInrPe8090m;
	}
	
	/**
	 * 	Update WInrPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-INR-PE8090M
	 *	@param number
	 */
	public void setWInrPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wInrPe8090m = checkWInrPe8090mMaxLimit(number); 
		serializeWInrPe8090m(wInrPe8090m);
	}


	public void setWInrPe8090m(long number) {
	    number = checkWInrPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWInrPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIsoPe8090m
	 *	@return wIsoPe8090m
	 */
	public int getWIsoPe8090m() throws CFException {
        if (isWIsoPe8090mModified()) { 
           wIsoPe8090m = refreshWIsoPe8090m();
        }
   		return wIsoPe8090m;
	}
	
	/**
	 * 	Update WIsoPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-ISO-PE8090M
	 *	@param number
	 */
	public void setWIsoPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIsoPe8090m = checkWIsoPe8090mMaxLimit(number); 
		serializeWIsoPe8090m(wIsoPe8090m);
	}


	public void setWIsoPe8090m(long number) {
	    number = checkWIsoPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIsoPe8090m((int)number);
	}
	

	
	
	
	/**
	 * 	initializes WEloPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWTioPe8090m(0);
                     setWIeoPe8090m(0);
         setWNobPe8090m(CONSTANTS.SPACE_6);
                     setWNcoPe8090m(0);
                     setWInrPe8090m(0);
                     setWIsoPe8090m(0);
   }

		public static int getWEloPe8090mFieldLength() {
			return W_ELO_PE_8090M_LENGTH;
		}

}
  
