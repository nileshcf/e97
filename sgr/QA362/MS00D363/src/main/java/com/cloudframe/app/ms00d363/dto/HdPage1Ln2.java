package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln2 extends HdPage1Ln2Serialized {
   

						@Getter @Setter private char[] hd12Cc = new char[1];


						@Getter @Setter private char[] hd12MceMsg = new char[3];

						@Getter @Setter private char[] hd12DailyMon = new char[11];




						@Getter @Setter private char[] hd13CntryName = new char[9];

						@Getter @Setter private char[] hd13Country = new char[3];


						@Getter @Setter private char[] hd1DateMsg = new char[10];

								@Getter @Setter private int hd12Mm;


								@Getter @Setter private int hd12Dd;


								@Getter @Setter private int hd12Yy;

	
	/**
	* Constructor for HdPage1Ln2
	**/
    public HdPage1Ln2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd12Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(49)
             , getStartOffset() + 1
             ,49
             );
								setHd12MceMsg(fillSpace(3));
								setHd12DailyMon(("      DAILY").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 64
             ,1
             );
       replaceValue( // serialize and save the value
             ("CONTROL REPORT").toCharArray()
             , getStartOffset() + 65
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 79
             ,6
             );
								setHd13CntryName(("COUNTRY: ").toCharArray());
								setHd13Country(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 97
             ,17
             );
								setHd1DateMsg((" WORK OF: ").toCharArray());
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 126
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 129
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 132
             ,1
             );
    }





}
  
