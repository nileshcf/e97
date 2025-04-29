package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcStartDateR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcStartDateR extends CmnDateCalcStartDateRSerialized { 
   

								private int cmnDateCalcStartMm;

						private char[] cmnDateCalcStartSep1 = Field.fillLowValue(1);

								private int cmnDateCalcStartDd;

						private char[] cmnDateCalcStartSep2 = Field.fillLowValue(1);
				private CmnDateCalcStartYyyy cmnDateCalcStartYyyy = new CmnDateCalcStartYyyy();
	
	/**
	* Constructor for CmnDateCalcStartDateR
	**/
    public CmnDateCalcStartDateR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcStartDateR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcStartDateR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcStartYyyy.setParent(this,getStartOffset() + 6);
    } 

	/**
	 *	Returns the value of cmnDateCalcStartMm
	 *	@return cmnDateCalcStartMm
	 */
	public int getCmnDateCalcStartMm() throws CFException {
       if (isCmnDateCalcStartMmModified()) { 
           cmnDateCalcStartMm = refreshCmnDateCalcStartMm();
        }
   		return cmnDateCalcStartMm;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcStartMm with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-START-MM
	 *	@param number
	 */
	public void setCmnDateCalcStartMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcStartMm = checkCmnDateCalcStartMmMaxLimit(number); 
		serializeCmnDateCalcStartMm(cmnDateCalcStartMm);
	}
	

	public void setCmnDateCalcStartMm(long number) {
	    number = checkCmnDateCalcStartMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcStartMm((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcStartMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartMm(char[] value) throws CFException {
		 cmnDateCalcStartMm = serializeCmnDateCalcStartMm(value);
	}
	/**
	 * 	Update CmnDateCalcStartMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartMmString(char[] value) throws CFException {
		 setCmnDateCalcStartMm(value);
	}
	/**
	 *	Returns the value of cmnDateCalcStartSep1
	 *	@return cmnDateCalcStartSep1
	 */
   public char[] getCmnDateCalcStartSep1() throws CFException{
     if (isCmnDateCalcStartSep1Modified()) { 
        cmnDateCalcStartSep1 = refreshCmnDateCalcStartSep1();
     }
   		return cmnDateCalcStartSep1;
   }

  
	/**
	*  set variable cmnDateCalcStartSep1
	*  Corresponding COBOL Variable is CMN-DATE-CALC-START-SEP-1
	*  @param value
	**/
   public void setCmnDateCalcStartSep1(char[] value) {
      cmnDateCalcStartSep1 = checkCmnDateCalcStartSep1Constraints(value);
      serializeCmnDateCalcStartSep1(cmnDateCalcStartSep1);
   } 

     /**
	 * 	Update CmnDateCalcStartSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcStartSep1,cmnDateCalcStartSep1.length);
   	
   }
   
   public void setCmnDateCalcStartSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep1,cmnDateCalcStartSep1.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcStartSep1 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartSep1(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcStartSep1,CMN_DATE_CALC_START_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcStartSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcStartSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep1,CMN_DATE_CALC_START_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcStartDd
	 *	@return cmnDateCalcStartDd
	 */
	public int getCmnDateCalcStartDd() throws CFException {
       if (isCmnDateCalcStartDdModified()) { 
           cmnDateCalcStartDd = refreshCmnDateCalcStartDd();
        }
   		return cmnDateCalcStartDd;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcStartDd with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-START-DD
	 *	@param number
	 */
	public void setCmnDateCalcStartDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcStartDd = checkCmnDateCalcStartDdMaxLimit(number); 
		serializeCmnDateCalcStartDd(cmnDateCalcStartDd);
	}
	

	public void setCmnDateCalcStartDd(long number) {
	    number = checkCmnDateCalcStartDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcStartDd((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcStartDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartDd(char[] value) throws CFException {
		 cmnDateCalcStartDd = serializeCmnDateCalcStartDd(value);
	}
	/**
	 * 	Update CmnDateCalcStartDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcStartDdString(char[] value) throws CFException {
		 setCmnDateCalcStartDd(value);
	}
	/**
	 *	Returns the value of cmnDateCalcStartSep2
	 *	@return cmnDateCalcStartSep2
	 */
   public char[] getCmnDateCalcStartSep2() throws CFException{
     if (isCmnDateCalcStartSep2Modified()) { 
        cmnDateCalcStartSep2 = refreshCmnDateCalcStartSep2();
     }
   		return cmnDateCalcStartSep2;
   }

  
	/**
	*  set variable cmnDateCalcStartSep2
	*  Corresponding COBOL Variable is CMN-DATE-CALC-START-SEP-2
	*  @param value
	**/
   public void setCmnDateCalcStartSep2(char[] value) {
      cmnDateCalcStartSep2 = checkCmnDateCalcStartSep2Constraints(value);
      serializeCmnDateCalcStartSep2(cmnDateCalcStartSep2);
   } 

     /**
	 * 	Update CmnDateCalcStartSep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartSep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcStartSep2,cmnDateCalcStartSep2.length);
   	
   }
   
   public void setCmnDateCalcStartSep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep2,cmnDateCalcStartSep2.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartSep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartSep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcStartSep2 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartSep2(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcStartSep2,CMN_DATE_CALC_START_SEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcStartSep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcStartSep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep2,CMN_DATE_CALC_START_SEP_2_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcStartSep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartSep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcStartSep2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcStartYyyy
	 *	@return cmnDateCalcStartYyyy
	 */   
	 public CmnDateCalcStartYyyy getCmnDateCalcStartYyyy() {
   	return cmnDateCalcStartYyyy;
   }
   /**
	* 	Update CmnDateCalcStartYyyy with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-START-YYYY
	*	@param value
	*/
   public void setCmnDateCalcStartYyyy(char[] value) {
      cmnDateCalcStartYyyy.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcStartYyyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartYyyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartYyyy.begin,cmnDateCalcStartYyyy.length());
   }
   
     /**
	 * 	Update CmnDateCalcStartYyyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartYyyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcStartYyyy with another Field
	 *	@param value
	 */
   public void setCmnDateCalcStartYyyy(Field source) {
   	replace(source,0,source.length(),cmnDateCalcStartYyyy.begin,cmnDateCalcStartYyyy.length());
   }  
   
     /**
	 * 	Update CmnDateCalcStartYyyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcStartYyyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartYyyy.begin,cmnDateCalcStartYyyy.length());
   }
   
     /**
	 * 	Update CmnDateCalcStartYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcStartYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcStartYyyy.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcStartDateRFieldLength() {
			return CMN_DATE_CALC_START_DATE_R_LENGTH;
		}

}
  
