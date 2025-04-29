package com.cloudframe.app.d529351u.dto;

/**
*  The class Vyspi51uCallArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Vyspi51uCallArea extends Vyspi51uCallAreaSerialized {
   

				@Getter @Setter private D51uRequestFields d51uRequestFields = new D51uRequestFields();
				@Getter @Setter private D51uReturnArea d51uReturnArea = new D51uReturnArea();
	
	/**
	* Constructor for Vyspi51uCallArea
	**/
    public Vyspi51uCallArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getD51uRequestFields().setParent(this,getStartOffset() + 24);
					getD51uReturnArea().setParent(this,getStartOffset() + 262);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("VYSPI51U - STARTS HERE  ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
    }





}
  
