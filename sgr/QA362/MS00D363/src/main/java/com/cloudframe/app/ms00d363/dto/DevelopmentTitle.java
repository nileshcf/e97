package com.cloudframe.app.ms00d363.dto;

/**
*  The class DevelopmentTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class DevelopmentTitle extends DevelopmentTitleSerialized {
   


	
	/**
	* Constructor for DevelopmentTitle
	**/
    public DevelopmentTitle() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("**ITF TEST**       ").toCharArray()
             , getStartOffset() + 8
             ,19
             );
    }





}
  
