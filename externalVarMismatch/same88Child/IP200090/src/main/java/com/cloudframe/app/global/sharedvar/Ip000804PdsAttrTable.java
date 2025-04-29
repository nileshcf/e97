package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip000804PdsAttrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip000804PdsAttrTable extends Ip000804PdsAttrTableSerialized { 
   
			@Getter @Setter private List<Ip000804PdsAttrRow> ip000804PdsAttrRow = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip000804PdsAttrTable
	**/
    public Ip000804PdsAttrTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip000804PdsAttrTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000804PdsAttrTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip000804PdsAttrTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip000804PdsAttrRow.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_000804_PDS_ATTR_ROW_SIZE;index++) {
              Ip000804PdsAttrRow  newElement = new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
              newElement.initialize();
              getIp000804PdsAttrRow().add(newElement);
          }
     } else {
        if (ip000804PdsAttrRow.size() < IP_000804_PDS_ATTR_ROW_SIZE) {
          // prefill it first
          for (int index = ip000804PdsAttrRow.size();index <  IP_000804_PDS_ATTR_ROW_SIZE;index++) {
              Ip000804PdsAttrRow  newElement = new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
              getIp000804PdsAttrRow().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_000804_PDS_ATTR_ROW_SIZE;index++) {
     		Ip000804PdsAttrRow ip000804PdsAttrRowVar = ip000804PdsAttrRow.get(index);
 			if (ip000804PdsAttrRowVar == null) {
                ip000804PdsAttrRowVar = new Ip000804PdsAttrRow(this,beginIp000804PdsAttrRow + index * Ip000804PdsAttrRow.getIp000804PdsAttrRowFieldLength());
                  getIp000804PdsAttrRow().set(index, ip000804PdsAttrRowVar);
			} 
			ip000804PdsAttrRowVar.initialize();
		}
     }
   }


}
  
