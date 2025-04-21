package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcEndDateR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcEndDateR extends CmnDateCalcEndDateRSerialized { 
   

								private int cmnDateCalcEndMm;

						private char[] cmnDateCalcEndSep1 = Field.fillLowValue(1);

								private int cmnDateCalcEndDd;

						private char[] cmnDateCalcEndSep2 = Field.fillLowValue(1);
				private CmnDateCalcEndYyyy cmnDateCalcEndYyyy = new CmnDateCalcEndYyyy();
	
	/**
	* Constructor for CmnDateCalcEndDateR
	**/
    public CmnDateCalcEndDateR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcEndDateR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcEndDateR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcEndYyyy.setParent(this,getStartOffset() + 6);
    } 

	/**
	 *	Returns the value of cmnDateCalcEndMm
	 *	@return cmnDateCalcEndMm
	 */
	public int getCmnDateCalcEndMm() throws CFException {
       if (isCmnDateCalcEndMmModified()) { 
           cmnDateCalcEndMm = refreshCmnDateCalcEndMm();
        }
   		return cmnDateCalcEndMm;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcEndMm with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-END-MM
	 *	@param number
	 */
	public void setCmnDateCalcEndMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcEndMm = checkCmnDateCalcEndMmMaxLimit(number); 
		serializeCmnDateCalcEndMm(cmnDateCalcEndMm);
	}
	

	public void setCmnDateCalcEndMm(long number) {
	    number = checkCmnDateCalcEndMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcEndMm((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcEndMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndMm(char[] value) throws CFException {
		 cmnDateCalcEndMm = serializeCmnDateCalcEndMm(value);
	}
	/**
	 * 	Update CmnDateCalcEndMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndMmString(char[] value) throws CFException {
		 setCmnDateCalcEndMm(value);
	}
	/**
	 *	Returns the value of cmnDateCalcEndSep1
	 *	@return cmnDateCalcEndSep1
	 */
   public char[] getCmnDateCalcEndSep1() throws CFException{
     if (isCmnDateCalcEndSep1Modified()) { 
        cmnDateCalcEndSep1 = refreshCmnDateCalcEndSep1();
     }
   		return cmnDateCalcEndSep1;
   }

  
	/**
	*  set variable cmnDateCalcEndSep1
	*  Corresponding COBOL Variable is CMN-DATE-CALC-END-SEP-1
	*  @param value
	**/
   public void setCmnDateCalcEndSep1(char[] value) {
      cmnDateCalcEndSep1 = checkCmnDateCalcEndSep1Constraints(value);
      serializeCmnDateCalcEndSep1(cmnDateCalcEndSep1);
   } 

     /**
	 * 	Update CmnDateCalcEndSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcEndSep1,cmnDateCalcEndSep1.length);
   	
   }
   
   public void setCmnDateCalcEndSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep1,cmnDateCalcEndSep1.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcEndSep1 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndSep1(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcEndSep1,CMN_DATE_CALC_END_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcEndSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcEndSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep1,CMN_DATE_CALC_END_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcEndDd
	 *	@return cmnDateCalcEndDd
	 */
	public int getCmnDateCalcEndDd() throws CFException {
       if (isCmnDateCalcEndDdModified()) { 
           cmnDateCalcEndDd = refreshCmnDateCalcEndDd();
        }
   		return cmnDateCalcEndDd;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcEndDd with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-END-DD
	 *	@param number
	 */
	public void setCmnDateCalcEndDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcEndDd = checkCmnDateCalcEndDdMaxLimit(number); 
		serializeCmnDateCalcEndDd(cmnDateCalcEndDd);
	}
	

	public void setCmnDateCalcEndDd(long number) {
	    number = checkCmnDateCalcEndDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcEndDd((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcEndDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndDd(char[] value) throws CFException {
		 cmnDateCalcEndDd = serializeCmnDateCalcEndDd(value);
	}
	/**
	 * 	Update CmnDateCalcEndDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcEndDdString(char[] value) throws CFException {
		 setCmnDateCalcEndDd(value);
	}
	/**
	 *	Returns the value of cmnDateCalcEndSep2
	 *	@return cmnDateCalcEndSep2
	 */
   public char[] getCmnDateCalcEndSep2() throws CFException{
     if (isCmnDateCalcEndSep2Modified()) { 
        cmnDateCalcEndSep2 = refreshCmnDateCalcEndSep2();
     }
   		return cmnDateCalcEndSep2;
   }

  
	/**
	*  set variable cmnDateCalcEndSep2
	*  Corresponding COBOL Variable is CMN-DATE-CALC-END-SEP-2
	*  @param value
	**/
   public void setCmnDateCalcEndSep2(char[] value) {
      cmnDateCalcEndSep2 = checkCmnDateCalcEndSep2Constraints(value);
      serializeCmnDateCalcEndSep2(cmnDateCalcEndSep2);
   } 

     /**
	 * 	Update CmnDateCalcEndSep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndSep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcEndSep2,cmnDateCalcEndSep2.length);
   	
   }
   
   public void setCmnDateCalcEndSep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep2,cmnDateCalcEndSep2.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndSep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndSep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcEndSep2 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndSep2(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcEndSep2,CMN_DATE_CALC_END_SEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcEndSep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcEndSep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep2,CMN_DATE_CALC_END_SEP_2_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcEndSep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndSep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcEndSep2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcEndYyyy
	 *	@return cmnDateCalcEndYyyy
	 */   
	 public CmnDateCalcEndYyyy getCmnDateCalcEndYyyy() {
   	return cmnDateCalcEndYyyy;
   }
   /**
	* 	Update CmnDateCalcEndYyyy with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-END-YYYY
	*	@param value
	*/
   public void setCmnDateCalcEndYyyy(char[] value) {
      cmnDateCalcEndYyyy.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcEndYyyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndYyyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndYyyy.begin,cmnDateCalcEndYyyy.length());
   }
   
     /**
	 * 	Update CmnDateCalcEndYyyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndYyyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcEndYyyy with another Field
	 *	@param value
	 */
   public void setCmnDateCalcEndYyyy(Field source) {
   	replace(source,0,source.length(),cmnDateCalcEndYyyy.begin,cmnDateCalcEndYyyy.length());
   }  
   
     /**
	 * 	Update CmnDateCalcEndYyyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcEndYyyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndYyyy.begin,cmnDateCalcEndYyyy.length());
   }
   
     /**
	 * 	Update CmnDateCalcEndYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcEndYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcEndYyyy.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcEndDateRFieldLength() {
			return CMN_DATE_CALC_END_DATE_R_LENGTH;
		}

}
  
