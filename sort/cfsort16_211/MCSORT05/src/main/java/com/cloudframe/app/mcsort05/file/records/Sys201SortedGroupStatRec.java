package com.cloudframe.app.mcsort05.file.records;

/**
*  The class Sys201SortedGroupStatRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sys201SortedGroupStatRec extends Sys201SortedGroupStatRecSerialized {
   

						@Getter @Setter private char[] sys201SortedGroupStatRecString = Field.fillLowValue(2000);
	
	/**
	* Constructor for Sys201SortedGroupStatRec
	**/
    public Sys201SortedGroupStatRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
