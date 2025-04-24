package com.cloudframe.app.init1.dto;

/**
*  The class CmnDateCalcNewDateCalcR is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnDateCalcNewDateCalcR extends CmnDateCalcNewDateCalcRSerialized { 
   

								private int cmnDateCalcNewDateMm;

						private char[] cmnDateCalcNewDateSep1 = Field.fillLowValue(1);

								private int cmnDateCalcNewDateDd;

						private char[] cmnDateCalcNewDateSep2 = Field.fillLowValue(1);
				private CmnDateCalcNewDateYyyy cmnDateCalcNewDateYyyy = new CmnDateCalcNewDateYyyy();
	
	/**
	* Constructor for CmnDateCalcNewDateCalcR
	**/
    public CmnDateCalcNewDateCalcR() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnDateCalcNewDateCalcR. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcNewDateCalcR(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnDateCalcNewDateYyyy.setParent(this,getStartOffset() + 6);
    } 

	/**
	 *	Returns the value of cmnDateCalcNewDateMm
	 *	@return cmnDateCalcNewDateMm
	 */
	public int getCmnDateCalcNewDateMm() throws CFException {
       if (isCmnDateCalcNewDateMmModified()) { 
           cmnDateCalcNewDateMm = refreshCmnDateCalcNewDateMm();
        }
   		return cmnDateCalcNewDateMm;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcNewDateMm with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-MM
	 *	@param number
	 */
	public void setCmnDateCalcNewDateMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNewDateMm = checkCmnDateCalcNewDateMmMaxLimit(number); 
		serializeCmnDateCalcNewDateMm(cmnDateCalcNewDateMm);
	}
	

	public void setCmnDateCalcNewDateMm(long number) {
	    number = checkCmnDateCalcNewDateMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNewDateMm((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcNewDateMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateMm(char[] value) throws CFException {
		 cmnDateCalcNewDateMm = serializeCmnDateCalcNewDateMm(value);
	}
	/**
	 * 	Update CmnDateCalcNewDateMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateMmString(char[] value) throws CFException {
		 setCmnDateCalcNewDateMm(value);
	}
	/**
	 *	Returns the value of cmnDateCalcNewDateSep1
	 *	@return cmnDateCalcNewDateSep1
	 */
   public char[] getCmnDateCalcNewDateSep1() throws CFException{
     if (isCmnDateCalcNewDateSep1Modified()) { 
        cmnDateCalcNewDateSep1 = refreshCmnDateCalcNewDateSep1();
     }
   		return cmnDateCalcNewDateSep1;
   }

  
	/**
	*  set variable cmnDateCalcNewDateSep1
	*  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-SEP1
	*  @param value
	**/
   public void setCmnDateCalcNewDateSep1(char[] value) {
      cmnDateCalcNewDateSep1 = checkCmnDateCalcNewDateSep1Constraints(value);
      serializeCmnDateCalcNewDateSep1(cmnDateCalcNewDateSep1);
   } 

     /**
	 * 	Update CmnDateCalcNewDateSep1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcNewDateSep1,cmnDateCalcNewDateSep1.length);
   	
   }
   
   public void setCmnDateCalcNewDateSep1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep1,cmnDateCalcNewDateSep1.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateSep1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcNewDateSep1 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep1(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcNewDateSep1,CMN_DATE_CALC_NEW_DATE_SEP_1_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateSep1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep1,CMN_DATE_CALC_NEW_DATE_SEP_1_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateSep1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcNewDateDd
	 *	@return cmnDateCalcNewDateDd
	 */
	public int getCmnDateCalcNewDateDd() throws CFException {
       if (isCmnDateCalcNewDateDdModified()) { 
           cmnDateCalcNewDateDd = refreshCmnDateCalcNewDateDd();
        }
   		return cmnDateCalcNewDateDd;
	}
	

	
	   
	/**
	 * 	Update CmnDateCalcNewDateDd with the passed value
	 *  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-DD
	 *	@param number
	 */
	public void setCmnDateCalcNewDateDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnDateCalcNewDateDd = checkCmnDateCalcNewDateDdMaxLimit(number); 
		serializeCmnDateCalcNewDateDd(cmnDateCalcNewDateDd);
	}
	

	public void setCmnDateCalcNewDateDd(long number) {
	    number = checkCmnDateCalcNewDateDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnDateCalcNewDateDd((int)number);
	}
	
	/**
	 * 	Update CmnDateCalcNewDateDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateDd(char[] value) throws CFException {
		 cmnDateCalcNewDateDd = serializeCmnDateCalcNewDateDd(value);
	}
	/**
	 * 	Update CmnDateCalcNewDateDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnDateCalcNewDateDdString(char[] value) throws CFException {
		 setCmnDateCalcNewDateDd(value);
	}
	/**
	 *	Returns the value of cmnDateCalcNewDateSep2
	 *	@return cmnDateCalcNewDateSep2
	 */
   public char[] getCmnDateCalcNewDateSep2() throws CFException{
     if (isCmnDateCalcNewDateSep2Modified()) { 
        cmnDateCalcNewDateSep2 = refreshCmnDateCalcNewDateSep2();
     }
   		return cmnDateCalcNewDateSep2;
   }

  
	/**
	*  set variable cmnDateCalcNewDateSep2
	*  Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-SEP2
	*  @param value
	**/
   public void setCmnDateCalcNewDateSep2(char[] value) {
      cmnDateCalcNewDateSep2 = checkCmnDateCalcNewDateSep2Constraints(value);
      serializeCmnDateCalcNewDateSep2(cmnDateCalcNewDateSep2);
   } 

     /**
	 * 	Update CmnDateCalcNewDateSep2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnDateCalcNewDateSep2,cmnDateCalcNewDateSep2.length);
   	
   }
   
   public void setCmnDateCalcNewDateSep2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep2,cmnDateCalcNewDateSep2.length);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateSep2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnDateCalcNewDateSep2 with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep2(Field source) {
       replace(source,0,source.length(),beginCmnDateCalcNewDateSep2,CMN_DATE_CALC_NEW_DATE_SEP_2_LEN);
   	
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateSep2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep2,CMN_DATE_CALC_NEW_DATE_SEP_2_LEN);
   	
   }
   
     /**
	 * 	Update CmnDateCalcNewDateSep2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateSep2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnDateCalcNewDateSep2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnDateCalcNewDateYyyy
	 *	@return cmnDateCalcNewDateYyyy
	 */   
	 public CmnDateCalcNewDateYyyy getCmnDateCalcNewDateYyyy() {
   	return cmnDateCalcNewDateYyyy;
   }
   /**
	* 	Update CmnDateCalcNewDateYyyy with the passed value
	*   Corresponding COBOL Variable is CMN-DATE-CALC-NEW-DATE-YYYY
	*	@param value
	*/
   public void setCmnDateCalcNewDateYyyy(char[] value) {
      cmnDateCalcNewDateYyyy.setString(value); 
   }   
    
     /**
	 * 	Update CmnDateCalcNewDateYyyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateYyyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateYyyy.begin,cmnDateCalcNewDateYyyy.length());
   }
   
     /**
	 * 	Update CmnDateCalcNewDateYyyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateYyyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnDateCalcNewDateYyyy with another Field
	 *	@param value
	 */
   public void setCmnDateCalcNewDateYyyy(Field source) {
   	replace(source,0,source.length(),cmnDateCalcNewDateYyyy.begin,cmnDateCalcNewDateYyyy.length());
   }  
   
     /**
	 * 	Update CmnDateCalcNewDateYyyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnDateCalcNewDateYyyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateYyyy.begin,cmnDateCalcNewDateYyyy.length());
   }
   
     /**
	 * 	Update CmnDateCalcNewDateYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnDateCalcNewDateYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnDateCalcNewDateYyyy.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnDateCalcNewDateCalcRFieldLength() {
			return CMN_DATE_CALC_NEW_DATE_CALC_R_LENGTH;
		}

}
  
