package com.cloudframe.app.sf327010.dto;

/**
*  The class HighServiceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HighServiceTime800 extends HighServiceTime800Serialized {
   
				@Getter @Setter private HserviceDate800 hserviceDate800 = new HserviceDate800();
				@Getter @Setter private HserviceTime800 hserviceTime800 = new HserviceTime800();
	
	/**
	* Constructor for HighServiceTime800
	**/
    public HighServiceTime800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getHserviceDate800().setParent(this,getStartOffset() + 0);
					getHserviceTime800().setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
    }





}
  
