package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041CountryTable is used to handle fields declared in it
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
public class Ip0041CountryTable extends Ip0041CountryTableSerialized { 
   
      private List<char[]> ip0041Country; 

	
	/**
	* Constructor for Ip0041CountryTable
	**/
    public Ip0041CountryTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0041CountryTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041CountryTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0041CountryTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < IP_0041_COUNTRY_SIZE;index++) {
             setIp0041Country(index, CONSTANTS.SPACE_3);
         }
   }


}
  
