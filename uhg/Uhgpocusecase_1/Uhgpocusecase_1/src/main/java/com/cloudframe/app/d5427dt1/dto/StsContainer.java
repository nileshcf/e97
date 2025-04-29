package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class StsContainer extends StsContainerSerialized {
   
				@Getter @Setter private StsFixedArea stsFixedArea = new StsFixedArea();
	
	/**
	* Constructor for StsContainer
	**/
    public StsContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getStsFixedArea().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
