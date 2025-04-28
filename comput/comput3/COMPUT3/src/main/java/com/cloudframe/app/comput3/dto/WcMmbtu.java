package com.cloudframe.app.comput3.dto;

/**
*  The class WcMmbtu is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcMmbtu extends WcMmbtuSerialized { 
   

								private BigDecimal wcMmbBbl = BigDecimal.ZERO;

								private BigDecimal wcMmbKb = BigDecimal.ZERO;

								private BigDecimal wcMmbLit = BigDecimal.ZERO;

								private BigDecimal wcMmbM3 = BigDecimal.ZERO;

								private BigDecimal wcMmbUsg = BigDecimal.ZERO;

								private BigDecimal wcMmbUkg = BigDecimal.ZERO;

								private BigDecimal wcMmbMmb = BigDecimal.ZERO;

								private BigDecimal wcMmbGbt = BigDecimal.ZERO;

								private BigDecimal wcMmbThm = BigDecimal.ZERO;

								private BigDecimal wcMmbMwh = BigDecimal.ZERO;

								private BigDecimal wcMmbGj = BigDecimal.ZERO;

								private BigDecimal wcMmbDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcMmbtu
	**/
    public WcMmbtu() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcMmbtu. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcMmbtu(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcMmbBbl(BigDecimal.valueOf(+1724137931.0345).setScale(4));
								setWcMmbKb(BigDecimal.valueOf(+1724137.9310).setScale(4));
								setWcMmbLit(BigDecimal.valueOf(+274064207758.6210).setScale(4));
								setWcMmbM3(BigDecimal.valueOf(+274064207.7586).setScale(4));
								setWcMmbUsg(BigDecimal.valueOf(+72413793103.4483).setScale(4));
								setWcMmbUkg(BigDecimal.valueOf(+60295084141.7241).setScale(4));
								setWcMmbMmb(BigDecimal.valueOf(+10000000000.0000).setScale(4));
								setWcMmbGbt(BigDecimal.valueOf(+10000000.0000).setScale(4));
								setWcMmbThm(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcMmbMwh(BigDecimal.valueOf(+2930710701.7222).setScale(4));
								setWcMmbGj(BigDecimal.valueOf(+10550558526.1999).setScale(4));
								setWcMmbDay(BigDecimal.valueOf(+1724137931.0345).setScale(4));
    } 

	public BigDecimal getWcMmbBbl() throws CFException {
        if (isWcMmbBblModified()) { 
           wcMmbBbl = refreshWcMmbBbl();
        }
   		return wcMmbBbl;
	}

    public char[] getWcMmbBblString() {
          return  wcMmbBblString();
    }
	
	/**
	 * 	Update WcMmbBbl with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-BBL
	 *	@param number
	 */
	public void setWcMmbBbl(BigDecimal number) {	
     wcMmbBbl = checkWcMmbBblMaxLimit(number);
	    serializeWcMmbBbl(wcMmbBbl);
   }
	public BigDecimal getWcMmbKb() throws CFException {
        if (isWcMmbKbModified()) { 
           wcMmbKb = refreshWcMmbKb();
        }
   		return wcMmbKb;
	}

    public char[] getWcMmbKbString() {
          return  wcMmbKbString();
    }
	
	/**
	 * 	Update WcMmbKb with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-KB
	 *	@param number
	 */
	public void setWcMmbKb(BigDecimal number) {	
     wcMmbKb = checkWcMmbKbMaxLimit(number);
	    serializeWcMmbKb(wcMmbKb);
   }
	public BigDecimal getWcMmbLit() throws CFException {
        if (isWcMmbLitModified()) { 
           wcMmbLit = refreshWcMmbLit();
        }
   		return wcMmbLit;
	}

    public char[] getWcMmbLitString() {
          return  wcMmbLitString();
    }
	
	/**
	 * 	Update WcMmbLit with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-LIT
	 *	@param number
	 */
	public void setWcMmbLit(BigDecimal number) {	
     wcMmbLit = checkWcMmbLitMaxLimit(number);
	    serializeWcMmbLit(wcMmbLit);
   }
	public BigDecimal getWcMmbM3() throws CFException {
        if (isWcMmbM3Modified()) { 
           wcMmbM3 = refreshWcMmbM3();
        }
   		return wcMmbM3;
	}

    public char[] getWcMmbM3String() {
          return  wcMmbM3String();
    }
	
	/**
	 * 	Update WcMmbM3 with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-M3
	 *	@param number
	 */
	public void setWcMmbM3(BigDecimal number) {	
     wcMmbM3 = checkWcMmbM3MaxLimit(number);
	    serializeWcMmbM3(wcMmbM3);
   }
	public BigDecimal getWcMmbUsg() throws CFException {
        if (isWcMmbUsgModified()) { 
           wcMmbUsg = refreshWcMmbUsg();
        }
   		return wcMmbUsg;
	}

    public char[] getWcMmbUsgString() {
          return  wcMmbUsgString();
    }
	
	/**
	 * 	Update WcMmbUsg with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-USG
	 *	@param number
	 */
	public void setWcMmbUsg(BigDecimal number) {	
     wcMmbUsg = checkWcMmbUsgMaxLimit(number);
	    serializeWcMmbUsg(wcMmbUsg);
   }
	public BigDecimal getWcMmbUkg() throws CFException {
        if (isWcMmbUkgModified()) { 
           wcMmbUkg = refreshWcMmbUkg();
        }
   		return wcMmbUkg;
	}

    public char[] getWcMmbUkgString() {
          return  wcMmbUkgString();
    }
	
	/**
	 * 	Update WcMmbUkg with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-UKG
	 *	@param number
	 */
	public void setWcMmbUkg(BigDecimal number) {	
     wcMmbUkg = checkWcMmbUkgMaxLimit(number);
	    serializeWcMmbUkg(wcMmbUkg);
   }
	public BigDecimal getWcMmbMmb() throws CFException {
        if (isWcMmbMmbModified()) { 
           wcMmbMmb = refreshWcMmbMmb();
        }
   		return wcMmbMmb;
	}

    public char[] getWcMmbMmbString() {
          return  wcMmbMmbString();
    }
	
	/**
	 * 	Update WcMmbMmb with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-MMB
	 *	@param number
	 */
	public void setWcMmbMmb(BigDecimal number) {	
     wcMmbMmb = checkWcMmbMmbMaxLimit(number);
	    serializeWcMmbMmb(wcMmbMmb);
   }
	public BigDecimal getWcMmbGbt() throws CFException {
        if (isWcMmbGbtModified()) { 
           wcMmbGbt = refreshWcMmbGbt();
        }
   		return wcMmbGbt;
	}

    public char[] getWcMmbGbtString() {
          return  wcMmbGbtString();
    }
	
	/**
	 * 	Update WcMmbGbt with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-GBT
	 *	@param number
	 */
	public void setWcMmbGbt(BigDecimal number) {	
     wcMmbGbt = checkWcMmbGbtMaxLimit(number);
	    serializeWcMmbGbt(wcMmbGbt);
   }
	public BigDecimal getWcMmbThm() throws CFException {
        if (isWcMmbThmModified()) { 
           wcMmbThm = refreshWcMmbThm();
        }
   		return wcMmbThm;
	}

    public char[] getWcMmbThmString() {
          return  wcMmbThmString();
    }
	
	/**
	 * 	Update WcMmbThm with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-THM
	 *	@param number
	 */
	public void setWcMmbThm(BigDecimal number) {	
     wcMmbThm = checkWcMmbThmMaxLimit(number);
	    serializeWcMmbThm(wcMmbThm);
   }
	public BigDecimal getWcMmbMwh() throws CFException {
        if (isWcMmbMwhModified()) { 
           wcMmbMwh = refreshWcMmbMwh();
        }
   		return wcMmbMwh;
	}

    public char[] getWcMmbMwhString() {
          return  wcMmbMwhString();
    }
	
	/**
	 * 	Update WcMmbMwh with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-MWH
	 *	@param number
	 */
	public void setWcMmbMwh(BigDecimal number) {	
     wcMmbMwh = checkWcMmbMwhMaxLimit(number);
	    serializeWcMmbMwh(wcMmbMwh);
   }
	public BigDecimal getWcMmbGj() throws CFException {
        if (isWcMmbGjModified()) { 
           wcMmbGj = refreshWcMmbGj();
        }
   		return wcMmbGj;
	}

    public char[] getWcMmbGjString() {
          return  wcMmbGjString();
    }
	
	/**
	 * 	Update WcMmbGj with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-GJ
	 *	@param number
	 */
	public void setWcMmbGj(BigDecimal number) {	
     wcMmbGj = checkWcMmbGjMaxLimit(number);
	    serializeWcMmbGj(wcMmbGj);
   }
	public BigDecimal getWcMmbDay() throws CFException {
        if (isWcMmbDayModified()) { 
           wcMmbDay = refreshWcMmbDay();
        }
   		return wcMmbDay;
	}

    public char[] getWcMmbDayString() {
          return  wcMmbDayString();
    }
	
	/**
	 * 	Update WcMmbDay with the passed number
	 *  Corresponding COBOL Variable is WC-MMB-DAY
	 *	@param number
	 */
	public void setWcMmbDay(BigDecimal number) {	
     wcMmbDay = checkWcMmbDayMaxLimit(number);
	    serializeWcMmbDay(wcMmbDay);
   }

	
	
	

		public static int getWcMmbtuFieldLength() {
			return WC_MMBTU_LENGTH;
		}

}
  
