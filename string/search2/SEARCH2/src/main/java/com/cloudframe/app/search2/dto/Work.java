package com.cloudframe.app.search2.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

								@Getter @Setter private int initial;

								@Getter @Setter private int increment;

								@Getter @Setter private int sub;

								@Getter @Setter private int sub2;

								@Getter @Setter private int sub3;

								@Getter @Setter private short toggle123;

								@Getter @Setter private short toggleMax;

								@Getter @Setter private int counter;

								@Getter @Setter private long searchItem;

								@Getter @Setter private int sbidCount;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInitial(1000);
								setIncrement(100);
								setSub(1);
								setSub2(1);
								setSub3(1);
								setToggle123((short)1);
								setToggleMax((short)2);
								setCounter(50);
								setSbidCount(0);
    }





}
  
