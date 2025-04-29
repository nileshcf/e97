package com.cloudframe.app.ip662010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] doesVarSubfExist100 = new char[1];

						private char[] isAMapEntryPending100 = new char[1];

						private char[] readApi300 = new char[8];

						private char[] loadT6T7300 = new char[8];

						private char[] loadT8T9300 = new char[8];

								private short maxBadIpmMsgs300;

						private char[] readParserChop300 = new char[1];

						private char[] writeParserChop300 = new char[1];

						private char[] ipmUpdaterChop300 = new char[1];

						private char[] eofMessage300 = new char[29];

								private short code661300;

								private short badMessageCount400;

								private short pdsTag400;

								private short tagTableLength400;

								private short i400;

								private short j400;

								private short k400;

								private short l400;

								private short m400;

								private short currentSubfld400;

								private short subfldLength400;

								private short pdsLength400;

								private short remainingCarrierLth400;

								private int parsedMsgLngth400;

								private short errEnd400;

								private short errStart400;

								private short errLngth400;

						private char[] errorMessageHeader600 = new char[62];

						private char[] tagTableHeader600 = new char[51];

								private int missingBitMapNdx600;

								private int missingBitMapCode600;

						private char[] missingBitMap600 = new char[22];

								private int nonNumericLngthNdx600;

								private int nonNumericLngthCode600;

						private char[] nonNumericLngth600 = new char[32];

								private int tooManyTagsNdx600;

								private int tooManyTagsCode600;

								private int undefinedPdsNdx600;

								private int undefinedPdsCode600;

								private int noBackslashNdx600;

								private int noBackslashCode600;

						private char[] noBackslash600 = new char[31];

								private int carrierTooShortNdx600;

						private char[] carrierTooShort600 = new char[26];

								private int nonNumericPdsNdx600;

								private int nonNumericPdsCode600;

						private char[] nonNumericPdsId600 = new char[15];

								private int duplicatePdsNdx600;

								private int duplicatePdsCode600;

						private char[] duplicatePds600 = new char[16];

								private int invalidTagTypeNdx600;

								private int invalidTagTypeCode600;

						private char[] invalidTagType600 = new char[16];

								private int badRecLngthNdx600;

								private int badRecLngthCode600;

						private char[] ipmErrorPointerLine600 = Field.fillLowValue(100);

								private short ipmErrorPointerWidth600;

								private char[] displayNumber600 = Field.fillLowValue(5);

						private char[] tagType600 = Field.fillLowValue(1);

								private char[] tagNo600 = Field.fillLowValue(4);

								private char[] tagSubfldNo600 = Field.fillLowValue(4);

								private char[] tagStarts600 = Field.fillLowValue(4);

								private char[] tagLngth600 = Field.fillLowValue(4);

						private char[] tagStatus600 = Field.fillLowValue(1);

						private char[] tagContent600 = Field.fillLowValue(84);

								private short i800;

								private short tableLen800;

								private short maxTagNo800;

								private short maxPdsNo800;

								private short startOfNextElement800;

						private char[] ptrIp739010800 = new char[8];

						private char[] ptrIp741010800 = new char[8];

						private char[] ptrIp661020800 = new char[8];

								private short abendCode900;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setDoesVarSubfExist100(("N").toCharArray());
								setIsAMapEntryPending100(("N").toCharArray());
								setReadApi300(("IP661020").toCharArray());
								setLoadT6T7300(("IP739010").toCharArray());
								setLoadT8T9300(("IP741010").toCharArray());
								setMaxBadIpmMsgs300((short)200);
								setReadParserChop300(("R").toCharArray());
								setWriteParserChop300(("W").toCharArray());
								setIpmUpdaterChop300(("?").toCharArray());
								setEofMessage300(("IP662010-MAIN-END OF IPM FILE").toCharArray());
								setCode661300((short)661);
								setErrorMessageHeader600(pad(62,"IP662010-80000-INVALID IPM MESSAGES ARE SHOWN BELOW.".toCharArray(),' ',RIGHT_PAD));
								setTagTableHeader600(("         TYPE ID  SUBFLD START LNGTH RESRVD CONTENT").toCharArray());
								setMissingBitMapNdx600(1);
								setMissingBitMapCode600(993);
								setMissingBitMap600(("MISSING SECOND BIT-MAP").toCharArray());
								setNonNumericLngthNdx600(5);
								setNonNumericLngthCode600(997);
								setNonNumericLngth600(("NON-NUMERIC OR ZERO LENGTH FIELD").toCharArray());
								setTooManyTagsNdx600(6);
								setTooManyTagsCode600(990);
								setUndefinedPdsNdx600(7);
								setUndefinedPdsCode600(991);
								setNoBackslashNdx600(8);
								setNoBackslashCode600(992);
								setNoBackslash600(("SUBFIELD NOT DELIMITED WITH \"\\\"").toCharArray());
								setCarrierTooShortNdx600(9);
								setCarrierTooShort600(("CARRIER LENGTH LESS THAN 8").toCharArray());
								setNonNumericPdsNdx600(2);
								setNonNumericPdsCode600(994);
								setNonNumericPdsId600(("NON-NUMERIC PDS").toCharArray());
								setDuplicatePdsNdx600(3);
								setDuplicatePdsCode600(987);
								setDuplicatePds600(("DUPLICATE PDS ID").toCharArray());
								setInvalidTagTypeNdx600(4);
								setInvalidTagTypeCode600(996);
								setInvalidTagType600(("INVALID TAG TYPE").toCharArray());
								setBadRecLngthNdx600(10);
								setBadRecLngthCode600(2256);
								setPtrIp739010800(("IP739010").toCharArray());
								setPtrIp741010800(("IP741010").toCharArray());
								setPtrIp661020800(("IP661020").toCharArray());
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
	char[] itIsTheFirstTime8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsTheFirstTime88()
	 *	@return  Returns true if isItIsTheFirstTime88() is "Y"
	 */
   public boolean isItIsTheFirstTime88() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsTheFirstTime8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88True() {  			
    	setIsItTheFirstTime100( itIsTheFirstTime8888Value);
   	}
	/**
	 *	Returns the value of doesVarSubfExist100
	 *	@return doesVarSubfExist100
	 */
   public char[] getDoesVarSubfExist100() throws CFException{
   		return doesVarSubfExist100;
   }

  
	/**
	*  set variable doesVarSubfExist100
	*  Corresponding COBOL Variable is 100-DOES-VAR-SUBF-EXIST
	*  @param value
	**/
   public void setDoesVarSubfExist100(char[] value) {
       value = checkDoesVarSubfExist100Constraints(value);
       arraycopy(value,0,doesVarSubfExist100,0,value.length);
   } 
	public void setDoesVarSubfExist100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,doesVarSubfExist100,0,beginIndex + endIndex);
   }
	char[] varSubfExists8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isVarSubfExists88100()
	 *	@return  Returns true if isVarSubfExists88100() is "Y"
	 */
   public boolean isVarSubfExists88100() throws CFException {
      return (  compareChars( getDoesVarSubfExist100() , varSubfExists8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setVarSubfExists88100True() {  			
    	setDoesVarSubfExist100( varSubfExists8810088Value);
   	}
	/**
	 *	Returns the value of isAMapEntryPending100
	 *	@return isAMapEntryPending100
	 */
   public char[] getIsAMapEntryPending100() throws CFException{
   		return isAMapEntryPending100;
   }

  
	/**
	*  set variable isAMapEntryPending100
	*  Corresponding COBOL Variable is 100-IS-A-MAP-ENTRY-PENDING
	*  @param value
	**/
   public void setIsAMapEntryPending100(char[] value) {
       value = checkIsAMapEntryPending100Constraints(value);
       arraycopy(value,0,isAMapEntryPending100,0,value.length);
   } 
	public void setIsAMapEntryPending100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isAMapEntryPending100,0,beginIndex + endIndex);
   }
	char[] mapEntryPending8810088Value1 = "D".toCharArray();
char[] mapEntryPending8810088Value2 = "P".toCharArray();

	/**
	 *	Test condition "D" "P" for isMapEntryPending88100()
	 *	@return  Returns true if isMapEntryPending88100() is "D" "P"
	 */
   public boolean isMapEntryPending88100() throws CFException {
      return (  compareChars( getIsAMapEntryPending100() , mapEntryPending8810088Value1)  == 0  ||  compareChars( getIsAMapEntryPending100() , mapEntryPending8810088Value2)  == 0  );
   }


	/**
	*  set values "D" "P"
	*/
   	public void setMapEntryPending88100True() {  			
    	setIsAMapEntryPending100( mapEntryPending8810088Value1);
   	}
	char[] pdsEntryPending8810088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isPdsEntryPending88100()
	 *	@return  Returns true if isPdsEntryPending88100() is "P"
	 */
   public boolean isPdsEntryPending88100() throws CFException {
      return (  compareChars( getIsAMapEntryPending100() , pdsEntryPending8810088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setPdsEntryPending88100True() {  			
    	setIsAMapEntryPending100( pdsEntryPending8810088Value);
   	}
	char[] deEntryPending8810088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isDeEntryPending88100()
	 *	@return  Returns true if isDeEntryPending88100() is "D"
	 */
   public boolean isDeEntryPending88100() throws CFException {
      return (  compareChars( getIsAMapEntryPending100() , deEntryPending8810088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setDeEntryPending88100True() {  			
    	setIsAMapEntryPending100( deEntryPending8810088Value);
   	}
	char[] noMapEntryPending8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isNoMapEntryPending88100()
	 *	@return  Returns true if isNoMapEntryPending88100() is "N"
	 */
   public boolean isNoMapEntryPending88100() throws CFException {
      return (  compareChars( getIsAMapEntryPending100() , noMapEntryPending8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setNoMapEntryPending88100True() {  			
    	setIsAMapEntryPending100( noMapEntryPending8810088Value);
   	}
	/**
	 *	Returns the value of readApi300
	 *	@return readApi300
	 */
   public char[] getReadApi300() throws CFException{
   		return readApi300;
   }

  
	/**
	*  set variable readApi300
	*  Corresponding COBOL Variable is 300-READ-API
	*  @param value
	**/
   public void setReadApi300(char[] value) {
       value = checkReadApi300Constraints(value);
       arraycopy(value,0,readApi300,0,value.length);
   } 
	public void setReadApi300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,readApi300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of loadT6T7300
	 *	@return loadT6T7300
	 */
   public char[] getLoadT6T7300() throws CFException{
   		return loadT6T7300;
   }

  
	/**
	*  set variable loadT6T7300
	*  Corresponding COBOL Variable is 300-LOAD-T6-T7
	*  @param value
	**/
   public void setLoadT6T7300(char[] value) {
       value = checkLoadT6T7300Constraints(value);
       arraycopy(value,0,loadT6T7300,0,value.length);
   } 
	public void setLoadT6T7300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,loadT6T7300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of loadT8T9300
	 *	@return loadT8T9300
	 */
   public char[] getLoadT8T9300() throws CFException{
   		return loadT8T9300;
   }

  
	/**
	*  set variable loadT8T9300
	*  Corresponding COBOL Variable is 300-LOAD-T8-T9
	*  @param value
	**/
   public void setLoadT8T9300(char[] value) {
       value = checkLoadT8T9300Constraints(value);
       arraycopy(value,0,loadT8T9300,0,value.length);
   } 
	public void setLoadT8T9300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,loadT8T9300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public short getMaxBadIpmMsgs300() throws CFException {
       if (isMaxBadIpmMsgs300Modified()) { 
           maxBadIpmMsgs300 = refreshMaxBadIpmMsgs300();
        }
   		return maxBadIpmMsgs300;
	}
	

    /**
	 *	Returns the String value of maxBadIpmMsgs300
	 *	@return maxBadIpmMsgs300
	 */
	public char[]  getMaxBadIpmMsgs300ActualString() {
	    String value = String.valueOf(maxBadIpmMsgs300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value
	 *  Corresponding COBOL Variable is 300-MAX-BAD-IPM-MSGS
	 *	@param number
	 */
	public void setMaxBadIpmMsgs300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxBadIpmMsgs300 = checkMaxBadIpmMsgs300MaxLimit(number); 
		serializeMaxBadIpmMsgs300(maxBadIpmMsgs300);
	}
	
	public void setMaxBadIpmMsgs300(int number) {
	    number = checkMaxBadIpmMsgs300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxBadIpmMsgs300((short)number);
	}
	public void setMaxBadIpmMsgs300(long number) {
	    number = checkMaxBadIpmMsgs300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxBadIpmMsgs300((short)number);
	}
	

	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxBadIpmMsgs300(char[] value) throws CFException {
		 maxBadIpmMsgs300 = serializeMaxBadIpmMsgs300(value);
	}
	/**
	 * 	Update MaxBadIpmMsgs300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxBadIpmMsgs300String(char[] value) throws CFException {
		 setMaxBadIpmMsgs300(value);
	}
	/**
	 *	Returns the value of readParserChop300
	 *	@return readParserChop300
	 */
   public char[] getReadParserChop300() throws CFException{
   		return readParserChop300;
   }

  
	/**
	*  set variable readParserChop300
	*  Corresponding COBOL Variable is 300-READ-PARSER-CHOP
	*  @param value
	**/
   public void setReadParserChop300(char[] value) {
       value = checkReadParserChop300Constraints(value);
       arraycopy(value,0,readParserChop300,0,value.length);
   } 
	public void setReadParserChop300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,readParserChop300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of writeParserChop300
	 *	@return writeParserChop300
	 */
   public char[] getWriteParserChop300() throws CFException{
   		return writeParserChop300;
   }

  
	/**
	*  set variable writeParserChop300
	*  Corresponding COBOL Variable is 300-WRITE-PARSER-CHOP
	*  @param value
	**/
   public void setWriteParserChop300(char[] value) {
       value = checkWriteParserChop300Constraints(value);
       arraycopy(value,0,writeParserChop300,0,value.length);
   } 
	public void setWriteParserChop300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,writeParserChop300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ipmUpdaterChop300
	 *	@return ipmUpdaterChop300
	 */
   public char[] getIpmUpdaterChop300() throws CFException{
   		return ipmUpdaterChop300;
   }

  
	/**
	*  set variable ipmUpdaterChop300
	*  Corresponding COBOL Variable is 300-IPM-UPDATER-CHOP
	*  @param value
	**/
   public void setIpmUpdaterChop300(char[] value) {
       value = checkIpmUpdaterChop300Constraints(value);
       arraycopy(value,0,ipmUpdaterChop300,0,value.length);
   } 
	public void setIpmUpdaterChop300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ipmUpdaterChop300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of eofMessage300
	 *	@return eofMessage300
	 */
   public char[] getEofMessage300() throws CFException{
   		return eofMessage300;
   }

  
	/**
	*  set variable eofMessage300
	*  Corresponding COBOL Variable is 300-EOF-MESSAGE
	*  @param value
	**/
   public void setEofMessage300(char[] value) {
       value = checkEofMessage300Constraints(value);
       arraycopy(value,0,eofMessage300,0,value.length);
   } 
	public void setEofMessage300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofMessage300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of code661300
	 *	@return code661300
	 */
	public short getCode661300() throws CFException {
   		return code661300;
	}
	
	/**
	 * 	Update Code661300 with the passed value
	 *  Corresponding COBOL Variable is 300-CODE-661
	 *	@param number
	 */
	public void setCode661300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    code661300 = checkCode661300MaxLimit(number); 
	}

	public void setCode661300(int number) {
	    number = checkCode661300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCode661300((short)number);
	}
	public void setCode661300(long number) {
	    number = checkCode661300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCode661300((short)number);
	}
	

	/**
	 *	Returns the value of badMessageCount400
	 *	@return badMessageCount400
	 */
	public short getBadMessageCount400() throws CFException {
   		return badMessageCount400;
	}
	
	/**
	 * 	Update BadMessageCount400 with the passed value
	 *  Corresponding COBOL Variable is 400-BAD-MESSAGE-COUNT
	 *	@param number
	 */
	public void setBadMessageCount400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    badMessageCount400 = checkBadMessageCount400MaxLimit(number); 
	}

	public void setBadMessageCount400(int number) {
	    number = checkBadMessageCount400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBadMessageCount400((short)number);
	}
	public void setBadMessageCount400(long number) {
	    number = checkBadMessageCount400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setBadMessageCount400((short)number);
	}
	

	/**
	 *	Returns the value of pdsTag400
	 *	@return pdsTag400
	 */
	public short getPdsTag400() throws CFException {
   		return pdsTag400;
	}
	
	/**
	 * 	Update PdsTag400 with the passed value
	 *  Corresponding COBOL Variable is 400-PDS-TAG
	 *	@param number
	 */
	public void setPdsTag400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pdsTag400 = checkPdsTag400MaxLimit(number); 
	}

	public void setPdsTag400(int number) {
	    number = checkPdsTag400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPdsTag400((short)number);
	}
	public void setPdsTag400(long number) {
	    number = checkPdsTag400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPdsTag400((short)number);
	}
	

	/**
	 *	Returns the value of tagTableLength400
	 *	@return tagTableLength400
	 */
	public short getTagTableLength400() throws CFException {
   		return tagTableLength400;
	}
	
	/**
	 * 	Update TagTableLength400 with the passed value
	 *  Corresponding COBOL Variable is 400-TAG-TABLE-LENGTH
	 *	@param number
	 */
	public void setTagTableLength400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tagTableLength400 = checkTagTableLength400MaxLimit(number); 
	}

	public void setTagTableLength400(int number) {
	    number = checkTagTableLength400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTagTableLength400((short)number);
	}
	public void setTagTableLength400(long number) {
	    number = checkTagTableLength400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTagTableLength400((short)number);
	}
	

	/**
	 *	Returns the value of i400
	 *	@return i400
	 */
	public short getI400() throws CFException {
   		return i400;
	}
	
	/**
	 * 	Update I400 with the passed value
	 *  Corresponding COBOL Variable is 400-I
	 *	@param number
	 */
	public void setI400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i400 = checkI400MaxLimit(number); 
	}

	public void setI400(int number) {
	    number = checkI400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI400((short)number);
	}
	public void setI400(long number) {
	    number = checkI400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI400((short)number);
	}
	

	/**
	 *	Returns the value of j400
	 *	@return j400
	 */
	public short getJ400() throws CFException {
   		return j400;
	}
	
	/**
	 * 	Update J400 with the passed value
	 *  Corresponding COBOL Variable is 400-J
	 *	@param number
	 */
	public void setJ400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    j400 = checkJ400MaxLimit(number); 
	}

	public void setJ400(int number) {
	    number = checkJ400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setJ400((short)number);
	}
	public void setJ400(long number) {
	    number = checkJ400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setJ400((short)number);
	}
	

	/**
	 *	Returns the value of k400
	 *	@return k400
	 */
	public short getK400() throws CFException {
   		return k400;
	}
	
	/**
	 * 	Update K400 with the passed value
	 *  Corresponding COBOL Variable is 400-K
	 *	@param number
	 */
	public void setK400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    k400 = checkK400MaxLimit(number); 
	}

	public void setK400(int number) {
	    number = checkK400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setK400((short)number);
	}
	public void setK400(long number) {
	    number = checkK400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setK400((short)number);
	}
	

	/**
	 *	Returns the value of l400
	 *	@return l400
	 */
	public short getL400() throws CFException {
   		return l400;
	}
	
	/**
	 * 	Update L400 with the passed value
	 *  Corresponding COBOL Variable is 400-L
	 *	@param number
	 */
	public void setL400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    l400 = checkL400MaxLimit(number); 
	}

	public void setL400(int number) {
	    number = checkL400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setL400((short)number);
	}
	public void setL400(long number) {
	    number = checkL400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setL400((short)number);
	}
	

	/**
	 *	Returns the value of m400
	 *	@return m400
	 */
	public short getM400() throws CFException {
   		return m400;
	}
	
	/**
	 * 	Update M400 with the passed value
	 *  Corresponding COBOL Variable is 400-M
	 *	@param number
	 */
	public void setM400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    m400 = checkM400MaxLimit(number); 
	}

	public void setM400(int number) {
	    number = checkM400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setM400((short)number);
	}
	public void setM400(long number) {
	    number = checkM400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setM400((short)number);
	}
	

	/**
	 *	Returns the value of currentSubfld400
	 *	@return currentSubfld400
	 */
	public short getCurrentSubfld400() throws CFException {
   		return currentSubfld400;
	}
	
	/**
	 * 	Update CurrentSubfld400 with the passed value
	 *  Corresponding COBOL Variable is 400-CURRENT-SUBFLD
	 *	@param number
	 */
	public void setCurrentSubfld400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    currentSubfld400 = checkCurrentSubfld400MaxLimit(number); 
	}

	public void setCurrentSubfld400(int number) {
	    number = checkCurrentSubfld400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCurrentSubfld400((short)number);
	}
	public void setCurrentSubfld400(long number) {
	    number = checkCurrentSubfld400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCurrentSubfld400((short)number);
	}
	

	/**
	 *	Returns the value of subfldLength400
	 *	@return subfldLength400
	 */
	public short getSubfldLength400() throws CFException {
   		return subfldLength400;
	}
	
	/**
	 * 	Update SubfldLength400 with the passed value
	 *  Corresponding COBOL Variable is 400-SUBFLD-LENGTH
	 *	@param number
	 */
	public void setSubfldLength400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    subfldLength400 = checkSubfldLength400MaxLimit(number); 
	}

	public void setSubfldLength400(int number) {
	    number = checkSubfldLength400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSubfldLength400((short)number);
	}
	public void setSubfldLength400(long number) {
	    number = checkSubfldLength400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setSubfldLength400((short)number);
	}
	

	/**
	 *	Returns the value of pdsLength400
	 *	@return pdsLength400
	 */
	public short getPdsLength400() throws CFException {
   		return pdsLength400;
	}
	
	/**
	 * 	Update PdsLength400 with the passed value
	 *  Corresponding COBOL Variable is 400-PDS-LENGTH
	 *	@param number
	 */
	public void setPdsLength400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    pdsLength400 = checkPdsLength400MaxLimit(number); 
	}

	public void setPdsLength400(int number) {
	    number = checkPdsLength400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPdsLength400((short)number);
	}
	public void setPdsLength400(long number) {
	    number = checkPdsLength400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setPdsLength400((short)number);
	}
	

	/**
	 *	Returns the value of remainingCarrierLth400
	 *	@return remainingCarrierLth400
	 */
	public short getRemainingCarrierLth400() throws CFException {
   		return remainingCarrierLth400;
	}
	
	/**
	 * 	Update RemainingCarrierLth400 with the passed value
	 *  Corresponding COBOL Variable is 400-REMAINING-CARRIER-LTH
	 *	@param number
	 */
	public void setRemainingCarrierLth400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    remainingCarrierLth400 = checkRemainingCarrierLth400MaxLimit(number); 
	}

	public void setRemainingCarrierLth400(int number) {
	    number = checkRemainingCarrierLth400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRemainingCarrierLth400((short)number);
	}
	public void setRemainingCarrierLth400(long number) {
	    number = checkRemainingCarrierLth400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setRemainingCarrierLth400((short)number);
	}
	

	/**
	 *	Returns the value of parsedMsgLngth400
	 *	@return parsedMsgLngth400
	 */
	public int getParsedMsgLngth400() throws CFException {
   		return parsedMsgLngth400;
	}
	
	/**
	 * 	Update ParsedMsgLngth400 with the passed value
	 *  Corresponding COBOL Variable is 400-PARSED-MSG-LNGTH
	 *	@param number
	 */
	public void setParsedMsgLngth400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    parsedMsgLngth400 = checkParsedMsgLngth400MaxLimit(number); 
	}


	public void setParsedMsgLngth400(long number) {
	    number = checkParsedMsgLngth400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setParsedMsgLngth400((int)number);
	}
	
	/**
	 *	Returns the value of errEnd400
	 *	@return errEnd400
	 */
	public short getErrEnd400() throws CFException {
   		return errEnd400;
	}
	
	/**
	 * 	Update ErrEnd400 with the passed value
	 *  Corresponding COBOL Variable is 400-ERR-END
	 *	@param number
	 */
	public void setErrEnd400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    errEnd400 = checkErrEnd400MaxLimit(number); 
	}

	public void setErrEnd400(int number) {
	    number = checkErrEnd400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrEnd400((short)number);
	}
	public void setErrEnd400(long number) {
	    number = checkErrEnd400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrEnd400((short)number);
	}
	

	/**
	 *	Returns the value of errStart400
	 *	@return errStart400
	 */
	public short getErrStart400() throws CFException {
   		return errStart400;
	}
	
	/**
	 * 	Update ErrStart400 with the passed value
	 *  Corresponding COBOL Variable is 400-ERR-START
	 *	@param number
	 */
	public void setErrStart400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    errStart400 = checkErrStart400MaxLimit(number); 
	}

	public void setErrStart400(int number) {
	    number = checkErrStart400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrStart400((short)number);
	}
	public void setErrStart400(long number) {
	    number = checkErrStart400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrStart400((short)number);
	}
	

	/**
	 *	Returns the value of errLngth400
	 *	@return errLngth400
	 */
	public short getErrLngth400() throws CFException {
   		return errLngth400;
	}
	
	/**
	 * 	Update ErrLngth400 with the passed value
	 *  Corresponding COBOL Variable is 400-ERR-LNGTH
	 *	@param number
	 */
	public void setErrLngth400(short number) {
	     // Truncate if the number is beyond +/- Max range
	    errLngth400 = checkErrLngth400MaxLimit(number); 
	}

	public void setErrLngth400(int number) {
	    number = checkErrLngth400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrLngth400((short)number);
	}
	public void setErrLngth400(long number) {
	    number = checkErrLngth400MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setErrLngth400((short)number);
	}
	

	/**
	 *	Returns the value of errorMessageHeader600
	 *	@return errorMessageHeader600
	 */
   public char[] getErrorMessageHeader600() throws CFException{
   		return errorMessageHeader600;
   }

  
	/**
	*  set variable errorMessageHeader600
	*  Corresponding COBOL Variable is 600-ERROR-MESSAGE-HEADER
	*  @param value
	**/
   public void setErrorMessageHeader600(char[] value) {
       value = checkErrorMessageHeader600Constraints(value);
       arraycopy(value,0,errorMessageHeader600,0,value.length);
   } 
	public void setErrorMessageHeader600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,errorMessageHeader600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tagTableHeader600
	 *	@return tagTableHeader600
	 */
   public char[] getTagTableHeader600() throws CFException{
   		return tagTableHeader600;
   }

  
	/**
	*  set variable tagTableHeader600
	*  Corresponding COBOL Variable is 600-TAG-TABLE-HEADER
	*  @param value
	**/
   public void setTagTableHeader600(char[] value) {
       value = checkTagTableHeader600Constraints(value);
       arraycopy(value,0,tagTableHeader600,0,value.length);
   } 
	public void setTagTableHeader600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tagTableHeader600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of missingBitMapNdx600
	 *	@return missingBitMapNdx600
	 */
	public int getMissingBitMapNdx600() throws CFException {
   		return missingBitMapNdx600;
	}
	
	/**
	 * 	Update MissingBitMapNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-MISSING-BIT-MAP-NDX
	 *	@param number
	 */
	public void setMissingBitMapNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    missingBitMapNdx600 = checkMissingBitMapNdx600MaxLimit(number); 
	}


	public void setMissingBitMapNdx600(long number) {
	    number = checkMissingBitMapNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMissingBitMapNdx600((int)number);
	}
	
	/**
	 *	Returns the value of missingBitMapCode600
	 *	@return missingBitMapCode600
	 */
	public int getMissingBitMapCode600() throws CFException {
   		return missingBitMapCode600;
	}
	
	/**
	 * 	Update MissingBitMapCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-MISSING-BIT-MAP-CODE
	 *	@param number
	 */
	public void setMissingBitMapCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    missingBitMapCode600 = checkMissingBitMapCode600MaxLimit(number); 
	}


	public void setMissingBitMapCode600(long number) {
	    number = checkMissingBitMapCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMissingBitMapCode600((int)number);
	}
	
	/**
	 *	Returns the value of missingBitMap600
	 *	@return missingBitMap600
	 */
   public char[] getMissingBitMap600() throws CFException{
   		return missingBitMap600;
   }

  
	/**
	*  set variable missingBitMap600
	*  Corresponding COBOL Variable is 600-MISSING-BIT-MAP
	*  @param value
	**/
   public void setMissingBitMap600(char[] value) {
       value = checkMissingBitMap600Constraints(value);
       arraycopy(value,0,missingBitMap600,0,value.length);
   } 
	public void setMissingBitMap600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,missingBitMap600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of nonNumericLngthNdx600
	 *	@return nonNumericLngthNdx600
	 */
	public int getNonNumericLngthNdx600() throws CFException {
   		return nonNumericLngthNdx600;
	}
	
	/**
	 * 	Update NonNumericLngthNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-NON-NUMERIC-LNGTH-NDX
	 *	@param number
	 */
	public void setNonNumericLngthNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nonNumericLngthNdx600 = checkNonNumericLngthNdx600MaxLimit(number); 
	}


	public void setNonNumericLngthNdx600(long number) {
	    number = checkNonNumericLngthNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNonNumericLngthNdx600((int)number);
	}
	
	/**
	 *	Returns the value of nonNumericLngthCode600
	 *	@return nonNumericLngthCode600
	 */
	public int getNonNumericLngthCode600() throws CFException {
   		return nonNumericLngthCode600;
	}
	
	/**
	 * 	Update NonNumericLngthCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-NON-NUMERIC-LNGTH-CODE
	 *	@param number
	 */
	public void setNonNumericLngthCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nonNumericLngthCode600 = checkNonNumericLngthCode600MaxLimit(number); 
	}


	public void setNonNumericLngthCode600(long number) {
	    number = checkNonNumericLngthCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNonNumericLngthCode600((int)number);
	}
	
	/**
	 *	Returns the value of nonNumericLngth600
	 *	@return nonNumericLngth600
	 */
   public char[] getNonNumericLngth600() throws CFException{
   		return nonNumericLngth600;
   }

  
	/**
	*  set variable nonNumericLngth600
	*  Corresponding COBOL Variable is 600-NON-NUMERIC-LNGTH
	*  @param value
	**/
   public void setNonNumericLngth600(char[] value) {
       value = checkNonNumericLngth600Constraints(value);
       arraycopy(value,0,nonNumericLngth600,0,value.length);
   } 
	public void setNonNumericLngth600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,nonNumericLngth600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tooManyTagsNdx600
	 *	@return tooManyTagsNdx600
	 */
	public int getTooManyTagsNdx600() throws CFException {
   		return tooManyTagsNdx600;
	}
	
	/**
	 * 	Update TooManyTagsNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-TOO-MANY-TAGS-NDX
	 *	@param number
	 */
	public void setTooManyTagsNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tooManyTagsNdx600 = checkTooManyTagsNdx600MaxLimit(number); 
	}


	public void setTooManyTagsNdx600(long number) {
	    number = checkTooManyTagsNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTooManyTagsNdx600((int)number);
	}
	
	/**
	 *	Returns the value of tooManyTagsCode600
	 *	@return tooManyTagsCode600
	 */
	public int getTooManyTagsCode600() throws CFException {
   		return tooManyTagsCode600;
	}
	
	/**
	 * 	Update TooManyTagsCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-TOO-MANY-TAGS-CODE
	 *	@param number
	 */
	public void setTooManyTagsCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    tooManyTagsCode600 = checkTooManyTagsCode600MaxLimit(number); 
	}


	public void setTooManyTagsCode600(long number) {
	    number = checkTooManyTagsCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setTooManyTagsCode600((int)number);
	}
	
	/**
	 *	Returns the value of undefinedPdsNdx600
	 *	@return undefinedPdsNdx600
	 */
	public int getUndefinedPdsNdx600() throws CFException {
   		return undefinedPdsNdx600;
	}
	
	/**
	 * 	Update UndefinedPdsNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-UNDEFINED-PDS-NDX
	 *	@param number
	 */
	public void setUndefinedPdsNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    undefinedPdsNdx600 = checkUndefinedPdsNdx600MaxLimit(number); 
	}


	public void setUndefinedPdsNdx600(long number) {
	    number = checkUndefinedPdsNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUndefinedPdsNdx600((int)number);
	}
	
	/**
	 *	Returns the value of undefinedPdsCode600
	 *	@return undefinedPdsCode600
	 */
	public int getUndefinedPdsCode600() throws CFException {
   		return undefinedPdsCode600;
	}
	
	/**
	 * 	Update UndefinedPdsCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-UNDEFINED-PDS-CODE
	 *	@param number
	 */
	public void setUndefinedPdsCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    undefinedPdsCode600 = checkUndefinedPdsCode600MaxLimit(number); 
	}


	public void setUndefinedPdsCode600(long number) {
	    number = checkUndefinedPdsCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setUndefinedPdsCode600((int)number);
	}
	
	/**
	 *	Returns the value of noBackslashNdx600
	 *	@return noBackslashNdx600
	 */
	public int getNoBackslashNdx600() throws CFException {
   		return noBackslashNdx600;
	}
	
	/**
	 * 	Update NoBackslashNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-NO-BACKSLASH-NDX
	 *	@param number
	 */
	public void setNoBackslashNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    noBackslashNdx600 = checkNoBackslashNdx600MaxLimit(number); 
	}


	public void setNoBackslashNdx600(long number) {
	    number = checkNoBackslashNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNoBackslashNdx600((int)number);
	}
	
	/**
	 *	Returns the value of noBackslashCode600
	 *	@return noBackslashCode600
	 */
	public int getNoBackslashCode600() throws CFException {
   		return noBackslashCode600;
	}
	
	/**
	 * 	Update NoBackslashCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-NO-BACKSLASH-CODE
	 *	@param number
	 */
	public void setNoBackslashCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    noBackslashCode600 = checkNoBackslashCode600MaxLimit(number); 
	}


	public void setNoBackslashCode600(long number) {
	    number = checkNoBackslashCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNoBackslashCode600((int)number);
	}
	
	/**
	 *	Returns the value of noBackslash600
	 *	@return noBackslash600
	 */
   public char[] getNoBackslash600() throws CFException{
   		return noBackslash600;
   }

  
	/**
	*  set variable noBackslash600
	*  Corresponding COBOL Variable is 600-NO-BACKSLASH
	*  @param value
	**/
   public void setNoBackslash600(char[] value) {
       value = checkNoBackslash600Constraints(value);
       arraycopy(value,0,noBackslash600,0,value.length);
   } 
	public void setNoBackslash600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,noBackslash600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of carrierTooShortNdx600
	 *	@return carrierTooShortNdx600
	 */
	public int getCarrierTooShortNdx600() throws CFException {
   		return carrierTooShortNdx600;
	}
	
	/**
	 * 	Update CarrierTooShortNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-CARRIER-TOO-SHORT-NDX
	 *	@param number
	 */
	public void setCarrierTooShortNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    carrierTooShortNdx600 = checkCarrierTooShortNdx600MaxLimit(number); 
	}


	public void setCarrierTooShortNdx600(long number) {
	    number = checkCarrierTooShortNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setCarrierTooShortNdx600((int)number);
	}
	
	/**
	 *	Returns the value of carrierTooShort600
	 *	@return carrierTooShort600
	 */
   public char[] getCarrierTooShort600() throws CFException{
   		return carrierTooShort600;
   }

  
	/**
	*  set variable carrierTooShort600
	*  Corresponding COBOL Variable is 600-CARRIER-TOO-SHORT
	*  @param value
	**/
   public void setCarrierTooShort600(char[] value) {
       value = checkCarrierTooShort600Constraints(value);
       arraycopy(value,0,carrierTooShort600,0,value.length);
   } 
	public void setCarrierTooShort600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,carrierTooShort600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of nonNumericPdsNdx600
	 *	@return nonNumericPdsNdx600
	 */
	public int getNonNumericPdsNdx600() throws CFException {
   		return nonNumericPdsNdx600;
	}
	
	/**
	 * 	Update NonNumericPdsNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-NON-NUMERIC-PDS-NDX
	 *	@param number
	 */
	public void setNonNumericPdsNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nonNumericPdsNdx600 = checkNonNumericPdsNdx600MaxLimit(number); 
	}


	public void setNonNumericPdsNdx600(long number) {
	    number = checkNonNumericPdsNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNonNumericPdsNdx600((int)number);
	}
	
	/**
	 *	Returns the value of nonNumericPdsCode600
	 *	@return nonNumericPdsCode600
	 */
	public int getNonNumericPdsCode600() throws CFException {
   		return nonNumericPdsCode600;
	}
	
	/**
	 * 	Update NonNumericPdsCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-NON-NUMERIC-PDS-CODE
	 *	@param number
	 */
	public void setNonNumericPdsCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    nonNumericPdsCode600 = checkNonNumericPdsCode600MaxLimit(number); 
	}


	public void setNonNumericPdsCode600(long number) {
	    number = checkNonNumericPdsCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setNonNumericPdsCode600((int)number);
	}
	
	/**
	 *	Returns the value of nonNumericPdsId600
	 *	@return nonNumericPdsId600
	 */
   public char[] getNonNumericPdsId600() throws CFException{
   		return nonNumericPdsId600;
   }

  
	/**
	*  set variable nonNumericPdsId600
	*  Corresponding COBOL Variable is 600-NON-NUMERIC-PDS-ID
	*  @param value
	**/
   public void setNonNumericPdsId600(char[] value) {
       value = checkNonNumericPdsId600Constraints(value);
       arraycopy(value,0,nonNumericPdsId600,0,value.length);
   } 
	public void setNonNumericPdsId600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,nonNumericPdsId600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of duplicatePdsNdx600
	 *	@return duplicatePdsNdx600
	 */
	public int getDuplicatePdsNdx600() throws CFException {
   		return duplicatePdsNdx600;
	}
	
	/**
	 * 	Update DuplicatePdsNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-DUPLICATE-PDS-NDX
	 *	@param number
	 */
	public void setDuplicatePdsNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    duplicatePdsNdx600 = checkDuplicatePdsNdx600MaxLimit(number); 
	}


	public void setDuplicatePdsNdx600(long number) {
	    number = checkDuplicatePdsNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDuplicatePdsNdx600((int)number);
	}
	
	/**
	 *	Returns the value of duplicatePdsCode600
	 *	@return duplicatePdsCode600
	 */
	public int getDuplicatePdsCode600() throws CFException {
   		return duplicatePdsCode600;
	}
	
	/**
	 * 	Update DuplicatePdsCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-DUPLICATE-PDS-CODE
	 *	@param number
	 */
	public void setDuplicatePdsCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    duplicatePdsCode600 = checkDuplicatePdsCode600MaxLimit(number); 
	}


	public void setDuplicatePdsCode600(long number) {
	    number = checkDuplicatePdsCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDuplicatePdsCode600((int)number);
	}
	
	/**
	 *	Returns the value of duplicatePds600
	 *	@return duplicatePds600
	 */
   public char[] getDuplicatePds600() throws CFException{
   		return duplicatePds600;
   }

  
	/**
	*  set variable duplicatePds600
	*  Corresponding COBOL Variable is 600-DUPLICATE-PDS
	*  @param value
	**/
   public void setDuplicatePds600(char[] value) {
       value = checkDuplicatePds600Constraints(value);
       arraycopy(value,0,duplicatePds600,0,value.length);
   } 
	public void setDuplicatePds600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,duplicatePds600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of invalidTagTypeNdx600
	 *	@return invalidTagTypeNdx600
	 */
	public int getInvalidTagTypeNdx600() throws CFException {
   		return invalidTagTypeNdx600;
	}
	
	/**
	 * 	Update InvalidTagTypeNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-INVALID-TAG-TYPE-NDX
	 *	@param number
	 */
	public void setInvalidTagTypeNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    invalidTagTypeNdx600 = checkInvalidTagTypeNdx600MaxLimit(number); 
	}


	public void setInvalidTagTypeNdx600(long number) {
	    number = checkInvalidTagTypeNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInvalidTagTypeNdx600((int)number);
	}
	
	/**
	 *	Returns the value of invalidTagTypeCode600
	 *	@return invalidTagTypeCode600
	 */
	public int getInvalidTagTypeCode600() throws CFException {
   		return invalidTagTypeCode600;
	}
	
	/**
	 * 	Update InvalidTagTypeCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-INVALID-TAG-TYPE-CODE
	 *	@param number
	 */
	public void setInvalidTagTypeCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    invalidTagTypeCode600 = checkInvalidTagTypeCode600MaxLimit(number); 
	}


	public void setInvalidTagTypeCode600(long number) {
	    number = checkInvalidTagTypeCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setInvalidTagTypeCode600((int)number);
	}
	
	/**
	 *	Returns the value of invalidTagType600
	 *	@return invalidTagType600
	 */
   public char[] getInvalidTagType600() throws CFException{
   		return invalidTagType600;
   }

  
	/**
	*  set variable invalidTagType600
	*  Corresponding COBOL Variable is 600-INVALID-TAG-TYPE
	*  @param value
	**/
   public void setInvalidTagType600(char[] value) {
       value = checkInvalidTagType600Constraints(value);
       arraycopy(value,0,invalidTagType600,0,value.length);
   } 
	public void setInvalidTagType600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,invalidTagType600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of badRecLngthNdx600
	 *	@return badRecLngthNdx600
	 */
	public int getBadRecLngthNdx600() throws CFException {
   		return badRecLngthNdx600;
	}
	
	/**
	 * 	Update BadRecLngthNdx600 with the passed value
	 *  Corresponding COBOL Variable is 600-BAD-REC-LNGTH-NDX
	 *	@param number
	 */
	public void setBadRecLngthNdx600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    badRecLngthNdx600 = checkBadRecLngthNdx600MaxLimit(number); 
	}


	public void setBadRecLngthNdx600(long number) {
	    number = checkBadRecLngthNdx600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBadRecLngthNdx600((int)number);
	}
	
	/**
	 *	Returns the value of badRecLngthCode600
	 *	@return badRecLngthCode600
	 */
	public int getBadRecLngthCode600() throws CFException {
   		return badRecLngthCode600;
	}
	
	/**
	 * 	Update BadRecLngthCode600 with the passed value
	 *  Corresponding COBOL Variable is 600-BAD-REC-LNGTH-CODE
	 *	@param number
	 */
	public void setBadRecLngthCode600(int number) {
	     // Truncate if the number is beyond +/- Max range
	    badRecLngthCode600 = checkBadRecLngthCode600MaxLimit(number); 
	}


	public void setBadRecLngthCode600(long number) {
	    number = checkBadRecLngthCode600MaxLimit(number); // Truncate if value is beyond +/- Max range
		setBadRecLngthCode600((int)number);
	}
	
	/**
	 *	Returns the value of ipmErrorPointerLine600
	 *	@return ipmErrorPointerLine600
	 */
   public char[] getIpmErrorPointerLine600() throws CFException{
   		return ipmErrorPointerLine600;
   }

  
	/**
	*  set variable ipmErrorPointerLine600
	*  Corresponding COBOL Variable is 600-IPM-ERROR-POINTER-LINE
	*  @param value
	**/
   public void setIpmErrorPointerLine600(char[] value) {
       value = checkIpmErrorPointerLine600Constraints(value);
       arraycopy(value,0,ipmErrorPointerLine600,0,value.length);
   } 
	public void setIpmErrorPointerLine600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ipmErrorPointerLine600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ipmErrorPointerWidth600
	 *	@return ipmErrorPointerWidth600
	 */
	public short getIpmErrorPointerWidth600() throws CFException {
   		return ipmErrorPointerWidth600;
	}
	
	/**
	 * 	Update IpmErrorPointerWidth600 with the passed value
	 *  Corresponding COBOL Variable is 600-IPM-ERROR-POINTER-WIDTH
	 *	@param number
	 */
	public void setIpmErrorPointerWidth600(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ipmErrorPointerWidth600 = checkIpmErrorPointerWidth600MaxLimit(number); 
	}

	public void setIpmErrorPointerWidth600(int number) {
	    number = checkIpmErrorPointerWidth600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIpmErrorPointerWidth600((short)number);
	}
	public void setIpmErrorPointerWidth600(long number) {
	    number = checkIpmErrorPointerWidth600MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIpmErrorPointerWidth600((short)number);
	}
	

	/**
	 *	Returns the value of displayNumber600
	 *	@return displayNumber600
	 */
   public char[] getDisplayNumber600() throws CFException{
     if (isDisplayNumber600Modified()) { 
        displayNumber600 = refreshDisplayNumber600();
     }
   		return displayNumber600;
   }

  
	/**
	*  set variable displayNumber600
	*  Corresponding COBOL Variable is 600-DISPLAY-NUMBER
	*  @param value
	**/
   public void setDisplayNumber600(char[] value) {
      displayNumber600 = checkDisplayNumber600Constraints(value);
      serializeDisplayNumber600(displayNumber600);
   } 

     /**
	 * 	Update DisplayNumber600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDisplayNumber600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDisplayNumber600,displayNumber600.length);
   	
   }
   
   public void setDisplayNumber600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNumber600,displayNumber600.length);
   	
   }
   
     /**
	 * 	Update DisplayNumber600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNumber600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNumber600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DisplayNumber600 with another Field
	 *	@param value
	 */
   public void setDisplayNumber600(Field source) {
       replace(source,0,source.length(),beginDisplayNumber600,DISPLAY_NUMBER_600_LEN);
   	
   }  
   
     /**
	 * 	Update DisplayNumber600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDisplayNumber600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDisplayNumber600,DISPLAY_NUMBER_600_LEN);
   	
   }
   
     /**
	 * 	Update DisplayNumber600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDisplayNumber600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDisplayNumber600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagType600
	 *	@return tagType600
	 */
   public char[] getTagType600() throws CFException{
   		return tagType600;
   }

  
	/**
	*  set variable tagType600
	*  Corresponding COBOL Variable is 600-TAG-TYPE
	*  @param value
	**/
   public void setTagType600(char[] value) {
       value = checkTagType600Constraints(value);
       arraycopy(value,0,tagType600,0,value.length);
   } 
	public void setTagType600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tagType600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tagNo600
	 *	@return tagNo600
	 */
   public char[] getTagNo600() throws CFException{
     if (isTagNo600Modified()) { 
        tagNo600 = refreshTagNo600();
     }
   		return tagNo600;
   }

  
	/**
	*  set variable tagNo600
	*  Corresponding COBOL Variable is 600-TAG-NO
	*  @param value
	**/
   public void setTagNo600(char[] value) {
      tagNo600 = checkTagNo600Constraints(value);
      serializeTagNo600(tagNo600);
   } 

     /**
	 * 	Update TagNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagNo600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagNo600,tagNo600.length);
   	
   }
   
   public void setTagNo600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagNo600,tagNo600.length);
   	
   }
   
     /**
	 * 	Update TagNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagNo600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagNo600 with another Field
	 *	@param value
	 */
   public void setTagNo600(Field source) {
       replace(source,0,source.length(),beginTagNo600,TAG_NO_600_LEN);
   	
   }  
   
     /**
	 * 	Update TagNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagNo600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagNo600,TAG_NO_600_LEN);
   	
   }
   
     /**
	 * 	Update TagNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagNo600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagSubfldNo600
	 *	@return tagSubfldNo600
	 */
   public char[] getTagSubfldNo600() throws CFException{
     if (isTagSubfldNo600Modified()) { 
        tagSubfldNo600 = refreshTagSubfldNo600();
     }
   		return tagSubfldNo600;
   }

  
	/**
	*  set variable tagSubfldNo600
	*  Corresponding COBOL Variable is 600-TAG-SUBFLD-NO
	*  @param value
	**/
   public void setTagSubfldNo600(char[] value) {
      tagSubfldNo600 = checkTagSubfldNo600Constraints(value);
      serializeTagSubfldNo600(tagSubfldNo600);
   } 

     /**
	 * 	Update TagSubfldNo600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagSubfldNo600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagSubfldNo600,tagSubfldNo600.length);
   	
   }
   
   public void setTagSubfldNo600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagSubfldNo600,tagSubfldNo600.length);
   	
   }
   
     /**
	 * 	Update TagSubfldNo600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagSubfldNo600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagSubfldNo600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagSubfldNo600 with another Field
	 *	@param value
	 */
   public void setTagSubfldNo600(Field source) {
       replace(source,0,source.length(),beginTagSubfldNo600,TAG_SUBFLD_NO_600_LEN);
   	
   }  
   
     /**
	 * 	Update TagSubfldNo600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagSubfldNo600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagSubfldNo600,TAG_SUBFLD_NO_600_LEN);
   	
   }
   
     /**
	 * 	Update TagSubfldNo600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagSubfldNo600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagSubfldNo600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagStarts600
	 *	@return tagStarts600
	 */
   public char[] getTagStarts600() throws CFException{
     if (isTagStarts600Modified()) { 
        tagStarts600 = refreshTagStarts600();
     }
   		return tagStarts600;
   }

  
	/**
	*  set variable tagStarts600
	*  Corresponding COBOL Variable is 600-TAG-STARTS
	*  @param value
	**/
   public void setTagStarts600(char[] value) {
      tagStarts600 = checkTagStarts600Constraints(value);
      serializeTagStarts600(tagStarts600);
   } 

     /**
	 * 	Update TagStarts600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagStarts600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagStarts600,tagStarts600.length);
   	
   }
   
   public void setTagStarts600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagStarts600,tagStarts600.length);
   	
   }
   
     /**
	 * 	Update TagStarts600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagStarts600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagStarts600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagStarts600 with another Field
	 *	@param value
	 */
   public void setTagStarts600(Field source) {
       replace(source,0,source.length(),beginTagStarts600,TAG_STARTS_600_LEN);
   	
   }  
   
     /**
	 * 	Update TagStarts600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagStarts600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagStarts600,TAG_STARTS_600_LEN);
   	
   }
   
     /**
	 * 	Update TagStarts600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagStarts600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagStarts600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagLngth600
	 *	@return tagLngth600
	 */
   public char[] getTagLngth600() throws CFException{
     if (isTagLngth600Modified()) { 
        tagLngth600 = refreshTagLngth600();
     }
   		return tagLngth600;
   }

  
	/**
	*  set variable tagLngth600
	*  Corresponding COBOL Variable is 600-TAG-LNGTH
	*  @param value
	**/
   public void setTagLngth600(char[] value) {
      tagLngth600 = checkTagLngth600Constraints(value);
      serializeTagLngth600(tagLngth600);
   } 

     /**
	 * 	Update TagLngth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTagLngth600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTagLngth600,tagLngth600.length);
   	
   }
   
   public void setTagLngth600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTagLngth600,tagLngth600.length);
   	
   }
   
     /**
	 * 	Update TagLngth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTagLngth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagLngth600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TagLngth600 with another Field
	 *	@param value
	 */
   public void setTagLngth600(Field source) {
       replace(source,0,source.length(),beginTagLngth600,TAG_LNGTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update TagLngth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTagLngth600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTagLngth600,TAG_LNGTH_600_LEN);
   	
   }
   
     /**
	 * 	Update TagLngth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTagLngth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTagLngth600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tagStatus600
	 *	@return tagStatus600
	 */
   public char[] getTagStatus600() throws CFException{
   		return tagStatus600;
   }

  
	/**
	*  set variable tagStatus600
	*  Corresponding COBOL Variable is 600-TAG-STATUS
	*  @param value
	**/
   public void setTagStatus600(char[] value) {
       value = checkTagStatus600Constraints(value);
       arraycopy(value,0,tagStatus600,0,value.length);
   } 
	public void setTagStatus600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tagStatus600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tagContent600
	 *	@return tagContent600
	 */
   public char[] getTagContent600() throws CFException{
   		return tagContent600;
   }

  
	/**
	*  set variable tagContent600
	*  Corresponding COBOL Variable is 600-TAG-CONTENT
	*  @param value
	**/
   public void setTagContent600(char[] value) {
       value = checkTagContent600Constraints(value);
       arraycopy(value,0,tagContent600,0,value.length);
   } 
	public void setTagContent600(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tagContent600,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of i800
	 *	@return i800
	 */
	public short getI800() throws CFException {
   		return i800;
	}
	
	/**
	 * 	Update I800 with the passed value
	 *  Corresponding COBOL Variable is 800-I
	 *	@param number
	 */
	public void setI800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    i800 = checkI800MaxLimit(number); 
	}

	public void setI800(int number) {
	    number = checkI800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI800((short)number);
	}
	public void setI800(long number) {
	    number = checkI800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setI800((short)number);
	}
	

	/**
	 *	Returns the value of tableLen800
	 *	@return tableLen800
	 */
	public short getTableLen800() throws CFException {
   		return tableLen800;
	}
	
	/**
	 * 	Update TableLen800 with the passed value
	 *  Corresponding COBOL Variable is 800-TABLE-LEN
	 *	@param number
	 */
	public void setTableLen800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tableLen800 = checkTableLen800MaxLimit(number); 
	}

	public void setTableLen800(int number) {
	    number = checkTableLen800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTableLen800((short)number);
	}
	public void setTableLen800(long number) {
	    number = checkTableLen800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTableLen800((short)number);
	}
	

	/**
	 *	Returns the value of maxTagNo800
	 *	@return maxTagNo800
	 */
	public short getMaxTagNo800() throws CFException {
   		return maxTagNo800;
	}
	
	/**
	 * 	Update MaxTagNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAX-TAG-NO
	 *	@param number
	 */
	public void setMaxTagNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    maxTagNo800 = checkMaxTagNo800MaxLimit(number); 
	}

	public void setMaxTagNo800(int number) {
	    number = checkMaxTagNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxTagNo800((short)number);
	}
	public void setMaxTagNo800(long number) {
	    number = checkMaxTagNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxTagNo800((short)number);
	}
	

	/**
	 *	Returns the value of maxPdsNo800
	 *	@return maxPdsNo800
	 */
	public short getMaxPdsNo800() throws CFException {
   		return maxPdsNo800;
	}
	
	/**
	 * 	Update MaxPdsNo800 with the passed value
	 *  Corresponding COBOL Variable is 800-MAX-PDS-NO
	 *	@param number
	 */
	public void setMaxPdsNo800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    maxPdsNo800 = checkMaxPdsNo800MaxLimit(number); 
	}

	public void setMaxPdsNo800(int number) {
	    number = checkMaxPdsNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxPdsNo800((short)number);
	}
	public void setMaxPdsNo800(long number) {
	    number = checkMaxPdsNo800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setMaxPdsNo800((short)number);
	}
	

	/**
	 *	Returns the value of startOfNextElement800
	 *	@return startOfNextElement800
	 */
	public short getStartOfNextElement800() throws CFException {
   		return startOfNextElement800;
	}
	
	/**
	 * 	Update StartOfNextElement800 with the passed value
	 *  Corresponding COBOL Variable is 800-START-OF-NEXT-ELEMENT
	 *	@param number
	 */
	public void setStartOfNextElement800(short number) {
	     // Truncate if the number is beyond +/- Max range
	    startOfNextElement800 = checkStartOfNextElement800MaxLimit(number); 
	}

	public void setStartOfNextElement800(int number) {
	    number = checkStartOfNextElement800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStartOfNextElement800((short)number);
	}
	public void setStartOfNextElement800(long number) {
	    number = checkStartOfNextElement800MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setStartOfNextElement800((short)number);
	}
	

	/**
	 *	Returns the value of ptrIp739010800
	 *	@return ptrIp739010800
	 */
   public char[] getPtrIp739010800() throws CFException{
   		return ptrIp739010800;
   }

  
	/**
	*  set variable ptrIp739010800
	*  Corresponding COBOL Variable is 800-PTR-IP739010
	*  @param value
	**/
   public void setPtrIp739010800(char[] value) {
       value = checkPtrIp739010800Constraints(value);
       arraycopy(value,0,ptrIp739010800,0,value.length);
   } 
	public void setPtrIp739010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp739010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp741010800
	 *	@return ptrIp741010800
	 */
   public char[] getPtrIp741010800() throws CFException{
   		return ptrIp741010800;
   }

  
	/**
	*  set variable ptrIp741010800
	*  Corresponding COBOL Variable is 800-PTR-IP741010
	*  @param value
	**/
   public void setPtrIp741010800(char[] value) {
       value = checkPtrIp741010800Constraints(value);
       arraycopy(value,0,ptrIp741010800,0,value.length);
   } 
	public void setPtrIp741010800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp741010800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of ptrIp661020800
	 *	@return ptrIp661020800
	 */
   public char[] getPtrIp661020800() throws CFException{
   		return ptrIp661020800;
   }

  
	/**
	*  set variable ptrIp661020800
	*  Corresponding COBOL Variable is 800-PTR-IP661020
	*  @param value
	**/
   public void setPtrIp661020800(char[] value) {
       value = checkPtrIp661020800Constraints(value);
       arraycopy(value,0,ptrIp661020800,0,value.length);
   } 
	public void setPtrIp661020800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp661020800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of abendCode900
	 *	@return abendCode900
	 */
	public short getAbendCode900() throws CFException {
   		return abendCode900;
	}
	
	/**
	 * 	Update AbendCode900 with the passed value
	 *  Corresponding COBOL Variable is 900-ABEND-CODE
	 *	@param number
	 */
	public void setAbendCode900(short number) {
	     // Truncate if the number is beyond +/- Max range
	    abendCode900 = checkAbendCode900MaxLimit(number); 
	}

	public void setAbendCode900(int number) {
	    number = checkAbendCode900MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAbendCode900((short)number);
	}
	public void setAbendCode900(long number) {
	    number = checkAbendCode900MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAbendCode900((short)number);
	}
	


	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  
