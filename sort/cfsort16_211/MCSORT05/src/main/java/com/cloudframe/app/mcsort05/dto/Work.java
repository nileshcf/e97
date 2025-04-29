package com.cloudframe.app.mcsort05.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] pgmMcsort05300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] endOfStepMsg301 = new char[45];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xB0,(byte)0x7F,(byte)0x01,(byte)0x13,(byte)0x28,(byte)0x00}).toCharArray());
								setPgmMcsort05300(("MCSORT05").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setEndOfStepMsg301(("MCSORT05-9999-END OF STEP, CONDITION CODE =  ").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }





}
  
