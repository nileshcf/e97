package com.cloudframe.app.ip200090.dto;

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
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] isCandidatePresent100 = new char[1];

						@Getter @Setter private char[] isSubfldCheckOver100 = new char[1];

						@Getter @Setter private char[] edit0009300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] abendPgm300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmIp200100300 = new char[8];

						@Getter @Setter private char[] pgmIp381120300 = new char[8];

						@Getter @Setter private char[] valueX300 = new char[1];

						@Getter @Setter private char[] valueY300 = new char[1];

								@Getter @Setter private short value1643300;

								@Getter @Setter private short value1659300;

								@Getter @Setter private short value1441300;

								@Getter @Setter private short value1811300;

								@Getter @Setter private short value1813300;

						@Getter @Setter private char[] para2200300 = new char[30];

						@Getter @Setter private char[] wrongEditAbendCode300 = new char[4];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

						@Getter @Setter private char[] ptrIp200100800 = new char[8];

						@Getter @Setter private char[] ptrIp381120800 = new char[8];

								@Getter @Setter private short candidateTagType800;

						@Getter @Setter private char[] syntaxPgmPtr800 = Field.fillLowValue(8);

								@Getter @Setter private short holdReturnCode800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsCandidatePresent100(("N").toCharArray());
								setIsSubfldCheckOver100(("N").toCharArray());
								setEdit0009300(("IP200090").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xF5,(byte)0x65,(byte)0x01,(byte)0xD9,(byte)0xFB,(byte)0x00}).toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp200100300(("IP200100").toCharArray());
								setPgmIp381120300(("IP381120").toCharArray());
								setValueX300(("X").toCharArray());
								setValueY300(("Y").toCharArray());
								setValue1643300((short)1643);
								setValue1659300((short)1659);
								setValue1441300((short)1441);
								setValue1811300((short)1811);
								setValue1813300((short)1813);
								setPara2200300(("2200-SET-EDIT-PROGRAM-POINTER ").toCharArray());
								setWrongEditAbendCode300(("3001").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setPtrIp200100800(("IP200100").toCharArray());
								setPtrIp381120800(("IP381120").toCharArray());
								setCandidateTagType800((short)0);
    }





}
  
