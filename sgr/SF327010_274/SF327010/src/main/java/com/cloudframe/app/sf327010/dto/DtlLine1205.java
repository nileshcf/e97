package com.cloudframe.app.sf327010.dto;

/**
*  The class DtlLine1205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DtlLine1205 extends DtlLine1205Serialized {
   


						@Getter @Setter private char[] logType205 = new char[1];


						@Getter @Setter private char[] service205 = new char[4];


								@Getter @Setter private char[] totMsgCount205 = Field.fillLowValue(11);


								@Getter @Setter private char[] successfulCount205 = Field.fillLowValue(11);


								@Getter @Setter private char[] successfulPercnt205 = Field.fillLowValue(6);



								@Getter @Setter private char[] errorCount205 = Field.fillLowValue(11);


								@Getter @Setter private char[] errorPercent205 = Field.fillLowValue(6);



								@Getter @Setter private char[] avgElapsed205 = Field.fillLowValue(14);


								@Getter @Setter private char[] highElapsed205 = Field.fillLowValue(11);


								@Getter @Setter private char[] lowElapsed205 = Field.fillLowValue(11);
	
	/**
	* Constructor for DtlLine1205
	**/
    public DtlLine1205() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 0
             ,3
             );
								setLogType205(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 4
             ,8
             );
								setService205(fillSpace(4));
       replaceValue( // serialize and save the value
             fillSpace(10)
             , getStartOffset() + 16
             ,10
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 37
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 53
             ,1
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 60
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 61
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 73
             ,1
             );
       replaceValue( // serialize and save the value
             ("%").toCharArray()
             , getStartOffset() + 80
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 81
             ,4
             );
       replaceValue( // serialize and save the value
             fillSpace(5)
             , getStartOffset() + 99
             ,5
             );
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 115
             ,4
             );
    }





}
  
