package com.cloudframe.app.ip670010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItFirstTime100 = new char[1];

						@Getter @Setter private char[] isItLeapYear100 = new char[1];

						@Getter @Setter private char[] ip670010300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

								@Getter @Setter private int value1300;

								@Getter @Setter private int value2300;

								@Getter @Setter private int value4300;

								@Getter @Setter private int value5300;

								@Getter @Setter private int value7300;

								@Getter @Setter private int value11300;

								@Getter @Setter private int value12300;

								@Getter @Setter private int value19300;

								@Getter @Setter private int value20300;

								@Getter @Setter private int value29300;

								@Getter @Setter private int value28300;

								@Getter @Setter private int value49300;

								@Getter @Setter private int value97300;

								@Getter @Setter private int value98300;

								@Getter @Setter private int value99300;

								@Getter @Setter private int value100300;

								@Getter @Setter private int value365300;

								@Getter @Setter private int value366300;

								@Getter @Setter private int value400300;

						@Getter @Setter private char[] invalidCallMessage600 = new char[50];

								@Getter @Setter private int validateMonth800;

								@Getter @Setter private long integerDate800;

								@Getter @Setter private long gregorianDateCal800;

								@Getter @Setter private long julianDateCal800;

								@Getter @Setter private int workYear801;

								@Getter @Setter private int workRemainder801;

								@Getter @Setter private int workYear2801;

								@Getter @Setter private int workRemainder2801;

								@Getter @Setter private int workYear3801;

								@Getter @Setter private int workHr800;

								@Getter @Setter private int workMin800;

								@Getter @Setter private int workOffsetHr800;

								@Getter @Setter private int workOffsetMin800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItFirstTime100(("Y").toCharArray());
								setIsItLeapYear100(fillSpace(1));
								setIp670010300(("IP670010").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xB2,(byte)0x73,(byte)0x01,(byte)0x8E,(byte)0xF0,(byte)0x00}).toCharArray());
								setValue1300(1);
								setValue2300(2);
								setValue4300(4);
								setValue5300(5);
								setValue7300(7);
								setValue11300(11);
								setValue12300(12);
								setValue19300(19);
								setValue20300(20);
								setValue29300(29);
								setValue28300(28);
								setValue49300(49);
								setValue97300(97);
								setValue98300(98);
								setValue99300(99);
								setValue100300(100);
								setValue365300(365);
								setValue366300(366);
								setValue400300(400);
								setInvalidCallMessage600(("IP670010: INVALID CALL. NO FUNCTIONALITY REQUESTED").toCharArray());
								setIntegerDate800(0L);
								setGregorianDateCal800(0L);
								setJulianDateCal800(0L);
								setWorkOffsetMin800(0);
    }





}
  
