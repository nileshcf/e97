package com.cloudframe.app.o529351u.dto;

/**
*  The class CetCicsErrorTableGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class CetCicsErrorTableGroup extends CetCicsErrorTableGroupSerialized {
   
					@Getter @Setter private CetCicsErrorTable cetCicsErrorTable = new CetCicsErrorTable();
					@Getter @Setter private CetCicsErrorTableRedefined01 cetCicsErrorTableRedefined01 = new CetCicsErrorTableRedefined01();

						@Getter @Setter private char[] cetCicsErrorTableRedefined02 = Field.fillLowValue(6);
					@Getter @Setter private CetCicsErrorTableRedefined03 cetCicsErrorTableRedefined03 = new CetCicsErrorTableRedefined03();
					@Getter @Setter private CetCicsErrorTableRedefined cetCicsErrorTableRedefined = new CetCicsErrorTableRedefined();
	
	/**
	* Constructor for CetCicsErrorTableGroup
	**/
    public CetCicsErrorTableGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCetCicsErrorTable().setParent(this,getStartOffset() + 0);
					getCetCicsErrorTableRedefined01().setParent(this,getStartOffset() + 0);
					getCetCicsErrorTableRedefined03().setParent(this,getStartOffset() + 0);
					getCetCicsErrorTableRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
