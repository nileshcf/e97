package com.cloudframe.app.evaluat1.dto;

/**
*  The class MonthsGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class MonthsGrp extends MonthsGrpSerialized {
   

						@Getter @Setter private char[] months = new char[36];
      private List<char[]> monthsR; 

	
	/**
	* Constructor for MonthsGrp
	**/
    public MonthsGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setMonths(("janfebmaraprmayjunjulaugsepoctnovdec").toCharArray());
    }





}
  
