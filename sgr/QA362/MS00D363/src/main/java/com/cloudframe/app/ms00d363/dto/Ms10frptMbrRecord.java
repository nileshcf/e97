package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptMbrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ms10frptMbrRecord extends Ms10frptMbrRecordSerialized {
   
				@Getter @Setter private Ms10frptHeaderRec ms10frptHeaderRec = new Ms10frptHeaderRec();
	
	/**
	* Constructor for Ms10frptMbrRecord
	**/
    public Ms10frptMbrRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMs10frptHeaderRec().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
