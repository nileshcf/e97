package com.cloudframe.app.sf311010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] parseSw100 = new char[1];

						private char[] centralSiteEofSw100 = new char[1];

						private char[] cycleId100 = new char[1];

						private char[] logClass100 = new char[1];

						private char[] logType100 = new char[1];

						private char[] messageType100 = new char[4];

						private char[] litA300 = new char[1];

						private char[] litB300 = new char[1];

						private char[] litC300 = new char[1];

						private char[] litN300 = new char[1];

						private char[] litY300 = new char[1];

						private char[] litIa300 = new char[2];

						private char[] lit01300 = new char[2];

						private char[] lit02300 = new char[2];

						private char[] lit03300 = new char[2];

						private char[] lit05300 = new char[2];

						private char[] lit06300 = new char[2];

						private char[] lit09300 = new char[2];

						private char[] lit10300 = new char[2];

						private char[] lit16300 = new char[2];

						private char[] lit30300 = new char[2];

						private char[] lit50300 = new char[2];

						private char[] lit51300 = new char[2];

						private char[] lit52300 = new char[2];

						private char[] lit82300 = new char[2];

						private char[] lit83300 = new char[2];

						private char[] lit85300 = new char[2];

						private char[] lit002300 = new char[3];

						private char[] lit0120300 = new char[4];

						private char[] lit0130300 = new char[4];

						private char[] lit0420300 = new char[4];

						private char[] lit0430300 = new char[4];

						private char[] lit380000300 = new char[6];

						private char[] doubleSpace300 = new char[1];

						private char[] tripleSpace300 = new char[1];

						private char[] newPage300 = new char[1];

								private short packedOne300;

								private int one300;

								private int two300;

								private int three300;

								private int four300;

								private int five300;

								private int six300;

								private int seven300;

								private int eight300;

								private int nine300;

								private int twelve300;

								private int max300;

								private int mti0110300;

								private int mti0100300;

						private char[] sf910020300 = new char[8];

						private char[] si994010300 = new char[8];

								private short binary61300;

								private short binary88300;

								private int maxLines400;

								private int pageCount400;

								private int lineCount400;

								private long totalRecs400;

								private long totalParseErrors400;

								private long totalIsoAuth400;

								private long totalIaDropped400;

								private long totalType2400;

								private long totalType3400;

								private long total0120Adv400;

								private long totalRevAdv400;

								private long totalVer2400;

								private long totalBadPan400;

								private long avs2RecCount400;

								private int se42Lnth400;

								private int se42Pos400;

								private int se33Pos400;

								private short se24Pos400;

								private short se66Pos400;

						private char[] de48Se42Sf2Sf3500 = Field.fillLowValue(4);

						private char[] de48Se89500 = Field.fillLowValue(1);

						private char[] de48Se33SfId500 = new char[2];

								private int de48Se33SfLen500;

								private int de48Se42SfLen500;

								private int de48Se42SfLen1500;

						private char[] de48Se66SfId500 = new char[2];

						private char[] de48Se24SfId500 = new char[2];

						private char[] billlogMsg1600 = new char[27];

						private char[] billlogMsg2600 = new char[7];

						private char[] billlogMsg3600 = new char[13];

						private char[] billlogMsg4600 = new char[9];

						private char[] voiceMsg600 = new char[39];

						private char[] parmsMsg600 = new char[36];

						private char[] cycleMsg600 = new char[38];

						private char[] mcwinMsg1600 = new char[30];

						private char[] mcwinMsg2600 = new char[15];

						private char[] eojMessage650 = new char[64];

								private int logLen800;

						private char[] mti800 = Field.fillLowValue(4);

								private int holdCurrCc800;

						private char[] obscureData800 = new char[100];

								private int obscurePos800;

								private int obscurePos2800;

								private int obscureStartPos800;

								private int obscureEndPos800;

								private int obscureLgth800;

								private int hour800;

								private int min800;

								private int sec800;

								private int isoBlResponse1800;

								private int isoBlResponse2800;

								private int isoBlDown1800;

								private int isoBlDown2800;

								private int isoBlMoto1800;

								private int mciwinReturnCode;

						private char[] mcwinProgram = new char[8];

						private char[] mciabendNodump = new char[1];

						private char[] seprPtrSi994020 = new char[8];

						private char[] seprCallSi994020 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setParseSw100(("N").toCharArray());
								setCentralSiteEofSw100(("N").toCharArray());
								setCycleId100(fillSpace(1));
								setLogClass100(fillSpace(1));
								setLogType100(fillSpace(1));
								setMessageType100(fillSpace(4));
								setLitA300(("A").toCharArray());
								setLitB300(("B").toCharArray());
								setLitC300(("C").toCharArray());
								setLitN300(("N").toCharArray());
								setLitY300(("Y").toCharArray());
								setLitIa300(("IA").toCharArray());
								setLit01300(("01").toCharArray());
								setLit02300(("02").toCharArray());
								setLit03300(("03").toCharArray());
								setLit05300(("05").toCharArray());
								setLit06300(("06").toCharArray());
								setLit09300(("09").toCharArray());
								setLit10300(("10").toCharArray());
								setLit16300(("16").toCharArray());
								setLit30300(("30").toCharArray());
								setLit50300(("50").toCharArray());
								setLit51300(("51").toCharArray());
								setLit52300(("52").toCharArray());
								setLit82300(("82").toCharArray());
								setLit83300(("83").toCharArray());
								setLit85300(("85").toCharArray());
								setLit002300(("002").toCharArray());
								setLit0120300(("0120").toCharArray());
								setLit0130300(("0130").toCharArray());
								setLit0420300(("0420").toCharArray());
								setLit0430300(("0430").toCharArray());
								setLit380000300(("380000").toCharArray());
								setDoubleSpace300(("0").toCharArray());
								setTripleSpace300(("-").toCharArray());
								setNewPage300(("1").toCharArray());
								setPackedOne300((short)1);
								setOne300(1);
								setTwo300(2);
								setThree300(3);
								setFour300(4);
								setFive300(5);
								setSix300(6);
								setSeven300(7);
								setEight300(8);
								setNine300(9);
								setTwelve300(12);
								setMax300(101);
								setMti0110300(110);
								setMti0100300(100);
								setSf910020300(("SF910020").toCharArray());
								setSi994010300(("SI994010").toCharArray());
								setBinary61300((short)61);
								setBinary88300((short)88);
								setMaxLines400(63);
								setPageCount400(0);
								setLineCount400(0);
								setTotalRecs400(0L);
								setTotalParseErrors400(0L);
								setTotalIsoAuth400(0L);
								setTotalIaDropped400(0L);
								setTotalType2400(0L);
								setTotalType3400(0L);
								setTotal0120Adv400(0L);
								setTotalRevAdv400(0L);
								setTotalVer2400(0L);
								setTotalBadPan400(0L);
								setAvs2RecCount400(0L);
								setSe42Lnth400(0);
								setSe42Pos400(0);
								setSe33Pos400(0);
								setSe24Pos400((short)0);
								setSe66Pos400((short)0);
								setDe48Se33SfId500(fillSpace(2));
								setDe48Se33SfLen500(0);
								setDe48Se42SfLen500(0);
								setDe48Se42SfLen1500(0);
								setDe48Se66SfId500(fillSpace(2));
								setDe48Se24SfId500(fillSpace(2));
								setBilllogMsg1600(("SI994010 RETURNED CODES OF:").toCharArray());
								setBilllogMsg2600(("CLASS =").toCharArray());
								setBilllogMsg3600(("RECORD TYPE =").toCharArray());
								setBilllogMsg4600(("BANKNET =").toCharArray());
								setVoiceMsg600(("INVALID PASSED VOICE ICA - DEFAULT USED").toCharArray());
								setParmsMsg600(("INVALID PASSED PARMS - DEFAULTS USED").toCharArray());
								setCycleMsg600(("INVALID PASSED CYCLE-ID - DEFAULT USED").toCharArray());
								setMcwinMsg1600(("SF311010 - MCIWIN CALL FAILED ").toCharArray());
								setMcwinMsg2600((" RETURN CODE = ").toCharArray());
								setEojMessage650(pad(64,"SF311010 PROGRAM PROCESSING COMPLETED".toCharArray(),' ',RIGHT_PAD));
								setHoldCurrCc800(0);
								setObscureData800(pad(100," ".toCharArray(),' ',RIGHT_PAD));
								setObscurePos800(0);
								setObscurePos2800(0);
								setObscureStartPos800(0);
								setObscureEndPos800(0);
								setObscureLgth800(0);
								setHour800(0);
								setMin800(0);
								setSec800(0);
								setIsoBlResponse1800(0);
								setIsoBlResponse2800(0);
								setIsoBlDown1800(0);
								setIsoBlDown2800(0);
								setMciwinReturnCode(0);
								setMcwinProgram(("MCWIN   ").toCharArray());
								setMciabendNodump(fillSpace(1));
								setSeprPtrSi994020(("SI994020").toCharArray());
								setSeprCallSi994020(("SI994020").toCharArray());
    }


 

	/**
	 *	Returns the value of parseSw100
	 *	@return parseSw100
	 */
   public char[] getParseSw100() throws CFException{
   		return parseSw100;
   }

  
	/**
	*  set variable parseSw100
	*  Corresponding COBOL Variable is 100-PARSE-SW
	*  @param value
	**/
   public void setParseSw100(char[] value) {
       value = checkParseSw100Constraints(value);
       arraycopy(value,0,parseSw100,0,value.length);
   } 
	public void setParseSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parseSw100,0,beginIndex + endIndex);
   }
	char[] parsed8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isParsed88100()
	 *	@return  Returns true if isParsed88100() is "Y"
	 */
   public boolean isParsed88100() throws CFException {
      return (  compareChars( getParseSw100() , parsed8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setParsed88100True() {  			
    	setParseSw100( parsed8810088Value);
   	}
	char[] notParsed8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotParsed88100()
	 *	@return  Returns true if isNotParsed88100() is "N"
	 */
   public boolean isNotParsed88100() throws CFException {
      return (  compareChars( getParseSw100() , notParsed8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotParsed88100True() {  			
    	setParseSw100( notParsed8810088Value);
   	}
	/**
	 *	Returns the value of centralSiteEofSw100
	 *	@return centralSiteEofSw100
	 */
   public char[] getCentralSiteEofSw100() throws CFException{
   		return centralSiteEofSw100;
   }

  
	/**
	*  set variable centralSiteEofSw100
	*  Corresponding COBOL Variable is 100-CENTRAL-SITE-EOF-SW
	*  @param value
	**/
   public void setCentralSiteEofSw100(char[] value) {
       value = checkCentralSiteEofSw100Constraints(value);
       arraycopy(value,0,centralSiteEofSw100,0,value.length);
   } 
	public void setCentralSiteEofSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,centralSiteEofSw100,0,beginIndex + endIndex);
   }
	char[] centralSiteEof8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isCentralSiteEof88100()
	 *	@return  Returns true if isCentralSiteEof88100() is "Y"
	 */
   public boolean isCentralSiteEof88100() throws CFException {
      return (  compareChars( getCentralSiteEofSw100() , centralSiteEof8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setCentralSiteEof88100True() {  			
    	setCentralSiteEofSw100( centralSiteEof8810088Value);
   	}
	char[] centralSiteNotEof8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isCentralSiteNotEof88100()
	 *	@return  Returns true if isCentralSiteNotEof88100() is "N"
	 */
   public boolean isCentralSiteNotEof88100() throws CFException {
      return (  compareChars( getCentralSiteEofSw100() , centralSiteNotEof8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setCentralSiteNotEof88100True() {  			
    	setCentralSiteEofSw100( centralSiteNotEof8810088Value);
   	}
	/**
	 *	Returns the value of cycleId100
	 *	@return cycleId100
	 */
   public char[] getCycleId100() throws CFException{
   		return cycleId100;
   }

  
	/**
	*  set variable cycleId100
	*  Corresponding COBOL Variable is 100-CYCLE-ID
	*  @param value
	**/
   public void setCycleId100(char[] value) {
       value = checkCycleId100Constraints(value);
       arraycopy(value,0,cycleId100,0,value.length);
   } 
	public void setCycleId100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cycleId100,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of logClass100
	 *	@return logClass100
	 */
   public char[] getLogClass100() throws CFException{
   		return logClass100;
   }

  
	/**
	*  set variable logClass100
	*  Corresponding COBOL Variable is 100-LOG-CLASS
	*  @param value
	**/
   public void setLogClass100(char[] value) {
       value = checkLogClass100Constraints(value);
       arraycopy(value,0,logClass100,0,value.length);
   } 
	public void setLogClass100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,logClass100,0,beginIndex + endIndex);
   }
	char[] logClassJ8810088Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isLogClassJ88100()
	 *	@return  Returns true if isLogClassJ88100() is "J"
	 */
   public boolean isLogClassJ88100() throws CFException {
      return (  compareChars( getLogClass100() , logClassJ8810088Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setLogClassJ88100True() {  			
    	setLogClass100( logClassJ8810088Value);
   	}
	/**
	 *	Returns the value of logType100
	 *	@return logType100
	 */
   public char[] getLogType100() throws CFException{
   		return logType100;
   }

  
	/**
	*  set variable logType100
	*  Corresponding COBOL Variable is 100-LOG-TYPE
	*  @param value
	**/
   public void setLogType100(char[] value) {
       value = checkLogType100Constraints(value);
       arraycopy(value,0,logType100,0,value.length);
   } 
	public void setLogType100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,logType100,0,beginIndex + endIndex);
   }
	char[] logType38810088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isLogType388100()
	 *	@return  Returns true if isLogType388100() is "3"
	 */
   public boolean isLogType388100() throws CFException {
      return (  compareChars( getLogType100() , logType38810088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setLogType388100True() {  			
    	setLogType100( logType38810088Value);
   	}
	char[] logType2A8810088Value1 = "2".toCharArray();
char[] logType2A8810088Value2 = "A".toCharArray();

	/**
	 *	Test condition "2" "A" for isLogType2A88100()
	 *	@return  Returns true if isLogType2A88100() is "2" "A"
	 */
   public boolean isLogType2A88100() throws CFException {
      return (  compareChars( getLogType100() , logType2A8810088Value1)  == 0  ||  compareChars( getLogType100() , logType2A8810088Value2)  == 0  );
   }


	/**
	*  set values "2" "A"
	*/
   	public void setLogType2A88100True() {  			
    	setLogType100( logType2A8810088Value1);
   	}
	char[] logType23A8810088Value1 = "2".toCharArray();
char[] logType23A8810088Value2 = "3".toCharArray();
char[] logType23A8810088Value3 = "A".toCharArray();

	/**
	 *	Test condition "2" "3" "A" for isLogType23A88100()
	 *	@return  Returns true if isLogType23A88100() is "2" "3" "A"
	 */
   public boolean isLogType23A88100() throws CFException {
      return (  compareChars( getLogType100() , logType23A8810088Value1)  == 0  ||  compareChars( getLogType100() , logType23A8810088Value2)  == 0  ||  compareChars( getLogType100() , logType23A8810088Value3)  == 0  );
   }


	/**
	*  set values "2" "3" "A"
	*/
   	public void setLogType23A88100True() {  			
    	setLogType100( logType23A8810088Value1);
   	}
	/**
	 *	Returns the value of messageType100
	 *	@return messageType100
	 */
   public char[] getMessageType100() throws CFException{
   		return messageType100;
   }

  
	/**
	*  set variable messageType100
	*  Corresponding COBOL Variable is 100-MESSAGE-TYPE
	*  @param value
	**/
   public void setMessageType100(char[] value) {
       value = checkMessageType100Constraints(value);
       arraycopy(value,0,messageType100,0,value.length);
   } 
	public void setMessageType100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,messageType100,0,beginIndex + endIndex);
   }
	char[] mti101108810088Value = "0110".toCharArray();
	/**
	 *	Test condition "0110" for isMti1011088100()
	 *	@return  Returns true if isMti1011088100() is "0110"
	 */
   public boolean isMti1011088100() throws CFException {
      return (  compareChars( getMessageType100() , mti101108810088Value)  == 0  );
   }


	/**
	*  set values "0110"
	*/
   	public void setMti1011088100True() {  			
    	setMessageType100( mti101108810088Value);
   	}
	char[] mti101008810088Value = "0100".toCharArray();
	/**
	 *	Test condition "0100" for isMti1010088100()
	 *	@return  Returns true if isMti1010088100() is "0100"
	 */
   public boolean isMti1010088100() throws CFException {
      return (  compareChars( getMessageType100() , mti101008810088Value)  == 0  );
   }


	/**
	*  set values "0100"
	*/
   	public void setMti1010088100True() {  			
    	setMessageType100( mti101008810088Value);
   	}
	char[] mti201008810088Value = "0100".toCharArray();
	/**
	 *	Test condition "0100" for isMti2010088100()
	 *	@return  Returns true if isMti2010088100() is "0100"
	 */
   public boolean isMti2010088100() throws CFException {
      return (  compareChars( getMessageType100() , mti201008810088Value)  == 0  );
   }


	/**
	*  set values "0100"
	*/
   	public void setMti2010088100True() {  			
    	setMessageType100( mti201008810088Value);
   	}
	char[] mti201108810088Value = "0110".toCharArray();
	/**
	 *	Test condition "0110" for isMti2011088100()
	 *	@return  Returns true if isMti2011088100() is "0110"
	 */
   public boolean isMti2011088100() throws CFException {
      return (  compareChars( getMessageType100() , mti201108810088Value)  == 0  );
   }


	/**
	*  set values "0110"
	*/
   	public void setMti2011088100True() {  			
    	setMessageType100( mti201108810088Value);
   	}
	/**
	 *	Returns the value of litA300
	 *	@return litA300
	 */
   public char[] getLitA300() throws CFException{
   		return litA300;
   }

  
	/**
	*  set variable litA300
	*  Corresponding COBOL Variable is 300-LIT-A
	*  @param value
	**/
   public void setLitA300(char[] value) {
       value = checkLitA300Constraints(value);
       arraycopy(value,0,litA300,0,value.length);
   } 
	public void setLitA300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litA300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litB300
	 *	@return litB300
	 */
   public char[] getLitB300() throws CFException{
   		return litB300;
   }

  
	/**
	*  set variable litB300
	*  Corresponding COBOL Variable is 300-LIT-B
	*  @param value
	**/
   public void setLitB300(char[] value) {
       value = checkLitB300Constraints(value);
       arraycopy(value,0,litB300,0,value.length);
   } 
	public void setLitB300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litB300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litC300
	 *	@return litC300
	 */
   public char[] getLitC300() throws CFException{
   		return litC300;
   }

  
	/**
	*  set variable litC300
	*  Corresponding COBOL Variable is 300-LIT-C
	*  @param value
	**/
   public void setLitC300(char[] value) {
       value = checkLitC300Constraints(value);
       arraycopy(value,0,litC300,0,value.length);
   } 
	public void setLitC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litC300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litN300
	 *	@return litN300
	 */
   public char[] getLitN300() throws CFException{
   		return litN300;
   }

  
	/**
	*  set variable litN300
	*  Corresponding COBOL Variable is 300-LIT-N
	*  @param value
	**/
   public void setLitN300(char[] value) {
       value = checkLitN300Constraints(value);
       arraycopy(value,0,litN300,0,value.length);
   } 
	public void setLitN300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litN300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litY300
	 *	@return litY300
	 */
   public char[] getLitY300() throws CFException{
   		return litY300;
   }

  
	/**
	*  set variable litY300
	*  Corresponding COBOL Variable is 300-LIT-Y
	*  @param value
	**/
   public void setLitY300(char[] value) {
       value = checkLitY300Constraints(value);
       arraycopy(value,0,litY300,0,value.length);
   } 
	public void setLitY300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litY300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of litIa300
	 *	@return litIa300
	 */
   public char[] getLitIa300() throws CFException{
   		return litIa300;
   }

  
	/**
	*  set variable litIa300
	*  Corresponding COBOL Variable is 300-LIT-IA
	*  @param value
	**/
   public void setLitIa300(char[] value) {
       value = checkLitIa300Constraints(value);
       arraycopy(value,0,litIa300,0,value.length);
   } 
	public void setLitIa300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,litIa300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit01300
	 *	@return lit01300
	 */
   public char[] getLit01300() throws CFException{
   		return lit01300;
   }

  
	/**
	*  set variable lit01300
	*  Corresponding COBOL Variable is 300-LIT-01
	*  @param value
	**/
   public void setLit01300(char[] value) {
       value = checkLit01300Constraints(value);
       arraycopy(value,0,lit01300,0,value.length);
   } 
	public void setLit01300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit01300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit02300
	 *	@return lit02300
	 */
   public char[] getLit02300() throws CFException{
   		return lit02300;
   }

  
	/**
	*  set variable lit02300
	*  Corresponding COBOL Variable is 300-LIT-02
	*  @param value
	**/
   public void setLit02300(char[] value) {
       value = checkLit02300Constraints(value);
       arraycopy(value,0,lit02300,0,value.length);
   } 
	public void setLit02300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit02300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit03300
	 *	@return lit03300
	 */
   public char[] getLit03300() throws CFException{
   		return lit03300;
   }

  
	/**
	*  set variable lit03300
	*  Corresponding COBOL Variable is 300-LIT-03
	*  @param value
	**/
   public void setLit03300(char[] value) {
       value = checkLit03300Constraints(value);
       arraycopy(value,0,lit03300,0,value.length);
   } 
	public void setLit03300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit03300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit05300
	 *	@return lit05300
	 */
   public char[] getLit05300() throws CFException{
   		return lit05300;
   }

  
	/**
	*  set variable lit05300
	*  Corresponding COBOL Variable is 300-LIT-05
	*  @param value
	**/
   public void setLit05300(char[] value) {
       value = checkLit05300Constraints(value);
       arraycopy(value,0,lit05300,0,value.length);
   } 
	public void setLit05300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit05300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit06300
	 *	@return lit06300
	 */
   public char[] getLit06300() throws CFException{
   		return lit06300;
   }

  
	/**
	*  set variable lit06300
	*  Corresponding COBOL Variable is 300-LIT-06
	*  @param value
	**/
   public void setLit06300(char[] value) {
       value = checkLit06300Constraints(value);
       arraycopy(value,0,lit06300,0,value.length);
   } 
	public void setLit06300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit06300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit09300
	 *	@return lit09300
	 */
   public char[] getLit09300() throws CFException{
   		return lit09300;
   }

  
	/**
	*  set variable lit09300
	*  Corresponding COBOL Variable is 300-LIT-09
	*  @param value
	**/
   public void setLit09300(char[] value) {
       value = checkLit09300Constraints(value);
       arraycopy(value,0,lit09300,0,value.length);
   } 
	public void setLit09300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit09300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit10300
	 *	@return lit10300
	 */
   public char[] getLit10300() throws CFException{
   		return lit10300;
   }

  
	/**
	*  set variable lit10300
	*  Corresponding COBOL Variable is 300-LIT-10
	*  @param value
	**/
   public void setLit10300(char[] value) {
       value = checkLit10300Constraints(value);
       arraycopy(value,0,lit10300,0,value.length);
   } 
	public void setLit10300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit10300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit16300
	 *	@return lit16300
	 */
   public char[] getLit16300() throws CFException{
   		return lit16300;
   }

  
	/**
	*  set variable lit16300
	*  Corresponding COBOL Variable is 300-LIT-16
	*  @param value
	**/
   public void setLit16300(char[] value) {
       value = checkLit16300Constraints(value);
       arraycopy(value,0,lit16300,0,value.length);
   } 
	public void setLit16300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit16300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit30300
	 *	@return lit30300
	 */
   public char[] getLit30300() throws CFException{
   		return lit30300;
   }

  
	/**
	*  set variable lit30300
	*  Corresponding COBOL Variable is 300-LIT-30
	*  @param value
	**/
   public void setLit30300(char[] value) {
       value = checkLit30300Constraints(value);
       arraycopy(value,0,lit30300,0,value.length);
   } 
	public void setLit30300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit30300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit50300
	 *	@return lit50300
	 */
   public char[] getLit50300() throws CFException{
   		return lit50300;
   }

  
	/**
	*  set variable lit50300
	*  Corresponding COBOL Variable is 300-LIT-50
	*  @param value
	**/
   public void setLit50300(char[] value) {
       value = checkLit50300Constraints(value);
       arraycopy(value,0,lit50300,0,value.length);
   } 
	public void setLit50300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit50300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit51300
	 *	@return lit51300
	 */
   public char[] getLit51300() throws CFException{
   		return lit51300;
   }

  
	/**
	*  set variable lit51300
	*  Corresponding COBOL Variable is 300-LIT-51
	*  @param value
	**/
   public void setLit51300(char[] value) {
       value = checkLit51300Constraints(value);
       arraycopy(value,0,lit51300,0,value.length);
   } 
	public void setLit51300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit51300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit52300
	 *	@return lit52300
	 */
   public char[] getLit52300() throws CFException{
   		return lit52300;
   }

  
	/**
	*  set variable lit52300
	*  Corresponding COBOL Variable is 300-LIT-52
	*  @param value
	**/
   public void setLit52300(char[] value) {
       value = checkLit52300Constraints(value);
       arraycopy(value,0,lit52300,0,value.length);
   } 
	public void setLit52300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit52300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit82300
	 *	@return lit82300
	 */
   public char[] getLit82300() throws CFException{
   		return lit82300;
   }

  
	/**
	*  set variable lit82300
	*  Corresponding COBOL Variable is 300-LIT-82
	*  @param value
	**/
   public void setLit82300(char[] value) {
       value = checkLit82300Constraints(value);
       arraycopy(value,0,lit82300,0,value.length);
   } 
	public void setLit82300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit82300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit83300
	 *	@return lit83300
	 */
   public char[] getLit83300() throws CFException{
   		return lit83300;
   }

  
	/**
	*  set variable lit83300
	*  Corresponding COBOL Variable is 300-LIT-83
	*  @param value
	**/
   public void setLit83300(char[] value) {
       value = checkLit83300Constraints(value);
       arraycopy(value,0,lit83300,0,value.length);
   } 
	public void setLit83300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit83300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit85300
	 *	@return lit85300
	 */
   public char[] getLit85300() throws CFException{
   		return lit85300;
   }

  
	/**
	*  set variable lit85300
	*  Corresponding COBOL Variable is 300-LIT-85
	*  @param value
	**/
   public void setLit85300(char[] value) {
       value = checkLit85300Constraints(value);
       arraycopy(value,0,lit85300,0,value.length);
   } 
	public void setLit85300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit85300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit002300
	 *	@return lit002300
	 */
   public char[] getLit002300() throws CFException{
   		return lit002300;
   }

  
	/**
	*  set variable lit002300
	*  Corresponding COBOL Variable is 300-LIT-002
	*  @param value
	**/
   public void setLit002300(char[] value) {
       value = checkLit002300Constraints(value);
       arraycopy(value,0,lit002300,0,value.length);
   } 
	public void setLit002300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit002300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit0120300
	 *	@return lit0120300
	 */
   public char[] getLit0120300() throws CFException{
   		return lit0120300;
   }

  
	/**
	*  set variable lit0120300
	*  Corresponding COBOL Variable is 300-LIT-0120
	*  @param value
	**/
   public void setLit0120300(char[] value) {
       value = checkLit0120300Constraints(value);
       arraycopy(value,0,lit0120300,0,value.length);
   } 
	public void setLit0120300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit0120300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit0130300
	 *	@return lit0130300
	 */
   public char[] getLit0130300() throws CFException{
   		return lit0130300;
   }

  
	/**
	*  set variable lit0130300
	*  Corresponding COBOL Variable is 300-LIT-0130
	*  @param value
	**/
   public void setLit0130300(char[] value) {
       value = checkLit0130300Constraints(value);
       arraycopy(value,0,lit0130300,0,value.length);
   } 
	public void setLit0130300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit0130300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit0420300
	 *	@return lit0420300
	 */
   public char[] getLit0420300() throws CFException{
   		return lit0420300;
   }

  
	/**
	*  set variable lit0420300
	*  Corresponding COBOL Variable is 300-LIT-0420
	*  @param value
	**/
   public void setLit0420300(char[] value) {
       value = checkLit0420300Constraints(value);
       arraycopy(value,0,lit0420300,0,value.length);
   } 
	public void setLit0420300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit0420300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit0430300
	 *	@return lit0430300
	 */
   public char[] getLit0430300() throws CFException{
   		return lit0430300;
   }

  
	/**
	*  set variable lit0430300
	*  Corresponding COBOL Variable is 300-LIT-0430
	*  @param value
	**/
   public void setLit0430300(char[] value) {
       value = checkLit0430300Constraints(value);
       arraycopy(value,0,lit0430300,0,value.length);
   } 
	public void setLit0430300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit0430300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lit380000300
	 *	@return lit380000300
	 */
   public char[] getLit380000300() throws CFException{
   		return lit380000300;
   }

  
	/**
	*  set variable lit380000300
	*  Corresponding COBOL Variable is 300-LIT-380000
	*  @param value
	**/
   public void setLit380000300(char[] value) {
       value = checkLit380000300Constraints(value);
       arraycopy(value,0,lit380000300,0,value.length);
   } 
	public void setLit380000300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lit380000300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of doubleSpace300
	 *	@return doubleSpace300
	 */
   public char[] getDoubleSpace300() throws CFException{
   		return doubleSpace300;
   }

  
	/**
	*  set variable doubleSpace300
	*  Corresponding COBOL Variable is 300-DOUBLE-SPACE
	*  @param value
	**/
   public void setDoubleSpace300(char[] value) {
       value = checkDoubleSpace300Constraints(value);
       arraycopy(value,0,doubleSpace300,0,value.length);
   } 
	public void setDoubleSpace300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,doubleSpace300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tripleSpace300
	 *	@return tripleSpace300
	 */
   public char[] getTripleSpace300() throws CFException{
   		return tripleSpace300;
   }

  
	/**
	*  set variable tripleSpace300
	*  Corresponding COBOL Variable is 300-TRIPLE-SPACE
	*  @param value
	**/
   public void setTripleSpace300(char[] value) {
       value = checkTripleSpace300Constraints(value);
       arraycopy(value,0,tripleSpace300,0,value.length);
   } 
	public void setTripleSpace300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tripleSpace300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of newPage300
	 *	@return newPage300
	 */
   public char[] getNewPage300() throws CFException{
   		return newPage300;
   }

  
	/**
	*  set variable newPage300
	*  Corresponding COBOL Variable is 300-NEW-PAGE
	*  @param value
	**/
   public void setNewPage300(char[] value) {
       value = checkNewPage300Constraints(value);
       arraycopy(value,0,newPage300,0,value.length);
   } 
	public void setNewPage300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,newPage300,0,beginIndex + endIndex);
   }
	public short getPackedOne300() throws CFException {
        if (isPackedOne300Modified()) { 
           packedOne300 = refreshPackedOne300();
        }
   		return packedOne300;
	}
	
	/**
	 * 	Update PackedOne300 with the passed value
	 *  Corresponding COBOL Variable is 300-PACKED-ONE
	 *	@param number
	 */
	public void setPackedOne300(short number) {
			packedOne300 = checkPackedOne300MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePackedOne300(packedOne300);
	}

	public void setPackedOne300(int number) {
	    number = checkPackedOne300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPackedOne300((short)number);
	}
	public void setPackedOne300(long number) {
	    number = checkPackedOne300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPackedOne300((short)number);
	}
	

	/**
	 *	Returns the value of one300
	 *	@return one300
	 */
	public int getOne300() throws CFException {
       if (isOne300Modified()) { 
           one300 = refreshOne300();
        }
   		return one300;
	}
	

	
	   
	/**
	 * 	Update One300 with the passed value
	 *  Corresponding COBOL Variable is 300-ONE
	 *	@param number
	 */
	public void setOne300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    one300 = checkOne300MaxLimit(number); 
		serializeOne300(one300);
	}
	

	public void setOne300(long number) {
	    number = checkOne300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setOne300((int)number);
	}
	
	/**
	 * 	Update One300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOne300(char[] value) throws CFException {
		 one300 = serializeOne300(value);
	}
	/**
	 * 	Update One300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOne300String(char[] value) throws CFException {
		 setOne300(value);
	}
	/**
	 *	Returns the value of two300
	 *	@return two300
	 */
	public int getTwo300() throws CFException {
       if (isTwo300Modified()) { 
           two300 = refreshTwo300();
        }
   		return two300;
	}
	

	
	   
	/**
	 * 	Update Two300 with the passed value
	 *  Corresponding COBOL Variable is 300-TWO
	 *	@param number
	 */
	public void setTwo300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    two300 = checkTwo300MaxLimit(number); 
		serializeTwo300(two300);
	}
	

	public void setTwo300(long number) {
	    number = checkTwo300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTwo300((int)number);
	}
	
	/**
	 * 	Update Two300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTwo300(char[] value) throws CFException {
		 two300 = serializeTwo300(value);
	}
	/**
	 * 	Update Two300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTwo300String(char[] value) throws CFException {
		 setTwo300(value);
	}
	/**
	 *	Returns the value of three300
	 *	@return three300
	 */
	public int getThree300() throws CFException {
       if (isThree300Modified()) { 
           three300 = refreshThree300();
        }
   		return three300;
	}
	

	
	   
	/**
	 * 	Update Three300 with the passed value
	 *  Corresponding COBOL Variable is 300-THREE
	 *	@param number
	 */
	public void setThree300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    three300 = checkThree300MaxLimit(number); 
		serializeThree300(three300);
	}
	

	public void setThree300(long number) {
	    number = checkThree300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setThree300((int)number);
	}
	
	/**
	 * 	Update Three300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setThree300(char[] value) throws CFException {
		 three300 = serializeThree300(value);
	}
	/**
	 * 	Update Three300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setThree300String(char[] value) throws CFException {
		 setThree300(value);
	}
	/**
	 *	Returns the value of four300
	 *	@return four300
	 */
	public int getFour300() throws CFException {
       if (isFour300Modified()) { 
           four300 = refreshFour300();
        }
   		return four300;
	}
	

	
	   
	/**
	 * 	Update Four300 with the passed value
	 *  Corresponding COBOL Variable is 300-FOUR
	 *	@param number
	 */
	public void setFour300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    four300 = checkFour300MaxLimit(number); 
		serializeFour300(four300);
	}
	

	public void setFour300(long number) {
	    number = checkFour300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFour300((int)number);
	}
	
	/**
	 * 	Update Four300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFour300(char[] value) throws CFException {
		 four300 = serializeFour300(value);
	}
	/**
	 * 	Update Four300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFour300String(char[] value) throws CFException {
		 setFour300(value);
	}
	/**
	 *	Returns the value of five300
	 *	@return five300
	 */
	public int getFive300() throws CFException {
       if (isFive300Modified()) { 
           five300 = refreshFive300();
        }
   		return five300;
	}
	

	
	   
	/**
	 * 	Update Five300 with the passed value
	 *  Corresponding COBOL Variable is 300-FIVE
	 *	@param number
	 */
	public void setFive300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    five300 = checkFive300MaxLimit(number); 
		serializeFive300(five300);
	}
	

	public void setFive300(long number) {
	    number = checkFive300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFive300((int)number);
	}
	
	/**
	 * 	Update Five300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFive300(char[] value) throws CFException {
		 five300 = serializeFive300(value);
	}
	/**
	 * 	Update Five300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFive300String(char[] value) throws CFException {
		 setFive300(value);
	}
	/**
	 *	Returns the value of six300
	 *	@return six300
	 */
	public int getSix300() throws CFException {
       if (isSix300Modified()) { 
           six300 = refreshSix300();
        }
   		return six300;
	}
	

	
	   
	/**
	 * 	Update Six300 with the passed value
	 *  Corresponding COBOL Variable is 300-SIX
	 *	@param number
	 */
	public void setSix300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    six300 = checkSix300MaxLimit(number); 
		serializeSix300(six300);
	}
	

	public void setSix300(long number) {
	    number = checkSix300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSix300((int)number);
	}
	
	/**
	 * 	Update Six300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSix300(char[] value) throws CFException {
		 six300 = serializeSix300(value);
	}
	/**
	 * 	Update Six300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSix300String(char[] value) throws CFException {
		 setSix300(value);
	}
	/**
	 *	Returns the value of seven300
	 *	@return seven300
	 */
	public int getSeven300() throws CFException {
       if (isSeven300Modified()) { 
           seven300 = refreshSeven300();
        }
   		return seven300;
	}
	

	
	   
	/**
	 * 	Update Seven300 with the passed value
	 *  Corresponding COBOL Variable is 300-SEVEN
	 *	@param number
	 */
	public void setSeven300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    seven300 = checkSeven300MaxLimit(number); 
		serializeSeven300(seven300);
	}
	

	public void setSeven300(long number) {
	    number = checkSeven300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSeven300((int)number);
	}
	
	/**
	 * 	Update Seven300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSeven300(char[] value) throws CFException {
		 seven300 = serializeSeven300(value);
	}
	/**
	 * 	Update Seven300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSeven300String(char[] value) throws CFException {
		 setSeven300(value);
	}
	/**
	 *	Returns the value of eight300
	 *	@return eight300
	 */
	public int getEight300() throws CFException {
       if (isEight300Modified()) { 
           eight300 = refreshEight300();
        }
   		return eight300;
	}
	

	
	   
	/**
	 * 	Update Eight300 with the passed value
	 *  Corresponding COBOL Variable is 300-EIGHT
	 *	@param number
	 */
	public void setEight300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    eight300 = checkEight300MaxLimit(number); 
		serializeEight300(eight300);
	}
	

	public void setEight300(long number) {
	    number = checkEight300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEight300((int)number);
	}
	
	/**
	 * 	Update Eight300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEight300(char[] value) throws CFException {
		 eight300 = serializeEight300(value);
	}
	/**
	 * 	Update Eight300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEight300String(char[] value) throws CFException {
		 setEight300(value);
	}
	/**
	 *	Returns the value of nine300
	 *	@return nine300
	 */
	public int getNine300() throws CFException {
       if (isNine300Modified()) { 
           nine300 = refreshNine300();
        }
   		return nine300;
	}
	

	
	   
	/**
	 * 	Update Nine300 with the passed value
	 *  Corresponding COBOL Variable is 300-NINE
	 *	@param number
	 */
	public void setNine300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    nine300 = checkNine300MaxLimit(number); 
		serializeNine300(nine300);
	}
	

	public void setNine300(long number) {
	    number = checkNine300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNine300((int)number);
	}
	
	/**
	 * 	Update Nine300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNine300(char[] value) throws CFException {
		 nine300 = serializeNine300(value);
	}
	/**
	 * 	Update Nine300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNine300String(char[] value) throws CFException {
		 setNine300(value);
	}
	/**
	 *	Returns the value of twelve300
	 *	@return twelve300
	 */
	public int getTwelve300() throws CFException {
       if (isTwelve300Modified()) { 
           twelve300 = refreshTwelve300();
        }
   		return twelve300;
	}
	

	
	   
	/**
	 * 	Update Twelve300 with the passed value
	 *  Corresponding COBOL Variable is 300-TWELVE
	 *	@param number
	 */
	public void setTwelve300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    twelve300 = checkTwelve300MaxLimit(number); 
		serializeTwelve300(twelve300);
	}
	

	public void setTwelve300(long number) {
	    number = checkTwelve300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTwelve300((int)number);
	}
	
	/**
	 * 	Update Twelve300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setTwelve300(char[] value) throws CFException {
		 twelve300 = serializeTwelve300(value);
	}
	/**
	 * 	Update Twelve300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTwelve300String(char[] value) throws CFException {
		 setTwelve300(value);
	}
	/**
	 *	Returns the value of max300
	 *	@return max300
	 */
	public int getMax300() throws CFException {
       if (isMax300Modified()) { 
           max300 = refreshMax300();
        }
   		return max300;
	}
	

	
	   
	/**
	 * 	Update Max300 with the passed value
	 *  Corresponding COBOL Variable is 300-MAX
	 *	@param number
	 */
	public void setMax300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    max300 = checkMax300MaxLimit(number); 
		serializeMax300(max300);
	}
	

	public void setMax300(long number) {
	    number = checkMax300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMax300((int)number);
	}
	
	/**
	 * 	Update Max300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMax300(char[] value) throws CFException {
		 max300 = serializeMax300(value);
	}
	/**
	 * 	Update Max300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMax300String(char[] value) throws CFException {
		 setMax300(value);
	}
	/**
	 *	Returns the value of mti0110300
	 *	@return mti0110300
	 */
	public int getMti0110300() throws CFException {
       if (isMti0110300Modified()) { 
           mti0110300 = refreshMti0110300();
        }
   		return mti0110300;
	}
	

	
	   
	/**
	 * 	Update Mti0110300 with the passed value
	 *  Corresponding COBOL Variable is 300-MTI-0110
	 *	@param number
	 */
	public void setMti0110300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mti0110300 = checkMti0110300MaxLimit(number); 
		serializeMti0110300(mti0110300);
	}
	

	public void setMti0110300(long number) {
	    number = checkMti0110300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMti0110300((int)number);
	}
	
	/**
	 * 	Update Mti0110300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMti0110300(char[] value) throws CFException {
		 mti0110300 = serializeMti0110300(value);
	}
	/**
	 * 	Update Mti0110300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMti0110300String(char[] value) throws CFException {
		 setMti0110300(value);
	}
	/**
	 *	Returns the value of mti0100300
	 *	@return mti0100300
	 */
	public int getMti0100300() throws CFException {
       if (isMti0100300Modified()) { 
           mti0100300 = refreshMti0100300();
        }
   		return mti0100300;
	}
	

	
	   
	/**
	 * 	Update Mti0100300 with the passed value
	 *  Corresponding COBOL Variable is 300-MTI-0100
	 *	@param number
	 */
	public void setMti0100300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mti0100300 = checkMti0100300MaxLimit(number); 
		serializeMti0100300(mti0100300);
	}
	

	public void setMti0100300(long number) {
	    number = checkMti0100300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMti0100300((int)number);
	}
	
	/**
	 * 	Update Mti0100300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMti0100300(char[] value) throws CFException {
		 mti0100300 = serializeMti0100300(value);
	}
	/**
	 * 	Update Mti0100300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMti0100300String(char[] value) throws CFException {
		 setMti0100300(value);
	}
	/**
	 *	Returns the value of sf910020300
	 *	@return sf910020300
	 */
   public char[] getSf910020300() throws CFException{
   		return sf910020300;
   }

  
	/**
	*  set variable sf910020300
	*  Corresponding COBOL Variable is 300-SF910020
	*  @param value
	**/
   public void setSf910020300(char[] value) {
       value = checkSf910020300Constraints(value);
       arraycopy(value,0,sf910020300,0,value.length);
   } 
	public void setSf910020300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sf910020300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of si994010300
	 *	@return si994010300
	 */
   public char[] getSi994010300() throws CFException{
   		return si994010300;
   }

  
	/**
	*  set variable si994010300
	*  Corresponding COBOL Variable is 300-SI994010
	*  @param value
	**/
   public void setSi994010300(char[] value) {
       value = checkSi994010300Constraints(value);
       arraycopy(value,0,si994010300,0,value.length);
   } 
	public void setSi994010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,si994010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of binary61300
	 *	@return binary61300
	 */
	public short getBinary61300() throws CFException {
   		return binary61300;
	}
	
	/**
	 * 	Update Binary61300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-61
	 *	@param number
	 */
	public void setBinary61300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary61300 = checkBinary61300MaxLimit(number); 
	}

	public void setBinary61300(int number) {
	    number = checkBinary61300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary61300((short)number);
	}
	public void setBinary61300(long number) {
	    number = checkBinary61300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary61300((short)number);
	}
	

	/**
	 *	Returns the value of binary88300
	 *	@return binary88300
	 */
	public short getBinary88300() throws CFException {
   		return binary88300;
	}
	
	/**
	 * 	Update Binary88300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-88
	 *	@param number
	 */
	public void setBinary88300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary88300 = checkBinary88300MaxLimit(number); 
	}

	public void setBinary88300(int number) {
	    number = checkBinary88300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary88300((short)number);
	}
	public void setBinary88300(long number) {
	    number = checkBinary88300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary88300((short)number);
	}
	

	public int getMaxLines400() throws CFException {
        if (isMaxLines400Modified()) { 
           maxLines400 = refreshMaxLines400();
        }
   		return maxLines400;
	}
	
	/**
	 * 	Update MaxLines400 with the passed value
	 *  Corresponding COBOL Variable is 400-MAX-LINES
	 *	@param number
	 */
	public void setMaxLines400(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			maxLines400 = checkMaxLines400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeMaxLines400(maxLines400);
	}


	public void setMaxLines400(long number) {
	    number = checkMaxLines400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxLines400((int)number);
	}
	
	public int getPageCount400() throws CFException {
        if (isPageCount400Modified()) { 
           pageCount400 = refreshPageCount400();
        }
   		return pageCount400;
	}
	
	/**
	 * 	Update PageCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-PAGE-COUNT
	 *	@param number
	 */
	public void setPageCount400(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			pageCount400 = checkPageCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializePageCount400(pageCount400);
	}


	public void setPageCount400(long number) {
	    number = checkPageCount400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPageCount400((int)number);
	}
	
	public int getLineCount400() throws CFException {
        if (isLineCount400Modified()) { 
           lineCount400 = refreshLineCount400();
        }
   		return lineCount400;
	}
	
	/**
	 * 	Update LineCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-LINE-COUNT
	 *	@param number
	 */
	public void setLineCount400(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			lineCount400 = checkLineCount400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeLineCount400(lineCount400);
	}


	public void setLineCount400(long number) {
	    number = checkLineCount400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLineCount400((int)number);
	}
	
	public long getTotalRecs400() throws CFException {
        if (isTotalRecs400Modified()) { 
           totalRecs400 = refreshTotalRecs400();
        }
   		return totalRecs400;
	}
	
	/**
	 * 	Update TotalRecs400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-RECS
	 *	@param number
	 */
	public void setTotalRecs400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalRecs400 = checkTotalRecs400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalRecs400(totalRecs400);
	}


	public long getTotalParseErrors400() throws CFException {
        if (isTotalParseErrors400Modified()) { 
           totalParseErrors400 = refreshTotalParseErrors400();
        }
   		return totalParseErrors400;
	}
	
	/**
	 * 	Update TotalParseErrors400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-PARSE-ERRORS
	 *	@param number
	 */
	public void setTotalParseErrors400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalParseErrors400 = checkTotalParseErrors400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalParseErrors400(totalParseErrors400);
	}


	public long getTotalIsoAuth400() throws CFException {
        if (isTotalIsoAuth400Modified()) { 
           totalIsoAuth400 = refreshTotalIsoAuth400();
        }
   		return totalIsoAuth400;
	}
	
	/**
	 * 	Update TotalIsoAuth400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-ISO-AUTH
	 *	@param number
	 */
	public void setTotalIsoAuth400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalIsoAuth400 = checkTotalIsoAuth400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalIsoAuth400(totalIsoAuth400);
	}


	public long getTotalIaDropped400() throws CFException {
        if (isTotalIaDropped400Modified()) { 
           totalIaDropped400 = refreshTotalIaDropped400();
        }
   		return totalIaDropped400;
	}
	
	/**
	 * 	Update TotalIaDropped400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-IA-DROPPED
	 *	@param number
	 */
	public void setTotalIaDropped400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalIaDropped400 = checkTotalIaDropped400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalIaDropped400(totalIaDropped400);
	}


	public long getTotalType2400() throws CFException {
        if (isTotalType2400Modified()) { 
           totalType2400 = refreshTotalType2400();
        }
   		return totalType2400;
	}
	
	/**
	 * 	Update TotalType2400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-TYPE-2
	 *	@param number
	 */
	public void setTotalType2400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalType2400 = checkTotalType2400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalType2400(totalType2400);
	}


	public long getTotalType3400() throws CFException {
        if (isTotalType3400Modified()) { 
           totalType3400 = refreshTotalType3400();
        }
   		return totalType3400;
	}
	
	/**
	 * 	Update TotalType3400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-TYPE-3
	 *	@param number
	 */
	public void setTotalType3400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalType3400 = checkTotalType3400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalType3400(totalType3400);
	}


	public long getTotal0120Adv400() throws CFException {
        if (isTotal0120Adv400Modified()) { 
           total0120Adv400 = refreshTotal0120Adv400();
        }
   		return total0120Adv400;
	}
	
	/**
	 * 	Update Total0120Adv400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-0120-ADV
	 *	@param number
	 */
	public void setTotal0120Adv400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			total0120Adv400 = checkTotal0120Adv400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotal0120Adv400(total0120Adv400);
	}


	public long getTotalRevAdv400() throws CFException {
        if (isTotalRevAdv400Modified()) { 
           totalRevAdv400 = refreshTotalRevAdv400();
        }
   		return totalRevAdv400;
	}
	
	/**
	 * 	Update TotalRevAdv400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-REV-ADV
	 *	@param number
	 */
	public void setTotalRevAdv400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalRevAdv400 = checkTotalRevAdv400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalRevAdv400(totalRevAdv400);
	}


	public long getTotalVer2400() throws CFException {
        if (isTotalVer2400Modified()) { 
           totalVer2400 = refreshTotalVer2400();
        }
   		return totalVer2400;
	}
	
	/**
	 * 	Update TotalVer2400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-VER2
	 *	@param number
	 */
	public void setTotalVer2400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalVer2400 = checkTotalVer2400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalVer2400(totalVer2400);
	}


	public long getTotalBadPan400() throws CFException {
        if (isTotalBadPan400Modified()) { 
           totalBadPan400 = refreshTotalBadPan400();
        }
   		return totalBadPan400;
	}
	
	/**
	 * 	Update TotalBadPan400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-BAD-PAN
	 *	@param number
	 */
	public void setTotalBadPan400(long number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			totalBadPan400 = checkTotalBadPan400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeTotalBadPan400(totalBadPan400);
	}


	/**
	 *	Returns the value of avs2RecCount400
	 *	@return avs2RecCount400
	 */
	public long getAvs2RecCount400() throws CFException {
   		return avs2RecCount400;
	}
	
	/**
	 * 	Update Avs2RecCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-AVS2-REC-COUNT
	 *	@param number
	 */
	public void setAvs2RecCount400(long number) {
	     // Truncate if the number is beyond +/- Max range
	    avs2RecCount400 = checkAvs2RecCount400MaxLimit(number); 
	}


	public int getSe42Lnth400() throws CFException {
        if (isSe42Lnth400Modified()) { 
           se42Lnth400 = refreshSe42Lnth400();
        }
   		return se42Lnth400;
	}
	
	/**
	 * 	Update Se42Lnth400 with the passed value
	 *  Corresponding COBOL Variable is 400-SE42-LNTH
	 *	@param number
	 */
	public void setSe42Lnth400(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			se42Lnth400 = checkSe42Lnth400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSe42Lnth400(se42Lnth400);
	}


	public void setSe42Lnth400(long number) {
	    number = checkSe42Lnth400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSe42Lnth400((int)number);
	}
	
	public int getSe42Pos400() throws CFException {
        if (isSe42Pos400Modified()) { 
           se42Pos400 = refreshSe42Pos400();
        }
   		return se42Pos400;
	}
	
	/**
	 * 	Update Se42Pos400 with the passed value
	 *  Corresponding COBOL Variable is 400-SE42-POS
	 *	@param number
	 */
	public void setSe42Pos400(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			se42Pos400 = checkSe42Pos400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSe42Pos400(se42Pos400);
	}


	public void setSe42Pos400(long number) {
	    number = checkSe42Pos400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSe42Pos400((int)number);
	}
	
	public int getSe33Pos400() throws CFException {
        if (isSe33Pos400Modified()) { 
           se33Pos400 = refreshSe33Pos400();
        }
   		return se33Pos400;
	}
	
	/**
	 * 	Update Se33Pos400 with the passed value
	 *  Corresponding COBOL Variable is 400-SE33-POS
	 *	@param number
	 */
	public void setSe33Pos400(int number) {
	    // Only positive number is allowed 
        number = (number < 0 ? -number : number);     
			se33Pos400 = checkSe33Pos400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSe33Pos400(se33Pos400);
	}


	public void setSe33Pos400(long number) {
	    number = checkSe33Pos400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSe33Pos400((int)number);
	}
	
	public short getSe24Pos400() throws CFException {
        if (isSe24Pos400Modified()) { 
           se24Pos400 = refreshSe24Pos400();
        }
   		return se24Pos400;
	}
	
	/**
	 * 	Update Se24Pos400 with the passed value
	 *  Corresponding COBOL Variable is 400-SE24-POS
	 *	@param number
	 */
	public void setSe24Pos400(short number) {
			se24Pos400 = checkSe24Pos400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSe24Pos400(se24Pos400);
	}

	public void setSe24Pos400(int number) {
	    number = checkSe24Pos400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSe24Pos400((short)number);
	}
	public void setSe24Pos400(long number) {
	    number = checkSe24Pos400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSe24Pos400((short)number);
	}
	

	public short getSe66Pos400() throws CFException {
        if (isSe66Pos400Modified()) { 
           se66Pos400 = refreshSe66Pos400();
        }
   		return se66Pos400;
	}
	
	/**
	 * 	Update Se66Pos400 with the passed value
	 *  Corresponding COBOL Variable is 400-SE66-POS
	 *	@param number
	 */
	public void setSe66Pos400(short number) {
			se66Pos400 = checkSe66Pos400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSe66Pos400(se66Pos400);
	}

	public void setSe66Pos400(int number) {
	    number = checkSe66Pos400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSe66Pos400((short)number);
	}
	public void setSe66Pos400(long number) {
	    number = checkSe66Pos400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSe66Pos400((short)number);
	}
	

	/**
	 *	Returns the value of de48Se42Sf2Sf3500
	 *	@return de48Se42Sf2Sf3500
	 */
   public char[] getDe48Se42Sf2Sf3500() throws CFException{
   		return de48Se42Sf2Sf3500;
   }

  
	/**
	*  set variable de48Se42Sf2Sf3500
	*  Corresponding COBOL Variable is 500-DE48-SE42-SF2-SF3
	*  @param value
	**/
   public void setDe48Se42Sf2Sf3500(char[] value) {
       value = checkDe48Se42Sf2Sf3500Constraints(value);
       arraycopy(value,0,de48Se42Sf2Sf3500,0,value.length);
   } 
	public void setDe48Se42Sf2Sf3500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de48Se42Sf2Sf3500,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de48Se89500
	 *	@return de48Se89500
	 */
   public char[] getDe48Se89500() throws CFException{
   		return de48Se89500;
   }

  
	/**
	*  set variable de48Se89500
	*  Corresponding COBOL Variable is 500-DE48-SE89
	*  @param value
	**/
   public void setDe48Se89500(char[] value) {
       value = checkDe48Se89500Constraints(value);
       arraycopy(value,0,de48Se89500,0,value.length);
   } 
	public void setDe48Se89500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de48Se89500,0,beginIndex + endIndex);
   }
	static java.util.Set<String> magLgth8850088Value = new java.util.HashSet<>();
static { 
	magLgth8850088Value.add( "A");
	magLgth8850088Value.add( "B");
	magLgth8850088Value.add( "C");
	magLgth8850088Value.add( "D");
	magLgth8850088Value.add( "E");
	magLgth8850088Value.add( "F");
	magLgth8850088Value.add( "G");
	magLgth8850088Value.add( "H");
	magLgth8850088Value.add( "I");
	magLgth8850088Value.add( "J");
} 

	/**
	 *	Test condition "A" "B" "C" "D" "E" "F" "G" "H" "I" "J" for isMagLgth88500()
	 *	@return  Returns true if isMagLgth88500() is "A" "B" "C" "D" "E" "F" "G" "H" "I" "J"
	 */
   public boolean isMagLgth88500() throws CFException {
      return   magLgth8850088Value.contains(String.valueOf(getDe48Se89500()));
   }


	/**
	*  set values "A" "B" "C" "D" "E" "F" "G" "H" "I" "J"
	*/
   	public void setMagLgth88500True() {  			
    	  setDe48Se89500(magLgth8850088Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of de48Se33SfId500
	 *	@return de48Se33SfId500
	 */
   public char[] getDe48Se33SfId500() throws CFException{
   		return de48Se33SfId500;
   }

  
	/**
	*  set variable de48Se33SfId500
	*  Corresponding COBOL Variable is 500-DE48-SE33-SF-ID
	*  @param value
	**/
   public void setDe48Se33SfId500(char[] value) {
       value = checkDe48Se33SfId500Constraints(value);
       arraycopy(value,0,de48Se33SfId500,0,value.length);
   } 
	public void setDe48Se33SfId500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de48Se33SfId500,0,beginIndex + endIndex);
   }
	char[] de48Se33Sf018850088Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isDe48Se33Sf0188500()
	 *	@return  Returns true if isDe48Se33Sf0188500() is "01"
	 */
   public boolean isDe48Se33Sf0188500() throws CFException {
      return (  compareChars( getDe48Se33SfId500() , de48Se33Sf018850088Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setDe48Se33Sf0188500True() {  			
    	setDe48Se33SfId500( de48Se33Sf018850088Value);
   	}
	char[] de48Se33Sf028850088Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isDe48Se33Sf0288500()
	 *	@return  Returns true if isDe48Se33Sf0288500() is "02"
	 */
   public boolean isDe48Se33Sf0288500() throws CFException {
      return (  compareChars( getDe48Se33SfId500() , de48Se33Sf028850088Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setDe48Se33Sf0288500True() {  			
    	setDe48Se33SfId500( de48Se33Sf028850088Value);
   	}
	char[] de48Se33Sf058850088Value = "05".toCharArray();
	/**
	 *	Test condition "05" for isDe48Se33Sf0588500()
	 *	@return  Returns true if isDe48Se33Sf0588500() is "05"
	 */
   public boolean isDe48Se33Sf0588500() throws CFException {
      return (  compareChars( getDe48Se33SfId500() , de48Se33Sf058850088Value)  == 0  );
   }


	/**
	*  set values "05"
	*/
   	public void setDe48Se33Sf0588500True() {  			
    	setDe48Se33SfId500( de48Se33Sf058850088Value);
   	}
	char[] de48Se33Sf068850088Value = "06".toCharArray();
	/**
	 *	Test condition "06" for isDe48Se33Sf0688500()
	 *	@return  Returns true if isDe48Se33Sf0688500() is "06"
	 */
   public boolean isDe48Se33Sf0688500() throws CFException {
      return (  compareChars( getDe48Se33SfId500() , de48Se33Sf068850088Value)  == 0  );
   }


	/**
	*  set values "06"
	*/
   	public void setDe48Se33Sf0688500True() {  			
    	setDe48Se33SfId500( de48Se33Sf068850088Value);
   	}
	/**
	 *	Returns the value of de48Se33SfLen500
	 *	@return de48Se33SfLen500
	 */
	public int getDe48Se33SfLen500() throws CFException {
       if (isDe48Se33SfLen500Modified()) { 
           de48Se33SfLen500 = refreshDe48Se33SfLen500();
        }
   		return de48Se33SfLen500;
	}
	

	
	   
	/**
	 * 	Update De48Se33SfLen500 with the passed value
	 *  Corresponding COBOL Variable is 500-DE48-SE33-SF-LEN
	 *	@param number
	 */
	public void setDe48Se33SfLen500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de48Se33SfLen500 = checkDe48Se33SfLen500MaxLimit(number); 
		serializeDe48Se33SfLen500(de48Se33SfLen500);
	}
	

	public void setDe48Se33SfLen500(long number) {
	    number = checkDe48Se33SfLen500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe48Se33SfLen500((int)number);
	}
	
	/**
	 * 	Update De48Se33SfLen500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe48Se33SfLen500(char[] value) throws CFException {
		 de48Se33SfLen500 = serializeDe48Se33SfLen500(value);
	}
	/**
	 * 	Update De48Se33SfLen500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe48Se33SfLen500String(char[] value) throws CFException {
		 setDe48Se33SfLen500(value);
	}
	/**
	 *	Returns the value of de48Se42SfLen500
	 *	@return de48Se42SfLen500
	 */
	public int getDe48Se42SfLen500() throws CFException {
       if (isDe48Se42SfLen500Modified()) { 
           de48Se42SfLen500 = refreshDe48Se42SfLen500();
        }
   		return de48Se42SfLen500;
	}
	

	
	   
	/**
	 * 	Update De48Se42SfLen500 with the passed value
	 *  Corresponding COBOL Variable is 500-DE48-SE42-SF-LEN
	 *	@param number
	 */
	public void setDe48Se42SfLen500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de48Se42SfLen500 = checkDe48Se42SfLen500MaxLimit(number); 
		serializeDe48Se42SfLen500(de48Se42SfLen500);
	}
	

	public void setDe48Se42SfLen500(long number) {
	    number = checkDe48Se42SfLen500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe48Se42SfLen500((int)number);
	}
	
	/**
	 * 	Update De48Se42SfLen500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe48Se42SfLen500(char[] value) throws CFException {
		 de48Se42SfLen500 = serializeDe48Se42SfLen500(value);
	}
	/**
	 * 	Update De48Se42SfLen500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe48Se42SfLen500String(char[] value) throws CFException {
		 setDe48Se42SfLen500(value);
	}
	/**
	 *	Returns the value of de48Se42SfLen1500
	 *	@return de48Se42SfLen1500
	 */
	public int getDe48Se42SfLen1500() throws CFException {
       if (isDe48Se42SfLen1500Modified()) { 
           de48Se42SfLen1500 = refreshDe48Se42SfLen1500();
        }
   		return de48Se42SfLen1500;
	}
	

	
	   
	/**
	 * 	Update De48Se42SfLen1500 with the passed value
	 *  Corresponding COBOL Variable is 500-DE48-SE42-SF-LEN1
	 *	@param number
	 */
	public void setDe48Se42SfLen1500(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    de48Se42SfLen1500 = checkDe48Se42SfLen1500MaxLimit(number); 
		serializeDe48Se42SfLen1500(de48Se42SfLen1500);
	}
	

	public void setDe48Se42SfLen1500(long number) {
	    number = checkDe48Se42SfLen1500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDe48Se42SfLen1500((int)number);
	}
	
	/**
	 * 	Update De48Se42SfLen1500 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDe48Se42SfLen1500(char[] value) throws CFException {
		 de48Se42SfLen1500 = serializeDe48Se42SfLen1500(value);
	}
	/**
	 * 	Update De48Se42SfLen1500 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDe48Se42SfLen1500String(char[] value) throws CFException {
		 setDe48Se42SfLen1500(value);
	}
	/**
	 *	Returns the value of de48Se66SfId500
	 *	@return de48Se66SfId500
	 */
   public char[] getDe48Se66SfId500() throws CFException{
   		return de48Se66SfId500;
   }

  
	/**
	*  set variable de48Se66SfId500
	*  Corresponding COBOL Variable is 500-DE48-SE66-SF-ID
	*  @param value
	**/
   public void setDe48Se66SfId500(char[] value) {
       value = checkDe48Se66SfId500Constraints(value);
       arraycopy(value,0,de48Se66SfId500,0,value.length);
   } 
	public void setDe48Se66SfId500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de48Se66SfId500,0,beginIndex + endIndex);
   }
	char[] de48Se66Sf018850088Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isDe48Se66Sf0188500()
	 *	@return  Returns true if isDe48Se66Sf0188500() is "01"
	 */
   public boolean isDe48Se66Sf0188500() throws CFException {
      return (  compareChars( getDe48Se66SfId500() , de48Se66Sf018850088Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setDe48Se66Sf0188500True() {  			
    	setDe48Se66SfId500( de48Se66Sf018850088Value);
   	}
	char[] de48Se66Sf028850088Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isDe48Se66Sf0288500()
	 *	@return  Returns true if isDe48Se66Sf0288500() is "02"
	 */
   public boolean isDe48Se66Sf0288500() throws CFException {
      return (  compareChars( getDe48Se66SfId500() , de48Se66Sf028850088Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setDe48Se66Sf0288500True() {  			
    	setDe48Se66SfId500( de48Se66Sf028850088Value);
   	}
	/**
	 *	Returns the value of de48Se24SfId500
	 *	@return de48Se24SfId500
	 */
   public char[] getDe48Se24SfId500() throws CFException{
   		return de48Se24SfId500;
   }

  
	/**
	*  set variable de48Se24SfId500
	*  Corresponding COBOL Variable is 500-DE48-SE24-SF-ID
	*  @param value
	**/
   public void setDe48Se24SfId500(char[] value) {
       value = checkDe48Se24SfId500Constraints(value);
       arraycopy(value,0,de48Se24SfId500,0,value.length);
   } 
	public void setDe48Se24SfId500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de48Se24SfId500,0,beginIndex + endIndex);
   }
	char[] de48Se24Sf018850088Value = "01".toCharArray();
	/**
	 *	Test condition "01" for isDe48Se24Sf0188500()
	 *	@return  Returns true if isDe48Se24Sf0188500() is "01"
	 */
   public boolean isDe48Se24Sf0188500() throws CFException {
      return (  compareChars( getDe48Se24SfId500() , de48Se24Sf018850088Value)  == 0  );
   }


	/**
	*  set values "01"
	*/
   	public void setDe48Se24Sf0188500True() {  			
    	setDe48Se24SfId500( de48Se24Sf018850088Value);
   	}
	char[] de48Se24Sf028850088Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isDe48Se24Sf0288500()
	 *	@return  Returns true if isDe48Se24Sf0288500() is "02"
	 */
   public boolean isDe48Se24Sf0288500() throws CFException {
      return (  compareChars( getDe48Se24SfId500() , de48Se24Sf028850088Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setDe48Se24Sf0288500True() {  			
    	setDe48Se24SfId500( de48Se24Sf028850088Value);
   	}
	char[] de48Se24Sf038850088Value = "03".toCharArray();
	/**
	 *	Test condition "03" for isDe48Se24Sf0388500()
	 *	@return  Returns true if isDe48Se24Sf0388500() is "03"
	 */
   public boolean isDe48Se24Sf0388500() throws CFException {
      return (  compareChars( getDe48Se24SfId500() , de48Se24Sf038850088Value)  == 0  );
   }


	/**
	*  set values "03"
	*/
   	public void setDe48Se24Sf0388500True() {  			
    	setDe48Se24SfId500( de48Se24Sf038850088Value);
   	}
	char[] de48Se24Sf048850088Value = "04".toCharArray();
	/**
	 *	Test condition "04" for isDe48Se24Sf0488500()
	 *	@return  Returns true if isDe48Se24Sf0488500() is "04"
	 */
   public boolean isDe48Se24Sf0488500() throws CFException {
      return (  compareChars( getDe48Se24SfId500() , de48Se24Sf048850088Value)  == 0  );
   }


	/**
	*  set values "04"
	*/
   	public void setDe48Se24Sf0488500True() {  			
    	setDe48Se24SfId500( de48Se24Sf048850088Value);
   	}
	/**
	 *	Returns the value of billlogMsg1600
	 *	@return billlogMsg1600
	 */
   public char[] getBilllogMsg1600() throws CFException{
   		return billlogMsg1600;
   }

  
	/**
	*  set variable billlogMsg1600
	*  Corresponding COBOL Variable is 600-BILLLOG-MSG1
	*  @param value
	**/
   public void setBilllogMsg1600(char[] value) {
       value = checkBilllogMsg1600Constraints(value);
       arraycopy(value,0,billlogMsg1600,0,value.length);
   } 
	public void setBilllogMsg1600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,billlogMsg1600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of billlogMsg2600
	 *	@return billlogMsg2600
	 */
   public char[] getBilllogMsg2600() throws CFException{
   		return billlogMsg2600;
   }

  
	/**
	*  set variable billlogMsg2600
	*  Corresponding COBOL Variable is 600-BILLLOG-MSG2
	*  @param value
	**/
   public void setBilllogMsg2600(char[] value) {
       value = checkBilllogMsg2600Constraints(value);
       arraycopy(value,0,billlogMsg2600,0,value.length);
   } 
	public void setBilllogMsg2600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,billlogMsg2600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of billlogMsg3600
	 *	@return billlogMsg3600
	 */
   public char[] getBilllogMsg3600() throws CFException{
   		return billlogMsg3600;
   }

  
	/**
	*  set variable billlogMsg3600
	*  Corresponding COBOL Variable is 600-BILLLOG-MSG3
	*  @param value
	**/
   public void setBilllogMsg3600(char[] value) {
       value = checkBilllogMsg3600Constraints(value);
       arraycopy(value,0,billlogMsg3600,0,value.length);
   } 
	public void setBilllogMsg3600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,billlogMsg3600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of billlogMsg4600
	 *	@return billlogMsg4600
	 */
   public char[] getBilllogMsg4600() throws CFException{
   		return billlogMsg4600;
   }

  
	/**
	*  set variable billlogMsg4600
	*  Corresponding COBOL Variable is 600-BILLLOG-MSG4
	*  @param value
	**/
   public void setBilllogMsg4600(char[] value) {
       value = checkBilllogMsg4600Constraints(value);
       arraycopy(value,0,billlogMsg4600,0,value.length);
   } 
	public void setBilllogMsg4600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,billlogMsg4600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of voiceMsg600
	 *	@return voiceMsg600
	 */
   public char[] getVoiceMsg600() throws CFException{
   		return voiceMsg600;
   }

  
	/**
	*  set variable voiceMsg600
	*  Corresponding COBOL Variable is 600-VOICE-MSG
	*  @param value
	**/
   public void setVoiceMsg600(char[] value) {
       value = checkVoiceMsg600Constraints(value);
       arraycopy(value,0,voiceMsg600,0,value.length);
   } 
	public void setVoiceMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,voiceMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of parmsMsg600
	 *	@return parmsMsg600
	 */
   public char[] getParmsMsg600() throws CFException{
   		return parmsMsg600;
   }

  
	/**
	*  set variable parmsMsg600
	*  Corresponding COBOL Variable is 600-PARMS-MSG
	*  @param value
	**/
   public void setParmsMsg600(char[] value) {
       value = checkParmsMsg600Constraints(value);
       arraycopy(value,0,parmsMsg600,0,value.length);
   } 
	public void setParmsMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,parmsMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of cycleMsg600
	 *	@return cycleMsg600
	 */
   public char[] getCycleMsg600() throws CFException{
   		return cycleMsg600;
   }

  
	/**
	*  set variable cycleMsg600
	*  Corresponding COBOL Variable is 600-CYCLE-MSG
	*  @param value
	**/
   public void setCycleMsg600(char[] value) {
       value = checkCycleMsg600Constraints(value);
       arraycopy(value,0,cycleMsg600,0,value.length);
   } 
	public void setCycleMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cycleMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mcwinMsg1600
	 *	@return mcwinMsg1600
	 */
   public char[] getMcwinMsg1600() throws CFException{
   		return mcwinMsg1600;
   }

  
	/**
	*  set variable mcwinMsg1600
	*  Corresponding COBOL Variable is 600-MCWIN-MSG1
	*  @param value
	**/
   public void setMcwinMsg1600(char[] value) {
       value = checkMcwinMsg1600Constraints(value);
       arraycopy(value,0,mcwinMsg1600,0,value.length);
   } 
	public void setMcwinMsg1600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcwinMsg1600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mcwinMsg2600
	 *	@return mcwinMsg2600
	 */
   public char[] getMcwinMsg2600() throws CFException{
   		return mcwinMsg2600;
   }

  
	/**
	*  set variable mcwinMsg2600
	*  Corresponding COBOL Variable is 600-MCWIN-MSG2
	*  @param value
	**/
   public void setMcwinMsg2600(char[] value) {
       value = checkMcwinMsg2600Constraints(value);
       arraycopy(value,0,mcwinMsg2600,0,value.length);
   } 
	public void setMcwinMsg2600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcwinMsg2600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of eojMessage650
	 *	@return eojMessage650
	 */
   public char[] getEojMessage650() throws CFException{
   		return eojMessage650;
   }

  
	/**
	*  set variable eojMessage650
	*  Corresponding COBOL Variable is 650-EOJ-MESSAGE
	*  @param value
	**/
   public void setEojMessage650(char[] value) {
       value = checkEojMessage650Constraints(value);
       arraycopy(value,0,eojMessage650,0,value.length);
   } 
	public void setEojMessage650(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eojMessage650,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of logLen800
	 *	@return logLen800
	 */
	public int getLogLen800() throws CFException {
   		return logLen800;
	}
	
	/**
	 * 	Update LogLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-LOG-LEN
	 *	@param number
	 */
	public void setLogLen800(int number) {
	     // Truncate if the number is beyond +/- Max range
	    logLen800 = checkLogLen800MaxLimit(number); 
	}


	public void setLogLen800(long number) {
	    number = checkLogLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLogLen800((int)number);
	}
	
	/**
	 *	Returns the value of mti800
	 *	@return mti800
	 */
   public char[] getMti800() throws CFException{
   		return mti800;
   }

  
	/**
	*  set variable mti800
	*  Corresponding COBOL Variable is 800-MTI
	*  @param value
	**/
   public void setMti800(char[] value) {
       value = checkMti800Constraints(value);
       arraycopy(value,0,mti800,0,value.length);
   } 
	public void setMti800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mti800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of holdCurrCc800
	 *	@return holdCurrCc800
	 */
	public int getHoldCurrCc800() throws CFException {
       if (isHoldCurrCc800Modified()) { 
           holdCurrCc800 = refreshHoldCurrCc800();
        }
   		return holdCurrCc800;
	}
	

	
	   
	/**
	 * 	Update HoldCurrCc800 with the passed value
	 *  Corresponding COBOL Variable is 800-HOLD-CURR-CC
	 *	@param number
	 */
	public void setHoldCurrCc800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    holdCurrCc800 = checkHoldCurrCc800MaxLimit(number); 
		serializeHoldCurrCc800(holdCurrCc800);
	}
	

	public void setHoldCurrCc800(long number) {
	    number = checkHoldCurrCc800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHoldCurrCc800((int)number);
	}
	
	/**
	 * 	Update HoldCurrCc800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setHoldCurrCc800(char[] value) throws CFException {
		 holdCurrCc800 = serializeHoldCurrCc800(value);
	}
	/**
	 * 	Update HoldCurrCc800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHoldCurrCc800String(char[] value) throws CFException {
		 setHoldCurrCc800(value);
	}
	/**
	 *	Returns the value of obscureData800
	 *	@return obscureData800
	 */
   public char[] getObscureData800() throws CFException{
   		return obscureData800;
   }

  
	/**
	*  set variable obscureData800
	*  Corresponding COBOL Variable is 800-OBSCURE-DATA
	*  @param value
	**/
   public void setObscureData800(char[] value) {
       value = checkObscureData800Constraints(value);
       arraycopy(value,0,obscureData800,0,value.length);
   } 
	public void setObscureData800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,obscureData800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of obscurePos800
	 *	@return obscurePos800
	 */
	public int getObscurePos800() throws CFException {
       if (isObscurePos800Modified()) { 
           obscurePos800 = refreshObscurePos800();
        }
   		return obscurePos800;
	}
	

	
	   
	/**
	 * 	Update ObscurePos800 with the passed value
	 *  Corresponding COBOL Variable is 800-OBSCURE-POS
	 *	@param number
	 */
	public void setObscurePos800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    obscurePos800 = checkObscurePos800MaxLimit(number); 
		serializeObscurePos800(obscurePos800);
	}
	

	public void setObscurePos800(long number) {
	    number = checkObscurePos800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setObscurePos800((int)number);
	}
	
	/**
	 * 	Update ObscurePos800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setObscurePos800(char[] value) throws CFException {
		 obscurePos800 = serializeObscurePos800(value);
	}
	/**
	 * 	Update ObscurePos800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setObscurePos800String(char[] value) throws CFException {
		 setObscurePos800(value);
	}
	/**
	 *	Returns the value of obscurePos2800
	 *	@return obscurePos2800
	 */
	public int getObscurePos2800() throws CFException {
       if (isObscurePos2800Modified()) { 
           obscurePos2800 = refreshObscurePos2800();
        }
   		return obscurePos2800;
	}
	

	
	   
	/**
	 * 	Update ObscurePos2800 with the passed value
	 *  Corresponding COBOL Variable is 800-OBSCURE-POS2
	 *	@param number
	 */
	public void setObscurePos2800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    obscurePos2800 = checkObscurePos2800MaxLimit(number); 
		serializeObscurePos2800(obscurePos2800);
	}
	

	public void setObscurePos2800(long number) {
	    number = checkObscurePos2800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setObscurePos2800((int)number);
	}
	
	/**
	 * 	Update ObscurePos2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setObscurePos2800(char[] value) throws CFException {
		 obscurePos2800 = serializeObscurePos2800(value);
	}
	/**
	 * 	Update ObscurePos2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setObscurePos2800String(char[] value) throws CFException {
		 setObscurePos2800(value);
	}
	/**
	 *	Returns the value of obscureStartPos800
	 *	@return obscureStartPos800
	 */
	public int getObscureStartPos800() throws CFException {
       if (isObscureStartPos800Modified()) { 
           obscureStartPos800 = refreshObscureStartPos800();
        }
   		return obscureStartPos800;
	}
	

	
	   
	/**
	 * 	Update ObscureStartPos800 with the passed value
	 *  Corresponding COBOL Variable is 800-OBSCURE-START-POS
	 *	@param number
	 */
	public void setObscureStartPos800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    obscureStartPos800 = checkObscureStartPos800MaxLimit(number); 
		serializeObscureStartPos800(obscureStartPos800);
	}
	

	public void setObscureStartPos800(long number) {
	    number = checkObscureStartPos800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setObscureStartPos800((int)number);
	}
	
	/**
	 * 	Update ObscureStartPos800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setObscureStartPos800(char[] value) throws CFException {
		 obscureStartPos800 = serializeObscureStartPos800(value);
	}
	/**
	 * 	Update ObscureStartPos800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setObscureStartPos800String(char[] value) throws CFException {
		 setObscureStartPos800(value);
	}
	/**
	 *	Returns the value of obscureEndPos800
	 *	@return obscureEndPos800
	 */
	public int getObscureEndPos800() throws CFException {
       if (isObscureEndPos800Modified()) { 
           obscureEndPos800 = refreshObscureEndPos800();
        }
   		return obscureEndPos800;
	}
	

	
	   
	/**
	 * 	Update ObscureEndPos800 with the passed value
	 *  Corresponding COBOL Variable is 800-OBSCURE-END-POS
	 *	@param number
	 */
	public void setObscureEndPos800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    obscureEndPos800 = checkObscureEndPos800MaxLimit(number); 
		serializeObscureEndPos800(obscureEndPos800);
	}
	

	public void setObscureEndPos800(long number) {
	    number = checkObscureEndPos800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setObscureEndPos800((int)number);
	}
	
	/**
	 * 	Update ObscureEndPos800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setObscureEndPos800(char[] value) throws CFException {
		 obscureEndPos800 = serializeObscureEndPos800(value);
	}
	/**
	 * 	Update ObscureEndPos800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setObscureEndPos800String(char[] value) throws CFException {
		 setObscureEndPos800(value);
	}
	/**
	 *	Returns the value of obscureLgth800
	 *	@return obscureLgth800
	 */
	public int getObscureLgth800() throws CFException {
       if (isObscureLgth800Modified()) { 
           obscureLgth800 = refreshObscureLgth800();
        }
   		return obscureLgth800;
	}
	

	
	   
	/**
	 * 	Update ObscureLgth800 with the passed value
	 *  Corresponding COBOL Variable is 800-OBSCURE-LGTH
	 *	@param number
	 */
	public void setObscureLgth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    obscureLgth800 = checkObscureLgth800MaxLimit(number); 
		serializeObscureLgth800(obscureLgth800);
	}
	

	public void setObscureLgth800(long number) {
	    number = checkObscureLgth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setObscureLgth800((int)number);
	}
	
	/**
	 * 	Update ObscureLgth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setObscureLgth800(char[] value) throws CFException {
		 obscureLgth800 = serializeObscureLgth800(value);
	}
	/**
	 * 	Update ObscureLgth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setObscureLgth800String(char[] value) throws CFException {
		 setObscureLgth800(value);
	}
	/**
	 *	Returns the value of hour800
	 *	@return hour800
	 */
	public int getHour800() throws CFException {
       if (isHour800Modified()) { 
           hour800 = refreshHour800();
        }
   		return hour800;
	}
	

	
	   
	/**
	 * 	Update Hour800 with the passed value
	 *  Corresponding COBOL Variable is 800-HOUR
	 *	@param number
	 */
	public void setHour800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    hour800 = checkHour800MaxLimit(number); 
		serializeHour800(hour800);
	}
	

	public void setHour800(long number) {
	    number = checkHour800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setHour800((int)number);
	}
	
	/**
	 * 	Update Hour800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setHour800(char[] value) throws CFException {
		 hour800 = serializeHour800(value);
	}
	/**
	 * 	Update Hour800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setHour800String(char[] value) throws CFException {
		 setHour800(value);
	}
	/**
	 *	Returns the value of min800
	 *	@return min800
	 */
	public int getMin800() throws CFException {
       if (isMin800Modified()) { 
           min800 = refreshMin800();
        }
   		return min800;
	}
	

	
	   
	/**
	 * 	Update Min800 with the passed value
	 *  Corresponding COBOL Variable is 800-MIN
	 *	@param number
	 */
	public void setMin800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    min800 = checkMin800MaxLimit(number); 
		serializeMin800(min800);
	}
	

	public void setMin800(long number) {
	    number = checkMin800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMin800((int)number);
	}
	
	/**
	 * 	Update Min800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMin800(char[] value) throws CFException {
		 min800 = serializeMin800(value);
	}
	/**
	 * 	Update Min800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMin800String(char[] value) throws CFException {
		 setMin800(value);
	}
	/**
	 *	Returns the value of sec800
	 *	@return sec800
	 */
	public int getSec800() throws CFException {
       if (isSec800Modified()) { 
           sec800 = refreshSec800();
        }
   		return sec800;
	}
	

	
	   
	/**
	 * 	Update Sec800 with the passed value
	 *  Corresponding COBOL Variable is 800-SEC
	 *	@param number
	 */
	public void setSec800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    sec800 = checkSec800MaxLimit(number); 
		serializeSec800(sec800);
	}
	

	public void setSec800(long number) {
	    number = checkSec800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSec800((int)number);
	}
	
	/**
	 * 	Update Sec800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setSec800(char[] value) throws CFException {
		 sec800 = serializeSec800(value);
	}
	/**
	 * 	Update Sec800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setSec800String(char[] value) throws CFException {
		 setSec800(value);
	}
	/**
	 *	Returns the value of isoBlResponse1800
	 *	@return isoBlResponse1800
	 */
	public int getIsoBlResponse1800() throws CFException {
       if (isIsoBlResponse1800Modified()) { 
           isoBlResponse1800 = refreshIsoBlResponse1800();
        }
   		return isoBlResponse1800;
	}
	

	
	   
	/**
	 * 	Update IsoBlResponse1800 with the passed value
	 *  Corresponding COBOL Variable is 800-ISO-BL-RESPONSE-1
	 *	@param number
	 */
	public void setIsoBlResponse1800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    isoBlResponse1800 = checkIsoBlResponse1800MaxLimit(number); 
		serializeIsoBlResponse1800(isoBlResponse1800);
	}
	

	public void setIsoBlResponse1800(long number) {
	    number = checkIsoBlResponse1800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsoBlResponse1800((int)number);
	}
	
	/**
	 * 	Update IsoBlResponse1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsoBlResponse1800(char[] value) throws CFException {
		 isoBlResponse1800 = serializeIsoBlResponse1800(value);
	}
	/**
	 * 	Update IsoBlResponse1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsoBlResponse1800String(char[] value) throws CFException {
		 setIsoBlResponse1800(value);
	}
	
	/**
	 *	Test condition 1 for isLimit188800()
	 *	@return  Returns true if isLimit188800() is 1
	 */
   public boolean isLimit188800() throws CFException {
      return (  getIsoBlResponse1800()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setLimit188800True() {  			
    	setIsoBlResponse1800( 1);
   	}
	
	/**
	 *	Test condition 2 for isXcode88800()
	 *	@return  Returns true if isXcode88800() is 2
	 */
   public boolean isXcode88800() throws CFException {
      return (  getIsoBlResponse1800()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setXcode88800True() {  			
    	setIsoBlResponse1800( 2);
   	}
	
	/**
	 *	Test condition 3 for isIssProcDir88800()
	 *	@return  Returns true if isIssProcDir88800() is 3
	 */
   public boolean isIssProcDir88800() throws CFException {
      return (  getIsoBlResponse1800()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIssProcDir88800True() {  			
    	setIsoBlResponse1800( 3);
   	}
	
	/**
	 *	Test condition 4 for isIssProcNonDir88800()
	 *	@return  Returns true if isIssProcNonDir88800() is 4
	 */
   public boolean isIssProcNonDir88800() throws CFException {
      return (  getIsoBlResponse1800()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setIssProcNonDir88800True() {  			
    	setIsoBlResponse1800( 4);
   	}
	
	/**
	 *	Test condition 5 for isDownOption88800()
	 *	@return  Returns true if isDownOption88800() is 5
	 */
   public boolean isDownOption88800() throws CFException {
      return (  getIsoBlResponse1800()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setDownOption88800True() {  			
    	setIsoBlResponse1800( 5);
   	}
	
	/**
	 *	Test condition 6 for isCatRiskLvl388800()
	 *	@return  Returns true if isCatRiskLvl388800() is 6
	 */
   public boolean isCatRiskLvl388800() throws CFException {
      return (  getIsoBlResponse1800()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setCatRiskLvl388800True() {  			
    	setIsoBlResponse1800( 6);
   	}
	
	/**
	 *	Test condition 7 for isSiLimit188800()
	 *	@return  Returns true if isSiLimit188800() is 7
	 */
   public boolean isSiLimit188800() throws CFException {
      return (  getIsoBlResponse1800()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setSiLimit188800True() {  			
    	setIsoBlResponse1800( 7);
   	}
	/**
	 *	Returns the value of isoBlResponse2800
	 *	@return isoBlResponse2800
	 */
	public int getIsoBlResponse2800() throws CFException {
       if (isIsoBlResponse2800Modified()) { 
           isoBlResponse2800 = refreshIsoBlResponse2800();
        }
   		return isoBlResponse2800;
	}
	

	
	   
	/**
	 * 	Update IsoBlResponse2800 with the passed value
	 *  Corresponding COBOL Variable is 800-ISO-BL-RESPONSE-2
	 *	@param number
	 */
	public void setIsoBlResponse2800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    isoBlResponse2800 = checkIsoBlResponse2800MaxLimit(number); 
		serializeIsoBlResponse2800(isoBlResponse2800);
	}
	

	public void setIsoBlResponse2800(long number) {
	    number = checkIsoBlResponse2800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsoBlResponse2800((int)number);
	}
	
	/**
	 * 	Update IsoBlResponse2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsoBlResponse2800(char[] value) throws CFException {
		 isoBlResponse2800 = serializeIsoBlResponse2800(value);
	}
	/**
	 * 	Update IsoBlResponse2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsoBlResponse2800String(char[] value) throws CFException {
		 setIsoBlResponse2800(value);
	}
	
	/**
	 *	Test condition 1 for isTypeI88800()
	 *	@return  Returns true if isTypeI88800() is 1
	 */
   public boolean isTypeI88800() throws CFException {
      return (  getIsoBlResponse2800()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setTypeI88800True() {  			
    	setIsoBlResponse2800( 1);
   	}
	
	/**
	 *	Test condition 2 for isTypeIi88800()
	 *	@return  Returns true if isTypeIi88800() is 2
	 */
   public boolean isTypeIi88800() throws CFException {
      return (  getIsoBlResponse2800()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setTypeIi88800True() {  			
    	setIsoBlResponse2800( 2);
   	}
	
	/**
	 *	Test condition 3 for isTypeIii88800()
	 *	@return  Returns true if isTypeIii88800() is 3
	 */
   public boolean isTypeIii88800() throws CFException {
      return (  getIsoBlResponse2800()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setTypeIii88800True() {  			
    	setIsoBlResponse2800( 3);
   	}
	
	/**
	 *	Test condition 4 for isTypeIv88800()
	 *	@return  Returns true if isTypeIv88800() is 4
	 */
   public boolean isTypeIv88800() throws CFException {
      return (  getIsoBlResponse2800()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setTypeIv88800True() {  			
    	setIsoBlResponse2800( 4);
   	}
	
	/**
	 *	Test condition 5 for isTypeV88800()
	 *	@return  Returns true if isTypeV88800() is 5
	 */
   public boolean isTypeV88800() throws CFException {
      return (  getIsoBlResponse2800()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setTypeV88800True() {  			
    	setIsoBlResponse2800( 5);
   	}
	/**
	 *	Returns the value of isoBlDown1800
	 *	@return isoBlDown1800
	 */
	public int getIsoBlDown1800() throws CFException {
       if (isIsoBlDown1800Modified()) { 
           isoBlDown1800 = refreshIsoBlDown1800();
        }
   		return isoBlDown1800;
	}
	

	
	   
	/**
	 * 	Update IsoBlDown1800 with the passed value
	 *  Corresponding COBOL Variable is 800-ISO-BL-DOWN-1
	 *	@param number
	 */
	public void setIsoBlDown1800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    isoBlDown1800 = checkIsoBlDown1800MaxLimit(number); 
		serializeIsoBlDown1800(isoBlDown1800);
	}
	

	public void setIsoBlDown1800(long number) {
	    number = checkIsoBlDown1800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsoBlDown1800((int)number);
	}
	
	/**
	 * 	Update IsoBlDown1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsoBlDown1800(char[] value) throws CFException {
		 isoBlDown1800 = serializeIsoBlDown1800(value);
	}
	/**
	 * 	Update IsoBlDown1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsoBlDown1800String(char[] value) throws CFException {
		 setIsoBlDown1800(value);
	}
	
	/**
	 *	Test condition 0 for isDownNo88800()
	 *	@return  Returns true if isDownNo88800() is 0
	 */
   public boolean isDownNo88800() throws CFException {
      return (  getIsoBlDown1800()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setDownNo88800True() {  			
    	setIsoBlDown1800( 0);
   	}
	
	/**
	 *	Test condition 1 for isDownTimeOut88800()
	 *	@return  Returns true if isDownTimeOut88800() is 1
	 */
   public boolean isDownTimeOut88800() throws CFException {
      return (  getIsoBlDown1800()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDownTimeOut88800True() {  			
    	setIsoBlDown1800( 1);
   	}
	
	/**
	 *	Test condition 2 for isDownNotDispatch88800()
	 *	@return  Returns true if isDownNotDispatch88800() is 2
	 */
   public boolean isDownNotDispatch88800() throws CFException {
      return (  getIsoBlDown1800()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setDownNotDispatch88800True() {  			
    	setIsoBlDown1800( 2);
   	}
	
	/**
	 *	Test condition 3 for isDownNotDeliver88800()
	 *	@return  Returns true if isDownNotDeliver88800() is 3
	 */
   public boolean isDownNotDeliver88800() throws CFException {
      return (  getIsoBlDown1800()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setDownNotDeliver88800True() {  			
    	setIsoBlDown1800( 3);
   	}
	
	/**
	 *	Test condition 4 for isDownSignOut88800()
	 *	@return  Returns true if isDownSignOut88800() is 4
	 */
   public boolean isDownSignOut88800() throws CFException {
      return (  getIsoBlDown1800()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setDownSignOut88800True() {  			
    	setIsoBlDown1800( 4);
   	}
	
	/**
	 *	Test condition 5 for isDownMisRoute88800()
	 *	@return  Returns true if isDownMisRoute88800() is 5
	 */
   public boolean isDownMisRoute88800() throws CFException {
      return (  getIsoBlDown1800()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setDownMisRoute88800True() {  			
    	setIsoBlDown1800( 5);
   	}
	
	/**
	 *	Test condition 6 for isDownSentDirect88800()
	 *	@return  Returns true if isDownSentDirect88800() is 6
	 */
   public boolean isDownSentDirect88800() throws CFException {
      return (  getIsoBlDown1800()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setDownSentDirect88800True() {  			
    	setIsoBlDown1800( 6);
   	}
	
	/**
	 *	Test condition 7 for isDownMipSysErr88800()
	 *	@return  Returns true if isDownMipSysErr88800() is 7
	 */
   public boolean isDownMipSysErr88800() throws CFException {
      return (  getIsoBlDown1800()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setDownMipSysErr88800True() {  			
    	setIsoBlDown1800( 7);
   	}
	
	/**
	 *	Test condition 8 for isDownRespEditErr88800()
	 *	@return  Returns true if isDownRespEditErr88800() is 8
	 */
   public boolean isDownRespEditErr88800() throws CFException {
      return (  getIsoBlDown1800()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setDownRespEditErr88800True() {  			
    	setIsoBlDown1800( 8);
   	}
	
	/**
	 *	Test condition 9 for isDownIssHostSys88800()
	 *	@return  Returns true if isDownIssHostSys88800() is 9
	 */
   public boolean isDownIssHostSys88800() throws CFException {
      return (  getIsoBlDown1800()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setDownIssHostSys88800True() {  			
    	setIsoBlDown1800( 9);
   	}
	/**
	 *	Returns the value of isoBlDown2800
	 *	@return isoBlDown2800
	 */
	public int getIsoBlDown2800() throws CFException {
       if (isIsoBlDown2800Modified()) { 
           isoBlDown2800 = refreshIsoBlDown2800();
        }
   		return isoBlDown2800;
	}
	

	
	   
	/**
	 * 	Update IsoBlDown2800 with the passed value
	 *  Corresponding COBOL Variable is 800-ISO-BL-DOWN-2
	 *	@param number
	 */
	public void setIsoBlDown2800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    isoBlDown2800 = checkIsoBlDown2800MaxLimit(number); 
		serializeIsoBlDown2800(isoBlDown2800);
	}
	

	public void setIsoBlDown2800(long number) {
	    number = checkIsoBlDown2800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsoBlDown2800((int)number);
	}
	
	/**
	 * 	Update IsoBlDown2800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsoBlDown2800(char[] value) throws CFException {
		 isoBlDown2800 = serializeIsoBlDown2800(value);
	}
	/**
	 * 	Update IsoBlDown2800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsoBlDown2800String(char[] value) throws CFException {
		 setIsoBlDown2800(value);
	}
	
	/**
	 *	Test condition 0 for isXcodeNo88800()
	 *	@return  Returns true if isXcodeNo88800() is 0
	 */
   public boolean isXcodeNo88800() throws CFException {
      return (  getIsoBlDown2800()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setXcodeNo88800True() {  			
    	setIsoBlDown2800( 0);
   	}
	
	/**
	 *	Test condition 1 for isXcodeTimeOut88800()
	 *	@return  Returns true if isXcodeTimeOut88800() is 1
	 */
   public boolean isXcodeTimeOut88800() throws CFException {
      return (  getIsoBlDown2800()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setXcodeTimeOut88800True() {  			
    	setIsoBlDown2800( 1);
   	}
	
	/**
	 *	Test condition 2 for isXcodeNotDispatch88800()
	 *	@return  Returns true if isXcodeNotDispatch88800() is 2
	 */
   public boolean isXcodeNotDispatch88800() throws CFException {
      return (  getIsoBlDown2800()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setXcodeNotDispatch88800True() {  			
    	setIsoBlDown2800( 2);
   	}
	
	/**
	 *	Test condition 3 for isXcodeNotDeliver88800()
	 *	@return  Returns true if isXcodeNotDeliver88800() is 3
	 */
   public boolean isXcodeNotDeliver88800() throws CFException {
      return (  getIsoBlDown2800()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setXcodeNotDeliver88800True() {  			
    	setIsoBlDown2800( 3);
   	}
	
	/**
	 *	Test condition 4 for isXcodeNotAllowed88800()
	 *	@return  Returns true if isXcodeNotAllowed88800() is 4
	 */
   public boolean isXcodeNotAllowed88800() throws CFException {
      return (  getIsoBlDown2800()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setXcodeNotAllowed88800True() {  			
    	setIsoBlDown2800( 4);
   	}
	
	/**
	 *	Test condition 5 for isXcodeMisRoute88800()
	 *	@return  Returns true if isXcodeMisRoute88800() is 5
	 */
   public boolean isXcodeMisRoute88800() throws CFException {
      return (  getIsoBlDown2800()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setXcodeMisRoute88800True() {  			
    	setIsoBlDown2800( 5);
   	}
	
	/**
	 *	Test condition 7 for isXcodeMipSys88800()
	 *	@return  Returns true if isXcodeMipSys88800() is 7
	 */
   public boolean isXcodeMipSys88800() throws CFException {
      return (  getIsoBlDown2800()  ==  7  );
   }


	/**
	*  set values 7
	*/
   	public void setXcodeMipSys88800True() {  			
    	setIsoBlDown2800( 7);
   	}
	
	/**
	 *	Test condition 8 for isXcodeRespEditErr88800()
	 *	@return  Returns true if isXcodeRespEditErr88800() is 8
	 */
   public boolean isXcodeRespEditErr88800() throws CFException {
      return (  getIsoBlDown2800()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setXcodeRespEditErr88800True() {  			
    	setIsoBlDown2800( 8);
   	}
	
	/**
	 *	Test condition 9 for isXcodeAltHostSys88800()
	 *	@return  Returns true if isXcodeAltHostSys88800() is 9
	 */
   public boolean isXcodeAltHostSys88800() throws CFException {
      return (  getIsoBlDown2800()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setXcodeAltHostSys88800True() {  			
    	setIsoBlDown2800( 9);
   	}
	/**
	 *	Returns the value of isoBlMoto1800
	 *	@return isoBlMoto1800
	 */
	public int getIsoBlMoto1800() throws CFException {
       if (isIsoBlMoto1800Modified()) { 
           isoBlMoto1800 = refreshIsoBlMoto1800();
        }
   		return isoBlMoto1800;
	}
	

	
	   
	/**
	 * 	Update IsoBlMoto1800 with the passed value
	 *  Corresponding COBOL Variable is 800-ISO-BL-MOTO-1
	 *	@param number
	 */
	public void setIsoBlMoto1800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    isoBlMoto1800 = checkIsoBlMoto1800MaxLimit(number); 
		serializeIsoBlMoto1800(isoBlMoto1800);
	}
	

	public void setIsoBlMoto1800(long number) {
	    number = checkIsoBlMoto1800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setIsoBlMoto1800((int)number);
	}
	
	/**
	 * 	Update IsoBlMoto1800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setIsoBlMoto1800(char[] value) throws CFException {
		 isoBlMoto1800 = serializeIsoBlMoto1800(value);
	}
	/**
	 * 	Update IsoBlMoto1800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIsoBlMoto1800String(char[] value) throws CFException {
		 setIsoBlMoto1800(value);
	}
	
	/**
	 *	Test condition 8 for isMotoOn88800()
	 *	@return  Returns true if isMotoOn88800() is 8
	 */
   public boolean isMotoOn88800() throws CFException {
      return (  getIsoBlMoto1800()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setMotoOn88800True() {  			
    	setIsoBlMoto1800( 8);
   	}
	
	/**
	 *	Test condition 4 for isForceIss88800()
	 *	@return  Returns true if isForceIss88800() is 4
	 */
   public boolean isForceIss88800() throws CFException {
      return (  getIsoBlMoto1800()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setForceIss88800True() {  			
    	setIsoBlMoto1800( 4);
   	}
	
	/**
	 *	Test condition 2 for isChipCard88800()
	 *	@return  Returns true if isChipCard88800() is 2
	 */
   public boolean isChipCard88800() throws CFException {
      return (  getIsoBlMoto1800()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setChipCard88800True() {  			
    	setIsoBlMoto1800( 2);
   	}
	
	/**
	 *	Test condition 1 for isAcqCcSupport88800()
	 *	@return  Returns true if isAcqCcSupport88800() is 1
	 */
   public boolean isAcqCcSupport88800() throws CFException {
      return (  getIsoBlMoto1800()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setAcqCcSupport88800True() {  			
    	setIsoBlMoto1800( 1);
   	}
	/**
	 *	Returns the value of mciwinReturnCode
	 *	@return mciwinReturnCode
	 */
	public int getMciwinReturnCode() throws CFException {
       if (isMciwinReturnCodeModified()) { 
           mciwinReturnCode = refreshMciwinReturnCode();
        }
   		return mciwinReturnCode;
	}
	

	
	   
	/**
	 * 	Update MciwinReturnCode with the passed value
	 *  Corresponding COBOL Variable is MCIWIN-RETURN-CODE
	 *	@param number
	 */
	public void setMciwinReturnCode(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mciwinReturnCode = checkMciwinReturnCodeMaxLimit(number); 
		serializeMciwinReturnCode(mciwinReturnCode);
	}
	

	public void setMciwinReturnCode(long number) {
	    number = checkMciwinReturnCodeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMciwinReturnCode((int)number);
	}
	
	/**
	 * 	Update MciwinReturnCode with the passed value
	 *	@param value (String or char[])
	 */
	public void setMciwinReturnCode(char[] value) throws CFException {
		 mciwinReturnCode = serializeMciwinReturnCode(value);
	}
	/**
	 * 	Update MciwinReturnCode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMciwinReturnCodeString(char[] value) throws CFException {
		 setMciwinReturnCode(value);
	}
	/**
	 *	Returns the value of mcwinProgram
	 *	@return mcwinProgram
	 */
   public char[] getMcwinProgram() throws CFException{
   		return mcwinProgram;
   }

  
	/**
	*  set variable mcwinProgram
	*  Corresponding COBOL Variable is MCWIN-PROGRAM
	*  @param value
	**/
   public void setMcwinProgram(char[] value) {
       value = checkMcwinProgramConstraints(value);
       arraycopy(value,0,mcwinProgram,0,value.length);
   } 
	public void setMcwinProgram(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcwinProgram,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of mciabendNodump
	 *	@return mciabendNodump
	 */
   public char[] getMciabendNodump() throws CFException{
   		return mciabendNodump;
   }

  
	/**
	*  set variable mciabendNodump
	*  Corresponding COBOL Variable is MCIABEND-NODUMP
	*  @param value
	**/
   public void setMciabendNodump(char[] value) {
       value = checkMciabendNodumpConstraints(value);
       arraycopy(value,0,mciabendNodump,0,value.length);
   } 
	public void setMciabendNodump(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mciabendNodump,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seprPtrSi994020
	 *	@return seprPtrSi994020
	 */
   public char[] getSeprPtrSi994020() throws CFException{
   		return seprPtrSi994020;
   }

  
	/**
	*  set variable seprPtrSi994020
	*  Corresponding COBOL Variable is SEPR-PTR-SI994020
	*  @param value
	**/
   public void setSeprPtrSi994020(char[] value) {
       value = checkSeprPtrSi994020Constraints(value);
       arraycopy(value,0,seprPtrSi994020,0,value.length);
   } 
	public void setSeprPtrSi994020(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seprPtrSi994020,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of seprCallSi994020
	 *	@return seprCallSi994020
	 */
   public char[] getSeprCallSi994020() throws CFException{
   		return seprCallSi994020;
   }

  
	/**
	*  set variable seprCallSi994020
	*  Corresponding COBOL Variable is SEPR-CALL-SI994020
	*  @param value
	**/
   public void setSeprCallSi994020(char[] value) {
       value = checkSeprCallSi994020Constraints(value);
       arraycopy(value,0,seprCallSi994020,0,value.length);
   } 
	public void setSeprCallSi994020(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,seprCallSi994020,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
