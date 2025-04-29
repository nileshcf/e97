package com.cloudframe.app.ip343690.dto;

/**
*  The class Constants300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Constants300 extends Constants300Serialized {
   

						@Getter @Setter private char[] returnCode300 = new char[4];

						@Getter @Setter private char[] pgmVersion300 = new char[7];
				@Getter @Setter private PgmIp343690Group300 pgmIp343690Group300 = new PgmIp343690Group300();

						@Getter @Setter private char[] pgmIp081110300 = new char[8];

						@Getter @Setter private char[] pgmIp599810300 = new char[8];

						@Getter @Setter private char[] pgmIp280010300 = new char[8];

						@Getter @Setter private char[] pgmIp610010300 = new char[8];

						@Getter @Setter private char[] pgmMcwait300 = new char[6];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] thisPgmDb2CollIdBase300 = new char[7];

								@Getter @Setter private short valueZero300;

								@Getter @Setter private short value01300;

								@Getter @Setter private short value100300;

								@Getter @Setter private int sql100300;

								@Getter @Setter private int sql904300;

								@Getter @Setter private int sql911300;

								@Getter @Setter private short cond0000300;

								@Getter @Setter private int value1300;

								@Getter @Setter private short nullValue300;

								@Getter @Setter private int value14300;

								@Getter @Setter private int value19300;

								@Getter @Setter private int value99300;

						@Getter @Setter private char[] errorValue300 = new char[1];

								@Getter @Setter private int valueRetry300;

						@Getter @Setter private char[] sys001OpAbendCode300 = new char[4];

						@Getter @Setter private char[] sys001RdAbendCode300 = new char[4];

						@Getter @Setter private char[] sys001ClAbendCode300 = new char[4];

						@Getter @Setter private char[] fetchPmaAbendCode300 = new char[4];

						@Getter @Setter private char[] openTipapmaCursor300 = new char[4];

						@Getter @Setter private char[] closeTipapmaCursor300 = new char[4];
	
	/**
	* Constructor for Constants300
	**/
    public Constants300() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPgmIp343690Group300().setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
								setReturnCode300(("9999").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0x3D,(byte)0xA8,(byte)0x00,(byte)0x8B,(byte)0x2A,(byte)0x00}).toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp599810300(("IP599810").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setPgmMcwait300(("MCWAIT").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setThisPgmDb2CollIdBase300(("COLLIPA").toCharArray());
								setValueZero300((short)0);
								setValue01300((short)1);
								setValue100300((short)100);
								setSql100300(100);
								setSql904300(-904);
								setSql911300(-911);
								setCond0000300((short)0);
								setValue1300(1);
								setNullValue300((short)-1);
								setValue14300(14);
								setValue19300(19);
								setValue99300(99);
								setErrorValue300(("1").toCharArray());
								setValueRetry300(5);
								setSys001OpAbendCode300(("3002").toCharArray());
								setSys001RdAbendCode300(("3003").toCharArray());
								setSys001ClAbendCode300(("3004").toCharArray());
								setFetchPmaAbendCode300(("3006").toCharArray());
								setOpenTipapmaCursor300(("3007").toCharArray());
								setCloseTipapmaCursor300(("3008").toCharArray());
    }





}
  
