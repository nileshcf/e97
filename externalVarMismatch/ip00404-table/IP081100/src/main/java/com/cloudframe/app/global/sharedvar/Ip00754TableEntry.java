package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00754TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip00754TableEntry")

@Data
public class Ip00754TableEntry extends Ip00754TableEntrySerialized  implements InitializingBean {
   
				@Getter @Setter private Ip00754MccValsKey ip00754MccValsKey = new Ip00754MccValsKey();

						@Getter @Setter private char[] ip00754MccValsInetGrpCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00754MccStatus = Field.fillLowValue(1);
			@Getter @Setter private List<Ip00754CabProgramTbl> ip00754CabProgramTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00754TableEntry
	**/
    public Ip00754TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp00754MccValsKey().setParent(this,getStartOffset() + 0);
				for (int arrayIndex = 0; arrayIndex < IP_00754_CAB_PROGRAM_TBL_SIZE;arrayIndex++) {
						getIp00754CabProgramTbl().add(new Ip00754CabProgramTbl(this, beginIp00754CabProgramTbl + 
						arrayIndex * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip00754TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00754MccValsKey().initialize();
     
         setIp00754MccValsInetGrpCd(CONSTANTS.SPACE);
         setIp00754MccStatus(CONSTANTS.SPACE);
     if (ip00754CabProgramTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00754_CAB_PROGRAM_TBL_SIZE;index++) {
              Ip00754CabProgramTbl  newElement = new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength());
              newElement.initialize();
              getIp00754CabProgramTbl().add(newElement);
          }
     } else {
        if (ip00754CabProgramTbl.size() < IP_00754_CAB_PROGRAM_TBL_SIZE) {
          // prefill it first
          for (int index = ip00754CabProgramTbl.size();index <  IP_00754_CAB_PROGRAM_TBL_SIZE;index++) {
              Ip00754CabProgramTbl  newElement = new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength());
              getIp00754CabProgramTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00754_CAB_PROGRAM_TBL_SIZE;index++) {
     		Ip00754CabProgramTbl ip00754CabProgramTblVar = ip00754CabProgramTbl.get(index);
 			if (ip00754CabProgramTblVar == null) {
                ip00754CabProgramTblVar = new Ip00754CabProgramTbl(this,beginIp00754CabProgramTbl + index * Ip00754CabProgramTbl.getIp00754CabProgramTblFieldLength());
                  getIp00754CabProgramTbl().set(index, ip00754CabProgramTblVar);
			} 
			ip00754CabProgramTblVar.initialize();
		}
     }
   }


}
  
