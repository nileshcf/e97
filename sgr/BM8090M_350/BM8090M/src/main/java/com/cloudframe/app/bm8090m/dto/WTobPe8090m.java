package com.cloudframe.app.bm8090m.dto;

/**
*  The class WTobPe8090m is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class WTobPe8090m extends WTobPe8090mSerialized { 
   
			@Getter @Setter private List<WEloPe8090m> wEloPe8090m = new ArrayList<>();
    	
	
	/**
	* Constructor for WTobPe8090m
	**/
    public WTobPe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WTobPe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WTobPe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WTobPe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (wEloPe8090m.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  W_ELO_PE_8090M_SIZE;index++) {
              WEloPe8090m  newElement = new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength());
              newElement.initialize();
              getWEloPe8090m().add(newElement);
          }
     } else {
        if (wEloPe8090m.size() < W_ELO_PE_8090M_SIZE) {
          // prefill it first
          for (int index = wEloPe8090m.size();index <  W_ELO_PE_8090M_SIZE;index++) {
              WEloPe8090m  newElement = new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength());
              getWEloPe8090m().add(newElement);
          }
        }
        
     	for (int index = 0;index <  W_ELO_PE_8090M_SIZE;index++) {
     		WEloPe8090m wEloPe8090mVar = wEloPe8090m.get(index);
 			if (wEloPe8090mVar == null) {
                wEloPe8090mVar = new WEloPe8090m(this,beginWEloPe8090m + index * WEloPe8090m.getWEloPe8090mFieldLength());
                  getWEloPe8090m().set(index, wEloPe8090mVar);
			} 
			wEloPe8090mVar.initialize();
		}
     }
   }


}
  
