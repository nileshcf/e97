package com.cloudframe.app.ip666030.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] isItTheFirstTime100 = new char[1];

						@Getter @Setter private char[] pgmIp666030300 = new char[8];

								@Getter @Setter private int start400;

								@Getter @Setter private int median400;

								@Getter @Setter private int end400;

						@Getter @Setter private char[] ptrIp666030800 = new char[8];

						@Getter @Setter private char[] tagTemp800 = Field.fillLowValue(13);

								@Getter @Setter private int startCf800;

								@Getter @Setter private int endCf800;

								@Getter @Setter private int leftCf800;

								@Getter @Setter private int rightCf800;

								@Getter @Setter private int medianCf800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setPgmIp666030300(("IP666030").toCharArray());
								setPtrIp666030800(("IP666030").toCharArray());
    }





}
  
