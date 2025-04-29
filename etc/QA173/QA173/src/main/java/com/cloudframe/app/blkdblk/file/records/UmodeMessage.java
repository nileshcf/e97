package com.cloudframe.app.blkdblk.file.records;

/**
*  The class UmodeMessage is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class UmodeMessage extends UmodeMessageSerialized {
   
      private List<char[]> filler1; 

	
	/**
	* Constructor for UmodeMessage
	**/
    public UmodeMessage() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
