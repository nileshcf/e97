package com.cloudframe.app.comput3.dto;

/**
*  The class WcGbt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:28. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcGbt extends WcGbtSerialized { 
   

								private BigDecimal wcGbtBbl = BigDecimal.ZERO;

								private BigDecimal wcGbtKb = BigDecimal.ZERO;

								private BigDecimal wcGbtLit = BigDecimal.ZERO;

								private BigDecimal wcGbtM3 = BigDecimal.ZERO;

								private BigDecimal wcGbtUsg = BigDecimal.ZERO;

								private BigDecimal wcGbtUkg = BigDecimal.ZERO;

								private BigDecimal wcGbtMmb = BigDecimal.ZERO;

								private BigDecimal wcGbtGbt = BigDecimal.ZERO;

								private BigDecimal wcGbtThm = BigDecimal.ZERO;

								private BigDecimal wcGbtMwh = BigDecimal.ZERO;

								private BigDecimal wcGbtGj = BigDecimal.ZERO;

								private BigDecimal wcGbtDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcGbt
	**/
    public WcGbt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcGbt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcGbt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcGbtBbl(BigDecimal.valueOf(+17241379310.3448).setScale(4));
								setWcGbtKb(BigDecimal.valueOf(+17241379.3103).setScale(4));
								setWcGbtLit(BigDecimal.valueOf(+40642077586.2100).setScale(4));
								setWcGbtM3(BigDecimal.valueOf(+2741379386.2069).setScale(4));
								setWcGbtUsg(BigDecimal.valueOf(+724137931034.4830).setScale(4));
								setWcGbtUkg(BigDecimal.valueOf(+602950841417.2410).setScale(4));
								setWcGbtMmb(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcGbtGbt(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcGbtThm(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcGbtMwh(BigDecimal.valueOf(+29307107017.2222).setScale(4));
								setWcGbtGj(BigDecimal.valueOf(+1055055852.6199).setScale(4));
								setWcGbtDay(BigDecimal.valueOf(+17241379310.3448).setScale(4));
    } 

	public BigDecimal getWcGbtBbl() throws CFException {
        if (isWcGbtBblModified()) { 
           wcGbtBbl = refreshWcGbtBbl();
        }
   		return wcGbtBbl;
	}

    public char[] getWcGbtBblString() {
          return  wcGbtBblString();
    }
	
	/**
	 * 	Update WcGbtBbl with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-BBL
	 *	@param number
	 */
	public void setWcGbtBbl(BigDecimal number) {	
     wcGbtBbl = checkWcGbtBblMaxLimit(number);
	    serializeWcGbtBbl(wcGbtBbl);
   }
	public BigDecimal getWcGbtKb() throws CFException {
        if (isWcGbtKbModified()) { 
           wcGbtKb = refreshWcGbtKb();
        }
   		return wcGbtKb;
	}

    public char[] getWcGbtKbString() {
          return  wcGbtKbString();
    }
	
	/**
	 * 	Update WcGbtKb with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-KB
	 *	@param number
	 */
	public void setWcGbtKb(BigDecimal number) {	
     wcGbtKb = checkWcGbtKbMaxLimit(number);
	    serializeWcGbtKb(wcGbtKb);
   }
	public BigDecimal getWcGbtLit() throws CFException {
        if (isWcGbtLitModified()) { 
           wcGbtLit = refreshWcGbtLit();
        }
   		return wcGbtLit;
	}

    public char[] getWcGbtLitString() {
          return  wcGbtLitString();
    }
	
	/**
	 * 	Update WcGbtLit with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-LIT
	 *	@param number
	 */
	public void setWcGbtLit(BigDecimal number) {	
     wcGbtLit = checkWcGbtLitMaxLimit(number);
	    serializeWcGbtLit(wcGbtLit);
   }
	public BigDecimal getWcGbtM3() throws CFException {
        if (isWcGbtM3Modified()) { 
           wcGbtM3 = refreshWcGbtM3();
        }
   		return wcGbtM3;
	}

    public char[] getWcGbtM3String() {
          return  wcGbtM3String();
    }
	
	/**
	 * 	Update WcGbtM3 with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-M3
	 *	@param number
	 */
	public void setWcGbtM3(BigDecimal number) {	
     wcGbtM3 = checkWcGbtM3MaxLimit(number);
	    serializeWcGbtM3(wcGbtM3);
   }
	public BigDecimal getWcGbtUsg() throws CFException {
        if (isWcGbtUsgModified()) { 
           wcGbtUsg = refreshWcGbtUsg();
        }
   		return wcGbtUsg;
	}

    public char[] getWcGbtUsgString() {
          return  wcGbtUsgString();
    }
	
	/**
	 * 	Update WcGbtUsg with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-USG
	 *	@param number
	 */
	public void setWcGbtUsg(BigDecimal number) {	
     wcGbtUsg = checkWcGbtUsgMaxLimit(number);
	    serializeWcGbtUsg(wcGbtUsg);
   }
	public BigDecimal getWcGbtUkg() throws CFException {
        if (isWcGbtUkgModified()) { 
           wcGbtUkg = refreshWcGbtUkg();
        }
   		return wcGbtUkg;
	}

    public char[] getWcGbtUkgString() {
          return  wcGbtUkgString();
    }
	
	/**
	 * 	Update WcGbtUkg with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-UKG
	 *	@param number
	 */
	public void setWcGbtUkg(BigDecimal number) {	
     wcGbtUkg = checkWcGbtUkgMaxLimit(number);
	    serializeWcGbtUkg(wcGbtUkg);
   }
	public BigDecimal getWcGbtMmb() throws CFException {
        if (isWcGbtMmbModified()) { 
           wcGbtMmb = refreshWcGbtMmb();
        }
   		return wcGbtMmb;
	}

    public char[] getWcGbtMmbString() {
          return  wcGbtMmbString();
    }
	
	/**
	 * 	Update WcGbtMmb with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-MMB
	 *	@param number
	 */
	public void setWcGbtMmb(BigDecimal number) {	
     wcGbtMmb = checkWcGbtMmbMaxLimit(number);
	    serializeWcGbtMmb(wcGbtMmb);
   }
	public BigDecimal getWcGbtGbt() throws CFException {
        if (isWcGbtGbtModified()) { 
           wcGbtGbt = refreshWcGbtGbt();
        }
   		return wcGbtGbt;
	}

    public char[] getWcGbtGbtString() {
          return  wcGbtGbtString();
    }
	
	/**
	 * 	Update WcGbtGbt with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-GBT
	 *	@param number
	 */
	public void setWcGbtGbt(BigDecimal number) {	
     wcGbtGbt = checkWcGbtGbtMaxLimit(number);
	    serializeWcGbtGbt(wcGbtGbt);
   }
	public BigDecimal getWcGbtThm() throws CFException {
        if (isWcGbtThmModified()) { 
           wcGbtThm = refreshWcGbtThm();
        }
   		return wcGbtThm;
	}

    public char[] getWcGbtThmString() {
          return  wcGbtThmString();
    }
	
	/**
	 * 	Update WcGbtThm with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-THM
	 *	@param number
	 */
	public void setWcGbtThm(BigDecimal number) {	
     wcGbtThm = checkWcGbtThmMaxLimit(number);
	    serializeWcGbtThm(wcGbtThm);
   }
	public BigDecimal getWcGbtMwh() throws CFException {
        if (isWcGbtMwhModified()) { 
           wcGbtMwh = refreshWcGbtMwh();
        }
   		return wcGbtMwh;
	}

    public char[] getWcGbtMwhString() {
          return  wcGbtMwhString();
    }
	
	/**
	 * 	Update WcGbtMwh with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-MWH
	 *	@param number
	 */
	public void setWcGbtMwh(BigDecimal number) {	
     wcGbtMwh = checkWcGbtMwhMaxLimit(number);
	    serializeWcGbtMwh(wcGbtMwh);
   }
	public BigDecimal getWcGbtGj() throws CFException {
        if (isWcGbtGjModified()) { 
           wcGbtGj = refreshWcGbtGj();
        }
   		return wcGbtGj;
	}

    public char[] getWcGbtGjString() {
          return  wcGbtGjString();
    }
	
	/**
	 * 	Update WcGbtGj with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-GJ
	 *	@param number
	 */
	public void setWcGbtGj(BigDecimal number) {	
     wcGbtGj = checkWcGbtGjMaxLimit(number);
	    serializeWcGbtGj(wcGbtGj);
   }
	public BigDecimal getWcGbtDay() throws CFException {
        if (isWcGbtDayModified()) { 
           wcGbtDay = refreshWcGbtDay();
        }
   		return wcGbtDay;
	}

    public char[] getWcGbtDayString() {
          return  wcGbtDayString();
    }
	
	/**
	 * 	Update WcGbtDay with the passed number
	 *  Corresponding COBOL Variable is WC-GBT-DAY
	 *	@param number
	 */
	public void setWcGbtDay(BigDecimal number) {	
     wcGbtDay = checkWcGbtDayMaxLimit(number);
	    serializeWcGbtDay(wcGbtDay);
   }

	
	
	

		public static int getWcGbtFieldLength() {
			return WC_GBT_LENGTH;
		}

}
  
