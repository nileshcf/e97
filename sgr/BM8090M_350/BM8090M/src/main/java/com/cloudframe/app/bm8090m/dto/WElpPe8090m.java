package com.cloudframe.app.bm8090m.dto;

/**
*  The class WElpPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:28. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WElpPe8090m extends WElpPe8090mSerialized { 
   

								private int wTipPe8090m;

								private int wIeqPe8090m;

						private char[] wNomPe8090m = Field.fillLowValue(62);

								private int wNcaNomPe8090m;

						private char[] wNo1Pe8090m = Field.fillLowValue(40);

								private int wNcaNo1Pe8090m;

						private char[] wNo2Pe8090m = Field.fillLowValue(24);

								private int wNcaNo2Pe8090m;

								private int wNsePerPe8090m;

								private int wIsePe8090m;

						private char[] wMasSepPe8090m = Field.fillLowValue(18);

								private int wTmaSepPe8090m;

								private int wNmaSepPe8090m;

								private int wPerGruPe8090m;

								private int wTpeNrePe8090m;

						private char[] wNomNrePe8090m = Field.fillLowValue(20);

						private char[] wPraNrePe8090m = Field.fillLowValue(20);

						private char[] wSeaNrePe8090m = Field.fillLowValue(20);

								private int wCpeNomPe8090m;
	
	/**
	* Constructor for WElpPe8090m
	**/
    public WElpPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WElpPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WElpPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wTipPe8090m
	 *	@return wTipPe8090m
	 */
	public int getWTipPe8090m() throws CFException {
        if (isWTipPe8090mModified()) { 
           wTipPe8090m = refreshWTipPe8090m();
        }
   		return wTipPe8090m;
	}
	
	/**
	 * 	Update WTipPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TIP-PE8090M
	 *	@param number
	 */
	public void setWTipPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTipPe8090m = checkWTipPe8090mMaxLimit(number); 
		serializeWTipPe8090m(wTipPe8090m);
	}


	public void setWTipPe8090m(long number) {
	    number = checkWTipPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTipPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIeqPe8090m
	 *	@return wIeqPe8090m
	 */
	public int getWIeqPe8090m() throws CFException {
        if (isWIeqPe8090mModified()) { 
           wIeqPe8090m = refreshWIeqPe8090m();
        }
   		return wIeqPe8090m;
	}
	
	/**
	 * 	Update WIeqPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-IEQ-PE8090M
	 *	@param number
	 */
	public void setWIeqPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIeqPe8090m = checkWIeqPe8090mMaxLimit(number); 
		serializeWIeqPe8090m(wIeqPe8090m);
	}


	public void setWIeqPe8090m(long number) {
	    number = checkWIeqPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIeqPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNomPe8090m
	 *	@return wNomPe8090m
	 */
   public char[] getWNomPe8090m() throws CFException{
     if (isWNomPe8090mModified()) { 
        wNomPe8090m = refreshWNomPe8090m();
     }
   		return wNomPe8090m;
   }

  
	/**
	*  set variable wNomPe8090m
	*  Corresponding COBOL Variable is W-NOM-PE8090M
	*  @param value
	**/
   public void setWNomPe8090m(char[] value) {
      wNomPe8090m = checkWNomPe8090mConstraints(value);
      serializeWNomPe8090m(wNomPe8090m);
   } 

     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNomPe8090m,wNomPe8090m.length);
   	
   }
   
   public void setWNomPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNomPe8090m,wNomPe8090m.length);
   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNomPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNomPe8090m with another Field
	 *	@param value
	 */
   public void setWNomPe8090m(Field source) {
       replace(source,0,source.length(),beginWNomPe8090m,W_NOM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNomPe8090m,W_NOM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNomPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNomPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNcaNomPe8090m
	 *	@return wNcaNomPe8090m
	 */
	public int getWNcaNomPe8090m() throws CFException {
        if (isWNcaNomPe8090mModified()) { 
           wNcaNomPe8090m = refreshWNcaNomPe8090m();
        }
   		return wNcaNomPe8090m;
	}
	
	/**
	 * 	Update WNcaNomPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NCA-NOM-PE8090M
	 *	@param number
	 */
	public void setWNcaNomPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNcaNomPe8090m = checkWNcaNomPe8090mMaxLimit(number); 
		serializeWNcaNomPe8090m(wNcaNomPe8090m);
	}


	public void setWNcaNomPe8090m(long number) {
	    number = checkWNcaNomPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNcaNomPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNo1Pe8090m
	 *	@return wNo1Pe8090m
	 */
   public char[] getWNo1Pe8090m() throws CFException{
     if (isWNo1Pe8090mModified()) { 
        wNo1Pe8090m = refreshWNo1Pe8090m();
     }
   		return wNo1Pe8090m;
   }

  
	/**
	*  set variable wNo1Pe8090m
	*  Corresponding COBOL Variable is W-NO1-PE8090M
	*  @param value
	**/
   public void setWNo1Pe8090m(char[] value) {
      wNo1Pe8090m = checkWNo1Pe8090mConstraints(value);
      serializeWNo1Pe8090m(wNo1Pe8090m);
   } 

     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1Pe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNo1Pe8090m,wNo1Pe8090m.length);
   	
   }
   
   public void setWNo1Pe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNo1Pe8090m,wNo1Pe8090m.length);
   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo1Pe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNo1Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo1Pe8090m(Field source) {
       replace(source,0,source.length(),beginWNo1Pe8090m,W_NO_1_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1Pe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNo1Pe8090m,W_NO_1_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNo1Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo1Pe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNcaNo1Pe8090m
	 *	@return wNcaNo1Pe8090m
	 */
	public int getWNcaNo1Pe8090m() throws CFException {
        if (isWNcaNo1Pe8090mModified()) { 
           wNcaNo1Pe8090m = refreshWNcaNo1Pe8090m();
        }
   		return wNcaNo1Pe8090m;
	}
	
	/**
	 * 	Update WNcaNo1Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NCA-NO1-PE8090M
	 *	@param number
	 */
	public void setWNcaNo1Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNcaNo1Pe8090m = checkWNcaNo1Pe8090mMaxLimit(number); 
		serializeWNcaNo1Pe8090m(wNcaNo1Pe8090m);
	}


	public void setWNcaNo1Pe8090m(long number) {
	    number = checkWNcaNo1Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNcaNo1Pe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNo2Pe8090m
	 *	@return wNo2Pe8090m
	 */
   public char[] getWNo2Pe8090m() throws CFException{
     if (isWNo2Pe8090mModified()) { 
        wNo2Pe8090m = refreshWNo2Pe8090m();
     }
   		return wNo2Pe8090m;
   }

  
	/**
	*  set variable wNo2Pe8090m
	*  Corresponding COBOL Variable is W-NO2-PE8090M
	*  @param value
	**/
   public void setWNo2Pe8090m(char[] value) {
      wNo2Pe8090m = checkWNo2Pe8090mConstraints(value);
      serializeWNo2Pe8090m(wNo2Pe8090m);
   } 

     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2Pe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNo2Pe8090m,wNo2Pe8090m.length);
   	
   }
   
   public void setWNo2Pe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNo2Pe8090m,wNo2Pe8090m.length);
   	
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo2Pe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNo2Pe8090m with another Field
	 *	@param value
	 */
   public void setWNo2Pe8090m(Field source) {
       replace(source,0,source.length(),beginWNo2Pe8090m,W_NO_2_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2Pe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNo2Pe8090m,W_NO_2_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNo2Pe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2Pe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo2Pe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNcaNo2Pe8090m
	 *	@return wNcaNo2Pe8090m
	 */
	public int getWNcaNo2Pe8090m() throws CFException {
        if (isWNcaNo2Pe8090mModified()) { 
           wNcaNo2Pe8090m = refreshWNcaNo2Pe8090m();
        }
   		return wNcaNo2Pe8090m;
	}
	
	/**
	 * 	Update WNcaNo2Pe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NCA-NO2-PE8090M
	 *	@param number
	 */
	public void setWNcaNo2Pe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNcaNo2Pe8090m = checkWNcaNo2Pe8090mMaxLimit(number); 
		serializeWNcaNo2Pe8090m(wNcaNo2Pe8090m);
	}


	public void setWNcaNo2Pe8090m(long number) {
	    number = checkWNcaNo2Pe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNcaNo2Pe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNsePerPe8090m
	 *	@return wNsePerPe8090m
	 */
	public int getWNsePerPe8090m() throws CFException {
        if (isWNsePerPe8090mModified()) { 
           wNsePerPe8090m = refreshWNsePerPe8090m();
        }
   		return wNsePerPe8090m;
	}
	
	/**
	 * 	Update WNsePerPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NSE-PER-PE8090M
	 *	@param number
	 */
	public void setWNsePerPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNsePerPe8090m = checkWNsePerPe8090mMaxLimit(number); 
		serializeWNsePerPe8090m(wNsePerPe8090m);
	}


	public void setWNsePerPe8090m(long number) {
	    number = checkWNsePerPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNsePerPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIsePe8090m
	 *	@return wIsePe8090m
	 */
	public int getWIsePe8090m() throws CFException {
        if (isWIsePe8090mModified()) { 
           wIsePe8090m = refreshWIsePe8090m();
        }
   		return wIsePe8090m;
	}
	
	/**
	 * 	Update WIsePe8090m with the passed value
	 *  Corresponding COBOL Variable is W-ISE-PE8090M
	 *	@param number
	 */
	public void setWIsePe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIsePe8090m = checkWIsePe8090mMaxLimit(number); 
		serializeWIsePe8090m(wIsePe8090m);
	}


	public void setWIsePe8090m(long number) {
	    number = checkWIsePe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIsePe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wMasSepPe8090m
	 *	@return wMasSepPe8090m
	 */
   public char[] getWMasSepPe8090m() throws CFException{
     if (isWMasSepPe8090mModified()) { 
        wMasSepPe8090m = refreshWMasSepPe8090m();
     }
   		return wMasSepPe8090m;
   }

  
	/**
	*  set variable wMasSepPe8090m
	*  Corresponding COBOL Variable is W-MAS-SEP-PE8090M
	*  @param value
	**/
   public void setWMasSepPe8090m(char[] value) {
      wMasSepPe8090m = checkWMasSepPe8090mConstraints(value);
      serializeWMasSepPe8090m(wMasSepPe8090m);
   } 

     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWMasSepPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWMasSepPe8090m,wMasSepPe8090m.length);
   	
   }
   
   public void setWMasSepPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWMasSepPe8090m,wMasSepPe8090m.length);
   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMasSepPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WMasSepPe8090m with another Field
	 *	@param value
	 */
   public void setWMasSepPe8090m(Field source) {
       replace(source,0,source.length(),beginWMasSepPe8090m,W_MAS_SEP_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWMasSepPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWMasSepPe8090m,W_MAS_SEP_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WMasSepPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWMasSepPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWMasSepPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wTmaSepPe8090m
	 *	@return wTmaSepPe8090m
	 */
	public int getWTmaSepPe8090m() throws CFException {
        if (isWTmaSepPe8090mModified()) { 
           wTmaSepPe8090m = refreshWTmaSepPe8090m();
        }
   		return wTmaSepPe8090m;
	}
	
	/**
	 * 	Update WTmaSepPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TMA-SEP-PE8090M
	 *	@param number
	 */
	public void setWTmaSepPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTmaSepPe8090m = checkWTmaSepPe8090mMaxLimit(number); 
		serializeWTmaSepPe8090m(wTmaSepPe8090m);
	}


	public void setWTmaSepPe8090m(long number) {
	    number = checkWTmaSepPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTmaSepPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNmaSepPe8090m
	 *	@return wNmaSepPe8090m
	 */
	public int getWNmaSepPe8090m() throws CFException {
        if (isWNmaSepPe8090mModified()) { 
           wNmaSepPe8090m = refreshWNmaSepPe8090m();
        }
   		return wNmaSepPe8090m;
	}
	
	/**
	 * 	Update WNmaSepPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NMA-SEP-PE8090M
	 *	@param number
	 */
	public void setWNmaSepPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNmaSepPe8090m = checkWNmaSepPe8090mMaxLimit(number); 
		serializeWNmaSepPe8090m(wNmaSepPe8090m);
	}


	public void setWNmaSepPe8090m(long number) {
	    number = checkWNmaSepPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNmaSepPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wPerGruPe8090m
	 *	@return wPerGruPe8090m
	 */
	public int getWPerGruPe8090m() throws CFException {
        if (isWPerGruPe8090mModified()) { 
           wPerGruPe8090m = refreshWPerGruPe8090m();
        }
   		return wPerGruPe8090m;
	}
	
	/**
	 * 	Update WPerGruPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-PER-GRU-PE8090M
	 *	@param number
	 */
	public void setWPerGruPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wPerGruPe8090m = checkWPerGruPe8090mMaxLimit(number); 
		serializeWPerGruPe8090m(wPerGruPe8090m);
	}


	public void setWPerGruPe8090m(long number) {
	    number = checkWPerGruPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWPerGruPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wTpeNrePe8090m
	 *	@return wTpeNrePe8090m
	 */
	public int getWTpeNrePe8090m() throws CFException {
        if (isWTpeNrePe8090mModified()) { 
           wTpeNrePe8090m = refreshWTpeNrePe8090m();
        }
   		return wTpeNrePe8090m;
	}
	
	/**
	 * 	Update WTpeNrePe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TPE-NRE-PE8090M
	 *	@param number
	 */
	public void setWTpeNrePe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTpeNrePe8090m = checkWTpeNrePe8090mMaxLimit(number); 
		serializeWTpeNrePe8090m(wTpeNrePe8090m);
	}


	public void setWTpeNrePe8090m(long number) {
	    number = checkWTpeNrePe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTpeNrePe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNomNrePe8090m
	 *	@return wNomNrePe8090m
	 */
   public char[] getWNomNrePe8090m() throws CFException{
     if (isWNomNrePe8090mModified()) { 
        wNomNrePe8090m = refreshWNomNrePe8090m();
     }
   		return wNomNrePe8090m;
   }

  
	/**
	*  set variable wNomNrePe8090m
	*  Corresponding COBOL Variable is W-NOM-NRE-PE8090M
	*  @param value
	**/
   public void setWNomNrePe8090m(char[] value) {
      wNomNrePe8090m = checkWNomNrePe8090mConstraints(value);
      serializeWNomNrePe8090m(wNomNrePe8090m);
   } 

     /**
	 * 	Update WNomNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomNrePe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNomNrePe8090m,wNomNrePe8090m.length);
   	
   }
   
   public void setWNomNrePe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNomNrePe8090m,wNomNrePe8090m.length);
   	
   }
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomNrePe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNomNrePe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNomNrePe8090m with another Field
	 *	@param value
	 */
   public void setWNomNrePe8090m(Field source) {
       replace(source,0,source.length(),beginWNomNrePe8090m,W_NOM_NRE_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomNrePe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNomNrePe8090m,W_NOM_NRE_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNomNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomNrePe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNomNrePe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wPraNrePe8090m
	 *	@return wPraNrePe8090m
	 */
   public char[] getWPraNrePe8090m() throws CFException{
     if (isWPraNrePe8090mModified()) { 
        wPraNrePe8090m = refreshWPraNrePe8090m();
     }
   		return wPraNrePe8090m;
   }

  
	/**
	*  set variable wPraNrePe8090m
	*  Corresponding COBOL Variable is W-PRA-NRE-PE8090M
	*  @param value
	**/
   public void setWPraNrePe8090m(char[] value) {
      wPraNrePe8090m = checkWPraNrePe8090mConstraints(value);
      serializeWPraNrePe8090m(wPraNrePe8090m);
   } 

     /**
	 * 	Update WPraNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPraNrePe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPraNrePe8090m,wPraNrePe8090m.length);
   	
   }
   
   public void setWPraNrePe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPraNrePe8090m,wPraNrePe8090m.length);
   	
   }
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPraNrePe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPraNrePe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPraNrePe8090m with another Field
	 *	@param value
	 */
   public void setWPraNrePe8090m(Field source) {
       replace(source,0,source.length(),beginWPraNrePe8090m,W_PRA_NRE_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPraNrePe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPraNrePe8090m,W_PRA_NRE_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WPraNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPraNrePe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPraNrePe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wSeaNrePe8090m
	 *	@return wSeaNrePe8090m
	 */
   public char[] getWSeaNrePe8090m() throws CFException{
     if (isWSeaNrePe8090mModified()) { 
        wSeaNrePe8090m = refreshWSeaNrePe8090m();
     }
   		return wSeaNrePe8090m;
   }

  
	/**
	*  set variable wSeaNrePe8090m
	*  Corresponding COBOL Variable is W-SEA-NRE-PE8090M
	*  @param value
	**/
   public void setWSeaNrePe8090m(char[] value) {
      wSeaNrePe8090m = checkWSeaNrePe8090mConstraints(value);
      serializeWSeaNrePe8090m(wSeaNrePe8090m);
   } 

     /**
	 * 	Update WSeaNrePe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSeaNrePe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWSeaNrePe8090m,wSeaNrePe8090m.length);
   	
   }
   
   public void setWSeaNrePe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWSeaNrePe8090m,wSeaNrePe8090m.length);
   	
   }
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSeaNrePe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSeaNrePe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WSeaNrePe8090m with another Field
	 *	@param value
	 */
   public void setWSeaNrePe8090m(Field source) {
       replace(source,0,source.length(),beginWSeaNrePe8090m,W_SEA_NRE_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSeaNrePe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWSeaNrePe8090m,W_SEA_NRE_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WSeaNrePe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSeaNrePe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSeaNrePe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wCpeNomPe8090m
	 *	@return wCpeNomPe8090m
	 */
	public int getWCpeNomPe8090m() throws CFException {
        if (isWCpeNomPe8090mModified()) { 
           wCpeNomPe8090m = refreshWCpeNomPe8090m();
        }
   		return wCpeNomPe8090m;
	}
	
	/**
	 * 	Update WCpeNomPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CPE-NOM-PE8090M
	 *	@param number
	 */
	public void setWCpeNomPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCpeNomPe8090m = checkWCpeNomPe8090mMaxLimit(number); 
		serializeWCpeNomPe8090m(wCpeNomPe8090m);
	}


	public void setWCpeNomPe8090m(long number) {
	    number = checkWCpeNomPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCpeNomPe8090m((int)number);
	}
	

	
	
	
	/**
	 * 	initializes WElpPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWTipPe8090m(0);
                     setWIeqPe8090m(0);
         setWNomPe8090m(CONSTANTS.SPACE_62);
                     setWNcaNomPe8090m(0);
         setWNo1Pe8090m(CONSTANTS.SPACE_40);
                     setWNcaNo1Pe8090m(0);
         setWNo2Pe8090m(CONSTANTS.SPACE_24);
                     setWNcaNo2Pe8090m(0);
                     setWNsePerPe8090m(0);
                     setWIsePe8090m(0);
         setWMasSepPe8090m(CONSTANTS.SPACE_18);
                     setWTmaSepPe8090m(0);
                     setWNmaSepPe8090m(0);
                     setWPerGruPe8090m(0);
                     setWTpeNrePe8090m(0);
         setWNomNrePe8090m(CONSTANTS.SPACE_20);
         setWPraNrePe8090m(CONSTANTS.SPACE_20);
         setWSeaNrePe8090m(CONSTANTS.SPACE_20);
                     setWCpeNomPe8090m(0);
   }

		public static int getWElpPe8090mFieldLength() {
			return W_ELP_PE_8090M_LENGTH;
		}

}
  
