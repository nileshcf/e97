package com.cloudframe.app.ip741010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip741010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

								private short ip000904PdsSubMax;

						private char[] isItTheFirstTime100 = new char[1];

						private char[] haveWeLoadedATable100 = new char[1];

						private char[] table8Id300 = new char[8];

						private char[] table9Id300 = new char[8];

						private char[] pgmIp650010300 = new char[8];

						private char[] pgmIp299010300 = new char[8];

						private char[] tblOverflowAbendCode300 = new char[4];

						private char[] recAbsentAbendCode300 = new char[4];

						private char[] tblIntegrityAbendCode300 = new char[4];

						private char[] para8100300 = new char[26];

						private char[] para8200300 = new char[26];

								private int startPoint400;

						private char[] ptrIp650010800 = new char[8];

						private char[] ptrIp299010800 = new char[8];

						private char[] currentDateTime800 = Field.fillLowValue(10);

								private int tableMaxLength800;

								private int maxT9RowNo800;

								private int currentPdsNo800;

								private int checkLength800;

								private int rowLength800;

								private int rowCount800;

								private int remainder800;

						private char[] clearingDtTm800 = new char[10];

						private char[] lastKeyDtTmT8800 = new char[10];

						private char[] lastKeyDtTmT9800 = new char[10];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp000904PdsSubMax((short)2000);
								setIsItTheFirstTime100(("Y").toCharArray());
								setHaveWeLoadedATable100(("N").toCharArray());
								setTable8Id300(("IP0008T1").toCharArray());
								setTable9Id300(("IP0009T1").toCharArray());
								setPgmIp650010300(("IP650010").toCharArray());
								setPgmIp299010300(("IP299010").toCharArray());
								setTblOverflowAbendCode300(("3001").toCharArray());
								setRecAbsentAbendCode300(("3002").toCharArray());
								setTblIntegrityAbendCode300(("3003").toCharArray());
								setPara8100300(("8100-GET-FROM-ONE-DAY-FILE").toCharArray());
								setPara8200300(("8200-CHECK-TABLE-LIMIT    ").toCharArray());
								setStartPoint400(1);
								setPtrIp650010800(("IP650010").toCharArray());
								setPtrIp299010800(("IP299010").toCharArray());
								setTableMaxLength800(0);
								setMaxT9RowNo800(0);
								setCurrentPdsNo800(0);
								setCheckLength800(0);
								setRowLength800(0);
								setRowCount800(0);
								setRemainder800(0);
								setClearingDtTm800(fillHighValue(10));
								setLastKeyDtTmT8800(fillHighValue(10));
								setLastKeyDtTmT9800(fillHighValue(10));
    }


 

	/**
	 *	Returns the value of ip000904PdsSubMax
	 *	@return ip000904PdsSubMax
	 */
	public short getIp000904PdsSubMax() throws CFException {
       if (isIp000904PdsSubMaxModified()) { 
           ip000904PdsSubMax = refreshIp000904PdsSubMax();
        }
   		return ip000904PdsSubMax;
	}
	

    /**
	 *	Returns the String value of ip000904PdsSubMax
	 *	@return ip000904PdsSubMax
	 */
	public char[]  getIp000904PdsSubMaxActualString() {
	    String value = String.valueOf(ip000904PdsSubMax).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip000904PdsSubMax with the passed value
	 *  Corresponding COBOL Variable is IP000904-PDS-SUB-MAX
	 *	@param number
	 */
	public void setIp000904PdsSubMax(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip000904PdsSubMax = checkIp000904PdsSubMaxMaxLimit(number); 
		serializeIp000904PdsSubMax(ip000904PdsSubMax);
	}
	
	public void setIp000904PdsSubMax(int number) {
	    number = checkIp000904PdsSubMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubMax((short)number);
	}
	public void setIp000904PdsSubMax(long number) {
	    number = checkIp000904PdsSubMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000904PdsSubMax((short)number);
	}
	

	/**
	 * 	Update Ip000904PdsSubMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp000904PdsSubMax(char[] value) throws CFException {
		 ip000904PdsSubMax = serializeIp000904PdsSubMax(value);
	}
	/**
	 * 	Update Ip000904PdsSubMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp000904PdsSubMaxString(char[] value) throws CFException {
		 setIp000904PdsSubMax(value);
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
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItTheFirstTime100( itIsFirstTime8810088Value);
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
	 *	Returns the value of haveWeLoadedATable100
	 *	@return haveWeLoadedATable100
	 */
   public char[] getHaveWeLoadedATable100() throws CFException{
   		return haveWeLoadedATable100;
   }

  
	/**
	*  set variable haveWeLoadedATable100
	*  Corresponding COBOL Variable is 100-HAVE-WE-LOADED-A-TABLE
	*  @param value
	**/
   public void setHaveWeLoadedATable100(char[] value) {
       value = checkHaveWeLoadedATable100Constraints(value);
       arraycopy(value,0,haveWeLoadedATable100,0,value.length);
   } 
	public void setHaveWeLoadedATable100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,haveWeLoadedATable100,0,beginIndex + endIndex);
   }
	char[] weLoadedATable8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWeLoadedATable88100()
	 *	@return  Returns true if isWeLoadedATable88100() is "Y"
	 */
   public boolean isWeLoadedATable88100() throws CFException {
      return (  compareChars( getHaveWeLoadedATable100() , weLoadedATable8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWeLoadedATable88100True() {  			
    	setHaveWeLoadedATable100( weLoadedATable8810088Value);
   	}
	char[] noTableWasLoaded8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoTableWasLoaded88100()
	 *	@return  Returns true if isNoTableWasLoaded88100() is "N"
	 */
   public boolean isNoTableWasLoaded88100() throws CFException {
      return (  compareChars( getHaveWeLoadedATable100() , noTableWasLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoTableWasLoaded88100True() {  			
    	setHaveWeLoadedATable100( noTableWasLoaded8810088Value);
   	}
	/**
	 *	Returns the value of table8Id300
	 *	@return table8Id300
	 */
   public char[] getTable8Id300() throws CFException{
   		return table8Id300;
   }

  
	/**
	*  set variable table8Id300
	*  Corresponding COBOL Variable is 300-TABLE-8-ID
	*  @param value
	**/
   public void setTable8Id300(char[] value) {
       value = checkTable8Id300Constraints(value);
       arraycopy(value,0,table8Id300,0,value.length);
   } 
	public void setTable8Id300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,table8Id300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of table9Id300
	 *	@return table9Id300
	 */
   public char[] getTable9Id300() throws CFException{
   		return table9Id300;
   }

  
	/**
	*  set variable table9Id300
	*  Corresponding COBOL Variable is 300-TABLE-9-ID
	*  @param value
	**/
   public void setTable9Id300(char[] value) {
       value = checkTable9Id300Constraints(value);
       arraycopy(value,0,table9Id300,0,value.length);
   } 
	public void setTable9Id300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,table9Id300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp650010300
	 *	@return pgmIp650010300
	 */
   public char[] getPgmIp650010300() throws CFException{
   		return pgmIp650010300;
   }

  
	/**
	*  set variable pgmIp650010300
	*  Corresponding COBOL Variable is 300-PGM-IP650010
	*  @param value
	**/
   public void setPgmIp650010300(char[] value) {
       value = checkPgmIp650010300Constraints(value);
       arraycopy(value,0,pgmIp650010300,0,value.length);
   } 
	public void setPgmIp650010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp650010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp299010300
	 *	@return pgmIp299010300
	 */
   public char[] getPgmIp299010300() throws CFException{
   		return pgmIp299010300;
   }

  
	/**
	*  set variable pgmIp299010300
	*  Corresponding COBOL Variable is 300-PGM-IP299010
	*  @param value
	**/
   public void setPgmIp299010300(char[] value) {
       value = checkPgmIp299010300Constraints(value);
       arraycopy(value,0,pgmIp299010300,0,value.length);
   } 
	public void setPgmIp299010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp299010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tblOverflowAbendCode300
	 *	@return tblOverflowAbendCode300
	 */
   public char[] getTblOverflowAbendCode300() throws CFException{
   		return tblOverflowAbendCode300;
   }

  
	/**
	*  set variable tblOverflowAbendCode300
	*  Corresponding COBOL Variable is 300-TBL-OVERFLOW-ABEND-CODE
	*  @param value
	**/
   public void setTblOverflowAbendCode300(char[] value) {
       value = checkTblOverflowAbendCode300Constraints(value);
       arraycopy(value,0,tblOverflowAbendCode300,0,value.length);
   } 
	public void setTblOverflowAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblOverflowAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of recAbsentAbendCode300
	 *	@return recAbsentAbendCode300
	 */
   public char[] getRecAbsentAbendCode300() throws CFException{
   		return recAbsentAbendCode300;
   }

  
	/**
	*  set variable recAbsentAbendCode300
	*  Corresponding COBOL Variable is 300-REC-ABSENT-ABEND-CODE
	*  @param value
	**/
   public void setRecAbsentAbendCode300(char[] value) {
       value = checkRecAbsentAbendCode300Constraints(value);
       arraycopy(value,0,recAbsentAbendCode300,0,value.length);
   } 
	public void setRecAbsentAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recAbsentAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tblIntegrityAbendCode300
	 *	@return tblIntegrityAbendCode300
	 */
   public char[] getTblIntegrityAbendCode300() throws CFException{
   		return tblIntegrityAbendCode300;
   }

  
	/**
	*  set variable tblIntegrityAbendCode300
	*  Corresponding COBOL Variable is 300-TBL-INTEGRITY-ABEND-CODE
	*  @param value
	**/
   public void setTblIntegrityAbendCode300(char[] value) {
       value = checkTblIntegrityAbendCode300Constraints(value);
       arraycopy(value,0,tblIntegrityAbendCode300,0,value.length);
   } 
	public void setTblIntegrityAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblIntegrityAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8100300
	 *	@return para8100300
	 */
   public char[] getPara8100300() throws CFException{
   		return para8100300;
   }

  
	/**
	*  set variable para8100300
	*  Corresponding COBOL Variable is 300-PARA-8100
	*  @param value
	**/
   public void setPara8100300(char[] value) {
       value = checkPara8100300Constraints(value);
       arraycopy(value,0,para8100300,0,value.length);
   } 
	public void setPara8100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8100300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8200300
	 *	@return para8200300
	 */
   public char[] getPara8200300() throws CFException{
   		return para8200300;
   }

  
	/**
	*  set variable para8200300
	*  Corresponding COBOL Variable is 300-PARA-8200
	*  @param value
	**/
   public void setPara8200300(char[] value) {
       value = checkPara8200300Constraints(value);
       arraycopy(value,0,para8200300,0,value.length);
   } 
	public void setPara8200300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8200300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of startPoint400
	 *	@return startPoint400
	 */
	public int getStartPoint400() throws CFException {
   		return startPoint400;
	}
	
	/**
	 * 	Update StartPoint400 with the passed value
	 *  Corresponding COBOL Variable is 400-START-POINT
	 *	@param number
	 */
	public void setStartPoint400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    startPoint400 = checkStartPoint400MaxLimit(number); 
	}


	public void setStartPoint400(long number) {
	    number = checkStartPoint400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStartPoint400((int)number);
	}
	
	/**
	 *	Returns the value of ptrIp650010800
	 *	@return ptrIp650010800
	 */
   public char[] getPtrIp650010800() throws CFException{
   		return ptrIp650010800;
   }

  
	/**
	*  set variable ptrIp650010800
	*  Corresponding COBOL Variable is 800-PTR-IP650010
	*  @param value
	**/
   public void setPtrIp650010800(char[] value) {
       value = checkPtrIp650010800Constraints(value);
       arraycopy(value,0,ptrIp650010800,0,value.length);
   } 
	public void setPtrIp650010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp650010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp299010800
	 *	@return ptrIp299010800
	 */
   public char[] getPtrIp299010800() throws CFException{
   		return ptrIp299010800;
   }

  
	/**
	*  set variable ptrIp299010800
	*  Corresponding COBOL Variable is 800-PTR-IP299010
	*  @param value
	**/
   public void setPtrIp299010800(char[] value) {
       value = checkPtrIp299010800Constraints(value);
       arraycopy(value,0,ptrIp299010800,0,value.length);
   } 
	public void setPtrIp299010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp299010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currentDateTime800
	 *	@return currentDateTime800
	 */
   public char[] getCurrentDateTime800() throws CFException{
   		return currentDateTime800;
   }

  
	/**
	*  set variable currentDateTime800
	*  Corresponding COBOL Variable is 800-CURRENT-DATE-TIME
	*  @param value
	**/
   public void setCurrentDateTime800(char[] value) {
       value = checkCurrentDateTime800Constraints(value);
       arraycopy(value,0,currentDateTime800,0,value.length);
   } 
	public void setCurrentDateTime800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currentDateTime800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableMaxLength800
	 *	@return tableMaxLength800
	 */
	public int getTableMaxLength800() throws CFException {
   		return tableMaxLength800;
	}
	
	/**
	 * 	Update TableMaxLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-TABLE-MAX-LENGTH
	 *	@param number
	 */
	public void setTableMaxLength800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tableMaxLength800 = checkTableMaxLength800MaxLimit(number); 
	}


	public void setTableMaxLength800(long number) {
	    number = checkTableMaxLength800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTableMaxLength800((int)number);
	}
	
	/**
	 *	Returns the value of maxT9RowNo800
	 *	@return maxT9RowNo800
	 */
	public int getMaxT9RowNo800() throws CFException {
   		return maxT9RowNo800;
	}
	
	/**
	 * 	Update MaxT9RowNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAX-T9-ROW-NO
	 *	@param number
	 */
	public void setMaxT9RowNo800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxT9RowNo800 = checkMaxT9RowNo800MaxLimit(number); 
	}


	public void setMaxT9RowNo800(long number) {
	    number = checkMaxT9RowNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxT9RowNo800((int)number);
	}
	
	/**
	 *	Returns the value of currentPdsNo800
	 *	@return currentPdsNo800
	 */
	public int getCurrentPdsNo800() throws CFException {
   		return currentPdsNo800;
	}
	
	/**
	 * 	Update CurrentPdsNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURRENT-PDS-NO
	 *	@param number
	 */
	public void setCurrentPdsNo800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    currentPdsNo800 = checkCurrentPdsNo800MaxLimit(number); 
	}


	public void setCurrentPdsNo800(long number) {
	    number = checkCurrentPdsNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrentPdsNo800((int)number);
	}
	
	/**
	 *	Returns the value of checkLength800
	 *	@return checkLength800
	 */
	public int getCheckLength800() throws CFException {
   		return checkLength800;
	}
	
	/**
	 * 	Update CheckLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-CHECK-LENGTH
	 *	@param number
	 */
	public void setCheckLength800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    checkLength800 = checkCheckLength800MaxLimit(number); 
	}


	public void setCheckLength800(long number) {
	    number = checkCheckLength800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCheckLength800((int)number);
	}
	
	/**
	 *	Returns the value of rowLength800
	 *	@return rowLength800
	 */
	public int getRowLength800() throws CFException {
   		return rowLength800;
	}
	
	/**
	 * 	Update RowLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-ROW-LENGTH
	 *	@param number
	 */
	public void setRowLength800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowLength800 = checkRowLength800MaxLimit(number); 
	}


	public void setRowLength800(long number) {
	    number = checkRowLength800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowLength800((int)number);
	}
	
	/**
	 *	Returns the value of rowCount800
	 *	@return rowCount800
	 */
	public int getRowCount800() throws CFException {
   		return rowCount800;
	}
	
	/**
	 * 	Update RowCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-ROW-COUNT
	 *	@param number
	 */
	public void setRowCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowCount800 = checkRowCount800MaxLimit(number); 
	}


	public void setRowCount800(long number) {
	    number = checkRowCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowCount800((int)number);
	}
	
	/**
	 *	Returns the value of remainder800
	 *	@return remainder800
	 */
	public int getRemainder800() throws CFException {
   		return remainder800;
	}
	
	/**
	 * 	Update Remainder800 with the passed value
	 *  Corresponding COBOL Variable is 800-REMAINDER
	 *	@param number
	 */
	public void setRemainder800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    remainder800 = checkRemainder800MaxLimit(number); 
	}


	public void setRemainder800(long number) {
	    number = checkRemainder800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRemainder800((int)number);
	}
	
	/**
	 *	Returns the value of clearingDtTm800
	 *	@return clearingDtTm800
	 */
   public char[] getClearingDtTm800() throws CFException{
   		return clearingDtTm800;
   }

  
	/**
	*  set variable clearingDtTm800
	*  Corresponding COBOL Variable is 800-CLEARING-DT-TM
	*  @param value
	**/
   public void setClearingDtTm800(char[] value) {
       value = checkClearingDtTm800Constraints(value);
       arraycopy(value,0,clearingDtTm800,0,value.length);
   } 
	public void setClearingDtTm800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,clearingDtTm800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lastKeyDtTmT8800
	 *	@return lastKeyDtTmT8800
	 */
   public char[] getLastKeyDtTmT8800() throws CFException{
   		return lastKeyDtTmT8800;
   }

  
	/**
	*  set variable lastKeyDtTmT8800
	*  Corresponding COBOL Variable is 800-LAST-KEY-DT-TM-T8
	*  @param value
	**/
   public void setLastKeyDtTmT8800(char[] value) {
       value = checkLastKeyDtTmT8800Constraints(value);
       arraycopy(value,0,lastKeyDtTmT8800,0,value.length);
   } 
	public void setLastKeyDtTmT8800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lastKeyDtTmT8800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lastKeyDtTmT9800
	 *	@return lastKeyDtTmT9800
	 */
   public char[] getLastKeyDtTmT9800() throws CFException{
   		return lastKeyDtTmT9800;
   }

  
	/**
	*  set variable lastKeyDtTmT9800
	*  Corresponding COBOL Variable is 800-LAST-KEY-DT-TM-T9
	*  @param value
	**/
   public void setLastKeyDtTmT9800(char[] value) {
       value = checkLastKeyDtTmT9800Constraints(value);
       arraycopy(value,0,lastKeyDtTmT9800,0,value.length);
   } 
	public void setLastKeyDtTmT9800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lastKeyDtTmT9800,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
