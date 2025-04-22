package com.cloudframe.app.comput3.dto;

/**
*  The class WcKiloBarrels is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcKiloBarrels extends WcKiloBarrelsSerialized { 
   

								private BigDecimal wcKbBbl = BigDecimal.ZERO;

								private BigDecimal wcKbKb = BigDecimal.ZERO;

								private BigDecimal wcKbLit = BigDecimal.ZERO;

								private BigDecimal wcKbM3 = BigDecimal.ZERO;

								private BigDecimal wcKbUsg = BigDecimal.ZERO;

								private BigDecimal wcKbUkg = BigDecimal.ZERO;

								private BigDecimal wcKbMmb = BigDecimal.ZERO;

								private BigDecimal wcKbGbt = BigDecimal.ZERO;

								private BigDecimal wcKbThm = BigDecimal.ZERO;

								private BigDecimal wcKbMwh = BigDecimal.ZERO;

								private BigDecimal wcKbGj = BigDecimal.ZERO;

								private BigDecimal wcKbDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcKiloBarrels
	**/
    public WcKiloBarrels() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcKiloBarrels. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcKiloBarrels(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcKbBbl(BigDecimal.valueOf(+10000000.0000).setScale(4));
								setWcKbKb(BigDecimal.valueOf(+10000.0000).setScale(4));
								setWcKbLit(BigDecimal.valueOf(+1589572405.0000).setScale(4));
								setWcKbM3(BigDecimal.valueOf(+1589572.4050).setScale(4));
								setWcKbUsg(BigDecimal.valueOf(+420000000.0000).setScale(4));
								setWcKbUkg(BigDecimal.valueOf(+349711488.0220).setScale(4));
								setWcKbMmb(BigDecimal.valueOf(+58000000.0000).setScale(4));
								setWcKbGbt(BigDecimal.valueOf(+58000.0000).setScale(4));
								setWcKbThm(BigDecimal.valueOf(+580000000.0000).setScale(4));
								setWcKbMwh(BigDecimal.valueOf(+1699812.2070).setScale(4));
								setWcKbGj(BigDecimal.valueOf(+52466017.2836).setScale(4));
								setWcKbDay(BigDecimal.valueOf(+10000000.0000).setScale(4));
    } 

	public BigDecimal getWcKbBbl() throws CFException {
        if (isWcKbBblModified()) { 
           wcKbBbl = refreshWcKbBbl();
        }
   		return wcKbBbl;
	}

    public char[] getWcKbBblString() {
          return  wcKbBblString();
    }
	
	/**
	 * 	Update WcKbBbl with the passed number
	 *  Corresponding COBOL Variable is WC-KB-BBL
	 *	@param number
	 */
	public void setWcKbBbl(BigDecimal number) {	
     wcKbBbl = checkWcKbBblMaxLimit(number);
	    serializeWcKbBbl(wcKbBbl);
   }
	public BigDecimal getWcKbKb() throws CFException {
        if (isWcKbKbModified()) { 
           wcKbKb = refreshWcKbKb();
        }
   		return wcKbKb;
	}

    public char[] getWcKbKbString() {
          return  wcKbKbString();
    }
	
	/**
	 * 	Update WcKbKb with the passed number
	 *  Corresponding COBOL Variable is WC-KB-KB
	 *	@param number
	 */
	public void setWcKbKb(BigDecimal number) {	
     wcKbKb = checkWcKbKbMaxLimit(number);
	    serializeWcKbKb(wcKbKb);
   }
	public BigDecimal getWcKbLit() throws CFException {
        if (isWcKbLitModified()) { 
           wcKbLit = refreshWcKbLit();
        }
   		return wcKbLit;
	}

    public char[] getWcKbLitString() {
          return  wcKbLitString();
    }
	
	/**
	 * 	Update WcKbLit with the passed number
	 *  Corresponding COBOL Variable is WC-KB-LIT
	 *	@param number
	 */
	public void setWcKbLit(BigDecimal number) {	
     wcKbLit = checkWcKbLitMaxLimit(number);
	    serializeWcKbLit(wcKbLit);
   }
	public BigDecimal getWcKbM3() throws CFException {
        if (isWcKbM3Modified()) { 
           wcKbM3 = refreshWcKbM3();
        }
   		return wcKbM3;
	}

    public char[] getWcKbM3String() {
          return  wcKbM3String();
    }
	
	/**
	 * 	Update WcKbM3 with the passed number
	 *  Corresponding COBOL Variable is WC-KB-M3
	 *	@param number
	 */
	public void setWcKbM3(BigDecimal number) {	
     wcKbM3 = checkWcKbM3MaxLimit(number);
	    serializeWcKbM3(wcKbM3);
   }
	public BigDecimal getWcKbUsg() throws CFException {
        if (isWcKbUsgModified()) { 
           wcKbUsg = refreshWcKbUsg();
        }
   		return wcKbUsg;
	}

    public char[] getWcKbUsgString() {
          return  wcKbUsgString();
    }
	
	/**
	 * 	Update WcKbUsg with the passed number
	 *  Corresponding COBOL Variable is WC-KB-USG
	 *	@param number
	 */
	public void setWcKbUsg(BigDecimal number) {	
     wcKbUsg = checkWcKbUsgMaxLimit(number);
	    serializeWcKbUsg(wcKbUsg);
   }
	public BigDecimal getWcKbUkg() throws CFException {
        if (isWcKbUkgModified()) { 
           wcKbUkg = refreshWcKbUkg();
        }
   		return wcKbUkg;
	}

    public char[] getWcKbUkgString() {
          return  wcKbUkgString();
    }
	
	/**
	 * 	Update WcKbUkg with the passed number
	 *  Corresponding COBOL Variable is WC-KB-UKG
	 *	@param number
	 */
	public void setWcKbUkg(BigDecimal number) {	
     wcKbUkg = checkWcKbUkgMaxLimit(number);
	    serializeWcKbUkg(wcKbUkg);
   }
	public BigDecimal getWcKbMmb() throws CFException {
        if (isWcKbMmbModified()) { 
           wcKbMmb = refreshWcKbMmb();
        }
   		return wcKbMmb;
	}

    public char[] getWcKbMmbString() {
          return  wcKbMmbString();
    }
	
	/**
	 * 	Update WcKbMmb with the passed number
	 *  Corresponding COBOL Variable is WC-KB-MMB
	 *	@param number
	 */
	public void setWcKbMmb(BigDecimal number) {	
     wcKbMmb = checkWcKbMmbMaxLimit(number);
	    serializeWcKbMmb(wcKbMmb);
   }
	public BigDecimal getWcKbGbt() throws CFException {
        if (isWcKbGbtModified()) { 
           wcKbGbt = refreshWcKbGbt();
        }
   		return wcKbGbt;
	}

    public char[] getWcKbGbtString() {
          return  wcKbGbtString();
    }
	
	/**
	 * 	Update WcKbGbt with the passed number
	 *  Corresponding COBOL Variable is WC-KB-GBT
	 *	@param number
	 */
	public void setWcKbGbt(BigDecimal number) {	
     wcKbGbt = checkWcKbGbtMaxLimit(number);
	    serializeWcKbGbt(wcKbGbt);
   }
	public BigDecimal getWcKbThm() throws CFException {
        if (isWcKbThmModified()) { 
           wcKbThm = refreshWcKbThm();
        }
   		return wcKbThm;
	}

    public char[] getWcKbThmString() {
          return  wcKbThmString();
    }
	
	/**
	 * 	Update WcKbThm with the passed number
	 *  Corresponding COBOL Variable is WC-KB-THM
	 *	@param number
	 */
	public void setWcKbThm(BigDecimal number) {	
     wcKbThm = checkWcKbThmMaxLimit(number);
	    serializeWcKbThm(wcKbThm);
   }
	public BigDecimal getWcKbMwh() throws CFException {
        if (isWcKbMwhModified()) { 
           wcKbMwh = refreshWcKbMwh();
        }
   		return wcKbMwh;
	}

    public char[] getWcKbMwhString() {
          return  wcKbMwhString();
    }
	
	/**
	 * 	Update WcKbMwh with the passed number
	 *  Corresponding COBOL Variable is WC-KB-MWH
	 *	@param number
	 */
	public void setWcKbMwh(BigDecimal number) {	
     wcKbMwh = checkWcKbMwhMaxLimit(number);
	    serializeWcKbMwh(wcKbMwh);
   }
	public BigDecimal getWcKbGj() throws CFException {
        if (isWcKbGjModified()) { 
           wcKbGj = refreshWcKbGj();
        }
   		return wcKbGj;
	}

    public char[] getWcKbGjString() {
          return  wcKbGjString();
    }
	
	/**
	 * 	Update WcKbGj with the passed number
	 *  Corresponding COBOL Variable is WC-KB-GJ
	 *	@param number
	 */
	public void setWcKbGj(BigDecimal number) {	
     wcKbGj = checkWcKbGjMaxLimit(number);
	    serializeWcKbGj(wcKbGj);
   }
	public BigDecimal getWcKbDay() throws CFException {
        if (isWcKbDayModified()) { 
           wcKbDay = refreshWcKbDay();
        }
   		return wcKbDay;
	}

    public char[] getWcKbDayString() {
          return  wcKbDayString();
    }
	
	/**
	 * 	Update WcKbDay with the passed number
	 *  Corresponding COBOL Variable is WC-KB-DAY
	 *	@param number
	 */
	public void setWcKbDay(BigDecimal number) {	
     wcKbDay = checkWcKbDayMaxLimit(number);
	    serializeWcKbDay(wcKbDay);
   }

	
	
	

		public static int getWcKiloBarrelsFieldLength() {
			return WC_KILO_BARRELS_LENGTH;
		}

}
  
