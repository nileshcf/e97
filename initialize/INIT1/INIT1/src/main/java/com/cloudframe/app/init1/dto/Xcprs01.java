package com.cloudframe.app.init1.dto;

/**
*  The class Xcprs01 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Xcprs01 extends Xcprs01Serialized {
   
				@Getter @Setter private ApplicationVersion applicationVersion = new ApplicationVersion();
				@Getter @Setter private MessagesX messagesX = new MessagesX();
	
	/**
	* Constructor for Xcprs01
	**/
    public Xcprs01() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getApplicationVersion().setParent(this,getStartOffset() + 10);
					getMessagesX().setParent(this,getStartOffset() + 24);
	   	/*  end of offset */
    }





}
  
