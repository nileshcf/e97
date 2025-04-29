package com.cloudframe.app.ip989010.dto;

/**
*  The class Parms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Parms1000 extends Parms1000Serialized {
   

								@Getter @Setter private short parmLength1000;
				@Getter @Setter private ParmData1000 parmData1000 = new ParmData1000();
	
	/**
	* Constructor for Parms1000
	**/
    public Parms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getParmData1000().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }





}
  
