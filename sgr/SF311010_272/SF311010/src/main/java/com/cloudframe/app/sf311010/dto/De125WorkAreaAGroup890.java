package com.cloudframe.app.sf311010.dto;

/**
*  The class De125WorkAreaAGroup890 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class De125WorkAreaAGroup890 extends De125WorkAreaAGroup890Serialized {
   
					@Getter @Setter private De125WorkAreaA890 de125WorkAreaA890 = new De125WorkAreaA890();
					@Getter @Setter private De125WorkAreaB891 de125WorkAreaB891 = new De125WorkAreaB891();
	
	/**
	* Constructor for De125WorkAreaAGroup890
	**/
    public De125WorkAreaAGroup890() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDe125WorkAreaA890().setParent(this,getStartOffset() + 0);
					getDe125WorkAreaB891().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
