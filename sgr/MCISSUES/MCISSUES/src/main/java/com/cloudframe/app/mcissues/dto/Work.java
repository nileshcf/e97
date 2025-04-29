package com.cloudframe.app.mcissues.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;
import java.util.List;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] mcissuesWhenCompiled = Field.fillLowValue(17);

								@Getter @Setter private long dateWs;

								@Getter @Setter private short ip20004ItemLength;

								@Getter @Setter private short tmpLth800;

								@Getter @Setter private int value1300;

								@Getter @Setter private int value10300;

								@Getter @Setter private int value100300;

								@Getter @Setter private short iCtr400;

								@Getter @Setter private int ip00321ReplTextCount;

								@Getter @Setter private long editNumber800;

						@Getter @Setter private char[] valueOfPds158s3800 = Field.fillLowValue(6);

						@Getter @Setter private char[] valueOfPds158s2800 = Field.fillLowValue(1);

								@Getter @Setter private int i;

								@Getter @Setter private long date3;

						@Getter @Setter private char[] sys295EffDate2 = Field.fillLowValue(10);

						@Getter @Setter private char[] display = Field.fillLowValue(100);

								@Getter @Setter private int idx;

								@Getter @Setter private short one;

								@Getter @Setter private short four;

								@Getter @Setter private short two;

						@Getter @Setter private char[] cond = Field.fillLowValue(1);

						@Getter @Setter private char[] xmlTag300 = new char[43];

						@Getter @Setter private char[] xmlData300 = new char[30];

						@Getter @Setter private char[] xmlTag2300 = new char[44];

						@Getter @Setter private char[] xmlTag3300 = new char[42];

						@Getter @Setter private char[] xmlTag4300 = new char[43];

						@Getter @Setter private char[] xmlStr300 = Field.fillLowValue(80);

								@Getter @Setter private BigDecimal ip33701RateSrcToTrg = BigDecimal.ZERO;
      private List<Short> subValueCount400; 


								@Getter @Setter private short totalSubCount400;

								@Getter @Setter private short strt800;

								@Getter @Setter private char[] numSpaces = Field.fillLowValue(9);

						@Getter @Setter private char[] charWs = Field.fillLowValue(50);

						@Getter @Setter private char[] xmlText = new char[28];

						@Getter @Setter private char[] xmlData805 = Field.fillLowValue(50);

						@Getter @Setter private char[] lowValue300 = new char[1];

						@Getter @Setter private char[] highValue300 = new char[1];

						@Getter @Setter private char[] ampersand300 = new char[1];

						@Getter @Setter private char[] space300 = new char[1];

						@Getter @Setter private char[] prevTransType801 = Field.fillLowValue(4);

						@Getter @Setter private char[] prevMccCode801 = Field.fillLowValue(8);

						@Getter @Setter private char[] transType701 = Field.fillLowValue(80);

						@Getter @Setter private char[] exclusionFlag100 = Field.fillLowValue(1);

						@Getter @Setter private char[] var = new char[3];

						@Getter @Setter private char[] b = Field.fillLowValue(50);

						@Getter @Setter private char[] d = Field.fillLowValue(40);

								@Getter @Setter private short aLen;

								@Getter @Setter private short bLen;

								@Getter @Setter private short cLen;

								@Getter @Setter private short dLen;

								@Getter @Setter private BigDecimal ecbRateDiff800 = BigDecimal.ZERO;

								@Getter @Setter private long clearingDtTm9800;

								@Getter @Setter private long clearingDtTm9700;

						@Getter @Setter private char[] clearingDtTm9X700 = Field.fillLowValue(12);

								@Getter @Setter private long clearingDtTm9Short800;

						@Getter @Setter private char[] cf20004TableEnts = Field.fillLowValue(460);

						@Getter @Setter private char[] dtlRecord1800 = new char[69];

								@Getter @Setter private BigDecimal var1N = BigDecimal.ZERO;

								@Getter @Setter private char[] var1Ed = Field.fillLowValue(14);

								@Getter @Setter private char[] var2Ed = Field.fillLowValue(14);

						@Getter @Setter private char[] c0071300 = new char[4];

								@Getter @Setter private int ip00104Elsub;
	
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





}
  
