package com.cloudframe.app.sf311010.dto;

/**
*  The class MciwinReturnedYear is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MciwinReturnedYear extends MciwinReturnedYearSerialized {
   

								@Getter @Setter private int mciwinRetCentury;

								@Getter @Setter private int mciwinRetYearL2;
	
	/**
	* Constructor for MciwinReturnedYear
	**/
    public MciwinReturnedYear() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMciwinRetCentury(0);
								setMciwinRetYearL2(0);
    }





}
  
