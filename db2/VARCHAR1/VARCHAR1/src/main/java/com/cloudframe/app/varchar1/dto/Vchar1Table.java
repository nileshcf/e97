package com.cloudframe.app.varchar1.dto;

/**
*  The class Vchar1Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Vchar1Table extends Vchar1TableSerialized {
   

								@Getter @Setter private short vchar1Id;
				@Getter @Setter private Vchar1FirstName vchar1FirstName = new Vchar1FirstName();

						@Getter @Setter private char[] vchar1LastName = Field.fillLowValue(15);
				@Getter @Setter private Vchar1NickName vchar1NickName = new Vchar1NickName();
	
	/**
	* Constructor for Vchar1Table
	**/
    public Vchar1Table() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getVchar1FirstName().setParent(this,getStartOffset() + 2);
					getVchar1NickName().setParent(this,getStartOffset() + 34);
	   	/*  end of offset */
    }





}
  
