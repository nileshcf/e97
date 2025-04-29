package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip66601UserTagInformation is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip66601UserTagInformation extends Ip66601UserTagInformationSerialized {
   

								@Getter @Setter private short ip66601UserTcnt;
				@Getter @Setter private Ip66601UserTagTable ip66601UserTagTable = new Ip66601UserTagTable();
	
	/**
	* Constructor for Ip66601UserTagInformation
	**/
    public Ip66601UserTagInformation() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp66601UserTagTable().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }





}
  
