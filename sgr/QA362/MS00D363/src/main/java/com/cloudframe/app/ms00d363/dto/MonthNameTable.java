package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthNameTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MonthNameTable extends MonthNameTableSerialized {
   

								@Getter @Setter private int mntMaxOccurs;

						@Getter @Setter private char[] mntLiterals = new char[132];
				@Getter @Setter private MntArea mntArea = new MntArea();
	
	/**
	* Constructor for MonthNameTable
	**/
    public MonthNameTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMntArea().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setMntMaxOccurs(12);
								setMntLiterals("    JANUARY   FEBRUARY      MARCH      APRIL        MAY       JUNE       JULY     AUGUST  SEPTEMBER    OCTOBER   NOVEMBER   DECEMBER".toCharArray());
    }





}
  
