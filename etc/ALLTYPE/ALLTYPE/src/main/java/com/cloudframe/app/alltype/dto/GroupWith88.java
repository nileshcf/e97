package com.cloudframe.app.alltype.dto;

/**
*  The class GroupWith88 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:28. using version 5.0.0.254
**/


import com.cloudframe.app.alltype.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import java.math.RoundingMode;
import com.cloudframe.app.common.CONSTANTS;


public class GroupWith88 extends GroupWith88Serialized { 
   

								private short cBinarySign1;

								private int cBinarySign2;

								private long cBinarySign3;

								private int cBinaryUnsign1;

								private long cBinaryUnsign2;

								private long cBinaryUnsign3;

								private short cDisplaySign1;

								private int cDisplaySign2;

								private long cDisplaySign3;

								private int cDisplayUnsign1;

								private long cDisplayUnsign2;

								private long cDisplayUnsign3;

								private short cPackedSign1;

								private int cPackedUnsign1;

								private BigDecimal cDecBinarySign1 = BigDecimal.ZERO;

								private BigDecimal cDecBinaryUnsign1 = BigDecimal.ZERO;

								private BigDecimal cDecDisplaySign1 = BigDecimal.ZERO;

								private BigDecimal cDecDisplayUnsign1 = BigDecimal.ZERO;

								private BigDecimal cDecPackedSign1 = BigDecimal.ZERO;

								private BigDecimal cDecPackedUnsign1 = BigDecimal.ZERO;

						private char[] cChar = new char[5];

						private char[] cCharJustRight = new char[5];

						private char[] cCharZero9 = Field.fillLowValue(5);

								private char[] cCharZero0 = Field.fillLowValue(5);

								private char[] cCharZero = new char[5];
							
	
	/**
	* Constructor for GroupWith88
	**/
    public GroupWith88() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for GroupWith88. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public GroupWith88(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setCBinarySign1((short)1);
								setCBinarySign2(1);
								setCBinarySign3(1L);
								setCBinaryUnsign1(1);
								setCBinaryUnsign2(1L);
								setCBinaryUnsign3(1L);
								setCDisplaySign1((short)1);
								setCDisplaySign2(1);
								setCDisplaySign3(1L);
								setCDisplayUnsign1(1);
								setCDisplayUnsign2(1L);
								setCDisplayUnsign3(1L);
								setCPackedSign1((short)1);
								setCPackedUnsign1(1);
								setCDecBinarySign1(BigDecimal.valueOf(1).setScale(2));
								setCDecBinaryUnsign1(BigDecimal.valueOf(1).setScale(2));
								setCDecDisplaySign1(BigDecimal.valueOf(1).setScale(2));
								setCDecDisplayUnsign1(BigDecimal.valueOf(1).setScale(2));
								setCDecPackedSign1(BigDecimal.valueOf(1).setScale(2));
								setCDecPackedUnsign1(BigDecimal.valueOf(1).setScale(2));
								setCChar(("1    ").toCharArray());
								setCCharJustRight(("1    ").toCharArray());
								setCCharZero(("00011").toCharArray());
    } 

	/**
	 *	Returns the value of cBinarySign1
	 *	@return cBinarySign1
	 */
	public short getCBinarySign1() throws CFException {
        if (isCBinarySign1Modified()) { 
           cBinarySign1 = refreshCBinarySign1();
        }
   		return cBinarySign1;
	}
	
	/**
	 * 	Update CBinarySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-BINARY-SIGN1
	 *	@param number
	 */
	public void setCBinarySign1(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cBinarySign1 = checkCBinarySign1MaxLimit(number); 
		serializeCBinarySign1(cBinarySign1);
	}

	public void setCBinarySign1(int number) {
	    number = checkCBinarySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCBinarySign1((short)number);
	}
	public void setCBinarySign1(long number) {
	    number = checkCBinarySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCBinarySign1((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isCBinarySign1188()
	 *	@return  Returns true if isCBinarySign1188() is 1
	 */
   public boolean isCBinarySign1188() throws CFException {
      return (  getCBinarySign1()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCBinarySign1188True() {  			
    	setCBinarySign1( (short)1);
   	}
	
	/**
	 *	Test condition 0 2 3 4 for isCBinarySign1288()
	 *	@return  Returns true if isCBinarySign1288() is 0 2 3 4
	 */
   public boolean isCBinarySign1288() throws CFException {
      return (  getCBinarySign1()  ==  0  ||  getCBinarySign1()  ==  2  ||  getCBinarySign1()  ==  3  ||  getCBinarySign1()  ==  4  );
   }


	/**
	*  set values 0 2 3 4
	*/
   	public void setCBinarySign1288True() {  			
    	setCBinarySign1( (short)0);
   	}
	/**
	 *	Returns the value of cBinarySign2
	 *	@return cBinarySign2
	 */
	public int getCBinarySign2() throws CFException {
        if (isCBinarySign2Modified()) { 
           cBinarySign2 = refreshCBinarySign2();
        }
   		return cBinarySign2;
	}
	
	/**
	 * 	Update CBinarySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-C-BINARY-SIGN2
	 *	@param number
	 */
	public void setCBinarySign2(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cBinarySign2 = checkCBinarySign2MaxLimit(number); 
		serializeCBinarySign2(cBinarySign2);
	}


	public void setCBinarySign2(long number) {
	    number = checkCBinarySign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCBinarySign2((int)number);
	}
	
	
	/**
	 *	Test condition 1 for isCBinarySign2188()
	 *	@return  Returns true if isCBinarySign2188() is 1
	 */
   public boolean isCBinarySign2188() throws CFException {
      return (  getCBinarySign2()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCBinarySign2188True() {  			
    	setCBinarySign2( 1);
   	}
	
	/**
	 *	Test condition 0 2 3 4 for isCBinarySign2288()
	 *	@return  Returns true if isCBinarySign2288() is 0 2 3 4
	 */
   public boolean isCBinarySign2288() throws CFException {
      return (  getCBinarySign2()  ==  0  ||  getCBinarySign2()  ==  2  ||  getCBinarySign2()  ==  3  ||  getCBinarySign2()  ==  4  );
   }


	/**
	*  set values 0 2 3 4
	*/
   	public void setCBinarySign2288True() {  			
    	setCBinarySign2( 0);
   	}
	/**
	 *	Returns the value of cBinarySign3
	 *	@return cBinarySign3
	 */
	public long getCBinarySign3() throws CFException {
        if (isCBinarySign3Modified()) { 
           cBinarySign3 = refreshCBinarySign3();
        }
   		return cBinarySign3;
	}
	
	/**
	 * 	Update CBinarySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-C-BINARY-SIGN3
	 *	@param number
	 */
	public void setCBinarySign3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    cBinarySign3 = checkCBinarySign3MaxLimit(number); 
		serializeCBinarySign3(cBinarySign3);
	}


	
	/**
	 *	Test condition 1 for isCBinarySign3188()
	 *	@return  Returns true if isCBinarySign3188() is 1
	 */
   public boolean isCBinarySign3188() throws CFException {
      return (  getCBinarySign3()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCBinarySign3188True() {  			
    	setCBinarySign3( 1);
   	}
	
	/**
	 *	Test condition 0 2 3 4 for isCBinarySign3288()
	 *	@return  Returns true if isCBinarySign3288() is 0 2 3 4
	 */
   public boolean isCBinarySign3288() throws CFException {
      return (  getCBinarySign3()  ==  0  ||  getCBinarySign3()  ==  2  ||  getCBinarySign3()  ==  3  ||  getCBinarySign3()  ==  4  );
   }


	/**
	*  set values 0 2 3 4
	*/
   	public void setCBinarySign3288True() {  			
    	setCBinarySign3( 0);
   	}
	/**
	 *	Returns the value of cBinaryUnsign1
	 *	@return cBinaryUnsign1
	 */
	public int getCBinaryUnsign1() throws CFException {
        if (isCBinaryUnsign1Modified()) { 
           cBinaryUnsign1 = refreshCBinaryUnsign1();
        }
   		return cBinaryUnsign1;
	}
	
	/**
	 * 	Update CBinaryUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-BINARY-UNSIGN1
	 *	@param number
	 */
	public void setCBinaryUnsign1(int number) {
	     // Truncate if the number is beyond +/- Max range
	    cBinaryUnsign1 = checkCBinaryUnsign1MaxLimit(number); 
		serializeCBinaryUnsign1(cBinaryUnsign1);
	}


	public void setCBinaryUnsign1(long number) {
	    number = checkCBinaryUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCBinaryUnsign1((int)number);
	}
	
	
	/**
	 *	Test condition 1 for isCBinaryUnsign1188()
	 *	@return  Returns true if isCBinaryUnsign1188() is 1
	 */
   public boolean isCBinaryUnsign1188() throws CFException {
      return (  getCBinaryUnsign1()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCBinaryUnsign1188True() {  			
    	setCBinaryUnsign1( 1);
   	}
	
	/**
	 *	Test condition 0 2 3 4 for isCBinaryUnsign1288()
	 *	@return  Returns true if isCBinaryUnsign1288() is 0 2 3 4
	 */
   public boolean isCBinaryUnsign1288() throws CFException {
      return (  getCBinaryUnsign1()  ==  0  ||  getCBinaryUnsign1()  ==  2  ||  getCBinaryUnsign1()  ==  3  ||  getCBinaryUnsign1()  ==  4  );
   }


	/**
	*  set values 0 2 3 4
	*/
   	public void setCBinaryUnsign1288True() {  			
    	setCBinaryUnsign1( 0);
   	}
	/**
	 *	Returns the value of cBinaryUnsign2
	 *	@return cBinaryUnsign2
	 */
	public long getCBinaryUnsign2() throws CFException {
        if (isCBinaryUnsign2Modified()) { 
           cBinaryUnsign2 = refreshCBinaryUnsign2();
        }
   		return cBinaryUnsign2;
	}
	
	/**
	 * 	Update CBinaryUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-C-BINARY-UNSIGN2
	 *	@param number
	 */
	public void setCBinaryUnsign2(long number) {
	     // Truncate if the number is beyond +/- Max range
	    cBinaryUnsign2 = checkCBinaryUnsign2MaxLimit(number); 
		serializeCBinaryUnsign2(cBinaryUnsign2);
	}


	
	/**
	 *	Test condition 1 for isCBinaryUnsign2188()
	 *	@return  Returns true if isCBinaryUnsign2188() is 1
	 */
   public boolean isCBinaryUnsign2188() throws CFException {
      return (  getCBinaryUnsign2()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCBinaryUnsign2188True() {  			
    	setCBinaryUnsign2( 1);
   	}
	
	/**
	 *	Test condition 0 2 3 4 for isCBinaryUnsign2288()
	 *	@return  Returns true if isCBinaryUnsign2288() is 0 2 3 4
	 */
   public boolean isCBinaryUnsign2288() throws CFException {
      return (  getCBinaryUnsign2()  ==  0  ||  getCBinaryUnsign2()  ==  2  ||  getCBinaryUnsign2()  ==  3  ||  getCBinaryUnsign2()  ==  4  );
   }


	/**
	*  set values 0 2 3 4
	*/
   	public void setCBinaryUnsign2288True() {  			
    	setCBinaryUnsign2( 0);
   	}
	/**
	 *	Returns the value of cBinaryUnsign3
	 *	@return cBinaryUnsign3
	 */
	public long getCBinaryUnsign3() throws CFException {
        if (isCBinaryUnsign3Modified()) { 
           cBinaryUnsign3 = refreshCBinaryUnsign3();
        }
   		return cBinaryUnsign3;
	}
	
	/**
	 * 	Update CBinaryUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-C-BINARY-UNSIGN3
	 *	@param number
	 */
	public void setCBinaryUnsign3(long number) {
	     // Truncate if the number is beyond +/- Max range
	    cBinaryUnsign3 = checkCBinaryUnsign3MaxLimit(number); 
		serializeCBinaryUnsign3(cBinaryUnsign3);
	}


	
	/**
	 *	Test condition 1 for isCBinaryUnsign3188()
	 *	@return  Returns true if isCBinaryUnsign3188() is 1
	 */
   public boolean isCBinaryUnsign3188() throws CFException {
      return (  getCBinaryUnsign3()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCBinaryUnsign3188True() {  			
    	setCBinaryUnsign3( 1);
   	}
	
	/**
	 *	Test condition 0 2 3 4 for isCBinaryUnsign3288()
	 *	@return  Returns true if isCBinaryUnsign3288() is 0 2 3 4
	 */
   public boolean isCBinaryUnsign3288() throws CFException {
      return (  getCBinaryUnsign3()  ==  0  ||  getCBinaryUnsign3()  ==  2  ||  getCBinaryUnsign3()  ==  3  ||  getCBinaryUnsign3()  ==  4  );
   }


	/**
	*  set values 0 2 3 4
	*/
   	public void setCBinaryUnsign3288True() {  			
    	setCBinaryUnsign3( 0);
   	}
	/**
	 *	Returns the value of cDisplaySign1
	 *	@return cDisplaySign1
	 */
	public short getCDisplaySign1() throws CFException {
       if (isCDisplaySign1Modified()) { 
           cDisplaySign1 = refreshCDisplaySign1();
        }
   		return cDisplaySign1;
	}
	

    /**
	 *	Returns the String value of cDisplaySign1
	 *	@return cDisplaySign1
	 */
	public char[]  getCDisplaySign1ActualString() {
	    String value = String.valueOf(cDisplaySign1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CDisplaySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DISPLAY-SIGN1
	 *	@param number
	 */
	public void setCDisplaySign1(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    cDisplaySign1 = checkCDisplaySign1MaxLimit(number); 
		serializeCDisplaySign1(cDisplaySign1);
	}
	
	public void setCDisplaySign1(int number) {
	    number = checkCDisplaySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCDisplaySign1((short)number);
	}
	public void setCDisplaySign1(long number) {
	    number = checkCDisplaySign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCDisplaySign1((short)number);
	}
	

	/**
	 * 	Update CDisplaySign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDisplaySign1(char[] value) throws CFException {
		 cDisplaySign1 = serializeCDisplaySign1(value);
	}
	/**
	 * 	Update CDisplaySign1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCDisplaySign1String(char[] value) throws CFException {
		 setCDisplaySign1(value);
	}
	
	/**
	 *	Test condition 1 for isCDisplaySign1188()
	 *	@return  Returns true if isCDisplaySign1188() is 1
	 */
   public boolean isCDisplaySign1188() throws CFException {
      return (  getCDisplaySign1()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCDisplaySign1188True() {  			
    	setCDisplaySign1( (short)1);
   	}
	
	/**
	 *	Test condition 3 4 0 for isCDisplaySign1288()
	 *	@return  Returns true if isCDisplaySign1288() is 3 4 0
	 */
   public boolean isCDisplaySign1288() throws CFException {
      return (  getCDisplaySign1()  ==  3  ||  getCDisplaySign1()  ==  4  ||  getCDisplaySign1()  ==  0  );
   }


	/**
	*  set values 3 4 0
	*/
   	public void setCDisplaySign1288True() {  			
    	setCDisplaySign1( (short)3);
   	}
	/**
	 *	Returns the value of cDisplaySign2
	 *	@return cDisplaySign2
	 */
	public int getCDisplaySign2() throws CFException {
       if (isCDisplaySign2Modified()) { 
           cDisplaySign2 = refreshCDisplaySign2();
        }
   		return cDisplaySign2;
	}
	

    /**
	 *	Returns the String value of cDisplaySign2
	 *	@return cDisplaySign2
	 */
	public char[]  getCDisplaySign2ActualString() {
	    String value = String.valueOf(cDisplaySign2).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CDisplaySign2 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DISPLAY-SIGN2
	 *	@param number
	 */
	public void setCDisplaySign2(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cDisplaySign2 = checkCDisplaySign2MaxLimit(number); 
		serializeCDisplaySign2(cDisplaySign2);
	}
	

	public void setCDisplaySign2(long number) {
	    number = checkCDisplaySign2MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCDisplaySign2((int)number);
	}
	
	/**
	 * 	Update CDisplaySign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDisplaySign2(char[] value) throws CFException {
		 cDisplaySign2 = serializeCDisplaySign2(value);
	}
	/**
	 * 	Update CDisplaySign2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCDisplaySign2String(char[] value) throws CFException {
		 setCDisplaySign2(value);
	}
	
	/**
	 *	Test condition 1 for isCDisplaySign2188()
	 *	@return  Returns true if isCDisplaySign2188() is 1
	 */
   public boolean isCDisplaySign2188() throws CFException {
      return (  getCDisplaySign2()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCDisplaySign2188True() {  			
    	setCDisplaySign2( 1);
   	}
	
	/**
	 *	Test condition 3 4 0 for isCDisplaySign2288()
	 *	@return  Returns true if isCDisplaySign2288() is 3 4 0
	 */
   public boolean isCDisplaySign2288() throws CFException {
      return (  getCDisplaySign2()  ==  3  ||  getCDisplaySign2()  ==  4  ||  getCDisplaySign2()  ==  0  );
   }


	/**
	*  set values 3 4 0
	*/
   	public void setCDisplaySign2288True() {  			
    	setCDisplaySign2( 3);
   	}
	/**
	 *	Returns the value of cDisplaySign3
	 *	@return cDisplaySign3
	 */
	public long getCDisplaySign3() throws CFException {
       if (isCDisplaySign3Modified()) { 
           cDisplaySign3 = refreshCDisplaySign3();
        }
   		return cDisplaySign3;
	}
	

    /**
	 *	Returns the String value of cDisplaySign3
	 *	@return cDisplaySign3
	 */
	public char[]  getCDisplaySign3ActualString() {
	    String value = String.valueOf(cDisplaySign3).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CDisplaySign3 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DISPLAY-SIGN3
	 *	@param number
	 */
	public void setCDisplaySign3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cDisplaySign3 = checkCDisplaySign3MaxLimit(number); 
		serializeCDisplaySign3(cDisplaySign3);
	}
	

	/**
	 * 	Update CDisplaySign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDisplaySign3(char[] value) throws CFException {
		 cDisplaySign3 = serializeCDisplaySign3(value);
	}
	/**
	 * 	Update CDisplaySign3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCDisplaySign3String(char[] value) throws CFException {
		 setCDisplaySign3(value);
	}
	
	/**
	 *	Test condition 1 for isCDisplaySign3188()
	 *	@return  Returns true if isCDisplaySign3188() is 1
	 */
   public boolean isCDisplaySign3188() throws CFException {
      return (  getCDisplaySign3()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCDisplaySign3188True() {  			
    	setCDisplaySign3( 1);
   	}
	
	/**
	 *	Test condition 3 4 0 for isCDisplaySign3288()
	 *	@return  Returns true if isCDisplaySign3288() is 3 4 0
	 */
   public boolean isCDisplaySign3288() throws CFException {
      return (  getCDisplaySign3()  ==  3  ||  getCDisplaySign3()  ==  4  ||  getCDisplaySign3()  ==  0  );
   }


	/**
	*  set values 3 4 0
	*/
   	public void setCDisplaySign3288True() {  			
    	setCDisplaySign3( 3);
   	}
	/**
	 *	Returns the value of cDisplayUnsign1
	 *	@return cDisplayUnsign1
	 */
	public int getCDisplayUnsign1() throws CFException {
       if (isCDisplayUnsign1Modified()) { 
           cDisplayUnsign1 = refreshCDisplayUnsign1();
        }
   		return cDisplayUnsign1;
	}
	

	
	   
	/**
	 * 	Update CDisplayUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DISPLAY-UNSIGN1
	 *	@param number
	 */
	public void setCDisplayUnsign1(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cDisplayUnsign1 = checkCDisplayUnsign1MaxLimit(number); 
		serializeCDisplayUnsign1(cDisplayUnsign1);
	}
	

	public void setCDisplayUnsign1(long number) {
	    number = checkCDisplayUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCDisplayUnsign1((int)number);
	}
	
	/**
	 * 	Update CDisplayUnsign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDisplayUnsign1(char[] value) throws CFException {
		 cDisplayUnsign1 = serializeCDisplayUnsign1(value);
	}
	/**
	 * 	Update CDisplayUnsign1 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCDisplayUnsign1String(char[] value) throws CFException {
		 setCDisplayUnsign1(value);
	}
	
	/**
	 *	Test condition 1 for isCDisplayUnsign1188()
	 *	@return  Returns true if isCDisplayUnsign1188() is 1
	 */
   public boolean isCDisplayUnsign1188() throws CFException {
      return (  getCDisplayUnsign1()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCDisplayUnsign1188True() {  			
    	setCDisplayUnsign1( 1);
   	}
	
	/**
	 *	Test condition 3 4 0 for isCDisplayUnsign1288()
	 *	@return  Returns true if isCDisplayUnsign1288() is 3 4 0
	 */
   public boolean isCDisplayUnsign1288() throws CFException {
      return (  getCDisplayUnsign1()  ==  3  ||  getCDisplayUnsign1()  ==  4  ||  getCDisplayUnsign1()  ==  0  );
   }


	/**
	*  set values 3 4 0
	*/
   	public void setCDisplayUnsign1288True() {  			
    	setCDisplayUnsign1( 3);
   	}
	/**
	 *	Returns the value of cDisplayUnsign2
	 *	@return cDisplayUnsign2
	 */
	public long getCDisplayUnsign2() throws CFException {
       if (isCDisplayUnsign2Modified()) { 
           cDisplayUnsign2 = refreshCDisplayUnsign2();
        }
   		return cDisplayUnsign2;
	}
	

	
	   
	/**
	 * 	Update CDisplayUnsign2 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DISPLAY-UNSIGN2
	 *	@param number
	 */
	public void setCDisplayUnsign2(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cDisplayUnsign2 = checkCDisplayUnsign2MaxLimit(number); 
		serializeCDisplayUnsign2(cDisplayUnsign2);
	}
	

	/**
	 * 	Update CDisplayUnsign2 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDisplayUnsign2(char[] value) throws CFException {
		 cDisplayUnsign2 = serializeCDisplayUnsign2(value);
	}
	/**
	 * 	Update CDisplayUnsign2 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCDisplayUnsign2String(char[] value) throws CFException {
		 setCDisplayUnsign2(value);
	}
	
	/**
	 *	Test condition 1 for isCDisplayUnsign2188()
	 *	@return  Returns true if isCDisplayUnsign2188() is 1
	 */
   public boolean isCDisplayUnsign2188() throws CFException {
      return (  getCDisplayUnsign2()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCDisplayUnsign2188True() {  			
    	setCDisplayUnsign2( 1);
   	}
	
	/**
	 *	Test condition 3 0 4 for isCDisplayUnsign2288()
	 *	@return  Returns true if isCDisplayUnsign2288() is 3 0 4
	 */
   public boolean isCDisplayUnsign2288() throws CFException {
      return (  getCDisplayUnsign2()  ==  3  ||  getCDisplayUnsign2()  ==  0  ||  getCDisplayUnsign2()  ==  4  );
   }


	/**
	*  set values 3 0 4
	*/
   	public void setCDisplayUnsign2288True() {  			
    	setCDisplayUnsign2( 3);
   	}
	/**
	 *	Returns the value of cDisplayUnsign3
	 *	@return cDisplayUnsign3
	 */
	public long getCDisplayUnsign3() throws CFException {
       if (isCDisplayUnsign3Modified()) { 
           cDisplayUnsign3 = refreshCDisplayUnsign3();
        }
   		return cDisplayUnsign3;
	}
	

	
	   
	/**
	 * 	Update CDisplayUnsign3 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DISPLAY-UNSIGN3
	 *	@param number
	 */
	public void setCDisplayUnsign3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    cDisplayUnsign3 = checkCDisplayUnsign3MaxLimit(number); 
		serializeCDisplayUnsign3(cDisplayUnsign3);
	}
	

	/**
	 * 	Update CDisplayUnsign3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDisplayUnsign3(char[] value) throws CFException {
		 cDisplayUnsign3 = serializeCDisplayUnsign3(value);
	}
	/**
	 * 	Update CDisplayUnsign3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCDisplayUnsign3String(char[] value) throws CFException {
		 setCDisplayUnsign3(value);
	}
	
	/**
	 *	Test condition 1 for isCDisplayUnsign3188()
	 *	@return  Returns true if isCDisplayUnsign3188() is 1
	 */
   public boolean isCDisplayUnsign3188() throws CFException {
      return (  getCDisplayUnsign3()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setCDisplayUnsign3188True() {  			
    	setCDisplayUnsign3( 1);
   	}
	
	/**
	 *	Test condition 3 0 4 for isCDisplayUnsign3288()
	 *	@return  Returns true if isCDisplayUnsign3288() is 3 0 4
	 */
   public boolean isCDisplayUnsign3288() throws CFException {
      return (  getCDisplayUnsign3()  ==  3  ||  getCDisplayUnsign3()  ==  0  ||  getCDisplayUnsign3()  ==  4  );
   }


	/**
	*  set values 3 0 4
	*/
   	public void setCDisplayUnsign3288True() {  			
    	setCDisplayUnsign3( 3);
   	}
	public short getCPackedSign1() throws CFException {
        if (isCPackedSign1Modified()) { 
           cPackedSign1 = refreshCPackedSign1();
        }
   		return cPackedSign1;
	}
	
	/**
	 * 	Update CPackedSign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-PACKED-SIGN1
	 *	@param number
	 */
	public void setCPackedSign1(short number) {
			cPackedSign1 = checkCPackedSign1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCPackedSign1(cPackedSign1);
	}

	public void setCPackedSign1(int number) {
	    number = checkCPackedSign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCPackedSign1((short)number);
	}
	public void setCPackedSign1(long number) {
	    number = checkCPackedSign1MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCPackedSign1((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isCPackedSign1188()
	 *	@return  Returns true if isCPackedSign1188() is 0
	 */
   public boolean isCPackedSign1188() throws CFException {
      return (  getCPackedSign1()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setCPackedSign1188True() {  			
    	setCPackedSign1( (short)0);
   	}
	
	/**
	 *	Test condition 3 4 5 for isCPackedSign2188()
	 *	@return  Returns true if isCPackedSign2188() is 3 4 5
	 */
   public boolean isCPackedSign2188() throws CFException {
      return (  getCPackedSign1()  ==  3  ||  getCPackedSign1()  ==  4  ||  getCPackedSign1()  ==  5  );
   }


	/**
	*  set values 3 4 5
	*/
   	public void setCPackedSign2188True() {  			
    	setCPackedSign1( (short)3);
   	}
	
	/**
	 *	Test condition 10 THRU 100 200 THRU 210 300 THRU 310 5 6 for isCPackedSign3188()
	 *	@return  Returns true if isCPackedSign3188() is 10 THRU 100 200 THRU 210 300 THRU 310 5 6
	 */
   public boolean isCPackedSign3188() throws CFException {
      return (   (getCPackedSign1()  >=  10 ) &&   (getCPackedSign1()  <=  100 )   ||   (getCPackedSign1()  >=  200 ) &&   (getCPackedSign1()  <=  210 )   ||   (getCPackedSign1()  >=  300 ) &&   (getCPackedSign1()  <=  310 )   ||  getCPackedSign1()  ==  5  ||  getCPackedSign1()  ==  6  );
   }


	/**
	*  set values 10 THRU 100 200 THRU 210 300 THRU 310 5 6
	*/
   	public void setCPackedSign3188True() {  			
    	setCPackedSign1( (short)10);
   	}
	public int getCPackedUnsign1() throws CFException {
        if (isCPackedUnsign1Modified()) { 
           cPackedUnsign1 = refreshCPackedUnsign1();
        }
   		return cPackedUnsign1;
	}
	
	/**
	 * 	Update CPackedUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-PACKED-UNSIGN1
	 *	@param number
	 */
	public void setCPackedUnsign1(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			cPackedUnsign1 = checkCPackedUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeCPackedUnsign1(cPackedUnsign1);
	}


	public void setCPackedUnsign1(long number) {
	    number = checkCPackedUnsign1MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCPackedUnsign1((int)number);
	}
	
	
	/**
	 *	Test condition 0 for isCPackedUnsign1188()
	 *	@return  Returns true if isCPackedUnsign1188() is 0
	 */
   public boolean isCPackedUnsign1188() throws CFException {
      return (  getCPackedUnsign1()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setCPackedUnsign1188True() {  			
    	setCPackedUnsign1( 0);
   	}
	
	/**
	 *	Test condition 3 4 5 for isCPackedUnsign2188()
	 *	@return  Returns true if isCPackedUnsign2188() is 3 4 5
	 */
   public boolean isCPackedUnsign2188() throws CFException {
      return (  getCPackedUnsign1()  ==  3  ||  getCPackedUnsign1()  ==  4  ||  getCPackedUnsign1()  ==  5  );
   }


	/**
	*  set values 3 4 5
	*/
   	public void setCPackedUnsign2188True() {  			
    	setCPackedUnsign1( 3);
   	}
	/**
	 *	Returns the value of cDecBinarySign1
	 *	@return cDecBinarySign1
	 */
	public BigDecimal getCDecBinarySign1() throws CFException {
        if (isCDecBinarySign1Modified()) { 
           cDecBinarySign1 = refreshCDecBinarySign1();
        }
   		return cDecBinarySign1;
	}
	
	
	/**
	 * 	Update CDecBinarySign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DEC-BINARY-SIGN1
	 *	@param number
	 */
	public void setCDecBinarySign1(BigDecimal number) {
		cDecBinarySign1 = number.setScale(2,RoundingMode.DOWN);
	    serializeCDecBinarySign1(number);
   }
              
	
	/**
	 *	Test condition 1 2 0 3 for isCDecBinarySign1188()
	 *	@return  Returns true if isCDecBinarySign1188() is 1 2 0 3
	 */
   public boolean isCDecBinarySign1188() throws CFException {
      return (  getCDecBinarySign1() .compareTo( BigDecimal.valueOf(1) ) == 0  ||  getCDecBinarySign1() .compareTo( BigDecimal.valueOf(2) ) == 0  ||  getCDecBinarySign1() .compareTo( BigDecimal.valueOf(0) ) == 0  ||  getCDecBinarySign1() .compareTo( BigDecimal.valueOf(3) ) == 0  );
   }


	/**
	*  set values 1 2 0 3
	*/
   	public void setCDecBinarySign1188True() {  			
    	setCDecBinarySign1( BigDecimal.ONE);
   	}
	/**
	 *	Returns the value of cDecBinaryUnsign1
	 *	@return cDecBinaryUnsign1
	 */
	public BigDecimal getCDecBinaryUnsign1() throws CFException {
        if (isCDecBinaryUnsign1Modified()) { 
           cDecBinaryUnsign1 = refreshCDecBinaryUnsign1();
        }
   		return cDecBinaryUnsign1;
	}
	
	
	/**
	 * 	Update CDecBinaryUnsign1 with the passed value
	 *  Corresponding COBOL Variable is WS-C-DEC-BINARY-UNSIGN1
	 *	@param number
	 */
	public void setCDecBinaryUnsign1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
		cDecBinaryUnsign1 = number.setScale(2,RoundingMode.DOWN);
	    serializeCDecBinaryUnsign1(number);
   }
              
	
	/**
	 *	Test condition 1 2 0 3 for isCDecBinaryUnsign1188()
	 *	@return  Returns true if isCDecBinaryUnsign1188() is 1 2 0 3
	 */
   public boolean isCDecBinaryUnsign1188() throws CFException {
      return (  getCDecBinaryUnsign1() .compareTo( BigDecimal.valueOf(1) ) == 0  ||  getCDecBinaryUnsign1() .compareTo( BigDecimal.valueOf(2) ) == 0  ||  getCDecBinaryUnsign1() .compareTo( BigDecimal.valueOf(0) ) == 0  ||  getCDecBinaryUnsign1() .compareTo( BigDecimal.valueOf(3) ) == 0  );
   }


	/**
	*  set values 1 2 0 3
	*/
   	public void setCDecBinaryUnsign1188True() {  			
    	setCDecBinaryUnsign1( BigDecimal.ONE);
   	}
	/**
	 *	Returns the value of cDecDisplaySign1
	 *	@return cDecDisplaySign1
	 */
	public BigDecimal getCDecDisplaySign1() throws CFException {
       if (isCDecDisplaySign1Modified()) { 
           cDecDisplaySign1 = refreshCDecDisplaySign1();
        }
   		return cDecDisplaySign1;
	}
	

    /**
	 *	Returns the String value of cDecDisplaySign1
	 *	@return cDecDisplaySign1
	 */
	public char[]  getCDecDisplaySign1ActualString() {
	    String value = String.valueOf(cDecDisplaySign1).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update CDecDisplaySign1 with the passed number
	 *  Corresponding COBOL Variable is WS-C-DEC-DISPLAY-SIGN1
	 *	@param number
	 */
	public void setCDecDisplaySign1(BigDecimal number) {
       cDecDisplaySign1 = checkCDecDisplaySign1MaxLimit(number);
	    serializeCDecDisplaySign1(cDecDisplaySign1);
   }
	/**
	 * 	Update CDecDisplaySign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDecDisplaySign1(char[] value) throws CFException {
		 cDecDisplaySign1 = serializeCDecDisplaySign1(value);
	}   
	
	/**
	 *	Test condition 0 for isCDecDisplaySign1188()
	 *	@return  Returns true if isCDecDisplaySign1188() is 0
	 */
   public boolean isCDecDisplaySign1188() throws CFException {
      return (  getCDecDisplaySign1() .compareTo( BigDecimal.valueOf(0) ) == 0  );
   }


	/**
	*  set values 0
	*/
   	public void setCDecDisplaySign1188True() {  			
    	setCDecDisplaySign1( BigDecimal.ZERO);
   	}
	/**
	 *	Returns the value of cDecDisplayUnsign1
	 *	@return cDecDisplayUnsign1
	 */
	public BigDecimal getCDecDisplayUnsign1() throws CFException {
       if (isCDecDisplayUnsign1Modified()) { 
           cDecDisplayUnsign1 = refreshCDecDisplayUnsign1();
        }
   		return cDecDisplayUnsign1;
	}
	

	
	   
	/**
	 * 	Update CDecDisplayUnsign1 with the passed number
	 *  Corresponding COBOL Variable is WS-C-DEC-DISPLAY-UNSIGN1
	 *	@param number
	 */
	public void setCDecDisplayUnsign1(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       cDecDisplayUnsign1 = checkCDecDisplayUnsign1MaxLimit(number);
	    serializeCDecDisplayUnsign1(cDecDisplayUnsign1);
   }
	/**
	 * 	Update CDecDisplayUnsign1 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCDecDisplayUnsign1(char[] value) throws CFException {
		 cDecDisplayUnsign1 = serializeCDecDisplayUnsign1(value);
	}   
	
	/**
	 *	Test condition 0 for isCDecDisplayUnsign1188()
	 *	@return  Returns true if isCDecDisplayUnsign1188() is 0
	 */
   public boolean isCDecDisplayUnsign1188() throws CFException {
      return (  getCDecDisplayUnsign1() .compareTo( BigDecimal.valueOf(0) ) == 0  );
   }


	/**
	*  set values 0
	*/
   	public void setCDecDisplayUnsign1188True() {  			
    	setCDecDisplayUnsign1( BigDecimal.ZERO);
   	}
	public BigDecimal getCDecPackedSign1() throws CFException {
        if (isCDecPackedSign1Modified()) { 
           cDecPackedSign1 = refreshCDecPackedSign1();
        }
   		return cDecPackedSign1;
	}

    public char[] getCDecPackedSign1String() {
          return  cDecPackedSign1String();
    }
	
	/**
	 * 	Update CDecPackedSign1 with the passed number
	 *  Corresponding COBOL Variable is WS-C-DEC-PACKED-SIGN1
	 *	@param number
	 */
	public void setCDecPackedSign1(BigDecimal number) {	
     cDecPackedSign1 = checkCDecPackedSign1MaxLimit(number);
	    serializeCDecPackedSign1(cDecPackedSign1);
   }
	
	/**
	 *	Test condition 0 for isCDecPackedSign1188()
	 *	@return  Returns true if isCDecPackedSign1188() is 0
	 */
   public boolean isCDecPackedSign1188() throws CFException {
      return (  getCDecPackedSign1() .compareTo( BigDecimal.valueOf(0) ) == 0  );
   }


	/**
	*  set values 0
	*/
   	public void setCDecPackedSign1188True() {  			
    	setCDecPackedSign1( BigDecimal.ZERO);
   	}
	public BigDecimal getCDecPackedUnsign1() throws CFException {
        if (isCDecPackedUnsign1Modified()) { 
           cDecPackedUnsign1 = refreshCDecPackedUnsign1();
        }
   		return cDecPackedUnsign1;
	}

    public char[] getCDecPackedUnsign1String() {
          return  cDecPackedUnsign1String();
    }
	
	/**
	 * 	Update CDecPackedUnsign1 with the passed number
	 *  Corresponding COBOL Variable is WS-C-DEC-PACKED-UNSIGN1
	 *	@param number
	 */
	public void setCDecPackedUnsign1(BigDecimal number) {	
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
     cDecPackedUnsign1 = checkCDecPackedUnsign1MaxLimit(number);
	    serializeCDecPackedUnsign1(cDecPackedUnsign1);
   }
	
	/**
	 *	Test condition 0 1 2 3 4 for isCDecPackedUnsign1188()
	 *	@return  Returns true if isCDecPackedUnsign1188() is 0 1 2 3 4
	 */
   public boolean isCDecPackedUnsign1188() throws CFException {
      return (  getCDecPackedUnsign1() .compareTo( BigDecimal.valueOf(0) ) == 0  ||  getCDecPackedUnsign1() .compareTo( BigDecimal.valueOf(1) ) == 0  ||  getCDecPackedUnsign1() .compareTo( BigDecimal.valueOf(2) ) == 0  ||  getCDecPackedUnsign1() .compareTo( BigDecimal.valueOf(3) ) == 0  ||  getCDecPackedUnsign1() .compareTo( BigDecimal.valueOf(4) ) == 0  );
   }


	/**
	*  set values 0 1 2 3 4
	*/
   	public void setCDecPackedUnsign1188True() {  			
    	setCDecPackedUnsign1( BigDecimal.ZERO);
   	}
	/**
	 *	Returns the value of cChar
	 *	@return cChar
	 */
   public char[] getCChar() throws CFException{
     if (isCCharModified()) { 
        cChar = refreshCChar();
     }
   		return cChar;
   }

  
	/**
	*  set variable cChar
	*  Corresponding COBOL Variable is WS-C-CHAR
	*  @param value
	**/
   public void setCChar(char[] value) {
      cChar = checkCCharConstraints(value);
      serializeCChar(cChar);
   } 

     /**
	 * 	Update CChar 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCChar(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCChar,cChar.length);
   	
   }
   
   public void setCChar(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCChar,cChar.length);
   	
   }
   
     /**
	 * 	Update CChar 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCChar(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCChar+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CChar with another Field
	 *	@param value
	 */
   public void setCChar(Field source) {
       replace(source,0,source.length(),beginCChar,C_CHAR_LEN);
   	
   }  
   
     /**
	 * 	Update CChar 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCChar(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCChar,C_CHAR_LEN);
   	
   }
   
     /**
	 * 	Update CChar 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCChar(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCChar+targetIndex,targetLen);
    
   }
	char[] cChar18888Value1 = fillLowValue(5);
char[] cChar18888Value2 = fillHighValue(5);
char[] cChar18888Value3 = "     ".toCharArray();
char[] cChar18888Value4 = "2    ".toCharArray();

	/**
	 *	Test condition new byte[] {(byte)0x00} new byte[] {(byte)0xFF} " " "2" for isCChar188()
	 *	@return  Returns true if isCChar188() is new byte[] {(byte)0x00} new byte[] {(byte)0xFF} " " "2"
	 */
   public boolean isCChar188() throws CFException {
      return (  compareChars( getCChar() , cChar18888Value1)  == 0  ||  compareChars( getCChar() , cChar18888Value2)  == 0  ||  compareChars( getCChar() , cChar18888Value3)  == 0  ||  compareChars( getCChar() , cChar18888Value4)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00} new byte[] {(byte)0xFF} " " "2"
	*/
   	public void setCChar188True() {  			
    	setCChar( cChar18888Value1);
   	}
	char[] cChar28888Value1 = ";    ".toCharArray();
char[] cChar28888Value2 = "~    ".toCharArray();
char[] cChar28888Value3 = ",    ".toCharArray();
char[] cChar28888Value4 = "'    ".toCharArray();
char[] cChar28888Value5 = "~quot".toCharArray();

	/**
	 *	Test condition ";" "~" "," "'" "\"" for isCChar288()
	 *	@return  Returns true if isCChar288() is ";" "~" "," "'" "\""
	 */
   public boolean isCChar288() throws CFException {
      return (  compareChars( getCChar() , cChar28888Value1)  == 0  ||  compareChars( getCChar() , cChar28888Value2)  == 0  ||  compareChars( getCChar() , cChar28888Value3)  == 0  ||  compareChars( getCChar() , cChar28888Value4)  == 0  ||  compareChars( getCChar() , cChar28888Value5)  == 0  );
   }


	/**
	*  set values ";" "~" "," "'" "\""
	*/
   	public void setCChar288True() {  			
    	setCChar( cChar28888Value1);
   	}
	char[] cChar38888Value = ";    ".toCharArray();
	/**
	 *	Test condition ";" for isCChar388()
	 *	@return  Returns true if isCChar388() is ";"
	 */
   public boolean isCChar388() throws CFException {
      return (  compareChars( getCChar() , cChar38888Value)  == 0  );
   }


	/**
	*  set values ";"
	*/
   	public void setCChar388True() {  			
    	setCChar( cChar38888Value);
   	}
	
	/**
	 *	Test condition "A" THRU "D" for isCChar488()
	 *	@return  Returns true if isCChar488() is "A" THRU "D"
	 */
   public boolean isCChar488() throws CFException {
      return (  isGreaterOrEqual(getCChar(), "A    " ) &&  isLessOrEqual(getCChar(),"D" )  );
   }


	/**
	*  set values "A" THRU "D"
	*/
   	public void setCChar488True() {  			
    	setCChar( "A    ".toCharArray());
   	}
	/**
	 *	Returns the value of cCharJustRight
	 *	@return cCharJustRight
	 */
   public char[] getCCharJustRight() throws CFException{
     if (isCCharJustRightModified()) { 
        cCharJustRight = refreshCCharJustRight();
     }
   		return cCharJustRight;
   }

  
	/**
	*  set variable cCharJustRight
	*  Corresponding COBOL Variable is WS-C-CHAR-JUST-RIGHT
	*  @param value
	**/
   public void setCCharJustRight(char[] value) {
      cCharJustRight = checkCCharJustRightConstraints(value);
      serializeCCharJustRight(cCharJustRight);
   } 

     /**
	 * 	Update CCharJustRight 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCCharJustRight(char[] source, int sourceIndex) {
        int targetIndex = (cCharJustRight.length - source.length) + beginCCharJustRight;
        replace(source,sourceIndex,source.length,targetIndex,cCharJustRight.length);
   	
   }
   
   public void setCCharJustRight(char[] source, int sourceIndex , int sourceLen) {
        int targetIndex = (cCharJustRight.length - sourceLen) + beginCCharJustRight;
        replace(source,sourceIndex,sourceLen,targetIndex,cCharJustRight.length);
   	
   }
   
     /**
	 * 	Update CCharJustRight 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCCharJustRight(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (targetLen - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginCCharJustRight+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CCharJustRight with another Field
	 *	@param value
	 */
   public void setCCharJustRight(Field source) {
        int targetIndex = (C_CHAR_JUST_RIGHT_LEN - source.length()) + beginCCharJustRight;
        replace(source,0,source.length(),targetIndex,C_CHAR_JUST_RIGHT_LEN);
   	
   }  
   
     /**
	 * 	Update CCharJustRight 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCCharJustRight(Field source, int sourceIndex,int sourceLen) {
        int targetIndex = (C_CHAR_JUST_RIGHT_LEN - sourceLen) + beginCCharJustRight;
        replace(source,sourceIndex,sourceLen,targetIndex,C_CHAR_JUST_RIGHT_LEN);
   	
   }
   
     /**
	 * 	Update CCharJustRight 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCCharJustRight(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
        targetIndex = (C_CHAR_JUST_RIGHT_LEN - sourceLen) + targetIndex;
        replace(source,sourceIndex,sourceLen,beginCCharJustRight+targetIndex,targetLen);
    
   }
	char[] cCharJustRight18888Value1 = fillLowValue(5);
char[] cCharJustRight18888Value2 = fillHighValue(5);
char[] cCharJustRight18888Value3 = "     ".toCharArray();
char[] cCharJustRight18888Value4 = "2    ".toCharArray();

	/**
	 *	Test condition new byte[] {(byte)0x00} new byte[] {(byte)0xFF} " " "2" for isCCharJustRight188()
	 *	@return  Returns true if isCCharJustRight188() is new byte[] {(byte)0x00} new byte[] {(byte)0xFF} " " "2"
	 */
   public boolean isCCharJustRight188() throws CFException {
      return (  compareChars( getCCharJustRight() , cCharJustRight18888Value1)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight18888Value2)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight18888Value3)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight18888Value4)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00} new byte[] {(byte)0xFF} " " "2"
	*/
   	public void setCCharJustRight188True() {  			
    	setCCharJustRight( cCharJustRight18888Value1);
   	}
	char[] cCharJustRight28888Value1 = ";    ".toCharArray();
char[] cCharJustRight28888Value2 = "~    ".toCharArray();
char[] cCharJustRight28888Value3 = ",    ".toCharArray();
char[] cCharJustRight28888Value4 = "'    ".toCharArray();
char[] cCharJustRight28888Value5 = "~quot".toCharArray();

	/**
	 *	Test condition ";" "~" "," "'" "\"" for isCCharJustRight288()
	 *	@return  Returns true if isCCharJustRight288() is ";" "~" "," "'" "\""
	 */
   public boolean isCCharJustRight288() throws CFException {
      return (  compareChars( getCCharJustRight() , cCharJustRight28888Value1)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight28888Value2)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight28888Value3)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight28888Value4)  == 0  ||  compareChars( getCCharJustRight() , cCharJustRight28888Value5)  == 0  );
   }


	/**
	*  set values ";" "~" "," "'" "\""
	*/
   	public void setCCharJustRight288True() {  			
    	setCCharJustRight( cCharJustRight28888Value1);
   	}
	char[] cCharJustRight38888Value = ";    ".toCharArray();
	/**
	 *	Test condition ";" for isCCharJustRight388()
	 *	@return  Returns true if isCCharJustRight388() is ";"
	 */
   public boolean isCCharJustRight388() throws CFException {
      return (  compareChars( getCCharJustRight() , cCharJustRight38888Value)  == 0  );
   }


	/**
	*  set values ";"
	*/
   	public void setCCharJustRight388True() {  			
    	setCCharJustRight( cCharJustRight38888Value);
   	}
	/**
	 *	Returns the value of cCharZero9
	 *	@return cCharZero9
	 */
   public char[] getCCharZero9() throws CFException{
     if (isCCharZero9Modified()) { 
        cCharZero9 = refreshCCharZero9();
     }
   		return cCharZero9;
   }

  
	/**
	*  set variable cCharZero9
	*  Corresponding COBOL Variable is WS-C-CHAR-ZERO-9
	*  @param value
	**/
   public void setCCharZero9(char[] value) {
      cCharZero9 = checkCCharZero9Constraints(value);
      serializeCCharZero9(cCharZero9);
   } 

     /**
	 * 	Update CCharZero9 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCCharZero9(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCCharZero9,cCharZero9.length);
   	
   }
   
   public void setCCharZero9(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero9,cCharZero9.length);
   	
   }
   
     /**
	 * 	Update CCharZero9 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCCharZero9(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero9+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CCharZero9 with another Field
	 *	@param value
	 */
   public void setCCharZero9(Field source) {
       replace(source,0,source.length(),beginCCharZero9,C_CHAR_ZERO_9_LEN);
   	
   }  
   
     /**
	 * 	Update CCharZero9 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCCharZero9(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCCharZero9,C_CHAR_ZERO_9_LEN);
   	
   }
   
     /**
	 * 	Update CCharZero9 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCCharZero9(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero9+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cCharZero0
	 *	@return cCharZero0
	 */
   public char[] getCCharZero0() throws CFException{
     if (isCCharZero0Modified()) { 
        cCharZero0 = refreshCCharZero0();
     }
   		return cCharZero0;
   }

  
	/**
	*  set variable cCharZero0
	*  Corresponding COBOL Variable is WS-C-CHAR-ZERO0
	*  @param value
	**/
   public void setCCharZero0(char[] value) {
      cCharZero0 = checkCCharZero0Constraints(value);
      serializeCCharZero0(cCharZero0);
   } 

     /**
	 * 	Update CCharZero0 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCCharZero0(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCCharZero0,cCharZero0.length);
   	
   }
   
   public void setCCharZero0(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero0,cCharZero0.length);
   	
   }
   
     /**
	 * 	Update CCharZero0 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCCharZero0(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero0+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CCharZero0 with another Field
	 *	@param value
	 */
   public void setCCharZero0(Field source) {
       replace(source,0,source.length(),beginCCharZero0,C_CHAR_ZERO_0_LEN);
   	
   }  
   
     /**
	 * 	Update CCharZero0 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCCharZero0(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCCharZero0,C_CHAR_ZERO_0_LEN);
   	
   }
   
     /**
	 * 	Update CCharZero0 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCCharZero0(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero0+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cCharZero
	 *	@return cCharZero
	 */
   public char[] getCCharZero() throws CFException{
     if (isCCharZeroModified()) { 
        cCharZero = refreshCCharZero();
     }
   		return cCharZero;
   }

  
	/**
	*  set variable cCharZero
	*  Corresponding COBOL Variable is WS-C-CHAR-ZERO
	*  @param value
	**/
   public void setCCharZero(char[] value) {
      cCharZero = checkCCharZeroConstraints(value);
      serializeCCharZero(cCharZero);
   } 

     /**
	 * 	Update CCharZero 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCCharZero(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCCharZero,cCharZero.length);
   	
   }
   
   public void setCCharZero(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero,cCharZero.length);
   	
   }
   
     /**
	 * 	Update CCharZero 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCCharZero(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CCharZero with another Field
	 *	@param value
	 */
   public void setCCharZero(Field source) {
       replace(source,0,source.length(),beginCCharZero,C_CHAR_ZERO_LEN);
   	
   }  
   
     /**
	 * 	Update CCharZero 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCCharZero(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCCharZero,C_CHAR_ZERO_LEN);
   	
   }
   
     /**
	 * 	Update CCharZero 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCCharZero(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCCharZero+targetIndex,targetLen);
    
   }
	char[] cCharZero18888Value1 = "00111".toCharArray();
char[] cCharZero18888Value2 = "12345".toCharArray();

	/**
	 *	Test condition "00111" "12345" for isCCharZero188()
	 *	@return  Returns true if isCCharZero188() is "00111" "12345"
	 */
   public boolean isCCharZero188() throws CFException {
      return (  compareChars( getCCharZero() , cCharZero18888Value1)  == 0  ||  compareChars( getCCharZero() , cCharZero18888Value2)  == 0  );
   }


	/**
	*  set values "00111" "12345"
	*/
   	public void setCCharZero188True() {  			
    	setCCharZero( cCharZero18888Value1);
   	}
	char[] cCharZero28888Value = "00111".toCharArray();
	/**
	 *	Test condition "00111" for isCCharZero288()
	 *	@return  Returns true if isCCharZero288() is "00111"
	 */
   public boolean isCCharZero288() throws CFException {
      return (  compareChars( getCCharZero() , cCharZero28888Value)  == 0  );
   }


	/**
	*  set values "00111"
	*/
   	public void setCCharZero288True() {  			
    	setCCharZero( cCharZero28888Value);
   	}
	char[] cCharZero118888Value = "12345".toCharArray();
	/**
	 *	Test condition "12345" for isCCharZero1188()
	 *	@return  Returns true if isCCharZero1188() is "12345"
	 */
   public boolean isCCharZero1188() throws CFException {
      return (  compareChars( getCCharZero() , cCharZero118888Value)  == 0  );
   }


	/**
	*  set values "12345"
	*/
   	public void setCCharZero1188True() {  			
    	setCCharZero( cCharZero118888Value);
   	}

	
	
	
	/**
	 * 	initializes GroupWith88
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setCBinarySign1((short)0);
                     setCBinarySign2(0);
                     setCBinarySign3(0);
                     setCBinaryUnsign1(0);
                     setCBinaryUnsign2(0);
                     setCBinaryUnsign3(0);
         	setCDisplaySign1((short)0);
                     setCDisplaySign2(0);
                     setCDisplaySign3(0);
                     setCDisplayUnsign1(0);
                     setCDisplayUnsign2(0);
                     setCDisplayUnsign3(0);
         	setCPackedSign1((short)0);
                     setCPackedUnsign1(0);
			setCDecBinarySign1(BigDecimal.ZERO);
			setCDecBinaryUnsign1(BigDecimal.ZERO);
			setCDecDisplaySign1(BigDecimal.ZERO);
			setCDecDisplayUnsign1(BigDecimal.ZERO);
			setCDecPackedSign1(BigDecimal.ZERO);
			setCDecPackedUnsign1(BigDecimal.ZERO);
         setCChar(CONSTANTS.SPACE_5);
         setCCharJustRight(CONSTANTS.SPACE_5);
         setCCharZero9(CONSTANTS.SPACE_5);
                    setCCharZero(CONSTANTS.SPACE_5);
   }

		public static int getGroupWith88FieldLength() {
			return GROUP_WITH_88_LENGTH;
		}

}
  
