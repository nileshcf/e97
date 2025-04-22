package com.cloudframe.app.comput.dto;

/**
*  The class Msp3pprcsIcaNum300Redefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.comput.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Msp3pprcsIcaNum300Redefined extends Msp3pprcsIcaNum300RedefinedSerialized { 
   

								private int byte7300;

								private int byte6300;

								private int byte5300;

								private int byte4300;

								private int byte3300;

								private int byte2300;

								private int byte1300;

								private int byte0300;
	
	/**
	* Constructor for Msp3pprcsIcaNum300Redefined
	**/
    public Msp3pprcsIcaNum300Redefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Msp3pprcsIcaNum300Redefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Msp3pprcsIcaNum300Redefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of byte7300
	 *	@return byte7300
	 */
	public int getByte7300() throws CFException {
       if (isByte7300Modified()) { 
           byte7300 = refreshByte7300();
        }
   		return byte7300;
	}
	

	
	   
	/**
	 * 	Update Byte7300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-7
	 *	@param number
	 */
	public void setByte7300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte7300 = checkByte7300MaxLimit(number); 
		serializeByte7300(byte7300);
	}
	

	public void setByte7300(long number) {
	    number = checkByte7300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte7300((int)number);
	}
	
	/**
	 * 	Update Byte7300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte7300(char[] value) throws CFException {
		 byte7300 = serializeByte7300(value);
	}
	/**
	 * 	Update Byte7300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte7300String(char[] value) throws CFException {
		 setByte7300(value);
	}
	/**
	 *	Returns the value of byte6300
	 *	@return byte6300
	 */
	public int getByte6300() throws CFException {
       if (isByte6300Modified()) { 
           byte6300 = refreshByte6300();
        }
   		return byte6300;
	}
	

	
	   
	/**
	 * 	Update Byte6300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-6
	 *	@param number
	 */
	public void setByte6300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte6300 = checkByte6300MaxLimit(number); 
		serializeByte6300(byte6300);
	}
	

	public void setByte6300(long number) {
	    number = checkByte6300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte6300((int)number);
	}
	
	/**
	 * 	Update Byte6300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte6300(char[] value) throws CFException {
		 byte6300 = serializeByte6300(value);
	}
	/**
	 * 	Update Byte6300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte6300String(char[] value) throws CFException {
		 setByte6300(value);
	}
	/**
	 *	Returns the value of byte5300
	 *	@return byte5300
	 */
	public int getByte5300() throws CFException {
       if (isByte5300Modified()) { 
           byte5300 = refreshByte5300();
        }
   		return byte5300;
	}
	

	
	   
	/**
	 * 	Update Byte5300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-5
	 *	@param number
	 */
	public void setByte5300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte5300 = checkByte5300MaxLimit(number); 
		serializeByte5300(byte5300);
	}
	

	public void setByte5300(long number) {
	    number = checkByte5300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte5300((int)number);
	}
	
	/**
	 * 	Update Byte5300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte5300(char[] value) throws CFException {
		 byte5300 = serializeByte5300(value);
	}
	/**
	 * 	Update Byte5300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte5300String(char[] value) throws CFException {
		 setByte5300(value);
	}
	/**
	 *	Returns the value of byte4300
	 *	@return byte4300
	 */
	public int getByte4300() throws CFException {
       if (isByte4300Modified()) { 
           byte4300 = refreshByte4300();
        }
   		return byte4300;
	}
	

	
	   
	/**
	 * 	Update Byte4300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-4
	 *	@param number
	 */
	public void setByte4300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte4300 = checkByte4300MaxLimit(number); 
		serializeByte4300(byte4300);
	}
	

	public void setByte4300(long number) {
	    number = checkByte4300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte4300((int)number);
	}
	
	/**
	 * 	Update Byte4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte4300(char[] value) throws CFException {
		 byte4300 = serializeByte4300(value);
	}
	/**
	 * 	Update Byte4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte4300String(char[] value) throws CFException {
		 setByte4300(value);
	}
	/**
	 *	Returns the value of byte3300
	 *	@return byte3300
	 */
	public int getByte3300() throws CFException {
       if (isByte3300Modified()) { 
           byte3300 = refreshByte3300();
        }
   		return byte3300;
	}
	

	
	   
	/**
	 * 	Update Byte3300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-3
	 *	@param number
	 */
	public void setByte3300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte3300 = checkByte3300MaxLimit(number); 
		serializeByte3300(byte3300);
	}
	

	public void setByte3300(long number) {
	    number = checkByte3300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte3300((int)number);
	}
	
	/**
	 * 	Update Byte3300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte3300(char[] value) throws CFException {
		 byte3300 = serializeByte3300(value);
	}
	/**
	 * 	Update Byte3300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte3300String(char[] value) throws CFException {
		 setByte3300(value);
	}
	/**
	 *	Returns the value of byte2300
	 *	@return byte2300
	 */
	public int getByte2300() throws CFException {
       if (isByte2300Modified()) { 
           byte2300 = refreshByte2300();
        }
   		return byte2300;
	}
	

	
	   
	/**
	 * 	Update Byte2300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-2
	 *	@param number
	 */
	public void setByte2300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte2300 = checkByte2300MaxLimit(number); 
		serializeByte2300(byte2300);
	}
	

	public void setByte2300(long number) {
	    number = checkByte2300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte2300((int)number);
	}
	
	/**
	 * 	Update Byte2300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte2300(char[] value) throws CFException {
		 byte2300 = serializeByte2300(value);
	}
	/**
	 * 	Update Byte2300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte2300String(char[] value) throws CFException {
		 setByte2300(value);
	}
	/**
	 *	Returns the value of byte1300
	 *	@return byte1300
	 */
	public int getByte1300() throws CFException {
       if (isByte1300Modified()) { 
           byte1300 = refreshByte1300();
        }
   		return byte1300;
	}
	

	
	   
	/**
	 * 	Update Byte1300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-1
	 *	@param number
	 */
	public void setByte1300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte1300 = checkByte1300MaxLimit(number); 
		serializeByte1300(byte1300);
	}
	

	public void setByte1300(long number) {
	    number = checkByte1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte1300((int)number);
	}
	
	/**
	 * 	Update Byte1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte1300(char[] value) throws CFException {
		 byte1300 = serializeByte1300(value);
	}
	/**
	 * 	Update Byte1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte1300String(char[] value) throws CFException {
		 setByte1300(value);
	}
	/**
	 *	Returns the value of byte0300
	 *	@return byte0300
	 */
	public int getByte0300() throws CFException {
       if (isByte0300Modified()) { 
           byte0300 = refreshByte0300();
        }
   		return byte0300;
	}
	

	
	   
	/**
	 * 	Update Byte0300 with the passed value
	 *  Corresponding COBOL Variable is 300-BYTE-0
	 *	@param number
	 */
	public void setByte0300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    byte0300 = checkByte0300MaxLimit(number); 
		serializeByte0300(byte0300);
	}
	

	public void setByte0300(long number) {
	    number = checkByte0300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setByte0300((int)number);
	}
	
	/**
	 * 	Update Byte0300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setByte0300(char[] value) throws CFException {
		 byte0300 = serializeByte0300(value);
	}
	/**
	 * 	Update Byte0300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setByte0300String(char[] value) throws CFException {
		 setByte0300(value);
	}

	
	
	

		public static int getMsp3pprcsIcaNum300RedefinedFieldLength() {
			return MSP_3PPRCS_ICA_NUM_300_REDEFINED_LENGTH;
		}

}
  
