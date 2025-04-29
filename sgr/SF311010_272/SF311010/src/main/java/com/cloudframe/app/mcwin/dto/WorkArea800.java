package com.cloudframe.app.mcwin.dto;

/**
*  The class WorkArea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class WorkArea800 extends WorkArea800Serialized {
   

								@Getter @Setter private int parmsCheck800;

								@Getter @Setter private long currYear1800;

								@Getter @Setter private long currYear2800;

								@Getter @Setter private int currYear3800;

								@Getter @Setter private int yearValue800;
	
	/**
	* Constructor for WorkArea800
	**/
    public WorkArea800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setParmsCheck800(0);
								setCurrYear1800(0L);
								setCurrYear2800(0L);
								setCurrYear3800(0);
								setYearValue800(0);
    }





}
  
