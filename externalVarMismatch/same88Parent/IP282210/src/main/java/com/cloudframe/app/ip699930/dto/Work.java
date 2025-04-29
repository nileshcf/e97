package com.cloudframe.app.ip699930.dto;

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
   

						@Getter @Setter private char[] startOfLoopSw100 = new char[1];

						@Getter @Setter private char[] processAgreementFoundSw100 = new char[1];

						@Getter @Setter private char[] systemApplFoundSw100 = new char[1];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

								@Getter @Setter private int value1300;

						@Getter @Setter private char[] pgmIp282210300 = new char[8];

						@Getter @Setter private char[] pgmIp699930300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] missingProcessAgrmtMsg600 = new char[28];

						@Getter @Setter private char[] missingApplSystemIdMsg600 = new char[29];

						@Getter @Setter private char[] noProcessingAgrmntsMsg600 = new char[44];

						@Getter @Setter private char[] ptrIp282210800 = new char[8];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setStartOfLoopSw100(("N").toCharArray());
								setProcessAgreementFoundSw100(("N").toCharArray());
								setSystemApplFoundSw100(("N").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xEB,(byte)0xA1,(byte)0x01,(byte)0x91,(byte)0x47,(byte)0x00}).toCharArray());
								setValue1300(1);
								setPgmIp282210300(("IP282210").toCharArray());
								setPgmIp699930300(("IP699930").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setMissingProcessAgrmtMsg600(("MISSING PROCESSING AGREEMENT").toCharArray());
								setMissingApplSystemIdMsg600(("MISSING SYSTEM APPLICATION ID").toCharArray());
								setNoProcessingAgrmntsMsg600(("NO PROCESSING AGREEMENTS IN THE ONE DAY FILE").toCharArray());
								setPtrIp282210800(("IP282210").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }





}
  
