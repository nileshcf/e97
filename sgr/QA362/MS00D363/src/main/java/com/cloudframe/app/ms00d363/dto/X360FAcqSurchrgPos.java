package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqSurchrgPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FAcqSurchrgPos extends X360FAcqSurchrgPosSerialized { 
   

								private int x360FAcqSurchrgCntCrP;

								private int x360FAcqSurchrgCntDbP;

								private BigDecimal x360FAcqSurchrgAmtCrP = BigDecimal.ZERO;

								private BigDecimal x360FAcqSurchrgAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FAcqSurchrgPos
	**/
    public X360FAcqSurchrgPos() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FAcqSurchrgPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FAcqSurchrgCntCrP() throws CFException {
        if (isX360FAcqSurchrgCntCrPModified()) { 
           x360FAcqSurchrgCntCrP = refreshX360FAcqSurchrgCntCrP();
        }
   		return x360FAcqSurchrgCntCrP;
	}
	
	/**
	 * 	Update X360FAcqSurchrgCntCrP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-CNT-CR-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgCntCrP(int number) {
			x360FAcqSurchrgCntCrP = checkX360FAcqSurchrgCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgCntCrP(x360FAcqSurchrgCntCrP);
	}


	public void setX360FAcqSurchrgCntCrP(long number) {
	    number = checkX360FAcqSurchrgCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgCntCrP((int)number);
	}
	
	public int getX360FAcqSurchrgCntDbP() throws CFException {
        if (isX360FAcqSurchrgCntDbPModified()) { 
           x360FAcqSurchrgCntDbP = refreshX360FAcqSurchrgCntDbP();
        }
   		return x360FAcqSurchrgCntDbP;
	}
	
	/**
	 * 	Update X360FAcqSurchrgCntDbP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-CNT-DB-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgCntDbP(int number) {
			x360FAcqSurchrgCntDbP = checkX360FAcqSurchrgCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgCntDbP(x360FAcqSurchrgCntDbP);
	}


	public void setX360FAcqSurchrgCntDbP(long number) {
	    number = checkX360FAcqSurchrgCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgCntDbP((int)number);
	}
	
	public BigDecimal getX360FAcqSurchrgAmtCrP() throws CFException {
        if (isX360FAcqSurchrgAmtCrPModified()) { 
           x360FAcqSurchrgAmtCrP = refreshX360FAcqSurchrgAmtCrP();
        }
   		return x360FAcqSurchrgAmtCrP;
	}

    public char[] getX360FAcqSurchrgAmtCrPString() {
          return  x360FAcqSurchrgAmtCrPString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgAmtCrP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-AMT-CR-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgAmtCrP(BigDecimal number) {	
     x360FAcqSurchrgAmtCrP = checkX360FAcqSurchrgAmtCrPMaxLimit(number);
	    serializeX360FAcqSurchrgAmtCrP(x360FAcqSurchrgAmtCrP);
   }
	public BigDecimal getX360FAcqSurchrgAmtDbP() throws CFException {
        if (isX360FAcqSurchrgAmtDbPModified()) { 
           x360FAcqSurchrgAmtDbP = refreshX360FAcqSurchrgAmtDbP();
        }
   		return x360FAcqSurchrgAmtDbP;
	}

    public char[] getX360FAcqSurchrgAmtDbPString() {
          return  x360FAcqSurchrgAmtDbPString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgAmtDbP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-AMT-DB-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgAmtDbP(BigDecimal number) {	
     x360FAcqSurchrgAmtDbP = checkX360FAcqSurchrgAmtDbPMaxLimit(number);
	    serializeX360FAcqSurchrgAmtDbP(x360FAcqSurchrgAmtDbP);
   }

	
	
	

		public static int getX360FAcqSurchrgPosFieldLength() {
			return X_360_FACQ_SURCHRG_POS_LENGTH;
		}

}
  
