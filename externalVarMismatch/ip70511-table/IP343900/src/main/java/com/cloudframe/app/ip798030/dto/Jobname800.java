package com.cloudframe.app.ip798030.dto;

/**
*  The class Jobname800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Jobname800 extends Jobname800Serialized {
   

						@Getter @Setter private char[] jobGroup800 = new char[6];

								@Getter @Setter private int jobNumber800;
	
	/**
	* Constructor for Jobname800
	**/
    public Jobname800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setJobGroup800(fillSpace(6));
								setJobNumber800(0);
    }





}
  
