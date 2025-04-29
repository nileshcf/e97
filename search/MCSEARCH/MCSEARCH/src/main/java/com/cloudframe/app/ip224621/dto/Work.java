package com.cloudframe.app.ip224621.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] isCombinationFound100 = new char[1];

						@Getter @Setter private char[] isOccurrenceValid100 = new char[1];

								@Getter @Setter private int valueOne300;

								@Getter @Setter private int valueFifty300;

						@Getter @Setter private char[] tblOverflowAbendCode300 = new char[4];

						@Getter @Setter private char[] para2111300 = new char[26];

						@Getter @Setter private char[] tableOverflowError600 = new char[48];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setIsCombinationFound100(("Y").toCharArray());
								setIsOccurrenceValid100(("Y").toCharArray());
								setValueOne300(1);
								setValueFifty300(50);
								setTblOverflowAbendCode300(("3001").toCharArray());
								setPara2111300(("2111-ABEND-ON-TBL-OVERFLOW").toCharArray());
								setTableOverflowError600((" PDS501S1 AND S2 COMBINATIONS TABLE OVER FLOW.  ").toCharArray());
    }





}
  
