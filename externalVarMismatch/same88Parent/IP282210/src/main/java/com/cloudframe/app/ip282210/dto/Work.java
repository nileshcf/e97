package com.cloudframe.app.ip282210.dto;

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
   

								@Getter @Setter private short ip02014wEntries;

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] areLpaRecOver100 = new char[1];

						@Getter @Setter private char[] keyEntryFound100 = new char[1];

								@Getter @Setter private int valueOne300;

						@Getter @Setter private char[] lpaLoader300 = new char[8];

						@Getter @Setter private char[] tableId300 = new char[8];

						@Getter @Setter private char[] tableName300 = new char[35];

						@Getter @Setter private char[] pgmVersion300 = new char[7];

						@Getter @Setter private char[] pgmIp299010300 = new char[8];

						@Getter @Setter private char[] pgmIp650010300 = new char[8];

						@Getter @Setter private char[] pgmIp996010300 = new char[8];

						@Getter @Setter private char[] abendPgm300 = new char[8];

						@Getter @Setter private char[] tblOverflowAbendCode300 = new char[4];

						@Getter @Setter private char[] recLengthAbendCode300 = new char[4];

						@Getter @Setter private char[] noTable201InOdf300 = new char[4];

						@Getter @Setter private char[] para1311300 = new char[28];

						@Getter @Setter private char[] para131112300 = new char[26];

						@Getter @Setter private char[] para131111300 = new char[28];

								@Getter @Setter private int checkCount400;

								@Getter @Setter private int rowsLoaded400;

								@Getter @Setter private int rowCount400;

								@Getter @Setter private int startPoint400;

						@Getter @Setter private char[] ip02014TblOverflowErr600 = new char[63];

						@Getter @Setter private char[] table201AbsentInOdf610 = new char[48];

						@Getter @Setter private char[] ptrIp299010800 = new char[8];

						@Getter @Setter private char[] ptrIp650010800 = new char[8];

						@Getter @Setter private char[] ptrIp996010800 = new char[8];

						@Getter @Setter private char[] abendPtr800 = new char[8];

						@Getter @Setter private char[] clearingDtTm800 = new char[10];

						@Getter @Setter private char[] lastKeyDtTm800 = new char[10];

								@Getter @Setter private int recordLength800;

								@Getter @Setter private int remainder800;

								@Getter @Setter private int rowCount800;

								@Getter @Setter private int rowLength800;

						@Getter @Setter private char[] astriskLine900 = new char[35];

						@Getter @Setter private char[] abendAbend900 = new char[35];

						@Getter @Setter private char[] abendAbendPgm900 = new char[35];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp02014wEntries((short)50);
								setIsItTheFirstTime100(("Y").toCharArray());
								setAreLpaRecOver100(("N").toCharArray());
								setKeyEntryFound100(("N").toCharArray());
								setValueOne300(1);
								setLpaLoader300(("IP282210").toCharArray());
								setTableId300(("IP0201T1").toCharArray());
								setTableName300(("LPA TABLE                          ").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0xD7,(byte)0x2D,(byte)0x01,(byte)0x12,(byte)0xD2,(byte)0x00}).toCharArray());
								setPgmIp299010300(("IP299010").toCharArray());
								setPgmIp650010300(("IP650010").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setAbendPgm300(("IP610010").toCharArray());
								setTblOverflowAbendCode300(("3001").toCharArray());
								setRecLengthAbendCode300(("3002").toCharArray());
								setNoTable201InOdf300(("3003").toCharArray());
								setPara1311300(("1311-GET-FROM-ONE-DAY-FILE  ").toCharArray());
								setPara131112300(("1311-12-CHECK-TABLE-LIMIT ").toCharArray());
								setPara131111300(("1311-11-CHECK-ONEDAY-REC-LEN").toCharArray());
								setCheckCount400(0);
								setRowsLoaded400(0);
								setRowCount400(0);
								setStartPoint400(1);
								setIp02014TblOverflowErr600(" MORE THAN 9999 ENTRIES FOUND IN TABLE 201                     ".toCharArray());
								setTable201AbsentInOdf610(("NO TABLE IP0201T1 RECORDS FOUND IN ONE-DAY-FILE ").toCharArray());
								setPtrIp299010800(("IP299010").toCharArray());
								setPtrIp650010800(("IP650010").toCharArray());
								setPtrIp996010800(("IP996010").toCharArray());
								setAbendPtr800(("IP610010").toCharArray());
								setClearingDtTm800(fillSpace(10));
								setLastKeyDtTm800(fillSpace(10));
								setRecordLength800(0);
								setRemainder800(0);
								setRowCount800(0);
								setRowLength800(0);
								setAstriskLine900(("***********************************").toCharArray());
								setAbendAbend900(("A B E N D   A B E N D   A B E N D  ").toCharArray());
								setAbendAbendPgm900(("A B E N D   I P 2 8 2 2 1 0        ").toCharArray());
    }





}
  
