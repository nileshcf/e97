package com.cloudframe.app.ip606130.dto;

/**
*  The class BussServDftls600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class BussServDftls600 extends BussServDftls600Serialized {
   
			@Getter @Setter private List<Table36Bsl600> table36Bsl600 = new ArrayList<>();
    	
	
	/**
	* Constructor for BussServDftls600
	**/
    public BussServDftls600() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TABLE_36_BSL_600_SIZE;arrayIndex++) {
						getTable36Bsl600().add(new Table36Bsl600(this, beginTable36Bsl600 + 
						arrayIndex * Table36Bsl600.getTable36Bsl600FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
