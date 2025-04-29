package com.cloudframe.app.si994010.dto;

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
   

								@Getter @Setter private short binaryZeros300;

								@Getter @Setter private short binary1300;

								@Getter @Setter private short binary2300;

								@Getter @Setter private short binary4300;

								@Getter @Setter private short binary8300;

								@Getter @Setter private short binary13300;

								@Getter @Setter private short binary64300;

								@Getter @Setter private short binary128300;

								@Getter @Setter private short deMax300;

								@Getter @Setter private int maxMessage300;

						@Getter @Setter private char[] charX300 = new char[1];

						@Getter @Setter private char[] asterisks300 = new char[4];

						@Getter @Setter private char[] errMsg1600 = new char[80];

						@Getter @Setter private char[] errMsg2600 = new char[80];

						@Getter @Setter private char[] errMsg3600 = new char[80];

						@Getter @Setter private char[] errMsg4600 = new char[80];

						@Getter @Setter private char[] errMsg5600 = new char[80];

						@Getter @Setter private char[] errMsg6600 = new char[80];

						@Getter @Setter private char[] errMsg7600 = new char[80];

						@Getter @Setter private char[] errMsg8600 = new char[80];

								@Getter @Setter private short sub800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setBinaryZeros300((short)0);
								setBinary1300((short)1);
								setBinary2300((short)2);
								setBinary4300((short)4);
								setBinary8300((short)8);
								setBinary13300((short)13);
								setBinary64300((short)64);
								setBinary128300((short)128);
								setDeMax300((short)128);
								setMaxMessage300(32768);
								setCharX300(("X").toCharArray());
								setAsterisks300(("****").toCharArray());
								setErrMsg1600(pad(80,"DATA ELEMENT FROM FIRST MESSAGE IS NOT DEFINED       ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg2600(pad(80,"DATA ELEMENT FROM SECOND MESSAGE IS NOT DEFINED      ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg3600(pad(80,"INVALID MTI IN FIRST MESSAGE                         ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg4600(pad(80,"INVALID MTI IN SECOND MESSAGE                        ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg5600(pad(80,"VARIABLE LENGTH VALUE IS NOT NUMERIC IN FIRST MESSAGE".toCharArray(),' ',RIGHT_PAD));
								setErrMsg6600(pad(80,"VARIABLE LENGTH VALUE IS NOT NUMERIC IN SECND MESSAGE".toCharArray(),' ',RIGHT_PAD));
								setErrMsg7600(pad(80,"CALCULATED MESSAGE LENGTH EXCEEDS DATA LENGTH        ".toCharArray(),' ',RIGHT_PAD));
								setErrMsg8600(pad(80,"DATA POINTER IS NULL                                 ".toCharArray(),' ',RIGHT_PAD));
								setSub800((short)0);
    }





}
  
