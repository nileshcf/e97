package com.cloudframe.app.ms00d363.dto;

/**
*  The class DaysInMoTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class DaysInMoTable extends DaysInMoTableSerialized {
   
			@Getter @Setter private List<DaysInMo> daysInMo = new ArrayList<>();
    	
	
	/**
	* Constructor for DaysInMoTable
	**/
    public DaysInMoTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DAYS_IN_MO_SIZE;arrayIndex++) {
						getDaysInMo().add(new DaysInMo(this, beginDaysInMo + 
						arrayIndex * DaysInMo.getDaysInMoFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
