package com.cloudframe.app.mdsnum.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/


import com.cloudframe.app.mdsnum.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized { 
   

								private int impDec;

								private long impAmt;

								private long impAmte;

								private long impAmtT4;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setImpDec(0);
								setImpAmt(0L);
								setImpAmte(0L);
								setImpAmtT4(0L);
    }


 

	/**
	 *	Returns the value of impDec
	 *	@return impDec
	 */
	public int getImpDec() throws CFException {
       if (isImpDecModified()) { 
           impDec = refreshImpDec();
        }
   		return impDec;
	}
	

	
	   
	/**
	 * 	Update ImpDec with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-DEC
	 *	@param number
	 */
	public void setImpDec(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    impDec = checkImpDecMaxLimit(number); 
		serializeImpDec(impDec);
	}
	

	public void setImpDec(long number) {
	    number = checkImpDecMaxLimit(number); // Truncate if value is beyond +/- Max range
		setImpDec((int)number);
	}
	
	/**
	 * 	Update ImpDec with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpDec(char[] value) throws CFException {
		 impDec = serializeImpDec(value);
	}
	/**
	 * 	Update ImpDec with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpDecString(char[] value) throws CFException {
		 setImpDec(value);
	}
	/**
	 *	Returns the value of impAmt
	 *	@return impAmt
	 */
	public long getImpAmt() throws CFException {
       if (isImpAmtModified()) { 
           impAmt = refreshImpAmt();
        }
   		return impAmt;
	}
	

    /**
	 *	Returns the String value of impAmt
	 *	@return impAmt
	 */
	public char[]  getImpAmtActualString() {
	    String value = String.valueOf(impAmt).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmt with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMT
	 *	@param number
	 */
	public void setImpAmt(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmt = checkImpAmtMaxLimit(number); 
		serializeImpAmt(impAmt);
	}
	

	/**
	 * 	Update ImpAmt with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmt(char[] value) throws CFException {
		 impAmt = serializeImpAmt(value);
	}
	/**
	 * 	Update ImpAmt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtString(char[] value) throws CFException {
		 setImpAmt(value);
	}
	/**
	 *	Returns the value of impAmte
	 *	@return impAmte
	 */
	public long getImpAmte() throws CFException {
       if (isImpAmteModified()) { 
           impAmte = refreshImpAmte();
        }
   		return impAmte;
	}
	

    /**
	 *	Returns the String value of impAmte
	 *	@return impAmte
	 */
	public char[]  getImpAmteActualString() {
	    String value = String.valueOf(impAmte).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmte with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMTE
	 *	@param number
	 */
	public void setImpAmte(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmte = checkImpAmteMaxLimit(number); 
		serializeImpAmte(impAmte);
	}
	

	/**
	 * 	Update ImpAmte with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmte(char[] value) throws CFException {
		 impAmte = serializeImpAmte(value);
	}
	/**
	 * 	Update ImpAmte with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmteString(char[] value) throws CFException {
		 setImpAmte(value);
	}
	/**
	 *	Returns the value of impAmtT4
	 *	@return impAmtT4
	 */
	public long getImpAmtT4() throws CFException {
       if (isImpAmtT4Modified()) { 
           impAmtT4 = refreshImpAmtT4();
        }
   		return impAmtT4;
	}
	

    /**
	 *	Returns the String value of impAmtT4
	 *	@return impAmtT4
	 */
	public char[]  getImpAmtT4ActualString() {
	    String value = String.valueOf(impAmtT4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update ImpAmtT4 with the passed value
	 *  Corresponding COBOL Variable is WS-IMP-AMT-T4
	 *	@param number
	 */
	public void setImpAmtT4(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    impAmtT4 = checkImpAmtT4MaxLimit(number); 
		serializeImpAmtT4(impAmtT4);
	}
	

	/**
	 * 	Update ImpAmtT4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setImpAmtT4(char[] value) throws CFException {
		 impAmtT4 = serializeImpAmtT4(value);
	}
	/**
	 * 	Update ImpAmtT4 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setImpAmtT4String(char[] value) throws CFException {
		 setImpAmtT4(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
