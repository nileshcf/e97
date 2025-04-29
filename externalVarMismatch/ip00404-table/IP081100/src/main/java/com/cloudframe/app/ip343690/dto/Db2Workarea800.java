package com.cloudframe.app.ip343690.dto;

/**
*  The class Db2Workarea800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Db2Workarea800 extends Db2Workarea800Serialized {
   

								@Getter @Setter private int abendCd800;
				@Getter @Setter private AbendCode800 abendCode800 = new AbendCode800();

								@Getter @Setter private int noTimes911Try800;
				@Getter @Setter private SleepTimeGroup800 sleepTimeGroup800 = new SleepTimeGroup800();

						@Getter @Setter private char[] currTime800 = new char[8];
	
	/**
	* Constructor for Db2Workarea800
	**/
    public Db2Workarea800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAbendCode800().setParent(this,getStartOffset() + 4);
					getSleepTimeGroup800().setParent(this,getStartOffset() + 10);
	   	/*  end of offset */
								setNoTimes911Try800(0);
								setCurrTime800(fillSpace(8));
    }





}
  
