package com.cloudframe.app.ip989010.dto;

/**
*  The class Sys002Table500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Sys002Table500 extends Sys002Table500Serialized {
   
			@Getter @Setter private List<Sys002Data500> sys002Data500 = new ArrayList<>();
    	
	
	/**
	* Constructor for Sys002Table500
	**/
    public Sys002Table500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SYS_002_DATA_500_SIZE;arrayIndex++) {
						getSys002Data500().add(new Sys002Data500(this, beginSys002Data500 + 
						arrayIndex * Sys002Data500.getSys002Data500FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
