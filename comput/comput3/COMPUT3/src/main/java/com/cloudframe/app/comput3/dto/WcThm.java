package com.cloudframe.app.comput3.dto;

/**
*  The class WcThm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:21. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcThm extends WcThmSerialized { 
   

								private BigDecimal wcThmBbl = BigDecimal.ZERO;

								private BigDecimal wcThmKb = BigDecimal.ZERO;

								private BigDecimal wcThmLit = BigDecimal.ZERO;

								private BigDecimal wcThmM3 = BigDecimal.ZERO;

								private BigDecimal wcThmUsg = BigDecimal.ZERO;

								private BigDecimal wcThmUkg = BigDecimal.ZERO;

								private BigDecimal wcThmMmb = BigDecimal.ZERO;

								private BigDecimal wcThmGbt = BigDecimal.ZERO;

								private BigDecimal wcThmThm = BigDecimal.ZERO;

								private BigDecimal wcThmMwh = BigDecimal.ZERO;

								private BigDecimal wcThmGj = BigDecimal.ZERO;

								private BigDecimal wcThmDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcThm
	**/
    public WcThm() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcThm. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcThm(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcThmBbl(BigDecimal.valueOf(+17241379310.3448).setScale(4));
								setWcThmKb(BigDecimal.valueOf(+17241379.3104).setScale(4));
								setWcThmLit(BigDecimal.valueOf(+2740642077586.2100).setScale(4));
								setWcThmM3(BigDecimal.valueOf(+2740642077.5862).setScale(4));
								setWcThmUsg(BigDecimal.valueOf(+724137931034.4830).setScale(4));
								setWcThmUkg(BigDecimal.valueOf(+602950841417.2410).setScale(4));
								setWcThmMmb(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcThmGbt(BigDecimal.valueOf(+100000000.0000).setScale(4));
								setWcThmThm(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcThmMwh(BigDecimal.valueOf(+29307107017.2222).setScale(4));
								setWcThmGj(BigDecimal.valueOf(+105505585261.9999).setScale(4));
								setWcThmDay(BigDecimal.valueOf(+17241379310.3448).setScale(4));
    } 

	public BigDecimal getWcThmBbl() throws CFException {
        if (isWcThmBblModified()) { 
           wcThmBbl = refreshWcThmBbl();
        }
   		return wcThmBbl;
	}

    public char[] getWcThmBblString() {
          return  wcThmBblString();
    }
	
	/**
	 * 	Update WcThmBbl with the passed number
	 *  Corresponding COBOL Variable is WC-THM-BBL
	 *	@param number
	 */
	public void setWcThmBbl(BigDecimal number) {	
     wcThmBbl = checkWcThmBblMaxLimit(number);
	    serializeWcThmBbl(wcThmBbl);
   }
	public BigDecimal getWcThmKb() throws CFException {
        if (isWcThmKbModified()) { 
           wcThmKb = refreshWcThmKb();
        }
   		return wcThmKb;
	}

    public char[] getWcThmKbString() {
          return  wcThmKbString();
    }
	
	/**
	 * 	Update WcThmKb with the passed number
	 *  Corresponding COBOL Variable is WC-THM-KB
	 *	@param number
	 */
	public void setWcThmKb(BigDecimal number) {	
     wcThmKb = checkWcThmKbMaxLimit(number);
	    serializeWcThmKb(wcThmKb);
   }
	public BigDecimal getWcThmLit() throws CFException {
        if (isWcThmLitModified()) { 
           wcThmLit = refreshWcThmLit();
        }
   		return wcThmLit;
	}

    public char[] getWcThmLitString() {
          return  wcThmLitString();
    }
	
	/**
	 * 	Update WcThmLit with the passed number
	 *  Corresponding COBOL Variable is WC-THM-LIT
	 *	@param number
	 */
	public void setWcThmLit(BigDecimal number) {	
     wcThmLit = checkWcThmLitMaxLimit(number);
	    serializeWcThmLit(wcThmLit);
   }
	public BigDecimal getWcThmM3() throws CFException {
        if (isWcThmM3Modified()) { 
           wcThmM3 = refreshWcThmM3();
        }
   		return wcThmM3;
	}

    public char[] getWcThmM3String() {
          return  wcThmM3String();
    }
	
	/**
	 * 	Update WcThmM3 with the passed number
	 *  Corresponding COBOL Variable is WC-THM-M3
	 *	@param number
	 */
	public void setWcThmM3(BigDecimal number) {	
     wcThmM3 = checkWcThmM3MaxLimit(number);
	    serializeWcThmM3(wcThmM3);
   }
	public BigDecimal getWcThmUsg() throws CFException {
        if (isWcThmUsgModified()) { 
           wcThmUsg = refreshWcThmUsg();
        }
   		return wcThmUsg;
	}

    public char[] getWcThmUsgString() {
          return  wcThmUsgString();
    }
	
	/**
	 * 	Update WcThmUsg with the passed number
	 *  Corresponding COBOL Variable is WC-THM-USG
	 *	@param number
	 */
	public void setWcThmUsg(BigDecimal number) {	
     wcThmUsg = checkWcThmUsgMaxLimit(number);
	    serializeWcThmUsg(wcThmUsg);
   }
	public BigDecimal getWcThmUkg() throws CFException {
        if (isWcThmUkgModified()) { 
           wcThmUkg = refreshWcThmUkg();
        }
   		return wcThmUkg;
	}

    public char[] getWcThmUkgString() {
          return  wcThmUkgString();
    }
	
	/**
	 * 	Update WcThmUkg with the passed number
	 *  Corresponding COBOL Variable is WC-THM-UKG
	 *	@param number
	 */
	public void setWcThmUkg(BigDecimal number) {	
     wcThmUkg = checkWcThmUkgMaxLimit(number);
	    serializeWcThmUkg(wcThmUkg);
   }
	public BigDecimal getWcThmMmb() throws CFException {
        if (isWcThmMmbModified()) { 
           wcThmMmb = refreshWcThmMmb();
        }
   		return wcThmMmb;
	}

    public char[] getWcThmMmbString() {
          return  wcThmMmbString();
    }
	
	/**
	 * 	Update WcThmMmb with the passed number
	 *  Corresponding COBOL Variable is WC-THM-MMB
	 *	@param number
	 */
	public void setWcThmMmb(BigDecimal number) {	
     wcThmMmb = checkWcThmMmbMaxLimit(number);
	    serializeWcThmMmb(wcThmMmb);
   }
	public BigDecimal getWcThmGbt() throws CFException {
        if (isWcThmGbtModified()) { 
           wcThmGbt = refreshWcThmGbt();
        }
   		return wcThmGbt;
	}

    public char[] getWcThmGbtString() {
          return  wcThmGbtString();
    }
	
	/**
	 * 	Update WcThmGbt with the passed number
	 *  Corresponding COBOL Variable is WC-THM-GBT
	 *	@param number
	 */
	public void setWcThmGbt(BigDecimal number) {	
     wcThmGbt = checkWcThmGbtMaxLimit(number);
	    serializeWcThmGbt(wcThmGbt);
   }
	public BigDecimal getWcThmThm() throws CFException {
        if (isWcThmThmModified()) { 
           wcThmThm = refreshWcThmThm();
        }
   		return wcThmThm;
	}

    public char[] getWcThmThmString() {
          return  wcThmThmString();
    }
	
	/**
	 * 	Update WcThmThm with the passed number
	 *  Corresponding COBOL Variable is WC-THM-THM
	 *	@param number
	 */
	public void setWcThmThm(BigDecimal number) {	
     wcThmThm = checkWcThmThmMaxLimit(number);
	    serializeWcThmThm(wcThmThm);
   }
	public BigDecimal getWcThmMwh() throws CFException {
        if (isWcThmMwhModified()) { 
           wcThmMwh = refreshWcThmMwh();
        }
   		return wcThmMwh;
	}

    public char[] getWcThmMwhString() {
          return  wcThmMwhString();
    }
	
	/**
	 * 	Update WcThmMwh with the passed number
	 *  Corresponding COBOL Variable is WC-THM-MWH
	 *	@param number
	 */
	public void setWcThmMwh(BigDecimal number) {	
     wcThmMwh = checkWcThmMwhMaxLimit(number);
	    serializeWcThmMwh(wcThmMwh);
   }
	public BigDecimal getWcThmGj() throws CFException {
        if (isWcThmGjModified()) { 
           wcThmGj = refreshWcThmGj();
        }
   		return wcThmGj;
	}

    public char[] getWcThmGjString() {
          return  wcThmGjString();
    }
	
	/**
	 * 	Update WcThmGj with the passed number
	 *  Corresponding COBOL Variable is WC-THM-GJ
	 *	@param number
	 */
	public void setWcThmGj(BigDecimal number) {	
     wcThmGj = checkWcThmGjMaxLimit(number);
	    serializeWcThmGj(wcThmGj);
   }
	public BigDecimal getWcThmDay() throws CFException {
        if (isWcThmDayModified()) { 
           wcThmDay = refreshWcThmDay();
        }
   		return wcThmDay;
	}

    public char[] getWcThmDayString() {
          return  wcThmDayString();
    }
	
	/**
	 * 	Update WcThmDay with the passed number
	 *  Corresponding COBOL Variable is WC-THM-DAY
	 *	@param number
	 */
	public void setWcThmDay(BigDecimal number) {	
     wcThmDay = checkWcThmDayMaxLimit(number);
	    serializeWcThmDay(wcThmDay);
   }

	
	
	

		public static int getWcThmFieldLength() {
			return WC_THM_LENGTH;
		}

}
  
