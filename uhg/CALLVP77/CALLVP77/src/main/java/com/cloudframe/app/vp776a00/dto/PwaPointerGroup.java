package com.cloudframe.app.vp776a00.dto;

/**
*  The class PwaPointerGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class PwaPointerGroup extends PwaPointerGroupSerialized {
   

								@Getter @Setter private int pwaPointer;

								@Getter @Setter private int pwaAddress;
	
	/**
	* Constructor for PwaPointerGroup
	**/
    public PwaPointerGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
