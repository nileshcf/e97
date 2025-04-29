package com.cloudframe.app.testnum.dto;

/**
*  The class Tgt150Grp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class Tgt150Grp extends Tgt150GrpSerialized {
   
      private List<Long> tgt150; 

	
	/**
	* Constructor for Tgt150Grp
	**/
    public Tgt150Grp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
