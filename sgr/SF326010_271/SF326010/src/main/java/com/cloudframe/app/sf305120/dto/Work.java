package com.cloudframe.app.sf305120.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] firstTimeFlag100 = new char[1];

						private char[] zlogReleaseFlag100 = new char[1];

						private char[] oeHeaderData280 = new char[138];

								private short esV1HdrLnth300;

								private short esV2HdrLnth300;

								private short esV3HdrLnth300;

								private short oeStructLnth300;

								private short esHdrOffset300;

								private short esV2Majic300;

								private short esV3Majic300;

						private char[] programSf305120300 = new char[8];

								private int number01300;

								private short binary1300;

								private short binary2300;

								private short binary3300;

								private short binary4300;

								private short binary8300;

								private short binary11300;

								private short binary15300;

								private short binary16300;

								private short binary21300;

								private short binary24300;

								private short binary38300;

								private short binary39300;

								private short binary40300;

								private short binary64300;

								private short binary512300;

								private short error4300;

								private short error16300;

								private short error17300;

								private short error18300;

								private short error19300;

								private short error20300;

								private short error21300;

								private short error22300;

								private short error41300;

								private short error42300;

								private short error43300;

								private short error44300;

								private short error45300;

								private short error46300;

								private short error99300;

						private char[] charZ300 = new char[1];

						private char[] charC300 = new char[1];

						private char[] blankLine300 = new char[1];

						private char[] asciiSr300 = new char[2];

						private char[] literalEs300 = new char[2];

						private char[] literalOe300 = new char[2];

						private char[] literalSv300 = new char[2];

						private char[] literalPl300 = new char[2];

						private char[] literalRe300 = new char[2];

						private char[] literalRo300 = new char[2];

						private char[] literalIn300 = new char[2];

						private char[] literalEd300 = new char[2];

								private short currOffset420;

								private short workLength420;

						private char[] sf305120VersionMsg600 = new char[64];

						private char[] message0001600 = new char[64];

						private char[] currDateYyyy600 = new char[4];

						private char[] currDateMm600 = new char[2];

						private char[] currDateDd600 = new char[2];

						private char[] currTimeHh600 = new char[2];

						private char[] currTimeMm600 = new char[2];

						private char[] currTimeSs600 = new char[2];

						private char[] zlogSr2Area803 = new char[8167];

								private short rhTotalLnth810;

								private short rhLnth1810;

								private short rhLnth2810;

								private short rhLnth3810;

						private char[] rhWaitTime810 = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFirstTimeFlag100(("Y").toCharArray());
								setZlogReleaseFlag100(("N").toCharArray());
								setOeHeaderData280("ES010000000000000000                                                                                                                      ".toCharArray());
								setEsV1HdrLnth300((short)8);
								setEsV2HdrLnth300((short)21);
								setEsV3HdrLnth300((short)25);
								setOeStructLnth300((short)38);
								setEsHdrOffset300((short)39);
								setEsV2Majic300((short)2);
								setEsV3Majic300((short)6);
								setProgramSf305120300(("SF305120").toCharArray());
								setNumber01300(2);
								setBinary1300((short)1);
								setBinary2300((short)2);
								setBinary3300((short)3);
								setBinary4300((short)4);
								setBinary8300((short)8);
								setBinary11300((short)11);
								setBinary15300((short)15);
								setBinary16300((short)16);
								setBinary21300((short)21);
								setBinary24300((short)24);
								setBinary38300((short)38);
								setBinary39300((short)39);
								setBinary40300((short)40);
								setBinary64300((short)64);
								setBinary512300((short)512);
								setError4300((short)4);
								setError16300((short)16);
								setError17300((short)17);
								setError18300((short)18);
								setError19300((short)19);
								setError20300((short)20);
								setError21300((short)21);
								setError22300((short)22);
								setError41300((short)41);
								setError42300((short)42);
								setError43300((short)43);
								setError44300((short)44);
								setError45300((short)45);
								setError46300((short)46);
								setError99300((short)99);
								setCharZ300(("Z").toCharArray());
								setCharC300(("C").toCharArray());
								setBlankLine300(fillSpace(1));
								setAsciiSr300(getString(new byte[] {(byte)0x53,(byte)0x52}).toCharArray());
								setLiteralEs300(("ES").toCharArray());
								setLiteralOe300(("OE").toCharArray());
								setLiteralSv300(("SV").toCharArray());
								setLiteralPl300(("PL").toCharArray());
								setLiteralRe300(("RE").toCharArray());
								setLiteralRo300(("RO").toCharArray());
								setLiteralIn300(("IN").toCharArray());
								setLiteralEd300(("ED").toCharArray());
								setCurrOffset420((short)0);
								setWorkLength420((short)0);
								setSf305120VersionMsg600(pad(64,"SF305120  2014-09-12 MDES CLOG OE HEADER FIX".toCharArray(),' ',RIGHT_PAD));
								setMessage0001600(pad(64,"SF305120-0001  DECODE CLASS Z ASA LOG RECORD HEADERS    ".toCharArray(),' ',RIGHT_PAD));
								setCurrDateYyyy600(fillSpace(4));
								setCurrDateMm600(fillSpace(2));
								setCurrDateDd600(fillSpace(2));
								setCurrTimeHh600(fillSpace(2));
								setCurrTimeMm600(fillSpace(2));
								setCurrTimeSs600(fillSpace(2));
								setZlogSr2Area803(pad(8167," ".toCharArray(),' ',RIGHT_PAD));
								setRhTotalLnth810((short)0);
								setRhLnth1810((short)0);
								setRhLnth2810((short)0);
								setRhLnth3810((short)0);
								setRhWaitTime810(getString(new byte[] {(byte)0x0A}).toCharArray());
    }


 

	/**
	 *	Returns the value of firstTimeFlag100
	 *	@return firstTimeFlag100
	 */
   public char[] getFirstTimeFlag100() throws CFException{
   		return firstTimeFlag100;
   }

  
	/**
	*  set variable firstTimeFlag100
	*  Corresponding COBOL Variable is 100-FIRST-TIME-FLAG
	*  @param value
	**/
   public void setFirstTimeFlag100(char[] value) {
       value = checkFirstTimeFlag100Constraints(value);
       arraycopy(value,0,firstTimeFlag100,0,value.length);
   } 
	public void setFirstTimeFlag100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firstTimeFlag100,0,beginIndex + endIndex);
   }
	char[] thisIsTheFirstTime8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isThisIsTheFirstTime88100()
	 *	@return  Returns true if isThisIsTheFirstTime88100() is "Y"
	 */
   public boolean isThisIsTheFirstTime88100() throws CFException {
      return (  compareChars( getFirstTimeFlag100() , thisIsTheFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setThisIsTheFirstTime88100True() {  			
    	setFirstTimeFlag100( thisIsTheFirstTime8810088Value);
   	}
	char[] noLongerFirstTime8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoLongerFirstTime88100()
	 *	@return  Returns true if isNoLongerFirstTime88100() is "N"
	 */
   public boolean isNoLongerFirstTime88100() throws CFException {
      return (  compareChars( getFirstTimeFlag100() , noLongerFirstTime8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoLongerFirstTime88100True() {  			
    	setFirstTimeFlag100( noLongerFirstTime8810088Value);
   	}
	/**
	 *	Returns the value of zlogReleaseFlag100
	 *	@return zlogReleaseFlag100
	 */
   public char[] getZlogReleaseFlag100() throws CFException{
   		return zlogReleaseFlag100;
   }

  
	/**
	*  set variable zlogReleaseFlag100
	*  Corresponding COBOL Variable is 100-ZLOG-RELEASE-FLAG
	*  @param value
	**/
   public void setZlogReleaseFlag100(char[] value) {
       value = checkZlogReleaseFlag100Constraints(value);
       arraycopy(value,0,zlogReleaseFlag100,0,value.length);
   } 
	public void setZlogReleaseFlag100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,zlogReleaseFlag100,0,beginIndex + endIndex);
   }
	char[] zlogRel1028810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isZlogRel10288100()
	 *	@return  Returns true if isZlogRel10288100() is "N"
	 */
   public boolean isZlogRel10288100() throws CFException {
      return (  compareChars( getZlogReleaseFlag100() , zlogRel1028810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setZlogRel10288100True() {  			
    	setZlogReleaseFlag100( zlogRel1028810088Value);
   	}
	char[] zlogRel1118810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isZlogRel11188100()
	 *	@return  Returns true if isZlogRel11188100() is "Y"
	 */
   public boolean isZlogRel11188100() throws CFException {
      return (  compareChars( getZlogReleaseFlag100() , zlogRel1118810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setZlogRel11188100True() {  			
    	setZlogReleaseFlag100( zlogRel1118810088Value);
   	}
	/**
	 *	Returns the value of oeHeaderData280
	 *	@return oeHeaderData280
	 */
   public char[] getOeHeaderData280() throws CFException{
   		return oeHeaderData280;
   }

  
	/**
	*  set variable oeHeaderData280
	*  Corresponding COBOL Variable is 280-OE-HEADER-DATA
	*  @param value
	**/
   public void setOeHeaderData280(char[] value) {
       value = checkOeHeaderData280Constraints(value);
       arraycopy(value,0,oeHeaderData280,0,value.length);
   } 
	public void setOeHeaderData280(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,oeHeaderData280,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of esV1HdrLnth300
	 *	@return esV1HdrLnth300
	 */
	public short getEsV1HdrLnth300() throws CFException {
   		return esV1HdrLnth300;
	}
	
	/**
	 * 	Update EsV1HdrLnth300 with the passed value
	 *  Corresponding COBOL Variable is 300-ES-V1-HDR-LNTH
	 *	@param number
	 */
	public void setEsV1HdrLnth300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV1HdrLnth300 = checkEsV1HdrLnth300MaxLimit(number); 
	}

	public void setEsV1HdrLnth300(int number) {
	    number = checkEsV1HdrLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV1HdrLnth300((short)number);
	}
	public void setEsV1HdrLnth300(long number) {
	    number = checkEsV1HdrLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV1HdrLnth300((short)number);
	}
	

	/**
	 *	Returns the value of esV2HdrLnth300
	 *	@return esV2HdrLnth300
	 */
	public short getEsV2HdrLnth300() throws CFException {
   		return esV2HdrLnth300;
	}
	
	/**
	 * 	Update EsV2HdrLnth300 with the passed value
	 *  Corresponding COBOL Variable is 300-ES-V2-HDR-LNTH
	 *	@param number
	 */
	public void setEsV2HdrLnth300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV2HdrLnth300 = checkEsV2HdrLnth300MaxLimit(number); 
	}

	public void setEsV2HdrLnth300(int number) {
	    number = checkEsV2HdrLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV2HdrLnth300((short)number);
	}
	public void setEsV2HdrLnth300(long number) {
	    number = checkEsV2HdrLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV2HdrLnth300((short)number);
	}
	

	/**
	 *	Returns the value of esV3HdrLnth300
	 *	@return esV3HdrLnth300
	 */
	public short getEsV3HdrLnth300() throws CFException {
   		return esV3HdrLnth300;
	}
	
	/**
	 * 	Update EsV3HdrLnth300 with the passed value
	 *  Corresponding COBOL Variable is 300-ES-V3-HDR-LNTH
	 *	@param number
	 */
	public void setEsV3HdrLnth300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV3HdrLnth300 = checkEsV3HdrLnth300MaxLimit(number); 
	}

	public void setEsV3HdrLnth300(int number) {
	    number = checkEsV3HdrLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3HdrLnth300((short)number);
	}
	public void setEsV3HdrLnth300(long number) {
	    number = checkEsV3HdrLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3HdrLnth300((short)number);
	}
	

	/**
	 *	Returns the value of oeStructLnth300
	 *	@return oeStructLnth300
	 */
	public short getOeStructLnth300() throws CFException {
   		return oeStructLnth300;
	}
	
	/**
	 * 	Update OeStructLnth300 with the passed value
	 *  Corresponding COBOL Variable is 300-OE-STRUCT-LNTH
	 *	@param number
	 */
	public void setOeStructLnth300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    oeStructLnth300 = checkOeStructLnth300MaxLimit(number); 
	}

	public void setOeStructLnth300(int number) {
	    number = checkOeStructLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOeStructLnth300((short)number);
	}
	public void setOeStructLnth300(long number) {
	    number = checkOeStructLnth300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setOeStructLnth300((short)number);
	}
	

	/**
	 *	Returns the value of esHdrOffset300
	 *	@return esHdrOffset300
	 */
	public short getEsHdrOffset300() throws CFException {
   		return esHdrOffset300;
	}
	
	/**
	 * 	Update EsHdrOffset300 with the passed value
	 *  Corresponding COBOL Variable is 300-ES-HDR-OFFSET
	 *	@param number
	 */
	public void setEsHdrOffset300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esHdrOffset300 = checkEsHdrOffset300MaxLimit(number); 
	}

	public void setEsHdrOffset300(int number) {
	    number = checkEsHdrOffset300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsHdrOffset300((short)number);
	}
	public void setEsHdrOffset300(long number) {
	    number = checkEsHdrOffset300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsHdrOffset300((short)number);
	}
	

	/**
	 *	Returns the value of esV2Majic300
	 *	@return esV2Majic300
	 */
	public short getEsV2Majic300() throws CFException {
   		return esV2Majic300;
	}
	
	/**
	 * 	Update EsV2Majic300 with the passed value
	 *  Corresponding COBOL Variable is 300-ES-V2-MAJIC
	 *	@param number
	 */
	public void setEsV2Majic300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV2Majic300 = checkEsV2Majic300MaxLimit(number); 
	}

	public void setEsV2Majic300(int number) {
	    number = checkEsV2Majic300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV2Majic300((short)number);
	}
	public void setEsV2Majic300(long number) {
	    number = checkEsV2Majic300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV2Majic300((short)number);
	}
	

	/**
	 *	Returns the value of esV3Majic300
	 *	@return esV3Majic300
	 */
	public short getEsV3Majic300() throws CFException {
   		return esV3Majic300;
	}
	
	/**
	 * 	Update EsV3Majic300 with the passed value
	 *  Corresponding COBOL Variable is 300-ES-V3-MAJIC
	 *	@param number
	 */
	public void setEsV3Majic300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    esV3Majic300 = checkEsV3Majic300MaxLimit(number); 
	}

	public void setEsV3Majic300(int number) {
	    number = checkEsV3Majic300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3Majic300((short)number);
	}
	public void setEsV3Majic300(long number) {
	    number = checkEsV3Majic300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setEsV3Majic300((short)number);
	}
	

	/**
	 *	Returns the value of programSf305120300
	 *	@return programSf305120300
	 */
   public char[] getProgramSf305120300() throws CFException{
   		return programSf305120300;
   }

  
	/**
	*  set variable programSf305120300
	*  Corresponding COBOL Variable is 300-PROGRAM-SF305120
	*  @param value
	**/
   public void setProgramSf305120300(char[] value) {
       value = checkProgramSf305120300Constraints(value);
       arraycopy(value,0,programSf305120300,0,value.length);
   } 
	public void setProgramSf305120300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,programSf305120300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of number01300
	 *	@return number01300
	 */
	public int getNumber01300() throws CFException {
       if (isNumber01300Modified()) { 
           number01300 = refreshNumber01300();
        }
   		return number01300;
	}
	

	
	   
	/**
	 * 	Update Number01300 with the passed value
	 *  Corresponding COBOL Variable is 300-NUMBER-01
	 *	@param number
	 */
	public void setNumber01300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    number01300 = checkNumber01300MaxLimit(number); 
		serializeNumber01300(number01300);
	}
	

	public void setNumber01300(long number) {
	    number = checkNumber01300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNumber01300((int)number);
	}
	
	/**
	 * 	Update Number01300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setNumber01300(char[] value) throws CFException {
		 number01300 = serializeNumber01300(value);
	}
	/**
	 * 	Update Number01300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setNumber01300String(char[] value) throws CFException {
		 setNumber01300(value);
	}
	/**
	 *	Returns the value of binary1300
	 *	@return binary1300
	 */
	public short getBinary1300() throws CFException {
   		return binary1300;
	}
	
	/**
	 * 	Update Binary1300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-1
	 *	@param number
	 */
	public void setBinary1300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary1300 = checkBinary1300MaxLimit(number); 
	}

	public void setBinary1300(int number) {
	    number = checkBinary1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary1300((short)number);
	}
	public void setBinary1300(long number) {
	    number = checkBinary1300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary1300((short)number);
	}
	

	/**
	 *	Returns the value of binary2300
	 *	@return binary2300
	 */
	public short getBinary2300() throws CFException {
   		return binary2300;
	}
	
	/**
	 * 	Update Binary2300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-2
	 *	@param number
	 */
	public void setBinary2300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary2300 = checkBinary2300MaxLimit(number); 
	}

	public void setBinary2300(int number) {
	    number = checkBinary2300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary2300((short)number);
	}
	public void setBinary2300(long number) {
	    number = checkBinary2300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary2300((short)number);
	}
	

	/**
	 *	Returns the value of binary3300
	 *	@return binary3300
	 */
	public short getBinary3300() throws CFException {
   		return binary3300;
	}
	
	/**
	 * 	Update Binary3300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-3
	 *	@param number
	 */
	public void setBinary3300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary3300 = checkBinary3300MaxLimit(number); 
	}

	public void setBinary3300(int number) {
	    number = checkBinary3300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary3300((short)number);
	}
	public void setBinary3300(long number) {
	    number = checkBinary3300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary3300((short)number);
	}
	

	/**
	 *	Returns the value of binary4300
	 *	@return binary4300
	 */
	public short getBinary4300() throws CFException {
   		return binary4300;
	}
	
	/**
	 * 	Update Binary4300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-4
	 *	@param number
	 */
	public void setBinary4300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary4300 = checkBinary4300MaxLimit(number); 
	}

	public void setBinary4300(int number) {
	    number = checkBinary4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary4300((short)number);
	}
	public void setBinary4300(long number) {
	    number = checkBinary4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary4300((short)number);
	}
	

	/**
	 *	Returns the value of binary8300
	 *	@return binary8300
	 */
	public short getBinary8300() throws CFException {
   		return binary8300;
	}
	
	/**
	 * 	Update Binary8300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-8
	 *	@param number
	 */
	public void setBinary8300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary8300 = checkBinary8300MaxLimit(number); 
	}

	public void setBinary8300(int number) {
	    number = checkBinary8300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary8300((short)number);
	}
	public void setBinary8300(long number) {
	    number = checkBinary8300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary8300((short)number);
	}
	

	/**
	 *	Returns the value of binary11300
	 *	@return binary11300
	 */
	public short getBinary11300() throws CFException {
   		return binary11300;
	}
	
	/**
	 * 	Update Binary11300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-11
	 *	@param number
	 */
	public void setBinary11300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary11300 = checkBinary11300MaxLimit(number); 
	}

	public void setBinary11300(int number) {
	    number = checkBinary11300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary11300((short)number);
	}
	public void setBinary11300(long number) {
	    number = checkBinary11300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary11300((short)number);
	}
	

	/**
	 *	Returns the value of binary15300
	 *	@return binary15300
	 */
	public short getBinary15300() throws CFException {
   		return binary15300;
	}
	
	/**
	 * 	Update Binary15300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-15
	 *	@param number
	 */
	public void setBinary15300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary15300 = checkBinary15300MaxLimit(number); 
	}

	public void setBinary15300(int number) {
	    number = checkBinary15300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary15300((short)number);
	}
	public void setBinary15300(long number) {
	    number = checkBinary15300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary15300((short)number);
	}
	

	/**
	 *	Returns the value of binary16300
	 *	@return binary16300
	 */
	public short getBinary16300() throws CFException {
   		return binary16300;
	}
	
	/**
	 * 	Update Binary16300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-16
	 *	@param number
	 */
	public void setBinary16300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary16300 = checkBinary16300MaxLimit(number); 
	}

	public void setBinary16300(int number) {
	    number = checkBinary16300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary16300((short)number);
	}
	public void setBinary16300(long number) {
	    number = checkBinary16300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary16300((short)number);
	}
	

	/**
	 *	Returns the value of binary21300
	 *	@return binary21300
	 */
	public short getBinary21300() throws CFException {
   		return binary21300;
	}
	
	/**
	 * 	Update Binary21300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-21
	 *	@param number
	 */
	public void setBinary21300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary21300 = checkBinary21300MaxLimit(number); 
	}

	public void setBinary21300(int number) {
	    number = checkBinary21300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary21300((short)number);
	}
	public void setBinary21300(long number) {
	    number = checkBinary21300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary21300((short)number);
	}
	

	/**
	 *	Returns the value of binary24300
	 *	@return binary24300
	 */
	public short getBinary24300() throws CFException {
   		return binary24300;
	}
	
	/**
	 * 	Update Binary24300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-24
	 *	@param number
	 */
	public void setBinary24300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary24300 = checkBinary24300MaxLimit(number); 
	}

	public void setBinary24300(int number) {
	    number = checkBinary24300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary24300((short)number);
	}
	public void setBinary24300(long number) {
	    number = checkBinary24300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary24300((short)number);
	}
	

	/**
	 *	Returns the value of binary38300
	 *	@return binary38300
	 */
	public short getBinary38300() throws CFException {
   		return binary38300;
	}
	
	/**
	 * 	Update Binary38300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-38
	 *	@param number
	 */
	public void setBinary38300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary38300 = checkBinary38300MaxLimit(number); 
	}

	public void setBinary38300(int number) {
	    number = checkBinary38300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary38300((short)number);
	}
	public void setBinary38300(long number) {
	    number = checkBinary38300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary38300((short)number);
	}
	

	/**
	 *	Returns the value of binary39300
	 *	@return binary39300
	 */
	public short getBinary39300() throws CFException {
   		return binary39300;
	}
	
	/**
	 * 	Update Binary39300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-39
	 *	@param number
	 */
	public void setBinary39300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary39300 = checkBinary39300MaxLimit(number); 
	}

	public void setBinary39300(int number) {
	    number = checkBinary39300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary39300((short)number);
	}
	public void setBinary39300(long number) {
	    number = checkBinary39300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary39300((short)number);
	}
	

	/**
	 *	Returns the value of binary40300
	 *	@return binary40300
	 */
	public short getBinary40300() throws CFException {
   		return binary40300;
	}
	
	/**
	 * 	Update Binary40300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-40
	 *	@param number
	 */
	public void setBinary40300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary40300 = checkBinary40300MaxLimit(number); 
	}

	public void setBinary40300(int number) {
	    number = checkBinary40300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary40300((short)number);
	}
	public void setBinary40300(long number) {
	    number = checkBinary40300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary40300((short)number);
	}
	

	/**
	 *	Returns the value of binary64300
	 *	@return binary64300
	 */
	public short getBinary64300() throws CFException {
   		return binary64300;
	}
	
	/**
	 * 	Update Binary64300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-64
	 *	@param number
	 */
	public void setBinary64300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary64300 = checkBinary64300MaxLimit(number); 
	}

	public void setBinary64300(int number) {
	    number = checkBinary64300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary64300((short)number);
	}
	public void setBinary64300(long number) {
	    number = checkBinary64300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary64300((short)number);
	}
	

	/**
	 *	Returns the value of binary512300
	 *	@return binary512300
	 */
	public short getBinary512300() throws CFException {
   		return binary512300;
	}
	
	/**
	 * 	Update Binary512300 with the passed value
	 *  Corresponding COBOL Variable is 300-BINARY-512
	 *	@param number
	 */
	public void setBinary512300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    binary512300 = checkBinary512300MaxLimit(number); 
	}

	public void setBinary512300(int number) {
	    number = checkBinary512300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary512300((short)number);
	}
	public void setBinary512300(long number) {
	    number = checkBinary512300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBinary512300((short)number);
	}
	

	/**
	 *	Returns the value of error4300
	 *	@return error4300
	 */
	public short getError4300() throws CFException {
   		return error4300;
	}
	
	/**
	 * 	Update Error4300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-4
	 *	@param number
	 */
	public void setError4300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error4300 = checkError4300MaxLimit(number); 
	}

	public void setError4300(int number) {
	    number = checkError4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError4300((short)number);
	}
	public void setError4300(long number) {
	    number = checkError4300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError4300((short)number);
	}
	

	/**
	 *	Returns the value of error16300
	 *	@return error16300
	 */
	public short getError16300() throws CFException {
   		return error16300;
	}
	
	/**
	 * 	Update Error16300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-16
	 *	@param number
	 */
	public void setError16300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error16300 = checkError16300MaxLimit(number); 
	}

	public void setError16300(int number) {
	    number = checkError16300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError16300((short)number);
	}
	public void setError16300(long number) {
	    number = checkError16300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError16300((short)number);
	}
	

	/**
	 *	Returns the value of error17300
	 *	@return error17300
	 */
	public short getError17300() throws CFException {
   		return error17300;
	}
	
	/**
	 * 	Update Error17300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-17
	 *	@param number
	 */
	public void setError17300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error17300 = checkError17300MaxLimit(number); 
	}

	public void setError17300(int number) {
	    number = checkError17300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError17300((short)number);
	}
	public void setError17300(long number) {
	    number = checkError17300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError17300((short)number);
	}
	

	/**
	 *	Returns the value of error18300
	 *	@return error18300
	 */
	public short getError18300() throws CFException {
   		return error18300;
	}
	
	/**
	 * 	Update Error18300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-18
	 *	@param number
	 */
	public void setError18300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error18300 = checkError18300MaxLimit(number); 
	}

	public void setError18300(int number) {
	    number = checkError18300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError18300((short)number);
	}
	public void setError18300(long number) {
	    number = checkError18300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError18300((short)number);
	}
	

	/**
	 *	Returns the value of error19300
	 *	@return error19300
	 */
	public short getError19300() throws CFException {
   		return error19300;
	}
	
	/**
	 * 	Update Error19300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-19
	 *	@param number
	 */
	public void setError19300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error19300 = checkError19300MaxLimit(number); 
	}

	public void setError19300(int number) {
	    number = checkError19300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError19300((short)number);
	}
	public void setError19300(long number) {
	    number = checkError19300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError19300((short)number);
	}
	

	/**
	 *	Returns the value of error20300
	 *	@return error20300
	 */
	public short getError20300() throws CFException {
   		return error20300;
	}
	
	/**
	 * 	Update Error20300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-20
	 *	@param number
	 */
	public void setError20300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error20300 = checkError20300MaxLimit(number); 
	}

	public void setError20300(int number) {
	    number = checkError20300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError20300((short)number);
	}
	public void setError20300(long number) {
	    number = checkError20300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError20300((short)number);
	}
	

	/**
	 *	Returns the value of error21300
	 *	@return error21300
	 */
	public short getError21300() throws CFException {
   		return error21300;
	}
	
	/**
	 * 	Update Error21300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-21
	 *	@param number
	 */
	public void setError21300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error21300 = checkError21300MaxLimit(number); 
	}

	public void setError21300(int number) {
	    number = checkError21300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError21300((short)number);
	}
	public void setError21300(long number) {
	    number = checkError21300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError21300((short)number);
	}
	

	/**
	 *	Returns the value of error22300
	 *	@return error22300
	 */
	public short getError22300() throws CFException {
   		return error22300;
	}
	
	/**
	 * 	Update Error22300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-22
	 *	@param number
	 */
	public void setError22300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error22300 = checkError22300MaxLimit(number); 
	}

	public void setError22300(int number) {
	    number = checkError22300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError22300((short)number);
	}
	public void setError22300(long number) {
	    number = checkError22300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError22300((short)number);
	}
	

	/**
	 *	Returns the value of error41300
	 *	@return error41300
	 */
	public short getError41300() throws CFException {
   		return error41300;
	}
	
	/**
	 * 	Update Error41300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-41
	 *	@param number
	 */
	public void setError41300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error41300 = checkError41300MaxLimit(number); 
	}

	public void setError41300(int number) {
	    number = checkError41300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError41300((short)number);
	}
	public void setError41300(long number) {
	    number = checkError41300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError41300((short)number);
	}
	

	/**
	 *	Returns the value of error42300
	 *	@return error42300
	 */
	public short getError42300() throws CFException {
   		return error42300;
	}
	
	/**
	 * 	Update Error42300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-42
	 *	@param number
	 */
	public void setError42300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error42300 = checkError42300MaxLimit(number); 
	}

	public void setError42300(int number) {
	    number = checkError42300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError42300((short)number);
	}
	public void setError42300(long number) {
	    number = checkError42300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError42300((short)number);
	}
	

	/**
	 *	Returns the value of error43300
	 *	@return error43300
	 */
	public short getError43300() throws CFException {
   		return error43300;
	}
	
	/**
	 * 	Update Error43300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-43
	 *	@param number
	 */
	public void setError43300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error43300 = checkError43300MaxLimit(number); 
	}

	public void setError43300(int number) {
	    number = checkError43300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError43300((short)number);
	}
	public void setError43300(long number) {
	    number = checkError43300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError43300((short)number);
	}
	

	/**
	 *	Returns the value of error44300
	 *	@return error44300
	 */
	public short getError44300() throws CFException {
   		return error44300;
	}
	
	/**
	 * 	Update Error44300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-44
	 *	@param number
	 */
	public void setError44300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error44300 = checkError44300MaxLimit(number); 
	}

	public void setError44300(int number) {
	    number = checkError44300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError44300((short)number);
	}
	public void setError44300(long number) {
	    number = checkError44300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError44300((short)number);
	}
	

	/**
	 *	Returns the value of error45300
	 *	@return error45300
	 */
	public short getError45300() throws CFException {
   		return error45300;
	}
	
	/**
	 * 	Update Error45300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-45
	 *	@param number
	 */
	public void setError45300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error45300 = checkError45300MaxLimit(number); 
	}

	public void setError45300(int number) {
	    number = checkError45300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError45300((short)number);
	}
	public void setError45300(long number) {
	    number = checkError45300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError45300((short)number);
	}
	

	/**
	 *	Returns the value of error46300
	 *	@return error46300
	 */
	public short getError46300() throws CFException {
   		return error46300;
	}
	
	/**
	 * 	Update Error46300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-46
	 *	@param number
	 */
	public void setError46300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error46300 = checkError46300MaxLimit(number); 
	}

	public void setError46300(int number) {
	    number = checkError46300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError46300((short)number);
	}
	public void setError46300(long number) {
	    number = checkError46300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError46300((short)number);
	}
	

	/**
	 *	Returns the value of error99300
	 *	@return error99300
	 */
	public short getError99300() throws CFException {
   		return error99300;
	}
	
	/**
	 * 	Update Error99300 with the passed value
	 *  Corresponding COBOL Variable is 300-ERROR-99
	 *	@param number
	 */
	public void setError99300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    error99300 = checkError99300MaxLimit(number); 
	}

	public void setError99300(int number) {
	    number = checkError99300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError99300((short)number);
	}
	public void setError99300(long number) {
	    number = checkError99300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setError99300((short)number);
	}
	

	/**
	 *	Returns the value of charZ300
	 *	@return charZ300
	 */
   public char[] getCharZ300() throws CFException{
   		return charZ300;
   }

  
	/**
	*  set variable charZ300
	*  Corresponding COBOL Variable is 300-CHAR-Z
	*  @param value
	**/
   public void setCharZ300(char[] value) {
       value = checkCharZ300Constraints(value);
       arraycopy(value,0,charZ300,0,value.length);
   } 
	public void setCharZ300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charZ300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of charC300
	 *	@return charC300
	 */
   public char[] getCharC300() throws CFException{
   		return charC300;
   }

  
	/**
	*  set variable charC300
	*  Corresponding COBOL Variable is 300-CHAR-C
	*  @param value
	**/
   public void setCharC300(char[] value) {
       value = checkCharC300Constraints(value);
       arraycopy(value,0,charC300,0,value.length);
   } 
	public void setCharC300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,charC300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of blankLine300
	 *	@return blankLine300
	 */
   public char[] getBlankLine300() throws CFException{
   		return blankLine300;
   }

  
	/**
	*  set variable blankLine300
	*  Corresponding COBOL Variable is 300-BLANK-LINE
	*  @param value
	**/
   public void setBlankLine300(char[] value) {
       value = checkBlankLine300Constraints(value);
       arraycopy(value,0,blankLine300,0,value.length);
   } 
	public void setBlankLine300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,blankLine300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of asciiSr300
	 *	@return asciiSr300
	 */
   public char[] getAsciiSr300() throws CFException{
   		return asciiSr300;
   }

  
	/**
	*  set variable asciiSr300
	*  Corresponding COBOL Variable is 300-ASCII-SR
	*  @param value
	**/
   public void setAsciiSr300(char[] value) {
       value = checkAsciiSr300Constraints(value);
       arraycopy(value,0,asciiSr300,0,value.length);
   } 
	public void setAsciiSr300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,asciiSr300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalEs300
	 *	@return literalEs300
	 */
   public char[] getLiteralEs300() throws CFException{
   		return literalEs300;
   }

  
	/**
	*  set variable literalEs300
	*  Corresponding COBOL Variable is 300-LITERAL-ES
	*  @param value
	**/
   public void setLiteralEs300(char[] value) {
       value = checkLiteralEs300Constraints(value);
       arraycopy(value,0,literalEs300,0,value.length);
   } 
	public void setLiteralEs300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalEs300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalOe300
	 *	@return literalOe300
	 */
   public char[] getLiteralOe300() throws CFException{
   		return literalOe300;
   }

  
	/**
	*  set variable literalOe300
	*  Corresponding COBOL Variable is 300-LITERAL-OE
	*  @param value
	**/
   public void setLiteralOe300(char[] value) {
       value = checkLiteralOe300Constraints(value);
       arraycopy(value,0,literalOe300,0,value.length);
   } 
	public void setLiteralOe300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalOe300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalSv300
	 *	@return literalSv300
	 */
   public char[] getLiteralSv300() throws CFException{
   		return literalSv300;
   }

  
	/**
	*  set variable literalSv300
	*  Corresponding COBOL Variable is 300-LITERAL-SV
	*  @param value
	**/
   public void setLiteralSv300(char[] value) {
       value = checkLiteralSv300Constraints(value);
       arraycopy(value,0,literalSv300,0,value.length);
   } 
	public void setLiteralSv300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalSv300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalPl300
	 *	@return literalPl300
	 */
   public char[] getLiteralPl300() throws CFException{
   		return literalPl300;
   }

  
	/**
	*  set variable literalPl300
	*  Corresponding COBOL Variable is 300-LITERAL-PL
	*  @param value
	**/
   public void setLiteralPl300(char[] value) {
       value = checkLiteralPl300Constraints(value);
       arraycopy(value,0,literalPl300,0,value.length);
   } 
	public void setLiteralPl300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalPl300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalRe300
	 *	@return literalRe300
	 */
   public char[] getLiteralRe300() throws CFException{
   		return literalRe300;
   }

  
	/**
	*  set variable literalRe300
	*  Corresponding COBOL Variable is 300-LITERAL-RE
	*  @param value
	**/
   public void setLiteralRe300(char[] value) {
       value = checkLiteralRe300Constraints(value);
       arraycopy(value,0,literalRe300,0,value.length);
   } 
	public void setLiteralRe300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalRe300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalRo300
	 *	@return literalRo300
	 */
   public char[] getLiteralRo300() throws CFException{
   		return literalRo300;
   }

  
	/**
	*  set variable literalRo300
	*  Corresponding COBOL Variable is 300-LITERAL-RO
	*  @param value
	**/
   public void setLiteralRo300(char[] value) {
       value = checkLiteralRo300Constraints(value);
       arraycopy(value,0,literalRo300,0,value.length);
   } 
	public void setLiteralRo300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalRo300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalIn300
	 *	@return literalIn300
	 */
   public char[] getLiteralIn300() throws CFException{
   		return literalIn300;
   }

  
	/**
	*  set variable literalIn300
	*  Corresponding COBOL Variable is 300-LITERAL-IN
	*  @param value
	**/
   public void setLiteralIn300(char[] value) {
       value = checkLiteralIn300Constraints(value);
       arraycopy(value,0,literalIn300,0,value.length);
   } 
	public void setLiteralIn300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalIn300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of literalEd300
	 *	@return literalEd300
	 */
   public char[] getLiteralEd300() throws CFException{
   		return literalEd300;
   }

  
	/**
	*  set variable literalEd300
	*  Corresponding COBOL Variable is 300-LITERAL-ED
	*  @param value
	**/
   public void setLiteralEd300(char[] value) {
       value = checkLiteralEd300Constraints(value);
       arraycopy(value,0,literalEd300,0,value.length);
   } 
	public void setLiteralEd300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,literalEd300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currOffset420
	 *	@return currOffset420
	 */
	public short getCurrOffset420() throws CFException {
   		return currOffset420;
	}
	
	/**
	 * 	Update CurrOffset420 with the passed value
	 *  Corresponding COBOL Variable is 420-CURR-OFFSET
	 *	@param number
	 */
	public void setCurrOffset420(short number) {
	     // Truncate if the number is beyond +/- Max range
	    currOffset420 = checkCurrOffset420MaxLimit(number); 
	}

	public void setCurrOffset420(int number) {
	    number = checkCurrOffset420MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCurrOffset420((short)number);
	}
	public void setCurrOffset420(long number) {
	    number = checkCurrOffset420MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCurrOffset420((short)number);
	}
	

	/**
	 *	Returns the value of workLength420
	 *	@return workLength420
	 */
	public short getWorkLength420() throws CFException {
   		return workLength420;
	}
	
	/**
	 * 	Update WorkLength420 with the passed value
	 *  Corresponding COBOL Variable is 420-WORK-LENGTH
	 *	@param number
	 */
	public void setWorkLength420(short number) {
	     // Truncate if the number is beyond +/- Max range
	    workLength420 = checkWorkLength420MaxLimit(number); 
	}

	public void setWorkLength420(int number) {
	    number = checkWorkLength420MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWorkLength420((short)number);
	}
	public void setWorkLength420(long number) {
	    number = checkWorkLength420MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setWorkLength420((short)number);
	}
	

	/**
	 *	Returns the value of sf305120VersionMsg600
	 *	@return sf305120VersionMsg600
	 */
   public char[] getSf305120VersionMsg600() throws CFException{
   		return sf305120VersionMsg600;
   }

  
	/**
	*  set variable sf305120VersionMsg600
	*  Corresponding COBOL Variable is 600-SF305120-VERSION-MSG
	*  @param value
	**/
   public void setSf305120VersionMsg600(char[] value) {
       value = checkSf305120VersionMsg600Constraints(value);
       arraycopy(value,0,sf305120VersionMsg600,0,value.length);
   } 
	public void setSf305120VersionMsg600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,sf305120VersionMsg600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of message0001600
	 *	@return message0001600
	 */
   public char[] getMessage0001600() throws CFException{
   		return message0001600;
   }

  
	/**
	*  set variable message0001600
	*  Corresponding COBOL Variable is 600-MESSAGE-0001
	*  @param value
	**/
   public void setMessage0001600(char[] value) {
       value = checkMessage0001600Constraints(value);
       arraycopy(value,0,message0001600,0,value.length);
   } 
	public void setMessage0001600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,message0001600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currDateYyyy600
	 *	@return currDateYyyy600
	 */
   public char[] getCurrDateYyyy600() throws CFException{
   		return currDateYyyy600;
   }

  
	/**
	*  set variable currDateYyyy600
	*  Corresponding COBOL Variable is 600-CURR-DATE-YYYY
	*  @param value
	**/
   public void setCurrDateYyyy600(char[] value) {
       value = checkCurrDateYyyy600Constraints(value);
       arraycopy(value,0,currDateYyyy600,0,value.length);
   } 
	public void setCurrDateYyyy600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currDateYyyy600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currDateMm600
	 *	@return currDateMm600
	 */
   public char[] getCurrDateMm600() throws CFException{
   		return currDateMm600;
   }

  
	/**
	*  set variable currDateMm600
	*  Corresponding COBOL Variable is 600-CURR-DATE-MM
	*  @param value
	**/
   public void setCurrDateMm600(char[] value) {
       value = checkCurrDateMm600Constraints(value);
       arraycopy(value,0,currDateMm600,0,value.length);
   } 
	public void setCurrDateMm600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currDateMm600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currDateDd600
	 *	@return currDateDd600
	 */
   public char[] getCurrDateDd600() throws CFException{
   		return currDateDd600;
   }

  
	/**
	*  set variable currDateDd600
	*  Corresponding COBOL Variable is 600-CURR-DATE-DD
	*  @param value
	**/
   public void setCurrDateDd600(char[] value) {
       value = checkCurrDateDd600Constraints(value);
       arraycopy(value,0,currDateDd600,0,value.length);
   } 
	public void setCurrDateDd600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currDateDd600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currTimeHh600
	 *	@return currTimeHh600
	 */
   public char[] getCurrTimeHh600() throws CFException{
   		return currTimeHh600;
   }

  
	/**
	*  set variable currTimeHh600
	*  Corresponding COBOL Variable is 600-CURR-TIME-HH
	*  @param value
	**/
   public void setCurrTimeHh600(char[] value) {
       value = checkCurrTimeHh600Constraints(value);
       arraycopy(value,0,currTimeHh600,0,value.length);
   } 
	public void setCurrTimeHh600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currTimeHh600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currTimeMm600
	 *	@return currTimeMm600
	 */
   public char[] getCurrTimeMm600() throws CFException{
   		return currTimeMm600;
   }

  
	/**
	*  set variable currTimeMm600
	*  Corresponding COBOL Variable is 600-CURR-TIME-MM
	*  @param value
	**/
   public void setCurrTimeMm600(char[] value) {
       value = checkCurrTimeMm600Constraints(value);
       arraycopy(value,0,currTimeMm600,0,value.length);
   } 
	public void setCurrTimeMm600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currTimeMm600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of currTimeSs600
	 *	@return currTimeSs600
	 */
   public char[] getCurrTimeSs600() throws CFException{
   		return currTimeSs600;
   }

  
	/**
	*  set variable currTimeSs600
	*  Corresponding COBOL Variable is 600-CURR-TIME-SS
	*  @param value
	**/
   public void setCurrTimeSs600(char[] value) {
       value = checkCurrTimeSs600Constraints(value);
       arraycopy(value,0,currTimeSs600,0,value.length);
   } 
	public void setCurrTimeSs600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,currTimeSs600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of zlogSr2Area803
	 *	@return zlogSr2Area803
	 */
   public char[] getZlogSr2Area803() throws CFException{
   		return zlogSr2Area803;
   }

  
	/**
	*  set variable zlogSr2Area803
	*  Corresponding COBOL Variable is 803-ZLOG-SR2-AREA
	*  @param value
	**/
   public void setZlogSr2Area803(char[] value) {
       value = checkZlogSr2Area803Constraints(value);
       arraycopy(value,0,zlogSr2Area803,0,value.length);
   } 
	public void setZlogSr2Area803(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,zlogSr2Area803,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of rhTotalLnth810
	 *	@return rhTotalLnth810
	 */
	public short getRhTotalLnth810() throws CFException {
   		return rhTotalLnth810;
	}
	
	/**
	 * 	Update RhTotalLnth810 with the passed value
	 *  Corresponding COBOL Variable is 810-RH-TOTAL-LNTH
	 *	@param number
	 */
	public void setRhTotalLnth810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rhTotalLnth810 = checkRhTotalLnth810MaxLimit(number); 
	}

	public void setRhTotalLnth810(int number) {
	    number = checkRhTotalLnth810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhTotalLnth810((short)number);
	}
	public void setRhTotalLnth810(long number) {
	    number = checkRhTotalLnth810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhTotalLnth810((short)number);
	}
	

	/**
	 *	Returns the value of rhLnth1810
	 *	@return rhLnth1810
	 */
	public short getRhLnth1810() throws CFException {
   		return rhLnth1810;
	}
	
	/**
	 * 	Update RhLnth1810 with the passed value
	 *  Corresponding COBOL Variable is 810-RH-LNTH-1
	 *	@param number
	 */
	public void setRhLnth1810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rhLnth1810 = checkRhLnth1810MaxLimit(number); 
	}

	public void setRhLnth1810(int number) {
	    number = checkRhLnth1810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhLnth1810((short)number);
	}
	public void setRhLnth1810(long number) {
	    number = checkRhLnth1810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhLnth1810((short)number);
	}
	

	/**
	 *	Returns the value of rhLnth2810
	 *	@return rhLnth2810
	 */
	public short getRhLnth2810() throws CFException {
   		return rhLnth2810;
	}
	
	/**
	 * 	Update RhLnth2810 with the passed value
	 *  Corresponding COBOL Variable is 810-RH-LNTH-2
	 *	@param number
	 */
	public void setRhLnth2810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rhLnth2810 = checkRhLnth2810MaxLimit(number); 
	}

	public void setRhLnth2810(int number) {
	    number = checkRhLnth2810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhLnth2810((short)number);
	}
	public void setRhLnth2810(long number) {
	    number = checkRhLnth2810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhLnth2810((short)number);
	}
	

	/**
	 *	Returns the value of rhLnth3810
	 *	@return rhLnth3810
	 */
	public short getRhLnth3810() throws CFException {
   		return rhLnth3810;
	}
	
	/**
	 * 	Update RhLnth3810 with the passed value
	 *  Corresponding COBOL Variable is 810-RH-LNTH-3
	 *	@param number
	 */
	public void setRhLnth3810(short number) {
	     // Truncate if the number is beyond +/- Max range
	    rhLnth3810 = checkRhLnth3810MaxLimit(number); 
	}

	public void setRhLnth3810(int number) {
	    number = checkRhLnth3810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhLnth3810((short)number);
	}
	public void setRhLnth3810(long number) {
	    number = checkRhLnth3810MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRhLnth3810((short)number);
	}
	

	/**
	 *	Returns the value of rhWaitTime810
	 *	@return rhWaitTime810
	 */
   public char[] getRhWaitTime810() throws CFException{
   		return rhWaitTime810;
   }

  
	/**
	*  set variable rhWaitTime810
	*  Corresponding COBOL Variable is 810-RH-WAIT-TIME
	*  @param value
	**/
   public void setRhWaitTime810(char[] value) {
       value = checkRhWaitTime810Constraints(value);
       arraycopy(value,0,rhWaitTime810,0,value.length);
   } 
	public void setRhWaitTime810(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,rhWaitTime810,0,beginIndex + endIndex);
   }

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
