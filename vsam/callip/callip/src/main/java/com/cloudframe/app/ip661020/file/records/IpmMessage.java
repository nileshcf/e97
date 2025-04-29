package com.cloudframe.app.ip661020.file.records;

/**
*  The class IpmMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class IpmMessage extends IpmMessageSerialized {
   
      private List<char[]> filler; 

	
	/**
	* Constructor for IpmMessage
	**/
    public IpmMessage() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
