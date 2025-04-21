package com.cloudframe.app.comput3.dto;

/**
*  The class WcUkGallons is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:52. using version 5.0.0.256
**/


import com.cloudframe.app.comput3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class WcUkGallons extends WcUkGallonsSerialized { 
   

								private BigDecimal wcUkgBbl = BigDecimal.ZERO;

								private BigDecimal wcUkgKb = BigDecimal.ZERO;

								private BigDecimal wcUkgLit = BigDecimal.ZERO;

								private BigDecimal wcUkgM3 = BigDecimal.ZERO;

								private BigDecimal wcUkgUsg = BigDecimal.ZERO;

								private BigDecimal wcUkgUkg = BigDecimal.ZERO;

								private BigDecimal wcUkgMmb = BigDecimal.ZERO;

								private BigDecimal wcUkgGbt = BigDecimal.ZERO;

								private BigDecimal wcUkgThm = BigDecimal.ZERO;

								private BigDecimal wcUkgMwh = BigDecimal.ZERO;

								private BigDecimal wcUkgGj = BigDecimal.ZERO;

								private BigDecimal wcUkgDay = BigDecimal.ZERO;
	
	/**
	* Constructor for WcUkGallons
	**/
    public WcUkGallons() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcUkGallons. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcUkGallons(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWcUkgBbl(BigDecimal.valueOf(+28595000000.0000).setScale(4));
								setWcUkgKb(BigDecimal.valueOf(+28595000.0000).setScale(4));
								setWcUkgLit(BigDecimal.valueOf(+4545382292090.0000).setScale(4));
								setWcUkgM3(BigDecimal.valueOf(+4546605231.6040).setScale(4));
								setWcUkgUsg(BigDecimal.valueOf(+1200990000000.0000).setScale(4));
								setWcUkgUkg(BigDecimal.valueOf(+1000000000000.0000).setScale(4));
								setWcUkgMmb(BigDecimal.valueOf(+165851000000.1810).setScale(4));
								setWcUkgGbt(BigDecimal.valueOf(+165851000.0000).setScale(4));
								setWcUkgThm(BigDecimal.valueOf(+1658510000001.8100).setScale(4));
								setWcUkgMwh(BigDecimal.valueOf(+48606130059.1859).setScale(4));
								setWcUkgGj(BigDecimal.valueOf(125070089000L).setScale(4));
								setWcUkgDay(BigDecimal.valueOf(+28595000000.0000).setScale(4));
    } 

	public BigDecimal getWcUkgBbl() throws CFException {
        if (isWcUkgBblModified()) { 
           wcUkgBbl = refreshWcUkgBbl();
        }
   		return wcUkgBbl;
	}

    public char[] getWcUkgBblString() {
          return  wcUkgBblString();
    }
	
	/**
	 * 	Update WcUkgBbl with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-BBL
	 *	@param number
	 */
	public void setWcUkgBbl(BigDecimal number) {	
     wcUkgBbl = checkWcUkgBblMaxLimit(number);
	    serializeWcUkgBbl(wcUkgBbl);
   }
	public BigDecimal getWcUkgKb() throws CFException {
        if (isWcUkgKbModified()) { 
           wcUkgKb = refreshWcUkgKb();
        }
   		return wcUkgKb;
	}

    public char[] getWcUkgKbString() {
          return  wcUkgKbString();
    }
	
	/**
	 * 	Update WcUkgKb with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-KB
	 *	@param number
	 */
	public void setWcUkgKb(BigDecimal number) {	
     wcUkgKb = checkWcUkgKbMaxLimit(number);
	    serializeWcUkgKb(wcUkgKb);
   }
	public BigDecimal getWcUkgLit() throws CFException {
        if (isWcUkgLitModified()) { 
           wcUkgLit = refreshWcUkgLit();
        }
   		return wcUkgLit;
	}

    public char[] getWcUkgLitString() {
          return  wcUkgLitString();
    }
	
	/**
	 * 	Update WcUkgLit with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-LIT
	 *	@param number
	 */
	public void setWcUkgLit(BigDecimal number) {	
     wcUkgLit = checkWcUkgLitMaxLimit(number);
	    serializeWcUkgLit(wcUkgLit);
   }
	public BigDecimal getWcUkgM3() throws CFException {
        if (isWcUkgM3Modified()) { 
           wcUkgM3 = refreshWcUkgM3();
        }
   		return wcUkgM3;
	}

    public char[] getWcUkgM3String() {
          return  wcUkgM3String();
    }
	
	/**
	 * 	Update WcUkgM3 with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-M3
	 *	@param number
	 */
	public void setWcUkgM3(BigDecimal number) {	
     wcUkgM3 = checkWcUkgM3MaxLimit(number);
	    serializeWcUkgM3(wcUkgM3);
   }
	public BigDecimal getWcUkgUsg() throws CFException {
        if (isWcUkgUsgModified()) { 
           wcUkgUsg = refreshWcUkgUsg();
        }
   		return wcUkgUsg;
	}

    public char[] getWcUkgUsgString() {
          return  wcUkgUsgString();
    }
	
	/**
	 * 	Update WcUkgUsg with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-USG
	 *	@param number
	 */
	public void setWcUkgUsg(BigDecimal number) {	
     wcUkgUsg = checkWcUkgUsgMaxLimit(number);
	    serializeWcUkgUsg(wcUkgUsg);
   }
	public BigDecimal getWcUkgUkg() throws CFException {
        if (isWcUkgUkgModified()) { 
           wcUkgUkg = refreshWcUkgUkg();
        }
   		return wcUkgUkg;
	}

    public char[] getWcUkgUkgString() {
          return  wcUkgUkgString();
    }
	
	/**
	 * 	Update WcUkgUkg with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-UKG
	 *	@param number
	 */
	public void setWcUkgUkg(BigDecimal number) {	
     wcUkgUkg = checkWcUkgUkgMaxLimit(number);
	    serializeWcUkgUkg(wcUkgUkg);
   }
	public BigDecimal getWcUkgMmb() throws CFException {
        if (isWcUkgMmbModified()) { 
           wcUkgMmb = refreshWcUkgMmb();
        }
   		return wcUkgMmb;
	}

    public char[] getWcUkgMmbString() {
          return  wcUkgMmbString();
    }
	
	/**
	 * 	Update WcUkgMmb with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-MMB
	 *	@param number
	 */
	public void setWcUkgMmb(BigDecimal number) {	
     wcUkgMmb = checkWcUkgMmbMaxLimit(number);
	    serializeWcUkgMmb(wcUkgMmb);
   }
	public BigDecimal getWcUkgGbt() throws CFException {
        if (isWcUkgGbtModified()) { 
           wcUkgGbt = refreshWcUkgGbt();
        }
   		return wcUkgGbt;
	}

    public char[] getWcUkgGbtString() {
          return  wcUkgGbtString();
    }
	
	/**
	 * 	Update WcUkgGbt with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-GBT
	 *	@param number
	 */
	public void setWcUkgGbt(BigDecimal number) {	
     wcUkgGbt = checkWcUkgGbtMaxLimit(number);
	    serializeWcUkgGbt(wcUkgGbt);
   }
	public BigDecimal getWcUkgThm() throws CFException {
        if (isWcUkgThmModified()) { 
           wcUkgThm = refreshWcUkgThm();
        }
   		return wcUkgThm;
	}

    public char[] getWcUkgThmString() {
          return  wcUkgThmString();
    }
	
	/**
	 * 	Update WcUkgThm with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-THM
	 *	@param number
	 */
	public void setWcUkgThm(BigDecimal number) {	
     wcUkgThm = checkWcUkgThmMaxLimit(number);
	    serializeWcUkgThm(wcUkgThm);
   }
	public BigDecimal getWcUkgMwh() throws CFException {
        if (isWcUkgMwhModified()) { 
           wcUkgMwh = refreshWcUkgMwh();
        }
   		return wcUkgMwh;
	}

    public char[] getWcUkgMwhString() {
          return  wcUkgMwhString();
    }
	
	/**
	 * 	Update WcUkgMwh with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-MWH
	 *	@param number
	 */
	public void setWcUkgMwh(BigDecimal number) {	
     wcUkgMwh = checkWcUkgMwhMaxLimit(number);
	    serializeWcUkgMwh(wcUkgMwh);
   }
	public BigDecimal getWcUkgGj() throws CFException {
        if (isWcUkgGjModified()) { 
           wcUkgGj = refreshWcUkgGj();
        }
   		return wcUkgGj;
	}

    public char[] getWcUkgGjString() {
          return  wcUkgGjString();
    }
	
	/**
	 * 	Update WcUkgGj with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-GJ
	 *	@param number
	 */
	public void setWcUkgGj(BigDecimal number) {	
     wcUkgGj = checkWcUkgGjMaxLimit(number);
	    serializeWcUkgGj(wcUkgGj);
   }
	public BigDecimal getWcUkgDay() throws CFException {
        if (isWcUkgDayModified()) { 
           wcUkgDay = refreshWcUkgDay();
        }
   		return wcUkgDay;
	}

    public char[] getWcUkgDayString() {
          return  wcUkgDayString();
    }
	
	/**
	 * 	Update WcUkgDay with the passed number
	 *  Corresponding COBOL Variable is WC-UKG-DAY
	 *	@param number
	 */
	public void setWcUkgDay(BigDecimal number) {	
     wcUkgDay = checkWcUkgDayMaxLimit(number);
	    serializeWcUkgDay(wcUkgDay);
   }

	
	
	

		public static int getWcUkGallonsFieldLength() {
			return WC_UK_GALLONS_LENGTH;
		}

}
  
