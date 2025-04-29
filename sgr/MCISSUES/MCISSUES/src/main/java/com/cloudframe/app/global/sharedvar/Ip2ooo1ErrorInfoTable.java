package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1ErrorInfoTable is used to handle fields declared in it
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
public class Ip2ooo1ErrorInfoTable extends Ip2ooo1ErrorInfoTableSerialized { 
   
			@Getter @Setter private List<Ip2ooo1TableEntries> ip2ooo1TableEntries = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip2ooo1ErrorInfoTable
	**/
    public Ip2ooo1ErrorInfoTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip2ooo1ErrorInfoTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip2ooo1ErrorInfoTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip2ooo1ErrorInfoTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip2ooo1TableEntries.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_2OOO_1_TABLE_ENTRIES_SIZE;index++) {
              Ip2ooo1TableEntries  newElement = new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength());
              newElement.initialize();
              getIp2ooo1TableEntries().add(newElement);
          }
     } else {
        if (ip2ooo1TableEntries.size() < IP_2OOO_1_TABLE_ENTRIES_SIZE) {
          // prefill it first
          for (int index = ip2ooo1TableEntries.size();index <  IP_2OOO_1_TABLE_ENTRIES_SIZE;index++) {
              Ip2ooo1TableEntries  newElement = new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength());
              getIp2ooo1TableEntries().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_2OOO_1_TABLE_ENTRIES_SIZE;index++) {
     		Ip2ooo1TableEntries ip2ooo1TableEntriesVar = ip2ooo1TableEntries.get(index);
 			if (ip2ooo1TableEntriesVar == null) {
                ip2ooo1TableEntriesVar = new Ip2ooo1TableEntries(this,beginIp2ooo1TableEntries + index * Ip2ooo1TableEntries.getIp2ooo1TableEntriesFieldLength());
                  getIp2ooo1TableEntries().set(index, ip2ooo1TableEntriesVar);
			} 
			ip2ooo1TableEntriesVar.initialize();
		}
     }
   }


}
  
