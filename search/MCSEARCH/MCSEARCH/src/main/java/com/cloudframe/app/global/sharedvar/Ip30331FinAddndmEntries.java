package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip30331FinAddndmEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip30331FinAddndmEntries")

@Data
public class Ip30331FinAddndmEntries extends Ip30331FinAddndmEntriesSerialized  implements InitializingBean {
   

								@Getter @Setter private int ip30331Subscript;
			@Getter @Setter private List<Ip30331FaFileIdStatusTbl> ip30331FaFileIdStatusTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip30331FinAddndmEntries
	**/
    public Ip30331FinAddndmEntries() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;arrayIndex++) {
						getIp30331FaFileIdStatusTbl().add(new Ip30331FaFileIdStatusTbl(this, beginIp30331FaFileIdStatusTbl + 
						arrayIndex * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength()));
				}
	   	/*  end of offset */
    }


	/**
	 * 	initializes Ip30331FinAddndmEntries
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp30331Subscript(0);
     if (ip30331FaFileIdStatusTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;index++) {
              Ip30331FaFileIdStatusTbl  newElement = new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength());
              newElement.initialize();
              getIp30331FaFileIdStatusTbl().add(newElement);
          }
     } else {
        if (ip30331FaFileIdStatusTbl.size() < IP_30331_FA_FILE_ID_STATUS_TBL_SIZE) {
          // prefill it first
          for (int index = ip30331FaFileIdStatusTbl.size();index <  IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;index++) {
              Ip30331FaFileIdStatusTbl  newElement = new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength());
              getIp30331FaFileIdStatusTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_30331_FA_FILE_ID_STATUS_TBL_SIZE;index++) {
     		Ip30331FaFileIdStatusTbl ip30331FaFileIdStatusTblVar = ip30331FaFileIdStatusTbl.get(index);
 			if (ip30331FaFileIdStatusTblVar == null) {
                ip30331FaFileIdStatusTblVar = new Ip30331FaFileIdStatusTbl(this,beginIp30331FaFileIdStatusTbl + index * Ip30331FaFileIdStatusTbl.getIp30331FaFileIdStatusTblFieldLength());
                  getIp30331FaFileIdStatusTbl().set(index, ip30331FaFileIdStatusTblVar);
			} 
			ip30331FaFileIdStatusTblVar.initialize();
		}
     }
   }


}
  
