package com.cloudframe.app.sf320010.file.records;

/**
*  The class FdGeneralLogFileInRcd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class FdGeneralLogFileInRcd extends FdGeneralLogFileInRcdSerialized {
   
      private List<char[]> filler; 

	
	/**
	* Constructor for FdGeneralLogFileInRcd
	**/
    public FdGeneralLogFileInRcd() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
