package com.cloudframe.app.d5427dt1.dto;

/**
*  The class DsmCallArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DsmCallArea extends DsmCallAreaSerialized {
   

				@Getter @Setter private DsmCommonArea dsmCommonArea = new DsmCommonArea();
				@Getter @Setter private DsmLogArea dsmLogArea = new DsmLogArea();
	
	/**
	* Constructor for DsmCallArea
	**/
    public DsmCallArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDsmCommonArea().setParent(this,getStartOffset() + 24);
					getDsmLogArea().setParent(this,getStartOffset() + 990);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("VYDSMPRC - STARTS HERE  ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
    }





}
  
