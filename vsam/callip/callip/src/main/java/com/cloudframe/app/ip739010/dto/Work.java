package com.cloudframe.app.ip739010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.ip739010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short ip000704DeSubMax;

						private char[] isItTheFirstTime100 = new char[1];

						private char[] wasT6Loaded100 = new char[1];

						private char[] wasT7Loaded100 = new char[1];

						private char[] table6Id300 = new char[8];

						private char[] table6aId300 = new char[8];

						private char[] table7Id300 = new char[8];

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

								private int tableMaxLength800;

								private int maxT6RowNo800;

								private int maxT6aRowNo800;

								private int maxT7RowNo800;

								private int currentDeNo800;

						private char[] currentDateTime800 = new char[10];

								private int checkLength800;

								private int rowLength800;

								private int rowCount800;

								private int remainder800;

						private char[] clearingDtTm800 = new char[10];

						private char[] lastKeyDtTmT6800 = new char[10];

						private char[] lastKeyDtTmT6a800 = new char[10];

						private char[] lastKeyDtTmT7800 = new char[10];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp000704DeSubMax((short)200);
								setIsItTheFirstTime100(("Y").toCharArray());
								setWasT6Loaded100(("N").toCharArray());
								setWasT7Loaded100(("N").toCharArray());
								setTable6Id300(("IP0006T1").toCharArray());
								setTable6aId300(("IP0006T2").toCharArray());
								setTable7Id300(("IP0007T1").toCharArray());
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
								setMaxT6RowNo800(0);
								setMaxT6aRowNo800(0);
								setMaxT7RowNo800(0);
								setCurrentDeNo800(0);
								setCurrentDateTime800(fillSpace(10));
								setCheckLength800(0);
								setRowLength800(0);
								setRowCount800(0);
								setRemainder800(0);
								setClearingDtTm800(fillHighValue(10));
								setLastKeyDtTmT6800(fillHighValue(10));
								setLastKeyDtTmT6a800(fillHighValue(10));
								setLastKeyDtTmT7800(fillHighValue(10));
    }


 

	/**
	 *	Returns the value of ip000704DeSubMax
	 *	@return ip000704DeSubMax
	 */
	public short getIp000704DeSubMax() throws CFException {
       if (isIp000704DeSubMaxModified()) { 
           ip000704DeSubMax = refreshIp000704DeSubMax();
        }
   		return ip000704DeSubMax;
	}
	

    /**
	 *	Returns the String value of ip000704DeSubMax
	 *	@return ip000704DeSubMax
	 */
	public char[]  getIp000704DeSubMaxActualString() {
	    String value = String.valueOf(ip000704DeSubMax).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Ip000704DeSubMax with the passed value
	 *  Corresponding COBOL Variable is IP000704-DE-SUB-MAX
	 *	@param number
	 */
	public void setIp000704DeSubMax(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip000704DeSubMax = checkIp000704DeSubMaxMaxLimit(number); 
		serializeIp000704DeSubMax(ip000704DeSubMax);
	}
	
	public void setIp000704DeSubMax(int number) {
	    number = checkIp000704DeSubMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubMax((short)number);
	}
	public void setIp000704DeSubMax(long number) {
	    number = checkIp000704DeSubMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp000704DeSubMax((short)number);
	}
	

	/**
	 * 	Update Ip000704DeSubMax with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp000704DeSubMax(char[] value) throws CFException {
		 ip000704DeSubMax = serializeIp000704DeSubMax(value);
	}
	/**
	 * 	Update Ip000704DeSubMax with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp000704DeSubMaxString(char[] value) throws CFException {
		 setIp000704DeSubMax(value);
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
	 *	Returns the value of wasT6Loaded100
	 *	@return wasT6Loaded100
	 */
   public char[] getWasT6Loaded100() throws CFException{
   		return wasT6Loaded100;
   }

  
	/**
	*  set variable wasT6Loaded100
	*  Corresponding COBOL Variable is 100-WAS-T6-LOADED
	*  @param value
	**/
   public void setWasT6Loaded100(char[] value) {
       value = checkWasT6Loaded100Constraints(value);
       arraycopy(value,0,wasT6Loaded100,0,value.length);
   } 
	public void setWasT6Loaded100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wasT6Loaded100,0,beginIndex + endIndex);
   }
	char[] t6WasLoaded8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isT6WasLoaded88100()
	 *	@return  Returns true if isT6WasLoaded88100() is "Y"
	 */
   public boolean isT6WasLoaded88100() throws CFException {
      return (  compareChars( getWasT6Loaded100() , t6WasLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setT6WasLoaded88100True() {  			
    	setWasT6Loaded100( t6WasLoaded8810088Value);
   	}
	char[] t6NotLoaded8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isT6NotLoaded88100()
	 *	@return  Returns true if isT6NotLoaded88100() is "N"
	 */
   public boolean isT6NotLoaded88100() throws CFException {
      return (  compareChars( getWasT6Loaded100() , t6NotLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setT6NotLoaded88100True() {  			
    	setWasT6Loaded100( t6NotLoaded8810088Value);
   	}
	/**
	 *	Returns the value of wasT7Loaded100
	 *	@return wasT7Loaded100
	 */
   public char[] getWasT7Loaded100() throws CFException{
   		return wasT7Loaded100;
   }

  
	/**
	*  set variable wasT7Loaded100
	*  Corresponding COBOL Variable is 100-WAS-T7-LOADED
	*  @param value
	**/
   public void setWasT7Loaded100(char[] value) {
       value = checkWasT7Loaded100Constraints(value);
       arraycopy(value,0,wasT7Loaded100,0,value.length);
   } 
	public void setWasT7Loaded100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,wasT7Loaded100,0,beginIndex + endIndex);
   }
	char[] t7WasLoaded8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isT7WasLoaded88100()
	 *	@return  Returns true if isT7WasLoaded88100() is "Y"
	 */
   public boolean isT7WasLoaded88100() throws CFException {
      return (  compareChars( getWasT7Loaded100() , t7WasLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setT7WasLoaded88100True() {  			
    	setWasT7Loaded100( t7WasLoaded8810088Value);
   	}
	char[] t7NotLoaded8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isT7NotLoaded88100()
	 *	@return  Returns true if isT7NotLoaded88100() is "N"
	 */
   public boolean isT7NotLoaded88100() throws CFException {
      return (  compareChars( getWasT7Loaded100() , t7NotLoaded8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setT7NotLoaded88100True() {  			
    	setWasT7Loaded100( t7NotLoaded8810088Value);
   	}
	/**
	 *	Returns the value of table6Id300
	 *	@return table6Id300
	 */
   public char[] getTable6Id300() throws CFException{
   		return table6Id300;
   }

  
	/**
	*  set variable table6Id300
	*  Corresponding COBOL Variable is 300-TABLE-6-ID
	*  @param value
	**/
   public void setTable6Id300(char[] value) {
       value = checkTable6Id300Constraints(value);
       arraycopy(value,0,table6Id300,0,value.length);
   } 
	public void setTable6Id300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,table6Id300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of table6aId300
	 *	@return table6aId300
	 */
   public char[] getTable6aId300() throws CFException{
   		return table6aId300;
   }

  
	/**
	*  set variable table6aId300
	*  Corresponding COBOL Variable is 300-TABLE-6A-ID
	*  @param value
	**/
   public void setTable6aId300(char[] value) {
       value = checkTable6aId300Constraints(value);
       arraycopy(value,0,table6aId300,0,value.length);
   } 
	public void setTable6aId300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,table6aId300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of table7Id300
	 *	@return table7Id300
	 */
   public char[] getTable7Id300() throws CFException{
   		return table7Id300;
   }

  
	/**
	*  set variable table7Id300
	*  Corresponding COBOL Variable is 300-TABLE-7-ID
	*  @param value
	**/
   public void setTable7Id300(char[] value) {
       value = checkTable7Id300Constraints(value);
       arraycopy(value,0,table7Id300,0,value.length);
   } 
	public void setTable7Id300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,table7Id300,0,beginIndex + endIndex);
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
	 *	Returns the value of maxT6RowNo800
	 *	@return maxT6RowNo800
	 */
	public int getMaxT6RowNo800() throws CFException {
   		return maxT6RowNo800;
	}
	
	/**
	 * 	Update MaxT6RowNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAX-T6-ROW-NO
	 *	@param number
	 */
	public void setMaxT6RowNo800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxT6RowNo800 = checkMaxT6RowNo800MaxLimit(number); 
	}


	public void setMaxT6RowNo800(long number) {
	    number = checkMaxT6RowNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxT6RowNo800((int)number);
	}
	
	/**
	 *	Returns the value of maxT6aRowNo800
	 *	@return maxT6aRowNo800
	 */
	public int getMaxT6aRowNo800() throws CFException {
   		return maxT6aRowNo800;
	}
	
	/**
	 * 	Update MaxT6aRowNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAX-T6A-ROW-NO
	 *	@param number
	 */
	public void setMaxT6aRowNo800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxT6aRowNo800 = checkMaxT6aRowNo800MaxLimit(number); 
	}


	public void setMaxT6aRowNo800(long number) {
	    number = checkMaxT6aRowNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxT6aRowNo800((int)number);
	}
	
	/**
	 *	Returns the value of maxT7RowNo800
	 *	@return maxT7RowNo800
	 */
	public int getMaxT7RowNo800() throws CFException {
   		return maxT7RowNo800;
	}
	
	/**
	 * 	Update MaxT7RowNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAX-T7-ROW-NO
	 *	@param number
	 */
	public void setMaxT7RowNo800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    maxT7RowNo800 = checkMaxT7RowNo800MaxLimit(number); 
	}


	public void setMaxT7RowNo800(long number) {
	    number = checkMaxT7RowNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxT7RowNo800((int)number);
	}
	
	/**
	 *	Returns the value of currentDeNo800
	 *	@return currentDeNo800
	 */
	public int getCurrentDeNo800() throws CFException {
   		return currentDeNo800;
	}
	
	/**
	 * 	Update CurrentDeNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-CURRENT-DE-NO
	 *	@param number
	 */
	public void setCurrentDeNo800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    currentDeNo800 = checkCurrentDeNo800MaxLimit(number); 
	}


	public void setCurrentDeNo800(long number) {
	    number = checkCurrentDeNo800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCurrentDeNo800((int)number);
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
	 *	Returns the value of lastKeyDtTmT6800
	 *	@return lastKeyDtTmT6800
	 */
   public char[] getLastKeyDtTmT6800() throws CFException{
   		return lastKeyDtTmT6800;
   }

  
	/**
	*  set variable lastKeyDtTmT6800
	*  Corresponding COBOL Variable is 800-LAST-KEY-DT-TM-T6
	*  @param value
	**/
   public void setLastKeyDtTmT6800(char[] value) {
       value = checkLastKeyDtTmT6800Constraints(value);
       arraycopy(value,0,lastKeyDtTmT6800,0,value.length);
   } 
	public void setLastKeyDtTmT6800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lastKeyDtTmT6800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lastKeyDtTmT6a800
	 *	@return lastKeyDtTmT6a800
	 */
   public char[] getLastKeyDtTmT6a800() throws CFException{
   		return lastKeyDtTmT6a800;
   }

  
	/**
	*  set variable lastKeyDtTmT6a800
	*  Corresponding COBOL Variable is 800-LAST-KEY-DT-TM-T6A
	*  @param value
	**/
   public void setLastKeyDtTmT6a800(char[] value) {
       value = checkLastKeyDtTmT6a800Constraints(value);
       arraycopy(value,0,lastKeyDtTmT6a800,0,value.length);
   } 
	public void setLastKeyDtTmT6a800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lastKeyDtTmT6a800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lastKeyDtTmT7800
	 *	@return lastKeyDtTmT7800
	 */
   public char[] getLastKeyDtTmT7800() throws CFException{
   		return lastKeyDtTmT7800;
   }

  
	/**
	*  set variable lastKeyDtTmT7800
	*  Corresponding COBOL Variable is 800-LAST-KEY-DT-TM-T7
	*  @param value
	**/
   public void setLastKeyDtTmT7800(char[] value) {
       value = checkLastKeyDtTmT7800Constraints(value);
       arraycopy(value,0,lastKeyDtTmT7800,0,value.length);
   } 
	public void setLastKeyDtTmT7800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lastKeyDtTmT7800,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
