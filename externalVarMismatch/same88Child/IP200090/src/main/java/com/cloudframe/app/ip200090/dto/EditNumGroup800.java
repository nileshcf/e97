package com.cloudframe.app.ip200090.dto;

/**
*  The class EditNumGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class EditNumGroup800 extends EditNumGroup800Serialized {
   

								@Getter @Setter private long editNum800;
					@Getter @Setter private EditNumR800 editNumR800 = new EditNumR800();
	
	/**
	* Constructor for EditNumGroup800
	**/
    public EditNumGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getEditNumR800().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setEditNum800(0L);
    }





}
  
