package com.cloudframe.app.ar640010.dto;

/**
*  The class ListRecord220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ListRecord220 extends ListRecord220Serialized {
   

						@Getter @Setter private char[] listEndptId220 = new char[7];
	
	/**
	* Constructor for ListRecord220
	**/
    public ListRecord220() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setListEndptId220(fillSpace(7));
    }





}
  
