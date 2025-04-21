package com.cloudframe.app.ip989010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] firstTimeSw100 = new char[1];

						private char[] sys001FirstRecSw100 = new char[1];

						private char[] sys002FirstRecSw100 = new char[1];

						private char[] sys003FirstRecSw100 = new char[1];

						private char[] sys004FirstRecSw100 = new char[1];

						private char[] eofSys001Sw100 = new char[1];

						private char[] eofSys003Sw100 = new char[1];

						private char[] eofSys004Sw100 = new char[1];

						private char[] sys001StatusSw100 = new char[1];

						private char[] sys002StatusSw100 = new char[1];

						private char[] sys003StatusSw100 = new char[1];

						private char[] sys004StatusSw100 = new char[1];

						private char[] sys005StatusSw100 = new char[1];

						private char[] sys101StatusSw100 = new char[1];

						private char[] sys201StatusSw100 = new char[1];

						private char[] sys202StatusSw100 = new char[1];

						private char[] sys204StatusSw100 = new char[1];

						private char[] sys205StatusSw100 = new char[1];

						private char[] isItOddOrEvenByte100 = new char[1];

						private char[] allRecordsPrcd100 = new char[1];

						private char[] irdSelected100 = new char[1];

						private char[] c300 = new char[1];

						private char[] d300 = new char[1];

						private char[] m300 = new char[1];

						private char[] p300 = new char[1];

						private char[] pgmIp989010300 = new char[8];

						private char[] pgmIp169410300 = new char[8];

						private char[] pgmIp280010300 = new char[8];

						private char[] pgmIp610010300 = new char[8];

						private char[] pgmIp666010300 = new char[8];

						private char[] pgmIp666030300 = new char[8];

						private char[] pgmIp670010300 = new char[8];

						private char[] pgmIp996010300 = new char[8];

						private char[] pgmVersion300 = new char[7];

						private char[] msgEndTag300 = new char[6];

						private char[] pdsEndTag300 = new char[6];

						private char[] deEndTag300 = new char[5];

						private char[] subfldTagStr300 = new char[3];

						private char[] subfldTagEnd300 = new char[4];

								private int abendCode3003002;

								private int abendCode3003003;

								private int abendCode3003004;

								private int abendCode3003005;

								private int abendCode3003006;

								private int abendCode3003008;

								private int abendCode3003009;

								private int abendCode3003014;

								private int abendCode3003015;

								private int abendCode3003016;

								private int abendCode3003017;

						private char[] sys001300 = new char[6];

						private char[] sys002300 = new char[6];

						private char[] sys003300 = new char[6];

						private char[] sys004300 = new char[6];

						private char[] sys005300 = new char[6];

						private char[] sys101300 = new char[6];

						private char[] sys201300 = new char[6];

						private char[] sys202300 = new char[6];

						private char[] sys204300 = new char[6];

						private char[] sys205300 = new char[6];

						private char[] pds0023300 = new char[10];

						private char[] pds0148300 = new char[10];

						private char[] pds0122300 = new char[10];

						private char[] de3s1300 = new char[10];

						private char[] de22300 = new char[10];

						private char[] de26300 = new char[10];

						private char[] de42300 = new char[10];

						private char[] de43s2300 = new char[10];

						private char[] de43s3300 = new char[10];

						private char[] de43s4300 = new char[10];

						private char[] de43s5300 = new char[10];

						private char[] de43s6300 = new char[10];

						private char[] de49300 = new char[10];

						private char[] date300 = new char[4];

						private char[] type1300 = new char[10];

						private char[] ica1300 = new char[10];

						private char[] bin1300 = new char[10];

						private char[] maid1300 = new char[10];

						private char[] endpoint1300 = new char[10];

						private char[] type2300 = new char[10];

						private char[] ica2300 = new char[10];

						private char[] bin2300 = new char[10];

						private char[] maid2300 = new char[10];

						private char[] endpoint2300 = new char[10];

						private char[] value75300 = new char[2];

						private char[] value01300 = new char[2];

						private char[] valueWa300 = new char[2];

						private char[] value65300 = new char[2];

								private int dfltMaxLen300;

						private char[] para1150300 = new char[41];

						private char[] para1200300 = new char[41];

						private char[] para1510300 = new char[41];

						private char[] para1610300 = new char[41];

						private char[] para2100300 = new char[41];

						private char[] para2200300 = new char[41];

						private char[] para2310300 = new char[41];

						private char[] para2512300 = new char[41];

						private char[] para3110300 = new char[41];

						private char[] para3120300 = new char[41];

						private char[] para8600300 = new char[41];

						private char[] para80001240200300 = new char[41];

						private char[] para80001644695300 = new char[41];

						private char[] para80001644697300 = new char[41];

						private char[] para8000Comn300 = new char[41];

						private char[] para8800300 = new char[41];

						private char[] para8000300 = new char[41];

								private int sys001RecsRead400;

								private int sys003RecsRead400;

								private int sys004RecsRead400;

								private int sys101RecsWrit400;

								private int sys201RecsWrit400;

								private int sys202RecsWrit400;

								private int sys204RecsWrit400;

								private int sys205RecsWrit400;

								private int loopCntr400;

								private int comnTblItems500;

								private int comnTblMax500;

						private char[] comnTblSrchKey500 = Field.fillLowValue(13);

						private char[] comnSrchKeyFndSw500 = Field.fillLowValue(1);

								private int tblItems5001240200;

								private int tblMax5001240200;

						private char[] tblSrchKey5001240200 = Field.fillLowValue(13);

						private char[] srchKeyFndSw5001240200 = Field.fillLowValue(1);

								private int tblItems5001644695;

								private int tblMax5001644695;

						private char[] tblSrchKey5001644695 = Field.fillLowValue(13);

						private char[] srchKeyFndSw5001644695 = Field.fillLowValue(1);

								private int tblItems5001644697;

								private int tblMax5001644697;

						private char[] tblSrchKey5001644697 = Field.fillLowValue(13);

						private char[] srchKeyFndSw5001644697 = Field.fillLowValue(1);

								private int rowCount500;

								private int rowCount502;

								private int rowCount501;

						private char[] allLineText600 = new char[99];

						private char[] headerText600 = new char[101];

						private char[] lineText600 = new char[99];

						private char[] errorMsg6003015 = new char[41];

						private char[] errorMsg6003016 = new char[41];

						private char[] errorMsg6003017 = new char[41];

								private int errorCode600;

						private char[] errorText600 = new char[99];

						private char[] brandProduct800 = new char[3];

								private int fldNameLen800;

						private char[] fldName800 = Field.fillLowValue(10);

						private char[] fldValue800 = Field.fillLowValue(65);

								private int fldLen800;

								private int oldFldLen800;

								private int padLen800;

						private char[] ptrAbend800 = new char[8];

						private char[] ptrIp169410800 = new char[8];

						private char[] ptrIp666010800 = new char[8];

						private char[] ptrIp666030800 = new char[8];

						private char[] ptrIp670010800 = new char[8];

						private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFirstTimeSw100(("Y").toCharArray());
								setSys001FirstRecSw100(("Y").toCharArray());
								setSys002FirstRecSw100(("Y").toCharArray());
								setSys003FirstRecSw100(("Y").toCharArray());
								setSys004FirstRecSw100(("Y").toCharArray());
								setEofSys001Sw100(("N").toCharArray());
								setEofSys003Sw100(("N").toCharArray());
								setEofSys004Sw100(("N").toCharArray());
								setSys001StatusSw100(("C").toCharArray());
								setSys002StatusSw100(("C").toCharArray());
								setSys003StatusSw100(("C").toCharArray());
								setSys004StatusSw100(("C").toCharArray());
								setSys005StatusSw100(("C").toCharArray());
								setSys101StatusSw100(("C").toCharArray());
								setSys201StatusSw100(("C").toCharArray());
								setSys202StatusSw100(("C").toCharArray());
								setSys204StatusSw100(("C").toCharArray());
								setSys205StatusSw100(("C").toCharArray());
								setIsItOddOrEvenByte100(("O").toCharArray());
								setAllRecordsPrcd100(("N").toCharArray());
								setIrdSelected100(("N").toCharArray());
								setC300(("C").toCharArray());
								setD300(("D").toCharArray());
								setM300(("M").toCharArray());
								setP300(("P").toCharArray());
								setPgmIp989010300(("IP989010").toCharArray());
								setPgmIp169410300(("IP169410").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setPgmIp666010300(("IP666010").toCharArray());
								setPgmIp666030300(("IP666030").toCharArray());
								setPgmIp670010300(("IP670010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xF2,(byte)0xA9,(byte)0x01,(byte)0x70,(byte)0x96,(byte)0x00}).toCharArray());
								setMsgEndTag300(("</msg>").toCharArray());
								setPdsEndTag300(("</pds>").toCharArray());
								setDeEndTag300(("</de>").toCharArray());
								setSubfldTagStr300(("<s>").toCharArray());
								setSubfldTagEnd300(("</s>").toCharArray());
								setAbendCode3003002(3002);
								setAbendCode3003003(3003);
								setAbendCode3003004(3004);
								setAbendCode3003005(3005);
								setAbendCode3003006(3006);
								setAbendCode3003008(3008);
								setAbendCode3003009(3009);
								setAbendCode3003014(3014);
								setAbendCode3003015(3015);
								setAbendCode3003016(3016);
								setAbendCode3003017(3017);
								setSys001300(("SYS001").toCharArray());
								setSys002300(("SYS002").toCharArray());
								setSys003300(("SYS003").toCharArray());
								setSys004300(("SYS004").toCharArray());
								setSys005300(("SYS005").toCharArray());
								setSys101300(("SYS101").toCharArray());
								setSys201300(("SYS201").toCharArray());
								setSys202300(("SYS202").toCharArray());
								setSys204300(("SYS204").toCharArray());
								setSys205300(("SYS205").toCharArray());
								setPds0023300(("PDS0023   ").toCharArray());
								setPds0148300(("PDS0148   ").toCharArray());
								setPds0122300(("PDS0122   ").toCharArray());
								setDe3s1300(("DE3S1     ").toCharArray());
								setDe22300(("DE22      ").toCharArray());
								setDe26300(("DE26      ").toCharArray());
								setDe42300(("DE42      ").toCharArray());
								setDe43s2300(("DE43S2    ").toCharArray());
								setDe43s3300(("DE43S3    ").toCharArray());
								setDe43s4300(("DE43S4    ").toCharArray());
								setDe43s5300(("DE43S5    ").toCharArray());
								setDe43s6300(("DE43S6    ").toCharArray());
								setDe49300(("DE49      ").toCharArray());
								setDate300(("DATE").toCharArray());
								setType1300(("TYPE1     ").toCharArray());
								setIca1300(("ICA1      ").toCharArray());
								setBin1300(("BIN1      ").toCharArray());
								setMaid1300(("MAID1     ").toCharArray());
								setEndpoint1300(("ENDPOINT1 ").toCharArray());
								setType2300(("TYPE2     ").toCharArray());
								setIca2300(("ICA2      ").toCharArray());
								setBin2300(("BIN2      ").toCharArray());
								setMaid2300(("MAID2     ").toCharArray());
								setEndpoint2300(("ENDPOINT2 ").toCharArray());
								setValue75300(("75").toCharArray());
								setValue01300(("01").toCharArray());
								setValueWa300(("WA").toCharArray());
								setValue65300(("65").toCharArray());
								setDfltMaxLen300(49);
								setPara1150300(("1150-VALIDATE-PARMS                      ").toCharArray());
								setPara1200300(("1200-OPEN-FILES                          ").toCharArray());
								setPara1510300(("1510-READ-LOAD-REGISTN-FILE              ").toCharArray());
								setPara1610300(("1610-READ-LOAD-BP-IRD-FILE               ").toCharArray());
								setPara2100300(("2100-READ-SYS003                         ").toCharArray());
								setPara2200300(("2200-WRITE-SYS101                        ").toCharArray());
								setPara2310300(("2310-STORE-COMN-FIELD                    ").toCharArray());
								setPara2512300(("2512-SEARCH-REGISTRATIN-TABLE            ").toCharArray());
								setPara3110300(("3110-WRITE-SYS202                        ").toCharArray());
								setPara3120300(("3120-WRITE-SYS204                        ").toCharArray());
								setPara8600300(("8600-WRITE-EXCEPTION-RECORDS             ").toCharArray());
								setPara80001240200300(("500-PARA-8000-1240200                    ").toCharArray());
								setPara80001644695300(("500-PARA-8000-1644695                    ").toCharArray());
								setPara80001644697300(("500-PARA-8000-1644697                    ").toCharArray());
								setPara8000Comn300(("500-PARA-8000-COMN                       ").toCharArray());
								setPara8800300(("8800-CALL-DATE-ROUTINE                   ").toCharArray());
								setPara8000300(("8000-READ-SYS001                         ").toCharArray());
								setSys001RecsRead400(0);
								setSys003RecsRead400(0);
								setSys004RecsRead400(0);
								setSys101RecsWrit400(0);
								setSys201RecsWrit400(0);
								setSys202RecsWrit400(0);
								setSys204RecsWrit400(0);
								setSys205RecsWrit400(0);
								setLoopCntr400(0);
								setComnTblItems500(0);
								setComnTblMax500(75);
								setTblItems5001240200(0);
								setTblMax5001240200(75);
								setTblItems5001644695(0);
								setTblMax5001644695(75);
								setTblItems5001644697(0);
								setTblMax5001644697(75);
								setAllLineText600("===================================================================================================".toCharArray());
								setHeaderText600("PAN ALIAS                            DONATION LIMIT CALCULATED DONATION AMT  DONATION AMT - APPLIED  ".toCharArray());
								setLineText600("==================================== ============== =======================  ======================".toCharArray());
								setErrorMsg6003015(("INVALID PROGRAM PARAMTERS SPECIFIED      ").toCharArray());
								setErrorMsg6003016(("TABLE EXCEEDED MAX LIMIT                 ").toCharArray());
								setErrorMsg6003017(("PAN ALIAS DONT HAVE THE MATCHING PAN     ").toCharArray());
								setErrorCode600(0);
								setErrorText600(pad(99," ".toCharArray(),' ',RIGHT_PAD));
								setBrandProduct800(fillSpace(3));
								setPtrAbend800(("IP610010").toCharArray());
								setPtrIp169410800(("IP169410").toCharArray());
								setPtrIp666010800(("IP666010").toCharArray());
								setPtrIp666030800(("IP666030").toCharArray());
								setPtrIp670010800(("IP670010").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }


 

	/**
	 *	Returns the value of firstTimeSw100
	 *	@return firstTimeSw100
	 */
   public char[] getFirstTimeSw100() throws CFException{
   		return firstTimeSw100;
   }

  
	/**
	*  set variable firstTimeSw100
	*  Corresponding COBOL Variable is 100-FIRST-TIME-SW
	*  @param value
	**/
   public void setFirstTimeSw100(char[] value) {
       value = checkFirstTimeSw100Constraints(value);
       arraycopy(value,0,firstTimeSw100,0,value.length);
   } 
	public void setFirstTimeSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstTimeSw100,0,beginIndex + endIndex);
   }
	char[] notFirstTime10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNotFirstTime100()
	 *	@return  Returns true if isNotFirstTime100() is "N"
	 */
   public boolean isNotFirstTime100() throws CFException {
      return (  compareChars( getFirstTimeSw100() , notFirstTime10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNotFirstTime100True() {  			
    	setFirstTimeSw100( notFirstTime10088Value);
   	}
	char[] firstTime10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirstTime100()
	 *	@return  Returns true if isFirstTime100() is "Y"
	 */
   public boolean isFirstTime100() throws CFException {
      return (  compareChars( getFirstTimeSw100() , firstTime10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirstTime100True() {  			
    	setFirstTimeSw100( firstTime10088Value);
   	}
	/**
	 *	Returns the value of sys001FirstRecSw100
	 *	@return sys001FirstRecSw100
	 */
   public char[] getSys001FirstRecSw100() throws CFException{
   		return sys001FirstRecSw100;
   }

  
	/**
	*  set variable sys001FirstRecSw100
	*  Corresponding COBOL Variable is 100-SYS001-FIRST-REC-SW
	*  @param value
	**/
   public void setSys001FirstRecSw100(char[] value) {
       value = checkSys001FirstRecSw100Constraints(value);
       arraycopy(value,0,sys001FirstRecSw100,0,value.length);
   } 
	public void setSys001FirstRecSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001FirstRecSw100,0,beginIndex + endIndex);
   }
	char[] sys001FirstRec10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSys001FirstRec100()
	 *	@return  Returns true if isSys001FirstRec100() is "Y"
	 */
   public boolean isSys001FirstRec100() throws CFException {
      return (  compareChars( getSys001FirstRecSw100() , sys001FirstRec10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSys001FirstRec100True() {  			
    	setSys001FirstRecSw100( sys001FirstRec10088Value);
   	}
	char[] sys001NotFirstRec10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSys001NotFirstRec100()
	 *	@return  Returns true if isSys001NotFirstRec100() is "N"
	 */
   public boolean isSys001NotFirstRec100() throws CFException {
      return (  compareChars( getSys001FirstRecSw100() , sys001NotFirstRec10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSys001NotFirstRec100True() {  			
    	setSys001FirstRecSw100( sys001NotFirstRec10088Value);
   	}
	/**
	 *	Returns the value of sys002FirstRecSw100
	 *	@return sys002FirstRecSw100
	 */
   public char[] getSys002FirstRecSw100() throws CFException{
   		return sys002FirstRecSw100;
   }

  
	/**
	*  set variable sys002FirstRecSw100
	*  Corresponding COBOL Variable is 100-SYS002-FIRST-REC-SW
	*  @param value
	**/
   public void setSys002FirstRecSw100(char[] value) {
       value = checkSys002FirstRecSw100Constraints(value);
       arraycopy(value,0,sys002FirstRecSw100,0,value.length);
   } 
	public void setSys002FirstRecSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys002FirstRecSw100,0,beginIndex + endIndex);
   }
	char[] sys002FirstRec10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSys002FirstRec100()
	 *	@return  Returns true if isSys002FirstRec100() is "Y"
	 */
   public boolean isSys002FirstRec100() throws CFException {
      return (  compareChars( getSys002FirstRecSw100() , sys002FirstRec10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSys002FirstRec100True() {  			
    	setSys002FirstRecSw100( sys002FirstRec10088Value);
   	}
	char[] sys002NotFirstRec10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSys002NotFirstRec100()
	 *	@return  Returns true if isSys002NotFirstRec100() is "N"
	 */
   public boolean isSys002NotFirstRec100() throws CFException {
      return (  compareChars( getSys002FirstRecSw100() , sys002NotFirstRec10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSys002NotFirstRec100True() {  			
    	setSys002FirstRecSw100( sys002NotFirstRec10088Value);
   	}
	/**
	 *	Returns the value of sys003FirstRecSw100
	 *	@return sys003FirstRecSw100
	 */
   public char[] getSys003FirstRecSw100() throws CFException{
   		return sys003FirstRecSw100;
   }

  
	/**
	*  set variable sys003FirstRecSw100
	*  Corresponding COBOL Variable is 100-SYS003-FIRST-REC-SW
	*  @param value
	**/
   public void setSys003FirstRecSw100(char[] value) {
       value = checkSys003FirstRecSw100Constraints(value);
       arraycopy(value,0,sys003FirstRecSw100,0,value.length);
   } 
	public void setSys003FirstRecSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys003FirstRecSw100,0,beginIndex + endIndex);
   }
	char[] sys003FirstRec10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSys003FirstRec100()
	 *	@return  Returns true if isSys003FirstRec100() is "Y"
	 */
   public boolean isSys003FirstRec100() throws CFException {
      return (  compareChars( getSys003FirstRecSw100() , sys003FirstRec10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSys003FirstRec100True() {  			
    	setSys003FirstRecSw100( sys003FirstRec10088Value);
   	}
	char[] sys003NotFirstRec10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSys003NotFirstRec100()
	 *	@return  Returns true if isSys003NotFirstRec100() is "N"
	 */
   public boolean isSys003NotFirstRec100() throws CFException {
      return (  compareChars( getSys003FirstRecSw100() , sys003NotFirstRec10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSys003NotFirstRec100True() {  			
    	setSys003FirstRecSw100( sys003NotFirstRec10088Value);
   	}
	/**
	 *	Returns the value of sys004FirstRecSw100
	 *	@return sys004FirstRecSw100
	 */
   public char[] getSys004FirstRecSw100() throws CFException{
   		return sys004FirstRecSw100;
   }

  
	/**
	*  set variable sys004FirstRecSw100
	*  Corresponding COBOL Variable is 100-SYS004-FIRST-REC-SW
	*  @param value
	**/
   public void setSys004FirstRecSw100(char[] value) {
       value = checkSys004FirstRecSw100Constraints(value);
       arraycopy(value,0,sys004FirstRecSw100,0,value.length);
   } 
	public void setSys004FirstRecSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys004FirstRecSw100,0,beginIndex + endIndex);
   }
	char[] sys004FirstRec10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSys004FirstRec100()
	 *	@return  Returns true if isSys004FirstRec100() is "Y"
	 */
   public boolean isSys004FirstRec100() throws CFException {
      return (  compareChars( getSys004FirstRecSw100() , sys004FirstRec10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSys004FirstRec100True() {  			
    	setSys004FirstRecSw100( sys004FirstRec10088Value);
   	}
	char[] sys004NotFirstRec10088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSys004NotFirstRec100()
	 *	@return  Returns true if isSys004NotFirstRec100() is "N"
	 */
   public boolean isSys004NotFirstRec100() throws CFException {
      return (  compareChars( getSys004FirstRecSw100() , sys004NotFirstRec10088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSys004NotFirstRec100True() {  			
    	setSys004FirstRecSw100( sys004NotFirstRec10088Value);
   	}
	/**
	 *	Returns the value of eofSys001Sw100
	 *	@return eofSys001Sw100
	 */
   public char[] getEofSys001Sw100() throws CFException{
   		return eofSys001Sw100;
   }

  
	/**
	*  set variable eofSys001Sw100
	*  Corresponding COBOL Variable is 100-EOF-SYS001-SW
	*  @param value
	**/
   public void setEofSys001Sw100(char[] value) {
       value = checkEofSys001Sw100Constraints(value);
       arraycopy(value,0,eofSys001Sw100,0,value.length);
   } 
	public void setEofSys001Sw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofSys001Sw100,0,beginIndex + endIndex);
   }
	char[] eofSys00110088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEofSys001100()
	 *	@return  Returns true if isEofSys001100() is "Y"
	 */
   public boolean isEofSys001100() throws CFException {
      return (  compareChars( getEofSys001Sw100() , eofSys00110088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEofSys001100True() {  			
    	setEofSys001Sw100( eofSys00110088Value);
   	}
	/**
	 *	Returns the value of eofSys003Sw100
	 *	@return eofSys003Sw100
	 */
   public char[] getEofSys003Sw100() throws CFException{
   		return eofSys003Sw100;
   }

  
	/**
	*  set variable eofSys003Sw100
	*  Corresponding COBOL Variable is 100-EOF-SYS003-SW
	*  @param value
	**/
   public void setEofSys003Sw100(char[] value) {
       value = checkEofSys003Sw100Constraints(value);
       arraycopy(value,0,eofSys003Sw100,0,value.length);
   } 
	public void setEofSys003Sw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofSys003Sw100,0,beginIndex + endIndex);
   }
	char[] eofSys00310088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEofSys003100()
	 *	@return  Returns true if isEofSys003100() is "Y"
	 */
   public boolean isEofSys003100() throws CFException {
      return (  compareChars( getEofSys003Sw100() , eofSys00310088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEofSys003100True() {  			
    	setEofSys003Sw100( eofSys00310088Value);
   	}
	/**
	 *	Returns the value of eofSys004Sw100
	 *	@return eofSys004Sw100
	 */
   public char[] getEofSys004Sw100() throws CFException{
   		return eofSys004Sw100;
   }

  
	/**
	*  set variable eofSys004Sw100
	*  Corresponding COBOL Variable is 100-EOF-SYS004-SW
	*  @param value
	**/
   public void setEofSys004Sw100(char[] value) {
       value = checkEofSys004Sw100Constraints(value);
       arraycopy(value,0,eofSys004Sw100,0,value.length);
   } 
	public void setEofSys004Sw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofSys004Sw100,0,beginIndex + endIndex);
   }
	char[] eofSys00410088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEofSys004100()
	 *	@return  Returns true if isEofSys004100() is "Y"
	 */
   public boolean isEofSys004100() throws CFException {
      return (  compareChars( getEofSys004Sw100() , eofSys00410088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEofSys004100True() {  			
    	setEofSys004Sw100( eofSys00410088Value);
   	}
	/**
	 *	Returns the value of sys001StatusSw100
	 *	@return sys001StatusSw100
	 */
   public char[] getSys001StatusSw100() throws CFException{
   		return sys001StatusSw100;
   }

  
	/**
	*  set variable sys001StatusSw100
	*  Corresponding COBOL Variable is 100-SYS001-STATUS-SW
	*  @param value
	**/
   public void setSys001StatusSw100(char[] value) {
       value = checkSys001StatusSw100Constraints(value);
       arraycopy(value,0,sys001StatusSw100,0,value.length);
   } 
	public void setSys001StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys001Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys001Open100()
	 *	@return  Returns true if isSys001Open100() is "O"
	 */
   public boolean isSys001Open100() throws CFException {
      return (  compareChars( getSys001StatusSw100() , sys001Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys001Open100True() {  			
    	setSys001StatusSw100( sys001Open10088Value);
   	}
	char[] sys001Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys001Closed100()
	 *	@return  Returns true if isSys001Closed100() is "C"
	 */
   public boolean isSys001Closed100() throws CFException {
      return (  compareChars( getSys001StatusSw100() , sys001Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys001Closed100True() {  			
    	setSys001StatusSw100( sys001Closed10088Value);
   	}
	/**
	 *	Returns the value of sys002StatusSw100
	 *	@return sys002StatusSw100
	 */
   public char[] getSys002StatusSw100() throws CFException{
   		return sys002StatusSw100;
   }

  
	/**
	*  set variable sys002StatusSw100
	*  Corresponding COBOL Variable is 100-SYS002-STATUS-SW
	*  @param value
	**/
   public void setSys002StatusSw100(char[] value) {
       value = checkSys002StatusSw100Constraints(value);
       arraycopy(value,0,sys002StatusSw100,0,value.length);
   } 
	public void setSys002StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys002StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys002Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys002Open100()
	 *	@return  Returns true if isSys002Open100() is "O"
	 */
   public boolean isSys002Open100() throws CFException {
      return (  compareChars( getSys002StatusSw100() , sys002Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys002Open100True() {  			
    	setSys002StatusSw100( sys002Open10088Value);
   	}
	char[] sys002Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys002Closed100()
	 *	@return  Returns true if isSys002Closed100() is "C"
	 */
   public boolean isSys002Closed100() throws CFException {
      return (  compareChars( getSys002StatusSw100() , sys002Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys002Closed100True() {  			
    	setSys002StatusSw100( sys002Closed10088Value);
   	}
	/**
	 *	Returns the value of sys003StatusSw100
	 *	@return sys003StatusSw100
	 */
   public char[] getSys003StatusSw100() throws CFException{
   		return sys003StatusSw100;
   }

  
	/**
	*  set variable sys003StatusSw100
	*  Corresponding COBOL Variable is 100-SYS003-STATUS-SW
	*  @param value
	**/
   public void setSys003StatusSw100(char[] value) {
       value = checkSys003StatusSw100Constraints(value);
       arraycopy(value,0,sys003StatusSw100,0,value.length);
   } 
	public void setSys003StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys003StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys003Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys003Open100()
	 *	@return  Returns true if isSys003Open100() is "O"
	 */
   public boolean isSys003Open100() throws CFException {
      return (  compareChars( getSys003StatusSw100() , sys003Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys003Open100True() {  			
    	setSys003StatusSw100( sys003Open10088Value);
   	}
	char[] sys003Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys003Closed100()
	 *	@return  Returns true if isSys003Closed100() is "C"
	 */
   public boolean isSys003Closed100() throws CFException {
      return (  compareChars( getSys003StatusSw100() , sys003Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys003Closed100True() {  			
    	setSys003StatusSw100( sys003Closed10088Value);
   	}
	/**
	 *	Returns the value of sys004StatusSw100
	 *	@return sys004StatusSw100
	 */
   public char[] getSys004StatusSw100() throws CFException{
   		return sys004StatusSw100;
   }

  
	/**
	*  set variable sys004StatusSw100
	*  Corresponding COBOL Variable is 100-SYS004-STATUS-SW
	*  @param value
	**/
   public void setSys004StatusSw100(char[] value) {
       value = checkSys004StatusSw100Constraints(value);
       arraycopy(value,0,sys004StatusSw100,0,value.length);
   } 
	public void setSys004StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys004StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys004Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys004Open100()
	 *	@return  Returns true if isSys004Open100() is "O"
	 */
   public boolean isSys004Open100() throws CFException {
      return (  compareChars( getSys004StatusSw100() , sys004Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys004Open100True() {  			
    	setSys004StatusSw100( sys004Open10088Value);
   	}
	char[] sys004Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys004Closed100()
	 *	@return  Returns true if isSys004Closed100() is "C"
	 */
   public boolean isSys004Closed100() throws CFException {
      return (  compareChars( getSys004StatusSw100() , sys004Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys004Closed100True() {  			
    	setSys004StatusSw100( sys004Closed10088Value);
   	}
	/**
	 *	Returns the value of sys005StatusSw100
	 *	@return sys005StatusSw100
	 */
   public char[] getSys005StatusSw100() throws CFException{
   		return sys005StatusSw100;
   }

  
	/**
	*  set variable sys005StatusSw100
	*  Corresponding COBOL Variable is 100-SYS005-STATUS-SW
	*  @param value
	**/
   public void setSys005StatusSw100(char[] value) {
       value = checkSys005StatusSw100Constraints(value);
       arraycopy(value,0,sys005StatusSw100,0,value.length);
   } 
	public void setSys005StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys005StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys005Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys005Open100()
	 *	@return  Returns true if isSys005Open100() is "O"
	 */
   public boolean isSys005Open100() throws CFException {
      return (  compareChars( getSys005StatusSw100() , sys005Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys005Open100True() {  			
    	setSys005StatusSw100( sys005Open10088Value);
   	}
	char[] sys005Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys005Closed100()
	 *	@return  Returns true if isSys005Closed100() is "C"
	 */
   public boolean isSys005Closed100() throws CFException {
      return (  compareChars( getSys005StatusSw100() , sys005Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys005Closed100True() {  			
    	setSys005StatusSw100( sys005Closed10088Value);
   	}
	/**
	 *	Returns the value of sys101StatusSw100
	 *	@return sys101StatusSw100
	 */
   public char[] getSys101StatusSw100() throws CFException{
   		return sys101StatusSw100;
   }

  
	/**
	*  set variable sys101StatusSw100
	*  Corresponding COBOL Variable is 100-SYS101-STATUS-SW
	*  @param value
	**/
   public void setSys101StatusSw100(char[] value) {
       value = checkSys101StatusSw100Constraints(value);
       arraycopy(value,0,sys101StatusSw100,0,value.length);
   } 
	public void setSys101StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys101StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys101Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys101Open100()
	 *	@return  Returns true if isSys101Open100() is "O"
	 */
   public boolean isSys101Open100() throws CFException {
      return (  compareChars( getSys101StatusSw100() , sys101Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys101Open100True() {  			
    	setSys101StatusSw100( sys101Open10088Value);
   	}
	char[] sys101Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys101Closed100()
	 *	@return  Returns true if isSys101Closed100() is "C"
	 */
   public boolean isSys101Closed100() throws CFException {
      return (  compareChars( getSys101StatusSw100() , sys101Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys101Closed100True() {  			
    	setSys101StatusSw100( sys101Closed10088Value);
   	}
	/**
	 *	Returns the value of sys201StatusSw100
	 *	@return sys201StatusSw100
	 */
   public char[] getSys201StatusSw100() throws CFException{
   		return sys201StatusSw100;
   }

  
	/**
	*  set variable sys201StatusSw100
	*  Corresponding COBOL Variable is 100-SYS201-STATUS-SW
	*  @param value
	**/
   public void setSys201StatusSw100(char[] value) {
       value = checkSys201StatusSw100Constraints(value);
       arraycopy(value,0,sys201StatusSw100,0,value.length);
   } 
	public void setSys201StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys201StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys201Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys201Open100()
	 *	@return  Returns true if isSys201Open100() is "O"
	 */
   public boolean isSys201Open100() throws CFException {
      return (  compareChars( getSys201StatusSw100() , sys201Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys201Open100True() {  			
    	setSys201StatusSw100( sys201Open10088Value);
   	}
	char[] sys201Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys201Closed100()
	 *	@return  Returns true if isSys201Closed100() is "C"
	 */
   public boolean isSys201Closed100() throws CFException {
      return (  compareChars( getSys201StatusSw100() , sys201Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys201Closed100True() {  			
    	setSys201StatusSw100( sys201Closed10088Value);
   	}
	/**
	 *	Returns the value of sys202StatusSw100
	 *	@return sys202StatusSw100
	 */
   public char[] getSys202StatusSw100() throws CFException{
   		return sys202StatusSw100;
   }

  
	/**
	*  set variable sys202StatusSw100
	*  Corresponding COBOL Variable is 100-SYS202-STATUS-SW
	*  @param value
	**/
   public void setSys202StatusSw100(char[] value) {
       value = checkSys202StatusSw100Constraints(value);
       arraycopy(value,0,sys202StatusSw100,0,value.length);
   } 
	public void setSys202StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys202StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys202Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys202Open100()
	 *	@return  Returns true if isSys202Open100() is "O"
	 */
   public boolean isSys202Open100() throws CFException {
      return (  compareChars( getSys202StatusSw100() , sys202Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys202Open100True() {  			
    	setSys202StatusSw100( sys202Open10088Value);
   	}
	char[] sys202Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys202Closed100()
	 *	@return  Returns true if isSys202Closed100() is "C"
	 */
   public boolean isSys202Closed100() throws CFException {
      return (  compareChars( getSys202StatusSw100() , sys202Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys202Closed100True() {  			
    	setSys202StatusSw100( sys202Closed10088Value);
   	}
	/**
	 *	Returns the value of sys204StatusSw100
	 *	@return sys204StatusSw100
	 */
   public char[] getSys204StatusSw100() throws CFException{
   		return sys204StatusSw100;
   }

  
	/**
	*  set variable sys204StatusSw100
	*  Corresponding COBOL Variable is 100-SYS204-STATUS-SW
	*  @param value
	**/
   public void setSys204StatusSw100(char[] value) {
       value = checkSys204StatusSw100Constraints(value);
       arraycopy(value,0,sys204StatusSw100,0,value.length);
   } 
	public void setSys204StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys204StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys204Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys204Open100()
	 *	@return  Returns true if isSys204Open100() is "O"
	 */
   public boolean isSys204Open100() throws CFException {
      return (  compareChars( getSys204StatusSw100() , sys204Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys204Open100True() {  			
    	setSys204StatusSw100( sys204Open10088Value);
   	}
	char[] sys204Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys204Closed100()
	 *	@return  Returns true if isSys204Closed100() is "C"
	 */
   public boolean isSys204Closed100() throws CFException {
      return (  compareChars( getSys204StatusSw100() , sys204Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys204Closed100True() {  			
    	setSys204StatusSw100( sys204Closed10088Value);
   	}
	/**
	 *	Returns the value of sys205StatusSw100
	 *	@return sys205StatusSw100
	 */
   public char[] getSys205StatusSw100() throws CFException{
   		return sys205StatusSw100;
   }

  
	/**
	*  set variable sys205StatusSw100
	*  Corresponding COBOL Variable is 100-SYS205-STATUS-SW
	*  @param value
	**/
   public void setSys205StatusSw100(char[] value) {
       value = checkSys205StatusSw100Constraints(value);
       arraycopy(value,0,sys205StatusSw100,0,value.length);
   } 
	public void setSys205StatusSw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys205StatusSw100,0,beginIndex + endIndex);
   }
	char[] sys205Open10088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isSys205Open100()
	 *	@return  Returns true if isSys205Open100() is "O"
	 */
   public boolean isSys205Open100() throws CFException {
      return (  compareChars( getSys205StatusSw100() , sys205Open10088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setSys205Open100True() {  			
    	setSys205StatusSw100( sys205Open10088Value);
   	}
	char[] sys205Closed10088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isSys205Closed100()
	 *	@return  Returns true if isSys205Closed100() is "C"
	 */
   public boolean isSys205Closed100() throws CFException {
      return (  compareChars( getSys205StatusSw100() , sys205Closed10088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setSys205Closed100True() {  			
    	setSys205StatusSw100( sys205Closed10088Value);
   	}
	/**
	 *	Returns the value of isItOddOrEvenByte100
	 *	@return isItOddOrEvenByte100
	 */
   public char[] getIsItOddOrEvenByte100() throws CFException{
   		return isItOddOrEvenByte100;
   }

  
	/**
	*  set variable isItOddOrEvenByte100
	*  Corresponding COBOL Variable is 100-IS-IT-ODD-OR-EVEN-BYTE
	*  @param value
	**/
   public void setIsItOddOrEvenByte100(char[] value) {
       value = checkIsItOddOrEvenByte100Constraints(value);
       arraycopy(value,0,isItOddOrEvenByte100,0,value.length);
   } 
	public void setIsItOddOrEvenByte100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItOddOrEvenByte100,0,beginIndex + endIndex);
   }
	char[] itIsOddByte8810088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isItIsOddByte88100()
	 *	@return  Returns true if isItIsOddByte88100() is "O"
	 */
   public boolean isItIsOddByte88100() throws CFException {
      return (  compareChars( getIsItOddOrEvenByte100() , itIsOddByte8810088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setItIsOddByte88100True() {  			
    	setIsItOddOrEvenByte100( itIsOddByte8810088Value);
   	}
	char[] itIsEvenByte8810088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isItIsEvenByte88100()
	 *	@return  Returns true if isItIsEvenByte88100() is "E"
	 */
   public boolean isItIsEvenByte88100() throws CFException {
      return (  compareChars( getIsItOddOrEvenByte100() , itIsEvenByte8810088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setItIsEvenByte88100True() {  			
    	setIsItOddOrEvenByte100( itIsEvenByte8810088Value);
   	}
	/**
	 *	Returns the value of allRecordsPrcd100
	 *	@return allRecordsPrcd100
	 */
   public char[] getAllRecordsPrcd100() throws CFException{
   		return allRecordsPrcd100;
   }

  
	/**
	*  set variable allRecordsPrcd100
	*  Corresponding COBOL Variable is 100-ALL-RECORDS-PRCD
	*  @param value
	**/
   public void setAllRecordsPrcd100(char[] value) {
       value = checkAllRecordsPrcd100Constraints(value);
       arraycopy(value,0,allRecordsPrcd100,0,value.length);
   } 
	public void setAllRecordsPrcd100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,allRecordsPrcd100,0,beginIndex + endIndex);
   }
	char[] allRecordsPrcdY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isAllRecordsPrcdY88100()
	 *	@return  Returns true if isAllRecordsPrcdY88100() is "Y"
	 */
   public boolean isAllRecordsPrcdY88100() throws CFException {
      return (  compareChars( getAllRecordsPrcd100() , allRecordsPrcdY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setAllRecordsPrcdY88100True() {  			
    	setAllRecordsPrcd100( allRecordsPrcdY8810088Value);
   	}
	char[] allRecordsPrcdN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAllRecordsPrcdN88100()
	 *	@return  Returns true if isAllRecordsPrcdN88100() is "N"
	 */
   public boolean isAllRecordsPrcdN88100() throws CFException {
      return (  compareChars( getAllRecordsPrcd100() , allRecordsPrcdN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAllRecordsPrcdN88100True() {  			
    	setAllRecordsPrcd100( allRecordsPrcdN8810088Value);
   	}
	/**
	 *	Returns the value of irdSelected100
	 *	@return irdSelected100
	 */
   public char[] getIrdSelected100() throws CFException{
   		return irdSelected100;
   }

  
	/**
	*  set variable irdSelected100
	*  Corresponding COBOL Variable is 100-IRD-SELECTED
	*  @param value
	**/
   public void setIrdSelected100(char[] value) {
       value = checkIrdSelected100Constraints(value);
       arraycopy(value,0,irdSelected100,0,value.length);
   } 
	public void setIrdSelected100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,irdSelected100,0,beginIndex + endIndex);
   }
	char[] irdSelectedY8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIrdSelectedY88100()
	 *	@return  Returns true if isIrdSelectedY88100() is "Y"
	 */
   public boolean isIrdSelectedY88100() throws CFException {
      return (  compareChars( getIrdSelected100() , irdSelectedY8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIrdSelectedY88100True() {  			
    	setIrdSelected100( irdSelectedY8810088Value);
   	}
	char[] irdSelectedN8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIrdSelectedN88100()
	 *	@return  Returns true if isIrdSelectedN88100() is "N"
	 */
   public boolean isIrdSelectedN88100() throws CFException {
      return (  compareChars( getIrdSelected100() , irdSelectedN8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIrdSelectedN88100True() {  			
    	setIrdSelected100( irdSelectedN8810088Value);
   	}
	/**
	 *	Returns the value of c300
	 *	@return c300
	 */
   public char[] getC300() throws CFException{
   		return c300;
   }

  
	/**
	*  set variable c300
	*  Corresponding COBOL Variable is 300-C
	*  @param value
	**/
   public void setC300(char[] value) {
       value = checkC300Constraints(value);
       arraycopy(value,0,c300,0,value.length);
   } 
	public void setC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,c300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of d300
	 *	@return d300
	 */
   public char[] getD300() throws CFException{
   		return d300;
   }

  
	/**
	*  set variable d300
	*  Corresponding COBOL Variable is 300-D
	*  @param value
	**/
   public void setD300(char[] value) {
       value = checkD300Constraints(value);
       arraycopy(value,0,d300,0,value.length);
   } 
	public void setD300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,d300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of m300
	 *	@return m300
	 */
   public char[] getM300() throws CFException{
   		return m300;
   }

  
	/**
	*  set variable m300
	*  Corresponding COBOL Variable is 300-M
	*  @param value
	**/
   public void setM300(char[] value) {
       value = checkM300Constraints(value);
       arraycopy(value,0,m300,0,value.length);
   } 
	public void setM300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,m300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of p300
	 *	@return p300
	 */
   public char[] getP300() throws CFException{
   		return p300;
   }

  
	/**
	*  set variable p300
	*  Corresponding COBOL Variable is 300-P
	*  @param value
	**/
   public void setP300(char[] value) {
       value = checkP300Constraints(value);
       arraycopy(value,0,p300,0,value.length);
   } 
	public void setP300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,p300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp989010300
	 *	@return pgmIp989010300
	 */
   public char[] getPgmIp989010300() throws CFException{
   		return pgmIp989010300;
   }

  
	/**
	*  set variable pgmIp989010300
	*  Corresponding COBOL Variable is 300-PGM-IP989010
	*  @param value
	**/
   public void setPgmIp989010300(char[] value) {
       value = checkPgmIp989010300Constraints(value);
       arraycopy(value,0,pgmIp989010300,0,value.length);
   } 
	public void setPgmIp989010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp989010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp169410300
	 *	@return pgmIp169410300
	 */
   public char[] getPgmIp169410300() throws CFException{
   		return pgmIp169410300;
   }

  
	/**
	*  set variable pgmIp169410300
	*  Corresponding COBOL Variable is 300-PGM-IP169410
	*  @param value
	**/
   public void setPgmIp169410300(char[] value) {
       value = checkPgmIp169410300Constraints(value);
       arraycopy(value,0,pgmIp169410300,0,value.length);
   } 
	public void setPgmIp169410300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp169410300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException{
   		return pgmIp280010300;
   }

  
	/**
	*  set variable pgmIp280010300
	*  Corresponding COBOL Variable is 300-PGM-IP280010
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) {
       value = checkPgmIp280010300Constraints(value);
       arraycopy(value,0,pgmIp280010300,0,value.length);
   } 
	public void setPgmIp280010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp280010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException{
   		return pgmIp610010300;
   }

  
	/**
	*  set variable pgmIp610010300
	*  Corresponding COBOL Variable is 300-PGM-IP610010
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) {
       value = checkPgmIp610010300Constraints(value);
       arraycopy(value,0,pgmIp610010300,0,value.length);
   } 
	public void setPgmIp610010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp610010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp666010300
	 *	@return pgmIp666010300
	 */
   public char[] getPgmIp666010300() throws CFException{
   		return pgmIp666010300;
   }

  
	/**
	*  set variable pgmIp666010300
	*  Corresponding COBOL Variable is 300-PGM-IP666010
	*  @param value
	**/
   public void setPgmIp666010300(char[] value) {
       value = checkPgmIp666010300Constraints(value);
       arraycopy(value,0,pgmIp666010300,0,value.length);
   } 
	public void setPgmIp666010300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp666010300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pgmIp666030300
	 *	@return pgmIp666030300
	 */
   public char[] getPgmIp666030300() throws CFException{
   		return pgmIp666030300;
   }

  
	/**
	*  set variable pgmIp666030300
	*  Corresponding COBOL Variable is 300-PGM-IP666030
	*  @param value
	**/
   public void setPgmIp666030300(char[] value) {
       value = checkPgmIp666030300Constraints(value);
       arraycopy(value,0,pgmIp666030300,0,value.length);
   } 
	public void setPgmIp666030300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp666030300,0,beginIndex + endIndex);
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
	 *	Returns the value of msgEndTag300
	 *	@return msgEndTag300
	 */
   public char[] getMsgEndTag300() throws CFException{
   		return msgEndTag300;
   }

  
	/**
	*  set variable msgEndTag300
	*  Corresponding COBOL Variable is 300-MSG-END-TAG
	*  @param value
	**/
   public void setMsgEndTag300(char[] value) {
       value = checkMsgEndTag300Constraints(value);
       arraycopy(value,0,msgEndTag300,0,value.length);
   } 
	public void setMsgEndTag300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,msgEndTag300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pdsEndTag300
	 *	@return pdsEndTag300
	 */
   public char[] getPdsEndTag300() throws CFException{
   		return pdsEndTag300;
   }

  
	/**
	*  set variable pdsEndTag300
	*  Corresponding COBOL Variable is 300-PDS-END-TAG
	*  @param value
	**/
   public void setPdsEndTag300(char[] value) {
       value = checkPdsEndTag300Constraints(value);
       arraycopy(value,0,pdsEndTag300,0,value.length);
   } 
	public void setPdsEndTag300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pdsEndTag300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of deEndTag300
	 *	@return deEndTag300
	 */
   public char[] getDeEndTag300() throws CFException{
   		return deEndTag300;
   }

  
	/**
	*  set variable deEndTag300
	*  Corresponding COBOL Variable is 300-DE-END-TAG
	*  @param value
	**/
   public void setDeEndTag300(char[] value) {
       value = checkDeEndTag300Constraints(value);
       arraycopy(value,0,deEndTag300,0,value.length);
   } 
	public void setDeEndTag300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,deEndTag300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of subfldTagStr300
	 *	@return subfldTagStr300
	 */
   public char[] getSubfldTagStr300() throws CFException{
   		return subfldTagStr300;
   }

  
	/**
	*  set variable subfldTagStr300
	*  Corresponding COBOL Variable is 300-SUBFLD-TAG-STR
	*  @param value
	**/
   public void setSubfldTagStr300(char[] value) {
       value = checkSubfldTagStr300Constraints(value);
       arraycopy(value,0,subfldTagStr300,0,value.length);
   } 
	public void setSubfldTagStr300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,subfldTagStr300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of subfldTagEnd300
	 *	@return subfldTagEnd300
	 */
   public char[] getSubfldTagEnd300() throws CFException{
   		return subfldTagEnd300;
   }

  
	/**
	*  set variable subfldTagEnd300
	*  Corresponding COBOL Variable is 300-SUBFLD-TAG-END
	*  @param value
	**/
   public void setSubfldTagEnd300(char[] value) {
       value = checkSubfldTagEnd300Constraints(value);
       arraycopy(value,0,subfldTagEnd300,0,value.length);
   } 
	public void setSubfldTagEnd300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,subfldTagEnd300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode3003002
	 *	@return abendCode3003002
	 */
	public int getAbendCode3003002() throws CFException {
       if (isAbendCode3003002Modified()) { 
           abendCode3003002 = refreshAbendCode3003002();
        }
   		return abendCode3003002;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003002 with the passed value
	 *  Corresponding COBOL Variable is 300-3002-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003002(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003002 = checkAbendCode3003002MaxLimit(number); 
		serializeAbendCode3003002(abendCode3003002);
	}
	

	public void setAbendCode3003002(long number) {
	    number = checkAbendCode3003002MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003002((int)number);
	}
	
	/**
	 * 	Update AbendCode3003002 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003002(char[] value) throws CFException {
		 abendCode3003002 = serializeAbendCode3003002(value);
	}
	/**
	 * 	Update AbendCode3003002 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003002String(char[] value) throws CFException {
		 setAbendCode3003002(value);
	}
	/**
	 *	Returns the value of abendCode3003003
	 *	@return abendCode3003003
	 */
	public int getAbendCode3003003() throws CFException {
       if (isAbendCode3003003Modified()) { 
           abendCode3003003 = refreshAbendCode3003003();
        }
   		return abendCode3003003;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003003 with the passed value
	 *  Corresponding COBOL Variable is 300-3003-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003003(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003003 = checkAbendCode3003003MaxLimit(number); 
		serializeAbendCode3003003(abendCode3003003);
	}
	

	public void setAbendCode3003003(long number) {
	    number = checkAbendCode3003003MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003003((int)number);
	}
	
	/**
	 * 	Update AbendCode3003003 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003003(char[] value) throws CFException {
		 abendCode3003003 = serializeAbendCode3003003(value);
	}
	/**
	 * 	Update AbendCode3003003 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003003String(char[] value) throws CFException {
		 setAbendCode3003003(value);
	}
	/**
	 *	Returns the value of abendCode3003004
	 *	@return abendCode3003004
	 */
	public int getAbendCode3003004() throws CFException {
       if (isAbendCode3003004Modified()) { 
           abendCode3003004 = refreshAbendCode3003004();
        }
   		return abendCode3003004;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003004 with the passed value
	 *  Corresponding COBOL Variable is 300-3004-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003004(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003004 = checkAbendCode3003004MaxLimit(number); 
		serializeAbendCode3003004(abendCode3003004);
	}
	

	public void setAbendCode3003004(long number) {
	    number = checkAbendCode3003004MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003004((int)number);
	}
	
	/**
	 * 	Update AbendCode3003004 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003004(char[] value) throws CFException {
		 abendCode3003004 = serializeAbendCode3003004(value);
	}
	/**
	 * 	Update AbendCode3003004 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003004String(char[] value) throws CFException {
		 setAbendCode3003004(value);
	}
	/**
	 *	Returns the value of abendCode3003005
	 *	@return abendCode3003005
	 */
	public int getAbendCode3003005() throws CFException {
       if (isAbendCode3003005Modified()) { 
           abendCode3003005 = refreshAbendCode3003005();
        }
   		return abendCode3003005;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003005 with the passed value
	 *  Corresponding COBOL Variable is 300-3005-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003005(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003005 = checkAbendCode3003005MaxLimit(number); 
		serializeAbendCode3003005(abendCode3003005);
	}
	

	public void setAbendCode3003005(long number) {
	    number = checkAbendCode3003005MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003005((int)number);
	}
	
	/**
	 * 	Update AbendCode3003005 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003005(char[] value) throws CFException {
		 abendCode3003005 = serializeAbendCode3003005(value);
	}
	/**
	 * 	Update AbendCode3003005 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003005String(char[] value) throws CFException {
		 setAbendCode3003005(value);
	}
	/**
	 *	Returns the value of abendCode3003006
	 *	@return abendCode3003006
	 */
	public int getAbendCode3003006() throws CFException {
       if (isAbendCode3003006Modified()) { 
           abendCode3003006 = refreshAbendCode3003006();
        }
   		return abendCode3003006;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003006 with the passed value
	 *  Corresponding COBOL Variable is 300-3006-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003006(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003006 = checkAbendCode3003006MaxLimit(number); 
		serializeAbendCode3003006(abendCode3003006);
	}
	

	public void setAbendCode3003006(long number) {
	    number = checkAbendCode3003006MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003006((int)number);
	}
	
	/**
	 * 	Update AbendCode3003006 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003006(char[] value) throws CFException {
		 abendCode3003006 = serializeAbendCode3003006(value);
	}
	/**
	 * 	Update AbendCode3003006 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003006String(char[] value) throws CFException {
		 setAbendCode3003006(value);
	}
	/**
	 *	Returns the value of abendCode3003008
	 *	@return abendCode3003008
	 */
	public int getAbendCode3003008() throws CFException {
       if (isAbendCode3003008Modified()) { 
           abendCode3003008 = refreshAbendCode3003008();
        }
   		return abendCode3003008;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003008 with the passed value
	 *  Corresponding COBOL Variable is 300-3008-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003008(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003008 = checkAbendCode3003008MaxLimit(number); 
		serializeAbendCode3003008(abendCode3003008);
	}
	

	public void setAbendCode3003008(long number) {
	    number = checkAbendCode3003008MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003008((int)number);
	}
	
	/**
	 * 	Update AbendCode3003008 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003008(char[] value) throws CFException {
		 abendCode3003008 = serializeAbendCode3003008(value);
	}
	/**
	 * 	Update AbendCode3003008 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003008String(char[] value) throws CFException {
		 setAbendCode3003008(value);
	}
	/**
	 *	Returns the value of abendCode3003009
	 *	@return abendCode3003009
	 */
	public int getAbendCode3003009() throws CFException {
       if (isAbendCode3003009Modified()) { 
           abendCode3003009 = refreshAbendCode3003009();
        }
   		return abendCode3003009;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003009 with the passed value
	 *  Corresponding COBOL Variable is 300-3009-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003009(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003009 = checkAbendCode3003009MaxLimit(number); 
		serializeAbendCode3003009(abendCode3003009);
	}
	

	public void setAbendCode3003009(long number) {
	    number = checkAbendCode3003009MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003009((int)number);
	}
	
	/**
	 * 	Update AbendCode3003009 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003009(char[] value) throws CFException {
		 abendCode3003009 = serializeAbendCode3003009(value);
	}
	/**
	 * 	Update AbendCode3003009 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003009String(char[] value) throws CFException {
		 setAbendCode3003009(value);
	}
	/**
	 *	Returns the value of abendCode3003014
	 *	@return abendCode3003014
	 */
	public int getAbendCode3003014() throws CFException {
       if (isAbendCode3003014Modified()) { 
           abendCode3003014 = refreshAbendCode3003014();
        }
   		return abendCode3003014;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003014 with the passed value
	 *  Corresponding COBOL Variable is 300-3014-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003014(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003014 = checkAbendCode3003014MaxLimit(number); 
		serializeAbendCode3003014(abendCode3003014);
	}
	

	public void setAbendCode3003014(long number) {
	    number = checkAbendCode3003014MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003014((int)number);
	}
	
	/**
	 * 	Update AbendCode3003014 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003014(char[] value) throws CFException {
		 abendCode3003014 = serializeAbendCode3003014(value);
	}
	/**
	 * 	Update AbendCode3003014 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003014String(char[] value) throws CFException {
		 setAbendCode3003014(value);
	}
	/**
	 *	Returns the value of abendCode3003015
	 *	@return abendCode3003015
	 */
	public int getAbendCode3003015() throws CFException {
       if (isAbendCode3003015Modified()) { 
           abendCode3003015 = refreshAbendCode3003015();
        }
   		return abendCode3003015;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003015 with the passed value
	 *  Corresponding COBOL Variable is 300-3015-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003015(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003015 = checkAbendCode3003015MaxLimit(number); 
		serializeAbendCode3003015(abendCode3003015);
	}
	

	public void setAbendCode3003015(long number) {
	    number = checkAbendCode3003015MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003015((int)number);
	}
	
	/**
	 * 	Update AbendCode3003015 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003015(char[] value) throws CFException {
		 abendCode3003015 = serializeAbendCode3003015(value);
	}
	/**
	 * 	Update AbendCode3003015 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003015String(char[] value) throws CFException {
		 setAbendCode3003015(value);
	}
	/**
	 *	Returns the value of abendCode3003016
	 *	@return abendCode3003016
	 */
	public int getAbendCode3003016() throws CFException {
       if (isAbendCode3003016Modified()) { 
           abendCode3003016 = refreshAbendCode3003016();
        }
   		return abendCode3003016;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003016 with the passed value
	 *  Corresponding COBOL Variable is 300-3016-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003016(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003016 = checkAbendCode3003016MaxLimit(number); 
		serializeAbendCode3003016(abendCode3003016);
	}
	

	public void setAbendCode3003016(long number) {
	    number = checkAbendCode3003016MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003016((int)number);
	}
	
	/**
	 * 	Update AbendCode3003016 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003016(char[] value) throws CFException {
		 abendCode3003016 = serializeAbendCode3003016(value);
	}
	/**
	 * 	Update AbendCode3003016 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003016String(char[] value) throws CFException {
		 setAbendCode3003016(value);
	}
	/**
	 *	Returns the value of abendCode3003017
	 *	@return abendCode3003017
	 */
	public int getAbendCode3003017() throws CFException {
       if (isAbendCode3003017Modified()) { 
           abendCode3003017 = refreshAbendCode3003017();
        }
   		return abendCode3003017;
	}
	

	
	   
	/**
	 * 	Update AbendCode3003017 with the passed value
	 *  Corresponding COBOL Variable is 300-3017-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode3003017(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendCode3003017 = checkAbendCode3003017MaxLimit(number); 
		serializeAbendCode3003017(abendCode3003017);
	}
	

	public void setAbendCode3003017(long number) {
	    number = checkAbendCode3003017MaxLimit(number); // Truncate if value is beyond +/- Max range
		setAbendCode3003017((int)number);
	}
	
	/**
	 * 	Update AbendCode3003017 with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003017(char[] value) throws CFException {
		 abendCode3003017 = serializeAbendCode3003017(value);
	}
	/**
	 * 	Update AbendCode3003017 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendCode3003017String(char[] value) throws CFException {
		 setAbendCode3003017(value);
	}
	/**
	 *	Returns the value of sys001300
	 *	@return sys001300
	 */
   public char[] getSys001300() throws CFException{
   		return sys001300;
   }

  
	/**
	*  set variable sys001300
	*  Corresponding COBOL Variable is 300-SYS001
	*  @param value
	**/
   public void setSys001300(char[] value) {
       value = checkSys001300Constraints(value);
       arraycopy(value,0,sys001300,0,value.length);
   } 
	public void setSys001300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys001300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys002300
	 *	@return sys002300
	 */
   public char[] getSys002300() throws CFException{
   		return sys002300;
   }

  
	/**
	*  set variable sys002300
	*  Corresponding COBOL Variable is 300-SYS002
	*  @param value
	**/
   public void setSys002300(char[] value) {
       value = checkSys002300Constraints(value);
       arraycopy(value,0,sys002300,0,value.length);
   } 
	public void setSys002300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys002300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys003300
	 *	@return sys003300
	 */
   public char[] getSys003300() throws CFException{
   		return sys003300;
   }

  
	/**
	*  set variable sys003300
	*  Corresponding COBOL Variable is 300-SYS003
	*  @param value
	**/
   public void setSys003300(char[] value) {
       value = checkSys003300Constraints(value);
       arraycopy(value,0,sys003300,0,value.length);
   } 
	public void setSys003300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys003300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys004300
	 *	@return sys004300
	 */
   public char[] getSys004300() throws CFException{
   		return sys004300;
   }

  
	/**
	*  set variable sys004300
	*  Corresponding COBOL Variable is 300-SYS004
	*  @param value
	**/
   public void setSys004300(char[] value) {
       value = checkSys004300Constraints(value);
       arraycopy(value,0,sys004300,0,value.length);
   } 
	public void setSys004300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys004300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys005300
	 *	@return sys005300
	 */
   public char[] getSys005300() throws CFException{
   		return sys005300;
   }

  
	/**
	*  set variable sys005300
	*  Corresponding COBOL Variable is 300-SYS005
	*  @param value
	**/
   public void setSys005300(char[] value) {
       value = checkSys005300Constraints(value);
       arraycopy(value,0,sys005300,0,value.length);
   } 
	public void setSys005300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys005300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys101300
	 *	@return sys101300
	 */
   public char[] getSys101300() throws CFException{
   		return sys101300;
   }

  
	/**
	*  set variable sys101300
	*  Corresponding COBOL Variable is 300-SYS101
	*  @param value
	**/
   public void setSys101300(char[] value) {
       value = checkSys101300Constraints(value);
       arraycopy(value,0,sys101300,0,value.length);
   } 
	public void setSys101300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys101300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys201300
	 *	@return sys201300
	 */
   public char[] getSys201300() throws CFException{
   		return sys201300;
   }

  
	/**
	*  set variable sys201300
	*  Corresponding COBOL Variable is 300-SYS201
	*  @param value
	**/
   public void setSys201300(char[] value) {
       value = checkSys201300Constraints(value);
       arraycopy(value,0,sys201300,0,value.length);
   } 
	public void setSys201300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys201300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys202300
	 *	@return sys202300
	 */
   public char[] getSys202300() throws CFException{
   		return sys202300;
   }

  
	/**
	*  set variable sys202300
	*  Corresponding COBOL Variable is 300-SYS202
	*  @param value
	**/
   public void setSys202300(char[] value) {
       value = checkSys202300Constraints(value);
       arraycopy(value,0,sys202300,0,value.length);
   } 
	public void setSys202300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys202300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys204300
	 *	@return sys204300
	 */
   public char[] getSys204300() throws CFException{
   		return sys204300;
   }

  
	/**
	*  set variable sys204300
	*  Corresponding COBOL Variable is 300-SYS204
	*  @param value
	**/
   public void setSys204300(char[] value) {
       value = checkSys204300Constraints(value);
       arraycopy(value,0,sys204300,0,value.length);
   } 
	public void setSys204300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys204300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of sys205300
	 *	@return sys205300
	 */
   public char[] getSys205300() throws CFException{
   		return sys205300;
   }

  
	/**
	*  set variable sys205300
	*  Corresponding COBOL Variable is 300-SYS205
	*  @param value
	**/
   public void setSys205300(char[] value) {
       value = checkSys205300Constraints(value);
       arraycopy(value,0,sys205300,0,value.length);
   } 
	public void setSys205300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys205300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pds0023300
	 *	@return pds0023300
	 */
   public char[] getPds0023300() throws CFException{
   		return pds0023300;
   }

  
	/**
	*  set variable pds0023300
	*  Corresponding COBOL Variable is 300-PDS0023
	*  @param value
	**/
   public void setPds0023300(char[] value) {
       value = checkPds0023300Constraints(value);
       arraycopy(value,0,pds0023300,0,value.length);
   } 
	public void setPds0023300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pds0023300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pds0148300
	 *	@return pds0148300
	 */
   public char[] getPds0148300() throws CFException{
   		return pds0148300;
   }

  
	/**
	*  set variable pds0148300
	*  Corresponding COBOL Variable is 300-PDS0148
	*  @param value
	**/
   public void setPds0148300(char[] value) {
       value = checkPds0148300Constraints(value);
       arraycopy(value,0,pds0148300,0,value.length);
   } 
	public void setPds0148300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pds0148300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of pds0122300
	 *	@return pds0122300
	 */
   public char[] getPds0122300() throws CFException{
   		return pds0122300;
   }

  
	/**
	*  set variable pds0122300
	*  Corresponding COBOL Variable is 300-PDS0122
	*  @param value
	**/
   public void setPds0122300(char[] value) {
       value = checkPds0122300Constraints(value);
       arraycopy(value,0,pds0122300,0,value.length);
   } 
	public void setPds0122300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pds0122300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de3s1300
	 *	@return de3s1300
	 */
   public char[] getDe3s1300() throws CFException{
   		return de3s1300;
   }

  
	/**
	*  set variable de3s1300
	*  Corresponding COBOL Variable is 300-DE3S1
	*  @param value
	**/
   public void setDe3s1300(char[] value) {
       value = checkDe3s1300Constraints(value);
       arraycopy(value,0,de3s1300,0,value.length);
   } 
	public void setDe3s1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de3s1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de22300
	 *	@return de22300
	 */
   public char[] getDe22300() throws CFException{
   		return de22300;
   }

  
	/**
	*  set variable de22300
	*  Corresponding COBOL Variable is 300-DE22
	*  @param value
	**/
   public void setDe22300(char[] value) {
       value = checkDe22300Constraints(value);
       arraycopy(value,0,de22300,0,value.length);
   } 
	public void setDe22300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de22300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de26300
	 *	@return de26300
	 */
   public char[] getDe26300() throws CFException{
   		return de26300;
   }

  
	/**
	*  set variable de26300
	*  Corresponding COBOL Variable is 300-DE26
	*  @param value
	**/
   public void setDe26300(char[] value) {
       value = checkDe26300Constraints(value);
       arraycopy(value,0,de26300,0,value.length);
   } 
	public void setDe26300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de26300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de42300
	 *	@return de42300
	 */
   public char[] getDe42300() throws CFException{
   		return de42300;
   }

  
	/**
	*  set variable de42300
	*  Corresponding COBOL Variable is 300-DE42
	*  @param value
	**/
   public void setDe42300(char[] value) {
       value = checkDe42300Constraints(value);
       arraycopy(value,0,de42300,0,value.length);
   } 
	public void setDe42300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de42300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de43s2300
	 *	@return de43s2300
	 */
   public char[] getDe43s2300() throws CFException{
   		return de43s2300;
   }

  
	/**
	*  set variable de43s2300
	*  Corresponding COBOL Variable is 300-DE43S2
	*  @param value
	**/
   public void setDe43s2300(char[] value) {
       value = checkDe43s2300Constraints(value);
       arraycopy(value,0,de43s2300,0,value.length);
   } 
	public void setDe43s2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de43s2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de43s3300
	 *	@return de43s3300
	 */
   public char[] getDe43s3300() throws CFException{
   		return de43s3300;
   }

  
	/**
	*  set variable de43s3300
	*  Corresponding COBOL Variable is 300-DE43S3
	*  @param value
	**/
   public void setDe43s3300(char[] value) {
       value = checkDe43s3300Constraints(value);
       arraycopy(value,0,de43s3300,0,value.length);
   } 
	public void setDe43s3300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de43s3300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de43s4300
	 *	@return de43s4300
	 */
   public char[] getDe43s4300() throws CFException{
   		return de43s4300;
   }

  
	/**
	*  set variable de43s4300
	*  Corresponding COBOL Variable is 300-DE43S4
	*  @param value
	**/
   public void setDe43s4300(char[] value) {
       value = checkDe43s4300Constraints(value);
       arraycopy(value,0,de43s4300,0,value.length);
   } 
	public void setDe43s4300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de43s4300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de43s5300
	 *	@return de43s5300
	 */
   public char[] getDe43s5300() throws CFException{
   		return de43s5300;
   }

  
	/**
	*  set variable de43s5300
	*  Corresponding COBOL Variable is 300-DE43S5
	*  @param value
	**/
   public void setDe43s5300(char[] value) {
       value = checkDe43s5300Constraints(value);
       arraycopy(value,0,de43s5300,0,value.length);
   } 
	public void setDe43s5300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de43s5300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de43s6300
	 *	@return de43s6300
	 */
   public char[] getDe43s6300() throws CFException{
   		return de43s6300;
   }

  
	/**
	*  set variable de43s6300
	*  Corresponding COBOL Variable is 300-DE43S6
	*  @param value
	**/
   public void setDe43s6300(char[] value) {
       value = checkDe43s6300Constraints(value);
       arraycopy(value,0,de43s6300,0,value.length);
   } 
	public void setDe43s6300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de43s6300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of de49300
	 *	@return de49300
	 */
   public char[] getDe49300() throws CFException{
   		return de49300;
   }

  
	/**
	*  set variable de49300
	*  Corresponding COBOL Variable is 300-DE49
	*  @param value
	**/
   public void setDe49300(char[] value) {
       value = checkDe49300Constraints(value);
       arraycopy(value,0,de49300,0,value.length);
   } 
	public void setDe49300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,de49300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of date300
	 *	@return date300
	 */
   public char[] getDate300() throws CFException{
   		return date300;
   }

  
	/**
	*  set variable date300
	*  Corresponding COBOL Variable is 300-DATE
	*  @param value
	**/
   public void setDate300(char[] value) {
       value = checkDate300Constraints(value);
       arraycopy(value,0,date300,0,value.length);
   } 
	public void setDate300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,date300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of type1300
	 *	@return type1300
	 */
   public char[] getType1300() throws CFException{
   		return type1300;
   }

  
	/**
	*  set variable type1300
	*  Corresponding COBOL Variable is 300-TYPE1
	*  @param value
	**/
   public void setType1300(char[] value) {
       value = checkType1300Constraints(value);
       arraycopy(value,0,type1300,0,value.length);
   } 
	public void setType1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,type1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ica1300
	 *	@return ica1300
	 */
   public char[] getIca1300() throws CFException{
   		return ica1300;
   }

  
	/**
	*  set variable ica1300
	*  Corresponding COBOL Variable is 300-ICA1
	*  @param value
	**/
   public void setIca1300(char[] value) {
       value = checkIca1300Constraints(value);
       arraycopy(value,0,ica1300,0,value.length);
   } 
	public void setIca1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ica1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bin1300
	 *	@return bin1300
	 */
   public char[] getBin1300() throws CFException{
   		return bin1300;
   }

  
	/**
	*  set variable bin1300
	*  Corresponding COBOL Variable is 300-BIN1
	*  @param value
	**/
   public void setBin1300(char[] value) {
       value = checkBin1300Constraints(value);
       arraycopy(value,0,bin1300,0,value.length);
   } 
	public void setBin1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bin1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of maid1300
	 *	@return maid1300
	 */
   public char[] getMaid1300() throws CFException{
   		return maid1300;
   }

  
	/**
	*  set variable maid1300
	*  Corresponding COBOL Variable is 300-MAID1
	*  @param value
	**/
   public void setMaid1300(char[] value) {
       value = checkMaid1300Constraints(value);
       arraycopy(value,0,maid1300,0,value.length);
   } 
	public void setMaid1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,maid1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of endpoint1300
	 *	@return endpoint1300
	 */
   public char[] getEndpoint1300() throws CFException{
   		return endpoint1300;
   }

  
	/**
	*  set variable endpoint1300
	*  Corresponding COBOL Variable is 300-ENDPOINT1
	*  @param value
	**/
   public void setEndpoint1300(char[] value) {
       value = checkEndpoint1300Constraints(value);
       arraycopy(value,0,endpoint1300,0,value.length);
   } 
	public void setEndpoint1300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endpoint1300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of type2300
	 *	@return type2300
	 */
   public char[] getType2300() throws CFException{
   		return type2300;
   }

  
	/**
	*  set variable type2300
	*  Corresponding COBOL Variable is 300-TYPE2
	*  @param value
	**/
   public void setType2300(char[] value) {
       value = checkType2300Constraints(value);
       arraycopy(value,0,type2300,0,value.length);
   } 
	public void setType2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,type2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ica2300
	 *	@return ica2300
	 */
   public char[] getIca2300() throws CFException{
   		return ica2300;
   }

  
	/**
	*  set variable ica2300
	*  Corresponding COBOL Variable is 300-ICA2
	*  @param value
	**/
   public void setIca2300(char[] value) {
       value = checkIca2300Constraints(value);
       arraycopy(value,0,ica2300,0,value.length);
   } 
	public void setIca2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ica2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of bin2300
	 *	@return bin2300
	 */
   public char[] getBin2300() throws CFException{
   		return bin2300;
   }

  
	/**
	*  set variable bin2300
	*  Corresponding COBOL Variable is 300-BIN2
	*  @param value
	**/
   public void setBin2300(char[] value) {
       value = checkBin2300Constraints(value);
       arraycopy(value,0,bin2300,0,value.length);
   } 
	public void setBin2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,bin2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of maid2300
	 *	@return maid2300
	 */
   public char[] getMaid2300() throws CFException{
   		return maid2300;
   }

  
	/**
	*  set variable maid2300
	*  Corresponding COBOL Variable is 300-MAID2
	*  @param value
	**/
   public void setMaid2300(char[] value) {
       value = checkMaid2300Constraints(value);
       arraycopy(value,0,maid2300,0,value.length);
   } 
	public void setMaid2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,maid2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of endpoint2300
	 *	@return endpoint2300
	 */
   public char[] getEndpoint2300() throws CFException{
   		return endpoint2300;
   }

  
	/**
	*  set variable endpoint2300
	*  Corresponding COBOL Variable is 300-ENDPOINT2
	*  @param value
	**/
   public void setEndpoint2300(char[] value) {
       value = checkEndpoint2300Constraints(value);
       arraycopy(value,0,endpoint2300,0,value.length);
   } 
	public void setEndpoint2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,endpoint2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of value75300
	 *	@return value75300
	 */
   public char[] getValue75300() throws CFException{
   		return value75300;
   }

  
	/**
	*  set variable value75300
	*  Corresponding COBOL Variable is 300-VALUE-75
	*  @param value
	**/
   public void setValue75300(char[] value) {
       value = checkValue75300Constraints(value);
       arraycopy(value,0,value75300,0,value.length);
   } 
	public void setValue75300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,value75300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of value01300
	 *	@return value01300
	 */
   public char[] getValue01300() throws CFException{
   		return value01300;
   }

  
	/**
	*  set variable value01300
	*  Corresponding COBOL Variable is 300-VALUE-01
	*  @param value
	**/
   public void setValue01300(char[] value) {
       value = checkValue01300Constraints(value);
       arraycopy(value,0,value01300,0,value.length);
   } 
	public void setValue01300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,value01300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueWa300
	 *	@return valueWa300
	 */
   public char[] getValueWa300() throws CFException{
   		return valueWa300;
   }

  
	/**
	*  set variable valueWa300
	*  Corresponding COBOL Variable is 300-VALUE-WA
	*  @param value
	**/
   public void setValueWa300(char[] value) {
       value = checkValueWa300Constraints(value);
       arraycopy(value,0,valueWa300,0,value.length);
   } 
	public void setValueWa300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueWa300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of value65300
	 *	@return value65300
	 */
   public char[] getValue65300() throws CFException{
   		return value65300;
   }

  
	/**
	*  set variable value65300
	*  Corresponding COBOL Variable is 300-VALUE-65
	*  @param value
	**/
   public void setValue65300(char[] value) {
       value = checkValue65300Constraints(value);
       arraycopy(value,0,value65300,0,value.length);
   } 
	public void setValue65300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,value65300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dfltMaxLen300
	 *	@return dfltMaxLen300
	 */
	public int getDfltMaxLen300() throws CFException {
       if (isDfltMaxLen300Modified()) { 
           dfltMaxLen300 = refreshDfltMaxLen300();
        }
   		return dfltMaxLen300;
	}
	

	
	   
	/**
	 * 	Update DfltMaxLen300 with the passed value
	 *  Corresponding COBOL Variable is 300-DFLT-MAX-LEN
	 *	@param number
	 */
	public void setDfltMaxLen300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    dfltMaxLen300 = checkDfltMaxLen300MaxLimit(number); 
		serializeDfltMaxLen300(dfltMaxLen300);
	}
	

	public void setDfltMaxLen300(long number) {
	    number = checkDfltMaxLen300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDfltMaxLen300((int)number);
	}
	
	/**
	 * 	Update DfltMaxLen300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDfltMaxLen300(char[] value) throws CFException {
		 dfltMaxLen300 = serializeDfltMaxLen300(value);
	}
	/**
	 * 	Update DfltMaxLen300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDfltMaxLen300String(char[] value) throws CFException {
		 setDfltMaxLen300(value);
	}
	/**
	 *	Returns the value of para1150300
	 *	@return para1150300
	 */
   public char[] getPara1150300() throws CFException{
   		return para1150300;
   }

  
	/**
	*  set variable para1150300
	*  Corresponding COBOL Variable is 300-PARA-1150
	*  @param value
	**/
   public void setPara1150300(char[] value) {
       value = checkPara1150300Constraints(value);
       arraycopy(value,0,para1150300,0,value.length);
   } 
	public void setPara1150300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1150300,0,beginIndex + endIndex);
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
	 *	Returns the value of para1510300
	 *	@return para1510300
	 */
   public char[] getPara1510300() throws CFException{
   		return para1510300;
   }

  
	/**
	*  set variable para1510300
	*  Corresponding COBOL Variable is 300-PARA-1510
	*  @param value
	**/
   public void setPara1510300(char[] value) {
       value = checkPara1510300Constraints(value);
       arraycopy(value,0,para1510300,0,value.length);
   } 
	public void setPara1510300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1510300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para1610300
	 *	@return para1610300
	 */
   public char[] getPara1610300() throws CFException{
   		return para1610300;
   }

  
	/**
	*  set variable para1610300
	*  Corresponding COBOL Variable is 300-PARA-1610
	*  @param value
	**/
   public void setPara1610300(char[] value) {
       value = checkPara1610300Constraints(value);
       arraycopy(value,0,para1610300,0,value.length);
   } 
	public void setPara1610300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para1610300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para2100300
	 *	@return para2100300
	 */
   public char[] getPara2100300() throws CFException{
   		return para2100300;
   }

  
	/**
	*  set variable para2100300
	*  Corresponding COBOL Variable is 300-PARA-2100
	*  @param value
	**/
   public void setPara2100300(char[] value) {
       value = checkPara2100300Constraints(value);
       arraycopy(value,0,para2100300,0,value.length);
   } 
	public void setPara2100300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2100300,0,beginIndex + endIndex);
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
	 *	Returns the value of para2310300
	 *	@return para2310300
	 */
   public char[] getPara2310300() throws CFException{
   		return para2310300;
   }

  
	/**
	*  set variable para2310300
	*  Corresponding COBOL Variable is 300-PARA-2310
	*  @param value
	**/
   public void setPara2310300(char[] value) {
       value = checkPara2310300Constraints(value);
       arraycopy(value,0,para2310300,0,value.length);
   } 
	public void setPara2310300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2310300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para2512300
	 *	@return para2512300
	 */
   public char[] getPara2512300() throws CFException{
   		return para2512300;
   }

  
	/**
	*  set variable para2512300
	*  Corresponding COBOL Variable is 300-PARA-2512
	*  @param value
	**/
   public void setPara2512300(char[] value) {
       value = checkPara2512300Constraints(value);
       arraycopy(value,0,para2512300,0,value.length);
   } 
	public void setPara2512300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para2512300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para3110300
	 *	@return para3110300
	 */
   public char[] getPara3110300() throws CFException{
   		return para3110300;
   }

  
	/**
	*  set variable para3110300
	*  Corresponding COBOL Variable is 300-PARA-3110
	*  @param value
	**/
   public void setPara3110300(char[] value) {
       value = checkPara3110300Constraints(value);
       arraycopy(value,0,para3110300,0,value.length);
   } 
	public void setPara3110300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para3110300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para3120300
	 *	@return para3120300
	 */
   public char[] getPara3120300() throws CFException{
   		return para3120300;
   }

  
	/**
	*  set variable para3120300
	*  Corresponding COBOL Variable is 300-PARA-3120
	*  @param value
	**/
   public void setPara3120300(char[] value) {
       value = checkPara3120300Constraints(value);
       arraycopy(value,0,para3120300,0,value.length);
   } 
	public void setPara3120300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para3120300,0,beginIndex + endIndex);
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
	 *	Returns the value of para80001240200300
	 *	@return para80001240200300
	 */
   public char[] getPara80001240200300() throws CFException{
   		return para80001240200300;
   }

  
	/**
	*  set variable para80001240200300
	*  Corresponding COBOL Variable is 300-PARA-8000-1240200
	*  @param value
	**/
   public void setPara80001240200300(char[] value) {
       value = checkPara80001240200300Constraints(value);
       arraycopy(value,0,para80001240200300,0,value.length);
   } 
	public void setPara80001240200300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para80001240200300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para80001644695300
	 *	@return para80001644695300
	 */
   public char[] getPara80001644695300() throws CFException{
   		return para80001644695300;
   }

  
	/**
	*  set variable para80001644695300
	*  Corresponding COBOL Variable is 300-PARA-8000-1644695
	*  @param value
	**/
   public void setPara80001644695300(char[] value) {
       value = checkPara80001644695300Constraints(value);
       arraycopy(value,0,para80001644695300,0,value.length);
   } 
	public void setPara80001644695300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para80001644695300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para80001644697300
	 *	@return para80001644697300
	 */
   public char[] getPara80001644697300() throws CFException{
   		return para80001644697300;
   }

  
	/**
	*  set variable para80001644697300
	*  Corresponding COBOL Variable is 300-PARA-8000-1644697
	*  @param value
	**/
   public void setPara80001644697300(char[] value) {
       value = checkPara80001644697300Constraints(value);
       arraycopy(value,0,para80001644697300,0,value.length);
   } 
	public void setPara80001644697300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para80001644697300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8000Comn300
	 *	@return para8000Comn300
	 */
   public char[] getPara8000Comn300() throws CFException{
   		return para8000Comn300;
   }

  
	/**
	*  set variable para8000Comn300
	*  Corresponding COBOL Variable is 300-PARA-8000-COMN
	*  @param value
	**/
   public void setPara8000Comn300(char[] value) {
       value = checkPara8000Comn300Constraints(value);
       arraycopy(value,0,para8000Comn300,0,value.length);
   } 
	public void setPara8000Comn300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8000Comn300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of para8800300
	 *	@return para8800300
	 */
   public char[] getPara8800300() throws CFException{
   		return para8800300;
   }

  
	/**
	*  set variable para8800300
	*  Corresponding COBOL Variable is 300-PARA-8800
	*  @param value
	**/
   public void setPara8800300(char[] value) {
       value = checkPara8800300Constraints(value);
       arraycopy(value,0,para8800300,0,value.length);
   } 
	public void setPara8800300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,para8800300,0,beginIndex + endIndex);
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
	public int getSys001RecsRead400() throws CFException {
        if (isSys001RecsRead400Modified()) { 
           sys001RecsRead400 = refreshSys001RecsRead400();
        }
   		return sys001RecsRead400;
	}
	
	/**
	 * 	Update Sys001RecsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS001-RECS-READ
	 *	@param number
	 */
	public void setSys001RecsRead400(int number) {
			sys001RecsRead400 = checkSys001RecsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys001RecsRead400(sys001RecsRead400);
	}


	public void setSys001RecsRead400(long number) {
	    number = checkSys001RecsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys001RecsRead400((int)number);
	}
	
	public int getSys003RecsRead400() throws CFException {
        if (isSys003RecsRead400Modified()) { 
           sys003RecsRead400 = refreshSys003RecsRead400();
        }
   		return sys003RecsRead400;
	}
	
	/**
	 * 	Update Sys003RecsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS003-RECS-READ
	 *	@param number
	 */
	public void setSys003RecsRead400(int number) {
			sys003RecsRead400 = checkSys003RecsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys003RecsRead400(sys003RecsRead400);
	}


	public void setSys003RecsRead400(long number) {
	    number = checkSys003RecsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys003RecsRead400((int)number);
	}
	
	public int getSys004RecsRead400() throws CFException {
        if (isSys004RecsRead400Modified()) { 
           sys004RecsRead400 = refreshSys004RecsRead400();
        }
   		return sys004RecsRead400;
	}
	
	/**
	 * 	Update Sys004RecsRead400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS004-RECS-READ
	 *	@param number
	 */
	public void setSys004RecsRead400(int number) {
			sys004RecsRead400 = checkSys004RecsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys004RecsRead400(sys004RecsRead400);
	}


	public void setSys004RecsRead400(long number) {
	    number = checkSys004RecsRead400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys004RecsRead400((int)number);
	}
	
	public int getSys101RecsWrit400() throws CFException {
        if (isSys101RecsWrit400Modified()) { 
           sys101RecsWrit400 = refreshSys101RecsWrit400();
        }
   		return sys101RecsWrit400;
	}
	
	/**
	 * 	Update Sys101RecsWrit400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS101-RECS-WRIT
	 *	@param number
	 */
	public void setSys101RecsWrit400(int number) {
			sys101RecsWrit400 = checkSys101RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys101RecsWrit400(sys101RecsWrit400);
	}


	public void setSys101RecsWrit400(long number) {
	    number = checkSys101RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys101RecsWrit400((int)number);
	}
	
	public int getSys201RecsWrit400() throws CFException {
        if (isSys201RecsWrit400Modified()) { 
           sys201RecsWrit400 = refreshSys201RecsWrit400();
        }
   		return sys201RecsWrit400;
	}
	
	/**
	 * 	Update Sys201RecsWrit400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS201-RECS-WRIT
	 *	@param number
	 */
	public void setSys201RecsWrit400(int number) {
			sys201RecsWrit400 = checkSys201RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys201RecsWrit400(sys201RecsWrit400);
	}


	public void setSys201RecsWrit400(long number) {
	    number = checkSys201RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys201RecsWrit400((int)number);
	}
	
	public int getSys202RecsWrit400() throws CFException {
        if (isSys202RecsWrit400Modified()) { 
           sys202RecsWrit400 = refreshSys202RecsWrit400();
        }
   		return sys202RecsWrit400;
	}
	
	/**
	 * 	Update Sys202RecsWrit400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS202-RECS-WRIT
	 *	@param number
	 */
	public void setSys202RecsWrit400(int number) {
			sys202RecsWrit400 = checkSys202RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys202RecsWrit400(sys202RecsWrit400);
	}


	public void setSys202RecsWrit400(long number) {
	    number = checkSys202RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys202RecsWrit400((int)number);
	}
	
	public int getSys204RecsWrit400() throws CFException {
        if (isSys204RecsWrit400Modified()) { 
           sys204RecsWrit400 = refreshSys204RecsWrit400();
        }
   		return sys204RecsWrit400;
	}
	
	/**
	 * 	Update Sys204RecsWrit400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS204-RECS-WRIT
	 *	@param number
	 */
	public void setSys204RecsWrit400(int number) {
			sys204RecsWrit400 = checkSys204RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys204RecsWrit400(sys204RecsWrit400);
	}


	public void setSys204RecsWrit400(long number) {
	    number = checkSys204RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys204RecsWrit400((int)number);
	}
	
	public int getSys205RecsWrit400() throws CFException {
        if (isSys205RecsWrit400Modified()) { 
           sys205RecsWrit400 = refreshSys205RecsWrit400();
        }
   		return sys205RecsWrit400;
	}
	
	/**
	 * 	Update Sys205RecsWrit400 with the passed value
	 *  Corresponding COBOL Variable is 400-SYS205-RECS-WRIT
	 *	@param number
	 */
	public void setSys205RecsWrit400(int number) {
			sys205RecsWrit400 = checkSys205RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeSys205RecsWrit400(sys205RecsWrit400);
	}


	public void setSys205RecsWrit400(long number) {
	    number = checkSys205RecsWrit400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSys205RecsWrit400((int)number);
	}
	
	public int getLoopCntr400() throws CFException {
        if (isLoopCntr400Modified()) { 
           loopCntr400 = refreshLoopCntr400();
        }
   		return loopCntr400;
	}
	
	/**
	 * 	Update LoopCntr400 with the passed value
	 *  Corresponding COBOL Variable is 400-LOOP-CNTR
	 *	@param number
	 */
	public void setLoopCntr400(int number) {
			loopCntr400 = checkLoopCntr400MaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeLoopCntr400(loopCntr400);
	}


	public void setLoopCntr400(long number) {
	    number = checkLoopCntr400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLoopCntr400((int)number);
	}
	
	/**
	 *	Returns the value of comnTblItems500
	 *	@return comnTblItems500
	 */
	public int getComnTblItems500() throws CFException {
   		return comnTblItems500;
	}
	
	/**
	 * 	Update ComnTblItems500 with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TBL-ITEMS
	 *	@param number
	 */
	public void setComnTblItems500(int number) {
	     // Truncate if the number is beyond +/- Max range
	    comnTblItems500 = checkComnTblItems500MaxLimit(number); 
	}


	public void setComnTblItems500(long number) {
	    number = checkComnTblItems500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setComnTblItems500((int)number);
	}
	
	/**
	 *	Returns the value of comnTblMax500
	 *	@return comnTblMax500
	 */
	public int getComnTblMax500() throws CFException {
   		return comnTblMax500;
	}
	
	/**
	 * 	Update ComnTblMax500 with the passed value
	 *  Corresponding COBOL Variable is 500-COMN-TBL-MAX
	 *	@param number
	 */
	public void setComnTblMax500(int number) {
	     // Truncate if the number is beyond +/- Max range
	    comnTblMax500 = checkComnTblMax500MaxLimit(number); 
	}


	public void setComnTblMax500(long number) {
	    number = checkComnTblMax500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setComnTblMax500((int)number);
	}
	
	/**
	 *	Returns the value of comnTblSrchKey500
	 *	@return comnTblSrchKey500
	 */
   public char[] getComnTblSrchKey500() throws CFException{
   		return comnTblSrchKey500;
   }

  
	/**
	*  set variable comnTblSrchKey500
	*  Corresponding COBOL Variable is 500-COMN-TBL-SRCH-KEY
	*  @param value
	**/
   public void setComnTblSrchKey500(char[] value) {
       value = checkComnTblSrchKey500Constraints(value);
       arraycopy(value,0,comnTblSrchKey500,0,value.length);
   } 
	public void setComnTblSrchKey500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,comnTblSrchKey500,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of comnSrchKeyFndSw500
	 *	@return comnSrchKeyFndSw500
	 */
   public char[] getComnSrchKeyFndSw500() throws CFException{
   		return comnSrchKeyFndSw500;
   }

  
	/**
	*  set variable comnSrchKeyFndSw500
	*  Corresponding COBOL Variable is 500-COMN-SRCH-KEY-FND-SW
	*  @param value
	**/
   public void setComnSrchKeyFndSw500(char[] value) {
       value = checkComnSrchKeyFndSw500Constraints(value);
       arraycopy(value,0,comnSrchKeyFndSw500,0,value.length);
   } 
	public void setComnSrchKeyFndSw500(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,comnSrchKeyFndSw500,0,beginIndex + endIndex);
   }
	char[] comnSrchKeyFnd50088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isComnSrchKeyFnd500()
	 *	@return  Returns true if isComnSrchKeyFnd500() is "Y"
	 */
   public boolean isComnSrchKeyFnd500() throws CFException {
      return (  compareChars( getComnSrchKeyFndSw500() , comnSrchKeyFnd50088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setComnSrchKeyFnd500True() {  			
    	setComnSrchKeyFndSw500( comnSrchKeyFnd50088Value);
   	}
	char[] comnSrchKeyNotFnd50088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isComnSrchKeyNotFnd500()
	 *	@return  Returns true if isComnSrchKeyNotFnd500() is "N"
	 */
   public boolean isComnSrchKeyNotFnd500() throws CFException {
      return (  compareChars( getComnSrchKeyFndSw500() , comnSrchKeyNotFnd50088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setComnSrchKeyNotFnd500True() {  			
    	setComnSrchKeyFndSw500( comnSrchKeyNotFnd50088Value);
   	}
	/**
	 *	Returns the value of tblItems5001240200
	 *	@return tblItems5001240200
	 */
	public int getTblItems5001240200() throws CFException {
   		return tblItems5001240200;
	}
	
	/**
	 * 	Update TblItems5001240200 with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TBL-ITEMS
	 *	@param number
	 */
	public void setTblItems5001240200(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tblItems5001240200 = checkTblItems5001240200MaxLimit(number); 
	}


	public void setTblItems5001240200(long number) {
	    number = checkTblItems5001240200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTblItems5001240200((int)number);
	}
	
	/**
	 *	Returns the value of tblMax5001240200
	 *	@return tblMax5001240200
	 */
	public int getTblMax5001240200() throws CFException {
   		return tblMax5001240200;
	}
	
	/**
	 * 	Update TblMax5001240200 with the passed value
	 *  Corresponding COBOL Variable is 500-1240200-TBL-MAX
	 *	@param number
	 */
	public void setTblMax5001240200(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tblMax5001240200 = checkTblMax5001240200MaxLimit(number); 
	}


	public void setTblMax5001240200(long number) {
	    number = checkTblMax5001240200MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTblMax5001240200((int)number);
	}
	
	/**
	 *	Returns the value of tblSrchKey5001240200
	 *	@return tblSrchKey5001240200
	 */
   public char[] getTblSrchKey5001240200() throws CFException{
   		return tblSrchKey5001240200;
   }

  
	/**
	*  set variable tblSrchKey5001240200
	*  Corresponding COBOL Variable is 500-1240200-TBL-SRCH-KEY
	*  @param value
	**/
   public void setTblSrchKey5001240200(char[] value) {
       value = checkTblSrchKey5001240200Constraints(value);
       arraycopy(value,0,tblSrchKey5001240200,0,value.length);
   } 
	public void setTblSrchKey5001240200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblSrchKey5001240200,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of srchKeyFndSw5001240200
	 *	@return srchKeyFndSw5001240200
	 */
   public char[] getSrchKeyFndSw5001240200() throws CFException{
   		return srchKeyFndSw5001240200;
   }

  
	/**
	*  set variable srchKeyFndSw5001240200
	*  Corresponding COBOL Variable is 500-1240200-SRCH-KEY-FND-SW
	*  @param value
	**/
   public void setSrchKeyFndSw5001240200(char[] value) {
       value = checkSrchKeyFndSw5001240200Constraints(value);
       arraycopy(value,0,srchKeyFndSw5001240200,0,value.length);
   } 
	public void setSrchKeyFndSw5001240200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,srchKeyFndSw5001240200,0,beginIndex + endIndex);
   }
	char[] srchKeyFnd500124020088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSrchKeyFnd5001240200()
	 *	@return  Returns true if isSrchKeyFnd5001240200() is "Y"
	 */
   public boolean isSrchKeyFnd5001240200() throws CFException {
      return (  compareChars( getSrchKeyFndSw5001240200() , srchKeyFnd500124020088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSrchKeyFnd5001240200True() {  			
    	setSrchKeyFndSw5001240200( srchKeyFnd500124020088Value);
   	}
	char[] srchKeyNotFnd500124020088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSrchKeyNotFnd5001240200()
	 *	@return  Returns true if isSrchKeyNotFnd5001240200() is "N"
	 */
   public boolean isSrchKeyNotFnd5001240200() throws CFException {
      return (  compareChars( getSrchKeyFndSw5001240200() , srchKeyNotFnd500124020088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSrchKeyNotFnd5001240200True() {  			
    	setSrchKeyFndSw5001240200( srchKeyNotFnd500124020088Value);
   	}
	/**
	 *	Returns the value of tblItems5001644695
	 *	@return tblItems5001644695
	 */
	public int getTblItems5001644695() throws CFException {
   		return tblItems5001644695;
	}
	
	/**
	 * 	Update TblItems5001644695 with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TBL-ITEMS
	 *	@param number
	 */
	public void setTblItems5001644695(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tblItems5001644695 = checkTblItems5001644695MaxLimit(number); 
	}


	public void setTblItems5001644695(long number) {
	    number = checkTblItems5001644695MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTblItems5001644695((int)number);
	}
	
	/**
	 *	Returns the value of tblMax5001644695
	 *	@return tblMax5001644695
	 */
	public int getTblMax5001644695() throws CFException {
   		return tblMax5001644695;
	}
	
	/**
	 * 	Update TblMax5001644695 with the passed value
	 *  Corresponding COBOL Variable is 500-1644695-TBL-MAX
	 *	@param number
	 */
	public void setTblMax5001644695(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tblMax5001644695 = checkTblMax5001644695MaxLimit(number); 
	}


	public void setTblMax5001644695(long number) {
	    number = checkTblMax5001644695MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTblMax5001644695((int)number);
	}
	
	/**
	 *	Returns the value of tblSrchKey5001644695
	 *	@return tblSrchKey5001644695
	 */
   public char[] getTblSrchKey5001644695() throws CFException{
   		return tblSrchKey5001644695;
   }

  
	/**
	*  set variable tblSrchKey5001644695
	*  Corresponding COBOL Variable is 500-1644695-TBL-SRCH-KEY
	*  @param value
	**/
   public void setTblSrchKey5001644695(char[] value) {
       value = checkTblSrchKey5001644695Constraints(value);
       arraycopy(value,0,tblSrchKey5001644695,0,value.length);
   } 
	public void setTblSrchKey5001644695(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblSrchKey5001644695,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of srchKeyFndSw5001644695
	 *	@return srchKeyFndSw5001644695
	 */
   public char[] getSrchKeyFndSw5001644695() throws CFException{
   		return srchKeyFndSw5001644695;
   }

  
	/**
	*  set variable srchKeyFndSw5001644695
	*  Corresponding COBOL Variable is 500-1644695-SRCH-KEY-FND-SW
	*  @param value
	**/
   public void setSrchKeyFndSw5001644695(char[] value) {
       value = checkSrchKeyFndSw5001644695Constraints(value);
       arraycopy(value,0,srchKeyFndSw5001644695,0,value.length);
   } 
	public void setSrchKeyFndSw5001644695(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,srchKeyFndSw5001644695,0,beginIndex + endIndex);
   }
	char[] srchKeyFnd500164469588Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSrchKeyFnd5001644695()
	 *	@return  Returns true if isSrchKeyFnd5001644695() is "Y"
	 */
   public boolean isSrchKeyFnd5001644695() throws CFException {
      return (  compareChars( getSrchKeyFndSw5001644695() , srchKeyFnd500164469588Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSrchKeyFnd5001644695True() {  			
    	setSrchKeyFndSw5001644695( srchKeyFnd500164469588Value);
   	}
	char[] srchKeyNotFnd500164469588Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSrchKeyNotFnd5001644695()
	 *	@return  Returns true if isSrchKeyNotFnd5001644695() is "N"
	 */
   public boolean isSrchKeyNotFnd5001644695() throws CFException {
      return (  compareChars( getSrchKeyFndSw5001644695() , srchKeyNotFnd500164469588Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSrchKeyNotFnd5001644695True() {  			
    	setSrchKeyFndSw5001644695( srchKeyNotFnd500164469588Value);
   	}
	/**
	 *	Returns the value of tblItems5001644697
	 *	@return tblItems5001644697
	 */
	public int getTblItems5001644697() throws CFException {
   		return tblItems5001644697;
	}
	
	/**
	 * 	Update TblItems5001644697 with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TBL-ITEMS
	 *	@param number
	 */
	public void setTblItems5001644697(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tblItems5001644697 = checkTblItems5001644697MaxLimit(number); 
	}


	public void setTblItems5001644697(long number) {
	    number = checkTblItems5001644697MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTblItems5001644697((int)number);
	}
	
	/**
	 *	Returns the value of tblMax5001644697
	 *	@return tblMax5001644697
	 */
	public int getTblMax5001644697() throws CFException {
   		return tblMax5001644697;
	}
	
	/**
	 * 	Update TblMax5001644697 with the passed value
	 *  Corresponding COBOL Variable is 500-1644697-TBL-MAX
	 *	@param number
	 */
	public void setTblMax5001644697(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tblMax5001644697 = checkTblMax5001644697MaxLimit(number); 
	}


	public void setTblMax5001644697(long number) {
	    number = checkTblMax5001644697MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTblMax5001644697((int)number);
	}
	
	/**
	 *	Returns the value of tblSrchKey5001644697
	 *	@return tblSrchKey5001644697
	 */
   public char[] getTblSrchKey5001644697() throws CFException{
   		return tblSrchKey5001644697;
   }

  
	/**
	*  set variable tblSrchKey5001644697
	*  Corresponding COBOL Variable is 500-1644697-TBL-SRCH-KEY
	*  @param value
	**/
   public void setTblSrchKey5001644697(char[] value) {
       value = checkTblSrchKey5001644697Constraints(value);
       arraycopy(value,0,tblSrchKey5001644697,0,value.length);
   } 
	public void setTblSrchKey5001644697(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tblSrchKey5001644697,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of srchKeyFndSw5001644697
	 *	@return srchKeyFndSw5001644697
	 */
   public char[] getSrchKeyFndSw5001644697() throws CFException{
   		return srchKeyFndSw5001644697;
   }

  
	/**
	*  set variable srchKeyFndSw5001644697
	*  Corresponding COBOL Variable is 500-1644697-SRCH-KEY-FND-SW
	*  @param value
	**/
   public void setSrchKeyFndSw5001644697(char[] value) {
       value = checkSrchKeyFndSw5001644697Constraints(value);
       arraycopy(value,0,srchKeyFndSw5001644697,0,value.length);
   } 
	public void setSrchKeyFndSw5001644697(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,srchKeyFndSw5001644697,0,beginIndex + endIndex);
   }
	char[] srchKeyFnd500164469788Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isSrchKeyFnd5001644697()
	 *	@return  Returns true if isSrchKeyFnd5001644697() is "Y"
	 */
   public boolean isSrchKeyFnd5001644697() throws CFException {
      return (  compareChars( getSrchKeyFndSw5001644697() , srchKeyFnd500164469788Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setSrchKeyFnd5001644697True() {  			
    	setSrchKeyFndSw5001644697( srchKeyFnd500164469788Value);
   	}
	char[] srchKeyNotFnd500164469788Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isSrchKeyNotFnd5001644697()
	 *	@return  Returns true if isSrchKeyNotFnd5001644697() is "N"
	 */
   public boolean isSrchKeyNotFnd5001644697() throws CFException {
      return (  compareChars( getSrchKeyFndSw5001644697() , srchKeyNotFnd500164469788Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setSrchKeyNotFnd5001644697True() {  			
    	setSrchKeyFndSw5001644697( srchKeyNotFnd500164469788Value);
   	}
	/**
	 *	Returns the value of rowCount500
	 *	@return rowCount500
	 */
	public int getRowCount500() throws CFException {
   		return rowCount500;
	}
	
	/**
	 * 	Update RowCount500 with the passed value
	 *  Corresponding COBOL Variable is 500-ROW-COUNT
	 *	@param number
	 */
	public void setRowCount500(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowCount500 = checkRowCount500MaxLimit(number); 
	}


	public void setRowCount500(long number) {
	    number = checkRowCount500MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowCount500((int)number);
	}
	
	/**
	 *	Returns the value of rowCount502
	 *	@return rowCount502
	 */
	public int getRowCount502() throws CFException {
   		return rowCount502;
	}
	
	/**
	 * 	Update RowCount502 with the passed value
	 *  Corresponding COBOL Variable is 502-ROW-COUNT
	 *	@param number
	 */
	public void setRowCount502(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowCount502 = checkRowCount502MaxLimit(number); 
	}


	public void setRowCount502(long number) {
	    number = checkRowCount502MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowCount502((int)number);
	}
	
	/**
	 *	Returns the value of rowCount501
	 *	@return rowCount501
	 */
	public int getRowCount501() throws CFException {
   		return rowCount501;
	}
	
	/**
	 * 	Update RowCount501 with the passed value
	 *  Corresponding COBOL Variable is 501-ROW-COUNT
	 *	@param number
	 */
	public void setRowCount501(int number) {
	     // Truncate if the number is beyond +/- Max range
	    rowCount501 = checkRowCount501MaxLimit(number); 
	}


	public void setRowCount501(long number) {
	    number = checkRowCount501MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRowCount501((int)number);
	}
	
	/**
	 *	Returns the value of allLineText600
	 *	@return allLineText600
	 */
   public char[] getAllLineText600() throws CFException{
   		return allLineText600;
   }

  
	/**
	*  set variable allLineText600
	*  Corresponding COBOL Variable is 600-ALL-LINE-TEXT
	*  @param value
	**/
   public void setAllLineText600(char[] value) {
       value = checkAllLineText600Constraints(value);
       arraycopy(value,0,allLineText600,0,value.length);
   } 
	public void setAllLineText600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,allLineText600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of headerText600
	 *	@return headerText600
	 */
   public char[] getHeaderText600() throws CFException{
   		return headerText600;
   }

  
	/**
	*  set variable headerText600
	*  Corresponding COBOL Variable is 600-HEADER-TEXT
	*  @param value
	**/
   public void setHeaderText600(char[] value) {
       value = checkHeaderText600Constraints(value);
       arraycopy(value,0,headerText600,0,value.length);
   } 
	public void setHeaderText600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,headerText600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lineText600
	 *	@return lineText600
	 */
   public char[] getLineText600() throws CFException{
   		return lineText600;
   }

  
	/**
	*  set variable lineText600
	*  Corresponding COBOL Variable is 600-LINE-TEXT
	*  @param value
	**/
   public void setLineText600(char[] value) {
       value = checkLineText600Constraints(value);
       arraycopy(value,0,lineText600,0,value.length);
   } 
	public void setLineText600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lineText600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorMsg6003015
	 *	@return errorMsg6003015
	 */
   public char[] getErrorMsg6003015() throws CFException{
   		return errorMsg6003015;
   }

  
	/**
	*  set variable errorMsg6003015
	*  Corresponding COBOL Variable is 600-3015-ERROR-MSG
	*  @param value
	**/
   public void setErrorMsg6003015(char[] value) {
       value = checkErrorMsg6003015Constraints(value);
       arraycopy(value,0,errorMsg6003015,0,value.length);
   } 
	public void setErrorMsg6003015(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorMsg6003015,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorMsg6003016
	 *	@return errorMsg6003016
	 */
   public char[] getErrorMsg6003016() throws CFException{
   		return errorMsg6003016;
   }

  
	/**
	*  set variable errorMsg6003016
	*  Corresponding COBOL Variable is 600-3016-ERROR-MSG
	*  @param value
	**/
   public void setErrorMsg6003016(char[] value) {
       value = checkErrorMsg6003016Constraints(value);
       arraycopy(value,0,errorMsg6003016,0,value.length);
   } 
	public void setErrorMsg6003016(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorMsg6003016,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorMsg6003017
	 *	@return errorMsg6003017
	 */
   public char[] getErrorMsg6003017() throws CFException{
   		return errorMsg6003017;
   }

  
	/**
	*  set variable errorMsg6003017
	*  Corresponding COBOL Variable is 600-3017-ERROR-MSG
	*  @param value
	**/
   public void setErrorMsg6003017(char[] value) {
       value = checkErrorMsg6003017Constraints(value);
       arraycopy(value,0,errorMsg6003017,0,value.length);
   } 
	public void setErrorMsg6003017(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorMsg6003017,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of errorCode600
	 *	@return errorCode600
	 */
	public int getErrorCode600() throws CFException {
       if (isErrorCode600Modified()) { 
           errorCode600 = refreshErrorCode600();
        }
   		return errorCode600;
	}
	

	
	   
	/**
	 * 	Update ErrorCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-ERROR-CODE
	 *	@param number
	 */
	public void setErrorCode600(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    errorCode600 = checkErrorCode600MaxLimit(number); 
		serializeErrorCode600(errorCode600);
	}
	

	public void setErrorCode600(long number) {
	    number = checkErrorCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setErrorCode600((int)number);
	}
	
	/**
	 * 	Update ErrorCode600 with the passed value
	 *	@param value (String or char[])
	 */
	public void setErrorCode600(char[] value) throws CFException {
		 errorCode600 = serializeErrorCode600(value);
	}
	/**
	 * 	Update ErrorCode600 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setErrorCode600String(char[] value) throws CFException {
		 setErrorCode600(value);
	}
	/**
	 *	Returns the value of errorText600
	 *	@return errorText600
	 */
   public char[] getErrorText600() throws CFException{
   		return errorText600;
   }

  
	/**
	*  set variable errorText600
	*  Corresponding COBOL Variable is 600-ERROR-TEXT
	*  @param value
	**/
   public void setErrorText600(char[] value) {
       value = checkErrorText600Constraints(value);
       arraycopy(value,0,errorText600,0,value.length);
   } 
	public void setErrorText600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorText600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of brandProduct800
	 *	@return brandProduct800
	 */
   public char[] getBrandProduct800() throws CFException{
   		return brandProduct800;
   }

  
	/**
	*  set variable brandProduct800
	*  Corresponding COBOL Variable is 800-BRAND-PRODUCT
	*  @param value
	**/
   public void setBrandProduct800(char[] value) {
       value = checkBrandProduct800Constraints(value);
       arraycopy(value,0,brandProduct800,0,value.length);
   } 
	public void setBrandProduct800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,brandProduct800,0,beginIndex + endIndex);
   }
	static java.util.Set<String> ird75ValidBp8880088Value = new java.util.HashSet<>();
static { 
	ird75ValidBp8880088Value.add( "MCC");
	ird75ValidBp8880088Value.add( "MCE");
	ird75ValidBp8880088Value.add( "MCG");
	ird75ValidBp8880088Value.add( "MCS");
	ird75ValidBp8880088Value.add( "MCT");
	ird75ValidBp8880088Value.add( "MCV");
	ird75ValidBp8880088Value.add( "MFD");
	ird75ValidBp8880088Value.add( "MFL");
	ird75ValidBp8880088Value.add( "MIU");
	ird75ValidBp8880088Value.add( "MPL");
	ird75ValidBp8880088Value.add( "MRC");
	ird75ValidBp8880088Value.add( "MRG");
	ird75ValidBp8880088Value.add( "MCD");
	ird75ValidBp8880088Value.add( "MDG");
	ird75ValidBp8880088Value.add( "MDH");
	ird75ValidBp8880088Value.add( "MDJ");
	ird75ValidBp8880088Value.add( "MDO");
	ird75ValidBp8880088Value.add( "MDP");
	ird75ValidBp8880088Value.add( "MDR");
	ird75ValidBp8880088Value.add( "MDS");
	ird75ValidBp8880088Value.add( "MHA");
	ird75ValidBp8880088Value.add( "MHK");
	ird75ValidBp8880088Value.add( "MIA");
	ird75ValidBp8880088Value.add( "MIP");
	ird75ValidBp8880088Value.add( "MPA");
	ird75ValidBp8880088Value.add( "MPF");
	ird75ValidBp8880088Value.add( "MPG");
	ird75ValidBp8880088Value.add( "MPM");
	ird75ValidBp8880088Value.add( "MPN");
	ird75ValidBp8880088Value.add( "MPO");
	ird75ValidBp8880088Value.add( "MPP");
	ird75ValidBp8880088Value.add( "MPR");
	ird75ValidBp8880088Value.add( "MPT");
	ird75ValidBp8880088Value.add( "MPV");
	ird75ValidBp8880088Value.add( "MPX");
	ird75ValidBp8880088Value.add( "MPY");
	ird75ValidBp8880088Value.add( "MPZ");
} 

	/**
	 *	Test condition "MCC" "MCE" "MCG" "MCS" "MCT" "MCV" "MFD" "MFL" "MIU" "MPL" "MRC" "MRG" "MCD" "MDG" "MDH" "MDJ" "MDO" "MDP" "MDR" "MDS" "MHA" "MHK" "MIA" "MIP" "MPA" "MPF" "MPG" "MPM" "MPN" "MPO" "MPP" "MPR" "MPT" "MPV" "MPX" "MPY" "MPZ" for isIrd75ValidBp88800()
	 *	@return  Returns true if isIrd75ValidBp88800() is "MCC" "MCE" "MCG" "MCS" "MCT" "MCV" "MFD" "MFL" "MIU" "MPL" "MRC" "MRG" "MCD" "MDG" "MDH" "MDJ" "MDO" "MDP" "MDR" "MDS" "MHA" "MHK" "MIA" "MIP" "MPA" "MPF" "MPG" "MPM" "MPN" "MPO" "MPP" "MPR" "MPT" "MPV" "MPX" "MPY" "MPZ"
	 */
   public boolean isIrd75ValidBp88800() throws CFException {
      return   ird75ValidBp8880088Value.contains(String.valueOf(getBrandProduct800()));
   }


	/**
	*  set values "MCC" "MCE" "MCG" "MCS" "MCT" "MCV" "MFD" "MFL" "MIU" "MPL" "MRC" "MRG" "MCD" "MDG" "MDH" "MDJ" "MDO" "MDP" "MDR" "MDS" "MHA" "MHK" "MIA" "MIP" "MPA" "MPF" "MPG" "MPM" "MPN" "MPO" "MPP" "MPR" "MPT" "MPV" "MPX" "MPY" "MPZ"
	*/
   	public void setIrd75ValidBp88800True() {  			
    	  setBrandProduct800(ird75ValidBp8880088Value.iterator().next().toCharArray());
   	}
	char[] ird01ValidBp8880088Value1 = "MFW".toCharArray();
char[] ird01ValidBp8880088Value2 = "MFH".toCharArray();
char[] ird01ValidBp8880088Value3 = "MCW".toCharArray();
char[] ird01ValidBp8880088Value4 = "MWE".toCharArray();

	/**
	 *	Test condition "MFW" "MFH" "MCW" "MWE" for isIrd01ValidBp88800()
	 *	@return  Returns true if isIrd01ValidBp88800() is "MFW" "MFH" "MCW" "MWE"
	 */
   public boolean isIrd01ValidBp88800() throws CFException {
      return (  compareChars( getBrandProduct800() , ird01ValidBp8880088Value1)  == 0  ||  compareChars( getBrandProduct800() , ird01ValidBp8880088Value2)  == 0  ||  compareChars( getBrandProduct800() , ird01ValidBp8880088Value3)  == 0  ||  compareChars( getBrandProduct800() , ird01ValidBp8880088Value4)  == 0  );
   }


	/**
	*  set values "MFW" "MFH" "MCW" "MWE"
	*/
   	public void setIrd01ValidBp88800True() {  			
    	setBrandProduct800( ird01ValidBp8880088Value1);
   	}
	char[] irdwaValidBp8880088Value1 = "MFB".toCharArray();
char[] irdwaValidBp8880088Value2 = "MFE".toCharArray();
char[] irdwaValidBp8880088Value3 = "MWE".toCharArray();

	/**
	 *	Test condition "MFB" "MFE" "MWE" for isIrdwaValidBp88800()
	 *	@return  Returns true if isIrdwaValidBp88800() is "MFB" "MFE" "MWE"
	 */
   public boolean isIrdwaValidBp88800() throws CFException {
      return (  compareChars( getBrandProduct800() , irdwaValidBp8880088Value1)  == 0  ||  compareChars( getBrandProduct800() , irdwaValidBp8880088Value2)  == 0  ||  compareChars( getBrandProduct800() , irdwaValidBp8880088Value3)  == 0  );
   }


	/**
	*  set values "MFB" "MFE" "MWE"
	*/
   	public void setIrdwaValidBp88800True() {  			
    	setBrandProduct800( irdwaValidBp8880088Value1);
   	}
	static java.util.Set<String> ird65ValidBp8880088Value = new java.util.HashSet<>();
static { 
	ird65ValidBp8880088Value.add( "MAB");
	ird65ValidBp8880088Value.add( "MAC");
	ird65ValidBp8880088Value.add( "MBD");
	ird65ValidBp8880088Value.add( "MCB");
	ird65ValidBp8880088Value.add( "MCF");
	ird65ValidBp8880088Value.add( "MCO");
	ird65ValidBp8880088Value.add( "MCP");
	ird65ValidBp8880088Value.add( "MDB");
	ird65ValidBp8880088Value.add( "MDL");
	ird65ValidBp8880088Value.add( "MEF");
	ird65ValidBp8880088Value.add( "MGF");
	ird65ValidBp8880088Value.add( "MNF");
	ird65ValidBp8880088Value.add( "MPK");
	ird65ValidBp8880088Value.add( "MPW");
	ird65ValidBp8880088Value.add( "MRW");
	ird65ValidBp8880088Value.add( "MWB");
	ird65ValidBp8880088Value.add( "MWO");
} 

	/**
	 *	Test condition "MAB" "MAC" "MBD" "MCB" "MCF" "MCO" "MCP" "MDB" "MDL" "MEF" "MGF" "MNF" "MPK" "MPW" "MRW" "MWB" "MWO" for isIrd65ValidBp88800()
	 *	@return  Returns true if isIrd65ValidBp88800() is "MAB" "MAC" "MBD" "MCB" "MCF" "MCO" "MCP" "MDB" "MDL" "MEF" "MGF" "MNF" "MPK" "MPW" "MRW" "MWB" "MWO"
	 */
   public boolean isIrd65ValidBp88800() throws CFException {
      return   ird65ValidBp8880088Value.contains(String.valueOf(getBrandProduct800()));
   }


	/**
	*  set values "MAB" "MAC" "MBD" "MCB" "MCF" "MCO" "MCP" "MDB" "MDL" "MEF" "MGF" "MNF" "MPK" "MPW" "MRW" "MWB" "MWO"
	*/
   	public void setIrd65ValidBp88800True() {  			
    	  setBrandProduct800(ird65ValidBp8880088Value.iterator().next().toCharArray());
   	}
	/**
	 *	Returns the value of fldNameLen800
	 *	@return fldNameLen800
	 */
	public int getFldNameLen800() throws CFException {
       if (isFldNameLen800Modified()) { 
           fldNameLen800 = refreshFldNameLen800();
        }
   		return fldNameLen800;
	}
	

	
	   
	/**
	 * 	Update FldNameLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-FLD-NAME-LEN
	 *	@param number
	 */
	public void setFldNameLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fldNameLen800 = checkFldNameLen800MaxLimit(number); 
		serializeFldNameLen800(fldNameLen800);
	}
	

	public void setFldNameLen800(long number) {
	    number = checkFldNameLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFldNameLen800((int)number);
	}
	
	/**
	 * 	Update FldNameLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFldNameLen800(char[] value) throws CFException {
		 fldNameLen800 = serializeFldNameLen800(value);
	}
	/**
	 * 	Update FldNameLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFldNameLen800String(char[] value) throws CFException {
		 setFldNameLen800(value);
	}
	/**
	 *	Returns the value of fldName800
	 *	@return fldName800
	 */
   public char[] getFldName800() throws CFException{
   		return fldName800;
   }

  
	/**
	*  set variable fldName800
	*  Corresponding COBOL Variable is 800-FLD-NAME
	*  @param value
	**/
   public void setFldName800(char[] value) {
       value = checkFldName800Constraints(value);
       arraycopy(value,0,fldName800,0,value.length);
   } 
	public void setFldName800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fldName800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fldValue800
	 *	@return fldValue800
	 */
   public char[] getFldValue800() throws CFException{
   		return fldValue800;
   }

  
	/**
	*  set variable fldValue800
	*  Corresponding COBOL Variable is 800-FLD-VALUE
	*  @param value
	**/
   public void setFldValue800(char[] value) {
       value = checkFldValue800Constraints(value);
       arraycopy(value,0,fldValue800,0,value.length);
   } 
	public void setFldValue800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,fldValue800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of fldLen800
	 *	@return fldLen800
	 */
	public int getFldLen800() throws CFException {
       if (isFldLen800Modified()) { 
           fldLen800 = refreshFldLen800();
        }
   		return fldLen800;
	}
	

	
	   
	/**
	 * 	Update FldLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-FLD-LEN
	 *	@param number
	 */
	public void setFldLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fldLen800 = checkFldLen800MaxLimit(number); 
		serializeFldLen800(fldLen800);
	}
	

	public void setFldLen800(long number) {
	    number = checkFldLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFldLen800((int)number);
	}
	
	/**
	 * 	Update FldLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFldLen800(char[] value) throws CFException {
		 fldLen800 = serializeFldLen800(value);
	}
	/**
	 * 	Update FldLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFldLen800String(char[] value) throws CFException {
		 setFldLen800(value);
	}
	/**
	 *	Returns the value of oldFldLen800
	 *	@return oldFldLen800
	 */
	public int getOldFldLen800() throws CFException {
       if (isOldFldLen800Modified()) { 
           oldFldLen800 = refreshOldFldLen800();
        }
   		return oldFldLen800;
	}
	

	
	   
	/**
	 * 	Update OldFldLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-OLD-FLD-LEN
	 *	@param number
	 */
	public void setOldFldLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    oldFldLen800 = checkOldFldLen800MaxLimit(number); 
		serializeOldFldLen800(oldFldLen800);
	}
	

	public void setOldFldLen800(long number) {
	    number = checkOldFldLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setOldFldLen800((int)number);
	}
	
	/**
	 * 	Update OldFldLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setOldFldLen800(char[] value) throws CFException {
		 oldFldLen800 = serializeOldFldLen800(value);
	}
	/**
	 * 	Update OldFldLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setOldFldLen800String(char[] value) throws CFException {
		 setOldFldLen800(value);
	}
	/**
	 *	Returns the value of padLen800
	 *	@return padLen800
	 */
	public int getPadLen800() throws CFException {
       if (isPadLen800Modified()) { 
           padLen800 = refreshPadLen800();
        }
   		return padLen800;
	}
	

	
	   
	/**
	 * 	Update PadLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-PAD-LEN
	 *	@param number
	 */
	public void setPadLen800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    padLen800 = checkPadLen800MaxLimit(number); 
		serializePadLen800(padLen800);
	}
	

	public void setPadLen800(long number) {
	    number = checkPadLen800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPadLen800((int)number);
	}
	
	/**
	 * 	Update PadLen800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPadLen800(char[] value) throws CFException {
		 padLen800 = serializePadLen800(value);
	}
	/**
	 * 	Update PadLen800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPadLen800String(char[] value) throws CFException {
		 setPadLen800(value);
	}
	/**
	 *	Returns the value of ptrAbend800
	 *	@return ptrAbend800
	 */
   public char[] getPtrAbend800() throws CFException{
   		return ptrAbend800;
   }

  
	/**
	*  set variable ptrAbend800
	*  Corresponding COBOL Variable is 800-PTR-ABEND
	*  @param value
	**/
   public void setPtrAbend800(char[] value) {
       value = checkPtrAbend800Constraints(value);
       arraycopy(value,0,ptrAbend800,0,value.length);
   } 
	public void setPtrAbend800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrAbend800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp169410800
	 *	@return ptrIp169410800
	 */
   public char[] getPtrIp169410800() throws CFException{
   		return ptrIp169410800;
   }

  
	/**
	*  set variable ptrIp169410800
	*  Corresponding COBOL Variable is 800-PTR-IP169410
	*  @param value
	**/
   public void setPtrIp169410800(char[] value) {
       value = checkPtrIp169410800Constraints(value);
       arraycopy(value,0,ptrIp169410800,0,value.length);
   } 
	public void setPtrIp169410800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp169410800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp666010800
	 *	@return ptrIp666010800
	 */
   public char[] getPtrIp666010800() throws CFException{
   		return ptrIp666010800;
   }

  
	/**
	*  set variable ptrIp666010800
	*  Corresponding COBOL Variable is 800-PTR-IP666010
	*  @param value
	**/
   public void setPtrIp666010800(char[] value) {
       value = checkPtrIp666010800Constraints(value);
       arraycopy(value,0,ptrIp666010800,0,value.length);
   } 
	public void setPtrIp666010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp666010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp666030800
	 *	@return ptrIp666030800
	 */
   public char[] getPtrIp666030800() throws CFException{
   		return ptrIp666030800;
   }

  
	/**
	*  set variable ptrIp666030800
	*  Corresponding COBOL Variable is 800-PTR-IP666030
	*  @param value
	**/
   public void setPtrIp666030800(char[] value) {
       value = checkPtrIp666030800Constraints(value);
       arraycopy(value,0,ptrIp666030800,0,value.length);
   } 
	public void setPtrIp666030800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp666030800,0,beginIndex + endIndex);
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

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
