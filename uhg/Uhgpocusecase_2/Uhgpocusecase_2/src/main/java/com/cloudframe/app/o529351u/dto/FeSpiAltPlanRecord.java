package com.cloudframe.app.o529351u.dto;

/**
*  The class FeSpiAltPlanRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class FeSpiAltPlanRecord extends FeSpiAltPlanRecordSerialized {
   
				@Getter @Setter private FesaKey fesaKey = new FesaKey();
				@Getter @Setter private FesaDateTimestamp fesaDateTimestamp = new FesaDateTimestamp();

								@Getter @Setter private int fesaCanDt;
	
	/**
	* Constructor for FeSpiAltPlanRecord
	**/
    public FeSpiAltPlanRecord() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getFesaKey().setParent(this,getStartOffset() + 0);
					getFesaDateTimestamp().setParent(this,getStartOffset() + 17);
	   	/*  end of offset */
    }





}
  
