package com.cloudframe.app.mcissues.dto;

/**
*  The class ClearingDtTm9Grp900 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class ClearingDtTm9Grp900 extends ClearingDtTm9Grp900Serialized {
   
			@Getter @Setter private List<ClearingDtTm9Ary900> clearingDtTm9Ary900 = new ArrayList<>();
    	
	
	/**
	* Constructor for ClearingDtTm9Grp900
	**/
    public ClearingDtTm9Grp900() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CLEARING_DT_TM_9_ARY_900_SIZE;arrayIndex++) {
						getClearingDtTm9Ary900().add(new ClearingDtTm9Ary900(this, beginClearingDtTm9Ary900 + 
						arrayIndex * ClearingDtTm9Ary900.getClearingDtTm9Ary900FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
