package com.cloudframe.app.sf311010.dto;

/**
*  The class HoldCurrentDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HoldCurrentDate800 extends HoldCurrentDate800Serialized {
   

								@Getter @Setter private int holdCurrYy800;

								@Getter @Setter private int holdCurrMm800;

								@Getter @Setter private int holdCurrDd800;
	
	/**
	* Constructor for HoldCurrentDate800
	**/
    public HoldCurrentDate800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHoldCurrYy800(0);
								setHoldCurrMm800(0);
								setHoldCurrDd800(0);
    }





}
  
