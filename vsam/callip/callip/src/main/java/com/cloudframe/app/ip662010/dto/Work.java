package com.cloudframe.app.ip662010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] doesVarSubfExist100 = new char[1];

						@Getter @Setter private char[] isAMapEntryPending100 = new char[1];

						@Getter @Setter private char[] readApi300 = new char[8];

						@Getter @Setter private char[] loadT6T7300 = new char[8];

						@Getter @Setter private char[] loadT8T9300 = new char[8];

								@Getter @Setter private short maxBadIpmMsgs300;

						@Getter @Setter private char[] readParserChop300 = new char[1];

						@Getter @Setter private char[] writeParserChop300 = new char[1];

						@Getter @Setter private char[] ipmUpdaterChop300 = new char[1];

						@Getter @Setter private char[] eofMessage300 = new char[29];

								@Getter @Setter private short code661300;

								@Getter @Setter private short badMessageCount400;

								@Getter @Setter private short pdsTag400;

								@Getter @Setter private short tagTableLength400;

								@Getter @Setter private short i400;

								@Getter @Setter private short j400;

								@Getter @Setter private short k400;

								@Getter @Setter private short l400;

								@Getter @Setter private short m400;

								@Getter @Setter private short currentSubfld400;

								@Getter @Setter private short subfldLength400;

								@Getter @Setter private short pdsLength400;

								@Getter @Setter private short remainingCarrierLth400;

								@Getter @Setter private int parsedMsgLngth400;

								@Getter @Setter private short errEnd400;

								@Getter @Setter private short errStart400;

								@Getter @Setter private short errLngth400;

						@Getter @Setter private char[] errorMessageHeader600 = new char[62];

						@Getter @Setter private char[] tagTableHeader600 = new char[51];

								@Getter @Setter private int missingBitMapNdx600;

								@Getter @Setter private int missingBitMapCode600;

						@Getter @Setter private char[] missingBitMap600 = new char[22];

								@Getter @Setter private int nonNumericLngthNdx600;

								@Getter @Setter private int nonNumericLngthCode600;

						@Getter @Setter private char[] nonNumericLngth600 = new char[32];

								@Getter @Setter private int tooManyTagsNdx600;

								@Getter @Setter private int tooManyTagsCode600;

								@Getter @Setter private int undefinedPdsNdx600;

								@Getter @Setter private int undefinedPdsCode600;

								@Getter @Setter private int noBackslashNdx600;

								@Getter @Setter private int noBackslashCode600;

						@Getter @Setter private char[] noBackslash600 = new char[31];

								@Getter @Setter private int carrierTooShortNdx600;

						@Getter @Setter private char[] carrierTooShort600 = new char[26];

								@Getter @Setter private int nonNumericPdsNdx600;

								@Getter @Setter private int nonNumericPdsCode600;

						@Getter @Setter private char[] nonNumericPdsId600 = new char[15];

								@Getter @Setter private int duplicatePdsNdx600;

								@Getter @Setter private int duplicatePdsCode600;

						@Getter @Setter private char[] duplicatePds600 = new char[16];

								@Getter @Setter private int invalidTagTypeNdx600;

								@Getter @Setter private int invalidTagTypeCode600;

						@Getter @Setter private char[] invalidTagType600 = new char[16];

								@Getter @Setter private int badRecLngthNdx600;

								@Getter @Setter private int badRecLngthCode600;

						@Getter @Setter private char[] ipmErrorPointerLine600 = Field.fillLowValue(100);

								@Getter @Setter private short ipmErrorPointerWidth600;

								@Getter @Setter private char[] displayNumber600 = Field.fillLowValue(5);

						@Getter @Setter private char[] tagType600 = Field.fillLowValue(1);

								@Getter @Setter private char[] tagNo600 = Field.fillLowValue(4);

								@Getter @Setter private char[] tagSubfldNo600 = Field.fillLowValue(4);

								@Getter @Setter private char[] tagStarts600 = Field.fillLowValue(4);

								@Getter @Setter private char[] tagLngth600 = Field.fillLowValue(4);

						@Getter @Setter private char[] tagStatus600 = Field.fillLowValue(1);

						@Getter @Setter private char[] tagContent600 = Field.fillLowValue(84);

								@Getter @Setter private short i800;

								@Getter @Setter private short tableLen800;

								@Getter @Setter private short maxTagNo800;

								@Getter @Setter private short maxPdsNo800;

								@Getter @Setter private short startOfNextElement800;

						@Getter @Setter private char[] ptrIp739010800 = new char[8];

						@Getter @Setter private char[] ptrIp741010800 = new char[8];

						@Getter @Setter private char[] ptrIp661020800 = new char[8];

								@Getter @Setter private short abendCode900;
	
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





}
  
