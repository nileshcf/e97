package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404FloorExpiryDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00404FloorExpiryDate extends Ip00404FloorExpiryDateSerialized { 
   

								private int ip00404FloorExpiryCcyy;

								private int ip00404FloorExpiryMm;
	
	/**
	* Constructor for Ip00404FloorExpiryDate
	**/
    public Ip00404FloorExpiryDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404FloorExpiryDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404FloorExpiryDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00404FloorExpiryCcyy
	 *	@return ip00404FloorExpiryCcyy
	 */
	public int getIp00404FloorExpiryCcyy() throws CFException {
       if (isIp00404FloorExpiryCcyyModified()) { 
           ip00404FloorExpiryCcyy = refreshIp00404FloorExpiryCcyy();
        }
   		return ip00404FloorExpiryCcyy;
	}
	

	
	   
	/**
	 * 	Update Ip00404FloorExpiryCcyy with the passed value
	 *  Corresponding COBOL Variable is IP00404-FLOOR-EXPIRY-CCYY
	 *	@param number
	 */
	public void setIp00404FloorExpiryCcyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404FloorExpiryCcyy = checkIp00404FloorExpiryCcyyMaxLimit(number); 
		serializeIp00404FloorExpiryCcyy(ip00404FloorExpiryCcyy);
	}
	

	public void setIp00404FloorExpiryCcyy(long number) {
	    number = checkIp00404FloorExpiryCcyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404FloorExpiryCcyy((int)number);
	}
	
	/**
	 * 	Update Ip00404FloorExpiryCcyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404FloorExpiryCcyy(char[] value) throws CFException {
		 ip00404FloorExpiryCcyy = serializeIp00404FloorExpiryCcyy(value);
	}
	/**
	 * 	Update Ip00404FloorExpiryCcyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404FloorExpiryCcyyString(char[] value) throws CFException {
		 setIp00404FloorExpiryCcyy(value);
	}
	/**
	 *	Returns the value of ip00404FloorExpiryMm
	 *	@return ip00404FloorExpiryMm
	 */
	public int getIp00404FloorExpiryMm() throws CFException {
       if (isIp00404FloorExpiryMmModified()) { 
           ip00404FloorExpiryMm = refreshIp00404FloorExpiryMm();
        }
   		return ip00404FloorExpiryMm;
	}
	

	
	   
	/**
	 * 	Update Ip00404FloorExpiryMm with the passed value
	 *  Corresponding COBOL Variable is IP00404-FLOOR-EXPIRY-MM
	 *	@param number
	 */
	public void setIp00404FloorExpiryMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404FloorExpiryMm = checkIp00404FloorExpiryMmMaxLimit(number); 
		serializeIp00404FloorExpiryMm(ip00404FloorExpiryMm);
	}
	

	public void setIp00404FloorExpiryMm(long number) {
	    number = checkIp00404FloorExpiryMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404FloorExpiryMm((int)number);
	}
	
	/**
	 * 	Update Ip00404FloorExpiryMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404FloorExpiryMm(char[] value) throws CFException {
		 ip00404FloorExpiryMm = serializeIp00404FloorExpiryMm(value);
	}
	/**
	 * 	Update Ip00404FloorExpiryMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404FloorExpiryMmString(char[] value) throws CFException {
		 setIp00404FloorExpiryMm(value);
	}

	
	
	
	/**
	 * 	initializes Ip00404FloorExpiryDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404FloorExpiryCcyy(0);
                     setIp00404FloorExpiryMm(0);
   }

		public static int getIp00404FloorExpiryDateFieldLength() {
			return IP_00404_FLOOR_EXPIRY_DATE_LENGTH;
		}

}
  
