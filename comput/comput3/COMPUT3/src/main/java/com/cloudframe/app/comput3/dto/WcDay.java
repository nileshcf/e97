package com.cloudframe.app.comput3.dto;

/**
*  The class WcDay is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcDay extends WcDaySerialized { 
   

								private BigDecimal wcDayBbl = BigDecimal.ZERO;

								private BigDecimal wcDayKb = BigDecimal.ZERO;

								private BigDecimal wcDayLit = BigDecimal.ZERO;

								private BigDecimal wcDayM3 = BigDecimal.ZERO;

								private BigDecimal wcDayUsg = BigDecimal.ZERO;

								private BigDecimal wcDayUkg = BigDecimal.ZERO;

								private BigDecimal wcDayMmb = BigDecimal.ZERO;

								private BigDecimal wcDayGbt = BigDecimal.ZERO;

								private BigDecimal wcDayThm = BigDecimal.ZERO;

								private BigDecimal wcDayMwh = BigDecimal.ZERO;

								private BigDecimal wcDayGj = BigDecimal.ZERO;

								private BigDecimal wcDayDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcDay
	**/
    public WcDay() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcDay. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcDay(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcDayBbl(BigDecimal.valueOf(+1000000.0000).setScale(4));
								setWcDayKb(BigDecimal.valueOf(+1000.0000).setScale(4));
								setWcDayLit(BigDecimal.valueOf(+158957240.5000).setScale(4));
								setWcDayM3(BigDecimal.valueOf(+158957.2405).setScale(4));
								setWcDayUsg(BigDecimal.valueOf(+42000000.0000).setScale(4));
								setWcDayUkg(BigDecimal.valueOf(+34971148.8022).setScale(4));
								setWcDayMmb(BigDecimal.valueOf(+5800000.0000).setScale(4));
								setWcDayGbt(BigDecimal.valueOf(+5800.0000).setScale(4));
								setWcDayThm(BigDecimal.valueOf(+58000000.0000).setScale(4));
								setWcDayMwh(BigDecimal.valueOf(+1699812.2070).setScale(4));
								setWcDayGj(BigDecimal.valueOf(+5252943.7265).setScale(4));
								setWcDayDay(BigDecimal.valueOf(+1000000.0000).setScale(4));
    } 

	public BigDecimal getWcDayBbl() throws CFException {
        if (isWcDayBblModified()) { 
           wcDayBbl = refreshWcDayBbl();
        }
   		return wcDayBbl;
	}

    public char[] getWcDayBblString() {
          return  wcDayBblString();
    }
	
	/**
	 * 	Update WcDayBbl with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-BBL
	 *	@param number
	 */
	public void setWcDayBbl(BigDecimal number) {	
     wcDayBbl = checkWcDayBblMaxLimit(number);
	    serializeWcDayBbl(wcDayBbl);
   }
	public BigDecimal getWcDayKb() throws CFException {
        if (isWcDayKbModified()) { 
           wcDayKb = refreshWcDayKb();
        }
   		return wcDayKb;
	}

    public char[] getWcDayKbString() {
          return  wcDayKbString();
    }
	
	/**
	 * 	Update WcDayKb with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-KB
	 *	@param number
	 */
	public void setWcDayKb(BigDecimal number) {	
     wcDayKb = checkWcDayKbMaxLimit(number);
	    serializeWcDayKb(wcDayKb);
   }
	public BigDecimal getWcDayLit() throws CFException {
        if (isWcDayLitModified()) { 
           wcDayLit = refreshWcDayLit();
        }
   		return wcDayLit;
	}

    public char[] getWcDayLitString() {
          return  wcDayLitString();
    }
	
	/**
	 * 	Update WcDayLit with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-LIT
	 *	@param number
	 */
	public void setWcDayLit(BigDecimal number) {	
     wcDayLit = checkWcDayLitMaxLimit(number);
	    serializeWcDayLit(wcDayLit);
   }
	public BigDecimal getWcDayM3() throws CFException {
        if (isWcDayM3Modified()) { 
           wcDayM3 = refreshWcDayM3();
        }
   		return wcDayM3;
	}

    public char[] getWcDayM3String() {
          return  wcDayM3String();
    }
	
	/**
	 * 	Update WcDayM3 with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-M3
	 *	@param number
	 */
	public void setWcDayM3(BigDecimal number) {	
     wcDayM3 = checkWcDayM3MaxLimit(number);
	    serializeWcDayM3(wcDayM3);
   }
	public BigDecimal getWcDayUsg() throws CFException {
        if (isWcDayUsgModified()) { 
           wcDayUsg = refreshWcDayUsg();
        }
   		return wcDayUsg;
	}

    public char[] getWcDayUsgString() {
          return  wcDayUsgString();
    }
	
	/**
	 * 	Update WcDayUsg with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-USG
	 *	@param number
	 */
	public void setWcDayUsg(BigDecimal number) {	
     wcDayUsg = checkWcDayUsgMaxLimit(number);
	    serializeWcDayUsg(wcDayUsg);
   }
	public BigDecimal getWcDayUkg() throws CFException {
        if (isWcDayUkgModified()) { 
           wcDayUkg = refreshWcDayUkg();
        }
   		return wcDayUkg;
	}

    public char[] getWcDayUkgString() {
          return  wcDayUkgString();
    }
	
	/**
	 * 	Update WcDayUkg with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-UKG
	 *	@param number
	 */
	public void setWcDayUkg(BigDecimal number) {	
     wcDayUkg = checkWcDayUkgMaxLimit(number);
	    serializeWcDayUkg(wcDayUkg);
   }
	public BigDecimal getWcDayMmb() throws CFException {
        if (isWcDayMmbModified()) { 
           wcDayMmb = refreshWcDayMmb();
        }
   		return wcDayMmb;
	}

    public char[] getWcDayMmbString() {
          return  wcDayMmbString();
    }
	
	/**
	 * 	Update WcDayMmb with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-MMB
	 *	@param number
	 */
	public void setWcDayMmb(BigDecimal number) {	
     wcDayMmb = checkWcDayMmbMaxLimit(number);
	    serializeWcDayMmb(wcDayMmb);
   }
	public BigDecimal getWcDayGbt() throws CFException {
        if (isWcDayGbtModified()) { 
           wcDayGbt = refreshWcDayGbt();
        }
   		return wcDayGbt;
	}

    public char[] getWcDayGbtString() {
          return  wcDayGbtString();
    }
	
	/**
	 * 	Update WcDayGbt with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-GBT
	 *	@param number
	 */
	public void setWcDayGbt(BigDecimal number) {	
     wcDayGbt = checkWcDayGbtMaxLimit(number);
	    serializeWcDayGbt(wcDayGbt);
   }
	public BigDecimal getWcDayThm() throws CFException {
        if (isWcDayThmModified()) { 
           wcDayThm = refreshWcDayThm();
        }
   		return wcDayThm;
	}

    public char[] getWcDayThmString() {
          return  wcDayThmString();
    }
	
	/**
	 * 	Update WcDayThm with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-THM
	 *	@param number
	 */
	public void setWcDayThm(BigDecimal number) {	
     wcDayThm = checkWcDayThmMaxLimit(number);
	    serializeWcDayThm(wcDayThm);
   }
	public BigDecimal getWcDayMwh() throws CFException {
        if (isWcDayMwhModified()) { 
           wcDayMwh = refreshWcDayMwh();
        }
   		return wcDayMwh;
	}

    public char[] getWcDayMwhString() {
          return  wcDayMwhString();
    }
	
	/**
	 * 	Update WcDayMwh with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-MWH
	 *	@param number
	 */
	public void setWcDayMwh(BigDecimal number) {	
     wcDayMwh = checkWcDayMwhMaxLimit(number);
	    serializeWcDayMwh(wcDayMwh);
   }
	public BigDecimal getWcDayGj() throws CFException {
        if (isWcDayGjModified()) { 
           wcDayGj = refreshWcDayGj();
        }
   		return wcDayGj;
	}

    public char[] getWcDayGjString() {
          return  wcDayGjString();
    }
	
	/**
	 * 	Update WcDayGj with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-GJ
	 *	@param number
	 */
	public void setWcDayGj(BigDecimal number) {	
     wcDayGj = checkWcDayGjMaxLimit(number);
	    serializeWcDayGj(wcDayGj);
   }
	public BigDecimal getWcDayDay() throws CFException {
        if (isWcDayDayModified()) { 
           wcDayDay = refreshWcDayDay();
        }
   		return wcDayDay;
	}

    public char[] getWcDayDayString() {
          return  wcDayDayString();
    }
	
	/**
	 * 	Update WcDayDay with the passed number
	 *  Corresponding COBOL Variable is WC-DAY-DAY
	 *	@param number
	 */
	public void setWcDayDay(BigDecimal number) {	
     wcDayDay = checkWcDayDayMaxLimit(number);
	    serializeWcDayDay(wcDayDay);
   }

	
	
	

		public static int getWcDayFieldLength() {
			return WC_DAY_LENGTH;
		}

}
  
