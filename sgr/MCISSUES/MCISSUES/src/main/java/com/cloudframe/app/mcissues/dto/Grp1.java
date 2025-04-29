package com.cloudframe.app.mcissues.dto;

/**
*  The class Grp1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Grp1 extends Grp1Serialized {
   
				@Getter @Setter private Report1HeadingLine11701 report1HeadingLine11701 = new Report1HeadingLine11701();
	
	/**
	* Constructor for Grp1
	**/
    public Grp1() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getReport1HeadingLine11701().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
