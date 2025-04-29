package com.cloudframe.app.ip662010.dto;

/**
*  The class CurrentTag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CurrentTag800 extends CurrentTag800Serialized {
   
				@Getter @Setter private Id800 id800 = new Id800();

								@Getter @Setter private short subfldNo800;

								@Getter @Setter private short start800;

								@Getter @Setter private short length800;
	
	/**
	* Constructor for CurrentTag800
	**/
    public CurrentTag800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getId800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
