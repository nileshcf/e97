package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage2Ln6 extends DtPage2Ln6Serialized {
   

						@Getter @Setter private char[] dt26Cc = new char[1];





						@Getter @Setter private char[] dt26FeeDbAmt = Field.fillLowValue(20);




						@Getter @Setter private char[] dt26FeeCrAmt = Field.fillLowValue(20);

	
	/**
	* Constructor for DtPage2Ln6
	**/
    public DtPage2Ln6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt26Cc(fillSpace(1));
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
             fillSpace(15)
             , getStartOffset() + 28
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 43
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 67
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 70
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 85
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(27)
             , getStartOffset() + 106
             ,27
             );
    }





}
  
