package com.cloudframe.app.sf327010.dto;

/**
*  The class LowServiceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class LowServiceTime800 extends LowServiceTime800Serialized {
   
				@Getter @Setter private LserviceDate800 lserviceDate800 = new LserviceDate800();
				@Getter @Setter private LserviceTime800 lserviceTime800 = new LserviceTime800();
	
	/**
	* Constructor for LowServiceTime800
	**/
    public LowServiceTime800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getLserviceDate800().setParent(this,getStartOffset() + 0);
					getLserviceTime800().setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
    }





}
  
