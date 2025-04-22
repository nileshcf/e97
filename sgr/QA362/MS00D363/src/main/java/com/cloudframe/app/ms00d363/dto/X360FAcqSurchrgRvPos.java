package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqSurchrgRvPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FAcqSurchrgRvPos extends X360FAcqSurchrgRvPosSerialized { 
   

								private int x360FAcqSurchrgRvCntCrP;

								private int x360FAcqSurchrgRvCntDbP;

								private BigDecimal x360FAcqSurchrgRvAmtCrP = BigDecimal.ZERO;

								private BigDecimal x360FAcqSurchrgRvAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FAcqSurchrgRvPos
	**/
    public X360FAcqSurchrgRvPos() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FAcqSurchrgRvPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgRvPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FAcqSurchrgRvCntCrP() throws CFException {
        if (isX360FAcqSurchrgRvCntCrPModified()) { 
           x360FAcqSurchrgRvCntCrP = refreshX360FAcqSurchrgRvCntCrP();
        }
   		return x360FAcqSurchrgRvCntCrP;
	}
	
	/**
	 * 	Update X360FAcqSurchrgRvCntCrP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-CNT-CR-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvCntCrP(int number) {
			x360FAcqSurchrgRvCntCrP = checkX360FAcqSurchrgRvCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgRvCntCrP(x360FAcqSurchrgRvCntCrP);
	}


	public void setX360FAcqSurchrgRvCntCrP(long number) {
	    number = checkX360FAcqSurchrgRvCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgRvCntCrP((int)number);
	}
	
	public int getX360FAcqSurchrgRvCntDbP() throws CFException {
        if (isX360FAcqSurchrgRvCntDbPModified()) { 
           x360FAcqSurchrgRvCntDbP = refreshX360FAcqSurchrgRvCntDbP();
        }
   		return x360FAcqSurchrgRvCntDbP;
	}
	
	/**
	 * 	Update X360FAcqSurchrgRvCntDbP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-CNT-DB-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvCntDbP(int number) {
			x360FAcqSurchrgRvCntDbP = checkX360FAcqSurchrgRvCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgRvCntDbP(x360FAcqSurchrgRvCntDbP);
	}


	public void setX360FAcqSurchrgRvCntDbP(long number) {
	    number = checkX360FAcqSurchrgRvCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgRvCntDbP((int)number);
	}
	
	public BigDecimal getX360FAcqSurchrgRvAmtCrP() throws CFException {
        if (isX360FAcqSurchrgRvAmtCrPModified()) { 
           x360FAcqSurchrgRvAmtCrP = refreshX360FAcqSurchrgRvAmtCrP();
        }
   		return x360FAcqSurchrgRvAmtCrP;
	}

    public char[] getX360FAcqSurchrgRvAmtCrPString() {
          return  x360FAcqSurchrgRvAmtCrPString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgRvAmtCrP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-AMT-CR-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvAmtCrP(BigDecimal number) {	
     x360FAcqSurchrgRvAmtCrP = checkX360FAcqSurchrgRvAmtCrPMaxLimit(number);
	    serializeX360FAcqSurchrgRvAmtCrP(x360FAcqSurchrgRvAmtCrP);
   }
	public BigDecimal getX360FAcqSurchrgRvAmtDbP() throws CFException {
        if (isX360FAcqSurchrgRvAmtDbPModified()) { 
           x360FAcqSurchrgRvAmtDbP = refreshX360FAcqSurchrgRvAmtDbP();
        }
   		return x360FAcqSurchrgRvAmtDbP;
	}

    public char[] getX360FAcqSurchrgRvAmtDbPString() {
          return  x360FAcqSurchrgRvAmtDbPString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgRvAmtDbP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-AMT-DB-P
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvAmtDbP(BigDecimal number) {	
     x360FAcqSurchrgRvAmtDbP = checkX360FAcqSurchrgRvAmtDbPMaxLimit(number);
	    serializeX360FAcqSurchrgRvAmtDbP(x360FAcqSurchrgRvAmtDbP);
   }

	
	
	

		public static int getX360FAcqSurchrgRvPosFieldLength() {
			return X_360_FACQ_SURCHRG_RV_POS_LENGTH;
		}

}
  
