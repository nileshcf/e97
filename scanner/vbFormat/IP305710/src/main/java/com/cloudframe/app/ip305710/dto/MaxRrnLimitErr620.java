package com.cloudframe.app.ip305710.dto;

/**
*  The class MaxRrnLimitErr620 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MaxRrnLimitErr620 extends MaxRrnLimitErr620Serialized {
   


								@Getter @Setter private int maxRrnLimit620;


								@Getter @Setter private long pcCapGrpPtr620;


								@Getter @Setter private int actualRrnLimit620;
	
	/**
	* Constructor for MaxRrnLimitErr620
	**/
    public MaxRrnLimitErr620() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("EXCEED MAX RRN LIMIT OF ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
								setMaxRrnLimit620(0);
       replaceValue( // serialize and save the value
             (" FOR PC CAP GRP PTR=").toCharArray()
             , getStartOffset() + 26
             ,20
             );
								setPcCapGrpPtr620(0L);
       replaceValue( // serialize and save the value
             (".ACTUAL RRN LIMIT=").toCharArray()
             , getStartOffset() + 57
             ,18
             );
								setActualRrnLimit620(0);
    }





}
  
