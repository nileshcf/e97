package com.cloudframe.app.ip606130.file.records;

/**
*  The class Sys200ExpParmMasterRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class Sys200ExpParmMasterRec extends Sys200ExpParmMasterRecSerialized {
   
      private List<char[]> filler; 

	
	/**
	* Constructor for Sys200ExpParmMasterRec
	**/
    public Sys200ExpParmMasterRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
