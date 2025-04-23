package com.cloudframe.app.bm8090m.dto;

/**
*  The class WZonAlmPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class WZonAlmPe8090m extends WZonAlmPe8090mSerialized { 
   

								private int wTipAlmPe8090m;

								private int wIeqAlmPe8090m;

						private char[] wNomAlmPe8090m = Field.fillLowValue(60);

								private int wNcnAlmPe8090m;

						private char[] wNo1AlmPe8090m = Field.fillLowValue(40);

								private int wNc1AlmPe8090m;

						private char[] wNo2AlmPe8090m = Field.fillLowValue(24);

								private int wNc2AlmPe8090m;

						private char[] wNreAlmPe8090m = Field.fillLowValue(20);

						private char[] wPraAlmPe8090m = Field.fillLowValue(20);

						private char[] wSeaAlmPe8090m = Field.fillLowValue(20);

								private int wCpeAlmPe8090m;
	
	/**
	* Constructor for WZonAlmPe8090m
	**/
    public WZonAlmPe8090m() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WZonAlmPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WZonAlmPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wTipAlmPe8090m
	 *	@return wTipAlmPe8090m
	 */
	public int getWTipAlmPe8090m() throws CFException {
        if (isWTipAlmPe8090mModified()) { 
           wTipAlmPe8090m = refreshWTipAlmPe8090m();
        }
   		return wTipAlmPe8090m;
	}
	
	/**
	 * 	Update WTipAlmPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-TIP-ALM-PE8090M
	 *	@param number
	 */
	public void setWTipAlmPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wTipAlmPe8090m = checkWTipAlmPe8090mMaxLimit(number); 
		serializeWTipAlmPe8090m(wTipAlmPe8090m);
	}


	public void setWTipAlmPe8090m(long number) {
	    number = checkWTipAlmPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWTipAlmPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wIeqAlmPe8090m
	 *	@return wIeqAlmPe8090m
	 */
	public int getWIeqAlmPe8090m() throws CFException {
        if (isWIeqAlmPe8090mModified()) { 
           wIeqAlmPe8090m = refreshWIeqAlmPe8090m();
        }
   		return wIeqAlmPe8090m;
	}
	
	/**
	 * 	Update WIeqAlmPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-IEQ-ALM-PE8090M
	 *	@param number
	 */
	public void setWIeqAlmPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wIeqAlmPe8090m = checkWIeqAlmPe8090mMaxLimit(number); 
		serializeWIeqAlmPe8090m(wIeqAlmPe8090m);
	}


	public void setWIeqAlmPe8090m(long number) {
	    number = checkWIeqAlmPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWIeqAlmPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNomAlmPe8090m
	 *	@return wNomAlmPe8090m
	 */
   public char[] getWNomAlmPe8090m() throws CFException{
     if (isWNomAlmPe8090mModified()) { 
        wNomAlmPe8090m = refreshWNomAlmPe8090m();
     }
   		return wNomAlmPe8090m;
   }

  
	/**
	*  set variable wNomAlmPe8090m
	*  Corresponding COBOL Variable is W-NOM-ALM-PE8090M
	*  @param value
	**/
   public void setWNomAlmPe8090m(char[] value) {
      wNomAlmPe8090m = checkWNomAlmPe8090mConstraints(value);
      serializeWNomAlmPe8090m(wNomAlmPe8090m);
   } 

     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNomAlmPe8090m,wNomAlmPe8090m.length);
   	
   }
   
   public void setWNomAlmPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNomAlmPe8090m,wNomAlmPe8090m.length);
   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNomAlmPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNomAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source) {
       replace(source,0,source.length(),beginWNomAlmPe8090m,W_NOM_ALM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNomAlmPe8090m,W_NOM_ALM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNomAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNomAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNomAlmPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNcnAlmPe8090m
	 *	@return wNcnAlmPe8090m
	 */
	public int getWNcnAlmPe8090m() throws CFException {
        if (isWNcnAlmPe8090mModified()) { 
           wNcnAlmPe8090m = refreshWNcnAlmPe8090m();
        }
   		return wNcnAlmPe8090m;
	}
	
	/**
	 * 	Update WNcnAlmPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NCN-ALM-PE8090M
	 *	@param number
	 */
	public void setWNcnAlmPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNcnAlmPe8090m = checkWNcnAlmPe8090mMaxLimit(number); 
		serializeWNcnAlmPe8090m(wNcnAlmPe8090m);
	}


	public void setWNcnAlmPe8090m(long number) {
	    number = checkWNcnAlmPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNcnAlmPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNo1AlmPe8090m
	 *	@return wNo1AlmPe8090m
	 */
   public char[] getWNo1AlmPe8090m() throws CFException{
     if (isWNo1AlmPe8090mModified()) { 
        wNo1AlmPe8090m = refreshWNo1AlmPe8090m();
     }
   		return wNo1AlmPe8090m;
   }

  
	/**
	*  set variable wNo1AlmPe8090m
	*  Corresponding COBOL Variable is W-NO1-ALM-PE8090M
	*  @param value
	**/
   public void setWNo1AlmPe8090m(char[] value) {
      wNo1AlmPe8090m = checkWNo1AlmPe8090mConstraints(value);
      serializeWNo1AlmPe8090m(wNo1AlmPe8090m);
   } 

     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNo1AlmPe8090m,wNo1AlmPe8090m.length);
   	
   }
   
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNo1AlmPe8090m,wNo1AlmPe8090m.length);
   	
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo1AlmPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNo1AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source) {
       replace(source,0,source.length(),beginWNo1AlmPe8090m,W_NO_1_ALM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNo1AlmPe8090m,W_NO_1_ALM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNo1AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo1AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo1AlmPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNc1AlmPe8090m
	 *	@return wNc1AlmPe8090m
	 */
	public int getWNc1AlmPe8090m() throws CFException {
        if (isWNc1AlmPe8090mModified()) { 
           wNc1AlmPe8090m = refreshWNc1AlmPe8090m();
        }
   		return wNc1AlmPe8090m;
	}
	
	/**
	 * 	Update WNc1AlmPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NC1-ALM-PE8090M
	 *	@param number
	 */
	public void setWNc1AlmPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNc1AlmPe8090m = checkWNc1AlmPe8090mMaxLimit(number); 
		serializeWNc1AlmPe8090m(wNc1AlmPe8090m);
	}


	public void setWNc1AlmPe8090m(long number) {
	    number = checkWNc1AlmPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNc1AlmPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNo2AlmPe8090m
	 *	@return wNo2AlmPe8090m
	 */
   public char[] getWNo2AlmPe8090m() throws CFException{
     if (isWNo2AlmPe8090mModified()) { 
        wNo2AlmPe8090m = refreshWNo2AlmPe8090m();
     }
   		return wNo2AlmPe8090m;
   }

  
	/**
	*  set variable wNo2AlmPe8090m
	*  Corresponding COBOL Variable is W-NO2-ALM-PE8090M
	*  @param value
	**/
   public void setWNo2AlmPe8090m(char[] value) {
      wNo2AlmPe8090m = checkWNo2AlmPe8090mConstraints(value);
      serializeWNo2AlmPe8090m(wNo2AlmPe8090m);
   } 

     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNo2AlmPe8090m,wNo2AlmPe8090m.length);
   	
   }
   
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNo2AlmPe8090m,wNo2AlmPe8090m.length);
   	
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo2AlmPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNo2AlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source) {
       replace(source,0,source.length(),beginWNo2AlmPe8090m,W_NO_2_ALM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNo2AlmPe8090m,W_NO_2_ALM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNo2AlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNo2AlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNo2AlmPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wNc2AlmPe8090m
	 *	@return wNc2AlmPe8090m
	 */
	public int getWNc2AlmPe8090m() throws CFException {
        if (isWNc2AlmPe8090mModified()) { 
           wNc2AlmPe8090m = refreshWNc2AlmPe8090m();
        }
   		return wNc2AlmPe8090m;
	}
	
	/**
	 * 	Update WNc2AlmPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-NC2-ALM-PE8090M
	 *	@param number
	 */
	public void setWNc2AlmPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wNc2AlmPe8090m = checkWNc2AlmPe8090mMaxLimit(number); 
		serializeWNc2AlmPe8090m(wNc2AlmPe8090m);
	}


	public void setWNc2AlmPe8090m(long number) {
	    number = checkWNc2AlmPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWNc2AlmPe8090m((int)number);
	}
	
	/**
	 *	Returns the value of wNreAlmPe8090m
	 *	@return wNreAlmPe8090m
	 */
   public char[] getWNreAlmPe8090m() throws CFException{
     if (isWNreAlmPe8090mModified()) { 
        wNreAlmPe8090m = refreshWNreAlmPe8090m();
     }
   		return wNreAlmPe8090m;
   }

  
	/**
	*  set variable wNreAlmPe8090m
	*  Corresponding COBOL Variable is W-NRE-ALM-PE8090M
	*  @param value
	**/
   public void setWNreAlmPe8090m(char[] value) {
      wNreAlmPe8090m = checkWNreAlmPe8090mConstraints(value);
      serializeWNreAlmPe8090m(wNreAlmPe8090m);
   } 

     /**
	 * 	Update WNreAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWNreAlmPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWNreAlmPe8090m,wNreAlmPe8090m.length);
   	
   }
   
   public void setWNreAlmPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWNreAlmPe8090m,wNreAlmPe8090m.length);
   	
   }
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWNreAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNreAlmPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WNreAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source) {
       replace(source,0,source.length(),beginWNreAlmPe8090m,W_NRE_ALM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWNreAlmPe8090m,W_NRE_ALM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WNreAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWNreAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWNreAlmPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wPraAlmPe8090m
	 *	@return wPraAlmPe8090m
	 */
   public char[] getWPraAlmPe8090m() throws CFException{
     if (isWPraAlmPe8090mModified()) { 
        wPraAlmPe8090m = refreshWPraAlmPe8090m();
     }
   		return wPraAlmPe8090m;
   }

  
	/**
	*  set variable wPraAlmPe8090m
	*  Corresponding COBOL Variable is W-PRA-ALM-PE8090M
	*  @param value
	**/
   public void setWPraAlmPe8090m(char[] value) {
      wPraAlmPe8090m = checkWPraAlmPe8090mConstraints(value);
      serializeWPraAlmPe8090m(wPraAlmPe8090m);
   } 

     /**
	 * 	Update WPraAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWPraAlmPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWPraAlmPe8090m,wPraAlmPe8090m.length);
   	
   }
   
   public void setWPraAlmPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWPraAlmPe8090m,wPraAlmPe8090m.length);
   	
   }
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWPraAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPraAlmPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WPraAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source) {
       replace(source,0,source.length(),beginWPraAlmPe8090m,W_PRA_ALM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWPraAlmPe8090m,W_PRA_ALM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WPraAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWPraAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWPraAlmPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wSeaAlmPe8090m
	 *	@return wSeaAlmPe8090m
	 */
   public char[] getWSeaAlmPe8090m() throws CFException{
     if (isWSeaAlmPe8090mModified()) { 
        wSeaAlmPe8090m = refreshWSeaAlmPe8090m();
     }
   		return wSeaAlmPe8090m;
   }

  
	/**
	*  set variable wSeaAlmPe8090m
	*  Corresponding COBOL Variable is W-SEA-ALM-PE8090M
	*  @param value
	**/
   public void setWSeaAlmPe8090m(char[] value) {
      wSeaAlmPe8090m = checkWSeaAlmPe8090mConstraints(value);
      serializeWSeaAlmPe8090m(wSeaAlmPe8090m);
   } 

     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWSeaAlmPe8090m,wSeaAlmPe8090m.length);
   	
   }
   
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWSeaAlmPe8090m,wSeaAlmPe8090m.length);
   	
   }
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSeaAlmPe8090m+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WSeaAlmPe8090m with another Field
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source) {
       replace(source,0,source.length(),beginWSeaAlmPe8090m,W_SEA_ALM_PE_8090M_LEN);
   	
   }  
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWSeaAlmPe8090m,W_SEA_ALM_PE_8090M_LEN);
   	
   }
   
     /**
	 * 	Update WSeaAlmPe8090m 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWSeaAlmPe8090m(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWSeaAlmPe8090m+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wCpeAlmPe8090m
	 *	@return wCpeAlmPe8090m
	 */
	public int getWCpeAlmPe8090m() throws CFException {
        if (isWCpeAlmPe8090mModified()) { 
           wCpeAlmPe8090m = refreshWCpeAlmPe8090m();
        }
   		return wCpeAlmPe8090m;
	}
	
	/**
	 * 	Update WCpeAlmPe8090m with the passed value
	 *  Corresponding COBOL Variable is W-CPE-ALM-PE8090M
	 *	@param number
	 */
	public void setWCpeAlmPe8090m(int number) {
	     // Truncate if the number is beyond +/- Max range
	    wCpeAlmPe8090m = checkWCpeAlmPe8090mMaxLimit(number); 
		serializeWCpeAlmPe8090m(wCpeAlmPe8090m);
	}


	public void setWCpeAlmPe8090m(long number) {
	    number = checkWCpeAlmPe8090mMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWCpeAlmPe8090m((int)number);
	}
	

	
	
	
	/**
	 * 	initializes WZonAlmPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWTipAlmPe8090m(0);
                     setWIeqAlmPe8090m(0);
         setWNomAlmPe8090m(CONSTANTS.SPACE_60);
                     setWNcnAlmPe8090m(0);
         setWNo1AlmPe8090m(CONSTANTS.SPACE_40);
                     setWNc1AlmPe8090m(0);
         setWNo2AlmPe8090m(CONSTANTS.SPACE_24);
                     setWNc2AlmPe8090m(0);
         setWNreAlmPe8090m(CONSTANTS.SPACE_20);
         setWPraAlmPe8090m(CONSTANTS.SPACE_20);
         setWSeaAlmPe8090m(CONSTANTS.SPACE_20);
                     setWCpeAlmPe8090m(0);
   }

		public static int getWZonAlmPe8090mFieldLength() {
			return W_ZON_ALM_PE_8090M_LENGTH;
		}

}
  
