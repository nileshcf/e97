package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404PrimaryCrncyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00404PrimaryCrncyTbl extends Ip00404PrimaryCrncyTblSerialized { 
   

								private int ip00404CardPrimeTxnCur;

								private int ip00404CardPrimeBlngCur;

								private int ip00404CardPrimeBlngExp;
	
	/**
	* Constructor for Ip00404PrimaryCrncyTbl
	**/
    public Ip00404PrimaryCrncyTbl() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404PrimaryCrncyTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404PrimaryCrncyTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00404CardPrimeTxnCur
	 *	@return ip00404CardPrimeTxnCur
	 */
	public int getIp00404CardPrimeTxnCur() throws CFException {
       if (isIp00404CardPrimeTxnCurModified()) { 
           ip00404CardPrimeTxnCur = refreshIp00404CardPrimeTxnCur();
        }
   		return ip00404CardPrimeTxnCur;
	}
	

	
	   
	/**
	 * 	Update Ip00404CardPrimeTxnCur with the passed value
	 *  Corresponding COBOL Variable is IP00404-CARD-PRIME-TXN-CUR
	 *	@param number
	 */
	public void setIp00404CardPrimeTxnCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CardPrimeTxnCur = checkIp00404CardPrimeTxnCurMaxLimit(number); 
		serializeIp00404CardPrimeTxnCur(ip00404CardPrimeTxnCur);
	}
	

	public void setIp00404CardPrimeTxnCur(long number) {
	    number = checkIp00404CardPrimeTxnCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CardPrimeTxnCur((int)number);
	}
	
	/**
	 * 	Update Ip00404CardPrimeTxnCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CardPrimeTxnCur(char[] value) throws CFException {
		 ip00404CardPrimeTxnCur = serializeIp00404CardPrimeTxnCur(value);
	}
	/**
	 * 	Update Ip00404CardPrimeTxnCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CardPrimeTxnCurString(char[] value) throws CFException {
		 setIp00404CardPrimeTxnCur(value);
	}
	/**
	 *	Returns the value of ip00404CardPrimeBlngCur
	 *	@return ip00404CardPrimeBlngCur
	 */
	public int getIp00404CardPrimeBlngCur() throws CFException {
       if (isIp00404CardPrimeBlngCurModified()) { 
           ip00404CardPrimeBlngCur = refreshIp00404CardPrimeBlngCur();
        }
   		return ip00404CardPrimeBlngCur;
	}
	

	
	   
	/**
	 * 	Update Ip00404CardPrimeBlngCur with the passed value
	 *  Corresponding COBOL Variable is IP00404-CARD-PRIME-BLNG-CUR
	 *	@param number
	 */
	public void setIp00404CardPrimeBlngCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CardPrimeBlngCur = checkIp00404CardPrimeBlngCurMaxLimit(number); 
		serializeIp00404CardPrimeBlngCur(ip00404CardPrimeBlngCur);
	}
	

	public void setIp00404CardPrimeBlngCur(long number) {
	    number = checkIp00404CardPrimeBlngCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CardPrimeBlngCur((int)number);
	}
	
	/**
	 * 	Update Ip00404CardPrimeBlngCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CardPrimeBlngCur(char[] value) throws CFException {
		 ip00404CardPrimeBlngCur = serializeIp00404CardPrimeBlngCur(value);
	}
	/**
	 * 	Update Ip00404CardPrimeBlngCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CardPrimeBlngCurString(char[] value) throws CFException {
		 setIp00404CardPrimeBlngCur(value);
	}
	/**
	 *	Returns the value of ip00404CardPrimeBlngExp
	 *	@return ip00404CardPrimeBlngExp
	 */
	public int getIp00404CardPrimeBlngExp() throws CFException {
       if (isIp00404CardPrimeBlngExpModified()) { 
           ip00404CardPrimeBlngExp = refreshIp00404CardPrimeBlngExp();
        }
   		return ip00404CardPrimeBlngExp;
	}
	

	
	   
	/**
	 * 	Update Ip00404CardPrimeBlngExp with the passed value
	 *  Corresponding COBOL Variable is IP00404-CARD-PRIME-BLNG-EXP
	 *	@param number
	 */
	public void setIp00404CardPrimeBlngExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CardPrimeBlngExp = checkIp00404CardPrimeBlngExpMaxLimit(number); 
		serializeIp00404CardPrimeBlngExp(ip00404CardPrimeBlngExp);
	}
	

	public void setIp00404CardPrimeBlngExp(long number) {
	    number = checkIp00404CardPrimeBlngExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CardPrimeBlngExp((int)number);
	}
	
	/**
	 * 	Update Ip00404CardPrimeBlngExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CardPrimeBlngExp(char[] value) throws CFException {
		 ip00404CardPrimeBlngExp = serializeIp00404CardPrimeBlngExp(value);
	}
	/**
	 * 	Update Ip00404CardPrimeBlngExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CardPrimeBlngExpString(char[] value) throws CFException {
		 setIp00404CardPrimeBlngExp(value);
	}

	
	
	
	/**
	 * 	initializes Ip00404PrimaryCrncyTbl
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404CardPrimeTxnCur(0);
                     setIp00404CardPrimeBlngCur(0);
                     setIp00404CardPrimeBlngExp(0);
   }

		public static int getIp00404PrimaryCrncyTblFieldLength() {
			return IP_00404_PRIMARY_CRNCY_TBL_LENGTH;
		}

}
  
