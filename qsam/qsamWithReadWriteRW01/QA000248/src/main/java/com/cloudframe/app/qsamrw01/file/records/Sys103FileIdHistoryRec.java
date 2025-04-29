package com.cloudframe.app.qsamrw01.file.records;

/**
*  The class Sys103FileIdHistoryRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys103FileIdHistoryRec extends Sys103FileIdHistoryRecSerialized {
   

						@Getter @Setter private char[] sys103FileIdHistoryRecString = Field.fillLowValue(1020);
	
	/**
	* Constructor for Sys103FileIdHistoryRec
	**/
    public Sys103FileIdHistoryRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
