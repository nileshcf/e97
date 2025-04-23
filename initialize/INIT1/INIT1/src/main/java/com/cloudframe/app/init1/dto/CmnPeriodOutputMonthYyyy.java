package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputMonthYyyy is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPeriodOutputMonthYyyy extends CmnPeriodOutputMonthYyyySerialized { 
   

						private char[] cmnPeriodOutputMoLit = Field.fillLowValue(9);

								private int cmnPeriodOutputYear;
	
	/**
	* Constructor for CmnPeriodOutputMonthYyyy
	**/
    public CmnPeriodOutputMonthYyyy() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPeriodOutputMonthYyyy. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputMonthYyyy(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of cmnPeriodOutputMoLit
	 *	@return cmnPeriodOutputMoLit
	 */
   public char[] getCmnPeriodOutputMoLit() throws CFException{
     if (isCmnPeriodOutputMoLitModified()) { 
        cmnPeriodOutputMoLit = refreshCmnPeriodOutputMoLit();
     }
   		return cmnPeriodOutputMoLit;
   }

  
	/**
	*  set variable cmnPeriodOutputMoLit
	*  Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-MO-LIT
	*  @param value
	**/
   public void setCmnPeriodOutputMoLit(char[] value) {
      cmnPeriodOutputMoLit = checkCmnPeriodOutputMoLitConstraints(value);
      serializeCmnPeriodOutputMoLit(cmnPeriodOutputMoLit);
   } 

     /**
	 * 	Update CmnPeriodOutputMoLit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputMoLit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnPeriodOutputMoLit,cmnPeriodOutputMoLit.length);
   	
   }
   
   public void setCmnPeriodOutputMoLit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnPeriodOutputMoLit,cmnPeriodOutputMoLit.length);
   	
   }
   
     /**
	 * 	Update CmnPeriodOutputMoLit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputMoLit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnPeriodOutputMoLit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnPeriodOutputMoLit with another Field
	 *	@param value
	 */
   public void setCmnPeriodOutputMoLit(Field source) {
       replace(source,0,source.length(),beginCmnPeriodOutputMoLit,CMN_PERIOD_OUTPUT_MO_LIT_LEN);
   	
   }  
   
     /**
	 * 	Update CmnPeriodOutputMoLit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnPeriodOutputMoLit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnPeriodOutputMoLit,CMN_PERIOD_OUTPUT_MO_LIT_LEN);
   	
   }
   
     /**
	 * 	Update CmnPeriodOutputMoLit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputMoLit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnPeriodOutputMoLit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnPeriodOutputYear
	 *	@return cmnPeriodOutputYear
	 */
	public int getCmnPeriodOutputYear() throws CFException {
       if (isCmnPeriodOutputYearModified()) { 
           cmnPeriodOutputYear = refreshCmnPeriodOutputYear();
        }
   		return cmnPeriodOutputYear;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodOutputYear with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-YEAR
	 *	@param number
	 */
	public void setCmnPeriodOutputYear(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodOutputYear = checkCmnPeriodOutputYearMaxLimit(number); 
		serializeCmnPeriodOutputYear(cmnPeriodOutputYear);
	}
	

	public void setCmnPeriodOutputYear(long number) {
	    number = checkCmnPeriodOutputYearMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodOutputYear((int)number);
	}
	
	/**
	 * 	Update CmnPeriodOutputYear with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputYear(char[] value) throws CFException {
		 cmnPeriodOutputYear = serializeCmnPeriodOutputYear(value);
	}
	/**
	 * 	Update CmnPeriodOutputYear with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputYearString(char[] value) throws CFException {
		 setCmnPeriodOutputYear(value);
	}

	
	
	

		public static int getCmnPeriodOutputMonthYyyyFieldLength() {
			return CMN_PERIOD_OUTPUT_MONTH_YYYY_LENGTH;
		}

}
  
