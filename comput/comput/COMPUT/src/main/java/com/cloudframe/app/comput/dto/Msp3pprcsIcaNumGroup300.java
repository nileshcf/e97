package com.cloudframe.app.comput.dto;

/**
*  The class Msp3pprcsIcaNumGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Msp3pprcsIcaNumGroup300 extends Msp3pprcsIcaNumGroup300Serialized {
   

								@Getter @Setter private long msp3pprcsIcaNum300;
					@Getter @Setter private Msp3pprcsIcaNum300Redefined msp3pprcsIcaNum300Redefined = new Msp3pprcsIcaNum300Redefined();
	
	/**
	* Constructor for Msp3pprcsIcaNumGroup300
	**/
    public Msp3pprcsIcaNumGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMsp3pprcsIcaNum300Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setMsp3pprcsIcaNum300(0L);
    }





}
  
