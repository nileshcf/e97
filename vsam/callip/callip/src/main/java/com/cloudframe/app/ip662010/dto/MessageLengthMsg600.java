package com.cloudframe.app.ip662010.dto;

/**
*  The class MessageLengthMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MessageLengthMsg600 extends MessageLengthMsg600Serialized {
   


						@Getter @Setter private char[] messageLengthErrCode600 = Field.fillLowValue(5);


								@Getter @Setter private char[] messageLength600 = Field.fillLowValue(6);
	
	/**
	* Constructor for MessageLengthMsg600
	**/
    public MessageLengthMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP662010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("-RECORD LENGTH = ").toCharArray()
             , getStartOffset() + 14
             ,17
             );
    }





}
  
