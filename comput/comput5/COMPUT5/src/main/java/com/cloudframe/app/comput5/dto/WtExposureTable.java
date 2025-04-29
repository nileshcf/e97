package com.cloudframe.app.comput5.dto;

/**
*  The class WtExposureTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class WtExposureTable extends WtExposureTableSerialized {
   
			@Getter @Setter private List<WtExposureDetails> wtExposureDetails = new ArrayList<>();
    	
	
	/**
	* Constructor for WtExposureTable
	**/
    public WtExposureTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WT_EXPOSURE_DETAILS_SIZE;arrayIndex++) {
						getWtExposureDetails().add(new WtExposureDetails(this, beginWtExposureDetails + 
						arrayIndex * WtExposureDetails.getWtExposureDetailsFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
