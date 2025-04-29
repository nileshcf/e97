package com.cloudframe.app.sf327010.dto;

/**
*  The class DetailData3205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DetailData3205 extends DetailData3205Serialized {
   
				@Getter @Setter private Detail1205 detail1205 = new Detail1205();
	
	/**
	* Constructor for DetailData3205
	**/
    public DetailData3205() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDetail1205().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
