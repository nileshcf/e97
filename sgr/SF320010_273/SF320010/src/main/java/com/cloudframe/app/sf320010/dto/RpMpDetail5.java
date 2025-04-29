package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail5 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpMpDetail5 extends RpMpDetail5Serialized {
   

						@Getter @Setter private char[] rpMpCc5 = new char[1];


								@Getter @Setter private char[] rpMpIpq8 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq9 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq10 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq11 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq12 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq13 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq14 = Field.fillLowValue(4);

	
	/**
	* Constructor for RpMpDetail5
	**/
    public RpMpDetail5() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc5(fillSpace(1));
       replaceValue( // serialize and save the value
             (" IPQ8 - ").toCharArray()
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("   IPQ9 - ").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ10 - ").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ11 - ").toCharArray()
             , getStartOffset() + 41
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ12 - ").toCharArray()
             , getStartOffset() + 55
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ13 - ").toCharArray()
             , getStartOffset() + 69
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ14 - ").toCharArray()
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
  
