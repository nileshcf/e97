package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iPrimaryCrncyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040iPrimaryCrncyTbl extends Ip0040iPrimaryCrncyTblSerialized { 
   

								private int ip0040iCardPrimeTxnCur;

								private int ip0040iCardPrimeBlngCur;

								private int ip0040iCardPrimeBlngExp;
	
	/**
	* Constructor for Ip0040iPrimaryCrncyTbl
	**/
    public Ip0040iPrimaryCrncyTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iPrimaryCrncyTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iPrimaryCrncyTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040iCardPrimeTxnCur
	 *	@return ip0040iCardPrimeTxnCur
	 */
	public int getIp0040iCardPrimeTxnCur() throws CFException {
       if (isIp0040iCardPrimeTxnCurModified()) { 
           ip0040iCardPrimeTxnCur = refreshIp0040iCardPrimeTxnCur();
        }
   		return ip0040iCardPrimeTxnCur;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCardPrimeTxnCur with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CARD-PRIME-TXN-CUR
	 *	@param number
	 */
	public void setIp0040iCardPrimeTxnCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCardPrimeTxnCur = checkIp0040iCardPrimeTxnCurMaxLimit(number); 
		serializeIp0040iCardPrimeTxnCur(ip0040iCardPrimeTxnCur);
	}
	

	public void setIp0040iCardPrimeTxnCur(long number) {
	    number = checkIp0040iCardPrimeTxnCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCardPrimeTxnCur((int)number);
	}
	
	/**
	 * 	Update Ip0040iCardPrimeTxnCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardPrimeTxnCur(char[] value) throws CFException {
		 ip0040iCardPrimeTxnCur = serializeIp0040iCardPrimeTxnCur(value);
	}
	/**
	 * 	Update Ip0040iCardPrimeTxnCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardPrimeTxnCurString(char[] value) throws CFException {
		 setIp0040iCardPrimeTxnCur(value);
	}
	/**
	 *	Returns the value of ip0040iCardPrimeBlngCur
	 *	@return ip0040iCardPrimeBlngCur
	 */
	public int getIp0040iCardPrimeBlngCur() throws CFException {
       if (isIp0040iCardPrimeBlngCurModified()) { 
           ip0040iCardPrimeBlngCur = refreshIp0040iCardPrimeBlngCur();
        }
   		return ip0040iCardPrimeBlngCur;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCardPrimeBlngCur with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CARD-PRIME-BLNG-CUR
	 *	@param number
	 */
	public void setIp0040iCardPrimeBlngCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCardPrimeBlngCur = checkIp0040iCardPrimeBlngCurMaxLimit(number); 
		serializeIp0040iCardPrimeBlngCur(ip0040iCardPrimeBlngCur);
	}
	

	public void setIp0040iCardPrimeBlngCur(long number) {
	    number = checkIp0040iCardPrimeBlngCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCardPrimeBlngCur((int)number);
	}
	
	/**
	 * 	Update Ip0040iCardPrimeBlngCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardPrimeBlngCur(char[] value) throws CFException {
		 ip0040iCardPrimeBlngCur = serializeIp0040iCardPrimeBlngCur(value);
	}
	/**
	 * 	Update Ip0040iCardPrimeBlngCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardPrimeBlngCurString(char[] value) throws CFException {
		 setIp0040iCardPrimeBlngCur(value);
	}
	/**
	 *	Returns the value of ip0040iCardPrimeBlngExp
	 *	@return ip0040iCardPrimeBlngExp
	 */
	public int getIp0040iCardPrimeBlngExp() throws CFException {
       if (isIp0040iCardPrimeBlngExpModified()) { 
           ip0040iCardPrimeBlngExp = refreshIp0040iCardPrimeBlngExp();
        }
   		return ip0040iCardPrimeBlngExp;
	}
	

	
	   
	/**
	 * 	Update Ip0040iCardPrimeBlngExp with the passed value
	 *  Corresponding COBOL Variable is IP0040I-CARD-PRIME-BLNG-EXP
	 *	@param number
	 */
	public void setIp0040iCardPrimeBlngExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iCardPrimeBlngExp = checkIp0040iCardPrimeBlngExpMaxLimit(number); 
		serializeIp0040iCardPrimeBlngExp(ip0040iCardPrimeBlngExp);
	}
	

	public void setIp0040iCardPrimeBlngExp(long number) {
	    number = checkIp0040iCardPrimeBlngExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iCardPrimeBlngExp((int)number);
	}
	
	/**
	 * 	Update Ip0040iCardPrimeBlngExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardPrimeBlngExp(char[] value) throws CFException {
		 ip0040iCardPrimeBlngExp = serializeIp0040iCardPrimeBlngExp(value);
	}
	/**
	 * 	Update Ip0040iCardPrimeBlngExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iCardPrimeBlngExpString(char[] value) throws CFException {
		 setIp0040iCardPrimeBlngExp(value);
	}

	
	
	
	/**
	 * 	initializes Ip0040iPrimaryCrncyTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iCardPrimeTxnCur(0);
                     setIp0040iCardPrimeBlngCur(0);
                     setIp0040iCardPrimeBlngExp(0);
   }

		public static int getIp0040iPrimaryCrncyTblFieldLength() {
			return IP_0040I_PRIMARY_CRNCY_TBL_LENGTH;
		}

}
  
