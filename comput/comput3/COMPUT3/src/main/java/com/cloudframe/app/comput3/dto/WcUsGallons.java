package com.cloudframe.app.comput3.dto;

/**
*  The class WcUsGallons is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcUsGallons extends WcUsGallonsSerialized { 
   

								private BigDecimal wcUsgBbl = BigDecimal.ZERO;

								private BigDecimal wcUsgKb = BigDecimal.ZERO;

								private BigDecimal wcUsgLit = BigDecimal.ZERO;

								private BigDecimal wcUsgM3 = BigDecimal.ZERO;

								private BigDecimal wcUsgUsg = BigDecimal.ZERO;

								private BigDecimal wcUsgUkg = BigDecimal.ZERO;

								private BigDecimal wcUsgMmb = BigDecimal.ZERO;

								private BigDecimal wcUsgGbt = BigDecimal.ZERO;

								private BigDecimal wcUsgThm = BigDecimal.ZERO;

								private BigDecimal wcUsgMwh = BigDecimal.ZERO;

								private BigDecimal wcUsgGj = BigDecimal.ZERO;

								private BigDecimal wcUsgDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcUsGallons
	**/
    public WcUsGallons() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcUsGallons. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcUsGallons(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcUsgBbl(BigDecimal.valueOf(+23809523800.0000).setScale(4));
								setWcUsgKb(BigDecimal.valueOf(+23809520.0000).setScale(4));
								setWcUsgLit(BigDecimal.valueOf(+3784696200860.0000).setScale(4));
								setWcUsgM3(BigDecimal.valueOf(+3785714391.0000).setScale(4));
								setWcUsgUsg(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcUsgUkg(BigDecimal.valueOf(+832646399710.0000).setScale(4));
								setWcUsgMmb(BigDecimal.valueOf(+138095238095.2380).setScale(4));
								setWcUsgGbt(BigDecimal.valueOf(+138095238.1000).setScale(4));
								setWcUsgThm(BigDecimal.valueOf(+1380952380952.3800).setScale(4));
								setWcUsgMwh(BigDecimal.valueOf(+40471719214.2589).setScale(4));
								setWcUsgGj(BigDecimal.valueOf(+124928571428.571).setScale(4));
								setWcUsgDay(BigDecimal.valueOf(+23809523800.0000).setScale(4));
    } 

	public BigDecimal getWcUsgBbl() throws CFException {
        if (isWcUsgBblModified()) { 
           wcUsgBbl = refreshWcUsgBbl();
        }
   		return wcUsgBbl;
	}

    public char[] getWcUsgBblString() {
          return  wcUsgBblString();
    }
	
	/**
	 * 	Update WcUsgBbl with the passed number
	 *  Corresponding COBOL Variable is WC-USG-BBL
	 *	@param number
	 */
	public void setWcUsgBbl(BigDecimal number) {	
     wcUsgBbl = checkWcUsgBblMaxLimit(number);
	    serializeWcUsgBbl(wcUsgBbl);
   }
	public BigDecimal getWcUsgKb() throws CFException {
        if (isWcUsgKbModified()) { 
           wcUsgKb = refreshWcUsgKb();
        }
   		return wcUsgKb;
	}

    public char[] getWcUsgKbString() {
          return  wcUsgKbString();
    }
	
	/**
	 * 	Update WcUsgKb with the passed number
	 *  Corresponding COBOL Variable is WC-USG-KB
	 *	@param number
	 */
	public void setWcUsgKb(BigDecimal number) {	
     wcUsgKb = checkWcUsgKbMaxLimit(number);
	    serializeWcUsgKb(wcUsgKb);
   }
	public BigDecimal getWcUsgLit() throws CFException {
        if (isWcUsgLitModified()) { 
           wcUsgLit = refreshWcUsgLit();
        }
   		return wcUsgLit;
	}

    public char[] getWcUsgLitString() {
          return  wcUsgLitString();
    }
	
	/**
	 * 	Update WcUsgLit with the passed number
	 *  Corresponding COBOL Variable is WC-USG-LIT
	 *	@param number
	 */
	public void setWcUsgLit(BigDecimal number) {	
     wcUsgLit = checkWcUsgLitMaxLimit(number);
	    serializeWcUsgLit(wcUsgLit);
   }
	public BigDecimal getWcUsgM3() throws CFException {
        if (isWcUsgM3Modified()) { 
           wcUsgM3 = refreshWcUsgM3();
        }
   		return wcUsgM3;
	}

    public char[] getWcUsgM3String() {
          return  wcUsgM3String();
    }
	
	/**
	 * 	Update WcUsgM3 with the passed number
	 *  Corresponding COBOL Variable is WC-USG-M3
	 *	@param number
	 */
	public void setWcUsgM3(BigDecimal number) {	
     wcUsgM3 = checkWcUsgM3MaxLimit(number);
	    serializeWcUsgM3(wcUsgM3);
   }
	public BigDecimal getWcUsgUsg() throws CFException {
        if (isWcUsgUsgModified()) { 
           wcUsgUsg = refreshWcUsgUsg();
        }
   		return wcUsgUsg;
	}

    public char[] getWcUsgUsgString() {
          return  wcUsgUsgString();
    }
	
	/**
	 * 	Update WcUsgUsg with the passed number
	 *  Corresponding COBOL Variable is WC-USG-USG
	 *	@param number
	 */
	public void setWcUsgUsg(BigDecimal number) {	
     wcUsgUsg = checkWcUsgUsgMaxLimit(number);
	    serializeWcUsgUsg(wcUsgUsg);
   }
	public BigDecimal getWcUsgUkg() throws CFException {
        if (isWcUsgUkgModified()) { 
           wcUsgUkg = refreshWcUsgUkg();
        }
   		return wcUsgUkg;
	}

    public char[] getWcUsgUkgString() {
          return  wcUsgUkgString();
    }
	
	/**
	 * 	Update WcUsgUkg with the passed number
	 *  Corresponding COBOL Variable is WC-USG-UKG
	 *	@param number
	 */
	public void setWcUsgUkg(BigDecimal number) {	
     wcUsgUkg = checkWcUsgUkgMaxLimit(number);
	    serializeWcUsgUkg(wcUsgUkg);
   }
	public BigDecimal getWcUsgMmb() throws CFException {
        if (isWcUsgMmbModified()) { 
           wcUsgMmb = refreshWcUsgMmb();
        }
   		return wcUsgMmb;
	}

    public char[] getWcUsgMmbString() {
          return  wcUsgMmbString();
    }
	
	/**
	 * 	Update WcUsgMmb with the passed number
	 *  Corresponding COBOL Variable is WC-USG-MMB
	 *	@param number
	 */
	public void setWcUsgMmb(BigDecimal number) {	
     wcUsgMmb = checkWcUsgMmbMaxLimit(number);
	    serializeWcUsgMmb(wcUsgMmb);
   }
	public BigDecimal getWcUsgGbt() throws CFException {
        if (isWcUsgGbtModified()) { 
           wcUsgGbt = refreshWcUsgGbt();
        }
   		return wcUsgGbt;
	}

    public char[] getWcUsgGbtString() {
          return  wcUsgGbtString();
    }
	
	/**
	 * 	Update WcUsgGbt with the passed number
	 *  Corresponding COBOL Variable is WC-USG-GBT
	 *	@param number
	 */
	public void setWcUsgGbt(BigDecimal number) {	
     wcUsgGbt = checkWcUsgGbtMaxLimit(number);
	    serializeWcUsgGbt(wcUsgGbt);
   }
	public BigDecimal getWcUsgThm() throws CFException {
        if (isWcUsgThmModified()) { 
           wcUsgThm = refreshWcUsgThm();
        }
   		return wcUsgThm;
	}

    public char[] getWcUsgThmString() {
          return  wcUsgThmString();
    }
	
	/**
	 * 	Update WcUsgThm with the passed number
	 *  Corresponding COBOL Variable is WC-USG-THM
	 *	@param number
	 */
	public void setWcUsgThm(BigDecimal number) {	
     wcUsgThm = checkWcUsgThmMaxLimit(number);
	    serializeWcUsgThm(wcUsgThm);
   }
	public BigDecimal getWcUsgMwh() throws CFException {
        if (isWcUsgMwhModified()) { 
           wcUsgMwh = refreshWcUsgMwh();
        }
   		return wcUsgMwh;
	}

    public char[] getWcUsgMwhString() {
          return  wcUsgMwhString();
    }
	
	/**
	 * 	Update WcUsgMwh with the passed number
	 *  Corresponding COBOL Variable is WC-USG-MWH
	 *	@param number
	 */
	public void setWcUsgMwh(BigDecimal number) {	
     wcUsgMwh = checkWcUsgMwhMaxLimit(number);
	    serializeWcUsgMwh(wcUsgMwh);
   }
	public BigDecimal getWcUsgGj() throws CFException {
        if (isWcUsgGjModified()) { 
           wcUsgGj = refreshWcUsgGj();
        }
   		return wcUsgGj;
	}

    public char[] getWcUsgGjString() {
          return  wcUsgGjString();
    }
	
	/**
	 * 	Update WcUsgGj with the passed number
	 *  Corresponding COBOL Variable is WC-USG-GJ
	 *	@param number
	 */
	public void setWcUsgGj(BigDecimal number) {	
     wcUsgGj = checkWcUsgGjMaxLimit(number);
	    serializeWcUsgGj(wcUsgGj);
   }
	public BigDecimal getWcUsgDay() throws CFException {
        if (isWcUsgDayModified()) { 
           wcUsgDay = refreshWcUsgDay();
        }
   		return wcUsgDay;
	}

    public char[] getWcUsgDayString() {
          return  wcUsgDayString();
    }
	
	/**
	 * 	Update WcUsgDay with the passed number
	 *  Corresponding COBOL Variable is WC-USG-DAY
	 *	@param number
	 */
	public void setWcUsgDay(BigDecimal number) {	
     wcUsgDay = checkWcUsgDayMaxLimit(number);
	    serializeWcUsgDay(wcUsgDay);
   }

	
	
	

		public static int getWcUsGallonsFieldLength() {
			return WC_US_GALLONS_LENGTH;
		}

}
  
