package com.cloudframe.app.sf305120.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] firstTimeFlag100 = new char[1];

						@Getter @Setter private char[] zlogReleaseFlag100 = new char[1];

						@Getter @Setter private char[] oeHeaderData280 = new char[138];

								@Getter @Setter private short esV1HdrLnth300;

								@Getter @Setter private short esV2HdrLnth300;

								@Getter @Setter private short esV3HdrLnth300;

								@Getter @Setter private short oeStructLnth300;

								@Getter @Setter private short esHdrOffset300;

								@Getter @Setter private short esV2Majic300;

								@Getter @Setter private short esV3Majic300;

						@Getter @Setter private char[] programSf305120300 = new char[8];

								@Getter @Setter private int number01300;

								@Getter @Setter private short binary1300;

								@Getter @Setter private short binary2300;

								@Getter @Setter private short binary3300;

								@Getter @Setter private short binary4300;

								@Getter @Setter private short binary8300;

								@Getter @Setter private short binary11300;

								@Getter @Setter private short binary15300;

								@Getter @Setter private short binary16300;

								@Getter @Setter private short binary21300;

								@Getter @Setter private short binary24300;

								@Getter @Setter private short binary38300;

								@Getter @Setter private short binary39300;

								@Getter @Setter private short binary40300;

								@Getter @Setter private short binary64300;

								@Getter @Setter private short binary512300;

								@Getter @Setter private short error4300;

								@Getter @Setter private short error16300;

								@Getter @Setter private short error17300;

								@Getter @Setter private short error18300;

								@Getter @Setter private short error19300;

								@Getter @Setter private short error20300;

								@Getter @Setter private short error21300;

								@Getter @Setter private short error22300;

								@Getter @Setter private short error41300;

								@Getter @Setter private short error42300;

								@Getter @Setter private short error43300;

								@Getter @Setter private short error44300;

								@Getter @Setter private short error45300;

								@Getter @Setter private short error46300;

								@Getter @Setter private short error99300;

						@Getter @Setter private char[] charZ300 = new char[1];

						@Getter @Setter private char[] charC300 = new char[1];

						@Getter @Setter private char[] blankLine300 = new char[1];

						@Getter @Setter private char[] asciiSr300 = new char[2];

						@Getter @Setter private char[] literalEs300 = new char[2];

						@Getter @Setter private char[] literalOe300 = new char[2];

						@Getter @Setter private char[] literalSv300 = new char[2];

						@Getter @Setter private char[] literalPl300 = new char[2];

						@Getter @Setter private char[] literalRe300 = new char[2];

						@Getter @Setter private char[] literalRo300 = new char[2];

						@Getter @Setter private char[] literalIn300 = new char[2];

						@Getter @Setter private char[] literalEd300 = new char[2];

								@Getter @Setter private short currOffset420;

								@Getter @Setter private short workLength420;

						@Getter @Setter private char[] sf305120VersionMsg600 = new char[64];

						@Getter @Setter private char[] message0001600 = new char[64];

						@Getter @Setter private char[] currDateYyyy600 = new char[4];

						@Getter @Setter private char[] currDateMm600 = new char[2];

						@Getter @Setter private char[] currDateDd600 = new char[2];

						@Getter @Setter private char[] currTimeHh600 = new char[2];

						@Getter @Setter private char[] currTimeMm600 = new char[2];

						@Getter @Setter private char[] currTimeSs600 = new char[2];

						@Getter @Setter private char[] zlogSr2Area803 = new char[8167];

								@Getter @Setter private short rhTotalLnth810;

								@Getter @Setter private short rhLnth1810;

								@Getter @Setter private short rhLnth2810;

								@Getter @Setter private short rhLnth3810;

						@Getter @Setter private char[] rhWaitTime810 = new char[1];
	
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





}
  
