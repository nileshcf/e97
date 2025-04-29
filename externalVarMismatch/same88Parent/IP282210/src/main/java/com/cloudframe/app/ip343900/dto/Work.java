package com.cloudframe.app.ip343900.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] checkIsItGlobal100 = new char[1];

								@Getter @Setter private int sys001Status200;

						@Getter @Setter private char[] sys067Status200 = new char[2];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] pgmIp532010300 = new char[8];

						@Getter @Setter private char[] pgmIp081110300 = new char[8];

						@Getter @Setter private char[] pgmIp282210300 = new char[8];

						@Getter @Setter private char[] pgmIp703020300 = new char[8];

						@Getter @Setter private char[] pgmIp750080300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmIp996020300 = new char[8];

						@Getter @Setter private char[] programId300 = new char[8];

						@Getter @Setter private char[] abendPgm300 = new char[8];

								@Getter @Setter private int value4300;

								@Getter @Setter private int value1300;

						@Getter @Setter private char[] valueGlobal300 = new char[11];

						@Getter @Setter private char[] valueLpidn300 = new char[11];

						@Getter @Setter private char[] openAbendCode300 = new char[4];

						@Getter @Setter private char[] readAbendCode300 = new char[4];

						@Getter @Setter private char[] closeAbendCode300 = new char[4];

						@Getter @Setter private char[] paraName300 = new char[30];

								@Getter @Setter private long insRecCnt400;

								@Getter @Setter private int insCmtCnt400;

						@Getter @Setter private char[] amsOnsoilSw800 = new char[1];

						@Getter @Setter private char[] ptrIp532010800 = new char[8];

						@Getter @Setter private char[] ptrIp081110800 = new char[8];

						@Getter @Setter private char[] ptrIp282210800 = new char[8];

						@Getter @Setter private char[] ptrIp703020800 = new char[8];

						@Getter @Setter private char[] ptrIp750080800 = new char[8];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

						@Getter @Setter private char[] ptrIp996020800 = new char[8];

						@Getter @Setter private char[] abendPtr800 = new char[8];

						@Getter @Setter private char[] astriskLine900 = new char[35];

						@Getter @Setter private char[] abendAbend900 = new char[35];

						@Getter @Setter private char[] abendAbendPgm900 = new char[35];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCheckIsItGlobal100(("N").toCharArray());
								setSys001Status200(0);
								setSys067Status200(("00").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0x68,(byte)0x3B,(byte)0x01,(byte)0x39,(byte)0x7F,(byte)0x00}).toCharArray());
								setPgmIp532010300(("IP532010").toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp282210300(("IP282210").toCharArray());
								setPgmIp703020300(("IP703020").toCharArray());
								setPgmIp750080300(("IP750080").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp996020300(("IP996020").toCharArray());
								setProgramId300(("IP343900").toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setValue4300(4);
								setValue1300(1);
								setValueGlobal300(("GLOBAL     ").toCharArray());
								setValueLpidn300(("LPIDN      ").toCharArray());
								setOpenAbendCode300(("3001").toCharArray());
								setReadAbendCode300(("3002").toCharArray());
								setCloseAbendCode300(("3003").toCharArray());
								setParaName300(fillSpace(30));
								setInsRecCnt400(0L);
								setInsCmtCnt400(0);
								setAmsOnsoilSw800(fillSpace(1));
								setPtrIp532010800(("IP532010").toCharArray());
								setPtrIp081110800(("IP081110").toCharArray());
								setPtrIp282210800(("IP282210").toCharArray());
								setPtrIp703020800(("IP703020").toCharArray());
								setPtrIp750080800(("IP750080").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp996020800(("IP996020").toCharArray());
								setAbendPtr800(("IP610010").toCharArray());
								setAstriskLine900(String.join("", java.util.Collections.nCopies(35, "*")).toCharArray());
								setAbendAbend900(("A B E N D   A B E N D   A B E N D  ").toCharArray());
								setAbendAbendPgm900(("A B E N D   I P 3 4 3 9 0 0        ").toCharArray());
    }





}
  
