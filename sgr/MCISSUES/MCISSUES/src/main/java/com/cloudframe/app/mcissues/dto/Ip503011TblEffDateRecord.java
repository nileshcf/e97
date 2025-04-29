package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip503011TblEffDateRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip503011TblEffDateRecord extends Ip503011TblEffDateRecordSerialized {
   

						@Getter @Setter private char[] ip503011TableId = Field.fillLowValue(8);

								@Getter @Setter private long ip503011TblEffDate;
	
	/**
	* Constructor for Ip503011TblEffDateRecord
	**/
    public Ip503011TblEffDateRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
