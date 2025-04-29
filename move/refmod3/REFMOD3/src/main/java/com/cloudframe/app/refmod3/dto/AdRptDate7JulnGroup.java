package com.cloudframe.app.refmod3.dto;

/**
*  The class AdRptDate7JulnGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AdRptDate7JulnGroup extends AdRptDate7JulnGroupSerialized {
   

								@Getter @Setter private long adRptDate7Juln;
	
	/**
	* Constructor for AdRptDate7JulnGroup
	**/
    public AdRptDate7JulnGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setAdRptDate7Juln(2022100L);
    }





}
  
