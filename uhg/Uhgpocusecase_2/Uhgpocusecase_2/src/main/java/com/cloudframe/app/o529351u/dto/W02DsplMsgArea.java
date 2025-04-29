package com.cloudframe.app.o529351u.dto;

/**
*  The class W02DsplMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class W02DsplMsgArea extends W02DsplMsgAreaSerialized {
   


						@Getter @Setter private char[] w02MqTime = Field.fillLowValue(8);


						@Getter @Setter private char[] w02DsplErrInd = Field.fillLowValue(3);

						@Getter @Setter private char[] w02DsplMsg = new char[73];


								@Getter @Setter private long w02RespCd;


						@Getter @Setter private char[] w02AbendingProg = Field.fillLowValue(8);


						@Getter @Setter private char[] w02MainProg = Field.fillLowValue(3);


						@Getter @Setter private char[] w02FnuIcn = Field.fillLowValue(10);
	
	/**
	* Constructor for W02DsplMsgArea
	**/
    public W02DsplMsgArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("TM:").toCharArray()
             , getStartOffset() + 0
             ,3
             );
       replaceValue( // serialize and save the value
             (" C:").toCharArray()
             , getStartOffset() + 11
             ,3
             );
								setW02DsplMsg(pad(73," ".toCharArray(),' ',RIGHT_PAD));
       replaceValue( // serialize and save the value
             (",R:").toCharArray()
             , getStartOffset() + 90
             ,3
             );
       replaceValue( // serialize and save the value
             (",PRG: ").toCharArray()
             , getStartOffset() + 101
             ,6
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 115
             ,1
             );
       replaceValue( // serialize and save the value
             (",I:").toCharArray()
             , getStartOffset() + 119
             ,3
             );
    }





}
  
