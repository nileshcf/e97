package com.cloudframe.app.mcindex.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:23. using version 5.0.0.254
**/


import com.cloudframe.app.mcindex.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private long ip00485MemberEntries;

								private long zeroVal300;

								private int minusoneVal300;

								private char[] valEdit400 = Field.fillLowValue(11);

								private int val400;

								private int val1400;

								private short val2400;

								private int val3400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setZeroVal300(0L);
								setMinusoneVal300(-1);
    }


 

	/**
	 *	Returns the value of ip00485MemberEntries
	 *	@return ip00485MemberEntries
	 */
	public long getIp00485MemberEntries() throws CFException {
   		return ip00485MemberEntries;
	}
	
	/**
	 * 	Update Ip00485MemberEntries with the passed value
	 *  Corresponding COBOL Variable is IP00485-MEMBER-ENTRIES
	 *	@param number
	 */
	public void setIp00485MemberEntries(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00485MemberEntries = checkIp00485MemberEntriesMaxLimit(number); 
	}


	/**
	 *	Returns the value of zeroVal300
	 *	@return zeroVal300
	 */
	public long getZeroVal300() throws CFException {
   		return zeroVal300;
	}
	
	/**
	 * 	Update ZeroVal300 with the passed value
	 *  Corresponding COBOL Variable is 300-ZERO-VAL
	 *	@param number
	 */
	public void setZeroVal300(long number) {
	     // Truncate if the number is beyond +/- Max range
	    zeroVal300 = checkZeroVal300MaxLimit(number); 
	}


	/**
	 *	Returns the value of minusoneVal300
	 *	@return minusoneVal300
	 */
	public int getMinusoneVal300() throws CFException {
   		return minusoneVal300;
	}
	
	/**
	 * 	Update MinusoneVal300 with the passed value
	 *  Corresponding COBOL Variable is 300-MINUSONE-VAL
	 *	@param number
	 */
	public void setMinusoneVal300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    minusoneVal300 = checkMinusoneVal300MaxLimit(number); 
	}


	public void setMinusoneVal300(long number) {
	    number = checkMinusoneVal300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMinusoneVal300((int)number);
	}
	
	/**
	 *	Returns the value of valEdit400
	 *	@return valEdit400
	 */
   public char[] getValEdit400() throws CFException{
     if (isValEdit400Modified()) { 
        valEdit400 = refreshValEdit400();
     }
   		return valEdit400;
   }

  
	/**
	*  set variable valEdit400
	*  Corresponding COBOL Variable is 400-VAL-EDIT
	*  @param value
	**/
   public void setValEdit400(char[] value) {
      valEdit400 = checkValEdit400Constraints(value);
      serializeValEdit400(valEdit400);
   } 

     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginValEdit400,valEdit400.length);
   	
   }
   
   public void setValEdit400(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginValEdit400,valEdit400.length);
   	
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginValEdit400+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ValEdit400 with another Field
	 *	@param value
	 */
   public void setValEdit400(Field source) {
       replace(source,0,source.length(),beginValEdit400,VAL_EDIT_400_LEN);
   	
   }  
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginValEdit400,VAL_EDIT_400_LEN);
   	
   }
   
     /**
	 * 	Update ValEdit400 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setValEdit400(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginValEdit400+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of val400
	 *	@return val400
	 */
	public int getVal400() throws CFException {
   		return val400;
	}
	
	/**
	 * 	Update Val400 with the passed value
	 *  Corresponding COBOL Variable is 400-VAL
	 *	@param number
	 */
	public void setVal400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    val400 = checkVal400MaxLimit(number); 
	}


	public void setVal400(long number) {
	    number = checkVal400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setVal400((int)number);
	}
	
	/**
	 *	Returns the value of val1400
	 *	@return val1400
	 */
	public int getVal1400() throws CFException {
       if (isVal1400Modified()) { 
           val1400 = refreshVal1400();
        }
   		return val1400;
	}
	

	
	   
	/**
	 * 	Update Val1400 with the passed value
	 *  Corresponding COBOL Variable is 400-VAL1
	 *	@param number
	 */
	public void setVal1400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    val1400 = checkVal1400MaxLimit(number); 
		serializeVal1400(val1400);
	}
	

	public void setVal1400(long number) {
	    number = checkVal1400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setVal1400((int)number);
	}
	
	/**
	 * 	Update Val1400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setVal1400(char[] value) throws CFException {
		 val1400 = serializeVal1400(value);
	}
	/**
	 * 	Update Val1400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setVal1400String(char[] value) throws CFException {
		 setVal1400(value);
	}
	public short getVal2400() throws CFException {
        if (isVal2400Modified()) { 
           val2400 = refreshVal2400();
        }
   		return val2400;
	}
	
	/**
	 * 	Update Val2400 with the passed value
	 *  Corresponding COBOL Variable is 400-VAL2
	 *	@param number
	 */
	public void setVal2400(short number) {
			val2400 = checkVal2400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeVal2400(val2400);
	}

	public void setVal2400(int number) {
	    number = checkVal2400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVal2400((short)number);
	}
	public void setVal2400(long number) {
	    number = checkVal2400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setVal2400((short)number);
	}
	

	/**
	 *	Returns the value of val3400
	 *	@return val3400
	 */
	public int getVal3400() throws CFException {
   		return val3400;
	}
	
	/**
	 * 	Update Val3400 with the passed value
	 *  Corresponding COBOL Variable is 400-VAL3
	 *	@param number
	 */
	public void setVal3400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    val3400 = checkVal3400MaxLimit(number); 
	}


	public void setVal3400(long number) {
	    number = checkVal3400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setVal3400((int)number);
	}
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
