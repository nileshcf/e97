package com.cloudframe.app.init1.dto;

/**
*  The class CycdateInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CycdateInfo extends CycdateInfoSerialized {
   
				@Getter @Setter private BillPeriodDates billPeriodDates = new BillPeriodDates();
	
	/**
	* Constructor for CycdateInfo
	**/
    public CycdateInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBillPeriodDates().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
