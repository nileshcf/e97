package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip90354MasterRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Ip90354MasterRec extends Ip90354MasterRecSerialized {
   
				@Getter @Setter private Ip90354TableData ip90354TableData = new Ip90354TableData();
	
	/**
	* Constructor for Ip90354MasterRec
	**/
    public Ip90354MasterRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp90354TableData().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
