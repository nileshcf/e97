package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404CardHldrBlngCur is used to handle fields declared in it
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
public class Ip00404CardHldrBlngCur extends Ip00404CardHldrBlngCurSerialized { 
   

								@Getter @Setter private int ip00404CardMastDfltCur;

								@Getter @Setter private int ip00404CardMastDfltExp;
			@Getter @Setter private List<Ip00404PrimaryCrncyTbl> ip00404PrimaryCrncyTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00404CardHldrBlngCur
	**/
    public Ip00404CardHldrBlngCur() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00404CardHldrBlngCur. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404CardHldrBlngCur(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00404CardHldrBlngCur
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404CardMastDfltCur(0);
                     setIp00404CardMastDfltExp(0);
     if (ip00404PrimaryCrncyTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00404_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip00404PrimaryCrncyTbl  newElement = new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength());
              newElement.initialize();
              getIp00404PrimaryCrncyTbl().add(newElement);
          }
     } else {
        if (ip00404PrimaryCrncyTbl.size() < IP_00404_PRIMARY_CRNCY_TBL_SIZE) {
          // prefill it first
          for (int index = ip00404PrimaryCrncyTbl.size();index <  IP_00404_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip00404PrimaryCrncyTbl  newElement = new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength());
              getIp00404PrimaryCrncyTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00404_PRIMARY_CRNCY_TBL_SIZE;index++) {
     		Ip00404PrimaryCrncyTbl ip00404PrimaryCrncyTblVar = ip00404PrimaryCrncyTbl.get(index);
 			if (ip00404PrimaryCrncyTblVar == null) {
                ip00404PrimaryCrncyTblVar = new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength());
                  getIp00404PrimaryCrncyTbl().set(index, ip00404PrimaryCrncyTblVar);
			} 
			ip00404PrimaryCrncyTblVar.initialize();
		}
     }
   }


}
  
