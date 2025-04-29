package com.cloudframe.app.sf311010.dto;

/**
*  The class DetailLine362 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DetailLine362 extends DetailLine362Serialized {
   

						@Getter @Setter private char[] detailReportId362 = new char[1];

						@Getter @Setter private char[] detailCarCon362 = new char[1];


						@Getter @Setter private char[] detailLogType362 = new char[27];

						@Getter @Setter private char[] detailLogClass362 = new char[1];


								@Getter @Setter private char[] detailRecordTotal362 = Field.fillLowValue(11);

	
	/**
	* Constructor for DetailLine362
	**/
    public DetailLine362() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setDetailReportId362(fillSpace(1));
								setDetailCarCon362(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 2
             ,8
             );
								setDetailLogType362(fillSpace(27));
								setDetailLogClass362(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(9)
             , getStartOffset() + 38
             ,9
             );
       replaceValue( // serialize and save the value
             pad(70," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 58
             ,70
             );
    }





}
  
