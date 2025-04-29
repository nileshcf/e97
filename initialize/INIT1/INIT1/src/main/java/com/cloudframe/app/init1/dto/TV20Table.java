package com.cloudframe.app.init1.dto;

/**
*  The class TV20Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


@Data
public class TV20Table extends TV20TableSerialized {
   
			@Getter @Setter private List<TV20Tbl> tV20Tbl = new ArrayList<>();
    	
	
	/**
	* Constructor for TV20Table
	**/
    public TV20Table() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < T_V_20_TBL_SIZE;arrayIndex++) {
						getTV20Tbl().add(new TV20Tbl(this, beginTV20Tbl + 
						arrayIndex * TV20Tbl.getTV20TblFieldLength()));
				}
	   	/*  end of offset */
    }



	/**
	 * 	initializes TV20Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (tV20Tbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  T_V_20_TBL_SIZE;index++) {
              TV20Tbl  newElement = new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength());
              newElement.initialize();
              getTV20Tbl().add(newElement);
          }
     } else {
        if (tV20Tbl.size() < T_V_20_TBL_SIZE) {
          // prefill it first
          for (int index = tV20Tbl.size();index <  T_V_20_TBL_SIZE;index++) {
              TV20Tbl  newElement = new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength());
              getTV20Tbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  T_V_20_TBL_SIZE;index++) {
     		TV20Tbl tV20TblVar = tV20Tbl.get(index);
 			if (tV20TblVar == null) {
                tV20TblVar = new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength());
                  getTV20Tbl().set(index, tV20TblVar);
			} 
			tV20TblVar.initialize();
		}
     }
   }


}
  
