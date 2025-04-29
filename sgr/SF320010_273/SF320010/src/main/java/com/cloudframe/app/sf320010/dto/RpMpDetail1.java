package com.cloudframe.app.sf320010.dto;

/**
*  The class RpMpDetail1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpMpDetail1 extends RpMpDetail1Serialized {
   

						@Getter @Setter private char[] rpMpCc1 = new char[1];


						@Getter @Setter private char[] rpMpMipId = Field.fillLowValue(3);


						@Getter @Setter private char[] rpMpLogDate = Field.fillLowValue(6);


						@Getter @Setter private char[] rpMpLogTime = Field.fillLowValue(6);


						@Getter @Setter private char[] rpMpRclFileInd = Field.fillLowValue(1);


						@Getter @Setter private char[] rpMpNegFileAvailInd = Field.fillLowValue(1);


						@Getter @Setter private char[] rpMpMbrDelayFileInd = Field.fillLowValue(1);


						@Getter @Setter private char[] rpMpLocalNegFileInd = Field.fillLowValue(1);

	
	/**
	* Constructor for RpMpDetail1
	**/
    public RpMpDetail1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpMpCc1("0".toCharArray());
       replaceValue( // serialize and save the value
             (" MIP ID - ").toCharArray()
             , getStartOffset() + 1
             ,10
             );
       replaceValue( // serialize and save the value
             ("      DATE - ").toCharArray()
             , getStartOffset() + 14
             ,13
             );
       replaceValue( // serialize and save the value
             ("      TIME - ").toCharArray()
             , getStartOffset() + 33
             ,13
             );
       replaceValue( // serialize and save the value
             ("  RCL AVL IND - ").toCharArray()
             , getStartOffset() + 52
             ,16
             );
       replaceValue( // serialize and save the value
             ("     NEG AVL IND - ").toCharArray()
             , getStartOffset() + 69
             ,19
             );
       replaceValue( // serialize and save the value
             ("        DELAY IND - ").toCharArray()
             , getStartOffset() + 89
             ,20
             );
       replaceValue( // serialize and save the value
             ("     NEG SUPPORT - ").toCharArray()
             , getStartOffset() + 110
             ,19
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 130
             ,3
             );
    }





}
  
