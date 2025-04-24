package com.cloudframe.app.init1.dto;

/**
*  The class CmnPeriodOutputYyyymm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPeriodOutputYyyymm extends CmnPeriodOutputYyyymmSerialized { 
   
				private CmnPeriodOutputYyyy cmnPeriodOutputYyyy = new CmnPeriodOutputYyyy();

								private int cmnPeriodOutputMm;
	
	/**
	* Constructor for CmnPeriodOutputYyyymm
	**/
    public CmnPeriodOutputYyyymm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPeriodOutputYyyymm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPeriodOutputYyyymm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnPeriodOutputYyyy.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of cmnPeriodOutputYyyy
	 *	@return cmnPeriodOutputYyyy
	 */   
	 public CmnPeriodOutputYyyy getCmnPeriodOutputYyyy() {
   	return cmnPeriodOutputYyyy;
   }
   /**
	* 	Update CmnPeriodOutputYyyy with the passed value
	*   Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-YYYY
	*	@param value
	*/
   public void setCmnPeriodOutputYyyy(char[] value) {
      cmnPeriodOutputYyyy.setString(value); 
   }   
    
     /**
	 * 	Update CmnPeriodOutputYyyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyy.begin,cmnPeriodOutputYyyy.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputYyyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnPeriodOutputYyyy with another Field
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyy(Field source) {
   	replace(source,0,source.length(),cmnPeriodOutputYyyy.begin,cmnPeriodOutputYyyy.length());
   }  
   
     /**
	 * 	Update CmnPeriodOutputYyyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyy.begin,cmnPeriodOutputYyyy.length());
   }
   
     /**
	 * 	Update CmnPeriodOutputYyyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnPeriodOutputYyyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnPeriodOutputYyyy.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnPeriodOutputMm
	 *	@return cmnPeriodOutputMm
	 */
	public int getCmnPeriodOutputMm() throws CFException {
       if (isCmnPeriodOutputMmModified()) { 
           cmnPeriodOutputMm = refreshCmnPeriodOutputMm();
        }
   		return cmnPeriodOutputMm;
	}
	

	
	   
	/**
	 * 	Update CmnPeriodOutputMm with the passed value
	 *  Corresponding COBOL Variable is CMN-PERIOD-OUTPUT-MM
	 *	@param number
	 */
	public void setCmnPeriodOutputMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cmnPeriodOutputMm = checkCmnPeriodOutputMmMaxLimit(number); 
		serializeCmnPeriodOutputMm(cmnPeriodOutputMm);
	}
	

	public void setCmnPeriodOutputMm(long number) {
	    number = checkCmnPeriodOutputMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCmnPeriodOutputMm((int)number);
	}
	
	/**
	 * 	Update CmnPeriodOutputMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputMm(char[] value) throws CFException {
		 cmnPeriodOutputMm = serializeCmnPeriodOutputMm(value);
	}
	/**
	 * 	Update CmnPeriodOutputMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCmnPeriodOutputMmString(char[] value) throws CFException {
		 setCmnPeriodOutputMm(value);
	}

	
	
	

		public static int getCmnPeriodOutputYyyymmFieldLength() {
			return CMN_PERIOD_OUTPUT_YYYYMM_LENGTH;
		}

}
  
