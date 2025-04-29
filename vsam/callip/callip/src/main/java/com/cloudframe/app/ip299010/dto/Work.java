package com.cloudframe.app.ip299010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short ip00054wEntries;

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] areTableRecordsOver100 = new char[1];

						@Getter @Setter private char[] isTblidFndIntable5100 = new char[1];

						@Getter @Setter private char[] isTableKeyFound100 = new char[1];

								@Getter @Setter private int valueOne300;

						@Getter @Setter private char[] tableId300 = new char[8];

						@Getter @Setter private char[] pgmIp650010300 = new char[8];

						@Getter @Setter private char[] tblOverflowAbendCode300 = new char[4];

						@Getter @Setter private char[] recAbsentAbendCode300 = new char[4];

						@Getter @Setter private char[] recLengthAbendCode300 = new char[4];

						@Getter @Setter private char[] tblEntryAbendCode300 = new char[4];

						@Getter @Setter private char[] para1220300 = new char[26];

						@Getter @Setter private char[] para122110300 = new char[28];

						@Getter @Setter private char[] para122111300 = new char[26];

						@Getter @Setter private char[] para2210300 = new char[26];

								@Getter @Setter private int checkCount400;

								@Getter @Setter private int recordsLoaded400;

								@Getter @Setter private int startPoint400;

						@Getter @Setter private char[] tableOverflowError600 = new char[27];

						@Getter @Setter private char[] recNotFoundMsg610 = new char[32];

						@Getter @Setter private char[] ptrIp650010800 = new char[8];

								@Getter @Setter private int recordLength800;

								@Getter @Setter private int recordCount800;

								@Getter @Setter private int rowLength800;

								@Getter @Setter private int remainder800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp00054wEntries((short)2000);
								setIsItTheFirstTime100(("Y").toCharArray());
								setAreTableRecordsOver100(("N").toCharArray());
								setIsTblidFndIntable5100(("Y").toCharArray());
								setIsTableKeyFound100(("Y").toCharArray());
								setValueOne300(1);
								setTableId300(("IP0005T1").toCharArray());
								setPgmIp650010300(("IP650010").toCharArray());
								setTblOverflowAbendCode300(("3001").toCharArray());
								setRecAbsentAbendCode300(("3002").toCharArray());
								setRecLengthAbendCode300(("3003").toCharArray());
								setTblEntryAbendCode300(("3004").toCharArray());
								setPara1220300(("1220-GET-FROM-ONE-DAY-FILE").toCharArray());
								setPara122110300(("1221-10-CHECK-ONEDAY-REC-LEN").toCharArray());
								setPara122111300(("1221-11-CHECK-TABLE-LIMIT ").toCharArray());
								setPara2210300(("2210-ABEND-FOR-TBL-ABSENT ").toCharArray());
								setCheckCount400(0);
								setRecordsLoaded400(0);
								setStartPoint400(1);
								setTableOverflowError600((" IP0005T1 TABLE OVER FLOW. ").toCharArray());
								setRecNotFoundMsg610(("NO TABLE IP0005T1 RECORDS FOUND.").toCharArray());
								setPtrIp650010800(("IP650010").toCharArray());
								setRecordLength800(0);
								setRecordCount800(0);
								setRowLength800(0);
								setRemainder800(0);
    }





}
  
