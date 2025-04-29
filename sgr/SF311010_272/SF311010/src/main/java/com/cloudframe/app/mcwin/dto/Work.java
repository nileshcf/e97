package com.cloudframe.app.mcwin.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] mciwinReturnedYear = new char[4];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmMcwin300 = new char[7];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

								@Getter @Setter private int num00300;

								@Getter @Setter private int num04300;

								@Getter @Setter private int num08300;

								@Getter @Setter private int num16300;

								@Getter @Setter private int num99300;

								@Getter @Setter private int num19300;

								@Getter @Setter private int num20300;

						@Getter @Setter private char[] errMsg004600 = new char[32];

						@Getter @Setter private char[] errMsg008600 = new char[32];

						@Getter @Setter private char[] errMsg016600 = new char[32];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

						@Getter @Setter private char[] abendText900 = new char[100];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setMciwinReturnedYear(("0000").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmMcwin300(("MCWIN  ").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xFE,(byte)0x9E,(byte)0x00,(byte)0x3E,(byte)0x47,(byte)0x00}).toCharArray());
								setNum00300(0);
								setNum04300(4);
								setNum08300(8);
								setNum16300(16);
								setNum99300(99);
								setNum19300(19);
								setNum20300(20);
								setErrMsg004600(("INPUT YEAR NOT DISPLAY OR PACKED").toCharArray());
								setErrMsg008600(("NEW WINDOW YEAR IS NOT VALID    ").toCharArray());
								setErrMsg016600(("PARM IS NOT SUPPLIED            ").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setAbendText900(pad(100," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
