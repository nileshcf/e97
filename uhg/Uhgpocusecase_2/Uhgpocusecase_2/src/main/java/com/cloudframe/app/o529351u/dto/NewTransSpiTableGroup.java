package com.cloudframe.app.o529351u.dto;

/**
*  The class NewTransSpiTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class NewTransSpiTableGroup extends NewTransSpiTableGroupSerialized {
   

						@Getter @Setter private char[] newTransSpiTable = new char[12];
					@Getter @Setter private NewTransSpiTableR newTransSpiTableR = new NewTransSpiTableR();
	
	/**
	* Constructor for NewTransSpiTableGroup
	**/
    public NewTransSpiTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getNewTransSpiTableR().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setNewTransSpiTable(("006000006001").toCharArray());
    }





}
  
