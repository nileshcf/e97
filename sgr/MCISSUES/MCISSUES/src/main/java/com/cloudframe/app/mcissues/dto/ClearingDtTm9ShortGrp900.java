package com.cloudframe.app.mcissues.dto;

/**
*  The class ClearingDtTm9ShortGrp900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ClearingDtTm9ShortGrp900 extends ClearingDtTm9ShortGrp900Serialized {
   
			@Getter @Setter private List<ClearingDtTm9ShortAry900> clearingDtTm9ShortAry900 = new ArrayList<>();
    	
	
	/**
	* Constructor for ClearingDtTm9ShortGrp900
	**/
    public ClearingDtTm9ShortGrp900() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CLEARING_DT_TM_9_SHORT_ARY_900_SIZE;arrayIndex++) {
						getClearingDtTm9ShortAry900().add(new ClearingDtTm9ShortAry900(this, beginClearingDtTm9ShortAry900 + 
						arrayIndex * ClearingDtTm9ShortAry900.getClearingDtTm9ShortAry900FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
