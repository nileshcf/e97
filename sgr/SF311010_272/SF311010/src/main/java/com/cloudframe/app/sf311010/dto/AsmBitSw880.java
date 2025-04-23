package com.cloudframe.app.sf311010.dto;

/**
*  The class AsmBitSw880 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AsmBitSw880 extends AsmBitSw880Serialized { 
   

								private int bit0880;

								private int bit1880;

								private int bit2880;

								private int bit3880;

								private int bit4880;

								private int bit5880;

								private int bit6880;

								private int bit7880;
	
	/**
	* Constructor for AsmBitSw880
	**/
    public AsmBitSw880() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AsmBitSw880. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AsmBitSw880(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bit0880
	 *	@return bit0880
	 */
	public int getBit0880() throws CFException {
       if (isBit0880Modified()) { 
           bit0880 = refreshBit0880();
        }
   		return bit0880;
	}
	

	
	   
	/**
	 * 	Update Bit0880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT0
	 *	@param number
	 */
	public void setBit0880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit0880 = checkBit0880MaxLimit(number); 
		serializeBit0880(bit0880);
	}
	

	public void setBit0880(long number) {
	    number = checkBit0880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit0880((int)number);
	}
	
	/**
	 * 	Update Bit0880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit0880(char[] value) throws CFException {
		 bit0880 = serializeBit0880(value);
	}
	/**
	 * 	Update Bit0880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit0880String(char[] value) throws CFException {
		 setBit0880(value);
	}
	
	/**
	 *	Test condition 1 for isBit0On88880()
	 *	@return  Returns true if isBit0On88880() is 1
	 */
   public boolean isBit0On88880() throws CFException {
      return (  getBit0880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit0On88880True() {  			
    	setBit0880( 1);
   	}
	/**
	 *	Returns the value of bit1880
	 *	@return bit1880
	 */
	public int getBit1880() throws CFException {
       if (isBit1880Modified()) { 
           bit1880 = refreshBit1880();
        }
   		return bit1880;
	}
	

	
	   
	/**
	 * 	Update Bit1880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT1
	 *	@param number
	 */
	public void setBit1880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit1880 = checkBit1880MaxLimit(number); 
		serializeBit1880(bit1880);
	}
	

	public void setBit1880(long number) {
	    number = checkBit1880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit1880((int)number);
	}
	
	/**
	 * 	Update Bit1880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit1880(char[] value) throws CFException {
		 bit1880 = serializeBit1880(value);
	}
	/**
	 * 	Update Bit1880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit1880String(char[] value) throws CFException {
		 setBit1880(value);
	}
	
	/**
	 *	Test condition 1 for isBit1On88880()
	 *	@return  Returns true if isBit1On88880() is 1
	 */
   public boolean isBit1On88880() throws CFException {
      return (  getBit1880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit1On88880True() {  			
    	setBit1880( 1);
   	}
	/**
	 *	Returns the value of bit2880
	 *	@return bit2880
	 */
	public int getBit2880() throws CFException {
       if (isBit2880Modified()) { 
           bit2880 = refreshBit2880();
        }
   		return bit2880;
	}
	

	
	   
	/**
	 * 	Update Bit2880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT2
	 *	@param number
	 */
	public void setBit2880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit2880 = checkBit2880MaxLimit(number); 
		serializeBit2880(bit2880);
	}
	

	public void setBit2880(long number) {
	    number = checkBit2880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit2880((int)number);
	}
	
	/**
	 * 	Update Bit2880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit2880(char[] value) throws CFException {
		 bit2880 = serializeBit2880(value);
	}
	/**
	 * 	Update Bit2880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit2880String(char[] value) throws CFException {
		 setBit2880(value);
	}
	
	/**
	 *	Test condition 1 for isBit2On88880()
	 *	@return  Returns true if isBit2On88880() is 1
	 */
   public boolean isBit2On88880() throws CFException {
      return (  getBit2880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit2On88880True() {  			
    	setBit2880( 1);
   	}
	/**
	 *	Returns the value of bit3880
	 *	@return bit3880
	 */
	public int getBit3880() throws CFException {
       if (isBit3880Modified()) { 
           bit3880 = refreshBit3880();
        }
   		return bit3880;
	}
	

	
	   
	/**
	 * 	Update Bit3880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT3
	 *	@param number
	 */
	public void setBit3880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit3880 = checkBit3880MaxLimit(number); 
		serializeBit3880(bit3880);
	}
	

	public void setBit3880(long number) {
	    number = checkBit3880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit3880((int)number);
	}
	
	/**
	 * 	Update Bit3880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit3880(char[] value) throws CFException {
		 bit3880 = serializeBit3880(value);
	}
	/**
	 * 	Update Bit3880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit3880String(char[] value) throws CFException {
		 setBit3880(value);
	}
	
	/**
	 *	Test condition 1 for isBit3On88880()
	 *	@return  Returns true if isBit3On88880() is 1
	 */
   public boolean isBit3On88880() throws CFException {
      return (  getBit3880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit3On88880True() {  			
    	setBit3880( 1);
   	}
	/**
	 *	Returns the value of bit4880
	 *	@return bit4880
	 */
	public int getBit4880() throws CFException {
       if (isBit4880Modified()) { 
           bit4880 = refreshBit4880();
        }
   		return bit4880;
	}
	

	
	   
	/**
	 * 	Update Bit4880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT4
	 *	@param number
	 */
	public void setBit4880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit4880 = checkBit4880MaxLimit(number); 
		serializeBit4880(bit4880);
	}
	

	public void setBit4880(long number) {
	    number = checkBit4880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit4880((int)number);
	}
	
	/**
	 * 	Update Bit4880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit4880(char[] value) throws CFException {
		 bit4880 = serializeBit4880(value);
	}
	/**
	 * 	Update Bit4880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit4880String(char[] value) throws CFException {
		 setBit4880(value);
	}
	
	/**
	 *	Test condition 1 for isBit4On88880()
	 *	@return  Returns true if isBit4On88880() is 1
	 */
   public boolean isBit4On88880() throws CFException {
      return (  getBit4880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit4On88880True() {  			
    	setBit4880( 1);
   	}
	/**
	 *	Returns the value of bit5880
	 *	@return bit5880
	 */
	public int getBit5880() throws CFException {
       if (isBit5880Modified()) { 
           bit5880 = refreshBit5880();
        }
   		return bit5880;
	}
	

	
	   
	/**
	 * 	Update Bit5880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT5
	 *	@param number
	 */
	public void setBit5880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit5880 = checkBit5880MaxLimit(number); 
		serializeBit5880(bit5880);
	}
	

	public void setBit5880(long number) {
	    number = checkBit5880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit5880((int)number);
	}
	
	/**
	 * 	Update Bit5880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit5880(char[] value) throws CFException {
		 bit5880 = serializeBit5880(value);
	}
	/**
	 * 	Update Bit5880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit5880String(char[] value) throws CFException {
		 setBit5880(value);
	}
	
	/**
	 *	Test condition 1 for isBit5On88880()
	 *	@return  Returns true if isBit5On88880() is 1
	 */
   public boolean isBit5On88880() throws CFException {
      return (  getBit5880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit5On88880True() {  			
    	setBit5880( 1);
   	}
	/**
	 *	Returns the value of bit6880
	 *	@return bit6880
	 */
	public int getBit6880() throws CFException {
       if (isBit6880Modified()) { 
           bit6880 = refreshBit6880();
        }
   		return bit6880;
	}
	

	
	   
	/**
	 * 	Update Bit6880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT6
	 *	@param number
	 */
	public void setBit6880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit6880 = checkBit6880MaxLimit(number); 
		serializeBit6880(bit6880);
	}
	

	public void setBit6880(long number) {
	    number = checkBit6880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit6880((int)number);
	}
	
	/**
	 * 	Update Bit6880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit6880(char[] value) throws CFException {
		 bit6880 = serializeBit6880(value);
	}
	/**
	 * 	Update Bit6880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit6880String(char[] value) throws CFException {
		 setBit6880(value);
	}
	
	/**
	 *	Test condition 1 for isBit6On88880()
	 *	@return  Returns true if isBit6On88880() is 1
	 */
   public boolean isBit6On88880() throws CFException {
      return (  getBit6880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit6On88880True() {  			
    	setBit6880( 1);
   	}
	/**
	 *	Returns the value of bit7880
	 *	@return bit7880
	 */
	public int getBit7880() throws CFException {
       if (isBit7880Modified()) { 
           bit7880 = refreshBit7880();
        }
   		return bit7880;
	}
	

	
	   
	/**
	 * 	Update Bit7880 with the passed value
	 *  Corresponding COBOL Variable is 880-BIT7
	 *	@param number
	 */
	public void setBit7880(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bit7880 = checkBit7880MaxLimit(number); 
		serializeBit7880(bit7880);
	}
	

	public void setBit7880(long number) {
	    number = checkBit7880MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBit7880((int)number);
	}
	
	/**
	 * 	Update Bit7880 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBit7880(char[] value) throws CFException {
		 bit7880 = serializeBit7880(value);
	}
	/**
	 * 	Update Bit7880 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBit7880String(char[] value) throws CFException {
		 setBit7880(value);
	}
	
	/**
	 *	Test condition 1 for isBit7On88880()
	 *	@return  Returns true if isBit7On88880() is 1
	 */
   public boolean isBit7On88880() throws CFException {
      return (  getBit7880()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setBit7On88880True() {  			
    	setBit7880( 1);
   	}

	
	
	

		public static int getAsmBitSw880FieldLength() {
			return ASM_BIT_SW_880_LENGTH;
		}

}
  
