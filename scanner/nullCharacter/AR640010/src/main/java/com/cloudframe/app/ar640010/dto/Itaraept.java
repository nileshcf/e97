package com.cloudframe.app.ar640010.dto;

/**
*  The class Itaraept is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Itaraept extends ItaraeptSerialized {
   

								@Getter @Setter private short taraeptUserSrvrIdN;

								@Getter @Setter private short taraeptBkupEndptIdN;

								@Getter @Setter private short taraeptCsMipIdN;

								@Getter @Setter private short taraeptRmMipIdN;
	
	/**
	* Constructor for Itaraept
	**/
    public Itaraept() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
