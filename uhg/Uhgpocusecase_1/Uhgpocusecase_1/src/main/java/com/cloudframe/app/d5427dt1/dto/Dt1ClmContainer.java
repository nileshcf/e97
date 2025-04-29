package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClmContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dt1ClmContainer extends Dt1ClmContainerSerialized {
   
				@Getter @Setter private Dt1ClmFixedArea dt1ClmFixedArea = new Dt1ClmFixedArea();
				@Getter @Setter private Dt1ClmVariableArea dt1ClmVariableArea = new Dt1ClmVariableArea();
	
	/**
	* Constructor for Dt1ClmContainer
	**/
    public Dt1ClmContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDt1ClmFixedArea().setParent(this,getStartOffset() + 0);
					getDt1ClmVariableArea().setParent(this,getStartOffset() + 16);
	   	/*  end of offset */
    }





}
  
