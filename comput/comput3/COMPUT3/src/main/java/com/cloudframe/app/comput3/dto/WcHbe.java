package com.cloudframe.app.comput3.dto;

/**
*  The class WcHbe is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcHbe extends WcHbeSerialized { 
   

								private BigDecimal wcGjBbl = BigDecimal.ZERO;

								private BigDecimal wcGjKb = BigDecimal.ZERO;

								private BigDecimal wcGjLit = BigDecimal.ZERO;

								private BigDecimal wcGjM3 = BigDecimal.ZERO;

								private BigDecimal wcGjUsg = BigDecimal.ZERO;

								private BigDecimal wcGjUkg = BigDecimal.ZERO;

								private BigDecimal wcGjMmb = BigDecimal.ZERO;

								private BigDecimal wcGjGbt = BigDecimal.ZERO;

								private BigDecimal wcGjThm = BigDecimal.ZERO;

								private BigDecimal wcGjMwh = BigDecimal.ZERO;

								private BigDecimal wcGjGj = BigDecimal.ZERO;

								private BigDecimal wcGjDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcHbe
	**/
    public WcHbe() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcHbe. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcHbe(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcGjBbl(BigDecimal.valueOf(+19059956363.6364).setScale(4));
								setWcGjKb(BigDecimal.valueOf(+19035995.6364).setScale(4));
								setWcGjLit(BigDecimal.valueOf(+3030303030303.03).setScale(4));
								setWcGjM3(BigDecimal.valueOf(+3030303030.3030).setScale(4));
								setWcGjUsg(BigDecimal.valueOf(+799552250739.5850).setScale(4));
								setWcGjUkg(BigDecimal.valueOf(+665787159190.8524).setScale(4));
								setWcGjMmb(BigDecimal.valueOf(+94781712031.3317).setScale(4));
								setWcGjGbt(BigDecimal.valueOf(+94781712.0313).setScale(4));
								setWcGjThm(BigDecimal.valueOf(+947817120313.3167).setScale(4));
								setWcGjMwh(BigDecimal.valueOf(+27777777777.7778).setScale(4));
								setWcGjGj(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcGjDay(BigDecimal.valueOf(+19059956363.6364).setScale(4));
    } 

	public BigDecimal getWcGjBbl() throws CFException {
        if (isWcGjBblModified()) { 
           wcGjBbl = refreshWcGjBbl();
        }
   		return wcGjBbl;
	}

    public char[] getWcGjBblString() {
          return  wcGjBblString();
    }
	
	/**
	 * 	Update WcGjBbl with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-BBL
	 *	@param number
	 */
	public void setWcGjBbl(BigDecimal number) {	
     wcGjBbl = checkWcGjBblMaxLimit(number);
	    serializeWcGjBbl(wcGjBbl);
   }
	public BigDecimal getWcGjKb() throws CFException {
        if (isWcGjKbModified()) { 
           wcGjKb = refreshWcGjKb();
        }
   		return wcGjKb;
	}

    public char[] getWcGjKbString() {
          return  wcGjKbString();
    }
	
	/**
	 * 	Update WcGjKb with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-KB
	 *	@param number
	 */
	public void setWcGjKb(BigDecimal number) {	
     wcGjKb = checkWcGjKbMaxLimit(number);
	    serializeWcGjKb(wcGjKb);
   }
	public BigDecimal getWcGjLit() throws CFException {
        if (isWcGjLitModified()) { 
           wcGjLit = refreshWcGjLit();
        }
   		return wcGjLit;
	}

    public char[] getWcGjLitString() {
          return  wcGjLitString();
    }
	
	/**
	 * 	Update WcGjLit with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-LIT
	 *	@param number
	 */
	public void setWcGjLit(BigDecimal number) {	
     wcGjLit = checkWcGjLitMaxLimit(number);
	    serializeWcGjLit(wcGjLit);
   }
	public BigDecimal getWcGjM3() throws CFException {
        if (isWcGjM3Modified()) { 
           wcGjM3 = refreshWcGjM3();
        }
   		return wcGjM3;
	}

    public char[] getWcGjM3String() {
          return  wcGjM3String();
    }
	
	/**
	 * 	Update WcGjM3 with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-M3
	 *	@param number
	 */
	public void setWcGjM3(BigDecimal number) {	
     wcGjM3 = checkWcGjM3MaxLimit(number);
	    serializeWcGjM3(wcGjM3);
   }
	public BigDecimal getWcGjUsg() throws CFException {
        if (isWcGjUsgModified()) { 
           wcGjUsg = refreshWcGjUsg();
        }
   		return wcGjUsg;
	}

    public char[] getWcGjUsgString() {
          return  wcGjUsgString();
    }
	
	/**
	 * 	Update WcGjUsg with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-USG
	 *	@param number
	 */
	public void setWcGjUsg(BigDecimal number) {	
     wcGjUsg = checkWcGjUsgMaxLimit(number);
	    serializeWcGjUsg(wcGjUsg);
   }
	public BigDecimal getWcGjUkg() throws CFException {
        if (isWcGjUkgModified()) { 
           wcGjUkg = refreshWcGjUkg();
        }
   		return wcGjUkg;
	}

    public char[] getWcGjUkgString() {
          return  wcGjUkgString();
    }
	
	/**
	 * 	Update WcGjUkg with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-UKG
	 *	@param number
	 */
	public void setWcGjUkg(BigDecimal number) {	
     wcGjUkg = checkWcGjUkgMaxLimit(number);
	    serializeWcGjUkg(wcGjUkg);
   }
	public BigDecimal getWcGjMmb() throws CFException {
        if (isWcGjMmbModified()) { 
           wcGjMmb = refreshWcGjMmb();
        }
   		return wcGjMmb;
	}

    public char[] getWcGjMmbString() {
          return  wcGjMmbString();
    }
	
	/**
	 * 	Update WcGjMmb with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-MMB
	 *	@param number
	 */
	public void setWcGjMmb(BigDecimal number) {	
     wcGjMmb = checkWcGjMmbMaxLimit(number);
	    serializeWcGjMmb(wcGjMmb);
   }
	public BigDecimal getWcGjGbt() throws CFException {
        if (isWcGjGbtModified()) { 
           wcGjGbt = refreshWcGjGbt();
        }
   		return wcGjGbt;
	}

    public char[] getWcGjGbtString() {
          return  wcGjGbtString();
    }
	
	/**
	 * 	Update WcGjGbt with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-GBT
	 *	@param number
	 */
	public void setWcGjGbt(BigDecimal number) {	
     wcGjGbt = checkWcGjGbtMaxLimit(number);
	    serializeWcGjGbt(wcGjGbt);
   }
	public BigDecimal getWcGjThm() throws CFException {
        if (isWcGjThmModified()) { 
           wcGjThm = refreshWcGjThm();
        }
   		return wcGjThm;
	}

    public char[] getWcGjThmString() {
          return  wcGjThmString();
    }
	
	/**
	 * 	Update WcGjThm with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-THM
	 *	@param number
	 */
	public void setWcGjThm(BigDecimal number) {	
     wcGjThm = checkWcGjThmMaxLimit(number);
	    serializeWcGjThm(wcGjThm);
   }
	public BigDecimal getWcGjMwh() throws CFException {
        if (isWcGjMwhModified()) { 
           wcGjMwh = refreshWcGjMwh();
        }
   		return wcGjMwh;
	}

    public char[] getWcGjMwhString() {
          return  wcGjMwhString();
    }
	
	/**
	 * 	Update WcGjMwh with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-MWH
	 *	@param number
	 */
	public void setWcGjMwh(BigDecimal number) {	
     wcGjMwh = checkWcGjMwhMaxLimit(number);
	    serializeWcGjMwh(wcGjMwh);
   }
	public BigDecimal getWcGjGj() throws CFException {
        if (isWcGjGjModified()) { 
           wcGjGj = refreshWcGjGj();
        }
   		return wcGjGj;
	}

    public char[] getWcGjGjString() {
          return  wcGjGjString();
    }
	
	/**
	 * 	Update WcGjGj with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-GJ
	 *	@param number
	 */
	public void setWcGjGj(BigDecimal number) {	
     wcGjGj = checkWcGjGjMaxLimit(number);
	    serializeWcGjGj(wcGjGj);
   }
	public BigDecimal getWcGjDay() throws CFException {
        if (isWcGjDayModified()) { 
           wcGjDay = refreshWcGjDay();
        }
   		return wcGjDay;
	}

    public char[] getWcGjDayString() {
          return  wcGjDayString();
    }
	
	/**
	 * 	Update WcGjDay with the passed number
	 *  Corresponding COBOL Variable is WC-GJ-DAY
	 *	@param number
	 */
	public void setWcGjDay(BigDecimal number) {	
     wcGjDay = checkWcGjDayMaxLimit(number);
	    serializeWcGjDay(wcGjDay);
   }

	
	
	

		public static int getWcHbeFieldLength() {
			return WC_HBE_LENGTH;
		}

}
  
