package com.cloudframe.app.ip606130.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private short ip00002Table0EntriesMax;

								private short ip00002Table0Entries;

						private char[] isItFirstTime100 = new char[1];

						private char[] isItFirstRead100 = new char[1];

						private char[] isDfltAgrmntTobeBuild100 = new char[1];

						private char[] writeTheRecord100 = new char[1];

						private char[] inputFileSw100 = new char[1];

						private char[] sortInpEof100 = new char[1];

						private char[] inputFileStatus200 = new char[2];

						private char[] tmp90FileStatus200 = new char[2];

						private char[] tmp91FileStatus200 = new char[2];

						private char[] outputFileStatus200 = new char[2];

						private char[] pgmName300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] pgmIp670010300 = new char[8];

						private char[] tableIp0036t1300 = new char[8];

						private char[] tableIp0040t1300 = new char[8];

						private char[] tableIp0041t1300 = new char[8];

						private char[] tableIp0090t1300 = new char[8];

						private char[] tableIp0091t1300 = new char[8];

						private char[] tableIp9000t1300 = new char[8];

						private char[] trailerRecord300 = new char[10];

						private char[] updateHdrRec300 = new char[10];

						private char[] replacmntHdrRec300 = new char[10];

						private char[] finalTrailer300 = new char[8];

								private int valueOne300;

								private int value11300;

						private char[] sys001File300 = new char[21];

						private char[] sys105File300 = new char[21];

						private char[] sys106File300 = new char[21];

						private char[] sys200File300 = new char[21];

						private char[] para1200300 = new char[30];

						private char[] para1300300 = new char[30];

						private char[] para2220300 = new char[30];

						private char[] para2210300 = new char[30];

						private char[] para2231300 = new char[30];

						private char[] para224110300 = new char[30];

						private char[] para8300300 = new char[30];

						private char[] para8350300 = new char[30];

						private char[] para8400300 = new char[30];

						private char[] para8500300 = new char[30];

						private char[] para8600300 = new char[30];

						private char[] para8700300 = new char[30];

						private char[] para7500300 = new char[30];

						private char[] para7600300 = new char[30];

						private char[] para8100300 = new char[30];

						private char[] para8200300 = new char[30];

						private char[] para8250300 = new char[30];

						private char[] para3000300 = new char[30];

						private char[] para8000300 = new char[30];

						private char[] openSys001File300 = new char[4];

						private char[] openSys105File300 = new char[4];

						private char[] openSys106File300 = new char[4];

						private char[] openSys200File300 = new char[4];

						private char[] readSys105File300 = new char[4];

						private char[] writeSys200File300 = new char[4];

						private char[] writeSys105File300 = new char[4];

						private char[] writeSys106File300 = new char[4];

						private char[] closeSys001File300 = new char[4];

						private char[] closeSys105File300 = new char[4];

						private char[] closeSys106File300 = new char[4];

						private char[] closeSys200File300 = new char[4];

						private char[] onedayFileEmpty300 = new char[4];

						private char[] tableZeroOverflow300 = new char[4];

						private char[] tblSubIdNotFound300 = new char[4];

						private char[] hdrMissingAbendCode300 = new char[4];

						private char[] invalidDate300 = new char[4];

								private long recsWritten400;

								private long recsRead400;

								private long holdRecsRead400;

								private long sub400;

								private long sub1400;

								private int regionMax400;

								private long table36BslSub400;

								private long bsl1BuildCounter40090;

								private long bsl2BuildCounter40090;

								private long bsl1BuildCounter40091;

								private long bsl2BuildCounter40091;

								private long defaultsBuild400;

								private long recordsCount400;

								private long finalRecords400;

								private long noOfSortedRecs400;

						private char[] ip6063007600 = new char[33];

						private char[] headerRecordMissing600 = new char[65];

						private char[] space600 = new char[19];

						private char[] statsMessage600 = new char[50];

								private long sortRdw;

								private long sys001RdwIn800;

								private long sys200RdwOut800;

								private long tempTbl90Rdw800;

								private long tempTbl91Rdw800;

								private long expandedLength800;

								private long dataLength800;

								private int table40Length800;

								private long table90KeyLngth800;

								private long table91KeyLngth800;

						private char[] tblIp9000t1SubId800 = new char[3];

						private char[] ptrIp670010800 = new char[8];

						private char[] displayAbendMsgTxt900 = new char[480];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp00002Table0EntriesMax((short)999);
								setIp00002Table0Entries((short)0);
								setIsItFirstTime100(("Y").toCharArray());
								setIsItFirstRead100(("Y").toCharArray());
								setIsDfltAgrmntTobeBuild100(("N").toCharArray());
								setWriteTheRecord100(("Y").toCharArray());
								setInputFileSw100(("N").toCharArray());
								setSortInpEof100(("Y").toCharArray());
								setInputFileStatus200(fillSpace(2));
								setTmp90FileStatus200(fillSpace(2));
								setTmp91FileStatus200(fillSpace(2));
								setOutputFileStatus200(fillSpace(2));
								setPgmName300(("IP606130").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xB4,(byte)0xCB,(byte)0x01,(byte)0x46,(byte)0xF7,(byte)0x00}).toCharArray());
								setPgmIp670010300(("IP670010").toCharArray());
								setTableIp0036t1300(("IP0036T1").toCharArray());
								setTableIp0040t1300(("IP0040T1").toCharArray());
								setTableIp0041t1300(("IP0041T1").toCharArray());
								setTableIp0090t1300(("IP0090T1").toCharArray());
								setTableIp0091t1300(("IP0091T1").toCharArray());
								setTableIp9000t1300(("IP9000T1").toCharArray());
								setTrailerRecord300(("TRAILER RE").toCharArray());
								setUpdateHdrRec300(("UPDATE FIL").toCharArray());
								setReplacmntHdrRec300(("REPLACEMEN").toCharArray());
								setFinalTrailer300(("TABLEZZZ").toCharArray());
								setValueOne300(1);
								setValue11300(11);
								setSys001File300(("REDUCED PARM MASTER  ").toCharArray());
								setSys105File300(("SYS105 TEMP90 FILE   ").toCharArray());
								setSys106File300(("SYS106 TEMP91 FILE   ").toCharArray());
								setSys200File300(("EXPANDED PARM MASTER ").toCharArray());
								setPara1200300(("1200-FILE-OPEN-PROCESS        ").toCharArray());
								setPara1300300(("1300-CHECK-FOR-HEADERS        ").toCharArray());
								setPara2220300(("2220-DATE-CONVERSION          ").toCharArray());
								setPara2210300(("2210-LOAD-TABLE0-RECORDS      ").toCharArray());
								setPara2231300(("2231-DISPLAY-MISSING-MSG      ").toCharArray());
								setPara224110300(("2241-10-OPEN-TEMP-FILES       ").toCharArray());
								setPara8300300(("8300-CLOSE-SYS001             ").toCharArray());
								setPara8350300(("8350-OPEN-INPUT-SYS001        ").toCharArray());
								setPara8400300(("8400-CLOSE-TEMP90-FILE        ").toCharArray());
								setPara8500300(("8500-CLOSE-TEMP91-FILE        ").toCharArray());
								setPara8600300(("8600-OPEN-TEMP90-FILE         ").toCharArray());
								setPara8700300(("8700-OPEN-TEMP91-FILE         ").toCharArray());
								setPara7500300(("7500-READ-TEMP90-FILE         ").toCharArray());
								setPara7600300(("7600-READ-TEMP91-FILE         ").toCharArray());
								setPara8100300(("8100-WRITE-90-DFLT-TO-TEMP    ").toCharArray());
								setPara8200300(("8200-WRITE-EXPANDED-RECORD    ").toCharArray());
								setPara8250300(("8250-WRITE-91-DFLT-TO-TEMP    ").toCharArray());
								setPara3000300(("3000-END-OF-JOB               ").toCharArray());
								setPara8000300(("8000-READ-INPUT-FILE          ").toCharArray());
								setOpenSys001File300(("3001").toCharArray());
								setOpenSys105File300(("3001").toCharArray());
								setOpenSys106File300(("3001").toCharArray());
								setOpenSys200File300(("3002").toCharArray());
								setReadSys105File300(("3003").toCharArray());
								setWriteSys200File300(("3004").toCharArray());
								setWriteSys105File300(("3004").toCharArray());
								setWriteSys106File300(("3004").toCharArray());
								setCloseSys001File300(("3005").toCharArray());
								setCloseSys105File300(("3005").toCharArray());
								setCloseSys106File300(("3005").toCharArray());
								setCloseSys200File300(("3006").toCharArray());
								setOnedayFileEmpty300(("3007").toCharArray());
								setTableZeroOverflow300(("3008").toCharArray());
								setTblSubIdNotFound300(("3009").toCharArray());
								setHdrMissingAbendCode300(("3010").toCharArray());
								setInvalidDate300(("3014").toCharArray());
								setRecsWritten400(0L);
								setRecsRead400(0L);
								setHoldRecsRead400(0L);
								setSub400(0L);
								setSub1400(0L);
								setRegionMax400(6);
								setTable36BslSub400(0L);
								setBsl1BuildCounter40090(0L);
								setBsl2BuildCounter40090(0L);
								setBsl1BuildCounter40091(0L);
								setBsl2BuildCounter40091(0L);
								setDefaultsBuild400(0L);
								setRecordsCount400(0L);
								setFinalRecords400(0L);
								setNoOfSortedRecs400(0L);
								setIp6063007600((" INPUT  FILE CONTAINS NO RECORDS.").toCharArray());
								setHeaderRecordMissing600(" HEADER MISSING FOR UPDATE/REPLACEMENT FILE - INVALID INPUT FILE.".toCharArray());
								setSpace600(fillSpace(19));
								setStatsMessage600(("=======STATS FOR DEFAULT AGREEMENT RECORDS======= ").toCharArray());
								setSortRdw(0L);
								setSys001RdwIn800(0L);
								setSys200RdwOut800(0L);
								setTempTbl90Rdw800(0L);
								setTempTbl91Rdw800(0L);
								setExpandedLength800(0L);
								setDataLength800(0L);
								setTable40Length800(0);
								setTable90KeyLngth800(0L);
								setTable91KeyLngth800(0L);
								setTblIp9000t1SubId800(fillSpace(3));
								setPtrIp670010800(("IP670010").toCharArray());
								setDisplayAbendMsgTxt900("************************************************************************************************************************ABEND                  ABEND                    ABEND                                                                   A B E N D          I P 6 0 6 1 3 0                                                                                      ************************************************************************************************************************".toCharArray());
    }


 

	/**
	 *	Returns the value of ip00002Table0EntriesMax
	 *	@return ip00002Table0EntriesMax
	 */
	public short getIp00002Table0EntriesMax() throws CFException {
   		return ip00002Table0EntriesMax;
	}
	
	/**
	 * 	Update Ip00002Table0EntriesMax with the passed value
	 *  Corresponding COBOL Variable is IP00002-TABLE-0-ENTRIES-MAX
	 *	@param number
	 */
	public void setIp00002Table0EntriesMax(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00002Table0EntriesMax = checkIp00002Table0EntriesMaxMaxLimit(number); 
	}

	public void setIp00002Table0EntriesMax(int number) {
	    number = checkIp00002Table0EntriesMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00002Table0EntriesMax((short)number);
	}
	public void setIp00002Table0EntriesMax(long number) {
	    number = checkIp00002Table0EntriesMaxMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00002Table0EntriesMax((short)number);
	}
	

	/**
	 *	Returns the value of ip00002Table0Entries
	 *	@return ip00002Table0Entries
	 */
	public short getIp00002Table0Entries() throws CFException {
   		return ip00002Table0Entries;
	}
	
	/**
	 * 	Update Ip00002Table0Entries with the passed value
	 *  Corresponding COBOL Variable is IP00002-TABLE-0-ENTRIES
	 *	@param number
	 */
	public void setIp00002Table0Entries(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip00002Table0Entries = checkIp00002Table0EntriesMaxLimit(number); 
	}

	public void setIp00002Table0Entries(int number) {
	    number = checkIp00002Table0EntriesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00002Table0Entries((short)number);
	}
	public void setIp00002Table0Entries(long number) {
	    number = checkIp00002Table0EntriesMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp00002Table0Entries((short)number);
	}
	

	/**
	 *	Returns the value of isItFirstTime100
	 *	@return isItFirstTime100
	 */
   public char[] getIsItFirstTime100() throws CFException{
   		return isItFirstTime100;
   }

  
	/**
	*  set variable isItFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-FIRST-TIME
	*  @param value
	**/
   public void setIsItFirstTime100(char[] value) {
       value = checkIsItFirstTime100Constraints(value);
       arraycopy(value,0,isItFirstTime100,0,value.length);
   } 
	public void setIsItFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstTime88100()
	 *	@return  Returns true if isItIsFirstTime88100() is "Y"
	 */
   public boolean isItIsFirstTime88100() throws CFException {
      return (  compareChars( getIsItFirstTime100() , itIsFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstTime88100True() {  			
    	setIsItFirstTime100( itIsFirstTime8810088Value);
   	}
	char[] itIsNotFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88100()
	 *	@return  Returns true if isItIsNotFirstTime88100() is "N"
	 */
   public boolean isItIsNotFirstTime88100() throws CFException {
      return (  compareChars( getIsItFirstTime100() , itIsNotFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88100True() {  			
    	setIsItFirstTime100( itIsNotFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of isItFirstRead100
	 *	@return isItFirstRead100
	 */
   public char[] getIsItFirstRead100() throws CFException{
   		return isItFirstRead100;
   }

  
	/**
	*  set variable isItFirstRead100
	*  Corresponding COBOL Variable is 100-IS-IT-FIRST-READ
	*  @param value
	**/
   public void setIsItFirstRead100(char[] value) {
       value = checkIsItFirstRead100Constraints(value);
       arraycopy(value,0,isItFirstRead100,0,value.length);
   } 
	public void setIsItFirstRead100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItFirstRead100,0,beginIndex + endIndex);
   }
	char[] itIsFirstRead8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsFirstRead88100()
	 *	@return  Returns true if isItIsFirstRead88100() is "Y"
	 */
   public boolean isItIsFirstRead88100() throws CFException {
      return (  compareChars( getIsItFirstRead100() , itIsFirstRead8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsFirstRead88100True() {  			
    	setIsItFirstRead100( itIsFirstRead8810088Value);
   	}
	char[] itIsNotFirstRead8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstRead88100()
	 *	@return  Returns true if isItIsNotFirstRead88100() is "N"
	 */
   public boolean isItIsNotFirstRead88100() throws CFException {
      return (  compareChars( getIsItFirstRead100() , itIsNotFirstRead8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstRead88100True() {  			
    	setIsItFirstRead100( itIsNotFirstRead8810088Value);
   	}
	/**
	 *	Returns the value of isDfltAgrmntTobeBuild100
	 *	@return isDfltAgrmntTobeBuild100
	 */
   public char[] getIsDfltAgrmntTobeBuild100() throws CFException{
   		return isDfltAgrmntTobeBuild100;
   }

  
	/**
	*  set variable isDfltAgrmntTobeBuild100
	*  Corresponding COBOL Variable is 100-IS-DFLT-AGRMNT-TOBE-BUILD
	*  @param value
	**/
   public void setIsDfltAgrmntTobeBuild100(char[] value) {
       value = checkIsDfltAgrmntTobeBuild100Constraints(value);
       arraycopy(value,0,isDfltAgrmntTobeBuild100,0,value.length);
   } 
	public void setIsDfltAgrmntTobeBuild100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isDfltAgrmntTobeBuild100,0,beginIndex + endIndex);
   }
	char[] buildDfltAgrmnt8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isBuildDfltAgrmnt88100()
	 *	@return  Returns true if isBuildDfltAgrmnt88100() is "Y"
	 */
   public boolean isBuildDfltAgrmnt88100() throws CFException {
      return (  compareChars( getIsDfltAgrmntTobeBuild100() , buildDfltAgrmnt8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setBuildDfltAgrmnt88100True() {  			
    	setIsDfltAgrmntTobeBuild100( buildDfltAgrmnt8810088Value);
   	}
	char[] notBuildDfltAgrmnt8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotBuildDfltAgrmnt88100()
	 *	@return  Returns true if isNotBuildDfltAgrmnt88100() is "N"
	 */
   public boolean isNotBuildDfltAgrmnt88100() throws CFException {
      return (  compareChars( getIsDfltAgrmntTobeBuild100() , notBuildDfltAgrmnt8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotBuildDfltAgrmnt88100True() {  			
    	setIsDfltAgrmntTobeBuild100( notBuildDfltAgrmnt8810088Value);
   	}
	/**
	 *	Returns the value of writeTheRecord100
	 *	@return writeTheRecord100
	 */
   public char[] getWriteTheRecord100() throws CFException{
   		return writeTheRecord100;
   }

  
	/**
	*  set variable writeTheRecord100
	*  Corresponding COBOL Variable is 100-WRITE-THE-RECORD
	*  @param value
	**/
   public void setWriteTheRecord100(char[] value) {
       value = checkWriteTheRecord100Constraints(value);
       arraycopy(value,0,writeTheRecord100,0,value.length);
   } 
	public void setWriteTheRecord100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,writeTheRecord100,0,beginIndex + endIndex);
   }
	char[] write8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isWrite88100()
	 *	@return  Returns true if isWrite88100() is "Y"
	 */
   public boolean isWrite88100() throws CFException {
      return (  compareChars( getWriteTheRecord100() , write8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setWrite88100True() {  			
    	setWriteTheRecord100( write8810088Value);
   	}
	char[] doNotWrite8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDoNotWrite88100()
	 *	@return  Returns true if isDoNotWrite88100() is "N"
	 */
   public boolean isDoNotWrite88100() throws CFException {
      return (  compareChars( getWriteTheRecord100() , doNotWrite8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDoNotWrite88100True() {  			
    	setWriteTheRecord100( doNotWrite8810088Value);
   	}
	/**
	 *	Returns the value of inputFileSw100
	 *	@return inputFileSw100
	 */
   public char[] getInputFileSw100() throws CFException{
   		return inputFileSw100;
   }

  
	/**
	*  set variable inputFileSw100
	*  Corresponding COBOL Variable is 100-INPUT-FILE-SW
	*  @param value
	**/
   public void setInputFileSw100(char[] value) {
       value = checkInputFileSw100Constraints(value);
       arraycopy(value,0,inputFileSw100,0,value.length);
   } 
	public void setInputFileSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inputFileSw100,0,beginIndex + endIndex);
   }
	char[] inputFileDone8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isInputFileDone88100()
	 *	@return  Returns true if isInputFileDone88100() is "Y"
	 */
   public boolean isInputFileDone88100() throws CFException {
      return (  compareChars( getInputFileSw100() , inputFileDone8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setInputFileDone88100True() {  			
    	setInputFileSw100( inputFileDone8810088Value);
   	}
	/**
	 *	Returns the value of sortInpEof100
	 *	@return sortInpEof100
	 */
   public char[] getSortInpEof100() throws CFException{
   		return sortInpEof100;
   }

  
	/**
	*  set variable sortInpEof100
	*  Corresponding COBOL Variable is 100-SORT-INP-EOF
	*  @param value
	**/
   public void setSortInpEof100(char[] value) {
       value = checkSortInpEof100Constraints(value);
       arraycopy(value,0,sortInpEof100,0,value.length);
   } 
	public void setSortInpEof100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sortInpEof100,0,beginIndex + endIndex);
   }
	char[] sortEofN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSortEofN88100()
	 *	@return  Returns true if isSortEofN88100() is "N"
	 */
   public boolean isSortEofN88100() throws CFException {
      return (  compareChars( getSortInpEof100() , sortEofN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSortEofN88100True() {  			
    	setSortInpEof100( sortEofN8810088Value);
   	}
	char[] sortEofY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSortEofY88100()
	 *	@return  Returns true if isSortEofY88100() is "Y"
	 */
   public boolean isSortEofY88100() throws CFException {
      return (  compareChars( getSortInpEof100() , sortEofY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSortEofY88100True() {  			
    	setSortInpEof100( sortEofY8810088Value);
   	}
	/**
	 *	Returns the value of inputFileStatus200
	 *	@return inputFileStatus200
	 */
   public char[] getInputFileStatus200() throws CFException{
   		return inputFileStatus200;
   }

  
	/**
	*  set variable inputFileStatus200
	*  Corresponding COBOL Variable is 200-INPUT-FILE-STATUS
	*  @param value
	**/
   public void setInputFileStatus200(char[] value) {
       value = checkInputFileStatus200Constraints(value);
       arraycopy(value,0,inputFileStatus200,0,value.length);
   } 
	public void setInputFileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,inputFileStatus200,0,beginIndex + endIndex);
   }
	char[] sys001StatusGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys001StatusGood88200()
	 *	@return  Returns true if isSys001StatusGood88200() is "00"
	 */
   public boolean isSys001StatusGood88200() throws CFException {
      return (  compareChars( getInputFileStatus200() , sys001StatusGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys001StatusGood88200True() {  			
    	setInputFileStatus200( sys001StatusGood8820088Value);
   	}
	char[] sys001StatusEof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys001StatusEof88200()
	 *	@return  Returns true if isSys001StatusEof88200() is "10"
	 */
   public boolean isSys001StatusEof88200() throws CFException {
      return (  compareChars( getInputFileStatus200() , sys001StatusEof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys001StatusEof88200True() {  			
    	setInputFileStatus200( sys001StatusEof8820088Value);
   	}
	/**
	 *	Returns the value of tmp90FileStatus200
	 *	@return tmp90FileStatus200
	 */
   public char[] getTmp90FileStatus200() throws CFException{
   		return tmp90FileStatus200;
   }

  
	/**
	*  set variable tmp90FileStatus200
	*  Corresponding COBOL Variable is 200-TMP90-FILE-STATUS
	*  @param value
	**/
   public void setTmp90FileStatus200(char[] value) {
       value = checkTmp90FileStatus200Constraints(value);
       arraycopy(value,0,tmp90FileStatus200,0,value.length);
   } 
	public void setTmp90FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmp90FileStatus200,0,beginIndex + endIndex);
   }
	char[] temp90StatusGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isTemp90StatusGood88200()
	 *	@return  Returns true if isTemp90StatusGood88200() is "00"
	 */
   public boolean isTemp90StatusGood88200() throws CFException {
      return (  compareChars( getTmp90FileStatus200() , temp90StatusGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setTemp90StatusGood88200True() {  			
    	setTmp90FileStatus200( temp90StatusGood8820088Value);
   	}
	char[] temp90StatusEof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isTemp90StatusEof88200()
	 *	@return  Returns true if isTemp90StatusEof88200() is "10"
	 */
   public boolean isTemp90StatusEof88200() throws CFException {
      return (  compareChars( getTmp90FileStatus200() , temp90StatusEof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setTemp90StatusEof88200True() {  			
    	setTmp90FileStatus200( temp90StatusEof8820088Value);
   	}
	/**
	 *	Returns the value of tmp91FileStatus200
	 *	@return tmp91FileStatus200
	 */
   public char[] getTmp91FileStatus200() throws CFException{
   		return tmp91FileStatus200;
   }

  
	/**
	*  set variable tmp91FileStatus200
	*  Corresponding COBOL Variable is 200-TMP91-FILE-STATUS
	*  @param value
	**/
   public void setTmp91FileStatus200(char[] value) {
       value = checkTmp91FileStatus200Constraints(value);
       arraycopy(value,0,tmp91FileStatus200,0,value.length);
   } 
	public void setTmp91FileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tmp91FileStatus200,0,beginIndex + endIndex);
   }
	char[] temp91StatusGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isTemp91StatusGood88200()
	 *	@return  Returns true if isTemp91StatusGood88200() is "00"
	 */
   public boolean isTemp91StatusGood88200() throws CFException {
      return (  compareChars( getTmp91FileStatus200() , temp91StatusGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setTemp91StatusGood88200True() {  			
    	setTmp91FileStatus200( temp91StatusGood8820088Value);
   	}
	char[] temp91StatusEof8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isTemp91StatusEof88200()
	 *	@return  Returns true if isTemp91StatusEof88200() is "10"
	 */
   public boolean isTemp91StatusEof88200() throws CFException {
      return (  compareChars( getTmp91FileStatus200() , temp91StatusEof8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setTemp91StatusEof88200True() {  			
    	setTmp91FileStatus200( temp91StatusEof8820088Value);
   	}
	/**
	 *	Returns the value of outputFileStatus200
	 *	@return outputFileStatus200
	 */
   public char[] getOutputFileStatus200() throws CFException{
   		return outputFileStatus200;
   }

  
	/**
	*  set variable outputFileStatus200
	*  Corresponding COBOL Variable is 200-OUTPUT-FILE-STATUS
	*  @param value
	**/
   public void setOutputFileStatus200(char[] value) {
       value = checkOutputFileStatus200Constraints(value);
       arraycopy(value,0,outputFileStatus200,0,value.length);
   } 
	public void setOutputFileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,outputFileStatus200,0,beginIndex + endIndex);
   }
	char[] sys200StatusGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys200StatusGood88200()
	 *	@return  Returns true if isSys200StatusGood88200() is "00"
	 */
   public boolean isSys200StatusGood88200() throws CFException {
      return (  compareChars( getOutputFileStatus200() , sys200StatusGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys200StatusGood88200True() {  			
    	setOutputFileStatus200( sys200StatusGood8820088Value);
   	}
	/**
	 *	Returns the value of pgmName300
	 *	@return pgmName300
	 */
   public char[] getPgmName300() throws CFException{
   		return pgmName300;
   }

  
	/**
	*  set variable pgmName300
	*  Corresponding COBOL Variable is 300-PGM-NAME
	*  @param value
	**/
   public void setPgmName300(char[] value) {
       value = checkPgmName300Constraints(value);
       arraycopy(value,0,pgmName300,0,value.length);
   } 
	public void setPgmName300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmName300,0,beginIndex + endIndex);
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
	 *	Returns the value of pgmIp670010300
	 *	@return pgmIp670010300
	 */
   public char[] getPgmIp670010300() throws CFException{
   		return pgmIp670010300;
   }

  
	/**
	*  set variable pgmIp670010300
	*  Corresponding COBOL Variable is 300-PGM-IP670010
	*  @param value
	**/
   public void setPgmIp670010300(char[] value) {
       value = checkPgmIp670010300Constraints(value);
       arraycopy(value,0,pgmIp670010300,0,value.length);
   } 
	public void setPgmIp670010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp670010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableIp0036t1300
	 *	@return tableIp0036t1300
	 */
   public char[] getTableIp0036t1300() throws CFException{
   		return tableIp0036t1300;
   }

  
	/**
	*  set variable tableIp0036t1300
	*  Corresponding COBOL Variable is 300-TABLE-IP0036T1
	*  @param value
	**/
   public void setTableIp0036t1300(char[] value) {
       value = checkTableIp0036t1300Constraints(value);
       arraycopy(value,0,tableIp0036t1300,0,value.length);
   } 
	public void setTableIp0036t1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableIp0036t1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableIp0040t1300
	 *	@return tableIp0040t1300
	 */
   public char[] getTableIp0040t1300() throws CFException{
   		return tableIp0040t1300;
   }

  
	/**
	*  set variable tableIp0040t1300
	*  Corresponding COBOL Variable is 300-TABLE-IP0040T1
	*  @param value
	**/
   public void setTableIp0040t1300(char[] value) {
       value = checkTableIp0040t1300Constraints(value);
       arraycopy(value,0,tableIp0040t1300,0,value.length);
   } 
	public void setTableIp0040t1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableIp0040t1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableIp0041t1300
	 *	@return tableIp0041t1300
	 */
   public char[] getTableIp0041t1300() throws CFException{
   		return tableIp0041t1300;
   }

  
	/**
	*  set variable tableIp0041t1300
	*  Corresponding COBOL Variable is 300-TABLE-IP0041T1
	*  @param value
	**/
   public void setTableIp0041t1300(char[] value) {
       value = checkTableIp0041t1300Constraints(value);
       arraycopy(value,0,tableIp0041t1300,0,value.length);
   } 
	public void setTableIp0041t1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableIp0041t1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableIp0090t1300
	 *	@return tableIp0090t1300
	 */
   public char[] getTableIp0090t1300() throws CFException{
   		return tableIp0090t1300;
   }

  
	/**
	*  set variable tableIp0090t1300
	*  Corresponding COBOL Variable is 300-TABLE-IP0090T1
	*  @param value
	**/
   public void setTableIp0090t1300(char[] value) {
       value = checkTableIp0090t1300Constraints(value);
       arraycopy(value,0,tableIp0090t1300,0,value.length);
   } 
	public void setTableIp0090t1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableIp0090t1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableIp0091t1300
	 *	@return tableIp0091t1300
	 */
   public char[] getTableIp0091t1300() throws CFException{
   		return tableIp0091t1300;
   }

  
	/**
	*  set variable tableIp0091t1300
	*  Corresponding COBOL Variable is 300-TABLE-IP0091T1
	*  @param value
	**/
   public void setTableIp0091t1300(char[] value) {
       value = checkTableIp0091t1300Constraints(value);
       arraycopy(value,0,tableIp0091t1300,0,value.length);
   } 
	public void setTableIp0091t1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableIp0091t1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableIp9000t1300
	 *	@return tableIp9000t1300
	 */
   public char[] getTableIp9000t1300() throws CFException{
   		return tableIp9000t1300;
   }

  
	/**
	*  set variable tableIp9000t1300
	*  Corresponding COBOL Variable is 300-TABLE-IP9000T1
	*  @param value
	**/
   public void setTableIp9000t1300(char[] value) {
       value = checkTableIp9000t1300Constraints(value);
       arraycopy(value,0,tableIp9000t1300,0,value.length);
   } 
	public void setTableIp9000t1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableIp9000t1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of trailerRecord300
	 *	@return trailerRecord300
	 */
   public char[] getTrailerRecord300() throws CFException{
   		return trailerRecord300;
   }

  
	/**
	*  set variable trailerRecord300
	*  Corresponding COBOL Variable is 300-TRAILER-RECORD
	*  @param value
	**/
   public void setTrailerRecord300(char[] value) {
       value = checkTrailerRecord300Constraints(value);
       arraycopy(value,0,trailerRecord300,0,value.length);
   } 
	public void setTrailerRecord300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,trailerRecord300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of updateHdrRec300
	 *	@return updateHdrRec300
	 */
   public char[] getUpdateHdrRec300() throws CFException{
   		return updateHdrRec300;
   }

  
	/**
	*  set variable updateHdrRec300
	*  Corresponding COBOL Variable is 300-UPDATE-HDR-REC
	*  @param value
	**/
   public void setUpdateHdrRec300(char[] value) {
       value = checkUpdateHdrRec300Constraints(value);
       arraycopy(value,0,updateHdrRec300,0,value.length);
   } 
	public void setUpdateHdrRec300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,updateHdrRec300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of replacmntHdrRec300
	 *	@return replacmntHdrRec300
	 */
   public char[] getReplacmntHdrRec300() throws CFException{
   		return replacmntHdrRec300;
   }

  
	/**
	*  set variable replacmntHdrRec300
	*  Corresponding COBOL Variable is 300-REPLACMNT-HDR-REC
	*  @param value
	**/
   public void setReplacmntHdrRec300(char[] value) {
       value = checkReplacmntHdrRec300Constraints(value);
       arraycopy(value,0,replacmntHdrRec300,0,value.length);
   } 
	public void setReplacmntHdrRec300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,replacmntHdrRec300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of finalTrailer300
	 *	@return finalTrailer300
	 */
   public char[] getFinalTrailer300() throws CFException{
   		return finalTrailer300;
   }

  
	/**
	*  set variable finalTrailer300
	*  Corresponding COBOL Variable is 300-FINAL-TRAILER
	*  @param value
	**/
   public void setFinalTrailer300(char[] value) {
       value = checkFinalTrailer300Constraints(value);
       arraycopy(value,0,finalTrailer300,0,value.length);
   } 
	public void setFinalTrailer300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,finalTrailer300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueOne300
	 *	@return valueOne300
	 */
	public int getValueOne300() throws CFException {
       if (isValueOne300Modified()) { 
           valueOne300 = refreshValueOne300();
        }
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
		serializeValueOne300(valueOne300);
	}
	

	public void setValueOne300(long number) {
	    number = checkValueOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValueOne300((int)number);
	}
	
	/**
	 * 	Update ValueOne300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValueOne300(char[] value) throws CFException {
		 valueOne300 = serializeValueOne300(value);
	}
	/**
	 * 	Update ValueOne300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValueOne300String(char[] value) throws CFException {
		 setValueOne300(value);
	}
	/**
	 *	Returns the value of value11300
	 *	@return value11300
	 */
	public int getValue11300() throws CFException {
       if (isValue11300Modified()) { 
           value11300 = refreshValue11300();
        }
   		return value11300;
	}
	

	
	   
	/**
	 * 	Update Value11300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-11
	 *	@param number
	 */
	public void setValue11300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value11300 = checkValue11300MaxLimit(number); 
		serializeValue11300(value11300);
	}
	

	public void setValue11300(long number) {
	    number = checkValue11300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue11300((int)number);
	}
	
	/**
	 * 	Update Value11300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue11300(char[] value) throws CFException {
		 value11300 = serializeValue11300(value);
	}
	/**
	 * 	Update Value11300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue11300String(char[] value) throws CFException {
		 setValue11300(value);
	}
	/**
	 *	Returns the value of sys001File300
	 *	@return sys001File300
	 */
   public char[] getSys001File300() throws CFException{
   		return sys001File300;
   }

  
	/**
	*  set variable sys001File300
	*  Corresponding COBOL Variable is 300-SYS001-FILE
	*  @param value
	**/
   public void setSys001File300(char[] value) {
       value = checkSys001File300Constraints(value);
       arraycopy(value,0,sys001File300,0,value.length);
   } 
	public void setSys001File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys105File300
	 *	@return sys105File300
	 */
   public char[] getSys105File300() throws CFException{
   		return sys105File300;
   }

  
	/**
	*  set variable sys105File300
	*  Corresponding COBOL Variable is 300-SYS105-FILE
	*  @param value
	**/
   public void setSys105File300(char[] value) {
       value = checkSys105File300Constraints(value);
       arraycopy(value,0,sys105File300,0,value.length);
   } 
	public void setSys105File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys105File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys106File300
	 *	@return sys106File300
	 */
   public char[] getSys106File300() throws CFException{
   		return sys106File300;
   }

  
	/**
	*  set variable sys106File300
	*  Corresponding COBOL Variable is 300-SYS106-FILE
	*  @param value
	**/
   public void setSys106File300(char[] value) {
       value = checkSys106File300Constraints(value);
       arraycopy(value,0,sys106File300,0,value.length);
   } 
	public void setSys106File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys106File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys200File300
	 *	@return sys200File300
	 */
   public char[] getSys200File300() throws CFException{
   		return sys200File300;
   }

  
	/**
	*  set variable sys200File300
	*  Corresponding COBOL Variable is 300-SYS200-FILE
	*  @param value
	**/
   public void setSys200File300(char[] value) {
       value = checkSys200File300Constraints(value);
       arraycopy(value,0,sys200File300,0,value.length);
   } 
	public void setSys200File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys200File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para1200300
	 *	@return para1200300
	 */
   public char[] getPara1200300() throws CFException{
   		return para1200300;
   }

  
	/**
	*  set variable para1200300
	*  Corresponding COBOL Variable is 300-PARA-1200
	*  @param value
	**/
   public void setPara1200300(char[] value) {
       value = checkPara1200300Constraints(value);
       arraycopy(value,0,para1200300,0,value.length);
   } 
	public void setPara1200300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1200300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para1300300
	 *	@return para1300300
	 */
   public char[] getPara1300300() throws CFException{
   		return para1300300;
   }

  
	/**
	*  set variable para1300300
	*  Corresponding COBOL Variable is 300-PARA-1300
	*  @param value
	**/
   public void setPara1300300(char[] value) {
       value = checkPara1300300Constraints(value);
       arraycopy(value,0,para1300300,0,value.length);
   } 
	public void setPara1300300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1300300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para2220300
	 *	@return para2220300
	 */
   public char[] getPara2220300() throws CFException{
   		return para2220300;
   }

  
	/**
	*  set variable para2220300
	*  Corresponding COBOL Variable is 300-PARA-2220
	*  @param value
	**/
   public void setPara2220300(char[] value) {
       value = checkPara2220300Constraints(value);
       arraycopy(value,0,para2220300,0,value.length);
   } 
	public void setPara2220300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2220300,0,beginIndex + endIndex);
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
	 *	Returns the value of para2231300
	 *	@return para2231300
	 */
   public char[] getPara2231300() throws CFException{
   		return para2231300;
   }

  
	/**
	*  set variable para2231300
	*  Corresponding COBOL Variable is 300-PARA-2231
	*  @param value
	**/
   public void setPara2231300(char[] value) {
       value = checkPara2231300Constraints(value);
       arraycopy(value,0,para2231300,0,value.length);
   } 
	public void setPara2231300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2231300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para224110300
	 *	@return para224110300
	 */
   public char[] getPara224110300() throws CFException{
   		return para224110300;
   }

  
	/**
	*  set variable para224110300
	*  Corresponding COBOL Variable is 300-PARA-2241-10
	*  @param value
	**/
   public void setPara224110300(char[] value) {
       value = checkPara224110300Constraints(value);
       arraycopy(value,0,para224110300,0,value.length);
   } 
	public void setPara224110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para224110300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8300300
	 *	@return para8300300
	 */
   public char[] getPara8300300() throws CFException{
   		return para8300300;
   }

  
	/**
	*  set variable para8300300
	*  Corresponding COBOL Variable is 300-PARA-8300
	*  @param value
	**/
   public void setPara8300300(char[] value) {
       value = checkPara8300300Constraints(value);
       arraycopy(value,0,para8300300,0,value.length);
   } 
	public void setPara8300300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8300300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8350300
	 *	@return para8350300
	 */
   public char[] getPara8350300() throws CFException{
   		return para8350300;
   }

  
	/**
	*  set variable para8350300
	*  Corresponding COBOL Variable is 300-PARA-8350
	*  @param value
	**/
   public void setPara8350300(char[] value) {
       value = checkPara8350300Constraints(value);
       arraycopy(value,0,para8350300,0,value.length);
   } 
	public void setPara8350300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8350300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8400300
	 *	@return para8400300
	 */
   public char[] getPara8400300() throws CFException{
   		return para8400300;
   }

  
	/**
	*  set variable para8400300
	*  Corresponding COBOL Variable is 300-PARA-8400
	*  @param value
	**/
   public void setPara8400300(char[] value) {
       value = checkPara8400300Constraints(value);
       arraycopy(value,0,para8400300,0,value.length);
   } 
	public void setPara8400300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8400300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8500300
	 *	@return para8500300
	 */
   public char[] getPara8500300() throws CFException{
   		return para8500300;
   }

  
	/**
	*  set variable para8500300
	*  Corresponding COBOL Variable is 300-PARA-8500
	*  @param value
	**/
   public void setPara8500300(char[] value) {
       value = checkPara8500300Constraints(value);
       arraycopy(value,0,para8500300,0,value.length);
   } 
	public void setPara8500300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8500300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8600300
	 *	@return para8600300
	 */
   public char[] getPara8600300() throws CFException{
   		return para8600300;
   }

  
	/**
	*  set variable para8600300
	*  Corresponding COBOL Variable is 300-PARA-8600
	*  @param value
	**/
   public void setPara8600300(char[] value) {
       value = checkPara8600300Constraints(value);
       arraycopy(value,0,para8600300,0,value.length);
   } 
	public void setPara8600300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8600300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8700300
	 *	@return para8700300
	 */
   public char[] getPara8700300() throws CFException{
   		return para8700300;
   }

  
	/**
	*  set variable para8700300
	*  Corresponding COBOL Variable is 300-PARA-8700
	*  @param value
	**/
   public void setPara8700300(char[] value) {
       value = checkPara8700300Constraints(value);
       arraycopy(value,0,para8700300,0,value.length);
   } 
	public void setPara8700300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8700300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para7500300
	 *	@return para7500300
	 */
   public char[] getPara7500300() throws CFException{
   		return para7500300;
   }

  
	/**
	*  set variable para7500300
	*  Corresponding COBOL Variable is 300-PARA-7500
	*  @param value
	**/
   public void setPara7500300(char[] value) {
       value = checkPara7500300Constraints(value);
       arraycopy(value,0,para7500300,0,value.length);
   } 
	public void setPara7500300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para7500300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para7600300
	 *	@return para7600300
	 */
   public char[] getPara7600300() throws CFException{
   		return para7600300;
   }

  
	/**
	*  set variable para7600300
	*  Corresponding COBOL Variable is 300-PARA-7600
	*  @param value
	**/
   public void setPara7600300(char[] value) {
       value = checkPara7600300Constraints(value);
       arraycopy(value,0,para7600300,0,value.length);
   } 
	public void setPara7600300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para7600300,0,beginIndex + endIndex);
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
	 *	Returns the value of para8250300
	 *	@return para8250300
	 */
   public char[] getPara8250300() throws CFException{
   		return para8250300;
   }

  
	/**
	*  set variable para8250300
	*  Corresponding COBOL Variable is 300-PARA-8250
	*  @param value
	**/
   public void setPara8250300(char[] value) {
       value = checkPara8250300Constraints(value);
       arraycopy(value,0,para8250300,0,value.length);
   } 
	public void setPara8250300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8250300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para3000300
	 *	@return para3000300
	 */
   public char[] getPara3000300() throws CFException{
   		return para3000300;
   }

  
	/**
	*  set variable para3000300
	*  Corresponding COBOL Variable is 300-PARA-3000
	*  @param value
	**/
   public void setPara3000300(char[] value) {
       value = checkPara3000300Constraints(value);
       arraycopy(value,0,para3000300,0,value.length);
   } 
	public void setPara3000300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para3000300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8000300
	 *	@return para8000300
	 */
   public char[] getPara8000300() throws CFException{
   		return para8000300;
   }

  
	/**
	*  set variable para8000300
	*  Corresponding COBOL Variable is 300-PARA-8000
	*  @param value
	**/
   public void setPara8000300(char[] value) {
       value = checkPara8000300Constraints(value);
       arraycopy(value,0,para8000300,0,value.length);
   } 
	public void setPara8000300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8000300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of openSys001File300
	 *	@return openSys001File300
	 */
   public char[] getOpenSys001File300() throws CFException{
   		return openSys001File300;
   }

  
	/**
	*  set variable openSys001File300
	*  Corresponding COBOL Variable is 300-OPEN-SYS001-FILE
	*  @param value
	**/
   public void setOpenSys001File300(char[] value) {
       value = checkOpenSys001File300Constraints(value);
       arraycopy(value,0,openSys001File300,0,value.length);
   } 
	public void setOpenSys001File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,openSys001File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of openSys105File300
	 *	@return openSys105File300
	 */
   public char[] getOpenSys105File300() throws CFException{
   		return openSys105File300;
   }

  
	/**
	*  set variable openSys105File300
	*  Corresponding COBOL Variable is 300-OPEN-SYS105-FILE
	*  @param value
	**/
   public void setOpenSys105File300(char[] value) {
       value = checkOpenSys105File300Constraints(value);
       arraycopy(value,0,openSys105File300,0,value.length);
   } 
	public void setOpenSys105File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,openSys105File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of openSys106File300
	 *	@return openSys106File300
	 */
   public char[] getOpenSys106File300() throws CFException{
   		return openSys106File300;
   }

  
	/**
	*  set variable openSys106File300
	*  Corresponding COBOL Variable is 300-OPEN-SYS106-FILE
	*  @param value
	**/
   public void setOpenSys106File300(char[] value) {
       value = checkOpenSys106File300Constraints(value);
       arraycopy(value,0,openSys106File300,0,value.length);
   } 
	public void setOpenSys106File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,openSys106File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of openSys200File300
	 *	@return openSys200File300
	 */
   public char[] getOpenSys200File300() throws CFException{
   		return openSys200File300;
   }

  
	/**
	*  set variable openSys200File300
	*  Corresponding COBOL Variable is 300-OPEN-SYS200-FILE
	*  @param value
	**/
   public void setOpenSys200File300(char[] value) {
       value = checkOpenSys200File300Constraints(value);
       arraycopy(value,0,openSys200File300,0,value.length);
   } 
	public void setOpenSys200File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,openSys200File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of readSys105File300
	 *	@return readSys105File300
	 */
   public char[] getReadSys105File300() throws CFException{
   		return readSys105File300;
   }

  
	/**
	*  set variable readSys105File300
	*  Corresponding COBOL Variable is 300-READ-SYS105-FILE
	*  @param value
	**/
   public void setReadSys105File300(char[] value) {
       value = checkReadSys105File300Constraints(value);
       arraycopy(value,0,readSys105File300,0,value.length);
   } 
	public void setReadSys105File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,readSys105File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of writeSys200File300
	 *	@return writeSys200File300
	 */
   public char[] getWriteSys200File300() throws CFException{
   		return writeSys200File300;
   }

  
	/**
	*  set variable writeSys200File300
	*  Corresponding COBOL Variable is 300-WRITE-SYS200-FILE
	*  @param value
	**/
   public void setWriteSys200File300(char[] value) {
       value = checkWriteSys200File300Constraints(value);
       arraycopy(value,0,writeSys200File300,0,value.length);
   } 
	public void setWriteSys200File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,writeSys200File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of writeSys105File300
	 *	@return writeSys105File300
	 */
   public char[] getWriteSys105File300() throws CFException{
   		return writeSys105File300;
   }

  
	/**
	*  set variable writeSys105File300
	*  Corresponding COBOL Variable is 300-WRITE-SYS105-FILE
	*  @param value
	**/
   public void setWriteSys105File300(char[] value) {
       value = checkWriteSys105File300Constraints(value);
       arraycopy(value,0,writeSys105File300,0,value.length);
   } 
	public void setWriteSys105File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,writeSys105File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of writeSys106File300
	 *	@return writeSys106File300
	 */
   public char[] getWriteSys106File300() throws CFException{
   		return writeSys106File300;
   }

  
	/**
	*  set variable writeSys106File300
	*  Corresponding COBOL Variable is 300-WRITE-SYS106-FILE
	*  @param value
	**/
   public void setWriteSys106File300(char[] value) {
       value = checkWriteSys106File300Constraints(value);
       arraycopy(value,0,writeSys106File300,0,value.length);
   } 
	public void setWriteSys106File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,writeSys106File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of closeSys001File300
	 *	@return closeSys001File300
	 */
   public char[] getCloseSys001File300() throws CFException{
   		return closeSys001File300;
   }

  
	/**
	*  set variable closeSys001File300
	*  Corresponding COBOL Variable is 300-CLOSE-SYS001-FILE
	*  @param value
	**/
   public void setCloseSys001File300(char[] value) {
       value = checkCloseSys001File300Constraints(value);
       arraycopy(value,0,closeSys001File300,0,value.length);
   } 
	public void setCloseSys001File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,closeSys001File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of closeSys105File300
	 *	@return closeSys105File300
	 */
   public char[] getCloseSys105File300() throws CFException{
   		return closeSys105File300;
   }

  
	/**
	*  set variable closeSys105File300
	*  Corresponding COBOL Variable is 300-CLOSE-SYS105-FILE
	*  @param value
	**/
   public void setCloseSys105File300(char[] value) {
       value = checkCloseSys105File300Constraints(value);
       arraycopy(value,0,closeSys105File300,0,value.length);
   } 
	public void setCloseSys105File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,closeSys105File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of closeSys106File300
	 *	@return closeSys106File300
	 */
   public char[] getCloseSys106File300() throws CFException{
   		return closeSys106File300;
   }

  
	/**
	*  set variable closeSys106File300
	*  Corresponding COBOL Variable is 300-CLOSE-SYS106-FILE
	*  @param value
	**/
   public void setCloseSys106File300(char[] value) {
       value = checkCloseSys106File300Constraints(value);
       arraycopy(value,0,closeSys106File300,0,value.length);
   } 
	public void setCloseSys106File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,closeSys106File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of closeSys200File300
	 *	@return closeSys200File300
	 */
   public char[] getCloseSys200File300() throws CFException{
   		return closeSys200File300;
   }

  
	/**
	*  set variable closeSys200File300
	*  Corresponding COBOL Variable is 300-CLOSE-SYS200-FILE
	*  @param value
	**/
   public void setCloseSys200File300(char[] value) {
       value = checkCloseSys200File300Constraints(value);
       arraycopy(value,0,closeSys200File300,0,value.length);
   } 
	public void setCloseSys200File300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,closeSys200File300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of onedayFileEmpty300
	 *	@return onedayFileEmpty300
	 */
   public char[] getOnedayFileEmpty300() throws CFException{
   		return onedayFileEmpty300;
   }

  
	/**
	*  set variable onedayFileEmpty300
	*  Corresponding COBOL Variable is 300-ONEDAY-FILE-EMPTY
	*  @param value
	**/
   public void setOnedayFileEmpty300(char[] value) {
       value = checkOnedayFileEmpty300Constraints(value);
       arraycopy(value,0,onedayFileEmpty300,0,value.length);
   } 
	public void setOnedayFileEmpty300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,onedayFileEmpty300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tableZeroOverflow300
	 *	@return tableZeroOverflow300
	 */
   public char[] getTableZeroOverflow300() throws CFException{
   		return tableZeroOverflow300;
   }

  
	/**
	*  set variable tableZeroOverflow300
	*  Corresponding COBOL Variable is 300-TABLE-ZERO-OVERFLOW
	*  @param value
	**/
   public void setTableZeroOverflow300(char[] value) {
       value = checkTableZeroOverflow300Constraints(value);
       arraycopy(value,0,tableZeroOverflow300,0,value.length);
   } 
	public void setTableZeroOverflow300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tableZeroOverflow300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tblSubIdNotFound300
	 *	@return tblSubIdNotFound300
	 */
   public char[] getTblSubIdNotFound300() throws CFException{
   		return tblSubIdNotFound300;
   }

  
	/**
	*  set variable tblSubIdNotFound300
	*  Corresponding COBOL Variable is 300-TBL-SUB-ID-NOT-FOUND
	*  @param value
	**/
   public void setTblSubIdNotFound300(char[] value) {
       value = checkTblSubIdNotFound300Constraints(value);
       arraycopy(value,0,tblSubIdNotFound300,0,value.length);
   } 
	public void setTblSubIdNotFound300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblSubIdNotFound300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of hdrMissingAbendCode300
	 *	@return hdrMissingAbendCode300
	 */
   public char[] getHdrMissingAbendCode300() throws CFException{
   		return hdrMissingAbendCode300;
   }

  
	/**
	*  set variable hdrMissingAbendCode300
	*  Corresponding COBOL Variable is 300-HDR-MISSING-ABEND-CODE
	*  @param value
	**/
   public void setHdrMissingAbendCode300(char[] value) {
       value = checkHdrMissingAbendCode300Constraints(value);
       arraycopy(value,0,hdrMissingAbendCode300,0,value.length);
   } 
	public void setHdrMissingAbendCode300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,hdrMissingAbendCode300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of invalidDate300
	 *	@return invalidDate300
	 */
   public char[] getInvalidDate300() throws CFException{
   		return invalidDate300;
   }

  
	/**
	*  set variable invalidDate300
	*  Corresponding COBOL Variable is 300-INVALID-DATE
	*  @param value
	**/
   public void setInvalidDate300(char[] value) {
       value = checkInvalidDate300Constraints(value);
       arraycopy(value,0,invalidDate300,0,value.length);
   } 
	public void setInvalidDate300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,invalidDate300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of recsWritten400
	 *	@return recsWritten400
	 */
	public long getRecsWritten400() throws CFException {
   		return recsWritten400;
	}
	
	/**
	 * 	Update RecsWritten400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECS-WRITTEN
	 *	@param number
	 */
	public void setRecsWritten400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    recsWritten400 = checkRecsWritten400MaxLimit(number); 
	}


	/**
	 *	Returns the value of recsRead400
	 *	@return recsRead400
	 */
	public long getRecsRead400() throws CFException {
   		return recsRead400;
	}
	
	/**
	 * 	Update RecsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECS-READ
	 *	@param number
	 */
	public void setRecsRead400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    recsRead400 = checkRecsRead400MaxLimit(number); 
	}


	/**
	 *	Returns the value of holdRecsRead400
	 *	@return holdRecsRead400
	 */
	public long getHoldRecsRead400() throws CFException {
   		return holdRecsRead400;
	}
	
	/**
	 * 	Update HoldRecsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-HOLD-RECS-READ
	 *	@param number
	 */
	public void setHoldRecsRead400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    holdRecsRead400 = checkHoldRecsRead400MaxLimit(number); 
	}


	/**
	 *	Returns the value of sub400
	 *	@return sub400
	 */
	public long getSub400() throws CFException {
   		return sub400;
	}
	
	/**
	 * 	Update Sub400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUB
	 *	@param number
	 */
	public void setSub400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sub400 = checkSub400MaxLimit(number); 
	}


	/**
	 *	Returns the value of sub1400
	 *	@return sub1400
	 */
	public long getSub1400() throws CFException {
   		return sub1400;
	}
	
	/**
	 * 	Update Sub1400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUB1
	 *	@param number
	 */
	public void setSub1400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sub1400 = checkSub1400MaxLimit(number); 
	}


	/**
	 *	Returns the value of regionMax400
	 *	@return regionMax400
	 */
	public int getRegionMax400() throws CFException {
       if (isRegionMax400Modified()) { 
           regionMax400 = refreshRegionMax400();
        }
   		return regionMax400;
	}
	

	
	   
	/**
	 * 	Update RegionMax400 with the passed value
	 *  Corresponding COBOL Variable is 400-REGION-MAX
	 *	@param number
	 */
	public void setRegionMax400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    regionMax400 = checkRegionMax400MaxLimit(number); 
		serializeRegionMax400(regionMax400);
	}
	

	public void setRegionMax400(long number) {
	    number = checkRegionMax400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRegionMax400((int)number);
	}
	
	/**
	 * 	Update RegionMax400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRegionMax400(char[] value) throws CFException {
		 regionMax400 = serializeRegionMax400(value);
	}
	/**
	 * 	Update RegionMax400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRegionMax400String(char[] value) throws CFException {
		 setRegionMax400(value);
	}
	/**
	 *	Returns the value of table36BslSub400
	 *	@return table36BslSub400
	 */
	public long getTable36BslSub400() throws CFException {
       if (isTable36BslSub400Modified()) { 
           table36BslSub400 = refreshTable36BslSub400();
        }
   		return table36BslSub400;
	}
	

	
	   
	/**
	 * 	Update Table36BslSub400 with the passed value
	 *  Corresponding COBOL Variable is 400-TABLE36-BSL-SUB
	 *	@param number
	 */
	public void setTable36BslSub400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    table36BslSub400 = checkTable36BslSub400MaxLimit(number); 
		serializeTable36BslSub400(table36BslSub400);
	}
	

	/**
	 * 	Update Table36BslSub400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTable36BslSub400(char[] value) throws CFException {
		 table36BslSub400 = serializeTable36BslSub400(value);
	}
	/**
	 * 	Update Table36BslSub400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTable36BslSub400String(char[] value) throws CFException {
		 setTable36BslSub400(value);
	}
	/**
	 *	Returns the value of bsl1BuildCounter40090
	 *	@return bsl1BuildCounter40090
	 */
	public long getBsl1BuildCounter40090() throws CFException {
       if (isBsl1BuildCounter40090Modified()) { 
           bsl1BuildCounter40090 = refreshBsl1BuildCounter40090();
        }
   		return bsl1BuildCounter40090;
	}
	

	
	   
	/**
	 * 	Update Bsl1BuildCounter40090 with the passed value
	 *  Corresponding COBOL Variable is 400-90BSL-1-BUILD-COUNTER
	 *	@param number
	 */
	public void setBsl1BuildCounter40090(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bsl1BuildCounter40090 = checkBsl1BuildCounter40090MaxLimit(number); 
		serializeBsl1BuildCounter40090(bsl1BuildCounter40090);
	}
	

	/**
	 * 	Update Bsl1BuildCounter40090 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBsl1BuildCounter40090(char[] value) throws CFException {
		 bsl1BuildCounter40090 = serializeBsl1BuildCounter40090(value);
	}
	/**
	 * 	Update Bsl1BuildCounter40090 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBsl1BuildCounter40090String(char[] value) throws CFException {
		 setBsl1BuildCounter40090(value);
	}
	/**
	 *	Returns the value of bsl2BuildCounter40090
	 *	@return bsl2BuildCounter40090
	 */
	public long getBsl2BuildCounter40090() throws CFException {
       if (isBsl2BuildCounter40090Modified()) { 
           bsl2BuildCounter40090 = refreshBsl2BuildCounter40090();
        }
   		return bsl2BuildCounter40090;
	}
	

	
	   
	/**
	 * 	Update Bsl2BuildCounter40090 with the passed value
	 *  Corresponding COBOL Variable is 400-90BSL-2-BUILD-COUNTER
	 *	@param number
	 */
	public void setBsl2BuildCounter40090(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bsl2BuildCounter40090 = checkBsl2BuildCounter40090MaxLimit(number); 
		serializeBsl2BuildCounter40090(bsl2BuildCounter40090);
	}
	

	/**
	 * 	Update Bsl2BuildCounter40090 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBsl2BuildCounter40090(char[] value) throws CFException {
		 bsl2BuildCounter40090 = serializeBsl2BuildCounter40090(value);
	}
	/**
	 * 	Update Bsl2BuildCounter40090 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBsl2BuildCounter40090String(char[] value) throws CFException {
		 setBsl2BuildCounter40090(value);
	}
	/**
	 *	Returns the value of bsl1BuildCounter40091
	 *	@return bsl1BuildCounter40091
	 */
	public long getBsl1BuildCounter40091() throws CFException {
       if (isBsl1BuildCounter40091Modified()) { 
           bsl1BuildCounter40091 = refreshBsl1BuildCounter40091();
        }
   		return bsl1BuildCounter40091;
	}
	

	
	   
	/**
	 * 	Update Bsl1BuildCounter40091 with the passed value
	 *  Corresponding COBOL Variable is 400-91BSL-1-BUILD-COUNTER
	 *	@param number
	 */
	public void setBsl1BuildCounter40091(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bsl1BuildCounter40091 = checkBsl1BuildCounter40091MaxLimit(number); 
		serializeBsl1BuildCounter40091(bsl1BuildCounter40091);
	}
	

	/**
	 * 	Update Bsl1BuildCounter40091 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBsl1BuildCounter40091(char[] value) throws CFException {
		 bsl1BuildCounter40091 = serializeBsl1BuildCounter40091(value);
	}
	/**
	 * 	Update Bsl1BuildCounter40091 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBsl1BuildCounter40091String(char[] value) throws CFException {
		 setBsl1BuildCounter40091(value);
	}
	/**
	 *	Returns the value of bsl2BuildCounter40091
	 *	@return bsl2BuildCounter40091
	 */
	public long getBsl2BuildCounter40091() throws CFException {
       if (isBsl2BuildCounter40091Modified()) { 
           bsl2BuildCounter40091 = refreshBsl2BuildCounter40091();
        }
   		return bsl2BuildCounter40091;
	}
	

	
	   
	/**
	 * 	Update Bsl2BuildCounter40091 with the passed value
	 *  Corresponding COBOL Variable is 400-91BSL-2-BUILD-COUNTER
	 *	@param number
	 */
	public void setBsl2BuildCounter40091(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    bsl2BuildCounter40091 = checkBsl2BuildCounter40091MaxLimit(number); 
		serializeBsl2BuildCounter40091(bsl2BuildCounter40091);
	}
	

	/**
	 * 	Update Bsl2BuildCounter40091 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBsl2BuildCounter40091(char[] value) throws CFException {
		 bsl2BuildCounter40091 = serializeBsl2BuildCounter40091(value);
	}
	/**
	 * 	Update Bsl2BuildCounter40091 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBsl2BuildCounter40091String(char[] value) throws CFException {
		 setBsl2BuildCounter40091(value);
	}
	/**
	 *	Returns the value of defaultsBuild400
	 *	@return defaultsBuild400
	 */
	public long getDefaultsBuild400() throws CFException {
       if (isDefaultsBuild400Modified()) { 
           defaultsBuild400 = refreshDefaultsBuild400();
        }
   		return defaultsBuild400;
	}
	

	
	   
	/**
	 * 	Update DefaultsBuild400 with the passed value
	 *  Corresponding COBOL Variable is 400-DEFAULTS-BUILD
	 *	@param number
	 */
	public void setDefaultsBuild400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    defaultsBuild400 = checkDefaultsBuild400MaxLimit(number); 
		serializeDefaultsBuild400(defaultsBuild400);
	}
	

	/**
	 * 	Update DefaultsBuild400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDefaultsBuild400(char[] value) throws CFException {
		 defaultsBuild400 = serializeDefaultsBuild400(value);
	}
	/**
	 * 	Update DefaultsBuild400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDefaultsBuild400String(char[] value) throws CFException {
		 setDefaultsBuild400(value);
	}
	/**
	 *	Returns the value of recordsCount400
	 *	@return recordsCount400
	 */
	public long getRecordsCount400() throws CFException {
       if (isRecordsCount400Modified()) { 
           recordsCount400 = refreshRecordsCount400();
        }
   		return recordsCount400;
	}
	

	
	   
	/**
	 * 	Update RecordsCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-RECORDS-COUNT
	 *	@param number
	 */
	public void setRecordsCount400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    recordsCount400 = checkRecordsCount400MaxLimit(number); 
		serializeRecordsCount400(recordsCount400);
	}
	

	/**
	 * 	Update RecordsCount400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRecordsCount400(char[] value) throws CFException {
		 recordsCount400 = serializeRecordsCount400(value);
	}
	/**
	 * 	Update RecordsCount400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRecordsCount400String(char[] value) throws CFException {
		 setRecordsCount400(value);
	}
	/**
	 *	Returns the value of finalRecords400
	 *	@return finalRecords400
	 */
	public long getFinalRecords400() throws CFException {
       if (isFinalRecords400Modified()) { 
           finalRecords400 = refreshFinalRecords400();
        }
   		return finalRecords400;
	}
	

	
	   
	/**
	 * 	Update FinalRecords400 with the passed value
	 *  Corresponding COBOL Variable is 400-FINAL-RECORDS
	 *	@param number
	 */
	public void setFinalRecords400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    finalRecords400 = checkFinalRecords400MaxLimit(number); 
		serializeFinalRecords400(finalRecords400);
	}
	

	/**
	 * 	Update FinalRecords400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFinalRecords400(char[] value) throws CFException {
		 finalRecords400 = serializeFinalRecords400(value);
	}
	/**
	 * 	Update FinalRecords400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFinalRecords400String(char[] value) throws CFException {
		 setFinalRecords400(value);
	}
	/**
	 *	Returns the value of noOfSortedRecs400
	 *	@return noOfSortedRecs400
	 */
	public long getNoOfSortedRecs400() throws CFException {
       if (isNoOfSortedRecs400Modified()) { 
           noOfSortedRecs400 = refreshNoOfSortedRecs400();
        }
   		return noOfSortedRecs400;
	}
	

	
	   
	/**
	 * 	Update NoOfSortedRecs400 with the passed value
	 *  Corresponding COBOL Variable is 400-NO-OF-SORTED-RECS
	 *	@param number
	 */
	public void setNoOfSortedRecs400(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    noOfSortedRecs400 = checkNoOfSortedRecs400MaxLimit(number); 
		serializeNoOfSortedRecs400(noOfSortedRecs400);
	}
	

	/**
	 * 	Update NoOfSortedRecs400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNoOfSortedRecs400(char[] value) throws CFException {
		 noOfSortedRecs400 = serializeNoOfSortedRecs400(value);
	}
	/**
	 * 	Update NoOfSortedRecs400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNoOfSortedRecs400String(char[] value) throws CFException {
		 setNoOfSortedRecs400(value);
	}
	/**
	 *	Returns the value of ip6063007600
	 *	@return ip6063007600
	 */
   public char[] getIp6063007600() throws CFException{
   		return ip6063007600;
   }

  
	/**
	*  set variable ip6063007600
	*  Corresponding COBOL Variable is 600-IP606-3007
	*  @param value
	**/
   public void setIp6063007600(char[] value) {
       value = checkIp6063007600Constraints(value);
       arraycopy(value,0,ip6063007600,0,value.length);
   } 
	public void setIp6063007600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ip6063007600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerRecordMissing600
	 *	@return headerRecordMissing600
	 */
   public char[] getHeaderRecordMissing600() throws CFException{
   		return headerRecordMissing600;
   }

  
	/**
	*  set variable headerRecordMissing600
	*  Corresponding COBOL Variable is 600-HEADER-RECORD-MISSING
	*  @param value
	**/
   public void setHeaderRecordMissing600(char[] value) {
       value = checkHeaderRecordMissing600Constraints(value);
       arraycopy(value,0,headerRecordMissing600,0,value.length);
   } 
	public void setHeaderRecordMissing600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,headerRecordMissing600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of space600
	 *	@return space600
	 */
   public char[] getSpace600() throws CFException{
   		return space600;
   }

  
	/**
	*  set variable space600
	*  Corresponding COBOL Variable is 600-SPACE
	*  @param value
	**/
   public void setSpace600(char[] value) {
       value = checkSpace600Constraints(value);
       arraycopy(value,0,space600,0,value.length);
   } 
	public void setSpace600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,space600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of statsMessage600
	 *	@return statsMessage600
	 */
   public char[] getStatsMessage600() throws CFException{
   		return statsMessage600;
   }

  
	/**
	*  set variable statsMessage600
	*  Corresponding COBOL Variable is 600-STATS-MESSAGE
	*  @param value
	**/
   public void setStatsMessage600(char[] value) {
       value = checkStatsMessage600Constraints(value);
       arraycopy(value,0,statsMessage600,0,value.length);
   } 
	public void setStatsMessage600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,statsMessage600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sortRdw
	 *	@return sortRdw
	 */
	public long getSortRdw() throws CFException {
   		return sortRdw;
	}
	
	/**
	 * 	Update SortRdw with the passed value
	 *  Corresponding COBOL Variable is SORT-RDW
	 *	@param number
	 */
	public void setSortRdw(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sortRdw = checkSortRdwMaxLimit(number); 
	}


	/**
	 *	Returns the value of sys001RdwIn800
	 *	@return sys001RdwIn800
	 */
	public long getSys001RdwIn800() throws CFException {
   		return sys001RdwIn800;
	}
	
	/**
	 * 	Update Sys001RdwIn800 with the passed value
	 *  Corresponding COBOL Variable is 800-SYS001-RDW-IN
	 *	@param number
	 */
	public void setSys001RdwIn800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sys001RdwIn800 = checkSys001RdwIn800MaxLimit(number); 
	}


	/**
	 *	Returns the value of sys200RdwOut800
	 *	@return sys200RdwOut800
	 */
	public long getSys200RdwOut800() throws CFException {
   		return sys200RdwOut800;
	}
	
	/**
	 * 	Update Sys200RdwOut800 with the passed value
	 *  Corresponding COBOL Variable is 800-SYS200-RDW-OUT
	 *	@param number
	 */
	public void setSys200RdwOut800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    sys200RdwOut800 = checkSys200RdwOut800MaxLimit(number); 
	}


	/**
	 *	Returns the value of tempTbl90Rdw800
	 *	@return tempTbl90Rdw800
	 */
	public long getTempTbl90Rdw800() throws CFException {
   		return tempTbl90Rdw800;
	}
	
	/**
	 * 	Update TempTbl90Rdw800 with the passed value
	 *  Corresponding COBOL Variable is 800-TEMP-TBL90-RDW
	 *	@param number
	 */
	public void setTempTbl90Rdw800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tempTbl90Rdw800 = checkTempTbl90Rdw800MaxLimit(number); 
	}


	/**
	 *	Returns the value of tempTbl91Rdw800
	 *	@return tempTbl91Rdw800
	 */
	public long getTempTbl91Rdw800() throws CFException {
   		return tempTbl91Rdw800;
	}
	
	/**
	 * 	Update TempTbl91Rdw800 with the passed value
	 *  Corresponding COBOL Variable is 800-TEMP-TBL91-RDW
	 *	@param number
	 */
	public void setTempTbl91Rdw800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    tempTbl91Rdw800 = checkTempTbl91Rdw800MaxLimit(number); 
	}


	/**
	 *	Returns the value of expandedLength800
	 *	@return expandedLength800
	 */
	public long getExpandedLength800() throws CFException {
   		return expandedLength800;
	}
	
	/**
	 * 	Update ExpandedLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-EXPANDED-LENGTH
	 *	@param number
	 */
	public void setExpandedLength800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    expandedLength800 = checkExpandedLength800MaxLimit(number); 
	}


	/**
	 *	Returns the value of dataLength800
	 *	@return dataLength800
	 */
	public long getDataLength800() throws CFException {
   		return dataLength800;
	}
	
	/**
	 * 	Update DataLength800 with the passed value
	 *  Corresponding COBOL Variable is 800-DATA-LENGTH
	 *	@param number
	 */
	public void setDataLength800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    dataLength800 = checkDataLength800MaxLimit(number); 
	}


	/**
	 *	Returns the value of table40Length800
	 *	@return table40Length800
	 */
	public int getTable40Length800() throws CFException {
   		return table40Length800;
	}
	
	/**
	 * 	Update Table40Length800 with the passed value
	 *  Corresponding COBOL Variable is 800-TABLE-40-LENGTH
	 *	@param number
	 */
	public void setTable40Length800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    table40Length800 = checkTable40Length800MaxLimit(number); 
	}


	public void setTable40Length800(long number) {
	    number = checkTable40Length800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTable40Length800((int)number);
	}
	
	/**
	 *	Returns the value of table90KeyLngth800
	 *	@return table90KeyLngth800
	 */
	public long getTable90KeyLngth800() throws CFException {
   		return table90KeyLngth800;
	}
	
	/**
	 * 	Update Table90KeyLngth800 with the passed value
	 *  Corresponding COBOL Variable is 800-TABLE-90-KEY-LNGTH
	 *	@param number
	 */
	public void setTable90KeyLngth800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    table90KeyLngth800 = checkTable90KeyLngth800MaxLimit(number); 
	}


	/**
	 *	Returns the value of table91KeyLngth800
	 *	@return table91KeyLngth800
	 */
	public long getTable91KeyLngth800() throws CFException {
   		return table91KeyLngth800;
	}
	
	/**
	 * 	Update Table91KeyLngth800 with the passed value
	 *  Corresponding COBOL Variable is 800-TABLE-91-KEY-LNGTH
	 *	@param number
	 */
	public void setTable91KeyLngth800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    table91KeyLngth800 = checkTable91KeyLngth800MaxLimit(number); 
	}


	/**
	 *	Returns the value of tblIp9000t1SubId800
	 *	@return tblIp9000t1SubId800
	 */
   public char[] getTblIp9000t1SubId800() throws CFException{
   		return tblIp9000t1SubId800;
   }

  
	/**
	*  set variable tblIp9000t1SubId800
	*  Corresponding COBOL Variable is 800-TBL-IP9000T1-SUB-ID
	*  @param value
	**/
   public void setTblIp9000t1SubId800(char[] value) {
       value = checkTblIp9000t1SubId800Constraints(value);
       arraycopy(value,0,tblIp9000t1SubId800,0,value.length);
   } 
	public void setTblIp9000t1SubId800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblIp9000t1SubId800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp670010800
	 *	@return ptrIp670010800
	 */
   public char[] getPtrIp670010800() throws CFException{
   		return ptrIp670010800;
   }

  
	/**
	*  set variable ptrIp670010800
	*  Corresponding COBOL Variable is 800-PTR-IP670010
	*  @param value
	**/
   public void setPtrIp670010800(char[] value) {
       value = checkPtrIp670010800Constraints(value);
       arraycopy(value,0,ptrIp670010800,0,value.length);
   } 
	public void setPtrIp670010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp670010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of displayAbendMsgTxt900
	 *	@return displayAbendMsgTxt900
	 */
   public char[] getDisplayAbendMsgTxt900() throws CFException{
   		return displayAbendMsgTxt900;
   }

  
	/**
	*  set variable displayAbendMsgTxt900
	*  Corresponding COBOL Variable is 900-DISPLAY-ABEND-MSG-TXT
	*  @param value
	**/
   public void setDisplayAbendMsgTxt900(char[] value) {
       value = checkDisplayAbendMsgTxt900Constraints(value);
       arraycopy(value,0,displayAbendMsgTxt900,0,value.length);
   } 
	public void setDisplayAbendMsgTxt900(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,displayAbendMsgTxt900,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
