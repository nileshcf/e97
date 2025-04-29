package com.cloudframe.app.ms00d363.dto;

/**
*  The class Expon0Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;


public class Expon0Group extends Expon0GroupSerialized {
   

								private long expon0;

								private BigDecimal expon1 = BigDecimal.ZERO;

								private BigDecimal expon2 = BigDecimal.ZERO;

								private BigDecimal expon3 = BigDecimal.ZERO;

								private BigDecimal expon4 = BigDecimal.ZERO;

								private BigDecimal expon5 = BigDecimal.ZERO;

								private BigDecimal expon6 = BigDecimal.ZERO;

								private BigDecimal expon7 = BigDecimal.ZERO;

								private BigDecimal expon8 = BigDecimal.ZERO;

								private BigDecimal expon9 = BigDecimal.ZERO;
	
	/**
	* Constructor for Expon0Group
	**/
    public Expon0Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of expon0
	 *	@return expon0
	 */
	public long getExpon0() throws CFException {
       if (isExpon0Modified()) { 
           expon0 = refreshExpon0();
        }
   		return expon0;
	}
	

    /**
	 *	Returns the String value of expon0
	 *	@return expon0
	 */
	public char[]  getExpon0ActualString() {
	    String value = String.valueOf(expon0).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon0 with the passed value
	 *  Corresponding COBOL Variable is EXPON-0
	 *	@param number
	 */
	public void setExpon0(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    expon0 = checkExpon0MaxLimit(number); 
		serializeExpon0(expon0);
	}
	

	/**
	 * 	Update Expon0 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon0(char[] value) throws CFException {
		 expon0 = serializeExpon0(value);
	}
	/**
	 * 	Update Expon0 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExpon0String(char[] value) throws CFException {
		 setExpon0(value);
	}
	/**
	 *	Returns the value of expon1
	 *	@return expon1
	 */
	public BigDecimal getExpon1() throws CFException {
       if (isExpon1Modified()) { 
           expon1 = refreshExpon1();
        }
   		return expon1;
	}
	

    /**
	 *	Returns the String value of expon1
	 *	@return expon1
	 */
	public char[]  getExpon1ActualString() {
	    String value = String.valueOf(expon1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon1 with the passed number
	 *  Corresponding COBOL Variable is EXPON-1
	 *	@param number
	 */
	public void setExpon1(BigDecimal number) {
       expon1 = checkExpon1MaxLimit(number);
	    serializeExpon1(expon1);
   }
	/**
	 * 	Update Expon1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon1(char[] value) throws CFException {
		 expon1 = serializeExpon1(value);
	}   
	/**
	 *	Returns the value of expon2
	 *	@return expon2
	 */
	public BigDecimal getExpon2() throws CFException {
       if (isExpon2Modified()) { 
           expon2 = refreshExpon2();
        }
   		return expon2;
	}
	

    /**
	 *	Returns the String value of expon2
	 *	@return expon2
	 */
	public char[]  getExpon2ActualString() {
	    String value = String.valueOf(expon2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon2 with the passed number
	 *  Corresponding COBOL Variable is EXPON-2
	 *	@param number
	 */
	public void setExpon2(BigDecimal number) {
       expon2 = checkExpon2MaxLimit(number);
	    serializeExpon2(expon2);
   }
	/**
	 * 	Update Expon2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon2(char[] value) throws CFException {
		 expon2 = serializeExpon2(value);
	}   
	/**
	 *	Returns the value of expon3
	 *	@return expon3
	 */
	public BigDecimal getExpon3() throws CFException {
       if (isExpon3Modified()) { 
           expon3 = refreshExpon3();
        }
   		return expon3;
	}
	

    /**
	 *	Returns the String value of expon3
	 *	@return expon3
	 */
	public char[]  getExpon3ActualString() {
	    String value = String.valueOf(expon3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon3 with the passed number
	 *  Corresponding COBOL Variable is EXPON-3
	 *	@param number
	 */
	public void setExpon3(BigDecimal number) {
       expon3 = checkExpon3MaxLimit(number);
	    serializeExpon3(expon3);
   }
	/**
	 * 	Update Expon3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon3(char[] value) throws CFException {
		 expon3 = serializeExpon3(value);
	}   
	/**
	 *	Returns the value of expon4
	 *	@return expon4
	 */
	public BigDecimal getExpon4() throws CFException {
       if (isExpon4Modified()) { 
           expon4 = refreshExpon4();
        }
   		return expon4;
	}
	

    /**
	 *	Returns the String value of expon4
	 *	@return expon4
	 */
	public char[]  getExpon4ActualString() {
	    String value = String.valueOf(expon4).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon4 with the passed number
	 *  Corresponding COBOL Variable is EXPON-4
	 *	@param number
	 */
	public void setExpon4(BigDecimal number) {
       expon4 = checkExpon4MaxLimit(number);
	    serializeExpon4(expon4);
   }
	/**
	 * 	Update Expon4 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon4(char[] value) throws CFException {
		 expon4 = serializeExpon4(value);
	}   
	/**
	 *	Returns the value of expon5
	 *	@return expon5
	 */
	public BigDecimal getExpon5() throws CFException {
       if (isExpon5Modified()) { 
           expon5 = refreshExpon5();
        }
   		return expon5;
	}
	

    /**
	 *	Returns the String value of expon5
	 *	@return expon5
	 */
	public char[]  getExpon5ActualString() {
	    String value = String.valueOf(expon5).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon5 with the passed number
	 *  Corresponding COBOL Variable is EXPON-5
	 *	@param number
	 */
	public void setExpon5(BigDecimal number) {
       expon5 = checkExpon5MaxLimit(number);
	    serializeExpon5(expon5);
   }
	/**
	 * 	Update Expon5 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon5(char[] value) throws CFException {
		 expon5 = serializeExpon5(value);
	}   
	/**
	 *	Returns the value of expon6
	 *	@return expon6
	 */
	public BigDecimal getExpon6() throws CFException {
       if (isExpon6Modified()) { 
           expon6 = refreshExpon6();
        }
   		return expon6;
	}
	

    /**
	 *	Returns the String value of expon6
	 *	@return expon6
	 */
	public char[]  getExpon6ActualString() {
	    String value = String.valueOf(expon6).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon6 with the passed number
	 *  Corresponding COBOL Variable is EXPON-6
	 *	@param number
	 */
	public void setExpon6(BigDecimal number) {
       expon6 = checkExpon6MaxLimit(number);
	    serializeExpon6(expon6);
   }
	/**
	 * 	Update Expon6 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon6(char[] value) throws CFException {
		 expon6 = serializeExpon6(value);
	}   
	/**
	 *	Returns the value of expon7
	 *	@return expon7
	 */
	public BigDecimal getExpon7() throws CFException {
       if (isExpon7Modified()) { 
           expon7 = refreshExpon7();
        }
   		return expon7;
	}
	

    /**
	 *	Returns the String value of expon7
	 *	@return expon7
	 */
	public char[]  getExpon7ActualString() {
	    String value = String.valueOf(expon7).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon7 with the passed number
	 *  Corresponding COBOL Variable is EXPON-7
	 *	@param number
	 */
	public void setExpon7(BigDecimal number) {
       expon7 = checkExpon7MaxLimit(number);
	    serializeExpon7(expon7);
   }
	/**
	 * 	Update Expon7 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon7(char[] value) throws CFException {
		 expon7 = serializeExpon7(value);
	}   
	/**
	 *	Returns the value of expon8
	 *	@return expon8
	 */
	public BigDecimal getExpon8() throws CFException {
       if (isExpon8Modified()) { 
           expon8 = refreshExpon8();
        }
   		return expon8;
	}
	

    /**
	 *	Returns the String value of expon8
	 *	@return expon8
	 */
	public char[]  getExpon8ActualString() {
	    String value = String.valueOf(expon8).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon8 with the passed number
	 *  Corresponding COBOL Variable is EXPON-8
	 *	@param number
	 */
	public void setExpon8(BigDecimal number) {
       expon8 = checkExpon8MaxLimit(number);
	    serializeExpon8(expon8);
   }
	/**
	 * 	Update Expon8 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon8(char[] value) throws CFException {
		 expon8 = serializeExpon8(value);
	}   
	/**
	 *	Returns the value of expon9
	 *	@return expon9
	 */
	public BigDecimal getExpon9() throws CFException {
       if (isExpon9Modified()) { 
           expon9 = refreshExpon9();
        }
   		return expon9;
	}
	

    /**
	 *	Returns the String value of expon9
	 *	@return expon9
	 */
	public char[]  getExpon9ActualString() {
	    String value = String.valueOf(expon9).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Expon9 with the passed number
	 *  Corresponding COBOL Variable is EXPON-9
	 *	@param number
	 */
	public void setExpon9(BigDecimal number) {
       expon9 = checkExpon9MaxLimit(number);
	    serializeExpon9(expon9);
   }
	/**
	 * 	Update Expon9 with the passed value
	 *	@param value (String or char[])
	 */
	public void setExpon9(char[] value) throws CFException {
		 expon9 = serializeExpon9(value);
	}   

	
	
	

		public static int getExpon0GroupFieldLength() {
			return EXPON_0_GROUP_LENGTH;
		}

}
  
