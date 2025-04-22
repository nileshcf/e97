package com.cloudframe.app.comput3.dto;

/**
*  The class WcCubicMetres is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcCubicMetres extends WcCubicMetresSerialized { 
   

								private BigDecimal wcM3Bbl = BigDecimal.ZERO;

								private BigDecimal wcM3Kb = BigDecimal.ZERO;

								private BigDecimal wcM3Lit = BigDecimal.ZERO;

								private BigDecimal wcM3M3 = BigDecimal.ZERO;

								private BigDecimal wcM3Usg = BigDecimal.ZERO;

								private BigDecimal wcM3Ukg = BigDecimal.ZERO;

								private BigDecimal wcM3Mmb = BigDecimal.ZERO;

								private BigDecimal wcM3Gbt = BigDecimal.ZERO;

								private BigDecimal wcM3Thm = BigDecimal.ZERO;

								private BigDecimal wcM3Mwh = BigDecimal.ZERO;

								private BigDecimal wcM3Gj = BigDecimal.ZERO;

								private BigDecimal wcM3Day = BigDecimal.ZERO;
	
	/**
	* Constructor for WcCubicMetres
	**/
    public WcCubicMetres() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcCubicMetres. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcCubicMetres(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcM3Bbl(BigDecimal.valueOf(+629100000.0000).setScale(4));
								setWcM3Kb(BigDecimal.valueOf(+629100.0000).setScale(4));
								setWcM3Lit(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcM3M3(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcM3Usg(BigDecimal.valueOf(+26415093600.0000).setScale(4));
								setWcM3Ukg(BigDecimal.valueOf(+21994432080.0000).setScale(4));
								setWcM3Mmb(BigDecimal.valueOf(+3648780000.05300).setScale(4));
								setWcM3Gbt(BigDecimal.valueOf(+3648780.0000).setScale(4));
								setWcM3Thm(BigDecimal.valueOf(+36487800000.0529).setScale(4));
								setWcM3Mwh(BigDecimal.valueOf(+1069351859.4385).setScale(4));
								setWcM3Gj(BigDecimal.valueOf(3300000000L).setScale(4));
								setWcM3Day(BigDecimal.valueOf(+629100000.0000).setScale(4));
    } 

	public BigDecimal getWcM3Bbl() throws CFException {
        if (isWcM3BblModified()) { 
           wcM3Bbl = refreshWcM3Bbl();
        }
   		return wcM3Bbl;
	}

    public char[] getWcM3BblString() {
          return  wcM3BblString();
    }
	
	/**
	 * 	Update WcM3Bbl with the passed number
	 *  Corresponding COBOL Variable is WC-M3-BBL
	 *	@param number
	 */
	public void setWcM3Bbl(BigDecimal number) {	
     wcM3Bbl = checkWcM3BblMaxLimit(number);
	    serializeWcM3Bbl(wcM3Bbl);
   }
	public BigDecimal getWcM3Kb() throws CFException {
        if (isWcM3KbModified()) { 
           wcM3Kb = refreshWcM3Kb();
        }
   		return wcM3Kb;
	}

    public char[] getWcM3KbString() {
          return  wcM3KbString();
    }
	
	/**
	 * 	Update WcM3Kb with the passed number
	 *  Corresponding COBOL Variable is WC-M3-KB
	 *	@param number
	 */
	public void setWcM3Kb(BigDecimal number) {	
     wcM3Kb = checkWcM3KbMaxLimit(number);
	    serializeWcM3Kb(wcM3Kb);
   }
	public BigDecimal getWcM3Lit() throws CFException {
        if (isWcM3LitModified()) { 
           wcM3Lit = refreshWcM3Lit();
        }
   		return wcM3Lit;
	}

    public char[] getWcM3LitString() {
          return  wcM3LitString();
    }
	
	/**
	 * 	Update WcM3Lit with the passed number
	 *  Corresponding COBOL Variable is WC-M3-LIT
	 *	@param number
	 */
	public void setWcM3Lit(BigDecimal number) {	
     wcM3Lit = checkWcM3LitMaxLimit(number);
	    serializeWcM3Lit(wcM3Lit);
   }
	public BigDecimal getWcM3M3() throws CFException {
        if (isWcM3M3Modified()) { 
           wcM3M3 = refreshWcM3M3();
        }
   		return wcM3M3;
	}

    public char[] getWcM3M3String() {
          return  wcM3M3String();
    }
	
	/**
	 * 	Update WcM3M3 with the passed number
	 *  Corresponding COBOL Variable is WC-M3-M3
	 *	@param number
	 */
	public void setWcM3M3(BigDecimal number) {	
     wcM3M3 = checkWcM3M3MaxLimit(number);
	    serializeWcM3M3(wcM3M3);
   }
	public BigDecimal getWcM3Usg() throws CFException {
        if (isWcM3UsgModified()) { 
           wcM3Usg = refreshWcM3Usg();
        }
   		return wcM3Usg;
	}

    public char[] getWcM3UsgString() {
          return  wcM3UsgString();
    }
	
	/**
	 * 	Update WcM3Usg with the passed number
	 *  Corresponding COBOL Variable is WC-M3-USG
	 *	@param number
	 */
	public void setWcM3Usg(BigDecimal number) {	
     wcM3Usg = checkWcM3UsgMaxLimit(number);
	    serializeWcM3Usg(wcM3Usg);
   }
	public BigDecimal getWcM3Ukg() throws CFException {
        if (isWcM3UkgModified()) { 
           wcM3Ukg = refreshWcM3Ukg();
        }
   		return wcM3Ukg;
	}

    public char[] getWcM3UkgString() {
          return  wcM3UkgString();
    }
	
	/**
	 * 	Update WcM3Ukg with the passed number
	 *  Corresponding COBOL Variable is WC-M3-UKG
	 *	@param number
	 */
	public void setWcM3Ukg(BigDecimal number) {	
     wcM3Ukg = checkWcM3UkgMaxLimit(number);
	    serializeWcM3Ukg(wcM3Ukg);
   }
	public BigDecimal getWcM3Mmb() throws CFException {
        if (isWcM3MmbModified()) { 
           wcM3Mmb = refreshWcM3Mmb();
        }
   		return wcM3Mmb;
	}

    public char[] getWcM3MmbString() {
          return  wcM3MmbString();
    }
	
	/**
	 * 	Update WcM3Mmb with the passed number
	 *  Corresponding COBOL Variable is WC-M3-MMB
	 *	@param number
	 */
	public void setWcM3Mmb(BigDecimal number) {	
     wcM3Mmb = checkWcM3MmbMaxLimit(number);
	    serializeWcM3Mmb(wcM3Mmb);
   }
	public BigDecimal getWcM3Gbt() throws CFException {
        if (isWcM3GbtModified()) { 
           wcM3Gbt = refreshWcM3Gbt();
        }
   		return wcM3Gbt;
	}

    public char[] getWcM3GbtString() {
          return  wcM3GbtString();
    }
	
	/**
	 * 	Update WcM3Gbt with the passed number
	 *  Corresponding COBOL Variable is WC-M3-GBT
	 *	@param number
	 */
	public void setWcM3Gbt(BigDecimal number) {	
     wcM3Gbt = checkWcM3GbtMaxLimit(number);
	    serializeWcM3Gbt(wcM3Gbt);
   }
	public BigDecimal getWcM3Thm() throws CFException {
        if (isWcM3ThmModified()) { 
           wcM3Thm = refreshWcM3Thm();
        }
   		return wcM3Thm;
	}

    public char[] getWcM3ThmString() {
          return  wcM3ThmString();
    }
	
	/**
	 * 	Update WcM3Thm with the passed number
	 *  Corresponding COBOL Variable is WC-M3-THM
	 *	@param number
	 */
	public void setWcM3Thm(BigDecimal number) {	
     wcM3Thm = checkWcM3ThmMaxLimit(number);
	    serializeWcM3Thm(wcM3Thm);
   }
	public BigDecimal getWcM3Mwh() throws CFException {
        if (isWcM3MwhModified()) { 
           wcM3Mwh = refreshWcM3Mwh();
        }
   		return wcM3Mwh;
	}

    public char[] getWcM3MwhString() {
          return  wcM3MwhString();
    }
	
	/**
	 * 	Update WcM3Mwh with the passed number
	 *  Corresponding COBOL Variable is WC-M3-MWH
	 *	@param number
	 */
	public void setWcM3Mwh(BigDecimal number) {	
     wcM3Mwh = checkWcM3MwhMaxLimit(number);
	    serializeWcM3Mwh(wcM3Mwh);
   }
	public BigDecimal getWcM3Gj() throws CFException {
        if (isWcM3GjModified()) { 
           wcM3Gj = refreshWcM3Gj();
        }
   		return wcM3Gj;
	}

    public char[] getWcM3GjString() {
          return  wcM3GjString();
    }
	
	/**
	 * 	Update WcM3Gj with the passed number
	 *  Corresponding COBOL Variable is WC-M3-GJ
	 *	@param number
	 */
	public void setWcM3Gj(BigDecimal number) {	
     wcM3Gj = checkWcM3GjMaxLimit(number);
	    serializeWcM3Gj(wcM3Gj);
   }
	public BigDecimal getWcM3Day() throws CFException {
        if (isWcM3DayModified()) { 
           wcM3Day = refreshWcM3Day();
        }
   		return wcM3Day;
	}

    public char[] getWcM3DayString() {
          return  wcM3DayString();
    }
	
	/**
	 * 	Update WcM3Day with the passed number
	 *  Corresponding COBOL Variable is WC-M3-DAY
	 *	@param number
	 */
	public void setWcM3Day(BigDecimal number) {	
     wcM3Day = checkWcM3DayMaxLimit(number);
	    serializeWcM3Day(wcM3Day);
   }

	
	
	

		public static int getWcCubicMetresFieldLength() {
			return WC_CUBIC_METRES_LENGTH;
		}

}
  
