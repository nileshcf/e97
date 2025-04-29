package com.cloudframe.app.tmsmmcpy.dto;

/**
*  The class WorkFieldGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;


@Data
public class WorkFieldGroup extends WorkFieldGroupSerialized {
   

						@Getter @Setter private char[] workField = new char[10];

								@Getter @Setter private BigDecimal workFieldN = BigDecimal.ZERO;
	
	/**
	* Constructor for WorkFieldGroup
	**/
    public WorkFieldGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWorkField(fillSpace(10));
    }





}
  
