package com.cloudframe.app.bm8090m.dto;

/**
*  The class WTpePe8090m is used to handle fields declared in it
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
public class WTpePe8090m extends WTpePe8090mSerialized { 
   
			@Getter @Setter private List<WElpPe8090m> wElpPe8090m = new ArrayList<>();
    	
	
	/**
	* Constructor for WTpePe8090m
	**/
    public WTpePe8090m() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WTpePe8090m. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WTpePe8090m(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WTpePe8090m
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (wElpPe8090m.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  W_ELP_PE_8090M_SIZE;index++) {
              WElpPe8090m  newElement = new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength());
              newElement.initialize();
              getWElpPe8090m().add(newElement);
          }
     } else {
        if (wElpPe8090m.size() < W_ELP_PE_8090M_SIZE) {
          // prefill it first
          for (int index = wElpPe8090m.size();index <  W_ELP_PE_8090M_SIZE;index++) {
              WElpPe8090m  newElement = new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength());
              getWElpPe8090m().add(newElement);
          }
        }
        
     	for (int index = 0;index <  W_ELP_PE_8090M_SIZE;index++) {
     		WElpPe8090m wElpPe8090mVar = wElpPe8090m.get(index);
 			if (wElpPe8090mVar == null) {
                wElpPe8090mVar = new WElpPe8090m(this,beginWElpPe8090m + index * WElpPe8090m.getWElpPe8090mFieldLength());
                  getWElpPe8090m().set(index, wElpPe8090mVar);
			} 
			wElpPe8090mVar.initialize();
		}
     }
   }


}
  
