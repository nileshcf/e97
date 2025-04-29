package com.cloudframe.app.init2.dto;

/**
*  The class L6560OutputParmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:27. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class L6560OutputParmInfo extends L6560OutputParmInfoSerialized { 
   

								@Getter @Setter private short l6560RetrnCd;

								@Getter @Setter private BigDecimal l6560SurrChrgAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560SurrChrgFlatAmt = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560SurrChrgPct = BigDecimal.ZERO;

								@Getter @Setter private BigDecimal l6560MktvalAdjAmt = BigDecimal.ZERO;
			@Getter @Setter private List<L6560SurrSaleLoadInfo> l6560SurrSaleLoadInfo = new ArrayList<>();
    	

								@Getter @Setter private BigDecimal l6560FreeWthdrwAmt = BigDecimal.ZERO;

	
	/**
	* Constructor for L6560OutputParmInfo
	**/
    public L6560OutputParmInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for L6560OutputParmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560OutputParmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes L6560OutputParmInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setL6560RetrnCd((short)0);
			setL6560SurrChrgAmt(BigDecimal.ZERO);
			setL6560SurrChrgFlatAmt(BigDecimal.ZERO);
			setL6560SurrChrgPct(BigDecimal.ZERO);
			setL6560MktvalAdjAmt(BigDecimal.ZERO);
     if (l6560SurrSaleLoadInfo.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  L_6560_SURR_SALE_LOAD_INFO_SIZE;index++) {
              L6560SurrSaleLoadInfo  newElement = new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength());
              newElement.initialize();
              getL6560SurrSaleLoadInfo().add(newElement);
          }
     } else {
        if (l6560SurrSaleLoadInfo.size() < L_6560_SURR_SALE_LOAD_INFO_SIZE) {
          // prefill it first
          for (int index = l6560SurrSaleLoadInfo.size();index <  L_6560_SURR_SALE_LOAD_INFO_SIZE;index++) {
              L6560SurrSaleLoadInfo  newElement = new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength());
              getL6560SurrSaleLoadInfo().add(newElement);
          }
        }
        
     	for (int index = 0;index <  L_6560_SURR_SALE_LOAD_INFO_SIZE;index++) {
     		L6560SurrSaleLoadInfo l6560SurrSaleLoadInfoVar = l6560SurrSaleLoadInfo.get(index);
 			if (l6560SurrSaleLoadInfoVar == null) {
                l6560SurrSaleLoadInfoVar = new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength());
                  getL6560SurrSaleLoadInfo().set(index, l6560SurrSaleLoadInfoVar);
			} 
			l6560SurrSaleLoadInfoVar.initialize();
		}
     }
			setL6560FreeWthdrwAmt(BigDecimal.ZERO);
   }


}
  
