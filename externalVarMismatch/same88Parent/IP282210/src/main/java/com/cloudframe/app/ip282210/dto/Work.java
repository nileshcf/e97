package com.cloudframe.app.ip282210.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.ip282210.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short ip02014wEntries;

						private char[] isItTheFirstTime100 = new char[1];

						private char[] areLpaRecOver100 = new char[1];

						private char[] keyEntryFound100 = new char[1];

								private int valueOne300;

						private char[] lpaLoader300 = new char[8];

						private char[] tableId300 = new char[8];

						private char[] tableName300 = new char[35];

						private char[] pgmVersion300 = new char[7];

						private char[] pgmIp299010300 = new char[8];

						private char[] pgmIp650010300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] abendPgm300 = new char[8];

						private char[] tblOverflowAbendCode300 = new char[4];

						private char[] recLengthAbendCode300 = new char[4];

						private char[] noTable201InOdf300 = new char[4];

						private char[] para1311300 = new char[28];

						private char[] para131112300 = new char[26];

						private char[] para131111300 = new char[28];

								private int checkCount400;

								private int rowsLoaded400;

								private int rowCount400;

								private int startPoint400;

						private char[] ip02014TblOverflowErr600 = new char[63];

						private char[] table201AbsentInOdf610 = new char[48];

						private char[] ptrIp299010800 = new char[8];

						private char[] ptrIp650010800 = new char[8];

						private char[] ptrIp996010800 = new char[8];

						private char[] abendPtr800 = new char[8];

						private char[] clearingDtTm800 = new char[10];

						private char[] lastKeyDtTm800 = new char[10];

								private int recordLength800;

								private int remainder800;

								private int rowCount800;

								private int rowLength800;

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
								setIp02014wEntries((short)50);
								setIsItTheFirstTime100(("Y").toCharArray());
								setAreLpaRecOver100(("N").toCharArray());
								setKeyEntryFound100(("N").toCharArray());
								setValueOne300(1);
								setLpaLoader300(("IP282210").toCharArray());
								setTableId300(("IP0201T1").toCharArray());
								setTableName300(("LPA TABLE                          ").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD7,(byte)0x2D,(byte)0x01,(byte)0x12,(byte)0xD2,(byte)0x00}).toCharArray());
								setPgmIp299010300(("IP299010").toCharArray());
								setPgmIp650010300(("IP650010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setTblOverflowAbendCode300(("3001").toCharArray());
								setRecLengthAbendCode300(("3002").toCharArray());
								setNoTable201InOdf300(("3003").toCharArray());
								setPara1311300(("1311-GET-FROM-ONE-DAY-FILE  ").toCharArray());
								setPara131112300(("1311-12-CHECK-TABLE-LIMIT ").toCharArray());
								setPara131111300(("1311-11-CHECK-ONEDAY-REC-LEN").toCharArray());
								setCheckCount400(0);
								setRowsLoaded400(0);
								setRowCount400(0);
								setStartPoint400(1);
								setIp02014TblOverflowErr600(" MORE THAN 9999 ENTRIES FOUND IN TABLE 201                     ".toCharArray());
								setTable201AbsentInOdf610(("NO TABLE IP0201T1 RECORDS FOUND IN ONE-DAY-FILE ").toCharArray());
								setPtrIp299010800(("IP299010").toCharArray());
								setPtrIp650010800(("IP650010").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setAbendPtr800(("IP610010").toCharArray());
								setClearingDtTm800(fillSpace(10));
								setLastKeyDtTm800(fillSpace(10));
								setRecordLength800(0);
								setRemainder800(0);
								setRowCount800(0);
								setRowLength800(0);
								setAstriskLine900(("***********************************").toCharArray());
								setAbendAbend900(("A B E N D   A B E N D   A B E N D  ").toCharArray());
								setAbendAbendPgm900(("A B E N D   I P 2 8 2 2 1 0        ").toCharArray());
    }


 

	/**
	 *	Returns the value of ip02014wEntries
	 *	@return ip02014wEntries
	 */
	public short getIp02014wEntries() throws CFException {
   		return ip02014wEntries;
	}
	
	/**
	 * 	Update Ip02014wEntries with the passed value
	 *  Corresponding COBOL Variable is IP02014W-ENTRIES
	 *	@param number
	 */
	public void setIp02014wEntries(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip02014wEntries = checkIp02014wEntriesMaxLimit(number); 
	}

	public void setIp02014wEntries(int number) {
	    number = checkIp02014wEntriesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp02014wEntries((short)number);
	}
	public void setIp02014wEntries(long number) {
	    number = checkIp02014wEntriesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp02014wEntries((short)number);
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
	 *	Returns the value of areLpaRecOver100
	 *	@return areLpaRecOver100
	 */
   public char[] getAreLpaRecOver100() throws CFException{
   		return areLpaRecOver100;
   }

  
	/**
	*  set variable areLpaRecOver100
	*  Corresponding COBOL Variable is 100-ARE-LPA-REC-OVER
	*  @param value
	**/
   public void setAreLpaRecOver100(char[] value) {
       value = checkAreLpaRecOver100Constraints(value);
       arraycopy(value,0,areLpaRecOver100,0,value.length);
   } 
	public void setAreLpaRecOver100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,areLpaRecOver100,0,beginIndex + endIndex);
   }
	char[] lpaRecOver8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isLpaRecOver88100()
	 *	@return  Returns true if isLpaRecOver88100() is "Y"
	 */
   public boolean isLpaRecOver88100() throws CFException {
      return (  compareChars( getAreLpaRecOver100() , lpaRecOver8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setLpaRecOver88100True() {  			
    	setAreLpaRecOver100( lpaRecOver8810088Value);
   	}
	char[] lpaRecNotOver8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isLpaRecNotOver88100()
	 *	@return  Returns true if isLpaRecNotOver88100() is "N"
	 */
   public boolean isLpaRecNotOver88100() throws CFException {
      return (  compareChars( getAreLpaRecOver100() , lpaRecNotOver8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setLpaRecNotOver88100True() {  			
    	setAreLpaRecOver100( lpaRecNotOver8810088Value);
   	}
	/**
	 *	Returns the value of keyEntryFound100
	 *	@return keyEntryFound100
	 */
   public char[] getKeyEntryFound100() throws CFException{
   		return keyEntryFound100;
   }

  
	/**
	*  set variable keyEntryFound100
	*  Corresponding COBOL Variable is 100-KEY-ENTRY-FOUND
	*  @param value
	**/
   public void setKeyEntryFound100(char[] value) {
       value = checkKeyEntryFound100Constraints(value);
       arraycopy(value,0,keyEntryFound100,0,value.length);
   } 
	public void setKeyEntryFound100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,keyEntryFound100,0,beginIndex + endIndex);
   }
	char[] entryFoundN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isEntryFoundN88100()
	 *	@return  Returns true if isEntryFoundN88100() is "N"
	 */
   public boolean isEntryFoundN88100() throws CFException {
      return (  compareChars( getKeyEntryFound100() , entryFoundN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setEntryFoundN88100True() {  			
    	setKeyEntryFound100( entryFoundN8810088Value);
   	}
	char[] entryFoundY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEntryFoundY88100()
	 *	@return  Returns true if isEntryFoundY88100() is "Y"
	 */
   public boolean isEntryFoundY88100() throws CFException {
      return (  compareChars( getKeyEntryFound100() , entryFoundY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEntryFoundY88100True() {  			
    	setKeyEntryFound100( entryFoundY8810088Value);
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
	 *	Returns the value of lpaLoader300
	 *	@return lpaLoader300
	 */
   public char[] getLpaLoader300() throws CFException{
   		return lpaLoader300;
   }

  
	/**
	*  set variable lpaLoader300
	*  Corresponding COBOL Variable is 300-LPA-LOADER
	*  @param value
	**/
   public void setLpaLoader300(char[] value) {
       value = checkLpaLoader300Constraints(value);
       arraycopy(value,0,lpaLoader300,0,value.length);
   } 
	public void setLpaLoader300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lpaLoader300,0,beginIndex + endIndex);
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
	 *	Returns the value of tableName300
	 *	@return tableName300
	 */
   public char[] getTableName300() throws CFException{
   		return tableName300;
   }

  
	/**
	*  set variable tableName300
	*  Corresponding COBOL Variable is 300-TABLE-NAME
	*  @param value
	**/
   public void setTableName300(char[] value) {
       value = checkTableName300Constraints(value);
       arraycopy(value,0,tableName300,0,value.length);
   } 
	public void setTableName300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableName300,0,beginIndex + endIndex);
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
	 *	Returns the value of noTable201InOdf300
	 *	@return noTable201InOdf300
	 */
   public char[] getNoTable201InOdf300() throws CFException{
   		return noTable201InOdf300;
   }

  
	/**
	*  set variable noTable201InOdf300
	*  Corresponding COBOL Variable is 300-NO-TABLE201-IN-ODF
	*  @param value
	**/
   public void setNoTable201InOdf300(char[] value) {
       value = checkNoTable201InOdf300Constraints(value);
       arraycopy(value,0,noTable201InOdf300,0,value.length);
   } 
	public void setNoTable201InOdf300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noTable201InOdf300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para1311300
	 *	@return para1311300
	 */
   public char[] getPara1311300() throws CFException{
   		return para1311300;
   }

  
	/**
	*  set variable para1311300
	*  Corresponding COBOL Variable is 300-PARA-1311
	*  @param value
	**/
   public void setPara1311300(char[] value) {
       value = checkPara1311300Constraints(value);
       arraycopy(value,0,para1311300,0,value.length);
   } 
	public void setPara1311300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1311300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para131112300
	 *	@return para131112300
	 */
   public char[] getPara131112300() throws CFException{
   		return para131112300;
   }

  
	/**
	*  set variable para131112300
	*  Corresponding COBOL Variable is 300-PARA-1311-12
	*  @param value
	**/
   public void setPara131112300(char[] value) {
       value = checkPara131112300Constraints(value);
       arraycopy(value,0,para131112300,0,value.length);
   } 
	public void setPara131112300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para131112300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para131111300
	 *	@return para131111300
	 */
   public char[] getPara131111300() throws CFException{
   		return para131111300;
   }

  
	/**
	*  set variable para131111300
	*  Corresponding COBOL Variable is 300-PARA-1311-11
	*  @param value
	**/
   public void setPara131111300(char[] value) {
       value = checkPara131111300Constraints(value);
       arraycopy(value,0,para131111300,0,value.length);
   } 
	public void setPara131111300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para131111300,0,beginIndex + endIndex);
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
	 *	Returns the value of rowsLoaded400
	 *	@return rowsLoaded400
	 */
	public int getRowsLoaded400() throws CFException {
   		return rowsLoaded400;
	}
	
	/**
	 * 	Update RowsLoaded400 with the passed value
	 *  Corresponding COBOL Variable is 400-ROWS-LOADED
	 *	@param number
	 */
	public void setRowsLoaded400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowsLoaded400 = checkRowsLoaded400MaxLimit(number); 
	}


	public void setRowsLoaded400(long number) {
	    number = checkRowsLoaded400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowsLoaded400((int)number);
	}
	
	/**
	 *	Returns the value of rowCount400
	 *	@return rowCount400
	 */
	public int getRowCount400() throws CFException {
   		return rowCount400;
	}
	
	/**
	 * 	Update RowCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-ROW-COUNT
	 *	@param number
	 */
	public void setRowCount400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowCount400 = checkRowCount400MaxLimit(number); 
	}


	public void setRowCount400(long number) {
	    number = checkRowCount400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowCount400((int)number);
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
	 *	Returns the value of ip02014TblOverflowErr600
	 *	@return ip02014TblOverflowErr600
	 */
   public char[] getIp02014TblOverflowErr600() throws CFException{
   		return ip02014TblOverflowErr600;
   }

  
	/**
	*  set variable ip02014TblOverflowErr600
	*  Corresponding COBOL Variable is 600-IP02014-TBL-OVERFLOW-ERR
	*  @param value
	**/
   public void setIp02014TblOverflowErr600(char[] value) {
       value = checkIp02014TblOverflowErr600Constraints(value);
       arraycopy(value,0,ip02014TblOverflowErr600,0,value.length);
   } 
	public void setIp02014TblOverflowErr600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip02014TblOverflowErr600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of table201AbsentInOdf610
	 *	@return table201AbsentInOdf610
	 */
   public char[] getTable201AbsentInOdf610() throws CFException{
   		return table201AbsentInOdf610;
   }

  
	/**
	*  set variable table201AbsentInOdf610
	*  Corresponding COBOL Variable is 610-TABLE-201-ABSENT-IN-ODF
	*  @param value
	**/
   public void setTable201AbsentInOdf610(char[] value) {
       value = checkTable201AbsentInOdf610Constraints(value);
       arraycopy(value,0,table201AbsentInOdf610,0,value.length);
   } 
	public void setTable201AbsentInOdf610(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,table201AbsentInOdf610,0,beginIndex + endIndex);
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
	 *	Returns the value of lastKeyDtTm800
	 *	@return lastKeyDtTm800
	 */
   public char[] getLastKeyDtTm800() throws CFException{
   		return lastKeyDtTm800;
   }

  
	/**
	*  set variable lastKeyDtTm800
	*  Corresponding COBOL Variable is 800-LAST-KEY-DT-TM
	*  @param value
	**/
   public void setLastKeyDtTm800(char[] value) {
       value = checkLastKeyDtTm800Constraints(value);
       arraycopy(value,0,lastKeyDtTm800,0,value.length);
   } 
	public void setLastKeyDtTm800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lastKeyDtTm800,0,beginIndex + endIndex);
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
  
