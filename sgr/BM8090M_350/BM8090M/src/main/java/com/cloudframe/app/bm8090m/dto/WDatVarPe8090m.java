package com.cloudframe.app.bm8090m.dto;

/**
*  The class WDatVarPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WDatVarPe8090m extends WDatVarPe8090mSerialized { 
   

								private int wCntPerPe8090m;

								private int wCntFisPe8090m;

								private int wCntOblPe8090m;

								private int wCntRelPe8090m;

								private int wOcuTitPe8090m;

								private int wOblTitPe8090m;

								private int wCntGioPe8090m;

								private int wIndGioPe8090m;

								private int wMaxTitPe8090m;

								private int wPoiNtePe8090m;

								private int wPoiGuaPe8090m;

						private char[] wIdiApe = Field.fillLowValue(2);
	
	/**
	* Constructor for WDatVarPe8090m
	**/
    public WDatVarPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WDatVarPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WDatVarPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wCntPerPe8090m
	 *	@return wCntPerPe8090m
	 */
	public int getWCntPerPe8090m() throws CFException {
        if (isWCntPerPe8090mModified()) { 
           wCntPerPe8090m = refreshWCntPerPe8090m();
        }
   		return wCntPerPe8090m;
	}
	
	/**
	 * 	Update WCntPerPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CNT-PER-PE8090M
	 *	@param number
	 */
	public void setWCntPerPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCntPerPe8090m = checkWCntPerPe8090mMaxLimit(number); 
		serializeWCntPerPe8090m(wCntPerPe8090m);
	}


	public void setWCntPerPe8090m(long number) {
	    number = checkWCntPerPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCntPerPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wCntFisPe8090m
	 *	@return wCntFisPe8090m
	 */
	public int getWCntFisPe8090m() throws CFException {
        if (isWCntFisPe8090mModified()) { 
           wCntFisPe8090m = refreshWCntFisPe8090m();
        }
   		return wCntFisPe8090m;
	}
	
	/**
	 * 	Update WCntFisPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CNT-FIS-PE8090M
	 *	@param number
	 */
	public void setWCntFisPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCntFisPe8090m = checkWCntFisPe8090mMaxLimit(number); 
		serializeWCntFisPe8090m(wCntFisPe8090m);
	}


	public void setWCntFisPe8090m(long number) {
	    number = checkWCntFisPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCntFisPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wCntOblPe8090m
	 *	@return wCntOblPe8090m
	 */
	public int getWCntOblPe8090m() throws CFException {
        if (isWCntOblPe8090mModified()) { 
           wCntOblPe8090m = refreshWCntOblPe8090m();
        }
   		return wCntOblPe8090m;
	}
	
	/**
	 * 	Update WCntOblPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CNT-OBL-PE8090M
	 *	@param number
	 */
	public void setWCntOblPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCntOblPe8090m = checkWCntOblPe8090mMaxLimit(number); 
		serializeWCntOblPe8090m(wCntOblPe8090m);
	}


	public void setWCntOblPe8090m(long number) {
	    number = checkWCntOblPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCntOblPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wCntRelPe8090m
	 *	@return wCntRelPe8090m
	 */
	public int getWCntRelPe8090m() throws CFException {
        if (isWCntRelPe8090mModified()) { 
           wCntRelPe8090m = refreshWCntRelPe8090m();
        }
   		return wCntRelPe8090m;
	}
	
	/**
	 * 	Update WCntRelPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CNT-REL-PE8090M
	 *	@param number
	 */
	public void setWCntRelPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCntRelPe8090m = checkWCntRelPe8090mMaxLimit(number); 
		serializeWCntRelPe8090m(wCntRelPe8090m);
	}


	public void setWCntRelPe8090m(long number) {
	    number = checkWCntRelPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCntRelPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wOcuTitPe8090m
	 *	@return wOcuTitPe8090m
	 */
	public int getWOcuTitPe8090m() throws CFException {
        if (isWOcuTitPe8090mModified()) { 
           wOcuTitPe8090m = refreshWOcuTitPe8090m();
        }
   		return wOcuTitPe8090m;
	}
	
	/**
	 * 	Update WOcuTitPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-OCU-TIT-PE8090M
	 *	@param number
	 */
	public void setWOcuTitPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wOcuTitPe8090m = checkWOcuTitPe8090mMaxLimit(number); 
		serializeWOcuTitPe8090m(wOcuTitPe8090m);
	}


	public void setWOcuTitPe8090m(long number) {
	    number = checkWOcuTitPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWOcuTitPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wOblTitPe8090m
	 *	@return wOblTitPe8090m
	 */
	public int getWOblTitPe8090m() throws CFException {
        if (isWOblTitPe8090mModified()) { 
           wOblTitPe8090m = refreshWOblTitPe8090m();
        }
   		return wOblTitPe8090m;
	}
	
	/**
	 * 	Update WOblTitPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-OBL-TIT-PE8090M
	 *	@param number
	 */
	public void setWOblTitPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wOblTitPe8090m = checkWOblTitPe8090mMaxLimit(number); 
		serializeWOblTitPe8090m(wOblTitPe8090m);
	}


	public void setWOblTitPe8090m(long number) {
	    number = checkWOblTitPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWOblTitPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wCntGioPe8090m
	 *	@return wCntGioPe8090m
	 */
	public int getWCntGioPe8090m() throws CFException {
        if (isWCntGioPe8090mModified()) { 
           wCntGioPe8090m = refreshWCntGioPe8090m();
        }
   		return wCntGioPe8090m;
	}
	
	/**
	 * 	Update WCntGioPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CNT-GIO-PE8090M
	 *	@param number
	 */
	public void setWCntGioPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCntGioPe8090m = checkWCntGioPe8090mMaxLimit(number); 
		serializeWCntGioPe8090m(wCntGioPe8090m);
	}


	public void setWCntGioPe8090m(long number) {
	    number = checkWCntGioPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCntGioPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIndGioPe8090m
	 *	@return wIndGioPe8090m
	 */
	public int getWIndGioPe8090m() throws CFException {
        if (isWIndGioPe8090mModified()) { 
           wIndGioPe8090m = refreshWIndGioPe8090m();
        }
   		return wIndGioPe8090m;
	}
	
	/**
	 * 	Update WIndGioPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-IND-GIO-PE8090M
	 *	@param number
	 */
	public void setWIndGioPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIndGioPe8090m = checkWIndGioPe8090mMaxLimit(number); 
		serializeWIndGioPe8090m(wIndGioPe8090m);
	}


	public void setWIndGioPe8090m(long number) {
	    number = checkWIndGioPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIndGioPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wMaxTitPe8090m
	 *	@return wMaxTitPe8090m
	 */
	public int getWMaxTitPe8090m() throws CFException {
        if (isWMaxTitPe8090mModified()) { 
           wMaxTitPe8090m = refreshWMaxTitPe8090m();
        }
   		return wMaxTitPe8090m;
	}
	
	/**
	 * 	Update WMaxTitPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-MAX-TIT-PE8090M
	 *	@param number
	 */
	public void setWMaxTitPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wMaxTitPe8090m = checkWMaxTitPe8090mMaxLimit(number); 
		serializeWMaxTitPe8090m(wMaxTitPe8090m);
	}


	public void setWMaxTitPe8090m(long number) {
	    number = checkWMaxTitPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWMaxTitPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wPoiNtePe8090m
	 *	@return wPoiNtePe8090m
	 */
	public int getWPoiNtePe8090m() throws CFException {
        if (isWPoiNtePe8090mModified()) { 
           wPoiNtePe8090m = refreshWPoiNtePe8090m();
        }
   		return wPoiNtePe8090m;
	}
	
	/**
	 * 	Update WPoiNtePe8090m with the passed value
	 *  Corresponding COBOL Variable is W-POI-NTE-PE8090M
	 *	@param number
	 */
	public void setWPoiNtePe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wPoiNtePe8090m = checkWPoiNtePe8090mMaxLimit(number); 
		serializeWPoiNtePe8090m(wPoiNtePe8090m);
	}


	public void setWPoiNtePe8090m(long number) {
	    number = checkWPoiNtePe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWPoiNtePe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wPoiGuaPe8090m
	 *	@return wPoiGuaPe8090m
	 */
	public int getWPoiGuaPe8090m() throws CFException {
        if (isWPoiGuaPe8090mModified()) { 
           wPoiGuaPe8090m = refreshWPoiGuaPe8090m();
        }
   		return wPoiGuaPe8090m;
	}
	
	/**
	 * 	Update WPoiGuaPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-POI-GUA-PE8090M
	 *	@param number
	 */
	public void setWPoiGuaPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wPoiGuaPe8090m = checkWPoiGuaPe8090mMaxLimit(number); 
		serializeWPoiGuaPe8090m(wPoiGuaPe8090m);
	}


	public void setWPoiGuaPe8090m(long number) {
	    number = checkWPoiGuaPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWPoiGuaPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIdiApe
	 *	@return wIdiApe
	 */
   public char[] getWIdiApe() throws CFException{
     if (isWIdiApeModified()) { 
        wIdiApe = refreshWIdiApe();
     }
   		return wIdiApe;
   }

  
	/**
	*  set variable wIdiApe
	*  Corresponding COBOL Variable is W-IDI-APE
	*  @param value
	**/
   public void setWIdiApe(char[] value) {
      wIdiApe = checkWIdiApeConstraints(value);
      serializeWIdiApe(wIdiApe);
   } 

     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWIdiApe,wIdiApe.length);
   	
   }
   
   public void setWIdiApe(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWIdiApe,wIdiApe.length);
   	
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIdiApe+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WIdiApe with another Field
	 *	@param value
	 */
   public void setWIdiApe(Field source) {
       replace(source,0,source.length(),beginWIdiApe,W_IDI_APE_LEN);
   	
   }  
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWIdiApe,W_IDI_APE_LEN);
   	
   }
   
     /**
	 * 	Update WIdiApe 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWIdiApe(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWIdiApe+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WDatVarPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWCntPerPe8090m(0);
                     setWCntFisPe8090m(0);
                     setWCntOblPe8090m(0);
                     setWCntRelPe8090m(0);
                     setWOcuTitPe8090m(0);
                     setWOblTitPe8090m(0);
                     setWCntGioPe8090m(0);
                     setWIndGioPe8090m(0);
                     setWMaxTitPe8090m(0);
                     setWPoiNtePe8090m(0);
                     setWPoiGuaPe8090m(0);
         setWIdiApe(CONSTANTS.SPACE_2);
   }

		public static int getWDatVarPe8090mFieldLength() {
			return W_DAT_VAR_PE_8090M_LENGTH;
		}

}
  
