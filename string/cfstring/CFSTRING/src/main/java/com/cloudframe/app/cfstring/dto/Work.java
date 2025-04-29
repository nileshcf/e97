package com.cloudframe.app.cfstring.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] string1 = new char[55];

						@Getter @Setter private char[] string2 = new char[55];

						@Getter @Setter private char[] holdString = new char[55];

								@Getter @Setter private int cnt1;

								@Getter @Setter private char[] edit = Field.fillLowValue(5);

						@Getter @Setter private char[] parm1 = new char[30];

						@Getter @Setter private char[] parm2 = new char[30];

						@Getter @Setter private char[] parm3 = new char[30];

						@Getter @Setter private char[] parm4 = new char[30];

						@Getter @Setter private char[] parm5 = new char[30];

						@Getter @Setter private char[] parm6 = new char[30];

								@Getter @Setter private int p1Cnt;

								@Getter @Setter private int p2Cnt;

								@Getter @Setter private int p3Cnt;

								@Getter @Setter private int p4Cnt;

								@Getter @Setter private int p5Cnt;

								@Getter @Setter private int p6Cnt;

						@Getter @Setter private char[] delimRec = Field.fillLowValue(1761);

								@Getter @Setter private short len;

						@Getter @Setter private char[] svcIdNoP1 = new char[7];

						@Getter @Setter private char[] svcIdNoP2 = new char[18];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setString1(("PARM1 1%PARM2%  PARM3-ABC%PARM4-XYZ%CloudFrame!!!!     ").toCharArray());
								setString2(fillSpace(55));
								setHoldString(fillSpace(55));
								setCnt1(0);
								setParm1(fillSpace(30));
								setParm2(fillSpace(30));
								setParm3(fillSpace(30));
								setParm4(fillSpace(30));
								setParm5(fillSpace(30));
								setParm6(fillSpace(30));
								setLen((short)5);
								setSvcIdNoP1(("5432101").toCharArray());
								setSvcIdNoP2(("13445             ").toCharArray());
    }





}
  
