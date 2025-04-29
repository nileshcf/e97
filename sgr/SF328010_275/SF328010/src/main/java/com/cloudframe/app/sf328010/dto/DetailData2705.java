package com.cloudframe.app.sf328010.dto;

/**
*  The class DetailData2705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DetailData2705 extends DetailData2705Serialized {
   
				@Getter @Setter private Detail170501 detail170501 = new Detail170501();
	
	/**
	* Constructor for DetailData2705
	**/
    public DetailData2705() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDetail170501().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
