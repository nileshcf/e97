package com.cloudframe.app.bm8090m.dto;

/**
*  The class IoPe8090p is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class IoPe8090p extends IoPe8090pSerialized {
   
				@Getter @Setter private Pe8090p pe8090p = new Pe8090p();
	
	/**
	* Constructor for IoPe8090p
	**/
    public IoPe8090p() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getPe8090p().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
