package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpMpDetail4 extends RpMpDetail4Serialized {
   

						@Getter @Setter private char[] rpMpCc4 = new char[1];


								@Getter @Setter private char[] rpMpIpq1 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq2 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq3 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq4 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq5 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq6 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq7 = Field.fillLowValue(4);

	
	/**
	* Constructor for RpMpDetail4
	**/
    public RpMpDetail4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc4(fillSpace(1));
       replaceValue( // serialize and save the value
             (" IPQ1 - ").toCharArray()
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("   IPQ2 - ").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ3 - ").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ4 - ").toCharArray()
             , getStartOffset() + 41
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ5 - ").toCharArray()
             , getStartOffset() + 55
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ6 - ").toCharArray()
             , getStartOffset() + 69
             ,10
             );
       replaceValue( // serialize and save the value
             ("   IPQ7 - ").toCharArray()
             , getStartOffset() + 83
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(36)
             , getStartOffset() + 97
             ,36
             );
    }





}
  
