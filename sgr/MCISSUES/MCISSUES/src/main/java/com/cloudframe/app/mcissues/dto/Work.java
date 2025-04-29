package com.cloudframe.app.mcissues.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


public class Work extends WorkSerialized {
   

						private char[] mcissuesWhenCompiled = Field.fillLowValue(17);

								private long dateWs;

								private short ip20004ItemLength;

								private short tmpLth800;

								private int value1300;

								private int value10300;

								private int value100300;

								private short iCtr400;

								private int ip00321ReplTextCount;

								private long editNumber800;

						private char[] valueOfPds158s3800 = Field.fillLowValue(6);

						private char[] valueOfPds158s2800 = Field.fillLowValue(1);

								private int i;

								private long date3;

						private char[] sys295EffDate2 = Field.fillLowValue(10);

						private char[] display = Field.fillLowValue(100);

								private int idx;

								private short one;

								private short four;

								private short two;

						private char[] cond = Field.fillLowValue(1);

						private char[] xmlTag300 = new char[43];

						private char[] xmlData300 = new char[30];

						private char[] xmlTag2300 = new char[44];

						private char[] xmlTag3300 = new char[42];

						private char[] xmlTag4300 = new char[43];

						private char[] xmlStr300 = Field.fillLowValue(80);

								private BigDecimal ip33701RateSrcToTrg = BigDecimal.ZERO;
      private List<Short> subValueCount400; 


								private short totalSubCount400;

								private short strt800;

								private char[] numSpaces = Field.fillLowValue(9);

						private char[] charWs = Field.fillLowValue(50);

						private char[] xmlText = new char[28];

						private char[] xmlData805 = Field.fillLowValue(50);

						private char[] lowValue300 = new char[1];

						private char[] highValue300 = new char[1];

						private char[] ampersand300 = new char[1];

						private char[] space300 = new char[1];

						private char[] prevTransType801 = Field.fillLowValue(4);

						private char[] prevMccCode801 = Field.fillLowValue(8);

						private char[] transType701 = Field.fillLowValue(80);

						private char[] exclusionFlag100 = Field.fillLowValue(1);

						private char[] var = new char[3];

						private char[] b = Field.fillLowValue(50);

						private char[] d = Field.fillLowValue(40);

								private short aLen;

								private short bLen;

								private short cLen;

								private short dLen;

								private BigDecimal ecbRateDiff800 = BigDecimal.ZERO;

								private long clearingDtTm9800;

								private long clearingDtTm9700;

						private char[] clearingDtTm9X700 = Field.fillLowValue(12);

								private long clearingDtTm9Short800;

						private char[] cf20004TableEnts = Field.fillLowValue(460);

						private char[] dtlRecord1800 = new char[69];

								private BigDecimal var1N = BigDecimal.ZERO;

								private char[] var1Ed = Field.fillLowValue(14);

								private char[] var2Ed = Field.fillLowValue(14);

						private char[] c0071300 = new char[4];

								private int ip00104Elsub;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setValue1300(1);
								setValue10300(10);
								setValue100300(100);
								setOne((short)1);
								setFour((short)4);
								setTwo((short)2);
								setXmlTag300(mergeArrays("<?xml version='1.0' encoding='ISO8859-1'?>".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x0D})));
								setXmlData300(("<Xmltag>data</Xmltag>         ").toCharArray());
								setXmlTag2300(mergeArrays(convertEbcdicBytes2Char(new byte[]{(byte)0x0D}) , "<?xml version='1.0' encoding='ISO8859-1'?>".toCharArray() , convertEbcdicBytes2Char(new byte[]{(byte)0x0D})));
								setXmlTag3300(("<?xml version='1.0' encoding='ISO8859-1'?>").toCharArray());
								setXmlTag4300(getString(new byte[] {(byte)0x4C,(byte)0x6F,(byte)0xA7,(byte)0x94,(byte)0x93,(byte)0x40,(byte)0xA5,(byte)0x85,(byte)0x99,(byte)0xA2,(byte)0x89,(byte)0x96,(byte)0x95,(byte)0x7E,(byte)0x7D,(byte)0xF1,(byte)0x4B,(byte)0xF0,(byte)0x7D,(byte)0x40,(byte)0x85,(byte)0x95,(byte)0x83,(byte)0x96,(byte)0x84,(byte)0x89,(byte)0x95,(byte)0x87,(byte)0x7E,(byte)0x7D,(byte)0xC9,(byte)0xE2,(byte)0xD6,(byte)0xF8,(byte)0xF8,(byte)0xF5,(byte)0xF9,(byte)0x60,(byte)0xF1,(byte)0x7D,(byte)0x6F,(byte)0x6E,(byte)0x0D}).toCharArray());
								setIp33701RateSrcToTrg(BigDecimal.valueOf(12345678.1234567).setScale(7));
							for (int arrayIndex = 0; arrayIndex < SUB_VALUE_COUNT_400_SIZE;arrayIndex++) {
								setSubValueCount400(arrayIndex,0);
							}
								setTotalSubCount400((short)0);
								setXmlText(mergeArrays("ABCD".toCharArray(),fillLowValue(4),"EFGH".toCharArray(),fillHighValue(4),"IJLK".toCharArray(),"&&&&".toCharArray(),"MNOP".toCharArray()));
								setLowValue300(fillLowValue(1));
								setHighValue300(fillHighValue(1));
								setAmpersand300(("&").toCharArray());
								setSpace300(fillSpace(1));
								setVar(fillSpace(3));
								setEcbRateDiff800(BigDecimal.ZERO);
								setDtlRecord1800(pad(69," ".toCharArray(),' ',RIGHT_PAD));
								setVar1N(BigDecimal.ZERO);
								setC0071300(("0071").toCharArray());
    }


 

	/**
	 *	Returns the value of mcissuesWhenCompiled
	 *	@return mcissuesWhenCompiled
	 */
   public char[] getMcissuesWhenCompiled() throws CFException{
   		return mcissuesWhenCompiled;
   }

  
	/**
	*  set variable mcissuesWhenCompiled
	*  Corresponding COBOL Variable is MCISSUES-WHEN-COMPILED
	*  @param value
	**/
   public void setMcissuesWhenCompiled(char[] value) {
       value = checkMcissuesWhenCompiledConstraints(value);
       arraycopy(value,0,mcissuesWhenCompiled,0,value.length);
   } 
	public void setMcissuesWhenCompiled(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,mcissuesWhenCompiled,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dateWs
	 *	@return dateWs
	 */
	public long getDateWs() throws CFException {
       if (isDateWsModified()) { 
           dateWs = refreshDateWs();
        }
   		return dateWs;
	}
	

	
	   
	/**
	 * 	Update DateWs with the passed value
	 *  Corresponding COBOL Variable is WS-DATE
	 *	@param number
	 */
	public void setDateWs(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dateWs = checkDateWsMaxLimit(number); 
		serializeDateWs(dateWs);
	}
	

	/**
	 * 	Update DateWs with the passed value
	 *	@param value (String or char[])
	 */
	public void setDateWs(char[] value) throws CFException {
		 dateWs = serializeDateWs(value);
	}
	/**
	 * 	Update DateWs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDateWsString(char[] value) throws CFException {
		 setDateWs(value);
	}
	/**
	 *	Returns the value of ip20004ItemLength
	 *	@return ip20004ItemLength
	 */
	public short getIp20004ItemLength() throws CFException {
   		return ip20004ItemLength;
	}
	
	/**
	 * 	Update Ip20004ItemLength with the passed value
	 *  Corresponding COBOL Variable is IP20004-ITEM-LENGTH
	 *	@param number
	 */
	public void setIp20004ItemLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip20004ItemLength = checkIp20004ItemLengthMaxLimit(number); 
	}

	public void setIp20004ItemLength(int number) {
	    number = checkIp20004ItemLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp20004ItemLength((short)number);
	}
	public void setIp20004ItemLength(long number) {
	    number = checkIp20004ItemLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp20004ItemLength((short)number);
	}
	

	/**
	 *	Returns the value of tmpLth800
	 *	@return tmpLth800
	 */
	public short getTmpLth800() throws CFException {
   		return tmpLth800;
	}
	
	/**
	 * 	Update TmpLth800 with the passed value
	 *  Corresponding COBOL Variable is 800-TMP-LTH
	 *	@param number
	 */
	public void setTmpLth800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tmpLth800 = checkTmpLth800MaxLimit(number); 
	}

	public void setTmpLth800(int number) {
	    number = checkTmpLth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTmpLth800((short)number);
	}
	public void setTmpLth800(long number) {
	    number = checkTmpLth800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTmpLth800((short)number);
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
	 *	Returns the value of value10300
	 *	@return value10300
	 */
	public int getValue10300() throws CFException {
       if (isValue10300Modified()) { 
           value10300 = refreshValue10300();
        }
   		return value10300;
	}
	

	
	   
	/**
	 * 	Update Value10300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-10
	 *	@param number
	 */
	public void setValue10300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value10300 = checkValue10300MaxLimit(number); 
		serializeValue10300(value10300);
	}
	

	public void setValue10300(long number) {
	    number = checkValue10300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue10300((int)number);
	}
	
	/**
	 * 	Update Value10300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue10300(char[] value) throws CFException {
		 value10300 = serializeValue10300(value);
	}
	/**
	 * 	Update Value10300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue10300String(char[] value) throws CFException {
		 setValue10300(value);
	}
	/**
	 *	Returns the value of value100300
	 *	@return value100300
	 */
	public int getValue100300() throws CFException {
       if (isValue100300Modified()) { 
           value100300 = refreshValue100300();
        }
   		return value100300;
	}
	

	
	   
	/**
	 * 	Update Value100300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-100
	 *	@param number
	 */
	public void setValue100300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value100300 = checkValue100300MaxLimit(number); 
		serializeValue100300(value100300);
	}
	

	public void setValue100300(long number) {
	    number = checkValue100300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue100300((int)number);
	}
	
	/**
	 * 	Update Value100300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue100300(char[] value) throws CFException {
		 value100300 = serializeValue100300(value);
	}
	/**
	 * 	Update Value100300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue100300String(char[] value) throws CFException {
		 setValue100300(value);
	}
	/**
	 *	Returns the value of iCtr400
	 *	@return iCtr400
	 */
	public short getICtr400() throws CFException {
   		return iCtr400;
	}
	
	/**
	 * 	Update ICtr400 with the passed value
	 *  Corresponding COBOL Variable is 400-I-CTR
	 *	@param number
	 */
	public void setICtr400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    iCtr400 = checkICtr400MaxLimit(number); 
	}

	public void setICtr400(int number) {
	    number = checkICtr400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setICtr400((short)number);
	}
	public void setICtr400(long number) {
	    number = checkICtr400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setICtr400((short)number);
	}
	

	/**
	 *	Returns the value of ip00321ReplTextCount
	 *	@return ip00321ReplTextCount
	 */
	public int getIp00321ReplTextCount() throws CFException {
       if (isIp00321ReplTextCountModified()) { 
           ip00321ReplTextCount = refreshIp00321ReplTextCount();
        }
   		return ip00321ReplTextCount;
	}
	

	
	   
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *  Corresponding COBOL Variable is IP00321-REPL-TEXT-COUNT
	 *	@param number
	 */
	public void setIp00321ReplTextCount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00321ReplTextCount = checkIp00321ReplTextCountMaxLimit(number); 
		serializeIp00321ReplTextCount(ip00321ReplTextCount);
	}
	

	public void setIp00321ReplTextCount(long number) {
	    number = checkIp00321ReplTextCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00321ReplTextCount((int)number);
	}
	
	/**
	 * 	Update Ip00321ReplTextCount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCount(char[] value) throws CFException {
		 ip00321ReplTextCount = serializeIp00321ReplTextCount(value);
	}
	/**
	 * 	Update Ip00321ReplTextCount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00321ReplTextCountString(char[] value) throws CFException {
		 setIp00321ReplTextCount(value);
	}
	/**
	 *	Returns the value of editNumber800
	 *	@return editNumber800
	 */
	public long getEditNumber800() throws CFException {
   		return editNumber800;
	}
	
	/**
	 * 	Update EditNumber800 with the passed value
	 *  Corresponding COBOL Variable is 800-EDIT-NUMBER
	 *	@param number
	 */
	public void setEditNumber800(long number) {
	     // Truncate if the number is beyond +/- Max range
	    editNumber800 = checkEditNumber800MaxLimit(number); 
	}


	/**
	 *	Returns the value of valueOfPds158s3800
	 *	@return valueOfPds158s3800
	 */
   public char[] getValueOfPds158s3800() throws CFException{
   		return valueOfPds158s3800;
   }

  
	/**
	*  set variable valueOfPds158s3800
	*  Corresponding COBOL Variable is 800-VALUE-OF-PDS158S3
	*  @param value
	**/
   public void setValueOfPds158s3800(char[] value) {
       value = checkValueOfPds158s3800Constraints(value);
       arraycopy(value,0,valueOfPds158s3800,0,value.length);
   } 
	public void setValueOfPds158s3800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueOfPds158s3800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of valueOfPds158s2800
	 *	@return valueOfPds158s2800
	 */
   public char[] getValueOfPds158s2800() throws CFException{
   		return valueOfPds158s2800;
   }

  
	/**
	*  set variable valueOfPds158s2800
	*  Corresponding COBOL Variable is 800-VALUE-OF-PDS158S2
	*  @param value
	**/
   public void setValueOfPds158s2800(char[] value) {
       value = checkValueOfPds158s2800Constraints(value);
       arraycopy(value,0,valueOfPds158s2800,0,value.length);
   } 
	public void setValueOfPds158s2800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,valueOfPds158s2800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of i
	 *	@return i
	 */
	public int getI() throws CFException {
       if (isIModified()) { 
           i = refreshI();
        }
   		return i;
	}
	

	
	   
	/**
	 * 	Update I with the passed value
	 *  Corresponding COBOL Variable is I
	 *	@param number
	 */
	public void setI(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    i = checkIMaxLimit(number); 
		serializeI(i);
	}
	

	public void setI(long number) {
	    number = checkIMaxLimit(number); // Truncate if value is beyond +/- Max range
		setI((int)number);
	}
	
	/**
	 * 	Update I with the passed value
	 *	@param value (String or char[])
	 */
	public void setI(char[] value) throws CFException {
		 i = serializeI(value);
	}
	/**
	 * 	Update I with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIString(char[] value) throws CFException {
		 setI(value);
	}
	/**
	 *	Returns the value of date3
	 *	@return date3
	 */
	public long getDate3() throws CFException {
       if (isDate3Modified()) { 
           date3 = refreshDate3();
        }
   		return date3;
	}
	

	
	   
	/**
	 * 	Update Date3 with the passed value
	 *  Corresponding COBOL Variable is WS-DATE-3
	 *	@param number
	 */
	public void setDate3(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    date3 = checkDate3MaxLimit(number); 
		serializeDate3(date3);
	}
	

	/**
	 * 	Update Date3 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDate3(char[] value) throws CFException {
		 date3 = serializeDate3(value);
	}
	/**
	 * 	Update Date3 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDate3String(char[] value) throws CFException {
		 setDate3(value);
	}
	/**
	 *	Returns the value of sys295EffDate2
	 *	@return sys295EffDate2
	 */
   public char[] getSys295EffDate2() throws CFException{
   		return sys295EffDate2;
   }

  
	/**
	*  set variable sys295EffDate2
	*  Corresponding COBOL Variable is SYS295-EFF-DATE-2
	*  @param value
	**/
   public void setSys295EffDate2(char[] value) {
       value = checkSys295EffDate2Constraints(value);
       arraycopy(value,0,sys295EffDate2,0,value.length);
   } 
	public void setSys295EffDate2(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sys295EffDate2,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of display
	 *	@return display
	 */
   public char[] getDisplay() throws CFException{
   		return display;
   }

  
	/**
	*  set variable display
	*  Corresponding COBOL Variable is WS-DISPLAY
	*  @param value
	**/
   public void setDisplay(char[] value) {
       value = checkDisplayConstraints(value);
       arraycopy(value,0,display,0,value.length);
   } 
	public void setDisplay(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,display,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of idx
	 *	@return idx
	 */
	public int getIdx() throws CFException {
       if (isIdxModified()) { 
           idx = refreshIdx();
        }
   		return idx;
	}
	

	
	   
	/**
	 * 	Update Idx with the passed value
	 *  Corresponding COBOL Variable is WS-IDX
	 *	@param number
	 */
	public void setIdx(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    idx = checkIdxMaxLimit(number); 
		serializeIdx(idx);
	}
	

	public void setIdx(long number) {
	    number = checkIdxMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIdx((int)number);
	}
	
	/**
	 * 	Update Idx with the passed value
	 *	@param value (String or char[])
	 */
	public void setIdx(char[] value) throws CFException {
		 idx = serializeIdx(value);
	}
	/**
	 * 	Update Idx with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIdxString(char[] value) throws CFException {
		 setIdx(value);
	}
	/**
	 *	Returns the value of one
	 *	@return one
	 */
	public short getOne() throws CFException {
   		return one;
	}
	
	/**
	 * 	Update One with the passed value
	 *  Corresponding COBOL Variable is WS-ONE
	 *	@param number
	 */
	public void setOne(short number) {
	     // Truncate if the number is beyond +/- Max range
	    one = checkOneMaxLimit(number); 
	}

	public void setOne(int number) {
	    number = checkOneMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOne((short)number);
	}
	public void setOne(long number) {
	    number = checkOneMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOne((short)number);
	}
	

	/**
	 *	Returns the value of four
	 *	@return four
	 */
	public short getFour() throws CFException {
   		return four;
	}
	
	/**
	 * 	Update Four with the passed value
	 *  Corresponding COBOL Variable is WS-FOUR
	 *	@param number
	 */
	public void setFour(short number) {
	     // Truncate if the number is beyond +/- Max range
	    four = checkFourMaxLimit(number); 
	}

	public void setFour(int number) {
	    number = checkFourMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFour((short)number);
	}
	public void setFour(long number) {
	    number = checkFourMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setFour((short)number);
	}
	

	/**
	 *	Returns the value of two
	 *	@return two
	 */
	public short getTwo() throws CFException {
   		return two;
	}
	
	/**
	 * 	Update Two with the passed value
	 *  Corresponding COBOL Variable is WS-TWO
	 *	@param number
	 */
	public void setTwo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    two = checkTwoMaxLimit(number); 
	}

	public void setTwo(int number) {
	    number = checkTwoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTwo((short)number);
	}
	public void setTwo(long number) {
	    number = checkTwoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTwo((short)number);
	}
	

	/**
	 *	Returns the value of cond
	 *	@return cond
	 */
   public char[] getCond() throws CFException{
   		return cond;
   }

  
	/**
	*  set variable cond
	*  Corresponding COBOL Variable is WS-COND
	*  @param value
	**/
   public void setCond(char[] value) {
       value = checkCondConstraints(value);
       arraycopy(value,0,cond,0,value.length);
   } 
	public void setCond(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cond,0,beginIndex + endIndex);
   }
	char[] condA88Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isCondA()
	 *	@return  Returns true if isCondA() is "A"
	 */
   public boolean isCondA() throws CFException {
      return (  compareChars( getCond() , condA88Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setCondATrue() {  			
    	setCond( condA88Value);
   	}
	char[] condB88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isCondB()
	 *	@return  Returns true if isCondB() is "B"
	 */
   public boolean isCondB() throws CFException {
      return (  compareChars( getCond() , condB88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setCondBTrue() {  			
    	setCond( condB88Value);
   	}
	char[] condC88Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCondC()
	 *	@return  Returns true if isCondC() is "C"
	 */
   public boolean isCondC() throws CFException {
      return (  compareChars( getCond() , condC88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCondCTrue() {  			
    	setCond( condC88Value);
   	}
	char[] condD88Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isCondD()
	 *	@return  Returns true if isCondD() is "D"
	 */
   public boolean isCondD() throws CFException {
      return (  compareChars( getCond() , condD88Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setCondDTrue() {  			
    	setCond( condD88Value);
   	}
	char[] condE88Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isCondE()
	 *	@return  Returns true if isCondE() is "E"
	 */
   public boolean isCondE() throws CFException {
      return (  compareChars( getCond() , condE88Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setCondETrue() {  			
    	setCond( condE88Value);
   	}
	char[] condF88Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isCondF()
	 *	@return  Returns true if isCondF() is "F"
	 */
   public boolean isCondF() throws CFException {
      return (  compareChars( getCond() , condF88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setCondFTrue() {  			
    	setCond( condF88Value);
   	}
	char[] condG88Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isCondG()
	 *	@return  Returns true if isCondG() is "G"
	 */
   public boolean isCondG() throws CFException {
      return (  compareChars( getCond() , condG88Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setCondGTrue() {  			
    	setCond( condG88Value);
   	}
	/**
	 *	Returns the value of xmlTag300
	 *	@return xmlTag300
	 */
   public char[] getXmlTag300() throws CFException{
   		return xmlTag300;
   }

  
	/**
	*  set variable xmlTag300
	*  Corresponding COBOL Variable is 300-XML-TAG
	*  @param value
	**/
   public void setXmlTag300(char[] value) {
       value = checkXmlTag300Constraints(value);
       arraycopy(value,0,xmlTag300,0,value.length);
   } 
	public void setXmlTag300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlTag300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlData300
	 *	@return xmlData300
	 */
   public char[] getXmlData300() throws CFException{
   		return xmlData300;
   }

  
	/**
	*  set variable xmlData300
	*  Corresponding COBOL Variable is 300-XML-DATA
	*  @param value
	**/
   public void setXmlData300(char[] value) {
       value = checkXmlData300Constraints(value);
       arraycopy(value,0,xmlData300,0,value.length);
   } 
	public void setXmlData300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlData300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlTag2300
	 *	@return xmlTag2300
	 */
   public char[] getXmlTag2300() throws CFException{
   		return xmlTag2300;
   }

  
	/**
	*  set variable xmlTag2300
	*  Corresponding COBOL Variable is 300-XML-TAG2
	*  @param value
	**/
   public void setXmlTag2300(char[] value) {
       value = checkXmlTag2300Constraints(value);
       arraycopy(value,0,xmlTag2300,0,value.length);
   } 
	public void setXmlTag2300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlTag2300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlTag3300
	 *	@return xmlTag3300
	 */
   public char[] getXmlTag3300() throws CFException{
   		return xmlTag3300;
   }

  
	/**
	*  set variable xmlTag3300
	*  Corresponding COBOL Variable is 300-XML-TAG3
	*  @param value
	**/
   public void setXmlTag3300(char[] value) {
       value = checkXmlTag3300Constraints(value);
       arraycopy(value,0,xmlTag3300,0,value.length);
   } 
	public void setXmlTag3300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlTag3300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlTag4300
	 *	@return xmlTag4300
	 */
   public char[] getXmlTag4300() throws CFException{
   		return xmlTag4300;
   }

  
	/**
	*  set variable xmlTag4300
	*  Corresponding COBOL Variable is 300-XML-TAG4
	*  @param value
	**/
   public void setXmlTag4300(char[] value) {
       value = checkXmlTag4300Constraints(value);
       arraycopy(value,0,xmlTag4300,0,value.length);
   } 
	public void setXmlTag4300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlTag4300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlStr300
	 *	@return xmlStr300
	 */
   public char[] getXmlStr300() throws CFException{
   		return xmlStr300;
   }

  
	/**
	*  set variable xmlStr300
	*  Corresponding COBOL Variable is 300-XML-STR
	*  @param value
	**/
   public void setXmlStr300(char[] value) {
       value = checkXmlStr300Constraints(value);
       arraycopy(value,0,xmlStr300,0,value.length);
   } 
	public void setXmlStr300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlStr300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ip33701RateSrcToTrg
	 *	@return ip33701RateSrcToTrg
	 */
	public BigDecimal getIp33701RateSrcToTrg() throws CFException {
       if (isIp33701RateSrcToTrgModified()) { 
           ip33701RateSrcToTrg = refreshIp33701RateSrcToTrg();
        }
   		return ip33701RateSrcToTrg;
	}
	

	
	   
	/**
	 * 	Update Ip33701RateSrcToTrg with the passed number
	 *  Corresponding COBOL Variable is IP33701-RATE-SRC-TO-TRG
	 *	@param number
	 */
	public void setIp33701RateSrcToTrg(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       ip33701RateSrcToTrg = checkIp33701RateSrcToTrgMaxLimit(number);
	    serializeIp33701RateSrcToTrg(ip33701RateSrcToTrg);
   }
	/**
	 * 	Update Ip33701RateSrcToTrg with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp33701RateSrcToTrg(char[] value) throws CFException {
		 ip33701RateSrcToTrg = serializeIp33701RateSrcToTrg(value);
	}   
	
	/**
	 *	Test condition 12345678.1234567 for isIp33701SrcToTrgSame88()
	 *	@return  Returns true if isIp33701SrcToTrgSame88() is 12345678.1234567
	 */
   public boolean isIp33701SrcToTrgSame88() throws CFException {
      return (  getIp33701RateSrcToTrg() .compareTo( BigDecimal.valueOf(12345678.1234567) ) == 0  );
   }


	/**
	*  set values 12345678.1234567
	*/
   	public void setIp33701SrcToTrgSame88True() {  			
    	setIp33701RateSrcToTrg( BigDecimal.valueOf(12345678.1234567));
   	}
    /**
	 *	Returns the value of subValueCount400
	 *  Corresponding COBOL Variable is 400-SUB-VALUE-COUNT
	 *	@return subValueCount400
	 */
	public List<Short> getSubValueCount400() throws CFException {
        List<Short>	list = new ArrayList<>();  
        for (int index =0;index < SUB_VALUE_COUNT_400_SIZE;index++) {
        	list.add( getSubValueCount400( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return subValueCount400
	 */
	public short getSubValueCount400(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSubValueCount400(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SUB_VALUE_COUNT_400_SIZE) {
             	index = SUB_VALUE_COUNT_400_SIZE -1; // can't exceed max array size
             	logger.trace("subValueCount400 - Array index exceeded max Size {}, resetting it to max allowed",SUB_VALUE_COUNT_400_SIZE); 
	    }   
         return getShort(beginSubValueCount400+ index*SUB_VALUE_COUNT_400_LEN);
   }
	
	/**
	 *	Update SubValueCount400 at index with the passed value
	 *  Corresponding COBOL Variable is 400-SUB-VALUE-COUNT
	 *  @param index
	 *	@param number
	 */
	public void setSubValueCount400(int index,short number) {
	   truncated = false; // reset left over truncated flag
		setSubValueCount400(index,number, true);
	}
	
	public void setSubValueCount400(int index,int number) {
		setSubValueCount400(index,(short)number, true);
	}
	public void setSubValueCount400(int index,long number) {
			setSubValueCount400(index,(short)number, true);
	}
	
	/**
	 *	Update  SubValueCount400 at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSubValueCount400(int index,short value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSubValueCount400(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SUB_VALUE_COUNT_400_SIZE) {
             	index = SUB_VALUE_COUNT_400_SIZE -1; // can't exceed max array size
             	logger.trace("subValueCount400 - Array index exceeded max Size "+SUB_VALUE_COUNT_400_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSubValueCount400(index,value);
		}
   }
	/**
	 *	Returns the value of totalSubCount400
	 *	@return totalSubCount400
	 */
	public short getTotalSubCount400() throws CFException {
   		return totalSubCount400;
	}
	
	/**
	 * 	Update TotalSubCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-TOTAL-SUB-COUNT
	 *	@param number
	 */
	public void setTotalSubCount400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    totalSubCount400 = checkTotalSubCount400MaxLimit(number); 
	}

	public void setTotalSubCount400(int number) {
	    number = checkTotalSubCount400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTotalSubCount400((short)number);
	}
	public void setTotalSubCount400(long number) {
	    number = checkTotalSubCount400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTotalSubCount400((short)number);
	}
	

	/**
	 *	Returns the value of strt800
	 *	@return strt800
	 */
	public short getStrt800() throws CFException {
   		return strt800;
	}
	
	/**
	 * 	Update Strt800 with the passed value
	 *  Corresponding COBOL Variable is 800-STRT
	 *	@param number
	 */
	public void setStrt800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    strt800 = checkStrt800MaxLimit(number); 
	}

	public void setStrt800(int number) {
	    number = checkStrt800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStrt800((short)number);
	}
	public void setStrt800(long number) {
	    number = checkStrt800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStrt800((short)number);
	}
	

	/**
	 *	Returns the value of numSpaces
	 *	@return numSpaces
	 */
   public char[] getNumSpaces() throws CFException{
     if (isNumSpacesModified()) { 
        numSpaces = refreshNumSpaces();
     }
   		return numSpaces;
   }

  
	/**
	*  set variable numSpaces
	*  Corresponding COBOL Variable is WS-NUM-SPACES
	*  @param value
	**/
   public void setNumSpaces(char[] value) {
      numSpaces = checkNumSpacesConstraints(value);
      serializeNumSpaces(numSpaces);
   } 

     /**
	 * 	Update NumSpaces 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNumSpaces(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNumSpaces,numSpaces.length);
   	
   }
   
   public void setNumSpaces(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNumSpaces,numSpaces.length);
   	
   }
   
     /**
	 * 	Update NumSpaces 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNumSpaces(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumSpaces+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update NumSpaces with another Field
	 *	@param value
	 */
   public void setNumSpaces(Field source) {
       replace(source,0,source.length(),beginNumSpaces,NUM_SPACES_LEN);
   	
   }  
   
     /**
	 * 	Update NumSpaces 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNumSpaces(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNumSpaces,NUM_SPACES_LEN);
   	
   }
   
     /**
	 * 	Update NumSpaces 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNumSpaces(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNumSpaces+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charWs
	 *	@return charWs
	 */
   public char[] getCharWs() throws CFException{
   		return charWs;
   }

  
	/**
	*  set variable charWs
	*  Corresponding COBOL Variable is WS-CHAR
	*  @param value
	**/
   public void setCharWs(char[] value) {
       value = checkCharWsConstraints(value);
       arraycopy(value,0,charWs,0,value.length);
   } 
	public void setCharWs(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charWs,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlText
	 *	@return xmlText
	 */
   public char[] getXmlText() throws CFException{
   		return xmlText;
   }

  
	/**
	*  set variable xmlText
	*  Corresponding COBOL Variable is WS-XML-TEXT
	*  @param value
	**/
   public void setXmlText(char[] value) {
       value = checkXmlTextConstraints(value);
       arraycopy(value,0,xmlText,0,value.length);
   } 
	public void setXmlText(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlText,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of xmlData805
	 *	@return xmlData805
	 */
   public char[] getXmlData805() throws CFException{
   		return xmlData805;
   }

  
	/**
	*  set variable xmlData805
	*  Corresponding COBOL Variable is 805-XML-DATA
	*  @param value
	**/
   public void setXmlData805(char[] value) {
       value = checkXmlData805Constraints(value);
       arraycopy(value,0,xmlData805,0,value.length);
   } 
	public void setXmlData805(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,xmlData805,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of lowValue300
	 *	@return lowValue300
	 */
   public char[] getLowValue300() throws CFException{
   		return lowValue300;
   }

  
	/**
	*  set variable lowValue300
	*  Corresponding COBOL Variable is 300-LOW-VALUE
	*  @param value
	**/
   public void setLowValue300(char[] value) {
       value = checkLowValue300Constraints(value);
       arraycopy(value,0,lowValue300,0,value.length);
   } 
	public void setLowValue300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,lowValue300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of highValue300
	 *	@return highValue300
	 */
   public char[] getHighValue300() throws CFException{
   		return highValue300;
   }

  
	/**
	*  set variable highValue300
	*  Corresponding COBOL Variable is 300-HIGH-VALUE
	*  @param value
	**/
   public void setHighValue300(char[] value) {
       value = checkHighValue300Constraints(value);
       arraycopy(value,0,highValue300,0,value.length);
   } 
	public void setHighValue300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,highValue300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ampersand300
	 *	@return ampersand300
	 */
   public char[] getAmpersand300() throws CFException{
   		return ampersand300;
   }

  
	/**
	*  set variable ampersand300
	*  Corresponding COBOL Variable is 300-AMPERSAND
	*  @param value
	**/
   public void setAmpersand300(char[] value) {
       value = checkAmpersand300Constraints(value);
       arraycopy(value,0,ampersand300,0,value.length);
   } 
	public void setAmpersand300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ampersand300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of space300
	 *	@return space300
	 */
   public char[] getSpace300() throws CFException{
   		return space300;
   }

  
	/**
	*  set variable space300
	*  Corresponding COBOL Variable is 300-SPACE
	*  @param value
	**/
   public void setSpace300(char[] value) {
       value = checkSpace300Constraints(value);
       arraycopy(value,0,space300,0,value.length);
   } 
	public void setSpace300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,space300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevTransType801
	 *	@return prevTransType801
	 */
   public char[] getPrevTransType801() throws CFException{
   		return prevTransType801;
   }

  
	/**
	*  set variable prevTransType801
	*  Corresponding COBOL Variable is 801-PREV-TRANS-TYPE
	*  @param value
	**/
   public void setPrevTransType801(char[] value) {
       value = checkPrevTransType801Constraints(value);
       arraycopy(value,0,prevTransType801,0,value.length);
   } 
	public void setPrevTransType801(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevTransType801,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of prevMccCode801
	 *	@return prevMccCode801
	 */
   public char[] getPrevMccCode801() throws CFException{
   		return prevMccCode801;
   }

  
	/**
	*  set variable prevMccCode801
	*  Corresponding COBOL Variable is 801-PREV-MCC-CODE
	*  @param value
	**/
   public void setPrevMccCode801(char[] value) {
       value = checkPrevMccCode801Constraints(value);
       arraycopy(value,0,prevMccCode801,0,value.length);
   } 
	public void setPrevMccCode801(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,prevMccCode801,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of transType701
	 *	@return transType701
	 */
   public char[] getTransType701() throws CFException{
   		return transType701;
   }

  
	/**
	*  set variable transType701
	*  Corresponding COBOL Variable is 701-TRANS-TYPE
	*  @param value
	**/
   public void setTransType701(char[] value) {
       value = checkTransType701Constraints(value);
       arraycopy(value,0,transType701,0,value.length);
   } 
	public void setTransType701(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,transType701,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of exclusionFlag100
	 *	@return exclusionFlag100
	 */
   public char[] getExclusionFlag100() throws CFException{
   		return exclusionFlag100;
   }

  
	/**
	*  set variable exclusionFlag100
	*  Corresponding COBOL Variable is 100-EXCLUSION-FLAG
	*  @param value
	**/
   public void setExclusionFlag100(char[] value) {
       value = checkExclusionFlag100Constraints(value);
       arraycopy(value,0,exclusionFlag100,0,value.length);
   } 
	public void setExclusionFlag100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,exclusionFlag100,0,beginIndex + endIndex);
   }
	char[] exclusionOff8810088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isExclusionOff88100()
	 *	@return  Returns true if isExclusionOff88100() is "1"
	 */
   public boolean isExclusionOff88100() throws CFException {
      return (  compareChars( getExclusionFlag100() , exclusionOff8810088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setExclusionOff88100True() {  			
    	setExclusionFlag100( exclusionOff8810088Value);
   	}
	char[] exclusionOn8810088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isExclusionOn88100()
	 *	@return  Returns true if isExclusionOn88100() is "2"
	 */
   public boolean isExclusionOn88100() throws CFException {
      return (  compareChars( getExclusionFlag100() , exclusionOn8810088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setExclusionOn88100True() {  			
    	setExclusionFlag100( exclusionOn8810088Value);
   	}
	/**
	 *	Returns the value of var
	 *	@return var
	 */
   public char[] getVar() throws CFException{
   		return var;
   }

  
	/**
	*  set variable var
	*  Corresponding COBOL Variable is WS-VAR
	*  @param value
	**/
   public void setVar(char[] value) {
       value = checkVarConstraints(value);
       arraycopy(value,0,var,0,value.length);
   } 
	public void setVar(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,var,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of b
	 *	@return b
	 */
   public char[] getB() throws CFException{
   		return b;
   }

  
	/**
	*  set variable b
	*  Corresponding COBOL Variable is WS-B
	*  @param value
	**/
   public void setB(char[] value) {
       value = checkBConstraints(value);
       arraycopy(value,0,b,0,value.length);
   } 
	public void setB(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,b,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of d
	 *	@return d
	 */
   public char[] getD() throws CFException{
   		return d;
   }

  
	/**
	*  set variable d
	*  Corresponding COBOL Variable is WS-D
	*  @param value
	**/
   public void setD(char[] value) {
       value = checkDConstraints(value);
       arraycopy(value,0,d,0,value.length);
   } 
	public void setD(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,d,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of aLen
	 *	@return aLen
	 */
	public short getALen() throws CFException {
   		return aLen;
	}
	
	/**
	 * 	Update ALen with the passed value
	 *  Corresponding COBOL Variable is WS-A-LEN
	 *	@param number
	 */
	public void setALen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    aLen = checkALenMaxLimit(number); 
	}

	public void setALen(int number) {
	    number = checkALenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setALen((short)number);
	}
	public void setALen(long number) {
	    number = checkALenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setALen((short)number);
	}
	

	/**
	 *	Returns the value of bLen
	 *	@return bLen
	 */
	public short getBLen() throws CFException {
   		return bLen;
	}
	
	/**
	 * 	Update BLen with the passed value
	 *  Corresponding COBOL Variable is WS-B-LEN
	 *	@param number
	 */
	public void setBLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    bLen = checkBLenMaxLimit(number); 
	}

	public void setBLen(int number) {
	    number = checkBLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBLen((short)number);
	}
	public void setBLen(long number) {
	    number = checkBLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBLen((short)number);
	}
	

	/**
	 *	Returns the value of cLen
	 *	@return cLen
	 */
	public short getCLen() throws CFException {
   		return cLen;
	}
	
	/**
	 * 	Update CLen with the passed value
	 *  Corresponding COBOL Variable is WS-C-LEN
	 *	@param number
	 */
	public void setCLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    cLen = checkCLenMaxLimit(number); 
	}

	public void setCLen(int number) {
	    number = checkCLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCLen((short)number);
	}
	public void setCLen(long number) {
	    number = checkCLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCLen((short)number);
	}
	

	/**
	 *	Returns the value of dLen
	 *	@return dLen
	 */
	public short getDLen() throws CFException {
   		return dLen;
	}
	
	/**
	 * 	Update DLen with the passed value
	 *  Corresponding COBOL Variable is WS-D-LEN
	 *	@param number
	 */
	public void setDLen(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dLen = checkDLenMaxLimit(number); 
	}

	public void setDLen(int number) {
	    number = checkDLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDLen((short)number);
	}
	public void setDLen(long number) {
	    number = checkDLenMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDLen((short)number);
	}
	

	/**
	 *	Returns the value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public BigDecimal getEcbRateDiff800() throws CFException {
       if (isEcbRateDiff800Modified()) { 
           ecbRateDiff800 = refreshEcbRateDiff800();
        }
   		return ecbRateDiff800;
	}
	

    /**
	 *	Returns the String value of ecbRateDiff800
	 *	@return ecbRateDiff800
	 */
	public char[]  getEcbRateDiff800ActualString() {
	    String value = String.valueOf(ecbRateDiff800).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update EcbRateDiff800 with the passed number
	 *  Corresponding COBOL Variable is 800-ECB-RATE-DIFF
	 *	@param number
	 */
	public void setEcbRateDiff800(BigDecimal number) {
       ecbRateDiff800 = checkEcbRateDiff800MaxLimit(number);
	    serializeEcbRateDiff800(ecbRateDiff800);
   }
	/**
	 * 	Update EcbRateDiff800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEcbRateDiff800(char[] value) throws CFException {
		 ecbRateDiff800 = serializeEcbRateDiff800(value);
	}   
	/**
	 *	Returns the value of clearingDtTm9800
	 *	@return clearingDtTm9800
	 */
	public long getClearingDtTm9800() throws CFException {
       if (isClearingDtTm9800Modified()) { 
           clearingDtTm9800 = refreshClearingDtTm9800();
        }
   		return clearingDtTm9800;
	}
	

	
	   
	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *  Corresponding COBOL Variable is 800-CLEARING-DT-TM-9
	 *	@param number
	 */
	public void setClearingDtTm9800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    clearingDtTm9800 = checkClearingDtTm9800MaxLimit(number); 
		serializeClearingDtTm9800(clearingDtTm9800);
	}
	

	/**
	 * 	Update ClearingDtTm9800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800(char[] value) throws CFException {
		 clearingDtTm9800 = serializeClearingDtTm9800(value);
	}
	/**
	 * 	Update ClearingDtTm9800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9800String(char[] value) throws CFException {
		 setClearingDtTm9800(value);
	}
	/**
	 *	Returns the value of clearingDtTm9700
	 *	@return clearingDtTm9700
	 */
	public long getClearingDtTm9700() throws CFException {
       if (isClearingDtTm9700Modified()) { 
           clearingDtTm9700 = refreshClearingDtTm9700();
        }
   		return clearingDtTm9700;
	}
	

	
	   
	/**
	 * 	Update ClearingDtTm9700 with the passed value
	 *  Corresponding COBOL Variable is 700-CLEARING-DT-TM-9
	 *	@param number
	 */
	public void setClearingDtTm9700(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    clearingDtTm9700 = checkClearingDtTm9700MaxLimit(number); 
		serializeClearingDtTm9700(clearingDtTm9700);
	}
	

	/**
	 * 	Update ClearingDtTm9700 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9700(char[] value) throws CFException {
		 clearingDtTm9700 = serializeClearingDtTm9700(value);
	}
	/**
	 * 	Update ClearingDtTm9700 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9700String(char[] value) throws CFException {
		 setClearingDtTm9700(value);
	}
	/**
	 *	Returns the value of clearingDtTm9X700
	 *	@return clearingDtTm9X700
	 */
   public char[] getClearingDtTm9X700() throws CFException{
   		return clearingDtTm9X700;
   }

  
	/**
	*  set variable clearingDtTm9X700
	*  Corresponding COBOL Variable is 700-CLEARING-DT-TM-9-X
	*  @param value
	**/
   public void setClearingDtTm9X700(char[] value) {
       value = checkClearingDtTm9X700Constraints(value);
       arraycopy(value,0,clearingDtTm9X700,0,value.length);
   } 
	public void setClearingDtTm9X700(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,clearingDtTm9X700,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of clearingDtTm9Short800
	 *	@return clearingDtTm9Short800
	 */
	public long getClearingDtTm9Short800() throws CFException {
       if (isClearingDtTm9Short800Modified()) { 
           clearingDtTm9Short800 = refreshClearingDtTm9Short800();
        }
   		return clearingDtTm9Short800;
	}
	

	
	   
	/**
	 * 	Update ClearingDtTm9Short800 with the passed value
	 *  Corresponding COBOL Variable is 800-CLEARING-DT-TM-9-SHORT
	 *	@param number
	 */
	public void setClearingDtTm9Short800(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    clearingDtTm9Short800 = checkClearingDtTm9Short800MaxLimit(number); 
		serializeClearingDtTm9Short800(clearingDtTm9Short800);
	}
	

	/**
	 * 	Update ClearingDtTm9Short800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short800(char[] value) throws CFException {
		 clearingDtTm9Short800 = serializeClearingDtTm9Short800(value);
	}
	/**
	 * 	Update ClearingDtTm9Short800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setClearingDtTm9Short800String(char[] value) throws CFException {
		 setClearingDtTm9Short800(value);
	}
	/**
	 *	Returns the value of cf20004TableEnts
	 *	@return cf20004TableEnts
	 */
   public char[] getCf20004TableEnts() throws CFException{
   		return cf20004TableEnts;
   }

  
	/**
	*  set variable cf20004TableEnts
	*  Corresponding COBOL Variable is CF20004-TABLE-ENTS
	*  @param value
	**/
   public void setCf20004TableEnts(char[] value) {
       value = checkCf20004TableEntsConstraints(value);
       arraycopy(value,0,cf20004TableEnts,0,value.length);
   } 
	public void setCf20004TableEnts(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,cf20004TableEnts,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of dtlRecord1800
	 *	@return dtlRecord1800
	 */
   public char[] getDtlRecord1800() throws CFException{
   		return dtlRecord1800;
   }

  
	/**
	*  set variable dtlRecord1800
	*  Corresponding COBOL Variable is 800-DTL-RECORD-1
	*  @param value
	**/
   public void setDtlRecord1800(char[] value) {
       value = checkDtlRecord1800Constraints(value);
       arraycopy(value,0,dtlRecord1800,0,value.length);
   } 
	public void setDtlRecord1800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,dtlRecord1800,0,beginIndex + endIndex);
   }
	char[] sys201L018880088Value = " 1. CARD PRESENT                                                     ".toCharArray();
	/**
	 *	Test condition " 1. CARD PRESENT" for isSys201L0188800()
	 *	@return  Returns true if isSys201L0188800() is " 1. CARD PRESENT"
	 */
   public boolean isSys201L0188800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L018880088Value)  == 0  );
   }


	/**
	*  set values " 1. CARD PRESENT"
	*/
   	public void setSys201L0188800True() {  			
    	setDtlRecord1800( sys201L018880088Value);
   	}
	char[] sys201L028880088Value = " 2. CARD NOT PRESENT                                                 ".toCharArray();
	/**
	 *	Test condition " 2. CARD NOT PRESENT" for isSys201L0288800()
	 *	@return  Returns true if isSys201L0288800() is " 2. CARD NOT PRESENT"
	 */
   public boolean isSys201L0288800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L028880088Value)  == 0  );
   }


	/**
	*  set values " 2. CARD NOT PRESENT"
	*/
   	public void setSys201L0288800True() {  			
    	setDtlRecord1800( sys201L028880088Value);
   	}
	char[] sys201L038880088Value = " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176    ".toCharArray();
	/**
	 *	Test condition " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176" for isSys201L0388800()
	 *	@return  Returns true if isSys201L0388800() is " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176"
	 */
   public boolean isSys201L0388800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L038880088Value)  == 0  );
   }


	/**
	*  set values " 3. TRANSACTIONS QUALIFIED WITH MASTERCARD ASSIGNE D ID PDS 00176"
	*/
   	public void setSys201L0388800True() {  			
    	setDtlRecord1800( sys201L038880088Value);
   	}
	char[] sys201L048880088Value = " 4. TRANSACTIONS WITH DEFAULT VALUES IN POS ENTRY  MODE DE22         ".toCharArray();
	/**
	 *	Test condition " 4. TRANSACTIONS WITH DEFAULT VALUES IN POS ENTRY  MODE DE22" for isSys201L0488800()
	 *	@return  Returns true if isSys201L0488800() is " 4. TRANSACTIONS WITH DEFAULT VALUES IN POS ENTRY  MODE DE22"
	 */
   public boolean isSys201L0488800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L048880088Value)  == 0  );
   }


	/**
	*  set values " 4. TRANSACTIONS WITH DEFAULT VALUES IN POS ENTRY  MODE DE22"
	*/
   	public void setSys201L0488800True() {  			
    	setDtlRecord1800( sys201L048880088Value);
   	}
	char[] sys201L058880088Value = "     TERMINAL DATA CARD INPUT CAPABILITY                             ".toCharArray();
	/**
	 *	Test condition "     TERMINAL DATA CARD INPUT CAPABILITY" for isSys201L0588800()
	 *	@return  Returns true if isSys201L0588800() is "     TERMINAL DATA CARD INPUT CAPABILITY"
	 */
   public boolean isSys201L0588800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L058880088Value)  == 0  );
   }


	/**
	*  set values "     TERMINAL DATA CARD INPUT CAPABILITY"
	*/
   	public void setSys201L0588800True() {  			
    	setDtlRecord1800( sys201L058880088Value);
   	}
	char[] sys201L068880088Value = "     TERMINAL DATA CARDHOLDER AUTHENTICATION CAPAB ILITY             ".toCharArray();
	/**
	 *	Test condition "     TERMINAL DATA CARDHOLDER AUTHENTICATION CAPAB ILITY" for isSys201L0688800()
	 *	@return  Returns true if isSys201L0688800() is "     TERMINAL DATA CARDHOLDER AUTHENTICATION CAPAB ILITY"
	 */
   public boolean isSys201L0688800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L068880088Value)  == 0  );
   }


	/**
	*  set values "     TERMINAL DATA CARDHOLDER AUTHENTICATION CAPAB ILITY"
	*/
   	public void setSys201L0688800True() {  			
    	setDtlRecord1800( sys201L068880088Value);
   	}
	char[] sys201L078880088Value = "     TERMINAL DATA CARD CAPTURE CAPABILITY                           ".toCharArray();
	/**
	 *	Test condition "     TERMINAL DATA CARD CAPTURE CAPABILITY" for isSys201L0788800()
	 *	@return  Returns true if isSys201L0788800() is "     TERMINAL DATA CARD CAPTURE CAPABILITY"
	 */
   public boolean isSys201L0788800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L078880088Value)  == 0  );
   }


	/**
	*  set values "     TERMINAL DATA CARD CAPTURE CAPABILITY"
	*/
   	public void setSys201L0788800True() {  			
    	setDtlRecord1800( sys201L078880088Value);
   	}
	char[] sys201L088880088Value = "     TERMINAL OPERATING ENVIRONMENT                                  ".toCharArray();
	/**
	 *	Test condition "     TERMINAL OPERATING ENVIRONMENT" for isSys201L0888800()
	 *	@return  Returns true if isSys201L0888800() is "     TERMINAL OPERATING ENVIRONMENT"
	 */
   public boolean isSys201L0888800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L088880088Value)  == 0  );
   }


	/**
	*  set values "     TERMINAL OPERATING ENVIRONMENT"
	*/
   	public void setSys201L0888800True() {  			
    	setDtlRecord1800( sys201L088880088Value);
   	}
	char[] sys201L098880088Value = "     CARDHOLDER PRESENT DATA                                         ".toCharArray();
	/**
	 *	Test condition "     CARDHOLDER PRESENT DATA" for isSys201L0988800()
	 *	@return  Returns true if isSys201L0988800() is "     CARDHOLDER PRESENT DATA"
	 */
   public boolean isSys201L0988800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L098880088Value)  == 0  );
   }


	/**
	*  set values "     CARDHOLDER PRESENT DATA"
	*/
   	public void setSys201L0988800True() {  			
    	setDtlRecord1800( sys201L098880088Value);
   	}
	char[] sys201L108880088Value = "     CARD PRESENT DATA                                               ".toCharArray();
	/**
	 *	Test condition "     CARD PRESENT DATA" for isSys201L1088800()
	 *	@return  Returns true if isSys201L1088800() is "     CARD PRESENT DATA"
	 */
   public boolean isSys201L1088800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L108880088Value)  == 0  );
   }


	/**
	*  set values "     CARD PRESENT DATA"
	*/
   	public void setSys201L1088800True() {  			
    	setDtlRecord1800( sys201L108880088Value);
   	}
	char[] sys201L118880088Value = "     CARD DATA INPUT MODE                                            ".toCharArray();
	/**
	 *	Test condition "     CARD DATA INPUT MODE" for isSys201L1188800()
	 *	@return  Returns true if isSys201L1188800() is "     CARD DATA INPUT MODE"
	 */
   public boolean isSys201L1188800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L118880088Value)  == 0  );
   }


	/**
	*  set values "     CARD DATA INPUT MODE"
	*/
   	public void setSys201L1188800True() {  			
    	setDtlRecord1800( sys201L118880088Value);
   	}
	char[] sys201L128880088Value = "     CARDHOLDER AUTHENTICATION METHOD                                ".toCharArray();
	/**
	 *	Test condition "     CARDHOLDER AUTHENTICATION METHOD" for isSys201L1288800()
	 *	@return  Returns true if isSys201L1288800() is "     CARDHOLDER AUTHENTICATION METHOD"
	 */
   public boolean isSys201L1288800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L128880088Value)  == 0  );
   }


	/**
	*  set values "     CARDHOLDER AUTHENTICATION METHOD"
	*/
   	public void setSys201L1288800True() {  			
    	setDtlRecord1800( sys201L128880088Value);
   	}
	char[] sys201L138880088Value = "     CARDHOLDER AUTHENTICATION ENTITY                                ".toCharArray();
	/**
	 *	Test condition "     CARDHOLDER AUTHENTICATION ENTITY" for isSys201L1388800()
	 *	@return  Returns true if isSys201L1388800() is "     CARDHOLDER AUTHENTICATION ENTITY"
	 */
   public boolean isSys201L1388800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L138880088Value)  == 0  );
   }


	/**
	*  set values "     CARDHOLDER AUTHENTICATION ENTITY"
	*/
   	public void setSys201L1388800True() {  			
    	setDtlRecord1800( sys201L138880088Value);
   	}
	char[] sys201L148880088Value = "     CARD DATA OUTPUT CAPABILITY                                     ".toCharArray();
	/**
	 *	Test condition "     CARD DATA OUTPUT CAPABILITY" for isSys201L1488800()
	 *	@return  Returns true if isSys201L1488800() is "     CARD DATA OUTPUT CAPABILITY"
	 */
   public boolean isSys201L1488800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L148880088Value)  == 0  );
   }


	/**
	*  set values "     CARD DATA OUTPUT CAPABILITY"
	*/
   	public void setSys201L1488800True() {  			
    	setDtlRecord1800( sys201L148880088Value);
   	}
	char[] sys201L158880088Value = "     TERMINAL DATA OUTPUT CAPABILITY                                 ".toCharArray();
	/**
	 *	Test condition "     TERMINAL DATA OUTPUT CAPABILITY" for isSys201L1588800()
	 *	@return  Returns true if isSys201L1588800() is "     TERMINAL DATA OUTPUT CAPABILITY"
	 */
   public boolean isSys201L1588800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L158880088Value)  == 0  );
   }


	/**
	*  set values "     TERMINAL DATA OUTPUT CAPABILITY"
	*/
   	public void setSys201L1588800True() {  			
    	setDtlRecord1800( sys201L158880088Value);
   	}
	char[] sys201L168880088Value = "     PIN CAPTURE CAPABILITY                                          ".toCharArray();
	/**
	 *	Test condition "     PIN CAPTURE CAPABILITY" for isSys201L1688800()
	 *	@return  Returns true if isSys201L1688800() is "     PIN CAPTURE CAPABILITY"
	 */
   public boolean isSys201L1688800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L168880088Value)  == 0  );
   }


	/**
	*  set values "     PIN CAPTURE CAPABILITY"
	*/
   	public void setSys201L1688800True() {  			
    	setDtlRecord1800( sys201L168880088Value);
   	}
	char[] sys201L178880088Value = " 5. MISSING APPROVAL CODE DE38                                       ".toCharArray();
	/**
	 *	Test condition " 5. MISSING APPROVAL CODE DE38" for isSys201L1788800()
	 *	@return  Returns true if isSys201L1788800() is " 5. MISSING APPROVAL CODE DE38"
	 */
   public boolean isSys201L1788800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L178880088Value)  == 0  );
   }


	/**
	*  set values " 5. MISSING APPROVAL CODE DE38"
	*/
   	public void setSys201L1788800True() {  			
    	setDtlRecord1800( sys201L178880088Value);
   	}
	char[] sys201L188880088Value = " 6. MISSING TRANSACTION LIFE CYCLE ID DE63                           ".toCharArray();
	/**
	 *	Test condition " 6. MISSING TRANSACTION LIFE CYCLE ID DE63" for isSys201L1888800()
	 *	@return  Returns true if isSys201L1888800() is " 6. MISSING TRANSACTION LIFE CYCLE ID DE63"
	 */
   public boolean isSys201L1888800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L188880088Value)  == 0  );
   }


	/**
	*  set values " 6. MISSING TRANSACTION LIFE CYCLE ID DE63"
	*/
   	public void setSys201L1888800True() {  			
    	setDtlRecord1800( sys201L188880088Value);
   	}
	char[] sys201L198880088Value = " 7. MISSING APPROVAL CODE DE38 AND TRANSACTION LIFE CYCLE ID DE63    ".toCharArray();
	/**
	 *	Test condition " 7. MISSING APPROVAL CODE DE38 AND TRANSACTION LIFE CYCLE ID DE63" for isSys201L1988800()
	 *	@return  Returns true if isSys201L1988800() is " 7. MISSING APPROVAL CODE DE38 AND TRANSACTION LIFE CYCLE ID DE63"
	 */
   public boolean isSys201L1988800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L198880088Value)  == 0  );
   }


	/**
	*  set values " 7. MISSING APPROVAL CODE DE38 AND TRANSACTION LIFE CYCLE ID DE63"
	*/
   	public void setSys201L1988800True() {  			
    	setDtlRecord1800( sys201L198880088Value);
   	}
	char[] sys201L208880088Value = " 8. UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHIFT FOR ACQUIRERS   ".toCharArray();
	/**
	 *	Test condition " 8. UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHIFT FOR ACQUIRERS" for isSys201L2088800()
	 *	@return  Returns true if isSys201L2088800() is " 8. UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHIFT FOR ACQUIRERS"
	 */
   public boolean isSys201L2088800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L208880088Value)  == 0  );
   }


	/**
	*  set values " 8. UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHIFT FOR ACQUIRERS"
	*/
   	public void setSys201L2088800True() {  			
    	setDtlRecord1800( sys201L208880088Value);
   	}
	char[] sys201L218880088Value = "     210                                                             ".toCharArray();
	/**
	 *	Test condition "     210" for isSys201L2188800()
	 *	@return  Returns true if isSys201L2188800() is "     210"
	 */
   public boolean isSys201L2188800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L218880088Value)  == 0  );
   }


	/**
	*  set values "     210"
	*/
   	public void setSys201L2188800True() {  			
    	setDtlRecord1800( sys201L218880088Value);
   	}
	char[] sys201L228880088Value = "     214                                                             ".toCharArray();
	/**
	 *	Test condition "     214" for isSys201L2288800()
	 *	@return  Returns true if isSys201L2288800() is "     214"
	 */
   public boolean isSys201L2288800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L228880088Value)  == 0  );
   }


	/**
	*  set values "     214"
	*/
   	public void setSys201L2288800True() {  			
    	setDtlRecord1800( sys201L228880088Value);
   	}
	char[] sys201L238880088Value = "     216                                                             ".toCharArray();
	/**
	 *	Test condition "     216" for isSys201L2388800()
	 *	@return  Returns true if isSys201L2388800() is "     216"
	 */
   public boolean isSys201L2388800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L238880088Value)  == 0  );
   }


	/**
	*  set values "     216"
	*/
   	public void setSys201L2388800True() {  			
    	setDtlRecord1800( sys201L238880088Value);
   	}
	char[] sys201L248880088Value = "     910                                                             ".toCharArray();
	/**
	 *	Test condition "     910" for isSys201L2488800()
	 *	@return  Returns true if isSys201L2488800() is "     910"
	 */
   public boolean isSys201L2488800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L248880088Value)  == 0  );
   }


	/**
	*  set values "     910"
	*/
   	public void setSys201L2488800True() {  			
    	setDtlRecord1800( sys201L248880088Value);
   	}
	char[] sys201L258880088Value = " 9. MISSING RETRIEVAL REFERENCE NUMBER DE37 WITH                     ".toCharArray();
	/**
	 *	Test condition " 9. MISSING RETRIEVAL REFERENCE NUMBER DE37 WITH" for isSys201L2588800()
	 *	@return  Returns true if isSys201L2588800() is " 9. MISSING RETRIEVAL REFERENCE NUMBER DE37 WITH"
	 */
   public boolean isSys201L2588800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L258880088Value)  == 0  );
   }


	/**
	*  set values " 9. MISSING RETRIEVAL REFERENCE NUMBER DE37 WITH"
	*/
   	public void setSys201L2588800True() {  			
    	setDtlRecord1800( sys201L258880088Value);
   	}
	char[] sys201L25Cont8880088Value = "    CARD DATA INPUT MODE DE22SF7 = C, M OR B                         ".toCharArray();
	/**
	 *	Test condition "    CARD DATA INPUT MODE DE22SF7 = C, M OR B" for isSys201L25Cont88800()
	 *	@return  Returns true if isSys201L25Cont88800() is "    CARD DATA INPUT MODE DE22SF7 = C, M OR B"
	 */
   public boolean isSys201L25Cont88800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L25Cont8880088Value)  == 0  );
   }


	/**
	*  set values "    CARD DATA INPUT MODE DE22SF7 = C, M OR B"
	*/
   	public void setSys201L25Cont88800True() {  			
    	setDtlRecord1800( sys201L25Cont8880088Value);
   	}
	char[] sys201L268880088Value = " 10.MISSING INTEGRATED CIRCUIT CARD SYSTEM RELATED  DATA DE55 WITH   ".toCharArray();
	/**
	 *	Test condition " 10.MISSING INTEGRATED CIRCUIT CARD SYSTEM RELATED  DATA DE55 WITH" for isSys201L2688800()
	 *	@return  Returns true if isSys201L2688800() is " 10.MISSING INTEGRATED CIRCUIT CARD SYSTEM RELATED  DATA DE55 WITH"
	 */
   public boolean isSys201L2688800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L268880088Value)  == 0  );
   }


	/**
	*  set values " 10.MISSING INTEGRATED CIRCUIT CARD SYSTEM RELATED  DATA DE55 WITH"
	*/
   	public void setSys201L2688800True() {  			
    	setDtlRecord1800( sys201L268880088Value);
   	}
	char[] sys201L26Cont8880088Value = "    CARD DATA INPUT MODE DE22SF7 = C, F OR M                         ".toCharArray();
	/**
	 *	Test condition "    CARD DATA INPUT MODE DE22SF7 = C, F OR M" for isSys201L26Cont88800()
	 *	@return  Returns true if isSys201L26Cont88800() is "    CARD DATA INPUT MODE DE22SF7 = C, F OR M"
	 */
   public boolean isSys201L26Cont88800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L26Cont8880088Value)  == 0  );
   }


	/**
	*  set values "    CARD DATA INPUT MODE DE22SF7 = C, F OR M"
	*/
   	public void setSys201L26Cont88800True() {  			
    	setDtlRecord1800( sys201L26Cont8880088Value);
   	}
	char[] sys201L278880088Value = " 11.ORIGINAL FIRST PRESENTMENTS WITH INTERCHANGE O VERRIDE           ".toCharArray();
	/**
	 *	Test condition " 11.ORIGINAL FIRST PRESENTMENTS WITH INTERCHANGE O VERRIDE" for isSys201L2788800()
	 *	@return  Returns true if isSys201L2788800() is " 11.ORIGINAL FIRST PRESENTMENTS WITH INTERCHANGE O VERRIDE"
	 */
   public boolean isSys201L2788800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L278880088Value)  == 0  );
   }


	/**
	*  set values " 11.ORIGINAL FIRST PRESENTMENTS WITH INTERCHANGE O VERRIDE"
	*/
   	public void setSys201L2788800True() {  			
    	setDtlRecord1800( sys201L278880088Value);
   	}
	char[] sys201L288880088Value = "     CARD ACCEPTOR CLASSIFICATION OVERRIDE INDICAT OR                ".toCharArray();
	/**
	 *	Test condition "     CARD ACCEPTOR CLASSIFICATION OVERRIDE INDICAT OR" for isSys201L2888800()
	 *	@return  Returns true if isSys201L2888800() is "     CARD ACCEPTOR CLASSIFICATION OVERRIDE INDICAT OR"
	 */
   public boolean isSys201L2888800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L288880088Value)  == 0  );
   }


	/**
	*  set values "     CARD ACCEPTOR CLASSIFICATION OVERRIDE INDICAT OR"
	*/
   	public void setSys201L2888800True() {  			
    	setDtlRecord1800( sys201L288880088Value);
   	}
	char[] sys201L298880088Value = "     PRODUCT CLASS OVERRIDE INDICATOR                                ".toCharArray();
	/**
	 *	Test condition "     PRODUCT CLASS OVERRIDE INDICATOR" for isSys201L2988800()
	 *	@return  Returns true if isSys201L2988800() is "     PRODUCT CLASS OVERRIDE INDICATOR"
	 */
   public boolean isSys201L2988800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L298880088Value)  == 0  );
   }


	/**
	*  set values "     PRODUCT CLASS OVERRIDE INDICATOR"
	*/
   	public void setSys201L2988800True() {  			
    	setDtlRecord1800( sys201L298880088Value);
   	}
	char[] sys201L308880088Value = "     CORPORATE INCENTIVE RATES APPLY INDICATOR                       ".toCharArray();
	/**
	 *	Test condition "     CORPORATE INCENTIVE RATES APPLY INDICATOR" for isSys201L3088800()
	 *	@return  Returns true if isSys201L3088800() is "     CORPORATE INCENTIVE RATES APPLY INDICATOR"
	 */
   public boolean isSys201L3088800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L308880088Value)  == 0  );
   }


	/**
	*  set values "     CORPORATE INCENTIVE RATES APPLY INDICATOR"
	*/
   	public void setSys201L3088800True() {  			
    	setDtlRecord1800( sys201L308880088Value);
   	}
	char[] sys201L318880088Value = "     SPECIAL CONDITIONS INDICATOR                                    ".toCharArray();
	/**
	 *	Test condition "     SPECIAL CONDITIONS INDICATOR" for isSys201L3188800()
	 *	@return  Returns true if isSys201L3188800() is "     SPECIAL CONDITIONS INDICATOR"
	 */
   public boolean isSys201L3188800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L318880088Value)  == 0  );
   }


	/**
	*  set values "     SPECIAL CONDITIONS INDICATOR"
	*/
   	public void setSys201L3188800True() {  			
    	setDtlRecord1800( sys201L318880088Value);
   	}
	char[] sys201L328880088Value = "     MASTERCARD ASSIGNED ID OVERRIDE INDICATOR                       ".toCharArray();
	/**
	 *	Test condition "     MASTERCARD ASSIGNED ID OVERRIDE INDICATOR" for isSys201L3288800()
	 *	@return  Returns true if isSys201L3288800() is "     MASTERCARD ASSIGNED ID OVERRIDE INDICATOR"
	 */
   public boolean isSys201L3288800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L328880088Value)  == 0  );
   }


	/**
	*  set values "     MASTERCARD ASSIGNED ID OVERRIDE INDICATOR"
	*/
   	public void setSys201L3288800True() {  			
    	setDtlRecord1800( sys201L328880088Value);
   	}
	char[] sys201L338880088Value = "     RATE INDICATOR                                                  ".toCharArray();
	/**
	 *	Test condition "     RATE INDICATOR" for isSys201L3388800()
	 *	@return  Returns true if isSys201L3388800() is "     RATE INDICATOR"
	 */
   public boolean isSys201L3388800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L338880088Value)  == 0  );
   }


	/**
	*  set values "     RATE INDICATOR"
	*/
   	public void setSys201L3388800True() {  			
    	setDtlRecord1800( sys201L338880088Value);
   	}
	char[] sys201L348880088Value = "     MASTERPASS INCENTIVE INDICATOR                                  ".toCharArray();
	/**
	 *	Test condition "     MASTERPASS INCENTIVE INDICATOR" for isSys201L3488800()
	 *	@return  Returns true if isSys201L3488800() is "     MASTERPASS INCENTIVE INDICATOR"
	 */
   public boolean isSys201L3488800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L348880088Value)  == 0  );
   }


	/**
	*  set values "     MASTERPASS INCENTIVE INDICATOR"
	*/
   	public void setSys201L3488800True() {  			
    	setDtlRecord1800( sys201L348880088Value);
   	}
	char[] sys201L358880088Value = "     DIGITAL WALLET INTERCHANGE RATE OVERRIDE INDI CATOR             ".toCharArray();
	/**
	 *	Test condition "     DIGITAL WALLET INTERCHANGE RATE OVERRIDE INDI CATOR" for isSys201L3588800()
	 *	@return  Returns true if isSys201L3588800() is "     DIGITAL WALLET INTERCHANGE RATE OVERRIDE INDI CATOR"
	 */
   public boolean isSys201L3588800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L358880088Value)  == 0  );
   }


	/**
	*  set values "     DIGITAL WALLET INTERCHANGE RATE OVERRIDE INDI CATOR"
	*/
   	public void setSys201L3588800True() {  			
    	setDtlRecord1800( sys201L358880088Value);
   	}
	char[] sys201L368880088Value = " 12.UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHI FT FOR ISSUERS    ".toCharArray();
	/**
	 *	Test condition " 12.UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHI FT FOR ISSUERS" for isSys201L3688800()
	 *	@return  Returns true if isSys201L3688800() is " 12.UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHI FT FOR ISSUERS"
	 */
   public boolean isSys201L3688800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L368880088Value)  == 0  );
   }


	/**
	*  set values " 12.UCAF PDS 0052 VALUES FOCUSING ON LIABILITY SHI FT FOR ISSUERS"
	*/
   	public void setSys201L3688800True() {  			
    	setDtlRecord1800( sys201L368880088Value);
   	}
	char[] sys201L378880088Value = "     211                                                             ".toCharArray();
	/**
	 *	Test condition "     211" for isSys201L3788800()
	 *	@return  Returns true if isSys201L3788800() is "     211"
	 */
   public boolean isSys201L3788800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L378880088Value)  == 0  );
   }


	/**
	*  set values "     211"
	*/
   	public void setSys201L3788800True() {  			
    	setDtlRecord1800( sys201L378880088Value);
   	}
	char[] sys201L388880088Value = "     212                                                             ".toCharArray();
	/**
	 *	Test condition "     212" for isSys201L3888800()
	 *	@return  Returns true if isSys201L3888800() is "     212"
	 */
   public boolean isSys201L3888800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L388880088Value)  == 0  );
   }


	/**
	*  set values "     212"
	*/
   	public void setSys201L3888800True() {  			
    	setDtlRecord1800( sys201L388880088Value);
   	}
	char[] sys201L398880088Value = "     215                                                             ".toCharArray();
	/**
	 *	Test condition "     215" for isSys201L3988800()
	 *	@return  Returns true if isSys201L3988800() is "     215"
	 */
   public boolean isSys201L3988800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L398880088Value)  == 0  );
   }


	/**
	*  set values "     215"
	*/
   	public void setSys201L3988800True() {  			
    	setDtlRecord1800( sys201L398880088Value);
   	}
	char[] sys201L408880088Value = "     217                                                             ".toCharArray();
	/**
	 *	Test condition "     217" for isSys201L4088800()
	 *	@return  Returns true if isSys201L4088800() is "     217"
	 */
   public boolean isSys201L4088800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L408880088Value)  == 0  );
   }


	/**
	*  set values "     217"
	*/
   	public void setSys201L4088800True() {  			
    	setDtlRecord1800( sys201L408880088Value);
   	}
	char[] sys201L418880088Value = "     911                                                             ".toCharArray();
	/**
	 *	Test condition "     911" for isSys201L4188800()
	 *	@return  Returns true if isSys201L4188800() is "     911"
	 */
   public boolean isSys201L4188800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L418880088Value)  == 0  );
   }


	/**
	*  set values "     911"
	*/
   	public void setSys201L4188800True() {  			
    	setDtlRecord1800( sys201L418880088Value);
   	}
	char[] sys201L428880088Value = "     912                                                             ".toCharArray();
	/**
	 *	Test condition "     912" for isSys201L4288800()
	 *	@return  Returns true if isSys201L4288800() is "     912"
	 */
   public boolean isSys201L4288800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L428880088Value)  == 0  );
   }


	/**
	*  set values "     912"
	*/
   	public void setSys201L4288800True() {  			
    	setDtlRecord1800( sys201L428880088Value);
   	}
	char[] sys201L438880088Value = " 13.TOTAL ORIGINAL FIRST PRESENTMENTS                                ".toCharArray();
	/**
	 *	Test condition " 13.TOTAL ORIGINAL FIRST PRESENTMENTS" for isSys201L4388800()
	 *	@return  Returns true if isSys201L4388800() is " 13.TOTAL ORIGINAL FIRST PRESENTMENTS"
	 */
   public boolean isSys201L4388800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201L438880088Value)  == 0  );
   }


	/**
	*  set values " 13.TOTAL ORIGINAL FIRST PRESENTMENTS"
	*/
   	public void setSys201L4388800True() {  			
    	setDtlRecord1800( sys201L438880088Value);
   	}
	char[] sys201Maid8880088Value = "     :                                                               ".toCharArray();
	/**
	 *	Test condition "     :" for isSys201Maid88800()
	 *	@return  Returns true if isSys201Maid88800() is "     :"
	 */
   public boolean isSys201Maid88800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201Maid8880088Value)  == 0  );
   }


	/**
	*  set values "     :"
	*/
   	public void setSys201Maid88800True() {  			
    	setDtlRecord1800( sys201Maid8880088Value);
   	}
	char[] sys201FullRej8880088Value = " PERFORMANCE REPORT WILL NOT BE GENERATED FOR FULL  REVERSAL FILES.  ".toCharArray();
	/**
	 *	Test condition " PERFORMANCE REPORT WILL NOT BE GENERATED FOR FULL  REVERSAL FILES." for isSys201FullRej88800()
	 *	@return  Returns true if isSys201FullRej88800() is " PERFORMANCE REPORT WILL NOT BE GENERATED FOR FULL  REVERSAL FILES."
	 */
   public boolean isSys201FullRej88800() throws CFException {
      return (  compareChars( getDtlRecord1800() , sys201FullRej8880088Value)  == 0  );
   }


	/**
	*  set values " PERFORMANCE REPORT WILL NOT BE GENERATED FOR FULL  REVERSAL FILES."
	*/
   	public void setSys201FullRej88800True() {  			
    	setDtlRecord1800( sys201FullRej8880088Value);
   	}
	/**
	 *	Returns the value of var1N
	 *	@return var1N
	 */
	public BigDecimal getVar1N() throws CFException {
       if (isVar1NModified()) { 
           var1N = refreshVar1N();
        }
   		return var1N;
	}
	

	
	   
	/**
	 * 	Update Var1N with the passed number
	 *  Corresponding COBOL Variable is WS-VAR1-N
	 *	@param number
	 */
	public void setVar1N(BigDecimal number) {
        number = (number.signum() < 0) ? number.negate():number; // Only positive number allowed  
       var1N = checkVar1NMaxLimit(number);
	    serializeVar1N(var1N);
   }
	/**
	 * 	Update Var1N with the passed value
	 *	@param value (String or char[])
	 */
	public void setVar1N(char[] value) throws CFException {
		 var1N = serializeVar1N(value);
	}   
	/**
	 *	Returns the value of var1Ed
	 *	@return var1Ed
	 */
   public char[] getVar1Ed() throws CFException{
     if (isVar1EdModified()) { 
        var1Ed = refreshVar1Ed();
     }
   		return var1Ed;
   }

  
	/**
	*  set variable var1Ed
	*  Corresponding COBOL Variable is WS-VAR1-ED
	*  @param value
	**/
   public void setVar1Ed(char[] value) {
      var1Ed = checkVar1EdConstraints(value);
      serializeVar1Ed(var1Ed);
   } 

     /**
	 * 	Update Var1Ed 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar1Ed(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVar1Ed,var1Ed.length);
   	
   }
   
   public void setVar1Ed(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVar1Ed,var1Ed.length);
   	
   }
   
     /**
	 * 	Update Var1Ed 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar1Ed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar1Ed+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Var1Ed with another Field
	 *	@param value
	 */
   public void setVar1Ed(Field source) {
       replace(source,0,source.length(),beginVar1Ed,VAR_1_ED_LEN);
   	
   }  
   
     /**
	 * 	Update Var1Ed 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar1Ed(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVar1Ed,VAR_1_ED_LEN);
   	
   }
   
     /**
	 * 	Update Var1Ed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar1Ed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar1Ed+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of var2Ed
	 *	@return var2Ed
	 */
   public char[] getVar2Ed() throws CFException{
     if (isVar2EdModified()) { 
        var2Ed = refreshVar2Ed();
     }
   		return var2Ed;
   }

  
	/**
	*  set variable var2Ed
	*  Corresponding COBOL Variable is WS-VAR2-ED
	*  @param value
	**/
   public void setVar2Ed(char[] value) {
      var2Ed = checkVar2EdConstraints(value);
      serializeVar2Ed(var2Ed);
   } 

     /**
	 * 	Update Var2Ed 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVar2Ed(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVar2Ed,var2Ed.length);
   	
   }
   
   public void setVar2Ed(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVar2Ed,var2Ed.length);
   	
   }
   
     /**
	 * 	Update Var2Ed 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVar2Ed(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar2Ed+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Var2Ed with another Field
	 *	@param value
	 */
   public void setVar2Ed(Field source) {
       replace(source,0,source.length(),beginVar2Ed,VAR_2_ED_LEN);
   	
   }  
   
     /**
	 * 	Update Var2Ed 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVar2Ed(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVar2Ed,VAR_2_ED_LEN);
   	
   }
   
     /**
	 * 	Update Var2Ed 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVar2Ed(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVar2Ed+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of c0071300
	 *	@return c0071300
	 */
   public char[] getC0071300() throws CFException{
   		return c0071300;
   }

  
	/**
	*  set variable c0071300
	*  Corresponding COBOL Variable is 300-C-0071
	*  @param value
	**/
   public void setC0071300(char[] value) {
       value = checkC0071300Constraints(value);
       arraycopy(value,0,c0071300,0,value.length);
   } 
	public void setC0071300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,c0071300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ip00104Elsub
	 *	@return ip00104Elsub
	 */
	public int getIp00104Elsub() throws CFException {
       if (isIp00104ElsubModified()) { 
           ip00104Elsub = refreshIp00104Elsub();
        }
   		return ip00104Elsub;
	}
	

	
	   
	/**
	 * 	Update Ip00104Elsub with the passed value
	 *  Corresponding COBOL Variable is IP00104-ELSUB
	 *	@param number
	 */
	public void setIp00104Elsub(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00104Elsub = checkIp00104ElsubMaxLimit(number); 
		serializeIp00104Elsub(ip00104Elsub);
	}
	

	public void setIp00104Elsub(long number) {
	    number = checkIp00104ElsubMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00104Elsub((int)number);
	}
	
	/**
	 * 	Update Ip00104Elsub with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00104Elsub(char[] value) throws CFException {
		 ip00104Elsub = serializeIp00104Elsub(value);
	}
	/**
	 * 	Update Ip00104Elsub with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00104ElsubString(char[] value) throws CFException {
		 setIp00104Elsub(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
