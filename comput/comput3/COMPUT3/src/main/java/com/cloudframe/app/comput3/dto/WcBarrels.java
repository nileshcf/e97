package com.cloudframe.app.comput3.dto;

/**
*  The class WcBarrels is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcBarrels extends WcBarrelsSerialized { 
   

								private BigDecimal wcBblBbl = BigDecimal.ZERO;

								private BigDecimal wcBblKb = BigDecimal.ZERO;

								private BigDecimal wcBblLit = BigDecimal.ZERO;

								private BigDecimal wcBblM3 = BigDecimal.ZERO;

								private BigDecimal wcBblUsg = BigDecimal.ZERO;

								private BigDecimal wcBblUkg = BigDecimal.ZERO;

								private BigDecimal wcBblMmb = BigDecimal.ZERO;

								private BigDecimal wcBblGbt = BigDecimal.ZERO;

								private BigDecimal wcBblThm = BigDecimal.ZERO;

								private BigDecimal wcBblMwh = BigDecimal.ZERO;

								private BigDecimal wcBblGj = BigDecimal.ZERO;

								private BigDecimal wcBblDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcBarrels
	**/
    public WcBarrels() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcBarrels. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcBarrels(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcBblBbl(BigDecimal.valueOf(+1000000.0000).setScale(4));
								setWcBblKb(BigDecimal.valueOf(+1000.0000).setScale(4));
								setWcBblLit(BigDecimal.valueOf(+158957240.5000).setScale(4));
								setWcBblM3(BigDecimal.valueOf(+158957.2405).setScale(4));
								setWcBblUsg(BigDecimal.valueOf(+42000000.0000).setScale(4));
								setWcBblUkg(BigDecimal.valueOf(+34971148.8022).setScale(4));
								setWcBblMmb(BigDecimal.valueOf(+5800000.0000).setScale(4));
								setWcBblGbt(BigDecimal.valueOf(+5800.0000).setScale(4));
								setWcBblThm(BigDecimal.valueOf(+58000000.0000).setScale(4));
								setWcBblMwh(BigDecimal.valueOf(+1699812.2070).setScale(4));
								setWcBblGj(BigDecimal.valueOf(+5246601.7284).setScale(4));
								setWcBblDay(BigDecimal.valueOf(+1000000.0000).setScale(4));
    } 

	public BigDecimal getWcBblBbl() throws CFException {
        if (isWcBblBblModified()) { 
           wcBblBbl = refreshWcBblBbl();
        }
   		return wcBblBbl;
	}

    public char[] getWcBblBblString() {
          return  wcBblBblString();
    }
	
	/**
	 * 	Update WcBblBbl with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-BBL
	 *	@param number
	 */
	public void setWcBblBbl(BigDecimal number) {	
     wcBblBbl = checkWcBblBblMaxLimit(number);
	    serializeWcBblBbl(wcBblBbl);
   }
	public BigDecimal getWcBblKb() throws CFException {
        if (isWcBblKbModified()) { 
           wcBblKb = refreshWcBblKb();
        }
   		return wcBblKb;
	}

    public char[] getWcBblKbString() {
          return  wcBblKbString();
    }
	
	/**
	 * 	Update WcBblKb with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-KB
	 *	@param number
	 */
	public void setWcBblKb(BigDecimal number) {	
     wcBblKb = checkWcBblKbMaxLimit(number);
	    serializeWcBblKb(wcBblKb);
   }
	public BigDecimal getWcBblLit() throws CFException {
        if (isWcBblLitModified()) { 
           wcBblLit = refreshWcBblLit();
        }
   		return wcBblLit;
	}

    public char[] getWcBblLitString() {
          return  wcBblLitString();
    }
	
	/**
	 * 	Update WcBblLit with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-LIT
	 *	@param number
	 */
	public void setWcBblLit(BigDecimal number) {	
     wcBblLit = checkWcBblLitMaxLimit(number);
	    serializeWcBblLit(wcBblLit);
   }
	public BigDecimal getWcBblM3() throws CFException {
        if (isWcBblM3Modified()) { 
           wcBblM3 = refreshWcBblM3();
        }
   		return wcBblM3;
	}

    public char[] getWcBblM3String() {
          return  wcBblM3String();
    }
	
	/**
	 * 	Update WcBblM3 with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-M3
	 *	@param number
	 */
	public void setWcBblM3(BigDecimal number) {	
     wcBblM3 = checkWcBblM3MaxLimit(number);
	    serializeWcBblM3(wcBblM3);
   }
	public BigDecimal getWcBblUsg() throws CFException {
        if (isWcBblUsgModified()) { 
           wcBblUsg = refreshWcBblUsg();
        }
   		return wcBblUsg;
	}

    public char[] getWcBblUsgString() {
          return  wcBblUsgString();
    }
	
	/**
	 * 	Update WcBblUsg with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-USG
	 *	@param number
	 */
	public void setWcBblUsg(BigDecimal number) {	
     wcBblUsg = checkWcBblUsgMaxLimit(number);
	    serializeWcBblUsg(wcBblUsg);
   }
	public BigDecimal getWcBblUkg() throws CFException {
        if (isWcBblUkgModified()) { 
           wcBblUkg = refreshWcBblUkg();
        }
   		return wcBblUkg;
	}

    public char[] getWcBblUkgString() {
          return  wcBblUkgString();
    }
	
	/**
	 * 	Update WcBblUkg with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-UKG
	 *	@param number
	 */
	public void setWcBblUkg(BigDecimal number) {	
     wcBblUkg = checkWcBblUkgMaxLimit(number);
	    serializeWcBblUkg(wcBblUkg);
   }
	public BigDecimal getWcBblMmb() throws CFException {
        if (isWcBblMmbModified()) { 
           wcBblMmb = refreshWcBblMmb();
        }
   		return wcBblMmb;
	}

    public char[] getWcBblMmbString() {
          return  wcBblMmbString();
    }
	
	/**
	 * 	Update WcBblMmb with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-MMB
	 *	@param number
	 */
	public void setWcBblMmb(BigDecimal number) {	
     wcBblMmb = checkWcBblMmbMaxLimit(number);
	    serializeWcBblMmb(wcBblMmb);
   }
	public BigDecimal getWcBblGbt() throws CFException {
        if (isWcBblGbtModified()) { 
           wcBblGbt = refreshWcBblGbt();
        }
   		return wcBblGbt;
	}

    public char[] getWcBblGbtString() {
          return  wcBblGbtString();
    }
	
	/**
	 * 	Update WcBblGbt with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-GBT
	 *	@param number
	 */
	public void setWcBblGbt(BigDecimal number) {	
     wcBblGbt = checkWcBblGbtMaxLimit(number);
	    serializeWcBblGbt(wcBblGbt);
   }
	public BigDecimal getWcBblThm() throws CFException {
        if (isWcBblThmModified()) { 
           wcBblThm = refreshWcBblThm();
        }
   		return wcBblThm;
	}

    public char[] getWcBblThmString() {
          return  wcBblThmString();
    }
	
	/**
	 * 	Update WcBblThm with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-THM
	 *	@param number
	 */
	public void setWcBblThm(BigDecimal number) {	
     wcBblThm = checkWcBblThmMaxLimit(number);
	    serializeWcBblThm(wcBblThm);
   }
	public BigDecimal getWcBblMwh() throws CFException {
        if (isWcBblMwhModified()) { 
           wcBblMwh = refreshWcBblMwh();
        }
   		return wcBblMwh;
	}

    public char[] getWcBblMwhString() {
          return  wcBblMwhString();
    }
	
	/**
	 * 	Update WcBblMwh with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-MWH
	 *	@param number
	 */
	public void setWcBblMwh(BigDecimal number) {	
     wcBblMwh = checkWcBblMwhMaxLimit(number);
	    serializeWcBblMwh(wcBblMwh);
   }
	public BigDecimal getWcBblGj() throws CFException {
        if (isWcBblGjModified()) { 
           wcBblGj = refreshWcBblGj();
        }
   		return wcBblGj;
	}

    public char[] getWcBblGjString() {
          return  wcBblGjString();
    }
	
	/**
	 * 	Update WcBblGj with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-GJ
	 *	@param number
	 */
	public void setWcBblGj(BigDecimal number) {	
     wcBblGj = checkWcBblGjMaxLimit(number);
	    serializeWcBblGj(wcBblGj);
   }
	public BigDecimal getWcBblDay() throws CFException {
        if (isWcBblDayModified()) { 
           wcBblDay = refreshWcBblDay();
        }
   		return wcBblDay;
	}

    public char[] getWcBblDayString() {
          return  wcBblDayString();
    }
	
	/**
	 * 	Update WcBblDay with the passed number
	 *  Corresponding COBOL Variable is WC-BBL-DAY
	 *	@param number
	 */
	public void setWcBblDay(BigDecimal number) {	
     wcBblDay = checkWcBblDayMaxLimit(number);
	    serializeWcBblDay(wcBblDay);
   }

	
	
	

		public static int getWcBarrelsFieldLength() {
			return WC_BARRELS_LENGTH;
		}

}
  
