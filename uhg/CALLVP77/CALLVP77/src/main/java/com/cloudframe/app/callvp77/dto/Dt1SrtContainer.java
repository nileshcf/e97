package com.cloudframe.app.callvp77.dto;

/**
*  The class Dt1SrtContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dt1SrtContainer extends Dt1SrtContainerSerialized {
   
				@Getter @Setter private Dt1SrtFixedArea dt1SrtFixedArea = new Dt1SrtFixedArea();
	
	/**
	* Constructor for Dt1SrtContainer
	**/
    public Dt1SrtContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDt1SrtFixedArea().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
