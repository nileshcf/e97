package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041RegionTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip0041RegionTable extends Ip0041RegionTableSerialized { 
   
      private List<char[]> ip0041Region; 

	
	/**
	* Constructor for Ip0041RegionTable
	**/
    public Ip0041RegionTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0041RegionTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041RegionTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0041RegionTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0041_REGION_SIZE;index++) {
             setIp0041Region(index, CONSTANTS.SPACE);
         }
   }


}
  
