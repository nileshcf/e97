package com.cloudframe.app.alltype.dto;

/**
*  The class Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Group extends GroupSerialized {
   
				@Getter @Setter private GroupWithoutValue groupWithoutValue = new GroupWithoutValue();
				@Getter @Setter private AGroupWithArray aGroupWithArray = new AGroupWithArray();
				@Getter @Setter private GroupWithValue groupWithValue = new GroupWithValue();
				@Getter @Setter private GroupWith88 groupWith88 = new GroupWith88();
	
	/**
	* Constructor for Group
	**/
    public Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getGroupWithoutValue().setParent(this,getStartOffset() + 0);
					getAGroupWithArray().setParent(this,getStartOffset() + 209);
					getGroupWithValue().setParent(this,getStartOffset() + 627);
					getGroupWith88().setParent(this,getStartOffset() + 836);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Group
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getGroupWithoutValue().initialize();
     
          getAGroupWithArray().initialize();
     
          getGroupWithValue().initialize();
     
          getGroupWith88().initialize();
     
   }


}
  
