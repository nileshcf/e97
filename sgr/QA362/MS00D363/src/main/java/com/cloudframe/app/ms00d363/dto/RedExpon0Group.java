package com.cloudframe.app.ms00d363.dto;

/**
*  The class RedExpon0Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class RedExpon0Group extends RedExpon0GroupSerialized {
   

								private long redExpon0;

								private BigDecimal redExpon1 = BigDecimal.ZERO;

								private BigDecimal redExpon2 = BigDecimal.ZERO;

								private BigDecimal redExpon3 = BigDecimal.ZERO;

								private BigDecimal redExpon4 = BigDecimal.ZERO;

								private BigDecimal redExpon5 = BigDecimal.ZERO;

								private BigDecimal redExpon6 = BigDecimal.ZERO;

								private BigDecimal redExpon7 = BigDecimal.ZERO;

								private BigDecimal redExpon8 = BigDecimal.ZERO;

								private BigDecimal redExpon9 = BigDecimal.ZERO;
	
	/**
	* Constructor for RedExpon0Group
	**/
    public RedExpon0Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of redExpon0
	 *	@return redExpon0
	 */
	public long getRedExpon0() throws CFException {
       if (isRedExpon0Modified()) { 
           redExpon0 = refreshRedExpon0();
        }
   		return redExpon0;
	}
	

    /**
	 *	Returns the String value of redExpon0
	 *	@return redExpon0
	 */
	public char[]  getRedExpon0ActualString() {
	    String value = String.valueOf(redExpon0).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon0 with the passed value
	 *  Corresponding COBOL Variable is RED-EXPON-0
	 *	@param number
	 */
	public void setRedExpon0(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    redExpon0 = checkRedExpon0MaxLimit(number); 
		serializeRedExpon0(redExpon0);
	}
	

	/**
	 * 	Update RedExpon0 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon0(char[] value) throws CFException {
		 redExpon0 = serializeRedExpon0(value);
	}
	/**
	 * 	Update RedExpon0 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRedExpon0String(char[] value) throws CFException {
		 setRedExpon0(value);
	}
	/**
	 *	Returns the value of redExpon1
	 *	@return redExpon1
	 */
	public BigDecimal getRedExpon1() throws CFException {
       if (isRedExpon1Modified()) { 
           redExpon1 = refreshRedExpon1();
        }
   		return redExpon1;
	}
	

    /**
	 *	Returns the String value of redExpon1
	 *	@return redExpon1
	 */
	public char[]  getRedExpon1ActualString() {
	    String value = String.valueOf(redExpon1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon1 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-1
	 *	@param number
	 */
	public void setRedExpon1(BigDecimal number) {
       redExpon1 = checkRedExpon1MaxLimit(number);
	    serializeRedExpon1(redExpon1);
   }
	/**
	 * 	Update RedExpon1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon1(char[] value) throws CFException {
		 redExpon1 = serializeRedExpon1(value);
	}   
	/**
	 *	Returns the value of redExpon2
	 *	@return redExpon2
	 */
	public BigDecimal getRedExpon2() throws CFException {
       if (isRedExpon2Modified()) { 
           redExpon2 = refreshRedExpon2();
        }
   		return redExpon2;
	}
	

    /**
	 *	Returns the String value of redExpon2
	 *	@return redExpon2
	 */
	public char[]  getRedExpon2ActualString() {
	    String value = String.valueOf(redExpon2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon2 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-2
	 *	@param number
	 */
	public void setRedExpon2(BigDecimal number) {
       redExpon2 = checkRedExpon2MaxLimit(number);
	    serializeRedExpon2(redExpon2);
   }
	/**
	 * 	Update RedExpon2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon2(char[] value) throws CFException {
		 redExpon2 = serializeRedExpon2(value);
	}   
	/**
	 *	Returns the value of redExpon3
	 *	@return redExpon3
	 */
	public BigDecimal getRedExpon3() throws CFException {
       if (isRedExpon3Modified()) { 
           redExpon3 = refreshRedExpon3();
        }
   		return redExpon3;
	}
	

    /**
	 *	Returns the String value of redExpon3
	 *	@return redExpon3
	 */
	public char[]  getRedExpon3ActualString() {
	    String value = String.valueOf(redExpon3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon3 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-3
	 *	@param number
	 */
	public void setRedExpon3(BigDecimal number) {
       redExpon3 = checkRedExpon3MaxLimit(number);
	    serializeRedExpon3(redExpon3);
   }
	/**
	 * 	Update RedExpon3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon3(char[] value) throws CFException {
		 redExpon3 = serializeRedExpon3(value);
	}   
	/**
	 *	Returns the value of redExpon4
	 *	@return redExpon4
	 */
	public BigDecimal getRedExpon4() throws CFException {
       if (isRedExpon4Modified()) { 
           redExpon4 = refreshRedExpon4();
        }
   		return redExpon4;
	}
	

    /**
	 *	Returns the String value of redExpon4
	 *	@return redExpon4
	 */
	public char[]  getRedExpon4ActualString() {
	    String value = String.valueOf(redExpon4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon4 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-4
	 *	@param number
	 */
	public void setRedExpon4(BigDecimal number) {
       redExpon4 = checkRedExpon4MaxLimit(number);
	    serializeRedExpon4(redExpon4);
   }
	/**
	 * 	Update RedExpon4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon4(char[] value) throws CFException {
		 redExpon4 = serializeRedExpon4(value);
	}   
	/**
	 *	Returns the value of redExpon5
	 *	@return redExpon5
	 */
	public BigDecimal getRedExpon5() throws CFException {
       if (isRedExpon5Modified()) { 
           redExpon5 = refreshRedExpon5();
        }
   		return redExpon5;
	}
	

    /**
	 *	Returns the String value of redExpon5
	 *	@return redExpon5
	 */
	public char[]  getRedExpon5ActualString() {
	    String value = String.valueOf(redExpon5).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon5 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-5
	 *	@param number
	 */
	public void setRedExpon5(BigDecimal number) {
       redExpon5 = checkRedExpon5MaxLimit(number);
	    serializeRedExpon5(redExpon5);
   }
	/**
	 * 	Update RedExpon5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon5(char[] value) throws CFException {
		 redExpon5 = serializeRedExpon5(value);
	}   
	/**
	 *	Returns the value of redExpon6
	 *	@return redExpon6
	 */
	public BigDecimal getRedExpon6() throws CFException {
       if (isRedExpon6Modified()) { 
           redExpon6 = refreshRedExpon6();
        }
   		return redExpon6;
	}
	

    /**
	 *	Returns the String value of redExpon6
	 *	@return redExpon6
	 */
	public char[]  getRedExpon6ActualString() {
	    String value = String.valueOf(redExpon6).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon6 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-6
	 *	@param number
	 */
	public void setRedExpon6(BigDecimal number) {
       redExpon6 = checkRedExpon6MaxLimit(number);
	    serializeRedExpon6(redExpon6);
   }
	/**
	 * 	Update RedExpon6 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon6(char[] value) throws CFException {
		 redExpon6 = serializeRedExpon6(value);
	}   
	/**
	 *	Returns the value of redExpon7
	 *	@return redExpon7
	 */
	public BigDecimal getRedExpon7() throws CFException {
       if (isRedExpon7Modified()) { 
           redExpon7 = refreshRedExpon7();
        }
   		return redExpon7;
	}
	

    /**
	 *	Returns the String value of redExpon7
	 *	@return redExpon7
	 */
	public char[]  getRedExpon7ActualString() {
	    String value = String.valueOf(redExpon7).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon7 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-7
	 *	@param number
	 */
	public void setRedExpon7(BigDecimal number) {
       redExpon7 = checkRedExpon7MaxLimit(number);
	    serializeRedExpon7(redExpon7);
   }
	/**
	 * 	Update RedExpon7 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon7(char[] value) throws CFException {
		 redExpon7 = serializeRedExpon7(value);
	}   
	/**
	 *	Returns the value of redExpon8
	 *	@return redExpon8
	 */
	public BigDecimal getRedExpon8() throws CFException {
       if (isRedExpon8Modified()) { 
           redExpon8 = refreshRedExpon8();
        }
   		return redExpon8;
	}
	

    /**
	 *	Returns the String value of redExpon8
	 *	@return redExpon8
	 */
	public char[]  getRedExpon8ActualString() {
	    String value = String.valueOf(redExpon8).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon8 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-8
	 *	@param number
	 */
	public void setRedExpon8(BigDecimal number) {
       redExpon8 = checkRedExpon8MaxLimit(number);
	    serializeRedExpon8(redExpon8);
   }
	/**
	 * 	Update RedExpon8 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon8(char[] value) throws CFException {
		 redExpon8 = serializeRedExpon8(value);
	}   
	/**
	 *	Returns the value of redExpon9
	 *	@return redExpon9
	 */
	public BigDecimal getRedExpon9() throws CFException {
       if (isRedExpon9Modified()) { 
           redExpon9 = refreshRedExpon9();
        }
   		return redExpon9;
	}
	

    /**
	 *	Returns the String value of redExpon9
	 *	@return redExpon9
	 */
	public char[]  getRedExpon9ActualString() {
	    String value = String.valueOf(redExpon9).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update RedExpon9 with the passed number
	 *  Corresponding COBOL Variable is RED-EXPON-9
	 *	@param number
	 */
	public void setRedExpon9(BigDecimal number) {
       redExpon9 = checkRedExpon9MaxLimit(number);
	    serializeRedExpon9(redExpon9);
   }
	/**
	 * 	Update RedExpon9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRedExpon9(char[] value) throws CFException {
		 redExpon9 = serializeRedExpon9(value);
	}   

	
	
	

		public static int getRedExpon0GroupFieldLength() {
			return RED_EXPON_0_GROUP_LENGTH;
		}

}
  
