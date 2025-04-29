package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00321ReplErrTextInfo is used to handle fields declared in it
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
public class Ip00321ReplErrTextInfo extends Ip00321ReplErrTextInfoSerialized { 
   

								@Getter @Setter private int ip00321ReplTextCount;
			@Getter @Setter private List<Ip00321ReplTextIndicators> ip00321ReplTextIndicators = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00321ReplErrTextInfo
	**/
    public Ip00321ReplErrTextInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00321ReplErrTextInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00321ReplErrTextInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00321ReplErrTextInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00321ReplTextCount(0);
     if (ip00321ReplTextIndicators.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00321_REPL_TEXT_INDICATORS_SIZE;index++) {
              Ip00321ReplTextIndicators  newElement = new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength());
              newElement.initialize();
              getIp00321ReplTextIndicators().add(newElement);
          }
     } else {
        if (ip00321ReplTextIndicators.size() < IP_00321_REPL_TEXT_INDICATORS_SIZE) {
          // prefill it first
          for (int index = ip00321ReplTextIndicators.size();index <  IP_00321_REPL_TEXT_INDICATORS_SIZE;index++) {
              Ip00321ReplTextIndicators  newElement = new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength());
              getIp00321ReplTextIndicators().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00321_REPL_TEXT_INDICATORS_SIZE;index++) {
     		Ip00321ReplTextIndicators ip00321ReplTextIndicatorsVar = ip00321ReplTextIndicators.get(index);
 			if (ip00321ReplTextIndicatorsVar == null) {
                ip00321ReplTextIndicatorsVar = new Ip00321ReplTextIndicators(this,beginIp00321ReplTextIndicators + index * Ip00321ReplTextIndicators.getIp00321ReplTextIndicatorsFieldLength());
                  getIp00321ReplTextIndicators().set(index, ip00321ReplTextIndicatorsVar);
			} 
			ip00321ReplTextIndicatorsVar.initialize();
		}
     }
   }


}
  
