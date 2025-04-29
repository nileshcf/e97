package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage3Ln8 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage3Ln8 extends DtPage3Ln8Serialized {
   

						@Getter @Setter private char[] dt38Cc = new char[1];




						@Getter @Setter private char[] dt38IsstotDbAmt = Field.fillLowValue(24);


						@Getter @Setter private char[] dt38IsstotCrAmt = Field.fillLowValue(24);


						@Getter @Setter private char[] dt38IsstotNetAmt = Field.fillLowValue(24);


						@Getter @Setter private char[] dt38IsstotInd = new char[2];

	
	/**
	* Constructor for DtPage3Ln8
	**/
    public DtPage3Ln8() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt38Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("TOTAL ISSUER    ").toCharArray()
             , getStartOffset() + 2
             ,16
             );
       replaceValue( // serialize and save the value
             fillSpace(14)
             , getStartOffset() + 18
             ,14
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 56
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 87
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 115
             ,2
             );
								setDt38IsstotInd(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(13)
             , getStartOffset() + 119
             ,13
             );
    }





}
  
