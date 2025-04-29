package com.cloudframe.app.ip313010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] saveTableId100 = Field.fillLowValue(8);

						@Getter @Setter private char[] saveEffDate100 = Field.fillLowValue(10);

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] ip313010300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

								@Getter @Setter private int length800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIp313010300(("IP313010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD6,(byte)0x63,(byte)0x01,(byte)0x19,(byte)0x79,(byte)0x00}).toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setLength800(0);
    }





}
  
