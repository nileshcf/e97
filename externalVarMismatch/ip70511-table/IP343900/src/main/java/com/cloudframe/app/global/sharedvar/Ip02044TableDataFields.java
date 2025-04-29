package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02044TableDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip02044TableDataFields extends Ip02044TableDataFieldsSerialized { 
   

						@Getter @Setter private char[] ip02044RngEndNum = Field.fillLowValue(19);

								@Getter @Setter private int ip02044PasFoundCount;
			@Getter @Setter private List<Ip02044PaEntry> ip02044PaEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip02044TableDataFields
	**/
    public Ip02044TableDataFields() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02044TableDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02044TableDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip02044TableDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp02044RngEndNum(CONSTANTS.SPACE_19);
                     setIp02044PasFoundCount(0);
     if (ip02044PaEntry.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02044_PA_ENTRY_SIZE;index++) {
              Ip02044PaEntry  newElement = new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength());
              newElement.initialize();
              getIp02044PaEntry().add(newElement);
          }
     } else {
        if (ip02044PaEntry.size() < IP_02044_PA_ENTRY_SIZE) {
          // prefill it first
          for (int index = ip02044PaEntry.size();index <  IP_02044_PA_ENTRY_SIZE;index++) {
              Ip02044PaEntry  newElement = new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength());
              getIp02044PaEntry().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02044_PA_ENTRY_SIZE;index++) {
     		Ip02044PaEntry ip02044PaEntryVar = ip02044PaEntry.get(index);
 			if (ip02044PaEntryVar == null) {
                ip02044PaEntryVar = new Ip02044PaEntry(this,beginIp02044PaEntry + index * Ip02044PaEntry.getIp02044PaEntryFieldLength());
                  getIp02044PaEntry().set(index, ip02044PaEntryVar);
			} 
			ip02044PaEntryVar.initialize();
		}
     }
   }


}
  
