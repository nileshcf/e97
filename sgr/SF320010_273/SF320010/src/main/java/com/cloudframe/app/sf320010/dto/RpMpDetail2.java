package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpMpDetail2 extends RpMpDetail2Serialized {
   

						@Getter @Setter private char[] rpMpCc2 = new char[1];


								@Getter @Setter private char[] rpMpIssFloorLim2Retail = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIssFloorLim2Travel = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIssFloorLim2Cash = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpPosRetailLimit = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpPosTravelLimit = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpPosCashLimit = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpXCodeLimit = Field.fillLowValue(4);
	
	/**
	* Constructor for RpMpDetail2
	**/
    public RpMpDetail2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc2(fillSpace(1));
       replaceValue( // serialize and save the value
             ("RET LIM - ").toCharArray()
             , getStartOffset() + 1
             ,10
             );
       replaceValue( // serialize and save the value
             ("  T&E LIM - ").toCharArray()
             , getStartOffset() + 15
             ,12
             );
       replaceValue( // serialize and save the value
             ("    CASH LIM - ").toCharArray()
             , getStartOffset() + 31
             ,15
             );
       replaceValue( // serialize and save the value
             ("    POS RET LIM - ").toCharArray()
             , getStartOffset() + 50
             ,18
             );
       replaceValue( // serialize and save the value
             ("  POS T&E LIM - ").toCharArray()
             , getStartOffset() + 72
             ,16
             );
       replaceValue( // serialize and save the value
             ("  POS CASH LIM - ").toCharArray()
             , getStartOffset() + 92
             ,17
             );
       replaceValue( // serialize and save the value
             ("   X-CODE LIM - ").toCharArray()
             , getStartOffset() + 113
             ,16
             );
    }





}
  
