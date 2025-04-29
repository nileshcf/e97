package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC8Detail1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpC8Detail1 extends RpC8Detail1Serialized {
   

						@Getter @Setter private char[] rpC8Det1Cc = Field.fillLowValue(1);


						@Getter @Setter private char[] rpC8Det1Alert = Field.fillLowValue(8);


						@Getter @Setter private char[] rpC8Det1RemMipId = Field.fillLowValue(3);


						@Getter @Setter private char[] rpC8Det1OperId = Field.fillLowValue(7);


						@Getter @Setter private char[] rpC8Det1LogDate = Field.fillLowValue(8);


						@Getter @Setter private char[] rpC8Det1LogTime = Field.fillLowValue(8);


						@Getter @Setter private char[] rpC8Det1LocMipId = Field.fillLowValue(3);


						@Getter @Setter private char[] rpC8Det1LogType = Field.fillLowValue(1);


						@Getter @Setter private char[] rpC8Det1LogDesc = Field.fillLowValue(45);

	
	/**
	* Constructor for RpC8Detail1
	**/
    public RpC8Detail1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 1
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 15
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 25
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 35
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 46
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 56
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 62
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(6)
             , getStartOffset() + 70
             ,6
             );
       replaceValue( // serialize and save the value
             fillSpace(11)
             , getStartOffset() + 121
             ,11
             );
    }





}
  
