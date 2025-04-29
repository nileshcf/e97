package com.cloudframe.app.ip081100.dto;

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
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] pgmIp081050300 = new char[8];

						@Getter @Setter private char[] pgmIp081100300 = new char[8];

						@Getter @Setter private char[] pgmIp280010300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] ptrIp081050800 = new char[8];

						@Getter @Setter private char[] ptrIp280010800 = new char[8];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setPgmIp081050300(("IP081050").toCharArray());
								setPgmIp081100300(("IP081100").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD7,(byte)0x2D,(byte)0x00,(byte)0xF5,(byte)0x22,(byte)0x00}).toCharArray());
								setPtrIp081050800(("IP081050").toCharArray());
								setPtrIp280010800(("IP280010").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
    }





}
  
