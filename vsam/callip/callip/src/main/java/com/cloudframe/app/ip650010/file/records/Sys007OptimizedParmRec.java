package com.cloudframe.app.ip650010.file.records;

/**
*  The class Sys007OptimizedParmRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class Sys007OptimizedParmRec extends Sys007OptimizedParmRecSerialized { 
   
      private List<char[]> filler; 

	
	/**
	* Constructor for Sys007OptimizedParmRec
	**/
    public Sys007OptimizedParmRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sys007OptimizedParmRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys007OptimizedParmRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
