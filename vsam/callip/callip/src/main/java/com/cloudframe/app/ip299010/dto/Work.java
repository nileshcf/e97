package com.cloudframe.app.ip299010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip299010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short ip00054wEntries;

						private char[] isItTheFirstTime100 = new char[1];

						private char[] areTableRecordsOver100 = new char[1];

						private char[] isTblidFndIntable5100 = new char[1];

						private char[] isTableKeyFound100 = new char[1];

								private int valueOne300;

						private char[] tableId300 = new char[8];

						private char[] pgmIp650010300 = new char[8];

						private char[] tblOverflowAbendCode300 = new char[4];

						private char[] recAbsentAbendCode300 = new char[4];

						private char[] recLengthAbendCode300 = new char[4];

						private char[] tblEntryAbendCode300 = new char[4];

						private char[] para1220300 = new char[26];

						private char[] para122110300 = new char[28];

						private char[] para122111300 = new char[26];

						private char[] para2210300 = new char[26];

								private int checkCount400;

								private int recordsLoaded400;

								private int startPoint400;

						private char[] tableOverflowError600 = new char[27];

						private char[] recNotFoundMsg610 = new char[32];

						private char[] ptrIp650010800 = new char[8];

								private int recordLength800;

								private int recordCount800;

								private int rowLength800;

								private int remainder800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp00054wEntries((short)2000);
								setIsItTheFirstTime100(("Y").toCharArray());
								setAreTableRecordsOver100(("N").toCharArray());
								setIsTblidFndIntable5100(("Y").toCharArray());
								setIsTableKeyFound100(("Y").toCharArray());
								setValueOne300(1);
								setTableId300(("IP0005T1").toCharArray());
								setPgmIp650010300(("IP650010").toCharArray());
								setTblOverflowAbendCode300(("3001").toCharArray());
								setRecAbsentAbendCode300(("3002").toCharArray());
								setRecLengthAbendCode300(("3003").toCharArray());
								setTblEntryAbendCode300(("3004").toCharArray());
								setPara1220300(("1220-GET-FROM-ONE-DAY-FILE").toCharArray());
								setPara122110300(("1221-10-CHECK-ONEDAY-REC-LEN").toCharArray());
								setPara122111300(("1221-11-CHECK-TABLE-LIMIT ").toCharArray());
								setPara2210300(("2210-ABEND-FOR-TBL-ABSENT ").toCharArray());
								setCheckCount400(0);
								setRecordsLoaded400(0);
								setStartPoint400(1);
								setTableOverflowError600((" IP0005T1 TABLE OVER FLOW. ").toCharArray());
								setRecNotFoundMsg610(("NO TABLE IP0005T1 RECORDS FOUND.").toCharArray());
								setPtrIp650010800(("IP650010").toCharArray());
								setRecordLength800(0);
								setRecordCount800(0);
								setRowLength800(0);
								setRemainder800(0);
    }


 

	/**
	 *	Returns the value of ip00054wEntries
	 *	@return ip00054wEntries
	 */
	public short getIp00054wEntries() throws CFException {
   		return ip00054wEntries;
	}
	
	/**
	 * 	Update Ip00054wEntries with the passed value
	 *  Corresponding COBOL Variable is IP00054W-ENTRIES
	 *	@param number
	 */
	public void setIp00054wEntries(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00054wEntries = checkIp00054wEntriesMaxLimit(number); 
	}

	public void setIp00054wEntries(int number) {
	    number = checkIp00054wEntriesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00054wEntries((short)number);
	}
	public void setIp00054wEntries(long number) {
	    number = checkIp00054wEntriesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00054wEntries((short)number);
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
	 *	Returns the value of areTableRecordsOver100
	 *	@return areTableRecordsOver100
	 */
   public char[] getAreTableRecordsOver100() throws CFException{
   		return areTableRecordsOver100;
   }

  
	/**
	*  set variable areTableRecordsOver100
	*  Corresponding COBOL Variable is 100-ARE-TABLE-RECORDS-OVER
	*  @param value
	**/
   public void setAreTableRecordsOver100(char[] value) {
       value = checkAreTableRecordsOver100Constraints(value);
       arraycopy(value,0,areTableRecordsOver100,0,value.length);
   } 
	public void setAreTableRecordsOver100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,areTableRecordsOver100,0,beginIndex + endIndex);
   }
	char[] tableRecOver8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTableRecOver88100()
	 *	@return  Returns true if isTableRecOver88100() is "Y"
	 */
   public boolean isTableRecOver88100() throws CFException {
      return (  compareChars( getAreTableRecordsOver100() , tableRecOver8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTableRecOver88100True() {  			
    	setAreTableRecordsOver100( tableRecOver8810088Value);
   	}
	char[] tableRecNotOver8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isTableRecNotOver88100()
	 *	@return  Returns true if isTableRecNotOver88100() is "N"
	 */
   public boolean isTableRecNotOver88100() throws CFException {
      return (  compareChars( getAreTableRecordsOver100() , tableRecNotOver8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setTableRecNotOver88100True() {  			
    	setAreTableRecordsOver100( tableRecNotOver8810088Value);
   	}
	/**
	 *	Returns the value of isTblidFndIntable5100
	 *	@return isTblidFndIntable5100
	 */
   public char[] getIsTblidFndIntable5100() throws CFException{
   		return isTblidFndIntable5100;
   }

  
	/**
	*  set variable isTblidFndIntable5100
	*  Corresponding COBOL Variable is 100-IS-TBLID-FND-INTABLE5
	*  @param value
	**/
   public void setIsTblidFndIntable5100(char[] value) {
       value = checkIsTblidFndIntable5100Constraints(value);
       arraycopy(value,0,isTblidFndIntable5100,0,value.length);
   } 
	public void setIsTblidFndIntable5100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isTblidFndIntable5100,0,beginIndex + endIndex);
   }
	char[] tableidFound8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTableidFound88100()
	 *	@return  Returns true if isTableidFound88100() is "Y"
	 */
   public boolean isTableidFound88100() throws CFException {
      return (  compareChars( getIsTblidFndIntable5100() , tableidFound8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTableidFound88100True() {  			
    	setIsTblidFndIntable5100( tableidFound8810088Value);
   	}
	char[] tableidNotFound8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isTableidNotFound88100()
	 *	@return  Returns true if isTableidNotFound88100() is "N"
	 */
   public boolean isTableidNotFound88100() throws CFException {
      return (  compareChars( getIsTblidFndIntable5100() , tableidNotFound8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setTableidNotFound88100True() {  			
    	setIsTblidFndIntable5100( tableidNotFound8810088Value);
   	}
	/**
	 *	Returns the value of isTableKeyFound100
	 *	@return isTableKeyFound100
	 */
   public char[] getIsTableKeyFound100() throws CFException{
   		return isTableKeyFound100;
   }

  
	/**
	*  set variable isTableKeyFound100
	*  Corresponding COBOL Variable is 100-IS-TABLE-KEY-FOUND
	*  @param value
	**/
   public void setIsTableKeyFound100(char[] value) {
       value = checkIsTableKeyFound100Constraints(value);
       arraycopy(value,0,isTableKeyFound100,0,value.length);
   } 
	public void setIsTableKeyFound100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isTableKeyFound100,0,beginIndex + endIndex);
   }
	char[] tableKeyFound8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTableKeyFound88100()
	 *	@return  Returns true if isTableKeyFound88100() is "Y"
	 */
   public boolean isTableKeyFound88100() throws CFException {
      return (  compareChars( getIsTableKeyFound100() , tableKeyFound8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTableKeyFound88100True() {  			
    	setIsTableKeyFound100( tableKeyFound8810088Value);
   	}
	char[] tableKeyNotFound8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isTableKeyNotFound88100()
	 *	@return  Returns true if isTableKeyNotFound88100() is "N"
	 */
   public boolean isTableKeyNotFound88100() throws CFException {
      return (  compareChars( getIsTableKeyFound100() , tableKeyNotFound8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setTableKeyNotFound88100True() {  			
    	setIsTableKeyFound100( tableKeyNotFound8810088Value);
   	}
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
   		return valueOne300;
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-ONE
	 *	@param number
	 */
	public void setValueOne300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    valueOne300 = checkValueOne300MaxLimit(number); 
	}


	public void setValueOne300(long number) {
	    number = checkValueOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValueOne300((int)number);
	}
	
	/**
	 *	Returns the value of tableId300
	 *	@return tableId300
	 */
   public char[] getTableId300() throws CFException{
   		return tableId300;
   }

  
	/**
	*  set variable tableId300
	*  Corresponding COBOL Variable is 300-TABLE-ID
	*  @param value
	**/
   public void setTableId300(char[] value) {
       value = checkTableId300Constraints(value);
       arraycopy(value,0,tableId300,0,value.length);
   } 
	public void setTableId300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableId300,0,beginIndex + endIndex);
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
	 *	Returns the value of recLengthAbendCode300
	 *	@return recLengthAbendCode300
	 */
   public char[] getRecLengthAbendCode300() throws CFException{
   		return recLengthAbendCode300;
   }

  
	/**
	*  set variable recLengthAbendCode300
	*  Corresponding COBOL Variable is 300-REC-LENGTH-ABEND-CODE
	*  @param value
	**/
   public void setRecLengthAbendCode300(char[] value) {
       value = checkRecLengthAbendCode300Constraints(value);
       arraycopy(value,0,recLengthAbendCode300,0,value.length);
   } 
	public void setRecLengthAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recLengthAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tblEntryAbendCode300
	 *	@return tblEntryAbendCode300
	 */
   public char[] getTblEntryAbendCode300() throws CFException{
   		return tblEntryAbendCode300;
   }

  
	/**
	*  set variable tblEntryAbendCode300
	*  Corresponding COBOL Variable is 300-TBL-ENTRY-ABEND-CODE
	*  @param value
	**/
   public void setTblEntryAbendCode300(char[] value) {
       value = checkTblEntryAbendCode300Constraints(value);
       arraycopy(value,0,tblEntryAbendCode300,0,value.length);
   } 
	public void setTblEntryAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblEntryAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para1220300
	 *	@return para1220300
	 */
   public char[] getPara1220300() throws CFException{
   		return para1220300;
   }

  
	/**
	*  set variable para1220300
	*  Corresponding COBOL Variable is 300-PARA-1220
	*  @param value
	**/
   public void setPara1220300(char[] value) {
       value = checkPara1220300Constraints(value);
       arraycopy(value,0,para1220300,0,value.length);
   } 
	public void setPara1220300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1220300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para122110300
	 *	@return para122110300
	 */
   public char[] getPara122110300() throws CFException{
   		return para122110300;
   }

  
	/**
	*  set variable para122110300
	*  Corresponding COBOL Variable is 300-PARA-1221-10
	*  @param value
	**/
   public void setPara122110300(char[] value) {
       value = checkPara122110300Constraints(value);
       arraycopy(value,0,para122110300,0,value.length);
   } 
	public void setPara122110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para122110300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para122111300
	 *	@return para122111300
	 */
   public char[] getPara122111300() throws CFException{
   		return para122111300;
   }

  
	/**
	*  set variable para122111300
	*  Corresponding COBOL Variable is 300-PARA-1221-11
	*  @param value
	**/
   public void setPara122111300(char[] value) {
       value = checkPara122111300Constraints(value);
       arraycopy(value,0,para122111300,0,value.length);
   } 
	public void setPara122111300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para122111300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para2210300
	 *	@return para2210300
	 */
   public char[] getPara2210300() throws CFException{
   		return para2210300;
   }

  
	/**
	*  set variable para2210300
	*  Corresponding COBOL Variable is 300-PARA-2210
	*  @param value
	**/
   public void setPara2210300(char[] value) {
       value = checkPara2210300Constraints(value);
       arraycopy(value,0,para2210300,0,value.length);
   } 
	public void setPara2210300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2210300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of checkCount400
	 *	@return checkCount400
	 */
	public int getCheckCount400() throws CFException {
   		return checkCount400;
	}
	
	/**
	 * 	Update CheckCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-CHECK-COUNT
	 *	@param number
	 */
	public void setCheckCount400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    checkCount400 = checkCheckCount400MaxLimit(number); 
	}


	public void setCheckCount400(long number) {
	    number = checkCheckCount400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCheckCount400((int)number);
	}
	
	/**
	 *	Returns the value of recordsLoaded400
	 *	@return recordsLoaded400
	 */
	public int getRecordsLoaded400() throws CFException {
   		return recordsLoaded400;
	}
	
	/**
	 * 	Update RecordsLoaded400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECORDS-LOADED
	 *	@param number
	 */
	public void setRecordsLoaded400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordsLoaded400 = checkRecordsLoaded400MaxLimit(number); 
	}


	public void setRecordsLoaded400(long number) {
	    number = checkRecordsLoaded400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordsLoaded400((int)number);
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
	 *	Returns the value of tableOverflowError600
	 *	@return tableOverflowError600
	 */
   public char[] getTableOverflowError600() throws CFException{
   		return tableOverflowError600;
   }

  
	/**
	*  set variable tableOverflowError600
	*  Corresponding COBOL Variable is 600-TABLE-OVERFLOW-ERROR
	*  @param value
	**/
   public void setTableOverflowError600(char[] value) {
       value = checkTableOverflowError600Constraints(value);
       arraycopy(value,0,tableOverflowError600,0,value.length);
   } 
	public void setTableOverflowError600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableOverflowError600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of recNotFoundMsg610
	 *	@return recNotFoundMsg610
	 */
   public char[] getRecNotFoundMsg610() throws CFException{
   		return recNotFoundMsg610;
   }

  
	/**
	*  set variable recNotFoundMsg610
	*  Corresponding COBOL Variable is 610-REC-NOT-FOUND-MSG
	*  @param value
	**/
   public void setRecNotFoundMsg610(char[] value) {
       value = checkRecNotFoundMsg610Constraints(value);
       arraycopy(value,0,recNotFoundMsg610,0,value.length);
   } 
	public void setRecNotFoundMsg610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,recNotFoundMsg610,0,beginIndex + endIndex);
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
	 *	Returns the value of recordLength800
	 *	@return recordLength800
	 */
	public int getRecordLength800() throws CFException {
   		return recordLength800;
	}
	
	/**
	 * 	Update RecordLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-RECORD-LENGTH
	 *	@param number
	 */
	public void setRecordLength800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordLength800 = checkRecordLength800MaxLimit(number); 
	}


	public void setRecordLength800(long number) {
	    number = checkRecordLength800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordLength800((int)number);
	}
	
	/**
	 *	Returns the value of recordCount800
	 *	@return recordCount800
	 */
	public int getRecordCount800() throws CFException {
   		return recordCount800;
	}
	
	/**
	 * 	Update RecordCount800 with the passed value
	 *  Corresponding COBOL Variable is 800-RECORD-COUNT
	 *	@param number
	 */
	public void setRecordCount800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    recordCount800 = checkRecordCount800MaxLimit(number); 
	}


	public void setRecordCount800(long number) {
	    number = checkRecordCount800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRecordCount800((int)number);
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
	

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
