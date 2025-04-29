package com.cloudframe.app.db2funci.dto;

/**
*  The class Parmbuf is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class Parmbuf extends ParmbufSerialized { 
   
      private List<char[]> parmarry; 

	
	/**
	* Constructor for Parmbuf
	**/
    public Parmbuf() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Parmbuf. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parmbuf(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
