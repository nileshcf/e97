package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WvExtrRecord extends WvExtrRecordSerialized {
   
				@Getter @Setter private WvExtrDetails wvExtrDetails = new WvExtrDetails();
	
	/**
	* Constructor for WvExtrRecord
	**/
    public WvExtrRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWvExtrDetails().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes WvExtrRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getWvExtrDetails().initialize();
     
   }


}
  
