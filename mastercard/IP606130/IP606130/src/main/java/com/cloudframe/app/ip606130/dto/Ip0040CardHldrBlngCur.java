package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040CardHldrBlngCur is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip0040CardHldrBlngCur extends Ip0040CardHldrBlngCurSerialized { 
   

								@Getter @Setter private int ip0040CardMastDfltCur;

								@Getter @Setter private int ip0040CardMastDfltExp;
			@Getter @Setter private List<Ip0040PrimaryCrncyTbl> ip0040PrimaryCrncyTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip0040CardHldrBlngCur
	**/
    public Ip0040CardHldrBlngCur() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040CardHldrBlngCur. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040CardHldrBlngCur(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip0040CardHldrBlngCur
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0040CardMastDfltCur(0);
                     setIp0040CardMastDfltExp(0);
     if (ip0040PrimaryCrncyTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_0040_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040PrimaryCrncyTbl  newElement = new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength());
              newElement.initialize();
              getIp0040PrimaryCrncyTbl().add(newElement);
          }
     } else {
        if (ip0040PrimaryCrncyTbl.size() < IP_0040_PRIMARY_CRNCY_TBL_SIZE) {
          // prefill it first
          for (int index = ip0040PrimaryCrncyTbl.size();index <  IP_0040_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip0040PrimaryCrncyTbl  newElement = new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength());
              getIp0040PrimaryCrncyTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_0040_PRIMARY_CRNCY_TBL_SIZE;index++) {
     		Ip0040PrimaryCrncyTbl ip0040PrimaryCrncyTblVar = ip0040PrimaryCrncyTbl.get(index);
 			if (ip0040PrimaryCrncyTblVar == null) {
                ip0040PrimaryCrncyTblVar = new Ip0040PrimaryCrncyTbl(this,beginIp0040PrimaryCrncyTbl + index * Ip0040PrimaryCrncyTbl.getIp0040PrimaryCrncyTblFieldLength());
                  getIp0040PrimaryCrncyTbl().set(index, ip0040PrimaryCrncyTblVar);
			} 
			ip0040PrimaryCrncyTblVar.initialize();
		}
     }
   }


}
  
