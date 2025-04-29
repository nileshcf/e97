package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CopybookTable500 extends CopybookTable500Serialized {
   
				@Getter @Setter private CopybookData500 copybookData500 = new CopybookData500();
				@Getter @Setter private CopybookData500Redefined copybookData500Redefined = new CopybookData500Redefined();
	
	/**
	* Constructor for CopybookTable500
	**/
    public CopybookTable500() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCopybookData500().setParent(this,getStartOffset() + 0);
					getCopybookData500Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
