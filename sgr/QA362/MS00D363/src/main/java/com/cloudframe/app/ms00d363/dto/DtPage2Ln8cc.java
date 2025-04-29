package com.cloudframe.app.ms00d363.dto;

/**
*  The class DtPage2Ln8cc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtPage2Ln8cc extends DtPage2Ln8ccSerialized {
   

						@Getter @Setter private char[] dt28ccCc = new char[1];



								@Getter @Setter private char[] dt28ccPosDbNbr = Field.fillLowValue(15);


						@Getter @Setter private char[] dt28ccPosDbAmt = Field.fillLowValue(18);


								@Getter @Setter private char[] dt28ccPosCrNbr = Field.fillLowValue(15);


						@Getter @Setter private char[] dt28ccPosCrAmt = Field.fillLowValue(18);

	
	/**
	* Constructor for DtPage2Ln8cc
	**/
    public DtPage2Ln8cc() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDt28ccCc(("-").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("ACCESS CHARGE(POS SUR) REV").toCharArray()
             , getStartOffset() + 2
             ,26
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
             fillSpace(29)
             , getStartOffset() + 102
             ,29
             );
    }





}
  
