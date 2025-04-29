package com.cloudframe.app.init1.dto;

/**
*  The class MessagesX is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;


@Data
public class MessagesX extends MessagesXSerialized { 
   
			@Getter @Setter private List<Messages> messages = new ArrayList<>();
    	
	
	/**
	* Constructor for MessagesX
	**/
    public MessagesX() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MessagesX. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MessagesX(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
