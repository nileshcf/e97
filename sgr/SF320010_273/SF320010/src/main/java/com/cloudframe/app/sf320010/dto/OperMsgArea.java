package com.cloudframe.app.sf320010.dto;

/**
*  The class OperMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class OperMsgArea extends OperMsgAreaSerialized {
   

						@Getter @Setter private char[] msgPos216 = Field.fillLowValue(15);
				@Getter @Setter private MsgPos216X msgPos216X = new MsgPos216X();
				@Getter @Setter private MsgPos1722 msgPos1722 = new MsgPos1722();
	
	/**
	* Constructor for OperMsgArea
	**/
    public OperMsgArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMsgPos216X().setParent(this,getStartOffset() + 1);
					getMsgPos1722().setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
    }





}
  
