package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip0040iCardHldrBlngCur is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip0040iCardHldrBlngCur extends Ip0040iCardHldrBlngCurSerialized { 
   

								@Getter @Setter private int ip0040iCardMastDfltCur;

								@Getter @Setter private int ip0040iCardMastDfltExp;
			@Getter @Setter private List<Ip0040iPrimaryCrncyTbl> ip0040iPrimaryCrncyTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0040iCardHldrBlngCur
	**/
    public Ip0040iCardHldrBlngCur() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040iCardHldrBlngCur. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040iCardHldrBlngCur(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040iCardHldrBlngCur
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040iCardMastDfltCur(0);
                     setIp0040iCardMastDfltExp(0);
     if (ip0040iPrimaryCrncyTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0040I_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040iPrimaryCrncyTbl  newElement = new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength());
              newElement.initialize();
              getIp0040iPrimaryCrncyTbl().add(newElement);
          }
     } else {
        if (ip0040iPrimaryCrncyTbl.size() < IP_0040I_PRIMARY_CRNCY_TBL_SIZE) {
          // prefill it first
          for (int index = ip0040iPrimaryCrncyTbl.size();index <  IP_0040I_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040iPrimaryCrncyTbl  newElement = new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength());
              getIp0040iPrimaryCrncyTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0040I_PRIMARY_CRNCY_TBL_SIZE;index++) {
     		Ip0040iPrimaryCrncyTbl ip0040iPrimaryCrncyTblVar = ip0040iPrimaryCrncyTbl.get(index);
 			if (ip0040iPrimaryCrncyTblVar == null) {
                ip0040iPrimaryCrncyTblVar = new Ip0040iPrimaryCrncyTbl(this,beginIp0040iPrimaryCrncyTbl + index * Ip0040iPrimaryCrncyTbl.getIp0040iPrimaryCrncyTblFieldLength());
                  getIp0040iPrimaryCrncyTbl().set(index, ip0040iPrimaryCrncyTblVar);
			} 
			ip0040iPrimaryCrncyTblVar.initialize();
		}
     }
   }


}
  
