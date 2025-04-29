package com.cloudframe.app.ip829010.dto;

/**
*  The class MqputSkipCnt610 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MqputSkipCnt610 extends MqputSkipCnt610Serialized {
   



								@Getter @Setter private long putSkipCnt610;
	
	/**
	* Constructor for MqputSkipCnt610
	**/
    public MqputSkipCnt610() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF RECS SKIPPED FROM MQ PUT     =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }





}
  
