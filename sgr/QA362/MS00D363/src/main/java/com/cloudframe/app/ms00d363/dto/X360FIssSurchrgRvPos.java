package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssSurchrgRvPos is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FIssSurchrgRvPos extends X360FIssSurchrgRvPosSerialized { 
   

								private int x360FIssSurchrgRvCntCrP;

								private int x360FIssSurchrgRvCntDbP;

								private BigDecimal x360FIssSurchrgRvAmtCrP = BigDecimal.ZERO;

								private BigDecimal x360FIssSurchrgRvAmtDbP = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FIssSurchrgRvPos
	**/
    public X360FIssSurchrgRvPos() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FIssSurchrgRvPos. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgRvPos(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FIssSurchrgRvCntCrP() throws CFException {
        if (isX360FIssSurchrgRvCntCrPModified()) { 
           x360FIssSurchrgRvCntCrP = refreshX360FIssSurchrgRvCntCrP();
        }
   		return x360FIssSurchrgRvCntCrP;
	}
	
	/**
	 * 	Update X360FIssSurchrgRvCntCrP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-CNT-CR-P
	 *	@param number
	 */
	public void setX360FIssSurchrgRvCntCrP(int number) {
			x360FIssSurchrgRvCntCrP = checkX360FIssSurchrgRvCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgRvCntCrP(x360FIssSurchrgRvCntCrP);
	}


	public void setX360FIssSurchrgRvCntCrP(long number) {
	    number = checkX360FIssSurchrgRvCntCrPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgRvCntCrP((int)number);
	}
	
	public int getX360FIssSurchrgRvCntDbP() throws CFException {
        if (isX360FIssSurchrgRvCntDbPModified()) { 
           x360FIssSurchrgRvCntDbP = refreshX360FIssSurchrgRvCntDbP();
        }
   		return x360FIssSurchrgRvCntDbP;
	}
	
	/**
	 * 	Update X360FIssSurchrgRvCntDbP with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-CNT-DB-P
	 *	@param number
	 */
	public void setX360FIssSurchrgRvCntDbP(int number) {
			x360FIssSurchrgRvCntDbP = checkX360FIssSurchrgRvCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgRvCntDbP(x360FIssSurchrgRvCntDbP);
	}


	public void setX360FIssSurchrgRvCntDbP(long number) {
	    number = checkX360FIssSurchrgRvCntDbPMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgRvCntDbP((int)number);
	}
	
	public BigDecimal getX360FIssSurchrgRvAmtCrP() throws CFException {
        if (isX360FIssSurchrgRvAmtCrPModified()) { 
           x360FIssSurchrgRvAmtCrP = refreshX360FIssSurchrgRvAmtCrP();
        }
   		return x360FIssSurchrgRvAmtCrP;
	}

    public char[] getX360FIssSurchrgRvAmtCrPString() {
          return  x360FIssSurchrgRvAmtCrPString();
    }
	
	/**
	 * 	Update X360FIssSurchrgRvAmtCrP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-AMT-CR-P
	 *	@param number
	 */
	public void setX360FIssSurchrgRvAmtCrP(BigDecimal number) {	
     x360FIssSurchrgRvAmtCrP = checkX360FIssSurchrgRvAmtCrPMaxLimit(number);
	    serializeX360FIssSurchrgRvAmtCrP(x360FIssSurchrgRvAmtCrP);
   }
	public BigDecimal getX360FIssSurchrgRvAmtDbP() throws CFException {
        if (isX360FIssSurchrgRvAmtDbPModified()) { 
           x360FIssSurchrgRvAmtDbP = refreshX360FIssSurchrgRvAmtDbP();
        }
   		return x360FIssSurchrgRvAmtDbP;
	}

    public char[] getX360FIssSurchrgRvAmtDbPString() {
          return  x360FIssSurchrgRvAmtDbPString();
    }
	
	/**
	 * 	Update X360FIssSurchrgRvAmtDbP with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-AMT-DB-P
	 *	@param number
	 */
	public void setX360FIssSurchrgRvAmtDbP(BigDecimal number) {	
     x360FIssSurchrgRvAmtDbP = checkX360FIssSurchrgRvAmtDbPMaxLimit(number);
	    serializeX360FIssSurchrgRvAmtDbP(x360FIssSurchrgRvAmtDbP);
   }

	
	
	

		public static int getX360FIssSurchrgRvPosFieldLength() {
			return X_360_FISS_SURCHRG_RV_POS_LENGTH;
		}

}
  
