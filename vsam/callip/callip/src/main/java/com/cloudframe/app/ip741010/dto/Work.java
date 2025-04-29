package com.cloudframe.app.ip741010.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private short ip000904PdsSubMax;

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] haveWeLoadedATable100 = new char[1];

						@Getter @Setter private char[] table8Id300 = new char[8];

						@Getter @Setter private char[] table9Id300 = new char[8];

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

						@Getter @Setter private char[] currentDateTime800 = Field.fillLowValue(10);

								@Getter @Setter private int tableMaxLength800;

								@Getter @Setter private int maxT9RowNo800;

								@Getter @Setter private int currentPdsNo800;

								@Getter @Setter private int checkLength800;

								@Getter @Setter private int rowLength800;

								@Getter @Setter private int rowCount800;

								@Getter @Setter private int remainder800;

						@Getter @Setter private char[] clearingDtTm800 = new char[10];

						@Getter @Setter private char[] lastKeyDtTmT8800 = new char[10];

						@Getter @Setter private char[] lastKeyDtTmT9800 = new char[10];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIp000904PdsSubMax((short)2000);
								setIsItTheFirstTime100(("Y").toCharArray());
								setHaveWeLoadedATable100(("N").toCharArray());
								setTable8Id300(("IP0008T1").toCharArray());
								setTable9Id300(("IP0009T1").toCharArray());
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
								setMaxT9RowNo800(0);
								setCurrentPdsNo800(0);
								setCheckLength800(0);
								setRowLength800(0);
								setRowCount800(0);
								setRemainder800(0);
								setClearingDtTm800(fillHighValue(10));
								setLastKeyDtTmT8800(fillHighValue(10));
								setLastKeyDtTmT9800(fillHighValue(10));
    }





}
  
