package com.cloudframe.app.sf328010.dto;

/**
*  The class DetailData1705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DetailData1705 extends DetailData1705Serialized {
   
				@Getter @Setter private Detail1705 detail1705 = new Detail1705();
	
	/**
	* Constructor for DetailData1705
	**/
    public DetailData1705() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDetail1705().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
