package com.cloudframe.app.refmod2.dto;

/**
*  The class ASGrp215 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ASGrp215 extends ASGrp215Serialized {
   
				@Getter @Setter private AS215 aS215 = new AS215();
	
	/**
	* Constructor for ASGrp215
	**/
    public ASGrp215() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAS215().setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }





}
  
