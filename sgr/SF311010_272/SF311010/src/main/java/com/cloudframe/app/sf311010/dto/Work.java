package com.cloudframe.app.sf311010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] parseSw100 = new char[1];

						@Getter @Setter private char[] centralSiteEofSw100 = new char[1];

						@Getter @Setter private char[] cycleId100 = new char[1];

						@Getter @Setter private char[] logClass100 = new char[1];

						@Getter @Setter private char[] logType100 = new char[1];

						@Getter @Setter private char[] messageType100 = new char[4];

						@Getter @Setter private char[] litA300 = new char[1];

						@Getter @Setter private char[] litB300 = new char[1];

						@Getter @Setter private char[] litC300 = new char[1];

						@Getter @Setter private char[] litN300 = new char[1];

						@Getter @Setter private char[] litY300 = new char[1];

						@Getter @Setter private char[] litIa300 = new char[2];

						@Getter @Setter private char[] lit01300 = new char[2];

						@Getter @Setter private char[] lit02300 = new char[2];

						@Getter @Setter private char[] lit03300 = new char[2];

						@Getter @Setter private char[] lit05300 = new char[2];

						@Getter @Setter private char[] lit06300 = new char[2];

						@Getter @Setter private char[] lit09300 = new char[2];

						@Getter @Setter private char[] lit10300 = new char[2];

						@Getter @Setter private char[] lit16300 = new char[2];

						@Getter @Setter private char[] lit30300 = new char[2];

						@Getter @Setter private char[] lit50300 = new char[2];

						@Getter @Setter private char[] lit51300 = new char[2];

						@Getter @Setter private char[] lit52300 = new char[2];

						@Getter @Setter private char[] lit82300 = new char[2];

						@Getter @Setter private char[] lit83300 = new char[2];

						@Getter @Setter private char[] lit85300 = new char[2];

						@Getter @Setter private char[] lit002300 = new char[3];

						@Getter @Setter private char[] lit0120300 = new char[4];

						@Getter @Setter private char[] lit0130300 = new char[4];

						@Getter @Setter private char[] lit0420300 = new char[4];

						@Getter @Setter private char[] lit0430300 = new char[4];

						@Getter @Setter private char[] lit380000300 = new char[6];

						@Getter @Setter private char[] doubleSpace300 = new char[1];

						@Getter @Setter private char[] tripleSpace300 = new char[1];

						@Getter @Setter private char[] newPage300 = new char[1];

								@Getter @Setter private short packedOne300;

								@Getter @Setter private int one300;

								@Getter @Setter private int two300;

								@Getter @Setter private int three300;

								@Getter @Setter private int four300;

								@Getter @Setter private int five300;

								@Getter @Setter private int six300;

								@Getter @Setter private int seven300;

								@Getter @Setter private int eight300;

								@Getter @Setter private int nine300;

								@Getter @Setter private int twelve300;

								@Getter @Setter private int max300;

								@Getter @Setter private int mti0110300;

								@Getter @Setter private int mti0100300;

						@Getter @Setter private char[] sf910020300 = new char[8];

						@Getter @Setter private char[] si994010300 = new char[8];

								@Getter @Setter private short binary61300;

								@Getter @Setter private short binary88300;

								@Getter @Setter private int maxLines400;

								@Getter @Setter private int pageCount400;

								@Getter @Setter private int lineCount400;

								@Getter @Setter private long totalRecs400;

								@Getter @Setter private long totalParseErrors400;

								@Getter @Setter private long totalIsoAuth400;

								@Getter @Setter private long totalIaDropped400;

								@Getter @Setter private long totalType2400;

								@Getter @Setter private long totalType3400;

								@Getter @Setter private long total0120Adv400;

								@Getter @Setter private long totalRevAdv400;

								@Getter @Setter private long totalVer2400;

								@Getter @Setter private long totalBadPan400;

								@Getter @Setter private long avs2RecCount400;

								@Getter @Setter private int se42Lnth400;

								@Getter @Setter private int se42Pos400;

								@Getter @Setter private int se33Pos400;

								@Getter @Setter private short se24Pos400;

								@Getter @Setter private short se66Pos400;

						@Getter @Setter private char[] de48Se42Sf2Sf3500 = Field.fillLowValue(4);

						@Getter @Setter private char[] de48Se89500 = Field.fillLowValue(1);

						@Getter @Setter private char[] de48Se33SfId500 = new char[2];

								@Getter @Setter private int de48Se33SfLen500;

								@Getter @Setter private int de48Se42SfLen500;

								@Getter @Setter private int de48Se42SfLen1500;

						@Getter @Setter private char[] de48Se66SfId500 = new char[2];

						@Getter @Setter private char[] de48Se24SfId500 = new char[2];

						@Getter @Setter private char[] billlogMsg1600 = new char[27];

						@Getter @Setter private char[] billlogMsg2600 = new char[7];

						@Getter @Setter private char[] billlogMsg3600 = new char[13];

						@Getter @Setter private char[] billlogMsg4600 = new char[9];

						@Getter @Setter private char[] voiceMsg600 = new char[39];

						@Getter @Setter private char[] parmsMsg600 = new char[36];

						@Getter @Setter private char[] cycleMsg600 = new char[38];

						@Getter @Setter private char[] mcwinMsg1600 = new char[30];

						@Getter @Setter private char[] mcwinMsg2600 = new char[15];

						@Getter @Setter private char[] eojMessage650 = new char[64];

								@Getter @Setter private int logLen800;

						@Getter @Setter private char[] mti800 = Field.fillLowValue(4);

								@Getter @Setter private int holdCurrCc800;

						@Getter @Setter private char[] obscureData800 = new char[100];

								@Getter @Setter private int obscurePos800;

								@Getter @Setter private int obscurePos2800;

								@Getter @Setter private int obscureStartPos800;

								@Getter @Setter private int obscureEndPos800;

								@Getter @Setter private int obscureLgth800;

								@Getter @Setter private int hour800;

								@Getter @Setter private int min800;

								@Getter @Setter private int sec800;

								@Getter @Setter private int isoBlResponse1800;

								@Getter @Setter private int isoBlResponse2800;

								@Getter @Setter private int isoBlDown1800;

								@Getter @Setter private int isoBlDown2800;

								@Getter @Setter private int isoBlMoto1800;

								@Getter @Setter private int mciwinReturnCode;

						@Getter @Setter private char[] mcwinProgram = new char[8];

						@Getter @Setter private char[] mciabendNodump = new char[1];

						@Getter @Setter private char[] seprPtrSi994020 = new char[8];

						@Getter @Setter private char[] seprCallSi994020 = new char[8];
	
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





}
  
