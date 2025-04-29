package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln9 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage2Ln9 extends DtPage2Ln9Serialized {
   

						@Getter @Setter private char[] dt29Cc = new char[1];



								@Getter @Setter private char[] dt29SurchgNbr = Field.fillLowValue(15);







	
	/**
	* Constructor for DtPage2Ln9
	**/
    public DtPage2Ln9() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt29Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("SURCHARGE FREE            ").toCharArray()
             , getStartOffset() + 2
             ,26
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 43
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 48
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 63
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 67
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 82
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(15)
             , getStartOffset() + 87
             ,15
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 102
             ,31
             );
    }





}
  
