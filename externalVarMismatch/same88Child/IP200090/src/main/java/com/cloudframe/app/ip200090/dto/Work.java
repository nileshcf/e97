package com.cloudframe.app.ip200090.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] isCandidatePresent100 = new char[1];

						private char[] isSubfldCheckOver100 = new char[1];

						private char[] edit0009300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] abendPgm300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmIp200100300 = new char[8];

						private char[] pgmIp381120300 = new char[8];

						private char[] valueX300 = new char[1];

						private char[] valueY300 = new char[1];

								private short value1643300;

								private short value1659300;

								private short value1441300;

								private short value1811300;

								private short value1813300;

						private char[] para2200300 = new char[30];

						private char[] wrongEditAbendCode300 = new char[4];

						private char[] ptrIp996010800 = new char[8];

						private char[] ptrIp200100800 = new char[8];

						private char[] ptrIp381120800 = new char[8];

								private short candidateTagType800;

						private char[] syntaxPgmPtr800 = Field.fillLowValue(8);

								private short holdReturnCode800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsCandidatePresent100(("N").toCharArray());
								setIsSubfldCheckOver100(("N").toCharArray());
								setEdit0009300(("IP200090").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xF5,(byte)0x65,(byte)0x01,(byte)0xD9,(byte)0xFB,(byte)0x00}).toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp200100300(("IP200100").toCharArray());
								setPgmIp381120300(("IP381120").toCharArray());
								setValueX300(("X").toCharArray());
								setValueY300(("Y").toCharArray());
								setValue1643300((short)1643);
								setValue1659300((short)1659);
								setValue1441300((short)1441);
								setValue1811300((short)1811);
								setValue1813300((short)1813);
								setPara2200300(("2200-SET-EDIT-PROGRAM-POINTER ").toCharArray());
								setWrongEditAbendCode300(("3001").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp200100800(("IP200100").toCharArray());
								setPtrIp381120800(("IP381120").toCharArray());
								setCandidateTagType800((short)0);
    }


 

	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException{
   		return isItTheFirstTime100;
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-THE-FIRST-TIME
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) {
       value = checkIsItTheFirstTime100Constraints(value);
       arraycopy(value,0,isItTheFirstTime100,0,value.length);
   } 
	public void setIsItTheFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItTheFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsTheFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsTheFirstTime88100()
	 *	@return  Returns true if isItIsTheFirstTime88100() is "Y"
	 */
   public boolean isItIsTheFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsTheFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsTheFirstTime8810088Value);
   	}
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsNotFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of isCandidatePresent100
	 *	@return isCandidatePresent100
	 */
   public char[] getIsCandidatePresent100() throws CFException{
   		return isCandidatePresent100;
   }

  
	/**
	*  set variable isCandidatePresent100
	*  Corresponding COBOL Variable is 100-IS-CANDIDATE-PRESENT
	*  @param value
	**/
   public void setIsCandidatePresent100(char[] value) {
       value = checkIsCandidatePresent100Constraints(value);
       arraycopy(value,0,isCandidatePresent100,0,value.length);
   } 
	public void setIsCandidatePresent100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isCandidatePresent100,0,beginIndex + endIndex);
   }
	char[] candidatePresent8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCandidatePresent88100()
	 *	@return  Returns true if isCandidatePresent88100() is "Y"
	 */
   public boolean isCandidatePresent88100() throws CFException {
      return (  compareChars( getIsCandidatePresent100() , candidatePresent8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCandidatePresent88100True() {  			
    	setIsCandidatePresent100( candidatePresent8810088Value);
   	}
	char[] candidateAbsent8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCandidateAbsent88100()
	 *	@return  Returns true if isCandidateAbsent88100() is "N"
	 */
   public boolean isCandidateAbsent88100() throws CFException {
      return (  compareChars( getIsCandidatePresent100() , candidateAbsent8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCandidateAbsent88100True() {  			
    	setIsCandidatePresent100( candidateAbsent8810088Value);
   	}
	/**
	 *	Returns the value of isSubfldCheckOver100
	 *	@return isSubfldCheckOver100
	 */
   public char[] getIsSubfldCheckOver100() throws CFException{
   		return isSubfldCheckOver100;
   }

  
	/**
	*  set variable isSubfldCheckOver100
	*  Corresponding COBOL Variable is 100-IS-SUBFLD-CHECK-OVER
	*  @param value
	**/
   public void setIsSubfldCheckOver100(char[] value) {
       value = checkIsSubfldCheckOver100Constraints(value);
       arraycopy(value,0,isSubfldCheckOver100,0,value.length);
   } 
	public void setIsSubfldCheckOver100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isSubfldCheckOver100,0,beginIndex + endIndex);
   }
	char[] subfldCheckOver8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSubfldCheckOver88100()
	 *	@return  Returns true if isSubfldCheckOver88100() is "Y"
	 */
   public boolean isSubfldCheckOver88100() throws CFException {
      return (  compareChars( getIsSubfldCheckOver100() , subfldCheckOver8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSubfldCheckOver88100True() {  			
    	setIsSubfldCheckOver100( subfldCheckOver8810088Value);
   	}
	char[] subfldCheckNotOver8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSubfldCheckNotOver88100()
	 *	@return  Returns true if isSubfldCheckNotOver88100() is "N"
	 */
   public boolean isSubfldCheckNotOver88100() throws CFException {
      return (  compareChars( getIsSubfldCheckOver100() , subfldCheckNotOver8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSubfldCheckNotOver88100True() {  			
    	setIsSubfldCheckOver100( subfldCheckNotOver8810088Value);
   	}
	/**
	 *	Returns the value of edit0009300
	 *	@return edit0009300
	 */
   public char[] getEdit0009300() throws CFException{
   		return edit0009300;
   }

  
	/**
	*  set variable edit0009300
	*  Corresponding COBOL Variable is 300-EDIT-0009
	*  @param value
	**/
   public void setEdit0009300(char[] value) {
       value = checkEdit0009300Constraints(value);
       arraycopy(value,0,edit0009300,0,value.length);
   } 
	public void setEdit0009300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,edit0009300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException{
   		return pgmVersion300;
   }

  
	/**
	*  set variable pgmVersion300
	*  Corresponding COBOL Variable is 300-PGM-VERSION
	*  @param value
	**/
   public void setPgmVersion300(char[] value) {
       value = checkPgmVersion300Constraints(value);
       arraycopy(value,0,pgmVersion300,0,value.length);
   } 
	public void setPgmVersion300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmVersion300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendPgm300
	 *	@return abendPgm300
	 */
   public char[] getAbendPgm300() throws CFException{
   		return abendPgm300;
   }

  
	/**
	*  set variable abendPgm300
	*  Corresponding COBOL Variable is 300-ABEND-PGM
	*  @param value
	**/
   public void setAbendPgm300(char[] value) {
       value = checkAbendPgm300Constraints(value);
       arraycopy(value,0,abendPgm300,0,value.length);
   } 
	public void setAbendPgm300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPgm300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException{
   		return pgmIp996010300;
   }

  
	/**
	*  set variable pgmIp996010300
	*  Corresponding COBOL Variable is 300-PGM-IP996010
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) {
       value = checkPgmIp996010300Constraints(value);
       arraycopy(value,0,pgmIp996010300,0,value.length);
   } 
	public void setPgmIp996010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp996010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp200100300
	 *	@return pgmIp200100300
	 */
   public char[] getPgmIp200100300() throws CFException{
   		return pgmIp200100300;
   }

  
	/**
	*  set variable pgmIp200100300
	*  Corresponding COBOL Variable is 300-PGM-IP200100
	*  @param value
	**/
   public void setPgmIp200100300(char[] value) {
       value = checkPgmIp200100300Constraints(value);
       arraycopy(value,0,pgmIp200100300,0,value.length);
   } 
	public void setPgmIp200100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp200100300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp381120300
	 *	@return pgmIp381120300
	 */
   public char[] getPgmIp381120300() throws CFException{
   		return pgmIp381120300;
   }

  
	/**
	*  set variable pgmIp381120300
	*  Corresponding COBOL Variable is 300-PGM-IP381120
	*  @param value
	**/
   public void setPgmIp381120300(char[] value) {
       value = checkPgmIp381120300Constraints(value);
       arraycopy(value,0,pgmIp381120300,0,value.length);
   } 
	public void setPgmIp381120300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp381120300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueX300
	 *	@return valueX300
	 */
   public char[] getValueX300() throws CFException{
   		return valueX300;
   }

  
	/**
	*  set variable valueX300
	*  Corresponding COBOL Variable is 300-VALUE-X
	*  @param value
	**/
   public void setValueX300(char[] value) {
       value = checkValueX300Constraints(value);
       arraycopy(value,0,valueX300,0,value.length);
   } 
	public void setValueX300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueX300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueY300
	 *	@return valueY300
	 */
   public char[] getValueY300() throws CFException{
   		return valueY300;
   }

  
	/**
	*  set variable valueY300
	*  Corresponding COBOL Variable is 300-VALUE-Y
	*  @param value
	**/
   public void setValueY300(char[] value) {
       value = checkValueY300Constraints(value);
       arraycopy(value,0,valueY300,0,value.length);
   } 
	public void setValueY300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueY300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of value1643300
	 *	@return value1643300
	 */
	public short getValue1643300() throws CFException {
       if (isValue1643300Modified()) { 
           value1643300 = refreshValue1643300();
        }
   		return value1643300;
	}
	

    /**
	 *	Returns the String value of value1643300
	 *	@return value1643300
	 */
	public char[]  getValue1643300ActualString() {
	    String value = String.valueOf(value1643300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Value1643300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1643
	 *	@param number
	 */
	public void setValue1643300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1643300 = checkValue1643300MaxLimit(number); 
		serializeValue1643300(value1643300);
	}
	
	public void setValue1643300(int number) {
	    number = checkValue1643300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1643300((short)number);
	}
	public void setValue1643300(long number) {
	    number = checkValue1643300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1643300((short)number);
	}
	

	/**
	 * 	Update Value1643300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1643300(char[] value) throws CFException {
		 value1643300 = serializeValue1643300(value);
	}
	/**
	 * 	Update Value1643300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1643300String(char[] value) throws CFException {
		 setValue1643300(value);
	}
	/**
	 *	Returns the value of value1659300
	 *	@return value1659300
	 */
	public short getValue1659300() throws CFException {
       if (isValue1659300Modified()) { 
           value1659300 = refreshValue1659300();
        }
   		return value1659300;
	}
	

    /**
	 *	Returns the String value of value1659300
	 *	@return value1659300
	 */
	public char[]  getValue1659300ActualString() {
	    String value = String.valueOf(value1659300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Value1659300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1659
	 *	@param number
	 */
	public void setValue1659300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1659300 = checkValue1659300MaxLimit(number); 
		serializeValue1659300(value1659300);
	}
	
	public void setValue1659300(int number) {
	    number = checkValue1659300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1659300((short)number);
	}
	public void setValue1659300(long number) {
	    number = checkValue1659300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1659300((short)number);
	}
	

	/**
	 * 	Update Value1659300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1659300(char[] value) throws CFException {
		 value1659300 = serializeValue1659300(value);
	}
	/**
	 * 	Update Value1659300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1659300String(char[] value) throws CFException {
		 setValue1659300(value);
	}
	/**
	 *	Returns the value of value1441300
	 *	@return value1441300
	 */
	public short getValue1441300() throws CFException {
       if (isValue1441300Modified()) { 
           value1441300 = refreshValue1441300();
        }
   		return value1441300;
	}
	

    /**
	 *	Returns the String value of value1441300
	 *	@return value1441300
	 */
	public char[]  getValue1441300ActualString() {
	    String value = String.valueOf(value1441300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Value1441300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1441
	 *	@param number
	 */
	public void setValue1441300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1441300 = checkValue1441300MaxLimit(number); 
		serializeValue1441300(value1441300);
	}
	
	public void setValue1441300(int number) {
	    number = checkValue1441300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1441300((short)number);
	}
	public void setValue1441300(long number) {
	    number = checkValue1441300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1441300((short)number);
	}
	

	/**
	 * 	Update Value1441300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1441300(char[] value) throws CFException {
		 value1441300 = serializeValue1441300(value);
	}
	/**
	 * 	Update Value1441300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1441300String(char[] value) throws CFException {
		 setValue1441300(value);
	}
	/**
	 *	Returns the value of value1811300
	 *	@return value1811300
	 */
	public short getValue1811300() throws CFException {
       if (isValue1811300Modified()) { 
           value1811300 = refreshValue1811300();
        }
   		return value1811300;
	}
	

    /**
	 *	Returns the String value of value1811300
	 *	@return value1811300
	 */
	public char[]  getValue1811300ActualString() {
	    String value = String.valueOf(value1811300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Value1811300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1811
	 *	@param number
	 */
	public void setValue1811300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1811300 = checkValue1811300MaxLimit(number); 
		serializeValue1811300(value1811300);
	}
	
	public void setValue1811300(int number) {
	    number = checkValue1811300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1811300((short)number);
	}
	public void setValue1811300(long number) {
	    number = checkValue1811300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1811300((short)number);
	}
	

	/**
	 * 	Update Value1811300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1811300(char[] value) throws CFException {
		 value1811300 = serializeValue1811300(value);
	}
	/**
	 * 	Update Value1811300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1811300String(char[] value) throws CFException {
		 setValue1811300(value);
	}
	/**
	 *	Returns the value of value1813300
	 *	@return value1813300
	 */
	public short getValue1813300() throws CFException {
       if (isValue1813300Modified()) { 
           value1813300 = refreshValue1813300();
        }
   		return value1813300;
	}
	

    /**
	 *	Returns the String value of value1813300
	 *	@return value1813300
	 */
	public char[]  getValue1813300ActualString() {
	    String value = String.valueOf(value1813300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Value1813300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1813
	 *	@param number
	 */
	public void setValue1813300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1813300 = checkValue1813300MaxLimit(number); 
		serializeValue1813300(value1813300);
	}
	
	public void setValue1813300(int number) {
	    number = checkValue1813300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1813300((short)number);
	}
	public void setValue1813300(long number) {
	    number = checkValue1813300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue1813300((short)number);
	}
	

	/**
	 * 	Update Value1813300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1813300(char[] value) throws CFException {
		 value1813300 = serializeValue1813300(value);
	}
	/**
	 * 	Update Value1813300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1813300String(char[] value) throws CFException {
		 setValue1813300(value);
	}
	/**
	 *	Returns the value of para2200300
	 *	@return para2200300
	 */
   public char[] getPara2200300() throws CFException{
   		return para2200300;
   }

  
	/**
	*  set variable para2200300
	*  Corresponding COBOL Variable is 300-PARA-2200
	*  @param value
	**/
   public void setPara2200300(char[] value) {
       value = checkPara2200300Constraints(value);
       arraycopy(value,0,para2200300,0,value.length);
   } 
	public void setPara2200300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2200300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of wrongEditAbendCode300
	 *	@return wrongEditAbendCode300
	 */
   public char[] getWrongEditAbendCode300() throws CFException{
   		return wrongEditAbendCode300;
   }

  
	/**
	*  set variable wrongEditAbendCode300
	*  Corresponding COBOL Variable is 300-WRONG-EDIT-ABEND-CODE
	*  @param value
	**/
   public void setWrongEditAbendCode300(char[] value) {
       value = checkWrongEditAbendCode300Constraints(value);
       arraycopy(value,0,wrongEditAbendCode300,0,value.length);
   } 
	public void setWrongEditAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wrongEditAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp996010800
	 *	@return ptrIp996010800
	 */
   public char[] getPtrIp996010800() throws CFException{
   		return ptrIp996010800;
   }

  
	/**
	*  set variable ptrIp996010800
	*  Corresponding COBOL Variable is 800-PTR-IP996010
	*  @param value
	**/
   public void setPtrIp996010800(char[] value) {
       value = checkPtrIp996010800Constraints(value);
       arraycopy(value,0,ptrIp996010800,0,value.length);
   } 
	public void setPtrIp996010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp996010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp200100800
	 *	@return ptrIp200100800
	 */
   public char[] getPtrIp200100800() throws CFException{
   		return ptrIp200100800;
   }

  
	/**
	*  set variable ptrIp200100800
	*  Corresponding COBOL Variable is 800-PTR-IP200100
	*  @param value
	**/
   public void setPtrIp200100800(char[] value) {
       value = checkPtrIp200100800Constraints(value);
       arraycopy(value,0,ptrIp200100800,0,value.length);
   } 
	public void setPtrIp200100800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp200100800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp381120800
	 *	@return ptrIp381120800
	 */
   public char[] getPtrIp381120800() throws CFException{
   		return ptrIp381120800;
   }

  
	/**
	*  set variable ptrIp381120800
	*  Corresponding COBOL Variable is 800-PTR-IP381120
	*  @param value
	**/
   public void setPtrIp381120800(char[] value) {
       value = checkPtrIp381120800Constraints(value);
       arraycopy(value,0,ptrIp381120800,0,value.length);
   } 
	public void setPtrIp381120800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp381120800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of candidateTagType800
	 *	@return candidateTagType800
	 */
	public short getCandidateTagType800() throws CFException {
   		return candidateTagType800;
	}
	
	/**
	 * 	Update CandidateTagType800 with the passed value
	 *  Corresponding COBOL Variable is 800-CANDIDATE-TAG-TYPE
	 *	@param number
	 */
	public void setCandidateTagType800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    candidateTagType800 = checkCandidateTagType800MaxLimit(number); 
	}

	public void setCandidateTagType800(int number) {
	    number = checkCandidateTagType800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateTagType800((short)number);
	}
	public void setCandidateTagType800(long number) {
	    number = checkCandidateTagType800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCandidateTagType800((short)number);
	}
	

	/**
	 *	Returns the value of syntaxPgmPtr800
	 *	@return syntaxPgmPtr800
	 */
   public char[] getSyntaxPgmPtr800() throws CFException{
   		return syntaxPgmPtr800;
   }

  
	/**
	*  set variable syntaxPgmPtr800
	*  Corresponding COBOL Variable is 800-SYNTAX-PGM-PTR
	*  @param value
	**/
   public void setSyntaxPgmPtr800(char[] value) {
       value = checkSyntaxPgmPtr800Constraints(value);
       arraycopy(value,0,syntaxPgmPtr800,0,value.length);
   } 
	public void setSyntaxPgmPtr800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,syntaxPgmPtr800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of holdReturnCode800
	 *	@return holdReturnCode800
	 */
	public short getHoldReturnCode800() throws CFException {
   		return holdReturnCode800;
	}
	
	/**
	 * 	Update HoldReturnCode800 with the passed value
	 *  Corresponding COBOL Variable is 800-HOLD-RETURN-CODE
	 *	@param number
	 */
	public void setHoldReturnCode800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    holdReturnCode800 = checkHoldReturnCode800MaxLimit(number); 
	}

	public void setHoldReturnCode800(int number) {
	    number = checkHoldReturnCode800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHoldReturnCode800((short)number);
	}
	public void setHoldReturnCode800(long number) {
	    number = checkHoldReturnCode800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setHoldReturnCode800((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
