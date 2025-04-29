package com.cloudframe.app.ip343900.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.ip343900.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] checkIsItGlobal100 = new char[1];

								private int sys001Status200;

						private char[] sys067Status200 = new char[2];

						private char[] pgmVersion300 = new char[7];

						private char[] pgmIp532010300 = new char[8];

						private char[] pgmIp081110300 = new char[8];

						private char[] pgmIp282210300 = new char[8];

						private char[] pgmIp703020300 = new char[8];

						private char[] pgmIp750080300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmIp996020300 = new char[8];

						private char[] programId300 = new char[8];

						private char[] abendPgm300 = new char[8];

								private int value4300;

								private int value1300;

						private char[] valueGlobal300 = new char[11];

						private char[] valueLpidn300 = new char[11];

						private char[] openAbendCode300 = new char[4];

						private char[] readAbendCode300 = new char[4];

						private char[] closeAbendCode300 = new char[4];

						private char[] paraName300 = new char[30];

								private long insRecCnt400;

								private int insCmtCnt400;

						private char[] amsOnsoilSw800 = new char[1];

						private char[] ptrIp532010800 = new char[8];

						private char[] ptrIp081110800 = new char[8];

						private char[] ptrIp282210800 = new char[8];

						private char[] ptrIp703020800 = new char[8];

						private char[] ptrIp750080800 = new char[8];

						private char[] ptrIp996010800 = new char[8];

						private char[] ptrIp996020800 = new char[8];

						private char[] abendPtr800 = new char[8];

						private char[] astriskLine900 = new char[35];

						private char[] abendAbend900 = new char[35];

						private char[] abendAbendPgm900 = new char[35];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCheckIsItGlobal100(("N").toCharArray());
								setSys001Status200(0);
								setSys067Status200(("00").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0x68,(byte)0x3B,(byte)0x01,(byte)0x39,(byte)0x7F,(byte)0x00}).toCharArray());
								setPgmIp532010300(("IP532010").toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp282210300(("IP282210").toCharArray());
								setPgmIp703020300(("IP703020").toCharArray());
								setPgmIp750080300(("IP750080").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp996020300(("IP996020").toCharArray());
								setProgramId300(("IP343900").toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setValue4300(4);
								setValue1300(1);
								setValueGlobal300(("GLOBAL     ").toCharArray());
								setValueLpidn300(("LPIDN      ").toCharArray());
								setOpenAbendCode300(("3001").toCharArray());
								setReadAbendCode300(("3002").toCharArray());
								setCloseAbendCode300(("3003").toCharArray());
								setParaName300(fillSpace(30));
								setInsRecCnt400(0L);
								setInsCmtCnt400(0);
								setAmsOnsoilSw800(fillSpace(1));
								setPtrIp532010800(("IP532010").toCharArray());
								setPtrIp081110800(("IP081110").toCharArray());
								setPtrIp282210800(("IP282210").toCharArray());
								setPtrIp703020800(("IP703020").toCharArray());
								setPtrIp750080800(("IP750080").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp996020800(("IP996020").toCharArray());
								setAbendPtr800(("IP610010").toCharArray());
								setAstriskLine900(String.join("", java.util.Collections.nCopies(35, "*")).toCharArray());
								setAbendAbend900(("A B E N D   A B E N D   A B E N D  ").toCharArray());
								setAbendAbendPgm900(("A B E N D   I P 3 4 3 9 0 0        ").toCharArray());
    }


 

	/**
	 *	Returns the value of checkIsItGlobal100
	 *	@return checkIsItGlobal100
	 */
   public char[] getCheckIsItGlobal100() throws CFException{
   		return checkIsItGlobal100;
   }

  
	/**
	*  set variable checkIsItGlobal100
	*  Corresponding COBOL Variable is 100-CHECK-IS-IT-GLOBAL
	*  @param value
	**/
   public void setCheckIsItGlobal100(char[] value) {
       value = checkCheckIsItGlobal100Constraints(value);
       arraycopy(value,0,checkIsItGlobal100,0,value.length);
   } 
	public void setCheckIsItGlobal100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,checkIsItGlobal100,0,beginIndex + endIndex);
   }
	char[] itIsGlobal8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsGlobal88100()
	 *	@return  Returns true if isItIsGlobal88100() is "Y"
	 */
   public boolean isItIsGlobal88100() throws CFException {
      return (  compareChars( getCheckIsItGlobal100() , itIsGlobal8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsGlobal88100True() {  			
    	setCheckIsItGlobal100( itIsGlobal8810088Value);
   	}
	char[] itIsNtGlobal8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNtGlobal88100()
	 *	@return  Returns true if isItIsNtGlobal88100() is "N"
	 */
   public boolean isItIsNtGlobal88100() throws CFException {
      return (  compareChars( getCheckIsItGlobal100() , itIsNtGlobal8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNtGlobal88100True() {  			
    	setCheckIsItGlobal100( itIsNtGlobal8810088Value);
   	}
	/**
	 *	Returns the value of sys001Status200
	 *	@return sys001Status200
	 */
	public int getSys001Status200() throws CFException {
       if (isSys001Status200Modified()) { 
           sys001Status200 = refreshSys001Status200();
        }
   		return sys001Status200;
	}
	

	
	   
	/**
	 * 	Update Sys001Status200 with the passed value
	 *  Corresponding COBOL Variable is 200-SYS001-STATUS
	 *	@param number
	 */
	public void setSys001Status200(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sys001Status200 = checkSys001Status200MaxLimit(number); 
		serializeSys001Status200(sys001Status200);
	}
	

	public void setSys001Status200(long number) {
	    number = checkSys001Status200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys001Status200((int)number);
	}
	
	/**
	 * 	Update Sys001Status200 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSys001Status200(char[] value) throws CFException {
		 sys001Status200 = serializeSys001Status200(value);
	}
	/**
	 * 	Update Sys001Status200 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSys001Status200String(char[] value) throws CFException {
		 setSys001Status200(value);
	}
	
	/**
	 *	Test condition 0 for isSys001Good88200()
	 *	@return  Returns true if isSys001Good88200() is 0
	 */
   public boolean isSys001Good88200() throws CFException {
      return (  getSys001Status200()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setSys001Good88200True() {  			
    	setSys001Status200( 0);
   	}
	
	/**
	 *	Test condition 10 for isSys001Eof88200()
	 *	@return  Returns true if isSys001Eof88200() is 10
	 */
   public boolean isSys001Eof88200() throws CFException {
      return (  getSys001Status200()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setSys001Eof88200True() {  			
    	setSys001Status200( 10);
   	}
	/**
	 *	Returns the value of sys067Status200
	 *	@return sys067Status200
	 */
   public char[] getSys067Status200() throws CFException{
   		return sys067Status200;
   }

  
	/**
	*  set variable sys067Status200
	*  Corresponding COBOL Variable is 200-SYS067-STATUS
	*  @param value
	**/
   public void setSys067Status200(char[] value) {
       value = checkSys067Status200Constraints(value);
       arraycopy(value,0,sys067Status200,0,value.length);
   } 
	public void setSys067Status200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys067Status200,0,beginIndex + endIndex);
   }
	char[] sys067IoGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys067IoGood88200()
	 *	@return  Returns true if isSys067IoGood88200() is "00"
	 */
   public boolean isSys067IoGood88200() throws CFException {
      return (  compareChars( getSys067Status200() , sys067IoGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys067IoGood88200True() {  			
    	setSys067Status200( sys067IoGood8820088Value);
   	}
	char[] sys067Eof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys067Eof88200()
	 *	@return  Returns true if isSys067Eof88200() is "10"
	 */
   public boolean isSys067Eof88200() throws CFException {
      return (  compareChars( getSys067Status200() , sys067Eof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys067Eof88200True() {  			
    	setSys067Status200( sys067Eof8820088Value);
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
	 *	Returns the value of pgmIp532010300
	 *	@return pgmIp532010300
	 */
   public char[] getPgmIp532010300() throws CFException{
   		return pgmIp532010300;
   }

  
	/**
	*  set variable pgmIp532010300
	*  Corresponding COBOL Variable is 300-PGM-IP532010
	*  @param value
	**/
   public void setPgmIp532010300(char[] value) {
       value = checkPgmIp532010300Constraints(value);
       arraycopy(value,0,pgmIp532010300,0,value.length);
   } 
	public void setPgmIp532010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp532010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp081110300
	 *	@return pgmIp081110300
	 */
   public char[] getPgmIp081110300() throws CFException{
   		return pgmIp081110300;
   }

  
	/**
	*  set variable pgmIp081110300
	*  Corresponding COBOL Variable is 300-PGM-IP081110
	*  @param value
	**/
   public void setPgmIp081110300(char[] value) {
       value = checkPgmIp081110300Constraints(value);
       arraycopy(value,0,pgmIp081110300,0,value.length);
   } 
	public void setPgmIp081110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp081110300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp282210300
	 *	@return pgmIp282210300
	 */
   public char[] getPgmIp282210300() throws CFException{
   		return pgmIp282210300;
   }

  
	/**
	*  set variable pgmIp282210300
	*  Corresponding COBOL Variable is 300-PGM-IP282210
	*  @param value
	**/
   public void setPgmIp282210300(char[] value) {
       value = checkPgmIp282210300Constraints(value);
       arraycopy(value,0,pgmIp282210300,0,value.length);
   } 
	public void setPgmIp282210300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp282210300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp703020300
	 *	@return pgmIp703020300
	 */
   public char[] getPgmIp703020300() throws CFException{
   		return pgmIp703020300;
   }

  
	/**
	*  set variable pgmIp703020300
	*  Corresponding COBOL Variable is 300-PGM-IP703020
	*  @param value
	**/
   public void setPgmIp703020300(char[] value) {
       value = checkPgmIp703020300Constraints(value);
       arraycopy(value,0,pgmIp703020300,0,value.length);
   } 
	public void setPgmIp703020300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp703020300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp750080300
	 *	@return pgmIp750080300
	 */
   public char[] getPgmIp750080300() throws CFException{
   		return pgmIp750080300;
   }

  
	/**
	*  set variable pgmIp750080300
	*  Corresponding COBOL Variable is 300-PGM-IP750080
	*  @param value
	**/
   public void setPgmIp750080300(char[] value) {
       value = checkPgmIp750080300Constraints(value);
       arraycopy(value,0,pgmIp750080300,0,value.length);
   } 
	public void setPgmIp750080300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp750080300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp996020300
	 *	@return pgmIp996020300
	 */
   public char[] getPgmIp996020300() throws CFException{
   		return pgmIp996020300;
   }

  
	/**
	*  set variable pgmIp996020300
	*  Corresponding COBOL Variable is 300-PGM-IP996020
	*  @param value
	**/
   public void setPgmIp996020300(char[] value) {
       value = checkPgmIp996020300Constraints(value);
       arraycopy(value,0,pgmIp996020300,0,value.length);
   } 
	public void setPgmIp996020300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp996020300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of programId300
	 *	@return programId300
	 */
   public char[] getProgramId300() throws CFException{
   		return programId300;
   }

  
	/**
	*  set variable programId300
	*  Corresponding COBOL Variable is 300-PROGRAM-ID
	*  @param value
	**/
   public void setProgramId300(char[] value) {
       value = checkProgramId300Constraints(value);
       arraycopy(value,0,programId300,0,value.length);
   } 
	public void setProgramId300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,programId300,0,beginIndex + endIndex);
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
	 *	Returns the value of value4300
	 *	@return value4300
	 */
	public int getValue4300() throws CFException {
       if (isValue4300Modified()) { 
           value4300 = refreshValue4300();
        }
   		return value4300;
	}
	

	
	   
	/**
	 * 	Update Value4300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-4
	 *	@param number
	 */
	public void setValue4300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value4300 = checkValue4300MaxLimit(number); 
		serializeValue4300(value4300);
	}
	

	public void setValue4300(long number) {
	    number = checkValue4300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue4300((int)number);
	}
	
	/**
	 * 	Update Value4300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue4300(char[] value) throws CFException {
		 value4300 = serializeValue4300(value);
	}
	/**
	 * 	Update Value4300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue4300String(char[] value) throws CFException {
		 setValue4300(value);
	}
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
       if (isValue1300Modified()) { 
           value1300 = refreshValue1300();
        }
   		return value1300;
	}
	

	
	   
	/**
	 * 	Update Value1300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1
	 *	@param number
	 */
	public void setValue1300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1300 = checkValue1300MaxLimit(number); 
		serializeValue1300(value1300);
	}
	

	public void setValue1300(long number) {
	    number = checkValue1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue1300((int)number);
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value) throws CFException {
		 value1300 = serializeValue1300(value);
	}
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value) throws CFException {
		 setValue1300(value);
	}
	/**
	 *	Returns the value of valueGlobal300
	 *	@return valueGlobal300
	 */
   public char[] getValueGlobal300() throws CFException{
   		return valueGlobal300;
   }

  
	/**
	*  set variable valueGlobal300
	*  Corresponding COBOL Variable is 300-VALUE-GLOBAL
	*  @param value
	**/
   public void setValueGlobal300(char[] value) {
       value = checkValueGlobal300Constraints(value);
       arraycopy(value,0,valueGlobal300,0,value.length);
   } 
	public void setValueGlobal300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueGlobal300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueLpidn300
	 *	@return valueLpidn300
	 */
   public char[] getValueLpidn300() throws CFException{
   		return valueLpidn300;
   }

  
	/**
	*  set variable valueLpidn300
	*  Corresponding COBOL Variable is 300-VALUE-LPIDN
	*  @param value
	**/
   public void setValueLpidn300(char[] value) {
       value = checkValueLpidn300Constraints(value);
       arraycopy(value,0,valueLpidn300,0,value.length);
   } 
	public void setValueLpidn300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueLpidn300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of openAbendCode300
	 *	@return openAbendCode300
	 */
   public char[] getOpenAbendCode300() throws CFException{
   		return openAbendCode300;
   }

  
	/**
	*  set variable openAbendCode300
	*  Corresponding COBOL Variable is 300-OPEN-ABEND-CODE
	*  @param value
	**/
   public void setOpenAbendCode300(char[] value) {
       value = checkOpenAbendCode300Constraints(value);
       arraycopy(value,0,openAbendCode300,0,value.length);
   } 
	public void setOpenAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,openAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of readAbendCode300
	 *	@return readAbendCode300
	 */
   public char[] getReadAbendCode300() throws CFException{
   		return readAbendCode300;
   }

  
	/**
	*  set variable readAbendCode300
	*  Corresponding COBOL Variable is 300-READ-ABEND-CODE
	*  @param value
	**/
   public void setReadAbendCode300(char[] value) {
       value = checkReadAbendCode300Constraints(value);
       arraycopy(value,0,readAbendCode300,0,value.length);
   } 
	public void setReadAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,readAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of closeAbendCode300
	 *	@return closeAbendCode300
	 */
   public char[] getCloseAbendCode300() throws CFException{
   		return closeAbendCode300;
   }

  
	/**
	*  set variable closeAbendCode300
	*  Corresponding COBOL Variable is 300-CLOSE-ABEND-CODE
	*  @param value
	**/
   public void setCloseAbendCode300(char[] value) {
       value = checkCloseAbendCode300Constraints(value);
       arraycopy(value,0,closeAbendCode300,0,value.length);
   } 
	public void setCloseAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,closeAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of paraName300
	 *	@return paraName300
	 */
   public char[] getParaName300() throws CFException{
   		return paraName300;
   }

  
	/**
	*  set variable paraName300
	*  Corresponding COBOL Variable is 300-PARA-NAME
	*  @param value
	**/
   public void setParaName300(char[] value) {
       value = checkParaName300Constraints(value);
       arraycopy(value,0,paraName300,0,value.length);
   } 
	public void setParaName300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,paraName300,0,beginIndex + endIndex);
   }
	char[] para12008830088Value = "1200-OPEN-PMM-FIX-UNLOAD-FILE ".toCharArray();
	/**
	 *	Test condition "1200-OPEN-PMM-FIX-UNLOAD-FILE" for isPara120088300()
	 *	@return  Returns true if isPara120088300() is "1200-OPEN-PMM-FIX-UNLOAD-FILE"
	 */
   public boolean isPara120088300() throws CFException {
      return (  compareChars( getParaName300() , para12008830088Value)  == 0  );
   }


	/**
	*  set values "1200-OPEN-PMM-FIX-UNLOAD-FILE"
	*/
   	public void setPara120088300True() {  			
    	setParaName300( para12008830088Value);
   	}
	char[] para13518830088Value = "1351-OPEN-INPUT-SYS067.       ".toCharArray();
	/**
	 *	Test condition "1351-OPEN-INPUT-SYS067." for isPara135188300()
	 *	@return  Returns true if isPara135188300() is "1351-OPEN-INPUT-SYS067."
	 */
   public boolean isPara135188300() throws CFException {
      return (  compareChars( getParaName300() , para13518830088Value)  == 0  );
   }


	/**
	*  set values "1351-OPEN-INPUT-SYS067."
	*/
   	public void setPara135188300True() {  			
    	setParaName300( para13518830088Value);
   	}
	char[] para13528830088Value = "1352-READ-INPUT-SYS067.       ".toCharArray();
	/**
	 *	Test condition "1352-READ-INPUT-SYS067." for isPara135288300()
	 *	@return  Returns true if isPara135288300() is "1352-READ-INPUT-SYS067."
	 */
   public boolean isPara135288300() throws CFException {
      return (  compareChars( getParaName300() , para13528830088Value)  == 0  );
   }


	/**
	*  set values "1352-READ-INPUT-SYS067."
	*/
   	public void setPara135288300True() {  			
    	setParaName300( para13528830088Value);
   	}
	char[] para13538830088Value = "1353-CLOSE-INPUT-SYS067.      ".toCharArray();
	/**
	 *	Test condition "1353-CLOSE-INPUT-SYS067." for isPara135388300()
	 *	@return  Returns true if isPara135388300() is "1353-CLOSE-INPUT-SYS067."
	 */
   public boolean isPara135388300() throws CFException {
      return (  compareChars( getParaName300() , para13538830088Value)  == 0  );
   }


	/**
	*  set values "1353-CLOSE-INPUT-SYS067."
	*/
   	public void setPara135388300True() {  			
    	setParaName300( para13538830088Value);
   	}
	char[] para80008830088Value = "8000-READ-PMM-FIX-UNLOAD-FILE ".toCharArray();
	/**
	 *	Test condition "8000-READ-PMM-FIX-UNLOAD-FILE" for isPara800088300()
	 *	@return  Returns true if isPara800088300() is "8000-READ-PMM-FIX-UNLOAD-FILE"
	 */
   public boolean isPara800088300() throws CFException {
      return (  compareChars( getParaName300() , para80008830088Value)  == 0  );
   }


	/**
	*  set values "8000-READ-PMM-FIX-UNLOAD-FILE"
	*/
   	public void setPara800088300True() {  			
    	setParaName300( para80008830088Value);
   	}
	char[] para30008830088Value = "3000-CLOSE-PMM-FIX-UNLOAD-FILE".toCharArray();
	/**
	 *	Test condition "3000-CLOSE-PMM-FIX-UNLOAD-FILE" for isPara300088300()
	 *	@return  Returns true if isPara300088300() is "3000-CLOSE-PMM-FIX-UNLOAD-FILE"
	 */
   public boolean isPara300088300() throws CFException {
      return (  compareChars( getParaName300() , para30008830088Value)  == 0  );
   }


	/**
	*  set values "3000-CLOSE-PMM-FIX-UNLOAD-FILE"
	*/
   	public void setPara300088300True() {  			
    	setParaName300( para30008830088Value);
   	}
	/**
	 *	Returns the value of insRecCnt400
	 *	@return insRecCnt400
	 */
	public long getInsRecCnt400() throws CFException {
       if (isInsRecCnt400Modified()) { 
           insRecCnt400 = refreshInsRecCnt400();
        }
   		return insRecCnt400;
	}
	

	
	   
	/**
	 * 	Update InsRecCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-INS-REC-CNT
	 *	@param number
	 */
	public void setInsRecCnt400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    insRecCnt400 = checkInsRecCnt400MaxLimit(number); 
		serializeInsRecCnt400(insRecCnt400);
	}
	

	/**
	 * 	Update InsRecCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400(char[] value) throws CFException {
		 insRecCnt400 = serializeInsRecCnt400(value);
	}
	/**
	 * 	Update InsRecCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsRecCnt400String(char[] value) throws CFException {
		 setInsRecCnt400(value);
	}
	/**
	 *	Returns the value of insCmtCnt400
	 *	@return insCmtCnt400
	 */
	public int getInsCmtCnt400() throws CFException {
       if (isInsCmtCnt400Modified()) { 
           insCmtCnt400 = refreshInsCmtCnt400();
        }
   		return insCmtCnt400;
	}
	

	
	   
	/**
	 * 	Update InsCmtCnt400 with the passed value
	 *  Corresponding COBOL Variable is 400-INS-CMT-CNT
	 *	@param number
	 */
	public void setInsCmtCnt400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    insCmtCnt400 = checkInsCmtCnt400MaxLimit(number); 
		serializeInsCmtCnt400(insCmtCnt400);
	}
	

	public void setInsCmtCnt400(long number) {
	    number = checkInsCmtCnt400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInsCmtCnt400((int)number);
	}
	
	/**
	 * 	Update InsCmtCnt400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setInsCmtCnt400(char[] value) throws CFException {
		 insCmtCnt400 = serializeInsCmtCnt400(value);
	}
	/**
	 * 	Update InsCmtCnt400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInsCmtCnt400String(char[] value) throws CFException {
		 setInsCmtCnt400(value);
	}
	/**
	 *	Returns the value of amsOnsoilSw800
	 *	@return amsOnsoilSw800
	 */
   public char[] getAmsOnsoilSw800() throws CFException{
   		return amsOnsoilSw800;
   }

  
	/**
	*  set variable amsOnsoilSw800
	*  Corresponding COBOL Variable is 800-AMS-ONSOIL-SW
	*  @param value
	**/
   public void setAmsOnsoilSw800(char[] value) {
       value = checkAmsOnsoilSw800Constraints(value);
       arraycopy(value,0,amsOnsoilSw800,0,value.length);
   } 
	public void setAmsOnsoilSw800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,amsOnsoilSw800,0,beginIndex + endIndex);
   }
	char[] amsOnsoilSwY8880088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isAmsOnsoilSwY88800()
	 *	@return  Returns true if isAmsOnsoilSwY88800() is "Y"
	 */
   public boolean isAmsOnsoilSwY88800() throws CFException {
      return (  compareChars( getAmsOnsoilSw800() , amsOnsoilSwY8880088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setAmsOnsoilSwY88800True() {  			
    	setAmsOnsoilSw800( amsOnsoilSwY8880088Value);
   	}
	char[] amsOnsoilSwN8880088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAmsOnsoilSwN88800()
	 *	@return  Returns true if isAmsOnsoilSwN88800() is "N"
	 */
   public boolean isAmsOnsoilSwN88800() throws CFException {
      return (  compareChars( getAmsOnsoilSw800() , amsOnsoilSwN8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAmsOnsoilSwN88800True() {  			
    	setAmsOnsoilSw800( amsOnsoilSwN8880088Value);
   	}
	/**
	 *	Returns the value of ptrIp532010800
	 *	@return ptrIp532010800
	 */
   public char[] getPtrIp532010800() throws CFException{
   		return ptrIp532010800;
   }

  
	/**
	*  set variable ptrIp532010800
	*  Corresponding COBOL Variable is 800-PTR-IP532010
	*  @param value
	**/
   public void setPtrIp532010800(char[] value) {
       value = checkPtrIp532010800Constraints(value);
       arraycopy(value,0,ptrIp532010800,0,value.length);
   } 
	public void setPtrIp532010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp532010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp081110800
	 *	@return ptrIp081110800
	 */
   public char[] getPtrIp081110800() throws CFException{
   		return ptrIp081110800;
   }

  
	/**
	*  set variable ptrIp081110800
	*  Corresponding COBOL Variable is 800-PTR-IP081110
	*  @param value
	**/
   public void setPtrIp081110800(char[] value) {
       value = checkPtrIp081110800Constraints(value);
       arraycopy(value,0,ptrIp081110800,0,value.length);
   } 
	public void setPtrIp081110800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp081110800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp282210800
	 *	@return ptrIp282210800
	 */
   public char[] getPtrIp282210800() throws CFException{
   		return ptrIp282210800;
   }

  
	/**
	*  set variable ptrIp282210800
	*  Corresponding COBOL Variable is 800-PTR-IP282210
	*  @param value
	**/
   public void setPtrIp282210800(char[] value) {
       value = checkPtrIp282210800Constraints(value);
       arraycopy(value,0,ptrIp282210800,0,value.length);
   } 
	public void setPtrIp282210800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp282210800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp703020800
	 *	@return ptrIp703020800
	 */
   public char[] getPtrIp703020800() throws CFException{
   		return ptrIp703020800;
   }

  
	/**
	*  set variable ptrIp703020800
	*  Corresponding COBOL Variable is 800-PTR-IP703020
	*  @param value
	**/
   public void setPtrIp703020800(char[] value) {
       value = checkPtrIp703020800Constraints(value);
       arraycopy(value,0,ptrIp703020800,0,value.length);
   } 
	public void setPtrIp703020800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp703020800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp750080800
	 *	@return ptrIp750080800
	 */
   public char[] getPtrIp750080800() throws CFException{
   		return ptrIp750080800;
   }

  
	/**
	*  set variable ptrIp750080800
	*  Corresponding COBOL Variable is 800-PTR-IP750080
	*  @param value
	**/
   public void setPtrIp750080800(char[] value) {
       value = checkPtrIp750080800Constraints(value);
       arraycopy(value,0,ptrIp750080800,0,value.length);
   } 
	public void setPtrIp750080800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp750080800,0,beginIndex + endIndex);
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
	 *	Returns the value of ptrIp996020800
	 *	@return ptrIp996020800
	 */
   public char[] getPtrIp996020800() throws CFException{
   		return ptrIp996020800;
   }

  
	/**
	*  set variable ptrIp996020800
	*  Corresponding COBOL Variable is 800-PTR-IP996020
	*  @param value
	**/
   public void setPtrIp996020800(char[] value) {
       value = checkPtrIp996020800Constraints(value);
       arraycopy(value,0,ptrIp996020800,0,value.length);
   } 
	public void setPtrIp996020800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp996020800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendPtr800
	 *	@return abendPtr800
	 */
   public char[] getAbendPtr800() throws CFException{
   		return abendPtr800;
   }

  
	/**
	*  set variable abendPtr800
	*  Corresponding COBOL Variable is 800-ABEND-PTR
	*  @param value
	**/
   public void setAbendPtr800(char[] value) {
       value = checkAbendPtr800Constraints(value);
       arraycopy(value,0,abendPtr800,0,value.length);
   } 
	public void setAbendPtr800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendPtr800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of astriskLine900
	 *	@return astriskLine900
	 */
   public char[] getAstriskLine900() throws CFException{
   		return astriskLine900;
   }

  
	/**
	*  set variable astriskLine900
	*  Corresponding COBOL Variable is 900-ASTRISK-LINE
	*  @param value
	**/
   public void setAstriskLine900(char[] value) {
       value = checkAstriskLine900Constraints(value);
       arraycopy(value,0,astriskLine900,0,value.length);
   } 
	public void setAstriskLine900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,astriskLine900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendAbend900
	 *	@return abendAbend900
	 */
   public char[] getAbendAbend900() throws CFException{
   		return abendAbend900;
   }

  
	/**
	*  set variable abendAbend900
	*  Corresponding COBOL Variable is 900-ABEND-ABEND
	*  @param value
	**/
   public void setAbendAbend900(char[] value) {
       value = checkAbendAbend900Constraints(value);
       arraycopy(value,0,abendAbend900,0,value.length);
   } 
	public void setAbendAbend900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendAbend900,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendAbendPgm900
	 *	@return abendAbendPgm900
	 */
   public char[] getAbendAbendPgm900() throws CFException{
   		return abendAbendPgm900;
   }

  
	/**
	*  set variable abendAbendPgm900
	*  Corresponding COBOL Variable is 900-ABEND-ABEND-PGM
	*  @param value
	**/
   public void setAbendAbendPgm900(char[] value) {
       value = checkAbendAbendPgm900Constraints(value);
       arraycopy(value,0,abendAbendPgm900,0,value.length);
   } 
	public void setAbendAbendPgm900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,abendAbendPgm900,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
