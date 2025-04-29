package com.cloudframe.app.mcissues.dto;

/**
*  The class PreEditVersionGroup300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class PreEditVersionGroup300 extends PreEditVersionGroup300Serialized {
   

						@Getter @Setter private char[] preEditVersion300 = new char[7];
					@Getter @Setter private PreEditVersion300Redefined preEditVersion300Redefined = new PreEditVersion300Redefined();
	
	/**
	* Constructor for PreEditVersionGroup300
	**/
    public PreEditVersionGroup300() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPreEditVersion300Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setPreEditVersion300(("21.2.00").toCharArray());
    }





}
  
