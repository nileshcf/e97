package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360FAcqSurchrgRvAtm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class X360FAcqSurchrgRvAtm extends X360FAcqSurchrgRvAtmSerialized { 
   

								private int x360FAcqSurchrgRvCntCrA;

								private int x360FAcqSurchrgRvCntDbA;

								private BigDecimal x360FAcqSurchrgRvAmtCrA = BigDecimal.ZERO;

								private BigDecimal x360FAcqSurchrgRvAmtDbA = BigDecimal.ZERO;
	
	/**
	* Constructor for X360FAcqSurchrgRvAtm
	**/
    public X360FAcqSurchrgRvAtm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360FAcqSurchrgRvAtm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgRvAtm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public int getX360FAcqSurchrgRvCntCrA() throws CFException {
        if (isX360FAcqSurchrgRvCntCrAModified()) { 
           x360FAcqSurchrgRvCntCrA = refreshX360FAcqSurchrgRvCntCrA();
        }
   		return x360FAcqSurchrgRvCntCrA;
	}
	
	/**
	 * 	Update X360FAcqSurchrgRvCntCrA with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-CNT-CR-A
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvCntCrA(int number) {
			x360FAcqSurchrgRvCntCrA = checkX360FAcqSurchrgRvCntCrAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgRvCntCrA(x360FAcqSurchrgRvCntCrA);
	}


	public void setX360FAcqSurchrgRvCntCrA(long number) {
	    number = checkX360FAcqSurchrgRvCntCrAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgRvCntCrA((int)number);
	}
	
	public int getX360FAcqSurchrgRvCntDbA() throws CFException {
        if (isX360FAcqSurchrgRvCntDbAModified()) { 
           x360FAcqSurchrgRvCntDbA = refreshX360FAcqSurchrgRvCntDbA();
        }
   		return x360FAcqSurchrgRvCntDbA;
	}
	
	/**
	 * 	Update X360FAcqSurchrgRvCntDbA with the passed value
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-CNT-DB-A
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvCntDbA(int number) {
			x360FAcqSurchrgRvCntDbA = checkX360FAcqSurchrgRvCntDbAMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeX360FAcqSurchrgRvCntDbA(x360FAcqSurchrgRvCntDbA);
	}


	public void setX360FAcqSurchrgRvCntDbA(long number) {
	    number = checkX360FAcqSurchrgRvCntDbAMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360FAcqSurchrgRvCntDbA((int)number);
	}
	
	public BigDecimal getX360FAcqSurchrgRvAmtCrA() throws CFException {
        if (isX360FAcqSurchrgRvAmtCrAModified()) { 
           x360FAcqSurchrgRvAmtCrA = refreshX360FAcqSurchrgRvAmtCrA();
        }
   		return x360FAcqSurchrgRvAmtCrA;
	}

    public char[] getX360FAcqSurchrgRvAmtCrAString() {
          return  x360FAcqSurchrgRvAmtCrAString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgRvAmtCrA with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-AMT-CR-A
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvAmtCrA(BigDecimal number) {	
     x360FAcqSurchrgRvAmtCrA = checkX360FAcqSurchrgRvAmtCrAMaxLimit(number);
	    serializeX360FAcqSurchrgRvAmtCrA(x360FAcqSurchrgRvAmtCrA);
   }
	public BigDecimal getX360FAcqSurchrgRvAmtDbA() throws CFException {
        if (isX360FAcqSurchrgRvAmtDbAModified()) { 
           x360FAcqSurchrgRvAmtDbA = refreshX360FAcqSurchrgRvAmtDbA();
        }
   		return x360FAcqSurchrgRvAmtDbA;
	}

    public char[] getX360FAcqSurchrgRvAmtDbAString() {
          return  x360FAcqSurchrgRvAmtDbAString();
    }
	
	/**
	 * 	Update X360FAcqSurchrgRvAmtDbA with the passed number
	 *  Corresponding COBOL Variable is X360-F-ACQ-SURCHRG-RV-AMT-DB-A
	 *	@param number
	 */
	public void setX360FAcqSurchrgRvAmtDbA(BigDecimal number) {	
     x360FAcqSurchrgRvAmtDbA = checkX360FAcqSurchrgRvAmtDbAMaxLimit(number);
	    serializeX360FAcqSurchrgRvAmtDbA(x360FAcqSurchrgRvAmtDbA);
   }

	
	
	

		public static int getX360FAcqSurchrgRvAtmFieldLength() {
			return X_360_FACQ_SURCHRG_RV_ATM_LENGTH;
		}

}
  
