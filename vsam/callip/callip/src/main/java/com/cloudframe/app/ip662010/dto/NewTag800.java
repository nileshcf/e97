package com.cloudframe.app.ip662010.dto;

/**
*  The class NewTag800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class NewTag800 extends NewTag800Serialized {
   

								@Getter @Setter private short newType800;

								@Getter @Setter private short newNo800;

								@Getter @Setter private short newSubfldNo800;

								@Getter @Setter private short newStart800;

								@Getter @Setter private short newLength800;

						@Getter @Setter private char[] newStatus800 = new char[1];
	
	/**
	* Constructor for NewTag800
	**/
    public NewTag800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setNewStatus800(fillSpace(1));
    }





}
  
