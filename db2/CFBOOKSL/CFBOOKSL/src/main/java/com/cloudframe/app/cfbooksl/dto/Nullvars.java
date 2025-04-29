package com.cloudframe.app.cfbooksl.dto;

/**
*  The class Nullvars is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Nullvars extends NullvarsSerialized {
   

								@Getter @Setter private short pageNull;

								@Getter @Setter private short rateNull;

								@Getter @Setter private short isbnNull;

								@Getter @Setter private short dateNull;

								@Getter @Setter private short idNull;
	
	/**
	* Constructor for Nullvars
	**/
    public Nullvars() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPageNull((short)0);
								setRateNull((short)0);
								setIsbnNull((short)0);
								setDateNull((short)0);
								setIdNull((short)0);
    }





}
  
