package com.cloudframe.app.db2funci.dto;

/**
*  The class ApplicationCodeListGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ApplicationCodeListGroup extends ApplicationCodeListGroupSerialized {
   

						@Getter @Setter private char[] applicationCodeList = Field.fillLowValue(21);
					@Getter @Setter private HostAppCodeList hostAppCodeList = new HostAppCodeList();
	
	/**
	* Constructor for ApplicationCodeListGroup
	**/
    public ApplicationCodeListGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getHostAppCodeList().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
