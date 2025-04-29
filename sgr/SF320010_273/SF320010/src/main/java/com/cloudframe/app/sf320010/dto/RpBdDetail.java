package com.cloudframe.app.sf320010.dto;

/**
*  The class RpBdDetail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RpBdDetail extends RpBdDetailSerialized {
   

						@Getter @Setter private char[] rpBdCc = new char[1];


						@Getter @Setter private char[] rpBdBulkId = Field.fillLowValue(14);


						@Getter @Setter private char[] rpBdMipId = Field.fillLowValue(3);


						@Getter @Setter private char[] rpBdPathId = Field.fillLowValue(1);


						@Getter @Setter private char[] rpBdStatus = Field.fillLowValue(1);


						@Getter @Setter private char[] rpBdErrorCode = Field.fillLowValue(1);


						@Getter @Setter private char[] rpBdJulianDay = Field.fillLowValue(3);


						@Getter @Setter private char[] rpBdTime = Field.fillLowValue(6);


								@Getter @Setter private char[] rpBdNbr1kSpoolRcds = Field.fillLowValue(9);


								@Getter @Setter private char[] rpBdNbrBytesTrans = Field.fillLowValue(9);


								@Getter @Setter private char[] rpBdNbrBlocksTrans = Field.fillLowValue(9);

	
	/**
	* Constructor for RpBdDetail
	**/
    public RpBdDetail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpBdCc("0".toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 1
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 22
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 30
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 38
             ,8
             );
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 47
             ,9
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 57
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 70
             ,7
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 83
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 97
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 111
             ,3
             );
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 123
             ,10
             );
    }





}
  
