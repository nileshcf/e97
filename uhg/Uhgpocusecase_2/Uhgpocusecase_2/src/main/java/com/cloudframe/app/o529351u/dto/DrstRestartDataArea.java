package com.cloudframe.app.o529351u.dto;

/**
*  The class DrstRestartDataArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class DrstRestartDataArea extends DrstRestartDataAreaSerialized {
   
				@Getter @Setter private DrstReturnArea drstReturnArea = new DrstReturnArea();
				@Getter @Setter private DrstSqlErrorMsgArea drstSqlErrorMsgArea = new DrstSqlErrorMsgArea();
				@Getter @Setter private DrstCicsErrorMsgArea drstCicsErrorMsgArea = new DrstCicsErrorMsgArea();
				@Getter @Setter private DrstRetSupplementalArea drstRetSupplementalArea = new DrstRetSupplementalArea();

						@Getter @Setter private char[] drstRetLbmsub90Area = Field.fillLowValue(750);
	
	/**
	* Constructor for DrstRestartDataArea
	**/
    public DrstRestartDataArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDrstReturnArea().setParent(this,getStartOffset() + 299);
					getDrstSqlErrorMsgArea().setParent(this,getStartOffset() + 342);
					getDrstCicsErrorMsgArea().setParent(this,getStartOffset() + 342);
					getDrstRetSupplementalArea().setParent(this,getStartOffset() + 459);
	   	/*  end of offset */
    }





}
  
