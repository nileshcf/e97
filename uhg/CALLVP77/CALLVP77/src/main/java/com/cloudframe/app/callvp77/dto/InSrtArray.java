package com.cloudframe.app.callvp77.dto;

/**
*  The class InSrtArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class InSrtArray extends InSrtArraySerialized {
   
      private List<char[]> inSrtItem; 

	
	/**
	* Constructor for InSrtArray
	**/
    public InSrtArray() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
