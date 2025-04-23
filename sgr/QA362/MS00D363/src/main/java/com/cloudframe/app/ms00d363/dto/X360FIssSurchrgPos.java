package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssSurchrgPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FIssSurchrgPos extends X360FIssSurchrgPosSerialized { 
   

								private int x360FIssSurchrgCntCrP;

								private int x360FIssSurchrgCntDbP;

								private BigDecimal x360FIssSurchrgAmtCrP = BigDecimal.ZERO;

								private BigDecimal x360FIssSurchrgAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FIssSurchrgPos
	**/
    public X360FIssSurchrgPos() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FIssSurchrgPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FIssSurchrgCntCrP() throws CFException {
        if (isX360FIssSurchrgCntCrPModified()) { 
           x360FIssSurchrgCntCrP = refreshX360FIssSurchrgCntCrP();
        }
   		return x360FIssSurchrgCntCrP;
	}
	
	/**
	 * 	Update X360FIssSurchrgCntCrP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-CNT-CR-P
	 *	@param number
	 */
	public void setX360FIssSurchrgCntCrP(int number) {
			x360FIssSurchrgCntCrP = checkX360FIssSurchrgCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgCntCrP(x360FIssSurchrgCntCrP);
	}


	public void setX360FIssSurchrgCntCrP(long number) {
	    number = checkX360FIssSurchrgCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgCntCrP((int)number);
	}
	
	public int getX360FIssSurchrgCntDbP() throws CFException {
        if (isX360FIssSurchrgCntDbPModified()) { 
           x360FIssSurchrgCntDbP = refreshX360FIssSurchrgCntDbP();
        }
   		return x360FIssSurchrgCntDbP;
	}
	
	/**
	 * 	Update X360FIssSurchrgCntDbP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-CNT-DB-P
	 *	@param number
	 */
	public void setX360FIssSurchrgCntDbP(int number) {
			x360FIssSurchrgCntDbP = checkX360FIssSurchrgCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgCntDbP(x360FIssSurchrgCntDbP);
	}


	public void setX360FIssSurchrgCntDbP(long number) {
	    number = checkX360FIssSurchrgCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgCntDbP((int)number);
	}
	
	public BigDecimal getX360FIssSurchrgAmtCrP() throws CFException {
        if (isX360FIssSurchrgAmtCrPModified()) { 
           x360FIssSurchrgAmtCrP = refreshX360FIssSurchrgAmtCrP();
        }
   		return x360FIssSurchrgAmtCrP;
	}

    public char[] getX360FIssSurchrgAmtCrPString() {
          return  x360FIssSurchrgAmtCrPString();
    }
	
	/**
	 * 	Update X360FIssSurchrgAmtCrP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-AMT-CR-P
	 *	@param number
	 */
	public void setX360FIssSurchrgAmtCrP(BigDecimal number) {	
     x360FIssSurchrgAmtCrP = checkX360FIssSurchrgAmtCrPMaxLimit(number);
	    serializeX360FIssSurchrgAmtCrP(x360FIssSurchrgAmtCrP);
   }
	public BigDecimal getX360FIssSurchrgAmtDbP() throws CFException {
        if (isX360FIssSurchrgAmtDbPModified()) { 
           x360FIssSurchrgAmtDbP = refreshX360FIssSurchrgAmtDbP();
        }
   		return x360FIssSurchrgAmtDbP;
	}

    public char[] getX360FIssSurchrgAmtDbPString() {
          return  x360FIssSurchrgAmtDbPString();
    }
	
	/**
	 * 	Update X360FIssSurchrgAmtDbP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-AMT-DB-P
	 *	@param number
	 */
	public void setX360FIssSurchrgAmtDbP(BigDecimal number) {	
     x360FIssSurchrgAmtDbP = checkX360FIssSurchrgAmtDbPMaxLimit(number);
	    serializeX360FIssSurchrgAmtDbP(x360FIssSurchrgAmtDbP);
   }

	
	
	

		public static int getX360FIssSurchrgPosFieldLength() {
			return X_360_FISS_SURCHRG_POS_LENGTH;
		}

}
  
