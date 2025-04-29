package com.cloudframe.app.cfif01.dto;

/**
*  The class Higher is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Higher extends HigherSerialized {
   
				@Getter @Setter private Init init = new Init();
				@Getter @Setter private Array array = new Array();
	
	/**
	* Constructor for Higher
	**/
    public Higher() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getInit().setParent(this,getStartOffset() + 0);
					getArray().setParent(this,getStartOffset() + 14);
	   	/*  end of offset */
    }





}
  
