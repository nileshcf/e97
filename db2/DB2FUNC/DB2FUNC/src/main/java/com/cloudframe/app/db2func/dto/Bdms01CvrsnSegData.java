package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CvrsnSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Bdms01CvrsnSegData extends Bdms01CvrsnSegDataSerialized { 
   

								@Getter @Setter private int bdms01CvrsnSegSqlcd;
			@Getter @Setter private List<Bdms01CvrsnTable> bdms01CvrsnTable = new ArrayList<>();
    	
	
	/**
	* Constructor for Bdms01CvrsnSegData
	**/
    public Bdms01CvrsnSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01CvrsnSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CvrsnSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01CvrsnSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01CvrsnSegSqlcd(0);
     if (bdms01CvrsnTable.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BDMS_01_CVRSN_TABLE_SIZE;index++) {
              Bdms01CvrsnTable  newElement = new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength());
              newElement.initialize();
              getBdms01CvrsnTable().add(newElement);
          }
     } else {
        if (bdms01CvrsnTable.size() < BDMS_01_CVRSN_TABLE_SIZE) {
          // prefill it first
          for (int index = bdms01CvrsnTable.size();index <  BDMS_01_CVRSN_TABLE_SIZE;index++) {
              Bdms01CvrsnTable  newElement = new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength());
              getBdms01CvrsnTable().add(newElement);
          }
        }
        
     	for (int index = 0;index <  BDMS_01_CVRSN_TABLE_SIZE;index++) {
     		Bdms01CvrsnTable bdms01CvrsnTableVar = bdms01CvrsnTable.get(index);
 			if (bdms01CvrsnTableVar == null) {
                bdms01CvrsnTableVar = new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength());
                  getBdms01CvrsnTable().set(index, bdms01CvrsnTableVar);
			} 
			bdms01CvrsnTableVar.initialize();
		}
     }
   }


}
  
