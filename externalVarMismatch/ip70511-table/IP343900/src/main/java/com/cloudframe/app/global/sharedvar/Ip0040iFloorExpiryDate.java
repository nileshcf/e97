package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iFloorExpiryDate is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040iFloorExpiryDate extends Ip0040iFloorExpiryDateSerialized { 
   

								private int ip0040iFloorExpiryCcyy;

								private int ip0040iFloorExpiryMm;
	
	/**
	* Constructor for Ip0040iFloorExpiryDate
	**/
    public Ip0040iFloorExpiryDate() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040iFloorExpiryDate. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iFloorExpiryDate(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip0040iFloorExpiryCcyy
	 *	@return ip0040iFloorExpiryCcyy
	 */
	public int getIp0040iFloorExpiryCcyy() throws CFException {
       if (isIp0040iFloorExpiryCcyyModified()) { 
           ip0040iFloorExpiryCcyy = refreshIp0040iFloorExpiryCcyy();
        }
   		return ip0040iFloorExpiryCcyy;
	}
	

	
	   
	/**
	 * 	Update Ip0040iFloorExpiryCcyy with the passed value
	 *  Corresponding COBOL Variable is IP0040I-FLOOR-EXPIRY-CCYY
	 *	@param number
	 */
	public void setIp0040iFloorExpiryCcyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iFloorExpiryCcyy = checkIp0040iFloorExpiryCcyyMaxLimit(number); 
		serializeIp0040iFloorExpiryCcyy(ip0040iFloorExpiryCcyy);
	}
	

	public void setIp0040iFloorExpiryCcyy(long number) {
	    number = checkIp0040iFloorExpiryCcyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iFloorExpiryCcyy((int)number);
	}
	
	/**
	 * 	Update Ip0040iFloorExpiryCcyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iFloorExpiryCcyy(char[] value) throws CFException {
		 ip0040iFloorExpiryCcyy = serializeIp0040iFloorExpiryCcyy(value);
	}
	/**
	 * 	Update Ip0040iFloorExpiryCcyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iFloorExpiryCcyyString(char[] value) throws CFException {
		 setIp0040iFloorExpiryCcyy(value);
	}
	/**
	 *	Returns the value of ip0040iFloorExpiryMm
	 *	@return ip0040iFloorExpiryMm
	 */
	public int getIp0040iFloorExpiryMm() throws CFException {
       if (isIp0040iFloorExpiryMmModified()) { 
           ip0040iFloorExpiryMm = refreshIp0040iFloorExpiryMm();
        }
   		return ip0040iFloorExpiryMm;
	}
	

	
	   
	/**
	 * 	Update Ip0040iFloorExpiryMm with the passed value
	 *  Corresponding COBOL Variable is IP0040I-FLOOR-EXPIRY-MM
	 *	@param number
	 */
	public void setIp0040iFloorExpiryMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0040iFloorExpiryMm = checkIp0040iFloorExpiryMmMaxLimit(number); 
		serializeIp0040iFloorExpiryMm(ip0040iFloorExpiryMm);
	}
	

	public void setIp0040iFloorExpiryMm(long number) {
	    number = checkIp0040iFloorExpiryMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp0040iFloorExpiryMm((int)number);
	}
	
	/**
	 * 	Update Ip0040iFloorExpiryMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0040iFloorExpiryMm(char[] value) throws CFException {
		 ip0040iFloorExpiryMm = serializeIp0040iFloorExpiryMm(value);
	}
	/**
	 * 	Update Ip0040iFloorExpiryMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0040iFloorExpiryMmString(char[] value) throws CFException {
		 setIp0040iFloorExpiryMm(value);
	}

	
	
	
	/**
	 * 	initializes Ip0040iFloorExpiryDate
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iFloorExpiryCcyy(0);
                     setIp0040iFloorExpiryMm(0);
   }

		public static int getIp0040iFloorExpiryDateFieldLength() {
			return IP_0040I_FLOOR_EXPIRY_DATE_LENGTH;
		}

}
  
