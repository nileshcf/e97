package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ReqContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dt1ReqContainer extends Dt1ReqContainerSerialized {
   
				@Getter @Setter private Dt1RequestArea dt1RequestArea = new Dt1RequestArea();
	
	/**
	* Constructor for Dt1ReqContainer
	**/
    public Dt1ReqContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDt1RequestArea().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
