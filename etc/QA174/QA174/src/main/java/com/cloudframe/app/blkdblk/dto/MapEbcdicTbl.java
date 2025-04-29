package com.cloudframe.app.blkdblk.dto;

/**
*  The class MapEbcdicTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:44. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;


@Data
public class MapEbcdicTbl extends MapEbcdicTblSerialized { 
   
      private List<char[]> mapEbcdic; 

	
	/**
	* Constructor for MapEbcdicTbl
	**/
    public MapEbcdicTbl() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MapEbcdicTbl. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MapEbcdicTbl(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    



}
  
