package com.cloudframe.app.sf320010.dto;

/**
*  The class RpOpDetail is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class RpOpDetail extends RpOpDetailSerialized {
   

						@Getter @Setter private char[] rpOpCc = new char[1];


						@Getter @Setter private char[] rpOpRecordType = new char[1];


						@Getter @Setter private char[] rpOpMipId = new char[3];


						@Getter @Setter private char[] rpOpLogDate = new char[6];


						@Getter @Setter private char[] rpOpLogTime = new char[6];


						@Getter @Setter private char[] rpOpHeader = new char[8];

						@Getter @Setter private char[] rpOpDelimiter = new char[1];

						@Getter @Setter private char[] rpOpOperatorMessage = new char[85];
	
	/**
	* Constructor for RpOpDetail
	**/
    public RpOpDetail() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setRpOpCc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 1
             ,4
             );
								setRpOpRecordType(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(7)
             , getStartOffset() + 6
             ,7
             );
								setRpOpMipId(fillSpace(3));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 16
             ,4
             );
								setRpOpLogDate(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(4)
             , getStartOffset() + 26
             ,4
             );
								setRpOpLogTime(fillSpace(6));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 36
             ,3
             );
								setRpOpHeader(fillSpace(8));
								setRpOpDelimiter(fillSpace(1));
								setRpOpOperatorMessage(pad(85," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  
