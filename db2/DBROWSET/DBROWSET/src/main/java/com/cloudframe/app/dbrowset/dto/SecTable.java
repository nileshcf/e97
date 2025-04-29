package com.cloudframe.app.dbrowset.dto;

/**
*  The class SecTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;


@Data
public class SecTable extends SecTableSerialized {
   
      private List<char[]> isin; 

      private List<char[]> sedol; 

      private List<char[]> ric; 

	
	/**
	* Constructor for SecTable
	**/
    public SecTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
