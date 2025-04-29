package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage2Ln4 extends DtPage2Ln4Serialized {
   

						@Getter @Setter private char[] dt24Cc = new char[1];



								@Getter @Setter private char[] dt24TrvDbNbr = Field.fillLowValue(15);


						@Getter @Setter private char[] dt24TrvDbAmt = Field.fillLowValue(18);


								@Getter @Setter private char[] dt24TrvCrNbr = Field.fillLowValue(15);


						@Getter @Setter private char[] dt24TrvCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln4
	**/
    public DtPage2Ln4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt24Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("SETTLEMENT              ").toCharArray()
             , getStartOffset() + 4
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 43
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 63
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 82
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 102
             ,31
             );
    }





}
  
