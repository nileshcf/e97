package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040FloorExpiryDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040FloorExpiryDate extends Ip0040FloorExpiryDateSerialized { 
   

								private int ip0040FloorExpiryCcyy;

								private int ip0040FloorExpiryMm;
	
	/**
	* Constructor for Ip0040FloorExpiryDate
	**/
    public Ip0040FloorExpiryDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040FloorExpiryDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040FloorExpiryDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040FloorExpiryCcyy
	 *	@return ip0040FloorExpiryCcyy
	 */
	public int getIp0040FloorExpiryCcyy() throws CFException {
       if (isIp0040FloorExpiryCcyyModified()) { 
           ip0040FloorExpiryCcyy = refreshIp0040FloorExpiryCcyy();
        }
   		return ip0040FloorExpiryCcyy;
	}
	

	
	   
	/**
	 * 	Update Ip0040FloorExpiryCcyy with the passed value
	 *  Corresponding COBOL Variable is IP0040-FLOOR-EXPIRY-CCYY
	 *	@param number
	 */
	public void setIp0040FloorExpiryCcyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040FloorExpiryCcyy = checkIp0040FloorExpiryCcyyMaxLimit(number); 
		serializeIp0040FloorExpiryCcyy(ip0040FloorExpiryCcyy);
	}
	

	public void setIp0040FloorExpiryCcyy(long number) {
	    number = checkIp0040FloorExpiryCcyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040FloorExpiryCcyy((int)number);
	}
	
	/**
	 * 	Update Ip0040FloorExpiryCcyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040FloorExpiryCcyy(char[] value) throws CFException {
		 ip0040FloorExpiryCcyy = serializeIp0040FloorExpiryCcyy(value);
	}
	/**
	 * 	Update Ip0040FloorExpiryCcyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040FloorExpiryCcyyString(char[] value) throws CFException {
		 setIp0040FloorExpiryCcyy(value);
	}
	/**
	 *	Returns the value of ip0040FloorExpiryMm
	 *	@return ip0040FloorExpiryMm
	 */
	public int getIp0040FloorExpiryMm() throws CFException {
       if (isIp0040FloorExpiryMmModified()) { 
           ip0040FloorExpiryMm = refreshIp0040FloorExpiryMm();
        }
   		return ip0040FloorExpiryMm;
	}
	

	
	   
	/**
	 * 	Update Ip0040FloorExpiryMm with the passed value
	 *  Corresponding COBOL Variable is IP0040-FLOOR-EXPIRY-MM
	 *	@param number
	 */
	public void setIp0040FloorExpiryMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040FloorExpiryMm = checkIp0040FloorExpiryMmMaxLimit(number); 
		serializeIp0040FloorExpiryMm(ip0040FloorExpiryMm);
	}
	

	public void setIp0040FloorExpiryMm(long number) {
	    number = checkIp0040FloorExpiryMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040FloorExpiryMm((int)number);
	}
	
	/**
	 * 	Update Ip0040FloorExpiryMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040FloorExpiryMm(char[] value) throws CFException {
		 ip0040FloorExpiryMm = serializeIp0040FloorExpiryMm(value);
	}
	/**
	 * 	Update Ip0040FloorExpiryMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040FloorExpiryMmString(char[] value) throws CFException {
		 setIp0040FloorExpiryMm(value);
	}

	
	
	
	/**
	 * 	initializes Ip0040FloorExpiryDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040FloorExpiryCcyy(0);
                     setIp0040FloorExpiryMm(0);
   }

		public static int getIp0040FloorExpiryDateFieldLength() {
			return IP_0040_FLOOR_EXPIRY_DATE_LENGTH;
		}

}
  
