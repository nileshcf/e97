package com.cloudframe.app.casecb00.dto;

/**
*  The class Inventoryrequested is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:45. using version 5.0.0.257
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
public class Inventoryrequested extends InventoryrequestedSerialized { 
   

						@Getter @Setter private char[] requestdate = Field.fillLowValue(10);
			@Getter @Setter private List<Dealers> dealers = new ArrayList<>();
    	

						@Getter @Setter private char[] requesttime = Field.fillLowValue(8);
	
	/**
	* Constructor for Inventoryrequested
	**/
    public Inventoryrequested() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Inventoryrequested. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Inventoryrequested(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
				for (int arrayIndex = 0; arrayIndex < DEALERS_SIZE;arrayIndex++) {
						getDealers().add(new Dealers(this, beginDealers + 
						arrayIndex * Dealers.getDealersFieldLength()));
				}
			for (int arrayIndex = 0; arrayIndex < DEALERS_SIZE;arrayIndex++) {
					getDealers().add(new Dealers(this, beginDealers + 
						arrayIndex * Dealers.getDealersFieldLength()));
			}
    } 

	/**
	 * 	initializes Inventoryrequested
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setRequestdate(CONSTANTS.SPACE_10);
     if (dealers.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  DEALERS_SIZE;index++) {
              Dealers  newElement = new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength());
              newElement.initialize();
              getDealers().add(newElement);
          }
     } else {
        if (dealers.size() < DEALERS_SIZE) {
          // prefill it first
          for (int index = dealers.size();index <  DEALERS_SIZE;index++) {
              Dealers  newElement = new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength());
              getDealers().add(newElement);
          }
        }
        
     	for (int index = 0;index <  DEALERS_SIZE;index++) {
     		Dealers dealersVar = dealers.get(index);
 			if (dealersVar == null) {
                dealersVar = new Dealers(this,beginDealers + index * Dealers.getDealersFieldLength());
                  getDealers().set(index, dealersVar);
			} 
			dealersVar.initialize();
		}
     }
         setRequesttime(CONSTANTS.SPACE_8);
   }


}
  
