package com.cloudframe.app.comput3.dto;

/**
*  The class WcLitres is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcLitres extends WcLitresSerialized { 
   

								private BigDecimal wcLitBbl = BigDecimal.ZERO;

								private BigDecimal wcLitKb = BigDecimal.ZERO;

								private BigDecimal wcLitLit = BigDecimal.ZERO;

								private BigDecimal wcLitM3 = BigDecimal.ZERO;

								private BigDecimal wcLitUsg = BigDecimal.ZERO;

								private BigDecimal wcLitUkg = BigDecimal.ZERO;

								private BigDecimal wcLitMmb = BigDecimal.ZERO;

								private BigDecimal wcLitGbt = BigDecimal.ZERO;

								private BigDecimal wcLitThm = BigDecimal.ZERO;

								private BigDecimal wcLitMwh = BigDecimal.ZERO;

								private BigDecimal wcLitGj = BigDecimal.ZERO;

								private BigDecimal wcLitDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcLitres
	**/
    public WcLitres() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcLitres. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcLitres(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcLitBbl(BigDecimal.valueOf(+629100000.0000).setScale(4));
								setWcLitKb(BigDecimal.valueOf(+629100.0000).setScale(4));
								setWcLitLit(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcLitM3(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcLitUsg(BigDecimal.valueOf(+26422200000.0000).setScale(4));
								setWcLitUkg(BigDecimal.valueOf(22000349711L).setScale(4));
								setWcLitMmb(BigDecimal.valueOf(+3648780000.0529).setScale(4));
								setWcLitGbt(BigDecimal.valueOf(+3648780.0000).setScale(4));
								setWcLitThm(BigDecimal.valueOf(+36487800000.5291).setScale(4));
								setWcLitMwh(BigDecimal.valueOf(+1069351859.4385).setScale(4));
								setWcLitGj(BigDecimal.valueOf(3300000000L).setScale(4));
								setWcLitDay(BigDecimal.valueOf(+629100000.0000).setScale(4));
    } 

	public BigDecimal getWcLitBbl() throws CFException {
        if (isWcLitBblModified()) { 
           wcLitBbl = refreshWcLitBbl();
        }
   		return wcLitBbl;
	}

    public char[] getWcLitBblString() {
          return  wcLitBblString();
    }
	
	/**
	 * 	Update WcLitBbl with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-BBL
	 *	@param number
	 */
	public void setWcLitBbl(BigDecimal number) {	
     wcLitBbl = checkWcLitBblMaxLimit(number);
	    serializeWcLitBbl(wcLitBbl);
   }
	public BigDecimal getWcLitKb() throws CFException {
        if (isWcLitKbModified()) { 
           wcLitKb = refreshWcLitKb();
        }
   		return wcLitKb;
	}

    public char[] getWcLitKbString() {
          return  wcLitKbString();
    }
	
	/**
	 * 	Update WcLitKb with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-KB
	 *	@param number
	 */
	public void setWcLitKb(BigDecimal number) {	
     wcLitKb = checkWcLitKbMaxLimit(number);
	    serializeWcLitKb(wcLitKb);
   }
	public BigDecimal getWcLitLit() throws CFException {
        if (isWcLitLitModified()) { 
           wcLitLit = refreshWcLitLit();
        }
   		return wcLitLit;
	}

    public char[] getWcLitLitString() {
          return  wcLitLitString();
    }
	
	/**
	 * 	Update WcLitLit with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-LIT
	 *	@param number
	 */
	public void setWcLitLit(BigDecimal number) {	
     wcLitLit = checkWcLitLitMaxLimit(number);
	    serializeWcLitLit(wcLitLit);
   }
	public BigDecimal getWcLitM3() throws CFException {
        if (isWcLitM3Modified()) { 
           wcLitM3 = refreshWcLitM3();
        }
   		return wcLitM3;
	}

    public char[] getWcLitM3String() {
          return  wcLitM3String();
    }
	
	/**
	 * 	Update WcLitM3 with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-M3
	 *	@param number
	 */
	public void setWcLitM3(BigDecimal number) {	
     wcLitM3 = checkWcLitM3MaxLimit(number);
	    serializeWcLitM3(wcLitM3);
   }
	public BigDecimal getWcLitUsg() throws CFException {
        if (isWcLitUsgModified()) { 
           wcLitUsg = refreshWcLitUsg();
        }
   		return wcLitUsg;
	}

    public char[] getWcLitUsgString() {
          return  wcLitUsgString();
    }
	
	/**
	 * 	Update WcLitUsg with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-USG
	 *	@param number
	 */
	public void setWcLitUsg(BigDecimal number) {	
     wcLitUsg = checkWcLitUsgMaxLimit(number);
	    serializeWcLitUsg(wcLitUsg);
   }
	public BigDecimal getWcLitUkg() throws CFException {
        if (isWcLitUkgModified()) { 
           wcLitUkg = refreshWcLitUkg();
        }
   		return wcLitUkg;
	}

    public char[] getWcLitUkgString() {
          return  wcLitUkgString();
    }
	
	/**
	 * 	Update WcLitUkg with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-UKG
	 *	@param number
	 */
	public void setWcLitUkg(BigDecimal number) {	
     wcLitUkg = checkWcLitUkgMaxLimit(number);
	    serializeWcLitUkg(wcLitUkg);
   }
	public BigDecimal getWcLitMmb() throws CFException {
        if (isWcLitMmbModified()) { 
           wcLitMmb = refreshWcLitMmb();
        }
   		return wcLitMmb;
	}

    public char[] getWcLitMmbString() {
          return  wcLitMmbString();
    }
	
	/**
	 * 	Update WcLitMmb with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-MMB
	 *	@param number
	 */
	public void setWcLitMmb(BigDecimal number) {	
     wcLitMmb = checkWcLitMmbMaxLimit(number);
	    serializeWcLitMmb(wcLitMmb);
   }
	public BigDecimal getWcLitGbt() throws CFException {
        if (isWcLitGbtModified()) { 
           wcLitGbt = refreshWcLitGbt();
        }
   		return wcLitGbt;
	}

    public char[] getWcLitGbtString() {
          return  wcLitGbtString();
    }
	
	/**
	 * 	Update WcLitGbt with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-GBT
	 *	@param number
	 */
	public void setWcLitGbt(BigDecimal number) {	
     wcLitGbt = checkWcLitGbtMaxLimit(number);
	    serializeWcLitGbt(wcLitGbt);
   }
	public BigDecimal getWcLitThm() throws CFException {
        if (isWcLitThmModified()) { 
           wcLitThm = refreshWcLitThm();
        }
   		return wcLitThm;
	}

    public char[] getWcLitThmString() {
          return  wcLitThmString();
    }
	
	/**
	 * 	Update WcLitThm with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-THM
	 *	@param number
	 */
	public void setWcLitThm(BigDecimal number) {	
     wcLitThm = checkWcLitThmMaxLimit(number);
	    serializeWcLitThm(wcLitThm);
   }
	public BigDecimal getWcLitMwh() throws CFException {
        if (isWcLitMwhModified()) { 
           wcLitMwh = refreshWcLitMwh();
        }
   		return wcLitMwh;
	}

    public char[] getWcLitMwhString() {
          return  wcLitMwhString();
    }
	
	/**
	 * 	Update WcLitMwh with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-MWH
	 *	@param number
	 */
	public void setWcLitMwh(BigDecimal number) {	
     wcLitMwh = checkWcLitMwhMaxLimit(number);
	    serializeWcLitMwh(wcLitMwh);
   }
	public BigDecimal getWcLitGj() throws CFException {
        if (isWcLitGjModified()) { 
           wcLitGj = refreshWcLitGj();
        }
   		return wcLitGj;
	}

    public char[] getWcLitGjString() {
          return  wcLitGjString();
    }
	
	/**
	 * 	Update WcLitGj with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-GJ
	 *	@param number
	 */
	public void setWcLitGj(BigDecimal number) {	
     wcLitGj = checkWcLitGjMaxLimit(number);
	    serializeWcLitGj(wcLitGj);
   }
	public BigDecimal getWcLitDay() throws CFException {
        if (isWcLitDayModified()) { 
           wcLitDay = refreshWcLitDay();
        }
   		return wcLitDay;
	}

    public char[] getWcLitDayString() {
          return  wcLitDayString();
    }
	
	/**
	 * 	Update WcLitDay with the passed number
	 *  Corresponding COBOL Variable is WC-LIT-DAY
	 *	@param number
	 */
	public void setWcLitDay(BigDecimal number) {	
     wcLitDay = checkWcLitDayMaxLimit(number);
	    serializeWcLitDay(wcLitDay);
   }

	
	
	

		public static int getWcLitresFieldLength() {
			return WC_LITRES_LENGTH;
		}

}
  
