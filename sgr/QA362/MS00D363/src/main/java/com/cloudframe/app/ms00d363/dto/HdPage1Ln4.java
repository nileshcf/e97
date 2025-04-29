package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HdPage1Ln4 extends HdPage1Ln4Serialized {
   

						@Getter @Setter private char[] hd14Cc = new char[1];




						@Getter @Setter private char[] hd14InstId = new char[10];


						@Getter @Setter private char[] hd14InstDesc = new char[25];


						@Getter @Setter private char[] hd14BinNumber = new char[12];


						@Getter @Setter private char[] hd14BinId = new char[11];

	
	/**
	* Constructor for HdPage1Ln4
	**/
    public HdPage1Ln4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd14Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("INSTITUTION ID     :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd14InstId(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 33
             ,1
             );
								setHd14InstDesc(fillSpace(25));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 59
             ,3
             );
								setHd14BinNumber(("BIN NUMBER :").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 74
             ,1
             );
								setHd14BinId(fillSpace(11));
       replaceValue( // serialize and save the value
             fillSpace(18)
             , getStartOffset() + 86
             ,18
             );
    }





}
  
