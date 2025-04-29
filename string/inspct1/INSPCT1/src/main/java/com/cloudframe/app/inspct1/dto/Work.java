package com.cloudframe.app.inspct1.dto;

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
   

								@Getter @Setter private short sub1;

								@Getter @Setter private short sub2;

								@Getter @Setter private int sub3;

								@Getter @Setter private char[] subEdt = Field.fillLowValue(9);

						@Getter @Setter private char[] searchPredicate = new char[300];

						@Getter @Setter private char[] searchPredicate2 = new char[300];

						@Getter @Setter private char[] convrtPredicate = new char[300];

						@Getter @Setter private char[] replacPredicate = new char[300];

						@Getter @Setter private char[] parm = Field.fillLowValue(30);

						@Getter @Setter private char[] counterLine = Field.fillLowValue(80);

						@Getter @Setter private char[] xmlSegment = Field.fillLowValue(80);

								@Getter @Setter private short ltCount;

								@Getter @Setter private short floatPlusCount;

								@Getter @Setter private short floatMinusCount;

								@Getter @Setter private short floatDollarCount;

								@Getter @Setter private short htmlMLength;

						@Getter @Setter private char[] lessthan = new char[1];

						@Getter @Setter private char[] greaterthan = new char[1];

						@Getter @Setter private char[] ampersand = new char[1];

						@Getter @Setter private char[] apostrophe = new char[1];

						@Getter @Setter private char[] doublquote = new char[2];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSub1((short)0);
								setSub2((short)0);
								setSub3(0);
								setSearchPredicate("12346789%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setSearchPredicate2("12%46%89%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setConvrtPredicate("12346789%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setReplacPredicate("12346789%123456789%123456789%123456789%1234567890                     23456789%12                                                                                                                                                                                                                           ".toCharArray());
								setLessthan(("<").toCharArray());
								setGreaterthan((">").toCharArray());
								setAmpersand(("&").toCharArray());
								setApostrophe(("'").toCharArray());
								setDoublquote(("\" ").toCharArray());
    }





}
  
