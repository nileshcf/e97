package com.cloudframe.app.ip989010.dto;

/**
*  The class MsgStrTag300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MsgStrTag300 extends MsgStrTag300Serialized {
   


								@Getter @Setter private int msgStrMti300;

	
	/**
	* Constructor for MsgStrTag300
	**/
    public MsgStrTag300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("<msg mti=\"").toCharArray()
             , getStartOffset() + 0
             ,10
             );
								setMsgStrMti300(0);
       replaceValue( // serialize and save the value
             ("\">").toCharArray()
             , getStartOffset() + 14
             ,2
             );
    }





}
  
