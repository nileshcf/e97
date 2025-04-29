package com.cloudframe.app.dxc001.dto;

/**
*  The class CurrDate1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class CurrDate1 extends CurrDate1Serialized {
   

								@Getter @Setter private int chckYear1;

								@Getter @Setter private int chckMonth1;

								@Getter @Setter private int chckDay1;
	
	/**
	* Constructor for CurrDate1
	**/
    public CurrDate1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
