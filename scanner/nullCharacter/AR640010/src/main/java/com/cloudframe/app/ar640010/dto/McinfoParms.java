package com.cloudframe.app.ar640010.dto;

/**
*  The class McinfoParms is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class McinfoParms extends McinfoParmsSerialized {
   

						@Getter @Setter private char[] mcinfoCopybookDate = new char[10];

						@Getter @Setter private char[] mcinfoDdName = new char[8];

						@Getter @Setter private char[] mcinfoJobName = new char[8];

						@Getter @Setter private char[] mcinfoProcStep = new char[8];

						@Getter @Setter private char[] mcinfoStepName = new char[8];

						@Getter @Setter private char[] mcinfoJobNumber = new char[8];

						@Getter @Setter private char[] mcinfoUserId = new char[8];

						@Getter @Setter private char[] mcinfoCpuId = new char[8];
	
	/**
	* Constructor for McinfoParms
	**/
    public McinfoParms() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMcinfoCopybookDate(("2004-05-31").toCharArray());
								setMcinfoDdName(fillSpace(8));
								setMcinfoJobName(fillSpace(8));
								setMcinfoProcStep(fillSpace(8));
								setMcinfoStepName(fillSpace(8));
								setMcinfoJobNumber(fillSpace(8));
								setMcinfoUserId(fillSpace(8));
								setMcinfoCpuId(fillSpace(8));
    }





}
  
