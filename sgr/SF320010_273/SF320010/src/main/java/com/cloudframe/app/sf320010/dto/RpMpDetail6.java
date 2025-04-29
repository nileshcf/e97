package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpMpDetail6 extends RpMpDetail6Serialized {
   

						@Getter @Setter private char[] rpMpCc6 = new char[1];


								@Getter @Setter private char[] rpMpIpq15 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq16 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq17 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq18 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq19 = Field.fillLowValue(4);


								@Getter @Setter private char[] rpMpIpq20 = Field.fillLowValue(4);

	
	/**
	* Constructor for RpMpDetail6
	**/
    public RpMpDetail6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc6(fillSpace(1));
       replaceValue( // serialize and save the value
             ("IPQ15 - ").toCharArray()
             , getStartOffset() + 1
             ,8
             );
       replaceValue( // serialize and save the value
             ("  IPQ16 - ").toCharArray()
             , getStartOffset() + 13
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ17 - ").toCharArray()
             , getStartOffset() + 27
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ18 - ").toCharArray()
             , getStartOffset() + 41
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ19 - ").toCharArray()
             , getStartOffset() + 55
             ,10
             );
       replaceValue( // serialize and save the value
             ("  IPQ20 - ").toCharArray()
             , getStartOffset() + 69
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(50)
             , getStartOffset() + 83
             ,50
             );
    }





}
  
