package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MonthTableGroup extends MonthTableGroupSerialized {
   

						@Getter @Setter private char[] monthTable = new char[444];
					@Getter @Setter private MonthTableRedefined monthTableRedefined = new MonthTableRedefined();
	
	/**
	* Constructor for MonthTableGroup
	**/
    public MonthTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMonthTableRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setMonthTable("  M O N T H   O F   J A N U A R Y  31 M O N T H   O F   F E B R U A R Y 28    M O N T H   O F   M A R C H    31    M O N T H   O F   A P R I L    30      M O N T H   O F   M A Y      31     M O N T H   O F   J U N E     30     M O N T H   O F   J U L Y     31   M O N T H   O F   A U G U S T   31M O N T H   O F   S E P T E M B E R30  M O N T H   O F   O C T O B E R  31 M O N T H   O F   N O V E M B E R 30 M O N T H   O F   D E C E M B E R 31".toCharArray());
    }





}
  
