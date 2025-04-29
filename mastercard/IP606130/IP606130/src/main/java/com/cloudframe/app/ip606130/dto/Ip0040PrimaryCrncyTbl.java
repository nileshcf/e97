package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040PrimaryCrncyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040PrimaryCrncyTbl extends Ip0040PrimaryCrncyTblSerialized { 
   

								private int ip0040CardPrimeTxnCur;

								private int ip0040CardPrimeBlngCur;

								private int ip0040CardPrimeBlngExp;
	
	/**
	* Constructor for Ip0040PrimaryCrncyTbl
	**/
    public Ip0040PrimaryCrncyTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040PrimaryCrncyTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040PrimaryCrncyTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040CardPrimeTxnCur
	 *	@return ip0040CardPrimeTxnCur
	 */
	public int getIp0040CardPrimeTxnCur() throws CFException {
       if (isIp0040CardPrimeTxnCurModified()) { 
           ip0040CardPrimeTxnCur = refreshIp0040CardPrimeTxnCur();
        }
   		return ip0040CardPrimeTxnCur;
	}
	

	
	   
	/**
	 * 	Update Ip0040CardPrimeTxnCur with the passed value
	 *  Corresponding COBOL Variable is IP0040-CARD-PRIME-TXN-CUR
	 *	@param number
	 */
	public void setIp0040CardPrimeTxnCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CardPrimeTxnCur = checkIp0040CardPrimeTxnCurMaxLimit(number); 
		serializeIp0040CardPrimeTxnCur(ip0040CardPrimeTxnCur);
	}
	

	public void setIp0040CardPrimeTxnCur(long number) {
	    number = checkIp0040CardPrimeTxnCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CardPrimeTxnCur((int)number);
	}
	
	/**
	 * 	Update Ip0040CardPrimeTxnCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CardPrimeTxnCur(char[] value) throws CFException {
		 ip0040CardPrimeTxnCur = serializeIp0040CardPrimeTxnCur(value);
	}
	/**
	 * 	Update Ip0040CardPrimeTxnCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CardPrimeTxnCurString(char[] value) throws CFException {
		 setIp0040CardPrimeTxnCur(value);
	}
	/**
	 *	Returns the value of ip0040CardPrimeBlngCur
	 *	@return ip0040CardPrimeBlngCur
	 */
	public int getIp0040CardPrimeBlngCur() throws CFException {
       if (isIp0040CardPrimeBlngCurModified()) { 
           ip0040CardPrimeBlngCur = refreshIp0040CardPrimeBlngCur();
        }
   		return ip0040CardPrimeBlngCur;
	}
	

	
	   
	/**
	 * 	Update Ip0040CardPrimeBlngCur with the passed value
	 *  Corresponding COBOL Variable is IP0040-CARD-PRIME-BLNG-CUR
	 *	@param number
	 */
	public void setIp0040CardPrimeBlngCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CardPrimeBlngCur = checkIp0040CardPrimeBlngCurMaxLimit(number); 
		serializeIp0040CardPrimeBlngCur(ip0040CardPrimeBlngCur);
	}
	

	public void setIp0040CardPrimeBlngCur(long number) {
	    number = checkIp0040CardPrimeBlngCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CardPrimeBlngCur((int)number);
	}
	
	/**
	 * 	Update Ip0040CardPrimeBlngCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CardPrimeBlngCur(char[] value) throws CFException {
		 ip0040CardPrimeBlngCur = serializeIp0040CardPrimeBlngCur(value);
	}
	/**
	 * 	Update Ip0040CardPrimeBlngCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CardPrimeBlngCurString(char[] value) throws CFException {
		 setIp0040CardPrimeBlngCur(value);
	}
	/**
	 *	Returns the value of ip0040CardPrimeBlngExp
	 *	@return ip0040CardPrimeBlngExp
	 */
	public int getIp0040CardPrimeBlngExp() throws CFException {
       if (isIp0040CardPrimeBlngExpModified()) { 
           ip0040CardPrimeBlngExp = refreshIp0040CardPrimeBlngExp();
        }
   		return ip0040CardPrimeBlngExp;
	}
	

	
	   
	/**
	 * 	Update Ip0040CardPrimeBlngExp with the passed value
	 *  Corresponding COBOL Variable is IP0040-CARD-PRIME-BLNG-EXP
	 *	@param number
	 */
	public void setIp0040CardPrimeBlngExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040CardPrimeBlngExp = checkIp0040CardPrimeBlngExpMaxLimit(number); 
		serializeIp0040CardPrimeBlngExp(ip0040CardPrimeBlngExp);
	}
	

	public void setIp0040CardPrimeBlngExp(long number) {
	    number = checkIp0040CardPrimeBlngExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040CardPrimeBlngExp((int)number);
	}
	
	/**
	 * 	Update Ip0040CardPrimeBlngExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040CardPrimeBlngExp(char[] value) throws CFException {
		 ip0040CardPrimeBlngExp = serializeIp0040CardPrimeBlngExp(value);
	}
	/**
	 * 	Update Ip0040CardPrimeBlngExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040CardPrimeBlngExpString(char[] value) throws CFException {
		 setIp0040CardPrimeBlngExp(value);
	}

	
	
	
	/**
	 * 	initializes Ip0040PrimaryCrncyTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040CardPrimeTxnCur(0);
                     setIp0040CardPrimeBlngCur(0);
                     setIp0040CardPrimeBlngExp(0);
   }

		public static int getIp0040PrimaryCrncyTblFieldLength() {
			return IP_0040_PRIMARY_CRNCY_TBL_LENGTH;
		}

}
  
