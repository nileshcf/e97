package com.cloudframe.app.o529351u.dto;

/**
*  The class GenTransSpiTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class GenTransSpiTableGroup extends GenTransSpiTableGroupSerialized {
   

						@Getter @Setter private char[] genTransSpiTable = new char[54];
					@Getter @Setter private GenTransSpiTableR genTransSpiTableR = new GenTransSpiTableR();
	
	/**
	* Constructor for GenTransSpiTableGroup
	**/
    public GenTransSpiTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getGenTransSpiTableR().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setGenTransSpiTable(("009001009002009003009004009005009006009007009008009009").toCharArray());
    }





}
  
