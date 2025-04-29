package com.cloudframe.app.s918test.dto;

/**
*  The class Tgt212Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class Tgt212Grp extends Tgt212GrpSerialized {
   
      private List<Long> tgt212; 

	
	/**
	* Constructor for Tgt212Grp
	**/
    public Tgt212Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
