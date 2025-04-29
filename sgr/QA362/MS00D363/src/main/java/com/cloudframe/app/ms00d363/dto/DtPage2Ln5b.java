package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln5b is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage2Ln5b extends DtPage2Ln5bSerialized {
   

						@Getter @Setter private char[] dt25bCc = new char[1];




						@Getter @Setter private char[] dt25bRevDbAmt = Field.fillLowValue(18);



						@Getter @Setter private char[] dt25bRevCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln5b
	**/
    public DtPage2Ln5b() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt25bCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 1
             ,3
             );
       replaceValue( // serialize and save the value
             ("NON-SAME DAY            ").toCharArray()
             , getStartOffset() + 4
             ,24
             );
       replaceValue( // serialize and save the value
             fillSpace(20)
             , getStartOffset() + 28
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 66
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(17)
             , getStartOffset() + 70
             ,17
             );
       replaceValue( // serialize and save the value
             fillSpace(31)
             , getStartOffset() + 105
             ,31
             );
    }





}
  
