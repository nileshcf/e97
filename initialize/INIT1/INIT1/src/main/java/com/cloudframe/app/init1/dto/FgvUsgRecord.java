package com.cloudframe.app.init1.dto;

/**
*  The class FgvUsgRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class FgvUsgRecord extends FgvUsgRecordSerialized { 
   

								private int fgvTotalAlwUsg;

								private int fgvEdpAcctThrshold;

								private BigDecimal fgvAcctUsgThrshold = BigDecimal.ZERO;
	
	/**
	* Constructor for FgvUsgRecord
	**/
    public FgvUsgRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FgvUsgRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FgvUsgRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of fgvTotalAlwUsg
	 *	@return fgvTotalAlwUsg
	 */
	public int getFgvTotalAlwUsg() throws CFException {
        if (isFgvTotalAlwUsgModified()) { 
           fgvTotalAlwUsg = refreshFgvTotalAlwUsg();
        }
   		return fgvTotalAlwUsg;
	}
	
	/**
	 * 	Update FgvTotalAlwUsg with the passed value
	 *  Corresponding COBOL Variable is WS-FGV-TOTAL-ALW-USG
	 *	@param number
	 */
	public void setFgvTotalAlwUsg(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fgvTotalAlwUsg = checkFgvTotalAlwUsgMaxLimit(number); 
		serializeFgvTotalAlwUsg(fgvTotalAlwUsg);
	}


	public void setFgvTotalAlwUsg(long number) {
	    number = checkFgvTotalAlwUsgMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFgvTotalAlwUsg((int)number);
	}
	
	/**
	 *	Returns the value of fgvEdpAcctThrshold
	 *	@return fgvEdpAcctThrshold
	 */
	public int getFgvEdpAcctThrshold() throws CFException {
        if (isFgvEdpAcctThrsholdModified()) { 
           fgvEdpAcctThrshold = refreshFgvEdpAcctThrshold();
        }
   		return fgvEdpAcctThrshold;
	}
	
	/**
	 * 	Update FgvEdpAcctThrshold with the passed value
	 *  Corresponding COBOL Variable is WS-FGV-EDP-ACCT-THRSHOLD
	 *	@param number
	 */
	public void setFgvEdpAcctThrshold(int number) {
	     // Truncate if the number is beyond +/- Max range
	    fgvEdpAcctThrshold = checkFgvEdpAcctThrsholdMaxLimit(number); 
		serializeFgvEdpAcctThrshold(fgvEdpAcctThrshold);
	}


	public void setFgvEdpAcctThrshold(long number) {
	    number = checkFgvEdpAcctThrsholdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setFgvEdpAcctThrshold((int)number);
	}
	
	public BigDecimal getFgvAcctUsgThrshold() throws CFException {
        if (isFgvAcctUsgThrsholdModified()) { 
           fgvAcctUsgThrshold = refreshFgvAcctUsgThrshold();
        }
   		return fgvAcctUsgThrshold;
	}

    public char[] getFgvAcctUsgThrsholdString() {
          return  fgvAcctUsgThrsholdString();
    }
	
	/**
	 * 	Update FgvAcctUsgThrshold with the passed number
	 *  Corresponding COBOL Variable is WS-FGV-ACCT-USG-THRSHOLD
	 *	@param number
	 */
	public void setFgvAcctUsgThrshold(BigDecimal number) {	
     fgvAcctUsgThrshold = checkFgvAcctUsgThrsholdMaxLimit(number);
	    serializeFgvAcctUsgThrshold(fgvAcctUsgThrshold);
   }

	
	
	
	/**
	 * 	initializes FgvUsgRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setFgvTotalAlwUsg(0);
                     setFgvEdpAcctThrshold(0);
			setFgvAcctUsgThrshold(BigDecimal.ZERO);
   }

		public static int getFgvUsgRecordFieldLength() {
			return FGV_USG_RECORD_LENGTH;
		}

}
  
