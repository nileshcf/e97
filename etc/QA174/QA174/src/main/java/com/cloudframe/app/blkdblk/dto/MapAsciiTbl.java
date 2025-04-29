package com.cloudframe.app.blkdblk.dto;

/**
*  The class MapAsciiTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class MapAsciiTbl extends MapAsciiTblSerialized { 
   
      private List<char[]> mapAscii; 

	
	/**
	* Constructor for MapAsciiTbl
	**/
    public MapAsciiTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MapAsciiTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MapAsciiTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
