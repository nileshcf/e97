package com.cloudframe.app.mcissues.dto;

/**
*  The class Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Group extends GroupSerialized {
   
			@Getter @Setter private List<Group500> group500 = new ArrayList<>();
    	
	
	/**
	* Constructor for Group
	**/
    public Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < GROUP_500_SIZE;arrayIndex++) {
						getGroup500().add(new Group500(this, beginGroup500 + 
						arrayIndex * Group500.getGroup500FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
