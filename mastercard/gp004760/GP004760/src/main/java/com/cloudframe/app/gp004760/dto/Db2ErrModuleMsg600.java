package com.cloudframe.app.gp004760.dto;

/**
*  The class Db2ErrModuleMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Db2ErrModuleMsg600 extends Db2ErrModuleMsg600Serialized {
   


						@Getter @Setter private char[] db2ErrRtnCode600 = new char[18];
	
	/**
	* Constructor for Db2ErrModuleMsg600
	**/
    public Db2ErrModuleMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("RETURN CODE FROM DB200020: ").toCharArray()
             , getStartOffset() + 0
             ,27
             );
								setDb2ErrRtnCode600(fillSpace(18));
    }





}
  
