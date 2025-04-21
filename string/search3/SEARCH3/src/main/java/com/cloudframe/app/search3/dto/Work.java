package com.cloudframe.app.search3.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private int lastDeTag800;

								private int srchval;

								private short i;

								private short start;

								private short len;

						private char[] valueCr300 = new char[2];

						private char[] valueDr300 = new char[2];

								private short accAmount801;

						private char[] accFinNonFinInd400 = new char[2];

								private short accFinNonFinAmt400;

						private char[] entryFoundFlg = Field.fillLowValue(1);

								private short ip66601UserTagType01;

								private short ip66601UserTagNo01;

								private short ip66601UserTagOccurrence01;

								private short ip66601UserTagSubfldNo01;

								private short ip66601UserTagStart01;

								private short ip66601UserTagLngth01;

						private char[] ip66601UserTagStatus01 = Field.fillLowValue(1);
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setValueCr300(("CR").toCharArray());
								setValueDr300(("DR").toCharArray());
								setAccFinNonFinInd400(fillSpace(2));
    }


 

	/**
	 *	Returns the value of lastDeTag800
	 *	@return lastDeTag800
	 */
	public int getLastDeTag800() throws CFException {
   		return lastDeTag800;
	}
	
	/**
	 * 	Update LastDeTag800 with the passed value
	 *  Corresponding COBOL Variable is 800-LAST-DE-TAG
	 *	@param number
	 */
	public void setLastDeTag800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    lastDeTag800 = checkLastDeTag800MaxLimit(number); 
	}


	public void setLastDeTag800(long number) {
	    number = checkLastDeTag800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLastDeTag800((int)number);
	}
	
	/**
	 *	Returns the value of srchval
	 *	@return srchval
	 */
	public int getSrchval() throws CFException {
       if (isSrchvalModified()) { 
           srchval = refreshSrchval();
        }
   		return srchval;
	}
	

	
	   
	/**
	 * 	Update Srchval with the passed value
	 *  Corresponding COBOL Variable is WS-SRCHVAL
	 *	@param number
	 */
	public void setSrchval(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    srchval = checkSrchvalMaxLimit(number); 
		serializeSrchval(srchval);
	}
	

	public void setSrchval(long number) {
	    number = checkSrchvalMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSrchval((int)number);
	}
	
	/**
	 * 	Update Srchval with the passed value
	 *	@param value (String or char[])
	 */
	public void setSrchval(char[] value) throws CFException {
		 srchval = serializeSrchval(value);
	}
	/**
	 * 	Update Srchval with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSrchvalString(char[] value) throws CFException {
		 setSrchval(value);
	}
	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public short getI() throws CFException {
   		return i;
	}
	
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is WS-I
	 *	@param number
	 */
	public void setI(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i = checkIMaxLimit(number); 
	}

	public void setI(int number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	public void setI(long number) {
	    number = checkIMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI((short)number);
	}
	

	/**
	 *	Returns the value of start
	 *	@return start
	 */
	public short getStart() throws CFException {
   		return start;
	}
	
	/**
	 * 	Update Start with the passed value
	 *  Corresponding COBOL Variable is WS-START
	 *	@param number
	 */
	public void setStart(short number) {
	     // Truncate if the number is beyond +/- Max range
	    start = checkStartMaxLimit(number); 
	}

	public void setStart(int number) {
	    number = checkStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStart((short)number);
	}
	public void setStart(long number) {
	    number = checkStartMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStart((short)number);
	}
	

	/**
	 *	Returns the value of len
	 *	@return len
	 */
	public short getLen() throws CFException {
   		return len;
	}
	
	/**
	 * 	Update Len with the passed value
	 *  Corresponding COBOL Variable is WS-LEN
	 *	@param number
	 */
	public void setLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    len = checkLenMaxLimit(number); 
	}

	public void setLen(int number) {
	    number = checkLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLen((short)number);
	}
	public void setLen(long number) {
	    number = checkLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setLen((short)number);
	}
	

	/**
	 *	Returns the value of valueCr300
	 *	@return valueCr300
	 */
   public char[] getValueCr300() throws CFException{
   		return valueCr300;
   }

  
	/**
	*  set variable valueCr300
	*  Corresponding COBOL Variable is 300-VALUE-CR
	*  @param value
	**/
   public void setValueCr300(char[] value) {
       value = checkValueCr300Constraints(value);
       arraycopy(value,0,valueCr300,0,value.length);
   } 
	public void setValueCr300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueCr300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueDr300
	 *	@return valueDr300
	 */
   public char[] getValueDr300() throws CFException{
   		return valueDr300;
   }

  
	/**
	*  set variable valueDr300
	*  Corresponding COBOL Variable is 300-VALUE-DR
	*  @param value
	**/
   public void setValueDr300(char[] value) {
       value = checkValueDr300Constraints(value);
       arraycopy(value,0,valueDr300,0,value.length);
   } 
	public void setValueDr300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueDr300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of accAmount801
	 *	@return accAmount801
	 */
	public short getAccAmount801() throws CFException {
   		return accAmount801;
	}
	
	/**
	 * 	Update AccAmount801 with the passed value
	 *  Corresponding COBOL Variable is 801-ACC-AMOUNT
	 *	@param number
	 */
	public void setAccAmount801(short number) {
	     // Truncate if the number is beyond +/- Max range
	    accAmount801 = checkAccAmount801MaxLimit(number); 
	}

	public void setAccAmount801(int number) {
	    number = checkAccAmount801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAccAmount801((short)number);
	}
	public void setAccAmount801(long number) {
	    number = checkAccAmount801MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAccAmount801((short)number);
	}
	

	/**
	 *	Returns the value of accFinNonFinInd400
	 *	@return accFinNonFinInd400
	 */
   public char[] getAccFinNonFinInd400() throws CFException{
   		return accFinNonFinInd400;
   }

  
	/**
	*  set variable accFinNonFinInd400
	*  Corresponding COBOL Variable is 400-ACC-FIN-NON-FIN-IND
	*  @param value
	**/
   public void setAccFinNonFinInd400(char[] value) {
       value = checkAccFinNonFinInd400Constraints(value);
       arraycopy(value,0,accFinNonFinInd400,0,value.length);
   } 
	public void setAccFinNonFinInd400(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,accFinNonFinInd400,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of accFinNonFinAmt400
	 *	@return accFinNonFinAmt400
	 */
	public short getAccFinNonFinAmt400() throws CFException {
   		return accFinNonFinAmt400;
	}
	
	/**
	 * 	Update AccFinNonFinAmt400 with the passed value
	 *  Corresponding COBOL Variable is 400-ACC-FIN-NON-FIN-AMT
	 *	@param number
	 */
	public void setAccFinNonFinAmt400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    accFinNonFinAmt400 = checkAccFinNonFinAmt400MaxLimit(number); 
	}

	public void setAccFinNonFinAmt400(int number) {
	    number = checkAccFinNonFinAmt400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAccFinNonFinAmt400((short)number);
	}
	public void setAccFinNonFinAmt400(long number) {
	    number = checkAccFinNonFinAmt400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAccFinNonFinAmt400((short)number);
	}
	

	/**
	 *	Returns the value of entryFoundFlg
	 *	@return entryFoundFlg
	 */
   public char[] getEntryFoundFlg() throws CFException{
   		return entryFoundFlg;
   }

  
	/**
	*  set variable entryFoundFlg
	*  Corresponding COBOL Variable is ENTRY-FOUND-FLG
	*  @param value
	**/
   public void setEntryFoundFlg(char[] value) {
       value = checkEntryFoundFlgConstraints(value);
       arraycopy(value,0,entryFoundFlg,0,value.length);
   } 
	public void setEntryFoundFlg(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,entryFoundFlg,0,beginIndex + endIndex);
   }
	char[] entryFoundY88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEntryFoundY()
	 *	@return  Returns true if isEntryFoundY() is "Y"
	 */
   public boolean isEntryFoundY() throws CFException {
      return (  compareChars( getEntryFoundFlg() , entryFoundY88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEntryFoundYTrue() {  			
    	setEntryFoundFlg( entryFoundY88Value);
   	}
	char[] entryNotFoundN88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isEntryNotFoundN()
	 *	@return  Returns true if isEntryNotFoundN() is "N"
	 */
   public boolean isEntryNotFoundN() throws CFException {
      return (  compareChars( getEntryFoundFlg() , entryNotFoundN88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setEntryNotFoundNTrue() {  			
    	setEntryFoundFlg( entryNotFoundN88Value);
   	}
	/**
	 *	Returns the value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public short getIp66601UserTagType01() throws CFException {
       if (isIp66601UserTagType01Modified()) { 
           ip66601UserTagType01 = refreshIp66601UserTagType01();
        }
   		return ip66601UserTagType01;
	}
	

    /**
	 *	Returns the String value of ip66601UserTagType01
	 *	@return ip66601UserTagType01
	 */
	public char[]  getIp66601UserTagType01ActualString() {
	    String value = String.valueOf(ip66601UserTagType01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip66601UserTagType01 with the passed value
	 *  Corresponding COBOL Variable is WS-IP66601-USER-TAG-TYPE
	 *	@param number
	 */
	public void setIp66601UserTagType01(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip66601UserTagType01 = checkIp66601UserTagType01MaxLimit(number); 
		serializeIp66601UserTagType01(ip66601UserTagType01);
	}
	
	public void setIp66601UserTagType01(int number) {
	    number = checkIp66601UserTagType01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagType01((short)number);
	}
	public void setIp66601UserTagType01(long number) {
	    number = checkIp66601UserTagType01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagType01((short)number);
	}
	

	/**
	 * 	Update Ip66601UserTagType01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagType01(char[] value) throws CFException {
		 ip66601UserTagType01 = serializeIp66601UserTagType01(value);
	}
	/**
	 * 	Update Ip66601UserTagType01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagType01String(char[] value) throws CFException {
		 setIp66601UserTagType01(value);
	}
	/**
	 *	Returns the value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public short getIp66601UserTagNo01() throws CFException {
       if (isIp66601UserTagNo01Modified()) { 
           ip66601UserTagNo01 = refreshIp66601UserTagNo01();
        }
   		return ip66601UserTagNo01;
	}
	

    /**
	 *	Returns the String value of ip66601UserTagNo01
	 *	@return ip66601UserTagNo01
	 */
	public char[]  getIp66601UserTagNo01ActualString() {
	    String value = String.valueOf(ip66601UserTagNo01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip66601UserTagNo01 with the passed value
	 *  Corresponding COBOL Variable is WS-IP66601-USER-TAG-NO
	 *	@param number
	 */
	public void setIp66601UserTagNo01(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip66601UserTagNo01 = checkIp66601UserTagNo01MaxLimit(number); 
		serializeIp66601UserTagNo01(ip66601UserTagNo01);
	}
	
	public void setIp66601UserTagNo01(int number) {
	    number = checkIp66601UserTagNo01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagNo01((short)number);
	}
	public void setIp66601UserTagNo01(long number) {
	    number = checkIp66601UserTagNo01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagNo01((short)number);
	}
	

	/**
	 * 	Update Ip66601UserTagNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagNo01(char[] value) throws CFException {
		 ip66601UserTagNo01 = serializeIp66601UserTagNo01(value);
	}
	/**
	 * 	Update Ip66601UserTagNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagNo01String(char[] value) throws CFException {
		 setIp66601UserTagNo01(value);
	}
	/**
	 *	Returns the value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public short getIp66601UserTagOccurrence01() throws CFException {
       if (isIp66601UserTagOccurrence01Modified()) { 
           ip66601UserTagOccurrence01 = refreshIp66601UserTagOccurrence01();
        }
   		return ip66601UserTagOccurrence01;
	}
	

    /**
	 *	Returns the String value of ip66601UserTagOccurrence01
	 *	@return ip66601UserTagOccurrence01
	 */
	public char[]  getIp66601UserTagOccurrence01ActualString() {
	    String value = String.valueOf(ip66601UserTagOccurrence01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value
	 *  Corresponding COBOL Variable is WS-IP66601-USER-TAG-OCCURRENCE
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence01(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip66601UserTagOccurrence01 = checkIp66601UserTagOccurrence01MaxLimit(number); 
		serializeIp66601UserTagOccurrence01(ip66601UserTagOccurrence01);
	}
	
	public void setIp66601UserTagOccurrence01(int number) {
	    number = checkIp66601UserTagOccurrence01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagOccurrence01((short)number);
	}
	public void setIp66601UserTagOccurrence01(long number) {
	    number = checkIp66601UserTagOccurrence01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagOccurrence01((short)number);
	}
	

	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagOccurrence01(char[] value) throws CFException {
		 ip66601UserTagOccurrence01 = serializeIp66601UserTagOccurrence01(value);
	}
	/**
	 * 	Update Ip66601UserTagOccurrence01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagOccurrence01String(char[] value) throws CFException {
		 setIp66601UserTagOccurrence01(value);
	}
	/**
	 *	Returns the value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public short getIp66601UserTagSubfldNo01() throws CFException {
       if (isIp66601UserTagSubfldNo01Modified()) { 
           ip66601UserTagSubfldNo01 = refreshIp66601UserTagSubfldNo01();
        }
   		return ip66601UserTagSubfldNo01;
	}
	

    /**
	 *	Returns the String value of ip66601UserTagSubfldNo01
	 *	@return ip66601UserTagSubfldNo01
	 */
	public char[]  getIp66601UserTagSubfldNo01ActualString() {
	    String value = String.valueOf(ip66601UserTagSubfldNo01).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value
	 *  Corresponding COBOL Variable is WS-IP66601-USER-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo01(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip66601UserTagSubfldNo01 = checkIp66601UserTagSubfldNo01MaxLimit(number); 
		serializeIp66601UserTagSubfldNo01(ip66601UserTagSubfldNo01);
	}
	
	public void setIp66601UserTagSubfldNo01(int number) {
	    number = checkIp66601UserTagSubfldNo01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagSubfldNo01((short)number);
	}
	public void setIp66601UserTagSubfldNo01(long number) {
	    number = checkIp66601UserTagSubfldNo01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagSubfldNo01((short)number);
	}
	

	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagSubfldNo01(char[] value) throws CFException {
		 ip66601UserTagSubfldNo01 = serializeIp66601UserTagSubfldNo01(value);
	}
	/**
	 * 	Update Ip66601UserTagSubfldNo01 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp66601UserTagSubfldNo01String(char[] value) throws CFException {
		 setIp66601UserTagSubfldNo01(value);
	}
	/**
	 *	Returns the value of ip66601UserTagStart01
	 *	@return ip66601UserTagStart01
	 */
	public short getIp66601UserTagStart01() throws CFException {
   		return ip66601UserTagStart01;
	}
	
	/**
	 * 	Update Ip66601UserTagStart01 with the passed value
	 *  Corresponding COBOL Variable is WS-IP66601-USER-TAG-START
	 *	@param number
	 */
	public void setIp66601UserTagStart01(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagStart01 = checkIp66601UserTagStart01MaxLimit(number); 
	}

	public void setIp66601UserTagStart01(int number) {
	    number = checkIp66601UserTagStart01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagStart01((short)number);
	}
	public void setIp66601UserTagStart01(long number) {
	    number = checkIp66601UserTagStart01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagStart01((short)number);
	}
	

	/**
	 *	Returns the value of ip66601UserTagLngth01
	 *	@return ip66601UserTagLngth01
	 */
	public short getIp66601UserTagLngth01() throws CFException {
   		return ip66601UserTagLngth01;
	}
	
	/**
	 * 	Update Ip66601UserTagLngth01 with the passed value
	 *  Corresponding COBOL Variable is WS-IP66601-USER-TAG-LNGTH
	 *	@param number
	 */
	public void setIp66601UserTagLngth01(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagLngth01 = checkIp66601UserTagLngth01MaxLimit(number); 
	}

	public void setIp66601UserTagLngth01(int number) {
	    number = checkIp66601UserTagLngth01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagLngth01((short)number);
	}
	public void setIp66601UserTagLngth01(long number) {
	    number = checkIp66601UserTagLngth01MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagLngth01((short)number);
	}
	

	/**
	 *	Returns the value of ip66601UserTagStatus01
	 *	@return ip66601UserTagStatus01
	 */
   public char[] getIp66601UserTagStatus01() throws CFException{
   		return ip66601UserTagStatus01;
   }

  
	/**
	*  set variable ip66601UserTagStatus01
	*  Corresponding COBOL Variable is WS-IP66601-USER-TAG-STATUS
	*  @param value
	**/
   public void setIp66601UserTagStatus01(char[] value) {
       value = checkIp66601UserTagStatus01Constraints(value);
       arraycopy(value,0,ip66601UserTagStatus01,0,value.length);
   } 
	public void setIp66601UserTagStatus01(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip66601UserTagStatus01,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
