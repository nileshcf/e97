package com.cloudframe.app.ip739010.dto;

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
   

								@Getter @Setter private short ip000704DeSubMax;

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] wasT6Loaded100 = new char[1];

						@Getter @Setter private char[] wasT7Loaded100 = new char[1];

						@Getter @Setter private char[] table6Id300 = new char[8];

						@Getter @Setter private char[] table6aId300 = new char[8];

						@Getter @Setter private char[] table7Id300 = new char[8];

						@Getter @Setter private char[] pgmIp650010300 = new char[8];

						@Getter @Setter private char[] pgmIp299010300 = new char[8];

						@Getter @Setter private char[] tblOverflowAbendCode300 = new char[4];

						@Getter @Setter private char[] recAbsentAbendCode300 = new char[4];

						@Getter @Setter private char[] tblIntegrityAbendCode300 = new char[4];

						@Getter @Setter private char[] para8100300 = new char[26];

						@Getter @Setter private char[] para8200300 = new char[26];

								@Getter @Setter private int startPoint400;

						@Getter @Setter private char[] ptrIp650010800 = new char[8];

						@Getter @Setter private char[] ptrIp299010800 = new char[8];

								@Getter @Setter private int tableMaxLength800;

								@Getter @Setter private int maxT6RowNo800;

								@Getter @Setter private int maxT6aRowNo800;

								@Getter @Setter private int maxT7RowNo800;

								@Getter @Setter private int currentDeNo800;

						@Getter @Setter private char[] currentDateTime800 = new char[10];

								@Getter @Setter private int checkLength800;

								@Getter @Setter private int rowLength800;

								@Getter @Setter private int rowCount800;

								@Getter @Setter private int remainder800;

						@Getter @Setter private char[] clearingDtTm800 = new char[10];

						@Getter @Setter private char[] lastKeyDtTmT6800 = new char[10];

						@Getter @Setter private char[] lastKeyDtTmT6a800 = new char[10];

						@Getter @Setter private char[] lastKeyDtTmT7800 = new char[10];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp000704DeSubMax((short)200);
								setIsItTheFirstTime100(("Y").toCharArray());
								setWasT6Loaded100(("N").toCharArray());
								setWasT7Loaded100(("N").toCharArray());
								setTable6Id300(("IP0006T1").toCharArray());
								setTable6aId300(("IP0006T2").toCharArray());
								setTable7Id300(("IP0007T1").toCharArray());
								setPgmIp650010300(("IP650010").toCharArray());
								setPgmIp299010300(("IP299010").toCharArray());
								setTblOverflowAbendCode300(("3001").toCharArray());
								setRecAbsentAbendCode300(("3002").toCharArray());
								setTblIntegrityAbendCode300(("3003").toCharArray());
								setPara8100300(("8100-GET-FROM-ONE-DAY-FILE").toCharArray());
								setPara8200300(("8200-CHECK-TABLE-LIMIT    ").toCharArray());
								setStartPoint400(1);
								setPtrIp650010800(("IP650010").toCharArray());
								setPtrIp299010800(("IP299010").toCharArray());
								setTableMaxLength800(0);
								setMaxT6RowNo800(0);
								setMaxT6aRowNo800(0);
								setMaxT7RowNo800(0);
								setCurrentDeNo800(0);
								setCurrentDateTime800(fillSpace(10));
								setCheckLength800(0);
								setRowLength800(0);
								setRowCount800(0);
								setRemainder800(0);
								setClearingDtTm800(fillHighValue(10));
								setLastKeyDtTmT6800(fillHighValue(10));
								setLastKeyDtTmT6a800(fillHighValue(10));
								setLastKeyDtTmT7800(fillHighValue(10));
    }





}
  
