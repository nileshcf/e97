package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FIssSurchrgRvAtm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FIssSurchrgRvAtm extends X360FIssSurchrgRvAtmSerialized { 
   

								private int x360FIssSurchrgRvCntCrA;

								private int x360FIssSurchrgRvCntDbA;

								private BigDecimal x360FIssSurchrgRvAmtCrA = BigDecimal.ZERO;

								private BigDecimal x360FIssSurchrgRvAmtDbA = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FIssSurchrgRvAtm
	**/
    public X360FIssSurchrgRvAtm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FIssSurchrgRvAtm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgRvAtm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FIssSurchrgRvCntCrA() throws CFException {
        if (isX360FIssSurchrgRvCntCrAModified()) { 
           x360FIssSurchrgRvCntCrA = refreshX360FIssSurchrgRvCntCrA();
        }
   		return x360FIssSurchrgRvCntCrA;
	}
	
	/**
	 * 	Update X360FIssSurchrgRvCntCrA with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-CNT-CR-A
	 *	@param number
	 */
	public void setX360FIssSurchrgRvCntCrA(int number) {
			x360FIssSurchrgRvCntCrA = checkX360FIssSurchrgRvCntCrAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgRvCntCrA(x360FIssSurchrgRvCntCrA);
	}


	public void setX360FIssSurchrgRvCntCrA(long number) {
	    number = checkX360FIssSurchrgRvCntCrAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgRvCntCrA((int)number);
	}
	
	public int getX360FIssSurchrgRvCntDbA() throws CFException {
        if (isX360FIssSurchrgRvCntDbAModified()) { 
           x360FIssSurchrgRvCntDbA = refreshX360FIssSurchrgRvCntDbA();
        }
   		return x360FIssSurchrgRvCntDbA;
	}
	
	/**
	 * 	Update X360FIssSurchrgRvCntDbA with the passed value
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-CNT-DB-A
	 *	@param number
	 */
	public void setX360FIssSurchrgRvCntDbA(int number) {
			x360FIssSurchrgRvCntDbA = checkX360FIssSurchrgRvCntDbAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FIssSurchrgRvCntDbA(x360FIssSurchrgRvCntDbA);
	}


	public void setX360FIssSurchrgRvCntDbA(long number) {
	    number = checkX360FIssSurchrgRvCntDbAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FIssSurchrgRvCntDbA((int)number);
	}
	
	public BigDecimal getX360FIssSurchrgRvAmtCrA() throws CFException {
        if (isX360FIssSurchrgRvAmtCrAModified()) { 
           x360FIssSurchrgRvAmtCrA = refreshX360FIssSurchrgRvAmtCrA();
        }
   		return x360FIssSurchrgRvAmtCrA;
	}

    public char[] getX360FIssSurchrgRvAmtCrAString() {
          return  x360FIssSurchrgRvAmtCrAString();
    }
	
	/**
	 * 	Update X360FIssSurchrgRvAmtCrA with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-AMT-CR-A
	 *	@param number
	 */
	public void setX360FIssSurchrgRvAmtCrA(BigDecimal number) {	
     x360FIssSurchrgRvAmtCrA = checkX360FIssSurchrgRvAmtCrAMaxLimit(number);
	    serializeX360FIssSurchrgRvAmtCrA(x360FIssSurchrgRvAmtCrA);
   }
	public BigDecimal getX360FIssSurchrgRvAmtDbA() throws CFException {
        if (isX360FIssSurchrgRvAmtDbAModified()) { 
           x360FIssSurchrgRvAmtDbA = refreshX360FIssSurchrgRvAmtDbA();
        }
   		return x360FIssSurchrgRvAmtDbA;
	}

    public char[] getX360FIssSurchrgRvAmtDbAString() {
          return  x360FIssSurchrgRvAmtDbAString();
    }
	
	/**
	 * 	Update X360FIssSurchrgRvAmtDbA with the passed number
	 *  Corresponding COBOL Variable is X360-F-ISS-SURCHRG-RV-AMT-DB-A
	 *	@param number
	 */
	public void setX360FIssSurchrgRvAmtDbA(BigDecimal number) {	
     x360FIssSurchrgRvAmtDbA = checkX360FIssSurchrgRvAmtDbAMaxLimit(number);
	    serializeX360FIssSurchrgRvAmtDbA(x360FIssSurchrgRvAmtDbA);
   }

	
	
	

		public static int getX360FIssSurchrgRvAtmFieldLength() {
			return X_360_FISS_SURCHRG_RV_ATM_LENGTH;
		}

}
  
