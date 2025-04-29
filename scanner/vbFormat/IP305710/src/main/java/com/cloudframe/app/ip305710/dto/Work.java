package com.cloudframe.app.ip305710.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] ip305710300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] pgmIp610010300 = new char[8];

								@Getter @Setter private long maxLength300;

								@Getter @Setter private int maxRrnLimit300;

						@Getter @Setter private char[] abendCd3003300 = new char[4];

						@Getter @Setter private char[] tableId300 = new char[8];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] para2100300 = new char[30];

						@Getter @Setter private char[] uniqMaxCabPtrErrorCd610 = new char[4];

						@Getter @Setter private char[] uniqMaxCabPtrErrorMsg610 = new char[52];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

								@Getter @Setter private int rrnNbr800;

								@Getter @Setter private int entryLength800;

								@Getter @Setter private long start800;

								@Getter @Setter private int length800;

								@Getter @Setter private long currPtrLngth800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIp305710300(("IP305710").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setMaxLength300(27951L);
								setMaxRrnLimit300(65);
								setAbendCd3003300(("3003").toCharArray());
								setTableId300(("IP0057T1").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x00,(byte)0xEB,(byte)0xA1,(byte)0x01,(byte)0x91,(byte)0x2D,(byte)0x00}).toCharArray());
								setPara2100300(("2100-SAVE-TABLE-ENTRY         ").toCharArray());
								setUniqMaxCabPtrErrorCd610(("3002").toCharArray());
								setUniqMaxCabPtrErrorMsg610(("UNIQUE CAB PTR TABLE OVERFLOW (100000 MAX).         ").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setRrnNbr800(0);
								setEntryLength800(0);
								setStart800(1L);
								setLength800(0);
								setCurrPtrLngth800(0L);
    }





}
  
