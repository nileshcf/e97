package com.cloudframe.app.iovb32k.dto;

/**
*  The class LsParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class LsParm extends LsParmSerialized {
   

								@Getter @Setter private short lsParmLen;
				@Getter @Setter private LsParmG lsParmG = new LsParmG();
	
	/**
	* Constructor for LsParm
	**/
    public LsParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getLsParmG().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
    }





}
  
