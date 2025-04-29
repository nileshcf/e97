package com.cloudframe.app.sf326010.dto;

/**
*  The class Message6008003 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Message6008003 extends Message6008003Serialized {
   


								@Getter @Setter private char[] sys201ZLogCnt6008003 = Field.fillLowValue(11);
	
	/**
	* Constructor for Message6008003
	**/
    public Message6008003() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("SF326010-8003  TOTAL Z-LOG REPORT RECORDS WRITTEN =   ").toCharArray()
             , getStartOffset() + 0
             ,54
             );
    }





}
  
