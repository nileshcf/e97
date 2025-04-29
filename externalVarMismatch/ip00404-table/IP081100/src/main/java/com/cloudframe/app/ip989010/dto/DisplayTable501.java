package com.cloudframe.app.ip989010.dto;

/**
*  The class DisplayTable501 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class DisplayTable501 extends DisplayTable501Serialized {
   
			@Getter @Setter private List<DisplayData501> displayData501 = new ArrayList<>();
    	
	
	/**
	* Constructor for DisplayTable501
	**/
    public DisplayTable501() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DISPLAY_DATA_501_SIZE;arrayIndex++) {
						getDisplayData501().add(new DisplayData501(this, beginDisplayData501 + 
						arrayIndex * DisplayData501.getDisplayData501FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
