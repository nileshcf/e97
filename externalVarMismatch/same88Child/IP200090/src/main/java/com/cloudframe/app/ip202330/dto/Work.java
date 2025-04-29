package com.cloudframe.app.ip202330.dto;

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

						@Getter @Setter private char[] edit0233300 = new char[8];

						@Getter @Setter private char[] pgmIp200110300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] abendPgm300 = new char[8];

						@Getter @Setter private char[] numericSyntax300 = new char[3];

						@Getter @Setter private char[] formatAbendCode300 = new char[4];

								@Getter @Setter private short valueOne300;

						@Getter @Setter private char[] value9300 = new char[1];

						@Getter @Setter private char[] para2200300 = new char[25];

								@Getter @Setter private short startIndex800;

								@Getter @Setter private short elementStart800;

								@Getter @Setter private short candidateStart800;

								@Getter @Setter private short candidateLngth800;

						@Getter @Setter private char[] candidateSyntax800 = new char[3];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

						@Getter @Setter private char[] ptrIp200110800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setEdit0233300(("IP202330").toCharArray());
								setPgmIp200110300(("IP200110").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xF5,(byte)0x65,(byte)0x01,(byte)0xBB,(byte)0x62,(byte)0x00}).toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setNumericSyntax300(("N  ").toCharArray());
								setFormatAbendCode300(("3005").toCharArray());
								setValueOne300((short)1);
								setValue9300(("9").toCharArray());
								setPara2200300(("2200-PERFORM-PRIMARY-EDIT").toCharArray());
								setStartIndex800((short)0);
								setElementStart800((short)0);
								setCandidateStart800((short)0);
								setCandidateLngth800((short)0);
								setCandidateSyntax800(fillSpace(3));
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp200110800(("IP200110").toCharArray());
    }





}
  
