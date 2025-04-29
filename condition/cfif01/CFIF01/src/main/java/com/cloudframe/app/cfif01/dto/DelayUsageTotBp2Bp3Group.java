package com.cloudframe.app.cfif01.dto;

/**
*  The class DelayUsageTotBp2Bp3Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class DelayUsageTotBp2Bp3Group extends DelayUsageTotBp2Bp3GroupSerialized {
   

								@Getter @Setter private int delayUsageTotBp2Bp3;

								@Getter @Setter private BigDecimal delayUsageTotBp2Bp3Dec = BigDecimal.ZERO;
	
	/**
	* Constructor for DelayUsageTotBp2Bp3Group
	**/
    public DelayUsageTotBp2Bp3Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
