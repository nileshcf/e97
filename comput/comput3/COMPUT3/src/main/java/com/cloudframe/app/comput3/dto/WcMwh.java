package com.cloudframe.app.comput3.dto;

/**
*  The class WcMwh is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcMwh extends WcMwhSerialized { 
   

								private BigDecimal wcMwhBbl = BigDecimal.ZERO;

								private BigDecimal wcMwhKb = BigDecimal.ZERO;

								private BigDecimal wcMwhLit = BigDecimal.ZERO;

								private BigDecimal wcMwhM3 = BigDecimal.ZERO;

								private BigDecimal wcMwhUsg = BigDecimal.ZERO;

								private BigDecimal wcMwhUkg = BigDecimal.ZERO;

								private BigDecimal wcMwhMmb = BigDecimal.ZERO;

								private BigDecimal wcMwhGbt = BigDecimal.ZERO;

								private BigDecimal wcMwhThm = BigDecimal.ZERO;

								private BigDecimal wcMwhMwh = BigDecimal.ZERO;

								private BigDecimal wcMwhGj = BigDecimal.ZERO;

								private BigDecimal wcMwhDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcMwh
	**/
    public WcMwh() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcMwh. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcMwh(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcMwhBbl(BigDecimal.valueOf(+58830028157.2406).setScale(4));
								setWcMwhKb(BigDecimal.valueOf(+588300281.5724).setScale(4));
								setWcMwhLit(BigDecimal.valueOf(+9351458934434.1610).setScale(4));
								setWcMwhM3(BigDecimal.valueOf(+9351458934.4342).setScale(4));
								setWcMwhUsg(BigDecimal.valueOf(+2470861182609.8884).setScale(4));
								setWcMwhUkg(BigDecimal.valueOf(+2057353668729.2903).setScale(4));
								setWcMwhMmb(BigDecimal.valueOf(+341214163312.7940).setScale(4));
								setWcMwhGbt(BigDecimal.valueOf(+341214163.3128).setScale(4));
								setWcMwhThm(BigDecimal.valueOf(+3412141633127.9400).setScale(4));
								setWcMwhMwh(BigDecimal.valueOf(+100000000000.0000).setScale(4));
								setWcMwhGj(BigDecimal.valueOf(+360000000000.0000).setScale(4));
								setWcMwhDay(BigDecimal.valueOf(+58830028157.2406).setScale(4));
    } 

	public BigDecimal getWcMwhBbl() throws CFException {
        if (isWcMwhBblModified()) { 
           wcMwhBbl = refreshWcMwhBbl();
        }
   		return wcMwhBbl;
	}

    public char[] getWcMwhBblString() {
          return  wcMwhBblString();
    }
	
	/**
	 * 	Update WcMwhBbl with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-BBL
	 *	@param number
	 */
	public void setWcMwhBbl(BigDecimal number) {	
     wcMwhBbl = checkWcMwhBblMaxLimit(number);
	    serializeWcMwhBbl(wcMwhBbl);
   }
	public BigDecimal getWcMwhKb() throws CFException {
        if (isWcMwhKbModified()) { 
           wcMwhKb = refreshWcMwhKb();
        }
   		return wcMwhKb;
	}

    public char[] getWcMwhKbString() {
          return  wcMwhKbString();
    }
	
	/**
	 * 	Update WcMwhKb with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-KB
	 *	@param number
	 */
	public void setWcMwhKb(BigDecimal number) {	
     wcMwhKb = checkWcMwhKbMaxLimit(number);
	    serializeWcMwhKb(wcMwhKb);
   }
	public BigDecimal getWcMwhLit() throws CFException {
        if (isWcMwhLitModified()) { 
           wcMwhLit = refreshWcMwhLit();
        }
   		return wcMwhLit;
	}

    public char[] getWcMwhLitString() {
          return  wcMwhLitString();
    }
	
	/**
	 * 	Update WcMwhLit with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-LIT
	 *	@param number
	 */
	public void setWcMwhLit(BigDecimal number) {	
     wcMwhLit = checkWcMwhLitMaxLimit(number);
	    serializeWcMwhLit(wcMwhLit);
   }
	public BigDecimal getWcMwhM3() throws CFException {
        if (isWcMwhM3Modified()) { 
           wcMwhM3 = refreshWcMwhM3();
        }
   		return wcMwhM3;
	}

    public char[] getWcMwhM3String() {
          return  wcMwhM3String();
    }
	
	/**
	 * 	Update WcMwhM3 with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-M3
	 *	@param number
	 */
	public void setWcMwhM3(BigDecimal number) {	
     wcMwhM3 = checkWcMwhM3MaxLimit(number);
	    serializeWcMwhM3(wcMwhM3);
   }
	public BigDecimal getWcMwhUsg() throws CFException {
        if (isWcMwhUsgModified()) { 
           wcMwhUsg = refreshWcMwhUsg();
        }
   		return wcMwhUsg;
	}

    public char[] getWcMwhUsgString() {
          return  wcMwhUsgString();
    }
	
	/**
	 * 	Update WcMwhUsg with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-USG
	 *	@param number
	 */
	public void setWcMwhUsg(BigDecimal number) {	
     wcMwhUsg = checkWcMwhUsgMaxLimit(number);
	    serializeWcMwhUsg(wcMwhUsg);
   }
	public BigDecimal getWcMwhUkg() throws CFException {
        if (isWcMwhUkgModified()) { 
           wcMwhUkg = refreshWcMwhUkg();
        }
   		return wcMwhUkg;
	}

    public char[] getWcMwhUkgString() {
          return  wcMwhUkgString();
    }
	
	/**
	 * 	Update WcMwhUkg with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-UKG
	 *	@param number
	 */
	public void setWcMwhUkg(BigDecimal number) {	
     wcMwhUkg = checkWcMwhUkgMaxLimit(number);
	    serializeWcMwhUkg(wcMwhUkg);
   }
	public BigDecimal getWcMwhMmb() throws CFException {
        if (isWcMwhMmbModified()) { 
           wcMwhMmb = refreshWcMwhMmb();
        }
   		return wcMwhMmb;
	}

    public char[] getWcMwhMmbString() {
          return  wcMwhMmbString();
    }
	
	/**
	 * 	Update WcMwhMmb with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-MMB
	 *	@param number
	 */
	public void setWcMwhMmb(BigDecimal number) {	
     wcMwhMmb = checkWcMwhMmbMaxLimit(number);
	    serializeWcMwhMmb(wcMwhMmb);
   }
	public BigDecimal getWcMwhGbt() throws CFException {
        if (isWcMwhGbtModified()) { 
           wcMwhGbt = refreshWcMwhGbt();
        }
   		return wcMwhGbt;
	}

    public char[] getWcMwhGbtString() {
          return  wcMwhGbtString();
    }
	
	/**
	 * 	Update WcMwhGbt with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-GBT
	 *	@param number
	 */
	public void setWcMwhGbt(BigDecimal number) {	
     wcMwhGbt = checkWcMwhGbtMaxLimit(number);
	    serializeWcMwhGbt(wcMwhGbt);
   }
	public BigDecimal getWcMwhThm() throws CFException {
        if (isWcMwhThmModified()) { 
           wcMwhThm = refreshWcMwhThm();
        }
   		return wcMwhThm;
	}

    public char[] getWcMwhThmString() {
          return  wcMwhThmString();
    }
	
	/**
	 * 	Update WcMwhThm with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-THM
	 *	@param number
	 */
	public void setWcMwhThm(BigDecimal number) {	
     wcMwhThm = checkWcMwhThmMaxLimit(number);
	    serializeWcMwhThm(wcMwhThm);
   }
	public BigDecimal getWcMwhMwh() throws CFException {
        if (isWcMwhMwhModified()) { 
           wcMwhMwh = refreshWcMwhMwh();
        }
   		return wcMwhMwh;
	}

    public char[] getWcMwhMwhString() {
          return  wcMwhMwhString();
    }
	
	/**
	 * 	Update WcMwhMwh with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-MWH
	 *	@param number
	 */
	public void setWcMwhMwh(BigDecimal number) {	
     wcMwhMwh = checkWcMwhMwhMaxLimit(number);
	    serializeWcMwhMwh(wcMwhMwh);
   }
	public BigDecimal getWcMwhGj() throws CFException {
        if (isWcMwhGjModified()) { 
           wcMwhGj = refreshWcMwhGj();
        }
   		return wcMwhGj;
	}

    public char[] getWcMwhGjString() {
          return  wcMwhGjString();
    }
	
	/**
	 * 	Update WcMwhGj with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-GJ
	 *	@param number
	 */
	public void setWcMwhGj(BigDecimal number) {	
     wcMwhGj = checkWcMwhGjMaxLimit(number);
	    serializeWcMwhGj(wcMwhGj);
   }
	public BigDecimal getWcMwhDay() throws CFException {
        if (isWcMwhDayModified()) { 
           wcMwhDay = refreshWcMwhDay();
        }
   		return wcMwhDay;
	}

    public char[] getWcMwhDayString() {
          return  wcMwhDayString();
    }
	
	/**
	 * 	Update WcMwhDay with the passed number
	 *  Corresponding COBOL Variable is WC-MWH-DAY
	 *	@param number
	 */
	public void setWcMwhDay(BigDecimal number) {	
     wcMwhDay = checkWcMwhDayMaxLimit(number);
	    serializeWcMwhDay(wcMwhDay);
   }

	
	
	

		public static int getWcMwhFieldLength() {
			return WC_MWH_LENGTH;
		}

}
  
