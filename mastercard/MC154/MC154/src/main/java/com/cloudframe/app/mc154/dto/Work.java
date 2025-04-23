package com.cloudframe.app.mc154.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:20. using version 5.0.0.254
**/


import com.cloudframe.app.mc154.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] sys009CntlKey = Field.fillLowValue(10);

								private short cnst1300;

								private short cnst4300;

								private short cnst9999300;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCnst1300((short)1);
								setCnst4300((short)4);
								setCnst9999300((short)9999);
    }


 

	/**
	 *	Returns the value of sys009CntlKey
	 *	@return sys009CntlKey
	 */
   public char[] getSys009CntlKey() throws CFException{
   		return sys009CntlKey;
   }

  
	/**
	*  set variable sys009CntlKey
	*  Corresponding COBOL Variable is SYS009-CNTL-KEY
	*  @param value
	**/
   public void setSys009CntlKey(char[] value) {
       value = checkSys009CntlKeyConstraints(value);
       arraycopy(value,0,sys009CntlKey,0,value.length);
   } 
	public void setSys009CntlKey(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys009CntlKey,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cnst1300
	 *	@return cnst1300
	 */
	public short getCnst1300() throws CFException {
       if (isCnst1300Modified()) { 
           cnst1300 = refreshCnst1300();
        }
   		return cnst1300;
	}
	

    /**
	 *	Returns the String value of cnst1300
	 *	@return cnst1300
	 */
	public char[]  getCnst1300ActualString() {
	    String value = String.valueOf(cnst1300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Cnst1300 with the passed value
	 *  Corresponding COBOL Variable is 300-CNST-1
	 *	@param number
	 */
	public void setCnst1300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    cnst1300 = checkCnst1300MaxLimit(number); 
		serializeCnst1300(cnst1300);
	}
	
	public void setCnst1300(int number) {
	    number = checkCnst1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCnst1300((short)number);
	}
	public void setCnst1300(long number) {
	    number = checkCnst1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCnst1300((short)number);
	}
	

	/**
	 * 	Update Cnst1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst1300(char[] value) throws CFException {
		 cnst1300 = serializeCnst1300(value);
	}
	/**
	 * 	Update Cnst1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst1300String(char[] value) throws CFException {
		 setCnst1300(value);
	}
	/**
	 *	Returns the value of cnst4300
	 *	@return cnst4300
	 */
	public short getCnst4300() throws CFException {
       if (isCnst4300Modified()) { 
           cnst4300 = refreshCnst4300();
        }
   		return cnst4300;
	}
	

    /**
	 *	Returns the String value of cnst4300
	 *	@return cnst4300
	 */
	public char[]  getCnst4300ActualString() {
	    String value = String.valueOf(cnst4300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Cnst4300 with the passed value
	 *  Corresponding COBOL Variable is 300-CNST-4
	 *	@param number
	 */
	public void setCnst4300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    cnst4300 = checkCnst4300MaxLimit(number); 
		serializeCnst4300(cnst4300);
	}
	
	public void setCnst4300(int number) {
	    number = checkCnst4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCnst4300((short)number);
	}
	public void setCnst4300(long number) {
	    number = checkCnst4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCnst4300((short)number);
	}
	

	/**
	 * 	Update Cnst4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst4300(char[] value) throws CFException {
		 cnst4300 = serializeCnst4300(value);
	}
	/**
	 * 	Update Cnst4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst4300String(char[] value) throws CFException {
		 setCnst4300(value);
	}
	/**
	 *	Returns the value of cnst9999300
	 *	@return cnst9999300
	 */
	public short getCnst9999300() throws CFException {
       if (isCnst9999300Modified()) { 
           cnst9999300 = refreshCnst9999300();
        }
   		return cnst9999300;
	}
	

    /**
	 *	Returns the String value of cnst9999300
	 *	@return cnst9999300
	 */
	public char[]  getCnst9999300ActualString() {
	    String value = String.valueOf(cnst9999300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Cnst9999300 with the passed value
	 *  Corresponding COBOL Variable is 300-CNST-9999
	 *	@param number
	 */
	public void setCnst9999300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    cnst9999300 = checkCnst9999300MaxLimit(number); 
		serializeCnst9999300(cnst9999300);
	}
	
	public void setCnst9999300(int number) {
	    number = checkCnst9999300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCnst9999300((short)number);
	}
	public void setCnst9999300(long number) {
	    number = checkCnst9999300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCnst9999300((short)number);
	}
	

	/**
	 * 	Update Cnst9999300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCnst9999300(char[] value) throws CFException {
		 cnst9999300 = serializeCnst9999300(value);
	}
	/**
	 * 	Update Cnst9999300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCnst9999300String(char[] value) throws CFException {
		 setCnst9999300(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
